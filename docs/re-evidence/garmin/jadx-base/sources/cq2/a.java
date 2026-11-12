package cq2;

import android.util.Base64;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.github.mikephil.chartingv2.BuildConfig;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import fb1.c;
import j20.x;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import sl2.f;
import wr.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001BË\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012$\b\u0002\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0017j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001`\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010\u001fR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010\u001fR\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u001d\u001a\u0004\b-\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u001d\u001a\u0004\b/\u0010\u001fR\u001a\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010!\u001a\u0004\b1\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010\u001d\u001a\u0004\b3\u0010\u001fR\u001a\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010!\u001a\u0004\b5\u0010#R\u001a\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010!\u001a\u0004\b7\u0010#R\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R2\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0017j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001`\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lcq2/a;", "", "", "userEmail", "", "userHasFitPayAccount", "clientId", "themeOverrideCssUrl", "redirectUri", "language", "baseLangUrl", "accessToken", "demoMode", "demoCardGroup", "useWebCardScanner", "supportApp2App", "Lcq2/b;", "paymentDevice", "Lsl2/f;", "nfcChipType", "", "firmwareVersion", "modelNumber", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "metrics", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZLcq2/b;Lsl2/f;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/HashMap;)V", "a", "Ljava/lang/String;", "getUserEmail", "()Ljava/lang/String;", "b", "Z", "getUserHasFitPayAccount", "()Z", "c", "getClientId", "d", "getThemeOverrideCssUrl", JWKParameterNames.RSA_EXPONENT, "getRedirectUri", "f", "getLanguage", "g", "getBaseLangUrl", "h", "getAccessToken", IntegerTokenConverter.CONVERTER_KEY, "getDemoMode", "j", "getDemoCardGroup", JWKParameterNames.OCT_KEY_VALUE, "getUseWebCardScanner", "l", "getSupportApp2App", "m", "Lcq2/b;", "getPaymentDevice", "()Lcq2/b;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "Ljava/util/HashMap;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userEmail")
    private final String userEmail;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userHasFitPayAccount")
    private final boolean userHasFitPayAccount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("clientId")
    private final String clientId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("themeOverrideCssUrl")
    private final String themeOverrideCssUrl;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("redirectUri")
    private final String redirectUri;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("language")
    private final String language;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("baseLangUrl")
    private final String baseLangUrl;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("accessToken")
    private final String accessToken;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("demoMode")
    private final boolean demoMode;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("demoCardGroup")
    private final String demoCardGroup;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("useWebCardScanner")
    private final boolean useWebCardScanner;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("supportApp2App")
    private final boolean supportApp2App;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("paymentDevice")
    private final b paymentDevice;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final transient f f55229n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient Integer f55230o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final transient Integer f55231p;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("metrics")
    private HashMap<String, Object> metrics;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(String str, boolean z14, String str2, String str3, String str4, String str5, String str6, String str7, boolean z15, String str8, boolean z16, boolean z17, b bVar, f fVar, Integer num, Integer num2, HashMap map, int i14, j jVar) {
        String str9;
        String str10 = (i14 & 1) != 0 ? null : str;
        String str11 = (i14 & 8) != 0 ? "https://static.garmincdn.com/com.garmin.connect/ui/css/pay-fitpay-v2.2-min.css" : str3;
        if ((i14 & 64) != 0) {
            aq2.j.f12491a.getClass();
            str9 = (String) aq2.j.f12492b.getValue();
        } else {
            str9 = str6;
        }
        this(str10, z14, str2, str11, str4, str5, str9, str7, (i14 & 256) != 0 ? false : z15, (i14 & 512) != 0 ? null : str8, (i14 & 1024) != 0 ? false : z16, (i14 & 2048) != 0 ? true : z17, bVar, (i14 & 8192) != 0 ? null : fVar, (i14 & 16384) != 0 ? null : num, (32768 & i14) != 0 ? null : num2, (i14 & 65536) != 0 ? new HashMap() : map);
    }

    public final String a() {
        JsonObject jsonObject = new JsonObject();
        String str = this.userEmail;
        if (str == null) {
            str = "";
        }
        jsonObject.addProperty("userEmail", str);
        jsonObject.addProperty("account", Integer.valueOf(this.userHasFitPayAccount ? 1 : 0));
        jsonObject.addProperty("clientId", this.clientId);
        jsonObject.addProperty("themeOverrideCssUrl", this.themeOverrideCssUrl);
        jsonObject.addProperty("redirectUri", this.redirectUri);
        jsonObject.addProperty("language", this.language);
        jsonObject.addProperty("baseLangUrl", this.baseLangUrl);
        jsonObject.addProperty("accessToken", this.accessToken);
        jsonObject.addProperty("demoMode", Integer.valueOf(this.demoMode ? 1 : 0));
        jsonObject.addProperty("demoCardGroup", this.demoCardGroup);
        jsonObject.addProperty("useWebCardScanner", Integer.valueOf(!this.useWebCardScanner ? 1 : 0));
        aq2.j.f12491a.getClass();
        Gson gsonD = aq2.j.d();
        b bVar = this.paymentDevice;
        bVar.getClass();
        JsonObject jsonObject2 = new JsonObject();
        String str2 = bVar.f55233a;
        if (str2 != null) {
            jsonObject2.addProperty("deviceType", str2);
        }
        String str3 = bVar.f55234b;
        if (str3 != null) {
            jsonObject2.addProperty("manufacturerName", str3);
        }
        String str4 = bVar.f55235c;
        if (str4 != null) {
            jsonObject2.addProperty("deviceName", str4);
        }
        String str5 = bVar.f55236d;
        if (str5 != null) {
            jsonObject2.addProperty("firmwareVersion", str5);
        }
        String str6 = bVar.f55237e;
        if (str6 != null) {
            jsonObject2.addProperty("osName", str6);
        }
        String str7 = bVar.f55238f;
        if (str7 != null) {
            jsonObject2.addProperty("serialNumber", str7);
        }
        String str8 = bVar.f55239g;
        if (str8 != null) {
            jsonObject2.addProperty("modelNumber", str8);
        }
        String str9 = bVar.f55240h;
        if (str9 != null) {
            jsonObject2.addProperty("hardwareRevision", str9);
        }
        String str10 = bVar.f55241i;
        if (str10 != null) {
            jsonObject2.addProperty("softwareRevision", str10);
        }
        String str11 = bVar.f55242j;
        if (str11 != null) {
            jsonObject2.addProperty("systemId", str11);
        }
        String str12 = bVar.f55243k;
        if (str12 != null) {
            jsonObject2.addProperty("licenseKey", str12);
        }
        String str13 = bVar.f55244l;
        if (str13 != null) {
            jsonObject2.addProperty("bdAddress", str13);
        }
        String str14 = bVar.f55245m;
        if (str14 != null) {
            jsonObject2.addProperty("notificationToken", str14);
        }
        String str15 = bVar.f55246n;
        if (str15 != null) {
            jsonObject2.addProperty("profileId", str15);
        }
        String str16 = bVar.f55247o;
        if (str16 != null) {
            jsonObject2.addProperty("secureElementId", str16);
        }
        String str17 = bVar.f55248p;
        if (str17 != null) {
            jsonObject2.addProperty("casd", str17);
        }
        jsonObject.addProperty("paymentDevice", gsonD.toJson((JsonElement) jsonObject2));
        HashMap<String, Object> map = this.metrics;
        map.put("mobileOS", "Android");
        map.put("gcmVersion", (String) aq2.j.f12493c.getValue());
        map.put("libraryVersion", BuildConfig.VERSION_NAME);
        f fVar = this.f55229n;
        if (fVar == null) {
            fVar = f.f160023c;
        }
        map.put("nfcChipType", fVar);
        Integer num = this.f55230o;
        map.put("firmwareVersion", Integer.valueOf(num != null ? num.intValue() : -1));
        Integer num2 = this.f55231p;
        map.put("modelNumber", Integer.valueOf(num2 != null ? num2.intValue() : -1));
        String string = aq2.j.d().toJson((JsonElement) jsonObject).toString();
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        byte[] bytes = string.getBytes(charset);
        bytes.getClass();
        String strEncodeToString = Base64.encodeToString(bytes, 8);
        strEncodeToString.getClass();
        return strEncodeToString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.userEmail, aVar.userEmail) && this.userHasFitPayAccount == aVar.userHasFitPayAccount && s.g(this.clientId, aVar.clientId) && s.g(this.themeOverrideCssUrl, aVar.themeOverrideCssUrl) && s.g(this.redirectUri, aVar.redirectUri) && s.g(this.language, aVar.language) && s.g(this.baseLangUrl, aVar.baseLangUrl) && s.g(this.accessToken, aVar.accessToken) && this.demoMode == aVar.demoMode && s.g(this.demoCardGroup, aVar.demoCardGroup) && this.useWebCardScanner == aVar.useWebCardScanner && this.supportApp2App == aVar.supportApp2App && s.g(this.paymentDevice, aVar.paymentDevice) && this.f55229n == aVar.f55229n && s.g(this.f55230o, aVar.f55230o) && s.g(this.f55231p, aVar.f55231p) && s.g(this.metrics, aVar.metrics);
    }

    public final int hashCode() {
        String str = this.userEmail;
        int iG = q6.f.g(g.j(g.j(g.j(g.j(g.j(g.j(q6.f.g((str == null ? 0 : str.hashCode()) * 31, 31, this.userHasFitPayAccount), 31, this.clientId), 31, this.themeOverrideCssUrl), 31, this.redirectUri), 31, this.language), 31, this.baseLangUrl), 31, this.accessToken), 31, this.demoMode);
        String str2 = this.demoCardGroup;
        int iHashCode = (this.paymentDevice.hashCode() + q6.f.g(q6.f.g((iG + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.useWebCardScanner), 31, this.supportApp2App)) * 31;
        f fVar = this.f55229n;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Integer num = this.f55230o;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f55231p;
        return this.metrics.hashCode() + ((iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.userEmail;
        boolean z14 = this.userHasFitPayAccount;
        String str2 = this.clientId;
        String str3 = this.themeOverrideCssUrl;
        String str4 = this.redirectUri;
        String str5 = this.language;
        String str6 = this.baseLangUrl;
        String str7 = this.accessToken;
        boolean z15 = this.demoMode;
        String str8 = this.demoCardGroup;
        boolean z16 = this.useWebCardScanner;
        boolean z17 = this.supportApp2App;
        b bVar = this.paymentDevice;
        HashMap<String, Object> map = this.metrics;
        StringBuilder sbD = zl.a.d("NewFItPayWebViewConfig(userEmail=", str, ", userHasFitPayAccount=", z14, ", clientId=");
        sn.a.t(sbD, str2, ", themeOverrideCssUrl=", str3, ", redirectUri=");
        sn.a.t(sbD, str4, ", language=", str5, ", baseLangUrl=");
        sn.a.t(sbD, str6, ", accessToken=", str7, ", demoMode=");
        c.w(", demoCardGroup=", str8, ", useWebCardScanner=", sbD, z15);
        kg.f.q(", supportApp2App=", ", paymentDevice=", sbD, z16, z17);
        sbD.append(bVar);
        sbD.append(", nfcChipType=");
        sbD.append(this.f55229n);
        sbD.append(", firmwareVersion=");
        x.m(sbD, this.f55230o, ", modelNumber=", this.f55231p, ", metrics=");
        sbD.append(map);
        sbD.append(")");
        return sbD.toString();
    }

    public a(String str, boolean z14, String str2, String str3, String str4, String str5, String str6, String str7, boolean z15, String str8, boolean z16, boolean z17, b bVar, f fVar, Integer num, Integer num2, HashMap<String, Object> map) {
        hb.a.p(str2, str3, str4, str5, str6);
        str7.getClass();
        bVar.getClass();
        map.getClass();
        this.userEmail = str;
        this.userHasFitPayAccount = z14;
        this.clientId = str2;
        this.themeOverrideCssUrl = str3;
        this.redirectUri = str4;
        this.language = str5;
        this.baseLangUrl = str6;
        this.accessToken = str7;
        this.demoMode = z15;
        this.demoCardGroup = str8;
        this.useWebCardScanner = z16;
        this.supportApp2App = z17;
        this.paymentDevice = bVar;
        this.f55229n = fVar;
        this.f55230o = num;
        this.f55231p = num2;
        this.metrics = map;
    }
}
