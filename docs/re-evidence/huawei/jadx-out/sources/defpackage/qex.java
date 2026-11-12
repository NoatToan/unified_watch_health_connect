package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes43.dex */
public class qex extends qek {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("userInfo")
    private qfd f46084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("metadata")
    private String f46085b;

    @SerializedName("planInfo")
    private qeu d;

    public qeu b() {
        return this.d;
    }

    public String a() {
        return this.f46085b;
    }

    @Override // defpackage.qek, com.huawei.networkclient.IRequest
    public String getUrl() {
        return super.getUrl() + "plans";
    }

    @Override // defpackage.qek
    public String toString() {
        return "CreatePlanReq{" + super.toString() + ",planInfo=" + this.d + ", userInfo=" + this.f46084a + ", metadata=" + this.f46085b + '}';
    }
}
