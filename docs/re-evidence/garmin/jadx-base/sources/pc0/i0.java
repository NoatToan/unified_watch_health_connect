package pc0;

import java.io.Serializable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.repo.DevicesRepo", f = "DevicesRepo.kt", l = {115}, m = "registerDeviceAccessory-gIAlu-s", v = 2)
public final class i0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f137220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f137221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f137222c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j jVar, t13.d<? super i0> dVar) {
        super(dVar);
        this.f137221b = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f137220a = obj;
        this.f137222c |= Integer.MIN_VALUE;
        Serializable serializableM = this.f137221b.m(null, this);
        return serializableM == u13.a.COROUTINE_SUSPENDED ? serializableM : o13.q.a(serializableM);
    }
}
