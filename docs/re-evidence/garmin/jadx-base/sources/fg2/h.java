package fg2;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.repositories.LiveActivityRepository", f = "LiveActivityRepository.kt", l = {SyslogConstants.LOG_LOCAL3}, m = "getDeviceInfoMetadata", v = 2)
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f71511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f71512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f71513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f71514d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f71513c = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f71512b = obj;
        this.f71514d |= Integer.MIN_VALUE;
        return this.f71513c.f(null, this);
    }
}
