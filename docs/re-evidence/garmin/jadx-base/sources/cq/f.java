package cq;

import java.util.Iterator;
import o4.d0;
import o4.u1;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f55014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f55015c;

    public /* synthetic */ f(long j8, long j14, int i14) {
        this.f55013a = i14;
        this.f55014b = j8;
        this.f55015c = j14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f55013a) {
            case 0:
                q4.f fVar = (q4.f) obj;
                fVar.getClass();
                q4.f.o0(fVar, this.f55014b, n4.g.e(fVar.b()), 0L, null, 0, 124);
                float fE = n4.g.e(fVar.b());
                g6.f.a aVar = g6.f.f75994b;
                q4.f.o0(fVar, this.f55015c, fE, 0L, new q4.k(fVar.s0(2), 0.0f, 0, 0, null, 30, null), 0, 108);
                break;
            case 1:
                q4.f fVar2 = (q4.f) obj;
                fVar2.getClass();
                float f14 = 2;
                g6.f.a aVar2 = g6.f.f75994b;
                float fS0 = fVar2.s0(f14);
                float f15 = fS0 / 2.0f;
                q4.f.o0(fVar2, this.f55014b, (n4.g.e(fVar2.b()) / f14) - f15, 0L, new q4.k(fS0, 0.0f, 0, 0, null, 30, null), 0, 108);
                d0.f128823b.getClass();
                long j8 = d0.f128831j;
                long j14 = this.f55015c;
                if (!d0.d(j14, j8)) {
                    q4.f.o0(fVar2, j14, (n4.g.e(fVar2.b()) / f14) - f15, 0L, null, 0, 124);
                }
                break;
            default:
                q4.c cVar = (q4.c) obj;
                cVar.getClass();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (cVar.b() & 4294967295L)) / 2.0f;
                g6.f.a aVar3 = g6.f.f75994b;
                float fS1 = cVar.s0(4);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
                n4.c.a aVar4 = n4.c.f123541b;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (cVar.b() >> 32))) << 32);
                u1.f129010b.getClass();
                q4.f.G1(cVar, this.f55014b, jFloatToRawIntBits, jFloatToRawIntBits2, fS1, u1.f129011c, null, 0, 480);
                float fS2 = cVar.s0(2);
                Iterator it = p13.x.k(Float.valueOf(0.0f), Float.valueOf(Float.intBitsToFloat((int) (cVar.b() >> 32)) / 2.0f), Float.valueOf(Float.intBitsToFloat((int) (cVar.b() >> 32)))).iterator();
                while (it.hasNext()) {
                    q4.f.o0(cVar, this.f55015c, fS2, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(((Number) it.next()).floatValue()) << 32), null, 0, 120);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
