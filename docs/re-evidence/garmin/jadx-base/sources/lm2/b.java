package lm2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.pairing.initializer.PairingCachedDeviceXml", f = "PairingCachedDeviceXml.kt", l = {44, 48}, m = "getSavedGarminDeviceXML$suspendImpl")
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f113612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f113613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f113614c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f113613b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f113612a = obj;
        this.f113614c |= Integer.MIN_VALUE;
        return a.c(this.f113613b, null, this);
    }
}
