package pc0;

import com.garmin.android.apps.connectmobile.devices.model.DeviceAppInfoDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceAppInfoDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.repo.DevicesRepo$getDeviceInfoByVersionId$2", f = "DevicesRepo.kt", l = {461}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.l<t13.d<? super c83.a0<DeviceAppInfoDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f137291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f137292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f137293c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(j jVar, long j8, t13.d<? super t> dVar) {
        super(1, dVar);
        this.f137292b = jVar;
        this.f137293c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new t(this.f137292b, this.f137293c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<DeviceAppInfoDTO>> dVar) {
        return ((t) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f137291a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<DeviceAppInfoDTO>> i0VarF = this.f137292b.f137224a.f(this.f137293c);
        this.f137291a = 1;
        Object objAwait = i0VarF.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
