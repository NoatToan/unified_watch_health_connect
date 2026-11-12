package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.account.openauth.AuthorizeActivityBase;
import com.xiaomi.accountsdk.utils.AccountLogger;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.passport.sim.SIMInfo;
import com.xiaomi.phonenum.bean.Error;
import com.xiaomi.phonenum.data.AccountCertification;
import com.xiaomi.phonenum.obtain.PhoneException;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class d6h {
    public static volatile d6h e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final euh f15140b;
    public final vfc c;
    public final xkh d;

    public d6h(Context context) {
        this.f15139a = context;
        this.f15140b = pth.g(context);
        ba8.a aVar = new ba8.a(context);
        this.c = aVar;
        ym5 ym5Var = new ym5(aVar);
        this.d = ym5Var;
        ym5Var.b(new ahc(aVar));
    }

    public static d6h a(Context context) {
        if (e == null) {
            synchronized (d6h.class) {
                try {
                    if (e == null) {
                        e = new d6h(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public final String b() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                if (!networkInterfaceNextElement.getName().toLowerCase().contains("wlan")) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddressNextElement = inetAddresses.nextElement();
                        if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                            return inetAddressNextElement.getHostAddress();
                        }
                    }
                }
            }
            return "";
        } catch (Exception e2) {
            AccountLogger.log("ObtainHandler", "get mobile ip failed", e2);
            return "";
        }
    }

    public final String c(int i, String str, String str2, String str3) throws IOException, PhoneException {
        AccountLogger.log("ObtainHandler", "PhoneNumberRequest#TraceId=" + str);
        ork orkVarI = i(i, str, "data", str2, str3);
        while (!d(orkVarI)) {
            try {
                orkVarI = this.d.a(i, orkVarI.f29628b);
            } catch (JSONException e2) {
                throw new PhoneException(Error.JSON, "getPhoneNumberConfig parse response failed", e2);
            }
        }
        if (TextUtils.isEmpty(orkVarI.f29628b)) {
            throw new PhoneException(Error.UNKNOW, "response with empty body");
        }
        return orkVarI.f29628b;
    }

    public final boolean d(ork orkVar) throws IOException, PhoneException {
        if (orkVar == null || orkVar.f29627a != 200 || orkVar.f29628b == null) {
            throw new IOException("getInNetTime ObtainStrategy response:" + orkVar);
        }
        try {
            JSONObject jSONObject = new JSONObject(orkVar.f29628b);
            int i = jSONObject.getInt("code");
            if (i == 0) {
                return TSMAuthContants.PARAM_PHONE_NUMBER.equals(jSONObject.getString("result"));
            }
            throw new PhoneException(Error.codeToError(i), jSONObject.optString("desc"));
        } catch (JSONException e2) {
            throw new PhoneException(Error.JSON, "isPhoneResponse parse failed", e2);
        }
    }

    public final String e(Context context) {
        return "Android/" + Build.VERSION.RELEASE + " SDK_INT/" + Build.VERSION.SDK_INT + " BRAND/" + Build.BRAND + " PRODUCT/" + Build.PRODUCT + " MODEL/" + Build.MODEL + " INCREMENTAL/" + Build.VERSION.INCREMENTAL + " APP/" + context.getPackageName();
    }

    public AccountCertification f(int i, String str, String str2) throws IOException, PhoneException {
        return g(c(i, ikp.a(), str, str2), i);
    }

    public final AccountCertification g(String str, int i) throws PhoneException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.getJSONObject(TSMAuthContants.PARAM_PHONE_NUMBER);
            String string = jSONObject2.getString("numberHash");
            String string2 = jSONObject2.getString("token");
            AccountCertification.Source source = null;
            String strOptString = jSONObject.optString("operatorType", null);
            String strOptString2 = jSONObject.optString(AuthorizeActivityBase.KEY_OPERATORLINK, null);
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                source = new AccountCertification.Source(strOptString, strOptString2);
            }
            return new AccountCertification(i, string, string2, source);
        } catch (JSONException e2) {
            throw new PhoneException(Error.JSON, "parseAccountCertificationResult failed", e2);
        }
    }

    public final void h(Map<String, String> map, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        map.put(str, str2);
    }

    public final ork i(int i, String str, String str2, String str3, String str4) throws IOException {
        HashMap map = new HashMap();
        bcm bcmVarE = this.f15140b.e(i);
        h(map, SIMInfo.SIM_INFO_TYPE_ICCID, bcmVarE.f4062a);
        h(map, SIMInfo.SIM_INFO_TYPE_IMSI, bcmVarE.f4063b);
        h(map, "simMccmnc", bcmVarE.c);
        h(map, "networkMccmnc", this.f15140b.a(i));
        h(map, "sid", str3);
        h(map, OneTrack.Param.IMEI_MD5, this.f15140b.f());
        h(map, "deviceId", this.f15140b.getDeviceId());
        h(map, "phoneType", "" + this.f15140b.c(i));
        h(map, "traceId", str);
        h(map, CommonConstants.KEY_VERSION_CODE, "6");
        h(map, "phoneLevel", str2);
        h(map, "pip", b());
        h(map, "packageName", str4);
        ymk ymkVarB = new ymk.b().h(jf4.c).f(map).g(e(this.f15139a)).b();
        AccountLogger.log("ObtainHandler", "getCloudControl traceId=" + str);
        return this.c.b().a(ymkVarB);
    }
}
