package jo2;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000e\u001a\u0004\b\b\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ljo2/e;", "", "", "verified", "", "payload", "<init>", "(ZLjava/lang/String;)V", "a", "Z", "b", "()Z", "setVerified", "(Z)V", "Ljava/lang/String;", "()Ljava/lang/String;", "setPayload", "(Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("verified")
    private boolean verified;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("payload")
    private String payload;

    public e(boolean z14, String str) {
        str.getClass();
        this.verified = z14;
        this.payload = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPayload() {
        return this.payload;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getVerified() {
        return this.verified;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.verified == eVar.verified && s.g(this.payload, eVar.payload);
    }

    public final int hashCode() {
        return this.payload.hashCode() + (Boolean.hashCode(this.verified) * 31);
    }

    public final String toString() {
        return "PushAccountDataResponse(verified=" + this.verified + ", payload=" + this.payload + ")";
    }
}
