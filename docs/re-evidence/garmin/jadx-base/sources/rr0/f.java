package rr0;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154203a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f154204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f154205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Integer f154206d;

    public /* synthetic */ f(int i14, int i15, Integer num, int i16) {
        this.f154204b = i14;
        this.f154205c = i15;
        this.f154206d = num;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f154203a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                g.b(this.f154204b, this.f154205c, p0.t(1), this.f154206d, mVar);
                break;
            default:
                yu1.i.f(this.f154204b, this.f154205c, p0.t(7), this.f154206d, mVar);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ f(Integer num, int i14, int i15, int i16) {
        this.f154206d = num;
        this.f154204b = i14;
        this.f154205c = i15;
    }
}
