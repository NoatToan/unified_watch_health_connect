package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class fdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("selectRulevalue")
    protected String f33910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("configName")
    protected String f33911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("filterCondition")
    protected List<fdj> f33912c;

    @SerializedName("selectRulekey")
    protected String d;

    @SerializedName("fileData")
    protected List<fdk> e;

    public fdr(String str) {
        this.f33911b = str;
    }

    public String a() {
        return this.f33911b;
    }

    public List<fdk> e() {
        List<fdk> list = this.e;
        return list == null ? new ArrayList() : list;
    }

    public void d(List<fdk> list) {
        this.e = list;
    }

    public List<fdj> c() {
        List<fdj> list = this.f33912c;
        return list == null ? new ArrayList() : list;
    }

    public void e(List<fdj> list) {
        this.f33912c = list;
    }

    public String b() {
        return this.d;
    }

    public String d() {
        return this.f33910a;
    }
}
