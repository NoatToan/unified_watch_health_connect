package bb0;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 bb0.c[], still in use, count: 1, list:
  (r0v1 bb0.c[]) from 0x0036: CONSTRUCTOR (r0v1 bb0.c[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbb0/c;", "", "", "value", "nameResId", "descriptionResId", "<init>", "(Ljava/lang/String;IIII)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {
    /* JADX INFO: Fake field, exist only in values array */
    LOW(3, R.string.txt_activity_level_low_label, R.string.msg_low_activity_level_description),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIUM(5, R.string.mct_medium, R.string.msg_medium_activity_level_description),
    /* JADX INFO: Fake field, exist only in values array */
    HIGH(8, R.string.txt_activity_level_high_label, R.string.msg_high_activity_level_description);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ w13.c f17292d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17294b;

    static {
        f17292d = new w13.c(cVarArr);
    }

    public /* synthetic */ c(String str, int i14, int i15, int i16, int i17, int i18, j jVar) {
        this(i15, (i18 & 2) != 0 ? 0 : i16, (i18 & 4) != 0 ? 0 : i17);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f17291c.clone();
    }

    private c(int i14, int i15, int i16) {
        super(str, i);
        this.f17293a = i14;
        this.f17294b = i15;
    }
}
