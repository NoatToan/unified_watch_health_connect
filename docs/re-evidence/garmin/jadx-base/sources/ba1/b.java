package ba1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.g3;
import e23.l;
import fw.p;
import g6.o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import o4.d0;
import o4.e0;
import o4.w;
import p005kotlin.Unit;
import p13.h0;
import p13.x;
import r53.z1;
import sz0.u;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f16970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f16971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16972d;

    public /* synthetic */ b(d dVar, boolean z14, long j8) {
        this.f16969a = 0;
        this.f16972d = dVar;
        this.f16970b = z14;
        this.f16971c = j8;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // e23.l
    public final Object invoke(Object obj) {
        List<n91.a> value;
        ArrayList arrayList;
        View view2;
        float fIntBitsToFloat;
        float f14;
        int i14 = this.f16969a;
        boolean z14 = this.f16970b;
        Object obj2 = this.f16972d;
        long j8 = this.f16971c;
        switch (i14) {
            case 0:
                d dVar = (d) obj2;
                n91.a aVar = (n91.a) obj;
                z1<List<n91.a>> z1Var = dVar.f16989o;
                r91.c cVar = dVar.f16994v;
                do {
                    value = z1Var.getValue();
                    arrayList = new ArrayList();
                    for (Object obj3 : value) {
                        Long l14 = ((n91.a) obj3).getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                        if (l14 == null || l14.longValue() != j8) {
                            arrayList.add(obj3);
                        }
                    }
                    if (aVar != null) {
                        arrayList = h0.D0(arrayList, aVar);
                    }
                } while (!z1Var.b(value, arrayList));
                dVar.L4();
                dVar.D = true;
                if (z14) {
                    i53.c<aa1.d> cVar2 = ((aa1.a) cVar.f151374e.f150540a.getValue()).f2228k;
                    ArrayList arrayList2 = new ArrayList();
                    for (aa1.d dVar2 : cVar2) {
                        Long l15 = dVar2.f2256h;
                        if (l15 == null || l15.longValue() != j8) {
                            arrayList2.add(dVar2);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(arrayList2);
                    if (aVar != null) {
                        z91.a aVar2 = z91.a.f203130a;
                        Context context = dVar.f16975a;
                        com.garmin.android.apps.connectmobile.repcounting.model.f fVar = dVar.f16987m;
                        aVar2.getClass();
                        arrayList3.add(z91.a.k(aVar, context, fVar));
                    }
                    aa1.a aVarB = aa1.a.b((aa1.a) cVar.f151374e.f150540a.getValue(), false, false, null, null, null, null, null, null, null, i53.a.e(h0.N0(arrayList3, new d.b())), null, 3071);
                    z1<aa1.a> z1Var2 = cVar.f151373d;
                    while (!z1Var2.b(z1Var2.getValue(), aVarB)) {
                    }
                }
                return Unit.INSTANCE;
            case 1:
                u uVar = (u) obj2;
                LinkedHashMap linkedHashMap = uVar.f161514y;
                int i15 = u.E;
                p pVar = ((g3) obj).f35300a;
                if (pVar == p.SUCCESS && z14) {
                    Runnable runnable = (Runnable) linkedHashMap.get(Long.valueOf(j8));
                    if (runnable != null && (view2 = uVar.getView()) != null) {
                        view2.removeCallbacks(runnable);
                    }
                    com.google.android.exoplayer2.audio.d dVar3 = new com.google.android.exoplayer2.audio.d(uVar, j8, 5);
                    linkedHashMap.put(Long.valueOf(j8), dVar3);
                    View view3 = uVar.getView();
                    if (view3 != null) {
                        view3.postDelayed(dVar3, 5000L);
                    }
                } else if (pVar == p.ERROR) {
                    g22.e.c(uVar);
                }
                return Unit.INSTANCE;
            case 2:
                o oVar = (o) obj2;
                l4.f fVar2 = (l4.f) obj;
                fVar2.getClass();
                w.a aVar3 = w.f129023a;
                d0 d0VarA = d0.a(j8);
                d0.f128823b.getClass();
                List listK = x.k(d0VarA, d0.a(d0.f128831j));
                o oVar2 = o.Ltr;
                float fIntBitsToFloat2 = oVar == oVar2 ? 0.0f : Float.intBitsToFloat((int) (fVar2.f109845a.b() >> 32));
                l4.a aVar4 = fVar2.f109845a;
                if (oVar == oVar2) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (aVar4.b() >> 32));
                    f14 = 0.3f;
                } else {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (aVar4.b() >> 32));
                    f14 = 0.7f;
                }
                return fVar2.e(new vb1.c(z14, w.a.b(aVar3, listK, fIntBitsToFloat2, fIntBitsToFloat * f14, 8), 1));
            default:
                l4.f fVar3 = (l4.f) obj;
                return fVar3.e(new dt1.d((e23.a) obj2, this.f16970b, z2.c.d(fVar3, Float.intBitsToFloat((int) (fVar3.f109845a.b() >> 32)) / 2.0f), e0.a.a(e0.f128843b, j8), 10));
        }
    }

    public /* synthetic */ b(long j8, Object obj, boolean z14, int i14) {
        this.f16969a = i14;
        this.f16971c = j8;
        this.f16972d = obj;
        this.f16970b = z14;
    }

    public /* synthetic */ b(boolean z14, u uVar, long j8) {
        this.f16969a = 1;
        this.f16970b = z14;
        this.f16972d = uVar;
        this.f16971c = j8;
    }
}
