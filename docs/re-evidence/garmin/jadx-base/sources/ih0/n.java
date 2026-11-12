package ih0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
public interface n {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lih0/n$a;", "Lih0/n;", "<init>", "()V", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f93464a = new a();

        private a() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1155846590;
        }

        public final String toString() {
            return "FitnessAgeEqualsAchievable";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lih0/n$b;", "Lih0/n;", "", "showTemporaryMessage", "", "fitnessAgeImprovement", "<init>", "(ZD)V", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f93465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f93466b;

        public b(boolean z14, double d14) {
            this.f93465a = z14;
            this.f93466b = d14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f93465a == bVar.f93465a && Double.compare(this.f93466b, bVar.f93466b) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f93466b) + (Boolean.hashCode(this.f93465a) * 31);
        }

        public final String toString() {
            return "FitnessAgeHigherThanAchievable(showTemporaryMessage=" + this.f93465a + ", fitnessAgeImprovement=" + this.f93466b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lih0/n$c;", "Lih0/n;", "<init>", "()V", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f93467a = new c();

        private c() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1378485377;
        }

        public final String toString() {
            return "FitnessAgeLowerThanAchievable";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lih0/n$d;", "Lih0/n;", "Ldh0/f;", "reason", "<init>", "(Ldh0/f;)V", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dh0.f f93468a;

        public d(dh0.f fVar) {
            fVar.getClass();
            this.f93468a = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f93468a.equals(((d) obj).f93468a);
        }

        public final int hashCode() {
            return this.f93468a.hashCode();
        }

        public final String toString() {
            return "InvalidReason(reason=" + this.f93468a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lih0/n$e;", "Lih0/n;", "<init>", "()V", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f93469a = new e();

        private e() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 718944199;
        }

        public final String toString() {
            return "NeedMoreInformation";
        }
    }
}
