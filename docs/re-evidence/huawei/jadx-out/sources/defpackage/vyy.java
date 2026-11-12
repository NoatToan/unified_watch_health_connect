package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.tencent.open.SocialConstants;

/* JADX INFO: loaded from: classes43.dex */
public class vyy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("endTime")
    private int f51720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(HwPayConstant.KEY_AMOUNT)
    private double f51721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("finalPrice")
    private double f51722c;

    @SerializedName(SocialConstants.PARAM_APP_DESC)
    private String d;

    @SerializedName("couponId")
    private String e;

    @SerializedName("startTime")
    private int g;

    @SerializedName("originPrice")
    private double j;

    public String a() {
        return this.d;
    }

    public double e() {
        return this.f51721b;
    }
}
