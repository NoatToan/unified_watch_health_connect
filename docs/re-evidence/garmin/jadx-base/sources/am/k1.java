package am;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f4044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f4045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f4046d;

    public /* synthetic */ k1(e23.a aVar, e23.a aVar2, p3.p1 p1Var, int i14) {
        this.f4043a = i14;
        this.f4044b = aVar;
        this.f4045c = aVar2;
        this.f4046d = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        switch (this.f4043a) {
            case 0:
                if (((Boolean) this.f4046d.getValue()).booleanValue()) {
                    this.f4044b.invoke();
                } else {
                    this.f4045c.invoke();
                }
                break;
            default:
                if (((Boolean) this.f4046d.getValue()).booleanValue()) {
                    this.f4044b.invoke();
                } else {
                    this.f4045c.invoke();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
