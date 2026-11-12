package ex2;

import android.content.Context;
import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.networkwrapper.networking.StringsHelper", f = "StringsHelper.kt", l = {SyslogConstants.LOG_LOCAL3}, m = "getStringsVersion", v = 1)
public final class r extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f67032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f67033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f67034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f67035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f67036e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(w wVar, t13.d<? super r> dVar) {
        super(dVar);
        this.f67035d = wVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f67034c = obj;
        this.f67036e |= Integer.MIN_VALUE;
        w wVar = w.f67058a;
        return this.f67035d.f(null, 0L, null, this);
    }
}
