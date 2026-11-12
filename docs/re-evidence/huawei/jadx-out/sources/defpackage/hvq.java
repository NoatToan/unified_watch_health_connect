package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.basefitnessadvice.callback.DataCallback;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.h5pro.service.H5ProServiceManager;
import com.huawei.health.suggestion.R;
import com.huawei.health.weight.WeightApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.OperationUtilsApi;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.pluginoperation.util.DietKakaUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class hvq {
    public static boolean f(int i) {
        return i == 40 || i == 50 || i == 60;
    }

    public static void a(Context context, hdc hdcVar, boolean z, String str, IntPlan intPlan) {
        if (hdcVar == null || intPlan == null || ((OperationUtilsApi) Services.d("PluginOperation", OperationUtilsApi.class)) == null) {
            return;
        }
        b(context, new H5ProLaunchOption.Builder().addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeArg("foodId", hdcVar.c()).addCustomizeArg("mealType", String.valueOf(hdcVar.j())).addCustomizeArg("isRecorded", String.valueOf(z)).addCustomizeArg("count", String.valueOf(hdcVar.l())).addCustomizeArg("unit", hdcVar.m()).addCustomizeArg("time", str).addCustomizeArg("planId", intPlan.getPlanId()).addGlobalBiParam(WebViewHelp.BI_KEY_PULL_FROM, "weightControlPlan").setImmerse().showStatusBar().addPath("#/food_detail").setStatusBarTextBlack(true).setForceDarkMode(1));
    }

    public static void a(Context context, hdc hdcVar, String str, IntPlan intPlan, String str2) {
        if (hdcVar == null || intPlan == null) {
            return;
        }
        LogUtil.d("Util", "nmsDebug replaceFood", hdcVar.c());
        if (((OperationUtilsApi) Services.d("PluginOperation", OperationUtilsApi.class)) != null) {
            b(context, new H5ProLaunchOption.Builder().addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeArg("foodId", hdcVar.c()).addCustomizeArg("mealType", String.valueOf(hdcVar.j())).addCustomizeArg("count", String.valueOf(hdcVar.l())).addCustomizeArg("unit", hdcVar.m()).addCustomizeArg("time", str).addCustomizeArg("heat", String.valueOf(hdcVar.h())).addCustomizeArg("planId", intPlan.getPlanId()).addCustomizeArg("energy", str2).setImmerse().showStatusBar().addPath("#/substitute_food").setStatusBarTextBlack(true).setForceDarkMode(1));
        }
    }

    public static void b(Context context, H5ProLaunchOption.Builder builder) {
        WeightApi weightApi = (WeightApi) Services.d("Main", WeightApi.class);
        if (weightApi != null) {
            H5ProServiceManager.getInstance().registerService(weightApi.getDietDiaryRepositoryApi());
        } else {
            LogUtil.j("FoodUtil", "weightApi is null.");
        }
        builder.addCustomizeJsModule("DietKakaUtil", DietKakaUtil.class);
        ddv.b().loadH5ProApp(context, "com.huawei.health.h5.ai-weight", builder);
    }

    public static List<vgu> e(List<hdc> list) {
        LogUtil.a("FoodUtil", "food2FoodDescriptor foods is " + list.toString());
        ArrayList arrayList = new ArrayList();
        String strQ = lsl.q(System.currentTimeMillis());
        for (hdc hdcVar : list) {
            vgu vguVar = new vgu(hdcVar.c(), new Date().getTime());
            vguVar.a(hdcVar.m());
            vguVar.d(hdcVar.b());
            vguVar.c(hdcVar.d());
            vguVar.d(hdcVar.e());
            vguVar.b(hdcVar.l());
            vguVar.e(hdcVar.i());
            vguVar.h(hdcVar.f());
            vguVar.a(hdcVar.h());
            vguVar.b(strQ);
            arrayList.add(vguVar);
        }
        c(arrayList);
        LogUtil.a("FoodUtil", "food2FoodDescriptor fds is " + arrayList.toString());
        return arrayList;
    }

    private static void c(final List<vgu> list) {
        HashSet hashSet = new HashSet();
        final HashMap map = new HashMap();
        for (vgu vguVar : list) {
            hashSet.add(vguVar.e());
            map.put(vguVar.e(), vguVar);
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        hdi.e().batchGetFood(hashSet, new DataCallback() { // from class: hvq.1
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i, String str) {
                LogUtil.e("FoodUtil", "replenishSodium batch get food error " + str + " " + i);
                countDownLatch.countDown();
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                JSONArray jSONArray;
                String str;
                String str2 = "unit";
                LogUtil.a("FoodUtil", "replenishSodium batch get food success " + jSONObject);
                if (jSONObject != null && jSONObject.has("foodList")) {
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("foodList");
                    int i = 0;
                    while (i < jSONArrayOptJSONArray.length()) {
                        try {
                            JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                            String string = jSONObject2.getString("foodId");
                            String string2 = jSONObject2.getString(str2);
                            double d = jSONObject2.getDouble("count");
                            double d2 = jSONObject2.getDouble("sodium");
                            JSONArray jSONArray2 = jSONObject2.getJSONArray("extensionUnits");
                            HashMap map2 = new HashMap();
                            int i2 = 0;
                            while (i2 < jSONArray2.length()) {
                                jSONArray = jSONArrayOptJSONArray;
                                try {
                                    str = str2;
                                    try {
                                        map2.put(jSONArray2.getJSONObject(i2).getString(str2), Integer.valueOf(jSONArray2.getJSONObject(i2).getInt("unitValue")));
                                        i2++;
                                        jSONArrayOptJSONArray = jSONArray;
                                        str2 = str;
                                    } catch (JSONException unused) {
                                        LogUtil.e("FoodUtil", "replenishSodium parse food json error");
                                        i++;
                                        jSONArrayOptJSONArray = jSONArray;
                                        str2 = str;
                                    }
                                } catch (JSONException unused2) {
                                    str = str2;
                                    LogUtil.e("FoodUtil", "replenishSodium parse food json error");
                                    i++;
                                    jSONArrayOptJSONArray = jSONArray;
                                    str2 = str;
                                }
                            }
                            jSONArray = jSONArrayOptJSONArray;
                            str = str2;
                            map2.put(BaseApplication.getContext().getString(R.string.IDS_diet_unit_gram), 1);
                            int iIntValue = map2.containsKey(string2) ? ((Integer) map2.get(string2)).intValue() : 0;
                            if (iIntValue == 0) {
                                LogUtil.e("FoodUtil", "replenishSodium food's unit not in unit2Value, unitValue=" + map2 + ", food is " + jSONObject2);
                            } else {
                                double d3 = d2 / (d * ((double) iIntValue));
                                vgu vguVar2 = (vgu) map.get(string);
                                if (vguVar2 == null) {
                                    LogUtil.e("FoodUtil", "replenishSodium fd is not exist, food is " + jSONObject2);
                                } else {
                                    String strJ = vguVar2.j();
                                    int iIntValue2 = map2.containsKey(strJ) ? ((Integer) map2.get(strJ)).intValue() : 0;
                                    if (iIntValue2 == 0) {
                                        LogUtil.e("FoodUtil", "replenishSodium fd's unit not in unit2Value, unitValue is " + map2 + ", food is " + jSONObject2 + ", fd is " + vguVar2);
                                    } else {
                                        vguVar2.i((float) (((double) (iIntValue2 * vguVar2.d())) * d3));
                                    }
                                }
                            }
                        } catch (JSONException unused3) {
                            jSONArray = jSONArrayOptJSONArray;
                        }
                        i++;
                        jSONArrayOptJSONArray = jSONArray;
                        str2 = str;
                    }
                }
                LogUtil.a("FoodUtil", "replenishSodium fds is " + list);
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("FoodUtil", "thread interrupted");
        }
    }

    public static boolean c(vgo vgoVar, long j) {
        if (vgoVar != null) {
            return vgoVar.c() == DateFormatUtil.a(j);
        }
        LogUtil.j("FoodUtil", "isSameDay record is null");
        return false;
    }

    public static int d(int i) {
        if (i == 0) {
            return 10;
        }
        if (i == 1) {
            return 20;
        }
        if (i == 2) {
            return 30;
        }
        if (i == 3) {
            return 40;
        }
        if (i == 4) {
            return 50;
        }
        if (i == 5) {
            return 60;
        }
        LogUtil.j("FoodUtil", "getMealType position ", Integer.valueOf(i));
        return 0;
    }

    public static int a(int i) {
        if (i == 10 || i == 20 || i == 30) {
            return i;
        }
        if (i == 40) {
            return 10;
        }
        if (i == 50) {
            return 20;
        }
        if (i == 60) {
            return 30;
        }
        LogUtil.j("FoodUtil", "getRealMealType mealType ", Integer.valueOf(i));
        return 0;
    }

    public static String c(int i) {
        if (i == 10) {
            return " 08:00:00";
        }
        if (i == 20) {
            return " 12:00:00";
        }
        if (i == 30) {
            return " 18:00:00";
        }
        if (i == 40) {
            return " 08:00:00";
        }
        if (i == 50) {
            return " 12:00:00";
        }
        if (i == 60) {
            return " 18:00:00";
        }
        LogUtil.j("FoodUtil", "getMealTime mealType ", Integer.valueOf(i));
        return "";
    }

    public static int e(int i) {
        if (i == 10) {
            return 1;
        }
        if (i == 20) {
            return 2;
        }
        if (i == 30) {
            return 3;
        }
        if (i == 40) {
            return 1;
        }
        if (i == 50) {
            return 2;
        }
        if (i == 60) {
            return 3;
        }
        LogUtil.j("FoodUtil", "getIndex mealType ", Integer.valueOf(i));
        return 0;
    }

    public static int b(int i) {
        if (i != 10) {
            if (i == 20) {
                return 1;
            }
            if (i == 30) {
                return 2;
            }
            if (i != 40) {
                if (i == 50) {
                    return 1;
                }
                if (i == 60) {
                    return 2;
                }
                LogUtil.j("FoodUtil", "getIndex mealType ", Integer.valueOf(i));
                return 0;
            }
        }
        return 0;
    }

    public static List<String> a(vgo vgoVar, int i) {
        if (vgoVar == null) {
            LogUtil.j("FoodUtil", "getFoodIdList record is null");
            return Collections.EMPTY_LIST;
        }
        List<vgw> listA = vgoVar.a();
        if (njy.e(listA)) {
            LogUtil.j("FoodUtil", "getFoodIdList mealList ", listA);
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (vgw vgwVar : listA) {
            if (vgwVar != null && vgwVar.i() == i) {
                List<vgu> listC = vgwVar.c();
                if (!njy.e(listC)) {
                    for (vgu vguVar : listC) {
                        if (vguVar != null) {
                            String strE = vguVar.e();
                            if (!TextUtils.isEmpty(strE)) {
                                arrayList.add(strE);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean d(vgo vgoVar, long j) {
        if (vgoVar == null || !c(vgoVar, j)) {
            LogUtil.j("FoodUtil", "isSupportDietSetting record ", vgoVar);
            return false;
        }
        List<vgw> listA = vgoVar.a();
        if (njy.e(listA)) {
            LogUtil.j("FoodUtil", "isSupportDietSetting list ", listA);
            return false;
        }
        float fE = 0.0f;
        for (vgw vgwVar : listA) {
            if (vgwVar != null) {
                fE += vgwVar.e();
            }
        }
        return Float.compare(fE, 0.0f) == 1;
    }

    public static boolean e(List<List<hdc>> list, vgo vgoVar, long j) {
        if (!lsl.aa(j)) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis > lsl.a(jCurrentTimeMillis, 21, 0)) {
            return true;
        }
        if (njy.e(list, 2) || vgoVar == null || !c(vgoVar, j)) {
            LogUtil.j("FoodUtil", "isShowTomorrowRecommendFood list ", list, " record ", vgoVar, " timeMillis ", Long.valueOf(j));
            return false;
        }
        if (b(list.get(0), a(vgoVar, 10)) && b(list.get(1), a(vgoVar, 20))) {
            return b(list.get(2), a(vgoVar, 30));
        }
        return false;
    }

    private static boolean b(List<hdc> list, List<String> list2) {
        for (hdc hdcVar : list) {
            if (hdcVar != null && !list2.contains(hdcVar.c())) {
                return false;
            }
        }
        return true;
    }

    public static int c(List<List<hdc>> list, vgo vgoVar, long j) {
        if (njy.e(list, 2) || vgoVar == null || !c(vgoVar, j)) {
            LogUtil.j("FoodUtil", "getDefaultPositionOffset list ", list, " record ", vgoVar, " timeMillis ", Long.valueOf(j));
            return 0;
        }
        if (!lsl.aa(j)) {
            return 0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jA = lsl.a(jCurrentTimeMillis, 10, 0);
        boolean zB = b(list.get(0), a(vgoVar, 10));
        if (jCurrentTimeMillis <= jA && !zB) {
            return 0;
        }
        long jA2 = lsl.a(jCurrentTimeMillis, 15, 0);
        boolean zB2 = b(list.get(1), a(vgoVar, 20));
        if (jCurrentTimeMillis <= jA2 && !zB2) {
            return 1;
        }
        long jA3 = lsl.a(jCurrentTimeMillis, 21, 0);
        boolean zB3 = b(list.get(2), a(vgoVar, 30));
        if (jCurrentTimeMillis <= jA3 && !zB3) {
            return 2;
        }
        if (zB && zB2 && zB3) {
            return 3;
        }
        if (zB) {
            return !zB2 ? 1 : 2;
        }
        return 0;
    }

    public static hdd a(hdc hdcVar) {
        if (hdcVar == null) {
            return null;
        }
        List<hdd> listA = hdcVar.a();
        if (njy.e(listA)) {
            return null;
        }
        return listA.get(0);
    }

    public static double e(hdd hddVar, int i) {
        if (i <= 0) {
            return 0.0d;
        }
        if (hddVar == null) {
            ReleaseLogUtil.d("R_FoodUtil", "convertFoodValue foodExtensionUnits is null value ", Integer.valueOf(i));
            return 0.0d;
        }
        int iA = hddVar.a();
        if (iA <= 0) {
            ReleaseLogUtil.d("R_FoodUtil", "convertFoodValue unitValue ", Integer.valueOf(iA), " value ", Integer.valueOf(i), " foodExtensionUnits ", hddVar);
            return 0.0d;
        }
        int i2 = i / iA;
        double d = UnitUtil.d(i / iA, 2);
        if (d > 0.0d && d <= 0.5d) {
            return 0.5d;
        }
        if (d > 0.5d && d <= 1.0d) {
            return 1.0d;
        }
        double d2 = i2;
        if (d < d2 || d > d2 + 0.25d) {
            return (d <= 0.25d + d2 || d > 0.75d + d2) ? i2 + 1 : d2 + 0.5d;
        }
        return d2;
    }

    public static void d(final List<vgo> list) {
        if (njy.e(list)) {
            ReleaseLogUtil.d("R_FoodUtil", "setDietRecordWeekListCache dietRecordList ", list);
            return;
        }
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: hvt
                @Override // java.lang.Runnable
                public final void run() {
                    hvq.d((List<vgo>) list);
                }
            });
            return;
        }
        ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (list.size() > 1) {
            for (vgo vgoVar : list) {
                if (vgoVar != null && lsl.g(DateFormatUtil.d(vgoVar.c()), jCurrentTimeMillis)) {
                    arrayList.add(vgoVar);
                }
            }
            iuo.e(arrayList);
            return;
        }
        vgo vgoVar2 = list.get(0);
        if (vgoVar2 == null) {
            ReleaseLogUtil.d("R_FoodUtil", "setDietRecordWeekListCache dayDietRecord is null");
            return;
        }
        long jD = DateFormatUtil.d(vgoVar2.c());
        if (lsl.g(jD, jCurrentTimeMillis)) {
            arrayList.add(vgoVar2);
        }
        List<vgo> listD = iuo.d();
        if (njy.e(listD)) {
            iuo.e(arrayList);
            return;
        }
        for (vgo vgoVar3 : listD) {
            if (vgoVar3 != null) {
                long jD2 = DateFormatUtil.d(vgoVar3.c());
                if (!lsl.c(jD2, jD) && lsl.g(jD2, jCurrentTimeMillis)) {
                    arrayList.add(vgoVar3);
                }
            }
        }
        iuo.e(arrayList);
    }
}
