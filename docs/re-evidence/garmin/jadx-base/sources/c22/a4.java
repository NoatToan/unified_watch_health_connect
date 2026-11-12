package c22;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.R;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 c22.a4[], still in use, count: 1, list:
  (r0v1 c22.a4[]) from 0x0079: CONSTRUCTOR (r0v1 c22.a4[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB+\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lc22/a4;", "", "", Action.KEY_ATTRIBUTE, "", "nameResId", "dateTimeConstant", "weekDayCalendarConstant", "<init>", "(Ljava/lang/String;ILjava/lang/String;III)V", "a", "d", JWKParameterNames.RSA_EXPONENT, "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a4 {
    SUNDAY("SUNDAY", R.string.lbl_day_of_week_sunday, 7, 1),
    MONDAY("MONDAY", R.string.lbl_day_of_week_monday, 1, 2),
    TUESDAY("TUESDAY", R.string.lbl_day_of_week_tuesday, 2, 3),
    WEDNESDAY("WEDNESDAY", R.string.lbl_day_of_week_wednesday, 3, 4),
    THURSDAY("THURSDAY", R.string.lbl_day_of_week_thursday, 4, 5),
    FRIDAY("FRIDAY", R.string.lbl_day_of_week_friday, 5, 6),
    SATURDAY("SATURDAY", R.string.lbl_day_of_week_saturday, 6, 7);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f22995c = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ w13.c f23004l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23006b;

    static {
        f23004l = new w13.c(new a4[]{r0, r1, r2, r3, r4, r5, r6});
    }

    private a4(String str, int i14, int i15, int i16) {
        super(str, i);
        this.f23005a = i14;
        this.f23006b = i15;
    }

    public static a4 valueOf(String str) {
        return (a4) Enum.valueOf(a4.class, str);
    }

    public static a4[] values() {
        return (a4[]) f23003k.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc22/a4$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static a4 a(String str) {
            Object next;
            str.getClass();
            Integer numValueOf = Integer.valueOf(str);
            w13.c cVar = a4.f23004l;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                int i14 = ((a4) next).f23006b;
                if (numValueOf != null && i14 == numValueOf.intValue()) {
                    return (a4) next;
                }
            }
            next = null;
            return (a4) next;
        }

        public static List b() {
            ArrayList arrayListD1 = p13.h0.d1(a4.f23004l);
            gg1.m mVarE1 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).e1();
            if (mVarE1 == gg1.m.SATURDAY) {
                Collections.rotate(arrayListD1, 1);
            } else if (mVarE1 == gg1.m.MONDAY) {
                Collections.rotate(arrayListD1, -1);
            }
            return p13.h0.b1(arrayListD1);
        }

        private a() {
        }
    }
}
