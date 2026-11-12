package defpackage;

import android.text.TextUtils;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class qhp {
    public static void b(final String str, final boolean z) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final String str2 = z ? "1" : "0";
        lsy.a(new Runnable() { // from class: qhp.1
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("SportSwitchUtils", "setSportSwitch configId ", str, " isChecked ", Boolean.valueOf(z));
                qhp.d(str, qhp.b(str2, jCurrentTimeMillis));
                qhp.c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(final String str, final qhg qhgVar) {
        qhq.d("9002", str, HiJsonUtil.d(qhgVar), new HiDataOperateListener() { // from class: qhp.5
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                LogUtil.a("SportSwitchUtils", "setSportSwitch configId ", str, " switchStatus ", qhgVar.d(), "errorCode: ", Integer.valueOf(i), ", object: ", obj);
            }
        }, qhgVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c() {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(900000000);
        hiSyncOption.setSyncMethod(2);
        HiHealthNativeApi.a(BaseApplication.getContext()).synCloud(hiSyncOption, null);
    }

    public static void d(List<String> list, final IBaseResponseCallback iBaseResponseCallback, final String str) {
        if (njy.e(list) || iBaseResponseCallback == null) {
            LogUtil.j("SportSwitchUtils", "getSwitchStatusFromDb keys or callback is null");
            return;
        }
        final HashMap map = new HashMap(16);
        ReleaseLogUtil.c("SportSwitchUtils", "getSwitchStatusFromDb configIdList ", list.toString());
        qhq.b("9002", list, new HiDataReadResultListener() { // from class: qhp.4
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                ReleaseLogUtil.c("SportSwitchUtils", "onResult errorCode: ", Integer.valueOf(i), ", data: ", obj);
                if (!njy.b(obj, HiSampleConfig.class)) {
                    LogUtil.j("SportSwitchUtils", "list getActiveGoals isListTypeMatch false ");
                    iBaseResponseCallback.a(0, null);
                    return;
                }
                List list2 = (List) obj;
                if (njy.e(list2)) {
                    LogUtil.j("SportSwitchUtils", "list getActiveGoals list is empty ");
                    iBaseResponseCallback.a(0, null);
                    return;
                }
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    HiSampleConfig hiSampleConfig = (HiSampleConfig) list2.get(i3);
                    String configData = hiSampleConfig.getConfigData();
                    if (TextUtils.isEmpty(configData)) {
                        map.put(hiSampleConfig.getConfigId(), str);
                    } else {
                        map.put(hiSampleConfig.getConfigId(), ((qhg) HiJsonUtil.d(configData, qhg.class)).d());
                    }
                }
                LogUtil.a("SportSwitchUtils", "buildDefaultSportSwitch map ", map.toString());
                iBaseResponseCallback.a(0, map);
            }
        });
    }

    public static void c(List<String> list, IBaseResponseCallback iBaseResponseCallback) {
        d(list, iBaseResponseCallback, "1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static qhg b(String str, long j) {
        qhg qhgVar = new qhg();
        qhgVar.b(str);
        qhgVar.b(j);
        return qhgVar;
    }
}
