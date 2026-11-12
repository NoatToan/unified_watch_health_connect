package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataContans;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class mgd {
    private static eef d(String str) {
        eef eefVar = new eef();
        eefVar.setSrcPkgName("hw.health.emotion");
        eefVar.setWearPkgName("hw.watch.health.emotion");
        eefVar.setCommandId(1);
        eeg eegVar = new eeg();
        eegVar.b(900500028L);
        eegVar.d(eeq.c(eeq.d(1) + eeq.d(1) + eeq.d(Integer.parseInt(str))));
        eegVar.b(1);
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(eegVar);
        eefVar.setConfigInfoList(arrayList);
        return eefVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(String str) {
        DeviceInfo deviceInfoC = mgg.c("EmotionAutoMonitorUtils");
        if (deviceInfoC == null || TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("DEVMGR_EmotionAutoMonitorUtils", "sendSettingDeviceCommand, deviceInfo is null or switchStatus is empty.");
        } else {
            if (deviceInfoC.getDeviceConnectState() != 2) {
                ReleaseLogUtil.e("DEVMGR_EmotionAutoMonitorUtils", "device is not connected.");
                return;
            }
            eef eefVarD = d(str);
            ReleaseLogUtil.d("DEVMGR_EmotionAutoMonitorUtils", "constructSampleConfig: ", eefVarD);
            edc.e().sendSampleConfigCommand(deviceInfoC, eefVarD, "EmotionAutoMonitorUtils");
        }
    }

    public static void e(final String str) {
        qhq.d("9005", "900500028", ffv.e("emotionAutoMonitorSwitch", str), new HiDataOperateListener() { // from class: mgd.2
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                ReleaseLogUtil.d("DEVMGR_EmotionAutoMonitorUtils", "setEmotionAutoMonitorSwitch setSampleConfig errorCode: ", Integer.valueOf(i));
                if (i == 0) {
                    mgd.a(str);
                    mgd.e();
                }
            }
        }, System.currentTimeMillis());
    }

    public static void b(String str) {
        qhq.d(MatterDataContans.TYPE_HEALTH, "900300049", ffv.e("emotionRiskTipSwitch", str), new HiDataOperateListener() { // from class: mgd.5
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                ReleaseLogUtil.d("DEVMGR_EmotionAutoMonitorUtils", "setEmotionRiskWarningSwitch setSampleConfig errorCode: ", Integer.valueOf(i));
                if (i == 0) {
                    mgd.e();
                }
            }
        }, System.currentTimeMillis());
    }

    public static void b(final IBaseResponseCallback iBaseResponseCallback) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add("900500028");
        qhq.b("9005", arrayList, new HiDataReadResultListener() { // from class: mgd.1
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            /* JADX WARN: Code duplicated, block: B:9:0x0041  */
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                String strA;
                ReleaseLogUtil.d("DEVMGR_EmotionAutoMonitorUtils", "getEmotionAutoMonitorSwitch onResult errorCode: ", Integer.valueOf(i));
                if (njy.b(obj, HiSampleConfig.class) && i == 0) {
                    List list = (List) obj;
                    if (!njy.e(list)) {
                        strA = ffv.a(((HiSampleConfig) list.get(0)).getConfigData(), "emotionAutoMonitorSwitch");
                        ReleaseLogUtil.d("DEVMGR_EmotionAutoMonitorUtils", "getEmotionAutoMonitorSwitch switchStatus :", strA);
                        if (TextUtils.isEmpty(strA)) {
                            strA = "1";
                        }
                    } else {
                        strA = "1";
                    }
                } else {
                    strA = "1";
                }
                iBaseResponseCallback.a(0, strA);
            }
        });
    }

    public static void a(final IBaseResponseCallback iBaseResponseCallback) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add("900300049");
        qhq.b(MatterDataContans.TYPE_HEALTH, arrayList, new HiDataReadResultListener() { // from class: mgd.4
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            /* JADX WARN: Code duplicated, block: B:9:0x0041  */
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                String strA;
                ReleaseLogUtil.d("DEVMGR_EmotionAutoMonitorUtils", "getEmotionRiskWarningSwitch onResult errorCode: ", Integer.valueOf(i));
                if (njy.b(obj, HiSampleConfig.class) && i == 0) {
                    List list = (List) obj;
                    if (!njy.e(list)) {
                        strA = ffv.a(((HiSampleConfig) list.get(0)).getConfigData(), "emotionRiskTipSwitch");
                        ReleaseLogUtil.d("DEVMGR_EmotionAutoMonitorUtils", "getEmotionRiskWarningSwitch switchStatus :", strA);
                        if (TextUtils.isEmpty(strA)) {
                            strA = "0";
                        }
                    } else {
                        strA = "0";
                    }
                } else {
                    strA = "0";
                }
                iBaseResponseCallback.a(0, strA);
            }
        });
    }

    public static void c(final IBaseResponseCallback iBaseResponseCallback) {
        mhs.a().getSwitchSetting("press_auto_monitor_switch_status", new IBaseResponseCallback() { // from class: mgc
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                mgd.d(iBaseResponseCallback, i, obj);
            }
        });
    }

    static /* synthetic */ void d(IBaseResponseCallback iBaseResponseCallback, int i, Object obj) {
        LogUtil.a("EmotionAutoMonitorUtils", "getStressAutoMonitorSwitch: ", Integer.valueOf(i), obj);
        if (i == 0 && (obj instanceof String)) {
            if ("true".equals((String) obj)) {
                iBaseResponseCallback.a(i, "1");
                return;
            } else {
                iBaseResponseCallback.a(i, "0");
                return;
            }
        }
        iBaseResponseCallback.a(-1, "0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e() {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(900000000);
        hiSyncOption.setSyncMethod(2);
        HiHealthNativeApi.a(BaseApplication.getContext()).synCloud(hiSyncOption, null);
    }
}
