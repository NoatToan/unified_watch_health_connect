package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes43.dex */
public class qfb extends qek {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("status")
    private int f46093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("planId")
    private String f46094c;

    @Override // defpackage.qek, com.huawei.networkclient.IRequest
    public String getUrl() {
        return super.getUrl() + "plans/" + this.f46094c + "/updateStatus";
    }

    public String d() {
        return this.f46094c;
    }

    public void c(String str) {
        this.f46094c = str;
    }

    public int c() {
        return this.f46093b;
    }

    public void a(int i) {
        this.f46093b = i;
    }

    @Override // defpackage.qek
    public String toString() {
        return "UpdatePlanStatusReq {" + super.toString() + ",planId=" + this.f46094c + ", status=" + this.f46093b + '}';
    }
}
