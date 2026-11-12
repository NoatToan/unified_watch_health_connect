package c81;

import g81.g0;
import java.util.ArrayList;
import java.util.List;
import m92.c0;
import m92.e0;
import m92.h0;
import m92.m0;
import m92.n0;
import o4.d0;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f25670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f25671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f25672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f25673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f25674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f25675g;

    public /* synthetic */ a(float f14, long j8, List list, float f15, float f16, float f17) {
        this.f25669a = 4;
        this.f25672d = f14;
        this.f25671c = j8;
        this.f25670b = list;
        this.f25673e = f15;
        this.f25674f = f16;
        this.f25675g = f17;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f25669a;
        long j8 = this.f25671c;
        float f14 = this.f25672d;
        List list = this.f25670b;
        float f15 = this.f25675g;
        float f16 = this.f25674f;
        float f17 = this.f25673e;
        switch (i14) {
            case 0:
                i53.c<g0> cVar = (i53.c) list;
                q4.f fVar = (q4.f) obj;
                fVar.getClass();
                float f18 = 3;
                g6.f.a aVar = g6.f.f75994b;
                m92.m.d dVar = new m92.m.d(j8, null);
                ArrayList arrayList = new ArrayList(y.r(cVar, 10));
                for (g0 g0Var : cVar) {
                    arrayList.add(new h0.e.a(g0Var.f76332a, g0Var.f76333b));
                }
                return c0.e(fVar, f18, dVar, false, 0.0f, null, null, arrayList, null, Float.valueOf(f14), Float.valueOf(f17), Float.valueOf(f16), Float.valueOf(f15), e0.LINEAR, false, null, 24760);
            case 1:
                i53.c<g81.h0> cVar2 = (i53.c) list;
                q4.f fVar2 = (q4.f) obj;
                fVar2.getClass();
                ArrayList arrayList2 = new ArrayList(y.r(cVar2, 10));
                for (g81.h0 h0Var : cVar2) {
                    arrayList2.add(new h0.d.b(h0Var.f76334a, h0Var.f76335b, h0Var.f76336c));
                }
                return n0.d(fVar2, new m0(i53.a.e(arrayList2), (d0) null, this.f25671c, (g6.f) null, 10, (p005kotlin.jvm.internal.j) null), null, Float.valueOf(f14), Float.valueOf(f17), Float.valueOf(f16), Float.valueOf(f15), e0.LINEAR, 130);
            case 2:
                q4.f fVar3 = (q4.f) obj;
                fVar3.getClass();
                return n0.d(fVar3, new m0((i53.c) list, (d0) null, this.f25671c, (g6.f) null, 10, (p005kotlin.jvm.internal.j) null), null, Float.valueOf(f14), Float.valueOf(f17), Float.valueOf(f16), Float.valueOf(f15), null, 66);
            case 3:
                q4.f fVar4 = (q4.f) obj;
                fVar4.getClass();
                m92.m.d dVar2 = new m92.m.d(j8, null);
                float f19 = 4;
                g6.f.a aVar2 = g6.f.f75994b;
                return c0.e(fVar4, 1, dVar2, true, f19, null, d0.a(j8), (i53.c) list, null, Float.valueOf(f14), Float.valueOf(f17), Float.valueOf(f16), Float.valueOf(f15), null, true, null, 20624);
            default:
                q4.f fVar5 = (q4.f) obj;
                fVar5.getClass();
                return c0.e(fVar5, this.f25672d, new m92.m.d(j8, null), false, 0.0f, null, null, this.f25670b, null, Float.valueOf(0.0f), Float.valueOf(f17), Float.valueOf(f16), Float.valueOf(f15), null, false, null, 28860);
        }
    }

    public /* synthetic */ a(long j8, i53.c cVar, float f14, float f15, float f16, float f17, int i14) {
        this.f25669a = i14;
        this.f25671c = j8;
        this.f25670b = cVar;
        this.f25672d = f14;
        this.f25673e = f15;
        this.f25674f = f16;
        this.f25675g = f17;
    }

    public /* synthetic */ a(i53.c cVar, long j8, float f14, float f15, float f16, float f17, int i14) {
        this.f25669a = i14;
        this.f25670b = cVar;
        this.f25671c = j8;
        this.f25672d = f14;
        this.f25673e = f15;
        this.f25674f = f16;
        this.f25675g = f17;
    }
}
