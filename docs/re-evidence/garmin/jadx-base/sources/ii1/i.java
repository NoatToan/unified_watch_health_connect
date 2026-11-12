package ii1;

import androidx.room.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import o13.q;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lo13/q;", "", "<anonymous>", "(Lo53/b0;)Lo13/q;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.findmydevice.domain.device.SaveDeviceLocationUseCase$invoke$2", f = "SaveDeviceLocationUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super q<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f93780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f93781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f93782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fi1.b f93783d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(long j8, g gVar, fi1.b bVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f93781b = j8;
        this.f93782c = gVar;
        this.f93783d = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f93781b, this.f93782c, this.f93783d, dVar);
        iVar.f93780a = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super q<? extends Unit>> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        long j8 = this.f93781b;
        String strF = a0.f(j8, "Save device location [deviceId=", "]");
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var, "SaveDeviceLocationUseCase", strF);
        return q.a(this.f93782c.f93775a.b(j8, this.f93783d));
    }
}
