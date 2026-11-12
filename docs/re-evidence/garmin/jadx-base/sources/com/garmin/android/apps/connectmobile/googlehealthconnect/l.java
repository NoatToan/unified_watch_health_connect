package com.garmin.android.apps.connectmobile.googlehealthconnect;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.googlehealthconnect.HealthConnectDelegateImpl", f = "GoogleHealthConnectDelegateImpl.kt", l = {SyslogConstants.LOG_LOCAL7, 190}, m = "deleteWeightRecord", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f36120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f36121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f36122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36123d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i iVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f36122c = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f36121b = obj;
        this.f36123d |= Integer.MIN_VALUE;
        return this.f36122c.j(0L, this);
    }
}
