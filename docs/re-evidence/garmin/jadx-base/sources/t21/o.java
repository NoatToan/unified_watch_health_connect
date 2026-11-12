package t21;

import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f161938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f161939c;

    public /* synthetic */ o(e23.a aVar, p1 p1Var, int i14) {
        this.f161937a = i14;
        this.f161938b = aVar;
        this.f161939c = p1Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        b82.t0.a aVar = (b82.t0.a) obj;
        switch (this.f161937a) {
            case 0:
                aVar.getClass();
                this.f161939c.setValue(Boolean.valueOf(aVar == b82.t0.a.ON_FOCUS));
                if (aVar == b82.t0.a.ON_FOCUS_LOST) {
                    this.f161938b.invoke();
                }
                break;
            default:
                aVar.getClass();
                this.f161939c.setValue(Boolean.valueOf(aVar == b82.t0.a.ON_FOCUS));
                if (aVar == b82.t0.a.ON_FOCUS_LOST) {
                    this.f161938b.invoke();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
