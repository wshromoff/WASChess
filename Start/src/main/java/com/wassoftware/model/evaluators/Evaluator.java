package com.wassoftware.model.evaluators;

import com.wassoftware.model.Board;

/**
 * An interface used to create a static evaluator.
 *
 * @author Gary Blackwood
 */
public interface Evaluator {

  public int evaluate( Board board );

}