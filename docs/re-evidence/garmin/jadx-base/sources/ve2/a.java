package ve2;

import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\fB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lve2/a;", "", "", "userProfileID", "", "userDisplayNameID", "", "userHasMBTesterRole", "", "userRoles", "<init>", "(JLjava/lang/String;ZLjava/util/Set;)V", "a", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C3321a f177676e = new C3321a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f177677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f177678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f177679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<String> f177680d;

    public a(long j8, String str, boolean z14, Set<String> set) {
        str.getClass();
        set.getClass();
        this.f177677a = j8;
        this.f177678b = str;
        this.f177679c = z14;
        this.f177680d = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f177677a == aVar.f177677a && p005kotlin.jvm.internal.s.g(this.f177678b, aVar.f177678b) && this.f177679c == aVar.f177679c && p005kotlin.jvm.internal.s.g(this.f177680d, aVar.f177680d);
    }

    public final int hashCode() {
        return this.f177680d.hashCode() + q6.f.g(wr.g.j(Long.hashCode(this.f177677a) * 31, 31, this.f177678b), 31, this.f177679c);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f177677a, "ConnectData(userProfileID=", ", userDisplayNameID=", this.f177678b);
        sbK.append(", userHasMBTesterRole=");
        sbK.append(this.f177679c);
        sbK.append(", userRoles=");
        sbK.append(this.f177680d);
        sbK.append(")");
        return sbK.toString();
    }

    /* JADX INFO: renamed from: ve2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lve2/a$a;", "", "<init>", "()V", "a", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C3321a {

        /* JADX INFO: renamed from: ve2.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lve2/a$a$a;", "", "", "keyName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum EnumC3322a {
            ROOT("connectData"),
            USER_PROFILE_ID("userProfileID"),
            USER_DISPLAY_NAME_ID("userDisplayNameID"),
            USER_HAS_MB_TESTER_ROLE("userHasMBTesterRole"),
            USER_ROLES("userRoles");


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f177687a;

            EnumC3322a(String str) {
                this.f177687a = str;
            }
        }

        public /* synthetic */ C3321a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3321a() {
        }
    }

    public /* synthetic */ a(long j8, String str, boolean z14, Set set, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, str, (i14 & 4) != 0 ? false : z14, set);
    }
}
