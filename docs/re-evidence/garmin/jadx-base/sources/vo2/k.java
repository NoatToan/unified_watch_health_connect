package vo2;

import com.garmin.feature.garminpay.providers.gpay.sync.NewDeviceSyncQueue;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.sync.NewDeviceSyncQueue", f = "NewDeviceSyncQueue.kt", l = {434, 452}, m = "processApduCommand", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xo2.a f179161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public StringBuilder f179162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f179163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ NewDeviceSyncQueue f179164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f179165e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(NewDeviceSyncQueue newDeviceSyncQueue, t13.d<? super k> dVar) {
        super(dVar);
        this.f179164d = newDeviceSyncQueue;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f179163c = obj;
        this.f179165e |= Integer.MIN_VALUE;
        return this.f179164d.h(null, null, this);
    }
}
