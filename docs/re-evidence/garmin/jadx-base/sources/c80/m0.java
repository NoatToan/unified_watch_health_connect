package c80;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'm' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lc80/m0;", "", "", Action.KEY_ATTRIBUTE, "", "isViewDependant", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "a", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m0 {
    public static final m0 A;
    public static final m0 B;
    public static final /* synthetic */ m0[] C;
    public static final /* synthetic */ w13.c D;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f25439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m0 f25440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m0 f25441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m0 f25442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m0 f25443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m0 f25444h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final m0 f25445i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final m0 f25446j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final m0 f25447k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final m0 f25448l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final m0 f25449m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final m0 f25450n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final m0 f25451o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final m0 f25452p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final m0 f25453q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final m0 f25454r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final m0 f25455t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final m0 f25456v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final m0 f25457w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final m0 f25458x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final m0 f25459y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final m0 f25460z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25462b;

    static {
        m0 m0Var = new m0("HAS_GCPLUS_SUBSCRIPTION", 0, "hasGCPlusSubscription", false, 2, null);
        f25440d = m0Var;
        m0 m0Var2 = new m0("HAS_PAIRED_DEVICE", 1, "hasPairedDevice", false, 2, null);
        f25441e = m0Var2;
        m0 m0Var3 = new m0("ACTIVITY_TYPES", 2, "activityTypes", true);
        f25442f = m0Var3;
        m0 m0Var4 = new m0("EXCLUDED_ACTIVITY_TYPES", 3, "excludedActivityTypes", true);
        f25443g = m0Var4;
        m0 m0Var5 = new m0("HAS_USAGE_INDICATORS", 4, "usageIndicators", false, 2, null);
        f25444h = m0Var5;
        m0 m0Var6 = new m0("IS_MANUAL_ACTIVITY", 5, "isManualActivity", true);
        f25445i = m0Var6;
        m0 m0Var7 = new m0("IS_OWNED_ACTIVITY", 6, "isOwnedActivity", true);
        f25446j = m0Var7;
        m0 m0Var8 = new m0("LOCATION_DISMISSED_TODAY", 7, "locationDismissedToday", true);
        f25447k = m0Var8;
        m0 m0Var9 = new m0("GARMIN_COACH_PLAN_SUB_TYPES", 8, "garminCoachPlanSubTypes", true);
        f25448l = m0Var9;
        p005kotlin.jvm.internal.j jVar = null;
        m0 m0Var10 = new m0("HAS_RECENT_3D_CAPABLE_ACTIVITY", 9, "hasRecent3DCapableActivity", false, 2, jVar);
        f25449m = m0Var10;
        m0 m0Var11 = new m0("HAS_SETUP_NUTRITION", 10, "hasSetupNutrition", false, 2, null);
        f25450n = m0Var11;
        m0 m0Var12 = new m0("IS_NUTRITION_SETUP", 11, "isNutritionSetup", false, 2, null);
        f25451o = m0Var12;
        m0 m0Var13 = new m0("IS_NUTRITION_IN_TAB_BAR", 12, "isNutritionInTabBar", false, 2, jVar);
        f25452p = m0Var13;
        m0 m0Var14 = new m0("IS_INTEGRATED_WITH_MFP", 13, "isIntegratedWithMFP", false, 2, null);
        f25453q = m0Var14;
        m0 m0Var15 = new m0("LOGGED_TO_MFP_IN_LAST_90_DAYS", 14, "loggedToMFPInLast90Days", false, 2, null);
        f25454r = m0Var15;
        m0 m0Var16 = new m0("HAS_VIEWED_HEALTH_STATUS", 15, "hasViewedHealthStatus", false, 2, null);
        f25455t = m0Var16;
        m0 m0Var17 = new m0("HAS_RECENT_INDEX_SCALE_1_WEIGH_IN", 16, "hasRecentIndexScale1WeighIn", false, 2, null);
        f25456v = m0Var17;
        m0 m0Var18 = new m0("AUTO_DISMISS_PARAMS", 17, "autoDismissParams", false, 2, null);
        f25457w = m0Var18;
        m0 m0Var19 = new m0("AUTO_DISMISS", 18, "autoDismiss", false, 2, null);
        f25458x = m0Var19;
        m0 m0Var20 = new m0("HAS_FOLLOWINGS", 19, "hasFollowings", false, 2, null);
        f25459y = m0Var20;
        m0 m0Var21 = new m0("MIN_LIVE_ACTIVITY_VERSION", 20, "minLiveActivityVersion", false, 2, null);
        f25460z = m0Var21;
        m0 m0Var22 = new m0("ALL_COACH_PLANS_REQUIRE_GC_PLUS", 21, "allCoachPlansRequireGCPlus", true);
        A = m0Var22;
        m0 m0Var23 = new m0("IS_PRIMARY_WEARABLE_SCREENLESS", 22, "isPrimaryWearableScreenless", false, 2, null);
        B = m0Var23;
        m0[] m0VarArr = {m0Var, m0Var2, m0Var3, m0Var4, m0Var5, m0Var6, m0Var7, m0Var8, m0Var9, m0Var10, m0Var11, m0Var12, m0Var13, m0Var14, m0Var15, m0Var16, m0Var17, m0Var18, m0Var19, m0Var20, m0Var21, m0Var22, m0Var23};
        C = m0VarArr;
        D = new w13.c(m0VarArr);
        f25439c = new a(null);
    }

    public /* synthetic */ m0(String str, int i14, String str2, boolean z14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(str, i14, str2, (i15 & 2) != 0 ? false : z14);
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) C.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc80/m0$a;", "", "<init>", "()V", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static m0 a(String str) {
            Object next;
            w13.c cVar = m0.D;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                if (p005kotlin.jvm.internal.s.g(((m0) next).f25461a, str)) {
                    return (m0) next;
                }
            }
            next = null;
            return (m0) next;
        }

        private a() {
        }
    }

    private m0(String str, int i14, String str2, boolean z14) {
        super(str, i14);
        this.f25461a = str2;
        this.f25462b = z14;
    }
}
