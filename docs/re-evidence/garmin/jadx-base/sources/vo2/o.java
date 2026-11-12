package vo2;

import com.garmin.feature.garminpay.providers.gpay.sync.NewDeviceSyncQueue;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.sync.NewDeviceSyncQueue", f = "NewDeviceSyncQueue.kt", l = {730, 739}, m = "processTransitCardCommit", v = 2)
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xo2.g f179186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yo2.a f179187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public yo2.a f179188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public yo2.a f179189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f179190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ NewDeviceSyncQueue f179191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f179192g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(NewDeviceSyncQueue newDeviceSyncQueue, t13.d<? super o> dVar) {
        super(dVar);
        this.f179191f = newDeviceSyncQueue;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f179190e = obj;
        this.f179192g |= Integer.MIN_VALUE;
        List<y> list = NewDeviceSyncQueue.f51325l;
        return this.f179191f.l(null, null, this);
    }
}
