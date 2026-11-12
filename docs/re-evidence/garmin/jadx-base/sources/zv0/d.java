package zv0;

import com.garmin.android.apps.connectmobile.R;
import java.util.Locale;
import lc.u0;
import mw0.o;
import p005kotlin.Metadata;
import pv0.r;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzv0/d;", "", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f207169a = new d();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f207170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f207171b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f207172c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f207173d;

        static {
            int[] iArr = new int[r.values().length];
            try {
                iArr[r.OVERNIGHT_STRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.OVERNIGHT_HRV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r.SLEEP_SCORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f207170a = iArr;
            int[] iArr2 = new int[mw0.r.values().length];
            try {
                iArr2[mw0.r.SUMMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[mw0.r.DETAILS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f207171b = iArr2;
            int[] iArr3 = new int[o.values().length];
            try {
                iArr3[o.QUANTITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[o.TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f207172c = iArr3;
            int[] iArr4 = new int[pv0.a.values().length];
            try {
                iArr4[pv0.a.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[pv0.a.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[pv0.a.MINIMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[pv0.a.UNLOGGED.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            f207173d = iArr4;
        }
    }

    private d() {
    }

    public static String a(r rVar, l22.a aVar) {
        rVar.getClass();
        int i14 = a.f207170a[rVar.ordinal()];
        if (i14 == 1) {
            return aVar.getString(R.string.lbl_avg_overnight_stress);
        }
        if (i14 == 2) {
            return aVar.getString(R.string.title_7d_4w_charts);
        }
        if (i14 == 3) {
            return aVar.getString(R.string.lbl_avg_sleep_score);
        }
        u0.r();
        return null;
    }

    public static String b(r rVar, l22.a aVar) {
        rVar.getClass();
        int i14 = a.f207170a[rVar.ordinal()];
        if (i14 == 1) {
            return aVar.getString(R.string.lbl_avg_overnight_stress);
        }
        if (i14 == 2) {
            return aVar.getString(R.string.title_7d_4w_charts);
        }
        if (i14 == 3) {
            return aVar.getString(R.string.lbl_avg_sleep_score);
        }
        u0.r();
        return null;
    }

    public static String c(r rVar, l22.a aVar) {
        rVar.getClass();
        int i14 = a.f207170a[rVar.ordinal()];
        if (i14 == 1) {
            return aVar.getString(R.string.lbl_avg_overnight_stress);
        }
        if (i14 == 2) {
            return aVar.getString(R.string.lbl_7d_avg);
        }
        if (i14 == 3) {
            return aVar.getString(R.string.lbl_avg_score);
        }
        u0.r();
        return null;
    }

    public static String d(r rVar, l22.a aVar) {
        rVar.getClass();
        int i14 = a.f207170a[rVar.ordinal()];
        if (i14 == 1) {
            String lowerCase = aVar.getString(R.string.lbl_overnight_stress).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            return lowerCase;
        }
        if (i14 == 2) {
            return aVar.getString(R.string.lbl_lifestyle_logging_overnight_hrv);
        }
        if (i14 != 3) {
            u0.r();
            return null;
        }
        String lowerCase2 = aVar.getString(R.string.lbl_sleep_score).toLowerCase(Locale.ROOT);
        lowerCase2.getClass();
        return lowerCase2;
    }

    public static String e(r rVar, l22.a aVar) {
        rVar.getClass();
        int i14 = a.f207170a[rVar.ordinal()];
        if (i14 == 1) {
            return aVar.getString(R.string.lbl_overnight_stress);
        }
        if (i14 == 2) {
            return aVar.getString(R.string.lbl_overnight_hrv);
        }
        if (i14 == 3) {
            return aVar.getString(R.string.lbl_sleep_score);
        }
        u0.r();
        return null;
    }
}
