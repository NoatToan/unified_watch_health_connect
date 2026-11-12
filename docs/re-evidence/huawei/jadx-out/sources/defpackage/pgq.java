package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;

/* JADX INFO: loaded from: classes42.dex */
public class pgq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(HwPayConstant.KEY_USER_ID)
    private long f45339a;

    @SerializedName("nickName")
    private String d = "";

    @SerializedName("imageURL")
    private String e;

    public void b(long j) {
        this.f45339a = j;
    }

    public void c(String str) {
        this.e = str;
    }

    public void b(String str) {
        this.d = str;
    }
}
