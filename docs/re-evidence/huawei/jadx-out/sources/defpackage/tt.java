package defpackage;

import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 #2\u00020\u0001:\u0001#B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B?\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0002\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\fHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\bHÖ\u0001R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0013R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/braintreepayments/api/GooglePayConfiguration;", "", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "isEnabled", "", "googleAuthorizationFingerprint", "", "environment", "displayName", "supportedNetworks", "", "paypalClientId", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "getEnvironment", "getGoogleAuthorizationFingerprint", "()Z", "getPaypalClientId", "getSupportedNetworks", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", WatchFaceConstant.HASHCODE, "", "toString", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class tt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f49627b = new d(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f49628a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f49629c;
    private final String d;
    private final boolean e;
    private final String h;
    private final List<String> i;

    public tt(boolean z, String str, String str2, String str3, List<String> list, String str4) {
        zcp.c(str3, "");
        zcp.c(list, "");
        zcp.c(str4, "");
        this.e = z;
        this.d = str;
        this.f49629c = str2;
        this.f49628a = str3;
        this.i = list;
        this.h = str4;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF49629c() {
        return this.f49629c;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF49628a() {
        return this.f49628a;
    }

    public final List<String> e() {
        return this.i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getH() {
        return this.h;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public tt(JSONObject jSONObject) {
        boolean zOptBoolean = jSONObject != null ? jSONObject.optBoolean("enabled", false) : false;
        String strE = tu.e(jSONObject, "googleAuthorizationFingerprint", null);
        String strE2 = tu.e(jSONObject, "environment", null);
        String strE3 = tu.e(jSONObject, "displayName", "");
        zcp.b((Object) strE3, "");
        List listA = f49627b.a(jSONObject != null ? jSONObject.optJSONArray("supportedNetworks") : null);
        String strE4 = tu.e(jSONObject, "paypalClientId", "");
        zcp.b((Object) strE4, "");
        this(zOptBoolean, strE, strE2, strE3, listA, strE4);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/braintreepayments/api/GooglePayConfiguration$Companion;", "", "()V", "DISPLAY_NAME_KEY", "", "ENABLED_KEY", "ENVIRONMENT_KEY", "GOOGLE_AUTHORIZATION_FINGERPRINT_KEY", "PAYPAL_CLIENT_ID_KEY", "SUPPORTED_NETWORKS_KEY", "parseSupportedNetworks", "", "networksArray", "Lorg/json/JSONArray;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class d {
        private d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<String> a(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    try {
                        String string = jSONArray.getString(i);
                        zcp.b((Object) string, "");
                        arrayList.add(string);
                    } catch (JSONException unused) {
                    }
                }
            }
            return arrayList;
        }

        public /* synthetic */ d(zcm zcmVar) {
            this();
        }
    }

    public String toString() {
        return "GooglePayConfiguration(isEnabled=" + this.e + ", googleAuthorizationFingerprint=" + this.d + ", environment=" + this.f49629c + ", displayName=" + this.f49628a + ", supportedNetworks=" + this.i + ", paypalClientId=" + this.h + g4.l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    public int hashCode() {
        boolean z = this.e;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        String str = this.d;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f49629c;
        return (((((((((r0 * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f49628a.hashCode()) * 31) + this.i.hashCode()) * 31) + this.h.hashCode();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof tt)) {
            return false;
        }
        tt ttVar = (tt) other;
        return this.e == ttVar.e && zcp.b((Object) this.d, (Object) ttVar.d) && zcp.b((Object) this.f49629c, (Object) ttVar.f49629c) && zcp.b((Object) this.f49628a, (Object) ttVar.f49628a) && zcp.b(this.i, ttVar.i) && zcp.b((Object) this.h, (Object) ttVar.h);
    }
}
