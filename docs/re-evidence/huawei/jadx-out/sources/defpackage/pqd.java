package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class pqd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("pwrLevelConfigs")
    private List<pqf> f45820a;

    @SerializedName("ftpRecord")
    private pqe d;

    public pqe d() {
        return this.d;
    }

    public List<pqf> e() {
        return this.f45820a;
    }

    public String toString() {
        return "FtpDataRsp{ftpRecord=" + this.d + ", pwrLevelConfigs=" + this.f45820a + '}';
    }
}
