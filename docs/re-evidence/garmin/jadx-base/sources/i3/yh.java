package i3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yh implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f90497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f90498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h4.r f90499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ph f90500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f90501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f90502f;

    public /* synthetic */ yh(h4.r rVar, p pVar, ph phVar, boolean z14, int i14) {
        this.f90497a = 2;
        this.f90499c = rVar;
        this.f90498b = pVar;
        this.f90500d = phVar;
        this.f90501e = z14;
        this.f90502f = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f90497a) {
            case 0:
                ((Integer) obj2).getClass();
                bi.r(p3.p0.t(this.f90502f | 1), this.f90499c, this.f90498b, this.f90500d, (p3.m) obj, this.f90501e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                bi.h(p3.p0.t(this.f90502f | 1), this.f90499c, this.f90498b, this.f90500d, (p3.m) obj, this.f90501e);
                break;
            default:
                ((Integer) obj2).getClass();
                bi.c(p3.p0.t(this.f90502f | 1), this.f90499c, this.f90498b, this.f90500d, (p3.m) obj, this.f90501e);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ yh(p pVar, h4.r rVar, ph phVar, boolean z14, int i14, int i15) {
        this.f90497a = i15;
        this.f90498b = pVar;
        this.f90499c = rVar;
        this.f90500d = phVar;
        this.f90501e = z14;
        this.f90502f = i14;
    }
}
