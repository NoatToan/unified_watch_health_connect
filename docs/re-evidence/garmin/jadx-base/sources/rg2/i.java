package rg2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.ui.dashboard.stats.StatsViewModel", f = "StatsViewModel.kt", l = {94}, m = "registerDataHandlerListener", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f152740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f152741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f152742c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f152741b = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f152740a = obj;
        this.f152742c |= Integer.MIN_VALUE;
        return h.x4(this.f152741b, null, this);
    }
}
