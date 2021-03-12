package com.redhat.lang;

import com.redhat.command.factory.CommandFactory;
import com.redhat.lang.basic.Basic;
import com.redhat.lang.basic.PrintBasicBuilder;
import java.io.StringReader;

/**
 *
 * @author sfloess
 */
public class Main {
    public static void main(final String[] args) throws Exception {
        final CommandFactory factory = new CommandFactory();

        final String app = "object foo { }";

        final Basic b = new Basic();

        b.parse(new StringReader(app), new PrintBasicBuilder());
    }
}
