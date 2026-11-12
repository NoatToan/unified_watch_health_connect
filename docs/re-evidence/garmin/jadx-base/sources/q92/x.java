package q92;

import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v21 q92.x[], still in use, count: 1, list:
  (r0v21 q92.x[]) from 0x012b: CONSTRUCTOR (r0v21 q92.x[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lq92/x;", "", "", "apiValue", "cacheKey", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "a", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x {
    DI_CONNECT_UPLOAD("DI_CONNECT_UPLOAD", "DI_CONNECT_UPLOAD"),
    DI_CONNECT_INSIGHTS("DI_CONNECT_INSIGHTS", "DI_CONNECT_INSIGHTS"),
    DI_CONNECT_LIVETRACK("DI_CONNECT_LIVETRACK", "DI_CONNECT_LIVETRACK"),
    DI_CONNECT_LIVETRACK_GROUP_RIDE("DI_CONNECT_LIVETRACK_GROUP_RIDE", "DI_CONNECT_LIVETRACK_GROUP_RIDE"),
    DI_CONNECT_POPULARITY_ROUTING("DI_CONNECT_POPULARITY_ROUTING", "DI_CONNECT_POPULARITY_ROUTING"),
    DI_CONNECT_STRAVA("DI_CONNECT_STRAVA", "DI_CONNECT_STRAVA"),
    DI_CONNECT_MYFITNESSPAL("DI_CONNECT_MYFITNESSPAL", "DI_CONNECT_MYFITNESSPAL"),
    DI_CONNECT_THIRD_PARTY_ACTIVITY_EXPORT("DI_CONNECT_THIRD_PARTY_ACTIVITY_EXPORT", "DI_CONNECT_THIRD_PARTY_ACTIVITY_EXPORT"),
    DI_CONNECT_EMAIL_NOTIFICATION("DI_CONNECT_EMAIL_NOTIFICATION", "DI_CONNECT_EMAIL_NOTIFICATION"),
    DI_CONNECT_ADAPTIVE_TRAINING_PLAN("DI_CONNECT_ADAPTIVE_TRAINING_PLAN", "DI_CONNECT_ADAPTIVE_TRAINING_PLAN"),
    DI_CONNECT_LIVETRACK_STRAVA_BEACON("DI_CONNECT_LIVETRACK_STRAVA_BEACON", "DI_CONNECT_LIVETRACK_STRAVA_BEACON"),
    DI_CONNECT_THIRDPARTY("DI_CONNECT_THIRDPARTY", "DI_CONNECT_THIRDPARTY"),
    DI_CONNECT_PRIVACY("DI_CONNECT_CONNECT-PRIVACY", "DI_CONNECT_CONNECT-PRIVACY"),
    DI_CONNECT_PRODUCT_IMPROVEMENT_DATA_USAGE("DI_CONNECT_PRODUCT_IMPROVEMENT_DATA_USAGE", "DI_CONNECT_PRODUCT_IMPROVEMENT_DATA_USAGE"),
    /* JADX INFO: Fake field, exist only in values array */
    DI_CONNECT_AUTHORIZED_VIEWER_AGREEMENT("DI_CONNECT_AUTHORIZED_VIEWER_AGREEMENT", "DI_CONNECT_AUTHORIZED_VIEWER_AGREEMENT"),
    DI_CONNECT_DIVE_PRIVACY("DI_CONNECT_DIVE-PRIVACY", "DI_CONNECT_DIVE-PRIVACY"),
    DI_CONNECT_POPULARITY_DIVING("DI_CONNECT_POPULARITY_DIVING", "DI_CONNECT_POPULARITY_DIVING"),
    DI_CONNECT_GOLF_PRIVACY("DI_CONNECT_GOLF-PRIVACY", "DI_CONNECT_GOLF-PRIVACY"),
    DI_CONNECT_AI("DI_CONNECT_AI", "DI_CONNECT_AI"),
    DI_CONNECT_AUTO_APPROVE_FOLLOWER("DI_CONNECT_AUTO_APPROVE_FOLLOWER", "DI_CONNECT_AUTO_APPROVE_FOLLOWER"),
    DI_CONNECT_CIQ_PRIVACY("DI_CONNECT_CIQ-PRIVACY", "DI_CONNECT_CIQ-PRIVACY"),
    DI_CONNECT_AUTO_ACTIVITY_DETECTION("DI_CONNECT_AUTO_ACTIVITY_DETECTION", "DI_CONNECT_AUTO_ACTIVITY_DETECTION"),
    DI_CONNECT_LIVETRACK_WAZE("DI_CONNECT_LIVETRACK_WAZE", "DI_CONNECT_LIVETRACK_WAZE");

    public static final /* synthetic */ w13.c C;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f143797c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143820b;

    static {
        C = new w13.c(new x[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r0, r1, r2, r0, r1, r0, r1, r2});
    }

    private x(String str, String str2) {
        super(str, i);
        this.f143819a = str;
        this.f143820b = str2;
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) B.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq92/x$a;", "", "<init>", "()V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
