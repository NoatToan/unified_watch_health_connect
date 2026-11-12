package fo2;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lfo2/h0;", "", "", "termsVersion", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getTermsVersion", "()Ljava/lang/String;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("termsVersion")
    private final String termsVersion;

    public h0(String str) {
        str.getClass();
        this.termsVersion = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && p005kotlin.jvm.internal.s.g(this.termsVersion, ((h0) obj).termsVersion);
    }

    public final int hashCode() {
        return this.termsVersion.hashCode();
    }

    public final String toString() {
        return am.j.m("TermsVersion(termsVersion=", this.termsVersion, ")");
    }
}
