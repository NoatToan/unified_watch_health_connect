package defpackage;

import android.text.TextUtils;
import com.huawei.health.health.constants.ObserveLabels;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwfoundationmodel.trackmodel.StepRateData;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes10.dex */
public class jqb {
    public static int[] e(String str, String str2, List<njl> list, long j) {
        int[] iArr = new int[5];
        gzf gzfVar = new gzf();
        gzfVar.c(str);
        if (!TextUtils.isEmpty(str2)) {
            b(str2, iArr);
            LogUtil.a("Track_PaceZoneUtils", "paceZoneTimeStatistic:", str2);
            if (d(iArr)) {
                return null;
            }
        } else {
            a(list, iArr, xjm.e(list, j), gzfVar);
            if (d(iArr)) {
                LogUtil.j("Track_PaceZoneUtils", "hasInvalidValue requestPaceInterDuration");
                return null;
            }
        }
        return iArr;
    }

    private static boolean d(int[] iArr) {
        if (iArr == null) {
            return true;
        }
        boolean z = true;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == -1) {
                z2 = true;
            }
            if (i != 0) {
                z = false;
            }
        }
        return z || z2;
    }

    private static boolean e(float[] fArr) {
        if (fArr == null) {
            return true;
        }
        boolean z = true;
        boolean z2 = false;
        for (float f : fArr) {
            if (f == -1.0f) {
                z2 = true;
            }
            if (f != 0.0f) {
                z = false;
            }
        }
        return z || z2;
    }

    private static void a(List<njl> list, int[] iArr, int i, gzf gzfVar) {
        int iE;
        if (list == null) {
            LogUtil.e("Track_PaceZoneUtils", "paceList is null");
            return;
        }
        if (gzfVar == null) {
            return;
        }
        for (njl njlVar : list) {
            if (njlVar != null && (iE = gzfVar.e(njlVar.e())) != -1) {
                iArr[iE] = iArr[iE] + i;
            }
        }
    }

    public static List<jbp> a(MotionPath motionPath, MotionPathSimplify motionPathSimplify) {
        if (motionPath == null || motionPathSimplify == null) {
            LogUtil.e("Track_PaceZoneUtils", "motionPath or motionPathSimplify is null");
            return Collections.EMPTY_LIST;
        }
        List<njl> listRequestRealTimePaceList = motionPath.requestRealTimePaceList();
        String extendDataString = motionPathSimplify.getExtendDataString("runPaceZoneConfig");
        if (njy.e(listRequestRealTimePaceList) || TextUtils.isEmpty(extendDataString)) {
            LogUtil.e("Track_PaceZoneUtils", "rtPaceList or paceConfigStr is null");
            return Collections.EMPTY_LIST;
        }
        int iE = xjm.e(listRequestRealTimePaceList, motionPathSimplify.requestStartTime());
        HashMap map = new HashMap(16);
        d(listRequestRealTimePaceList, map, extendDataString);
        ArrayList arrayList = new ArrayList(10);
        jbp jbpVarD = d(motionPath, motionPathSimplify, map, iE);
        if (jbpVarD != null) {
            arrayList.add(jbpVarD);
        }
        jbp jbpVarA = a(motionPath, motionPathSimplify, map, iE);
        if (jbpVarA != null) {
            arrayList.add(jbpVarA);
        }
        if (motionPath.isValidRunningPostureList()) {
            ArrayList arrayList2 = new ArrayList(10);
            jpr.c(arrayList2, motionPath.requestRunningPostureList());
            b(arrayList2, arrayList, map);
        }
        return arrayList;
    }

    private static jbp d(MotionPath motionPath, MotionPathSimplify motionPathSimplify, Map<Long, Integer> map, int i) {
        long jRequestStartTime = motionPathSimplify.requestStartTime();
        List<HeartRateData> listE = jpr.e(motionPath, jRequestStartTime, motionPathSimplify.getExtendDataString("isTrustHeartRate"));
        int iE = xjm.e(motionPath.requestHeartRateList(), jRequestStartTime);
        if (njy.e(listE) || iE == 60) {
            LogUtil.e("Track_PaceZoneUtils", "heartRateList is isEmpty or heartTimeInterval == MINUTE_TO_SECOND");
            return null;
        }
        if (i == 5 && iE == 1) {
            listE = e(listE);
        }
        int[] iArrE = e(listE, map);
        if (d(iArrE)) {
            LogUtil.j("Track_PaceZoneUtils", "hasInvalidValue heartZone");
            return null;
        }
        jbp jbpVar = new jbp();
        jbpVar.b(iArrE, ObserveLabels.HEART_RATE);
        return jbpVar;
    }

    private static jbp a(MotionPath motionPath, MotionPathSimplify motionPathSimplify, Map<Long, Integer> map, int i) {
        ArrayList<StepRateData> arrayListRequestStepRateList = motionPath.requestStepRateList();
        long jRequestStartTime = motionPathSimplify.requestStartTime();
        long jRequestTotalTime = motionPathSimplify.requestTotalTime();
        if (arrayListRequestStepRateList == null) {
            LogUtil.e("Track_PaceZoneUtils", "stepRateListTemp is null");
            return null;
        }
        List arrayList = new ArrayList(16);
        jpr.c(arrayListRequestStepRateList, jRequestStartTime, jRequestTotalTime, (List<StepRateData>) arrayList);
        int iE = xjm.e(arrayListRequestStepRateList, jRequestStartTime);
        LogUtil.a("Track_PaceZoneUtils", "stepTimeInterval:", Integer.valueOf(iE));
        if (njy.e(arrayList) || iE == 60) {
            LogUtil.e("Track_PaceZoneUtils", "stepRateList is isEmpty or stepTimeInterval == MINUTE_TO_SECOND");
            return null;
        }
        if (i == 5 && iE == 1) {
            arrayList = a(arrayList);
        }
        int[] iArrD = d(arrayList, map);
        if (d(iArrD)) {
            LogUtil.j("Track_PaceZoneUtils", "hasInvalidValue stepZone");
            return null;
        }
        jbp jbpVar = new jbp();
        jbpVar.b(iArrD, "STEP_RATE");
        return jbpVar;
    }

    private static void b(List<gzv> list, List<jbp> list2, Map<Long, Integer> map) {
        int[] iArrC = c(list, map, "GROUND_CONTACT_TIME");
        int[] iArrC2 = c(list, map, "SWING_ANGLE");
        int[] iArrC3 = c(list, map, "EVERSION_EXCURSION");
        int[] iArrC4 = c(list, map, "GROUND_IMPACT_ACCELERATION");
        float[] fArrA = a(list, map, "ACTIVE_PEAK");
        if (!d(iArrC)) {
            jbp jbpVar = new jbp();
            jbpVar.b(iArrC, "GROUND_CONTACT_TIME");
            list2.add(jbpVar);
        }
        if (!d(iArrC2)) {
            jbp jbpVar2 = new jbp();
            jbpVar2.b(iArrC2, "SWING_ANGLE");
            list2.add(jbpVar2);
        }
        if (!d(iArrC3)) {
            jbp jbpVar3 = new jbp();
            jbpVar3.b(iArrC3, "EVERSION_EXCURSION");
            list2.add(jbpVar3);
        }
        if (!d(iArrC4)) {
            jbp jbpVar4 = new jbp();
            jbpVar4.b(iArrC4, "GROUND_IMPACT_ACCELERATION");
            list2.add(jbpVar4);
        }
        if (e(fArrA)) {
            return;
        }
        jbp jbpVar5 = new jbp();
        jbpVar5.a(fArrA, "ACTIVE_PEAK");
        list2.add(jbpVar5);
    }

    private static int[] c(List<gzv> list, Map<Long, Integer> map, String str) {
        if (list == null) {
            return null;
        }
        int[] iArr = new int[5];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        Iterator<gzv> it = list.iterator();
        while (it.hasNext()) {
            c(it.next(), str, iArr, iArr2, map);
        }
        for (int i = 0; i < 5; i++) {
            int i2 = iArr2[i];
            if (i2 != 0) {
                iArr3[i] = (int) Math.ceil(((double) iArr[i]) / ((double) i2));
            }
        }
        return iArr3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    private static void c(gzv gzvVar, String str, int[] iArr, int[] iArr2, Map<Long, Integer> map) {
        byte b2;
        if (gzvVar == null) {
            LogUtil.j("Track_PaceZoneUtils", "handleRunningPosture runningPosture is null");
            return;
        }
        str.hashCode();
        switch (str) {
            case "GROUND_CONTACT_TIME":
                b2 = 0;
                break;
            case "SWING_ANGLE":
                b2 = 1;
                break;
            case "ACTIVE_PEAK":
                b2 = 2;
                break;
            case "EVERSION_EXCURSION":
                b2 = 3;
                break;
            case "GROUND_IMPACT_ACCELERATION":
                b2 = 4;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            e(iArr, iArr2, gzvVar.h(), gzvVar.a(), map);
            return;
        }
        if (b2 == 1) {
            e(iArr, iArr2, gzvVar.h(), gzvVar.j(), map);
            return;
        }
        if (b2 == 2) {
            e(iArr, iArr2, gzvVar.h(), (int) gzvVar.o(), map);
        } else if (b2 == 3) {
            e(iArr, iArr2, gzvVar.h(), gzvVar.b(), map);
        } else {
            if (b2 != 4) {
                return;
            }
            e(iArr, iArr2, gzvVar.h(), gzvVar.d(), map);
        }
    }

    private static float[] a(List<gzv> list, Map<Long, Integer> map, String str) {
        if (list == null) {
            return null;
        }
        float[] fArr = new float[5];
        float[] fArr2 = new float[5];
        float[] fArr3 = new float[5];
        for (gzv gzvVar : list) {
            if (gzvVar != null && "ACTIVE_PEAK".equals(str)) {
                b(fArr, fArr2, gzvVar.h(), gzvVar.o(), map);
            }
        }
        for (int i = 0; i < 5; i++) {
            float f = fArr2[i];
            if (f != 0.0f) {
                fArr3[i] = fArr[i] / f;
            }
        }
        return fArr3;
    }

    private static int[] d(List<StepRateData> list, Map<Long, Integer> map) {
        if (list == null) {
            LogUtil.j("Track_PaceZoneUtils", "stepList null");
            return null;
        }
        int[] iArr = new int[5];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        for (StepRateData stepRateData : list) {
            if (stepRateData != null) {
                e(iArr, iArr2, stepRateData.acquireTime(), stepRateData.acquireStepRate(), map);
            }
        }
        for (int i = 0; i < 5; i++) {
            int i2 = iArr2[i];
            if (i2 != 0) {
                iArr3[i] = (int) Math.ceil(((double) iArr[i]) / ((double) i2));
            }
        }
        return iArr3;
    }

    private static int[] e(List<HeartRateData> list, Map<Long, Integer> map) {
        if (list == null) {
            return null;
        }
        int[] iArr = new int[5];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        for (HeartRateData heartRateData : list) {
            if (heartRateData != null) {
                e(iArr, iArr2, heartRateData.acquireTime(), heartRateData.acquireHeartRate(), map);
            }
        }
        for (int i = 0; i < 5; i++) {
            int i2 = iArr2[i];
            if (i2 != 0) {
                iArr3[i] = (int) Math.ceil(((double) iArr[i]) / ((double) i2));
            }
        }
        return iArr3;
    }

    private static void e(int[] iArr, int[] iArr2, long j, int i, Map<Long, Integer> map) {
        if (map == null) {
            LogUtil.j("Track_PaceZoneUtils", "tempTimeMap null");
            return;
        }
        if (map.get(Long.valueOf(j)) == null || i < 0) {
            return;
        }
        int iIntValue = map.get(Long.valueOf(j)).intValue();
        iArr[iIntValue] = iArr[iIntValue] + i;
        int iIntValue2 = map.get(Long.valueOf(j)).intValue();
        iArr2[iIntValue2] = iArr2[iIntValue2] + 1;
    }

    private static void b(float[] fArr, float[] fArr2, long j, float f, Map<Long, Integer> map) {
        if (map == null) {
            LogUtil.j("Track_PaceZoneUtils", "tempTimeMap null");
            return;
        }
        if (map.get(Long.valueOf(j)) == null || f < 0.0f) {
            return;
        }
        int iIntValue = map.get(Long.valueOf(j)).intValue();
        fArr[iIntValue] = fArr[iIntValue] + f;
        int iIntValue2 = map.get(Long.valueOf(j)).intValue();
        fArr2[iIntValue2] = fArr2[iIntValue2] + 1.0f;
    }

    private static void d(List<njl> list, Map<Long, Integer> map, String str) {
        int iE;
        gzf gzfVar = new gzf();
        gzfVar.c(str);
        if (list == null || map == null) {
            LogUtil.e("Track_PaceZoneUtils", "rtPaceList  or tempTimeMap is null");
            return;
        }
        for (njl njlVar : list) {
            if (njlVar != null && (iE = gzfVar.e(njlVar.e())) != -1) {
                map.put(Long.valueOf(njlVar.acquireTime()), Integer.valueOf(iE));
            }
        }
    }

    private static void b(String str, int[] iArr) {
        if (str == null) {
            LogUtil.e("Track_PaceZoneUtils", "paceZoneTimeStatistic is null");
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() != 5) {
                LogUtil.e("Track_PaceZoneUtils", "jsonArray.length() invalid");
                return;
            }
            for (int i = 0; i < 5; i++) {
                if (jSONArray.get(i) instanceof Integer) {
                    iArr[i] = ((Integer) jSONArray.get(i)).intValue();
                }
            }
        } catch (JSONException e) {
            LogUtil.e("Track_PaceZoneUtils", "transformPaceTimeZoneStatistic:", LogAnonymous.b(e));
        }
    }

    public static String c(String str) {
        int[] iArr = new int[6];
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() != 6) {
                LogUtil.e("Track_PaceZoneUtils", "transformPaceConfig jsonArray.length() invalid");
                return str;
            }
            for (int i = 0; i < 6; i++) {
                if (jSONArray.get(i) instanceof Integer) {
                    iArr[i] = ((Integer) jSONArray.get(i)).intValue();
                }
            }
            iArr[5] = 1;
            return Arrays.toString(iArr);
        } catch (JSONException e) {
            LogUtil.e("Track_PaceZoneUtils", "transformPaceConfig:", LogAnonymous.b(e));
        }
    }

    private static List<HeartRateData> e(List<HeartRateData> list) {
        ArrayList arrayList = new ArrayList(10);
        int iAcquireHeartRate = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                iAcquireHeartRate += list.get(i).acquireHeartRate();
                if (i % 5 == 0) {
                    int iCeil = (int) Math.ceil(((double) iAcquireHeartRate) / 5.0d);
                    HeartRateData heartRateData = new HeartRateData();
                    heartRateData.saveHeartRate(iCeil);
                    heartRateData.saveTime(list.get(i).acquireTime());
                    arrayList.add(heartRateData);
                    iAcquireHeartRate = 0;
                }
            }
        }
        int size = list.size();
        for (int i2 = 1; i2 < size % 5; i2++) {
            arrayList.add(list.get(list.size() - i2));
        }
        return arrayList;
    }

    private static List<StepRateData> a(List<StepRateData> list) {
        ArrayList arrayList = new ArrayList(10);
        int iAcquireStepRate = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                iAcquireStepRate += list.get(i).acquireStepRate();
                if (i % 5 == 0) {
                    int iCeil = (int) Math.ceil(((double) iAcquireStepRate) / 5.0d);
                    StepRateData stepRateData = new StepRateData();
                    stepRateData.saveStepRate(iCeil);
                    stepRateData.saveTime(list.get(i).acquireTime());
                    arrayList.add(stepRateData);
                    iAcquireStepRate = 0;
                }
            }
        }
        int size = list.size();
        for (int i2 = 1; i2 < size % 5; i2++) {
            arrayList.add(list.get(list.size() - i2));
        }
        return arrayList;
    }
}
