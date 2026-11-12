package te2;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.ContinueAsHandler", f = "ContinueAsHandler.kt", l = {SyslogConstants.LOG_LOCAL4, 165, 170}, m = "exchangeForIT2")
public final class f0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f164023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f164024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f164025c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(h0 h0Var, t13.d<? super f0> dVar) {
        super(dVar);
        this.f164024b = h0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f164023a = obj;
        this.f164025c |= Integer.MIN_VALUE;
        return h0.f(this.f164024b, this);
    }
}
