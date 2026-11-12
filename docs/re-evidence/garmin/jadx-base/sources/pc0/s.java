package pc0;

import com.garmin.android.apps.connectmobile.devices.model.DeviceAppInfoDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceAppInfoDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.repo.DevicesRepo$getDeviceInfo$4", f = "DevicesRepo.kt", l = {457}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.l<t13.d<? super c83.a0<DeviceAppInfoDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f137288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f137289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f137290c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(j jVar, long j8, t13.d<? super s> dVar) {
        super(1, dVar);
        this.f137289b = jVar;
        this.f137290c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new s(this.f137289b, this.f137290c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<DeviceAppInfoDTO>> dVar) {
        return ((s) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f137288a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<DeviceAppInfoDTO>> i0VarK = this.f137289b.f137224a.k(this.f137290c);
        this.f137288a = 1;
        Object objAwait = i0VarK.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
