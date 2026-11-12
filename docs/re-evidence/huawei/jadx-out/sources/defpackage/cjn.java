package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes23.dex */
public class cjn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("version")
    private String f1633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("time")
    private String f1634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("status")
    private int f1635c;

    @SerializedName(RemoteMessageConst.Notification.TAG)
    private String d;

    public String a() {
        return this.d;
    }

    public int c() {
        return this.f1635c;
    }

    public String d() {
        return this.f1633a;
    }

    public String e() {
        return this.f1634b;
    }
}
