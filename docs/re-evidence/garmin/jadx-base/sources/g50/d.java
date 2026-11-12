package g50;

import e23.p;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i50.g f75890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f75891c;

    public /* synthetic */ d(i50.g gVar, e23.l lVar, int i14, int i15) {
        this.f75889a = i15;
        this.f75890b = gVar;
        this.f75891c = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f75889a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                e.a(this.f75890b, this.f75891c, mVar, p0.t(1));
                break;
            default:
                h50.i.a(this.f75890b, this.f75891c, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
