package com.redhat.lang;

import com.redhat.command.factory.CommandFactory;
import com.redhat.commandlang.basic.Basic;
import java.io.StringReader;

/**
 *
 * @author sfloess
 */
public class Main {
    public static void main(final String[] args) throws Exception {
        final CommandFactory factory = new CommandFactory();

        final String app = "let a \"10\"\nprint \"a = ${a}\"\n";

        final Basic b = new Basic();

        b.parse(new StringReader(app));
    }
}
