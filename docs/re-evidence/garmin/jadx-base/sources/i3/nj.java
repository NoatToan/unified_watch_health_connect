package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li3/nj;", "", "<init>", "()V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class nj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nj f89109a = new nj();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f89110b;

    static {
        n3.e eVar = n3.e.f122793a;
        eVar.getClass();
        f89110b = n3.e.f122794b;
        eVar.getClass();
        n3.d.f122763a.getClass();
        n3.c cVar = n3.c.f122714a;
        cVar.getClass();
        cVar.getClass();
        eVar.getClass();
        n3.b.f122690a.getClass();
        n3.a aVar = n3.a.f122674a;
        aVar.getClass();
        aVar.getClass();
    }

    private nj() {
    }

    public static c2.x1 a(p3.m mVar) {
        p3.x1 x1Var = p3.n.f135158a;
        int i14 = c2.k3.f22728a;
        c2.c3 c3VarA = l3.o1.a(mVar);
        c2.p3.f22815b.getClass();
        return c2.n3.d(c3VarA, c2.p3.f22826m | c2.p3.f22822i);
    }

    public static mj b(long j8, long j14, long j15, p3.m mVar, int i14) {
        long j16;
        long j17;
        o4.d0.a aVar = o4.d0.f128823b;
        aVar.getClass();
        long j18 = o4.d0.f128832k;
        if ((i14 & 4) != 0) {
            aVar.getClass();
            j16 = j18;
        } else {
            j16 = j14;
        }
        if ((i14 & 8) != 0) {
            aVar.getClass();
            j17 = j18;
        } else {
            j17 = j15;
        }
        aVar.getClass();
        aVar.getClass();
        p3.x1 x1Var = p3.n.f135158a;
        s7.f89624a.getClass();
        j2 j2VarA = s7.a(mVar);
        mj mjVar = j2VarA.f88476c0;
        if (mjVar == null) {
            n3.f.f122807a.getClass();
            mj mjVar2 = new mj(k2.d(j2VarA, n3.f.f122808b), k2.d(j2VarA, n3.f.f122810d), k2.d(j2VarA, n3.f.f122809c), k2.d(j2VarA, n3.f.f122812f), k2.d(j2VarA, n3.f.f122813g), k2.d(j2VarA, n3.f.f122811e), null);
            j2VarA.f88476c0 = mjVar2;
            mjVar = mjVar2;
        }
        long j19 = j8 != 16 ? j8 : mjVar.f89026a;
        long j24 = j18 != 16 ? j18 : mjVar.f89027b;
        if (j16 == 16) {
            j16 = mjVar.f89028c;
        }
        long j25 = j16;
        if (j17 == 16) {
            j17 = mjVar.f89029d;
        }
        long j26 = j17;
        long j27 = j18 != 16 ? j18 : mjVar.f89030e;
        if (j18 == 16) {
            j18 = mjVar.f89031f;
        }
        return new mj(j19, j24, j25, j26, j27, j18, null);
    }
}
