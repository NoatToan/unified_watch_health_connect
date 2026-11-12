package i3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i8 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f88412a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f88413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f88414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f88415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f88416e;

    public /* synthetic */ i8(long j8, e23.a aVar, boolean z14, boolean z15, int i14) {
        this.f88413b = j8;
        this.f88416e = aVar;
        this.f88414c = z14;
        this.f88415d = z15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f88412a) {
            case 0:
                ((Integer) obj2).getClass();
                e9.c(p3.p0.t(1), this.f88413b, this.f88416e, (p3.m) obj, this.f88414c, this.f88415d);
                break;
            default:
                ((Integer) obj2).getClass();
                ri1.i.a(p3.p0.t(1), this.f88413b, this.f88416e, (p3.m) obj, this.f88414c, this.f88415d);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ i8(long j8, boolean z14, boolean z15, e23.a aVar, int i14) {
        this.f88413b = j8;
        this.f88414c = z14;
        this.f88415d = z15;
        this.f88416e = aVar;
    }
}
