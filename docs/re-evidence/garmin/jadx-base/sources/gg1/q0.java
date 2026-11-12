package gg1;

import com.garmin.android.apps.connectmobile.settings.MedicalDeviceUdiActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class q0 extends p005kotlin.jvm.internal.q implements e23.p<Integer, Integer, Integer> {
    public q0(Object obj) {
        super(2, obj, MedicalDeviceUdiActivity.class, "selectUdiVersion", "selectUdiVersion(II)I", 0);
    }

    @Override // e23.p
    public final Integer invoke(Integer num, Integer num2) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        MedicalDeviceUdiActivity medicalDeviceUdiActivity = (MedicalDeviceUdiActivity) this.receiver;
        int i14 = MedicalDeviceUdiActivity.f41570a;
        medicalDeviceUdiActivity.getClass();
        com.garmin.android.apps.connectmobile.l.g().getClass();
        if (gh2.i.f77458c.a().f77477b.c("unreleased_ecg_udi_regulatory_markings")) {
            iIntValue = iIntValue2;
        }
        return Integer.valueOf(iIntValue);
    }
}
