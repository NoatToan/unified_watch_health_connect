package i3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s5 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f89615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f89616c;

    public /* synthetic */ s5(float f14, long j8, int i14) {
        this.f89614a = i14;
        this.f89615b = f14;
        this.f89616c = j8;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f89614a;
        long j8 = this.f89616c;
        float f14 = this.f89615b;
        switch (i14) {
            case 0:
                q4.f fVar = (q4.f) obj;
                float fS0 = fVar.s0(f14);
                float f15 = 2;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fVar.s0(f14) / f15)) & 4294967295L);
                n4.c.a aVar = n4.c.f123541b;
                q4.f.G1(fVar, this.f89616c, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.b() >> 32)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fVar.s0(f14) / f15))), fS0, 0, null, 0, 496);
                return Unit.INSTANCE;
            case 1:
                q4.f fVar2 = (q4.f) obj;
                float fS1 = fVar2.s0(f14);
                float f16 = 2;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fVar2.s0(f14) / f16)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                n4.c.a aVar2 = n4.c.f123541b;
                q4.f.G1(fVar2, this.f89616c, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fVar2.s0(f14) / f16)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar2.b() & 4294967295L))))), fS1, 0, null, 0, 496);
                return Unit.INSTANCE;
            case 2:
                q4.f fVar3 = (q4.f) obj;
                fVar3.getClass();
                o4.j jVarA = o4.m.a();
                jVarA.a(Float.intBitsToFloat((int) (fVar3.b() >> 32)) / 2, 0.0f);
                jVarA.c(0.0f, Float.intBitsToFloat((int) (fVar3.b() & 4294967295L)));
                jVarA.c(Float.intBitsToFloat((int) (fVar3.b() >> 32)), Float.intBitsToFloat((int) (fVar3.b() & 4294967295L)));
                jVarA.close();
                q4.f.L(fVar3, jVarA, this.f89616c, 0.0f, new q4.k(fVar3.s0(j82.e.w(f14)), 0.0f, 0, 0, null, 30, null), 52);
                return Unit.INSTANCE;
            case 3:
                q4.f fVar4 = (q4.f) obj;
                fVar4.getClass();
                o4.j jVarA2 = o4.m.a();
                jVarA2.a(Float.intBitsToFloat((int) (fVar4.b() >> 32)) / 2, Float.intBitsToFloat((int) (fVar4.b() & 4294967295L)));
                jVarA2.c(0.0f, 0.0f);
                jVarA2.c(Float.intBitsToFloat((int) (fVar4.b() >> 32)), 0.0f);
                jVarA2.close();
                q4.f.L(fVar4, jVarA2, this.f89616c, 0.0f, new q4.k(fVar4.s0(j82.e.w(f14)), 0.0f, 0, 0, null, 30, null), 52);
                return Unit.INSTANCE;
            case 4:
                q4.f fVar5 = (q4.f) obj;
                fVar5.getClass();
                g6.f.a aVar3 = g6.f.f75994b;
                return m92.c0.e(fVar5, 2, new m92.m.d(j8, null), false, 0.0f, null, null, p13.x.k(new m92.h0.e.a(0.0f, 0.0f), new m92.h0.e.a(1.0f, 0.0f)), null, null, null, Float.valueOf(0.0f), Float.valueOf(f14), null, false, null, 29624);
            case 5:
                q4.f fVar6 = (q4.f) obj;
                fVar6.getClass();
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar6.b() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar6.b() & 4294967295L)) / 2.0f)) & 4294967295L);
                n4.c.a aVar4 = n4.c.f123541b;
                q4.f.o0(fVar6, this.f89616c, this.f89615b, jFloatToRawIntBits3, null, 0, 120);
                return Unit.INSTANCE;
            case 6:
                q4.f fVar7 = (q4.f) obj;
                fVar7.getClass();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar7.b() >> 32)) / 2.0f;
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                n4.c.a aVar5 = n4.c.f123541b;
                q4.f.G1(fVar7, this.f89616c, jFloatToRawIntBits4, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar7.b() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.f89615b, 0, null, 0, 496);
                return Unit.INSTANCE;
            default:
                q4.f fVar8 = (q4.f) obj;
                fVar8.getClass();
                float f17 = 0;
                g6.f.a aVar6 = g6.f.f75994b;
                k2.d dVar = new k2.d(k2.c.a(f14), k2.c.a(f17), k2.c.a(f17), k2.c.a(f14));
                long jB = fVar8.b();
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                float fS2 = fVar8.s0(j92.b.f97899b.f97918c);
                n4.g.a aVar7 = n4.g.f123559b;
                o4.c1.a(fVar8, dVar.a((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jB & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fS2) << 32), fVar8.getLayoutDirection(), fVar8), j8);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ s5(long j8, float f14, int i14) {
        this.f89614a = i14;
        this.f89616c = j8;
        this.f89615b = f14;
    }
}
