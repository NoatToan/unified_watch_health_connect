package dn2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@v13.e(c = "com.garmin.device.sharing.management.devices.GCDeviceRetriever", f = "GCDeviceRetriever.kt", l = {161}, m = "createService")
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f60550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f60551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f60552c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, t13.d<? super e> dVar2) {
        super(dVar2);
        this.f60551b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f60550a = obj;
        this.f60552c |= Integer.MIN_VALUE;
        return this.f60551b.c(this);
    }
}
