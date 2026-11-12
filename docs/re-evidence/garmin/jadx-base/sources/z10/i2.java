package z10;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lz10/i2;", "", "", "isLoading", "isError", "", "errorCount", "Ls92/g;", "noticeTerms", "<init>", "(ZZILs92/g;)V", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f201043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f201044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f201045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s92.g f201046d;

    public /* synthetic */ i2(boolean z14, boolean z15, int i14, s92.g gVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? false : z14, (i15 & 2) != 0 ? false : z15, (i15 & 4) != 0 ? 0 : i14, (i15 & 8) != 0 ? null : gVar);
    }

    public static i2 a(i2 i2Var, boolean z14, s92.g gVar, int i14) {
        boolean z15 = (i14 & 2) != 0 ? i2Var.f201044b : false;
        int i15 = i2Var.f201045c;
        if ((i14 & 8) != 0) {
            gVar = i2Var.f201046d;
        }
        i2Var.getClass();
        return new i2(z14, z15, i15, gVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        return this.f201043a == i2Var.f201043a && this.f201044b == i2Var.f201044b && this.f201045c == i2Var.f201045c && p005kotlin.jvm.internal.s.g(this.f201046d, i2Var.f201046d);
    }

    public final int hashCode() {
        int iD = r1.q2.d(this.f201045c, q6.f.g(Boolean.hashCode(this.f201043a) * 31, 31, this.f201044b), 31);
        s92.g gVar = this.f201046d;
        return iD + (gVar == null ? 0 : gVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("LivetrackNoticeUiState(isLoading=", ", isError=", ", errorCount=", this.f201043a, this.f201044b);
        sbM.append(this.f201045c);
        sbM.append(", noticeTerms=");
        sbM.append(this.f201046d);
        sbM.append(")");
        return sbM.toString();
    }

    public i2(boolean z14, boolean z15, int i14, s92.g gVar) {
        this.f201043a = z14;
        this.f201044b = z15;
        this.f201045c = i14;
        this.f201046d = gVar;
    }

    public i2() {
        this(false, false, 0, null, 15, null);
    }
}
