package mr;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.domain.GetCompactActivityDetailsUseCase", f = "GetCompactActivityDetailsUseCase.kt", l = {SyslogConstants.LOG_LOCAL1}, m = "getActivityIntervals", v = 2)
public final class v extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f120322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f120323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f120324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f120325d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(g0 g0Var, t13.d<? super v> dVar) {
        super(dVar);
        this.f120324c = g0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f120323b = obj;
        this.f120325d |= Integer.MIN_VALUE;
        return g0.a(this.f120324c, 0L, this);
    }
}
