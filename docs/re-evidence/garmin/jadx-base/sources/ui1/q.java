package ui1;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.network.InReachSubscriptionRepository", f = "InReachSubscriptionRepository.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS}, m = "hasActiveSubscription", v = 2)
public final class q extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f171357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f171358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f171359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f171360d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(l lVar, t13.d<? super q> dVar) {
        super(dVar);
        this.f171359c = lVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f171358b = obj;
        this.f171360d |= Integer.MIN_VALUE;
        return this.f171359c.f(0L, this);
    }
}
