package com.redhat.lang.basic;

/**
 *
 * @author sfloess
 */
public class PrintBasicBuilder implements Builder {
    @Override
    public void objectStart(String objectName, int line, int col) {
        System.out.println("Object start:  [" + objectName + "] (" + line + ", " + col + ")");
    }

    @Override
    public void objectEnd(String objectName, int line, int col) {
        System.out.println("Object end:  [" + objectName + "] (" + line + ", " + col + ")");
    }

    @Override
    public void methodStart(String methodName, int line, int col) {
        System.out.println("Method start:  [" + methodName + "] (" + line + ", " + col + ")");
    }

    @Override
    public void methodStop(String methodName, int line, int col) {
        System.out.println("Method start:  [" + methodName + "] (" + line + ", " + col + ")");
    }

    @Override
    public void var(String varName, String type, int line, int col) {
        System.out.println("Var start:  [" + varName + "] (" + line + ", " + col + ")");
    }

    @Override
    public void let(String varName, String value, int line, int col) {
        System.out.println("Var start:  [" + varName + "] (" + line + ", " + col + ")");
    }

    @Override
    public void print(String toPrint, int line, int col) {
        System.out.println("print start:  [" + toPrint + "] (" + line + ", " + col + ")");
    }

    @Override
    public void forStart(String var, String lowerBounds, String upperBounds, int line, int col) {
        System.out.println("For start:  [" + var + "] (" + line + ", " + col + ")");
    }

    @Override
    public void forEnd(String var, int line, int col) {
        System.out.println("For end:  [" + var + "] (" + line + ", " + col + ")");
    }

    @Override
    public void forEachStart(String forVar, String variable, int line, int col) {
        System.out.println("For-Each start:  [" + forVar + "] (" + line + ", " + col + ")");
    }

    @Override
    public void forEachEnd(String forVar, int line, int col) {
        System.out.println("For-Each end:  [" + forVar + "] (" + line + ", " + col + ")");
    }

    @Override
    public void whileLoopStart(String whileVar, String condition, int line, int col) {
        System.out.println("While start:  [" + whileVar + "] (" + line + ", " + col + ")");
    }

    @Override
    public void whileLoopEnd(String whileVar, String condition, int line, int col) {
        System.out.println("While:  [" + whileVar + "] (" + line + ", " + col + ")");
    }

    @Override
    public void doWhileStart(int line, int col) {
        System.out.println("do-while start:  (" + line + ", " + col + ")");
    }

    @Override
    public void doWhileEnd(String doVar, int line, int col) {
        System.out.println("do-while end:  [" + doVar + "] (" + line + ", " + col + ")");
    }

    @Override
    public void ifStart(String condition, int line, int col) {
        System.out.println("If start:  [" + condition + "] (" + line + ", " + col + ")");
    }

    @Override
    public void ifEnd(String condition, int line, int col) {
        System.out.println("If end:  [" + condition + "] (" + line + ", " + col + ")");
    }

    @Override
    public void elseStart(int line, int col) {
        System.out.println("else start:  (" + line + ", " + col + ")");
    }

    @Override
    public void elseEnd(int line, int col) {
        System.out.println("else start:  (" + line + ", " + col + ")");
    }

    @Override
    public void elseIfStart(String condition, int line, int col) {
        System.out.println("elseif start:  [" + condition + "] (" + line + ", " + col + ")");
    }

    @Override
    public void elseIfEnd(String condition, int line, int col) {
        System.out.println("elseif end:  [" + condition + "] (" + line + ", " + col + ")");
    }

    @Override
    public void call(String call, String methodName, int line, int col) {
        System.out.println("Call:  [" + call + " " + methodName + "] (" + line + ", " + col + ")");
    }

}
