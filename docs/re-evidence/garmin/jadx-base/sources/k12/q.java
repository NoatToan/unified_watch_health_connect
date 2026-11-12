package k12;

import ch.qos.logback.core.net.SyslogConstants;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/devices/model/m;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.data.repo.UsersRepo$getDeviceRegistrationDetails$result$1", f = "UsersRepo.kt", l = {SyslogConstants.LOG_LOCAL3}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.l<t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.devices.model.m>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f102366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f102367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f102368c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(d dVar, String str, t13.d<? super q> dVar2) {
        super(1, dVar2);
        this.f102367b = dVar;
        this.f102368c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new q(this.f102367b, this.f102368c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.devices.model.m>> dVar) {
        return ((q) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f102366a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<c83.a0<com.garmin.android.apps.connectmobile.devices.model.m>> i0VarM = this.f102367b.f102318c.m(this.f102368c);
        this.f102366a = 1;
        Object objAwait = i0VarM.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
