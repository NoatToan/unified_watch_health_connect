package ib0;

import i3.mc;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92450a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.c f92451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mc f92452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f92453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f92454e;

    public /* synthetic */ a(i53.c cVar, mc mcVar, e23.a aVar, e23.l lVar, int i14) {
        this.f92451b = cVar;
        this.f92452c = mcVar;
        this.f92453d = aVar;
        this.f92454e = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f92450a) {
            case 0:
                ((Integer) obj2).getClass();
                b.a(p0.t(1), this.f92453d, this.f92454e, this.f92452c, this.f92451b, (p3.m) obj);
                break;
            default:
                ((Integer) obj2).getClass();
                s70.i.a(p0.t(1), this.f92453d, this.f92454e, this.f92452c, this.f92451b, (p3.m) obj);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ a(i53.c cVar, mc mcVar, e23.l lVar, e23.a aVar, int i14) {
        this.f92451b = cVar;
        this.f92452c = mcVar;
        this.f92454e = lVar;
        this.f92453d = aVar;
    }
}
