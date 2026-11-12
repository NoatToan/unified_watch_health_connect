package f21;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68552a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f68553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f68554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Float f68555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f68556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f68557f;

    public /* synthetic */ i0(float f14, long j8, i53.c cVar, Float f15, i53.f fVar) {
        this.f68554c = f14;
        this.f68553b = j8;
        this.f68556e = cVar;
        this.f68555d = f15;
        this.f68557f = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        float f14;
        switch (this.f68552a) {
            case 0:
                i53.f fVar = (i53.f) this.f68557f;
                Float f15 = (Float) this.f68556e;
                q4.f fVar2 = (q4.f) obj;
                fVar2.getClass();
                float f16 = this.f68554c;
                if (((int) f16) == 7) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f14 = j92.b.f97899b.f97917b;
                } else {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f14 = j92.b.f97899b.f97916a;
                }
                float f17 = f14;
                float f18 = l0.f68589a;
                long j8 = this.f68553b;
                return m92.c0.e(fVar2, f18, new m92.m.d(j8, null), true, f17, null, o4.d0.a(j8), fVar, Float.valueOf(f16), null, null, this.f68555d, f15, m92.e0.LINEAR, false, null, 25360);
            case 1:
                ArrayList arrayList = (ArrayList) this.f68557f;
                Float f19 = (Float) this.f68556e;
                q4.f fVar3 = (q4.f) obj;
                fVar3.getClass();
                return m92.n0.d(fVar3, new m92.m0(i53.a.e(arrayList), (o4.d0) null, this.f68553b, (g6.f) null, 10, (p005kotlin.jvm.internal.j) null), null, Float.valueOf(0.0f), Float.valueOf(this.f68554c), this.f68555d, f19, null, 194);
            default:
                i53.c cVar = (i53.c) this.f68556e;
                i53.f fVar4 = (i53.f) this.f68557f;
                q4.f fVar5 = (q4.f) obj;
                fVar5.getClass();
                o13.p pVar = (o13.p) p13.h0.d0(fVar4);
                Float f22 = pVar != null ? (Float) pVar.f128594a : null;
                o13.p pVar2 = (o13.p) p13.h0.n0(fVar4);
                return m92.d.c(fVar5, this.f68554c, this.f68553b, cVar, this.f68555d, f22, pVar2 != null ? (Float) pVar2.f128594a : null);
        }
    }

    public /* synthetic */ i0(float f14, long j8, i53.f fVar, Float f15, Float f16) {
        this.f68554c = f14;
        this.f68553b = j8;
        this.f68557f = fVar;
        this.f68555d = f15;
        this.f68556e = f16;
    }

    public /* synthetic */ i0(ArrayList arrayList, long j8, float f14, Float f15, Float f16) {
        this.f68557f = arrayList;
        this.f68553b = j8;
        this.f68554c = f14;
        this.f68555d = f15;
        this.f68556e = f16;
    }
}
