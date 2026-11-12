package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;

/* JADX INFO: loaded from: classes43.dex */
public class vod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("findContent")
    private String f51393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(HwPayConstant.KEY_USER_ID)
    private long f51394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("findType")
    private int f51395c;

    @SerializedName("acctType")
    private int e;

    public long a() {
        return this.f51394b;
    }

    public void e(long j) {
        this.f51394b = j;
    }

    public int c() {
        return this.f51395c;
    }

    public void c(int i) {
        this.f51395c = i;
    }

    public String d() {
        return this.f51393a;
    }

    public void e(String str) {
        this.f51393a = str;
    }

    public int e() {
        return this.e;
    }

    public void a(int i) {
        this.e = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{userID=");
        sb.append(a());
        sb.append(", findType=");
        sb.append(c());
        sb.append(", findContent=");
        sb.append(d());
        if (c() == 0) {
            sb.append(", acctType='");
            sb.append(e());
        }
        sb.append('}');
        return sb.toString();
    }
}
