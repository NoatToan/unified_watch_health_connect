package ii1;

import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.findmydevice.domain.device.SaveDeviceLocationUseCase", f = "SaveDeviceLocationUseCase.kt", l = {16}, m = "invoke-0E7RQCE", v = 2)
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f93777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f93778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f93779c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f93778b = gVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f93777a = obj;
        this.f93779c |= Integer.MIN_VALUE;
        Object objA = this.f93778b.a(0L, null, this);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : q.a(objA);
    }
}
