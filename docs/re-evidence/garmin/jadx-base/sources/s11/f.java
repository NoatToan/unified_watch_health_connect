package s11;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.edit.viewmodel.MoveCopyFoodViewModel", f = "MoveCopyFoodViewModel.kt", l = {291}, m = "fetchMealsRange", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f155914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f155915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f155916c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f155915b = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f155914a = obj;
        this.f155916c |= Integer.MIN_VALUE;
        return e.x4(this.f155915b, this);
    }
}
