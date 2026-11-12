package sc2;

import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\rB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lsc2/b;", "", "", "garminGUID", "fullName", "", "profileId", "displayNameId", "profileImageUrlMedium", "", "roles", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "a", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f158481g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f158482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f158483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f158484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f158485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f158486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set<String> f158487f;

    public b(String str, String str2, long j8, String str3, String str4, Set<String> set) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        set.getClass();
        this.f158482a = str;
        this.f158483b = str2;
        this.f158484c = j8;
        this.f158485d = str3;
        this.f158486e = str4;
        this.f158487f = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f158482a.equals(bVar.f158482a) && this.f158483b.equals(bVar.f158483b) && this.f158484c == bVar.f158484c && this.f158485d.equals(bVar.f158485d) && s.g(this.f158486e, bVar.f158486e) && this.f158487f.equals(bVar.f158487f);
    }

    public final int hashCode() {
        int iJ = wr.g.j(q6.f.e(wr.g.j(this.f158482a.hashCode() * 31, 31, this.f158483b), 31, this.f158484c), 31, this.f158485d);
        String str = this.f158486e;
        return this.f158487f.hashCode() + ((iJ + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("GCSocialProfileDTO(garminGUID='", this.f158482a, "', fullName='", this.f158483b, "', profileId=");
        p6.b.k(this.f158484c, ", displayNameId='", this.f158485d, sbI);
        sbI.append("', profileImageUrlMedium=");
        sbI.append(this.f158486e);
        sbI.append(", roles=");
        sbI.append(this.f158487f);
        sbI.append(")");
        return sbI.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsc2/b$a;", "", "<init>", "()V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
