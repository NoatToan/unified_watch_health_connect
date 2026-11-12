package defpackage;

import com.xiaomi.ai.nlp.lattice.entity.EntityType;
import com.xiaomi.ai.nlp.lattice.rule.RuleApplyPhase;
import com.xiaomi.ai.nlp.lm.core.LanguageModel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class sqf extends s0l {
    public t0l e;

    public sqf(sqf sqfVar) {
        super(sqfVar);
        this.e = sqfVar.n();
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
        List<zxk> listD = e().d();
        int iA = y2eVar.n().get(Integer.valueOf(listD.get(0).a())).i().a();
        Iterator<zxk> it = listD.iterator();
        int iB = -1;
        String str = "";
        while (it.hasNext()) {
            ovg ovgVar = y2eVar.n().get(Integer.valueOf(it.next().a()));
            ovgVar.z(false);
            xb8 xb8VarI = ovgVar.i();
            iB = xb8VarI.b();
            str = str + xb8VarI.h();
        }
        int iC = y2eVar.c(new xb8(iA, iB, str, str, this.e.e(), this.e.f(), EntityType.MERGE_PARSED_ENTITY), false, this);
        if (ruleApplyPhase.isApplyBestPath()) {
            ovg ovgVarD = y2eVar.n().get(Integer.valueOf(listD.get(0).a())).d();
            ovg ovgVar2 = y2eVar.n().get(Integer.valueOf(iC));
            ovgVar2.z(true);
            ovg ovgVarE = y2eVar.n().get(Integer.valueOf(listD.get(listD.size() - 1).a())).e();
            if (ovgVarD != null) {
                ovgVarD.w(ovgVar2);
            }
            ovgVar2.u(ovgVarD);
            ovgVar2.w(ovgVarE);
            if (ovgVarE != null) {
                ovgVarE.u(ovgVar2);
            }
        }
        o(y2eVar, j82Var, ruleApplyPhase);
    }

    @Override // defpackage.s0l
    public s0l c() {
        return new sqf(this);
    }

    @Override // defpackage.s0l
    public int hashCode() {
        return (super.hashCode() * 31) + this.e.hashCode();
    }

    public t0l n() {
        return this.e;
    }

    public String p() {
        return "merge_rule";
    }

    public String r() {
        return this.e.j();
    }

    public sqf(int i, List<t0l> list, t0l t0lVar) {
        super(i, list);
        this.e = t0lVar;
    }
}
