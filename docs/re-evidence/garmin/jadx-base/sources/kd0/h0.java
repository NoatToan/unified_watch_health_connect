package kd0;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.ContactsDelegate", f = "LivetrackGcmDelegateImpl.kt", l = {SyslogConstants.SYSLOG_PORT}, m = "fetchPhoneContacts", v = 2)
public final class h0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f104094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104095c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(m0 m0Var, t13.d<? super h0> dVar) {
        super(dVar);
        this.f104094b = m0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104093a = obj;
        this.f104095c |= Integer.MIN_VALUE;
        return this.f104094b.d(this);
    }
}
