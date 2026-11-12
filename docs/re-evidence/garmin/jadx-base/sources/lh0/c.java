package lh0;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f112394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dh0.a f112395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f112396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f112397e;

    public /* synthetic */ c(r rVar, dh0.a aVar, e23.a aVar2, int i14, int i15) {
        this.f112393a = i15;
        this.f112394b = rVar;
        this.f112395c = aVar;
        this.f112396d = aVar2;
        this.f112397e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f112393a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                f.b(this.f112394b, this.f112395c, this.f112396d, mVar, p0.t(this.f112397e | 1));
                break;
            case 1:
                u.a(this.f112394b, this.f112395c, this.f112396d, mVar, p0.t(this.f112397e | 1));
                break;
            default:
                v.a(this.f112394b, this.f112395c, this.f112396d, mVar, p0.t(this.f112397e | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
