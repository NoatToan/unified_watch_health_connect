package vo2;

import com.garmin.feature.garminpay.providers.gpay.sync.NewDeviceSyncQueue;
import java.io.Serializable;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.sync.NewDeviceSyncQueue", f = "NewDeviceSyncQueue.kt", l = {359, 385, 387, 408, 418}, m = "executeApduPackage$suspendImpl", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NewDeviceSyncQueue f179134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xo2.c f179135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public xo2.d f179136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f179137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f179138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f179139f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public r0 f179140g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Serializable f179141h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r0 f179142i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f179143j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f179144k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f179145l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ NewDeviceSyncQueue f179146m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f179147n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(NewDeviceSyncQueue newDeviceSyncQueue, t13.d<? super g> dVar) {
        super(dVar);
        this.f179146m = newDeviceSyncQueue;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f179145l = obj;
        this.f179147n |= Integer.MIN_VALUE;
        return NewDeviceSyncQueue.e(this.f179146m, null, null, this);
    }
}
