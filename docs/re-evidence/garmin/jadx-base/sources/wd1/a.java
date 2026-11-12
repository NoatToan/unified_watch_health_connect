package wd1;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 wd1.a[], still in use, count: 1, list:
  (r0v1 wd1.a[]) from 0x004f: CONSTRUCTOR (r0v1 wd1.a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lwd1/a;", "", "", Action.KEY_ATTRIBUTE, "", "apiValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {
    MONDAY("MONDAY", 1),
    TUESDAY("TUESDAY", 2),
    WEDNESDAY("WEDNESDAY", 3),
    THURSDAY("THURSDAY", 4),
    FRIDAY("FRIDAY", 5),
    SATURDAY("SATURDAY", 6),
    SUNDAY("SUNDAY", 7);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C3418a f184362c = new C3418a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ w13.c f184371l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f184372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f184373b;

    static {
        f184371l = new w13.c(new a[]{r0, r1, r2, r3, r4, r5, r6});
    }

    private a(String str, int i14) {
        super(str, i);
        this.f184372a = str;
        this.f184373b = i14;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f184370k.clone();
    }

    /* JADX INFO: renamed from: wd1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwd1/a$a;", "", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3418a {

        /* JADX INFO: renamed from: wd1.a$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3419a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f184374a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.MONDAY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.TUESDAY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.WEDNESDAY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.THURSDAY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.FRIDAY.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.SATURDAY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.SUNDAY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f184374a = iArr;
            }
        }

        public /* synthetic */ C3418a(j jVar) {
            this();
        }

        public static int a(a aVar) {
            aVar.getClass();
            switch (C3419a.f184374a[aVar.ordinal()]) {
                case 1:
                    return R.string.device_settings_frequency_mondays;
                case 2:
                    return R.string.device_settings_frequency_tuesdays;
                case 3:
                    return R.string.device_settings_frequency_wednesdays;
                case 4:
                    return R.string.device_settings_frequency_thursdays;
                case 5:
                    return R.string.device_settings_frequency_fridays;
                case 6:
                    return R.string.device_settings_frequency_saturdays;
                case 7:
                    return R.string.device_settings_frequency_sundays;
                default:
                    u0.r();
                    return 0;
            }
        }

        public static a b(int i14) {
            w13.c cVar = a.f184371l;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                a aVar = (a) bVarN.next();
                if (aVar.f184373b == i14) {
                    return aVar;
                }
            }
            n23.j.s("Collection contains no element matching the predicate.");
            return null;
        }

        private C3418a() {
        }
    }
}
