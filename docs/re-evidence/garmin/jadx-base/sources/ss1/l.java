package ss1;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.data.repository.GarminTrailsRepoImpl", f = "GarminTrailsRepoImpl.kt", l = {SyslogConstants.LOG_LOCAL1, 137}, m = "getTrailDetails", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f160683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f160684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f160685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f160686d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(z zVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f160685c = zVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f160684b = obj;
        this.f160686d |= Integer.MIN_VALUE;
        return this.f160685c.W(0L, null, null, this);
    }
}
