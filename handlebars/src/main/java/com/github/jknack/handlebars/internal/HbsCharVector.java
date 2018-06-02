package com.github.jknack.handlebars.internal;

import java.util.Arrays;

/**
 * A very basic character vector.
 *
 * David Stancu <dstancu@nyu.edu>
 */
public final class HbsCharVector {
  private char[] data;
  private int size;

  /**
   * Create a char vector from an existing char[]
   * @param initial char[]
   */
  HbsCharVector(char[] initial) {
    this.data = initial;
    this.size = initial.length;
  }

  /**
   * Get the present elements from the backing char[]
   * @return A char[]
   */
  public char[] data() {
    return Arrays.copyOf(data, this.size);
  }

  /**
   * Get number of objects in vector
   * @return The size
   */
  public int getSize() {
    return this.size;
  }

  /**
   * Add char[]
   * @param vals A char[]
   */
  public void addChars(char[] vals) {
    if ((this.size + vals.length) > this.data.length) grow(vals.length);
    System.arraycopy(vals, 0, this.data, this.size, vals.length);
    this.size += vals.length;
  }

  /**
   * Add a char
   * @param val A char
   */
  public void addChar(char val) {
    if (this.size + 1 > this.data.length) grow(1);
    this.data[this.size] = val;
    this.size += 1;
  }

  /**
   * Grow array
   *
   * @param sizeOfNew Size of new char[]
   */
  private void grow(int sizeOfNew) {
    sizeOfNew += this.size;
    this.data = Arrays.copyOf(this.data, sizeOfNew * 2);
  }
}