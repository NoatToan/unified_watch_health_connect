package mn1;

import androidx.core.view.j;
import com.garmin.android.apps.connectmobile.R;
import j23.l;
import java.util.Locale;
import km1.c0;
import km1.e;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmn1/d;", "", "Ll22/b;", "resource", "<init>", "(Ll22/b;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f119771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b10.c f119772b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f119773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f119774b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f119775c;

        static {
            int[] iArr = new int[c0.values().length];
            try {
                iArr[c0.SLEEP_HISTORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c0.ACTIVITY_HISTORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c0.HRV_STATUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c0.NAPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f119773a = iArr;
            int[] iArr2 = new int[km1.d.values().length];
            try {
                iArr2[km1.d.HIGH_STRAIN_TODAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[km1.d.HIGH_LOAD_TODAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[km1.d.ACTIVE_DAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[km1.d.HIGH_STRAIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[km1.d.HIGH_LOAD.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[km1.d.HIGH_LONG_TERM_STRAIN.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[km1.d.HIGH_CHRONIC_LOAD.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[km1.d.POOR.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[km1.d.GOOD.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[km1.d.UNBALANCED.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[km1.d.BALANCED.ordinal()] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[km1.d.INVALID.ordinal()] = 12;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[km1.d.LOW.ordinal()] = 13;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[km1.d.ACTIVE_TRAINING.ordinal()] = 14;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[km1.d.NO_STATUS.ordinal()] = 15;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[km1.d.NONE.ordinal()] = 16;
            } catch (NoSuchFieldError unused20) {
            }
            f119774b = iArr2;
            int[] iArr3 = new int[e.values().length];
            try {
                iArr3[e.VERY_ACTIVE_DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[e.MORE_ACTIVE_RECENTLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[e.LESS_ACTIVE_BUT_STILL_CATCHING_UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[e.HIGHLY_ACTIVE_LAST_FEW_WEEKS.ordinal()] = 4;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[e.HIGHLY_ACTIVE_RECENTLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[e.PATTERN_OF_SHORT_SLEEP.ordinal()] = 6;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr3[e.GOOD_SLEEP_DURATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr3[e.LOW_QUALITY_SLEEP_RECENTLY.ordinal()] = 8;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr3[e.HIGH_QUALITY_SLEEP_RECENTLY.ordinal()] = 9;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr3[e.LOWER_THAN_USUAL_RECENTLY.ordinal()] = 10;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr3[e.ADAPTING_WELL_TO_STRAIN.ordinal()] = 11;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr3[e.HARD_TRAINING_TODAY.ordinal()] = 12;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr3[e.HIGH_TRAINING_LOAD_RECENTLY.ordinal()] = 13;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr3[e.LESS_TRAINING_BUT_STILL_CATCHING_UP.ordinal()] = 14;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr3[e.HIGH_CHRONIC_TRAINING_LOAD.ordinal()] = 15;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr3[e.ONE_NAP.ordinal()] = 16;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr3[e.TWO_NAPS.ordinal()] = 17;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr3[e.MORE_THAN_TWO_NAPS.ordinal()] = 18;
            } catch (NoSuchFieldError unused38) {
            }
            f119775c = iArr3;
        }
    }

    public d(l22.b bVar) {
        bVar.getClass();
        this.f119771a = bVar;
        this.f119772b = new b10.c(bVar);
    }

    public final String a(Double d14) {
        return (d14 == null || Double.isNaN(d14.doubleValue()) || Double.isInfinite(d14.doubleValue())) ? e().concat("%") : j.f((int) d14.doubleValue(), "%");
    }

    public final String b(int i14) {
        String strC = this.f119772b.f14213c.c(i14);
        return strC.length() == 0 ? e() : strC;
    }

    public final String c(int i14) {
        b10.c cVar = this.f119772b;
        String strC = cVar.f14213c.c(i14);
        if (strC.length() != 0) {
            return strC;
        }
        String strG = cVar.f14213c.g();
        Locale locale = Locale.getDefault();
        locale.getClass();
        String lowerCase = strG.toLowerCase(locale);
        lowerCase.getClass();
        return "0".concat(lowerCase);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String d(String str) {
        String upperCase;
        if (str != null) {
            Locale locale = Locale.US;
            locale.getClass();
            upperCase = str.toUpperCase(locale);
            upperCase.getClass();
        } else {
            upperCase = null;
        }
        if (upperCase != null) {
            int iHashCode = upperCase.hashCode();
            l22.b bVar = this.f119771a;
            switch (iHashCode) {
                case -30683114:
                    if (upperCase.equals("EXCELLENT")) {
                        return bVar.getString(R.string.lbl_excellent);
                    }
                    break;
                case 2150180:
                    if (upperCase.equals("FAIR")) {
                        return bVar.getString(R.string.lbl_fair);
                    }
                    break;
                case 2193597:
                    if (upperCase.equals("GOOD")) {
                        return bVar.getString(R.string.lbl_good);
                    }
                    break;
                case 2461730:
                    if (upperCase.equals("POOR")) {
                        return bVar.getString(R.string.lbl_poor);
                    }
                    break;
            }
        }
        return e();
    }

    public final String e() {
        return this.f119771a.getString(R.string.no_value_card);
    }

    public final String f(Integer num) {
        l lVar = new l(90, 100);
        l22.b bVar = this.f119771a;
        if (num != null && lVar.d(num.intValue())) {
            return bVar.getString(R.string.lbl_excellent);
        }
        l lVar2 = new l(80, 89);
        if (num != null && lVar2.d(num.intValue())) {
            return bVar.getString(R.string.lbl_good);
        }
        l lVar3 = new l(60, 79);
        if (num == null || !lVar3.d(num.intValue())) {
            return (num == null || !new l(0, 59).d(num.intValue())) ? e() : bVar.getString(R.string.lbl_poor);
        }
        return bVar.getString(R.string.lbl_fair);
    }

    public final String g() {
        return this.f119771a.getString(R.string.activity_stats_details_total_time_label);
    }
}
