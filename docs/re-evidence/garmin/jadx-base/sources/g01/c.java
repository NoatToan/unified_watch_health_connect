package g01;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import java.util.Locale;
import p005kotlin.Metadata;
import p3.x1;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 g01.c[], still in use, count: 1, list:
  (r0v1 g01.c[]) from 0x00aa: CONSTRUCTOR (r0v1 g01.c[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lg01/c;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final class c {
    OUNCES("OZ"),
    GRAMS("G"),
    MILLILITERS("ML"),
    FLUID_OUNCES("FL_OZ"),
    CUP("CUP"),
    KILOGRAM("KG"),
    POUND("LB"),
    LITERS("L"),
    TABLESPOON("TBSP"),
    SCOOP("SCOOP"),
    SLICE("SLICE"),
    PIECE("PIECE"),
    SERVING("SERVING"),
    UNKNOWN("UNKNOWN");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f74105b = o13.m.a(o13.n.PUBLICATION, new fy1.h(13));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ w13.c f74121r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74122a;

    static {
        f74121r = new w13.c(new c[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13});
    }

    private c(String str) {
        super(str, i);
        this.f74122a = str;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f74120q.clone();
    }

    /* JADX INFO: renamed from: g01.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg01/c$a;", "", "<init>", "()V", "Li63/c;", "Lg01/c;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: g01.c$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1509a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f74123a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.OUNCES.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.GRAMS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c.MILLILITERS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[c.FLUID_OUNCES.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[c.KILOGRAM.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[c.POUND.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[c.LITERS.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[c.TABLESPOON.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[c.CUP.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[c.SCOOP.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[c.SLICE.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[c.PIECE.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[c.SERVING.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[c.UNKNOWN.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                f74123a = iArr;
            }
        }

        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static c a(String str) {
            Object next;
            w13.c cVar = c.f74121r;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            do {
                if (!bVarN.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarN.next();
            } while (!p005kotlin.jvm.internal.s.g(((c) next).f74122a, str));
            c cVar2 = (c) next;
            return cVar2 == null ? c.UNKNOWN : cVar2;
        }

        public static String b(c cVar, double d14, p3.m mVar, int i14) {
            int i15;
            int i16;
            int i17;
            int i18;
            String strH;
            int i19;
            int i24;
            int i25;
            int i26;
            int i27;
            int i28;
            int i29;
            int i30;
            cVar.getClass();
            if ((i14 & 1) != 0) {
                d14 = 1.0d;
            }
            x1 x1Var = p3.n.f135158a;
            boolean z14 = d14 <= 1.0d;
            switch (C1509a.f74123a[cVar.ordinal()]) {
                case 1:
                    i15 = -60510149;
                    i16 = R.string.common_abbrev_ounce;
                    strH = sn.a.h(mVar, i15, i16, mVar);
                    String lowerCase = strH.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    return lowerCase;
                case 2:
                    i15 = -60507922;
                    i16 = R.string.unit_g;
                    strH = sn.a.h(mVar, i15, i16, mVar);
                    String lowerCase2 = strH.toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    return lowerCase2;
                case 3:
                    i15 = -60505889;
                    i16 = R.string.lbl_unit_milliliter_abr;
                    strH = sn.a.h(mVar, i15, i16, mVar);
                    String lowerCase3 = strH.toLowerCase(Locale.ROOT);
                    lowerCase3.getClass();
                    return lowerCase3;
                case 4:
                    i15 = -60503295;
                    i16 = R.string.fluid_ounces_abbreviation;
                    strH = sn.a.h(mVar, i15, i16, mVar);
                    String lowerCase4 = strH.toLowerCase(Locale.ROOT);
                    lowerCase4.getClass();
                    return lowerCase4;
                case 5:
                    i15 = -60500786;
                    i16 = R.string.lbl_kg;
                    strH = sn.a.h(mVar, i15, i16, mVar);
                    String lowerCase5 = strH.toLowerCase(Locale.ROOT);
                    lowerCase5.getClass();
                    return lowerCase5;
                case 6:
                    i15 = -60498961;
                    i16 = R.string.lbl_lbs;
                    strH = sn.a.h(mVar, i15, i16, mVar);
                    String lowerCase6 = strH.toLowerCase(Locale.ROOT);
                    lowerCase6.getClass();
                    return lowerCase6;
                case 7:
                    i15 = -60497054;
                    i16 = R.string.common_abbrev_liter_string;
                    strH = sn.a.h(mVar, i15, i16, mVar);
                    String lowerCase7 = strH.toLowerCase(Locale.ROOT);
                    lowerCase7.getClass();
                    return lowerCase7;
                case 8:
                    i15 = -60494433;
                    i16 = R.string.tablespoon_abbreviation;
                    strH = sn.a.h(mVar, i15, i16, mVar);
                    String lowerCase8 = strH.toLowerCase(Locale.ROOT);
                    lowerCase8.getClass();
                    return lowerCase8;
                case 9:
                    mVar.C(-60492082);
                    if (z14) {
                        i17 = -60491473;
                        i18 = R.string.lbl_cup;
                    } else {
                        i17 = -60490253;
                        i18 = R.string.common_cups;
                    }
                    strH = sn.a.h(mVar, i17, i18, mVar);
                    mVar.f();
                    String lowerCase9 = strH.toLowerCase(Locale.ROOT);
                    lowerCase9.getClass();
                    return lowerCase9;
                case 10:
                    mVar.C(-60488207);
                    if (z14) {
                        i19 = -60487598;
                        i24 = R.string.scoop_unit;
                    } else {
                        i19 = -60486285;
                        i24 = R.string.scoops_unit;
                    }
                    strH = sn.a.h(mVar, i19, i24, mVar);
                    mVar.f();
                    String lowerCase10 = strH.toLowerCase(Locale.ROOT);
                    lowerCase10.getClass();
                    return lowerCase10;
                case 11:
                    mVar.C(-60484239);
                    if (z14) {
                        i25 = -60483630;
                        i26 = R.string.slice_unit;
                    } else {
                        i25 = -60482317;
                        i26 = R.string.slices_unit;
                    }
                    strH = sn.a.h(mVar, i25, i26, mVar);
                    mVar.f();
                    String lowerCase11 = strH.toLowerCase(Locale.ROOT);
                    lowerCase11.getClass();
                    return lowerCase11;
                case 12:
                    mVar.C(-60480271);
                    if (z14) {
                        i27 = -60479662;
                        i28 = R.string.piece_unit;
                    } else {
                        i27 = -60478349;
                        i28 = R.string.pieces_unit;
                    }
                    strH = sn.a.h(mVar, i27, i28, mVar);
                    mVar.f();
                    String lowerCase12 = strH.toLowerCase(Locale.ROOT);
                    lowerCase12.getClass();
                    return lowerCase12;
                case 13:
                    mVar.C(-60476240);
                    if (z14) {
                        i29 = -60475628;
                        i30 = R.string.serving_unit;
                    } else {
                        i29 = -60474256;
                        i30 = R.string.servings;
                    }
                    strH = sn.a.h(mVar, i29, i30, mVar);
                    mVar.f();
                    String lowerCase13 = strH.toLowerCase(Locale.ROOT);
                    lowerCase13.getClass();
                    return lowerCase13;
                case 14:
                    i15 = -60472296;
                    i16 = R.string.lbl_empty_string;
                    strH = sn.a.h(mVar, i15, i16, mVar);
                    String lowerCase14 = strH.toLowerCase(Locale.ROOT);
                    lowerCase14.getClass();
                    return lowerCase14;
                default:
                    throw n23.j.m(mVar, -60510195);
            }
        }

        public static String c(c cVar, p3.m mVar) {
            cVar.getClass();
            x1 x1Var = p3.n.f135158a;
            switch (C1509a.f74123a[cVar.ordinal()]) {
                case 1:
                    mVar.C(-809529549);
                    String lowerCase = gl1.y.Q(mVar, R.string.common_ounces).toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    String strP = gl1.y.P(R.string.value_parenthesis_value, new Object[]{lowerCase, gl1.y.Q(mVar, R.string.common_abbrev_ounce)}, mVar);
                    mVar.f();
                    return strP;
                case 2:
                    mVar.C(-809225315);
                    String lowerCase2 = gl1.y.Q(mVar, R.string.lbl_grams).toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    String strP2 = gl1.y.P(R.string.value_parenthesis_value, new Object[]{lowerCase2, gl1.y.Q(mVar, R.string.lbl_grams_abr)}, mVar);
                    mVar.f();
                    return strP2;
                case 3:
                    mVar.C(-808924150);
                    String lowerCase3 = gl1.y.Q(mVar, R.string.common_milliliters).toLowerCase(Locale.ROOT);
                    lowerCase3.getClass();
                    String strP3 = gl1.y.P(R.string.value_parenthesis_value, new Object[]{lowerCase3, gl1.y.Q(mVar, R.string.lbl_unit_milliliter_abr)}, mVar);
                    mVar.f();
                    return strP3;
                case 4:
                    mVar.C(-808603858);
                    String lowerCase4 = gl1.y.Q(mVar, R.string.fluid_ounces).toLowerCase(Locale.ROOT);
                    lowerCase4.getClass();
                    String strP4 = gl1.y.P(R.string.value_parenthesis_value, new Object[]{lowerCase4, gl1.y.Q(mVar, R.string.fluid_ounces_abbreviation)}, mVar);
                    mVar.f();
                    return strP4;
                case 5:
                    mVar.C(-807991360);
                    String lowerCase5 = gl1.y.Q(mVar, R.string.lbl_kilograms).toLowerCase(Locale.ROOT);
                    lowerCase5.getClass();
                    String strP5 = gl1.y.P(R.string.value_parenthesis_value, new Object[]{lowerCase5, gl1.y.Q(mVar, R.string.lbl_kg)}, mVar);
                    mVar.f();
                    return strP5;
                case 6:
                    mVar.C(-807699774);
                    String lowerCase6 = gl1.y.Q(mVar, R.string.lbl_pounds).toLowerCase(Locale.ROOT);
                    lowerCase6.getClass();
                    String strP6 = gl1.y.P(R.string.value_parenthesis_value, new Object[]{lowerCase6, gl1.y.Q(mVar, R.string.lbl_lbs)}, mVar);
                    mVar.f();
                    return strP6;
                case 7:
                    mVar.C(-807408901);
                    String strP7 = gl1.y.P(R.string.value_parenthesis_value, new Object[]{gl1.y.Q(mVar, R.string.lbl_liters), gl1.y.Q(mVar, R.string.common_abbrev_liter_string)}, mVar);
                    mVar.f();
                    return strP7;
                case 8:
                    mVar.C(-807106868);
                    String lowerCase7 = gl1.y.Q(mVar, R.string.tablespoons_unit).toLowerCase(Locale.ROOT);
                    lowerCase7.getClass();
                    String strP8 = gl1.y.P(R.string.value_parenthesis_value, new Object[]{lowerCase7, gl1.y.Q(mVar, R.string.tablespoon_abbreviation)}, mVar);
                    mVar.f();
                    return strP8;
                case 9:
                    mVar.C(-808296555);
                    String strQ = gl1.y.Q(mVar, R.string.common_cups);
                    Locale locale = Locale.ROOT;
                    String lowerCase8 = strQ.toLowerCase(locale);
                    lowerCase8.getClass();
                    String lowerCase9 = gl1.y.Q(mVar, R.string.lbl_cup).toLowerCase(locale);
                    lowerCase9.getClass();
                    String strP9 = gl1.y.P(R.string.value_parenthesis_value, new Object[]{lowerCase8, lowerCase9}, mVar);
                    mVar.f();
                    return strP9;
                case 10:
                    mVar.C(-806795938);
                    String lowerCase10 = gl1.y.Q(mVar, R.string.scoops_unit).toLowerCase(Locale.ROOT);
                    lowerCase10.getClass();
                    String strP10 = gl1.y.P(R.string.value_parenthesis_value, new Object[]{lowerCase10, gl1.y.Q(mVar, R.string.scoop_unit)}, mVar);
                    mVar.f();
                    return strP10;
                case 11:
                    mVar.C(-806502306);
                    String lowerCase11 = gl1.y.Q(mVar, R.string.slices_unit).toLowerCase(Locale.ROOT);
                    lowerCase11.getClass();
                    String strP11 = gl1.y.P(R.string.value_parenthesis_value, new Object[]{lowerCase11, gl1.y.Q(mVar, R.string.slice_unit)}, mVar);
                    mVar.f();
                    return strP11;
                case 12:
                    mVar.C(-806208674);
                    String lowerCase12 = gl1.y.Q(mVar, R.string.pieces_unit).toLowerCase(Locale.ROOT);
                    lowerCase12.getClass();
                    String strP12 = gl1.y.P(R.string.value_parenthesis_value, new Object[]{lowerCase12, gl1.y.Q(mVar, R.string.piece_unit)}, mVar);
                    mVar.f();
                    return strP12;
                case 13:
                    mVar.C(-805913089);
                    String lowerCase13 = gl1.y.Q(mVar, R.string.servings).toLowerCase(Locale.ROOT);
                    lowerCase13.getClass();
                    String strP13 = gl1.y.P(R.string.value_parenthesis_value, new Object[]{lowerCase13, gl1.y.Q(mVar, R.string.serving_unit)}, mVar);
                    mVar.f();
                    return strP13;
                case 14:
                    return sn.a.h(mVar, -580177249, R.string.lbl_empty_string, mVar);
                default:
                    throw n23.j.m(mVar, -580300708);
            }
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<c> serializer() {
            return (i63.c) c.f74105b.getValue();
        }

        private Companion() {
        }
    }
}
