package k12;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.data.repo.UsersRepo", f = "UsersRepo.kt", l = {SyslogConstants.LOG_LOCAL3}, m = "getDeviceRegistrationDetails", v = 2)
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f102363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f102364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f102365c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(d dVar, t13.d<? super p> dVar2) {
        super(dVar2);
        this.f102364b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f102363a = obj;
        this.f102365c |= Integer.MIN_VALUE;
        return this.f102364b.c(null, this);
    }
}
