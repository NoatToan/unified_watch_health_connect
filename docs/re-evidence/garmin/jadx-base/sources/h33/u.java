package h33;

import p13.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x33.c f81500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x33.c[] f81501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g0 f81502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f81503d;

    static {
        x33.c cVar = new x33.c("org.jspecify.nullness");
        x33.c cVar2 = new x33.c("org.jspecify.annotations");
        f81500a = cVar2;
        x33.c cVar3 = new x33.c("io.reactivex.rxjava3.annotations");
        x33.c cVar4 = new x33.c("org.checkerframework.checker.nullness.compatqual");
        String str = cVar3.f188596a.f188600a;
        f81501b = new x33.c[]{new x33.c(tn.k.g(str, ".Nullable")), new x33.c(tn.k.g(str, ".NonNull"))};
        x33.c cVar5 = new x33.c("org.jetbrains.annotations");
        v.f81504d.getClass();
        v vVar = v.f81505e;
        o13.p pVar = new o13.p(cVar5, vVar);
        o13.p pVar2 = new o13.p(new x33.c("androidx.annotation"), vVar);
        o13.p pVar3 = new o13.p(new x33.c("android.support.annotation"), vVar);
        o13.p pVar4 = new o13.p(new x33.c("android.annotation"), vVar);
        o13.p pVar5 = new o13.p(new x33.c("com.android.annotations"), vVar);
        o13.p pVar6 = new o13.p(new x33.c("org.eclipse.jdt.annotation"), vVar);
        o13.p pVar7 = new o13.p(new x33.c("org.checkerframework.checker.nullness.qual"), vVar);
        o13.p pVar8 = new o13.p(cVar4, vVar);
        o13.p pVar9 = new o13.p(new x33.c("javax.annotation"), vVar);
        o13.p pVar10 = new o13.p(new x33.c("edu.umd.cs.findbugs.annotations"), vVar);
        o13.p pVar11 = new o13.p(new x33.c("io.reactivex.annotations"), vVar);
        x33.c cVar6 = new x33.c("androidx.annotation.RecentlyNullable");
        h0 h0Var = h0.WARN;
        o13.p pVar12 = new o13.p(cVar6, new v(h0Var, null, null, 4, null));
        o13.p pVar13 = new o13.p(new x33.c("androidx.annotation.RecentlyNonNull"), new v(h0Var, null, null, 4, null));
        o13.p pVar14 = new o13.p(new x33.c("lombok"), vVar);
        o13.j jVar = new o13.j(2, 1);
        h0 h0Var2 = h0.STRICT;
        f81502c = new g0(u0.e(pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, pVar9, pVar10, pVar11, pVar12, pVar13, pVar14, new o13.p(cVar, new v(h0Var, jVar, h0Var2)), new o13.p(cVar2, new v(h0Var, new o13.j(2, 1), h0Var2)), new o13.p(cVar3, new v(h0Var, new o13.j(1, 8), h0Var2)), new o13.p(new x33.c("jakarta.annotation"), new v(h0Var, new o13.j(2, 4), h0Var2))));
        f81503d = new v(h0Var, null, null, 4, null);
    }
}
