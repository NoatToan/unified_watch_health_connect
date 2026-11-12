package defpackage;

import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public class qed {
    private static final Map<Integer, Integer> d = Collections.unmodifiableMap(new HashMap<Integer, Integer>() { // from class: qed.3
        private static final long serialVersionUID = 3655020105415806976L;

        {
            put(1, 22101);
            put(2, 22102);
            put(3, 22103);
            put(4, 22104);
            put(5, 22105);
        }
    });

    public static List<HiHealthData> b(String str, qeb qebVar, JSONObject jSONObject) {
        String strD = qebVar.d();
        ArrayList arrayList = new ArrayList(16);
        LogUtil.a("CoreSleepDetailUtil", "deviceUuid is ", strD);
        long jE = e(qebVar, jSONObject);
        String strE = qebVar.e() == -1 ? "" : e(jSONObject);
        ReleaseLogUtil.d("BTSYNC_CoreSleep_CoreSleepDetailUtil", "getSleepVersion=", strE);
        int i = 0;
        while (i < str.length()) {
            int i2 = i + 16;
            String strSubstring = str.substring(i, i2);
            int iB = b(strSubstring);
            int iC = c(strSubstring);
            LogUtil.a("CoreSleepDetailUtil", "sleepStatusStr is ", strSubstring, ", duration is ", Integer.valueOf(iC), ", status ", Integer.valueOf(iB));
            if (iC == 0) {
                ReleaseLogUtil.e("BTSYNC_CoreSleep_CoreSleepDetailUtil", "index is ", Integer.valueOf(i), ", duration is 0");
            } else {
                if (iC % 60 != 0) {
                    ReleaseLogUtil.e("BTSYNC_CoreSleep_CoreSleepDetailUtil", "index is ", Integer.valueOf(i), ", duration is not multiple of 60");
                }
                if (iB == 0) {
                    ReleaseLogUtil.e("BTSYNC_CoreSleep_CoreSleepDetailUtil", "index is ", Integer.valueOf(i), ", status is 0");
                } else {
                    Integer num = d.get(Integer.valueOf(iB));
                    if (num == null) {
                        ReleaseLogUtil.e("BTSYNC_CoreSleep_CoreSleepDetailUtil", "index is ", Integer.valueOf(i), ", status is error: ", Integer.valueOf(iB));
                    } else {
                        int i3 = iC / 60;
                        if (i3 > 1440) {
                            ReleaseLogUtil.e("BTSYNC_CoreSleep_CoreSleepDetailUtil", "index is ", Integer.valueOf(i), ", one day hours over 24, minute:", Integer.valueOf(i3));
                        } else {
                            for (int i4 = 0; i4 < i3; i4++) {
                                HiHealthData hiHealthData = new HiHealthData();
                                hiHealthData.setDeviceUuid(strD);
                                hiHealthData.setType(num.intValue());
                                hiHealthData.setStartTime(jE);
                                jE += 60000;
                                hiHealthData.setEndTime(jE);
                                if (!StringUtils.g(strE)) {
                                    hiHealthData.setMetaData(strE);
                                }
                                b(hiHealthData, i4, i3);
                                arrayList.add(hiHealthData);
                            }
                        }
                    }
                }
            }
            i = i2;
        }
        return arrayList;
    }

    private static void b(HiHealthData hiHealthData, int i, int i2) {
        LogUtil.a("CoreSleepDetailUtil", "HiHealthData ", hiHealthData.toString());
        if (i == 0) {
            ReleaseLogUtil.e("BTSYNC_CoreSleep_CoreSleepDetailUtil", "HiHealthData ST: ", Long.valueOf(hiHealthData.getStartTime()));
        }
        if (i == i2 - 1) {
            ReleaseLogUtil.e("BTSYNC_CoreSleep_CoreSleepDetailUtil", "HiHealthData ET: ", Long.valueOf(hiHealthData.getEndTime()));
        }
    }

    private static String e(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("sleepVersion")) {
                LogUtil.a("CoreSleepDetailUtil", "metaData don't have sleepVersion");
                return "";
            }
            int iOptInt = jSONObject.optInt("sleepVersion");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("sleepVersion", iOptInt);
            LogUtil.a("CoreSleepDetailUtil", "getSleepVersion=", Integer.valueOf(iOptInt));
            return jSONObject2.toString();
        } catch (JSONException e) {
            ReleaseLogUtil.a("BTSYNC_CoreSleep_CoreSleepDetailUtil", " get mSleepVersion error: ", ExceptionUtils.c(e));
            return "";
        }
    }

    private static int b(String str) {
        String strSubstring = str.substring(8, 10);
        LogUtil.a("CoreSleepDetailUtil", "statusStr is ", strSubstring);
        try {
            return Integer.parseInt(strSubstring, 16);
        } catch (NumberFormatException e) {
            ReleaseLogUtil.a("CoreSleepDetailUtil", "getStatus NumberFormatException :", ExceptionUtils.c(e));
            return 0;
        }
    }

    private static int c(String str) {
        String str2 = str.substring(6, 8) + str.substring(4, 6) + str.substring(2, 4) + str.substring(0, 2);
        LogUtil.a("CoreSleepDetailUtil", "durationStr is ", str2);
        try {
            return Integer.parseInt(str2, 16);
        } catch (NumberFormatException e) {
            ReleaseLogUtil.a("CoreSleepDetailUtil", "getDurationValue NumberFormatException :", ExceptionUtils.c(e));
            return 0;
        }
    }

    private static long e(qeb qebVar, JSONObject jSONObject) {
        long jB = qebVar.b();
        if (qeg.b()) {
            if (qebVar.e() == -1) {
                ReleaseLogUtil.e("BTSYNC_CoreSleep_CoreSleepDetailUtil", "validData is -1");
                return jB;
            }
            try {
                long j = jSONObject.getLong("bedTime");
                if (j % 60 != 0) {
                    ReleaseLogUtil.e("BTSYNC_CoreSleep_CoreSleepDetailUtil", "bedTime not whole minute");
                    j = (j / 60) * 60;
                }
                return j * 1000;
            } catch (JSONException e) {
                ReleaseLogUtil.a("BTSYNC_CoreSleep_CoreSleepDetailUtil", "get bedTime error: ", ExceptionUtils.c(e));
            }
        }
        return jB;
    }
}
