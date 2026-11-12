package hi1;

import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.findmydevice.domain.UpdateFindMyDeviceLocationUseCase", f = "UpdateFindMyDeviceLocationUseCase.kt", l = {16, 35}, m = "invoke-gIAlu-s", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f83875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f83876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f83877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f83878d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f83877c = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f83876b = obj;
        this.f83878d |= Integer.MIN_VALUE;
        Object objA = this.f83877c.a(0L, this);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : q.a(objA);
    }
}
