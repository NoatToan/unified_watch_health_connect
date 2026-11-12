package lr2;

import android.content.Intent;
import com.garmin.feature.garminpay.ui.devicesettings.DeviceSettingsActivity;
import com.garmin.feature.garminpay.ui.devicesettings.RapidPassSettingActivity;
import com.garmin.feature.garminpay.ui.devicesettings.RapidPassThresholdSettingActivity;
import com.garmin.feature.garminpay.ui.userwallet.UserWalletActivity;
import com.google.common.base.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import o53.f0;
import p005kotlin.Unit;
import vn2.b1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeviceSettingsActivity f114386b;

    public /* synthetic */ d(DeviceSettingsActivity deviceSettingsActivity, int i14) {
        this.f114385a = i14;
        this.f114386b = deviceSettingsActivity;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0121  */
    /* JADX WARN: Code duplicated, block: B:65:0x0129  */
    /* JADX WARN: Code duplicated, block: B:67:0x0131  */
    /* JADX WARN: Code duplicated, block: B:69:0x014b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0174  */
    /* JADX WARN: Code duplicated, block: B:72:0x0178  */
    /* JADX WARN: Code duplicated, block: B:74:0x017c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0180  */
    @Override // e23.a
    public final Object invoke() {
        Object next;
        vr2.q qVar;
        qy2.d dVar;
        RapidPassThresholdSettingActivity.b bVar;
        mr2.d dVar2;
        long deviceUnitId;
        mr2.d dVar3;
        hs2.c cVar;
        mr2.d dVar4;
        byte[] bArrD;
        Optional<hs2.c> optionalD;
        int i14 = this.f114385a;
        int i15 = 7;
        DeviceSettingsActivity deviceSettingsActivity = this.f114386b;
        switch (i14) {
            case 0:
                DeviceSettingsActivity.a aVar = DeviceSettingsActivity.f51993w;
                return deviceSettingsActivity;
            case 1:
                DeviceSettingsActivity.a aVar2 = DeviceSettingsActivity.f51993w;
                qy2.d dVar5 = qy2.d.f148594a;
                UserWalletActivity.f52217q.getClass();
                Intent intentA = UserWalletActivity.a.a(deviceSettingsActivity);
                intentA.addFlags(67108864);
                Unit unit = Unit.INSTANCE;
                oc.b.K(deviceSettingsActivity, dVar5, intentA);
                return Unit.INSTANCE;
            case 2:
                e23.a<Unit> aVar3 = deviceSettingsActivity.f52002n;
                if (aVar3 != null) {
                    aVar3.invoke();
                }
                return Unit.INSTANCE;
            case 3:
                mr2.d dVar6 = deviceSettingsActivity.f51997i;
                if (dVar6 == null) {
                    p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                    throw null;
                }
                mr2.b bVarD = dVar6.r4().d();
                bVarD.getClass();
                Iterator it = ((List) bVarD.f120361f.getValue()).iterator();
                do {
                    if (it.hasNext()) {
                        next = it.next();
                        bArrD = ((vr2.q) next).d();
                        mr2.d dVar7 = deviceSettingsActivity.f51997i;
                        if (dVar7 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        optionalD = dVar7.y2().d();
                        optionalD.getClass();
                    } else {
                        next = null;
                    }
                    qVar = (vr2.q) next;
                    if (qVar != null) {
                        dVar = qy2.d.f148594a;
                        bVar = RapidPassThresholdSettingActivity.f52046j;
                        dVar2 = deviceSettingsActivity.f51997i;
                        if (dVar2 != null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        deviceUnitId = dVar2.getDeviceUnitId();
                        dVar3 = deviceSettingsActivity.f51997i;
                        if (dVar3 != null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        Optional<hs2.c> optionalD2 = dVar3.y2().d();
                        optionalD2.getClass();
                        hs2.c cVar2 = optionalD2.get();
                        cVar2.getClass();
                        cVar = cVar2;
                        dVar4 = deviceSettingsActivity.f51997i;
                        if (dVar4 != null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        String deviceName = dVar4.getDeviceName();
                        bVar.getClass();
                        deviceName.getClass();
                        Intent intent = new Intent(deviceSettingsActivity, (Class<?>) RapidPassThresholdSettingActivity.class);
                        intent.putExtra("com.garmin.android.apps.EXTRA_UNIT_ID", deviceUnitId);
                        intent.putExtra("extra.current.card.item", qVar);
                        intent.putExtra("extra.device.express.card", cVar);
                        intent.putExtra("extra.device.name", deviceName);
                        oc.b.K(deviceSettingsActivity, dVar, intent);
                    } else {
                        DeviceSettingsActivity.f51994x.debug("navigateToSetExpressCardNotificationThreshold(): currentWalletCardItem is null!");
                        deviceSettingsActivity.J3(new b1(5));
                    }
                    return Unit.INSTANCE;
                } while (!Arrays.equals(bArrD, optionalD.get().f85441a));
                qVar = (vr2.q) next;
                if (qVar != null) {
                    dVar = qy2.d.f148594a;
                    bVar = RapidPassThresholdSettingActivity.f52046j;
                    dVar2 = deviceSettingsActivity.f51997i;
                    if (dVar2 != null) {
                        p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                        throw null;
                    }
                    deviceUnitId = dVar2.getDeviceUnitId();
                    dVar3 = deviceSettingsActivity.f51997i;
                    if (dVar3 != null) {
                        p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                        throw null;
                    }
                    Optional<hs2.c> optionalD3 = dVar3.y2().d();
                    optionalD3.getClass();
                    hs2.c cVar3 = optionalD3.get();
                    cVar3.getClass();
                    cVar = cVar3;
                    dVar4 = deviceSettingsActivity.f51997i;
                    if (dVar4 != null) {
                        p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                        throw null;
                    }
                    String deviceName2 = dVar4.getDeviceName();
                    bVar.getClass();
                    deviceName2.getClass();
                    Intent intent2 = new Intent(deviceSettingsActivity, (Class<?>) RapidPassThresholdSettingActivity.class);
                    intent2.putExtra("com.garmin.android.apps.EXTRA_UNIT_ID", deviceUnitId);
                    intent2.putExtra("extra.current.card.item", qVar);
                    intent2.putExtra("extra.device.express.card", cVar);
                    intent2.putExtra("extra.device.name", deviceName2);
                    oc.b.K(deviceSettingsActivity, dVar, intent2);
                } else {
                    DeviceSettingsActivity.f51994x.debug("navigateToSetExpressCardNotificationThreshold(): currentWalletCardItem is null!");
                    deviceSettingsActivity.J3(new b1(5));
                }
                return Unit.INSTANCE;
            case 4:
                mr2.d dVar8 = deviceSettingsActivity.f51997i;
                if (dVar8 == null) {
                    p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                    throw null;
                }
                if (dVar8.f()) {
                    ge1.b.T(f0.w(deviceSettingsActivity), null, null, new j(deviceSettingsActivity, null), 3);
                } else {
                    br2.c.f19585a.a(new ll0.b(7), deviceSettingsActivity);
                }
                return Unit.INSTANCE;
            case 5:
                DeviceSettingsActivity.a aVar4 = DeviceSettingsActivity.f51993w;
                br2.c.f19585a.o(deviceSettingsActivity, new d(deviceSettingsActivity, i15), null);
                return Unit.INSTANCE;
            case 6:
                DeviceSettingsActivity.a aVar5 = DeviceSettingsActivity.f51993w;
                qy2.d dVar9 = qy2.d.f148594a;
                RapidPassSettingActivity.b bVar2 = RapidPassSettingActivity.f52026j;
                DeviceSettingsActivity deviceSettingsActivity2 = this.f114386b;
                mr2.d dVar10 = deviceSettingsActivity2.f51997i;
                if (dVar10 == null) {
                    p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                    throw null;
                }
                long deviceUnitId2 = dVar10.getDeviceUnitId();
                mr2.d dVar11 = deviceSettingsActivity2.f51997i;
                if (dVar11 == null) {
                    p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                    throw null;
                }
                mr2.b bVarD2 = dVar11.r4().d();
                bVarD2.getClass();
                ArrayList arrayList = new ArrayList((List) bVarD2.f120360e.getValue());
                mr2.d dVar12 = deviceSettingsActivity2.f51997i;
                if (dVar12 == null) {
                    p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                    throw null;
                }
                Optional<hs2.c> optionalD4 = dVar12.y2().d();
                hs2.c cVarOrNull = optionalD4 != null ? optionalD4.orNull() : null;
                mr2.d dVar13 = deviceSettingsActivity2.f51997i;
                if (dVar13 == null) {
                    p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                    throw null;
                }
                String deviceName3 = dVar13.getDeviceName();
                bVar2.getClass();
                oc.b.K(deviceSettingsActivity2, dVar9, RapidPassSettingActivity.b.a(deviceSettingsActivity2, deviceUnitId2, arrayList, cVarOrNull, deviceName3));
                return Unit.INSTANCE;
            default:
                qr2.a aVar6 = deviceSettingsActivity.f51998j;
                if (aVar6 == null) {
                    p005kotlin.jvm.internal.s.m("resetWalletViewModel");
                    throw null;
                }
                mr2.d dVar14 = deviceSettingsActivity.f51997i;
                if (dVar14 != null) {
                    aVar6.N1(dVar14.getDeviceUnitId());
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                throw null;
        }
    }
}
