package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.featureuserprofile.route.hwgpxmodel.Wpt;
import com.huawei.hms.network.embedded.w9;

/* JADX INFO: loaded from: classes23.dex */
public class cjp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(w9.o)
    private boolean f1638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("status")
    private int f1639b;

    @SerializedName(Wpt.MODE)
    private int e;

    public void a(int i) {
        this.e = i;
    }

    public void c(int i) {
        this.f1639b = i;
    }

    public void d(boolean z) {
        this.f1638a = z;
    }
}
