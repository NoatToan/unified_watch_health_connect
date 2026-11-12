package defpackage;

import com.xiaomi.ai.nlp.lattice.entity.EntityType;
import com.xiaomi.ai.nlp.lattice.rule.RuleApplyPhase;
import com.xiaomi.ai.nlp.lm.core.LanguageModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes7.dex */
public class vf4 extends s0l {
    public List<String> e;
    public List<String> f;
    public String g;
    public int h;
    public int i;
    public Map<Integer, ovg> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<List<ovg>> f36837k;

    public vf4(vf4 vf4Var) {
        super(vf4Var);
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = -1;
        this.i = -1;
        this.j = null;
        this.f36837k = null;
        this.e = vf4Var.e;
        this.f = vf4Var.f;
        this.g = vf4Var.g;
    }

    private void y(y2e y2eVar, j82 j82Var, RuleApplyPhase ruleApplyPhase) {
        HashMap map = new HashMap();
        map.put("source", l());
        map.put("route", k());
        map.put("target", A());
        map.put("priority", i());
        map.put("rule_type", z());
        v0l.a(y2eVar, j82Var, ruleApplyPhase, map);
    }

    public String A() {
        StringBuilder sb = new StringBuilder();
        List<String> list = this.e;
        if (list != null && !list.isEmpty()) {
            sb.append("inclusions:");
            sb.append(j4b.b().toJson(this.e));
        }
        List<String> list2 = this.f;
        if (list2 != null && !list2.isEmpty()) {
            sb.append(" exclusions:");
            sb.append(j4b.b().toJson(this.f));
        }
        if (klo.d(this.g)) {
            sb.append(" default:");
            sb.append(this.g);
        }
        return sb.toString();
    }

    public final List<List<ovg>> B(ovg ovgVar, ovg ovgVar2) {
        int size;
        LinkedList linkedList = new LinkedList();
        HashMap map = new HashMap();
        HashSet hashSet = new HashSet();
        linkedList.add(ovgVar);
        int i = 0;
        while (!linkedList.isEmpty() && i < 10000) {
            ovg ovgVar3 = (ovg) linkedList.poll();
            if (!hashSet.contains(ovgVar3)) {
                hashSet.add(ovgVar3);
                if (ovgVar3 != ovgVar2) {
                    if (C(ovgVar3, ovgVar2) == null) {
                        linkedList.addAll(ovgVar3.o());
                    } else {
                        linkedList.add(ovgVar2);
                    }
                }
                if (ovgVar3 == ovgVar) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(ovgVar3);
                    arrayList.add(arrayList2);
                    map.put(ovgVar3, arrayList);
                    size = arrayList.size();
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    for (ovg ovgVar4 : ovgVar3.m()) {
                        if (map.containsKey(ovgVar4)) {
                            Iterator it = ((List) map.get(ovgVar4)).iterator();
                            while (it.hasNext()) {
                                ArrayList arrayList4 = new ArrayList((List) it.next());
                                arrayList4.add(ovgVar3);
                                arrayList3.add(arrayList4);
                            }
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        map.put(ovgVar3, arrayList3);
                        size = arrayList3.size();
                    }
                }
                i += size;
            }
        }
        if (map.containsKey(ovgVar2)) {
            return (List) map.get(ovgVar2);
        }
        return null;
    }

    public final ovg C(ovg ovgVar, ovg ovgVar2) {
        for (ovg ovgVar3 : ovgVar.o()) {
            if (ovgVar3 == ovgVar2) {
                return ovgVar3;
            }
        }
        return null;
    }

    public void D(String str) {
        this.g = str;
    }

    public void E(List<String> list) {
        this.f = list;
    }

    public void F(List<String> list) {
        this.e = list;
    }

    @Override // defpackage.s0l
    public void a(y2e y2eVar, j82 j82Var, RuleApplyPhase ruleApplyPhase, LanguageModel languageModel) {
        if (this.f33139b.d().isEmpty()) {
            return;
        }
        s();
        if (this.h == -1 || this.i == -1) {
            return;
        }
        Map<Integer, ovg> mapN = y2eVar.n();
        this.j = mapN;
        ovg ovgVar = mapN.get(Integer.valueOf(this.f33139b.d().get(this.h).a()));
        ovg ovgVar2 = this.j.get(Integer.valueOf(this.f33139b.d().get(this.i).a()));
        if (ovgVar.i().b() == ovgVar2.i().a()) {
            return;
        }
        if (ruleApplyPhase != RuleApplyPhase.AFTER_DECODING || o(ovgVar, ovgVar2)) {
            List<List<ovg>> listB = B(ovgVar, ovgVar2);
            this.f36837k = listB;
            if (listB == null) {
                return;
            }
            if (ruleApplyPhase.isApplyBestPath()) {
                x(y2eVar, ovgVar, ovgVar2);
                if (!this.f.isEmpty()) {
                    u(y2eVar, ovgVar, ovgVar2);
                }
            } else {
                w(y2eVar, ovgVar, ovgVar2);
            }
            y(y2eVar, j82Var, ruleApplyPhase);
        }
    }

