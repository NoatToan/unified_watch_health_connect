package cq;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class q implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55087a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f55088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f55089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f55090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f55091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f55092f;

    public /* synthetic */ q(long j8, yo1.d dVar, e23.l lVar, int i14, int i15) {
        this.f55088b = j8;
        this.f55091e = dVar;
        this.f55092f = lVar;
        this.f55089c = i14;
        this.f55090d = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f55087a) {
            case 0:
                ((Integer) obj2).getClass();
                u.h(this.f55088b, (yo1.d) this.f55091e, (e23.l) this.f55092f, this.f55089c, (p3.m) obj, p0.t(this.f55090d | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                p006l2.b.a((z2.p) this.f55091e, (h4.r) this.f55092f, this.f55088b, (p3.m) obj, p0.t(this.f55089c | 1), this.f55090d);
                break;
            default:
                ((Integer) obj2).getClass();
                sg2.f.a((h4.r) this.f55091e, this.f55088b, (z3.e) this.f55092f, (p3.m) obj, p0.t(this.f55089c | 1), this.f55090d);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ q(h4.r rVar, long j8, z3.e eVar, int i14, int i15) {
        this.f55091e = rVar;
        this.f55088b = j8;
        this.f55092f = eVar;
        this.f55089c = i14;
        this.f55090d = i15;
    }

    public /* synthetic */ q(z2.p pVar, h4.r rVar, long j8, int i14, int i15) {
        this.f55091e = pVar;
        this.f55092f = rVar;
        this.f55088b = j8;
        this.f55089c = i14;
        this.f55090d = i15;
    }
}
