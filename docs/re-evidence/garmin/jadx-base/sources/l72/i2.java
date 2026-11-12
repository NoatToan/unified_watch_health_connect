package l72;

import i3.cf;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i2 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f111060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cf f111061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f111062d;

    public /* synthetic */ i2(o53.b0 b0Var, cf cfVar, p3.p1 p1Var, int i14) {
        this.f111059a = i14;
        this.f111060b = b0Var;
        this.f111061c = cfVar;
        this.f111062d = p1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f111059a) {
            case 0:
                ge1.b.T(this.f111060b, null, null, new k2(this.f111061c, this.f111062d, null), 3);
                break;
            default:
                ge1.b.T(this.f111060b, null, null, new tg1.e.a(this.f111061c, this.f111062d, null), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
