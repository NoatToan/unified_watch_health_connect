package defpackage;

import android.net.Uri;
import com.braintreepayments.api.Authorization;
import com.braintreepayments.api.NetworkResponseCallback;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.operation.ble.BleConstants;
import java.util.Map;
import javax.net.ssl.SSLException;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J-\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086\u0002J5\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0086\u0002J*\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJJ\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/braintreepayments/api/BraintreeHttpClient;", "", "httpClient", "Lcom/braintreepayments/api/HttpClient;", "(Lcom/braintreepayments/api/HttpClient;)V", "get", "", BleConstants.KEY_PATH, "", "configuration", "Lcom/braintreepayments/api/Configuration;", "authorization", "Lcom/braintreepayments/api/Authorization;", ParamConstants.Param.CALLBACK, "Lcom/braintreepayments/api/NetworkResponseCallback;", "retryStrategy", "", "post", "data", "additionalHeaders", "", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class su {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f48697b = new c(null);
    private final tp e;

    public su(tp tpVar) {
        zcp.c(tpVar, "");
        this.e = tpVar;
    }

    public /* synthetic */ su(tp tpVar, int i, zcm zcmVar) {
        this((i & 1) != 0 ? f48697b.b() : tpVar);
    }

    public final void a(String str, tf tfVar, Authorization authorization, int i, NetworkResponseCallback networkResponseCallback) {
        zcp.c(str, "");
        zcp.c(networkResponseCallback, "");
        if (authorization instanceof ty) {
            networkResponseCallback.onResult(null, new st(((ty) authorization).getE(), null, 2, null));
            return;
        }
        boolean zE = zes.e(str, "http", false, 2, (Object) null);
        if (tfVar == null && !zE) {
            networkResponseCallback.onResult(null, new st("Braintree HTTP GET request without configuration cannot have a relative path.", null, 2, null));
            return;
        }
        if (authorization instanceof tj) {
            str = Uri.parse(str).buildUpon().appendQueryParameter("authorizationFingerprint", ((tj) authorization).getE()).toString();
        }
        zcp.b((Object) str, "");
        tr trVarD = new tr().b("GET").d(str).d("User-Agent", "braintree/android/4.49.1");
        if (!zE && tfVar != null) {
            trVarD.a(tfVar.getI());
        }
        if (authorization instanceof uw) {
            trVarD.d("Client-Key", ((uw) authorization).getE());
        }
        this.e.b(trVarD, i, networkResponseCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(su suVar, String str, String str2, tf tfVar, Authorization authorization, Map map, NetworkResponseCallback networkResponseCallback, int i, Object obj) {
        if ((i & 16) != 0) {
            map = zae.e();
        }
        suVar.e(str, str2, tfVar, authorization, map, networkResponseCallback);
    }

    public final void e(String str, String str2, tf tfVar, Authorization authorization, Map<String, String> map, NetworkResponseCallback networkResponseCallback) {
        String d;
        zcp.c(str, "");
        zcp.c(str2, "");
        zcp.c(map, "");
        if (authorization instanceof ty) {
            String e = ((ty) authorization).getE();
            if (networkResponseCallback != null) {
                networkResponseCallback.onResult(null, new st(e, null, 2, null));
                return;
            }
            return;
        }
        boolean zE = zes.e(str, "http", false, 2, (Object) null);
        if (tfVar == null && !zE) {
            st stVar = new st("Braintree HTTP GET request without configuration cannot have a relative path.", null, 2, null);
            if (networkResponseCallback != null) {
                networkResponseCallback.onResult(null, stVar);
                return;
            }
            return;
        }
        if (authorization instanceof tj) {
            try {
                str2 = new JSONObject(str2).put("authorizationFingerprint", ((tj) authorization).getE()).toString();
            } catch (JSONException e2) {
                if (networkResponseCallback != null) {
                    networkResponseCallback.onResult(null, e2);
                    return;
                }
                return;
            }
        }
        zcp.b((Object) str2, "");
        tr trVarD = new tr().b("POST").d(str).e(str2).d("User-Agent", "braintree/android/4.49.1");
        if (!zE && tfVar != null) {
            trVarD.a(tfVar.getI());
        }
        if (authorization instanceof uw) {
            trVarD.d("Client-Key", ((uw) authorization).getE());
        }
        if (authorization != null && (d = authorization.getE()) != null) {
            trVarD.d("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + d);
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            trVarD.d(entry.getKey(), entry.getValue());
        }
        this.e.a(trVarD, networkResponseCallback);
    }

    public final String c(String str, String str2, tf tfVar, Authorization authorization) throws Exception {
        zcp.c(str, "");
        zcp.c(str2, "");
        if (authorization instanceof ty) {
            throw new st(((ty) authorization).getE(), null, 2, null);
        }
        boolean zE = zes.e(str, "http", false, 2, (Object) null);
        if (tfVar == null && !zE) {
            throw new st("Braintree HTTP GET request without configuration cannot have a relative path.", null, 2, null);
        }
        if (authorization instanceof tj) {
            str2 = new JSONObject(str2).put("authorizationFingerprint", ((tj) authorization).getE()).toString();
        }
        zcp.b((Object) str2, "");
        tr trVarD = new tr().b("POST").d(str).e(str2).d("User-Agent", "braintree/android/4.49.1");
        if (!zE && tfVar != null) {
            trVarD.a(tfVar.getI());
        }
        if (authorization instanceof uw) {
            trVarD.d("Client-Key", ((uw) authorization).getE());
        }
        String strC = this.e.c(trVarD);
        zcp.b((Object) strC, "");
        return strC;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/braintreepayments/api/BraintreeHttpClient$Companion;", "", "()V", "AUTHORIZATION_FINGERPRINT_KEY", "", "CLIENT_KEY_HEADER", "USER_AGENT_HEADER", "createDefaultHttpClient", "Lcom/braintreepayments/api/HttpClient;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class c {
        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final tp b() throws SSLException {
            return new tp(new ux(uu.f50569b.e()), new sv(null, 1, null));
        }

        public /* synthetic */ c(zcm zcmVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public su() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
