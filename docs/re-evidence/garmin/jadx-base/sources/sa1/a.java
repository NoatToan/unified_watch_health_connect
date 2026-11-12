package sa1;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000e¨\u0006\u0018"}, d2 = {"Lsa1/a;", "", "", "gender", "", "weight", "cyclingAbility", "<init>", "(Ljava/lang/String;DLjava/lang/String;)V", "a", "Ljava/lang/String;", "getGender", "()Ljava/lang/String;", "setGender", "(Ljava/lang/String;)V", "b", "D", "getWeight", "()D", "setWeight", "(D)V", "c", "getCyclingAbility", "setCyclingAbility", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gender")
    private String gender;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weight")
    private double weight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cyclingAbility")
    private String cyclingAbility;

    public a(String str, double d14, String str2) {
        str2.getClass();
        this.gender = str;
        this.weight = d14;
        this.cyclingAbility = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p005kotlin.jvm.internal.s.g(this.gender, aVar.gender) && Double.compare(this.weight, aVar.weight) == 0 && p005kotlin.jvm.internal.s.g(this.cyclingAbility, aVar.cyclingAbility);
    }

    public final int hashCode() {
        String str = this.gender;
        return this.cyclingAbility.hashCode() + org.apache.commons.lang3.e.b((str == null ? 0 : str.hashCode()) * 31, 31, this.weight);
    }

    public final String toString() {
        String str = this.gender;
        double d14 = this.weight;
        String str2 = this.cyclingAbility;
        StringBuilder sb3 = new StringBuilder("AthleteInfoDTO(gender=");
        sb3.append(str);
        sb3.append(", weight=");
        sb3.append(d14);
        return e0.h(sb3, ", cyclingAbility=", str2, ")");
    }
}
