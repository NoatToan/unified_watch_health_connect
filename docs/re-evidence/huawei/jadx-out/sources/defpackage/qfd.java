package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.feature.result.CommonConstant;

/* JADX INFO: loaded from: classes43.dex */
public class qfd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(CommonConstant.KEY_GENDER)
    private int f46098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("extraInfo")
    private String f46099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("bfr")
    private float f46100c;

    @SerializedName("age")
    private int d;

    @SerializedName("height")
    private int e;

    @SerializedName("weight")
    private float g;

    public String toString() {
        return "UserProfile{mGender=" + this.f46098a + ", mAge=" + this.d + ", mHeight=" + this.e + ", mWeight=" + this.g + ", mBfr=" + this.f46100c + ", extraInfo=" + this.f46099b + '}';
    }
}
