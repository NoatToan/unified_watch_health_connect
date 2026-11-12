package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;

/* JADX INFO: loaded from: classes12.dex */
public class obb extends oaw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(HwPayConstant.KEY_USER_NAME)
    private String f44030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("action")
    private int f44031b;

    @SerializedName("version")
    private String d;

    @SerializedName("timestamp")
    private long e;

    public obb(String str, int i, int i2) {
        this.f44031b = i;
        c(str);
        d(i2);
    }

    public void b(String str) {
        this.d = str;
    }

    public void e(String str) {
        this.f44030a = str;
    }
}
