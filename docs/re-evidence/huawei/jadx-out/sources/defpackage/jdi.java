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
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class jdi {
    public static void b(final IBaseResponseCallback iBaseResponseCallback) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add("900100018");
        qhq.b("9001", arrayList, new HiDataReadResultListener() { // from class: jdi.2
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.a("Track_RouteAutoSwitchUtil", "onResult errorCode: ", Integer.valueOf(i), ", data: ", obj);
                gdn gdnVar = new gdn();
                if (!njy.b(obj, HiSampleConfig.class)) {
                    ReleaseLogUtil.e("Track_RouteAutoSwitchUtil", "getAutoSwitch isListTypeMatch false ");
                    iBaseResponseCallback.a(-1, gdnVar);
                    return;
                }
                List<HiSampleConfig> list = (List) obj;
                if (njy.e(list)) {
                    ReleaseLogUtil.e("Track_RouteAutoSwitchUtil", "getAutoSwitch list is empty ");
                    iBaseResponseCallback.a(0, gdnVar);
                    return;
                }
                for (HiSampleConfig hiSampleConfig : list) {
                    if (hiSampleConfig != null) {
                        String configData = hiSampleConfig.getConfigData();
                        if (!TextUtils.isEmpty(configData)) {
                            gdnVar = (gdn) HiJsonUtil.d(configData, gdn.class);
                        }
                    }
                }
                LogUtil.a("Track_RouteAutoSwitchUtil", "getAutoSwitch return ", gdnVar);
                iBaseResponseCallback.a(0, gdnVar);
            }
        });
    }

    public static void c(gdn gdnVar) {
        LogUtil.a("Track_RouteAutoSwitchUtil", "saveAutoSwitch PathAutoSwitchInfo ", gdnVar);
        qhq.d("9001", "900100018", HiJsonUtil.d(gdnVar), new HiDataOperateListener() { // from class: jdi.1
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                LogUtil.a("Track_RouteAutoSwitchUtil", "saveSampleConfig errorCode: ", Integer.valueOf(i), ", object: ", obj);
            }
        }, System.currentTimeMillis());
        b();
    }

    public static void e(boolean z) {
        LogUtil.a("Track_RouteAutoSwitchUtil", "saveDefaultTwoSwitch with : ", Boolean.valueOf(z));
        gdn gdnVar = new gdn();
        gdnVar.b(z);
        gdnVar.d(z);
        c(gdnVar);
    }

    private static void b() {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(900000000);
        hiSyncOption.setSyncMethod(2);
        HiHealthNativeApi.a(BaseApplication.getContext()).synCloud(hiSyncOption, null);
    }
}
