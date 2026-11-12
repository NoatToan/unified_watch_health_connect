package z3;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p1.h1;
import p1.i1;
import p1.t0;
import p1.u0;
import p3.p2;
import p3.y2;
import p3.z2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000B\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lz3/l;", "<init>", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set<y2> f202106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g4.h f202107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q3.c<z2> f202108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u0<z2> f202109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q3.c<z2> f202110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q3.c<Object> f202111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q3.c<e23.a<Unit>> f202112g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u0<p3.i> f202113h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t0<p2, h> f202114i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList<q3.c<z2>> f202115j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h1<z2> f202116k;

    public l() {
        q3.c<z2> cVar = new q3.c<>(new z2[16], 0);
        this.f202108c = cVar;
        this.f202109d = i1.a();
        this.f202110e = cVar;
        this.f202111f = new q3.c<>(new Object[16], 0);
        this.f202112g = new q3.c<>(new e23.a[16], 0);
    }

    public static final boolean f(z2 z2Var, q3.c<z2> cVar) {
        z2[] z2VarArr = cVar.f142356a;
        int i14 = cVar.f142358c;
        for (int i15 = 0; i15 < i14; i15++) {
            y2 f135269a = z2VarArr[i15].getF135269a();
            if (f135269a instanceof h) {
                q3.c<z2> cVar2 = ((h) f135269a).f202101b;
                if (cVar2.j(z2Var) || f(z2Var, cVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a() {
        this.f202106a = null;
        this.f202107b = null;
        q3.c<z2> cVar = this.f202108c;
        cVar.g();
        this.f202109d.e();
        this.f202110e = cVar;
        this.f202111f.g();
        this.f202112g.g();
        this.f202113h = null;
        this.f202114i = null;
        this.f202115j = null;
    }

    public final void b() {
        Set<y2> set = this.f202106a;
        if (set == null || set.isEmpty()) {
            return;
        }
        q.f202125a.getClass();
        Trace.beginSection("Compose:abandons");
        try {
            Iterator<y2> it = set.iterator();
            while (it.hasNext()) {
                y2 next = it.next();
                it.remove();
                next.onAbandoned();
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            q.f202125a.getClass();
            Trace.endSection();
        }
    }

    public final void c() {
        Set<y2> set = this.f202106a;
        if (set == null) {
            return;
        }
        this.f202116k = null;
        q3.c<Object> cVar = this.f202111f;
        if (cVar.f142358c != 0) {
            q.f202125a.getClass();
            Trace.beginSection("Compose:onForgotten");
            try {
                u0<p3.i> u0Var = this.f202113h;
                int i14 = cVar.f142358c;
                while (true) {
                    i14--;
                    if (-1 >= i14) {
                        break;
                    }
                    Object obj = cVar.f142356a[i14];
                    try {
                        if (obj instanceof z2) {
                            y2 f135269a = ((z2) obj).getF135269a();
                            set.remove(f135269a);
                            f135269a.onForgotten();
                        }
                        if (obj instanceof p3.i) {
                            if (u0Var == null || !u0Var.a((p3.i) obj)) {
                                ((p3.i) obj).k();
                            } else {
                                ((p3.i) obj).a();
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th3) {
                        g4.h hVar = this.f202107b;
                        if (hVar != null) {
                            hVar.g(obj, th3);
                        }
                        throw th3;
                    }
                }
                Unit unit2 = Unit.INSTANCE;
                q.f202125a.getClass();
                Trace.endSection();
            } catch (Throwable th4) {
                q.f202125a.getClass();
                Trace.endSection();
                throw th4;
            }
        }
        q3.c<z2> cVar2 = this.f202108c;
        if (cVar2.f142358c != 0) {
            q.f202125a.getClass();
            Trace.beginSection("Compose:onRemembered");
            try {
                Set<y2> set2 = this.f202106a;
                if (set2 != null) {
                    z2[] z2VarArr = cVar2.f142356a;
                    int i15 = cVar2.f142358c;
                    for (int i16 = 0; i16 < i15; i16++) {
                        z2 z2Var = z2VarArr[i16];
                        y2 f135269a2 = z2Var.getF135269a();
                        set2.remove(f135269a2);
                        try {
                            f135269a2.onRemembered();
                            Unit unit3 = Unit.INSTANCE;
                        } catch (Throwable th5) {
                            g4.h hVar2 = this.f202107b;
                            if (hVar2 != null) {
                                hVar2.g(z2Var, th5);
                            }
                            throw th5;
                        }
                    }
                }
                Unit unit4 = Unit.INSTANCE;
                q.f202125a.getClass();
                Trace.endSection();
            } catch (Throwable th6) {
                q.f202125a.getClass();
                Trace.endSection();
                throw th6;
            }
        }
    }

    public final void d() {
        q3.c<e23.a<Unit>> cVar = this.f202112g;
        if (cVar.f142358c != 0) {
            q.f202125a.getClass();
            Trace.beginSection("Compose:sideeffects");
            try {
                e23.a<Unit>[] aVarArr = cVar.f142356a;
                int i14 = cVar.f142358c;
                for (int i15 = 0; i15 < i14; i15++) {
                    aVarArr[i15].invoke();
                }
                cVar.g();
                Unit unit = Unit.INSTANCE;
            } finally {
                q.f202125a.getClass();
                Trace.endSection();
            }
        }
    }

    public final void e(z2 z2Var) {
        if (!this.f202109d.a(z2Var)) {
            h1<z2> h1Var = this.f202116k;
            if (h1Var == null || !h1Var.a(z2Var)) {
                this.f202111f.b(z2Var);
                return;
            }
            return;
        }
        this.f202109d.l(z2Var);
        if (!this.f202110e.j(z2Var)) {
            q3.c<z2> cVar = this.f202108c;
            if (!cVar.j(z2Var)) {
                f(z2Var, cVar);
            }
        }
        Set<y2> set = this.f202106a;
        if (set == null) {
            return;
        }
        set.add(z2Var.getF135269a());
    }

    public final void g(Set set, g4.i iVar) {
        a();
        this.f202106a = set;
        this.f202107b = iVar;
    }

    public final void h(z2 z2Var) {
        this.f202110e.b(z2Var);
        this.f202109d.d(z2Var);
    }
}
