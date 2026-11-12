package ab1;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lab1/q;", "", "", "gender", "", "weight", "<init>", "(Ljava/lang/String;Ljava/lang/Double;)V", "a", "Ljava/lang/String;", "getGender", "()Ljava/lang/String;", "b", "Ljava/lang/Double;", "getWeight", "()Ljava/lang/Double;", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gender")
    private final String gender;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weight")
    private final Double weight;

    public /* synthetic */ q(String str, Double d14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : d14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return s.g(this.gender, qVar.gender) && s.g(this.weight, qVar.weight);
    }

    public final int hashCode() {
        String str = this.gender;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d14 = this.weight;
        return iHashCode + (d14 != null ? d14.hashCode() : 0);
    }

    public final String toString() {
        return "UserDataDTO(gender=" + this.gender + ", weight=" + this.weight + ")";
    }

    public q(String str, Double d14) {
        this.gender = str;
        this.weight = d14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
