package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class fdi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("blockProductList")
    protected List<fdb> f33892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("support")
    protected Integer f33893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("countryList")
    protected List<String> f33894c;

    @SerializedName("packageName")
    protected String d;

    @SerializedName("extInfo")
    protected Map e;

    @SerializedName("supportVersion")
    protected fdl j;

    public String b() {
        return this.d;
    }

    public Integer d() {
        return this.f33893b;
    }

    public fdl c() {
        return this.j;
    }

    public Map e() {
        Map map = this.e;
        return map == null ? new HashMap() : map;
    }
}
