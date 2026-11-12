package q23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p13.w;
import p43.g2;
import p43.s;
import t23.a0;
import t23.q;
import t23.v;
import t23.y0;
import w23.j0;
import w23.r;
import w23.w0;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f142337a;

    static {
        r43.l.f150388a.getClass();
        r rVar = new r(r43.l.f150389b, p005kotlin.reflect.jvm.internal.impl.builtins.f.f105854f);
        t23.f fVar = t23.f.INTERFACE;
        x33.f fVarG = p005kotlin.reflect.jvm.internal.impl.builtins.f.f105855g.f188596a.g();
        y0.a aVar = y0.f162076a;
        o43.e.a aVar2 = o43.e.f129095e;
        j0 j0Var = new j0(rVar, fVar, false, false, fVarG, aVar, aVar2);
        a0 a0Var = a0.ABSTRACT;
        if (a0Var == null) {
            j0.T(6);
            throw null;
        }
        j0Var.f181633k = a0Var;
        q.h hVar = q.f162050e;
        if (hVar == null) {
            j0.T(9);
            throw null;
        }
        j0Var.f181634l = hVar;
        u23.h.f168226x0.getClass();
        List listC = w.c(w0.H0(j0Var, u23.h.a.f168228b, g2.IN_VARIANCE, x33.f.e("T"), 0, aVar2));
        if (j0Var.f181636n != null) {
            androidx.room.a0.s(j0Var.getName(), "Type parameters are already set for ");
            return;
        }
        ArrayList arrayList = new ArrayList(listC);
        j0Var.f181636n = arrayList;
        j0Var.f181635m = new s(j0Var, arrayList, j0Var.f181637o, j0Var.f181638p);
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            j0.T(13);
            throw null;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((w23.k) ((v) it.next())).M0(j0Var.p());
        }
        f142337a = j0Var;
    }
}
