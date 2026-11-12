package o71;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.viewmodel.StrengthStatsViewModel", f = "StrengthStatsViewModel.kt", l = {198, 199}, m = "prepareResourceIfNecessary", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f130288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f130289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f130290c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i iVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f130289b = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f130288a = obj;
        this.f130290c |= Integer.MIN_VALUE;
        return this.f130289b.E4(this);
    }
}
