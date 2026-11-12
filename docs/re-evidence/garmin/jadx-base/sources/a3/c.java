package a3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z3.e f629d;

    public /* synthetic */ c(float f14, float f15, z3.e eVar, int i14, int i15) {
        this.f626a = i15;
        this.f627b = f14;
        this.f628c = f15;
        this.f629d = eVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f626a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                f.c(this.f627b, this.f628c, this.f629d, mVar, p3.p0.t(439));
                break;
            default:
                i3.l.b(this.f627b, this.f628c, this.f629d, mVar, p3.p0.t(439));
                break;
        }
        return Unit.INSTANCE;
    }
}
