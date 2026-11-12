package defpackage;

import android.content.Context;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealthservice.sync.syncdata.HiSyncBase;
import com.huawei.hwcloudmodel.model.userprofile.UpdateBindDeviceRsp;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OperationKey;
import health.compact.a.HiCommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lhc implements HiSyncBase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f40126b;
    private final Context e;

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pullDataByTime(long j, long j2) throws lif {
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pullDataByVersion() throws lif {
    }

    public lhc(Context context, int i) {
        LogUtil.a("HiH_HiSyncDevice", "HiSyncDevice create");
        this.e = context.getApplicationContext();
        this.f40126b = i;
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pushData() throws lif {
        ReleaseLogUtil.d("HiH_HiSyncDevice", "pushData() begin !");
        a();
        ReleaseLogUtil.d("HiH_HiSyncDevice", "pushData() end !");
    }

    private void a() {
        List<HiDeviceInfo> listA = kwy.d().a(Integer.valueOf(this.f40126b));
        if (HiCommonUtil.b(listA)) {
            LogUtil.a("HiH_HiSyncDevice", "no device to cloud!");
            return;
        }
        ReleaseLogUtil.d("HiH_HiSyncDevice", "unSyncDeviceInfoList size=", Integer.valueOf(listA.size()));
        for (HiDeviceInfo hiDeviceInfo : listA) {
            if (hiDeviceInfo == null) {
                ReleaseLogUtil.e("HiH_HiSyncDevice", "hiDeviceInfo is null");
            } else {
                try {
                    if (b(hiDeviceInfo)) {
                        kwy.d().c(hiDeviceInfo.getDeviceId(), 1);
                    }
                } catch (lif e) {
                    LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
                    linkedHashMap.put("error_msg", " updateBindDevice error: " + e.getMessage());
                    ljv.d(BaseApplication.b()).c(OperationKey.HEALTH_APP_SYNC_UPDATE_BIND_DEVICE_ERROR_2129049.value(), linkedHashMap, false);
                    ReleaseLogUtil.a("HiH_HiSyncDevice", "Failed to pushDeviceInfo, cause: ", ExceptionUtils.c(e));
                }
            }
        }
    }

    private boolean b(HiDeviceInfo hiDeviceInfo) throws lif {
        List<kym> listC = kwt.b().c(this.f40126b, hiDeviceInfo.getDeviceId());
        if (CollectionUtils.a(listC)) {
            ReleaseLogUtil.e("HiH_HiSyncDevice", "hiHealthContextList is null");
            return false;
        }
        boolean z = true;
        for (kym kymVar : listC) {
            if (0 != kymVar.e()) {
                UpdateBindDeviceRsp updateBindDeviceRspA = lqo.b(this.e).a(liv.d().b(hiDeviceInfo, kymVar.e()));
                if (!lih.e(updateBindDeviceRspA, true)) {
                    ReleaseLogUtil.a("HiH_HiSyncDevice", "pushDeviceInfo failed, error= ", updateBindDeviceRspA.getResultDesc());
                    z = false;
                } else {
                    ReleaseLogUtil.d("HiH_HiSyncDevice", "pushDeviceInfo OK, deviceName: ", hiDeviceInfo.getDeviceName(), ", cloudDevice: ", Long.valueOf(kymVar.e()));
                }
            }
        }
        return z;
    }
}
