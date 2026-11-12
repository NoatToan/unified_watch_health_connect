package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class qfs extends qek {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("requestBody")
    private List<qfp> f46133c;

    @SerializedName("planId")
    private String d;

    @Override // defpackage.qek, com.huawei.networkclient.IRequest
    public String getUrl() {
        return super.getUrl() + "healthlife/" + this.d + "/snapshots";
    }

    public void e(String str) {
        this.d = str;
    }

    public List<qfp> b() {
        return this.f46133c;
    }

    public void d(List<qfp> list) {
        this.f46133c = list;
    }

    @Override // defpackage.qek
    public String toString() {
        return "UploadHealthLifeSnapshotReq{" + super.toString() + ",planId=" + this.d + ",requestBody=" + this.f46133c + '}';
    }
}
