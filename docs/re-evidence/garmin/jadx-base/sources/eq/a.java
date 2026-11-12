package eq;

import android.content.Context;
import android.text.TextUtils;
import c22.l3;
import c22.q3;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import f12.l;
import gg1.o0;
import i3.e5;
import java.util.ArrayList;
import o13.p;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import ps.x1;
import ss.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Leq/a;", "", "Lm00/a;", "formatter", "<init>", "(Lm00/a;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m00.a f65015a;

    static {
        new C1381a(null);
        int i14 = m00.a.f115515e;
    }

    public a(m00.a aVar) {
        aVar.getClass();
        this.f65015a = aVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final ArrayList a(x1 x1Var) {
        String strB;
        String strA;
        x1Var.getClass();
        ArrayList arrayList = new ArrayList();
        m00.a aVar = this.f65015a;
        l22.b bVar = aVar.f115517b;
        arrayList.add(b(R.string.lbl_avg_grade, aVar.d(x1Var.getAverageGrade())));
        arrayList.add(b(R.string.lbl_max_grade, aVar.d(x1Var.getMaxGrade())));
        arrayList.add(b(R.string.activities_ascent_label, aVar.a(x1Var.getElevationGain(), true)));
        Double distance = x1Var.getDistance();
        String str = aVar.f115519d;
        if (distance == null || (strB = k.b(ls.e.BIKE_DISTANCE, bVar, distance, 1)) == null) {
            strB = str;
        }
        arrayList.add(b(R.string.lbl_distance, strB));
        String climbProDifficulty = x1Var.getClimbProDifficulty();
        if (climbProDifficulty == null) {
            strA = bVar.a(R.string.lbl_abbreviated_category, str);
        } else if (climbProDifficulty.equals("NONE")) {
            strA = bVar.getString(R.string.lbl_easy_category);
        } else if (climbProDifficulty.equals("HORS_CATEGORY")) {
            strA = bVar.getString(R.string.lbl_abbreviated_hors_category);
        } else {
            switch (climbProDifficulty.hashCode()) {
                case -1487566170:
                    if (climbProDifficulty.equals("FIFTH_CATEGORY")) {
                        str = "5";
                    }
                    break;
                case -1441372057:
                    if (climbProDifficulty.equals("SIXTH_CATEGORY")) {
                        str = "6";
                    }
                    break;
                case -1265058429:
                    if (climbProDifficulty.equals("FOURTH_CATEGORY")) {
                        str = "4";
                    }
                    break;
                case -499784243:
                    if (climbProDifficulty.equals("FIRST_CATEGORY")) {
                        str = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                    }
                    break;
                case 790188278:
                    if (climbProDifficulty.equals("THIRD_CATEGORY")) {
                        str = "3";
                    }
                    break;
                case 1195763817:
                    if (climbProDifficulty.equals("SECOND_CATEGORY")) {
                        str = "2";
                    }
                    break;
            }
            strA = bVar.a(R.string.lbl_abbreviated_category, str);
        }
        arrayList.add(b(R.string.common_difficulty, strA));
        return arrayList;
    }

    public final p<String, String> b(int i14, String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        m00.a aVar = this.f65015a;
        if (zIsEmpty) {
            str = aVar.f115519d;
        }
        return new p<>(aVar.h(i14), str);
    }

    public final ArrayList c(x1 x1Var) {
        String strG;
        String strB;
        String strB2;
        String strB3;
        String strB4;
        String strB5;
        String strB6;
        x1Var.getClass();
        ArrayList arrayList = new ArrayList();
        m00.a aVar = this.f65015a;
        l22.b bVar = aVar.f115517b;
        String str = aVar.f115519d;
        arrayList.add(new p("HEADER", aVar.h(R.string.lbl_speed)));
        Double avgVerticalSpeed = x1Var.getAvgVerticalSpeed();
        o0 o0Var = aVar.f115518c;
        o0Var.getClass();
        if (avgVerticalSpeed == null || Double.isNaN(avgVerticalSpeed.doubleValue()) || Double.isInfinite(avgVerticalSpeed.doubleValue())) {
            strG = str;
        } else {
            boolean z14 = o0Var == o0.METRIC || o0Var == o0.STATUTE_UK;
            q3 q3Var = z14 ? q3.METERS_PER_HOUR : q3.FEET_PER_HOUR;
            l3.a aVar2 = l3.f23124b;
            Context context = aVar.f115516a;
            double dDoubleValue = avgVerticalSpeed.doubleValue();
            aVar2.getClass();
            strG = e5.g(l3.a.N0(context, dDoubleValue, q3Var, l3.f23130h, false, aVar.f115519d), StringUtils.SPACE, z14 ? aVar.h(R.string.lbl_meters_per_hour_short_abbrev) : aVar.h(q3Var.f23223e));
        }
        arrayList.add(b(R.string.lbl_vam, strG));
        arrayList.add(b(R.string.lbl_avg_speed, aVar.f(x1Var.getAverageSpeed())));
        arrayList.add(b(R.string.activity_details_average_moving_speed, aVar.f(x1Var.getAverageMovingSpeed())));
        arrayList.add(b(R.string.activity_details_max_speed, aVar.f(x1Var.getMaxSpeed())));
        arrayList.add(new p("HEADER", aVar.h(R.string.activity_details_timing)));
        Double elapsedDuration = x1Var.getElapsedDuration();
        if (elapsedDuration == null || (strB = k.b(ls.e.TIME, bVar, elapsedDuration, 16)) == null) {
            strB = str;
        }
        arrayList.add(b(R.string.lbl_time, strB));
        arrayList.add(new p("HEADER", aVar.h(R.string.activity_details_power)));
        Double avgPower = x1Var.getAvgPower();
        ls.e eVar = ls.e.AVERAGE_POWER;
        if (avgPower == null || (strB2 = k.b(eVar, bVar, avgPower, 1)) == null) {
            strB2 = str;
        }
        arrayList.add(b(R.string.activity_details_average_power, strB2));
        Double normalizedPower = x1Var.getNormalizedPower();
        ls.e eVar2 = ls.e.NORMALIZED_POWER;
        if (normalizedPower == null || (strB3 = k.b(eVar2, bVar, normalizedPower, 1)) == null) {
            strB3 = str;
        }
        arrayList.add(b(R.string.audio_prompts_power_alert_type_normalized, strB3));
        Double maxPower = x1Var.getMaxPower();
        ls.e eVar3 = ls.e.MAX_POWER;
        if (maxPower == null || (strB4 = k.b(eVar3, bVar, maxPower, 1)) == null) {
            strB4 = str;
        }
        arrayList.add(b(R.string.activity_details_max_power, strB4));
        double dV3 = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).v3();
        arrayList.add(b(R.string.activity_details_average_power_by_weight, aVar.e(dV3, x1Var.getAvgPower())));
        arrayList.add(b(R.string.activity_details_max_power_by_weight, aVar.e(dV3, x1Var.getMaxPower())));
        arrayList.add(new p("HEADER", aVar.h(R.string.activity_details_cadence)));
        arrayList.add(b(R.string.activity_details_average_cadence, aVar.b(x1Var.getAvgBikeCadence())));
        arrayList.add(b(R.string.activity_details_max_cadence, aVar.b(x1Var.getMaxBikeCadence())));
        arrayList.add(b(R.string.lbl_min_cadence, aVar.b(x1Var.getMinCadence())));
        arrayList.add(new p("HEADER", aVar.h(R.string.lbl_heart_rate_cap)));
        Double averageHR = x1Var.getAverageHR();
        ls.e eVar4 = ls.e.AVERAGE_HEART_RATE;
        if (averageHR == null || (strB5 = k.b(eVar4, bVar, averageHR, 1)) == null) {
            strB5 = str;
        }
        arrayList.add(b(R.string.activity_details_average_heart_rate, strB5));
        Double maxHR = x1Var.getMaxHR();
        ls.e eVar5 = ls.e.MAX_HEART_RATE;
        if (maxHR != null && (strB6 = k.b(eVar5, bVar, maxHR, 1)) != null) {
            str = strB6;
        }
        arrayList.add(b(R.string.activity_details_max_heart_rate, str));
        return arrayList;
    }

    /* JADX INFO: renamed from: eq.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Leq/a$a;", "", "<init>", "()V", "", "TYPE_HEADER", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1381a {
        public /* synthetic */ C1381a(j jVar) {
            this();
        }

        private C1381a() {
        }
    }
}
