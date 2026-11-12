package lr2;

import bm.y;
import com.garmin.feature.garminpay.ui.devicesettings.DeviceSettingsActivity;
import com.garmin.feature.garminpay.ui.passcode.PasscodeEntryActivity;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.ui.devicesettings.DeviceSettingsActivity$navigateToChangePasscode$1$1", f = "DeviceSettingsActivity.kt", l = {446}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f114398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeviceSettingsActivity f114399b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(DeviceSettingsActivity deviceSettingsActivity, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f114399b = deviceSettingsActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f114399b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f114398a;
        DeviceSettingsActivity deviceSettingsActivity = this.f114399b;
        if (i14 == 0) {
            o13.r.b(obj);
            mr2.d dVar = deviceSettingsActivity.f51997i;
            if (dVar == null) {
                p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                throw null;
            }
            this.f114398a = 1;
            obj = dVar.N(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            PasscodeEntryActivity.a aVar2 = PasscodeEntryActivity.f52121n;
            mr2.d dVar2 = deviceSettingsActivity.f51997i;
            if (dVar2 == null) {
                p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                throw null;
            }
            Long l14 = new Long(dVar2.getDeviceUnitId());
            mr2.d dVar3 = deviceSettingsActivity.f51997i;
            if (dVar3 == null) {
                p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                throw null;
            }
            oc.b.L(deviceSettingsActivity, qy2.d.f148594a, PasscodeEntryActivity.a.a(aVar2, deviceSettingsActivity, l14, dVar3.getDeviceName()), deviceSettingsActivity.f52004p);
        } else {
            DeviceSettingsActivity.a aVar3 = DeviceSettingsActivity.f51993w;
            deviceSettingsActivity.getClass();
            br2.c cVar = br2.c.f19585a;
            mr2.d dVar4 = deviceSettingsActivity.f51997i;
            if (dVar4 == null) {
                p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                throw null;
            }
            cVar.d(deviceSettingsActivity, dVar4.getDeviceName(), new y(15));
        }
        return Unit.INSTANCE;
    }
}
