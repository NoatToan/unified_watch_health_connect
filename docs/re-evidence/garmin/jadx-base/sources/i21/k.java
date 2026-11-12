package i21;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.reports.viewmodel.NutritionReportsViewModel", f = "NutritionReportsViewModel.kt", l = {882}, m = "fetchReportsDaily", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f87328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f87329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f87330c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(d dVar, t13.d<? super k> dVar2) {
        super(dVar2);
        this.f87329b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f87328a = obj;
        this.f87330c |= Integer.MIN_VALUE;
        return d.y4(this.f87329b, null, this);
    }
}
