package m52;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 m52.i[], still in use, count: 1, list:
  (r0v1 m52.i[]) from 0x0053: CONSTRUCTOR (r0v1 m52.i[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lm52/i;", "", "", NotificationConstants.KEY_DATA_MIME_TYPE, "", "displayResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {
    SPRINT("sprint", R.string.triathlon_event_type_sprint),
    STANDARD("standard", R.string.triathlon_event_type_standard),
    HALF_IRON("half_iron", R.string.triathlon_event_type_half),
    FULL_IRON("full_iron", R.string.triathlon_event_type_full),
    CUSTOM("custom", R.string.lbl_custom);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f116734c = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ w13.c f116741j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f116743b;

    static {
        f116741j = new w13.c(new i[]{r0, r1, r2, r3, r4});
    }

    private i(String str, int i14) {
        super(str, i);
        this.f116742a = str;
        this.f116743b = i14;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f116740i.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm52/i$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
