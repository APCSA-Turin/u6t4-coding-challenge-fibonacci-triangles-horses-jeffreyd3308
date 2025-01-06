package com.example.project;

public class Fibonacci {
  // instance variable
  private int[] sequence;

  /** Constructor: sets sequence to an array containing the first seqLen numbers
      in a Fibonacci sequence. A Fibonacci sequence is formed by summing the
      previous two numbers to generate the next number,
      e.g. 0, 1, 1, 2, 3, 5, 8, 13, 21, 34…

      All Fibonacci sequences start out with 0 and 1 as the first two numbers.

      PRECONDITION: seqLen >= 2
    */
  public Fibonacci(int seqLen) {
    /* implement me */
    sequence = new int[seqLen];
    for (int i = 0; i < seqLen; i++) {
      if (i == 0) {
        sequence[i] = 0;
      } else if (i == 1) {
        sequence[i] = 1;
      } else {
        sequence[i] = sequence[i - 1] + sequence[i - 2];
      }
    }
  }

  /** Getter method: returns a reference to the sequence array
    */
  public int[] getSequence() {
    /* implement me */
    return sequence;
  }

  /** Returns the index in the array where a particular value, searchVal, is
      located in sequence; if not found, returns -1.  If searchVal == 1, return
      first index where 1 is found (since this value appears twice in Fibonacci
      sequences longer than 2 numbers)
   */
  public int getIndexOf(int searchVal) {
    /* implement me */
    for (int i = 0; i < sequence.length; i++) {
      if (sequence[i] == searchVal) {
        return i;
      }
    }
    return -1;
  }

  /** Assigns sequence to a new array that extends the current sequence by
      howManyMore numbers of the Fibonnaci sequence

      For example, if sequence is {0, 1, 1, 2, 3, 5} and this method is called
      with howManyMore = 3, sequence would be assigned to a new array with
      the next 3 Fibonacci numbers added: {0, 1, 1, 2, 3, 5, 8, 13, 21}
   */
  public void extendBy(int howManyMore) {
    /* implement this method */
    int[] tempSequence = new int[sequence.length + howManyMore];
    for (int i = 0; i < sequence.length + howManyMore; i++) {
      if (i < sequence.length) {
        tempSequence[i] = sequence[i];
      } else {
        tempSequence[i] = tempSequence[i - 1] + tempSequence[i - 2];
      }
    }
    sequence = tempSequence;
  }

  /** Returns a string that represents the sequence array nicely formatted, for
   *  example, if sequence == [2, 3, 7], this method should return the String
   *  "[2, 3, 7]"
   *  USE THE ARRAYPRINTER UTILITY CLASS IN YOUR SOLUTION TO THIS METHOD
   */
  public String fibonacciString() {
    /* implement this method using the utility class */
    return ArrayPrinter.printableString(sequence);
  }
}
