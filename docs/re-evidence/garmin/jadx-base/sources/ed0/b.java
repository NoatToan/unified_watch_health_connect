package ed0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.sharing.DeviceSharingUtil", f = "DeviceSharingUtil.kt", l = {272}, m = "createDeviceBond", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f63846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f63847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f63848c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f63847b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f63846a = obj;
        this.f63848c |= Integer.MIN_VALUE;
        return this.f63847b.c(null, this);
    }
}
