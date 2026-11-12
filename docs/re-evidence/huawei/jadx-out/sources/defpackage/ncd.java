package defpackage;

import com.google.gson.JsonObject;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CloudUtils;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ncd implements DataReceiveCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile ncd f42874c;

    private ncd() {
    }

    public static ncd e() {
        if (f42874c == null) {
            synchronized (ncd.class) {
                if (f42874c == null) {
                    f42874c = new ncd();
                }
            }
        }
        return f42874c;
    }

    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
        ReleaseLogUtil.d("R_DEVMGR_HwSmartNotifyManager", "onDataReceived: ", Integer.valueOf(i));
        if (deviceInfo == null || e(eecVar)) {
            LogUtil.j("HwSmartNotifyManager", "device is null or isCheckSampleError.");
            return;
        }
        if (eecVar instanceof eef) {
            List<eeg> configInfoList = ((eef) eecVar).getConfigInfoList();
            if (configInfoList == null || configInfoList.size() == 0) {
                LogUtil.j("HwSmartNotifyManager", "onDataReceived sampleConfigInfoList empty.");
                return;
            }
            eeg eegVar = configInfoList.get(0);
            LogUtil.a("HwSmartNotifyManager", "onDataReceived configAction", Integer.valueOf(eegVar.d()));
            if (eegVar.d() == 1) {
                b(eeq.e(eegVar.e()));
            }
        }
    }

    private boolean e(eec eecVar) {
        if (eecVar == null) {
            LogUtil.a("HwSmartNotifyManager", "sampleBase is null.");
            return true;
        }
        if (eecVar.getCommandId() == 1 && "hw.watch.message.smartNotifyReminder".equals(eecVar.getSrcPkgName()) && "hw.health.smartNotifyReminder".equals(eecVar.getWearPkgName())) {
            return false;
        }
        LogUtil.j("HwSmartNotifyManager", "message: ", eecVar.toString());
        return true;
    }

    private void b(String str) {
        if (str == null) {
            LogUtil.j("HwSmartNotifyManager", "alarmNumber is default value.");
            return;
        }
        LogUtil.a("HwSmartNotifyManager", "configData: ", str);
        try {
            List<eew> listE = new eet().b(str).e();
            if (CollectionUtils.a(listE)) {
                LogUtil.j("HwSmartNotifyManager", "parseAlarmNumberData tlvList is empty.");
                return;
            }
            int iV = 0;
            for (eew eewVar : listE) {
                if (CommonUtil.v(eewVar.e()) != 1) {
                    LogUtil.j("HwSmartNotifyManager", "parseSmartNotifyData default branches.");
                } else {
                    iV = CommonUtil.v(eewVar.b());
                    ReleaseLogUtil.d("R_DEVMGR_HwSmartNotifyManager", "parseSmartNotifyData status is ", Integer.valueOf(iV));
                }
            }
            e(String.valueOf(iV));
        } catch (eeu e) {
            LogUtil.e("HwSmartNotifyManager", "parseAlarmNumberData tlvException: ", ExceptionUtils.c(e));
        } catch (NumberFormatException e2) {
            LogUtil.e("HwSmartNotifyManager", "parseAlarmNumberData numberFormatException: ", ExceptionUtils.c(e2));
        }
    }

    public void e(String str) {
        LogUtil.a("HwSmartNotifyManager", "saveMainSwitch enter, switchStatus: ", str);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("switch_smart_notify_reminder", str);
        qhq.d("9005", "900500010", jsonObject.toString(), new HiDataOperateListener() { // from class: nch
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i, Object obj) {
                this.d.e(i, obj);
            }
        }, System.currentTimeMillis());
    }

    /* synthetic */ void e(int i, Object obj) {
        ReleaseLogUtil.d("R_DEVMGR_HwSmartNotifyManager", "saveSmartSwitch errorCode: ", Integer.valueOf(i), ", object: ", obj);
        if (CloudUtils.a()) {
            b();
        }
    }

    private void b() {
        LogUtil.a("HwSmartNotifyManager", "syncSampleConfig enter");
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(900000000);
        hiSyncOption.setSyncMethod(2);
        HiHealthNativeApi.a(BaseApplication.getContext()).synCloud(hiSyncOption, null);
    }

    public void a() {
        edc.e().registerDeviceSampleListener("hw.health.smartNotifyReminder", this);
        ReleaseLogUtil.d("R_DEVMGR_HwSmartNotifyManager", "register success");
    }

    public void c() {
        edc.e().unRegisterDeviceSampleListener("hw.health.smartNotifyReminder");
        ReleaseLogUtil.d("R_DEVMGR_HwSmartNotifyManager", "unregister success");
    }
}
