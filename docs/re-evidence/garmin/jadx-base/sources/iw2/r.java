package iw2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.app.datahandler.RTSPhoneStorageCoordinator", f = "RTSPhoneStorageCoordinator.kt", l = {185}, m = "readFileData", v = 1)
public final class r extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f95508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f95509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f95510c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(w wVar, t13.d<? super r> dVar) {
        super(dVar);
        this.f95509b = wVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f95508a = obj;
        this.f95510c |= Integer.MIN_VALUE;
        return w.d(this.f95509b, null, this);
    }
}
