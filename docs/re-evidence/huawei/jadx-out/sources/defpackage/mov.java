package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.util.CollectionUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hms.network.embedded.j2;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.CloudParamKeys;
import health.compact.a.HiDateUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class mov extends mor {
    @Override // defpackage.mor, com.huawei.hwdevice.phoneprocess.mgr.httpproxy.factory.HttpProxyParamsFactory
    public Map<String, String> getCommonHeaders() {
        HashMap map = new HashMap();
        LoginInit loginInit = LoginInit.getInstance(BaseApplication.b());
        String accountInfo = loginInit.getAccountInfo(1015);
        String accountInfo2 = loginInit.getAccountInfo(1011);
        String strC = HiDateUtil.c((String) null);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strI = BaseApplication.i();
        String strD = BaseApplication.d();
        map.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + accountInfo);
        map.put("Content-type", "application/json; charset=UTF-8");
        map.put(CloudParamKeys.X_CLIENT_TIMEZONE, strC);
        map.put(CloudParamKeys.X_TS, String.valueOf(jCurrentTimeMillis));
        map.put(CloudParamKeys.X_APP_ID, strD);
        map.put(j2.v, "gzip, deflate");
        map.put("x-huid", accountInfo2);
        map.put("x-proxy-version", "Android_wear_" + strI);
        return map;
    }

    @Override // defpackage.mor, com.huawei.hwdevice.phoneprocess.mgr.httpproxy.factory.HttpProxyParamsFactory
    public Map<String, String> getCommonBody(DeviceInfo deviceInfo) {
        String strE;
        String hiLinkDeviceId = deviceInfo.getHiLinkDeviceId();
        if (hiLinkDeviceId == null) {
            ReleaseLogUtil.e("DEVMGR_HealthCloudRequestParamFactory", "getCommonBody hilinkid is null");
            return new HashMap();
        }
        List<ProductMapInfo> listC = ProductMap.c("smartProductId", hiLinkDeviceId);
        if (CollectionUtils.isEmpty(listC)) {
            strE = "";
        } else {
            strE = listC.get(0).e();
        }
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        if (TextUtils.isEmpty(deviceIdentify) || TextUtils.isEmpty(strE) || TextUtils.isEmpty(hiLinkDeviceId)) {
            ReleaseLogUtil.d("DEVMGR_HealthCloudRequestParamFactory", "getCommonBody param is empty");
        }
        HashMap map = new HashMap();
        map.put("deviceIdentity", deviceIdentify);
        map.put("deviceTypeId", strE);
        map.put("prodId", hiLinkDeviceId);
        return map;
    }
}
