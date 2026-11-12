package aq1;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.startup.StartupChecksRepositoryImpl", f = "StartupChecksRepositoryImpl.kt", l = {SyslogConstants.LOG_LOCAL6}, m = "getAllGraduationPendingConsents", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f12408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12409c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(j jVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f12408b = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f12407a = obj;
        this.f12409c |= Integer.MIN_VALUE;
        return this.f12408b.m(this);
    }
}
