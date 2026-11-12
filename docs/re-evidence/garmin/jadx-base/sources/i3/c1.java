package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li3/c1;", "", "<init>", "()V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c1 f87691a = new c1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c2.l2 f87692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c2.l2 f87693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f87694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f87695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f87696f;

    static {
        n3.g.f122852a.getClass();
        float f14 = n3.g.f122853b;
        float f15 = n3.g.f122854c;
        float f16 = 16;
        g6.f.a aVar = g6.f.f75994b;
        n3.h.f122937a.getClass();
        float f17 = 8;
        c2.l2 l2VarD = c2.l.d(f14, f17, f15, f17);
        f87692b = l2VarD;
        c2.l.d(f16, f17, f15, f17);
        float f18 = 12;
        float f19 = l2VarD.f22737b;
        float f22 = l2VarD.f22739d;
        f87693c = c2.l.d(f18, f19, f18, f22);
        c2.l.d(f18, f19, f16, f22);
        f87694d = 58;
        f87695e = n3.h.f122938b;
        f87696f = n3.h.f122940d;
    }

    private c1() {
    }

    public static b1 a(long j8, long j14, long j15, long j16, p3.m mVar, int i14) {
        long j17;
        long j18;
        long j19;
        b1 b1Var;
        if ((i14 & 2) != 0) {
            o4.d0.f128823b.getClass();
            j17 = o4.d0.f128832k;
        } else {
            j17 = j14;
        }
        if ((i14 & 4) != 0) {
            o4.d0.f128823b.getClass();
            j18 = o4.d0.f128832k;
        } else {
            j18 = j15;
        }
        if ((i14 & 8) != 0) {
            o4.d0.f128823b.getClass();
            j19 = o4.d0.f128832k;
        } else {
            j19 = j16;
        }
        p3.x1 x1Var = p3.n.f135158a;
        s7.f89624a.getClass();
        j2 j2VarA = s7.a(mVar);
        b1 b1Var2 = j2VarA.W;
        if (b1Var2 == null) {
            n3.a0.f122675a.getClass();
            b1 b1Var3 = new b1(k2.d(j2VarA, n3.a0.f122676b), k2.d(j2VarA, n3.a0.f122685k), o4.d0.c(n3.a0.f122680f, k2.d(j2VarA, n3.a0.f122678d), 14), o4.d0.c(n3.a0.f122682h, k2.d(j2VarA, n3.a0.f122681g), 14), null);
            j2VarA.W = b1Var3;
            b1Var = b1Var3;
        } else {
            b1Var = b1Var2;
        }
        return b1Var.a(j8, j17, j18, j19);
    }

    public static b1 b(j2 j2Var) {
        b1 b1Var = j2Var.Y;
        if (b1Var != null) {
            return b1Var;
        }
        o4.d0.f128823b.getClass();
        long j8 = o4.d0.f128831j;
        long jD = k2.d(j2Var, n3.m.Primary);
        n3.d1.f122790a.getClass();
        b1 b1Var2 = new b1(j8, jD, j8, o4.d0.c(n3.d1.f122792c, k2.d(j2Var, n3.d1.f122791b), 14), null);
        j2Var.Y = b1Var2;
        return b1Var2;
    }

    public static b1 c(long j8, long j14, long j15, p3.m mVar, int i14) {
        long j16;
        if ((i14 & 1) != 0) {
            o4.d0.f128823b.getClass();
            j8 = o4.d0.f128832k;
        }
        long j17 = j8;
        o4.d0.a aVar = o4.d0.f128823b;
        aVar.getClass();
        long j18 = o4.d0.f128832k;
        if ((i14 & 8) != 0) {
            aVar.getClass();
            j16 = j18;
        } else {
            j16 = j15;
        }
        p3.x1 x1Var = p3.n.f135158a;
        s7.f89624a.getClass();
        return b(s7.a(mVar)).a(j17, j14, j18, j16);
    }
}
