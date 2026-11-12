package l3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f109357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s5.x0 f109358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.p f109359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f109360e;

    public /* synthetic */ m1(long j8, s5.x0 x0Var, e23.p pVar, int i14, int i15) {
        this.f109356a = i15;
        this.f109357b = j8;
        this.f109358c = x0Var;
        this.f109359d = pVar;
        this.f109360e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f109356a) {
            case 0:
                ((Integer) obj2).intValue();
                k.b(this.f109357b, this.f109358c, this.f109359d, (p3.m) obj, p3.p0.t(this.f109360e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                k2.b(this.f109357b, this.f109358c, this.f109359d, (p3.m) obj, p3.p0.t(this.f109360e | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
