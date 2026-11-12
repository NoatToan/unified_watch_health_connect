package defpackage;

import com.huawei.health.healthdatamgr.api.HealthDataMgrApi;
import com.huawei.health.servicesui.R;
import com.huawei.health.sport.view.SugChart;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateZoneMgr;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartZoneConf;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwfoundationmodel.trackmodel.StepRateData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.view.trackview.TrackLineChartHolder;
import com.huawei.up.model.UserInfomation;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public class gzz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile HeartZoneConf f36307b;
    private static int d;

    private static void b(List<StepRateData> list, List<gzk> list2) {
        gzk gzkVar = (gzk) Collections.max(list2, new Comparator<gzk>() { // from class: gzz.5
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compare(gzk gzkVar2, gzk gzkVar3) {
                return Float.compare(gzkVar2.d(), gzkVar3.d());
            }
        });
        gzk gzkVar2 = (gzk) Collections.min(list2, new Comparator<gzk>() { // from class: gzz.9
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int compare(gzk gzkVar3, gzk gzkVar4) {
                return Float.compare(gzkVar3.d() < 0.0f ? Float.MAX_VALUE : gzkVar3.d(), gzkVar4.d() >= 0.0f ? gzkVar4.d() : Float.MAX_VALUE);
            }
        });
        StepRateData stepRateData = (StepRateData) Collections.min(list, new Comparator<StepRateData>() { // from class: gzz.15
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public int compare(StepRateData stepRateData2, StepRateData stepRateData3) {
                return Integer.compare(gzz.a(stepRateData2), gzz.a(stepRateData3));
            }
        });
        StepRateData stepRateData2 = (StepRateData) Collections.max(list, new Comparator<StepRateData>() { // from class: gzz.14
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public int compare(StepRateData stepRateData3, StepRateData stepRateData4) {
                return Integer.compare(gzz.a(stepRateData3), gzz.a(stepRateData4));
            }
        });
        if (Float.compare(gzkVar2.d(), a(stepRateData)) != 0) {
            gzkVar2.d(a(stepRateData));
        }
        if (Float.compare(gzkVar.d(), a(stepRateData2)) != 0) {
            gzkVar.d(a(stepRateData2));
        }
    }

    public static int b(HeartRateData heartRateData) {
        if (heartRateData != null && heartRateData.acquireHeartRate() <= 220) {
            return heartRateData.acquireHeartRate();
        }
        return 0;
    }

    private static int b(Object obj) {
        if (obj instanceof StepRateData) {
            return a((StepRateData) obj);
        }
        return b((HeartRateData) obj);
    }

    public static int a(StepRateData stepRateData) {
        if (stepRateData == null) {
            return 0;
        }
        return stepRateData.acquireStepRate();
    }

    public static int d(List<HeartRateData> list) {
        if (njy.e(list)) {
            return 0;
        }
        return b((HeartRateData) Collections.max(list, new Comparator<HeartRateData>() { // from class: gzz.12
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compare(HeartRateData heartRateData, HeartRateData heartRateData2) {
                return Integer.compare(gzz.b(heartRateData), gzz.b(heartRateData2));
            }
        }));
    }

    public static int b(List<HeartRateData> list) {
        if (njy.e(list)) {
            return 0;
        }
        return b((HeartRateData) Collections.min(list, new Comparator<HeartRateData>() { // from class: gzz.13
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compare(HeartRateData heartRateData, HeartRateData heartRateData2) {
                return Integer.compare(gzz.a(heartRateData), gzz.a(heartRateData2));
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int a(HeartRateData heartRateData) {
        if (heartRateData == null) {
            return 0;
        }
        if (heartRateData.acquireHeartRate() <= 0) {
            return Integer.MAX_VALUE;
        }
        return heartRateData.acquireHeartRate();
    }

    public static double e(List<njr> list) {
        if (njy.e(list)) {
            return 0.0d;
        }
        return ((njr) Collections.max(list, new Comparator<njr>() { // from class: gzz.11
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(njr njrVar, njr njrVar2) {
                return Double.compare(gzz.e(njrVar), gzz.e(njrVar2));
            }
        })).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double e(njr njrVar) {
        if (njrVar == null) {
            return 0.0d;
        }
        return njrVar.c();
    }

    public static double n(List<njr> list) {
        if (njy.e(list)) {
            return 0.0d;
        }
        return ((njr) Collections.min(list, new Comparator<njr>() { // from class: gzz.16
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public int compare(njr njrVar, njr njrVar2) {
                return Double.compare(gzz.c(njrVar), gzz.c(njrVar2));
            }
        })).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double c(njr njrVar) {
        if (njrVar == null) {
            return 0.0d;
        }
        if (njrVar.c() <= 0.0d) {
            return 2.147483647E9d;
        }
        return njrVar.c();
    }

    public static int c(List<njl> list) {
        if (njy.e(list)) {
            return 0;
        }
        return ((njl) Collections.min(list, new Comparator<njl>() { // from class: gzz.20
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compare(njl njlVar, njl njlVar2) {
                return Double.compare(gzz.e(njlVar), gzz.e(njlVar2));
            }
        })).e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double e(njl njlVar) {
        if (njlVar == null) {
            return 0.0d;
        }
        if (njlVar.e() <= 0) {
            return 2.147483647E9d;
        }
        return njlVar.e();
    }

    public static int f(List<gzv> list) {
        if (njy.e(list)) {
            return 0;
        }
        return ((gzv) Collections.max(list, new Comparator<gzv>() { // from class: gzz.2
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compare(gzv gzvVar, gzv gzvVar2) {
                return Integer.compare(gzz.g(gzvVar), gzz.g(gzvVar2));
            }
        })).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int g(gzv gzvVar) {
        if (gzvVar == null) {
            return 0;
        }
        return gzvVar.d();
    }

    public static int o(List<gzv> list) {
        if (njy.e(list)) {
            return 0;
        }
        return ((gzv) Collections.min(list, new Comparator<gzv>() { // from class: gzz.3
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int compare(gzv gzvVar, gzv gzvVar2) {
                return Double.compare(gzz.j(gzvVar), gzz.j(gzvVar2));
            }
        })).a();
    }

    public static float m(List<gzv> list) {
        if (njy.e(list)) {
            return 0.0f;
        }
        return ((gzv) Collections.max(list, new Comparator() { // from class: had
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Double.compare(gzz.i((gzv) obj), gzz.i((gzv) obj2));
            }
        })).t();
    }

    private static float i(gzv gzvVar) {
        if (gzvVar != null && gzvVar.t() > 0.0f) {
            return gzvVar.t();
        }
        return 0.0f;
    }

    public static float k(List<gzv> list) {
        if (njy.e(list)) {
            return 0.0f;
        }
        return ((gzv) Collections.max(list, new Comparator() { // from class: hac
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Double.compare(gzz.n((gzv) obj), gzz.n((gzv) obj2));
            }
        })).q();
    }

    private static float n(gzv gzvVar) {
        if (gzvVar != null && gzvVar.q() > 0.0f) {
            return gzvVar.q();
        }
        return 0.0f;
    }

    public static float i(List<gzv> list) {
        if (njy.e(list)) {
            return 0.0f;
        }
        return ((gzv) Collections.max(list, new Comparator() { // from class: hab
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Double.compare(gzz.a((gzv) obj), gzz.a((gzv) obj2));
            }
        })).o();
    }

    private static float a(gzv gzvVar) {
        if (gzvVar == null) {
            return 0.0f;
        }
        return Math.max(gzvVar.o(), 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double j(gzv gzvVar) {
        if (gzvVar == null) {
            return 0.0d;
        }
        if (gzvVar.a() <= 0) {
            return 2.147483647E9d;
        }
        return gzvVar.a();
    }

    public static int h(List<gzv> list) {
        if (njy.e(list)) {
            return 0;
        }
        return ((gzv) Collections.max(list, new Comparator<gzv>() { // from class: gzz.4
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(gzv gzvVar, gzv gzvVar2) {
                return Integer.compare(gzz.f(gzvVar), gzz.f(gzvVar2));
            }
        })).l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int f(gzv gzvVar) {
        if (gzvVar == null) {
            return 0;
        }
        if (gzvVar.l() <= 0) {
            return Integer.MIN_VALUE;
        }
        return gzvVar.l();
    }

    public static float l(List<gzv> list) {
        if (njy.e(list)) {
            return 0.0f;
        }
        return b(((gzv) Collections.min(list, new Comparator<gzv>() { // from class: gzz.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(gzv gzvVar, gzv gzvVar2) {
                return Integer.compare(gzz.h(gzvVar), gzz.h(gzvVar2));
            }
        })).k());
    }

    public static float b(int i) {
        if (i <= 0) {
            return 0.0f;
        }
        if (i <= 10) {
            return 0.1f;
        }
        return new BigDecimal(i * 0.01f).setScale(1, 1).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h(gzv gzvVar) {
        if (gzvVar == null) {
            return 0;
        }
        if (gzvVar.k() <= 0) {
            return Integer.MAX_VALUE;
        }
        return gzvVar.k();
    }

    public static void d(MotionPathSimplify motionPathSimplify, int[] iArr) {
        if (motionPathSimplify == null) {
            LogUtil.e("Track_HeartRateAndStepsUtils", "motionPathSimplify is null");
            return;
        }
        iArr[0] = motionPathSimplify.getExtendDataInt("hrZ1");
        iArr[1] = motionPathSimplify.getExtendDataInt("hrZ2");
        iArr[2] = motionPathSimplify.getExtendDataInt("hrZ3");
        iArr[3] = motionPathSimplify.getExtendDataInt("hrZ4");
        iArr[4] = motionPathSimplify.getExtendDataInt("hrZ5");
    }

    public static boolean a(int[] iArr) {
        if (iArr == null) {
            return true;
        }
        LogUtil.a("Track_HeartRateAndStepsUtils", "check timeArea = ", Arrays.toString(iArr));
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

    public static int[] e(List<HeartRateData> list, int i, long j, String str, UserInfomation userInfomation, int i2) {
        List<HeartRateData> listInsertHeartRatePoint = list;
        if (njy.e(list)) {
            return new int[5];
        }
        int size = list.size();
        LogUtil.a("Track_HeartRateAndStepsUtils", "listSize = ", Integer.valueOf(size));
        int iA = a(list, j, size);
        LogUtil.a("Track_HeartRateAndStepsUtils", "requestHeartInteDuration hasTrustHeartRate ", str);
        if ("1".equals(str)) {
            Collections.sort(list, new Comparator<HeartRateData>() { // from class: gzz.8
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public int compare(HeartRateData heartRateData, HeartRateData heartRateData2) {
                    return Long.compare(heartRateData.acquireTime(), heartRateData2.acquireTime());
                }
            });
            listInsertHeartRatePoint = TrackLineChartHolder.getInstance().insertHeartRatePoint(list, iA);
            if (listInsertHeartRatePoint != null) {
                size = listInsertHeartRatePoint.size();
            }
        }
        LogUtil.a("Track_HeartRateAndStepsUtils", "timeInterval = ", Integer.valueOf(iA));
        int[] iArr = new int[5];
        a(listInsertHeartRatePoint, iArr, i, iA, size, userInfomation, i2);
        return iArr;
    }

    private static int a(List<HeartRateData> list, long j, int i) {
        if (i <= 1) {
            return 5;
        }
        int i2 = i < 6 ? i : 6;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 1; i5 < i2; i5++) {
            if (list.get(i5).acquireTime() - list.get(i5 - 1).acquireTime() < 40000) {
                i3++;
            } else {
                i4++;
            }
        }
        if (i3 > i4) {
            LogUtil.a("Track_HeartRateAndStepsUtils", "minIntervalNums > maxIntervalNums ", Integer.valueOf(i3), " ", Integer.valueOf(i4));
            return 5;
        }
        int i6 = i * 60;
        if (i6 <= TimeUnit.MILLISECONDS.toSeconds(j)) {
            LogUtil.a("Track_HeartRateAndStepsUtils", "minIntervalNums > maxIntervalNums ", Integer.valueOf(i3), " ", Integer.valueOf(i4));
            return 60;
        }
        LogUtil.a("Track_HeartRateAndStepsUtils", "beyond total time ", Integer.valueOf(i3), " ", Integer.valueOf(i4), " ", Integer.valueOf(i6));
        return 5;
    }

    private static void a(List<HeartRateData> list, int[] iArr, int i, int i2, int i3, UserInfomation userInfomation, int i4) {
        HeartZoneConf heartZoneConfE;
        if (i == -1) {
            i = 0;
        }
        if (i4 < 1 || i4 > 4) {
            i4 = 1;
        }
        if (i == 0 || i == 2 || i == 1 || i == 3) {
            heartZoneConfE = e(i4, i, userInfomation);
        } else {
            heartZoneConfE = hae.d(i4, 0, userInfomation == null ? c() : userInfomation.getAgeOrDefaultValue());
            a();
        }
        if (list == null || heartZoneConfE == null) {
            LogUtil.e("Track_HeartRateAndStepsUtils", "heartRateList is null tempHeartRateZoneConf == null ", Boolean.valueOf(heartZoneConfE == null));
            return;
        }
        LogUtil.a("Track_HeartRateAndStepsUtils", "tempHeartRateZoneConf is  ", heartZoneConfE);
        for (int i5 = 0; i5 < i3; i5++) {
            HeartRateData heartRateData = list.get(i5);
            if (heartRateData == null) {
                LogUtil.e("Track_HeartRateAndStepsUtils", "heartRateData   is  null");
            } else {
                int iFindRateRegion = heartZoneConfE.findRateRegion(heartRateData.acquireHeartRate(), heartZoneConfE.getClassifyMethod());
                if (iFindRateRegion != -1) {
                    iArr[iFindRateRegion] = iArr[iFindRateRegion] + i2;
                }
            }
        }
    }

    public static void a() {
        f36307b = null;
    }

    public static int[] d(int i, UserInfomation userInfomation, int i2) {
        HeartZoneConf heartZoneConfE;
        if (i == -1) {
            i = 0;
        }
        if (i2 < 1 || i2 > 4) {
            i2 = 1;
        }
        if (i == 0 || i == 2 || i == 1 || i == 3) {
            heartZoneConfE = e(i2, i, userInfomation);
        } else {
            heartZoneConfE = hae.d(i2, 0, userInfomation == null ? c() : userInfomation.getAgeOrDefaultValue());
        }
        if (heartZoneConfE == null) {
            LogUtil.e("Track_HeartRateAndStepsUtils", "tempHeartRateZoneConf == null");
            return new int[6];
        }
        int[] hRZone = heartZoneConfE.getHRZone();
        LogUtil.a("Track_HeartRateAndStepsUtils", "hrZoneConfig ", Arrays.toString(hRZone));
        return hRZone;
    }

    public static int[] b(List<HeartRateData> list, int[] iArr, long j, String str) {
        if (njy.e(list)) {
            return new int[5];
        }
        int size = list.size();
        LogUtil.a("Track_HeartRateAndStepsUtils", "listSize = ", Integer.valueOf(size));
        int iA = a(list, j, size);
        LogUtil.a("Track_HeartRateAndStepsUtils", "requestHeartInteDuration hasTrustHeartRate ", str);
        if ("1".equals(str)) {
            Collections.sort(list, new Comparator<HeartRateData>() { // from class: gzz.6
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public int compare(HeartRateData heartRateData, HeartRateData heartRateData2) {
                    return Long.compare(heartRateData.acquireTime(), heartRateData2.acquireTime());
                }
            });
            list = TrackLineChartHolder.getInstance().insertHeartRatePoint(list, iA);
            if (list != null) {
                size = list.size();
            }
        }
        LogUtil.a("Track_HeartRateAndStepsUtils", "timeInterval = ", Integer.valueOf(iA));
        int[] iArr2 = new int[5];
        if (list == null) {
            LogUtil.e("Track_HeartRateAndStepsUtils", "heartRateList is null");
            return iArr2;
        }
        for (int i = 0; i < size; i++) {
            HeartRateData heartRateData = list.get(i);
            if (heartRateData == null) {
                LogUtil.e("Track_HeartRateAndStepsUtils", "heartRateData is null");
            } else {
                int iE = e(heartRateData.acquireHeartRate(), iArr);
                if (iE != -1) {
                    iArr2[iE] = iArr2[iE] + iA;
                }
            }
        }
        return iArr2;
    }

    private static int e(int i, int[] iArr) {
        if (i >= 255) {
            return -1;
        }
        if (i >= iArr[4]) {
            return 4;
        }
        if (i >= iArr[3]) {
            return 3;
        }
        if (i >= iArr[2]) {
            return 2;
        }
        if (i >= iArr[1]) {
            return 1;
        }
        return i >= iArr[0] ? 0 : -1;
    }

    public static HeartZoneConf e(int i, int i2, UserInfomation userInfomation) {
        if (i < 1 || i > 4) {
            i = 1;
        }
        LogUtil.a("Track_HeartRateAndStepsUtils", "mHeartRateZoneConf = null is  ", Boolean.valueOf(f36307b == null));
        if (f36307b == null) {
            if (i2 == -1) {
                i2 = 0;
            }
            int iC = userInfomation == null ? c() : userInfomation.getAgeOrDefaultValue();
            if (i2 == 0) {
                f36307b = hae.a(i, iC);
            } else {
                f36307b = hae.d(i, iC, i2 != 2 ? i2 : 0);
            }
        }
        return f36307b;
    }

    private static int c() {
        try {
            Date date = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH).parse(UserInfomation.BIRTHDAY_DEFAULT);
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar.setTime(new Date());
            calendar2.setTime(date);
            if (calendar2.after(calendar)) {
                LogUtil.j("Track_HeartRateAndStepsUtils", "are you born in the future?");
                return 0;
            }
            int i = calendar.get(1) - calendar2.get(1);
            return calendar.get(6) < calendar2.get(6) ? i - 1 : i;
        } catch (ParseException unused) {
            LogUtil.j("Track_HeartRateAndStepsUtils", "birthday str parse error");
            return 0;
        }
    }

    public static int d() {
        int i;
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.UserPreference_HeartRate_Classify_Method");
        if (userPreference != null) {
            try {
                i = Integer.parseInt(userPreference.getValue());
            } catch (NumberFormatException unused) {
                LogUtil.e("Track_HeartRateAndStepsUtils", " parse userPreference value fail ");
                i = 0;
            }
        } else {
            i = 0;
        }
        LogUtil.d("Track_HeartRateAndStepsUtils", "initHeartZoneClassifyMethod classifyMethod  is", Integer.valueOf(i));
        if (i == 0) {
            return 2;
        }
        return i;
    }

    public static int d(int i) {
        HeartRateZoneMgr heartRateZoneMgrByCache;
        int classifyMethod;
        HealthDataMgrApi healthDataMgrApi = (HealthDataMgrApi) Services.d("HWHealthDataMgr", HealthDataMgrApi.class);
        if (healthDataMgrApi == null) {
            LogUtil.j("Track_HeartRateAndStepsUtils", "requestClassifyMethod healthDataMgrApi null");
            heartRateZoneMgrByCache = null;
        } else {
            heartRateZoneMgrByCache = healthDataMgrApi.getHeartRateZoneMgrByCache();
        }
        if (heartRateZoneMgrByCache == null || heartRateZoneMgrByCache.getPostureType(i) == null) {
            LogUtil.e("Track_HeartRateAndStepsUtils", "allPostureData == null");
            classifyMethod = 0;
        } else {
            classifyMethod = heartRateZoneMgrByCache.getPostureType(i).getClassifyMethod();
        }
        if (classifyMethod == 0) {
            return 2;
        }
        return classifyMethod;
    }

    private static int c(float f) {
        return (((int) (f + 2.5f)) / 5) * 5;
    }

    public static int d(float f) {
        return (((int) (f + 1.0f)) / 2) * 2;
    }

    public static void a(ArrayList arrayList, int i, SugChart sugChart) {
        float size;
        if (njy.e(arrayList) || sugChart == null) {
            return;
        }
        if (i != 3 || (arrayList.get(0) instanceof StepRateData)) {
            d = 60;
            size = arrayList.size() * 60;
            if (arrayList.size() > 2) {
                size = c(arrayList, size);
            }
        } else {
            d = 5;
            size = arrayList.size() * 5;
        }
        int minutes = (int) TimeUnit.SECONDS.toMinutes(Math.round(size - d));
        LogUtil.a("Track_HeartRateAndStepsUtils", "count: ", Integer.valueOf(arrayList.size()), " tracktype: ", Integer.valueOf(i), " interval: ", Integer.valueOf(d));
        d(arrayList, sugChart, size, minutes);
    }

    private static float c(ArrayList arrayList, float f) {
        int size;
        if (arrayList.get(1) instanceof StepRateData) {
            if (((StepRateData) arrayList.get(1)).acquireTime() - ((StepRateData) arrayList.get(0)).acquireTime() < 40000) {
                d = 5;
                size = arrayList.size();
                return size * 5;
            }
            return f;
        }
        if (((HeartRateData) arrayList.get(1)).acquireTime() - ((HeartRateData) arrayList.get(0)).acquireTime() < 40000) {
            d = 5;
            size = arrayList.size();
            return size * 5;
        }
        return f;
    }

    private static void d(ArrayList arrayList, SugChart sugChart, float f, int i) {
        if (i > 15) {
            ArrayList arrayList2 = new ArrayList(16);
            arrayList2.add(Integer.valueOf(Math.abs(i - (c(i / 5) * 5))));
            arrayList2.add(Integer.valueOf(Math.abs(i - (c(i / 4) * 4))));
            arrayList2.add(Integer.valueOf(Math.abs(i - (c(i / 3) * 3))));
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                if (((Integer) Collections.min(arrayList2)).compareTo((Integer) arrayList2.get(i2)) == 0) {
                    int i3 = 5 - i2;
                    a(i3, c(i / i3), arrayList, f, sugChart);
                    return;
                }
            }
            return;
        }
        if (i <= 3) {
            a(3, 1, arrayList, f, sugChart);
            return;
        }
        int i4 = i / 5;
        int i5 = i / 4;
        int i6 = i / 3;
        if (i % 5 == 0) {
            a(5, i4, arrayList, f, sugChart);
            return;
        }
        if (i % 4 == 0) {
            a(4, i5, arrayList, f, sugChart);
            return;
        }
        if (i % 3 == 0) {
            a(3, i6, arrayList, f, sugChart);
            return;
        }
        ArrayList arrayList3 = new ArrayList(16);
        arrayList3.add(Integer.valueOf(Math.abs(i - (i4 * 5))));
        arrayList3.add(Integer.valueOf(Math.abs(i - (i5 * 4))));
        arrayList3.add(Integer.valueOf(Math.abs(i - (i6 * 3))));
        a(arrayList, sugChart, f, i, (ArrayList<Integer>) arrayList3);
    }

    private static void a(ArrayList arrayList, SugChart sugChart, float f, int i, ArrayList<Integer> arrayList2) {
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            if (((Integer) Collections.min(arrayList2)).compareTo(arrayList2.get(i2)) == 0) {
                int i3 = 5 - i2;
                a(i3, i / i3, arrayList, f, sugChart);
                return;
            }
        }
    }

    private static void a(int i, int i2, ArrayList arrayList, float f, SugChart sugChart) {
        int iRound;
        float minutes = i * i2;
        if (f - d > TimeUnit.MINUTES.toSeconds((long) minutes)) {
            LogUtil.a("Track_HeartRateAndStepsUtils", "max time: ", LogAnonymous.a(TimeUnit.MINUTES.toMillis(((long) i) * ((long) i2))));
        }
        if (TimeUnit.SECONDS.toMinutes((long) (f - d)) > minutes) {
            minutes = TimeUnit.SECONDS.toMinutes((long) (f - d));
        }
        int i3 = d;
        float f2 = i3;
        if (i3 == 5) {
            iRound = Math.round(((minutes * 60.0f) + f2) / 5.0f);
        } else {
            iRound = Math.round(1.0f + minutes);
        }
        if (arrayList.size() > iRound) {
            iRound = arrayList.size();
        }
        if (iRound >= 150) {
            LogUtil.a("Track_HeartRateAndStepsUtils", Integer.valueOf(arrayList.size()), "point count: ", 150, " max time: ", LogAnonymous.a((int) TimeUnit.MINUTES.toMillis((long) minutes)));
            f2 = ((60.0f * minutes) + d) / 150;
            iRound = 150;
        } else {
            LogUtil.a("Track_HeartRateAndStepsUtils", "count: ", Integer.valueOf(iRound), " actual count: ", Integer.valueOf(arrayList.size()), " max time: ", LogAnonymous.a((int) TimeUnit.MINUTES.toMillis((long) minutes)));
        }
        ArrayList arrayList2 = new ArrayList(16);
        d(arrayList, f - d, f2, iRound, arrayList2);
        if (arrayList.get(0) instanceof HeartRateData) {
            LogUtil.a("Track_HeartRateAndStepsUtils", "heart group: ", Integer.valueOf(i));
            c(arrayList, (ArrayList<gzk>) arrayList2);
            sugChart.setXNums(i, i2, minutes);
            sugChart.a(HeartRateThresholdConfig.HEART_RATE_LIMIT);
            sugChart.a(arrayList2);
            return;
        }
        LogUtil.a("Track_HeartRateAndStepsUtils", "step group: ", Integer.valueOf(i));
        b(arrayList, arrayList2);
        sugChart.b(true);
        sugChart.setXNums(i, i2, minutes);
        sugChart.a(300);
        sugChart.a(arrayList2);
    }

    private static void d(ArrayList arrayList, float f, float f2, int i, ArrayList<gzk> arrayList2) {
        for (int i2 = 0; i2 < i; i2++) {
            float f3 = i2 * f2;
            gzk gzkVar = new gzk(0.0f, "");
            if (f3 > f) {
                gzkVar = new gzk(-100.0f, "" + ((int) TimeUnit.SECONDS.toMinutes((long) f3)));
            } else {
                int[] iArr = new int[2];
                for (int i3 = iArr[0]; i3 < arrayList.size(); i3++) {
                    e(arrayList, f3, gzkVar, iArr, i3);
                }
            }
            arrayList2.add(gzkVar);
        }
    }

    private static void e(ArrayList arrayList, float f, gzk gzkVar, int[] iArr, int i) {
        int i2 = d * i;
        iArr[1] = i2;
        if (Math.abs(i2 - f) < 1.0E-7d) {
            iArr[0] = i + 1;
            gzkVar.d(b(arrayList.get(i)));
            return;
        }
        if (iArr[1] < f) {
            int i3 = i + 1;
            if (i3 >= arrayList.size()) {
                LogUtil.d("Track_HeartRateAndStepsUtils", "mStepRateList out of bound");
                gzkVar.d(b(arrayList.get(arrayList.size() - 1)));
                return;
            }
            double d2 = d * i3;
            if (d2 >= f) {
                iArr[0] = i3;
                int iB = b(arrayList.get(i));
                double dB = b(arrayList.get(i3)) - iB;
                int i4 = iArr[1];
                gzkVar.d((int) Math.round(((double) iB) + ((dB / (d2 - ((double) i4))) * ((double) (f - i4)))));
                return;
            }
            return;
        }
        LogUtil.a("Track_HeartRateAndStepsUtils", "handleTotalData else");
    }

    private static void c(ArrayList arrayList, ArrayList<gzk> arrayList2) {
        gzk gzkVar = (gzk) Collections.max(arrayList2, new Comparator<gzk>() { // from class: gzz.7
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compare(gzk gzkVar2, gzk gzkVar3) {
                return Float.compare(gzkVar2.d(), gzkVar3.d());
            }
        });
        float fD = d(arrayList);
        if (Float.compare(gzkVar.d(), fD) != 0) {
            LogUtil.d("Track_HeartRateAndStepsUtils", "heart rate max");
            gzkVar.d(fD);
        }
        gzk gzkVar2 = (gzk) Collections.min(arrayList2, new Comparator<gzk>() { // from class: gzz.10
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(gzk gzkVar3, gzk gzkVar4) {
                return Float.compare(gzkVar3.d() <= 0.0f ? Float.MAX_VALUE : gzkVar3.d(), gzkVar4.d() > 0.0f ? gzkVar4.d() : Float.MAX_VALUE);
            }
        });
        float fB = b((List<HeartRateData>) arrayList);
        if (Float.compare(gzkVar2.d(), fB) != 0) {
            LogUtil.d("Track_HeartRateAndStepsUtils", "heart rate min");
            gzkVar2.d(fB);
        }
    }

    public static ArrayList<StepRateData> c(ArrayList<StepRateData> arrayList, int i, int i2) {
        int i3;
        int iAcquireStepRate;
        StepRateData next;
        if (i != 3 || a(arrayList, i2)) {
            return arrayList;
        }
        LogUtil.a("Track_HeartRateAndStepsUtils", "requestStepRateList arrange StepRateList");
        ArrayList<StepRateData> arrayList2 = new ArrayList<>(16);
        Iterator<StepRateData> it = arrayList.iterator();
        loop0: while (true) {
            i3 = 0;
            iAcquireStepRate = 0;
            do {
                if (!it.hasNext()) {
                    break loop0;
                }
                next = it.next();
                i3++;
                iAcquireStepRate += next.acquireStepRate();
            } while (i3 != 12);
            next.saveStepRate(iAcquireStepRate / i3);
            arrayList2.add(next);
        }
        if (i3 != 0) {
            arrayList.get(arrayList.size() - 1).saveStepRate(iAcquireStepRate / 12);
            arrayList2.add(arrayList.get(arrayList.size() - 1));
        }
        return arrayList2;
    }

    private static boolean a(ArrayList<StepRateData> arrayList, int i) {
        return arrayList == null || arrayList.size() < 3 || arrayList.get(1).acquireTime() - arrayList.get(0).acquireTime() > ((long) i);
    }

    public static int g(List<njp> list) {
        int iE = 0;
        if (njy.e(list)) {
            return 0;
        }
        if (list.size() == 1) {
            if (list.get(0) != null) {
                return list.get(0).e();
            }
            return 0;
        }
        for (njp njpVar : list) {
            if (njpVar != null && njpVar.e() > iE) {
                iE = njpVar.e();
            }
        }
        return iE;
    }

    public static int j(List<njq> list) {
        int iC;
        if (njy.e(list)) {
            return 0;
        }
        if (list.size() == 1) {
            if (list.get(0) != null) {
                return list.get(0).c();
            }
            return 0;
        }
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                iC = Integer.MAX_VALUE;
                break;
            }
            if (list.get(i) != null && list.get(i).c() > 0) {
                iC = list.get(i).c();
                break;
            }
            i++;
        }
        if (i == list.size() - 1) {
            return 0;
        }
        while (i < list.size()) {
            njq njqVar = list.get(i);
            if (njqVar != null && njqVar.c() > 0 && njqVar.c() < iC) {
                iC = njqVar.c();
            }
            i++;
        }
        if (iC == Integer.MAX_VALUE) {
            return 0;
        }
        return iC;
    }

    public static List<qml> a(List<nje> list) {
        ArrayList arrayList = new ArrayList();
        if (njy.e(list)) {
            LogUtil.j("Track_HeartRateAndStepsUtils", "no sportExtendDetails");
            return arrayList;
        }
        for (nje njeVar : list) {
            if (njeVar != null) {
                arrayList.add(new qml(njeVar.c(), njeVar.d(), njeVar.b(), njeVar.a(), BaseApplication.getContext().getColor(R.color.track_heart_control_bg)));
            }
        }
        return arrayList;
    }
}
