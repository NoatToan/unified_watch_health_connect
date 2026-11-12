package l52;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.data.WorkoutsRepositoryImpl", f = "WorkoutsRepositoryImpl.kt", l = {143, SyslogConstants.LOG_LOCAL2, 146, 147, 149, 150, SyslogConstants.LOG_LOCAL3}, m = "getMSNWorkoutsAsync", v = 2)
public final class w0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f110381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f110382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f110383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f110384d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(z zVar, t13.d<? super w0> dVar) {
        super(dVar);
        this.f110383c = zVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f110382b = obj;
        this.f110384d |= Integer.MIN_VALUE;
        return this.f110383c.B(null, this);
    }
}
