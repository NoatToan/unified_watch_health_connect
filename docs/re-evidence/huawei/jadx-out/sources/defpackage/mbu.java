package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes10.dex */
public class mbu {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static mbu f41354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f41355c = new Object();
    private lvb e = lvb.e();
    private DeviceCapability d = eej.c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private lxg f41356a = lxg.c(BaseApplication.getContext());

    private mbu() {
    }

    public static mbu e() {
        mbu mbuVar;
        synchronized (f41355c) {
            if (f41354b == null) {
                f41354b = new mbu();
            }
            mbuVar = f41354b;
        }
        return mbuVar;
    }

    public void c(final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("HwTemperatureManager", "isHeartRateModeFromCloud callback is null");
            return;
        }
        DeviceCapability deviceCapabilityC = eej.c();
        this.d = deviceCapabilityC;
        if (deviceCapabilityC == null) {
            LogUtil.j("HwTemperatureManager", "isHeartRateModeFromCloud mDeviceCapability is null");
            return;
        }
        if (deviceCapabilityC.isSupportContinueHeartRate()) {
            mhs.a().getSwitchSetting("continue_heart_rate", new IBaseResponseCallback() { // from class: mbu.1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    int iB = (i == 0 && (obj instanceof String)) ? CommonUtil.b(BaseApplication.getContext(), (String) obj, 0) : 0;
                    boolean z = iB != 0;
                    LogUtil.a("HwTemperatureManager", "CONTINUE_MEASURE_HEART_RATE status : ", Integer.valueOf(iB));
                    iBaseResponseCallback.a(i, Boolean.valueOf(z));
                }
            });
        } else if (!this.d.isSupportHeartRateEnable() || this.d.isSupportContinueHeartRate()) {
            LogUtil.j("HwTemperatureManager", "isHeartRateModeFromCloud, else.");
            iBaseResponseCallback.a(-1, false);
        } else {
            mhs.a().getSwitchSetting("heart_rate_button", new IBaseResponseCallback() { // from class: mbu.5
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("HwTemperatureManager", "HEART_RATE_BUTTON err_code is ", Integer.valueOf(i));
                    boolean zEquals = (i == 0 && (obj instanceof String)) ? "1".equals((String) obj) : false;
                    LogUtil.a("HwTemperatureManager", "updateSwitchStatus isEnable = ", Boolean.valueOf(zEquals));
                    iBaseResponseCallback.a(i, Boolean.valueOf(zEquals));
                }
            });
        }
    }

    public void d(boolean z) {
        mim.e(mgg.d("HwTemperatureManager"), "custom.temperature_unit", String.valueOf(z));
    }

    public void c(Context context, final IBaseResponseCallback iBaseResponseCallback) {
        int i;
        if (Utils.o() || !mbw.a()) {
            LogUtil.j("HwTemperatureManager", "createCloseHeartRemindDialog, isOversea or isn't sport temp.");
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(0, null);
                return;
            }
            return;
        }
        if (a()) {
            LogUtil.j("HwTemperatureManager", "createCloseHeartRemindDialog, isTemperatureClosed.");
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(0, null);
                return;
            }
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(context);
        if (mbw.d()) {
            i = R.string.IDS_temp_slightly_upper_closed_remind_once;
        } else {
            i = R.string.IDS_temp_closed_remind_once;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.b(i).a(R.string.IDS_settings_button_cancal_ios_btn, new View.OnClickListener() { // from class: mbu.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 != null) {
                    iBaseResponseCallback2.a(-1, null);
                }
            }
        }).c(R.string.IDS_settings_AI_Health_Alarm_close, new View.OnClickListener() { // from class: mbu.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("HwTemperatureManager", "createCloseHeartRemindDialog, close");
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 != null) {
                    iBaseResponseCallback2.a(0, null);
                }
                mbu.this.c();
            }
        }).c();
        if (noTitleCustomAlertDialogC.isShowing()) {
            return;
        }
        noTitleCustomAlertDialogC.show();
    }

    public void c() {
        if (Utils.o()) {
            return;
        }
        this.f41356a.d(1, 0, -1);
        this.f41356a.d(2, 0, 0);
        this.f41356a.d(3, 0, 0);
    }

    private boolean a() {
        String strD = mim.d("temperature_upper_remind");
        String strD2 = mim.d("temperature_lower_remind");
        LogUtil.a("HwTemperatureManager", "isTemperatureClosed upperValue : ", strD, ", lowerValue : ", strD2);
        return ((c(strD) > 0.0f ? 1 : (c(strD) == 0.0f ? 0 : -1)) <= 0) && ((c(strD2) > 0.0f ? 1 : (c(strD2) == 0.0f ? 0 : -1)) <= 0);
    }

    private float c(String str) {
        if (str == null) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            LogUtil.e("HwTemperatureManager", "NumberFormatException");
            return 0.0f;
        }
    }

    public void b() {
        LogUtil.a("HwTemperatureManager", "sendStudyCommandToDevice");
        lxw.b(4, 0, 0);
    }

    public String a(boolean z) {
        int i;
        String strE = UnitUtil.e(!z ? 98.96f : 37.2f, 1, 1);
        if (z) {
            i = R.string.IDS_settings_health_temperature_unit;
        } else {
            i = R.string.IDS_temp_unit_fahrenheit;
        }
        return qre.a(i, strE);
    }

    public String[] b(boolean z, int i) {
        String[] strArrE = e(z, i);
        String[] strArr = new String[strArrE.length + 1];
        int i2 = 0;
        strArr[0] = BaseApplication.getContext().getResources().getString(R.string.IDS_settings_about_huawei_cloud_service_action_turn_off);
        if (z) {
            while (i2 < strArrE.length) {
                int i3 = i2 + 1;
                strArr[i3] = BaseApplication.getContext().getResources().getString(R.string.IDS_settings_health_temperature_unit, strArrE[i2]);
                i2 = i3;
            }
        } else {
            while (i2 < strArrE.length) {
                int i4 = i2 + 1;
                strArr[i4] = BaseApplication.getContext().getResources().getString(R.string.IDS_temp_unit_fahrenheit, strArrE[i2]);
                i2 = i4;
            }
        }
        return strArr;
    }

    private String[] e(boolean z, int i) {
        int i2;
        int i3;
        boolean z2 = true;
        if (z) {
            if (i == 0) {
                i2 = 372;
                i3 = 385;
                z2 = false;
            } else {
                i2 = 340;
                i3 = 360;
            }
        } else if (i == 0) {
            i2 = 990;
            i3 = 1013;
            z2 = false;
        } else {
            i2 = 932;
            i3 = 968;
        }
        return e(i2, i3, z2);
    }

    private String[] e(int i, int i2, boolean z) {
        float[] fArrB = mbw.b(i, i2, z);
        String[] strArr = new String[fArrB.length];
        for (int i3 = 0; i3 <= fArrB.length - 1; i3++) {
            strArr[i3] = UnitUtil.e(fArrB[i3], 1, 1);
        }
        return strArr;
    }

    public int c(int i, String str, boolean z) {
        int iC;
        LogUtil.a("HwTemperatureManager", "getPosition tempDialogType : ", Integer.valueOf(i), ", tempData : ", str);
        int i2 = 0;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            float f = Float.parseFloat(str);
            if (f < 340.0f) {
                f *= 10.0f;
            }
            iC = (int) f;
        } catch (NumberFormatException unused) {
            LogUtil.e("HwTemperatureManager", "getPosition NumberFormatException");
            iC = 0;
        }
        if (z) {
            if (iC >= 932) {
                iC = mbw.c(iC);
            }
        } else if (iC < 932) {
            try {
                iC = (int) (Float.parseFloat(mbw.d(String.valueOf(iC / 10.0f))) * 10.0f);
            } catch (NumberFormatException unused2) {
                LogUtil.e("HwTemperatureManager", "getPosition fahrenheit NumberFormatException");
            }
        }
        LogUtil.a("HwTemperatureManager", "getPosition intValue : ", Integer.valueOf(iC));
        int[] iArrC = c(z, i);
        for (int i3 = 0; i3 < iArrC.length; i3++) {
            if (iC == iArrC[i3]) {
                i2 = i3 + 1;
                break;
            }
        }
        LogUtil.a("HwTemperatureManager", "getPosition position : ", Integer.valueOf(i2));
        return i2;
    }

    public int[] c(boolean z, int i) {
        int i2;
        int i3;
        boolean z2 = true;
        if (z) {
            if (i == 0) {
                i2 = 372;
                i3 = 385;
                z2 = false;
            } else {
                i2 = 340;
                i3 = 360;
            }
        } else if (i == 0) {
            i2 = 990;
            i3 = 1013;
            z2 = false;
        } else {
            i2 = 932;
            i3 = 968;
        }
        return mbw.a(i2, i3, z2);
    }
}
