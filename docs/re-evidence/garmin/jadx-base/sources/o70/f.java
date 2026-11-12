package o70;

import ch.qos.logback.core.joran.action.Action;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v14 o70.f[], still in use, count: 1, list:
  (r0v14 o70.f[]) from 0x01ca: CONSTRUCTOR (r0v14 o70.f[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lo70/f;", "", "", Action.KEY_ATTRIBUTE, "", "allowTurnOnOff", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {
    SERVER_MAINTENANCE("SERVER_MAINTENANCE", false),
    NO_INTERNET("NO_INTERNET", false),
    BLUETOOTH("BLUETOOTH", false),
    BATTERY_LOW("BATTERY_LOW", false),
    DEVICE_SETUP_FIRMWARE_UPDATE("DEVICE_SETUP_FIRMWARE_UPDATE", false),
    EMERGENCY_CONTACTS("EMERGENCY_CONTACTS", false),
    LIVE_TRACK_CONTACTS("LIVE_TRACK_CONTACTS", false),
    DEVICE_SYNC("DEVICE_SYNC", false),
    DEVICE_LINK("DEVICE_LINK", false),
    INCORRECT_PASSCODE("INCORRECT_PASSCODE", false),
    BROADCAST_HEART_RATE("BROADCAST_HEART_RATE", false),
    LIVE_TRACK_IN_PROGRESS("LIVE_TRACK_IN_PROGRESS", false),
    INREACH_SUBSCRIPTION("REMAINING_INREACH_SUBSCRIPTION", false),
    FINISH_INREACH_SETUP("FINISH_INREACH_SETUP", false),
    WELCOME_CARD("WELCOME_CARD", false),
    CAMPAIGN("CAMPAIGN", false),
    WHATS_NEW("WHATS_NEW", false),
    ONBOARDING("ONBOARDING", false),
    ESSENTIALS_STATS("ESSENTIALS_STATS", true),
    PERSONALIZED_INSIGHTS("CPPI", true),
    PENDING_ACTIVITY_BANNER("PENDING_ACTIVITY_BANNER", false),
    ACTIVITIES_AND_WORKOUTS("ACTIVITIES_WORKOUTS", false),
    KEY_STATS("PRIMARY_STATS", true),
    TEMPORARY_ITEMS("TEMPORARY_ITEMS", false),
    SECONDARY_STATS("SECONDARY_STATS", true),
    EVENTS("EVENTS", true),
    TRAINING("TRAINING_PLANS", true),
    CHALLENGES("CHALLENGES", true),
    YESTERDAY("YESTERDAY", true),
    LAST_SEVEN_DAYS("LAST_SEVEN_DAYS", true),
    SLEEP_COACH("SLEEP_COACH", true),
    EDIT_BUTTON("EDIT_BUTTON", false);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f129966c = new a(null);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ w13.c f129975k0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f129989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f129990b;

    static {
        f129975k0 = new w13.c(new f[]{r1, r0, r3, r5, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r0, r1, r0, r1, r2, r0, r1, r0, r2, r1, r3, r1, r2, r3, r1, r2, r0});
    }

    private f(String str, boolean z14) {
        super(str, i);
        this.f129989a = str;
        this.f129990b = z14;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) Z.clone();
    }

    public final String a() {
        return fb1.c.n("DashboardWidgetType_", this.f129989a);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo70/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static List a() {
            return h0.z0(b(), p13.x.k(f.YESTERDAY, f.LAST_SEVEN_DAYS));
        }

        public static ArrayList b() {
            w13.c cVar = f.f129975k0;
            ArrayList arrayListK = n23.j.k(cVar);
            p13.c.b bVar = new p13.c.b();
            while (bVar.hasNext()) {
                Object next = bVar.next();
                if (((f) next).f129990b) {
                    arrayListK.add(next);
                }
            }
            return arrayListK;
        }

        public static f c(String str) {
            Object next;
            w13.c cVar = f.f129975k0;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                if (p005kotlin.jvm.internal.s.g(((f) next).f129989a, str)) {
                    return (f) next;
                }
            }
            next = null;
            return (f) next;
        }

        public static List d(List list) {
            list.getClass();
            return h0.z0(list, p13.x.k(f.SLEEP_COACH, f.PERSONALIZED_INSIGHTS));
        }

        private a() {
        }
    }
}
