package j82;

import e23.l;
import o13.p;
import o4.d0;
import o4.q;
import o4.u1;
import o4.w;
import o4.z0;
import p005kotlin.Unit;
import p13.x;
import q4.k;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f97707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f97708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f97709c;

    public /* synthetic */ b(boolean z14, long j8) {
        this.f97707a = 3;
        this.f97709c = z14;
        this.f97708b = j8;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        long jFloatToRawIntBits;
        long jFloatToRawIntBits2;
        long jFloatToRawIntBits3;
        int iFloatToRawIntBits;
        z0 z0VarC;
        int i14 = this.f97707a;
        long j8 = this.f97708b;
        boolean z14 = this.f97709c;
        switch (i14) {
            case 0:
                q4.f fVar = (q4.f) obj;
                fVar.getClass();
                long jB = fVar.b();
                if (z14) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jB & 4294967295L)) / 2;
                    long jFloatToRawIntBits4 = Float.floatToRawIntBits(0.0f);
                    long jFloatToRawIntBits5 = Float.floatToRawIntBits(fIntBitsToFloat);
                    jFloatToRawIntBits = jFloatToRawIntBits4 << 32;
                    jFloatToRawIntBits2 = jFloatToRawIntBits5 & 4294967295L;
                } else {
                    jFloatToRawIntBits = ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jB >> 32)) / 2)) << 32;
                    jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(0.0f)) & 4294967295L;
                }
                long j14 = jFloatToRawIntBits | jFloatToRawIntBits2;
                n4.c.a aVar = n4.c.f123541b;
                if (z14) {
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() >> 32));
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) / 2;
                    jFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat2);
                    iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat3);
                } else {
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (fVar.b() >> 32)) / 2;
                    float fIntBitsToFloat5 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                    jFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat4);
                    iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat5);
                }
                long j15 = (4294967295L & ((long) iFloatToRawIntBits)) | (jFloatToRawIntBits3 << 32);
                g6.f.a aVar2 = g6.f.f75994b;
                q4.f.G1(fVar, this.f97708b, j14, j15, fVar.s0(2), 0, null, 0, 496);
                return Unit.INSTANCE;
            case 1:
                q4.f fVar2 = (q4.f) obj;
                fVar2.getClass();
                float f14 = z14 ? 360.0f : 270.0f;
                g6.f.a aVar3 = g6.f.f75994b;
                float fS0 = fVar2.s0(4);
                u1.f129010b.getClass();
                q4.f.Q1(fVar2, this.f97708b, 0.0f, f14, 0L, 0L, 0.0f, new k(fS0, 0.0f, u1.f129011c, 0, null, 26, null), 880);
                return Unit.INSTANCE;
            case 2:
                l4.f fVar3 = (l4.f) obj;
                fVar3.getClass();
                float fIntBitsToFloat6 = Float.intBitsToFloat((int) (4294967295L & fVar3.f109845a.b())) * 0.75f;
                w.a aVar4 = w.f129023a;
                d0.f128823b.getClass();
                return fVar3.e(new vb1.c(z14, w.a.i(aVar4, x.k(d0.a(d0.f128831j), d0.a(j8)), fIntBitsToFloat6, 12), 0));
            default:
                q4.c cVar = (q4.c) obj;
                cVar.getClass();
                cVar.m1();
                if (z14) {
                    w.a aVar5 = w.f129023a;
                    p pVar = new p(Float.valueOf(0.7f), d0.a(j8));
                    Float fValueOf = Float.valueOf(1.0f);
                    d0.f128823b.getClass();
                    z0VarC = w.a.c(aVar5, new p[]{pVar, new p(fValueOf, d0.a(d0.f128831j))}, 0.0f, 0.0f, 14);
                } else {
                    w.a aVar6 = w.f129023a;
                    Float fValueOf2 = Float.valueOf(0.0f);
                    d0.f128823b.getClass();
                    z0VarC = w.a.c(aVar6, new p[]{new p(fValueOf2, d0.a(d0.f128831j)), new p(Float.valueOf(0.3f), d0.a(j8))}, 0.0f, 0.0f, 14);
                }
                z0 z0Var = z0VarC;
                q.f128930b.getClass();
                q4.f.C0(cVar, z0Var, 0L, 0L, 0.0f, null, q.f128936h, 62);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ b(long j8, boolean z14, int i14) {
        this.f97707a = i14;
        this.f97708b = j8;
        this.f97709c = z14;
    }
}
