package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.api.entity.common.CommonPickerConstant;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;

/* JADX INFO: loaded from: classes15.dex */
public class qhm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("discountPrice")
    private String f46237a;

    @SerializedName("userType")
    private String aa;

    @SerializedName("validDay")
    private String ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("canRenewFlag")
    private String f46238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("guideText")
    private String f46239c;

    @SerializedName(HwPayConstant.KEY_CURRENCY)
    private String d;

    @SerializedName("extendInfo")
    private String e;

    @SerializedName("markUrl")
    private String f;

    @SerializedName("maxAge")
    private String g;

    @SerializedName("minAge")
    private String h;

    @SerializedName(ParsedFieldTag.PRICE)
    private String i;

    @SerializedName("isReceivedByCondition")
    private String j;

    @SerializedName("productCode")
    private String k;

    @SerializedName(HwPayConstant.KEY_PRODUCTDESC)
    private String l;

    @SerializedName("productInterpretation")
    private String m;

    @SerializedName(HwPayConstant.KEY_PRODUCTNAME)
    private String n;

    @SerializedName("priceLevelExtend")
    private String o;

    @SerializedName(CommonPickerConstant.RequestParams.KEY_REDIRECT_URL)
    private String p;

    @SerializedName("promotiondesc")
    private String q;

    @SerializedName("productType")
    private String r;

    @SerializedName("promotionurl")
    private String s;

    @SerializedName("relProductCode")
    private String t;

    @SerializedName("symbol")
    private String u;

    @SerializedName("sendCount")
    private String v;

    @SerializedName("renewPrice")
    private String w;

    @SerializedName("renewCode")
    private String x;

    @SerializedName("relProductDes")
    private String y;

    public String a() {
        return this.k;
    }

    public String d() {
        return this.j;
    }
}
