package d50;

import e23.p;
import et1.w1;
import h4.r;
import n72.o;
import o53.f0;
import p005kotlin.Unit;
import p3.p0;
import zo1.f1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f57554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f57555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f57556d;

    public /* synthetic */ n(r rVar, e23.a aVar, boolean z14, int i14) {
        this.f57553a = 2;
        this.f57554b = rVar;
        this.f57556d = aVar;
        this.f57555c = z14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f57553a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                f0.a(p0.t(1), this.f57556d, this.f57554b, mVar, this.f57555c);
                break;
            case 1:
                ds.j.e(p0.t(1), this.f57556d, this.f57554b, mVar, this.f57555c);
                break;
            case 2:
                w1.d(p0.t(1), this.f57556d, this.f57554b, mVar, this.f57555c);
                break;
            case 3:
                j21.j.c(p0.t(1), this.f57556d, this.f57554b, mVar, this.f57555c);
                break;
            case 4:
                o.a(p0.t(1), this.f57556d, this.f57554b, mVar, this.f57555c);
                break;
            case 5:
                ok0.e.b(p0.t(7), this.f57556d, this.f57554b, mVar, this.f57555c);
                break;
            default:
                f1.c(p0.t(49), this.f57556d, this.f57554b, mVar, this.f57555c);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ n(r rVar, boolean z14, e23.a aVar, int i14, int i15) {
        this.f57553a = i15;
        this.f57554b = rVar;
        this.f57555c = z14;
        this.f57556d = aVar;
    }

    public /* synthetic */ n(boolean z14, e23.a aVar, r rVar, int i14) {
        this.f57553a = 4;
        this.f57555c = z14;
        this.f57556d = aVar;
        this.f57554b = rVar;
    }
}
