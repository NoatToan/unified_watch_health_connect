package vo2;

import com.garmin.feature.garminpay.providers.gpay.sync.NewDeviceSyncQueue;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.sync.NewDeviceSyncQueue", f = "NewDeviceSyncQueue.kt", l = {309, 319}, m = "processApduCommits", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xo2.g f179166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wo2.e f179167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f179168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ NewDeviceSyncQueue f179169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f179170e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(NewDeviceSyncQueue newDeviceSyncQueue, t13.d<? super l> dVar) {
        super(dVar);
        this.f179169d = newDeviceSyncQueue;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f179168c = obj;
        this.f179170e |= Integer.MIN_VALUE;
        List<y> list = NewDeviceSyncQueue.f51325l;
        return this.f179169d.i(null, null, this);
    }
}
