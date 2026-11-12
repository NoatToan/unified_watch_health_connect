package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.webkit.ProxyConfig;
import com.tencent.connect.common.Constants;
import io.jsonwebtoken.Claims;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.openid.appauth.Clock;
import net.openid.appauth.JsonUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class zrd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f54529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f54530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, Object> f54531c;
    public final String d;
    public final Long e;
    public final String f;
    public final String g;
    public final String i;
    private static final Long h = 1000L;
    private static final Long l = 600L;
    private static final Set<String> j = zqs.b(Claims.ISSUER, Claims.SUBJECT, Claims.AUDIENCE, Claims.EXPIRATION, Claims.ISSUED_AT, Constants.NONCE, "azp");

    zrd(String str, String str2, List<String> list, Long l2, Long l3, String str3, String str4, Map<String, Object> map) {
        this.f = str;
        this.i = str2;
        this.f54529a = list;
        this.f54530b = l2;
        this.e = l3;
        this.g = str3;
        this.d = str4;
        this.f54531c = map;
    }

    private static JSONObject b(String str) throws JSONException {
        return new JSONObject(new String(Base64.decode(str, 8)));
    }

    public static zrd c(String str) throws JSONException, c {
        List<String> listE;
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length <= 1) {
            throw new c("ID token must have both header and claims section");
        }
        b(strArrSplit[0]);
        JSONObject jSONObjectB = b(strArrSplit[1]);
        String strD = JsonUtil.d(jSONObjectB, Claims.ISSUER);
        String strD2 = JsonUtil.d(jSONObjectB, Claims.SUBJECT);
        try {
            listE = JsonUtil.e(jSONObjectB, Claims.AUDIENCE);
        } catch (JSONException unused) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(JsonUtil.d(jSONObjectB, Claims.AUDIENCE));
            listE = arrayList;
        }
        long j2 = jSONObjectB.getLong(Claims.EXPIRATION);
        long j3 = jSONObjectB.getLong(Claims.ISSUED_AT);
        String strC = JsonUtil.c(jSONObjectB, Constants.NONCE);
        String strC2 = JsonUtil.c(jSONObjectB, "azp");
        Iterator<String> it = j.iterator();
        while (it.hasNext()) {
            jSONObjectB.remove(it.next());
        }
        return new zrd(strD, strD2, listE, Long.valueOf(j2), Long.valueOf(j3), strC, strC2, JsonUtil.c(jSONObjectB));
    }

    public void b(zrj zrjVar, Clock clock, boolean z) throws zqw {
        zqv zqvVar = zrjVar.f54541c.f43041b;
        if (zqvVar != null) {
            if (!this.f.equals(zqvVar.c())) {
                throw zqw.e(zqw.b.d, new c("Issuer mismatch"));
            }
            Uri uri = Uri.parse(this.f);
            if (!z && !uri.getScheme().equals(ProxyConfig.MATCH_HTTPS)) {
                throw zqw.e(zqw.b.d, new c("Issuer must be an https URL"));
            }
            if (TextUtils.isEmpty(uri.getHost())) {
                throw zqw.e(zqw.b.d, new c("Issuer host can not be empty"));
            }
            if (uri.getFragment() != null || uri.getQueryParameterNames().size() > 0) {
                throw zqw.e(zqw.b.d, new c("Issuer URL should not containt query parameters or fragment components"));
            }
        }
        String str = zrjVar.e;
        if (!this.f54529a.contains(str) && !str.equals(this.d)) {
            throw zqw.e(zqw.b.d, new c("Audience mismatch"));
        }
        long currentTimeMillis = clock.getCurrentTimeMillis() / h.longValue();
        Long lValueOf = Long.valueOf(currentTimeMillis);
        lValueOf.getClass();
        if (currentTimeMillis > this.f54530b.longValue()) {
            throw zqw.e(zqw.b.d, new c("ID Token expired"));
        }
        lValueOf.getClass();
        if (Math.abs(currentTimeMillis - this.e.longValue()) > l.longValue()) {
            throw zqw.e(zqw.b.d, new c("Issued at time is more than 10 minutes before or after the current time"));
        }
        if ("authorization_code".equals(zrjVar.g)) {
            if (!TextUtils.equals(this.g, zrjVar.h)) {
                throw zqw.e(zqw.b.d, new c("Nonce mismatch"));
            }
        }
    }

    public static class c extends Exception {
        c(String str) {
            super(str);
        }
    }
}
