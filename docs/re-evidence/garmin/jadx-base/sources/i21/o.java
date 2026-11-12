package i21;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.reports.viewmodel.NutritionReportsViewModel", f = "NutritionReportsViewModel.kt", l = {1070}, m = "markPregnancySuggestionOpened", v = 2)
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f87340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f87341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f87342c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(d dVar, t13.d<? super o> dVar2) {
        super(dVar2);
        this.f87341b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f87340a = obj;
        this.f87342c |= Integer.MIN_VALUE;
        int i14 = d.f87268z;
        return this.f87341b.K4(this);
    }
}
