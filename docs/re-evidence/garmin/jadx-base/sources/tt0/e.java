package tt0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Ltt0/e;", "", "<init>", "()V", "c", "b", "a", "Ltt0/e$a;", "Ltt0/e$b;", "Ltt0/e$c;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class e {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ltt0/e$a;", "Ltt0/e;", "", "uuid", "name", "startDate", "endDate", "", "activityTypeId", "Ltt0/a;", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ltt0/a;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f166371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f166372b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f166373c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f166374d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Integer f166375e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final tt0.a f166376f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, String str4, Integer num, tt0.a aVar) {
            super(null);
            aVar.getClass();
            this.f166371a = str;
            this.f166372b = str2;
            this.f166373c = str3;
            this.f166374d = str4;
            this.f166375e = num;
            this.f166376f = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f166371a, aVar.f166371a) && s.g(this.f166372b, aVar.f166372b) && s.g(this.f166373c, aVar.f166373c) && s.g(this.f166374d, aVar.f166374d) && s.g(this.f166375e, aVar.f166375e) && s.g(this.f166376f, aVar.f166376f);
        }

        public final int hashCode() {
            String str = this.f166371a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f166372b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f166373c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f166374d;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num = this.f166375e;
            return this.f166376f.hashCode() + ((iHashCode4 + (num != null ? num.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("AdHocChallenge(uuid=", this.f166371a, ", name=", this.f166372b, ", startDate=");
            sn.a.t(sbI, this.f166373c, ", endDate=", this.f166374d, ", activityTypeId=");
            sbI.append(this.f166375e);
            sbI.append(", status=");
            sbI.append(this.f166376f);
            sbI.append(")");
            return sbI.toString();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ltt0/e$b;", "Ltt0/e;", "", "uuid", "name", "", "unitId", "", "progressValue", "targetValue", "progressPercentage", "startDate", "endDate", "", "showProgressChart", "challengeCategoryId", "showInflatedPointIndicator", "<init>", "(Ljava/lang/String;Ljava/lang/String;IDDILjava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Z)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f166377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f166378b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f166379c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final double f166380d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final double f166381e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f166382f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f166383g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f166384h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f166385i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Integer f166386j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f166387k;

        public b(String str, String str2, int i14, double d14, double d15, int i15, String str3, String str4, boolean z14, Integer num, boolean z15) {
            super(null);
            this.f166377a = str;
            this.f166378b = str2;
            this.f166379c = i14;
            this.f166380d = d14;
            this.f166381e = d15;
            this.f166382f = i15;
            this.f166383g = str3;
            this.f166384h = str4;
            this.f166385i = z14;
            this.f166386j = num;
            this.f166387k = z15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.g(this.f166377a, bVar.f166377a) && s.g(this.f166378b, bVar.f166378b) && this.f166379c == bVar.f166379c && Double.compare(this.f166380d, bVar.f166380d) == 0 && Double.compare(this.f166381e, bVar.f166381e) == 0 && this.f166382f == bVar.f166382f && s.g(this.f166383g, bVar.f166383g) && s.g(this.f166384h, bVar.f166384h) && this.f166385i == bVar.f166385i && s.g(this.f166386j, bVar.f166386j) && this.f166387k == bVar.f166387k;
        }

        public final int hashCode() {
            String str = this.f166377a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f166378b;
            int iD = q2.d(this.f166382f, org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(q2.d(this.f166379c, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.f166380d), 31, this.f166381e), 31);
            String str3 = this.f166383g;
            int iHashCode2 = (iD + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f166384h;
            int iG = q6.f.g((iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f166385i);
            Integer num = this.f166386j;
            return Boolean.hashCode(this.f166387k) + ((iG + (num != null ? num.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("BadgeChallenge(uuid=", this.f166377a, ", name=", this.f166378b, ", unitId=");
            sbI.append(this.f166379c);
            sbI.append(", progressValue=");
            sbI.append(this.f166380d);
            am.j.x(sbI, ", targetValue=", this.f166381e, ", progressPercentage=");
            wr.g.t(this.f166382f, ", startDate=", this.f166383g, ", endDate=", sbI);
            v.h.C(this.f166384h, ", showProgressChart=", ", challengeCategoryId=", sbI, this.f166385i);
            sbI.append(this.f166386j);
            sbI.append(", showInflatedPointIndicator=");
            sbI.append(this.f166387k);
            sbI.append(")");
            return sbI.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ltt0/e$c;", "Ltt0/e;", "", "uuid", "", "unitId", "name", "", "progressValue", "targetValue", "progressPercentage", "startDate", "endDate", "<init>", "(Ljava/lang/String;ILjava/lang/String;DDILjava/lang/String;Ljava/lang/String;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f166388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f166389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f166390c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final double f166391d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final double f166392e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f166393f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f166394g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f166395h;

        public c(String str, int i14, String str2, double d14, double d15, int i15, String str3, String str4) {
            super(null);
            this.f166388a = str;
            this.f166389b = i14;
            this.f166390c = str2;
            this.f166391d = d14;
            this.f166392e = d15;
            this.f166393f = i15;
            this.f166394g = str3;
            this.f166395h = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return s.g(this.f166388a, cVar.f166388a) && this.f166389b == cVar.f166389b && s.g(this.f166390c, cVar.f166390c) && Double.compare(this.f166391d, cVar.f166391d) == 0 && Double.compare(this.f166392e, cVar.f166392e) == 0 && this.f166393f == cVar.f166393f && s.g(this.f166394g, cVar.f166394g) && s.g(this.f166395h, cVar.f166395h);
        }

        public final int hashCode() {
            String str = this.f166388a;
            int iD = q2.d(this.f166389b, (str == null ? 0 : str.hashCode()) * 31, 31);
            String str2 = this.f166390c;
            int iD2 = q2.d(this.f166393f, org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b((iD + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f166391d), 31, this.f166392e), 31);
            String str3 = this.f166394g;
            int iHashCode = (iD2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f166395h;
            return iHashCode + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbK = androidx.core.view.j.k(this.f166389b, "ExpeditionChallenge(uuid=", this.f166388a, ", unitId=", ", name=");
            sbK.append(this.f166390c);
            sbK.append(", progressValue=");
            sbK.append(this.f166391d);
            am.j.x(sbK, ", targetValue=", this.f166392e, ", progressPercentage=");
            wr.g.t(this.f166393f, ", startDate=", this.f166394g, ", endDate=", sbK);
            return am.j.o(this.f166395h, ")", sbK);
        }
    }

    public /* synthetic */ e(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private e() {
    }
}
