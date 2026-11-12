package defpackage;

import com.google.gson.JsonObject;
import com.xiaomi.ai.nlp.lattice.entity.EntityType;
import com.xiaomi.ai.nlp.lm.core.LanguageModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class y2e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<Integer, Set<ovg>> f39713b = new HashMap();
    public Map<Integer, Set<ovg>> c = new HashMap();
    public Map<Integer, ovg> d = new HashMap();
    public ovg e;
    public ovg f;
    public boolean g;

    public y2e(int i, boolean z) {
        this.f39712a = 0;
        this.f39712a = 0;
        xb8 xb8Var = new xb8(-1, 0, "<s>");
        int i2 = this.f39712a;
        this.f39712a = i2 + 1;
        this.e = new ovg(xb8Var, i2);
        this.d.put(Integer.valueOf(this.f39712a - 1), this.e);
        if (!this.c.containsKey(Integer.valueOf(xb8Var.b()))) {
            this.c.put(Integer.valueOf(xb8Var.b()), new HashSet());
        }
        this.c.get(Integer.valueOf(xb8Var.b())).add(this.e);
        xb8 xb8Var2 = new xb8(i, -1, "</s>");
        this.f = new ovg(xb8Var2, Integer.MAX_VALUE);
        this.d.put(Integer.MAX_VALUE, this.f);
        if (!this.f39713b.containsKey(Integer.valueOf(xb8Var2.a()))) {
            this.f39713b.put(Integer.valueOf(xb8Var2.a()), new HashSet());
        }
        if (this.c.containsKey(Integer.valueOf(xb8Var2.a()))) {
            Iterator<ovg> it = this.c.get(Integer.valueOf(xb8Var2.a())).iterator();
            while (it.hasNext()) {
                a(it.next(), this.f);
            }
        }
        this.f39713b.get(Integer.valueOf(xb8Var2.a())).add(this.f);
        if (!this.f39713b.containsKey(Integer.valueOf(xb8Var.a()))) {
            this.f39713b.put(Integer.valueOf(xb8Var.a()), new HashSet());
        }
        this.f39713b.get(Integer.valueOf(xb8Var.a())).add(this.e);
        if (!this.c.containsKey(Integer.valueOf(xb8Var2.b()))) {
            this.c.put(Integer.valueOf(xb8Var2.b()), new HashSet());
        }
        this.c.get(Integer.valueOf(xb8Var2.b())).add(this.f);
        this.g = z;
    }

    public static y2e q(String str, boolean z, brk brkVar, List<String> list) {
        return r(str, z, brkVar, new HashSet(), list);
    }

    public static y2e r(String str, boolean z, brk brkVar, Set<String> set, List<String> list) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        for (String str2 : list) {
            arrayList.add(new xb8(length, str2.length() + length, str2, str2));
            for (mjh<String, String> mjhVar : brkVar.getNTokenSlot(str2)) {
                String strA = mjhVar.a();
                String strD = mjhVar.d();
                if (set == null || !set.contains(strD)) {
                    arrayList.add(new xb8(length, length + str2.length(), str2, strA, strD, strA, str2.equals(strA) ? EntityType.INIT_PARSED_ENTITY : EntityType.ALIAS_ENTITY));
                }
            }
            length += str2.length();
        }
        return s(str, z, arrayList);
    }

    public static y2e s(String str, boolean z, List<xb8> list) {
        y2e y2eVar = new y2e(str.length(), z);
        Iterator<xb8> it = list.iterator();
        while (it.hasNext()) {
            y2eVar.b(it.next(), false);
        }
        return y2eVar;
    }

    public final void a(ovg ovgVar, ovg ovgVar2) {
        uz7 uz7Var = new uz7(ovgVar, ovgVar2, 0.0d);
        ovgVar.b(uz7Var);
        ovgVar2.a(uz7Var);
    }

    public int b(xb8 xb8Var, boolean z) {
        return c(xb8Var, z, new s0l());
    }

    public int c(xb8 xb8Var, boolean z, s0l s0lVar) {
        if (this.f39713b.get(Integer.valueOf(xb8Var.a())) != null) {
            for (ovg ovgVar : this.f39713b.get(Integer.valueOf(xb8Var.a()))) {
                if (ovgVar.i().equals(xb8Var)) {
                    if (ovgVar.i().c() != xb8Var.c()) {
                        ovgVar.i().i(xb8Var.c());
                        s0lVar.d = true;
                    }
                    if (!ovgVar.i().g().equals(xb8Var.g())) {
                        ovgVar.i().k(xb8Var.g());
                        s0lVar.d = true;
                    }
                    return ovgVar.l();
                }
            }
        }
        ArrayList<xb8> arrayList = new ArrayList();
        arrayList.add(xb8Var);
        s0lVar.d = true;
        if (z && !xb8Var.f().equals("eps")) {
            arrayList.add(new xb8(xb8Var.a(), xb8Var.b(), xb8Var.h()));
        }
        for (xb8 xb8Var2 : arrayList) {
            int i = this.f39712a;
            this.f39712a = i + 1;
            ovg ovgVar2 = new ovg(xb8Var2, i);
            this.d.put(Integer.valueOf(this.f39712a - 1), ovgVar2);
            if (this.c.containsKey(Integer.valueOf(xb8Var2.a()))) {
                Iterator<ovg> it = this.c.get(Integer.valueOf(xb8Var2.a())).iterator();
                while (it.hasNext()) {
                    a(it.next(), ovgVar2);
                }
            }
            if (!this.c.containsKey(Integer.valueOf(xb8Var2.b()))) {
                this.c.put(Integer.valueOf(xb8Var2.b()), new HashSet());
            }
            this.c.get(Integer.valueOf(xb8Var2.b())).add(ovgVar2);
            if (this.f39713b.containsKey(Integer.valueOf(xb8Var2.b()))) {
                Iterator<ovg> it2 = this.f39713b.get(Integer.valueOf(xb8Var2.b())).iterator();
                while (it2.hasNext()) {
                    a(ovgVar2, it2.next());
                }
            }
            if (!this.f39713b.containsKey(Integer.valueOf(xb8Var2.a()))) {
                this.f39713b.put(Integer.valueOf(xb8Var2.a()), new HashSet());
            }
            this.f39713b.get(Integer.valueOf(xb8Var2.a())).add(ovgVar2);
        }
        return this.f39712a - 1;
    }

    public int d(xb8 xb8Var) {
        if (this.c.containsKey(Integer.valueOf(xb8Var.a())) && this.f39713b.containsKey(Integer.valueOf(xb8Var.b()))) {
            return b(xb8Var, false);
        }
        return -1;
    }

    public void e() {
        ovg ovgVar = this.f;
        ovgVar.z(true);
        while (ovgVar.d() != null) {
            ovg ovgVarD = ovgVar.d();
            ovgVarD.z(true);
            ovgVarD.w(ovgVar);
            ovgVar = ovgVarD;
        }
    }

    public final void f() {
        Iterator<Map.Entry<Integer, ovg>> it = this.d.entrySet().iterator();
        while (it.hasNext()) {
            ovg value = it.next().getValue();
            if (value != null) {
                value.y(0.0d);
                value.A(0.0f);
                value.z(false);
                if (value.r()) {
                    value.u(null);
                    value.w(null);
                }
                for (uz7 uz7Var : value.k()) {
                    uz7Var.f(0.0d);
                    uz7Var.e(new JsonObject());
                }
            }
        }
    }

    public void g(LanguageModel languageModel) {
        ovg ovgVar = this.e;
        if (ovgVar == null) {
            return;
        }
        ovgVar.A(0.0f);
        for (ovg ovgVar2 : x()) {
            for (uz7 uz7Var : ovgVar2.k()) {
                JsonObject jsonObjectA = languageModel.a(p(uz7Var.d()), p(uz7Var.a()));
                uz7Var.e(jsonObjectA);
                float asFloat = jsonObjectA.get("score").getAsFloat();
                uz7Var.f(asFloat);
                float fP = uz7Var.a().p() + asFloat;
                if (uz7Var.d().d() == null || fP > uz7Var.d().p()) {
                    uz7Var.d().u(ovgVar2);
                    ovgVar2.w(uz7Var.d());
                    uz7Var.d().A(fP);
                }
                if (ovgVar2.e() == null) {
                    ovgVar2.w(uz7Var.d());
                }
            }
        }
    }

    public void h(j45 j45Var, k45 k45Var, List<Set<ovg>> list) {
        long j;
        ovg ovgVar = this.e;
        if (ovgVar == null) {
            return;
        }
        ovgVar.A(0.0f);
        Iterator<uz7> it = this.e.k().iterator();
        while (true) {
            j = 0;
            if (!it.hasNext()) {
                break;
            } else {
                it.next().f(0.0d);
            }
        }
        Iterator<uz7> it2 = this.f.h().iterator();
        while (it2.hasNext()) {
            it2.next().f(0.0d);
        }
        f();
        for (int i = 0; i < list.size(); i++) {
            for (ovg ovgVar2 : list.get(i)) {
                String strF = ovgVar2.i().f();
                double dA = j45Var.a(k45Var, i, strF);
                ovgVar2.y(dA);
                for (uz7 uz7Var : ovgVar2.h()) {
                    if (uz7Var.a().r() && uz7Var.d().r()) {
                        if (i > 0) {
                            uz7Var.f(j45Var.b(k45Var, uz7Var.a().i().f(), i, strF));
                        }
                        float fP = (float) (((double) uz7Var.a().p()) + uz7Var.c() + dA);
                        if (uz7Var.d().d() == null || fP > uz7Var.d().p()) {
                            uz7Var.d().u(uz7Var.a());
                            uz7Var.a().w(uz7Var.d());
                            uz7Var.d().A(fP);
                        }
                        if (uz7Var.a().e() == null) {
                            uz7Var.a().w(uz7Var.d());
                        }
                    }
                }
                if (i == list.size() - 1) {
                    for (uz7 uz7Var2 : ovgVar2.k()) {
                        if (uz7Var2.a().r() && uz7Var2.d().r()) {
                            float fP2 = (float) (((double) uz7Var2.a().p()) + uz7Var2.c() + 0.0d);
                            if (uz7Var2.d().d() == null || fP2 > uz7Var2.d().p()) {
                                uz7Var2.d().u(uz7Var2.a());
                                uz7Var2.a().w(uz7Var2.d());
                                uz7Var2.d().A(fP2);
                            }
                            if (uz7Var2.a().e() == null) {
                                uz7Var2.a().w(uz7Var2.d());
                            }
                        }
                    }
                }
                j = 0;
            }
        }
    }

    public Map<Integer, Set<ovg>> i() {
        return this.f39713b;
    }

    public List<Set<ovg>> j() {
        ArrayList arrayList = new ArrayList();
        this.e.x(true);
        this.f.x(true);
        for (ovg ovgVarE = this.e.e(); ovgVarE != null && ovgVarE.l() != this.f.l(); ovgVarE = ovgVarE.e()) {
            int iA = ovgVarE.i().a();
            String strH = ovgVarE.i().h();
            Set<ovg> set = this.f39713b.get(Integer.valueOf(iA));
            HashSet hashSet = new HashSet();
            for (ovg ovgVar : set) {
                if (ovgVar.i().h().equals(strH)) {
                    hashSet.add(ovgVar);
                    ovgVar.x(true);
                }
            }
            arrayList.add(hashSet);
        }
        return arrayList;
    }

    public Map<Integer, Set<ovg>> k() {
        return this.c;
    }

    public ovg l() {
        return this.e;
    }

    public ovg m(int i) {
        return this.d.get(Integer.valueOf(i));
    }

    public Map<Integer, ovg> n() {
        return this.d;
    }

    public ovg o() {
        return this.f;
    }

    public String p(ovg ovgVar) {
        xb8 xb8VarI = ovgVar.i();
        if (xb8VarI.h().equals("<s>") || xb8VarI.h().equals("</s>")) {
            return xb8VarI.h();
        }
        if (!xb8VarI.f().equals("eps")) {
            return "<any>/" + xb8VarI.f();
        }
        return xb8VarI.h() + "/" + xb8VarI.f();
    }

    public boolean t() {
        return this.g;
    }

    public void u(LanguageModel languageModel) {
        g(languageModel);
        e();
    }

    public void v(j45 j45Var, k45 k45Var, List<Set<ovg>> list) {
        h(j45Var, k45Var, list);
        e();
    }

    public final void w(ovg ovgVar, List<ovg> list, Set<ovg> set) {
        if (set.contains(ovgVar)) {
            return;
        }
        set.add(ovgVar);
        if (ovgVar == null) {
            return;
        }
        Iterator<uz7> it = ovgVar.k().iterator();
        while (it.hasNext()) {
            w(it.next().d(), list, set);
        }
        list.add(ovgVar);
    }

    public List<ovg> x() {
        ArrayList arrayList = new ArrayList(this.d.size());
        w(this.e, arrayList, new HashSet());
        Collections.reverse(arrayList);
        return arrayList;
    }
}
