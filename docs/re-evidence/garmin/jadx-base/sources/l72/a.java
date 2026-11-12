package l72;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f110866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f110867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b92.a f110868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f110869e;

    public /* synthetic */ a(String str, String str2, boolean z14, b92.a aVar, int i14) {
        this.f110865a = 3;
        this.f110866b = str;
        this.f110867c = str2;
        this.f110869e = z14;
        this.f110868d = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f110865a) {
            case 0:
                ((Integer) obj2).getClass();
                l.j(p3.p0.t(1), this.f110868d, this.f110866b, this.f110867c, (p3.m) obj, this.f110869e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                l.b(p3.p0.t(1), this.f110868d, this.f110866b, this.f110867c, (p3.m) obj, this.f110869e);
                break;
            case 2:
                ((Integer) obj2).getClass();
                l.b(p3.p0.t(1), this.f110868d, this.f110866b, this.f110867c, (p3.m) obj, this.f110869e);
                break;
            default:
                ((Integer) obj2).getClass();
                qx.h.c(p3.p0.t(1), this.f110868d, this.f110866b, this.f110867c, (p3.m) obj, this.f110869e);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ a(String str, String str2, b92.a aVar, boolean z14, int i14, int i15) {
        this.f110865a = i15;
        this.f110866b = str;
        this.f110867c = str2;
        this.f110868d = aVar;
        this.f110869e = z14;
    }
}
