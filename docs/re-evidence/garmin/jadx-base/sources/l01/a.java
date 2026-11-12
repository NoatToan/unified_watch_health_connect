package l01;

import com.garmin.android.apps.connectmobile.R;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 l01.a[], still in use, count: 1, list:
  (r0v1 l01.a[]) from 0x0068: CONSTRUCTOR (r0v1 l01.a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Ll01/a;", "", "", "value", "", "titleRes", "infoRes", "<init>", "(Ljava/lang/String;ILjava/lang/String;II)V", "Companion", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final class a {
    /* JADX INFO: Fake field, exist only in values array */
    SEDENTARY("SEDENTARY", R.string.sedentary, R.string.sedentary_description),
    /* JADX INFO: Fake field, exist only in values array */
    LIGHTLY_ACTIVE("LIGHTLY_ACTIVE", R.string.lightly_active, R.string.lightly_active_description),
    MODERATELY_ACTIVE("MODERATELY_ACTIVE", R.string.moderately_active, R.string.moderately_active_description),
    /* JADX INFO: Fake field, exist only in values array */
    VERY_ACTIVE("VERY_ACTIVE", R.string.very_active, R.string.very_active_description),
    /* JADX INFO: Fake field, exist only in values array */
    EXTREMELY_ACTIVE("EXTREMELY_ACTIVE", R.string.extremely_active, R.string.extremely_active_description),
    UNKNOWN("UNKNOWN", 0, 0);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f107831d = m.a(n.PUBLICATION, new kt2.d(29));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ w13.c f107835h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f107837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f107838c;

    static {
        f107835h = new w13.c(new a[]{r0, r1, r2, r3, r4, r5});
    }

    private a(String str, int i14, int i15) {
        super(str, i);
        this.f107836a = str;
        this.f107837b = i14;
        this.f107838c = i15;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f107834g.clone();
    }

    /* JADX INFO: renamed from: l01.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ll01/a$a;", "", "<init>", "()V", "Li63/c;", "Ll01/a;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static a a(String str) {
            Object next;
            w13.c cVar = a.f107835h;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            do {
                if (!bVarN.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarN.next();
            } while (!s.g(((a) next).name(), str));
            a aVar = (a) next;
            return aVar == null ? a.UNKNOWN : aVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<a> serializer() {
            return (i63.c) a.f107831d.getValue();
        }

        private Companion() {
        }
    }
}
