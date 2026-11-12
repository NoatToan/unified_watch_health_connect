package f12;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.user.GCMUserAccountImpl", f = "GCMUserAccountImpl.kt", l = {SyslogConstants.LOG_LOCAL4}, m = "getMFATokenSafely", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f68057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f68058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f68059c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f68058b = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f68057a = obj;
        this.f68059c |= Integer.MIN_VALUE;
        return this.f68058b.B(this);
    }
}
