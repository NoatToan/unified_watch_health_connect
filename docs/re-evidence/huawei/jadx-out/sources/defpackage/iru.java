package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.openalliance.ad.constant.TagConstants;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public class iru {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("giveawayDescList")
    private List<irs> f38018a;

    @SerializedName(TagConstants.SCENE_TYPE)
    private int aa;

    @SerializedName("title")
    private String ab;

    @SerializedName("saleTime")
    private long ac;

    @SerializedName("purchasePolicy")
    private int ad;

    @SerializedName("titleVisibility")
    private boolean ai;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(HwPayConstant.KEY_CURRENCY)
    private String f38019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("buttonDesc")
    private String f38020c;

    @SerializedName("giveawayDesc")
    private String d;

    @SerializedName("duration")
    private String e;

    @SerializedName("giveawayDescVisibility")
    private boolean f;

    @SerializedName("linkValue")
    private String g;

    @SerializedName("healthMember")
    private boolean h;

    @SerializedName("linkType")
    private int i;

    @SerializedName("giveawaysExist")
    private int j;

    @SerializedName("memberPriceRetentionDesc")
    private String k;

    @SerializedName("memberPackageImageUrl")
    private String l;

    @SerializedName("memberPriceRetentionVisibility")
    private boolean m;

    @SerializedName("memberFlag")
    private boolean n;

    @SerializedName("memberPackagePadImageUrl")
    private String o;

    @SerializedName("microPrice")
    private long p;

    @SerializedName("priceDesc")
    private String q;

    @SerializedName("priority")
    private int r;

    @SerializedName("memberType")
    private int s;

    @SerializedName("nowTime")
    private long t;

    @SerializedName(HwPayConstant.KEY_PRODUCTNAME)
    private String u;

    @SerializedName("productId")
    private String v;

    @SerializedName("promotion")
    private isb w;

    @SerializedName("promotionDesc")
    private String x;

    @SerializedName("promotionDescVisibility")
    private boolean y;

    @SerializedName("purchaseChannel")
    private int z;

    public String n() {
        return this.v;
    }

    public List<irs> a() {
        return this.f38018a;
    }

    public String i() {
        return this.o;
    }

    public String f() {
        return this.l;
    }

    public boolean v() {
        return this.h;
    }

    public String u() {
        return this.ab;
    }

    public boolean aa() {
        return this.ai;
    }

    public String h() {
        return this.g;
    }

    public int g() {
        return this.i;
    }

    public boolean y() {
        return this.m;
    }

    public String j() {
        return this.k;
    }

    public int o() {
        return this.r;
    }

    public int m() {
        return this.s;
    }

    public boolean w() {
        return this.n;
    }

    public String d() {
        return this.e;
    }

    public String c() {
        return this.f38020c;
    }

    public boolean x() {
        return this.f;
    }

    public String b() {
        return this.d;
    }

    public boolean ab() {
        return this.y;
    }

    public String s() {
        return this.u;
    }

    public int r() {
        return this.ad;
    }

    public String e() {
        return this.f38019b;
    }

    public long k() {
        return this.p;
    }

    public isb t() {
        return this.w;
    }

    public long l() {
        return this.t;
    }

    public long p() {
        return this.ac;
    }

    public String q() {
        return this.x;
    }

    public String toString() {
        return "ProductSummaryInfo {\n    productId='" + this.v + "'\n    productName='" + this.u + "'\n    purchasePolicy=" + this.ad + "\n    currency='" + this.f38019b + "'\n    microPrice=" + this.p + "\n    promotion=" + this.w + "\n    giveawaysExist=" + this.j + "\n    nowTime=" + this.t + "\n    saleTime=" + this.ac + "\n    scene=" + this.aa + "\n    promotionDescVisibility=" + this.y + "\n    promotionDesc='" + this.x + "'\n    giveawayDesc='" + this.d + "'\n    giveawayDescVisibility=" + this.f + "\n    buttonDesc='" + this.f38020c + "'\n    duration='" + this.e + "'\n    memberFlag=" + this.n + "\n    memberType=" + this.s + "\n    priceDesc='" + this.q + "'\n    priority=" + this.r + "\n    memberPriceRetentionDesc='" + this.k + "'\n    memberPriceRetentionVisibility=" + this.m + "\n    linkType=" + this.i + "\n    linkValue='" + this.g + "'\n    titleVisibility=" + this.ai + "\n    title='" + this.ab + "'\n    purchaseChannel=" + this.z + "\n    healthMember=" + this.h + "\n    memberPackageImageUrl='" + this.l + "'\n    memberPackagePadImageUrl='" + this.o + "'\n    giveawayDescList=" + this.f38018a + "\n}";
    }
}
