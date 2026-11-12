package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes42.dex */
public class plc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("discountEndTime")
    private String f45582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("discountPrice")
    private String f45583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("discountId")
    private String f45584c;

    @SerializedName("discountType")
    private String d;

    @SerializedName("discountCode")
    private String e;

    @SerializedName("markUrl")
    private String f;

    @SerializedName("markText")
    private String g;

    @SerializedName("givePrice")
    private String h;

    @SerializedName("updateTime")
    private String i;

    @SerializedName("startTime")
    private String j;

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(255);
        stringBuffer.append("BriefDiscountInfo{discountId=");
        stringBuffer.append(this.f45584c);
        stringBuffer.append(", discountType=").append(this.d);
        stringBuffer.append(", discountPrice=").append(this.f45583b);
        stringBuffer.append(", startTime=").append(this.j);
        stringBuffer.append(", discountEndTime=").append(this.f45582a);
        stringBuffer.append(", discountCode=").append(this.e);
        stringBuffer.append(", markText=").append(this.g);
        stringBuffer.append(", markUrl=").append(this.f);
        stringBuffer.append(", updateTime=").append(this.i);
        stringBuffer.append(", givePrice=").append(this.h);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
