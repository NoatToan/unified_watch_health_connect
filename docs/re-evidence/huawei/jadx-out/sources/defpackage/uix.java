package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import androidx.arch.core.util.Function;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.coresleep.SleepBreatheBannerProvider;
import defpackage.gwi;
import defpackage.gwk;
import defpackage.uix;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: classes19.dex */
public class uix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Integer[]> f50210a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, Integer[]> f50211c;
    private static Properties d = new Properties();
    private static Properties e = new Properties();

    static {
        HashMap map = new HashMap();
        f50210a = map;
        HashMap map2 = new HashMap();
        f50211c = map2;
        map.put("06100000", new Integer[]{Integer.valueOf(R.string.IDS_intel_sleep_interpretation_library_061000003_nmpa), Integer.valueOf(R.string.IDS_intel_sleep_interpretation_library_061000004_nmpa)});
        map.put("06100100", new Integer[]{Integer.valueOf(R.string.IDS_intel_sleep_interpretation_library_061001003_nmpa), Integer.valueOf(R.string.IDS_intel_sleep_interpretation_library_061001004_nmpa)});
        map.put("06100200", new Integer[]{Integer.valueOf(R.string.IDS_intel_sleep_interpretation_library_061002003_nmpa), Integer.valueOf(R.string.IDS_intel_sleep_interpretation_library_061002004_nmpa)});
        map.put("06100300", new Integer[]{Integer.valueOf(R.string.IDS_intel_sleep_interpretation_library_061003003_nmpa), Integer.valueOf(R.string.IDS_intel_sleep_interpretation_library_061003004_nmpa)});
        map2.put("06100000", new Integer[]{Integer.valueOf(R.string.IDS_intel_sleep_interpretation_library_061000003), Integer.valueOf(R.string.IDS_intel_sleep_interpretation_library_061000004)});
        map2.put("06100100", new Integer[]{Integer.valueOf(R.string.IDS_intel_sleep_interpretation_library_061001003), Integer.valueOf(R.string.IDS_intel_sleep_interpretation_library_061001004)});
        map2.put("06100200", new Integer[]{Integer.valueOf(R.string.IDS_intel_sleep_interpretation_library_061002003), Integer.valueOf(R.string.IDS_intel_sleep_interpretation_library_061002004)});
        map2.put("06100300", new Integer[]{Integer.valueOf(R.string.IDS_intel_sleep_interpretation_library_061003003), Integer.valueOf(R.string.IDS_intel_sleep_interpretation_library_061003004)});
    }

    private uix() {
    }

    public static int b(int i) {
        int iE;
        synchronized (uix.class) {
            if (d.isEmpty()) {
                d = wve.c("sleep/sleepSuggest.properties");
            }
            String property = d.getProperty(String.valueOf(i));
            iE = property != null ? qre.e(property, "string", R.string.class) : -1;
            if (iE == -1) {
                iE = R.string.IDS_details_sleep_content_4_no_harvard;
            }
        }
        return iE;
    }

    public static int b(String str) {
        synchronized (uix.class) {
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            if (e.isEmpty()) {
                e = wve.c("sleep/intelsleeplibrary.properties");
            }
            String property = e.getProperty(str);
            return property != null ? qre.e(property, "string", R.string.class) : -1;
        }
    }

    public static int[] b() {
        return BaseApplication.getContext().getResources().getIntArray(R.array.IDS_sleep_dreamRateList);
    }

    public static int[] a() {
        return BaseApplication.getContext().getResources().getIntArray(R.array.IDS_sleep_fallAsleepList);
    }

    public static int[] f() {
        return BaseApplication.getContext().getResources().getIntArray(R.array.IDS_sleep_wakeList);
    }

    public static int[] j() {
        return BaseApplication.getContext().getResources().getIntArray(R.array.IDS_sleep_wakeUpTimesList);
    }

    public static int[] c() {
        return BaseApplication.getContext().getResources().getIntArray(R.array.IDS_sleep_deepRateList);
    }

    public static int[] d() {
        return BaseApplication.getContext().getResources().getIntArray(R.array.IDS_sleep_deepConstancyList);
    }

    public static int[] e() {
        return BaseApplication.getContext().getResources().getIntArray(R.array.IDS_sleep_breathQualityList);
    }

    public static int[] i() {
        return BaseApplication.getContext().getResources().getIntArray(R.array.IDS_sleep_totalSleepList);
    }

    public static String c(gxd gxdVar) {
        if (gxdVar == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList(Collections.nCopies(4, ""));
        int iB = b(gxdVar.o());
        if (iB != -1) {
            arrayList.set(0, qre.f(iB));
        }
        arrayList.set(1, d(gxdVar));
        int iB2 = b(gxdVar.n());
        if (iB2 != -1) {
            arrayList.set(2, qre.f(iB2));
        }
        int iB3 = b(gxdVar.f());
        if (iB3 != -1) {
            arrayList.set(3, qre.f(iB3));
        }
        return qre.a(R.string.IDS_three_parts, arrayList.get(0), arrayList.get(1), (String) (TextUtils.isEmpty((CharSequence) arrayList.get(2)) ? arrayList.get(3) : arrayList.get(2)));
    }

    public static String e(String str, List<gwk> list) {
        return a(list, str);
    }

    public static String a(List<gwk> list, String str) {
        int iB = b(str);
        if (iB == -1) {
            return "";
        }
        if (njy.e(list)) {
            return BaseApplication.getContext().getString(iB);
        }
        List<String> listC = c(list, new Function() { // from class: com.huawei.ui.main.stories.fitness.interactors.SleepAdviceMapHelper$$ExternalSyntheticLambda0
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                gwk gwkVar = (gwk) obj;
                return uix.e(gwkVar.e(), gwkVar.a());
            }
        });
        listC.addAll(uys.d(str));
        return qre.a(iB, listC.toArray());
    }

    public static String e(gxd gxdVar) {
        if (gxdVar == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList(Collections.nCopies(2, ""));
        arrayList.set(0, e(gxdVar.c(), gxdVar.e()));
        int iB = b(gxdVar.b());
        if (iB != -1) {
            arrayList.set(1, qre.f(iB));
        }
        return b(arrayList);
    }

    private static String b(List<String> list) {
        if (list.size() != 2) {
            ReleaseLogUtil.e("R_Sleep_SleepAdviceMapHelper", "Invaild string list length: ", Integer.valueOf(list.size()));
            return "";
        }
        if ("".equals(list.get(0)) && "".equals(list.get(1))) {
            return "";
        }
        if ("".equals(list.get(0)) || "".equals(list.get(1))) {
            return "".equals(list.get(0)) ? list.get(1) : list.get(0);
        }
        return qre.a(R.string.IDS_two_parts, list.get(0), list.get(1));
    }

    public static String e(List<gwi> list, String str) {
        Map<String, Integer[]> map = SleepBreatheBannerProvider.a() ? f50210a : f50211c;
        if (map.containsKey(str) && !njy.e(list)) {
            int iD = list.get(0).d() - 3;
            if (iD < 0 || iD >= map.get(str).length) {
                ReleaseLogUtil.d("R_Sleep_SleepAdviceMapHelper", "error val: ", Integer.valueOf(iD));
                return "";
            }
            return qre.f(map.get(str)[iD].intValue());
        }
        int iB = b(str);
        if (iB == -1) {
            return "";
        }
        if (njy.e(list)) {
            List<String> listD = uys.d(str);
            if (njy.e(listD)) {
                return BaseApplication.getContext().getString(iB);
            }
            return BaseApplication.getContext().getString(iB, listD.toArray());
        }
        return BaseApplication.getContext().getString(iB, c(list, new Function() { // from class: com.huawei.ui.main.stories.fitness.interactors.SleepAdviceMapHelper$$ExternalSyntheticLambda1
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                gwi gwiVar = (gwi) obj;
                return uix.e(gwiVar.d(), gwiVar.a());
            }
        }).toArray());
    }

    private static String d(gxd gxdVar) {
        if (gxdVar == null) {
            return "";
        }
        return e(gxdVar.g(), gxdVar.h());
    }

    public static String e(gwf gwfVar) {
        int iB = b(gwfVar.e());
        if (iB == -1) {
            return null;
        }
        List<String> listD = uys.d(gwfVar.e());
        if (njy.e(listD)) {
            return BaseApplication.getContext().getString(iB);
        }
        return BaseApplication.getContext().getString(iB, listD.toArray());
    }

    private static <T> List<String> c(List<T> list, Function<T, String> function) {
        ArrayList arrayList = new ArrayList();
        if (!njy.e(list)) {
            for (T t : list) {
                if (t != null) {
                    arrayList.add(function.apply(t));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String e(int i, int i2) {
        Resources resources = BaseApplication.getContext().getResources();
        double d2 = i;
        String strE = UnitUtil.e(d2, 1, 0);
        if (i2 != 10) {
            switch (i2) {
                case 0:
                    return UnitUtil.e(d2, 1, 0);
                case 1:
                    return UnitUtil.e(d2, 2, 0);
                case 2:
                    return UnitUtil.d("HH:mm", ((long) i) * 1000);
                case 3:
                    return resources.getQuantityString(com.huawei.ui.commonui.R.plurals.IDS_hour_unit, i, strE);
                case 4:
                    return resources.getQuantityString(com.huawei.ui.commonui.R.plurals.IDS_min_unit, i, strE);
                case 5:
                    return resources.getQuantityString(com.huawei.ui.commonui.R.plurals.IDS_user_profile_achieve_num_day, i, strE);
                case 6:
                    return resources.getQuantityString(com.huawei.ui.commonui.R.plurals.IDS_intel_sleep_number_of_decibels, i, strE);
                case 7:
                    return resources.getQuantityString(com.huawei.ui.commonui.R.plurals.IDS_intel_sleep_number_of_times, i, strE);
                default:
                    return "";
            }
        }
        return resources.getQuantityString(com.huawei.ui.commonui.R.plurals.IDS_intel_sleep_number_of_score, i, strE);
    }
}
