package wp0;

import com.garmin.android.apps.connectmobile.R;
import d53.s;
import f12.l;
import gg1.n;
import i3.e5;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import jp0.c;
import lc.u0;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import yp0.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lwp0/a;", "", "Ll22/b;", "resource", "<init>", "(Ll22/b;)V", "a", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3469a f186524b = new C3469a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final DecimalFormat f186525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final DecimalFormat f186526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final DecimalFormat f186527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final DecimalFormat f186528f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f186529a;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f186531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f186532b;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.TWELVE_MONTHS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.SEVEN_DAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.MONTHLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g.FOUR_WEEKS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f186531a = iArr;
            int[] iArr2 = new int[q22.b.values().length];
            try {
                iArr2[q22.b.MILLILITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[q22.b.CUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[q22.b.FLUID_OUNCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f186532b = iArr2;
        }
    }

    static {
        RoundingMode roundingMode = RoundingMode.FLOOR;
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0");
        decimalFormat.setRoundingMode(roundingMode);
        f186525c = decimalFormat;
        DecimalFormat decimalFormat2 = new DecimalFormat("#,###,##0.#");
        decimalFormat2.setRoundingMode(roundingMode);
        f186526d = decimalFormat2;
        RoundingMode roundingMode2 = RoundingMode.CEILING;
        DecimalFormat decimalFormat3 = new DecimalFormat("#,###,##0");
        decimalFormat3.setRoundingMode(roundingMode2);
        f186527e = decimalFormat3;
        DecimalFormat decimalFormat4 = new DecimalFormat("#,###,##0.#");
        decimalFormat4.setRoundingMode(roundingMode2);
        f186528f = decimalFormat4;
    }

    public a(l22.b bVar) {
        bVar.getClass();
        this.f186529a = bVar;
    }

    public static double h(double d14) {
        return q22.a.a(d14, q22.b.MILLILITER, c.j(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).d0()));
    }

    public final String a(double d14, q22.b bVar, boolean z14) {
        bVar.getClass();
        f186524b.getClass();
        return b(q22.a.a(d14, q22.b.MILLILITER, bVar), bVar, z14, C3469a.a(bVar), false);
    }

    public final String b(double d14, q22.b bVar, boolean z14, NumberFormat numberFormat, boolean z15) {
        String str;
        int i14;
        String string;
        bVar.getClass();
        int i15 = bVar.f142314c;
        numberFormat.getClass();
        if (Double.isNaN(d14)) {
            str = "";
        } else {
            str = numberFormat.format(d14);
            str.getClass();
        }
        StringBuilder sb3 = new StringBuilder(str);
        if (z14) {
            Double dF = s.f(sb3.toString());
            l22.b bVar2 = this.f186529a;
            if ((dF == null || Double.compare(dF.doubleValue(), 1) != 0) && (i14 = bVar.f142315d) != i15) {
                if (z15) {
                    i14 = bVar.f142313b;
                }
                string = bVar2.getString(i14);
            } else {
                if (z15) {
                    i15 = bVar.f142312a;
                }
                string = bVar2.getString(i15);
            }
            sb3.append(StringUtils.SPACE);
            sb3.append(string);
        }
        return sb3.toString();
    }

    public final String c(double d14, q22.b bVar) {
        bVar.getClass();
        f186524b.getClass();
        return b(q22.a.a(d14, q22.b.MILLILITER, bVar), bVar, true, C3469a.b(bVar), false);
    }

    public final String d(double d14, boolean z14) {
        g gVar = g.SEVEN_DAYS;
        q22.b bVarJ = c.j(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).d0());
        if (gVar == null) {
            return "";
        }
        String strA = a(d14, bVarJ, z14);
        int i14 = b.f186531a[gVar.ordinal()];
        if (i14 == 1) {
            return this.f186529a.a(R.string.lbl_unit_avg_daily, strA);
        }
        if (i14 == 2 || i14 == 3 || i14 == 4) {
            return hb.a.i(strA);
        }
        u0.r();
        return null;
    }

    public final String e(op0.a aVar) {
        aVar.getClass();
        StringBuilder sb3 = new StringBuilder();
        Double volume = aVar.getVolume();
        n nVarG = aVar.g();
        q22.b bVarH = nVarG != null ? c.h(nVarG) : null;
        if (volume == null || bVarH == null) {
            sb3.append(this.f186529a.getString(R.string.no_value));
        } else {
            sb3.append("+ ");
            String strA = a(volume.doubleValue(), bVarH, true);
            Locale locale = Locale.getDefault();
            locale.getClass();
            String lowerCase = strA.toLowerCase(locale);
            lowerCase.getClass();
            sb3.append(lowerCase);
        }
        return sb3.toString();
    }

    public final double f(double d14, q22.b bVar) {
        bVar.getClass();
        String strA = a(d14, bVar, true);
        f186524b.getClass();
        Number number = C3469a.a(bVar).parse(strA);
        if (number != null) {
            return number.doubleValue();
        }
        return 0.0d;
    }

    public final String g(double d14, boolean z14) {
        int i14;
        double dH = h(d14);
        q22.b bVarJ = c.j(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).d0());
        int iCompare = Double.compare(dH, 1);
        l22.b bVar = this.f186529a;
        String string = (iCompare == 0 || (i14 = bVarJ.f142315d) == bVarJ.f142314c) ? bVar.getString(bVarJ.f142314c) : bVar.getString(i14);
        if (z14) {
            string = e5.g(bVar.getString(R.string.common_lbl_avg_daily), StringUtils.SPACE, string);
        }
        return hb.a.i(string);
    }

    /* JADX INFO: renamed from: wp0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lwp0/a$a;", "", "<init>", "()V", "", "INTEGER_FORMAT_PATTERN", "Ljava/lang/String;", "OPTIONAL_SINGLE_DECIMAL_FORMAT_PATTERN", "Ljava/math/RoundingMode;", "valueRoundingMode", "Ljava/math/RoundingMode;", "Ljava/text/NumberFormat;", "integerFormat", "Ljava/text/NumberFormat;", "optionalSingleDecimalFormat", "goalRoundingMode", "goalIntegerFormat", "goalOptionalSingleDecimalFormat", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3469a {

        /* JADX INFO: renamed from: wp0.a$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3470a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f186530a;

            static {
                int[] iArr = new int[q22.b.values().length];
                try {
                    iArr[q22.b.CUP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[q22.b.MILLILITER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[q22.b.FLUID_OUNCE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[q22.b.LITRE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f186530a = iArr;
            }
        }

        public /* synthetic */ C3469a(j jVar) {
            this();
        }

        public static DecimalFormat a(q22.b bVar) {
            bVar.getClass();
            int i14 = C3470a.f186530a[bVar.ordinal()];
            if (i14 != 1 && i14 != 2 && i14 != 3) {
                if (i14 == 4) {
                    return a.f186526d;
                }
                u0.r();
                return null;
            }
            return a.f186525c;
        }

        public static DecimalFormat b(q22.b bVar) {
            bVar.getClass();
            int i14 = C3470a.f186530a[bVar.ordinal()];
            if (i14 != 1 && i14 != 2 && i14 != 3) {
                if (i14 == 4) {
                    return a.f186528f;
                }
                u0.r();
                return null;
            }
            return a.f186527e;
        }

        private C3469a() {
        }
    }
}
