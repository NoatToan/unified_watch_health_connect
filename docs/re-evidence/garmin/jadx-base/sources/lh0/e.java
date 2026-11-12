package lh0;

import p005kotlin.Unit;
import p3.p0;
import w51.o0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Double f112403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Double f112404c;

    public /* synthetic */ e(int i14, int i15, Double d14, Double d15) {
        this.f112402a = i15;
        this.f112403b = d14;
        this.f112404c = d15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f112402a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                f.a(this.f112403b, this.f112404c, mVar, p0.t(1));
                break;
            case 1:
                h.a(this.f112403b, this.f112404c, mVar, p0.t(1));
                break;
            default:
                o0.e(this.f112403b, this.f112404c, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
