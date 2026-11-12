package kd0;

import android.content.Context;
import android.net.Uri;
import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.GCPlusDelegateImpl", f = "GCPlusDelegateImpl.kt", l = {SyslogConstants.LOG_LOCAL1}, m = "navigateToPerformanceDashboard", v = 2)
public final class r2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f104331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Uri f104332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f104333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p2 f104334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f104335e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(p2 p2Var, t13.d<? super r2> dVar) {
        super(dVar);
        this.f104334d = p2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104333c = obj;
        this.f104335e |= Integer.MIN_VALUE;
        return this.f104334d.i(null, null, this);
    }
}
