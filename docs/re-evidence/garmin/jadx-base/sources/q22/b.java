package q22;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import w13.c;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 q22.b[], still in use, count: 1, list:
  (r0v1 q22.b[]) from 0x0060: CONSTRUCTOR (r0v1 q22.b[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"Lq22/b;", "", "", "labelResId", "labelPluralResId", "labelAbrResId", "labelPluralAbrResId", "<init>", "(Ljava/lang/String;IIIII)V", "(Ljava/lang/String;III)V", "a", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {
    FLUID_OUNCE(R.string.common_ounce_string, R.string.common_ounces, R.string.common_abbrev_ounce, R.string.common_abbrev_ounce),
    CUP(R.string.common_cup, R.string.common_cups, R.string.common_cup, R.string.common_cups),
    MILLILITER(R.string.common_milliliter, R.string.common_milliliters, R.string.lbl_unit_milliliter_abr, R.string.lbl_unit_milliliter_abr),
    LITRE(R.string.lbl_unit_litre, R.string.lbl_unit_litre_plural, R.string.lbl_unit_litre_abr, R.string.lbl_unit_litre_abr);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f142305e = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ c f142311k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f142312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f142313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f142314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f142315d;

    static {
        f142311k = new c(new b[]{r0, r1, r2, r3});
    }

    private b(int i14, int i15, int i16, int i17) {
        super(str, i);
        this.f142312a = i14;
        this.f142313b = i15;
        this.f142314c = i16;
        this.f142315d = i17;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f142310j.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq22/b$a;", "", "<init>", "()V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    private b(String str, int i14, int i15, int i16) {
        this(i15, i15, i16, i16);
    }
}
