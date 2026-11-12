package gg1;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 gg1.m[], still in use, count: 1, list:
  (r0v1 gg1.m[]) from 0x007f: CONSTRUCTOR (r0v1 gg1.m[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lgg1/m;", "", "", "jsonKey", "", "garminConnectID", "isoID", "displayNameResourceID", "<init>", "(Ljava/lang/String;ILjava/lang/String;III)V", "a", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m {
    SATURDAY("saturday", 1, 6, R.string.lbl_day_of_week_saturday),
    SUNDAY("sunday", 2, 7, R.string.lbl_day_of_week_sunday),
    MONDAY("monday", 3, 1, R.string.lbl_day_of_week_monday),
    TUESDAY("tuesday", 4, 2, R.string.lbl_day_of_week_tuesday),
    WEDNESDAY("wednesday", 5, 3, R.string.lbl_day_of_week_wednesday),
    THURSDAY("thursday", 6, 4, R.string.lbl_day_of_week_thursday),
    FRIDAY("friday", 7, 5, R.string.lbl_day_of_week_friday);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f77259e = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ w13.c f77268n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f77271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f77272d;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f77273a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.SUNDAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.TUESDAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m.WEDNESDAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m.THURSDAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[m.FRIDAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[m.SATURDAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f77273a = iArr;
        }
    }

    static {
        f77268n = new w13.c(new m[]{r0, r1, r2, r3, r4, r5, r6});
    }

    private m(String str, int i14, int i15, int i16) {
        super(str, i);
        this.f77269a = str;
        this.f77270b = i14;
        this.f77271c = i15;
        this.f77272d = i16;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f77267m.clone();
    }

    public final int a() {
        switch (b.f77273a[ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgg1/m$a;", "", "<init>", "()V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
