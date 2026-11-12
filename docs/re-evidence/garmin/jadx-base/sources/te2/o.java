package te2;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.AbstractOAuth2ITOperation", f = "AbstractOAuth2ITOperation.kt", l = {156, 169, SyslogConstants.LOG_LOCAL7, SyslogConstants.LOG_LOCAL7}, m = "exchangeWithOtherAppCredential")
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f164206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f164207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f164208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f164209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f164210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f164211f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(s sVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f164210e = sVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f164209d = obj;
        this.f164211f |= Integer.MIN_VALUE;
        return s.e(this.f164210e, null, this);
    }
}
