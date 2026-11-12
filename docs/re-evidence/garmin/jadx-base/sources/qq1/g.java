package qq1;

import android.graphics.RectF;
import e23.l;
import java.util.List;
import m92.c0;
import m92.h0;
import m92.m;
import o13.u;
import o4.d0;
import o4.q;
import p005kotlin.Unit;
import p13.w;
import q4.k;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146065a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f146066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f146067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f146068d;

    public /* synthetic */ g(float f14, long j8, l lVar) {
        this.f146068d = f14;
        this.f146066b = lVar;
        this.f146067c = j8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        u uVar;
        int i14 = this.f146065a;
        Object obj2 = this.f146066b;
        float f14 = this.f146068d;
        switch (i14) {
            case 0:
                List list = (List) obj2;
                q4.f fVar = (q4.f) obj;
                fVar.getClass();
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                float f15 = j92.b.f97899b.f97917b / 2;
                g6.f.a aVar = g6.f.f75994b;
                return c0.e(fVar, f15, new m.d(this.f146067c, null), false, 0.0f, null, null, list, Float.valueOf(1441.0f), null, null, Float.valueOf(0.0f), Float.valueOf(f14), null, false, null, 29496);
            case 1:
                q4.f fVar2 = (q4.f) obj;
                fVar2.getClass();
                h0.e.a aVar2 = (h0.e.a) p13.h0.n0((List) obj2);
                if (aVar2 == null) {
                    return i53.a.c();
                }
                List listC = w.c(new h0.e.d(aVar2, new o92.b(o92.e.CIRCLE, this.f146067c, null, 4, null), null, 4, null));
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                return m92.w.c(fVar2, listC, Float.valueOf(1441.0f), j92.b.f97901d.f97902a, null, null, Float.valueOf(0.0f), Float.valueOf(f14), 120);
            default:
                l lVar = (l) obj2;
                q4.f fVar3 = (q4.f) obj;
                fVar3.getClass();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar3.b() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar3.b() & 4294967295L));
                boolean z14 = fIntBitsToFloat > fIntBitsToFloat2;
                float f16 = z14 ? fIntBitsToFloat2 * 0.9f : fIntBitsToFloat * 0.9f;
                float f17 = 3;
                float f18 = (f16 * f17) / 4.0f;
                float f19 = z14 ? (fIntBitsToFloat2 - f18) / 2 : 0.3f * fIntBitsToFloat2;
                if (f19 < f14) {
                    float f22 = 2;
                    float f24 = fIntBitsToFloat2 - (f14 * f22);
                    float f25 = z14 ? 0.9f * f24 : 0.9f * fIntBitsToFloat;
                    float f26 = (f17 * f25) / 4.0f;
                    uVar = new u(Float.valueOf(f25), Float.valueOf(f26), Float.valueOf(q6.f.c(f24, f26, f22, f14)));
                } else {
                    uVar = new u(Float.valueOf(f16), Float.valueOf(f18), Float.valueOf(f19));
                }
                float fFloatValue = ((Number) uVar.f128605a).floatValue();
                float fFloatValue2 = ((Number) uVar.f128606b).floatValue();
                float fFloatValue3 = ((Number) uVar.f128607c).floatValue();
                float f27 = (fIntBitsToFloat - fFloatValue) / 2;
                lVar.invoke(new RectF(f27, fFloatValue3, f27 + fFloatValue, fFloatValue3 + fFloatValue2));
                q4.f.A0(fVar3, this.f146067c, 0L, 0L, 0.0f, null, null, 126);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f27)) << 32) | (((long) Float.floatToRawIntBits(fFloatValue3)) & 4294967295L);
                n4.c.a aVar3 = n4.c.f123541b;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(fFloatValue2)) & 4294967295L);
                n4.g.a aVar4 = n4.g.f123559b;
                d0.f128823b.getClass();
                long j8 = d0.f128831j;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                j92.d dVar = j92.b.f97900c;
                float fS0 = fVar3.s0(dVar.f97913e);
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fS0)) << 32) | (((long) Float.floatToRawIntBits(fS0)) & 4294967295L);
                n4.a.C2318a c2318a = n4.a.f123535b;
                q.f128930b.getClass();
                q4.f.M0(fVar3, j8, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, null, q.f128935g, 112);
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(f27)) << 32) | (((long) Float.floatToRawIntBits(fFloatValue3)) & 4294967295L);
                gl.c.f77766a.getClass();
                long j14 = gl.c.f77767b.f77769a;
                long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(fFloatValue2)) & 4294967295L);
                float fS1 = fVar3.s0(dVar.f97913e);
                q4.f.M0(fVar3, j14, jFloatToRawIntBits4, jFloatToRawIntBits5, (((long) Float.floatToRawIntBits(fS1)) << 32) | (((long) Float.floatToRawIntBits(fS1)) & 4294967295L), new k(fVar3.s0(dVar.f97910b), 0.0f, 0, 0, null, 30, null), q.f128931c, 96);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ g(long j8, List list, float f14) {
        this.f146067c = j8;
        this.f146066b = list;
        this.f146068d = f14;
    }

    public /* synthetic */ g(List list, long j8, float f14) {
        this.f146066b = list;
        this.f146067c = j8;
        this.f146068d = f14;
    }
}
