package n70;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetRecommendedUserFocusUseCase", f = "GetRecommendedUserFocusUseCase.kt", l = {12}, m = "invoke", v = 2)
public final class b3 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f124042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c3 f124043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f124044c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(c3 c3Var, t13.d<? super b3> dVar) {
        super(dVar);
        this.f124043b = c3Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f124042a = obj;
        this.f124044c |= Integer.MIN_VALUE;
        return this.f124043b.a(this);
    }
}
