package lr2;

import com.garmin.feature.garminpay.ui.devicesettings.DeviceSettingsActivity;
import com.google.common.base.Optional;
import o53.b0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.ui.devicesettings.DeviceSettingsActivity$removeCard$1", f = "DeviceSettingsActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f114400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeviceSettingsActivity f114401b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, DeviceSettingsActivity deviceSettingsActivity, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f114400a = str;
        this.f114401b = deviceSettingsActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f114400a, this.f114401b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        ms2.g gVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        Logger logger = DeviceSettingsActivity.f51994x;
        logger.debug("removeCard");
        DeviceSettingsActivity deviceSettingsActivity = this.f114401b;
        String str = this.f114400a;
        if (p005kotlin.jvm.internal.s.g((str == null || (gVar = deviceSettingsActivity.f52000l) == null) ? null : Boolean.valueOf(gVar.f(str)), Boolean.TRUE)) {
            com.garmin.feature.garminpay.ui.devicesettings.a aVar2 = deviceSettingsActivity.f51999k;
            if (aVar2 == null) {
                p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                throw null;
            }
            mr2.d dVar = deviceSettingsActivity.f51997i;
            if (dVar == null) {
                p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                throw null;
            }
            br2.f fVarH4 = dVar.h4();
            mr2.d dVar2 = deviceSettingsActivity.f51997i;
            if (dVar2 == null) {
                p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                throw null;
            }
            Optional<hs2.c> optionalD = dVar2.y2().d();
            hs2.c cVarOrNull = optionalD != null ? optionalD.orNull() : null;
            boolean zCa = deviceSettingsActivity.ca();
            boolean zEa = deviceSettingsActivity.ea();
            mr2.d dVar3 = deviceSettingsActivity.f51997i;
            if (dVar3 == null) {
                p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                throw null;
            }
            com.garmin.feature.garminpay.ui.devicesettings.a.z(aVar2, fVarH4, cVarOrNull, zCa, zEa, dVar3.c1().d());
        } else {
            logger.error("removeCard: failed to remove card");
            br2.c.f19585a.g(null, deviceSettingsActivity);
        }
        hn2.c.ba(deviceSettingsActivity, Boolean.FALSE, null, null, 14);
        return Unit.INSTANCE;
    }
}
