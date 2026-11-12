package nr;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnr/d0;", "", "", "exerciseName", "exerciseDuration", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f127005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f127006b;

    public d0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f127005a = str;
        this.f127006b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f127005a.equals(d0Var.f127005a) && this.f127006b.equals(d0Var.f127006b);
    }

    public final int hashCode() {
        return this.f127006b.hashCode() + (this.f127005a.hashCode() * 31);
    }

    public final String toString() {
        return v.e0.g("ExercisePose(exerciseName=", this.f127005a, ", exerciseDuration=", this.f127006b, ")");
    }
}
