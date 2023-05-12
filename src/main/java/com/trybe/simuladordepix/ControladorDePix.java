package com.trybe.simuladordepix;

import java.io.IOException;

/**
 * .
 */
public class ControladorDePix {

  private final ProcessadorDePix processadorDePix;

  public ControladorDePix(ProcessadorDePix processadorDePix) {
    this.processadorDePix = processadorDePix;
  }

  /**
   * Método a ser executado no momento em que a pessoa usuária confirmar a operação de Pix.
   *
   * @param valor Valor em centavos a ser transferido.
   * @param chave Chave Pix do beneficiário da transação.
   *
   * @return Mensagem a ser exibida à pessoa usuária, informando-a sobre o resultado da operação.
   */
  public String aoConfirmarPix(int valor, String chave) {
    try {
      this.processadorDePix.executarPix(valor, chave);
    } catch (ErroValorNaoPositivo e) {
      // TODO: handle exception
      e.printStackTrace();
      return e.getMessage();
    } catch (ErroChaveEmBranco e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      return e.getMessage();
    } catch (ErroInterno e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      return e.getMessage();
    } catch (ErroDePix e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      return e.getMessage();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      return Mensagens.ERRO_DE_CONEXAO;
    }
    return Mensagens.SUCESSO;
  }
}
