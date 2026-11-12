package tt0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Ltt0/a;", "", "<init>", "()V", "b", "a", "Ltt0/a$a;", "Ltt0/a$b;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: tt0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltt0/a$a;", "Ltt0/a;", "", "playerCount", "", "userRanking", "<init>", "(IJ)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C3128a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f166363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f166364b;

        public C3128a(int i14, long j8) {
            super(null);
            this.f166363a = i14;
            this.f166364b = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3128a)) {
                return false;
            }
            C3128a c3128a = (C3128a) obj;
            return this.f166363a == c3128a.f166363a && this.f166364b == c3128a.f166364b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f166364b) + (Integer.hashCode(this.f166363a) * 31);
        }

        public final String toString() {
            return "Joined(playerCount=" + this.f166363a + ", userRanking=" + this.f166364b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltt0/a$b;", "Ltt0/a;", "", "adHocChallengeInviteId", "<init>", "(Ljava/lang/String;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f166365a;

        public b(String str) {
            super(null);
            this.f166365a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && s.g(this.f166365a, ((b) obj).f166365a);
        }

        public final int hashCode() {
            String str = this.f166365a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return am.j.m("WaitingResponse(adHocChallengeInviteId=", this.f166365a, ")");
        }
    }

    public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private a() {
    }
}
