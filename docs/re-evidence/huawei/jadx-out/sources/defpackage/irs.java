package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;

/* JADX INFO: loaded from: classes32.dex */
public class irs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("description")
    private String f38015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(HwPayConstant.KEY_PRODUCTNAME)
    private String f38016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("productUrl")
    private String f38017c;

    public String b() {
        return this.f38016b;
    }

    public String a() {
        return this.f38015a;
    }

    public String d() {
        return this.f38017c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("GiveawayInfo{productName='");
        sb.append(this.f38016b);
        sb.append("', description='");
        sb.append(this.f38015a);
        sb.append("', productUrl='");
        sb.append(this.f38017c);
        sb.append("'}");
        return sb.toString();
    }
}
