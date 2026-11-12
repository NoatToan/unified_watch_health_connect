package defpackage;

import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.hwmenstrualmanager.bean.MenstrualSwitchStatus;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtils;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class miq {
    public void e(final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("HwMenstrualHelper", "queryMenstrualSwitch callback null");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: miq.3
                @Override // java.lang.Runnable
                public void run() {
                    HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("com.huawei.health.mc");
                    if (userPreference == null || userPreference.getValue() == null) {
                        LogUtil.j("HwMenstrualHelper", "queryMenstrualSwitch userPreference value empty");
                        iBaseResponseCallback.a(-1, null);
                        return;
                    }
                    String value = userPreference.getValue();
                    LogUtil.a("HwMenstrualHelper", "queryMenstrualSwitch value:", value);
                    try {
                        MenstrualSwitchStatus menstrualSwitchStatus = new MenstrualSwitchStatus();
                        JSONObject jSONObject = new JSONObject(value);
                        menstrualSwitchStatus.setMasterSwitch(jSONObject.getInt("masterSwitch"));
                        menstrualSwitchStatus.setMenstruationStartRemindSwitch(jSONObject.getInt("menstrualStartSwitch"));
                        menstrualSwitchStatus.setMenstruationEndRemindSwitch(jSONObject.getInt("menstrualEndSwitch"));
                        menstrualSwitchStatus.setEasyPregnancyStartSwitch(jSONObject.getInt("easyPregnancyStartSwitch"));
                        menstrualSwitchStatus.setEasyPregnancyEndSwitch(jSONObject.getInt("easyPregnancyEndSwitch"));
                        iBaseResponseCallback.a(0, menstrualSwitchStatus);
                    } catch (JSONException unused) {
                        LogUtil.e("HwMenstrualHelper", "queryMenstrualSwitch JSONException");
                        iBaseResponseCallback.a(-1, null);
                    }
                }
            });
        }
    }

    public static int d(Object obj, AtomicBoolean atomicBoolean) {
        HiSampleConfig hiSampleConfig;
        if (!njy.b(obj, HiSampleConfig.class)) {
            return 1;
        }
        List list = (List) obj;
        if (njy.e(list) || (hiSampleConfig = (HiSampleConfig) list.get(0)) == null) {
            return 1;
        }
        String configData = hiSampleConfig.getConfigData();
        if (TextUtils.isEmpty(configData)) {
            return 1;
        }
        try {
            String strOptString = new JSONObject(configData).optString("ovuFerPerSwitch");
            atomicBoolean.set(true);
            return CommonUtils.j(strOptString);
        } catch (JSONException e) {
            ExceptionUtils.c(e);
            return 1;
        }
    }
}
