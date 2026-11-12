package i03;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class n implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f86956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f86957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f86958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<Class<? extends h73.r>, k.c<? extends h73.r>> f86959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k.a f86960e;

    public static class a implements k.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap f86961a = new HashMap();

        public final a a(Class cls, k.c cVar) {
            this.f86961a.put(cls, cVar);
            return this;
        }
    }

    public n(g gVar, q qVar, t tVar, Map<Class<? extends h73.r>, k.c<? extends h73.r>> map, k.a aVar) {
        this.f86956a = gVar;
        this.f86957b = qVar;
        this.f86958c = tVar;
        this.f86959d = map;
        this.f86960e = aVar;
    }

    public final void a(h73.r rVar) {
        ((b) this.f86960e).getClass();
        if (rVar.f82383e != null) {
            c();
            this.f86958c.a('\n');
        }
    }

    public final void b() {
        ((b) this.f86960e).getClass();
        c();
    }

    public final void c() {
        t tVar = this.f86958c;
        if (tVar.f86967a.length() > 0) {
            StringBuilder sb3 = tVar.f86967a;
            if ('\n' != sb3.charAt(sb3.length() - 1)) {
                tVar.a('\n');
            }
        }
    }

    public final int d() {
        return this.f86958c.f86967a.length();
    }

    public final <N extends h73.r> void e(N n14, int i14) {
        Class<?> cls = n14.getClass();
        g gVar = this.f86956a;
        s sVar = gVar.f86938e.f86951a.get(cls);
        if (sVar != null) {
            Object objA = sVar.a(gVar, this.f86957b);
            t tVar = this.f86958c;
            int length = tVar.f86967a.length();
            int length2 = tVar.f86967a.length();
            if (length <= i14 || i14 < 0 || length > length2) {
                return;
            }
            t.c(tVar, objA, i14, length);
        }
    }

    public final void f(h73.r rVar) {
        k.c<? extends h73.r> cVar = this.f86959d.get(rVar.getClass());
        if (cVar != null) {
            cVar.a(this, rVar);
        } else {
            g(rVar);
        }
    }

    public final void g(h73.r rVar) {
        h73.r rVar2 = rVar.f82380b;
        while (rVar2 != null) {
            h73.r rVar3 = rVar2.f82383e;
            rVar2.a(this);
            rVar2 = rVar3;
        }
    }
}
