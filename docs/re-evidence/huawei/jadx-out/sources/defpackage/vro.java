package defpackage;

import com.huawei.healthcloud.plugintrack.ui.view.SportDetailItem;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.history.view.InterfaceItemDataShower;
import com.huawei.ui.main.stories.history.view.StasticViewType;
import com.huawei.ui.main.stories.history.view.staticitem.DistanceStaticItemShower;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class vro {
    private static Map<String, InterfaceItemDataShower> e;

    public static SportDetailItem.a e(Map<String, Double> map, String str, int i) {
        if (e == null) {
            e = b();
        }
        if (!e.containsKey(str)) {
            LogUtil.e("Track_MonthDataHandleType", "ShouwerMap is not contiankey viewType");
            return null;
        }
        InterfaceItemDataShower interfaceItemDataShower = e.get(str);
        if (interfaceItemDataShower == null) {
            LogUtil.e("Track_MonthDataHandleType", "monthDataShower is null");
            return null;
        }
        interfaceItemDataShower.setBaseInformation(map, i);
        if ("--".equals(interfaceItemDataShower.getMainStaticData())) {
            LogUtil.e("Track_MonthDataHandleType", "getMainStaticData is --");
            return null;
        }
        return new SportDetailItem.a(null, "", interfaceItemDataShower.getMainStaticName(), interfaceItemDataShower.getMainStaticData(), interfaceItemDataShower.getUnit(), "");
    }

    private static Map<String, InterfaceItemDataShower> b() {
        List<String> listD = d(DistanceStaticItemShower.class.getPackage().getName());
        HashMap map = new HashMap();
        for (String str : listD) {
            map.put(b(d(str, false)), c(str));
        }
        LogUtil.a("Track_MonthDataHandleType", "list is ", Integer.valueOf(listD.size()));
        return map;
    }

    private static String b(Class<?> cls) {
        StasticViewType stasticViewType = (StasticViewType) cls.getAnnotation(StasticViewType.class);
        LogUtil.a("Track_MonthDataHandleType", " getViewType", stasticViewType.getDataType());
        return stasticViewType.getDataType();
    }

    private static InterfaceItemDataShower c(String str) {
        try {
            Object objNewInstance = Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (objNewInstance instanceof InterfaceItemDataShower) {
                return (InterfaceItemDataShower) objNewInstance;
            }
            return null;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            LogUtil.e("Track_MonthDataHandleType", "getConstructor failed, clsName", str);
            return null;
        }
    }

    public static ClassLoader a() {
        return Thread.currentThread().getContextClassLoader();
    }

    public static Class<?> d(String str, boolean z) {
        try {
            return Class.forName(str, z, a());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static List<String> d(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str + ".ActiveTimeStaticItemShower");
        arrayList.add(str + ".AveragePaceStaticItemShower");
        arrayList.add(str + ".AverageSpeedStaticItemShower");
        arrayList.add(str + ".CaloriesStaticItemShower");
        arrayList.add(str + ".DistanceStaticItemShower");
        arrayList.add(str + ".SkipRopeNumberItemShower");
        arrayList.add(str + ".SportTimesStaticItemShower");
        arrayList.add(str + ".StrengthTrainingTimeItemShower");
        arrayList.add(str + ".StepStaticItemShower");
        arrayList.add(str + ".TimeStaticItemShower");
        arrayList.add(str + ".VerticalJumpsStaticsItemShower");
        arrayList.add(str + ".DivingDepthItemShower");
        arrayList.add(str + ".DivingDurationItemShower");
        arrayList.add(str + ".DivingTimesShower");
        arrayList.add(str + ".DivingUnderwaterTimeItemShower");
        arrayList.add(str + ".ExpDistanceShower");
        arrayList.add(str + ".DriveTimesShower");
        arrayList.add(str + ".TotalDescentStaticItemShower");
        return arrayList;
    }
}
