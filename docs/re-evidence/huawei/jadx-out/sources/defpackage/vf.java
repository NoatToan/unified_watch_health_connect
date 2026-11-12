package defpackage;

import com.huawei.hms.kit.awareness.b.a.a;
import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B#\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0003J-\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/braintreepayments/api/VisaCheckoutConfiguration;", "", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", a.g, "", "externalClientId", "acceptedCardBrands", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAcceptedCardBrands", "()Ljava/util/List;", "getApiKey", "()Ljava/lang/String;", "getExternalClientId", "isEnabled", "", "()Z", "component1", "component2", "component3", "copy", "equals", "other", WatchFaceConstant.HASHCODE, "", "toString", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class vf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f51016b = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f51017a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f51018c;
    private final String d;
    private final List<String> e;

    public vf(String str, String str2, List<String> list) {
        zcp.c(str, "");
        zcp.c(str2, "");
        zcp.c(list, "");
        this.d = str;
        this.f51018c = str2;
        this.e = list;
        this.f51017a = !zcp.b((Object) str, (Object) "");
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF51018c() {
        return this.f51018c;
    }

    public final List<String> a() {
        return this.e;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getF51017a() {
        return this.f51017a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public vf(JSONObject jSONObject) {
        String strE = tu.e(jSONObject, "apikey", "");
        zcp.b((Object) strE, "");
        String strE2 = tu.e(jSONObject, "externalClientId", "");
        zcp.b((Object) strE2, "");
        this(strE, strE2, f51016b.e(new te(jSONObject).e()));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/braintreepayments/api/VisaCheckoutConfiguration$Companion;", "", "()V", "API_KEY", "", "EXTERNAL_CLIENT_ID", "supportedCardTypesToAcceptedCardBrands", "", "supportedCardTypes", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class c {
        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final List<String> e(List<String> list) {
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String lowerCase = it.next().toLowerCase(Locale.ROOT);
                zcp.b((Object) lowerCase, "");
                switch (lowerCase.hashCode()) {
                    case -2038717326:
                        if (lowerCase.equals("mastercard")) {
                            arrayList.add("MASTERCARD");
                        }
                        break;
                    case -1120637072:
                        if (lowerCase.equals("american express")) {
                            arrayList.add("AMEX");
                        }
                        break;
                    case 3619905:
                        if (lowerCase.equals("visa")) {
                            arrayList.add("VISA");
                        }
                        break;
                    case 273184745:
                        if (lowerCase.equals("discover")) {
                            arrayList.add("DISCOVER");
                        }
                        break;
                }
            }
            return arrayList;
        }

        public /* synthetic */ c(zcm zcmVar) {
            this();
        }
    }

    public String toString() {
        return "VisaCheckoutConfiguration(apiKey=" + this.d + ", externalClientId=" + this.f51018c + ", acceptedCardBrands=" + this.e + g4.l;
    }

    public int hashCode() {
        return (((this.d.hashCode() * 31) + this.f51018c.hashCode()) * 31) + this.e.hashCode();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof vf)) {
            return false;
        }
        vf vfVar = (vf) other;
        return zcp.b((Object) this.d, (Object) vfVar.d) && zcp.b((Object) this.f51018c, (Object) vfVar.f51018c) && zcp.b(this.e, vfVar.e);
    }
}
