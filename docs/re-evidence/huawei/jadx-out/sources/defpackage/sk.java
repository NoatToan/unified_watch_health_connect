package defpackage;

import android.text.TextUtils;
import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/braintreepayments/api/BraintreeApiConfiguration;", "", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "accessToken", "", "url", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "isEnabled", "", "()Z", "getUrl", "component1", "component2", "copy", "equals", "other", WatchFaceConstant.HASHCODE, "", "toString", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class sk {
    public static final b d = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f48224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f48225c;
    private final String e;

    public sk(String str, String str2) {
        zcp.c(str, "");
        zcp.c(str2, "");
        this.e = str;
        this.f48225c = str2;
        this.f48224b = !TextUtils.isEmpty(str);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getF48225c() {
        return this.f48225c;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public sk(JSONObject jSONObject) {
        String strE = tu.e(jSONObject, "accessToken", "");
        zcp.b((Object) strE, "");
        String strE2 = tu.e(jSONObject, "url", "");
        zcp.b((Object) strE2, "");
        this(strE, strE2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF48224b() {
        return this.f48224b;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/braintreepayments/api/BraintreeApiConfiguration$Companion;", "", "()V", "ACCESS_TOKEN_KEY", "", "URL_KEY", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(zcm zcmVar) {
            this();
        }
    }

    public String toString() {
        return "BraintreeApiConfiguration(accessToken=" + this.e + ", url=" + this.f48225c + g4.l;
    }

    public int hashCode() {
        return (this.e.hashCode() * 31) + this.f48225c.hashCode();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof sk)) {
            return false;
        }
        sk skVar = (sk) other;
        return zcp.b((Object) this.e, (Object) skVar.e) && zcp.b((Object) this.f48225c, (Object) skVar.f48225c);
    }
}
