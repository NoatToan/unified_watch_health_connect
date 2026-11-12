package defpackage;

import com.huawei.datatype.RunPaceZoneConfig;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.fitnessdatatype.ActivityReminder;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartZoneConf;
import com.huawei.hwcommonmodel.fitnessdatatype.MotionGoal;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.up.model.UserInfomation;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lxp {
    public static byte[] a(List<MotionGoal> list) {
        return lxv.c(list);
    }

    public static byte[] e(UserInfomation userInfomation, DeviceInfo deviceInfo) {
        int metricHeight;
        int metricWeight;
        String str;
        LogUtil.a("FitnessPackage", "setDataUserInfo userInfomation");
        if (userInfomation.getMetricHeight() > 0) {
            metricHeight = userInfomation.getMetricHeight();
        } else {
            LogUtil.j("FitnessPackage", "setDataUserInfo invalid height");
            metricHeight = 170;
        }
        String strC = c(userInfomation, metricHeight);
        if (userInfomation.getMetricWeight() > 0.0f) {
            metricWeight = (int) userInfomation.getMetricWeight();
        } else {
            LogUtil.j("FitnessPackage", "setDataUserInfo invalid weight");
            metricWeight = 60;
        }
        String strB = b(userInfomation, metricWeight);
        String str2 = eeq.d(3) + eeq.d(1) + eeq.d(userInfomation.getAge());
        String strC2 = c(userInfomation, deviceInfo);
        float f = metricHeight;
        String str3 = eeq.d(6) + eeq.d(1) + eeq.d(Math.round(0.42f * f));
        String str4 = eeq.d(7) + eeq.d(1) + eeq.d(Math.round(f * 0.83f));
        String strD = d(userInfomation);
        String str5 = eeq.d(8) + eeq.d(4) + eeq.c(userInfomation.getMaxVo2());
        String str6 = eeq.d(9) + eeq.d(4) + eeq.c(userInfomation.getVo2Time());
        if (b()) {
            str = strC + strB + str2 + strC2 + str3 + str4 + str5 + str6 + strD;
        } else {
            str = strC + strB + str2 + strC2 + str3 + str4 + strD;
        }
        if (d(deviceInfo)) {
            String str7 = eeq.d(11) + eeq.d(4) + eeq.c(Math.round(userInfomation.getWeight() * 100.0f));
            LogUtil.a("FitnessPackage", "isSupportSendHighWeight and dataUserInfo.getWeight() is", Float.valueOf(userInfomation.getWeight()));
            str = str + str7;
        }
        LogUtil.a("FitnessPackage", "tlvs is ", str);
        return eeq.c(str);
    }

    private static boolean d(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("FitnessPackage", "isSupportSendMaxVos deviceInfo is null.");
            return false;
        }
        return eey.d(deviceInfo, 179);
    }

    private static boolean b() {
        DeviceInfo deviceInfoD = mgg.d("FitnessPackage");
        if (deviceInfoD == null) {
            LogUtil.j("FitnessPackage", "isSupportSendMaxVos deviceInfo is null.");
            return false;
        }
        int productType = deviceInfoD.getProductType();
        if (productType == 10 || productType == 23 || productType == 24) {
            return false;
        }
        return (lxc.c() && lxc.a(deviceInfoD.getDeviceIdentify())) ? false : true;
    }

    private static String c(UserInfomation userInfomation, int i) {
        String str = eeq.d(1) + eeq.d(1) + eeq.d(i);
        if (userInfomation.isHeightValid()) {
            return str;
        }
        LogUtil.a("FitnessPackage", "height data is invalid");
        return "";
    }

    private static String b(UserInfomation userInfomation, int i) {
        String str = eeq.d(2) + eeq.d(1) + eeq.d(i);
        if (userInfomation.isWeightValid()) {
            return str;
        }
        LogUtil.a("FitnessPackage", "weight data is invalid");
        return "";
    }

    private static String c(UserInfomation userInfomation, DeviceInfo deviceInfo) {
        String strA = a(userInfomation, deviceInfo);
        if (userInfomation.isGenderValid()) {
            return strA;
        }
        LogUtil.a("FitnessPackage", "gender data is invalid");
        return "";
    }

    private static String d(UserInfomation userInfomation) {
        String strE = e(userInfomation);
        if (userInfomation.isBirthdayValid()) {
            return strE;
        }
        LogUtil.a("FitnessPackage", "birthday data is invalid");
        return "";
    }

    private static String a(UserInfomation userInfomation, DeviceInfo deviceInfo) {
        String str;
        int gender = userInfomation.getGender();
        if (gender == 1) {
            str = eeq.d(5) + eeq.d(1) + eeq.d(2);
        } else {
            str = eeq.d(5) + eeq.d(1) + eeq.d(1);
        }
        if (!eey.d(deviceInfo, 87) || gender != 2) {
            return str;
        }
        return eeq.d(5) + eeq.d(1) + eeq.d(3);
    }

    private static String e(UserInfomation userInfomation) {
        int i;
        try {
            i = Integer.parseInt(userInfomation.getBirthday());
        } catch (NumberFormatException e) {
            LogUtil.e("FitnessPackage", "setDataUserInfo NumberFormatException:", e);
            i = 0;
        }
        if (i == 0) {
            LogUtil.j("FitnessPackage", "birthday is 0");
            return "";
        }
        String str = i + "";
        if (str.length() != 8) {
            return "";
        }
        try {
            int i2 = Integer.parseInt(str.substring(0, 4));
            int i3 = Integer.parseInt(str.substring(4, 6));
            int i4 = Integer.parseInt(str.substring(6));
            return eeq.d(4) + eeq.d(4) + eeq.e(i2) + eeq.d(i3) + eeq.d(i4);
        } catch (NumberFormatException unused) {
            LogUtil.e("FitnessPackage", "setDataUserInfo NumberFormatException");
            return "";
        }
    }

    public static byte[] c() {
        return eeq.c(eeq.d(10) + eeq.d(1) + eeq.d(1));
    }

    public static byte[] d() {
        return eeq.c(eeq.d(1) + eeq.d(0));
    }

    public static byte[] b(long j, long j2) {
        String str = ("" + eeq.d(1)) + eeq.d(0);
        if (j != 0) {
            String str2 = (str + eeq.d(3) + eeq.d(4)) + eeq.c(j);
            if (j2 != 0) {
                str = (str2 + eeq.d(4) + eeq.d(4)) + eeq.c(j2);
            } else {
                str = str2;
            }
        }
        return eeq.c(str);
    }

    public static byte[] e(int i) {
        return eeq.c(((("" + eeq.d(129)) + eeq.d(4)) + eeq.d(2)) + eeq.d(2) + eeq.e(i));
    }

    public static byte[] c(ActivityReminder activityReminder) {
        String str = "";
        if (activityReminder != null) {
            String str2 = ((("" + eeq.d(129)) + eeq.d(17)) + eeq.d(2) + eeq.d(1) + eeq.d(activityReminder.isEnabled() ? 1 : 0)) + eeq.d(3) + eeq.d(1) + eeq.d(activityReminder.getInterval());
            int startTime = activityReminder.getStartTime();
            String str3 = str2 + eeq.d(4) + eeq.d(2) + eeq.d((startTime >> 8) & 255) + eeq.d(startTime & 255);
            int endTime = activityReminder.getEndTime();
            str = (str3 + eeq.d(5) + eeq.d(2) + eeq.d((endTime >> 8) & 255) + eeq.d(endTime & 255)) + eeq.d(6) + eeq.d(1) + eeq.d(activityReminder.getCycle());
        }
        return eeq.c(str);
    }

    public static byte[] a(int i, int i2) {
        return eeq.c(((((("" + eeq.d(129)) + eeq.d(8)) + eeq.d(2)) + eeq.d(2) + eeq.e(i)) + eeq.d(3)) + eeq.d(2) + eeq.e(i2));
    }

    public static byte[] d(long j, long j2) {
        ByteBuffer byteBuffer;
        int i = 2;
        byte[] bArr = {-127, 0};
        ByteBuffer byteBufferD = null;
        if (j != 0) {
            ByteBuffer byteBufferD2 = d(3, (int) j);
            int iCapacity = byteBufferD2.capacity() + 2;
            if (j2 != 0) {
                byteBufferD = d(4, (int) j2);
                iCapacity += byteBufferD.capacity();
            }
            i = iCapacity;
            ByteBuffer byteBuffer2 = byteBufferD;
            byteBufferD = byteBufferD2;
            byteBuffer = byteBuffer2;
        } else {
            byteBuffer = null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        byteBufferAllocate.put(bArr);
        if (byteBufferD != null) {
            byteBufferAllocate.put(byteBufferD.array());
        }
        if (byteBuffer != null) {
            byteBufferAllocate.put(byteBuffer.array());
        }
        return byteBufferAllocate.array();
    }

    public static ByteBuffer d(int i, int i2) {
        byte[] bArrH = eeq.h(i2);
        byte[] bArrA = eeq.a(bArrH.length);
        byte[] bArrJ = eeq.j(i);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrJ.length + bArrA.length + bArrH.length);
        byteBufferAllocate.put(bArrJ).put(bArrA).put(bArrH);
        return byteBufferAllocate;
    }

    public static ByteBuffer c(int i, int i2) {
        byte[] bArrC = eeq.c(i2);
        byte[] bArrA = eeq.a(bArrC.length);
        byte[] bArrJ = eeq.j(i);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrJ.length + bArrA.length + bArrC.length);
        byteBufferAllocate.put(bArrJ).put(bArrA).put(bArrC);
        return byteBufferAllocate;
    }

    public static byte[] b(int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        byteBufferAllocate.put((byte) -127).put((byte) 4).put(c(2, i).array());
        return byteBufferAllocate.array();
    }

    public static byte[] e(long j, long j2) {
        ByteBuffer byteBuffer;
        int i = 2;
        byte[] bArr = {-127, 0};
        ByteBuffer byteBufferD = null;
        if (j != 0) {
            ByteBuffer byteBufferD2 = d(3, (int) j);
            int iCapacity = byteBufferD2.capacity() + 2;
            if (j2 != 0) {
                byteBufferD = d(4, (int) j2);
                iCapacity += byteBufferD.capacity();
            }
            i = iCapacity;
            ByteBuffer byteBuffer2 = byteBufferD;
            byteBufferD = byteBufferD2;
            byteBuffer = byteBuffer2;
        } else {
            byteBuffer = null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        byteBufferAllocate.put(bArr);
        if (byteBufferD != null) {
            byteBufferAllocate.put(byteBufferD.array());
        }
        if (byteBuffer != null) {
            byteBufferAllocate.put(byteBuffer.array());
        }
        return byteBufferAllocate.array();
    }

    public static byte[] c(int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        byteBufferAllocate.put((byte) -127).put((byte) 4).put(c(2, i).array());
        return byteBufferAllocate.array();
    }

    public static byte[] c(List<lyg> list) {
        StringBuffer stringBuffer = new StringBuffer(16);
        int i = 0;
        for (lyg lygVar : list) {
            stringBuffer.append(eeq.d(2));
            stringBuffer.append(eeq.d(5));
            stringBuffer.append(eeq.d(lygVar.e()));
            stringBuffer.append(eeq.d(lygVar.a()));
            stringBuffer.append(eeq.e(lygVar.c()));
            stringBuffer.append(eeq.d(lygVar.d()));
            i += 7;
        }
        return eeq.c(eeq.d(129) + eeq.d(i) + stringBuffer.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    public static byte[] d(HeartZoneConf heartZoneConf, int i, boolean z) {
        String strE;
        boolean z2;
        int i2 = 3;
        if (i == 0) {
            strE = ("" + eeq.d(8)) + eeq.d(1) + eeq.d(heartZoneConf.isWarningEnble() ? 1 : 0);
            ?? r1 = heartZoneConf.getWarningLimitHR() > 0 && heartZoneConf.getFitnessThreshold() > 0;
            ?? r2 = heartZoneConf.getWarmUpThreshold() > 0 && heartZoneConf.getFatBurnThreshold() > 0;
            ?? r6 = heartZoneConf.getAerobicThreshold() > 0 && heartZoneConf.getAnaerobicThreshold() > 0 && heartZoneConf.getMaxThreshold() > 0;
            if (r1 != false && r2 != false && r6 != false) {
                strE = d(heartZoneConf, strE);
                i2 = 27;
            }
            ?? r3 = heartZoneConf.getAerobicBaseThreshold() > 0 && heartZoneConf.getAerobicAdvanceThreshold() > 0;
            z2 = heartZoneConf.getLacticAcidThreshold() > 0 && heartZoneConf.getAnaerobicBaseThreshold() > 0 && heartZoneConf.getAnaerobicAdvanceThreshold() > 0;
            if (z && r3 != false && z2) {
                strE = a(heartZoneConf, strE);
                i2 += 15;
            }
        } else {
            strE = ("" + eeq.d(8)) + eeq.d(1) + eeq.d(heartZoneConf.isWarningEnbleHRR() ? 1 : 0);
            ?? r9 = heartZoneConf.getWarningLimitHRHRR() > 0 && heartZoneConf.getAerobicBaseThreshold() > 0;
            ?? r4 = heartZoneConf.getAerobicAdvanceThreshold() > 0 && heartZoneConf.getLacticAcidThreshold() > 0;
            z2 = heartZoneConf.getAnaerobicBaseThreshold() > 0 && heartZoneConf.getAnaerobicAdvanceThreshold() > 0 && heartZoneConf.getHrrMaxThreshold() > 0;
            if (r9 != false && r4 != false && z2) {
                strE = e(heartZoneConf, strE);
                i2 = 27;
            }
        }
        return eeq.c(eeq.d(129) + eeq.d(i2 + 6) + c(heartZoneConf, strE));
    }

    public static byte[] e() {
        return eeq.c(eeq.d(129) + eeq.d(3) + (eeq.d(18) + eeq.d(1) + eeq.d(1)));
    }

    private static String c(HeartZoneConf heartZoneConf, String str) {
        return (((str + eeq.d(10)) + eeq.d(1) + eeq.d(heartZoneConf.getClassifyMethod())) + eeq.d(12)) + eeq.d(1) + eeq.d(heartZoneConf.getRestHeartRate());
    }

    private static String d(HeartZoneConf heartZoneConf, String str) {
        return (((((((((((((((str + eeq.d(9)) + eeq.d(1) + eeq.d(heartZoneConf.getWarningLimitHR())) + eeq.d(2)) + eeq.d(1) + eeq.d(heartZoneConf.getFitnessThreshold())) + eeq.d(3)) + eeq.d(1) + eeq.d(heartZoneConf.getWarmUpThreshold())) + eeq.d(4)) + eeq.d(1) + eeq.d(heartZoneConf.getFatBurnThreshold())) + eeq.d(5)) + eeq.d(1) + eeq.d(heartZoneConf.getAerobicThreshold())) + eeq.d(6)) + eeq.d(1) + eeq.d(heartZoneConf.getAnaerobicThreshold())) + eeq.d(7)) + eeq.d(1) + eeq.d(heartZoneConf.getMaxThreshold())) + eeq.d(11)) + eeq.d(1) + eeq.d(heartZoneConf.getMaxThreshold());
    }

    private static String a(HeartZoneConf heartZoneConf, String str) {
        return (((((((((str + eeq.d(13)) + eeq.d(1) + eeq.d(heartZoneConf.getAerobicBaseThreshold())) + eeq.d(14)) + eeq.d(1) + eeq.d(heartZoneConf.getAerobicAdvanceThreshold())) + eeq.d(15)) + eeq.d(1) + eeq.d(heartZoneConf.getLacticAcidThreshold())) + eeq.d(16)) + eeq.d(1) + eeq.d(heartZoneConf.getAnaerobicBaseThreshold())) + eeq.d(17)) + eeq.d(1) + eeq.d(heartZoneConf.getAnaerobicAdvanceThreshold());
    }

    private static String e(HeartZoneConf heartZoneConf, String str) {
        boolean z = false;
        boolean z2 = heartZoneConf.getWarningLimitHRHRR() > 0 && heartZoneConf.getAerobicBaseThreshold() > 0;
        boolean z3 = heartZoneConf.getAerobicAdvanceThreshold() > 0 && heartZoneConf.getLacticAcidThreshold() > 0;
        if (heartZoneConf.getAnaerobicBaseThreshold() > 0 && heartZoneConf.getAnaerobicAdvanceThreshold() > 0 && heartZoneConf.getHrrMaxThreshold() > 0) {
            z = true;
        }
        if (!z2 || !z3 || !z) {
            return str;
        }
        return (((((((((((((((str + eeq.d(9)) + eeq.d(1) + eeq.d(heartZoneConf.getWarningLimitHRHRR())) + eeq.d(2)) + eeq.d(1) + eeq.d(heartZoneConf.getAerobicBaseThreshold())) + eeq.d(3)) + eeq.d(1) + eeq.d(heartZoneConf.getAerobicAdvanceThreshold())) + eeq.d(4)) + eeq.d(1) + eeq.d(heartZoneConf.getLacticAcidThreshold())) + eeq.d(5)) + eeq.d(1) + eeq.d(heartZoneConf.getAnaerobicBaseThreshold())) + eeq.d(6)) + eeq.d(1) + eeq.d(heartZoneConf.getAnaerobicAdvanceThreshold())) + eeq.d(7)) + eeq.d(1) + eeq.d(heartZoneConf.getHrrMaxThreshold())) + eeq.d(11)) + eeq.d(1) + eeq.d(heartZoneConf.getHrrMaxThreshold());
    }

    public static byte[] d(int i) {
        return eeq.c("" + eeq.d(1) + eeq.d(1) + eeq.d(i));
    }

    public static byte[] j(int i) {
        return eeq.c("" + eeq.d(1) + eeq.d(1) + eeq.d(i));
    }

    public static byte[] a(int i) {
        return eeq.c("" + eeq.d(1) + eeq.d(1) + eeq.d(i));
    }

    public static byte[] a() {
        return eeq.c(("" + eeq.d(1)) + eeq.d(0));
    }

    public static byte[] e(RunPaceZoneConfig runPaceZoneConfig) {
        return eeq.c(((((((((((("" + eeq.d(1)) + eeq.d(2) + eeq.e(runPaceZoneConfig.getEasyPaceZoneMinValue())) + eeq.d(2)) + eeq.d(2) + eeq.e(runPaceZoneConfig.getMarathonPaceZoneMinValue())) + eeq.d(3)) + eeq.d(2) + eeq.e(runPaceZoneConfig.getLactatePaceZoneMinValue())) + eeq.d(4)) + eeq.d(2) + eeq.e(runPaceZoneConfig.getAnaerobicPaceZoneMinValue())) + eeq.d(5)) + eeq.d(2) + eeq.e(runPaceZoneConfig.getMaxOxygenPaceZoneMinValue())) + eeq.d(6)) + eeq.d(2) + eeq.e(runPaceZoneConfig.getMaxOxygenPaceZoneMaxValue()));
    }

    public static byte[] d(UserInfomation userInfomation, int i) {
        byte b2 = (byte) 0;
        byte b3 = (byte) 1;
        return new byte[]{5, 14, (byte) userInfomation.getMetricHeight(), (byte) userInfomation.getMetricWeight(), (byte) userInfomation.getAge(), (byte) userInfomation.getGender(), (byte) userInfomation.getWalkStepLen(), (byte) userInfomation.getRunStepLen(), 0, b2, b3, (byte) ((i >> 8) & 255), (byte) (i & 255), b3, b2, b2};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public static byte[] b(HeartRateThresholdConfig heartRateThresholdConfig) {
        int i;
        boolean z = false;
        if (heartRateThresholdConfig == null) {
            LogUtil.j("FitnessPackage", "getHeartRateZoneConfigure heartData is null");
            return new byte[0];
        }
        String strA = ("" + eeq.d(8)) + eeq.d(1) + eeq.d(heartRateThresholdConfig.getWarningEnable() ? 1 : 0);
        ?? r3 = heartRateThresholdConfig.getWarningLimit() > 0 && heartRateThresholdConfig.getFitnessThreshold() > 0;
        ?? r4 = heartRateThresholdConfig.getWarmUpThreshold() > 0 && heartRateThresholdConfig.getFatBurnThreshold() > 0;
        ?? r5 = heartRateThresholdConfig.getAerobicThreshold() > 0 && heartRateThresholdConfig.getAnaerobicThreshold() > 0 && heartRateThresholdConfig.getMaxThreshold() > 0;
        if (r3 == true && r4 == true && r5 == true) {
            strA = e(heartRateThresholdConfig, strA);
            i = 27;
        } else {
            i = 3;
        }
        ?? r6 = heartRateThresholdConfig.getAerobicBaseThreshold() > 0 && heartRateThresholdConfig.getAerobicAdvanceThreshold() > 0;
        if (heartRateThresholdConfig.getLacticAcidThreshold() > 0 && heartRateThresholdConfig.getAnaerobicBaseThreshold() > 0 && heartRateThresholdConfig.getAnaerobicAdvanceThreshold() > 0) {
            z = true;
        }
        if (r6 != false && z) {
            strA = a(heartRateThresholdConfig, strA);
            i += 15;
        }
        return eeq.c(eeq.d(129) + eeq.d(i + 6) + b(heartRateThresholdConfig, strA));
    }

    private static String e(HeartRateThresholdConfig heartRateThresholdConfig, String str) {
        return (((((((((((((((str + eeq.d(9)) + eeq.d(1) + eeq.d(heartRateThresholdConfig.getWarningLimit())) + eeq.d(2)) + eeq.d(1) + eeq.d(heartRateThresholdConfig.getFitnessThreshold())) + eeq.d(3)) + eeq.d(1) + eeq.d(heartRateThresholdConfig.getWarmUpThreshold())) + eeq.d(4)) + eeq.d(1) + eeq.d(heartRateThresholdConfig.getFatBurnThreshold())) + eeq.d(5)) + eeq.d(1) + eeq.d(heartRateThresholdConfig.getAerobicThreshold())) + eeq.d(6)) + eeq.d(1) + eeq.d(heartRateThresholdConfig.getAnaerobicThreshold())) + eeq.d(7)) + eeq.d(1) + eeq.d(heartRateThresholdConfig.getMaxThreshold())) + eeq.d(11)) + eeq.d(1) + eeq.d(heartRateThresholdConfig.getMaxThreshold());
    }

    private static String a(HeartRateThresholdConfig heartRateThresholdConfig, String str) {
        return (((((((((str + eeq.d(13)) + eeq.d(1) + eeq.d(heartRateThresholdConfig.getAerobicBaseThreshold())) + eeq.d(14)) + eeq.d(1) + eeq.d(heartRateThresholdConfig.getAerobicAdvanceThreshold())) + eeq.d(15)) + eeq.d(1) + eeq.d(heartRateThresholdConfig.getLacticAcidThreshold())) + eeq.d(16)) + eeq.d(1) + eeq.d(heartRateThresholdConfig.getAnaerobicBaseThreshold())) + eeq.d(17)) + eeq.d(1) + eeq.d(heartRateThresholdConfig.getAnaerobicAdvanceThreshold());
    }

    private static String b(HeartRateThresholdConfig heartRateThresholdConfig, String str) {
        return (((str + eeq.d(10)) + eeq.d(1) + eeq.d(heartRateThresholdConfig.getClassifyMethod())) + eeq.d(12)) + eeq.d(1) + eeq.d(heartRateThresholdConfig.getRestHeartRate());
    }
}
