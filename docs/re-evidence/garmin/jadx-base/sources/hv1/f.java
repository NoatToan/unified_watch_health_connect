package hv1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import org.slf4j.Marker;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 hv1.f[], still in use, count: 1, list:
  (r0v1 hv1.f[]) from 0x002c: CONSTRUCTOR (r0v1 hv1.f[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lhv1/f;", "", "", "minValue", "maxValue", "<init>", "(Ljava/lang/String;III)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {
    ZERO_FOUR(0, 4),
    FIVE_NINE(5, 9),
    TEN_PLUS(10, 10);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f85850c = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ w13.c f85855h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f85856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f85857b;

    static {
        f85855h = new w13.c(new f[]{r0, r1, r2});
    }

    private f(int i14, int i15) {
        super(str, i);
        this.f85856a = i14;
        this.f85857b = i15;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f85854g.clone();
    }

    public final String a(Context context) {
        context.getClass();
        int i14 = this.f85856a;
        if (i14 < 10) {
            String string = context.getString(R.string.lbl_plural_more_than_one_hour_capitalized, androidx.core.view.j.d(i14, this.f85857b, "-"));
            string.getClass();
            return string;
        }
        String string2 = context.getString(R.string.lbl_plural_more_than_one_hour_capitalized, androidx.core.view.j.f(i14, Marker.ANY_NON_NULL_MARKER));
        string2.getClass();
        return string2;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhv1/f$a;", "", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static f a(int i14) {
            Object next;
            w13.c cVar = f.f85855h;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                f fVar = (f) next;
                int i15 = fVar.f85856a;
                if (i14 <= fVar.f85857b && i15 <= i14) {
                    return (f) next;
                }
            }
            next = null;
            return (f) next;
        }

        private a() {
        }
    }
}
