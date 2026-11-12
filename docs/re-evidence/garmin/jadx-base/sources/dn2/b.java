package dn2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@v13.e(c = "com.garmin.device.sharing.management.devices.AbstractLocalDevicesDelegate", f = "AbstractLocalDevicesDelegate.kt", l = {13}, m = "updateRegisteredDevice$suspendImpl")
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e23.a f60539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f60540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f60541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f60542d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f60541c = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f60540b = obj;
        this.f60542d |= Integer.MIN_VALUE;
        return c.m(this.f60541c, null, null, null, this);
    }
}
