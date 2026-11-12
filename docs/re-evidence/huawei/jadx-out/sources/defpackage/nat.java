package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudGzipFactory;
import com.huawei.hwcloudmodel.healthdatacloud.model.BindDeviceReq;
import com.huawei.hwcloudmodel.model.userprofile.BindDeviceRsp;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.Utils;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class nat {
    public static void a(DeviceInfo deviceInfo, ICloudOperationResult<String> iCloudOperationResult) {
        if (deviceInfo == null) {
            LogUtil.e("HwCloudDeviceMgr", "bindDevice return for device info null");
            iCloudOperationResult.operationResult("", "device info is null", false);
            return;
        }
        int iC = mmx.d(deviceInfo.getProductType()).c();
        if (!TextUtils.isEmpty(deviceInfo.getDeviceModel()) && deviceInfo.getDeviceModel().toUpperCase(Locale.ENGLISH).contains("HECTOR")) {
            iC = 112;
        }
        int iE = e(deviceInfo.getHiLinkDeviceId());
        if (iE != -1) {
            LogUtil.a("UIDV_FitnessCloud", "startDeviceLinkage getDeviceProductIdByHiLinId is ", Integer.valueOf(iE));
            iC = iE;
        }
        BindDeviceReq bindDeviceReq = new BindDeviceReq();
        bindDeviceReq.setProductId(Integer.valueOf(iC));
        bindDeviceReq.setUniqueId(e(deviceInfo));
        bindDeviceReq.setName(net.c("HwCloudDeviceMgr", deviceInfo));
        bindDeviceReq.setMac(deviceInfo.getDeviceIdentify());
        bindDeviceReq.setSubProdId(deviceInfo.getDeviceSubModelId());
        LogUtil.a("HwCloudDeviceMgr", "getDeviceCode deviceName: ", bindDeviceReq.getName(), "mac: ", CommonUtil.n(bindDeviceReq.getMac()));
        String str = GRSManager.c(BaseApplication.getContext()).getUrl("healthCloudUrl") + "/profile/device/bindDevice";
        HealthDataCloudGzipFactory healthDataCloudGzipFactory = new HealthDataCloudGzipFactory(BaseApplication.getContext());
        BindDeviceRsp bindDeviceRsp = (BindDeviceRsp) oet.d().e(str, healthDataCloudGzipFactory.getHeaders(), ofe.c(healthDataCloudGzipFactory.getBody(bindDeviceReq)), BindDeviceRsp.class);
        if (bindDeviceRsp == null || iCloudOperationResult == null) {
            return;
        }
        Long deviceCode = bindDeviceRsp.getDeviceCode();
        iCloudOperationResult.operationResult(String.valueOf(deviceCode), bindDeviceRsp.toString(), deviceCode.longValue() != 0);
    }

    private static String e(DeviceInfo deviceInfo) {
        if (deviceInfo.getProductType() >= 34 && !Utils.o()) {
            return deviceInfo.getSecurityUuid() + "#ANDROID21";
        }
        return deviceInfo.getUuid();
    }

    private static int e(String str) {
        try {
            JSONObject jSONObjectB = eev.b(str);
            if (jSONObjectB == null) {
                LogUtil.j("HwCloudDeviceMgr", "getDeviceProductIdByHiLinId aiTipsJson is null");
                return -1;
            }
            if (jSONObjectB.has("health_cloud_productId")) {
                int i = jSONObjectB.getInt("health_cloud_productId");
                LogUtil.a("HwCloudDeviceMgr", "healthCloudId is ", Integer.valueOf(i));
                return i;
            }
            LogUtil.j("HwCloudDeviceMgr", "getDeviceProductIdByHiLinId aiTipsJson no health_cloud_productId key");
            return -1;
        } catch (JSONException unused) {
            LogUtil.e("HwCloudDeviceMgr", "getDeviceProductIdByHiLinId JSONException");
            return -1;
        }
    }
}
