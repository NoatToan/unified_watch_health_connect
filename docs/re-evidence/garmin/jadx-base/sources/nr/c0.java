package nr;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnr/c0;", "", "", "exerciseName", "exerciseDuration", "repCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f127001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f127002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f127003c;

    public c0(String str, String str2, String str3) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f127001a = str;
        this.f127002b = str2;
        this.f127003c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f127001a.equals(c0Var.f127001a) && this.f127002b.equals(c0Var.f127002b) && this.f127003c.equals(c0Var.f127003c);
    }

    public final int hashCode() {
        return this.f127003c.hashCode() + wr.g.j(this.f127001a.hashCode() * 31, 31, this.f127002b);
    }

    public final String toString() {
        return am.j.o(this.f127003c, ")", p6.b.i("ExerciseMove(exerciseName=", this.f127001a, ", exerciseDuration=", this.f127002b, ", repCount="));
    }
}
