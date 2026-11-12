package com.garmin.android.apps.connectmobile.googlehealthconnect;

import ch.qos.logback.core.net.SyslogConstants;
import java.time.Instant;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.googlehealthconnect.HealthConnectDelegateImpl", f = "GoogleHealthConnectDelegateImpl.kt", l = {131, SyslogConstants.LOG_LOCAL1, 156, 161}, m = "deleteActivity", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f36096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f36097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f36098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f36099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f36100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Instant f36101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Instant f36102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Instant f36103h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f36104i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Iterator f36105j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f36106k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f36107l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Iterator f36108m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f36109n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public k23.d f36110o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f36111p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f36112q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f36113r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f36114t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f36115v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f36114t = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f36113r = obj;
        this.f36115v |= Integer.MIN_VALUE;
        return this.f36114t.g(0L, 0L, 0L, this);
    }
}
