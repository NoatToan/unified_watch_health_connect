package km1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkm1/i;", "", "", "timeMessageResId", "", "invalidStartTime", "invalidEndTime", "", "dialogMessage", "invalidMinDuration", "invalidMaxDuration", "<init>", "(IZZLjava/lang/String;ZZ)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f105525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f105526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f105527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f105528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f105529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f105530f;

    public /* synthetic */ i(int i14, boolean z14, boolean z15, String str, boolean z16, boolean z17, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 0 : i14, (i15 & 2) != 0 ? false : z14, (i15 & 4) != 0 ? false : z15, (i15 & 8) != 0 ? "" : str, (i15 & 16) != 0 ? false : z16, (i15 & 32) != 0 ? false : z17);
    }

    public static i a(i iVar, int i14, String str, int i15) {
        if ((i15 & 1) != 0) {
            i14 = iVar.f105525a;
        }
        int i16 = i14;
        boolean z14 = (i15 & 2) != 0 ? iVar.f105526b : true;
        boolean z15 = (i15 & 4) != 0 ? iVar.f105527c : true;
        if ((i15 & 8) != 0) {
            str = iVar.f105528d;
        }
        String str2 = str;
        boolean z16 = (i15 & 16) != 0 ? iVar.f105529e : true;
        boolean z17 = (i15 & 32) != 0 ? iVar.f105530f : true;
        str2.getClass();
        return new i(i16, z14, z15, str2, z16, z17);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f105525a == iVar.f105525a && this.f105526b == iVar.f105526b && this.f105527c == iVar.f105527c && p005kotlin.jvm.internal.s.g(this.f105528d, iVar.f105528d) && this.f105529e == iVar.f105529e && this.f105530f == iVar.f105530f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f105530f) + q6.f.g(wr.g.j(q6.f.g(q6.f.g(Integer.hashCode(this.f105525a) * 31, 31, this.f105526b), 31, this.f105527c), 31, this.f105528d), 31, this.f105529e);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NapErrors(timeMessageResId=");
        sb3.append(this.f105525a);
        sb3.append(", invalidStartTime=");
        sb3.append(this.f105526b);
        sb3.append(", invalidEndTime=");
        fb1.c.w(", dialogMessage=", this.f105528d, ", invalidMinDuration=", sb3, this.f105527c);
        return com.airbnb.lottie.animation.keyframe.a.f(", invalidMaxDuration=", ")", sb3, this.f105529e, this.f105530f);
    }

    public i(int i14, boolean z14, boolean z15, String str, boolean z16, boolean z17) {
        str.getClass();
        this.f105525a = i14;
        this.f105526b = z14;
        this.f105527c = z15;
        this.f105528d = str;
        this.f105529e = z16;
        this.f105530f = z17;
    }

    public i() {
        this(0, false, false, null, false, false, 63, null);
    }
}
