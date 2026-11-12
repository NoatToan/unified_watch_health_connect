package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.dfx.DfxUtils;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.HiSampleConfigKey;
import com.huawei.hihealth.HiSampleConfigProcessOption;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataContans;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class xkb {
    public static void a(long j, HiCommonListener hiCommonListener) {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(900000000);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncId(j);
        hiSyncOption.setForceSync(true);
        HiHealthNativeApi.a(BaseApplication.b()).synCloud(hiSyncOption, hiCommonListener);
    }

    public static void a(long j) {
        a(j, null);
    }

    public static void d(String str, String str2, String str3, long j, HiDataOperateListener hiDataOperateListener) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            String str4 = "setSampleConfig type " + str + " configId " + str2 + " configData " + str3;
            ReleaseLogUtil.d("R_SampleConfigUtil", str4, " ", DfxUtils.d(Thread.currentThread(), null));
            if (hiDataOperateListener != null) {
                hiDataOperateListener.onResult(-1, str4);
                return;
            }
            return;
        }
        HiSampleConfig.Builder builder = new HiSampleConfig.Builder();
        builder.e(j);
        builder.i(String.valueOf(0));
        builder.e(String.valueOf(-1));
        builder.f(String.valueOf(0));
        builder.h(str);
        builder.a(str2);
        builder.b(str3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HiSampleConfig(builder));
        HiHealthManager.d(BaseApplication.b()).setSampleConfig(arrayList, hiDataOperateListener);
    }

    public static void e(String str, String str2, HiDataReadResultListener hiDataReadResultListener) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            String str3 = "getSampleConfig type " + str + " configId " + str2;
            ReleaseLogUtil.d("R_SampleConfigUtil", str3, " ", DfxUtils.d(Thread.currentThread(), null));
            if (hiDataReadResultListener != null) {
                hiDataReadResultListener.onResult(str3, -1, -1);
                return;
            }
            return;
        }
        HiSampleConfigKey.Builder builder = new HiSampleConfigKey.Builder();
        builder.c(String.valueOf(0));
        builder.d(String.valueOf(0));
        builder.e(str);
        builder.a(str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HiSampleConfigKey(builder));
        HiSampleConfigProcessOption hiSampleConfigProcessOption = new HiSampleConfigProcessOption();
        hiSampleConfigProcessOption.setSampleConfigKeyList(arrayList);
        HiHealthManager.d(BaseApplication.b()).getSampleConfig(hiSampleConfigProcessOption, hiDataReadResultListener);
    }

    public static void d(String str, String str2, HiDataOperateListener hiDataOperateListener) {
        d(MatterDataContans.TYPE_HEALTH, str, str2, System.currentTimeMillis(), hiDataOperateListener);
    }

    public static void b(String str, String str2, long j, HiDataOperateListener hiDataOperateListener) {
        d(MatterDataContans.TYPE_HEALTH, str, str2, j, hiDataOperateListener);
    }

    public static void d(String str, HiDataReadResultListener hiDataReadResultListener) {
        e(MatterDataContans.TYPE_HEALTH, str, hiDataReadResultListener);
    }

    public static void c(String str, final ResponseCallback<Pair<Long, String>> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_SampleConfigUtil", "getSampleConfigForHealth callback is null");
        } else {
            d(str, new HiDataReadResultListener() { // from class: xkb.5
                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResultIntent(int i, Object obj, int i2, int i3) {
                }

                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResult(Object obj, int i, int i2) {
                    if (!njy.b(obj, HiSampleConfig.class)) {
                        ReleaseLogUtil.d("R_SampleConfigUtil", "getSampleConfigForHealth object ", obj);
                        responseCallback.onResponse(i, null);
                        return;
                    }
                    List list = (List) obj;
                    if (njy.e(list)) {
                        ReleaseLogUtil.d("R_SampleConfigUtil", "getSampleConfigForHealth list ", list);
                        responseCallback.onResponse(i, null);
                        return;
                    }
                    HiSampleConfig hiSampleConfig = (HiSampleConfig) list.get(0);
                    if (hiSampleConfig == null) {
                        ReleaseLogUtil.d("R_SampleConfigUtil", "getSampleConfigForHealth config is null");
                        responseCallback.onResponse(i, null);
                    } else {
                        responseCallback.onResponse(i, new Pair(Long.valueOf(hiSampleConfig.getModifiedTime()), hiSampleConfig.getConfigData()));
                    }
                }
            });
        }
    }

    public static void c(String str, String str2, long j, HiDataOperateListener hiDataOperateListener) {
        d("9001", str, str2, j, hiDataOperateListener);
    }

    public static void e(String str, HiDataReadResultListener hiDataReadResultListener) {
        e("9001", str, hiDataReadResultListener);
    }
}
