package com.xiaomi.ai.nlp.lattice.rule;

import com.xiaomi.ai.nlp.lattice.entity.EntityType;
import com.xiaomi.ai.nlp.lm.core.LanguageModel;
import defpackage.j82;
import defpackage.ovg;
import defpackage.s0l;
import defpackage.t0l;
import defpackage.v0l;
import defpackage.y2e;
import defpackage.zxk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class PriorityRule extends s0l {
    public List<t0l> e;
    public PriorityType f;

    public enum PriorityType {
        UNI,
        FRONT,
        END
    }

    public PriorityRule(PriorityRule priorityRule) {
        super(priorityRule);
        this.e = new ArrayList();
        this.e = priorityRule.u();
        this.f = priorityRule.s();
    }

    private void w(y2e y2eVar, j82 j82Var, RuleApplyPhase ruleApplyPhase) {
        HashMap map = new HashMap();
        map.put("source", l());
        map.put("route", k());
        map.put("target", y());
        map.put("priority", i());
        map.put("rule_type", x());
        v0l.a(y2eVar, j82Var, ruleApplyPhase, map);
    }

    @Override // defpackage.s0l
    public void a(y2e y2eVar, j82 j82Var, RuleApplyPhase ruleApplyPhase, LanguageModel languageModel) {
        boolean z;
        if (ruleApplyPhase.isApplyBestPath()) {
            List<zxk> listD = e().d();
            t0l t0lVar = u().get(0);
            int i = 0;
            for (int i2 = 0; i2 < listD.size(); i2++) {
                zxk zxkVar = listD.get(i2);
                if (zxkVar.b() != -1) {
                    if (i < u().size()) {
                        t0lVar = u().get(i);
                    }
                    i++;
                    PriorityType priorityType = this.f;
                    if (priorityType == PriorityType.FRONT && i2 == 0) {
                        z = r(y2eVar, zxkVar, t0lVar);
                    } else if (priorityType == PriorityType.END && i2 == listD.size() - 1) {
                        z = n(y2eVar, zxkVar, t0lVar);
                    } else if (this.f == PriorityType.UNI) {
                        z = z(y2eVar, zxkVar, t0lVar);
                    }
                    if (z) {
                        this.d = true;
                    }
                    if (z) {
                        w(y2eVar, j82Var, ruleApplyPhase);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // defpackage.s0l
    public s0l c() {
        return new PriorityRule(this);
    }

    @Override // defpackage.s0l
    public int hashCode() {
        return (super.hashCode() * 31) + this.e.hashCode();
    }

    public final boolean n(y2e y2eVar, zxk zxkVar, t0l t0lVar) {
        ovg next;
        ovg ovgVar = y2eVar.n().get(Integer.valueOf(zxkVar.a()));
        Iterator<ovg> it = y2eVar.i().get(Integer.valueOf(ovgVar.i().a())).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.i().f().equals(t0lVar.e()) && (!t0lVar.e().equals("eps") || next.i().e().equals(t0lVar.g()))) {
                break;
            }
        }
        if (next == null) {
            return false;
        }
        next.u(ovgVar.d());
        ovgVar.d().w(next);
        ovg ovgVarO = o(ovgVar, next);
        if (ovgVarO == null) {
            return false;
        }
        ovg ovgVarE = next.e();
        next.i().i(EntityType.PRIORITY_ENTITY);
        while (true) {
            ovg ovgVar2 = next;
            next = ovgVarE;
            if (next == ovgVarO) {
                ovgVarO.u(ovgVar2);
                return true;
            }
            next.u(ovgVar2);
            next.i().i(EntityType.PRIORITY_ENTITY);
            ovgVarE = next.e();
        }
    }

    public ovg o(ovg ovgVar, ovg ovgVar2) {
        ovgVar.z(false);
        ovgVar2.z(true);
        while (ovgVar.l() != ovgVar2.l()) {
            if (ovgVar.e() == null && ovgVar2.e() == null) {
                return null;
            }
            if ((ovgVar2.e() != null || ovgVar.e() == null) && (ovgVar.i().b() == -1 || ovgVar.i().b() > ovgVar2.i().b())) {
                ovgVar2 = ovgVar2.e();
                ovgVar2.z(true);
            } else {
                ovgVar = ovgVar.e();
                ovgVar.z(false);
            }
        }
        ovgVar.z(true);
        return ovgVar;
    }

    public ovg p(ovg ovgVar, ovg ovgVar2) {
        ovgVar.z(false);
        ovgVar2.z(true);
        while (ovgVar.l() != ovgVar2.l()) {
            if (ovgVar.e() == null && ovgVar2.e() == null) {
                return null;
            }
            if ((ovgVar2.d() != null || ovgVar.d() == null) && (ovgVar.i().a() == -1 || ovgVar.i().a() < ovgVar2.i().a())) {
                ovgVar2 = ovgVar2.d();
                ovgVar2.z(true);
            } else {
                ovgVar = ovgVar.d();
                ovgVar.z(false);
            }
        }
        ovgVar.z(true);
        return ovgVar;
    }

    public final boolean r(y2e y2eVar, zxk zxkVar, t0l t0lVar) {
        ovg next;
        ovg ovgVar = y2eVar.n().get(Integer.valueOf(zxkVar.a()));
        Iterator<ovg> it = y2eVar.k().get(Integer.valueOf(ovgVar.i().b())).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.i().f().equals(t0lVar.e()) && (!t0lVar.e().equals("eps") || next.i().e().equals(t0lVar.g()))) {
                break;
            }
        }
        if (next == null) {
            return false;
        }
        next.w(ovgVar.e());
        ovgVar.e().u(next);
        ovg ovgVarP = p(ovgVar, next);
        if (ovgVarP == null) {
            return false;
        }
        ovg ovgVarD = next.d();
        next.i().i(EntityType.PRIORITY_ENTITY);
        while (true) {
            ovg ovgVar2 = next;
            next = ovgVarD;
            if (next == ovgVarP) {
                ovgVarP.w(ovgVar2);
                return true;
            }
            next.w(ovgVar2);
            next.i().i(EntityType.PRIORITY_ENTITY);
            ovgVarD = next.d();
        }
    }

    public PriorityType s() {
        return this.f;
    }

    public List<t0l> u() {
        return this.e;
    }

    public String x() {
        return String.valueOf(this.f).toLowerCase() + "_priority_rule";
    }

    public String y() {
        StringBuilder sb = new StringBuilder();
        Iterator<t0l> it = this.e.iterator();
        while (it.hasNext()) {
            sb.append(it.next().j());
            sb.append(" ");
        }
        return sb.toString().substring(0, sb.toString().length() - 1);
    }

    public final boolean z(y2e y2eVar, zxk zxkVar, t0l t0lVar) {
        ovg next;
        ovg ovgVar = y2eVar.n().get(Integer.valueOf(zxkVar.a()));
        Iterator<ovg> it = y2eVar.i().get(Integer.valueOf(ovgVar.i().a())).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.i().f().equals(t0lVar.e()) && (!t0lVar.e().equals("eps") || next.i().e().equals(t0lVar.g()))) {
                break;
            }
        }
        if (next == null) {
            return false;
        }
        next.u(ovgVar.d());
        ovgVar.d().w(next);
        next.w(ovgVar.e());
        ovgVar.e().u(next);
        ovgVar.z(false);
        next.z(true);
        next.i().i(EntityType.PRIORITY_ENTITY);
        return true;
    }

    public PriorityRule(int i, List<t0l> list, List<t0l> list2, PriorityType priorityType) {
        super(i, list);
        new ArrayList();
        this.e = list2;
        this.f = priorityType;
    }
}
