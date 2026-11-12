package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.health.servicesui.R;
import com.huawei.healthcloud.plugintrack.model.PostureJudgeBean;
import com.huawei.healthcloud.plugintrack.model.SportDetailChartDataType;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class jpz {
    public static Map<Integer, List<Integer>> b(MotionPath motionPath, PostureJudgeBean postureJudgeBean) {
        if (motionPath == null || njy.e(motionPath.requestRealTimePaceList())) {
            return null;
        }
        List<njl> listRequestRealTimePaceList = motionPath.requestRealTimePaceList();
        HashMap map = new HashMap();
        List<Integer> listE = e(postureJudgeBean);
        Iterator<Integer> it = listE.iterator();
        while (it.hasNext()) {
            map.put(it.next(), new ArrayList());
        }
        for (njl njlVar : listRequestRealTimePaceList) {
            if (njlVar != null && njlVar.acquireTime() > 0 && njlVar.e() > 0) {
                int iA = a(njlVar.e(), listE);
                if (map.containsKey(Integer.valueOf(iA)) && map.get(Integer.valueOf(iA)) != null) {
                    ((List) map.get(Integer.valueOf(iA))).add(Integer.valueOf((int) njlVar.acquireTime()));
                }
            }
        }
        b(map, listE);
        return map;
    }

    private static void b(Map<Integer, List<Integer>> map, List<Integer> list) {
        List<Integer> list2;
        for (int i = 0; i < list.size() && ((list2 = map.get(list.get(i))) == null || list2.isEmpty()); i++) {
            map.remove(list.get(i));
            LogUtil.a("Track_PostureRangeUtils", "remove Invalid speed data lower", list.get(i));
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            List<Integer> list3 = map.get(list.get(size));
            if (list3 != null && !list3.isEmpty()) {
                return;
            }
            map.remove(list.get(size));
            LogUtil.a("Track_PostureRangeUtils", "remove Invalid speed data upper", list.get(size));
        }
    }

    private static List<Integer> e(PostureJudgeBean postureJudgeBean) {
        ArrayList arrayList = new ArrayList();
        Iterator<PostureJudgeBean.a> it = postureJudgeBean.getPaceList().iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().d()));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static int a(int i, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            if (i >= list.get(size).intValue()) {
                return list.get(size).intValue();
            }
        }
        return 0;
    }

    public static void b(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, int i, List<jbo> list) {
        if (qpvVar == null || njy.e(list)) {
            LogUtil.j("Track_PostureRangeUtils", "addRunningPaceToTableSet with error parameter tableDataSet:", qpvVar, " index:", Integer.valueOf(i));
        } else {
            a(qpvVar, qpvVar.getRowsCount(), i, list);
        }
    }

    public static void a(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, int i, int i2, List<jbo> list) {
        if (qpvVar == null || i < 0 || njy.e(list)) {
            LogUtil.j("Track_PostureRangeUtils", "putRunningPaceToTableSet with error parameter tableDataSet:", qpvVar, " trackRunningSpeed:", Integer.valueOf(i2), " rowIndex:", Integer.valueOf(i));
            return;
        }
        if (BaseApplication.getContext() == null) {
            LogUtil.j("Track_PostureRangeUtils", "putRunningPaceToTableSet with context is null");
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            b(qpvVar, list.get(i3), i3, i2);
        }
    }

    private static String d(float f, boolean z) {
        if (f <= 0.0f) {
            return "--";
        }
        if (z) {
            return UnitUtil.e((int) f, 1, 0);
        }
        return UnitUtil.e(f, 1, 1);
    }

    private static void b(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, jbo jboVar, int i, int i2) {
        int i3 = i + 1;
        if (i2 == 0) {
            qpvVar.putRowHeaderData(i3, 0, new jpn(jboVar.a()));
            return;
        }
        if (i2 == 1) {
            qpvVar.putContentData(i3, 1, new jpn(jboVar.g()));
            return;
        }
        if (i2 == 2) {
            qpvVar.putContentData(i3, 2, new jpn(d(jboVar.c(), jboVar.d())));
        } else if (i2 == 3) {
            qpvVar.putContentData(i3, 3, new jpn(jboVar.e()));
        } else {
            LogUtil.j("Track_PostureRangeUtils", "exception index ", Integer.valueOf(i2));
        }
    }

    public static void e(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, SportDetailChartDataType sportDetailChartDataType, Context context) {
        if (context == null) {
            return;
        }
        qpvVar.putRowColumnHeaderData(0, 0, new jpn(context.getResources().getString(R.string.IDS_pace)));
        qpvVar.putColumnHeaderData(0, 1, new jpj(context.getResources().getString(R.string.sug_total_duration), null));
        qpvVar.putColumnHeaderData(0, 2, d(sportDetailChartDataType, context));
        qpvVar.putColumnHeaderData(0, 3, b(sportDetailChartDataType, context));
    }

    /* JADX INFO: renamed from: jpz$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[SportDetailChartDataType.values().length];
            d = iArr;
            try {
                iArr[SportDetailChartDataType.HANG_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[SportDetailChartDataType.GROUND_CONTACT_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[SportDetailChartDataType.GROUND_HANG_TIME_RATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static jpj d(SportDetailChartDataType sportDetailChartDataType, Context context) {
        int i = AnonymousClass5.d[sportDetailChartDataType.ordinal()];
        if (i == 1) {
            return new jpj(context.getResources().getString(R.string.IDS_aw_version2_average_jump_time), null);
        }
        if (i == 2) {
            return new jpj(context.getResources().getString(R.string.IDS_running_posture_avg_ground_contact_time), null);
        }
        if (i == 3) {
            return new jpj(context.getResources().getString(R.string.IDS_motiontrack__average_ground_to_air_ratio), null);
        }
        return new jpj("", null);
    }

    private static jpj b(SportDetailChartDataType sportDetailChartDataType, Context context) {
        int i = AnonymousClass5.d[sportDetailChartDataType.ordinal()];
        if (i == 1) {
            return new jpj(context.getResources().getString(R.string.IDS_aw_version2_hang_time_performance), null);
        }
        if (i == 2) {
            return new jpj(context.getResources().getString(R.string.IDS_aw_version2_contact_time_performance), null);
        }
        if (i == 3) {
            return new jpj(context.getResources().getString(R.string.IDS_aw_version2_hang_time_rate_performance), null);
        }
        return new jpj("", null);
    }

    public static List<jbo> b(Map<Integer, List<Integer>> map, SportDetailChartDataType sportDetailChartDataType, ArrayList<gzv> arrayList, List<PostureJudgeBean> list) {
        ArrayList arrayList2 = new ArrayList();
        List<Integer> listE = e(list.get(0));
        if (map == null) {
            return arrayList2;
        }
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            if (entry != null) {
                List<Integer> value = entry.getValue();
                float fA = a(value, arrayList, sportDetailChartDataType);
                jbo jboVar = new jbo(entry.getKey().intValue(), listE);
                if (sportDetailChartDataType != SportDetailChartDataType.GROUND_HANG_TIME_RATE) {
                    jboVar.c(true);
                }
                jboVar.e(fA);
                jboVar.b(value.size() * 5);
                jboVar.c(d(d(sportDetailChartDataType, list, jboVar.b()), fA, sportDetailChartDataType));
                arrayList2.add(jboVar);
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: jpy
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return jpz.b((jbo) obj, (jbo) obj2);
            }
        });
        return arrayList2;
    }

    static /* synthetic */ int b(jbo jboVar, jbo jboVar2) {
        if (jboVar == null || jboVar2 == null) {
            return 1;
        }
        return -Integer.compare(jboVar.b(), jboVar2.b());
    }

    public static int c(float f, int i, List<PostureJudgeBean> list, SportDetailChartDataType sportDetailChartDataType) {
        if (i == 0) {
            LogUtil.e("Track_PostureRangeUtils", "avg Pace is 0");
            return 0;
        }
        if (njy.e(list)) {
            LogUtil.e("Track_PostureRangeUtils", "judgeList is empty");
            return 0;
        }
        List<Integer> listE = e(list.get(0));
        return d(d(sportDetailChartDataType, list, new jbo(a(i, listE), listE).b()), f, sportDetailChartDataType);
    }

    private static List<Float> d(SportDetailChartDataType sportDetailChartDataType, List<PostureJudgeBean> list, int i) {
        String str;
        ArrayList arrayList = new ArrayList();
        int i2 = AnonymousClass5.d[sportDetailChartDataType.ordinal()];
        if (i2 == 1) {
            str = "hang_time";
        } else if (i2 == 2) {
            str = "ground_contact_time";
        } else {
            str = i2 != 3 ? "" : "contact_hang_time_rate";
        }
        if (list != null && !list.isEmpty()) {
            PostureJudgeBean postureJudgeBean = null;
            for (PostureJudgeBean postureJudgeBean2 : list) {
                if (str.equals(postureJudgeBean2.getType())) {
                    postureJudgeBean = postureJudgeBean2;
                }
            }
            if (postureJudgeBean != null) {
                for (PostureJudgeBean.a aVar : postureJudgeBean.getPaceList()) {
                    if (aVar.d() == i) {
                        return aVar.a();
                    }
                }
            }
        }
        return arrayList;
    }

    private static float a(List<Integer> list, ArrayList<gzv> arrayList, SportDetailChartDataType sportDetailChartDataType) {
        int i = 0;
        float f = 0.0f;
        for (gzv gzvVar : arrayList) {
            int iH = ((int) gzvVar.h()) / 5;
            if (gzvVar.h() % 5 > 3) {
                iH++;
            }
            if (list.contains(Integer.valueOf(iH * 5))) {
                float fC = c(gzvVar, sportDetailChartDataType);
                if (fC > 0.0f) {
                    f += fC;
                    i++;
                }
            }
        }
        if (i > 0) {
            return (float) UnitUtil.d(f / i, 1);
        }
        return 0.0f;
    }

    private static float c(gzv gzvVar, SportDetailChartDataType sportDetailChartDataType) {
        int i = AnonymousClass5.d[sportDetailChartDataType.ordinal()];
        if (i == 1) {
            return gzvVar.l();
        }
        if (i == 3) {
            return c(gzvVar.k());
        }
        return gzvVar.a();
    }

    private static int a(List<Float> list, float f) {
        for (int i = 0; i < list.size(); i++) {
            if (f < list.get(i).floatValue()) {
                return i;
            }
        }
        return list.size();
    }

    private static int d(List<Float> list, float f, SportDetailChartDataType sportDetailChartDataType) {
        if (sportDetailChartDataType == SportDetailChartDataType.HANG_TIME) {
            return a(list, f) - 1;
        }
        return 3 - a(list, f);
    }

    public static float[] b(HealthColumnSystem healthColumnSystem, boolean z) {
        if (healthColumnSystem.j() > 4) {
            LogUtil.a("Track_PostureRangeUtils", "getTotalColumnCount > 4) ");
            return new float[]{78.25f, 62.25f, 68.5f, 71.75f};
        }
        LogUtil.a("Track_PostureRangeUtils", "getTotalColumnCount < 4) ");
        if (z) {
            return new float[]{1.1f, 1.1f, 0.9f, 0.9f};
        }
        return new float[]{1.0f, 1.0f, 1.0f, 1.0f};
    }

    public static String b(Context context) {
        String strC = CommonUtil.c(fdy.d("com.huawei.health_Sport_Common", "posture_judge_update", "json"));
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("Track_PostureRangeUtils", "cloudConfigPath is illegal!");
            return null;
        }
        String strA = pia.a(new File(strC));
        LogUtil.j("Track_PostureRangeUtils", "EzPluginHelper.readFileToData jsonData = ", strA);
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String strD = d(context);
        LogUtil.j("Track_PostureRangeUtils", "parseAssestsJsonFile jsonData = ", strD);
        return strD;
    }

    private static String d(Context context) {
        try {
            return a(context.getAssets().open("posture_judge.json"));
        } catch (IOException unused) {
            LogUtil.e("Track_PostureRangeUtils", "getString IOException");
            return "";
        }
    }

    private static String a(InputStream inputStream) {
        String str = "";
        try {
            if (inputStream == null) {
                return "";
            }
            try {
                byte[] bArr = new byte[inputStream.available()];
                if (inputStream.read(bArr) > 0) {
                    str = new String(bArr, "UTF-8");
                }
            } catch (IOException unused) {
                LogUtil.e("Track_PostureRangeUtils", "getString IOException");
            }
            return str;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                LogUtil.e("Track_PostureRangeUtils", "getString ioException");
            }
        }
    }

    public static void e() {
        HashMap map = new HashMap();
        map.put("configType", "postureJudge");
        fdy.d(new fda("com.huawei.health_Sport_Common", map), "posture_judge_update", 7, (DownloadCallback<File>) new DownloadCallback() { // from class: jpz.1
            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onFinish(Object obj) {
                LogUtil.a("Track_PostureRangeUtils", "updateNewIndexFile onFinish ");
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onProgress(long j, long j2, boolean z, String str) {
                LogUtil.a("Track_PostureRangeUtils", "updateNewIndexFile onProgress ", Boolean.valueOf(z), " fileId ", str);
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onFail(int i, Throwable th) {
                LogUtil.j("Track_PostureRangeUtils", "updateNewIndexFile onFail ");
            }
        });
    }

    public static float c(int i) {
        if (i <= 0) {
            return 0.0f;
        }
        if (i <= 10) {
            return 0.1f;
        }
        return new BigDecimal(i * 0.01f).setScale(1, 1).floatValue();
    }
}
