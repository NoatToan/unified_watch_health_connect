package ju0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.liveeventsharing.network.LiveEventSharingRepo", f = "LiveEventSharingRepo.kt", l = {85, 87}, m = "getLiveEventSharingSettings", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f100911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f100912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f100913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f100914d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(e eVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f100913c = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f100912b = obj;
        this.f100914d |= Integer.MIN_VALUE;
        return this.f100913c.c(null, this);
    }
}
