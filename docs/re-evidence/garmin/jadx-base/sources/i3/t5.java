package i3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t5 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89755a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f89756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f89757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f89758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f89759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f89760f;

    public /* synthetic */ t5(h4.r rVar, float f14, long j8, int i14, int i15) {
        this.f89756b = rVar;
        this.f89758d = f14;
        this.f89757c = j8;
        this.f89759e = i14;
        this.f89760f = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f89755a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p3.p0.t(this.f89759e | 1);
                v5.a(this.f89758d, iT, this.f89760f, this.f89757c, this.f89756b, (p3.m) obj);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p3.p0.t(this.f89759e | 1);
                zd0.e.c(this.f89758d, iT2, this.f89760f, this.f89757c, this.f89756b, (p3.m) obj);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ t5(h4.r rVar, long j8, float f14, int i14, int i15) {
        this.f89756b = rVar;
        this.f89757c = j8;
        this.f89758d = f14;
        this.f89759e = i14;
        this.f89760f = i15;
    }
}
