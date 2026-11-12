package c2;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f22807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22808c;

    public /* synthetic */ p(h4.r rVar, int i14, int i15) {
        this.f22806a = 1;
        this.f22807b = rVar;
        this.f22808c = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        p3.m mVar = (p3.m) obj;
        Integer num = (Integer) obj2;
        switch (this.f22806a) {
            case 0:
                num.intValue();
                q.a(this.f22807b, mVar, p3.p0.t(this.f22808c | 1));
                break;
            case 1:
                num.getClass();
                p006l2.b.b(this.f22807b, mVar, p3.p0.t(1), this.f22808c);
                break;
            case 2:
                num.getClass();
                s70.s.b(this.f22807b, mVar, p3.p0.t(this.f22808c | 1));
                break;
            case 3:
                num.getClass();
                ta0.l0.d(this.f22807b, mVar, p3.p0.t(this.f22808c | 1));
                break;
            default:
                num.intValue();
                tz1.e.c(this.f22807b, mVar, p3.p0.t(this.f22808c | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ p(h4.r rVar, int i14, int i15, byte b14) {
        this.f22806a = i15;
        this.f22807b = rVar;
        this.f22808c = i14;
    }
}
