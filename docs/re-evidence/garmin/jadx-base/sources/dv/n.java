package dv;

import c83.a0;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.bic.SetupWizardRepo$getDeviceSettings$2", f = "SetupWizardRepo.kt", l = {45}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.l<t13.d<? super a0<DeviceSettingsDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f61346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f61347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f61348c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m mVar, long j8, t13.d<? super n> dVar) {
        super(1, dVar);
        this.f61347b = mVar;
        this.f61348c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new n(this.f61347b, this.f61348c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<DeviceSettingsDTO>> dVar) {
        return ((n) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f61346a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<DeviceSettingsDTO>> i0VarB = this.f61347b.f61337a.b(this.f61348c);
        this.f61346a = 1;
        Object objAwait = i0VarB.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
