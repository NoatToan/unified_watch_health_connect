package ks0;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.format.DateFormat;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import d53.u;
import d53.y;
import g22.n;
import i3.e5;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import lc.u0;
import org.joda.time.DateTime;
import org.joda.time.LocalTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.x;
import r22.x1;
import yr0.m;
import yr0.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lks0/c;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f106381g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.a f106382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l3 f106383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x1 f106384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ks0.b f106385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ks0.a f106386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f106387f;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f106388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f106389b;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.PAST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.PAST_PRE_FLIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.ACCLIMATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t.PAST_ACCLIMATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[t.PRE_TRIP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[t.TRAVELING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[t.PAST_PRE_TRIP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[t.PAST_TRAVEL_DAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[t.AT_DESTINATION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f106388a = iArr;
            int[] iArr2 = new int[m.values().length];
            try {
                iArr2[m.SLEEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[m.LIGHT_AVOIDANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[m.LIGHT_EXPOSURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[m.ACTIVITY.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            f106389b = iArr2;
        }
    }

    static {
        new a(null);
    }

    public c(Context context) {
        context.getClass();
        l22.a aVar = new l22.a(context);
        this.f106382a = aVar;
        this.f106383b = new l3(aVar);
        this.f106384c = new x1(context);
        this.f106385d = new ks0.b(aVar);
        this.f106386e = new ks0.a(aVar);
        this.f106387f = DateFormat.is24HourFormat(context);
    }

    public static int e(m mVar) {
        int i14;
        if (mVar == null || (i14 = b.f106389b[mVar.ordinal()]) == 1) {
            return R.color.gcm_jet_lag_guidance_sleep;
        }
        if (i14 == 2 || i14 == 3) {
            return R.color.gcm_jet_lag_guidance_seek_avoid_light;
        }
        if (i14 == 4) {
            return R.color.gcm_jet_lag_guidance_active;
        }
        u0.r();
        return 0;
    }

    public final String a(DateTime dateTime, DateTime dateTime2) {
        if (dateTime == null || dateTime2 == null) {
            return this.f106382a.getString(R.string.lbl_unknown);
        }
        String str = this.f106387f ? "MMMM d, yyyy @ HH:mm" : "MMMM d, yyyy @ h:mm aa";
        return e5.g(dateTime.toString(str), " - ", dateTime2.toString(str));
    }

    public final CharSequence b(Double d14) {
        Object obj;
        l22.a aVar = this.f106382a;
        if (d14 == null) {
            return x1.b(this.f106384c, aVar.getString(R.string.no_value_card), R.style.Text_Title1_Primary);
        }
        boolean z14 = d14.doubleValue() > 0.0d;
        double dAbs = Math.abs(d14.doubleValue());
        if (s.c(d14, 0.0d)) {
            obj = "";
        } else {
            obj = z14 ? '+' : '-';
        }
        String string = aVar.getString(R.string.lbl_hours_abbreviation);
        return obj + (dAbs % ((double) 1) == 0.0d ? Integer.valueOf((int) dAbs) : Double.valueOf(((double) MathKt.b(dAbs * 10.0d)) / 10.0d)) + string;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final SpannableStringBuilder c(Integer num) {
        x1 x1Var = this.f106384c;
        if (num == null) {
            return x1.b(x1Var, this.f106382a.getString(R.string.no_value_card), R.style.Text_Title1_Primary);
        }
        LocalTime localTimePlusMinutes = LocalTime.now().plusMinutes(num.intValue());
        boolean z14 = this.f106387f;
        String string = localTimePlusMinutes.toString(z14 ? "HH:mm" : "h:mm a");
        string.getClass();
        SpannableStringBuilder spannableStringBuilderB = x1.b(x1Var, string, R.style.Text_Title1_Primary);
        return z14 ? spannableStringBuilderB : x1Var.a(spannableStringBuilderB, R.style.PieChartCenterPrimaryValueTimePeriod, y.t0(2, string));
    }

    public final String d(boolean z14, boolean z15, float f14) throws ParseException {
        String strV;
        float f15 = 60;
        float f16 = f14 / f15;
        float f17 = f14 % f15;
        boolean z16 = this.f106387f;
        if (z14 || f17 > 0.0f) {
            if (z16) {
                strV = "H:mm";
            } else {
                strV = "h:mm a";
                if (z15) {
                    strV = u.v("h:mm a", " a", "", false);
                }
            }
        } else if (z16) {
            strV = "H";
        } else {
            strV = "h a";
            if (z15) {
                strV = u.v("h a", " a", "", false);
            }
        }
        Date date = new SimpleDateFormat("HH:mm", Locale.getDefault()).parse(((int) f16) + ":" + ((int) f17));
        String str = new SimpleDateFormat(strV, Locale.getDefault()).format(date != null ? date : "");
        str.getClass();
        return str;
    }

    public final String f(m mVar) {
        l22.a aVar = this.f106382a;
        if (mVar == null) {
            return aVar.getString(R.string.no_value);
        }
        int i14 = b.f106389b[mVar.ordinal()];
        if (i14 == 1) {
            return aVar.getString(R.string.concept_sleep);
        }
        if (i14 == 2) {
            return aVar.getString(R.string.lbl_avoid_light);
        }
        if (i14 == 3) {
            return aVar.getString(R.string.lbl_seek_light);
        }
        if (i14 == 4) {
            return aVar.getString(R.string.lbl_be_active);
        }
        u0.r();
        return null;
    }

    public final String g(Integer num, t tVar) {
        Integer numValueOf;
        ns0.b.f127812a.getClass();
        boolean zR = h0.R(x.k(t.PAST_NO_GUIDANCE, t.PAST, t.PAST_ACCLIMATED, t.PAST_PRE_TRIP, t.PAST_TRAVEL_DAY, t.PAST_PRE_FLIGHT), tVar);
        if (num != null && num.intValue() == 1) {
            numValueOf = Integer.valueOf(zR ? R.string.lbl_no_jet_lag : R.string.lbl_no_jet_lag_expected);
        } else if (num != null && num.intValue() == 2) {
            numValueOf = Integer.valueOf(zR ? R.string.lbl_mild_jet_lag : R.string.lbl_mild_jet_lag_expected);
        } else if (num != null && num.intValue() == 3) {
            numValueOf = Integer.valueOf(zR ? R.string.lbl_moderate_jet_lag : R.string.lbl_moderate_jet_lag_expected);
        } else if (num != null && num.intValue() == 4) {
            numValueOf = Integer.valueOf(zR ? R.string.lbl_significant_jet_lag : R.string.lbl_significant_jet_lag_expected);
        } else if (num != null && num.intValue() == 5) {
            numValueOf = Integer.valueOf(zR ? R.string.lbl_severe_jet_lag : R.string.lbl_severe_jet_lag_expected);
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return this.f106382a.getString(numValueOf.intValue());
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    public final String h(t tVar) {
        int i14;
        if (tVar == null || x.k(t.ACCLIMATED, t.PAST_ACCLIMATED, t.PAST_NO_GUIDANCE).contains(tVar)) {
            return null;
        }
        int i15 = b.f106388a[tVar.ordinal()];
        if (i15 == 1) {
            i14 = R.string.lbl_felt_like;
        } else if (i15 != 2) {
            switch (i15) {
                case 5:
                case 6:
                case 7:
                case 8:
                    i14 = R.string.lbl_destination;
                    break;
                case 9:
                    i14 = R.string.lbl_feels_like;
                    break;
                default:
                    i14 = R.string.unknown;
                    break;
            }
        } else {
            i14 = R.string.lbl_destination;
        }
        return n.a(this.f106382a.getString(i14));
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\t¨\u0006\u0012"}, d2 = {"Lks0/c$a;", "", "<init>", "()V", "", "ONE_HOUR_IN_MINUTES", "I", "", "EMPTY_STRING", "Ljava/lang/String;", "", "PLUS_SYMBOL", "C", "MINUS_SYMBOL", "GMT_STRING", "DOT_SYMBOL", "DATE_FORMAT_FULL_MONTH_DAY_YEAR_SEPARATOR_12_HOUR", "DATE_FORMAT_FULL_MONTH_DAY_YEAR_SEPARATOR_24_HOUR", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
