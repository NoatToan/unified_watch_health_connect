package com.huawei.health.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import defpackage.lua;
import defpackage.lvb;
import defpackage.qre;
import defpackage.wuw;
import defpackage.xkb;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes30.dex */
public class PhysiologicalCycleReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, Intent intent) {
        final String stringExtra = intent.getStringExtra("switchType");
        LogUtil.a("PhysiologicalCycleReceiver", "switchType = ", stringExtra, ", currTime = ", Long.valueOf(System.currentTimeMillis()));
        ThreadPoolManager.c().execute(new Runnable() { // from class: gst
            @Override // java.lang.Runnable
            public final void run() {
                this.f36000c.b(context, stringExtra);
            }
        });
    }

    public /* synthetic */ void b(Context context, String str) {
        if (b() || !Utils.h()) {
            return;
        }
        c(context, str);
    }

    private boolean b() {
        Map<String, DeviceCapability> mapD = lvb.e().d(2, "", "PhysiologicalCycleReceiver");
        if (mapD == null || mapD.isEmpty()) {
            LogUtil.j("PhysiologicalCycleReceiver", "isDeviceSupport, capabilityMap is null or empty");
            return false;
        }
        for (DeviceCapability deviceCapability : mapD.values()) {
            if (deviceCapability == null) {
                LogUtil.j("PhysiologicalCycleReceiver", "isDeviceSupport, deviceCapability is null.");
            } else if (deviceCapability.isSupportMenstrual()) {
                return true;
            }
        }
        return false;
    }

    private void c(Context context, String str) {
        String string;
        LogUtil.a("PhysiologicalCycleReceiver", "enter showNotification");
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("PhysiologicalCycleReceiver", "switchType is empty.");
            return;
        }
        if (a(context, str) != 1) {
            LogUtil.j("PhysiologicalCycleReceiver", "switchType: ", str, " is closed.");
            return;
        }
        if ("easyPregnancyStartSwitch".equals(str) || "easyPregnancyEndSwitch".equals(str)) {
            d(context, str);
            return;
        }
        str.hashCode();
        if (!str.equals("menstrualEndSwitch")) {
            string = !str.equals("menstrualStartSwitch") ? "" : String.format(Locale.getDefault(), BaseApplication.getContext().getString(R.string.IDS_menstrual_period_expected_start_new), 3);
        } else {
            string = BaseApplication.getContext().getString(R.string.IDS_menstrual_period_end);
        }
        CommonUtil.setNotification(context, BaseApplication.getContext().getString(R.string.IDS_hw_physiological_cycle), string, "huaweihealth://huaweihealth.app/openwith?isNeedLogin=true&address=com.huawei.health.h5.cycle-calendar?h5pro=true");
    }

    private void d(final Context context, final String str) {
        xkb.d("900300050", new HiDataReadResultListener() { // from class: com.huawei.health.receiver.PhysiologicalCycleReceiver.3
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                String strF;
                boolean zA = PhysiologicalCycleReceiver.this.a(obj, i);
                ReleaseLogUtil.d("R_PhysiologicalCycleReceiver", "showNotificationEasyPregnancy isSupportOvulationFertilePeriod ", Boolean.valueOf(zA));
                if (zA) {
                    String str2 = str;
                    str2.hashCode();
                    if (str2.equals("easyPregnancyStartSwitch")) {
                        strF = qre.f(R.string.IDS_pregnancies_expected_start);
                    } else {
                        strF = !str2.equals("easyPregnancyEndSwitch") ? "" : qre.f(R.string.IDS_pregnancies_expected_end);
                    }
                    CommonUtil.setNotification(context, qre.f(R.string.IDS_hw_physiological_cycle), strF, "huaweihealth://huaweihealth.app/openwith?isNeedLogin=true&address=com.huawei.health.h5.cycle-calendar?h5pro=true");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Object obj, int i) {
        ReleaseLogUtil.d("PhysiologicalCycleReceiver", "isSupportOvulationFertilePeriod errorCode ", Integer.valueOf(i), " isPullAllStatus ", Boolean.valueOf(lua.e()));
        if (i == 0 && wuw.a("PhysiologicalCycleReceiver", obj) != null) {
            return wuw.e();
        }
        return false;
    }

    private int a(Context context, String str) {
        HiUserPreference userPreference = HiHealthManager.d(context).getUserPreference("com.huawei.health.mc");
        if (userPreference == null || TextUtils.isEmpty(userPreference.getValue())) {
            LogUtil.j("PhysiologicalCycleReceiver", "userPreference is null or getValue is empty.");
            return 0;
        }
        try {
            return new JSONObject(userPreference.getValue()).optInt(str, 0);
        } catch (JSONException unused) {
            LogUtil.e("PhysiologicalCycleReceiver", "isSwitchOpen JSONException");
            return 0;
        }
    }
}
