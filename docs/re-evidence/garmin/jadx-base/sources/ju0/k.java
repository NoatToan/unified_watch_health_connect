package ju0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.liveeventsharing.network.LiveEventSharingRepo", f = "LiveEventSharingRepo.kt", l = {141}, m = "getLiveEventSharingContacts", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f100908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f100909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f100910c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e eVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f100909b = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f100908a = obj;
        this.f100910c |= Integer.MIN_VALUE;
        return this.f100909b.b(false, this);
    }
}
