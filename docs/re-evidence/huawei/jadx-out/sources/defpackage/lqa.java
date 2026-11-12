package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.operation.utils.Constants;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("branchId")
    private int f40620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("country")
    private String f40621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("fromVersion")
    private String f40622c;

    @SerializedName("contentTag")
    private String d;

    @SerializedName(Constants.VMALL_ARG_TYPE)
    private Integer e;

    @SerializedName("isAgree")
    private boolean f;

    @SerializedName("language")
    private String g;

    @SerializedName("greyKeyWordList")
    private List<String> h;

    @SerializedName("latestVersion")
    private long i;

    @SerializedName("needSign")
    private boolean j;

    @SerializedName("newestVersion")
    private long k;

    @SerializedName("version")
    private long n;

    @SerializedName("signTime")
    private long o;

    public Integer d() {
        return this.e;
    }

    public long a() {
        return this.n;
    }

    public long b() {
        return this.k;
    }

    public boolean c() {
        return this.j;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("HonorPrivacy{agrType=");
        stringBuffer.append(this.e);
        stringBuffer.append(", country=").append(this.f40621b);
        stringBuffer.append(", branchId=").append(this.f40620a);
        stringBuffer.append(", fromVersion=").append(this.f40622c);
        stringBuffer.append(", greyKeyWordList=").append(this.h);
        stringBuffer.append(", language=").append(this.g);
        stringBuffer.append(", isAgree=").append(this.f);
        stringBuffer.append(", contentTag=").append(this.d);
        stringBuffer.append(", version=").append(this.n);
        stringBuffer.append(", signTime=").append(this.o);
        stringBuffer.append(", latestVersion=").append(this.i);
        stringBuffer.append(", newestVersion=").append(this.k);
        stringBuffer.append(", needSign=").append(this.j);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
