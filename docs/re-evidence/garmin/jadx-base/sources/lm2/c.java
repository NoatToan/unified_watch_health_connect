package lm2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.pairing.initializer.PairingCachedDeviceXml", f = "PairingCachedDeviceXml.kt", l = {61, 64}, m = "updateGarminDeviceXML$suspendImpl")
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f113615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f113616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f113617c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f113616b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f113615a = obj;
        this.f113617c |= Integer.MIN_VALUE;
        return a.d(this.f113616b, null, null, this);
    }
}
