package ew0;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f66211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f66212c;

    public /* synthetic */ e0(int i14, int i15, e23.l lVar, e23.a aVar) {
        this.f66210a = i15;
        this.f66211b = aVar;
        this.f66212c = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f66210a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                f0.a(this.f66211b, this.f66212c, mVar, p0.t(1));
                break;
            case 1:
                n51.a.a(this.f66211b, this.f66212c, mVar, p0.t(1));
                break;
            case 2:
                n51.a.a(this.f66211b, this.f66212c, mVar, p0.t(1));
                break;
            default:
                ro0.o.a(this.f66211b, this.f66212c, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