    @Override // defpackage.s0l
    public s0l c() {
        return new vf4(this);
    }

    @Override // defpackage.s0l
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f33138a.equals(((s0l) obj).f33138a);
    }

    @Override // defpackage.s0l
    public int hashCode() {
        return this.f33138a.hashCode();
    }

    public final void n(ovg ovgVar, ovg ovgVar2) {
        ovgVar.w(ovgVar2);
        ovgVar2.u(ovgVar);
    }

    public final boolean o(ovg ovgVar, ovg ovgVar2) {
        for (ovg ovgVarE = ovgVar.e(); ovgVarE != ovgVar2; ovgVarE = ovgVarE.e()) {
            if (ovgVarE == null) {
                return false;
            }
        }
        return true;
    }

    public final List<ovg> p() {
        for (List<ovg> list : this.f36837k) {
            for (int i = 1; i < list.size(); i++) {
                if (this.e.contains(list.get(i).i().f())) {
                    return list;
                }
            }
        }
        return null;
    }

    public final boolean r(ovg ovgVar, ovg ovgVar2) {
        for (ovg ovgVarE = ovgVar.e(); ovgVarE != ovgVar2; ovgVarE = ovgVarE.e()) {
            if (this.e.contains(ovgVarE.i().f())) {
                return true;
            }
        }
        return false;
    }

    public final void s() {
        int i = -1;
        int i2 = -1;
        for (t0l t0lVar : this.f33138a) {
            if (t0lVar.i()) {
                for (int i3 = 0; i3 < this.f33139b.d().size(); i3++) {
                    if (this.f33139b.d().get(i3).f41785b == t0lVar.a()) {
                        i = i3;
                    }
                }
            }
            if (t0lVar.h()) {
                for (int i4 = 0; i4 < this.f33139b.d().size(); i4++) {
                    if (this.f33139b.d().get(i4).f41785b == t0lVar.a()) {
                        i2 = i4;
                    }
                }
            }
        }
        if (i >= i2 || i == -1 || i2 == -1) {
            return;
        }
        this.h = i;
        this.i = i2;
    }

    public final void u(y2e y2eVar, ovg ovgVar, ovg ovgVar2) {
        for (ovg ovgVarE = ovgVar.e(); ovgVarE != ovgVar2 && ovgVarE != null; ovgVarE = ovgVarE.e()) {
            ovg ovgVarD = ovgVarE.d();
            ovg ovgVarE2 = ovgVarE.e();
            if ((this.f.contains(Marker.ANY_MARKER) && !ovgVarE.i().f().equals("eps")) || this.f.contains(ovgVarE.i().f())) {
                int iC = y2eVar.c(new xb8(ovgVarE.i().a(), ovgVarE.i().b(), ovgVarE.i().h(), ovgVarE.i().e(), "eps", ovgVarE.i().e(), EntityType.CONSTRAINT_PARSED_ENTITY), false, this);
                ovgVarE.z(false);
                ovg ovgVar3 = this.j.get(Integer.valueOf(iC));
                ovgVar3.z(true);
                n(ovgVarD, ovgVar3);
                n(ovgVar3, ovgVarE2);
            }
        }
    }

    public final void w(y2e y2eVar, ovg ovgVar, ovg ovgVar2) {
        if (p() != null) {
            return;
        }
        String str = "";
        for (int i = this.h + 1; i < this.i; i++) {
            str = str + this.j.get(Integer.valueOf(this.f33139b.d().get(i).f41784a)).i().h();
        }
        y2eVar.c(new xb8(ovgVar.i().b(), ovgVar2.i().a(), str, str, klo.f(this.g) ? "eps" : this.g, str, EntityType.CONSTRAINT_PARSED_ENTITY), false, this);
    }

    public final void x(y2e y2eVar, ovg ovgVar, ovg ovgVar2) {
        if (r(ovgVar, ovgVar2)) {
            return;
        }
        List<ovg> listP = p();
        if (listP != null) {
            for (int i = 1; i < listP.size(); i++) {
                n(listP.get(i - 1), listP.get(i));
            }
            return;
        }
        String str = "";
        for (ovg ovgVarE = ovgVar.e(); ovgVarE != ovgVar2 && ovgVarE != null; ovgVarE = ovgVarE.e()) {
            ovgVarE.z(false);
            str = str + ovgVarE.i().h();
        }
        ovg ovgVar3 = this.j.get(Integer.valueOf(y2eVar.c(new xb8(ovgVar.i().b(), ovgVar2.i().a(), str, str, klo.f(this.g) ? "eps" : this.g, str, EntityType.CONSTRAINT_PARSED_ENTITY), false, this)));
        ovgVar3.z(true);
        n(ovgVar, ovgVar3);
        n(ovgVar3, ovgVar2);
    }

    public String z() {
        return "constraint_rule";
    }

    public vf4(int i, List<t0l> list) {
        super(i, list);
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = -1;
        this.i = -1;
        this.j = null;
        this.f36837k = null;
    }
}
