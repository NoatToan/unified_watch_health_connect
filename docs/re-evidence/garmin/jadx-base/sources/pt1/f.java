package pt1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lpt1/f;", "", "", "contentId", "Lus1/b;", "reason", "", "note", "", "shouldAddLocale", "<init>", "(JLus1/b;Ljava/lang/String;Z)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f140841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final us1.b f140842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f140843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f140844d;

    public /* synthetic */ f(long j8, us1.b bVar, String str, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, bVar, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? false : z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f140841a == fVar.f140841a && this.f140842b == fVar.f140842b && p005kotlin.jvm.internal.s.g(this.f140843c, fVar.f140843c) && this.f140844d == fVar.f140844d;
    }

    public final int hashCode() {
        int iHashCode = (this.f140842b.hashCode() + (Long.hashCode(this.f140841a) * 31)) * 31;
        String str = this.f140843c;
        return Boolean.hashCode(this.f140844d) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ReportContentState(contentId=");
        sb3.append(this.f140841a);
        sb3.append(", reason=");
        sb3.append(this.f140842b);
        com.airbnb.lottie.animation.keyframe.a.t(", note=", this.f140843c, ", shouldAddLocale=", sb3, this.f140844d);
        sb3.append(")");
        return sb3.toString();
    }

    public f(long j8, us1.b bVar, String str, boolean z14) {
        bVar.getClass();
        this.f140841a = j8;
        this.f140842b = bVar;
        this.f140843c = str;
        this.f140844d = z14;
    }
}
