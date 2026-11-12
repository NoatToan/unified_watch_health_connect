package vo2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.sync.DefaultSyncStrategy", f = "DefaultSyncStrategy.kt", l = {39, 45}, m = "onDeleted$suspendImpl", v = 2)
public final class a extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.feature.garminpay.providers.gpay.sync.a f179109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f179110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f179111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.feature.garminpay.providers.gpay.sync.a f179112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f179113e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.garmin.feature.garminpay.providers.gpay.sync.a aVar, t13.d<? super a> dVar) {
        super(dVar);
        this.f179112d = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f179111c = obj;
        this.f179113e |= Integer.MIN_VALUE;
        return com.garmin.feature.garminpay.providers.gpay.sync.a.a(this.f179112d, null, this);
    }
}
