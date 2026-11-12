package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.sporttypeconfig.bean.HwSportDataStaticsInfo;
import com.huawei.healthcloud.plugintrack.ui.sporttypeconfig.bean.HwSportTypeInfo;
import com.huawei.healthcloud.plugintrack.ui.sporttypeconfig.bean.HwStaticsRequestData;
import com.huawei.healthcloud.plugintrack.ui.sporttypeconfig.bean.SportGroupData;
import com.huawei.healthcloud.plugintrack.ui.sporttypeconfig.bean.SportTypeData;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class jry {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<String> f38958c = new ArrayList(Arrays.asList("Track_100014", "Track_2592", "Track_2572", "Track_2582"));
    private static final Map<String, Integer> e = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SportTypeData f38959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SportGroupData f38960b;

    private jry() {
    }

    public static final jry a(Context context) {
        jry jryVar = b.f38961c;
        jryVar.d(context);
        jryVar.e(context);
        jryVar.b(context);
        return jryVar;
    }

    private void d(Context context) {
        if (context != null && this.f38959a == null) {
            try {
                this.f38959a = (SportTypeData) lls.a(context.getAssets().open("SportTypeConfig.json"), SportTypeData.class);
            } catch (IOException e2) {
                LogUtil.e("TAG_HwSportTypeManager", LogAnonymous.b(e2));
            }
            SportTypeData sportTypeData = this.f38959a;
            LogUtil.a("TAG_HwSportTypeManager", "mSportTypeData : ", sportTypeData == null ? 0 : sportTypeData.getVersion());
        }
    }

    private void b(Context context) {
        if (context == null) {
            return;
        }
        Map<String, Integer> map = e;
        if (map.isEmpty()) {
            map.put("health_kit.huawei.com", Integer.valueOf(R.drawable.ic_ball_pick));
            map.put("health_kit_1.huawei.com", Integer.valueOf(R.drawable.ic_ball_pick));
            map.put("com.harmonyfit.spacey", Integer.valueOf(R.drawable.ic_spacey_up_moon));
            map.put("com.eros.jswatch.badminton", Integer.valueOf(R.drawable.ic_shuttlecock));
            map.put("com.eros.jswatch.pickle", Integer.valueOf(R.drawable.ic_ball_pick));
            map.put("com.eros.jswatch.tennis", Integer.valueOf(R.drawable.ic_tennis_ball));
            map.put("com.gzyunke.lianlian.huaweigt", Integer.valueOf(R.drawable.ic_workout_fitness));
            map.put("com.waynn.memosoccer.watch", Integer.valueOf(R.drawable.ic_football_notes));
        }
    }

    private void e(Context context) {
        if (context != null && this.f38960b == null) {
            try {
                this.f38960b = (SportGroupData) lls.a(context.getAssets().open("SportGroupConfig.json"), SportGroupData.class);
            } catch (IOException e2) {
                LogUtil.e("TAG_HwSportTypeManager", LogAnonymous.b(e2));
            }
            SportGroupData sportGroupData = this.f38960b;
            LogUtil.a("TAG_HwSportTypeManager", "mSportGroupData : ", sportGroupData == null ? 0 : sportGroupData.getVersion());
        }
    }

    public HwSportTypeInfo b(int i) {
        if (b()) {
            return null;
        }
        for (HwSportTypeInfo hwSportTypeInfo : this.f38959a.getSportTypeInfos()) {
            if (hwSportTypeInfo != null && hwSportTypeInfo.getSportTypeId() == i) {
                return hwSportTypeInfo;
            }
        }
        return null;
    }

    public String[] d(List<HwSportDataStaticsInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (njy.e(list)) {
            LogUtil.e("TAG_HwSportTypeManager", "sportDataStatics  is  Empty");
            return null;
        }
        Iterator<HwSportDataStaticsInfo> it = list.iterator();
        while (it.hasNext()) {
            for (HwStaticsRequestData hwStaticsRequestData : it.next().getStaticsRequestData()) {
                if (!arrayList.contains(hwStaticsRequestData.getRequestDataString())) {
                    arrayList.add(hwStaticsRequestData.getRequestDataString());
                }
            }
        }
        if (njy.e(arrayList)) {
            LogUtil.e("TAG_HwSportTypeManager", "staticsRequestString  is  Empty");
            return null;
        }
        String[] strArr = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            strArr[i] = (String) arrayList.get(i);
        }
        return strArr;
    }

    public int[] c(List<HwSportDataStaticsInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (njy.e(list)) {
            LogUtil.e("TAG_HwSportTypeManager", "sportDataStatics  is  Empty");
            return null;
        }
        for (HwSportDataStaticsInfo hwSportDataStaticsInfo : list) {
            if (hwSportDataStaticsInfo == null) {
                LogUtil.e("TAG_HwSportTypeManager", "staticsInfo  is  Empty");
            } else {
                for (HwStaticsRequestData hwStaticsRequestData : hwSportDataStaticsInfo.getStaticsRequestData()) {
                    if (!arrayList.contains(Integer.valueOf(hwStaticsRequestData.getRequestDataId()))) {
                        arrayList.add(Integer.valueOf(hwStaticsRequestData.getRequestDataId()));
                    }
                }
            }
        }
        if (njy.e(arrayList)) {
            LogUtil.e("TAG_HwSportTypeManager", "staticsRequstId  is  Empty");
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        return iArr;
    }

    public List<String> d() {
        if (b()) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (HwSportTypeInfo hwSportTypeInfo : this.f38959a.getSportTypeInfos()) {
            if (hwSportTypeInfo != null && hwSportTypeInfo.getHistoryList() != null && njy.c(hwSportTypeInfo.getHistoryList().getAllRequestString(hwSportTypeInfo.getSportTypeId()), 0)) {
                arrayList.add(hwSportTypeInfo.getHistoryList().getAllRequestString(hwSportTypeInfo.getSportTypeId()).get(0));
                e(hwSportTypeInfo, arrayList);
            }
        }
        if (!njy.b(arrayList)) {
            return null;
        }
        arrayList.add("Track_Count_Sum");
        return arrayList;
    }

    private void e(HwSportTypeInfo hwSportTypeInfo, ArrayList<String> arrayList) {
        if (njy.c(hwSportTypeInfo.getHistoryList().getMonthlyStatisticsData(), 3)) {
            arrayList.add(hwSportTypeInfo.getHistoryList().getAllRequestString(hwSportTypeInfo.getSportTypeId()).get(3));
        }
    }

    public List<HwSportTypeInfo> b(List<String> list) {
        HashMap map = new HashMap();
        if (b() || njy.e(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (HwSportTypeInfo hwSportTypeInfo : this.f38959a.getSportTypeInfos()) {
            if (hwSportTypeInfo != null && hwSportTypeInfo.getHistoryList() != null && njy.c(hwSportTypeInfo.getHistoryList().getAllRequestString(hwSportTypeInfo.getSportTypeId()), 0)) {
                hwSportTypeInfo.getHistoryList().getMainAndBackupMonthlyType(hwSportTypeInfo, map);
            }
        }
        for (String str : f38958c) {
            if (list.contains(str)) {
                list.remove(str);
                list.add(0, str);
            }
        }
        for (String str2 : list) {
            if (map.containsKey(str2)) {
                arrayList.add((HwSportTypeInfo) map.get(str2));
            }
        }
        return arrayList;
    }

    private boolean b() {
        SportTypeData sportTypeData = this.f38959a;
        return sportTypeData == null || sportTypeData.getSportTypeInfos() == null;
    }

    public SportTypeData c() {
        SportTypeData sportTypeData = new SportTypeData();
        sportTypeData.setVersion("0");
        SportTypeData sportTypeData2 = this.f38959a;
        return sportTypeData2 == null ? sportTypeData : sportTypeData2;
    }

    public SportGroupData a() {
        SportGroupData sportGroupData = new SportGroupData();
        sportGroupData.setVersion("0");
        SportGroupData sportGroupData2 = this.f38960b;
        return sportGroupData2 == null ? sportGroupData : sportGroupData2;
    }

    public List<Integer> e() {
        if (b()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (HwSportTypeInfo hwSportTypeInfo : this.f38959a.getSportTypeInfos()) {
            if (hwSportTypeInfo != null) {
                arrayList.add(Integer.valueOf(hwSportTypeInfo.getSportTypeId()));
            }
        }
        return arrayList;
    }

    public List<Integer> e(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("TAG_HwSportTypeManager", "getFitnessSportTypeList type is null");
            return arrayList;
        }
        for (HwSportTypeInfo hwSportTypeInfo : this.f38959a.getSportTypeInfos()) {
            if (hwSportTypeInfo != null && str.equals(hwSportTypeInfo.getGroup())) {
                arrayList.add(Integer.valueOf(hwSportTypeInfo.getSportTypeId()));
            }
        }
        return arrayList;
    }

    public int b(String str) {
        Integer num;
        Map<String, Integer> map = e;
        if (njy.e(map) || !map.containsKey(str) || (num = map.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final jry f38961c = new jry();
    }
}
