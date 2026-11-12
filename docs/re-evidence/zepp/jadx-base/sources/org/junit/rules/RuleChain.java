package org.junit.rules;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes23.dex */
public class RuleChain implements TestRule {
    private static final RuleChain b = new RuleChain(Collections.emptyList());
    private List<TestRule> a;

    private RuleChain(List<TestRule> list) {
        this.a = list;
    }

    public static RuleChain emptyRuleChain() {
        return b;
    }

    public static RuleChain outerRule(TestRule testRule) {
        return emptyRuleChain().around(testRule);
    }

    @Override // org.junit.rules.TestRule
    public Statement apply(Statement statement, Description description) {
        Iterator<TestRule> it2 = this.a.iterator();
        while (it2.hasNext()) {
            statement = it2.next().apply(statement, description);
        }
        return statement;
    }

    public RuleChain around(TestRule testRule) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(testRule);
        arrayList.addAll(this.a);
        return new RuleChain(arrayList);
    }
}
