package h62;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f82229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f82230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f82231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f82232e;

    public /* synthetic */ h(boolean z14, e23.a aVar, e23.a aVar2, int i14, int i15) {
        this.f82228a = i15;
        this.f82229b = z14;
        this.f82230c = aVar;
        this.f82231d = aVar2;
        this.f82232e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        p3.m mVar = (p3.m) obj;
        Integer num = (Integer) obj2;
        switch (this.f82228a) {
            case 0:
                num.getClass();
                k.e(this.f82229b, this.f82230c, this.f82231d, mVar, p0.t(this.f82232e | 1));
                break;
            case 1:
                num.getClass();
                in1.f.a(this.f82229b, this.f82230c, this.f82231d, mVar, p0.t(this.f82232e | 1));
                break;
            default:
                num.intValue();
                pa0.g.d(this.f82229b, this.f82230c, this.f82231d, mVar, p0.t(this.f82232e | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
