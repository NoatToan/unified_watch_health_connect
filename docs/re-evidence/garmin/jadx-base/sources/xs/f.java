package xs;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.device.datatypes.DeviceProfile;
import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.u;
import q53.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lxs/c;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activityrecording.domain.GetDeviceConnectionStateUseCase$invoke$1", f = "GetDeviceConnectionStateUseCase.kt", l = {45}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements p<t<? super c>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f192048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f192049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f192050c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"xs/f$a", "Lxf0/b;", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends xf0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t<c> f192051a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(t<? super c> tVar) {
            this.f192051a = tVar;
        }

        @Override // xf0.b
        public final void deviceConnected(pi2.g gVar) {
            Parcelable parcelable;
            gVar.getClass();
            Bundle eventData = gVar.getEventData();
            DeviceProfile deviceProfile = null;
            if (eventData != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) eventData.getParcelable("GCM_extra_device_profile", DeviceProfile.class);
                } else {
                    Parcelable parcelable2 = eventData.getParcelable("GCM_extra_device_profile");
                    parcelable = (DeviceProfile) (parcelable2 instanceof DeviceProfile ? parcelable2 : null);
                }
                deviceProfile = (DeviceProfile) parcelable;
            }
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "GetDeviceConnectionStateUseCase", "deviceConnected " + deviceProfile);
            this.f192051a.i(new c.a(deviceProfile));
        }

        @Override // xf0.b
        public final void deviceDisconnected(pi2.h hVar) {
            Parcelable parcelable;
            hVar.getClass();
            Bundle eventData = hVar.getEventData();
            DeviceProfile deviceProfile = null;
            if (eventData != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) eventData.getParcelable("GCM_extra_device_profile", DeviceProfile.class);
                } else {
                    Parcelable parcelable2 = eventData.getParcelable("GCM_extra_device_profile");
                    parcelable = (DeviceProfile) (parcelable2 instanceof DeviceProfile ? parcelable2 : null);
                }
                deviceProfile = (DeviceProfile) parcelable;
            }
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "GetDeviceConnectionStateUseCase", "deviceDisconnected " + deviceProfile);
            this.f192051a.i(new c.b(deviceProfile));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f192050c = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f fVar = new f(this.f192050c, dVar);
        fVar.f192049b = obj;
        return fVar;
    }

    @Override // e23.p
    public final Object invoke(t<? super c> tVar, t13.d<? super Unit> dVar) {
        return ((f) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        t tVar = (t) this.f192049b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f192048a;
        if (i14 == 0) {
            r.b(obj);
            DeviceProfile deviceProfile = (DeviceProfile) u.H(da2.d.b().f58886a.f111646e.a(this.f192050c.f192047a));
            tVar.i(deviceProfile == null ? new c.b(null) : new c.a(deviceProfile));
            a aVar2 = new a(tVar);
            oi2.a.f132270a.getClass();
            oi2.a.C2513a.b(aVar2);
            xn.r rVar = new xn.r(aVar2, 3);
            this.f192049b = null;
            this.f192048a = 1;
            if (q53.r.a(tVar, rVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
