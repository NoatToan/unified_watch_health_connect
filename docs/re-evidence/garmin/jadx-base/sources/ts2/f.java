package ts2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.gfdi.connecteddevices.ConnectedDevicesHandler", f = "ConnectedDevicesHandler.kt", l = {227}, m = "onConnectedDevicesRequest$gfdi_release")
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f166227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f166228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f166229c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f166228b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f166227a = obj;
        this.f166229c |= Integer.MIN_VALUE;
        return this.f166228b.q(null, this);
    }
}
