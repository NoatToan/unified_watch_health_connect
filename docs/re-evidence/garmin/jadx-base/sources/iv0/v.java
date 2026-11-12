package iv0;

import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class v implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lv0.a.C2188a f95183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f95184c;

    public /* synthetic */ v(lv0.a.C2188a c2188a, p1 p1Var, int i14) {
        this.f95182a = i14;
        this.f95183b = c2188a;
        this.f95184c = p1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f95182a) {
            case 0:
                this.f95183b.f115041d.invoke();
                this.f95184c.setValue(lv0.a.c.f115044a);
                break;
            default:
                this.f95183b.f115041d.invoke();
                this.f95184c.setValue(lv0.a.c.f115044a);
                break;
        }
        return Unit.INSTANCE;
    }
}
