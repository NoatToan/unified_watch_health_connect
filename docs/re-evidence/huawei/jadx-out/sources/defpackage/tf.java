package defpackage;

import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 v2\u00020\u0001:\u0001vB\u0011\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010s\u001a\u00020+2\u0006\u0010t\u001a\u00020\u0003H\u0007J\b\u0010u\u001a\u00020\u0003H\u0016R\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0007R\u0016\u0010 \u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0007R\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030#8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010(\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0007R\u0016\u0010*\u001a\u00020+8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010,R\u0014\u0010-\u001a\u00020+X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u0016\u0010.\u001a\u00020+8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010,R\u0014\u0010/\u001a\u00020+X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010,R\u0016\u00100\u001a\u00020+8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010,R\u0016\u00101\u001a\u00020+8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010,R\u0014\u00102\u001a\u00020+X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010,R\u0014\u00103\u001a\u00020+X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010,R\u0016\u00104\u001a\u00020+8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010,R\u0014\u00105\u001a\u00020+X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010,R\u0014\u00106\u001a\u00020+X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010,R\u0014\u00107\u001a\u00020+X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010,R\u0014\u00108\u001a\u00020+X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010,R\u0014\u00109\u001a\u00020+X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010,R\u0014\u0010:\u001a\u00020+X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010,R\u0016\u0010;\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0007R\u0016\u0010=\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\u0007R\u0014\u0010?\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\u0007R\u0018\u0010A\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010\u0007R\u000e\u0010C\u001a\u00020DX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010E\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010\u0007R\u0016\u0010G\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010\u0007R\u0018\u0010I\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010\u0007R\u0018\u0010K\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010\u0007R\u0016\u0010M\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010\u0007R\u0016\u0010O\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010\u0007R\u0016\u0010Q\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010\u0007R\u000e\u0010S\u001a\u00020TX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010U\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010\u0007R\u0016\u0010W\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010\u0007R\u0016\u0010Y\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010\u0007R\u001c\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00030#8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010%R\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00030#X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010%R\u000e\u0010_\u001a\u00020`X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010a\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010\u0007R\u000e\u0010c\u001a\u00020dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010e\u001a\u00020+8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010,R\u0016\u0010g\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010\u0007R\u0016\u0010i\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010\u0007R\u0016\u0010k\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bl\u0010\u0007R\u000e\u0010m\u001a\u00020nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010o\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bp\u0010\u0007R\u001c\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00030#8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\br\u0010%¨\u0006w"}, d2 = {"Lcom/braintreepayments/api/Configuration;", "", "configurationString", "", "(Ljava/lang/String;)V", "assetsUrl", "getAssetsUrl", "()Ljava/lang/String;", "braintreeApiAccessToken", "getBraintreeApiAccessToken", "braintreeApiConfiguration", "Lcom/braintreepayments/api/BraintreeApiConfiguration;", "braintreeApiUrl", "getBraintreeApiUrl", "cardConfiguration", "Lcom/braintreepayments/api/CardConfiguration;", "cardinalAuthenticationJwt", "getCardinalAuthenticationJwt", "challenges", "", "clientApiUrl", "getClientApiUrl", "environment", "getEnvironment", "googlePayAuthorizationFingerprint", "getGooglePayAuthorizationFingerprint", "googlePayConfiguration", "Lcom/braintreepayments/api/GooglePayConfiguration;", "googlePayDisplayName", "getGooglePayDisplayName", "googlePayEnvironment", "getGooglePayEnvironment", "googlePayPayPalClientId", "getGooglePayPayPalClientId", "googlePaySupportedNetworks", "", "getGooglePaySupportedNetworks", "()Ljava/util/List;", "graphQLConfiguration", "Lcom/braintreepayments/api/GraphQLConfiguration;", "graphQLUrl", "getGraphQLUrl", "isBraintreeApiEnabled", "", "()Z", "isCvvChallengePresent", "isFraudDataCollectionEnabled", "isGooglePayEnabled", "isGraphQLEnabled", "isKountEnabled", "isLocalPaymentEnabled", "isPayPalEnabled", "isPayPalTouchDisabled", "isPostalCodeChallengePresent", "isSamsungPayEnabled", "isThreeDSecureEnabled", "isUnionPayEnabled", "isVenmoEnabled", "isVisaCheckoutEnabled", "kountMerchantId", "getKountMerchantId", "merchantAccountId", "getMerchantAccountId", HwPayConstant.KEY_MERCHANTID, "getMerchantId", "payPalClientId", "getPayPalClientId", "payPalConfiguration", "Lcom/braintreepayments/api/PayPalConfiguration;", "payPalCurrencyIsoCode", "getPayPalCurrencyIsoCode", "payPalDirectBaseUrl", "getPayPalDirectBaseUrl", "payPalDisplayName", "getPayPalDisplayName", "payPalEnvironment", "getPayPalEnvironment", "payPalPrivacyUrl", "getPayPalPrivacyUrl", "payPalUserAgreementUrl", "getPayPalUserAgreementUrl", "samsungPayAuthorization", "getSamsungPayAuthorization", "samsungPayConfiguration", "Lcom/braintreepayments/api/SamsungPayConfiguration;", "samsungPayEnvironment", "getSamsungPayEnvironment", "samsungPayMerchantDisplayName", "getSamsungPayMerchantDisplayName", "samsungPayServiceId", "getSamsungPayServiceId", "samsungPaySupportedCardBrands", "getSamsungPaySupportedCardBrands", "supportedCardTypes", "getSupportedCardTypes", "unionPayConfiguration", "Lcom/braintreepayments/api/UnionPayConfiguration;", "venmoAccessToken", "getVenmoAccessToken", "venmoConfiguration", "Lcom/braintreepayments/api/VenmoConfiguration;", "venmoEnrichedCustomerDataEnabled", "getVenmoEnrichedCustomerDataEnabled", "venmoEnvironment", "getVenmoEnvironment", "venmoMerchantId", "getVenmoMerchantId", "visaCheckoutApiKey", "getVisaCheckoutApiKey", "visaCheckoutConfiguration", "Lcom/braintreepayments/api/VisaCheckoutConfiguration;", "visaCheckoutExternalClientId", "getVisaCheckoutExternalClientId", "visaCheckoutSupportedNetworks", "getVisaCheckoutSupportedNetworks", "isGraphQLFeatureEnabled", TrackConstants$Events.FEATURE, "toJson", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class tf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f49044c = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f49045a;
    private final boolean aa;
    private final boolean ab;
    private final boolean ac;
    private final boolean ad;
    private final String ae;
    private final boolean af;
    private final boolean ag;
    private final boolean ah;
    private final boolean ai;
    private final String aj;
    private final String ak;
    private final String al;
    private final ug am;
    private final String an;
    private final String ao;
    private final String ap;
    private final String aq;
    private final String ar;
    private final String as;
    private final String at;
    private final String au;
    private final uq av;
    private final String aw;
    private final String ax;
    private final List<String> ay;
    private final String az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f49046b;
    private final List<String> ba;
    private final vd bb;
    private final uy bc;
    private final String bd;
    private final String be;
    private final boolean bf;
    private final vf bg;
    private final String bh;
    private final List<String> bi;
    private final String bk;
    private final sk d;
    private final String e;
    private final Set<String> f;
    private final String g;
    private final String h;
    private final String i;
    private final te j;
    private final String k;
    private final String l;
    private final String m;
    private final tt n;
    private final String o;
    private final String p;
    private final ts q;
    private final boolean r;
    private final String s;
    private final List<String> t;
    private final boolean u;
    private final boolean v;
    private final boolean w;
    private final boolean x;
    private final boolean y;
    private final boolean z;

    public tf(String str) throws JSONException {
        if (str == null) {
            throw new JSONException("Configuration cannot be null");
        }
        this.g = str;
        JSONObject jSONObject = new JSONObject(str);
        String strE = tu.e(jSONObject, "assetsUrl", "");
        zcp.b((Object) strE, "");
        this.f49046b = strE;
        String string = jSONObject.getString("clientApiUrl");
        zcp.b((Object) string, "");
        this.i = string;
        this.f = new LinkedHashSet();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("challenges");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                Set<String> set = this.f;
                String strOptString = jSONArrayOptJSONArray.optString(i, "");
                zcp.b((Object) strOptString, "");
                set.add(strOptString);
            }
        }
        sk skVar = new sk(jSONObject.optJSONObject("braintreeApi"));
        this.d = skVar;
        te teVar = new te(jSONObject.optJSONObject("creditCards"));
        this.j = teVar;
        this.h = tu.e(jSONObject, "cardinalAuthenticationJWT", null);
        String string2 = jSONObject.getString("environment");
        zcp.b((Object) string2, "");
        this.k = string2;
        tt ttVar = new tt(jSONObject.optJSONObject("androidPay"));
        this.n = ttVar;
        ts tsVar = new ts(jSONObject.optJSONObject("graphQL"));
        this.q = tsVar;
        this.z = jSONObject.optBoolean("paypalEnabled", false);
        this.af = jSONObject.optBoolean("threeDSecureEnabled", false);
        this.aj = tu.e(jSONObject, "merchantAccountId", null);
        String string3 = jSONObject.getString(HwPayConstant.KEY_MERCHANTID);
        zcp.b((Object) string3, "");
        this.al = string3;
        ug ugVar = new ug(jSONObject.optJSONObject("paypal"));
        this.am = ugVar;
        uq uqVar = new uq(jSONObject.optJSONObject("samsungPay"));
        this.av = uqVar;
        uy uyVar = new uy(jSONObject.optJSONObject("unionPay"));
        this.bc = uyVar;
        vd vdVar = new vd(jSONObject.optJSONObject("payWithVenmo"));
        this.bb = vdVar;
        vf vfVar = new vf(jSONObject.optJSONObject("visaCheckout"));
        this.bg = vfVar;
        this.v = this.f.contains("cvv");
        this.y = ttVar.getE();
        this.ac = getZ();
        this.ad = this.f.contains("postal_code");
        this.ab = uqVar.getF50459c();
        this.ag = uyVar.getF50723b();
        this.ah = vdVar.getD();
        this.ai = vfVar.getF51017a();
        this.ap = ugVar.getF50045b();
        this.ao = ugVar.getJ();
        this.ar = ugVar.getI();
        this.f49045a = skVar.getE();
        this.e = skVar.getF48225c();
        this.m = ttVar.getD();
        this.o = ttVar.getF49628a();
        this.l = ttVar.getF49629c();
        this.s = ttVar.getH();
        this.t = ttVar.e();
        this.p = tsVar.getD();
        this.r = skVar.getF48224b();
        this.w = teVar.getF49011c();
        this.x = tsVar.getF49600c();
        this.u = false;
        this.aa = ugVar.getG();
        this.ae = "";
        this.ak = ugVar.getF50046c();
        this.an = ugVar.getE();
        this.as = ugVar.getF50044a();
        this.aq = ugVar.getH();
        this.ax = uqVar.getF50458b();
        this.aw = uqVar.getD();
        this.at = uqVar.getF50457a();
        this.au = uqVar.getF();
        this.ba = yzp.i((Iterable) uqVar.d());
        this.ay = teVar.e();
        this.az = vdVar.getF50951b();
        this.bh = vdVar.getF50952c();
        this.bd = vdVar.getH();
        this.bf = vdVar.getE();
        this.be = vfVar.getD();
        this.bk = vfVar.getF51018c();
        this.bi = vfVar.a();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/braintreepayments/api/Configuration$Companion;", "", "()V", "ASSETS_URL_KEY", "", "BRAINTREE_API_KEY", "CARDINAL_AUTHENTICATION_JWT", "CARD_KEY", "CHALLENGES_KEY", "CLIENT_API_URL_KEY", "ENVIRONMENT_KEY", "GOOGLE_PAY_KEY", "GRAPHQL_KEY", "MERCHANT_ACCOUNT_ID_KEY", "MERCHANT_ID_KEY", "PAYPAL_ENABLED_KEY", "PAYPAL_KEY", "PAY_WITH_VENMO_KEY", "SAMSUNG_PAY_KEY", "THREE_D_SECURE_ENABLED_KEY", "UNIONPAY_KEY", "VISA_CHECKOUT_KEY", "fromJson", "Lcom/braintreepayments/api/Configuration;", "configurationString", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class c {
        private c() {
        }

        @JvmStatic
        public final tf e(String str) throws JSONException {
            return new tf(str);
        }

        public /* synthetic */ c(zcm zcmVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public String getI() {
        return this.i;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public String getK() {
        return this.k;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public boolean getZ() {
        return this.z;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public String getAl() {
        return this.al;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getAn() {
        return this.an;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAs() {
        return this.as;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public String getG() {
        return this.g;
    }
}
