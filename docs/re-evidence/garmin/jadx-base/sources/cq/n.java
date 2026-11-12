package cq;

import et1.w0;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55073a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f55074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f55075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f55076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f55077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f55078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f55079g;

    public /* synthetic */ n(long j8, yo1.d dVar, boolean z14, int i14, e23.l lVar, int i15) {
        this.f55074b = j8;
        this.f55078f = dVar;
        this.f55075c = z14;
        this.f55076d = i14;
        this.f55079g = lVar;
        this.f55077e = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f55073a) {
            case 0:
                ((Integer) obj2).getClass();
                u.g(this.f55074b, (yo1.d) this.f55078f, this.f55075c, this.f55076d, (e23.l) this.f55079g, (p3.m) obj, p0.t(this.f55077e | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                w0.a((h4.r) this.f55078f, (jf.d) this.f55079g, this.f55074b, this.f55075c, (p3.m) obj, p0.t(this.f55076d | 1), this.f55077e);
                break;
            default:
                ((Integer) obj2).getClass();
                m72.f.b(p0.t(this.f55076d | 1), this.f55077e, this.f55074b, (String) this.f55078f, (String) this.f55079g, (p3.m) obj, this.f55075c);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ n(long j8, boolean z14, String str, String str2, int i14, int i15) {
        this.f55074b = j8;
        this.f55075c = z14;
        this.f55078f = str;
        this.f55079g = str2;
        this.f55076d = i14;
        this.f55077e = i15;
    }

    public /* synthetic */ n(h4.r rVar, jf.d dVar, long j8, boolean z14, int i14, int i15) {
        this.f55078f = rVar;
        this.f55079g = dVar;
        this.f55074b = j8;
        this.f55075c = z14;
        this.f55076d = i14;
        this.f55077e = i15;
    }
}
