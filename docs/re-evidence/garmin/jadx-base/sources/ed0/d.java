package ed0;

import com.garmin.device.sharing.management.dtos.SharedDeviceInfo;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.sharing.DeviceSharingUtil$delegate$2$1", f = "DeviceSharingUtil.kt", l = {78}, m = "updateDevice", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SharedDeviceInfo f63850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f63851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f63852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a.c f63853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f63854e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a.c cVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f63853d = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f63852c = obj;
        this.f63854e |= Integer.MIN_VALUE;
        return this.f63853d.l(null, false, this);
    }
}
