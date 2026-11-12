package defpackage;

import android.location.Location;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.sport_manager.SportDeviceModel;
import com.xiaomi.fitness.sport_manager_export.data.FinishSportData;
import com.xiaomi.fitness.sport_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportLocationResult;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportType;
import com.xiaomi.hm.health.bt.sdk.data.GpsState;
import com.xiaomi.hm.health.bt.sdk.data.SportData;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class vjc extends cen {
    public String f = "HuamiDataToWear";
    public int g = 0;
    public boolean h = true;
    public Location i;
    public SportLocationResult j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SportData f36946k;

    @Override // defpackage.mrc
    public boolean b(float f, int i, int i2) {
        if (SportDeviceModel.getHuamiApiCaller() == null) {
            return false;
        }
        FitnessLogUtils.i(this.f, "sportNotifyKm , distance:" + f + ",elapsedTime:" + i + ", pace :" + i2);
        return SportDeviceModel.getHuamiApiCaller().sportNotifyKm(f, i2);
    }

    @Override // defpackage.mrc
    public boolean c(int i) {
        if (SportDeviceModel.getHuamiApiCaller() == null) {
            return false;
        }
        FitnessLogUtils.i(this.f, "sportNotifyPace , pace:" + i);
        return SportDeviceModel.getHuamiApiCaller().sportNotifyPace(i);
    }

    @Override // defpackage.cen
    public void e() {
        super.e();
        f2o.x().j0(getClass(), this);
        jdn.h().r(getClass(), this);
    }

    @Override // defpackage.cen
    public void g() {
        super.g();
        SportData sportData = this.f36946k;
        if (sportData != null) {
            sportData.setElapsedTime((int) f2o.x().J());
        }
        m(this.f36946k);
    }

    public final void l() {
        SportLocationResult sportLocationResult;
        if (this.j == null && f2o.x().K() == 0) {
            this.i = new Location("gps");
            this.j = new SportLocationResult.a(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())).g();
        }
        if (this.i == null || (sportLocationResult = this.j) == null) {
            return;
        }
        n(sportLocationResult.getGpsAccuracyStatus());
        HuamiApiCaller huamiApiCaller = SportDeviceModel.getHuamiApiCaller();
        if (this.i != null && huamiApiCaller != null) {
            FitnessLogUtils.i(this.f, "latitude :" + this.i.getLatitude() + ", longitude:" + this.i.getLongitude() + ",firstPoint:" + this.h);
            huamiApiCaller.sendGpsPoint(this.i, 0, this.h);
            this.i = null;
        }
        this.h = false;
    }

    public void m(SportData sportData) {
        l();
        HuamiApiCaller huamiApiCaller = SportDeviceModel.getHuamiApiCaller();
        if (huamiApiCaller == null || sportData == null) {
            return;
        }
        boolean zSportShow = huamiApiCaller.sportShow(sportData);
        FitnessLogUtils.i(this.f, "sendToHm timestamp : " + TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + ", wearData : " + sportData.getDistance() + ",result:" + zSportShow);
    }

    public final void n(int i) {
        HuamiApiCaller huamiApiCaller = SportDeviceModel.getHuamiApiCaller();
        if (huamiApiCaller == null) {
            return;
        }
        if (!e3b.a()) {
            huamiApiCaller.sportNotifyGpsState(GpsState.GPS_STATE_GPS_SERVICE_CLOSED);
            return;
        }
        if (this.g != i) {
            this.g = i;
            if (i == 0) {
                huamiApiCaller.sportNotifyGpsState(GpsState.GPS_STATE_LOCATE_ING);
            } else {
                huamiApiCaller.sportNotifyGpsState(GpsState.GPS_STATE_LOCATE_ED);
            }
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener
    public void onLocationChanged(SportLocationResult sportLocationResult) {
        if (sportLocationResult.getLocation() == null || sportLocationResult.getGpsAccuracyStatus() == 0) {
            this.i = null;
            return;
        }
        this.j = sportLocationResult;
        Location location = new Location("gps");
        this.i = location;
        location.setLatitude(sportLocationResult.getLocation().latitude);
        this.i.setLongitude(sportLocationResult.getLocation().longitude);
        this.i.setAltitude(sportLocationResult.getLocation().altitude);
        this.i.setSpeed(sportLocationResult.getLocation().speed);
        this.i.setTime(sportLocationResult.getLocation().time);
        this.i.setBearing(sportLocationResult.getLocation().bearing);
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener
    public void onPhoneDataChanged(PhoneSportData phoneSportData) {
        SportType sportType;
        FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
        FitnessLogUtils.d(this.f, "onPhoneDataChanged:" + phoneSportData);
        int i = phoneSportData.sportType;
        if (i == 1) {
            sportType = SportType.SPORT_TYPE_ODRUN;
        } else if (i == 2) {
            sportType = SportType.SPORT_TYPE_WALKING;
        } else if (i != 3) {
            sportType = i != 6 ? null : SportType.SPORT_TYPE_RIDING;
        } else {
            sportType = SportType.SPORT_TYPE_IDRUN;
        }
        int iD = d(phoneSportData.duration, phoneSportData.distance);
        SportData sportData = new SportData();
        this.f36946k = sportData;
        sportData.setElapsedTime(phoneSportData.duration);
        this.f36946k.setDistance(phoneSportData.distance);
        this.f36946k.setPace(phoneSportData.pace / 1000.0f);
        this.f36946k.setSportType(sportType);
        this.f36946k.setAvePace(iD / 1000.0f);
        this.f36946k.setCal((int) (phoneSportData.calorie / 1000.0f));
        this.f36946k.setStepFreq(phoneSportData.stepRate);
        com.xiaomi.fitness.sport_manager_export.data.SportData sportDataE = f2o.x().E();
        this.f36946k.setStep(phoneSportData.step + (sportDataE == null ? 0 : sportDataE.totalStep));
        FitnessLogUtils.d(this.f, "elapsedTime : " + this.f36946k.getElapsedTime() + ",avePace : " + this.f36946k.getAvePace() + "，pace :" + this.f36946k.getPace() + ", stepRate : " + phoneSportData.stepRate);
        this.f36946k.setHr(phoneSportData.heart_rate);
        if (this.e) {
            return;
        }
        m(this.f36946k);
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener
    public void onReceiveWearData(x7r x7rVar) {
    }

    @Override // defpackage.cen, com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportFinished(boolean z, byte[] bArr, FinishSportData finishSportData) {
        this.h = true;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportSegment(int i, int i2) {
    }

    @Override // defpackage.mrc
    public boolean sportNotifyHr(int i) {
        if (SportDeviceModel.getHuamiApiCaller() == null) {
            return false;
        }
        FitnessLogUtils.i(this.f, "sportNotifyHr :" + i);
        return SportDeviceModel.getHuamiApiCaller().sportNotifyHr(i);
    }

    @Override // defpackage.mrc
    public boolean sportNotifyPace(int i) {
        if (SportDeviceModel.getHuamiApiCaller() == null) {
            return false;
        }
        FitnessLogUtils.i(this.f, "sportNotifyPace , pace:" + i);
        return SportDeviceModel.getHuamiApiCaller().sportNotifyPace(i);
    }
}
