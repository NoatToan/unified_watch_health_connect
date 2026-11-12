package y41;

import e23.l;
import java.util.ArrayList;
import java.util.Iterator;
import m92.c0;
import m92.e0;
import m92.h0;
import m92.m;
import m92.m0;
import m92.n0;
import o4.d0;
import o4.g1;
import p005kotlin.jvm.internal.j;
import p13.y;
import q4.f;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f194479a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f194480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o51.b f194481c;

    public /* synthetic */ d(long j8, o51.b bVar) {
        this.f194480b = j8;
        this.f194481c = bVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f194479a;
        Float fValueOf = null;
        o51.b bVar = this.f194481c;
        switch (i14) {
            case 0:
                f fVar = (f) obj;
                fVar.getClass();
                m0 m0Var = new m0(bVar.f129210c, (d0) null, this.f194480b, (g6.f) null, 10, (j) null);
                Float fValueOf2 = Float.valueOf(0.0f);
                Iterator<h0.e.a> it = bVar.f129210c.iterator();
                if (it.hasNext()) {
                    float fMax = it.next().f117346a;
                    while (it.hasNext()) {
                        fMax = Math.max(fMax, it.next().f117346a);
                    }
                    fValueOf = Float.valueOf(fMax);
                }
                return n0.d(fVar, m0Var, null, fValueOf2, Float.valueOf(fValueOf != null ? fValueOf.floatValue() : 1.0f), bVar.f129217j, bVar.f129216i, null, 194);
            default:
                f fVar2 = (f) obj;
                fVar2.getClass();
                float f14 = 2;
                g6.f.a aVar = g6.f.f75994b;
                m.d dVar = new m.d(this.f194480b, null);
                i53.c<h0.e.a> cVar = bVar.f129208a;
                ArrayList arrayList = new ArrayList(y.r(cVar, 10));
                Iterator<h0.e.a> it3 = cVar.iterator();
                while (it3.hasNext()) {
                    arrayList.add(new h0.e.a(it3.next().f117346a, bVar.f129215h));
                }
                return c0.e(fVar2, f14, dVar, false, 0.0f, null, null, arrayList, null, null, null, Float.valueOf(bVar.f129214g), Float.valueOf(bVar.f129213f), e0.LINEAR, false, g1.a.b(g1.f128855a, new float[]{20.0f, 10.0f}), 9148);
        }
    }

    public /* synthetic */ d(o51.b bVar, long j8) {
        this.f194481c = bVar;
        this.f194480b = j8;
    }
}
