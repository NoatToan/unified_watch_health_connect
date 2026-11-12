package wt1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.atp.RaceEventViewModel", f = "RaceEventViewModel.kt", l = {493}, m = "handleEventCustomizationUpdate", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fg0.k f187096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f187097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f187098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f187099d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(d dVar, t13.d<? super l> dVar2) {
        super(dVar2);
        this.f187098c = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f187097b = obj;
        this.f187099d |= Integer.MIN_VALUE;
        return d.z4(this.f187098c, null, 0L, this);
    }
}
