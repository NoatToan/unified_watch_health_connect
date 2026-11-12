package defpackage;

import com.xiaomi.ai.nlp.lattice.entity.EntityType;
import com.xiaomi.ai.nlp.lattice.rule.RuleApplyPhase;
import com.xiaomi.ai.nlp.lm.core.LanguageModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class hwg extends s0l {
    public List<t0l> e;

    public hwg(hwg hwgVar) {
        super(hwgVar);
        this.e = new ArrayList();
        this.e = hwgVar.n();
    }

    private void o(y2e y2eVar, j82 j82Var, RuleApplyPhase ruleApplyPhase) {
        HashMap map = new HashMap();
        map.put("source", l());
        map.put("route", k());
        map.put("target", r());
        map.put("priority", i());
        map.put("rule_type", p());
        v0l.a(y2eVar, j82Var, ruleApplyPhase, map);
    }

    @Override // defpackage.s0l
    public void a(y2e y2eVar, j82 j82Var, RuleApplyPhase ruleApplyPhase, LanguageModel languageModel) {
        zxk zxkVar = e().d().get(0);
        xb8 xb8VarI = y2eVar.n().get(Integer.valueOf(zxkVar.a())).i();
        y2eVar.n().get(Integer.valueOf(zxkVar.a())).z(false);
        ovg ovgVarD = y2eVar.n().get(Integer.valueOf(zxkVar.a())).d();
        int iA = xb8VarI.a();
        for (t0l t0lVar : n()) {
            int iC = y2eVar.c(new xb8(iA, iA + t0lVar.g().length(), t0lVar.g(), t0lVar.c(), t0lVar.e(), t0lVar.f(), EntityType.NORM_PARSED_ENTITY), false, this);
            if (ruleApplyPhase.isApplyBestPath()) {
                ovg ovgVar = y2eVar.n().get(Integer.valueOf(iC));
                ovgVar.z(true);
                ovgVar.u(ovgVarD);
                if (ovgVarD != null) {
                    ovgVarD.w(ovgVar);
                    ovgVarD = ovgVarD.e();
                }
            }
            iA += t0lVar.g().length();
        }
        if (ruleApplyPhase.isApplyBestPath()) {
            ovg ovgVarE = y2eVar.n().get(Integer.valueOf(zxkVar.a())).e();
            if (ovgVarD != null) {
                ovgVarD.w(ovgVarE);
            }
            ovgVarE.u(ovgVarD);
        }
        o(y2eVar, j82Var, ruleApplyPhase);
    }

    @Override // defpackage.s0l
    public s0l c() {
        return new hwg(this);
    }

    @Override // defpackage.s0l
    public int hashCode() {
        return (super.hashCode() * 31) + this.e.hashCode();
    }

    public List<t0l> n() {
        return this.e;
    }

    public String p() {
        return "norm_rule";
    }

    public String r() {
        StringBuilder sb = new StringBuilder();
        Iterator<t0l> it = this.e.iterator();
        while (it.hasNext()) {
            sb.append(it.next().j());
            sb.append(" ");
        }
        return sb.toString().substring(0, sb.toString().length() - 1);
    }

    public hwg(int i, List<t0l> list, List<t0l> list2) {
        super(i, list);
        new ArrayList();
        this.e = list2;
    }
}
