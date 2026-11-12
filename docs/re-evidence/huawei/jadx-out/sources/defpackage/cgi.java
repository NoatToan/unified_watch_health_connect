package defpackage;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class cgi {
    private static boolean d = false;
    private static int e = -1;

    public static SparseArray<HealthLifeBean> d(int i, SparseArray<HealthLifeBean> sparseArray, SparseIntArray sparseIntArray) {
        d = false;
        if (sparseIntArray == null || sparseArray == null) {
            LogUtil.j("HL_WeekTaskHelper", "getWeekTaskNewBeanList list is null.");
            return sparseArray;
        }
        SparseArray<HealthLifeBean> sparseArray2 = new SparseArray<>(sparseArray.size());
        int iE = e(i, sparseArray);
        int i2 = 0;
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            HealthLifeBean healthLifeBeanValueAt = sparseArray.valueAt(i3);
            int recordDay = healthLifeBeanValueAt.getRecordDay();
            int complete = healthLifeBeanValueAt.getComplete();
            int rest = healthLifeBeanValueAt.getRest();
            int iMax = Math.max(sparseIntArray.get(recordDay), 0);
            healthLifeBeanValueAt.setResult(String.valueOf(iMax));
            if (iMax >= CommonUtil.j(healthLifeBeanValueAt.getTarget())) {
                a(healthLifeBeanValueAt);
                if (d(iMax, iE, healthLifeBeanValueAt)) {
                    iE++;
                }
            } else {
                if (complete >= 1 && rest == 1) {
                    i2++;
                } else if (complete >= 1 && rest == 0) {
                    sparseArray2.put(recordDay, healthLifeBeanValueAt);
                } else if (complete != 0 || recordDay == DateFormatUtil.a(System.currentTimeMillis())) {
                    LogUtil.d("HL_WeekTaskHelper", "other branch.");
                } else if (iE - i2 > 0) {
                    b(healthLifeBeanValueAt);
                    i2++;
                }
            }
            sparseArray2.put(recordDay, healthLifeBeanValueAt);
        }
        if (i == 3) {
            e = iE;
        }
        return sparseArray2;
    }

    private static boolean d(int i, int i2, HealthLifeBean healthLifeBean) {
        if (healthLifeBean.getId() != 3 || i < CommonUtil.j(healthLifeBean.getTarget()) * 2 || i2 >= 4) {
            return false;
        }
        if (healthLifeBean.getRecordDay() == DateFormatUtil.a(System.currentTimeMillis())) {
            d = true;
        }
        return true;
    }

    private static void b(HealthLifeBean healthLifeBean) {
        if (healthLifeBean.getComplete() <= 0) {
            cbk.c(healthLifeBean.getId(), 1);
        }
        healthLifeBean.setComplete(1);
        healthLifeBean.setRest(1);
        long jCurrentTimeMillis = System.currentTimeMillis();
        healthLifeBean.setTimestamp(jCurrentTimeMillis);
        healthLifeBean.setTimeZone(lsl.q(jCurrentTimeMillis));
        healthLifeBean.setSyncStatus(0);
        healthLifeBean.setIsUpdated(true);
    }

    private static void a(HealthLifeBean healthLifeBean) {
        int complete = healthLifeBean.getComplete();
        int rest = healthLifeBean.getRest();
        if (complete == 0) {
            healthLifeBean.setComplete(1);
            long jCurrentTimeMillis = System.currentTimeMillis();
            healthLifeBean.setTimestamp(jCurrentTimeMillis);
            healthLifeBean.setTimeZone(lsl.q(jCurrentTimeMillis));
            healthLifeBean.setIsUpdated(true);
            healthLifeBean.setSyncStatus(0);
            cbk.c(healthLifeBean.getId(), healthLifeBean.getComplete());
            return;
        }
        if (complete >= 1 && rest == 1) {
            healthLifeBean.setComplete(1);
            healthLifeBean.setRest(0);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            healthLifeBean.setTimestamp(jCurrentTimeMillis2);
            healthLifeBean.setTimeZone(lsl.q(jCurrentTimeMillis2));
            healthLifeBean.setIsUpdated(true);
            healthLifeBean.setSyncStatus(0);
            return;
        }
        LogUtil.a("HL_WeekTaskHelper", "Complete with excercise.");
    }

    public static int a(int i, SparseArray<HealthLifeBean> sparseArray) {
        int i2;
        return (i == 4 || i == 14 || (i2 = e) < 0) ? e(i, sparseArray) : i2;
    }

    public static boolean b() {
        return d;
    }

    private static int e(int i, SparseArray<HealthLifeBean> sparseArray) {
        if (i != 4 && i != 3 && i != 14) {
            LogUtil.j("HL_WeekTaskHelper", "getAvailableRestDays not week task.");
            return 0;
        }
        if (sparseArray == null || sparseArray.size() == 0) {
            LogUtil.j("HL_WeekTaskHelper", "getAvailableRestDays beanArray is empty");
            return 0;
        }
        HealthLifeBean healthLifeBeanValueAt = sparseArray.valueAt(0);
        HealthLifeBean healthLifeBeanValueAt2 = sparseArray.valueAt(sparseArray.size() - 1);
        if (healthLifeBeanValueAt == null || healthLifeBeanValueAt2 == null) {
            LogUtil.j("HL_WeekTaskHelper", "getAvailableRestDays startBean or endBean is empty");
            return 0;
        }
        int recordDay = healthLifeBeanValueAt.getRecordDay();
        int recordDay2 = healthLifeBeanValueAt2.getRecordDay();
        List<Integer> listJ = cbg.j(recordDay);
        if (njy.e(listJ) || listJ.size() != 7) {
            LogUtil.j("HL_WeekTaskHelper", "getAvailableRestDays weekDays is empty or invalid");
            return 0;
        }
        int i2 = 0;
        for (Integer num : listJ) {
            if (num.intValue() >= recordDay && (num.intValue() > recordDay2 || sparseArray.get(num.intValue()) != null)) {
                i2++;
            }
        }
        int[] iArr = {0, 0, 1, 1, 1, 2, 2, 2};
        int[] iArr2 = {0, 0, 1, 2, 2, 3, 3, 4};
        if (i2 >= 8) {
            LogUtil.j("HL_WeekTaskHelper", "getDefaultAvailableRestDays invalid parameter caused by variable subscriptionDays");
            return 0;
        }
        if (i == 4 || i == 14) {
            return iArr2[i2];
        }
        return iArr[i2];
    }
}
