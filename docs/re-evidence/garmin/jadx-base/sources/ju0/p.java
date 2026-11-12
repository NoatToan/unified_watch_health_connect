package ju0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.liveeventsharing.network.LiveEventSharingRepo", f = "LiveEventSharingRepo.kt", l = {125}, m = "updateLiveEventSharingConsent", v = 2)
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f100926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f100927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f100928c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(e eVar, t13.d<? super p> dVar) {
        super(dVar);
        this.f100927b = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f100926a = obj;
        this.f100928c |= Integer.MIN_VALUE;
        return this.f100927b.h(false, this);
    }
}
