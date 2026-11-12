package q92;

import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v20 q92.d[], still in use, count: 1, list:
  (r0v20 q92.d[]) from 0x0117: CONSTRUCTOR (r0v20 q92.d[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lq92/d;", "", "", "apiValue", "Lq92/x;", "consentTypeId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lq92/x;)V", "a", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {
    /* JADX INFO: Fake field, exist only in values array */
    UPLOAD("UPLOAD", x.DI_CONNECT_UPLOAD),
    /* JADX INFO: Fake field, exist only in values array */
    INSIGHTS("INSIGHTS", x.DI_CONNECT_INSIGHTS),
    /* JADX INFO: Fake field, exist only in values array */
    LIVETRACK("LIVETRACK", x.DI_CONNECT_LIVETRACK),
    /* JADX INFO: Fake field, exist only in values array */
    LIVETRACK_WAZE("LIVETRACK_WAZE", x.DI_CONNECT_LIVETRACK_WAZE),
    LIVETRACK_GROUP_RIDE("LIVETRACK_GROUP_RIDE", x.DI_CONNECT_LIVETRACK_GROUP_RIDE),
    POPULARITY_ROUTING("POPULARITY_ROUTING", x.DI_CONNECT_POPULARITY_ROUTING),
    /* JADX INFO: Fake field, exist only in values array */
    STRAVA("STRAVA", x.DI_CONNECT_STRAVA),
    /* JADX INFO: Fake field, exist only in values array */
    MYFITNESSPAL("MYFITNESSPAL", x.DI_CONNECT_MYFITNESSPAL),
    /* JADX INFO: Fake field, exist only in values array */
    THIRD_PARTY_ACTIVITY_EXPORT("THIRD_PARTY_ACTIVITY_EXPORT", x.DI_CONNECT_THIRD_PARTY_ACTIVITY_EXPORT),
    /* JADX INFO: Fake field, exist only in values array */
    EMAIL_NOTIFICATION("EMAIL_NOTIFICATION", x.DI_CONNECT_EMAIL_NOTIFICATION),
    /* JADX INFO: Fake field, exist only in values array */
    ADAPTIVE_TRAINING_PLAN("ADAPTIVE_TRAINING_PLAN", x.DI_CONNECT_ADAPTIVE_TRAINING_PLAN),
    /* JADX INFO: Fake field, exist only in values array */
    LIVETRACK_STRAVA_BEACON("LIVETRACK_STRAVA_BEACON", x.DI_CONNECT_LIVETRACK_STRAVA_BEACON),
    /* JADX INFO: Fake field, exist only in values array */
    CONNECT_PRIVACY("CONNECT-PRIVACY", x.DI_CONNECT_PRIVACY),
    /* JADX INFO: Fake field, exist only in values array */
    PRODUCT_IMPROVEMENT_DATA_USAGE("PRODUCT_IMPROVEMENT_DATA_USAGE", x.DI_CONNECT_PRODUCT_IMPROVEMENT_DATA_USAGE),
    /* JADX INFO: Fake field, exist only in values array */
    DIVE_PRIVACY("DIVE-PRIVACY", x.DI_CONNECT_DIVE_PRIVACY),
    /* JADX INFO: Fake field, exist only in values array */
    POPULARITY_DIVING("POPULARITY_DIVING", x.DI_CONNECT_POPULARITY_DIVING),
    /* JADX INFO: Fake field, exist only in values array */
    GOLF_PRIVACY("GOLF-PRIVACY", x.DI_CONNECT_GOLF_PRIVACY),
    /* JADX INFO: Fake field, exist only in values array */
    CONNECT_AI("CONNECT_AI", x.DI_CONNECT_AI),
    /* JADX INFO: Fake field, exist only in values array */
    CONNECT_AUTO_APPROVE_FOLLOWER("CONNECT_AUTO_APPROVE_FOLLOWER", x.DI_CONNECT_AUTO_APPROVE_FOLLOWER),
    /* JADX INFO: Fake field, exist only in values array */
    CIQ_PRIVACY("CIQ-PRIVACY", x.DI_CONNECT_CIQ_PRIVACY),
    /* JADX INFO: Fake field, exist only in values array */
    AUTO_ACTIVITY_DETECTION("AUTO_ACTIVITY_DETECTION", x.DI_CONNECT_AUTO_ACTIVITY_DETECTION);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f143617c = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ w13.c f143621g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f143623b;

    static {
        f143621g = new w13.c(new d[]{r1, r2, r3, r4, r5, r6, new d("STRAVA", x.DI_CONNECT_STRAVA), new d("MYFITNESSPAL", x.DI_CONNECT_MYFITNESSPAL), new d("THIRD_PARTY_ACTIVITY_EXPORT", x.DI_CONNECT_THIRD_PARTY_ACTIVITY_EXPORT), new d("EMAIL_NOTIFICATION", x.DI_CONNECT_EMAIL_NOTIFICATION), new d("ADAPTIVE_TRAINING_PLAN", x.DI_CONNECT_ADAPTIVE_TRAINING_PLAN), new d("LIVETRACK_STRAVA_BEACON", x.DI_CONNECT_LIVETRACK_STRAVA_BEACON), new d("CONNECT-PRIVACY", x.DI_CONNECT_PRIVACY), new d("PRODUCT_IMPROVEMENT_DATA_USAGE", x.DI_CONNECT_PRODUCT_IMPROVEMENT_DATA_USAGE), new d("DIVE-PRIVACY", x.DI_CONNECT_DIVE_PRIVACY), new d("POPULARITY_DIVING", x.DI_CONNECT_POPULARITY_DIVING), new d("GOLF-PRIVACY", x.DI_CONNECT_GOLF_PRIVACY), new d("CONNECT_AI", x.DI_CONNECT_AI), new d("CONNECT_AUTO_APPROVE_FOLLOWER", x.DI_CONNECT_AUTO_APPROVE_FOLLOWER), new d("CIQ-PRIVACY", x.DI_CONNECT_CIQ_PRIVACY), new d("AUTO_ACTIVITY_DETECTION", x.DI_CONNECT_AUTO_ACTIVITY_DETECTION)});
    }

    private d(String str, x xVar) {
        super(str, i);
        this.f143622a = str;
        this.f143623b = xVar;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f143620f.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq92/d$a;", "", "<init>", "()V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
