package bi1;

import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public final class s {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18068a;

        static {
            int[] iArr = new int[DeviceSettingsDTO.q.values().length];
            try {
                iArr[DeviceSettingsDTO.q.ANALOG_GENERIC_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeviceSettingsDTO.q.ANALOG_GENERIC_2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeviceSettingsDTO.q.ANALOG_GENERIC_3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DeviceSettingsDTO.q.ANALOG_GENERIC_4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DeviceSettingsDTO.q.ANALOG_GENERIC_5.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DeviceSettingsDTO.q.ANALOG_GENERIC_6.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f18068a = iArr;
        }
    }

    public static final v a(DeviceSettingsDTO.q qVar) {
        qVar.getClass();
        switch (a.f18068a[qVar.ordinal()]) {
            case 1:
                return v.VVM3_DIGITAL_SUB_EYE;
            case 2:
                return v.VVM3_MODERN_CURVE;
            case 3:
                return v.VVM3_CURVE_SUB_EYE;
            case 4:
                return v.VVM3_BIG_DATA_TITLE_VALUE;
            case 5:
                return v.VVM3_ICON_VALUE;
            case 6:
                return v.VVM3_ANALOG_CURVY_SUB_EYE;
            default:
                return v.VVM3_DIGITAL_SUB_EYE;
        }
    }
}
