package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class qev extends qek {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("includeDetail")
    private boolean f46080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("category")
    private Integer f46081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("scheduleDayRange")
    private String f46082c;

    @SerializedName("status")
    private int d;

    @SerializedName("subCategory")
    private Integer e;

    public qev() {
        this.d = 1;
        this.f46082c = "";
    }

    public qev(int i, int i2, int i3) {
        this.d = 1;
        this.f46082c = "";
        this.f46081b = Integer.valueOf(i);
        this.e = Integer.valueOf(i2);
        this.d = i3;
    }

    public int b() {
        return this.f46081b.intValue();
    }

    public void b(int i) {
        this.f46081b = Integer.valueOf(i);
    }

    public int a() {
        return this.e.intValue();
    }

    public void a(int i) {
        this.e = Integer.valueOf(i);
    }

    public int c() {
        return this.d;
    }

    public void c(int i) {
        this.d = i;
    }

    public boolean i() {
        return this.f46080a;
    }

    public void b(boolean z) {
        this.f46080a = z;
    }

    public Map<String, String> d() {
        HashMap map = new HashMap();
        Integer num = this.f46081b;
        if (num != null) {
            map.put("category", String.valueOf(num));
        }
        Integer num2 = this.e;
        if (num2 != null) {
            map.put("subCategory", String.valueOf(num2));
        }
        map.put("status", String.valueOf(this.d));
        map.put("includeDetail", String.valueOf(this.f46080a));
        map.put("scheduleDayRange", this.f46082c);
        map.put("countryCode", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010));
        map.put("lang", chf.b());
        return map;
    }

    @Override // defpackage.qek, com.huawei.networkclient.IRequest
    public String getUrl() {
        return super.getUrl() + "plans";
    }

    @Override // defpackage.qek
    public String toString() {
        return "QueryPlanReq{" + super.toString() + ",category=" + this.f46081b + ", subCategory=" + this.e + ", status=" + this.d + ", includeDetail=" + this.f46080a + ", scheduleDayRange='" + this.f46082c + "'}";
    }
}
