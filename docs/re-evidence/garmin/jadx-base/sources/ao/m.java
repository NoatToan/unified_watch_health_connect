package ao;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lao/m;", "", "Lam/g;", "mode", "", "startIndex", "pageSize", "Ljo/f;", "sort", "badgeId", "", "userDisplayName", "<init>", "(Lam/g;IILjo/f;ILjava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final am.g f11528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jo.f f11531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11532e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11533f;

    public /* synthetic */ m(am.g gVar, int i14, int i15, jo.f fVar, int i16, String str, int i17, p005kotlin.jvm.internal.j jVar) {
        this(gVar, i14, (i17 & 4) != 0 ? 20 : i15, (i17 & 8) != 0 ? new jo.f(null, null, 3, null) : fVar, (i17 & 16) != 0 ? -1 : i16, (i17 & 32) != 0 ? null : str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f11528a == mVar.f11528a && this.f11529b == mVar.f11529b && this.f11530c == mVar.f11530c && s.g(this.f11531d, mVar.f11531d) && this.f11532e == mVar.f11532e && s.g(this.f11533f, mVar.f11533f);
    }

    public final int hashCode() {
        int iD = q2.d(this.f11532e, (this.f11531d.hashCode() + q2.d(this.f11530c, q2.d(this.f11529b, this.f11528a.hashCode() * 31, 31), 31)) * 31, 31);
        String str = this.f11533f;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ActivityPageQuery(mode=" + this.f11528a + ", startIndex=" + this.f11529b + ", pageSize=" + this.f11530c + ", sort=" + this.f11531d + ", badgeId=" + this.f11532e + ", userDisplayName=" + this.f11533f + ")";
    }

    public m(am.g gVar, int i14, int i15, jo.f fVar, int i16, String str) {
        gVar.getClass();
        fVar.getClass();
        this.f11528a = gVar;
        this.f11529b = i14;
        this.f11530c = i15;
        this.f11531d = fVar;
        this.f11532e = i16;
        this.f11533f = str;
    }
}
