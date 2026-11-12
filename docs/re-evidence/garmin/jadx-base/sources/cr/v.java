package cr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m92.h0;
import m92.m0;
import m92.n0;
import o4.g1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class v implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f55296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f55297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f55298d;

    public /* synthetic */ v(int i14, float f14, float f15, Object obj) {
        this.f55295a = i14;
        this.f55296b = obj;
        this.f55297c = f14;
        this.f55298d = f15;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f55295a;
        float f14 = this.f55298d;
        float f15 = this.f55297c;
        Object obj2 = this.f55296b;
        switch (i14) {
            case 0:
                ep.e eVar = (ep.e) obj2;
                q4.f fVar = (q4.f) obj;
                fVar.getClass();
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                float f16 = j92.b.f97899b.f97916a;
                m92.m.d dVar = new m92.m.d(eVar.f64814c, null);
                i53.c<h0.e.a> cVar = eVar.f64812a;
                Float fValueOf = Float.valueOf(0.0f);
                return m92.c0.e(fVar, f16, dVar, true, 0.0f, null, null, cVar, null, fValueOf, Float.valueOf(f15), fValueOf, Float.valueOf(f14), null, false, null, 28856);
            case 1:
                ep.e eVar2 = (ep.e) obj2;
                q4.f fVar2 = (q4.f) obj;
                Float fValueOf2 = Float.valueOf(0.0f);
                fVar2.getClass();
                i53.c<ep.b> cVar2 = eVar2.f64813b;
                ArrayList arrayList = new ArrayList(p13.y.r(cVar2, 10));
                Iterator<ep.b> it = cVar2.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().f64801a);
                }
                return n0.d(fVar2, new m0(i53.a.j(arrayList), (o4.d0) null, new m92.m.d(o4.d0.c(0.5f, eVar2.f64815d, 14), null), (g6.f) null, (p005kotlin.jvm.internal.j) null), null, fValueOf2, Float.valueOf(f15), fValueOf2, Float.valueOf(f14), null, 194);
            case 2:
                ep.e eVar3 = (ep.e) obj2;
                q4.f fVar3 = (q4.f) obj;
                fVar3.getClass();
                m0 m0Var = new m0(eVar3.f64812a, (o4.d0) null, new m92.m.d(o4.d0.c(0.5f, eVar3.f64814c, 14), null), (g6.f) null, (p005kotlin.jvm.internal.j) null);
                Float fValueOf3 = Float.valueOf(0.0f);
                return n0.d(fVar3, m0Var, null, fValueOf3, Float.valueOf(f15), fValueOf3, Float.valueOf(f14), null, 194);
            default:
                d70.k kVar = (d70.k) obj2;
                q4.f fVar4 = (q4.f) obj;
                fVar4.getClass();
                Float f17 = kVar.f58120g;
                if (f17 == null || kVar.f58119f.isEmpty()) {
                    return i53.a.c();
                }
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                float f18 = j92.b.f97899b.f97916a;
                m92.m.d dVar2 = new m92.m.d(kVar.f58121h, null);
                List listK = p13.x.k(new h0.e.a(0.0f, f17.floatValue()), new h0.e.a(1.0f, f17.floatValue()));
                Float fValueOf4 = Float.valueOf(0.0f);
                Float fValueOf5 = Float.valueOf(100.0f);
                float[] fArr = {f15, f15};
                g1.f128855a.getClass();
                return m92.c0.e(fVar4, f18, dVar2, false, 0.0f, null, null, listK, null, null, null, fValueOf4, fValueOf5, null, false, g1.a.a(f14, fArr), 13240);
        }
    }
}
