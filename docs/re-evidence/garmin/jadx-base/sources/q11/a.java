package q11;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import i63.h;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p3.x1;
import w13.c;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 q11.a[], still in use, count: 1, list:
  (r0v1 q11.a[]) from 0x003a: CONSTRUCTOR (r0v1 q11.a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lq11/a;", "", "", Action.KEY_ATTRIBUTE, "", "descriptionResId", "Li01/a;", "bulkFoodLogAction", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILi01/a;)V", "Companion", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final class a {
    MOVE("move", R.string.move_food_instructions, i01.a.MOVE),
    COPY("copy", R.string.lbl_choose_foods_to_copy_and_move, i01.a.COPY),
    REMOVE("remove", R.string.remove_logged_food, null);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f142066d = m.a(n.PUBLICATION, new pk0.m(21));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ c f142071i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f142072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f142073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i01.a f142074c;

    static {
        f142071i = new c(new a[]{r0, r1, r2});
    }

    private a(String str, int i14, i01.a aVar) {
        super(str, i);
        this.f142072a = str;
        this.f142073b = i14;
        this.f142074c = aVar;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f142070h.clone();
    }

    /* JADX INFO: renamed from: q11.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lq11/a$a;", "", "<init>", "()V", "Li63/c;", "Lq11/a;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: q11.a$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2667a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f142075a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.MOVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.COPY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.REMOVE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f142075a = iArr;
            }
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public static String a(a aVar, p3.m mVar) {
            int i14;
            int i15;
            aVar.getClass();
            x1 x1Var = p3.n.f135158a;
            int i16 = C2667a.f142075a[aVar.ordinal()];
            if (i16 == 1) {
                i14 = -1910736059;
                i15 = R.string.move_food;
            } else if (i16 == 2) {
                i14 = -1910734007;
                i15 = R.string.lbl_copy_food;
            } else {
                if (i16 != 3) {
                    throw n23.j.m(mVar, -1910737087);
                }
                i14 = -1910731769;
                i15 = R.string.remove_food;
            }
            return sn.a.h(mVar, i14, i15, mVar);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<a> serializer() {
            return (i63.c) a.f142066d.getValue();
        }

        private Companion() {
        }
    }
}
