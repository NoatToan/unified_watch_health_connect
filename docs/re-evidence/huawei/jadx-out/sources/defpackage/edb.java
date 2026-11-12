package defpackage;

import com.huawei.haf.bundle.AppBundlePluginProxy;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.api.phoneprocess.PhoneServiceMgrApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.HwGetDevicesParameter;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class edb extends AppBundlePluginProxy<PhoneServiceMgrApi> implements PhoneServiceMgrApi {
    private static volatile edb e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PhoneServiceMgrApi f32772b;

    private edb() {
        super("PhoneServiceMgrProxy", "PhoneServiceMgr", "com.huawei.hwdevice.phoneprocess.impl.PhoneServiceMgrImpl");
        this.f32772b = createPluginApi();
    }

    public static edb d() {
        edb edbVar;
        if (e == null) {
            synchronized (edb.class) {
                if (e == null) {
                    e = new edb();
                }
                edbVar = e;
            }
            return edbVar;
        }
        return e;
    }

    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    public boolean isPluginAvaiable() {
        return this.f32772b != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void initialize(PhoneServiceMgrApi phoneServiceMgrApi) {
        this.f32772b = phoneServiceMgrApi;
    }

    @Override // com.huawei.health.devicemgr.api.phoneprocess.PhoneServiceMgrApi
    public List<DeviceInfo> getDeviceList(HwGetDevicesMode hwGetDevicesMode, HwGetDevicesParameter hwGetDevicesParameter, String str) {
        PhoneServiceMgrApi phoneServiceMgrApi = this.f32772b;
        if (phoneServiceMgrApi != null) {
            return phoneServiceMgrApi.getDeviceList(hwGetDevicesMode, hwGetDevicesParameter, str);
        }
        return null;
    }

    @Override // com.huawei.health.devicemgr.api.phoneprocess.PhoneServiceMgrApi
    public String getDeviceRelation(String str) {
        PhoneServiceMgrApi phoneServiceMgrApi = this.f32772b;
        if (phoneServiceMgrApi != null) {
            return phoneServiceMgrApi.getDeviceRelation(str);
        }
        return "";
    }
}
