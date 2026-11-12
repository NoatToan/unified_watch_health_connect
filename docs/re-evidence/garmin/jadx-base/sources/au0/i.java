package au0;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f12933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f12934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f12935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f12937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.l f12938g;

    public /* synthetic */ i(boolean z14, boolean z15, boolean z16, int i14, boolean z17, e23.l lVar, int i15, int i16) {
        this.f12932a = i16;
        this.f12933b = z14;
        this.f12934c = z15;
        this.f12935d = z16;
        this.f12936e = i14;
        this.f12937f = z17;
        this.f12938g = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12932a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                p.c(this.f12933b, this.f12934c, this.f12935d, this.f12936e, this.f12937f, this.f12938g, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(1);
                wg2.d.c(this.f12933b, this.f12934c, this.f12935d, this.f12936e, this.f12937f, this.f12938g, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
