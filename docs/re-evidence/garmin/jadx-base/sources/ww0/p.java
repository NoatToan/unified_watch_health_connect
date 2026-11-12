package ww0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import lc.u0;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ww0.p[], still in use, count: 1, list:
  (r0v1 ww0.p[]) from 0x0079: CONSTRUCTOR (r0v1 ww0.p[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lww0/p;", "Lww0/f;", "", "<init>", "(Ljava/lang/String;I)V", "a", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p implements f {
    FINE,
    HAPPY,
    ENERGETIC,
    MOTIVATED,
    MOOD_SWINGS,
    SAD,
    EMOTIONAL,
    OVERWHELMED,
    IRRITABLE,
    FRUSTRATED,
    WORRIED;


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f187627a = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ w13.c f187640n;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f187641a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.EMOTIONAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ENERGETIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.FINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p.FRUSTRATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[p.HAPPY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[p.IRRITABLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[p.MOOD_SWINGS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[p.MOTIVATED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[p.OVERWHELMED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[p.SAD.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[p.WORRIED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f187641a = iArr;
        }
    }

    static {
        f187640n = new w13.c(new p[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10});
    }

    private p() {
        super(str, i);
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f187639m.clone();
    }

    @Override // ww0.f
    public final String a(Context context) {
        int i14;
        context.getClass();
        switch (b.f187641a[ordinal()]) {
            case 1:
                i14 = R.string.mct_emotional;
                break;
            case 2:
                i14 = R.string.mct_energetic;
                break;
            case 3:
                i14 = R.string.mct_fine;
                break;
            case 4:
                i14 = R.string.mct_frustrated;
                break;
            case 5:
                i14 = R.string.mct_happy;
                break;
            case 6:
                i14 = R.string.mct_irritable;
                break;
            case 7:
                i14 = R.string.mct_mood_swings;
                break;
            case 8:
                i14 = R.string.mct_motivated;
                break;
            case 9:
                i14 = R.string.mct_overwhelmed;
                break;
            case 10:
                i14 = R.string.mct_sad;
                break;
            case 11:
                i14 = R.string.pregnancy_worried;
                break;
            default:
                u0.r();
                return null;
        }
        String string = context.getString(i14);
        string.getClass();
        return string;
    }

    @Override // ww0.f
    public final int b() {
        switch (b.f187641a[ordinal()]) {
            case 1:
                return R.raw.icon_mct_mood_emotional;
            case 2:
                return R.raw.icon_mct_mood_energetic;
            case 3:
                return R.raw.icon_mct_mood_fine;
            case 4:
                return R.raw.icon_mct_mood_frustrated;
            case 5:
                return R.raw.icon_mct_mood_happy;
            case 6:
                return R.raw.icon_mct_mood_irritable;
            case 7:
                return R.raw.icon_mct_mood_swings;
            case 8:
                return R.raw.icon_mct_mood_motivated;
            case 9:
                return R.raw.icon_mct_mood_overwhelmed;
            case 10:
                return R.raw.icon_mct_mood_sad;
            case 11:
                return R.raw.icon_mct_mood_mood_worried;
            default:
                u0.r();
                return 0;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lww0/p$a;", "", "<init>", "()V", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
