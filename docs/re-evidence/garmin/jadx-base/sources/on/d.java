package on;

import c83.a0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.health.data.HealthRepositoryImpl", f = "HealthRepositoryImpl.kt", l = {30, 33, 36}, m = "getActivitySummary", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f133005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a0 f133006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public sn.h f133007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public sn.b f133008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f133009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a f133010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f133011g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f133010f = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f133009e = obj;
        this.f133011g |= Integer.MIN_VALUE;
        return this.f133010f.b(null, null, this);
    }
}
