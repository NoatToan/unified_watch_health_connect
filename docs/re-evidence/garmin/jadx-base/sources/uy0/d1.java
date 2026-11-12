package uy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.navigation.domain.GetUserSettingsItemsUseCase", f = "GetUserSettingsItemsUseCase.kt", l = {131}, m = "getMostRecentPregnancyData", v = 2)
public final class d1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f173133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1 f173134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f173135c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(f1 f1Var, t13.d<? super d1> dVar) {
        super(dVar);
        this.f173134b = f1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f173133a = obj;
        this.f173135c |= Integer.MIN_VALUE;
        return f1.a(this.f173134b, this);
    }
}
