package uy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.navigation.domain.GetNotificationSettingsItemsUseCase", f = "GetNotificationSettingsItemsUseCase.kt", l = {126, 129, 132}, m = "filterByAvailability", v = 2)
public final class c0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f173106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f173107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f173108c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(b0 b0Var, t13.d<? super c0> dVar) {
        super(dVar);
        this.f173107b = b0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f173106a = obj;
        this.f173108c |= Integer.MIN_VALUE;
        return b0.a(this.f173107b, null, this);
    }
}
