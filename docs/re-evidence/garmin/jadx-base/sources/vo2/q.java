package vo2;

import com.garmin.feature.garminpay.providers.gpay.sync.NewDeviceSyncQueue;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.sync.NewDeviceSyncQueue", f = "NewDeviceSyncQueue.kt", l = {554}, m = "tryReleasingExplicitLock", v = 2)
public final class q extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f179199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewDeviceSyncQueue f179200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f179201c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(NewDeviceSyncQueue newDeviceSyncQueue, t13.d<? super q> dVar) {
        super(dVar);
        this.f179200b = newDeviceSyncQueue;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f179199a = obj;
        this.f179201c |= Integer.MIN_VALUE;
        return this.f179200b.o(this);
    }
}
