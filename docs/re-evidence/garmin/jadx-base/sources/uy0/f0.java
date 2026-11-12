package uy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.navigation.domain.GetNutritionSettingsItemsUseCase", f = "GetNutritionSettingsItemsUseCase.kt", l = {57}, m = "hasNutritionGoal", v = 2)
public final class f0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f173162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f173163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f173164c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(h0 h0Var, t13.d<? super f0> dVar) {
        super(dVar);
        this.f173163b = h0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f173162a = obj;
        this.f173164c |= Integer.MIN_VALUE;
        return this.f173163b.a(this);
    }
}
