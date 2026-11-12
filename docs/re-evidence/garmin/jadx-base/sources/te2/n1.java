package te2;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.ITAutoLoginURIGenerator", f = "ITAutoLoginURIGenerator.kt", l = {SyslogConstants.LOG_LOCAL3}, m = "returnTokenValOrThrow")
public final class n1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f164198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1 f164199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f164200c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(f1 f1Var, t13.d<? super n1> dVar) {
        super(dVar);
        this.f164199b = f1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f164198a = obj;
        this.f164200c |= Integer.MIN_VALUE;
        return this.f164199b.d(this);
    }
}
