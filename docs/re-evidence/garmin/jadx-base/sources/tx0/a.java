package tx0;

import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.l0;
import ww0.h;
import ww0.p;
import ww0.r;
import ww0.s;
import ww0.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ltx0/a;", "", "", "Lww0/t;", "symptoms", "Lww0/p;", "moods", "Lww0/h;", "flow", "Lww0/e;", "discharge", "", "isOvulationDay", "Lww0/s;", "sexualActivity", "Lww0/r;", "sexDrive", "<init>", "(Ljava/util/Set;Ljava/util/Set;Lww0/h;Ljava/util/Set;ZLww0/s;Lww0/r;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<t> f166815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<p> f166816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f166817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<ww0.e> f166818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f166819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s f166820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f166821g;

    public a(Set set, Set set2, h hVar, Set set3, boolean z14, s sVar, r rVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? l0.f134950a : set, (i14 & 2) != 0 ? l0.f134950a : set2, (i14 & 4) != 0 ? null : hVar, (i14 & 8) != 0 ? l0.f134950a : set3, (i14 & 16) != 0 ? false : z14, (i14 & 32) != 0 ? null : sVar, (i14 & 64) != 0 ? null : rVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p005kotlin.jvm.internal.s.g(this.f166815a, aVar.f166815a) && p005kotlin.jvm.internal.s.g(this.f166816b, aVar.f166816b) && this.f166817c == aVar.f166817c && p005kotlin.jvm.internal.s.g(this.f166818d, aVar.f166818d) && this.f166819e == aVar.f166819e && this.f166820f == aVar.f166820f && this.f166821g == aVar.f166821g;
    }

    public final int hashCode() {
        int iHashCode = (this.f166816b.hashCode() + (this.f166815a.hashCode() * 31)) * 31;
        h hVar = this.f166817c;
        int iG = q6.f.g((this.f166818d.hashCode() + ((iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31)) * 31, 31, this.f166819e);
        s sVar = this.f166820f;
        int iHashCode2 = (iG + (sVar == null ? 0 : sVar.hashCode())) * 31;
        r rVar = this.f166821g;
        return iHashCode2 + (rVar != null ? rVar.hashCode() : 0);
    }

    public final String toString() {
        return "DailySymptomSelection(symptoms=" + this.f166815a + ", moods=" + this.f166816b + ", flow=" + this.f166817c + ", discharge=" + this.f166818d + ", isOvulationDay=" + this.f166819e + ", sexualActivity=" + this.f166820f + ", sexDrive=" + this.f166821g + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Set<? extends t> set, Set<? extends p> set2, h hVar, Set<? extends ww0.e> set3, boolean z14, s sVar, r rVar) {
        set.getClass();
        set2.getClass();
        set3.getClass();
        this.f166815a = set;
        this.f166816b = set2;
        this.f166817c = hVar;
        this.f166818d = set3;
        this.f166819e = z14;
        this.f166820f = sVar;
        this.f166821g = rVar;
    }

    public a() {
        this(null, null, null, null, false, null, null, 127, null);
    }
}
