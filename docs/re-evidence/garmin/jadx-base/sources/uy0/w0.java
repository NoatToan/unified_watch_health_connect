package uy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.navigation.domain.GetSettingsItemsUseCase", f = "GetSettingsItemsUseCase.kt", l = {169}, m = "getDeviceSyncDetails", v = 2)
public final class w0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f173337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public gj1.b f173338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f173339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v0 f173340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f173341e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(v0 v0Var, t13.d<? super w0> dVar) {
        super(dVar);
        this.f173340d = v0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f173339c = obj;
        this.f173341e |= Integer.MIN_VALUE;
        int i14 = v0.f173327h;
        return this.f173340d.a(0L, false, null, this);
    }
}
