package defpackage;

import androidx.health.connect.client.records.MealType;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class vfb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private hdf f51021c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, List<hdc>> f51020b = new HashMap();
    private Map<String, b> d = new HashMap();
    private List<String> e = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<a> f51019a = new ArrayList();

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        List<c> f51023a;
        String e;
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f51024a;
        public String d;
        public String e;
    }

    public vfb(hdf hdfVar) {
        this.f51021c = hdfVar;
        b();
        a();
        d();
        LogUtil.a("BloodSugarRecipeDataModel", "BloodSugarRecipeDataModel initialized");
    }

    private void b() {
        this.f51019a.clear();
        this.e.clear();
        hdf hdfVar = this.f51021c;
        if (hdfVar == null) {
            LogUtil.j("BloodSugarRecipeDataModel", "buildMenuList: originData is null");
            return;
        }
        if (hdfVar.c() != null && !this.f51021c.c().isEmpty()) {
            this.e.add(MealType.BREAKFAST);
            this.f51019a.add(new a(qre.f(R.string.IDS_recipe_breakfast)));
        }
        if (this.f51021c.a() != null && !this.f51021c.a().isEmpty()) {
            this.e.add(MealType.LUNCH);
            this.f51019a.add(new a(qre.f(R.string.IDS_recipe_lunch)));
        }
        if (this.f51021c.b() != null && !this.f51021c.b().isEmpty()) {
            this.e.add(MealType.DINNER);
            this.f51019a.add(new a(qre.f(R.string.IDS_recipe_dinner)));
        }
        LogUtil.a("BloodSugarRecipeDataModel", "buildMenuList success, mealType count: " + this.e.size());
    }

    private void a() {
        this.f51020b.clear();
        hdf hdfVar = this.f51021c;
        if (hdfVar == null) {
            LogUtil.j("BloodSugarRecipeDataModel", "buildFoodMap: originData is null");
            return;
        }
        if (hdfVar.c() != null) {
            this.f51020b.put(MealType.BREAKFAST, this.f51021c.c());
        }
        if (this.f51021c.a() != null) {
            this.f51020b.put(MealType.LUNCH, this.f51021c.a());
        }
        if (this.f51021c.b() != null) {
            this.f51020b.put(MealType.DINNER, this.f51021c.b());
        }
        LogUtil.a("BloodSugarRecipeDataModel", "buildFoodMap success, foodMap size: " + this.f51020b.size());
    }

    private void d() {
        String strA;
        this.d.clear();
        for (Map.Entry<String, List<hdc>> entry : this.f51020b.entrySet()) {
            ArrayList arrayList = new ArrayList();
            double d = 0.0d;
            double d2 = 0.0d;
            for (hdc hdcVar : entry.getValue()) {
                c cVar = new c();
                cVar.d = hdcVar.b();
                List<hdd> listA = hdcVar.a();
                if (listA != null && !listA.isEmpty()) {
                    hdd hddVar = listA.get(0);
                    String strC = UnitUtil.c(c(hddVar.a(), hdcVar.l()), 1, 0, 1, null);
                    strA = qre.a(R.string.IDS_recipe_quantity, strC + hddVar.b());
                } else {
                    strA = "";
                }
                cVar.e = qre.a(R.string.IDS_recipe_food_description, strA, hdcVar.l() + hdcVar.m());
                cVar.f51024a = hdcVar.c();
                arrayList.add(cVar);
                d += UnitUtil.d((double) hdcVar.h(), 2);
                d2 += UnitUtil.d(hdcVar.d(), 2);
            }
            String strA2 = qre.a(R.string.IDS_recipe_recommend_heat, qre.e(R.plurals.IDS_kcalories_unit, (int) d, Integer.valueOf((int) UnitUtil.d(d, 0))), qre.e(R.plurals.IDS_recipe_unit_g, (int) d2, Integer.valueOf((int) UnitUtil.d(d2, 0))));
            b bVar = new b();
            bVar.f51023a = arrayList;
            bVar.e = strA2;
            this.d.put(entry.getKey(), bVar);
        }
        LogUtil.a("BloodSugarRecipeDataModel", "buildFoodList success, foodListMap size: " + this.d.size());
    }

    private double c(int i, int i2) {
        if (i2 <= 0) {
            return 0.0d;
        }
        if (i <= 0) {
            LogUtil.j("BloodSugarRecipeDataModel", "convertFoodValue unitValue ", Integer.valueOf(i), " value ", Integer.valueOf(i2));
            return 0.0d;
        }
        int i3 = i2 / i;
        double d = UnitUtil.d(i2 / i, 2);
        if (d > 0.0d && d <= 0.5d) {
            return 0.5d;
        }
        if (d > 0.5d && d <= 1.0d) {
            return 1.0d;
        }
        double d2 = i3;
        if (d < d2 || d > d2 + 0.25d) {
            return (d <= 0.25d + d2 || d > 0.75d + d2) ? i3 + 1 : d2 + 0.5d;
        }
        return d2;
    }

    public List<c> b(String str) {
        LogUtil.a("BloodSugarRecipeDataModel", "getFoodList mealType: " + str);
        b bVar = this.d.get(str);
        if (bVar == null) {
            return new ArrayList();
        }
        List<c> list = bVar.f51023a;
        if (list == null) {
            return new ArrayList();
        }
        return list.subList(0, Math.min(list.size(), 4));
    }

    public String a(String str) {
        String str2;
        LogUtil.a("BloodSugarRecipeDataModel", "getFoodList mealType: " + str);
        b bVar = this.d.get(str);
        return (bVar == null || (str2 = bVar.e) == null) ? "" : str2;
    }

    public String d(int i) {
        if (i < 0 || i >= this.e.size()) {
            LogUtil.j("BloodSugarRecipeDataModel", "Invalid index: " + i + ", fallback to breakfast");
            return MealType.BREAKFAST;
        }
        return this.e.get(i);
    }

    public List<a> e() {
        return this.f51019a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    public String d(String str) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "lunchAddition":
                b2 = 0;
                break;
            case "breakfast":
                b2 = 1;
                break;
            case "dinner":
                b2 = 2;
                break;
            case "lunch":
                b2 = 3;
                break;
            case "breakfastAddition":
                b2 = 4;
                break;
            case "dinnerAddition":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            return qre.f(R.string.IDS_recipe_meal_title_lunch_addition);
        }
        if (b2 == 1) {
            return qre.f(R.string.IDS_recipe_meal_title_breakfast);
        }
        if (b2 == 2) {
            return qre.f(R.string.IDS_recipe_meal_title_dinner);
        }
        if (b2 == 3) {
            return qre.f(R.string.IDS_recipe_meal_title_lunch);
        }
        if (b2 == 4) {
            return qre.f(R.string.IDS_recipe_meal_title_breakfast_addition);
        }
        if (b2 == 5) {
            return qre.f(R.string.IDS_recipe_meal_title_dinner_addition);
        }
        return "";
    }

    public String c() {
        return a(System.currentTimeMillis());
    }

    public String a(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i = calendar.get(11);
        LogUtil.a("BloodSugarRecipeDataModel", "current hour: " + i);
        if (i < 10) {
            return MealType.BREAKFAST;
        }
        if (i < 14) {
            return MealType.LUNCH;
        }
        return MealType.DINNER;
    }

    public int c(String str) {
        int iIndexOf = this.e.indexOf(str);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        LogUtil.e("BloodSugarRecipeDataModel", "can not find " + str + " in MealTypeIndex");
        return 0;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f51022a;

        public a(String str) {
            this.f51022a = str;
        }
    }
}
