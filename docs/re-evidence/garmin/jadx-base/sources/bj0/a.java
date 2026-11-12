package bj0;

import e23.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m92.c0;
import m92.h0;
import m92.m;
import m92.w;
import o13.p;
import p13.j0;
import p13.y;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18325a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.c f18326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f18327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gj0.f f18328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f18329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f18330f;

    public /* synthetic */ a(long j8, i53.c cVar, p pVar, gj0.f fVar, float f14) {
        this.f18330f = j8;
        this.f18326b = cVar;
        this.f18327c = pVar;
        this.f18328d = fVar;
        this.f18329e = f14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        q4.f fVar = (q4.f) obj;
        switch (this.f18325a) {
            case 0:
                fVar.getClass();
                m.d dVar = new m.d(this.f18330f, null);
                List list = this.f18326b;
                if (list.size() == 1) {
                    list = j0.f134944a;
                }
                List list2 = list;
                p pVar = this.f18327c;
                float fFloatValue = ((Number) pVar.f128594a).floatValue();
                float fFloatValue2 = ((Number) pVar.f128595b).floatValue();
                gj0.f fVar2 = this.f18328d;
                return c0.e(fVar, this.f18329e, dVar, false, 0.0f, null, null, list2, fVar2 != null ? fVar2.f77516e : null, null, null, Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2), null, false, null, 21308);
            default:
                fVar.getClass();
                i53.c cVar = this.f18326b;
                ArrayList arrayList = new ArrayList(y.r(cVar, 10));
                Iterator<E> it = cVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(new h0.e.d((h0.e.a) it.next(), new o92.b(o92.e.CIRCLE, this.f18330f, null, 4, null), null, 4, null));
                }
                p pVar2 = this.f18327c;
                float fFloatValue3 = ((Number) pVar2.f128594a).floatValue();
                float fFloatValue4 = ((Number) pVar2.f128595b).floatValue();
                gj0.f fVar3 = this.f18328d;
                return w.c(fVar, arrayList, fVar3 != null ? fVar3.f77516e : null, this.f18329e, null, null, Float.valueOf(fFloatValue3), Float.valueOf(fFloatValue4), 120);
        }
    }

    public /* synthetic */ a(i53.c cVar, p pVar, gj0.f fVar, float f14, long j8) {
        this.f18326b = cVar;
        this.f18327c = pVar;
        this.f18328d = fVar;
        this.f18329e = f14;
        this.f18330f = j8;
    }
}
