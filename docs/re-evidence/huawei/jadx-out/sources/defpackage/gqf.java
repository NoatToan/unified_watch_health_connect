package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public class gqf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("dstUserID")
    private String f35899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("grpID")
    private int f35900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("otherUserList")
    private List<b> f35901c;

    @SerializedName("srcType")
    private int d;

    @SerializedName(HwPayConstant.KEY_USER_ID)
    private String e;

    public void c(String str) {
        this.e = str;
    }

    public void d(String str) {
        this.f35899a = str;
    }

    public void e(int i) {
        this.d = i;
    }

    public void a(int i) {
        this.f35900b = i;
    }

    public void c(List<b> list) {
        this.f35901c = list;
    }

    static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("dstUserID")
        private int f35902c;

        @SerializedName("srcType")
        private int d;

        @SerializedName("grpID")
        private int e;

        b() {
        }
    }
}
