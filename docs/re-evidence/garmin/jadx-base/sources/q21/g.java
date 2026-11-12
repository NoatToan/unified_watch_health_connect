package q21;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.settings.viewmodel.LegacyMealWindowsAndTimelineViewModel", f = "LegacyMealWindowsAndTimelineViewModel.kt", l = {234}, m = "fetchMeals", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f142236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f142237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f142238c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f142237b = kVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f142236a = obj;
        this.f142238c |= Integer.MIN_VALUE;
        return k.x4(this.f142237b, this);
    }
}
