package x61;

import am.x0;
import am.z0;
import android.content.res.Resources;
import android.util.TypedValue;
import c22.j0;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.performance.trainingload.model.ExerciseLoadRecordDto;
import gg1.o0;
import j20.x;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lx61/k;", "Lx61/s;", "Ll22/b;", "resolver", "Landroid/content/res/Resources;", "resource", "<init>", "(Ll22/b;Landroid/content/res/Resources;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f189260e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l22.b f189261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Resources f189262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.t f189263d;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f189264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f189265b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f189266c;

        static {
            int[] iArr = new int[a71.p.values().length];
            try {
                iArr[a71.p.NO_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a71.p.NO_DATA_WITH_LATEST_ACUTE_LOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a71.p.NO_DATA_WITH_LATEST_WORKLOAD_RATIO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a71.p.AVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f189264a = iArr;
            int[] iArr2 = new int[com.garmin.android.apps.connectmobile.performance.model.b.values().length];
            try {
                iArr2[com.garmin.android.apps.connectmobile.performance.model.b.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            f189265b = iArr2;
            int[] iArr3 = new int[com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c.values().length];
            try {
                iArr3[com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c.CYCLING.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c.ROWING.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            f189266c = iArr3;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l22.b bVar, Resources resources) {
        super(bVar, resources);
        bVar.getClass();
        resources.getClass();
        this.f189261b = bVar;
        this.f189262c = resources;
        this.f189263d = o13.m.b(new x1.b(3));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006c A[PHI: r8
      0x006c: PHI (r8v27 java.lang.String) = (r8v24 java.lang.String), (r8v30 java.lang.String) binds: [B:32:0x0095, B:18:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x011f A[PHI: r8
      0x011f: PHI (r8v6 java.lang.String) = (r8v3 java.lang.String), (r8v8 java.lang.String) binds: [B:86:0x0148, B:72:0x011c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public final j a(com.garmin.android.apps.connectmobile.performance.model.b bVar, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, boolean z14, int i14, boolean z15) {
        String str;
        String str2;
        int i15 = bVar.f39938e;
        l22.b bVar2 = this.f189261b;
        String string = bVar2.getString(i15);
        int i16 = bVar.f39935b;
        ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
        int color = this.f189262c.getColor(i16, null);
        String strI = com.nimbusds.jose.shaded.gson.internal.a.i("yyyy-MM-dd", dateTime3);
        String strI2 = com.nimbusds.jose.shaded.gson.internal.a.i("yyyy-MM-dd", dateTime4);
        DateTime dateTimeNow = DateTime.now();
        String strA = "";
        if (z14 && g22.k.e(dateTimeNow, dateTime, dateTime2.plusDays(1))) {
            if (z15) {
                j0 j0Var = j0.f23099a;
                DateTime dateTimeI = j0.I(strI);
                if (dateTimeI == null) {
                    dateTimeI = dateTimeNow;
                }
                dateTimeI.getClass();
                DateTime dateTimeI2 = j0.I(strI2);
                if (dateTimeI2 != null) {
                    dateTimeNow = dateTimeI2;
                }
                dateTimeNow.getClass();
                j0Var.getClass();
                o13.p pVarS = j0.s(dateTimeI, dateTimeNow, true, z15);
                str2 = pVarS != null ? (String) pVarS.f128595b : null;
                if (str2 != null) {
                    strA = str2;
                }
            } else {
                j0 j0Var2 = j0.f23099a;
                DateTime dateTimeI3 = j0.I(strI);
                if (dateTimeI3 == null) {
                    dateTimeI3 = dateTimeNow;
                }
                dateTimeI3.getClass();
                DateTime dateTimeI4 = j0.I(strI2);
                if (dateTimeI4 != null) {
                    dateTimeNow = dateTimeI4;
                }
                dateTimeNow.getClass();
                j0Var2.getClass();
                o13.p pVarS2 = j0.s(dateTimeI3, dateTimeNow, true, z15);
                str2 = pVarS2 != null ? (String) pVarS2.f128594a : null;
                if (str2 != null) {
                    strA = str2;
                }
            }
            if (!z15) {
                strA = bVar2.a(R.string.lbl_common_since_date, strA);
            }
        } else {
            boolean zEquals = strI.equals(strI2);
            if (!zEquals && !z15) {
                j0 j0Var3 = j0.f23099a;
                DateTime dateTimeI5 = j0.I(strI);
                if (dateTimeI5 == null) {
                    dateTimeI5 = dateTimeNow;
                }
                dateTimeI5.getClass();
                DateTime dateTimeI6 = j0.I(strI2);
                if (dateTimeI6 != null) {
                    dateTimeNow = dateTimeI6;
                }
                dateTimeNow.getClass();
                j0Var3.getClass();
                o13.p pVarS3 = j0.s(dateTimeI5, dateTimeNow, zEquals, z15);
                String str3 = pVarS3 != null ? (String) pVarS3.f128594a : null;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = pVarS3 != null ? (String) pVarS3.f128595b : null;
                strA = bVar2.a(R.string.string_line_string_pattern, str3, str4 != null ? str4 : "");
            } else if (zEquals) {
                j0 j0Var4 = j0.f23099a;
                DateTime dateTimeI7 = j0.I(strI);
                if (dateTimeI7 == null) {
                    dateTimeI7 = dateTimeNow;
                }
                dateTimeI7.getClass();
                DateTime dateTimeI8 = j0.I(strI2);
                if (dateTimeI8 != null) {
                    dateTimeNow = dateTimeI8;
                }
                dateTimeNow.getClass();
                j0Var4.getClass();
                o13.p pVarS4 = j0.s(dateTimeI7, dateTimeNow, zEquals, z15);
                str = pVarS4 != null ? (String) pVarS4.f128594a : null;
                if (str != null) {
                    strA = str;
                }
            } else {
                j0 j0Var5 = j0.f23099a;
                DateTime dateTimeI9 = j0.I(strI);
                if (dateTimeI9 == null) {
                    dateTimeI9 = dateTimeNow;
                }
                dateTimeI9.getClass();
                DateTime dateTimeI10 = j0.I(strI2);
                if (dateTimeI10 != null) {
                    dateTimeNow = dateTimeI10;
                }
                dateTimeNow.getClass();
                j0Var5.getClass();
                o13.p pVarS5 = j0.s(dateTimeI9, dateTimeNow, zEquals, z15);
                str = pVarS5 != null ? (String) pVarS5.f128595b : null;
                if (str != null) {
                    strA = str;
                }
            }
        }
        return new j(string, color, strA, bVar != com.garmin.android.apps.connectmobile.performance.model.b.UNKNOWN, ((g22.k.a(dateTime3, dateTime4) + 1) / i14) * 100, bVar == com.garmin.android.apps.connectmobile.performance.model.b.PAUSE);
    }

    public final j b(int i14, DateTime dateTime, DateTime dateTime2) {
        int i15 = com.garmin.android.apps.connectmobile.performance.model.b.UNKNOWN.f39935b;
        ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
        return new j("", this.f189262c.getColor(i15, null), "", false, ((g22.k.a(dateTime, dateTime2) + 1) / i14) * 100, false, 32, null);
    }

    public final String c(String str, com.garmin.android.apps.connectmobile.performance.model.b bVar) {
        if (b.f189265b[bVar.ordinal()] == 1 || str == null) {
            return null;
        }
        DateTime dateTimeK = j0.K(str, "yyyy-MM-dd");
        return this.f189261b.a(R.string.lbl_common_since_date, com.nimbusds.jose.shaded.gson.internal.a.i("MMM d", dateTimeK != null ? dateTimeK.withTimeAtStartOfDay() : null));
    }

    public final zz.l d(ExerciseLoadRecordDto exerciseLoadRecordDto, boolean z14) {
        DateTime dateTimeNow;
        String strG;
        int i14;
        e71.l lVarA;
        pi0.e eVar = (pi0.e) this.f189263d.getValue();
        String str = exerciseLoadRecordDto.f40248c;
        if (str == null || (dateTimeNow = j0.K(str, "yyyy-MM-dd'T'HH:mm:ss")) == null) {
            dateTimeNow = DateTime.now();
            dateTimeNow.getClass();
        }
        String strA = eVar.a(dateTimeNow, qi0.a.NUMERIC_YEAR_MONTH_DAY);
        if (z14) {
            Double d14 = exerciseLoadRecordDto.f40253h;
            strG = g(d14 != null ? d14.doubleValue() : 0.0d, true);
        } else {
            Double d15 = exerciseLoadRecordDto.f40252g;
            strG = g(d15 != null ? d15.doubleValue() : 0.0d, true);
        }
        if (z14) {
            e71.l.c cVar = e71.l.f63316d;
            String str2 = exerciseLoadRecordDto.f40254i;
            cVar.getClass();
            i14 = e71.l.c.a(str2).f63319c;
        } else {
            e71.l.c cVar2 = e71.l.f63316d;
            String str3 = exerciseLoadRecordDto.f40247b;
            cVar2.getClass();
            i14 = e71.l.c.a(str3).f63319c;
        }
        String string = this.f189261b.getString(i14);
        if (z14) {
            e71.l.c cVar3 = e71.l.f63316d;
            String str4 = exerciseLoadRecordDto.f40254i;
            cVar3.getClass();
            lVarA = e71.l.c.a(str4);
        } else {
            e71.l.c cVar4 = e71.l.f63316d;
            String str5 = exerciseLoadRecordDto.f40247b;
            cVar4.getClass();
            lVarA = e71.l.c.a(str5);
        }
        return new zz.l(strA, strG, string, null, null, Integer.valueOf(lVarA.f63318b), null, null, 216, null);
    }

    public final String e(String str) {
        e71.l.f63316d.getClass();
        Integer num = e71.l.c.a(str).f63317a;
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        l22.b bVar = this.f189261b;
        return bVar.a(R.string.string_colon_string_pattern, bVar.getString(R.string.lbl_benefit), bVar.getString(iIntValue));
    }

    public final String f(ExerciseLoadRecordDto exerciseLoadRecordDto, o0 o0Var) {
        int i14;
        m3 m3Var = o0Var == o0.METRIC ? m3.KILOMETER : m3.MILE;
        l3.a aVar = l3.f23124b;
        Double d14 = exerciseLoadRecordDto.f40249d;
        double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
        DecimalFormat decimalFormat = l3.f23126d;
        aVar.getClass();
        String strN = l3.a.N(dDoubleValue, m3Var, decimalFormat);
        String str = exerciseLoadRecordDto.f40250e;
        if (str == null) {
            str = "";
        }
        z0 z0Var = z0.f4390a;
        if (z0.b(x0.f4308n, str)) {
            i14 = R.string.lbl_run;
        } else {
            String str2 = exerciseLoadRecordDto.f40250e;
            if (str2 == null) {
                str2 = "";
            }
            if (z0.b(x0.f4312o, str2)) {
                i14 = R.string.lbl_ride;
            } else {
                String str3 = exerciseLoadRecordDto.f40250e;
                i14 = z0.b(x0.f4324r, str3 != null ? str3 : "") ? R.string.lbl_swim : R.string.device_screen_activity;
            }
        }
        int i15 = m3Var.f23164e;
        l22.b bVar = this.f189261b;
        return x.d(strN, StringUtils.SPACE, bVar.getString(i15), StringUtils.SPACE, hb.a.i(bVar.getString(i14)));
    }

    public final String g(double d14, boolean z14) {
        l22.b bVar = this.f189261b;
        if (z14) {
            return org.apache.commons.lang3.e.d(MathKt.b(d14), StringUtils.SPACE, bVar.getString(R.string.lbl_training_status_load));
        }
        return vb.h.h(MathKt.b(d14), bVar.getString(R.string.lbl_training_status_load), ": ");
    }

    public final String h(Double d14, e71.m mVar, boolean z14) {
        if (d14 == null || mVar == null || mVar.equals(new e71.n())) {
            return null;
        }
        if (z14) {
            return NumberFormat.getIntegerInstance().format(Integer.valueOf((int) d14.doubleValue())).toString();
        }
        Integer num = mVar.f63321a;
        l22.b bVar = this.f189261b;
        return bVar.a(R.string.string_line_string_pattern, NumberFormat.getIntegerInstance().format(Integer.valueOf((int) d14.doubleValue())).toString(), num != null ? bVar.getString(num.intValue()) : "");
    }

    public final String i(Double d14, Double d15, boolean z14) {
        if (d14 == null) {
            return "";
        }
        a61.e eVar = a61.e.f1563a;
        double dDoubleValue = d14.doubleValue();
        eVar.getClass();
        if (!a61.e.k(dDoubleValue)) {
            return "";
        }
        if (z14) {
            return String.valueOf((int) d14.doubleValue());
        }
        Integer numValueOf = Integer.valueOf((int) d14.doubleValue());
        double[] dArrG = a61.e.g();
        double dDoubleValue2 = d15 != null ? d15.doubleValue() : d14.doubleValue();
        dArrG.getClass();
        eVar.getClass();
        q71.a aVarB = a61.e.b(dDoubleValue2, dArrG);
        q71.a aVar = q71.a.POOR;
        l22.b bVar = this.f189280a;
        return this.f189261b.a(R.string.format, numValueOf, aVarB == aVar ? bVar.getString(R.string.lbl_poor) : bVar.getString(aVarB.f143227a));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lx61/k$a;", "", "<init>", "()V", "", "FOUR_WEEKS", "I", "TWELVE_WEEKS", "TWENTY_SIX_WEEKS", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
