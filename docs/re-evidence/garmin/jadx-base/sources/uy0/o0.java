package uy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.navigation.domain.GetProfileAndPrivacySearchItemsUseCase", f = "GetProfileAndPrivacySearchItemsUseCase.kt", l = {104, 127}, m = "isAvailable", v = 2)
public final class o0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f173271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f173272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f173273c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(m0 m0Var, t13.d<? super o0> dVar) {
        super(dVar);
        this.f173272b = m0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f173271a = obj;
        this.f173273c |= Integer.MIN_VALUE;
        return m0.a(this.f173272b, null, this);
    }
}
