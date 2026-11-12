package iw2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.app.datahandler.RTSPhoneStorageCoordinator", f = "RTSPhoneStorageCoordinator.kt", l = {65}, m = "getBaseDirectory", v = 1)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f95440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f95441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f95442c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(w wVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f95441b = wVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f95440a = obj;
        this.f95442c |= Integer.MIN_VALUE;
        return w.a(this.f95441b, null, this);
    }
}
