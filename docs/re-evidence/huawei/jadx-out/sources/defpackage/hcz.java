package defpackage;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class hcz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("banFoods")
    private List<String> f36435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("dietMode")
    private List<Integer> f36436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("dietFavor")
    private Integer f36437c;

    @SerializedName("area")
    private String d;

    @SerializedName("allergenicFoods")
    private List<String> e;

    @SerializedName("energy")
    private String f;

    @SerializedName("notEatFoodList")
    private List<hdc> g;

    @SerializedName("illness")
    private List<Integer> h;

    @SerializedName("nutritionManagement")
    private List<Integer> i;

    @SerializedName("management")
    private String j;

    @SerializedName("weightManagement")
    private String m;

    public void c(String str) {
        this.f = str;
    }

    public void e(String str) {
        this.j = str;
    }

    public String a() {
        return this.j;
    }

    public void a(vfy vfyVar) {
        if (vfyVar == null) {
            LogUtil.a("FoodConditions", "overview is null");
            return;
        }
        if (vfyVar.j() > 0.0d) {
            this.m = String.valueOf(1);
        } else if (vfyVar.j() == 0.0d) {
            this.m = String.valueOf(3);
        } else {
            this.m = String.valueOf(2);
        }
    }

    public void b(hda hdaVar) {
        if (hdaVar == null) {
            LogUtil.j("FoodConditions", "setArea is null");
            return;
        }
        this.d = hdaVar.a();
        if (qsr.c().i()) {
            this.f36435a = hdaVar.e();
            this.e = hdaVar.d();
            this.h = hdaVar.b();
        }
    }

    public String toString() {
        return new Gson().toJson(this);
    }

    public void e(List<Integer> list) {
        this.i = list;
    }
}
