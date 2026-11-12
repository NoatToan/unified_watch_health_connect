package defpackage;

import android.content.ContentValues;
import android.content.Context;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetBindDeviceReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.UpdateBindDeviceReq;
import com.huawei.hwcloudmodel.model.userprofile.DeviceInfo;
import com.huawei.hwcloudmodel.model.userprofile.GetBindDeviceRsp;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class liv {

    /* JADX INFO: loaded from: classes10.dex */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final liv f40317a = new liv();
    }

    private liv() {
    }

    public static liv d() {
        return a.f40317a;
    }

    public HiDeviceInfo a(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return new HiDeviceInfo(1);
        }
        HiDeviceInfo hiDeviceInfo = new HiDeviceInfo(deviceInfo.getProductId().intValue());
        hiDeviceInfo.setDeviceUniqueCode(deviceInfo.getUniqueId());
        hiDeviceInfo.setDeviceName(deviceInfo.getName());
        hiDeviceInfo.setFirmwareVersion(deviceInfo.getFirmwareVersion());
        hiDeviceInfo.setHardwareVersion(deviceInfo.getHardwareVersion());
        hiDeviceInfo.setManufacturer(deviceInfo.getManufacturer());
        hiDeviceInfo.setSoftwareVersion(deviceInfo.getSoftwareVersion());
        hiDeviceInfo.setProdId(deviceInfo.getProdId());
        hiDeviceInfo.setSubProdId(deviceInfo.getSubProdId());
        hiDeviceInfo.setDeviceSN(deviceInfo.getSn());
        hiDeviceInfo.setDeviceMac(deviceInfo.getMac());
        hiDeviceInfo.setDeviceUdid(deviceInfo.getUdid());
        String deviceData = deviceInfo.getDeviceData();
        if (!HiCommonUtil.a(deviceData)) {
            hiDeviceInfo.setModel(d(deviceData, "mMap"));
            if (HiCommonUtil.a(hiDeviceInfo.getModel())) {
                hiDeviceInfo.setModel(d(deviceData, "mValues"));
            }
        }
        if (deviceInfo.getModifyTime() != null) {
            hiDeviceInfo.setModifyTime(deviceInfo.getModifyTime().longValue());
        }
        return hiDeviceInfo;
    }

    private String d(String str, String str2) {
        try {
            return new JSONObject(str).getJSONObject(str2).getString("model");
        } catch (JSONException unused) {
            ReleaseLogUtil.a("HiH_HiSyncUtilHelper", "getHiDeviceInfo get" + str2 + "JSONException");
            return "";
        }
    }

    HiDeviceInfo c(long j) {
        HiDeviceInfo hiDeviceInfo = new HiDeviceInfo(32);
        hiDeviceInfo.setDeviceUniqueCode(Long.toString(j));
        hiDeviceInfo.setDeviceName("UNKNOWN");
        hiDeviceInfo.setFirmwareVersion("UNKNOWN");
        hiDeviceInfo.setHardwareVersion("UNKNOWN");
        hiDeviceInfo.setSoftwareVersion("UNKNOWN");
        return hiDeviceInfo;
    }

    public UpdateBindDeviceReq b(HiDeviceInfo hiDeviceInfo, long j) {
        UpdateBindDeviceReq updateBindDeviceReq = new UpdateBindDeviceReq();
        updateBindDeviceReq.setDeviceCode(Long.valueOf(j));
        updateBindDeviceReq.setFirmwareVersion(hiDeviceInfo.getFirmwareVersion());
        updateBindDeviceReq.setHardwareVersion(hiDeviceInfo.getHardwareVersion());
        updateBindDeviceReq.setManufacturer(hiDeviceInfo.getManufacturer());
        updateBindDeviceReq.setName(hiDeviceInfo.getDeviceName());
        updateBindDeviceReq.setSoftwareVersion(hiDeviceInfo.getSoftwareVersion());
        updateBindDeviceReq.setProdid(hiDeviceInfo.getProdId());
        updateBindDeviceReq.setSubProdId(hiDeviceInfo.getSubProdId());
        updateBindDeviceReq.setMac(hiDeviceInfo.getDeviceMac());
        updateBindDeviceReq.setSn(hiDeviceInfo.getDeviceSN());
        updateBindDeviceReq.setUdid(hiDeviceInfo.getDeviceUdid());
        if (hiDeviceInfo.getModel() != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("model", hiDeviceInfo.getModel());
            updateBindDeviceReq.setDeviceData(HiJsonUtil.d(contentValues));
        }
        return updateBindDeviceReq;
    }

    public List<HiDeviceInfo> d(Context context) throws lif {
        if (context == null) {
            return null;
        }
        GetBindDeviceRsp getBindDeviceRspA = lqo.b(context).a(new GetBindDeviceReq());
        if (!lih.e(getBindDeviceRspA, true)) {
            LogUtil.e("HiH_HiSyncUtilHelper", "getBindDeviceSync error");
            return null;
        }
        List<DeviceInfo> deviceInfos = getBindDeviceRspA.getDeviceInfos();
        if (HiCommonUtil.b(deviceInfos)) {
            LogUtil.e("HiH_HiSyncUtilHelper", "getAllBindDeviceRsp error,deviceInfos is null or empty ");
            return null;
        }
        ArrayList arrayList = new ArrayList(deviceInfos.size());
        for (DeviceInfo deviceInfo : deviceInfos) {
            if (deviceInfo != null && 32 == deviceInfo.getProductId().intValue()) {
                arrayList.add(a(deviceInfo));
            }
        }
        return arrayList;
    }

    int a(Context context, int i) throws Throwable {
        try {
            List<HiDeviceInfo> listD = d(context);
            int i2 = 0;
            if (HiCommonUtil.b(listD)) {
                LogUtil.a("HiH_HiSyncUtilHelper", "get bind device from cloud return error!");
                return -1;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (HiDeviceInfo hiDeviceInfo : listD) {
                if (hiDeviceInfo != null) {
                    long modifyTime = jCurrentTimeMillis - hiDeviceInfo.getModifyTime();
                    if (86400000 > modifyTime && 0 < modifyTime) {
                        i2++;
                    }
                    if (hiDeviceInfo.getModel() != null) {
                        kwy.b(context).e(hiDeviceInfo);
                    }
                }
            }
            LogUtil.a("HiH_HiSyncUtilHelper", "getbinddevice activity device num=", Integer.valueOf(i2));
            return i2;
        } catch (lif e) {
            ReleaseLogUtil.a("HiH_HiSyncUtilHelper", "updateBindPhoneDevice return error , e = " + e.getMessage());
            return -1;
        }
    }

    public void b(Context context) {
        if (context == null) {
            return;
        }
        c(context);
        lgp.f().d(0);
    }

    private void c(Context context) {
        lit.a(context);
    }

    void c(Context context, int i) throws lif {
        lit.e(context, i);
    }
}
