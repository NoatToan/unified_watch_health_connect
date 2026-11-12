package defpackage;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.sport_eco_manager.SportDeviceModel;
import com.xiaomi.fitness.sport_eco_manager_export.data.PhoneSportData;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportType;
import com.xiaomi.hm.health.bt.sdk.HuamiDevice;
import com.xiaomi.hm.health.bt.sdk.data.SportData;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public class wjc extends den {
    public String g = "HuamiDataToWear";
    public SportData h;

    @Override // defpackage.nrc
    public boolean b(float f, int i, int i2) {
        if (SportDeviceModel.getHuamiApiCaller() == null) {
            return false;
        }
        FitnessLogUtils.i(this.g, "sportNotifyKm , distance:" + f + ",elapsedTime:" + i + ", pace :" + i2);
        return SportDeviceModel.getHuamiApiCaller().sportNotifyKm(f, i2);
    }

    @Override // defpackage.nrc
    public boolean c(int i) {
        if (SportDeviceModel.getHuamiApiCaller() == null) {
            return false;
        }
        FitnessLogUtils.i(this.g, "sportNotifyPace , pace:" + i);
        return SportDeviceModel.getHuamiApiCaller().sportNotifyPace(i);
    }

    @Override // defpackage.den
    public void e() {
        super.e();
        g2o.s().W(getClass(), this);
        kdn.f().o(getClass(), this);
    }

    @Override // defpackage.den
    public void g() {
        super.g();
        SportData sportData = this.h;
        if (sportData != null) {
            sportData.setElapsedTime((int) g2o.s().E());
        }
        j(this.h);
    }

    public void j(SportData sportData) {
        HuamiDevice huamiApiCaller = SportDeviceModel.getHuamiApiCaller();
        if (huamiApiCaller == null || sportData == null) {
            return;
        }
        boolean zSportShow = huamiApiCaller.sportShow(sportData);
        FitnessLogUtils.i(this.g, "sendToHm timestamp : " + TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + ", wearData : " + sportData.getDistance() + ",result:" + zSportShow);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportDataChangedListener
    public void onPhoneDataChanged(PhoneSportData phoneSportData) {
        SportType sportType;
        FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
        FitnessLogUtils.d(this.g, "onPhoneDataChanged:" + phoneSportData);
        int i = phoneSportData.sportType;
        if (i == 1) {
            sportType = SportType.SPORT_TYPE_ODRUN;
        } else if (i == 2) {
            sportType = SportType.SPORT_TYPE_WALKING;
        } else if (i == 3) {
            sportType = SportType.SPORT_TYPE_IDRUN;
        } else if (i != 6) {
            sportType = i != 7 ? null : SportType.SPORT_TYPE_IDRIDING;
        } else {
            sportType = SportType.SPORT_TYPE_RIDING;
        }
        int iD = d(phoneSportData.duration, phoneSportData.distance);
        SportData sportData = new SportData();
        this.h = sportData;
        sportData.setElapsedTime(phoneSportData.duration);
        this.h.setDistance(phoneSportData.distance);
        this.h.setPace(phoneSportData.pace / 1000.0f);
        this.h.setSportType(sportType);
        this.h.setAvePace(iD / 1000.0f);
        this.h.setCal((int) (phoneSportData.calorie / 1000.0f));
        this.h.setStepFreq(phoneSportData.stepRate);
        com.xiaomi.fitness.sport_eco_manager_export.data.SportData sportDataZ = g2o.s().z();
        this.h.setStep(phoneSportData.step + (sportDataZ == null ? 0 : sportDataZ.totalStep));
        FitnessLogUtils.d(this.g, "elapsedTime : " + this.h.getElapsedTime() + ",avePace : " + this.h.getAvePace() + "，pace :" + this.h.getPace() + ", stepRate : " + phoneSportData.stepRate);
        this.h.setHr(phoneSportData.heart_rate);
        if (this.e) {
            return;
        }
        j(this.h);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportDataChangedListener
    public void onReceiveWearData(y7r y7rVar) {
    }

    @Override // defpackage.den, com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportFinished(boolean z, @Nullable byte[] bArr) {
    }

    @Override // defpackage.nrc
    public boolean sportNotifyHr(int i) {
        if (SportDeviceModel.getHuamiApiCaller() == null) {
            return false;
        }
        FitnessLogUtils.i(this.g, "sportNotifyHr :" + i);
        return SportDeviceModel.getHuamiApiCaller().sportNotifyHr(i);
    }

    @Override // defpackage.nrc
    public boolean sportNotifyPace(int i) {
        if (SportDeviceModel.getHuamiApiCaller() == null) {
            return false;
        }
        FitnessLogUtils.i(this.g, "sportNotifyPace , pace:" + i);
        return SportDeviceModel.getHuamiApiCaller().sportNotifyPace(i);
    }
}
