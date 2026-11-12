package defpackage;

import android.text.TextUtils;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.sport_manager.SportDeviceModel;
import com.xiaomi.fitness.sport_manager_export.data.FinishSportData;
import com.xiaomi.fitness.sport_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportGymResponseData;
import com.xiaomi.fitness.sport_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_manager_export.data.SportResponseData;
import com.xiaomi.fitness.sport_manager_export.data.SportResponseExtraData;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public class tv9 {
    public static FinishSportData A(fu9 fu9Var) {
        FinishSportData finishSportData = new FinishSportData();
        au9 au9Var = fu9Var.m;
        FitnessLogUtils.i("FitnessSportProtoConverter", "sportExtraData:" + au9Var);
        if (au9Var != null) {
            int i = au9Var.c;
            int i2 = au9Var.d;
            float f = au9Var.e;
            float f2 = au9Var.f;
            int i3 = au9Var.g;
            int i4 = au9Var.h;
            int i5 = au9Var.i;
            int i6 = au9Var.j;
            int i7 = au9Var.f3452k;
            int i8 = au9Var.l;
            int i9 = au9Var.m;
            int i10 = au9Var.n;
            int i11 = au9Var.o;
            au9 au9Var2 = fu9Var.m;
            finishSportData.setExtraData(new SportResponseExtraData(i, i2, f, f2, i3, i4, i5, i6, i7, i8, i9, i10, i11, au9Var2.p, au9Var2.q, au9Var2.s, au9Var.t, au9Var.u, au9Var.v, au9Var2.w, au9Var2.x, au9Var2.y, au9Var2.z, au9Var2.A, au9Var2.B));
        }
        return finishSportData;
    }

    public static bs9 a(SportRequestData sportRequestData) {
        bs9 bs9Var = new bs9();
        if (sportRequestData.sportTargetArr != null) {
            lu9 lu9Var = new lu9();
            lu9Var.c = sportRequestData.sportTargetArr.getType();
            lu9Var.d = sportRequestData.sportTargetArr.getValue();
            bs9Var.h = new lu9[]{lu9Var};
        }
        if (sportRequestData.sportCourse != null) {
            yt9 yt9Var = new yt9();
            yt9Var.c = sportRequestData.sportCourse.getType();
            yt9Var.d = sportRequestData.sportCourse.getCloudCourseId();
            bs9Var.i = yt9Var;
        }
        bs9Var.g = x(sportRequestData.sportState);
        bs9Var.e = y(sportRequestData.sportType);
        bs9Var.c = sportRequestData.timeStamp;
        v64 v64Var = new v64();
        v64Var.c = sportRequestData.timeZone;
        bs9Var.d = v64Var;
        return bs9Var;
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
    public static SportGymResponseData c(ds9 ds9Var) {
        int iB = b(ds9Var.c);
        ju9 ju9Var = ds9Var.f;
        return new SportGymResponseData(iB, ds9Var.e, ju9Var != null ? k(ju9Var) : null);
    }

    public static dxa d(zr9 zr9Var) {
        dxa dxaVar = new dxa(zr9Var.d, zr9Var.f, zr9Var.g, zr9Var.i);
        dxaVar.i = zr9Var.f41596k;
        dxaVar.f16025a = zr9Var.c;
        dxaVar.f = zr9Var.h;
        dxaVar.c = zr9Var.e;
        dxaVar.h = zr9Var.j;
        FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
        FitnessLogUtils.d("FitnessSportProtoConverter", "GymSportData : " + dxaVar.toString());
        return dxaVar;
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
            case 9:
                return 11;
            default:
                return 1;
        }
    }

    public static wsn f(bu9 bu9Var) {
        return new wsn(bu9Var.c, bu9Var.e);
    }

    public static SportRequestData g(bs9 bs9Var) {
        int i = bs9Var.g;
        int iL = l(bs9Var.e);
        long j = bs9Var.c;
        int iO = o(bs9Var.d);
        return new SportRequestData.a().C(j).E(iO).z(iL).w(1).x(j(i)).F(bs9Var.f4557k).o();
    }

    public static SportRequestData h(fu9 fu9Var) {
        int i = fu9Var.g;
        int iL = l(fu9Var.e);
        long j = fu9Var.c;
        int iO = o(fu9Var.d);
        int iJ = j(i);
        return new SportRequestData.a().C(j).E(iO).z(iL).x(iJ).F(fu9Var.h).r(A(fu9Var)).A(fu9Var.i).o();
    }

    public static SportResponseData i(hu9 hu9Var) {
        int iE = e(hu9Var.c);
        ju9 ju9Var = hu9Var.d;
        au9 au9Var = hu9Var.i;
        if (au9Var == null) {
            au9Var = new au9();
        }
        SportResponseData sportResponseData = new SportResponseData(iE, hu9Var.h, ju9Var != null ? k(ju9Var) : null);
        FitnessLogUtils.d("FitnessSportProtoConverter", "ground:" + au9Var.p + ",avgVerticalStrideRatio:" + au9Var.w + ",minVerticalStrideRatio:" + au9Var.x + ",maxVerticalStrideRatio:" + au9Var.y + ",avgVerticalAmplitude: " + au9Var.z + ",minVerticalAmplitude :" + au9Var.A + ",maxVerticalAmplitude :" + au9Var.B);
        sportResponseData.extraData = new SportResponseExtraData(au9Var.c, au9Var.d, au9Var.e, au9Var.f, au9Var.g, au9Var.h, au9Var.i, au9Var.j, au9Var.f3452k, au9Var.l, au9Var.m, au9Var.n, au9Var.o, au9Var.p, au9Var.q, au9Var.s, au9Var.t, au9Var.u, au9Var.v, au9Var.w, au9Var.x, au9Var.y, au9Var.z, au9Var.A, au9Var.B);
        StringBuilder sb = new StringBuilder();
        sb.append("-----extraData:");
        sb.append(sportResponseData.extraData);
        FitnessLogUtils.d("FitnessSportProtoConverter", sb.toString());
        sportResponseData.wearMode = hu9Var.e;
        sportResponseData.selectVersion = hu9Var.g;
        return sportResponseData;
    }

    public static int j(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static z7r k(ju9 ju9Var) {
        z7r z7rVar = new z7r();
        z7rVar.f40996a = ju9Var.e;
        z7rVar.f40997b = o(ju9Var.f);
        z7rVar.c = l(ju9Var.c);
        z7rVar.d = ju9Var.h;
        z7rVar.e = ju9Var.g;
        z7rVar.f = ju9Var.j;
        z7rVar.g = ju9Var.f23136k;
        z7rVar.h = ju9Var.i;
        return z7rVar;
    }

    public static int l(int i) {
        if (i == 15) {
            return 15;
        }
        if (i == 17) {
            return 17;
        }
        if (i == 21) {
            return 21;
        }
        if (i == 200) {
            return 24;
        }
        if (i == 810) {
            return 810;
        }
        if (i == 812) {
            return 812;
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

    public static x7r m(ev9 ev9Var) {
        x7r x7rVar = new x7r(ev9Var.d, ev9Var.c, ev9Var.e, ev9Var.f, ev9Var.g);
        x7rVar.d = ev9Var.f;
        x7rVar.e = ev9Var.g;
        return x7rVar;
    }

    public static x7r n(gv9 gv9Var) {
        x7r x7rVar = new x7r(gv9Var.d, gv9Var.e, gv9Var.c, 0, 0);
        x7rVar.f = gv9Var.f;
        x7rVar.g = gv9Var.g;
        x7rVar.h = gv9Var.j;
        x7rVar.i = gv9Var.m;
        x7rVar.j = gv9Var.n;
        x7rVar.f38799k = gv9Var.o;
        x7rVar.l = gv9Var.p;
        x7rVar.n = gv9Var.h;
        x7rVar.m = gv9Var.i;
        x7rVar.p = gv9Var.f19364k;
        x7rVar.q = gv9Var.l;
        x7rVar.o = gv9Var.q;
        x7rVar.f38800r = gv9Var.f19365r;
        x7rVar.s = gv9Var.s;
        FitnessLogUtils.d("FitnessSportProtoConverter", "distance:" + gv9Var.f + "frequency:" + gv9Var.j + "runStyle:" + gv9Var.m + "impact:" + gv9Var.n + "onGround:" + gv9Var.o + "offGround:" + gv9Var.p + "stride:" + gv9Var.h + "revolutionCount:" + gv9Var.i + "currentPace:" + gv9Var.f19364k + "currentSpeed:" + gv9Var.l + "onOffRatio:" + gv9Var.q + "stepRate:" + (gv9Var.j / 60));
        return x7rVar;
    }

    public static int o(v64 v64Var) {
        if (v64Var == null) {
            return 0;
        }
        if (TextUtils.isEmpty(v64Var.e)) {
            return v64Var.d + v64Var.c;
        }
        TimeZone timeZone = TimeZone.getTimeZone(v64Var.e);
        return ((int) TimeUnit.MILLISECONDS.toMinutes(timeZone.getDSTSavings() + timeZone.getRawOffset())) / 15;
    }

    public static int p(int i) {
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 10 : 2;
        }
        return 1;
    }

    public static wr9 q(PhoneSportData phoneSportData) {
        wr9 wr9Var = new wr9();
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        if (sportDeviceModel.curDeviceModel() != null && sportDeviceModel.curDeviceModel().getIsDeviceConnected()) {
            wr9Var.c = phoneSportData.gym_hr;
        }
        return wr9Var;
    }

    public static rs9 r(PhoneSportData phoneSportData) {
        rs9 rs9Var = new rs9();
        rs9Var.c = phoneSportData.distance;
        rs9Var.d = phoneSportData.pace;
        rs9Var.e = p(phoneSportData.gpsAccuracyStatus);
        return rs9Var;
    }

    public static vs9 s(PhoneSportData phoneSportData) {
        vs9 vs9Var = new vs9();
        vs9Var.c = p(phoneSportData.gpsAccuracyStatus);
        Location location = phoneSportData.location;
        vs9Var.d = (int) location.timeStamp;
        vs9Var.e = location.longitude;
        vs9Var.f = location.latitude;
        if (location.locationType == Location.LOCATION_TYPE_GPS) {
            vs9Var.g = location.altitude;
        }
        vs9Var.h = location.speed;
        vs9Var.i = location.bearing;
        vs9Var.j = location.horizontalAccuracy;
        vs9Var.f37182k = location.verticalAccuracy;
        return vs9Var;
    }

    public static ts9 t(PhoneSportData phoneSportData) {
        ts9 ts9Var = new ts9();
        if (f2o.x().t() == 6 || f2o.x().t() == 7) {
            ts9Var.c = (int) phoneSportData.deviceDuration;
        } else {
            ts9Var.c = phoneSportData.duration;
        }
        ts9Var.d = phoneSportData.heart_rate;
        ts9Var.e = ((int) phoneSportData.calorie) / 1000;
        ts9Var.f = phoneSportData.distance;
        ts9Var.g = phoneSportData.pace;
        ts9Var.h = phoneSportData.avePace;
        ts9Var.i = phoneSportData.step;
        ts9Var.j = phoneSportData.stride;
        ts9Var.f34989k = phoneSportData.stride_frequency;
        ts9Var.o = phoneSportData.reminder_kilometre_pace;
        ts9Var.n = phoneSportData.reminder_kilometre_duration;
        ts9Var.p = phoneSportData.reminder_pace;
        ts9Var.q = phoneSportData.reminder_heart_rate;
        FitnessLogUtils.i("FitnessSportProtoConverter", "duration:" + ts9Var.c + ",heartRate:" + ts9Var.d + ",calories:" + ts9Var.e + ",distance:" + ts9Var.f + ",currentPace:" + ts9Var.g + ",averagePace:" + ts9Var.h + ",steps:" + ts9Var.i + ",stride:" + ts9Var.j + ",strideFrequency:" + ts9Var.f34989k + ",reminderKilometrePace:" + ts9Var.o + ",reminderKilometreDuration:" + ts9Var.n + ",reminderPace:" + ts9Var.p + ",reminderHeartRate:" + ts9Var.q);
        return ts9Var;
    }

    public static int u(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 10) {
            return 8;
        }
        int i2 = 2;
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            i2 = 4;
            if (i != 4) {
                i2 = 5;
                if (i == 5) {
                    return 3;
                }
                if (i != 6) {
                    return 10;
                }
            }
        }
        return i2;
    }

    public static fu9 v(SportRequestData sportRequestData) {
        v64 v64Var = new v64();
        v64Var.c = sportRequestData.timeZone;
        fu9 fu9Var = new fu9();
        fu9Var.c = sportRequestData.timeStamp;
        fu9Var.d = v64Var;
        fu9Var.e = y(sportRequestData.sportType);
        fu9Var.g = x(sportRequestData.sportState);
        if (sportRequestData.isAcessoryDevice) {
            FitnessLogUtils.i("FitnessSportProtoConverter", "isAcessoryDevice:true");
            fu9Var.l = sportRequestData.accessoryWearMode;
        }
        fu9Var.i = 3;
        if (sportRequestData.sportTargetArr != null) {
            lu9 lu9Var = new lu9();
            lu9Var.c = sportRequestData.sportTargetArr.getType();
            lu9Var.d = sportRequestData.sportTargetArr.getValue();
            fu9Var.j = new lu9[]{lu9Var};
        }
        return fu9Var;
    }

    public static hu9 w(int i, fu9 fu9Var, int i2) {
        hu9 hu9Var = new hu9();
        hu9Var.c = u(i);
        hu9Var.g = fu9Var.i;
        hu9Var.f = p(i2);
        return hu9Var;
    }

    public static int x(int i) {
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 3 : 2;
        }
        return 1;
    }

    public static int y(int i) {
        if (i == 810) {
            return 810;
        }
        if (i == 812) {
            return 812;
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

    public static du9 z(int i, int i2) {
        du9 du9Var = new du9();
        du9Var.c = u(i);
        du9Var.d = i2;
        return du9Var;
    }
}
