package zd0;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.device.datatypes.DeviceProfile;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lzd0/c;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domain.GetDeviceConnectionStateUseCase$invoke$1", f = "GetDeviceConnectionStateUseCase.kt", l = {43}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<q53.t<? super c>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f204035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f204036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f204037c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"zd0/j$a", "Lxf0/b;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends xf0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Long f204038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q53.t<c> f204039b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Long l14, q53.t<? super c> tVar) {
            this.f204038a = l14;
            this.f204039b = tVar;
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
            Long l14 = this.f204038a;
            if (l14 == null || (deviceProfile != null && deviceProfile.getF92746j() == l14.longValue())) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.b(a2Var, "GetDeviceConnectionStateUseCase", "deviceConnected " + deviceProfile);
                this.f204039b.i(new c.a(deviceProfile));
            }
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
            Long l14 = this.f204038a;
            if (l14 == null || (deviceProfile != null && deviceProfile.getF92746j() == l14.longValue())) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.b(a2Var, "GetDeviceConnectionStateUseCase", "deviceDisconnected " + deviceProfile);
                this.f204039b.i(new c.b(deviceProfile));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Long l14, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f204037c = l14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j jVar = new j(this.f204037c, dVar);
        jVar.f204036b = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(q53.t<? super c> tVar, t13.d<? super Unit> dVar) {
        return ((j) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        q53.t tVar = (q53.t) this.f204036b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f204035a;
        if (i14 == 0) {
            o13.r.b(obj);
            tVar.i(c.C3806c.f203990a);
            a aVar2 = new a(this.f204037c, tVar);
            oi2.a.f132270a.getClass();
            oi2.a.C2513a.b(aVar2);
            yr.o0 o0Var = new yr.o0(aVar2, 17);
            this.f204036b = null;
            this.f204035a = 1;
            if (q53.r.a(tVar, o0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
