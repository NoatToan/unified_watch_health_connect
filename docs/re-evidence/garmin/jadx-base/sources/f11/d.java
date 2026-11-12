package f11;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.create.viewmodel.CreateEditRecipeViewModel", f = "CreateEditRecipeViewModel.kt", l = {298}, m = "loadRecipeDetails", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f67907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f67908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f67909c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f67908b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f67907a = obj;
        this.f67909c |= Integer.MIN_VALUE;
        return f.x4(this.f67908b, this);
    }
}
