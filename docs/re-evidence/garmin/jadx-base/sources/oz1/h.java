package oz1;

import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 oz1.h[], still in use, count: 1, list:
  (r0v1 oz1.h[]) from 0x0062: CONSTRUCTOR (r0v1 oz1.h[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Loz1/h;", "", "", "value", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Ljava/lang/String;III)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {
    NONE(R.string.no_value, R.string.tr_feedback_hrv_no_data),
    VERY_POOR(R.string.tr_hrv_display_very_poor, R.string.tr_feedback_hrv_very_poor),
    POOR(R.string.tr_hrv_display_poor, R.string.tr_feedback_hrv_poor),
    MODERATE(R.string.tr_hrv_display_moderate, R.string.tr_feedback_hrv_moderate),
    GOOD(R.string.tr_hrv_display_good_very_good, R.string.tr_feedback_hrv_good),
    VERY_GOOD(R.string.tr_hrv_display_good_very_good, R.string.tr_feedback_hrv_good);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f134549c = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ w13.c f134557k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f134558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f134559b;

    static {
        f134557k = new w13.c(new h[]{r0, r1, r2, r3, r4, r5});
    }

    private h(int i14, int i15) {
        super(str, i);
        this.f134558a = i14;
        this.f134559b = i15;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f134556j.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loz1/h$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static h a(int i14) {
            Object next;
            w13.c cVar = h.f134557k;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            do {
                if (!bVarN.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarN.next();
            } while (((h) next).f134558a != i14);
            h hVar = (h) next;
            return hVar == null ? h.NONE : hVar;
        }

        private a() {
        }
    }
}
