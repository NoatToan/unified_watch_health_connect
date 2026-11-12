package ht1;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pt1.g f85548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f85549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f85550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f85551e;

    public /* synthetic */ e(pt1.g gVar, boolean z14, e23.a aVar, e23.l lVar, int i14, int i15) {
        this.f85547a = i15;
        this.f85548b = gVar;
        this.f85549c = z14;
        this.f85550d = aVar;
        this.f85551e = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f85547a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                f.a(this.f85548b, this.f85549c, this.f85550d, this.f85551e, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(1);
                k.a(this.f85548b, this.f85549c, this.f85550d, this.f85551e, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
