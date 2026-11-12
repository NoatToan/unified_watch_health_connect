package defpackage;

import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class iyg {
    public static void e() {
        String strE = SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(20002), "ihealthlabs");
        LogUtil.a("Track_FreeIndoorSwitchConfig", "initIndoorSwitchConfig  isOpenIndoorRunning ", strE);
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        boolean zB = SharedPreferenceManager.b(Integer.toString(20002), "WRITE_INDOOR_SWITCH", false);
        LogUtil.a("Track_FreeIndoorSwitchConfig", "initIndoorSwitchConfig  hasWriteData ", Boolean.valueOf(zB));
        if (zB) {
            return;
        }
        if (!SharedPreferenceManager.b("HiHealthService", "pullAllStatus", false)) {
            LogUtil.a("Track_FreeIndoorSwitchConfig", "data is not sync finish.");
        } else {
            e(strE);
        }
    }

    private static void e(final String str) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add("900200027");
        qhq.b("9002", arrayList, new HiDataReadResultListener() { // from class: iyg.2
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                if (!njy.b(obj, HiSampleConfig.class)) {
                    ReleaseLogUtil.e("Track_FreeIndoorSwitchConfig", "initIndoorSwitchConfig isListTypeMatch false ");
                    iyg.e("true".equals(str));
                } else if (njy.e((List) obj)) {
                    ReleaseLogUtil.e("Track_FreeIndoorSwitchConfig", "initIndoorSwitchConfig list is empty ");
                    iyg.e("true".equals(str));
                }
            }
        });
    }

    public static void a() {
        LogUtil.a("Track_FreeIndoorSwitchConfig", "uptVibraStepSwitch enter ");
        ArrayList arrayList = new ArrayList(1);
        arrayList.add("900200027");
        qhq.b("9002", arrayList, new e());
    }

    static class e implements HiDataReadResultListener {
        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        private e() {
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            if (!njy.b(obj, HiSampleConfig.class)) {
                ReleaseLogUtil.e("Track_FreeIndoorSwitchConfig", "initIndoorSwitchConfig isListTypeMatch false ");
                return;
            }
            List list = (List) obj;
            if (njy.e(list)) {
                ReleaseLogUtil.e("Track_FreeIndoorSwitchConfig", "initIndoorSwitchConfig list is empty ");
                return;
            }
            try {
                String str = new JSONObject(((HiSampleConfig) list.get(0)).getConfigData()).getInt("vibraStepSwitch") == 1 ? "true" : "false";
                ReleaseLogUtil.d("Track_FreeIndoorSwitchConfig", "onChange  switch ", str);
                iyg.e(true, str);
            } catch (JSONException unused) {
                LogUtil.j("Track_FreeIndoorSwitchConfig", "ConfigDataCallback JSONException ");
            }
        }
    }

    public static void b() {
        e(false, null);
    }

    public static void e(boolean z) {
        ReleaseLogUtil.d("Track_FreeIndoorSwitchConfig", "setSportSwitch  isChecked ", Boolean.valueOf(z));
        e(true, z ? "true" : "false");
        final int i = z ? 1 : 0;
        lsy.a(new Runnable() { // from class: iyg.4
            @Override // java.lang.Runnable
            public void run() {
                iyg.e(i);
                iyg.c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(boolean z, String str) {
        SharedPreferenceManager.a(Integer.toString(20002), "WRITE_INDOOR_SWITCH", z);
        SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(20002), "ihealthlabs", str, new StorageParams());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(final int i) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("vibraStepSwitch", Integer.valueOf(i));
        qhq.d("9002", "900200027", jsonObject.toString(), new HiDataOperateListener() { // from class: iyg.5
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i2, Object obj) {
                LogUtil.a("Track_FreeIndoorSwitchConfig", "saveSwitchSampleConfig switchStatus ", Integer.valueOf(i), "errorCode: ", Integer.valueOf(i2), ", object: ", obj);
            }
        }, System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c() {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(900000000);
        hiSyncOption.setSyncMethod(2);
        HiHealthNativeApi.a(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).synCloud(hiSyncOption, null);
    }
}
