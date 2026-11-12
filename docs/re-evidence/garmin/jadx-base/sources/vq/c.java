package vq;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.splits.repository.ActivityStatsSplitsRepository", f = "ActivityStatsSplitsRepository.kt", l = {50}, m = "updateActivityTypedSplitsAsync", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f179423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f179424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f179425c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, t13.d<? super c> dVar2) {
        super(dVar2);
        this.f179424b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f179423a = obj;
        this.f179425c |= Integer.MIN_VALUE;
        return this.f179424b.a(0L, null, this);
    }
}
