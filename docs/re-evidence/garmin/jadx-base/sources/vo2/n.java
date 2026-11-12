package vo2;

import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.feature.garminpay.providers.gpay.sync.NewDeviceSyncQueue;
import com.google.mlkit.common.MlKitException;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.sync.NewDeviceSyncQueue", f = "NewDeviceSyncQueue.kt", l = {SyslogConstants.LOG_LOCAL7, 193, 202, MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, 210, 211, 221, 236, 241, 245, 270}, m = "processNextPendingSync", v = 2)
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f179176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wo2.f f179177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f179178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public wo2.e f179179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Iterator f179180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public xo2.g f179181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f179182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f179183h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ NewDeviceSyncQueue f179184i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f179185j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(NewDeviceSyncQueue newDeviceSyncQueue, t13.d<? super n> dVar) {
        super(dVar);
        this.f179184i = newDeviceSyncQueue;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f179183h = obj;
        this.f179185j |= Integer.MIN_VALUE;
        List<y> list = NewDeviceSyncQueue.f51325l;
        return this.f179184i.k(false, this);
    }
}
