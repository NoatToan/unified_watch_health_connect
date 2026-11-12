package lc0;

import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.domain.RemoveDeviceUseCase", f = "RemoveDeviceUseCase.kt", l = {75}, m = "removeDevice-0E7RQCE", v = 2)
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f111954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f111955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f111956c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f111955b = kVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f111954a = obj;
        this.f111956c |= Integer.MIN_VALUE;
        Object objB = this.f111955b.b(0L, this, false);
        return objB == u13.a.COROUTINE_SUSPENDED ? objB : q.a(objB);
    }
}
