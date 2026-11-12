package am;

import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes7.dex */
public final class g2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g2 f3976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g2 f3977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g2 f3978g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g2 f3979h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g2 f3980i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ g2[] f3981j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f3984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f3985d;

    static {
        qs.y yVar = qs.y.UNIT_DISTANCE_YARD;
        g2 g2Var = new g2("YARDS_25", 0, "25", R.string.common_n_yards_label, 25.0d, yVar.f147239a, R.string.common_yards_string);
        f3976e = g2Var;
        qs.y yVar2 = qs.y.UNIT_DISTANCE_METER;
        g2 g2Var2 = new g2("METERS_25", 1, "25", R.string.common_n_meters_label, 25.0d, yVar2.f147239a, R.string.common_meters_string);
        f3977f = g2Var2;
        g2 g2Var3 = new g2("YARDS_33", 2, "33 1/3", R.string.common_n_yards_label, 33.33d, yVar.f147239a, R.string.common_yards_string);
        g2 g2Var4 = new g2("METERS_33", 3, "33 1/3", R.string.common_n_meters_label, 33.33d, yVar2.f147239a, R.string.common_meters_string);
        f3978g = g2Var4;
        g2 g2Var5 = new g2("METERS_50", 4, "50", R.string.common_n_meters_label, 50.0d, yVar2.f147239a, R.string.common_meters_string);
        f3979h = g2Var5;
        g2 g2Var6 = new g2("CUSTOM", 5, "", R.string.lbl_custom, -1.0d, null, -1);
        f3980i = g2Var6;
        f3981j = new g2[]{g2Var, g2Var2, g2Var3, g2Var4, g2Var5, g2Var6};
    }

    private g2(String str, int i14, String str2, int i15, double d14, String str3, int i16) {
        super(str, i14);
        this.f3982a = str2;
        this.f3983b = i15;
        this.f3984c = d14;
        this.f3985d = str3;
    }

    public static g2 a(double d14, String str) {
        boolean zEquals = gg1.o0.METRIC.f77291a.equals(str);
        g2 g2Var = f3980i;
        if (zEquals) {
            return b(d14, qs.y.UNIT_DISTANCE_METER.f147239a, g2Var);
        }
        m3 m3Var = m3.METER;
        m3 m3Var2 = m3.YARD;
        l3.f23124b.getClass();
        return b(l3.a.g(d14, m3Var, m3Var2), qs.y.UNIT_DISTANCE_YARD.f147239a, g2Var);
    }

    public static g2 b(double d14, String str, g2 g2Var) {
        for (g2 g2Var2 : values()) {
            if (Math.abs(g2Var2.f3984c - d14) <= 0.001d && str.equals(g2Var2.f3985d)) {
                return g2Var2;
            }
        }
        return g2Var;
    }

    public static g2 valueOf(String str) {
        return (g2) Enum.valueOf(g2.class, str);
    }

    public static g2[] values() {
        return (g2[]) f3981j.clone();
    }
}
