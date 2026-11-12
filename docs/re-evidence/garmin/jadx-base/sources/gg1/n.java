package gg1;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 gg1.n[], still in use, count: 1, list:
  (r0v1 gg1.n[]) from 0x0035: CONSTRUCTOR (r0v1 gg1.n[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lgg1/n;", "", "", "jsonValue", "", "displayNameResourceID", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n {
    OUNCE_US("ounce", R.string.common_ounce_string),
    CUP_US("cup", R.string.common_cup),
    METRIC("milliliter", R.string.common_milliliter);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f77276b = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ w13.c f77281g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77282a;

    static {
        f77281g = new w13.c(new n[]{r0, r1, r2});
    }

    private n(String str, int i14) {
        super(str, i);
        this.f77282a = str;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f77280f.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgg1/n$a;", "", "<init>", "()V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static n a(String str, n nVar) {
            Object next;
            nVar.getClass();
            if (str != null) {
                w13.c cVar = n.f77281g;
                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                do {
                    if (!bVarN.hasNext()) {
                        next = null;
                        break;
                    }
                    next = bVarN.next();
                } while (!p005kotlin.jvm.internal.s.g(((n) next).f77282a, str));
                n nVar2 = (n) next;
                if (nVar2 != null) {
                    return nVar2;
                }
            }
            return nVar;
        }

        private a() {
        }
    }
}
