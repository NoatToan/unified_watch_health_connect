package xg0;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class t implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f190849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f190850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wg0.a f190851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f190852e;

    public /* synthetic */ t(int i14, int i15, e23.a aVar, wg0.a aVar2, o oVar, boolean z14) {
        this.f190848a = i15;
        this.f190849b = z14;
        this.f190850c = aVar;
        this.f190851d = aVar2;
        this.f190852e = oVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f190848a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                u.a(this.f190849b, this.f190850c, this.f190851d, this.f190852e, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(1);
                g0.a(this.f190849b, this.f190850c, this.f190851d, this.f190852e, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
