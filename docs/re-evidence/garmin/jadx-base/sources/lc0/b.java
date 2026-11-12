package lc0;

import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.domain.CheckDeviceFirmwareUpdateUseCase", f = "CheckDeviceFirmwareUpdateUseCase.kt", l = {94}, m = "invoke-gIAlu-s", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f111925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f111926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f111927c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f111926b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f111925a = obj;
        this.f111927c |= Integer.MIN_VALUE;
        Object objA = this.f111926b.a(0L, this);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : q.a(objA);
    }
}
