package uy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.navigation.domain.GetSettingsItemsUseCase", f = "GetSettingsItemsUseCase.kt", l = {109, 111}, m = "getPrimaryTrainingDevices", v = 2)
public final class x0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f173353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f173354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v0 f173355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f173356d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(v0 v0Var, t13.d<? super x0> dVar) {
        super(dVar);
        this.f173355c = v0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f173354b = obj;
        this.f173356d |= Integer.MIN_VALUE;
        int i14 = v0.f173327h;
        return this.f173355c.b(false, this);
    }
}
