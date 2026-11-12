package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateUtils;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.main.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class wua {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap<Integer, Integer> f52491c = new HashMap<Integer, Integer>() { // from class: wua.4
        private static final long serialVersionUID = 1914034327014654167L;

        {
            put(0, 0);
            put(1, 0);
            put(2, 0);
            put(3, 1);
            put(4, 1);
            put(5, 1);
            put(6, 2);
            put(7, 2);
            put(8, 2);
            put(9, 2);
            put(10, 3);
            put(11, 3);
            put(12, 3);
        }
    };

    public static int a(int i) {
        if (i < 70) {
            return 2;
        }
        return i > 89 ? 0 : 1;
    }

    public static String h(int i) {
        if (i < 0 || i > 12) {
            return "ERROR_SCORE";
        }
        Context context = BaseApplication.getContext();
        int iIntValue = f52491c.get(Integer.valueOf(i)).intValue();
        if (iIntValue == 1) {
            return context.getString(R.string.IDS_hw_health_blood_oxygen_mild);
        }
        if (iIntValue == 2) {
            return context.getString(R.string.IDS_hw_health_blood_oxygen_moderate);
        }
        if (iIntValue == 3) {
            return context.getString(R.string.IDS_hw_health_blood_oxygen_severe);
        }
        return context.getString(R.string.IDS_hw_pressure_normal);
    }

    public static String a(Context context, long j) {
        return DateUtils.formatDateTime(context, j, 16);
    }

    public static String e(Context context, long j) {
        return DateUtils.formatDateTime(context, j, 129);
    }

    public static String c(Context context, long j) {
        return DateUtils.formatDateTime(context, j, 145);
    }

    public static int e(int i) {
        if (i < 0 || i > 12) {
            return -1;
        }
        return d(f52491c.get(Integer.valueOf(i)).intValue());
    }

    public static int c(int i) {
        return b(a(i));
    }

    public static int d(int i) {
        Resources resources = BaseApplication.getContext().getResources();
        if (i == 1) {
            return resources.getColor(R.color.blood_oxygen_mild);
        }
        if (i == 2) {
            return resources.getColor(R.color.blood_oxygen_mid);
        }
        if (i == 3) {
            return resources.getColor(R.color.blood_oxygen_high);
        }
        if (i == 0) {
            return resources.getColor(R.color.blood_oxygen_normal);
        }
        return -1;
    }

    public static int b(int i) {
        Resources resources = BaseApplication.getContext().getResources();
        if (i == 2) {
            return resources.getColor(R.color.blood_oxygen_high);
        }
        if (i == 1) {
            return resources.getColor(R.color.blood_oxygen_mid);
        }
        return resources.getColor(R.color.blood_oxygen_normal);
    }

    public static List<HiHealthData> b(List<HiHealthData> list, List<HiHealthData> list2, List<HiHealthData> list3, boolean z) {
        if (njy.e(list) || njy.e(list2)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(10);
        for (HiHealthData hiHealthData : list) {
            if (!z || hiHealthData.getIntValue() > 2) {
                long startTime = hiHealthData.getStartTime() / 60000;
                HiHealthData hiHealthData2 = new HiHealthData();
                Iterator<HiHealthData> it = list2.iterator();
                int i = 120001;
                while (true) {
                    if (!it.hasNext()) {
                        if (i > 60000) {
                            break;
                        }
                    } else {
                        HiHealthData next = it.next();
                        if (next.getStartTime() - (startTime * 60000) == 0) {
                            e(hiHealthData2, next);
                        } else {
                            int startTime2 = (int) (next.getStartTime() - hiHealthData.getStartTime());
                            if (startTime2 >= 0 && startTime2 < i) {
                                e(hiHealthData2, next);
                                i = startTime2;
                            }
                        }
                    }
                    hiHealthData2.putInt("lakeLouiseScoreKey", hiHealthData.getIntValue());
                    hiHealthData2.putInt("bloodOxygenCardKey", 1001);
                    arrayList.add(hiHealthData2);
                    break;
                }
            }
        }
        a(arrayList, list3);
        return arrayList;
    }

    private static void e(HiHealthData hiHealthData, HiHealthData hiHealthData2) {
        hiHealthData.setStartTime(hiHealthData2.getStartTime());
        hiHealthData.setEndTime(hiHealthData2.getEndTime());
        hiHealthData.setModifiedTime(hiHealthData2.getModifiedTime());
        hiHealthData.setClientId(hiHealthData2.getClientId());
        hiHealthData.putInt("bloodOxygenKey", hiHealthData2.getInt("bloodOxygenKey"));
        hiHealthData.putInt("point_value", hiHealthData2.getIntValue());
    }

    public static void a(List<HiHealthData> list, List<HiHealthData> list2) {
        if (njy.e(list)) {
            return;
        }
        if (njy.e(list2)) {
            Iterator<HiHealthData> it = list.iterator();
            while (it.hasNext()) {
                it.next().putInt("altitudeKey", Integer.MIN_VALUE);
            }
            return;
        }
        for (HiHealthData hiHealthData : list) {
            hiHealthData.putInt("altitudeKey", Integer.MIN_VALUE);
            long j = 60001;
            for (HiHealthData hiHealthData2 : list2) {
                long jAbs = Math.abs(hiHealthData.getStartTime() - hiHealthData2.getStartTime());
                if (jAbs < j) {
                    hiHealthData.putInt("altitudeKey", hiHealthData2.getInt("altitudeKey"));
                    j = jAbs;
                }
            }
        }
    }
}
