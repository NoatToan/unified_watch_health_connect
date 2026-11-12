package zn2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewDeviceDataManager", f = "NewDeviceDataManager.kt", l = {102, 113}, m = "ackCommit", v = 2)
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xo2.g f205657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f205658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f205659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f205660d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l lVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f205659c = lVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f205658b = obj;
        this.f205660d |= Integer.MIN_VALUE;
        return this.f205659c.a(null, null, this);
    }
}
