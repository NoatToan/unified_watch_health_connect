package x52;

import com.garmin.android.apps.connectmobile.R;
import m52.k;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB/\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00020\u0007\"\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lx52/c;", "", "", "conditionTypeNameResourceID", "", "minimum", "maximum", "", "defaultValue", "<init>", "(Ljava/lang/String;IIDD[D)V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum c {
    TIME(R.string.lbl_time, 0.0d, 6000001.0d, 180.0d, 180.0d, 180.0d, 180.0d, 180.0d, 180.0d, 300.0d, 1200.0d, 300.0d, 300.0d, 300.0d, 300.0d, 180.0d, 300.0d, 180.0d, 180.0d, 180.0d, 180.0d, 180.0d, 180.0d, 180.0d, 60.0d, 180.0d, 180.0d, 600.0d, 600.0d, 600.0d, 600.0d, 600.0d, 600.0d, 600.0d),
    /* JADX INFO: Fake field, exist only in values array */
    DISTANCE(R.string.lbl_distance, 0.0d, 99999.01d, 1.0d, 1.0d, 0.5d, 4.0d),
    /* JADX INFO: Fake field, exist only in values array */
    LAP_BUTTON(R.string.lbl_lab_button_press, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d),
    REPS(R.string.workout_step_reps, 1.0d, 999.0d, 10.0d, 10.0d, 10.0d, 10.0d),
    /* JADX INFO: Fake field, exist only in values array */
    CALORIES(R.string.lbl_calories, 1.0d, 999.0d, 50.0d, 50.0d, 50.0d, 0.0d),
    /* JADX INFO: Fake field, exist only in values array */
    HEART_RATE(R.string.lbl_heart_rate_cap, 1.0d, 255.0d, 150.0d, 150.0d, 150.0d, 0.0d),
    /* JADX INFO: Fake field, exist only in values array */
    POWER(R.string.lbl_power_cap, 1.0d, 999.0d, 0.0d, 250.0d, 0.0d, 0.0d),
    FIXED_REST(R.string.workout_rest_duration_fixed_rest_time, 1.0d, 6000000.0d, 30.0d),
    FIXED_REPETITION(R.string.lbl_workout_send_off_time, 1.0d, 6000000.0d, 120.0d),
    REPETITION_SWIM_CSS_OFFSET(R.string.lbl_workout_css_based_send_off_time, -60.0d, 60.0d, 0.0d);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f189053e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f189060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f189061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f189062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double[] f189063d;

    c(int i14, double d14, double d15, double... dArr) {
        this.f189060a = i14;
        this.f189061b = d14;
        this.f189062c = d15;
        this.f189063d = dArr;
    }

    public final double a(k kVar, e eVar) {
        kVar.getClass();
        eVar.getClass();
        c cVar = TIME;
        int i14 = 0;
        double[] dArr = this.f189063d;
        if (this == cVar) {
            int iOrdinal = eVar.ordinal();
            if (kVar != k.f116754n) {
                if (kVar == k.f116755o) {
                    i14 = 6;
                } else if (kVar == k.f116758r) {
                    i14 = 24;
                } else {
                    i14 = k52.g.b().contains(kVar) ? 18 : 12;
                }
            }
            return dArr[i14 + iOrdinal];
        }
        if (this == FIXED_REST || this == FIXED_REPETITION || this == REPETITION_SWIM_CSS_OFFSET) {
            return dArr[0];
        }
        if (kVar == k.f116754n) {
            return dArr[0];
        }
        if (kVar == k.f116755o) {
            return dArr[1];
        }
        if (kVar == k.f116758r) {
            return dArr[3];
        }
        return k52.g.b().contains(kVar) ? dArr[2] : dArr[2];
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx52/c$a;", "", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static c a(m52.a aVar) {
            if (aVar == null) {
                return null;
            }
            try {
                return c.valueOf(aVar.name());
            } catch (Exception unused) {
                return null;
            }
        }

        private a() {
        }
    }
}
