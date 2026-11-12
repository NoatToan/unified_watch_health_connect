package ed0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.sharing.DeviceSharingUtil", f = "DeviceSharingUtil.kt", l = {340}, m = "getPairedDevices", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f63855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f63856b;

    public e(t13.d<? super e> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f63855a = obj;
        this.f63856b |= Integer.MIN_VALUE;
        return a.h(this);
    }
}
