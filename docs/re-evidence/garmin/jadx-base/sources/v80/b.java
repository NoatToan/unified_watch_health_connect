package v80;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.device.datatypes.DeviceProfile;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.u;
import v13.i;
import vb.h;
import wr.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.passcode.domain.ResetPasscodeOnDeviceUseCase$invoke$1", f = "ResetPasscodeOnDeviceUseCase.kt", l = {31}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f176199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f176200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f176201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f176202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f176203e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j8, a aVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f176202d = j8;
        this.f176203e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b bVar = new b(this.f176202d, this.f176203e, dVar);
        bVar.f176201c = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        DeviceProfile deviceProfile;
        String f92741e;
        long j8;
        b0 b0Var = (b0) this.f176201c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f176200b;
        if (i14 == 0) {
            r.b(obj);
            StringBuilder sb3 = new StringBuilder("Sending reset passcode request to device unitId[");
            long j14 = this.f176202d;
            sb3.append(j14);
            sb3.append("] ");
            String string = sb3.toString();
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "ResetPasscodeOnDeviceUseCase", string);
            a aVar3 = this.f176203e;
            DeviceProfile[] deviceProfileArrA = ((da2.b) aVar3.f176197a).a(j14);
            int length = deviceProfileArrA.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length) {
                    deviceProfile = null;
                    break;
                }
                deviceProfile = deviceProfileArrA[i15];
                if (deviceProfile.getConnectionType() == 1) {
                    break;
                }
                i15++;
            }
            if (deviceProfile == null) {
                deviceProfile = (DeviceProfile) u.H(deviceProfileArrA);
            }
            if (deviceProfile == null || (f92741e = deviceProfile.getF92741e()) == null) {
                String strE = org.apache.commons.lang3.e.e(j14, "Connection id not found for device unit id ");
                i2.a aVar4 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar4.getClass();
                i2.a.f(a2Var2, "ResetPasscodeOnDeviceUseCase", strE);
            } else {
                y92.b bVar = (y92.b) aVar3.f176197a.getCapability(f92741e, y92.b.class);
                if (bVar != null) {
                    try {
                        this.f176201c = b0Var;
                        this.f176199a = j14;
                        this.f176200b = 1;
                        if (bVar.l(this) == aVar) {
                            return aVar;
                        }
                        j8 = j14;
                    } catch (Exception e4) {
                        e = e4;
                        j8 = j14;
                        String strN = g.n("Failed to send reset passcode request to device unitId[", j8, "] ", e);
                        i2.a aVar5 = i2.f36769a;
                        a2 a2Var3 = a2.GENERAL;
                        aVar5.getClass();
                        i2.a.f(a2Var3, "ResetPasscodeOnDeviceUseCase", strN);
                    }
                } else {
                    String strE2 = org.apache.commons.lang3.e.e(j14, "DevicePasscodeProtobufHandler not found for device unit id ");
                    i2.a aVar6 = i2.f36769a;
                    a2 a2Var4 = a2.GENERAL;
                    aVar6.getClass();
                    i2.a.f(a2Var4, "ResetPasscodeOnDeviceUseCase", strE2);
                }
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j8 = this.f176199a;
        try {
            r.b(obj);
        } catch (Exception e14) {
            e = e14;
            String strN2 = g.n("Failed to send reset passcode request to device unitId[", j8, "] ", e);
            i2.a aVar7 = i2.f36769a;
            a2 a2Var5 = a2.GENERAL;
            aVar7.getClass();
            i2.a.f(a2Var5, "ResetPasscodeOnDeviceUseCase", strN2);
        }
        i2.a aVar8 = i2.f36769a;
        a2 a2Var6 = a2.GENERAL;
        aVar8.getClass();
        i2.a.b(a2Var6, "ResetPasscodeOnDeviceUseCase", "Sent reset passcode request to device unitId[" + j8 + "] ");
        return Unit.INSTANCE;
    }
}
