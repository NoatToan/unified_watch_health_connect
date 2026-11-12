package rr0;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class x implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Integer f154248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Integer f154249c;

    public /* synthetic */ x(Integer num, Integer num2, int i14, int i15) {
        this.f154247a = i15;
        this.f154248b = num;
        this.f154249c = num2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f154247a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                y.c(this.f154248b, this.f154249c, mVar, p0.t(1));
                break;
            default:
                tz1.g.d(this.f154248b, this.f154249c, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
