package db1;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ldb1/j;", "", "", "userGoalType", "", "userGoalValue", "", "autogoal", "<init>", "(Ljava/lang/String;DLjava/lang/Boolean;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "setUserGoalType", "(Ljava/lang/String;)V", "b", "D", "()D", "setUserGoalValue", "(D)V", "c", "Ljava/lang/Boolean;", "getAutogoal", "()Ljava/lang/Boolean;", "setAutogoal", "(Ljava/lang/Boolean;)V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userGoalType")
    private String userGoalType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userGoalValue")
    private double userGoalValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("autogoal")
    private Boolean autogoal;

    public j(String str, double d14, Boolean bool) {
        str.getClass();
        this.userGoalType = str;
        this.userGoalValue = d14;
        this.autogoal = bool;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getUserGoalType() {
        return this.userGoalType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getUserGoalValue() {
        return this.userGoalValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return p005kotlin.jvm.internal.s.g(this.userGoalType, jVar.userGoalType) && Double.compare(this.userGoalValue, jVar.userGoalValue) == 0 && p005kotlin.jvm.internal.s.g(this.autogoal, jVar.autogoal);
    }

    public final int hashCode() {
        int iB = org.apache.commons.lang3.e.b(this.userGoalType.hashCode() * 31, 31, this.userGoalValue);
        Boolean bool = this.autogoal;
        return iB + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "PregnancyHealthGoalDTO(userGoalType=" + this.userGoalType + ", userGoalValue=" + this.userGoalValue + ", autogoal=" + this.autogoal + ")";
    }

    public /* synthetic */ j(String str, double d14, Boolean bool, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, d14, (i14 & 4) != 0 ? null : bool);
    }
}
