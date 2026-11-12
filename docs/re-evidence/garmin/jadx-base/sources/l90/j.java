package l90;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.device.pairing.devices.PrimaryApp;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 l90.j[], still in use, count: 1, list:
  (r0v1 l90.j[]) from 0x0030: CONSTRUCTOR (r0v1 l90.j[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ll90/j;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j {
    GCM("GCM"),
    GOLF("GOLF"),
    DIVE("DIVE"),
    EXPLORE("EXPLORE");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f111568b = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ w13.c f111574h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111575a;

    static {
        f111574h = new w13.c(new j[]{r0, r1, r2, r3});
    }

    private j(String str) {
        super(str, i);
        this.f111575a = str;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f111573g.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll90/j$a;", "", "<init>", "()V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: l90.j$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2135a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f111576a;

            static {
                int[] iArr = new int[PrimaryApp.values().length];
                try {
                    iArr[PrimaryApp.GCM.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PrimaryApp.GOLF.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PrimaryApp.DIVE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[PrimaryApp.EXPLORE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f111576a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static j a(PrimaryApp primaryApp) {
            int i14 = primaryApp == null ? -1 : C2135a.f111576a[primaryApp.ordinal()];
            if (i14 == 1) {
                return j.GCM;
            }
            if (i14 == 2) {
                return j.GOLF;
            }
            if (i14 != 3) {
                return i14 != 4 ? j.GCM : j.EXPLORE;
            }
            return j.DIVE;
        }

        private a() {
        }
    }
}
