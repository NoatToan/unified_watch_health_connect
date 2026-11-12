package pu;

import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.auth.PostUserAuthenticationCaller", f = "PostUserAuthenticationCaller.kt", l = {170, 173, SyslogConstants.LOG_LOCAL6, 177, 183}, m = "fetchUserSettings", v = 2)
public final class g0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f141073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v2 f141074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f141075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f141076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f141077e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(n nVar, t13.d<? super g0> dVar) {
        super(dVar);
        this.f141076d = nVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f141075c = obj;
        this.f141077e |= Integer.MIN_VALUE;
        int i14 = n.f141134l;
        return this.f141076d.i(0, this);
    }
}
