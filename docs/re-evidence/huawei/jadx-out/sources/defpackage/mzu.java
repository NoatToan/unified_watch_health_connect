package defpackage;

import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.hwsynctaskmanager.synctask.AbstractSyncTask;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class mzu extends AbstractSyncTask {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ThreadPoolManager f42771c;

    public mzu(String str) {
        super("ECG_SYNC_TASK" + str);
        this.f42771c = ThreadPoolManager.d(1, 1);
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwsynctaskmanager.synctask.AbstractSyncTask
    public void startTask(final IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("DEVMGR_EcgSyncTask", "start ecg sync task enter.");
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(4, "", "EcgSyncTask");
        DeviceCapability value = null;
        if (mapQueryDeviceCapability != null && !mapQueryDeviceCapability.isEmpty()) {
            Iterator<Map.Entry<String, DeviceCapability>> it = mapQueryDeviceCapability.entrySet().iterator();
            while (it.hasNext() && (value = it.next().getValue()) == null) {
            }
        }
        if (value == null) {
            ReleaseLogUtil.e("DEVMGR_EcgSyncTask", "get capability is null. please check.");
            iBaseResponseCallback.a(-3, "");
        } else if (!value.isSupportEcgAuth()) {
            ReleaseLogUtil.e("DEVMGR_EcgSyncTask", "device not support ecg.");
            iBaseResponseCallback.a(-3, "");
        } else {
            this.f42771c.a("EcgSyncTask", new Runnable() { // from class: mzu.4
                @Override // java.lang.Runnable
                public void run() {
                    if ("true".equals(mzu.this.c("com.huawei.health.ecg.activate.status"))) {
                        ReleaseLogUtil.d("DEVMGR_EcgSyncTask", "start ecg file.");
                        mxf.e(BaseApplication.getContext()).i(iBaseResponseCallback);
                    } else {
                        ReleaseLogUtil.e("DEVMGR_EcgSyncTask", "account not activity");
                        iBaseResponseCallback.a(-1, "");
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(String str) {
        String value;
        LogUtil.a("EcgSyncTask", "getUserPreference enter");
        HiUserPreference hiUserPreferenceA = a(str);
        if (hiUserPreferenceA != null) {
            value = hiUserPreferenceA.getValue();
        } else {
            ReleaseLogUtil.e("DEVMGR_EcgSyncTask", "ecg activity status not save in database, not start ecg task.");
            value = null;
        }
        LogUtil.a("EcgSyncTask", "getUserPreference ecg : ", value);
        return value;
    }

    private HiUserPreference a(String str) {
        return HiHealthManager.d(BaseApplication.getContext()).getUserPreference(str);
    }
}
