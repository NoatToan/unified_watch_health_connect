package l3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s1.b2<g6.f> f109448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s1.b2<g6.f> f109449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s1.b2<g6.f> f109450c;

    static {
        s1.w wVar = new s1.w(0.4f, 0.0f, 0.6f, 1.0f);
        f109448a = new s1.b2<>(120, 0, s1.e0.f155560a, 2, null);
        f109449b = new s1.b2<>(150, 0, wVar, 2, null);
        f109450c = new s1.b2<>(120, 0, wVar, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000e A[PHI: r1
      0x000e: PHI (r1v3 s1.b2<g6.f>) = 
      (r1v0 s1.b2<g6.f>)
      (r1v0 s1.b2<g6.f>)
      (r1v0 s1.b2<g6.f>)
      (r1v4 s1.b2<g6.f>)
      (r1v4 s1.b2<g6.f>)
      (r1v4 s1.b2<g6.f>)
      (r1v4 s1.b2<g6.f>)
     binds: [B:19:0x002c, B:22:0x0031, B:28:0x003d, B:5:0x000c, B:8:0x0012, B:11:0x0017, B:14:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    public static final Object a(s1.b bVar, float f14, a2.h hVar, a2.h hVar2, v13.c cVar) {
        s1.b2<g6.f> b2Var;
        s1.b2<g6.f> b2Var2 = null;
        if (hVar2 != null) {
            v0.f109444a.getClass();
            boolean z14 = hVar2 instanceof a2.l.b;
            b2Var = f109448a;
            if (z14 || (hVar2 instanceof a2.a.b) || (hVar2 instanceof a2.e) || (hVar2 instanceof a2.b)) {
                b2Var2 = b2Var;
            }
        } else if (hVar != null) {
            v0.f109444a.getClass();
            boolean z15 = hVar instanceof a2.l.b;
            b2Var = f109449b;
            if (z15 || (hVar instanceof a2.a.b)) {
                b2Var2 = b2Var;
            } else if (hVar instanceof a2.e) {
                b2Var2 = f109450c;
            } else if (hVar instanceof a2.b) {
                b2Var2 = b2Var;
            }
        }
        s1.b2<g6.f> b2Var3 = b2Var2;
        if (b2Var3 != null) {
            Object objC = s1.b.c(bVar, g6.f.a(f14), b2Var3, null, cVar, 12);
            return objC == u13.a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
        }
        Object objG = bVar.g(g6.f.a(f14), cVar);
        return objG == u13.a.COROUTINE_SUSPENDED ? objG : Unit.INSTANCE;
    }
}
