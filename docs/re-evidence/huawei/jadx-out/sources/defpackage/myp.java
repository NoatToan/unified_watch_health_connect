package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class myp extends HwBaseManager implements ParserInterface {
    private myp() {
        super(BaseApplication.getContext());
    }

    public static myp b() {
        return b.d;
    }

    @Override // com.huawei.hwdevice.phoneprocess.binder.ParserInterface
    public void getResult(DeviceInfo deviceInfo, byte[] bArr) {
        cpl.d("AlarmData_AlarmDataSyncManager", bArr, "getResult(): ");
        if (bArr == null || bArr.length < 2) {
            ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_AlarmDataSyncManager", "processResult data is null.");
        } else if (bArr.length < 3) {
            ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_AlarmDataSyncManager", "dataInfos length is less than 3.");
        } else {
            b(bArr, deviceInfo);
        }
    }

    public void b(byte[] bArr, DeviceInfo deviceInfo) {
        cpl.d("AlarmData_AlarmDataSyncManager", bArr, "getResult(): ");
        byte b2 = bArr[1];
        if (b2 == 30) {
            LogUtil.a("AlarmData_AlarmDataSyncManager", "5.7.30 response : ", eeq.e(bArr));
            myv.b().d(bArr);
        } else if (b2 == 38) {
            myt.e().c(bArr, deviceInfo);
        } else if (b2 == 39) {
            myt.e().b(bArr, deviceInfo);
        } else {
            cpl.d("AlarmData_AlarmDataSyncManager", bArr, "command id is other value", Byte.valueOf(b2), "; dataInfos is ");
        }
    }

    static class b {
        private static final myp d = new myp();
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 7303839;
    }
}
