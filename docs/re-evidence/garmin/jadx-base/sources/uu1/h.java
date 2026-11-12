package uu1;

import e23.p;
import fg0.k;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f172853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f172854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xv1.a f172855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f172856d;

    public /* synthetic */ h(k kVar, xv1.a aVar, int i14, int i15) {
        this.f172853a = i15;
        this.f172854b = kVar;
        this.f172855c = aVar;
        this.f172856d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f172853a;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                j.d(this.f172854b, this.f172855c, mVar, p0.t(this.f172856d | 1));
                break;
            case 1:
                j.e(this.f172854b, this.f172855c, mVar, p0.t(this.f172856d | 1));
                break;
            default:
                j.c(this.f172854b, this.f172855c, mVar, p0.t(this.f172856d | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
