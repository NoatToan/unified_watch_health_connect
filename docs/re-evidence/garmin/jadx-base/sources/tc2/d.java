package tc2;

import am.j;
import com.google.gson.annotations.SerializedName;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Ltc2/d;", "", "", "rawServerJson", "", "digitalAgeOfConsent", "minimumAgeOfUse", "legalAdultAge", "<init>", "(Ljava/lang/String;III)V", "b", "I", "a", "()I", "c", "getMinimumAgeOfUse", "d", "getLegalAdultAge", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient String f163850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("digitalAgeOfConsent")
    private final int digitalAgeOfConsent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("minimumAgeOfUse")
    private final int minimumAgeOfUse;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("legalAdultAge")
    private final int legalAdultAge;

    public d(String str, int i14, int i15, int i16) {
        this.f163850a = str;
        this.digitalAgeOfConsent = i14;
        this.minimumAgeOfUse = i15;
        this.legalAdultAge = i16;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getDigitalAgeOfConsent() {
        return this.digitalAgeOfConsent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f163850a, dVar.f163850a) && this.digitalAgeOfConsent == dVar.digitalAgeOfConsent && this.minimumAgeOfUse == dVar.minimumAgeOfUse && this.legalAdultAge == dVar.legalAdultAge;
    }

    public final int hashCode() {
        String str = this.f163850a;
        return Integer.hashCode(this.legalAdultAge) + q2.d(this.minimumAgeOfUse, q2.d(this.digitalAgeOfConsent, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        int i14 = this.digitalAgeOfConsent;
        int i15 = this.minimumAgeOfUse;
        return j.q(e5.j(i14, i15, "CountryAgeRestrictionsResponse(digitalAgeOfConsent=", ", minimumAgeOfUse=", ", legalAdultAge="), this.legalAdultAge, ")");
    }

    public /* synthetic */ d(String str, int i14, int i15, int i16, int i17, p005kotlin.jvm.internal.j jVar) {
        this((i17 & 1) != 0 ? null : str, i14, i15, i16);
    }
}
