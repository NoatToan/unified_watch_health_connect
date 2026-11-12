package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lme {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("pageExposureTime")
    private long f40434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("exposureInfo")
    private List<lmd> f40435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("pageClass")
    private String f40436c;

    @SerializedName("pageName")
    private String d;

    @SerializedName("pageId")
    private String e;

    public lme(String str, String str2, String str3, long j, List<lmd> list) {
        this.e = str;
        this.d = str2;
        this.f40436c = str3;
        this.f40434a = j;
        this.f40435b = list;
    }

    public String c() {
        return this.e;
    }

    public String d() {
        return this.d;
    }

    public String a() {
        return this.f40436c;
    }

    public long b() {
        return this.f40434a;
    }

    public List<lmd> e() {
        return this.f40435b;
    }
}
