package defpackage;

import com.xiaomi.ai.nlp.lattice.rule.RuleApplyPhase;
import com.xiaomi.ai.nlp.lm.core.LanguageModel;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class pe0 extends s0l {
    public String e;
    public double f;

    public pe0(pe0 pe0Var) {
        super(pe0Var);
        this.f = 0.0d;
        this.e = pe0Var.e;
        this.f = pe0Var.f;
    }

    @Override // defpackage.s0l
    public void a(y2e y2eVar, j82 j82Var, RuleApplyPhase ruleApplyPhase, LanguageModel languageModel) {
        j82Var.setAction(this.e);
        double d = this.f;
        if (d > 1.0E-4d) {
            j82Var.setScore(d);
        }
        n(y2eVar, j82Var, ruleApplyPhase);
    }

    @Override // defpackage.s0l
    public s0l c() {
        return new pe0(this);
    }

    @Override // defpackage.s0l
    public int hashCode() {
        return (super.hashCode() * 31) + this.e.hashCode();
    }

    public final void n(y2e y2eVar, j82 j82Var, RuleApplyPhase ruleApplyPhase) {
        HashMap map = new HashMap();
        map.put("source", l());
        map.put("route", k());
        map.put("target", p());
        map.put("priority", i());
        map.put("rule_type", o());
        v0l.a(y2eVar, j82Var, ruleApplyPhase, map);
    }

    public String o() {
        return "action_rule";
    }

    public String p() {
        return this.e;
    }

    public void r(double d) {
        this.f = d;
    }

    public void s(String str) {
        this.e = str;
    }

    public pe0(int i, List<t0l> list) {
        super(i, list);
        this.f = 0.0d;
    }
}
