package com.trybe.simuladordepix;

/**
 * .
 */
public abstract class ErroDePix extends Exception {
  private static final long serialVersionUID = -1872042833082678358L;

  public ErroDePix(String mensagem) {
    super(mensagem);
  }
}
