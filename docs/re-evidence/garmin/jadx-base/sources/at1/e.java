package at1;

import org.koin.core.parameter.ParametersHolderKt;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f12769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f12770c;

    public /* synthetic */ e(e23.a aVar, e23.a aVar2, int i14) {
        this.f12768a = i14;
        this.f12769b = aVar;
        this.f12770c = aVar2;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f12768a) {
            case 0:
                this.f12769b.invoke();
                this.f12770c.invoke();
                return Unit.INSTANCE;
            case 1:
                return ParametersHolderKt.parametersOf(this.f12769b.invoke(), this.f12770c.invoke());
            case 2:
                this.f12769b.invoke();
                this.f12770c.invoke();
                return Unit.INSTANCE;
            case 3:
                this.f12769b.invoke();
                this.f12770c.invoke();
                return Unit.INSTANCE;
            case 4:
                this.f12769b.invoke();
                e23.a aVar = this.f12770c;
                if (aVar != null) {
                    aVar.invoke();
                }
                return Unit.INSTANCE;
            case 5:
                this.f12769b.invoke();
                e23.a aVar2 = this.f12770c;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
                return Unit.INSTANCE;
            case 6:
                this.f12769b.invoke();
                this.f12770c.invoke();
                return Unit.INSTANCE;
            case 7:
                this.f12769b.invoke();
                this.f12770c.invoke();
                return Unit.INSTANCE;
            case 8:
                this.f12769b.invoke();
                this.f12770c.invoke();
                return Unit.INSTANCE;
            case 9:
                this.f12769b.invoke();
                this.f12770c.invoke();
                return Unit.INSTANCE;
            default:
                this.f12769b.invoke();
                this.f12770c.invoke();
                return Unit.INSTANCE;
        }
    }
}
