package ed0;

import java.util.Collection;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.sharing.DeviceSharingUtil", f = "DeviceSharingUtil.kt", l = {250, 255, 256}, m = "reconcilePairedDevices", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f63865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f63866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f63867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f63868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f63869e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(a aVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f63868d = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f63867c = obj;
        this.f63869e |= Integer.MIN_VALUE;
        return this.f63868d.l(null, this);
    }
}
