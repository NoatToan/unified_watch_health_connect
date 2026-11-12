package ii1;

import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.findmydevice.domain.device.GetDeviceInfoUseCase", f = "GetDeviceInfoUseCase.kt", l = {14}, m = "invoke-gIAlu-s", v = 2)
public final class a extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f93764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f93765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f93766c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, t13.d<? super a> dVar) {
        super(dVar);
        this.f93765b = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f93764a = obj;
        this.f93766c |= Integer.MIN_VALUE;
        Object objA = this.f93765b.a(0L, this);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : q.a(objA);
    }
}
