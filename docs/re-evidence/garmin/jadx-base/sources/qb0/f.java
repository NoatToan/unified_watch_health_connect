package qb0;

import ca0.u1;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u1 f143988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f143989c;

    public /* synthetic */ f(u1 u1Var, p1 p1Var, int i14) {
        this.f143987a = i14;
        this.f143988b = u1Var;
        this.f143989c = p1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f143987a) {
            case 0:
                this.f143989c.setValue(Boolean.FALSE);
                this.f143988b.invoke();
                break;
            default:
                this.f143989c.setValue(Boolean.FALSE);
                this.f143988b.invoke();
                break;
        }
        return Unit.INSTANCE;
    }
}
