package defpackage;

import android.database.ContentObserver;
import android.os.Handler;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class msf extends ContentObserver {
    public msf(Handler handler) {
        super(handler);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        LogUtil.a("ContactsObserver", "onChange: start");
        msc mscVarC = msc.c();
        boolean zE = mud.e();
        LogUtil.a("ContactsObserver", "onChange isSupportSportContact is : ", Boolean.valueOf(zE));
        if (zE) {
            if (mtk.d()) {
                LogUtil.a("ContactsObserver", "onChange hasContactsPermissions is true");
                mub.e().b(mtn.e());
            }
        } else {
            mscVarC.d();
            if (mtk.d()) {
                mscVarC.e(mtn.e(), 0);
                List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "ContactsObserver");
                DeviceInfo deviceInfo = deviceList.size() != 0 ? deviceList.get(0) : null;
                if (deviceInfo == null) {
                    LogUtil.j("ContactsObserver", "onChange deviceInfo is null");
                    return;
                }
                DeviceCapability deviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(2, "", "ContactsObserver").get(deviceInfo.getDeviceIdentify());
                if (deviceCapability == null || !deviceCapability.isSupportSyncContacts()) {
                    LogUtil.j("ContactsObserver", "onChange is not support");
                    return;
                }
                mscVarC.c(deviceInfo);
            } else {
                LogUtil.j("ContactsObserver", "onChange: cannot sync contacts without contact permissions.");
            }
        }
        mscVarC.a(BaseApplication.getContext(), mtn.e());
        LogUtil.a("ContactsObserver", "synchronizer startListen ");
    }
}
