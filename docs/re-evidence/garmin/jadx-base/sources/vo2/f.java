package vo2;

import com.garmin.feature.garminpay.providers.gpay.sync.NewDeviceSyncQueue;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.sync.NewDeviceSyncQueue", f = "NewDeviceSyncQueue.kt", l = {781, 787}, m = "endProcessSync", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wo2.f f179130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f179131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NewDeviceSyncQueue f179132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f179133d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(NewDeviceSyncQueue newDeviceSyncQueue, t13.d<? super f> dVar) {
        super(dVar);
        this.f179132c = newDeviceSyncQueue;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f179131b = obj;
        this.f179133d |= Integer.MIN_VALUE;
        List<y> list = NewDeviceSyncQueue.f51325l;
        return this.f179132c.c(this, null, null);
    }
}
