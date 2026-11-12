package we0;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 we0.i[], still in use, count: 1, list:
  (r0v1 we0.i[]) from 0x0035: CONSTRUCTOR (r0v1 we0.i[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB%\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lwe0/i;", "", "", "stringRes", "iconRes", "rateValue", "<init>", "(Ljava/lang/String;IIII)V", "a", "gcm-domain-feedback_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {
    /* JADX INFO: Fake field, exist only in values array */
    Great(R.string.lbl_great, R.drawable.face_very_happy, 3),
    /* JADX INFO: Fake field, exist only in values array */
    Ok(R.string.lbl_ok, R.drawable.face_feel_normal, 2),
    /* JADX INFO: Fake field, exist only in values array */
    Poor(R.string.lbl_poor, R.drawable.face_very_sad, 1);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f184761d = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ w13.c f184763f = new w13.c(new i[]{new i(R.string.lbl_great, R.drawable.face_very_happy, 3), new i(R.string.lbl_ok, R.drawable.face_feel_normal, 2), new i(R.string.lbl_poor, R.drawable.face_very_sad, 1)});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f184764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f184765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f184766c;

    static {
    }

    private i(int i14, int i15, int i16) {
        super(str, i);
        this.f184764a = i14;
        this.f184765b = i15;
        this.f184766c = i16;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f184762e.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwe0/i$a;", "", "<init>", "()V", "gcm-domain-feedback_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
