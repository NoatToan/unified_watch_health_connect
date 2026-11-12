package c80;

import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 c80.q[], still in use, count: 1, list:
  (r0v1 c80.q[]) from 0x00a9: CONSTRUCTOR (r0v1 c80.q[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lc80/q;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q {
    MESSAGING_PLUS("Messaging"),
    LIVE_ACTIVITY("LiveSessionView"),
    LIVE_TRACK_PLUS("LiveTrack"),
    LIVE_TRACK_SMS("LiveTrackSms"),
    GARMIN_TRAILS("Trails"),
    SOCIAL("SocialImprovements"),
    PROFILE_IMAGE_FRAME("ProfileImageFrame"),
    ANNUAL_REPORT("AnnualReport"),
    ADVANCED_REPORTING("AdvancedReporting"),
    TRAINING_MEDIA("TrainingMedia"),
    MAPS_3D("GCMaps3D"),
    NUTRITION("Nutrition"),
    EXCLUSIVE_OFFERS("ExclusiveOffers");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f25532b = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ w13.c f25547q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25548a;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25549a;

        static {
            int[] iArr = new int[q.values().length];
            try {
                iArr[q.MESSAGING_PLUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q.LIVE_ACTIVITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q.LIVE_TRACK_PLUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q.LIVE_TRACK_SMS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[q.GARMIN_TRAILS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[q.SOCIAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[q.PROFILE_IMAGE_FRAME.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[q.ANNUAL_REPORT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[q.ADVANCED_REPORTING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[q.TRAINING_MEDIA.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[q.MAPS_3D.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[q.NUTRITION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[q.EXCLUSIVE_OFFERS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f25549a = iArr;
        }
    }

    static {
        f25547q = new w13.c(new q[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12});
    }

    private q(String str) {
        super(str, i);
        this.f25548a = str;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f25546p.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc80/q$a;", "", "<init>", "()V", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static q a(String str) {
            Object next;
            str.getClass();
            w13.c cVar = q.f25547q;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                if (p005kotlin.jvm.internal.s.g(((q) next).f25548a, str)) {
                    return (q) next;
                }
            }
            next = null;
            return (q) next;
        }

        private a() {
        }
    }
}
