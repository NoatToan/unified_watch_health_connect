package mb0;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 mb0.h[], still in use, count: 1, list:
  (r0v1 mb0.h[]) from 0x008d: CONSTRUCTOR (r0v1 mb0.h[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lmb0/h;", "", "", "initialResource", "abbreviationResource", "fullTextResource", "<init>", "(Ljava/lang/String;IIII)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {
    MONDAY(R.string.lbl_day_of_week_monday_initial, R.string.lbl_day_of_week_monday_abbreviated, R.string.lbl_day_of_week_monday),
    TUESDAY(R.string.lbl_day_of_week_tuesday_initial, R.string.lbl_day_of_week_tuesday_abbreviated, R.string.lbl_day_of_week_tuesday),
    WEDNESDAY(R.string.lbl_day_of_week_wednesday_initial, R.string.lbl_day_of_week_wednesday_abbreviated, R.string.lbl_day_of_week_wednesday),
    THURSDAY(R.string.lbl_day_of_week_thursday_initial, R.string.lbl_day_of_week_thursday_abbreviated, R.string.lbl_day_of_week_thursday),
    FRIDAY(R.string.lbl_day_of_week_friday_initial, R.string.lbl_day_of_week_friday_abbreviated, R.string.lbl_day_of_week_friday),
    SATURDAY(R.string.lbl_day_of_week_saturday_initial, R.string.lbl_day_of_week_saturday_abbreviated, R.string.lbl_day_of_week_saturday),
    SUNDAY(R.string.lbl_day_of_week_sunday_initial, R.string.lbl_day_of_week_sunday_abbreviated, R.string.lbl_day_of_week_sunday);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f117739d = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ w13.c f117748m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f117749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f117750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f117751c;

    static {
        f117748m = new w13.c(new h[]{r0, r1, r2, r3, r4, r5, r6});
    }

    private h(int i14, int i15, int i16) {
        super(str, i);
        this.f117749a = i14;
        this.f117750b = i15;
        this.f117751c = i16;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f117747l.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmb0/h$a;", "", "<init>", "()V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
