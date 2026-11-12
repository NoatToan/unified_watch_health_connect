package dn2;

import com.garmin.device.sharing.management.dtos.ConnectionInfoDto;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@v13.e(c = "com.garmin.device.sharing.management.devices.GCDeviceRetriever", f = "GCDeviceRetriever.kt", l = {341, 342}, m = "uploadNewDeviceInfo$suspendImpl")
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f60566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ConnectionInfoDto f60567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f60568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f60569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f60570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f60571f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d dVar, t13.d<? super h> dVar2) {
        super(dVar2);
        this.f60570e = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f60569d = obj;
        this.f60571f |= Integer.MIN_VALUE;
        return d.f(this.f60570e, 0L, null, this);
    }
}
