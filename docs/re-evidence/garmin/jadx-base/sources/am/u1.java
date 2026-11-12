package am;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lam/u1;", "", "", "scale", "value", "valueKey", "", "sortOrder", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4233d;

    public u1(String str, String str2, String str3, int i14) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f4230a = str;
        this.f4231b = str2;
        this.f4232c = str3;
        this.f4233d = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return this.f4230a.equals(u1Var.f4230a) && this.f4231b.equals(u1Var.f4231b) && this.f4232c.equals(u1Var.f4232c) && this.f4233d == u1Var.f4233d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4233d) + wr.g.j(wr.g.j(this.f4230a.hashCode() * 31, 31, this.f4231b), 31, this.f4232c);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("ClimbDifficulty(scale=", this.f4230a, ", value=", this.f4231b, ", valueKey=");
        sbI.append(this.f4232c);
        sbI.append(", sortOrder=");
        sbI.append(this.f4233d);
        sbI.append(")");
        return sbI.toString();
    }
}
