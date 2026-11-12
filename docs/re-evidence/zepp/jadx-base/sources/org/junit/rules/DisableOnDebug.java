package org.junit.rules;

import java.lang.management.ManagementFactory;
import java.util.List;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes23.dex */
public class DisableOnDebug implements TestRule {
    private final TestRule a;
    private final boolean b;

    public DisableOnDebug(TestRule testRule) {
        this(testRule, ManagementFactory.getRuntimeMXBean().getInputArguments());
    }

    private static boolean a(List<String> list) {
        for (String str : list) {
            if ("-Xdebug".equals(str) || str.startsWith("-agentlib:jdwp")) {
                return true;
            }
        }
        return false;
    }

    @Override // org.junit.rules.TestRule
    public Statement apply(Statement statement, Description description) {
        return this.b ? statement : this.a.apply(statement, description);
    }

    public boolean isDebugging() {
        return this.b;
    }

    public DisableOnDebug(TestRule testRule, List<String> list) {
        this.a = testRule;
        this.b = a(list);
    }
}
