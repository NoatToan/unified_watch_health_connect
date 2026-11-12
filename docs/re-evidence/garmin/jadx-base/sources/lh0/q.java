package lh0;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class q implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f112441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f112442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f112443d;

    public /* synthetic */ q(r rVar, String str, int i14, int i15) {
        this.f112440a = i15;
        this.f112441b = rVar;
        this.f112442c = str;
        this.f112443d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f112440a;
        int i15 = this.f112443d;
        String str = this.f112442c;
        r rVar = this.f112441b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        r rVar2 = r.f112444a;
        switch (i14) {
            case 0:
                rVar.j(str, mVar, p0.t(i15 | 1));
                break;
            case 1:
                rVar.c(str, mVar, p0.t(i15 | 1));
                break;
            case 2:
                rVar.l(str, mVar, p0.t(i15 | 1));
                break;
            default:
                rVar.h(str, mVar, p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
