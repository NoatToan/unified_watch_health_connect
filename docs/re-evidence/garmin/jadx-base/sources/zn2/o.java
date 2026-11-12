package zn2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewDeviceDataManager", f = "NewDeviceDataManager.kt", l = {161, 167}, m = "getCommits", v = 2)
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c83.a0 f205702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xo2.e f205703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f205704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f205705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f205706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f205707f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(l lVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f205706e = lVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f205705d = obj;
        this.f205707f |= Integer.MIN_VALUE;
        return this.f205706e.c(0, null, this);
    }
}
