package hv1;

import android.content.Context;
import android.icu.text.NumberFormat;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.common.ConnectionResult;
import d53.u;
import i3.e5;
import j20.x;
import java.util.Locale;
import o13.p;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Marker;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 hv1.i[], still in use, count: 1, list:
  (r0v1 hv1.i[]) from 0x0038: CONSTRUCTOR (r0v1 hv1.i[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lhv1/i;", "", "", "minValueInMeters", "maxValueInMeters", "<init>", "(Ljava/lang/String;III)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {
    NOVICE(0, 1200),
    /* JADX INFO: Fake field, exist only in values array */
    INTERMEDIATE(1000, 2000),
    /* JADX INFO: Fake field, exist only in values array */
    EXPERIENCED(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, 2900),
    EXPERT(2000, 3900);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f85867c = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ w13.c f85871g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f85872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f85873b;

    static {
        f85871g = new w13.c(new i[]{r0, r1, r2, r3});
    }

    private i(int i14, int i15) {
        super(str, i);
        this.f85872a = i14;
        this.f85873b = i15;
    }

    public static String a(i iVar, Context context) {
        iVar.getClass();
        context.getClass();
        p<String, String> pVarC = iVar.c(false);
        String str = pVarC.f128594a;
        String str2 = pVarC.f128595b;
        if (iVar != EXPERT) {
            return x.d(str, "-", str2, StringUtils.SPACE, context.getString(R.string.meters));
        }
        String string = context.getString(R.string.meters);
        StringBuilder sbL = e5.l(str, "-", str2, "", StringUtils.SPACE);
        sbL.append(string);
        return sbL.toString();
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f85870f.clone();
    }

    public final String b(Context context, boolean z14) {
        context.getClass();
        p<String, String> pVarC = c(z14);
        String str = pVarC.f128594a;
        String str2 = pVarC.f128595b;
        if (this != EXPERT) {
            return x.d(str, "-", str2, StringUtils.SPACE, context.getString(R.string.lbl_meter));
        }
        String str3 = z14 ? Marker.ANY_NON_NULL_MARKER : "";
        String string = context.getString(R.string.lbl_meter);
        StringBuilder sbL = e5.l(str, "-", str2, str3, StringUtils.SPACE);
        sbL.append(string);
        return sbL.toString();
    }

    public final p<String, String> c(boolean z14) {
        NumberFormat integerInstance = NumberFormat.getIntegerInstance(Locale.getDefault());
        return new p<>(integerInstance.format(Integer.valueOf((z14 || this != NOVICE) ? this.f85872a : 600)), integerInstance.format(Integer.valueOf(this.f85873b)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhv1/i$a;", "", "<init>", "()V", "", "SWIM_ABILITY_NOVICE_MIN_DISPLAY_VALUE", "I", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static i a(String str) {
            Object next;
            str.getClass();
            w13.c cVar = i.f85871g;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                if (u.q(((i) next).name(), str, true)) {
                    return (i) next;
                }
            }
            next = null;
            return (i) next;
        }

        private a() {
        }
    }
}
