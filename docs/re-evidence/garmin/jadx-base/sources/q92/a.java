package q92;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lq92/a;", "", "", "apiValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum a {
    NOT_APPLICABLE("NOT_APPLICABLE"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_REQUIRED("NOT_REQUIRED"),
    NOT_CONFIRMED("NOT_CONFIRMED"),
    PASSWORD_CHECK_FAILED("PASSWORD_CHECK_FAILED"),
    LOCATION_CHANGED("LOCATION_CHANGED"),
    /* JADX INFO: Fake field, exist only in values array */
    CONFIRMED("CONFIRMED"),
    /* JADX INFO: Fake field, exist only in values array */
    IN_PROGRESS("IN_PROGRESS"),
    COMPLETED("COMPLETED");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2709a f143600b = new C2709a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143607a;

    a(String str) {
        this.f143607a = str;
    }

    /* JADX INFO: renamed from: q92.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq92/a$a;", "", "<init>", "()V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C2709a {
        public /* synthetic */ C2709a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static a a(String str) {
            for (a aVar : a.values()) {
                if (p005kotlin.jvm.internal.s.g(aVar.f143607a, str)) {
                    return aVar;
                }
            }
            return null;
        }

        private C2709a() {
        }
    }
}
