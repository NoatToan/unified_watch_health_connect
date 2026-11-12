package dn2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@v13.e(c = "com.garmin.device.sharing.management.devices.AbstractLocalDevicesDelegate", f = "AbstractLocalDevicesDelegate.kt", l = {21}, m = "downgradePairedToRegisteredDevice$suspendImpl")
public final class a extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e23.a f60535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f60536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f60537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f60538d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, t13.d<? super a> dVar) {
        super(dVar);
        this.f60537c = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f60536b = obj;
        this.f60538d |= Integer.MIN_VALUE;
        return c.i(this.f60537c, null, null, null, this);
    }
}
