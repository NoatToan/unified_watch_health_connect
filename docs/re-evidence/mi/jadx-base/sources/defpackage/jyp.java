package defpackage;

import com.xiaomi.ai.nlp.lattice.entity.EntityType;
import com.xiaomi.ai.nlp.lattice.rule.RuleApplyPhase;
import com.xiaomi.ai.nlp.lm.core.LanguageModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class jyp extends s0l {
    public List<t0l> e;

    public jyp(jyp jypVar) {
        super(jypVar);
        this.e = new ArrayList();
        this.e = jypVar.o();
    }

    private void p(y2e y2eVar, j82 j82Var, RuleApplyPhase ruleApplyPhase) {
        HashMap map = new HashMap();
        map.put("source", l());
        map.put("route", k());
        map.put("target", s());
        map.put("priority", i());
        map.put("rule_type", r());
        v0l.a(y2eVar, j82Var, ruleApplyPhase, map);
    }

    @Override // defpackage.s0l
    public void a(y2e y2eVar, j82 j82Var, RuleApplyPhase ruleApplyPhase, LanguageModel languageModel) {
        int i = 0;
        for (zxk zxkVar : e().d()) {
            if (zxkVar.b() != -1) {
                t0l t0lVar = h().get(i);
                t0l t0lVar2 = o().get(i);
                i++;
                if (!t0lVar2.equals(t0lVar)) {
                    xb8 xb8VarI = y2eVar.n().get(Integer.valueOf(zxkVar.a())).i();
                    int iC = y2eVar.c(new xb8(xb8VarI.a(), xb8VarI.b(), xb8VarI.h(), klo.b(t0lVar2.c()) ? xb8VarI.e() : t0lVar2.c(), t0lVar2.e(), klo.b(t0lVar2.f()) ? xb8VarI.g() : t0lVar2.f(), EntityType.TRANSFORM_PARSED_ENTITY), false, this);
                    if (ruleApplyPhase.isApplyBestPath()) {
                        ovg ovgVar = y2eVar.n().get(Integer.valueOf(zxkVar.a()));
                        ovgVar.z(false);
                        ovg ovgVar2 = y2eVar.n().get(Integer.valueOf(iC));
                        ovgVar2.z(true);
                        n(ovgVar, ovgVar2);
                    }
                }
            }
        }
        p(y2eVar, j82Var, ruleApplyPhase);
    }

    @Override // defpackage.s0l
    public s0l c() {
        return new jyp(this);
    }

    @Override // defpackage.s0l
    public int hashCode() {
        return (super.hashCode() * 31) + this.e.hashCode();
    }

    public final void n(ovg ovgVar, ovg ovgVar2) {
        ovgVar2.w(ovgVar.e());
        if (ovgVar.e() != null) {
            ovgVar.e().u(ovgVar2);
        }
        ovg ovgVarD = ovgVar.d();
        if (ovgVarD != null) {
            ovgVarD.w(ovgVar2);
        }
        ovgVar2.u(ovgVarD);
    }

    public List<t0l> o() {
        return this.e;
    }

    public String r() {
        return "transform_rule";
    }

    public String s() {
        StringBuilder sb = new StringBuilder();
        Iterator<t0l> it = this.e.iterator();
        while (it.hasNext()) {
            sb.append(it.next().j());
            sb.append(" ");
        }
        return sb.toString().substring(0, sb.toString().length() - 1);
    }

    public jyp(int i, List<t0l> list, List<t0l> list2) {
        super(i, list);
        new ArrayList();
        this.e = list2;
    }
}
