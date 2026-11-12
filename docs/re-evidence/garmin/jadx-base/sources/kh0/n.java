package kh0;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f104739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ih0.i f104740c;

    public /* synthetic */ n(double d14, ih0.i iVar, int i14, int i15) {
        this.f104738a = i15;
        this.f104739b = d14;
        this.f104740c = iVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f104738a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                s.c(this.f104739b, this.f104740c, mVar, p0.t(65));
                break;
            case 1:
                s.h(this.f104739b, this.f104740c, mVar, p0.t(65));
                break;
            default:
                s.a(this.f104739b, this.f104740c, mVar, p0.t(65));
                break;
        }
        return Unit.INSTANCE;
    }
}
