package qb1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.PregnancySetupViewModel", f = "PregnancySetupViewModel.kt", l = {576}, m = "getDeviceSettings", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f144113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f144114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f144115c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(f fVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f144114b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f144113a = obj;
        this.f144115c |= Integer.MIN_VALUE;
        return f.z4(this.f144114b, 0L, this);
    }
}
