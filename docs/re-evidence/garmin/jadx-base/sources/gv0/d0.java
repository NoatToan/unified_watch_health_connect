package gv0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f79249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f79250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f79251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f79252e;

    public /* synthetic */ d0(String str, boolean z14, e23.a aVar, int i14, int i15) {
        this.f79248a = i15;
        this.f79249b = str;
        this.f79250c = z14;
        this.f79251d = aVar;
        this.f79252e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f79248a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                j0.a(p3.p0.t(this.f79252e | 1), this.f79251d, this.f79249b, mVar, this.f79250c);
                break;
            default:
                uk0.u.c(p3.p0.t(this.f79252e | 1), this.f79251d, this.f79249b, mVar, this.f79250c);
                break;
        }
        return Unit.INSTANCE;
    }
}
