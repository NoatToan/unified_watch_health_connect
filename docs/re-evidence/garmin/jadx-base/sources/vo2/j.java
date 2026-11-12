package vo2;

import com.garmin.feature.garminpay.providers.gpay.sync.NewDeviceSyncQueue;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.sync.NewDeviceSyncQueue", f = "NewDeviceSyncQueue.kt", l = {278, 287}, m = "getAvailableCommits", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wo2.e f179156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wo2.f f179157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f179158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ NewDeviceSyncQueue f179159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f179160e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(NewDeviceSyncQueue newDeviceSyncQueue, t13.d<? super j> dVar) {
        super(dVar);
        this.f179159d = newDeviceSyncQueue;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f179158c = obj;
        this.f179160e |= Integer.MIN_VALUE;
        List<y> list = NewDeviceSyncQueue.f51325l;
        return this.f179159d.g(this, null, null);
    }
}
