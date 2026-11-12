package mx;

import e23.l;
import java.util.List;
import m92.h0;
import p005kotlin.Unit;
import p13.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121315a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f121316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f121317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f121318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f121319e;

    public /* synthetic */ e(List list, List list2, long j8, long j14) {
        this.f121318d = list;
        this.f121319e = list2;
        this.f121316b = j8;
        this.f121317c = j14;
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // e23.l
    public final Object invoke(Object obj) {
        h0.e.a aVar;
        switch (this.f121315a) {
            case 0:
                q4.f fVar = (q4.f) obj;
                fVar.getClass();
                h0.e.a aVar2 = (h0.e.a) p13.h0.n0(this.f121318d);
                h0.e.a aVar3 = (h0.e.a) p13.h0.n0(this.f121319e);
                if (aVar2 != null) {
                    aVar = aVar2;
                } else {
                    if (aVar3 == null) {
                        aVar3 = null;
                    }
                    aVar = aVar3;
                }
                if (aVar == null) {
                    return i53.a.c();
                }
                List listC = w.c(new h0.e.d(aVar, new o92.b(o92.e.CIRCLE, aVar2 != null ? this.f121316b : this.f121317c, null, 4, null), null, 4, null));
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                return m92.w.c(fVar, listC, Float.valueOf(481.0f), j92.b.f97901d.f97902a, null, null, Float.valueOf(0.0f), Float.valueOf(100.0f), 120);
            default:
                o4.w wVar = (o4.w) this.f121318d;
                q4.g gVar = (q4.g) this.f121319e;
                q4.c cVar = (q4.c) obj;
                cVar.m1();
                q4.f.C0(cVar, wVar, this.f121316b, this.f121317c, 0.0f, gVar, 0, 104);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e(o4.w wVar, long j8, long j14, q4.g gVar) {
        this.f121318d = wVar;
        this.f121316b = j8;
        this.f121317c = j14;
        this.f121319e = gVar;
    }
}
