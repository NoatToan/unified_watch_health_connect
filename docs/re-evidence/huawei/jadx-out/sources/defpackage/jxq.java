package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.healthlinkage.api.HWhealthLinkageApi;
import com.huawei.health.sport.utils.SportSupportUtil;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class jxq {
    public static String[] d(int i) {
        HashSet hashSet = new HashSet(10);
        HashSet hashSet2 = new HashSet(10);
        HashSet hashSet3 = new HashSet(10);
        String[] strArr = {a(hashSet), b((HashSet<String>) hashSet2), b((HashSet<String>) hashSet3)};
        HWhealthLinkageApi hWhealthLinkageApi = (HWhealthLinkageApi) Services.d("HWhealthLinkage", HWhealthLinkageApi.class);
        if (hWhealthLinkageApi == null) {
            LogUtil.e("Track_TrackLinkedDevicesUtil", "healthLinkage not link");
            return strArr;
        }
        List<DeviceInfo> linkedDevice = hWhealthLinkageApi.getLinkedDevice(i);
        if (njy.e(linkedDevice)) {
            return strArr;
        }
        for (DeviceInfo deviceInfo : linkedDevice) {
            if (deviceInfo == null) {
                LogUtil.e("Track_TrackLinkedDevicesUtil", "deviceInfo is null or not run posture.");
            } else {
                hashSet.add(Integer.valueOf(ecu.d().getDeviceTypeId(deviceInfo)));
                hashSet2.add(deviceInfo.getHiLinkDeviceId());
                hashSet3.add(deviceInfo.getDeviceSubModelId());
            }
        }
        strArr[0] = a(hashSet);
        strArr[1] = b((HashSet<String>) hashSet2);
        strArr[2] = b((HashSet<String>) hashSet3);
        LogUtil.a("Track_TrackLinkedDevicesUtil", "localConnectedDevice is ", Arrays.toString(strArr));
        return strArr;
    }

    private static String a(HashSet<Integer> hashSet) {
        return qqt.b(new ArrayList(hashSet));
    }

    private static String b(HashSet<String> hashSet) {
        return qqt.b(new ArrayList(hashSet));
    }

    public static String b(MotionPathSimplify motionPathSimplify) {
        if (motionPathSimplify == null) {
            return "";
        }
        String strD = d("deviceId", motionPathSimplify.getExtendDataString("localDeviceId"), motionPathSimplify.getExtendDataString("localSubProdId"));
        return TextUtils.isEmpty(strD) ? d("smartProductId", motionPathSimplify.getExtendDataString("localProdId"), motionPathSimplify.getExtendDataString("localSubProdId")) : strD;
    }

    public static void c(MotionPathSimplify motionPathSimplify) {
        if (motionPathSimplify != null && TextUtils.isEmpty(motionPathSimplify.getExtendDataString("localDeviceId")) && TextUtils.isEmpty(motionPathSimplify.getExtendDataString("localProdId"))) {
            String[] strArrD = d(motionPathSimplify.requestSportType());
            motionPathSimplify.addExtendDataMap("localDeviceId", strArrD[0]);
            motionPathSimplify.addExtendDataMap("localProdId", strArrD[1]);
            motionPathSimplify.addExtendDataMap("localSubProdId", strArrD[2]);
        }
    }

    private static String d(String str, String str2, String str3) {
        return SportSupportUtil.b(str, str2, str3);
    }
}
