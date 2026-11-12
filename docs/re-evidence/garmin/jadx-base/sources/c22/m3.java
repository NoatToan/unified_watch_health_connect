package c22;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 c22.m3[], still in use, count: 1, list:
  (r0v1 c22.m3[]) from 0x0107: CONSTRUCTOR (r0v1 c22.m3[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB1\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lc22/m3;", "", "", "isMetric", "", "downMultiplier", "upMultiplier", "otherMeasuringSystemConversionMultiplier", "", "unitResId", "<init>", "(Ljava/lang/String;IZDDDI)V", "a", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m3 {
    MILLIMETER(true, 10.0d, 0.1d, 0.0393701d, R.string.lbl_mm),
    CENTIMETER(true, 100.0d, 0.01d, 0.393701d, R.string.lbl_cm),
    METER(true, 1000.0d, 0.001d, 39.3701d, R.string.lbl_meter),
    KILOMETER(true, 1.0d, 1.0d, 39370.1d, R.string.lbl_km),
    INCH(false, 12.0d, 0.08333333333333333d, 25.4d, R.string.lbl_inch),
    FOOT(false, 3.0d, 0.3333333333333333d, 304.8d, R.string.lbl_foot),
    YARD(false, 1760.0d, 5.681818181818182E-4d, 914.4d, R.string.lbl_yard),
    MILE(false, 1.0d, 1.0d, 1609344.0d, R.string.lbl_mile),
    UNSPECIFIED(false, 1.0d, 1.0d, 0.0d, R.string.lbl_empty_string),
    NAUTICAL(false, 1852.0d, 5.39957E-4d, 1.0d, R.string.lbl_nautical_miles_abr);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f23147f = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ w13.c f23159r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f23161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f23162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f23163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23164e;

    static {
        f23159r = new w13.c(new m3[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9});
    }

    private m3(boolean z14, double d14, double d15, double d16, int i14) {
        super(str, i);
        this.f23160a = z14;
        this.f23161b = d14;
        this.f23162c = d15;
        this.f23163d = d16;
        this.f23164e = i14;
    }

    public static m3 valueOf(String str) {
        return (m3) Enum.valueOf(m3.class, str);
    }

    public static m3[] values() {
        return (m3[]) f23158q.clone();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getF23160a() {
        return this.f23160a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc22/m3$a;", "", "<init>", "()V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: c22.m3$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0344a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f23165a;

            static {
                int[] iArr = new int[m3.values().length];
                try {
                    iArr[m3.MILLIMETER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[m3.CENTIMETER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[m3.METER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[m3.KILOMETER.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[m3.INCH.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[m3.FOOT.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[m3.YARD.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[m3.MILE.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                f23165a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static double a(m3 m3Var, m3 m3Var2) {
            boolean z14;
            m3Var.getClass();
            m3Var2.getClass();
            m3 m3Var3 = m3.NAUTICAL;
            if (m3Var == m3Var3) {
                return m3Var3.f23161b;
            }
            if (m3Var2 == m3Var3) {
                return m3Var3.f23162c;
            }
            boolean z15 = m3Var.f23160a;
            boolean z16 = m3Var2.f23160a;
            double d14 = 1.0d;
            if (z15 != z16) {
                d14 = 1.0d * m3Var.f23163d;
                m3Var = z16 ? m3.MILLIMETER : m3.INCH;
            }
            if (m3Var.ordinal() > m3Var2.ordinal()) {
                z14 = false;
            } else {
                z14 = true;
                m3Var2 = m3Var;
                m3Var = m3Var2;
            }
            switch (C0344a.f23165a[m3Var2.ordinal()]) {
                case 1:
                    m3 m3Var4 = m3.MILLIMETER;
                    if (m3Var != m3Var4) {
                        double d15 = d14 * (z14 ? m3Var4.f23162c : m3Var4.f23161b);
                        m3 m3Var5 = m3.CENTIMETER;
                        if (m3Var == m3Var5) {
                            return d15;
                        }
                        double d16 = d15 * (z14 ? m3Var5.f23162c : m3Var5.f23161b);
                        m3 m3Var6 = m3.METER;
                        if (m3Var == m3Var6) {
                            return d16;
                        }
                        double d17 = d16 * (z14 ? m3Var6.f23162c : m3Var6.f23161b);
                        m3 m3Var7 = m3.KILOMETER;
                        return d17 * (z14 ? m3Var7.f23162c : m3Var7.f23161b);
                    }
                    return d14;
                case 2:
                    m3 m3Var8 = m3.CENTIMETER;
                    if (m3Var != m3Var8) {
                        double d18 = d14 * (z14 ? m3Var8.f23162c : m3Var8.f23161b);
                        m3 m3Var9 = m3.METER;
                        if (m3Var == m3Var9) {
                            return d18;
                        }
                        double d19 = d18 * (z14 ? m3Var9.f23162c : m3Var9.f23161b);
                        m3 m3Var10 = m3.KILOMETER;
                        return d19 * (z14 ? m3Var10.f23162c : m3Var10.f23161b);
                    }
                    return d14;
                case 3:
                    m3 m3Var11 = m3.METER;
                    if (m3Var != m3Var11) {
                        double d24 = d14 * (z14 ? m3Var11.f23162c : m3Var11.f23161b);
                        m3 m3Var12 = m3.KILOMETER;
                        return d24 * (z14 ? m3Var12.f23162c : m3Var12.f23161b);
                    }
                    return d14;
                case 4:
                    m3 m3Var13 = m3.KILOMETER;
                    return d14 * (z14 ? m3Var13.f23162c : m3Var13.f23161b);
                case 5:
                    m3 m3Var14 = m3.INCH;
                    if (m3Var != m3Var14) {
                        double d25 = d14 * (z14 ? m3Var14.f23162c : m3Var14.f23161b);
                        m3 m3Var15 = m3.FOOT;
                        if (m3Var == m3Var15) {
                            return d25;
                        }
                        double d26 = d25 * (z14 ? m3Var15.f23162c : m3Var15.f23161b);
                        m3 m3Var16 = m3.YARD;
                        if (m3Var == m3Var16) {
                            return d26;
                        }
                        double d27 = d26 * (z14 ? m3Var16.f23162c : m3Var16.f23161b);
                        m3 m3Var17 = m3.MILE;
                        return d27 * (z14 ? m3Var17.f23162c : m3Var17.f23161b);
                    }
                    return d14;
                case 6:
                    m3 m3Var18 = m3.FOOT;
                    if (m3Var != m3Var18) {
                        double d28 = d14 * (z14 ? m3Var18.f23162c : m3Var18.f23161b);
                        m3 m3Var19 = m3.YARD;
                        if (m3Var == m3Var19) {
                            return d28;
                        }
                        double d29 = d28 * (z14 ? m3Var19.f23162c : m3Var19.f23161b);
                        m3 m3Var20 = m3.MILE;
                        return d29 * (z14 ? m3Var20.f23162c : m3Var20.f23161b);
                    }
                    return d14;
                case 7:
                    m3 m3Var21 = m3.YARD;
                    if (m3Var != m3Var21) {
                        double d34 = d14 * (z14 ? m3Var21.f23162c : m3Var21.f23161b);
                        m3 m3Var22 = m3.MILE;
                        return d34 * (z14 ? m3Var22.f23162c : m3Var22.f23161b);
                    }
                    return d14;
                case 8:
                    m3 m3Var23 = m3.MILE;
                    return d14 * (z14 ? m3Var23.f23162c : m3Var23.f23161b);
                default:
                    return d14;
            }
        }

        private a() {
        }
    }
}
