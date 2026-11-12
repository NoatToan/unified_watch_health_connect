package fe2;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.domain.DefaultPeriodicUploadTask", f = "DefaultPeriodicUploadTask.kt", l = {129, SyslogConstants.LOG_LOCAL1}, m = "uploadPoints", v = 2)
public final class i0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p005kotlin.jvm.internal.p0 f70775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f70776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f70777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0 f70778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f70779e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(e0 e0Var, t13.d<? super i0> dVar) {
        super(dVar);
        this.f70778d = e0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f70777c = obj;
        this.f70779e |= Integer.MIN_VALUE;
        return e0.a(this.f70778d, this);
    }
}
