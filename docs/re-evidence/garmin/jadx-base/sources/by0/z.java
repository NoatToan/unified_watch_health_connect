package by0;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataSource", f = "MultiDayActivityDataSource.kt", l = {SyslogConstants.LOG_LOCAL7}, m = "getMultiDayActivityTimelineSummaries", v = 2)
public final class z extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f22152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f22153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22154c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a aVar, t13.d<? super z> dVar) {
        super(dVar);
        this.f22153b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f22152a = obj;
        this.f22154c |= Integer.MIN_VALUE;
        return this.f22153b.o(null, null, 0, 0, null, this);
    }
}
