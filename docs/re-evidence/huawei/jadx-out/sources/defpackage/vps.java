package defpackage;

import android.content.Context;
import com.huawei.healthcloud.plugintrack.ui.sporttypeconfig.bean.HwSportTypeInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.history.adapter.monthdatashower.MonthDataShower;
import com.huawei.ui.main.stories.history.adapter.monthdatashower.MonthStatisticViewType;
import com.huawei.ui.main.stories.history.adapter.monthdatashower.totalshower.DistanceShower;
import com.huawei.ui.main.stories.history.view.MonthTitleItem;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class vps {
    private static Map<String, MonthDataShower> e;

    public static MonthTitleItem.d a(String str, Map<String, Double> map, HwSportTypeInfo hwSportTypeInfo, Context context) {
        MonthDataShower monthDataShower;
        if (e == null) {
            e = c();
        }
        if (!e.containsKey(str) || (monthDataShower = e.get(str)) == null) {
            return null;
        }
        monthDataShower.setBaseInformation(map, hwSportTypeInfo, context);
        if (monthDataShower.getMainMonthData().equals("---")) {
            return null;
        }
        return new MonthTitleItem.d(monthDataShower.getMainMonthData(), monthDataShower.getUnit());
    }

    private static Map<String, MonthDataShower> c() {
        List<String> listB = b(DistanceShower.class.getPackage().getName());
        HashMap map = new HashMap();
        for (String str : listB) {
            map.put(e(c(str, false)), a(str));
        }
        LogUtil.a("Track_MonthDataHandleType", "list is ", Integer.valueOf(listB.size()));
        return map;
    }

    private static String e(Class<?> cls) {
        MonthStatisticViewType monthStatisticViewType = (MonthStatisticViewType) cls.getAnnotation(MonthStatisticViewType.class);
        if (monthStatisticViewType == null) {
            LogUtil.e("Track_MonthDataHandleType", "clazz ", cls.getName());
            return "";
        }
        LogUtil.a("Track_MonthDataHandleType", " getViewType", monthStatisticViewType.type());
        return monthStatisticViewType.type();
    }

    private static MonthDataShower a(String str) {
        try {
            Object objNewInstance = Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (objNewInstance instanceof MonthDataShower) {
                return (MonthDataShower) objNewInstance;
            }
            return null;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            LogUtil.e("Track_MonthDataHandleType", "getConstructor failed, clsName", str);
            return null;
        }
    }

    private static ClassLoader d() {
        return Thread.currentThread().getContextClassLoader();
    }

    private static Class<?> c(String str, boolean z) {
        try {
            return Class.forName(str, z, d());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static List<String> b(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str + ".BasketballCountShower");
        arrayList.add(str + ".CalorieShower");
        arrayList.add(str + ".DistanceShower");
        arrayList.add(str + ".DurationShower");
        arrayList.add(str + ".FirstDistanceShower");
        arrayList.add(str + ".FirstDurationShower");
        arrayList.add(str + ".FirstMeterDistanceShower");
        arrayList.add(str + ".MeterDistanceShower");
        arrayList.add(str + ".TimesShower");
        arrayList.add(str + ".CountShower");
        arrayList.add(str + ".DepthShower");
        arrayList.add(str + ".WaterDuration");
        arrayList.add(str + ".DivingCountShower");
        arrayList.add(str + ".DriveCountShower");
        return arrayList;
    }
}
