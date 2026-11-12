package ju0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.liveeventsharing.network.LiveEventSharingRepo", f = "LiveEventSharingRepo.kt", l = {154, 156}, m = "getLesCachedSettings", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f100900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f100901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f100902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f100903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f100904e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e eVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f100903d = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f100902c = obj;
        this.f100904e |= Integer.MIN_VALUE;
        return this.f100903d.a(0L, this, false);
    }
}
