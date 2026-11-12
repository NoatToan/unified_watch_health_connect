package defpackage;

import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/braintreepayments/api/PayPalDataCollectorRequest;", "", "hasUserLocationConsent", "", "riskCorrelationId", "", "(ZLjava/lang/String;)V", "getHasUserLocationConsent", "()Z", "getRiskCorrelationId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", WatchFaceConstant.HASHCODE, "", "toString", "PayPalDataCollector_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class uh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f50079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f50080c;

    public uh(boolean z, String str) {
        this.f50079b = z;
        this.f50080c = str;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getF50079b() {
        return this.f50079b;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF50080c() {
        return this.f50080c;
    }

    public String toString() {
        return "PayPalDataCollectorRequest(hasUserLocationConsent=" + this.f50079b + ", riskCorrelationId=" + this.f50080c + g4.l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.f50079b;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        String str = this.f50080c;
        return (r0 * 31) + (str == null ? 0 : str.hashCode());
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof uh)) {
            return false;
        }
        uh uhVar = (uh) other;
        return this.f50079b == uhVar.f50079b && zcp.b((Object) this.f50080c, (Object) uhVar.f50080c);
    }
}
