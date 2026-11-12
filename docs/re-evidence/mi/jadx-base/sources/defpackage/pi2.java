package defpackage;

import com.google.gson.JsonObject;
import com.xiaomi.ai.nlp.lattice.entity.EntityType;
import com.xiaomi.ai.nlp.lattice.rule.RuleApplyPhase;
import com.xiaomi.ai.nlp.lm.core.LanguageModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class pi2 extends s0l {
    public List<String> e;
    public List<String> f;

    public pi2(pi2 pi2Var) {
        super(pi2Var);
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.e = pi2Var.e;
        this.f = pi2Var.f;
    }

    private void o(y2e y2eVar, j82 j82Var, RuleApplyPhase ruleApplyPhase) {
        HashMap map = new HashMap();
        map.put("source", l());
        map.put("route", k());
        map.put("priority", i());
        map.put("rule_type", p());
        v0l.a(y2eVar, j82Var, ruleApplyPhase, map);
    }

    @Override // defpackage.s0l
    public void a(y2e y2eVar, j82 j82Var, RuleApplyPhase ruleApplyPhase, LanguageModel languageModel) {
        if (!ruleApplyPhase.isApplyBestPath() || languageModel == null) {
            return;
        }
        ovg ovgVar = y2eVar.n().get(Integer.valueOf(e().d().get(0).a()));
        ovg ovgVarD = ovgVar.d();
        ovg ovgVarE = ovgVar.e();
        JsonObject jsonObjectD = ovgVar.i().d();
        if (jsonObjectD != null && jsonObjectD.has("query_count") && jsonObjectD.has("name_iwp")) {
            int asInt = jsonObjectD.get("query_count").getAsInt();
            double asDouble = jsonObjectD.get("name_iwp").getAsDouble();
            if ((asInt >= 100 && asDouble > 0.75d) || asDouble >= 0.95d) {
                return;
            }
        }
        boolean z = (this.e.contains(y2eVar.p(ovgVarD)) || languageModel.c(y2eVar.p(ovgVar), y2eVar.p(ovgVarD))) ? false : true;
        if ((z || this.f.contains(y2eVar.p(ovgVarE)) || languageModel.c(y2eVar.p(ovgVarE), y2eVar.p(ovgVar))) && !z) {
            return;
        }
        ovgVar.z(false);
        ovg ovgVarN = n(ovgVar, y2eVar);
        xb8 xb8VarI = ovgVar.i();
        ovg ovgVar2 = y2eVar.n().get(Integer.valueOf(y2eVar.c(new xb8(xb8VarI.a(), xb8VarI.b(), xb8VarI.h(), xb8VarI.e(), ovgVarN == null ? "eps" : ovgVarN.i().f(), ovgVarN == null ? xb8VarI.h() : ovgVarN.i().g(), EntityType.BIGRAM_ENTITY), false, this)));
        ovgVar2.z(true);
        ovgVarD.w(ovgVar2);
        ovgVar2.u(ovgVarD);
        ovgVar2.w(ovgVarE);
        ovgVarE.u(ovgVar2);
        o(y2eVar, j82Var, ruleApplyPhase);
    }

    @Override // defpackage.s0l
    public s0l c() {
        return new pi2(this);
    }

    public final ovg n(ovg ovgVar, y2e y2eVar) {
        xb8 xb8VarI = ovgVar.i();
        Set<ovg> set = y2eVar.i().get(Integer.valueOf(xb8VarI.a()));
        set.remove(ovgVar);
        Iterator<ovg> it = set.iterator();
        while (it.hasNext()) {
            if (!it.next().o().contains(ovgVar.e())) {
                it.remove();
            }
        }
        for (ovg ovgVar2 : y2eVar.k().get(Integer.valueOf(xb8VarI.b()))) {
            if (!set.contains(ovgVar2)) {
                set.remove(ovgVar2);
            }
        }
        ArrayList arrayList = new ArrayList(set);
        if (arrayList.size() == 0) {
            return null;
        }
        Collections.sort(arrayList);
        return (ovg) arrayList.get(0);
    }

    public String p() {
        return "bigram_rule";
    }

    public void r(List<String> list) {
        this.f = list;
    }

    public void s(List<String> list) {
        this.e = list;
    }

    public pi2(int i, List<t0l> list) {
        super(i, list);
        this.e = new ArrayList();
        this.f = new ArrayList();
    }
}
