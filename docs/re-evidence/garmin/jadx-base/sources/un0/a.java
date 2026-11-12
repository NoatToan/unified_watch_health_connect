package un0;

import android.content.Context;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import g22.n;
import i3.e5;
import in0.h;
import in0.m;
import j23.g;
import lc.u0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lun0/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f172042b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.a f172043a;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f172044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f172045b;

        static {
            int[] iArr = new int[h.a.C1802a.EnumC1803a.values().length];
            try {
                iArr[h.a.C1802a.EnumC1803a.BELOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.a.C1802a.EnumC1803a.ABOVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.a.C1802a.EnumC1803a.IN_RANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f172044a = iArr;
            int[] iArr2 = new int[m.values().length];
            try {
                iArr2[m.HEART_RATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[m.HRV.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[m.RESPIRATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[m.PULSE_OX.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[m.SKIN_TEMP_C.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[m.SKIN_TEMP_F.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            f172045b = iArr2;
        }
    }

    static {
        new C3207a(null);
        f172042b = 8;
    }

    public a(Context context) {
        context.getClass();
        this.f172043a = new l22.a(context);
    }

    public static String c(a aVar, Double d14, boolean z14, int i14) {
        if ((i14 & 2) != 0) {
            z14 = true;
        }
        return aVar.p(d14 != null ? String.valueOf((int) d14.doubleValue()) : null, z14 ? aVar.q() : null, StringUtils.SPACE);
    }

    public static String f(a aVar, Double d14, int i14) {
        return aVar.p(d14 != null ? String.valueOf((int) d14.doubleValue()) : null, (i14 & 2) != 0 ? aVar.f172043a.getString(R.string.lbl_bpm) : null, StringUtils.SPACE);
    }

    public static String h(a aVar, String str, String str2, String str3, int i14) {
        int i15 = (i14 & 8) != 0 ? R.string.distance_range_with_unit : R.string.string_line_string_pattern_no_space;
        l22.a aVar2 = aVar.f172043a;
        return str3 != null ? aVar2.a(i15, str, str2, str3) : aVar2.a(R.string.string_line_string_pattern_no_space, str, str2);
    }

    public static String m(a aVar, Double d14, int i14) {
        String str;
        boolean z14 = (i14 & 2) != 0;
        if (d14 != null) {
            double dDoubleValue = d14.doubleValue();
            str = dDoubleValue == 0.0d ? "0" : l3.f23126d.format(dDoubleValue);
        } else {
            str = null;
        }
        return aVar.p(str, z14 ? aVar.f172043a.getString(R.string.activities_brpm_common_lbl) : null, StringUtils.SPACE);
    }

    public final String a(g<Double> gVar, boolean z14) {
        return h(this, c(this, (Double) gVar.getStart(), false, 4), c(this, (Double) gVar.b(), false, 4), z14 ? q() : null, 24);
    }

    public final String b(g<Double> gVar) {
        return i(c(this, (Double) gVar.getStart(), false, 4), c(this, (Double) gVar.b(), false, 4), q());
    }

    public final String d(Double d14, String str) {
        str.getClass();
        return e5.g(str, ": ", c(this, d14, true, 4));
    }

    public final String e(g<Double> gVar, boolean z14) {
        return h(this, f(this, (Double) gVar.getStart(), 4), f(this, (Double) gVar.b(), 4), z14 ? this.f172043a.getString(R.string.lbl_bpm) : null, 24);
    }

    public final String g(m mVar, g<Double> gVar, boolean z14) {
        mVar.getClass();
        switch (b.f172045b[mVar.ordinal()]) {
            case 1:
                return e(gVar, z14);
            case 2:
                return a(gVar, z14);
            case 3:
                return l(gVar, z14);
            case 4:
                return j(gVar, z14);
            case 5:
            case 6:
                return n(gVar);
            default:
                u0.r();
                return null;
        }
    }

    public final String i(String str, String str2, String str3) {
        return this.f172043a.a(R.string.msg_typical_range_content_description, str, str2, str3);
    }

    public final String j(g<Double> gVar, boolean z14) {
        return h(this, k((Double) gVar.getStart(), z14), k((Double) gVar.b(), z14), null, 16);
    }

    public final String k(Double d14, boolean z14) {
        return p(d14 != null ? String.valueOf((int) d14.doubleValue()) : null, z14 ? this.f172043a.getString(R.string.percent_sign) : null, "");
    }

    public final String l(g<Double> gVar, boolean z14) {
        return h(this, m(this, (Double) gVar.getStart(), 4), m(this, (Double) gVar.b(), 4), z14 ? this.f172043a.getString(R.string.activities_brpm_common_lbl) : null, 24);
    }

    public final String n(g<Double> gVar) {
        return this.f172043a.a(R.string.lbl_value1_to_value2, o((Double) gVar.getStart()), o((Double) gVar.b()));
    }

    public final String o(Double d14) {
        String str;
        if (d14 != null) {
            double dDoubleValue = d14.doubleValue();
            if (dDoubleValue == 0.0d) {
                str = "0";
            } else {
                l3.f23124b.getClass();
                str = l3.f23134l.format(dDoubleValue);
            }
        } else {
            str = null;
        }
        return p(str, this.f172043a.getString(R.string.lbl_degree_sign), "");
    }

    public final String p(String str, String str2, String str3) {
        if (n.d(str)) {
            return n.d(str2) ? e5.g(str, str3, str2) : String.valueOf(str);
        }
        return this.f172043a.getString(R.string.no_value_card);
    }

    public final String q() {
        return this.f172043a.getString(R.string.lbl_ms);
    }

    /* JADX INFO: renamed from: un0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lun0/a$a;", "", "<init>", "()V", "", "DEFAULT_DIVIDER", "Ljava/lang/String;", "NO_DIVIDER", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3207a {
        public /* synthetic */ C3207a(j jVar) {
            this();
        }

        private C3207a() {
        }
    }
}
