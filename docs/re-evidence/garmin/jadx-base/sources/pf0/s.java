package pf0;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import c22.l1;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lpf0/s;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f137528d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f137529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l22.a f137530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pi0.e f137531c;

    public s(Context context) {
        context.getClass();
        this.f137529a = context;
        this.f137530b = new l22.a(context);
        this.f137531c = new pi0.e(context);
    }

    public static SpannableString a(String str) {
        int i14 = 0;
        int iL = d53.w.L(0, 6, str, "<span>");
        int iL2 = d53.w.L(0, 6, str, "</span>") - 5;
        if (iL == -1) {
            iL2 = str.length() - 1;
        } else {
            i14 = iL;
        }
        SpannableString spannableString = new SpannableString(l1.a(str));
        spannableString.setSpan(new StyleSpan(1), i14, iL2, 33);
        return spannableString;
    }

    public final String b(gf0.a aVar) {
        aVar.getClass();
        return this.f137530b.a(R.string.lbl_ecg_recording_classification, c(aVar));
    }

    public final String c(gf0.a aVar) {
        String rhythmClassification;
        if (aVar == null || (rhythmClassification = aVar.getRhythmClassification()) == null) {
            rhythmClassification = "";
        }
        f137528d.getClass();
        return this.f137530b.getString(a.a(rhythmClassification));
    }

    public final String d(LocalDate localDate) {
        return localDate != null ? this.f137531c.d(localDate, qi0.a.NUMERIC_YEAR_MONTH_DAY) : this.f137530b.getString(R.string.lbl_focus_unset);
    }

    public final String e(gf0.h hVar) {
        int iB;
        hVar.getClass();
        String str = hVar.f77072a;
        if (hVar == gf0.h.NO_SYMPTOMS_LOGGED || str.length() == 0) {
            iB = R.string.lbl_no_symptoms_logged;
        } else {
            f137528d.getClass();
            iB = a.b(str);
        }
        return this.f137530b.getString(iB);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpf0/s$a;", "", "<init>", "()V", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static int a(String str) {
            switch (str.hashCode()) {
                case -1269378420:
                    return !str.equals("INCONCLUSIVE_HR_OVER_120_50") ? R.string.lbl_inconclusive : R.string.lbl_heart_rate_too_high;
                case 2006014:
                    return !str.equals("AFIB") ? R.string.lbl_inconclusive : R.string.lbl_atrial_fibrillation;
                case 438179628:
                    return !str.equals("INCONCLUSIVE_HR_UNDER_50") ? R.string.lbl_inconclusive : R.string.lbl_heart_rate_too_low;
                case 1978934256:
                    return !str.equals("SINUS_NORMAL") ? R.string.lbl_inconclusive : R.string.lbl_sinus_rhythm;
                default:
                    return R.string.lbl_inconclusive;
            }
        }

        public static int b(String str) {
            str.getClass();
            switch (str.hashCode()) {
                case -1035706055:
                    return !str.equals("RAPID_HEARTBEAT") ? R.string.lbl_none : R.string.lbl_rapid_heartbeat;
                case -970436489:
                    return !str.equals("CHEST_TIGHTNESS") ? R.string.lbl_none : R.string.lbl_chest_tightness_or_pain;
                case -358535513:
                    return !str.equals("FATIGUE") ? R.string.lbl_none : R.string.lbl_fatigue;
                case -208348563:
                    return !str.equals("SKIPPED_HEARTBEAT") ? R.string.lbl_none : R.string.lbl_skipped_heartbeat;
                case 75532016:
                    return !str.equals("OTHER") ? R.string.lbl_none : R.string.lbl_other;
                case 834996334:
                    str.equals("NO_SELECTION");
                    return R.string.lbl_none;
                case 940669627:
                    return !str.equals("DIZZINESS") ? R.string.lbl_none : R.string.lbl_dizziness;
                case 1460374030:
                    return !str.equals("FAINTING") ? R.string.lbl_none : R.string.lbl_fainting;
                case 1588639548:
                    return !str.equals("SHORTNESS_OF_BREATH") ? R.string.lbl_none : R.string.lbl_shortness_of_breath;
                case 1606260776:
                    return !str.equals("NO_SYMPTOMS") ? R.string.lbl_none : R.string.lbl_none_ecg;
                default:
                    return R.string.lbl_none;
            }
        }

        private a() {
        }
    }
}
