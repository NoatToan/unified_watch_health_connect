package defpackage;

import android.text.TextUtils;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.sport_eco_manager.SportDeviceModel;
import com.xiaomi.fitness.sport_eco_manager_export.data.IntervalSportTarget;
import com.xiaomi.fitness.sport_eco_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportGymResponseData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportResponseData;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public class uv9 {
    public static cs9 a(SportRequestData sportRequestData) {
        cs9 cs9Var = new cs9();
        if (sportRequestData.sportTargetArr != null) {
            mu9 mu9Var = new mu9();
            mu9Var.c = sportRequestData.sportTargetArr.getType();
            mu9Var.d = sportRequestData.sportTargetArr.getValue();
            cs9Var.h = new mu9[]{mu9Var};
        }
        ArrayList<IntervalSportTarget> arrayList = sportRequestData.intervalSportTargetArr;
        if (arrayList != null && arrayList.size() > 0) {
            ms9[] ms9VarArr = new ms9[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                IntervalSportTarget intervalSportTarget = arrayList.get(i);
                ms9 ms9Var = new ms9();
                mu9 mu9Var2 = new mu9();
                mu9Var2.c = intervalSportTarget.getSportTarget().getType();
                mu9Var2.d = intervalSportTarget.getSportTarget().getValue();
                ms9Var.c = mu9Var2;
                ms9Var.d = intervalSportTarget.getRestDuration();
                ms9VarArr[i] = ms9Var;
            }
            cs9Var.l = ms9VarArr;
        }
        if (sportRequestData.sportCourse != null) {
            zt9 zt9Var = new zt9();
            zt9Var.e = sportRequestData.sportCourse.getCourseName();
            zt9Var.c = sportRequestData.sportCourse.getType();
            zt9Var.d = sportRequestData.sportCourse.getCloudCourseId();
            cs9Var.i = zt9Var;
        }
        cs9Var.g = t(sportRequestData.sportState);
        cs9Var.e = u(sportRequestData.sportType);
        cs9Var.c = sportRequestData.timeStamp;
        w64 w64Var = new w64();
        w64Var.c = sportRequestData.timeZone;
        cs9Var.d = w64Var;
        return cs9Var;
    }

    public static int b(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 10;
            default:
                return 16;
        }
    }

    @NotNull
    public static SportGymResponseData c(es9 es9Var) {
        int iB = b(es9Var.c);
        ku9 ku9Var = es9Var.f;
        return new SportGymResponseData(iB, es9Var.e, ku9Var != null ? j(ku9Var) : null);
    }

    public static exa d(as9 as9Var) {
        exa exaVar = new exa(as9Var.d, as9Var.f, as9Var.g, as9Var.i, as9Var.f3410k, as9Var.n, as9Var.o, as9Var.m, as9Var.e);
        exaVar.i = as9Var.f3410k;
        exaVar.f17156k = as9Var.n;
        exaVar.l = as9Var.o;
        exaVar.m = as9Var.m;
        exaVar.f17154a = as9Var.c;
        exaVar.f = as9Var.h;
        exaVar.c = as9Var.e;
        exaVar.h = as9Var.j;
        exaVar.n = as9Var.q;
        exaVar.o = as9Var.f3411r;
        exaVar.p = as9Var.s;
        exaVar.q = as9Var.t;
        exaVar.f17157r = as9Var.u;
        exaVar.s = as9Var.v;
        exaVar.t = as9Var.w;
        FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
        FitnessLogUtils.d("FitnessSportProtoConverter", "GymSportData : " + exaVar.toString());
        return exaVar;
    }

    public static int e(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 5;
            case 4:
                return 4;
            case 5:
                return 6;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            default:
                return 1;
        }
    }

    public static SportRequestData f(cs9 cs9Var) {
        int i = cs9Var.g;
        int iK = k(cs9Var.e);
        long j = cs9Var.c;
        int iN = n(cs9Var.d);
        return new SportRequestData.a().v(j).x(iN).s(iK).o(1).p(i(i)).y(cs9Var.f14670k).j();
    }

    public static SportRequestData g(gu9 gu9Var) {
        int i = gu9Var.g;
        int iK = k(gu9Var.e);
        long j = gu9Var.c;
        int iN = n(gu9Var.d);
        int i2 = i(i);
        return new SportRequestData.a().v(j).x(iN).s(iK).p(i2).y(gu9Var.h).t(gu9Var.i).j();
    }

    public static SportResponseData h(iu9 iu9Var) {
        int iE = e(iu9Var.c);
        ku9 ku9Var = iu9Var.e;
        SportResponseData sportResponseData = new SportResponseData(iE, iu9Var.d, ku9Var != null ? j(ku9Var) : null);
        sportResponseData.selectVersion = iu9Var.g;
        return sportResponseData;
    }

    public static int i(int i) {
        if (i == 0) {
            return 1;
        }
        int i2 = 2;
        if (i != 1) {
            if (i == 2) {
                return 3;
            }
            i2 = 4;
            if (i != 3) {
                return i != 4 ? 0 : 5;
            }
        }
        return i2;
    }

    public static a8r j(ku9 ku9Var) {
        a8r a8rVar = new a8r();
        a8rVar.f779a = ku9Var.e;
        a8rVar.f780b = n(ku9Var.f);
        a8rVar.c = k(ku9Var.c);
        a8rVar.d = ku9Var.h;
        a8rVar.e = ku9Var.g;
        a8rVar.f = ku9Var.j;
        a8rVar.g = ku9Var.f24295k;
        a8rVar.h = ku9Var.i;
        return a8rVar;
    }

    public static int k(int i) {
        if (i == 14) {
            return 14;
        }
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            default:
                return 0;
        }
    }

    public static y7r l(fv9 fv9Var) {
        y7r y7rVar = new y7r(fv9Var.d, fv9Var.c, fv9Var.e, fv9Var.f, fv9Var.g);
        y7rVar.d = fv9Var.f;
        y7rVar.e = fv9Var.g;
        return y7rVar;
    }

    public static y7r m(hv9 hv9Var) {
        y7r y7rVar = new y7r(hv9Var.d, hv9Var.e, hv9Var.c, 0, 0);
        y7rVar.f = hv9Var.f;
        return y7rVar;
    }

    public static int n(w64 w64Var) {
        if (w64Var == null) {
            return 0;
        }
        if (TextUtils.isEmpty(w64Var.e)) {
            return w64Var.d + w64Var.c;
        }
        TimeZone timeZone = TimeZone.getTimeZone(w64Var.e);
        return ((int) TimeUnit.MILLISECONDS.toMinutes(timeZone.getDSTSavings() + timeZone.getRawOffset())) / 15;
    }

    public static xr9 o(PhoneSportData phoneSportData) {
        xr9 xr9Var = new xr9();
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        if (sportDeviceModel.curDeviceModel() != null && sportDeviceModel.curDeviceModel().getIsDeviceConnected()) {
            xr9Var.c = phoneSportData.gym_hr;
        }
        return xr9Var;
    }

    public static ss9 p(PhoneSportData phoneSportData) {
        ss9 ss9Var = new ss9();
        ss9Var.c = phoneSportData.distance;
        ss9Var.d = phoneSportData.pace;
        return ss9Var;
    }

    public static ws9 q(PhoneSportData phoneSportData) {
        ws9 ws9Var = new ws9();
        Location location = phoneSportData.location;
        ws9Var.d = (int) location.timeStamp;
        ws9Var.e = location.longitude;
        ws9Var.f = location.latitude;
        if (location.locationType == Location.LOCATION_TYPE_GPS) {
            ws9Var.g = location.altitude;
        }
        ws9Var.h = location.speed;
        ws9Var.i = location.bearing;
        ws9Var.j = location.horizontalAccuracy;
        ws9Var.f38307k = location.verticalAccuracy;
        return ws9Var;
    }

    public static us9 r(PhoneSportData phoneSportData) {
        us9 us9Var = new us9();
        if (g2o.s().n() == 6) {
            us9Var.c = (int) phoneSportData.deviceDuration;
        } else {
            us9Var.c = phoneSportData.duration;
        }
        us9Var.d = phoneSportData.heart_rate;
        us9Var.e = ((int) phoneSportData.calorie) / 1000;
        us9Var.f = phoneSportData.distance;
        us9Var.g = phoneSportData.pace;
        us9Var.h = phoneSportData.avePace;
        us9Var.i = phoneSportData.step;
        us9Var.j = phoneSportData.stride;
        us9Var.f36083k = phoneSportData.stride_frequency;
        us9Var.o = phoneSportData.reminder_kilometre_pace;
        us9Var.n = phoneSportData.reminder_kilometre_duration;
        us9Var.p = phoneSportData.reminder_pace;
        us9Var.q = phoneSportData.reminder_heart_rate;
        FitnessLogUtils.i("FitnessSportProtoConverter", "duration:" + us9Var.c + ",heartRate:" + us9Var.d + ",calories:" + us9Var.e + ",distance:" + us9Var.f + ",currentPace:" + us9Var.g + ",averagePace:" + us9Var.h + ",steps:" + us9Var.i + ",stride:" + us9Var.j + ",strideFrequency:" + us9Var.f36083k + ",reminderKilometrePace:" + us9Var.o + ",reminderKilometreDuration:" + us9Var.n + ",reminderPace:" + us9Var.p + ",reminderHeartRate:" + us9Var.q);
        return us9Var;
    }

    public static gu9 s(SportRequestData sportRequestData) {
        w64 w64Var = new w64();
        w64Var.c = sportRequestData.timeZone;
        gu9 gu9Var = new gu9();
        gu9Var.c = sportRequestData.timeStamp;
        gu9Var.d = w64Var;
        gu9Var.e = u(sportRequestData.sportType);
        gu9Var.g = t(sportRequestData.sportState);
        gu9Var.i = 3;
        if (sportRequestData.sportTargetArr != null) {
            mu9 mu9Var = new mu9();
            mu9Var.c = sportRequestData.sportTargetArr.getType();
            mu9Var.d = sportRequestData.sportTargetArr.getValue();
            gu9Var.j = new mu9[]{mu9Var};
        }
        return gu9Var;
    }

    public static int t(int i) {
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 3 : 2;
        }
        return 1;
    }

    public static int u(int i) {
        if (i == 14) {
            return 14;
        }
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            default:
                return 0;
        }
    }
}
