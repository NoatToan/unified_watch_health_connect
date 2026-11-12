package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public class gyj extends ShareDataInfo implements Serializable {
    private static final long serialVersionUID = 216593960253233605L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("thumbnailPath")
    private String f36231a;

    @SerializedName("thumbnailSize")
    private int d;

    @SerializedName("thumbnailUrl")
    private String e;

    public String c() {
        return this.e;
    }

    public void e(String str) {
        this.e = str;
    }

    public int d() {
        return this.d;
    }

    public void d(int i) {
        this.d = i;
    }

    public String e() {
        return this.f36231a;
    }

    public void a(String str) {
        this.f36231a = str;
    }
}
