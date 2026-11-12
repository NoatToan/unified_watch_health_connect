package dj0;

import e23.p;
import h4.r;
import p005kotlin.Unit;
import p3.p0;
import si1.q;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f59898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f59899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f59900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f59901e;

    public /* synthetic */ b(r rVar, e23.a aVar, int i14, int i15) {
        this.f59897a = 2;
        this.f59898b = rVar;
        this.f59900d = aVar;
        this.f59899c = i14;
        this.f59901e = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f59897a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                d.f(this.f59899c, p0.t(this.f59901e | 1), this.f59900d, this.f59898b, mVar);
                break;
            case 1:
                mw1.a.a(this.f59899c, p0.t(this.f59901e | 1), this.f59900d, this.f59898b, mVar);
                break;
            default:
                q.b(p0.t(this.f59899c | 1), this.f59901e, this.f59900d, this.f59898b, mVar);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b(r rVar, int i14, e23.a aVar, int i15, int i16) {
        this.f59897a = i16;
        this.f59898b = rVar;
        this.f59899c = i14;
        this.f59900d = aVar;
        this.f59901e = i15;
    }
}
