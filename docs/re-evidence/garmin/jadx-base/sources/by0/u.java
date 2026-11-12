package by0;

import okhttp3.internal.http.StatusLine;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataSource", f = "MultiDayActivityDataSource.kt", l = {StatusLine.HTTP_TEMP_REDIRECT}, m = "getHeatAltitudeAcclimationData", v = 2)
public final class u extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f22075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f22076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22077c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(a aVar, t13.d<? super u> dVar) {
        super(dVar);
        this.f22076b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f22075a = obj;
        this.f22077c |= Integer.MIN_VALUE;
        return this.f22076b.m(null, null, null, this);
    }
}
