package u21;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.setup.viewmodel.MicronutrientsViewModel", f = "MicronutrientsViewModel.kt", l = {140}, m = "fetchAndSetMicronutrientsGuidance", v = 2)
public final class b0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f167901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f167902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f167903c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, t13.d<? super b0> dVar) {
        super(dVar);
        this.f167902b = c0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f167901a = obj;
        this.f167903c |= Integer.MIN_VALUE;
        return c0.x4(this.f167902b, this);
    }
}
