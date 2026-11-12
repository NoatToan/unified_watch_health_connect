package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes15.dex */
public class qdy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("text")
    private String f46041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("domain")
    private String f46042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(RemoteMessageConst.Notification.TAG)
    private int f46043c;

    @SerializedName("featureName")
    private String e;

    public String a() {
        return this.f46041a;
    }

    public int b() {
        return this.f46043c;
    }

    public String d() {
        return this.f46042b;
    }

    public String e() {
        return this.e;
    }

    public String toString() {
        return "IndexCardTextInfo{text='" + this.f46041a + "', tag=" + this.f46043c + ", domain='" + this.f46042b + "', featureName='" + this.e + "'}";
    }
}
