package b;

import org.koin.androidx.scope.ComponentActivityExtKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f13795b;

    public /* synthetic */ e(g gVar, int i14) {
        this.f13794a = i14;
        this.f13795b = gVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f13794a) {
            case 0:
                return g.fullyDrawnReporter_delegate$lambda$0$0(this.f13795b);
            case 1:
                return g.fullyDrawnReporter_delegate$lambda$0(this.f13795b);
            case 2:
                return g.onBackPressedInput_delegate$lambda$0(this.f13795b);
            case 3:
                return g.defaultViewModelProviderFactory_delegate$lambda$0(this.f13795b);
            case 4:
                return g.onBackPressedDispatcher_delegate$lambda$0(this.f13795b);
            case 5:
                return ComponentActivityExtKt.createActivityScope(this.f13795b);
            default:
                return ComponentActivityExtKt.createActivityRetainedScope(this.f13795b);
        }
    }
}
