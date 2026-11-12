package i21;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.reports.viewmodel.NutritionReportsViewModel", f = "NutritionReportsViewModel.kt", l = {1033}, m = "markWhatsNewModalAsShown", v = 2)
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f87343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f87344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f87345c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(d dVar, t13.d<? super p> dVar2) {
        super(dVar2);
        this.f87344b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f87343a = obj;
        this.f87345c |= Integer.MIN_VALUE;
        return d.C4(this.f87344b, this);
    }
}
