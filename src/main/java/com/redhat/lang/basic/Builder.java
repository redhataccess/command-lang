package com.redhat.lang.basic;

/**
 *
 * @author sfloess
 */
public interface Builder {

    void objectStart(String objectName, int line, int col);

    void objectEnd(String objectName, int line, int col);

    void methodStart(String methodName, int line, int col);

    void methodStop(String methodName, int line, int col);

    void var(String varName, String type, int line, int col);

    void let(String varName, String value, int line, int col);

    void print(String toPrint, int line, int col);

    void forStart(String var, String lowerBounds, String upperBounds, int line, int col);

    void forEnd(String var, int line, int col);

    void forEachStart(String forVar, String variable, int line, int col);

    void forEachEnd(String variable, int line, int col);

    void whileLoopStart(String whileVar, String condition, int line, int col);

    void whileLoopEnd(String whileVar, String condition, int line, int col);

    void doWhileStart(int line, int col);

    void doWhileEnd(String doVar, int line, int col);

    void ifStart(String condition, int line, int col);

    void ifEnd(String condition, int line, int col);

    void elseStart(int line, int col);

    void elseEnd(int line, int col);

    void elseIfStart(String condition, int line, int col);

    void elseIfEnd(String condition, int line, int col);

    void call(String objectName, String methodName, int line, int col);
}
