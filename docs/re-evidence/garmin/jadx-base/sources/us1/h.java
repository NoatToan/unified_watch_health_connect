package us1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 us1.h[], still in use, count: 1, list:
  (r0v1 us1.h[]) from 0x003e: CONSTRUCTOR (r0v1 us1.h[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB/\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lus1/h;", "", "", TtmlNode.ATTR_ID, "labelStringRes", "polylineColorRes", "polylineBorderColorRes", "<init>", "(Ljava/lang/String;IIIII)V", "a", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {
    /* JADX INFO: Fake field, exist only in values array */
    EASY(1, R.string.lbl_easy, R.color.blue_30_static, R.color.easy_trail_border),
    /* JADX INFO: Fake field, exist only in values array */
    MODERATE(2, R.string.lbl_moderate, R.color.red_70_static, R.color.medium_trail_border),
    HARD(3, R.string.lbl_hard, R.color.gray_black_static, R.color.hard_trail_border);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f172403e = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ w13.c f172406h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f172407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f172408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f172409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f172410d;

    static {
        f172406h = new w13.c(new h[]{r0, r1, r2});
    }

    private h(int i14, int i15, int i16, int i17) {
        super(str, i);
        this.f172407a = i14;
        this.f172408b = i15;
        this.f172409c = i16;
        this.f172410d = i17;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f172405g.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lus1/h$a;", "", "<init>", "()V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static h a(Integer num) {
            Object next;
            w13.c cVar = h.f172406h;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                int i14 = ((h) next).f172407a;
                if (num != null && i14 == num.intValue()) {
                    return (h) next;
                }
            }
            next = null;
            return (h) next;
        }

        public static h b(Context context, String str) {
            Object next;
            context.getClass();
            str.getClass();
            w13.c cVar = h.f172406h;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                if (s.g(context.getString(((h) next).f172408b), str)) {
                    return (h) next;
                }
            }
            next = null;
            return (h) next;
        }

        private a() {
        }
    }
}
