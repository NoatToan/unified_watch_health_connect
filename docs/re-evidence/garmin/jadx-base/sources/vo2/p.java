package vo2;

import com.garmin.feature.garminpay.providers.gpay.sync.NewDeviceSyncQueue;
import java.util.UUID;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.sync.NewDeviceSyncQueue", f = "NewDeviceSyncQueue.kt", l = {680, 687}, m = "synchronizeCard", v = 2)
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xo2.g f179193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yo2.a f179194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public UUID f179195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f179196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ NewDeviceSyncQueue f179197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f179198f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(NewDeviceSyncQueue newDeviceSyncQueue, t13.d<? super p> dVar) {
        super(dVar);
        this.f179197e = newDeviceSyncQueue;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f179196d = obj;
        this.f179198f |= Integer.MIN_VALUE;
        return NewDeviceSyncQueue.a(this.f179197e, null, null, this);
    }
}
