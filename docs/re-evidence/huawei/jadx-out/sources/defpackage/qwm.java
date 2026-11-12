package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes43.dex */
public class qwm {
    public static void a(String str, final IBaseResponseCallback iBaseResponseCallback) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("MenstrualPredictUtils", "getSwitchState switchKey is null");
        } else {
            mhs.a().getSwitchSetting(c(str), new IBaseResponseCallback() { // from class: qwu
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    qwm.b(iBaseResponseCallback, i, obj);
                }
            });
        }
    }

    static /* synthetic */ void b(IBaseResponseCallback iBaseResponseCallback, int i, Object obj) {
        String str;
        LogUtil.a("MenstrualPredictUtils", "initSwitchStatus errorCode = ", Integer.valueOf(i));
        if (i == 0 && (obj instanceof String)) {
            str = (String) obj;
        } else {
            str = "0";
        }
        LogUtil.a("MenstrualPredictUtils", "initSwitchStatus switchStatus = ", str);
        iBaseResponseCallback.a(0, Boolean.valueOf("1".equals(str)));
    }

    private static String c(String str) {
        "menstrualPredictSwitch".equals(str);
        return "menstrual_predict_switch";
    }

    public static void c(String str, String str2, final IBaseResponseCallback iBaseResponseCallback) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("MenstrualPredictUtils", "setSwitchStatusBi switchKey or isChecked is null");
        } else {
            mhs.a().sendSettingSwitchCommand("hw.unitedevice.physiological", "hw.watch.health.physiological", 900300012L, str2);
            mhs.a().setSwitchSetting(c(str), str2, new IBaseResponseCallback() { // from class: qws
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    qwm.a(iBaseResponseCallback, i, obj);
                }
            });
        }
    }

    static /* synthetic */ void a(IBaseResponseCallback iBaseResponseCallback, int i, Object obj) {
        LogUtil.a("MenstrualPredictUtils", "setMenstrualPredictStatus errorCode = ", Integer.valueOf(i));
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(i, obj);
        }
    }

    public static void e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("MenstrualPredictUtils", "setSwitchStatusBi isChecked is null");
            return;
        }
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("event", str);
        map.put("setPath", "1");
        String strValue = AnalyticsValue.MENSTRUAL_PREDICT_SWITCH_EVENT.value();
        LogUtil.a("MenstrualPredictUtils", "setSwitchEventBi value = ", strValue, ", map = ", map.toString());
        lmf.d().c(BaseApplication.b(), strValue, map, 0);
    }
}
