package c;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22311a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f22314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f22315e;

    public /* synthetic */ f(int i14, int i15, e23.a aVar, boolean z14) {
        this.f22314d = z14;
        this.f22315e = aVar;
        this.f22312b = i14;
        this.f22313c = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f22311a) {
            case 0:
                ((Integer) obj2).getClass();
                w.a(p0.t(this.f22312b | 1), this.f22313c, this.f22315e, (p3.m) obj, this.f22314d);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                lm0.p.d(this.f22312b, this.f22313c, iT, this.f22315e, (p3.m) obj, this.f22314d);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ f(int i14, int i15, boolean z14, e23.a aVar, int i16) {
        this.f22312b = i14;
        this.f22313c = i15;
        this.f22314d = z14;
        this.f22315e = aVar;
    }
}
