package f71;

import e23.l;
import java.util.List;
import m92.c0;
import m92.h0;
import m92.m;
import m92.m0;
import m92.n0;
import o4.d0;
import o4.g1;
import p005kotlin.jvm.internal.j;
import p13.w;
import p13.x;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f69433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f69434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f69435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f69436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f69437f;

    public /* synthetic */ c(float f14, long j8, List list, float f15, float f16) {
        this.f69432a = 2;
        this.f69434c = f14;
        this.f69433b = j8;
        this.f69437f = list;
        this.f69435d = f15;
        this.f69436e = f16;
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.List] */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f69432a;
        long j8 = this.f69433b;
        float f14 = this.f69434c;
        Object obj2 = this.f69437f;
        float f15 = this.f69436e;
        float f16 = this.f69435d;
        switch (i14) {
            case 0:
                q4.f fVar = (q4.f) obj;
                fVar.getClass();
                return n0.d(fVar, new m0((i53.f) obj2, (d0) null, this.f69433b, (g6.f) null, 10, (j) null), null, Float.valueOf(0.0f), Float.valueOf(f14), Float.valueOf(f16), Float.valueOf(f15), null, 194);
            case 1:
                Float f17 = (Float) obj2;
                q4.f fVar2 = (q4.f) obj;
                fVar2.getClass();
                if (f17 == null) {
                    return i53.a.c();
                }
                float fFloatValue = f17.floatValue();
                g6.f.a aVar = g6.f.f75994b;
                m.d dVar = new m.d(j8, null);
                List listK = x.k(new h0.e.a(0.0f, fFloatValue), new h0.e.a(1.0f, fFloatValue));
                Float fValueOf = Float.valueOf(0.0f);
                Float fValueOf2 = Float.valueOf(f14);
                float[] fArr = {f16, f16};
                g1.f128855a.getClass();
                return c0.e(fVar2, 1, dVar, false, 0.0f, null, null, listK, null, null, null, fValueOf, fValueOf2, null, false, g1.a.a(f15, fArr), 13240);
            case 2:
                q4.f fVar3 = (q4.f) obj;
                fVar3.getClass();
                return c0.e(fVar3, this.f69434c, new m.d(j8, null), false, 0.0f, null, null, this.f69437f, Float.valueOf(7.0f), null, null, Float.valueOf(f16), Float.valueOf(f15), null, false, null, 29496);
            default:
                q4.f fVar4 = (q4.f) obj;
                fVar4.getClass();
                List listC = w.c(new h0.e.d((h0.e.a) obj2, new o92.b(o92.e.CIRCLE, this.f69433b, null, 4, null), null, 4, null));
                Float fValueOf3 = Float.valueOf(7.0f);
                float f18 = f14 * 2;
                g6.f.a aVar2 = g6.f.f75994b;
                return m92.w.c(fVar4, listC, fValueOf3, f18, null, null, Float.valueOf(f16), Float.valueOf(f15), 120);
        }
    }

    public /* synthetic */ c(Object obj, long j8, float f14, float f15, float f16, int i14) {
        this.f69432a = i14;
        this.f69437f = obj;
        this.f69433b = j8;
        this.f69434c = f14;
        this.f69435d = f15;
        this.f69436e = f16;
    }
}
