package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class plf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(HwPayConstant.KEY_CURRENCY)
    private String f45590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("categoryId")
    private String f45591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("hitopId")
    private String f45592c;

    @SerializedName("countryCode")
    private String d;

    @SerializedName("fileInfo")
    private pky e;

    @SerializedName("discountList")
    private List<plc> f;

    @SerializedName("layoutType")
    private String g;

    @SerializedName("previews")
    private List<ple> h;

    @SerializedName("id")
    private String i;

    @SerializedName("label")
    private String j;

    @SerializedName("type")
    private String k;

    @SerializedName("productId")
    private String l;

    @SerializedName("symbol")
    private String m;

    @SerializedName("processCover")
    private String n;

    @SerializedName(ParsedFieldTag.PRICE)
    private String o;

    public pky b() {
        return this.e;
    }

    public List<ple> d() {
        return this.h;
    }

    public String c() {
        return this.i;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(255);
        stringBuffer.append("ShareThemeInfo{hitopId=");
        stringBuffer.append(this.f45592c);
        stringBuffer.append(", label=").append(this.j);
        stringBuffer.append(", id=").append(this.i);
        stringBuffer.append(", fileInfo=").append(this.e);
        stringBuffer.append(", countryCode=").append(this.d);
        stringBuffer.append(", previews=").append(this.h);
        stringBuffer.append(", processCover=").append(this.n);
        stringBuffer.append(", price=").append(this.o);
        stringBuffer.append(", categoryId=").append(this.f45591b);
        stringBuffer.append(", symbol=").append(this.m);
        stringBuffer.append(", currency=").append(this.f45590a);
        stringBuffer.append(", layoutType=").append(this.g);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
