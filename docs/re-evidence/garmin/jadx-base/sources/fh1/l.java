package fh1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lfh1/l;", "Lfh1/a1;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "screenId", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends a1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f71597j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, String str) {
        super(context);
        context.getClass();
        str.getClass();
        this.f71597j = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:39:0x007d  */
    @Override // fb2.a
    public final String t() {
        int i14;
        switch (this.f71597j) {
            case "APP_NATIVE_ID_WEIGHT":
                i14 = R.string.lbl_weight;
                break;
            case "APP_NATIVE_ID_POWER_TO_WEIGHT":
                i14 = R.string.lbl_power_to_weight_ratio;
                break;
            case "APP_NATIVE_ID_BODY_WATER":
                i14 = R.string.lbl_body_water_percent_sign;
                break;
            case "APP_NATIVE_ID_BODY_FAT":
                i14 = R.string.lbl_body_fat_percent_sign;
                break;
            case "APP_NATIVE_ID_MUSCLE_MASS":
                i14 = R.string.lbl_skeletal_muscle_mass;
                break;
            case "APP_NATIVE_ID_BMI":
                i14 = R.string.lbl_weight_characteristic_bmi;
                break;
            case "APP_NATIVE_ID_BONE_MASS":
                i14 = R.string.lbl_weight_characteristic_bone_mass;
                break;
            case "APP_NATIVE_ID_WEATHER":
                i14 = R.string.weather_channel_name;
                break;
            case "APP_NATIVE_ID_WEIGHT_DELTA":
                i14 = R.string.lbl_weight_trend;
                break;
            default:
                i14 = -1;
                break;
        }
        String strB = b(i14);
        strB.getClass();
        return strB;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    @Override // fb2.a
    public final Integer u() {
        int i14;
        switch (this.f71597j) {
            case "APP_NATIVE_ID_WEIGHT":
                i14 = 2131232623;
                break;
            case "APP_NATIVE_ID_POWER_TO_WEIGHT":
                i14 = 2131232621;
                break;
            case "APP_NATIVE_ID_BODY_WATER":
                i14 = 2131232619;
                break;
            case "APP_NATIVE_ID_BODY_FAT":
                i14 = 2131232618;
                break;
            case "APP_NATIVE_ID_MUSCLE_MASS":
                i14 = 2131232625;
                break;
            case "APP_NATIVE_ID_BMI":
                i14 = 2131232617;
                break;
            case "APP_NATIVE_ID_BONE_MASS":
                i14 = 2131232620;
                break;
            case "APP_NATIVE_ID_WEATHER":
                i14 = 2131232622;
                break;
            case "APP_NATIVE_ID_WEIGHT_DELTA":
                i14 = 2131232624;
                break;
            default:
                i14 = R.drawable.circle_gray;
                break;
        }
        return Integer.valueOf(i14);
    }

    @Override // fh1.a1
    public final com.garmin.android.apps.connectmobile.devices.model.y z(DeviceSettingsDTO deviceSettingsDTO) {
        deviceSettingsDTO.getClass();
        com.garmin.android.apps.connectmobile.devices.model.z zVarH = deviceSettingsDTO.H();
        if (zVarH != null) {
            return zVarH.C(this.f71597j);
        }
        return null;
    }
}
