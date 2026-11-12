package b11;

import c22.x0;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import lc.u0;
import p005kotlin.Metadata;
import p13.y;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 b11.n[], still in use, count: 1, list:
  (r0v1 b11.n[]) from 0x0093: CONSTRUCTOR (r0v1 b11.n[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lb11/n;", "", "", Action.KEY_ATTRIBUTE, "", "nameResId", "abbreviationResId", "Lc22/g2;", "abbreviationOnDemandResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n {
    FIBER("fiber", R.string.fiber, R.string.fiber, null, 8, null),
    ADDED_SUGAR("addedSugars", R.string.added_sugar, 0, x0.f23629sd),
    SATURATED_FAT("saturatedFat", R.string.saturated_fat, 0, x0.Uf),
    IRON("iron", R.string.iron, R.string.iron, null, 8, null),
    VITAMIN_A("vitaminA", R.string.vitamin_a, 0, x0.Xf),
    VITAMIN_D("vitaminD", R.string.vitamin_d, 0, x0.Yf),
    CALCIUM("calcium", R.string.calcium, 0, x0.f23645td);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f14341e;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ w13.c f14350n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14354d;

    static {
        x0.f23314a.getClass();
        f14350n = new w13.c(nVarArr);
        f14341e = new a(null);
    }

    public /* synthetic */ n(String str, int i14, int i15, String str2, int i16, p005kotlin.jvm.internal.j jVar) {
        this(str, i14, i15, (i16 & 8) != 0 ? null : str2);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f14349m.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb11/n$a;", "", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: b11.n$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0207a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f14355a;

            static {
                int[] iArr = new int[n.values().length];
                try {
                    iArr[n.FIBER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[n.ADDED_SUGAR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[n.SATURATED_FAT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[n.IRON.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[n.CALCIUM.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[n.VITAMIN_A.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[n.VITAMIN_D.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f14355a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static ArrayList a() {
            p pVar;
            w13.c cVar = n.f14350n;
            ArrayList arrayList = new ArrayList(y.r(cVar, 10));
            p13.c.b bVar = new p13.c.b();
            while (bVar.hasNext()) {
                n nVar = (n) bVar.next();
                String str = nVar.f14351a;
                n.f14341e.getClass();
                switch (C0207a.f14355a[nVar.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        pVar = p.GRAMS;
                        break;
                    case 4:
                    case 5:
                        pVar = p.MILLIGRAMS;
                        break;
                    case 6:
                    case 7:
                        pVar = p.MICROGRAMS;
                        break;
                    default:
                        u0.r();
                        return null;
                }
                arrayList.add(new s21.n(false, str, null, null, pVar.f14364a, 0));
            }
            return arrayList;
        }

        public static String b(String str, String str2, l22.b bVar) {
            Object next;
            bVar.getClass();
            w13.c cVar = n.f14350n;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            do {
                if (!bVarN.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarN.next();
            } while (!p005kotlin.jvm.internal.s.g(((n) next).f14351a, str));
            n nVar = (n) next;
            if (nVar != null) {
                return bVar.getString(nVar.f14352b);
            }
            return str2 == null ? "" : str2;
        }

        private a() {
        }
    }

    private n(String str, int i14, int i15, String str2) {
        super(str, i);
        this.f14351a = str;
        this.f14352b = i14;
        this.f14353c = i15;
        this.f14354d = str2;
    }
}
