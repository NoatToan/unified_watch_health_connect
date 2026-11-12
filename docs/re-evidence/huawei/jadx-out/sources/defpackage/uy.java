package defpackage;

import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\t\u001a\u00020\u0006HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/braintreepayments/api/UnionPayConfiguration;", "", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "isEnabled", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", WatchFaceConstant.HASHCODE, "", "toString", "", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class uy {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f50722c = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f50723b;

    public uy(boolean z) {
        this.f50723b = z;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getF50723b() {
        return this.f50723b;
    }

    public uy(JSONObject jSONObject) {
        this(jSONObject != null ? jSONObject.optBoolean("enabled", false) : false);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/braintreepayments/api/UnionPayConfiguration$Companion;", "", "()V", "ENABLED", "", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(zcm zcmVar) {
            this();
        }
    }

    public String toString() {
        return "UnionPayConfiguration(isEnabled=" + this.f50723b + g4.l;
    }

    public int hashCode() {
        boolean z = this.f50723b;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof uy) && this.f50723b == ((uy) other).f50723b;
    }
}
