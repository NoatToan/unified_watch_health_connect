package jd0;

import am.x0;
import am.y0;
import am.z0;
import com.garmin.android.apps.connectmobile.k1;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljd0/i;", "Lam/y0;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements y0 {
    @Override // am.y0
    public final boolean a(x0 x0Var, String str) {
        Object obj;
        Object next;
        x0Var.getClass();
        com.garmin.android.apps.connectmobile.i.f36758a.getClass();
        Iterator it = h0.d1(com.garmin.android.apps.connectmobile.i.c().keySet()).iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p005kotlin.jvm.internal.s.g(((to.o) next).j(), str));
        to.o oVar = (to.o) next;
        for (Object obj2 : h0.d1(com.garmin.android.apps.connectmobile.i.c().keySet())) {
            com.garmin.android.apps.connectmobile.i.f36758a.getClass();
            if (com.garmin.android.apps.connectmobile.i.c().get((to.o) obj2) == x0Var) {
                obj = obj2;
                break;
            }
        }
        to.o oVar2 = (to.o) obj;
        x0 x0VarM = z0.m(str);
        if (oVar != null && oVar2 != null) {
            Integer parentTypeId = oVar.getParentTypeId();
            int typeId = oVar2.getTypeId();
            if ((parentTypeId != null && parentTypeId.intValue() == typeId) || oVar.getTypeId() == oVar2.getTypeId()) {
                return true;
            }
        }
        return x0VarM != null && x0VarM == x0Var;
    }

    @Override // am.y0
    public final to.o b(x0 x0Var) {
        Object next;
        x0Var.getClass();
        com.garmin.android.apps.connectmobile.i.f36758a.getClass();
        Iterator it = com.garmin.android.apps.connectmobile.i.c().entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Map.Entry) next).getValue() != x0Var);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (to.o) entry.getKey();
        }
        return null;
    }

    @Override // am.y0
    public final int c(String str) {
        str.getClass();
        com.garmin.android.apps.connectmobile.i.f36758a.getClass();
        return com.garmin.android.apps.connectmobile.i.d(str);
    }

    @Override // am.y0
    public final x0 d(x0 x0Var, x0 x0Var2) {
        x0Var2.getClass();
        com.garmin.android.apps.connectmobile.i.f36758a.getClass();
        return com.garmin.android.apps.connectmobile.i.f(x0Var, x0Var2);
    }

    @Override // am.y0
    public final boolean e(String str) throws IOException {
        Object next;
        x0 x0Var;
        com.garmin.android.apps.connectmobile.i.f36758a.getClass();
        if (str == null) {
            return false;
        }
        x0 x0Var2 = x0.f4346x;
        x0Var2.getClass();
        Iterator it = com.garmin.android.apps.connectmobile.i.c().keySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p005kotlin.jvm.internal.s.g(((to.o) next).j(), str));
        to.o oVar = (to.o) next;
        if (oVar != null && (x0Var = (x0) com.garmin.android.apps.connectmobile.i.c().get(oVar)) != null) {
            x0Var2 = x0Var;
        }
        to.o oVarB = com.garmin.android.apps.connectmobile.i.b(x0Var2);
        if (oVarB != null) {
            return oVarB.getTrimmable();
        }
        return false;
    }

    @Override // am.y0
    public final to.o f(x0 x0Var) {
        com.garmin.android.apps.connectmobile.i.f36758a.getClass();
        return com.garmin.android.apps.connectmobile.i.b(x0Var);
    }

    @Override // am.y0
    public final int g(x0 x0Var) {
        x0Var.getClass();
        com.garmin.android.apps.connectmobile.i.f36758a.getClass();
        return com.garmin.android.apps.connectmobile.i.e(x0Var);
    }

    @Override // am.y0
    public final qs.x h(x0 x0Var) {
        x0Var.getClass();
        return tq.k.f(x0Var);
    }

    @Override // am.y0
    public final boolean i(x0 x0Var) throws IOException {
        com.garmin.android.apps.connectmobile.i.f36758a.getClass();
        to.o oVarB = com.garmin.android.apps.connectmobile.i.b(x0Var);
        if (oVarB != null) {
            return oVarB.getRestricted();
        }
        return false;
    }

    @Override // am.y0
    public final x0 j(int i14) {
        com.garmin.android.apps.connectmobile.i.f36758a.getClass();
        return com.garmin.android.apps.connectmobile.i.h(i14);
    }

    @Override // am.y0
    public final List<x0> k(x0 x0Var) {
        x0Var.getClass();
        com.garmin.android.apps.connectmobile.i.f36758a.getClass();
        return com.garmin.android.apps.connectmobile.i.g(x0Var, com.garmin.android.apps.connectmobile.i.c());
    }

    @Override // am.y0
    public final int l(x0 x0Var, x0 x0Var2) {
        x0Var2.getClass();
        com.garmin.android.apps.connectmobile.i.f36758a.getClass();
        return com.garmin.android.apps.connectmobile.i.e(com.garmin.android.apps.connectmobile.i.f(x0Var, x0Var2));
    }

    @Override // am.y0
    public final boolean m(x0 x0Var) {
        com.garmin.android.apps.connectmobile.i.f36758a.getClass();
        if (x0Var == null) {
            return false;
        }
        String str = x0Var.f4358a;
        z0 z0Var = z0.f4390a;
        if (z0.b(x0.D, str) || z0.H(str)) {
            return true;
        }
        if (!z0.G(str)) {
            return false;
        }
        bv.b.f21239a.getClass();
        bv.b.a();
        return !k1.f37122a.w();
    }
}
