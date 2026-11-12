package bm0;

import p005kotlin.Metadata;
import t13.d;
import v13.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@e(c = "com.garmin.android.apps.connectmobile.googlehealthconnect.data.repository.GoogleHealthConnectRepositoryImpl", f = "GoogleHealthConnectRepositoryImpl.kt", l = {64}, m = "getHealthExportData", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f18882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f18883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18884c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, d<? super b> dVar) {
        super(dVar);
        this.f18883b = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f18882a = obj;
        this.f18884c |= Integer.MIN_VALUE;
        return this.f18883b.Z(null, this);
    }
}
