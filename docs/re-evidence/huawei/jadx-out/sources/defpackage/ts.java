package defpackage;

import android.text.TextUtils;
import com.huawei.hms.network.embedded.g4;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\bHÂ\u0003J#\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bHÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u000e\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0006J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/braintreepayments/api/GraphQLConfiguration;", "", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "url", "", "features", "", "(Ljava/lang/String;Ljava/util/Set;)V", "isEnabled", "", "()Z", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", WatchFaceConstant.HASHCODE, "", "isFeatureEnabled", TrackConstants$Events.FEATURE, "toString", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class ts {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f49599b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f49600c;
    private final String d;
    private final Set<String> e;

    public ts(String str, Set<String> set) {
        zcp.c(str, "");
        zcp.c(set, "");
        this.d = str;
        this.e = set;
        this.f49600c = !TextUtils.isEmpty(str);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ts(JSONObject jSONObject) {
        String strE = tu.e(jSONObject, "url", "");
        zcp.b((Object) strE, "");
        this(strE, f49599b.c(jSONObject != null ? jSONObject.optJSONArray("features") : null));
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF49600c() {
        return this.f49600c;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002¨\u0006\b"}, d2 = {"Lcom/braintreepayments/api/GraphQLConfiguration$Companion;", "", "()V", "parseJsonFeatures", "", "", "jsonArray", "Lorg/json/JSONArray;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set<String> c(JSONArray jSONArray) {
            HashSet hashSet = new HashSet();
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String strOptString = jSONArray.optString(i, "");
                    zcp.b((Object) strOptString, "");
                    hashSet.add(strOptString);
                }
            }
            return hashSet;
        }

        public /* synthetic */ a(zcm zcmVar) {
            this();
        }
    }

    public String toString() {
        return "GraphQLConfiguration(url=" + this.d + ", features=" + this.e + g4.l;
    }

    public int hashCode() {
        return (this.d.hashCode() * 31) + this.e.hashCode();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ts)) {
            return false;
        }
        ts tsVar = (ts) other;
        return zcp.b((Object) this.d, (Object) tsVar.d) && zcp.b(this.e, tsVar.e);
    }
}
