package c80;

import ch.qos.logback.core.joran.action.Action;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\t\nB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lc80/d0;", "Lc80/w0;", "Lc80/d0$b;", "targetDestination", "", "", "params", "<init>", "(Lc80/d0$b;Ljava/util/Map;)V", "b", "a", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d0 implements w0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f25323d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f25324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, String> f25325c;

    public d0(b bVar, Map<String, String> map) {
        bVar.getClass();
        map.getClass();
        this.f25324b = bVar;
        this.f25325c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f25324b == d0Var.f25324b && this.f25325c.equals(d0Var.f25325c);
    }

    public final int hashCode() {
        return this.f25325c.hashCode() + (this.f25324b.hashCode() * 31);
    }

    public final String toString() {
        return "PromoAppTarget(targetDestination=" + this.f25324b + ", params=" + this.f25325c + ")";
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v18 c80.d0$b[], still in use, count: 1, list:
      (r0v18 c80.d0$b[]) from 0x0100: CONSTRUCTOR (r0v18 c80.d0$b[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lc80/d0$b;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        GC_PLUS_PAYWALL("paywall"),
        GC_PLUS_EDUCATION("gcplus"),
        FEEDBACK("feedback"),
        ANNUAL_REPORT("annualReport"),
        LATEST_3D_ACTIVITY("latest3DActivity"),
        NUTRITION("nutrition"),
        EDIT_BOTTOM_BAR("editTabs"),
        INDEX_S1_TO_S2("indexS1ToS2"),
        NEWSFEED_DEVICE_IMAGE_SETTING("newsfeedDeviceImageSetting"),
        NATURAL_CYCLES("naturalCycles"),
        PERFORMANCE_DASHBOARD("performanceDashboard"),
        EXCLUSIVE_OFFERS_LIST("exclusiveOffersList"),
        TRY_ESSENTIALS("tryEssentials"),
        SAFETY_FEATURES("safetyFeatures"),
        CONNECT_IQ("connectIQ"),
        COURSES("courses"),
        GROUP_RIDE_AWARDS("groupRideAwards"),
        ALL_DOGS("allDogs");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f25326b = new a(null);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final /* synthetic */ w13.c f25346x;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f25347a;

        static {
            f25346x = new w13.c(new b[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r0, r1, r0});
        }

        private b(String str) {
            super(str, i);
            this.f25347a = str;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f25345w.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc80/d0$b$a;", "", "<init>", "()V", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lc80/d0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "KEY_PROMOTED_FEATURE", "KEY_SHOW_NUTRITION_SETUP", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
