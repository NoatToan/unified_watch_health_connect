package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.operation.utils.Constants;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class lmd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("columnId")
    private String f40431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(Constants.ITEM_NAME)
    private String f40432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("columnHead")
    private String f40433c;

    @SerializedName("exposureTime")
    private long d;

    @SerializedName("itemIndex")
    private String e;

    @SerializedName("resourceId")
    private String f;

    public lmd(String str, String str2, String str3, String str4, String str5, long j) {
        this.f40431a = str;
        this.f40433c = str2;
        this.f40432b = str3;
        this.f = str4;
        this.e = str5;
        this.d = j;
    }

    public String d() {
        return this.f40431a;
    }

    public String b() {
        return this.f40433c;
    }

    public String a() {
        return this.f40432b;
    }

    public String c() {
        return this.e;
    }

    public String j() {
        return this.f;
    }

    public long e() {
        return this.d;
    }

    public void a(long j) {
        this.d = j;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmd)) {
            return false;
        }
        lmd lmdVar = (lmd) obj;
        return Objects.equals(d(), lmdVar.d()) && Objects.equals(b(), lmdVar.b()) && Objects.equals(a(), lmdVar.a()) && Objects.equals(c(), lmdVar.c()) && Objects.equals(j(), lmdVar.j());
    }
}
