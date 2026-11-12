package defpackage;

import android.os.SystemClock;
import androidx.media3.common.C;
import com.huawei.health.device.model.DeviceInformation;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.datastruct.IndoorEquipTrainerData;
import com.huawei.indoorequip.datastruct.MachineStatus;
import com.huawei.indoorequip.datastruct.SupportDataRange;
import com.huawei.indoorequip.datastruct.TrainingStatus;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public class nxr {
    private int af;
    private int ag;
    private MachineStatus ah;
    private SupportDataRange az;
    private int bd;
    private IndoorEquipTrainerData bf;
    private TrainingStatus bg;
    private int bi;
    private DeviceInformation d;
    private boolean s;
    private int av = 0;
    private int at = 0;
    private int ak = 0;
    private int aq = 0;
    private int l = 0;
    private int m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f43909a = 0;
    private int be = 0;
    private int i = 0;
    private int bh = 0;
    private int f = 0;
    private int n = 0;
    private int al = 0;
    private int an = 0;
    private int am = 0;
    private int aj = 0;
    private int ai = 0;
    private int ae = 0;
    private int v = 0;
    private int x = 0;
    private int ac = 0;
    private int ad = 0;
    private int z = 0;
    private int ab = 0;
    private int w = 0;
    private int y = 0;
    private int p = 0;
    private int bc = 0;
    private int ay = 0;
    private int ba = 0;
    private int ax = 0;
    private int e = 0;
    private int g = 0;
    private int au = 0;
    private int aw = 0;
    private int as = 0;
    private int h = 0;
    private int u = 0;
    private int aa = 0;
    private long ar = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f43911c = 0;
    private long ao = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f43910b = 0;
    private boolean r = true;
    private boolean q = false;
    private boolean t = false;
    private boolean k = false;
    private boolean o = false;
    private boolean j = false;
    private long bb = 0;
    private long ap = 2500;

    public nxr(IndoorEquipTrainerData indoorEquipTrainerData, DeviceInformation deviceInformation, nxq nxqVar, boolean z) {
        this.bf = indoorEquipTrainerData;
        this.d = deviceInformation;
        if (nxqVar != null) {
            this.ah = nxqVar.c();
            this.bg = nxqVar.a();
            this.az = nxqVar.e();
        }
        this.s = z;
    }

    public void c() {
        IndoorEquipTrainerData indoorEquipTrainerData = this.bf;
        if (indoorEquipTrainerData == null) {
            return;
        }
        int fitnessDataType = indoorEquipTrainerData.getFitnessDataType();
        if (fitnessDataType == 3 || fitnessDataType == 99) {
            u();
            w();
            o();
            ad();
            return;
        }
        LogUtil.a("Track_IDEQ_DataCleaner", "clearData for indoor equipment");
        x();
        y();
        n();
        m();
        s();
        ac();
        z();
    }

    private void y() {
        if (this.az.getFitnessHashMap().containsKey(30006)) {
            int minLevel = this.az.getMinLevel();
            this.bi = minLevel;
            LogUtil.a("Track_IDEQ_DataCleaner", "min level=", Integer.valueOf(minLevel));
            int i = this.bi;
            if (i < 0) {
                i = 0;
            }
            this.bi = i;
        }
        if (this.az.getFitnessHashMap().containsKey(30007)) {
            int maxLevel = this.az.getMaxLevel();
            this.bd = maxLevel;
            LogUtil.a("Track_IDEQ_DataCleaner", "max level=", Integer.valueOf(maxLevel));
            int i2 = this.bd;
            this.bd = i2 >= 0 ? i2 : 0;
        }
    }

    private void n() {
        i();
        g();
        f();
        j();
        h();
    }

    private void h() {
        if (this.bf.getFitnessHashMap().containsKey(14)) {
            b(14, this.bf.getInstantaneousPace(), 60);
            this.bf.setInstantaneousPace(this.z);
        }
        if (this.bf.getFitnessHashMap().containsKey(15)) {
            b(15, this.bf.getAveragePace(), 60);
            this.bf.setAveragePace(this.ab);
        }
    }

    private void b(int i, int i2, int i3) {
        if (i2 != 0 && i2 < i3) {
            LogUtil.j("Track_IDEQ_DataCleaner", "pace not in valid scope and paceValue =", Integer.valueOf(i2));
            return;
        }
        if (i == 14) {
            this.z = i2;
        } else if (i != 15) {
            LogUtil.j("Track_IDEQ_DataCleaner", "do not have this dataType", Integer.valueOf(i));
        } else {
            this.ab = i2;
        }
    }

    private void j() {
        if (this.bf.getFitnessHashMap().containsKey(26)) {
            a(26, this.bf.getStrokeRate(), 200);
            this.bf.setStrokeRate(this.ac);
        }
        if (this.bf.getFitnessHashMap().containsKey(28)) {
            a(28, this.bf.getAverageStrokeRate(), 200);
            this.bf.setAverageStrokeRate(this.ad);
        }
        if (this.bf.getFitnessHashMap().containsKey(33)) {
            a(33, this.bf.getAverateStepRate(), 360);
            this.bf.setAverateStepRate(this.w);
        }
        if (this.bf.getFitnessHashMap().containsKey(31)) {
            a();
        }
        if (this.bf.getFitnessHashMap().containsKey(32)) {
            a(32, this.bf.getAverageCadence(), 720);
            this.bf.setAverageCadence(this.p);
        }
    }

    private void a() {
        if (this.bf.getFitnessDataType() == 10) {
            int instantaneousCadence = this.bf.getInstantaneousCadence();
            if (instantaneousCadence >= 0 && instantaneousCadence <= 720) {
                this.y = instantaneousCadence;
            } else {
                LogUtil.j("Track_IDEQ_DataCleaner", "cadence not in valid scope and cadenceValue =", Integer.valueOf(instantaneousCadence));
            }
            this.bf.setInstantaneousCadence(this.y);
            return;
        }
        if (this.bf.getFitnessDataType() == 6) {
            int stepPerMinute = this.bf.getStepPerMinute();
            this.av = stepPerMinute;
            if (stepPerMinute >= 0 && stepPerMinute <= 360) {
                this.at = stepPerMinute;
            } else {
                LogUtil.j("Track_IDEQ_DataCleaner", "cadence not in valid scope and cadenceValue =", Integer.valueOf(stepPerMinute));
            }
            this.bf.setStepPerMinute(this.at);
            return;
        }
        LogUtil.j("Track_IDEQ_DataCleaner", "do not support this data");
    }

    private void a(int i, int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            LogUtil.j("Track_IDEQ_DataCleaner", "value not in valid scope", "dataType =", Integer.valueOf(i), "value =", Integer.valueOf(i2));
            return;
        }
        if (i == 3) {
            this.m = i2;
            return;
        }
        if (i == 9) {
            this.v = i2;
            return;
        }
        if (i == 26) {
            this.ac = i2;
            return;
        }
        if (i == 28) {
            this.ad = i2;
            return;
        }
        if (i == 32) {
            this.p = i2;
        } else if (i != 33) {
            LogUtil.j("Track_IDEQ_DataCleaner", "do not have this dataType", Integer.valueOf(i));
        } else {
            this.w = i2;
        }
    }

    private void f() {
        if (this.bf.getFitnessHashMap().containsKey(22)) {
            a(this.bf.getResistanceLevel());
        }
    }

    private void a(int i) {
        if (this.bf.getFitnessDataType() == 10) {
            int i2 = i * 10;
            if (i2 >= this.bi && i2 <= this.bd) {
                this.bf.setResistanceLevel(i);
                return;
            } else {
                LogUtil.j("Track_IDEQ_DataCleaner", "indoor bike resistanceLevel not in valid scope resistanceLevel =", Integer.valueOf(i));
                this.bf.setResistanceLevel(-1);
                return;
            }
        }
        if (this.bf.getFitnessDataType() == 6) {
            if (i >= this.bi && i <= this.bd) {
                this.bf.setResistanceLevel(i);
                return;
            } else {
                LogUtil.j("Track_IDEQ_DataCleaner", "cross trainer resistanceLevel not in valid scope resistanceLevel =", Integer.valueOf(i));
                this.bf.setResistanceLevel(-1);
                return;
            }
        }
        LogUtil.d("Track_IDEQ_DataCleaner", "this machine not have resistance level");
    }

    private void g() {
        if (this.bf.getFitnessHashMap().containsKey(24)) {
            int instantaneousPower = this.bf.getInstantaneousPower();
            this.f = instantaneousPower;
            c(24, instantaneousPower);
            this.bf.setInstantaneousPower(this.n);
        }
        if (this.bf.getFitnessHashMap().containsKey(25)) {
            c(25, this.bf.getAveragePower());
            this.bf.setAveragePower(this.x);
        }
    }

    private void c(int i, int i2) {
        if (this.bf.getFitnessDataType() == 11) {
            d(i, i2, 2000);
        } else if (this.bf.getFitnessDataType() == 10 || this.bf.getFitnessDataType() == 6) {
            d(i, i2, 1000);
        } else {
            LogUtil.j("Track_IDEQ_DataCleaner", "not support this machine");
        }
    }

    private void d(int i, int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            LogUtil.j("Track_IDEQ_DataCleaner", "powerValue not in valid scope", "dataType =", Integer.valueOf(i), "powerValue =", Integer.valueOf(i2));
            return;
        }
        if (i == 24) {
            this.n = i2;
        } else if (i != 25) {
            LogUtil.j("Track_IDEQ_DataCleaner", "not have this dataType");
        } else {
            this.x = i2;
        }
    }

    private void i() {
        if (this.bf.getFitnessHashMap().containsKey(3)) {
            int instantaneousSpeed = this.bf.getInstantaneousSpeed();
            this.l = instantaneousSpeed;
            a(3, instantaneousSpeed, 10000);
            this.bf.setInstantaneousSpeed(this.m);
        }
        if (this.bf.getFitnessHashMap().containsKey(9)) {
            a(9, this.bf.getAverageSpeed(), 10000);
            this.bf.setAverageSpeed(this.v);
        }
    }

    private void z() {
        LogUtil.d("Track_IDEQ_DataCleaner", "updateDataForOpcode mSportState:", Integer.valueOf(this.as));
        int i = this.as;
        if (i != 0) {
            if (i == 1) {
                this.bf.setTrainingStatus(13);
                this.bf.setOpCode(4);
                MachineStatus machineStatus = this.ah;
                if (machineStatus != null) {
                    machineStatus.setOpCode(4);
                }
                TrainingStatus trainingStatus = this.bg;
                if (trainingStatus != null) {
                    trainingStatus.setTrainingStatus(13);
                    return;
                }
                return;
            }
            if (i == 2) {
                this.bf.setTrainingStatus(13);
                this.bf.setOpCode(2);
                this.bf.setMachineStatusCharacteristic(2);
                MachineStatus machineStatus2 = this.ah;
                if (machineStatus2 != null) {
                    machineStatus2.setOpCode(2);
                    this.ah.setMachineStatusCharacteristic(2);
                }
                TrainingStatus trainingStatus2 = this.bg;
                if (trainingStatus2 != null) {
                    trainingStatus2.setTrainingStatus(13);
                    return;
                }
                return;
            }
            if (i != 3) {
                return;
            }
        }
        this.bf.setTrainingStatus(1);
        this.bf.setOpCode(2);
        this.bf.setMachineStatusCharacteristic(1);
        MachineStatus machineStatus3 = this.ah;
        if (machineStatus3 != null) {
            machineStatus3.setOpCode(2);
            this.ah.setMachineStatusCharacteristic(1);
        }
        TrainingStatus trainingStatus3 = this.bg;
        if (trainingStatus3 != null) {
            trainingStatus3.setTrainingStatus(1);
        }
    }

    private void ad() {
        int i = this.as;
        if (i == 3 || i == 0) {
            return;
        }
        z();
        this.bf.setInstantaneousSpeed(this.m);
        this.bf.setStepPerMinute(this.at);
        this.bf.setRevsPerMinute(this.aq);
        this.bf.setTotalEnergy(this.bh);
        this.bf.setInstantaneousPower(this.n);
        this.bf.setPowerInCalPerMin(this.an);
        this.bf.setPositiveElevationGain(this.aj);
        this.bf.setNegativeElevationGain(this.ae);
        this.bf.setElapsedTime(this.f43909a);
    }

    private void ac() {
        int i = this.as;
        if (i == 3 || i == 0) {
            return;
        }
        if (this.bf.getFitnessHashMap().containsKey(1)) {
            this.bf.setTotalDistance(this.ay);
        }
        if (this.bf.getFitnessHashMap().containsKey(6)) {
            this.bf.setTotalEnergy(this.bh);
        }
        if (this.bf.getFitnessHashMap().containsKey(2)) {
            this.bf.setElapsedTime(this.g);
        }
        if (this.bf.getFitnessHashMap().containsKey(27)) {
            this.bf.setStrokeCount(this.ax);
        }
        if (this.bf.getFitnessHashMap().containsKey(23)) {
            this.bf.setStrideCount(this.aw);
        }
    }

    private void w() {
        MachineStatus machineStatus = this.ah;
        if (machineStatus == null) {
            return;
        }
        Iterator<Integer> it = machineStatus.getFitnessHashMap().keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (iIntValue == 20008) {
                this.af = this.ah.getOpCode();
            } else if (iIntValue == 20009) {
                this.ag = this.ah.getMachineStatusCharacteristic();
            }
        }
    }

    private void u() {
        Iterator<Integer> it = this.bf.getFitnessHashMap().keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (iIntValue == 2) {
                this.f43909a = this.bf.getElapsedTime();
            } else if (iIntValue == 3) {
                this.l = this.bf.getInstantaneousSpeed();
            } else if (iIntValue == 4) {
                this.av = this.bf.getStepPerMinute();
            } else if (iIntValue == 5) {
                this.ak = this.bf.getRevsPerMinute();
            } else if (iIntValue == 6) {
                this.be = this.bf.getTotalEnergy();
            } else if (iIntValue == 12) {
                this.am = this.bf.getPositiveElevationGain();
            } else if (iIntValue == 13) {
                this.ai = this.bf.getNegativeElevationGain();
            } else if (iIntValue == 24) {
                this.f = this.bf.getInstantaneousPower();
            } else if (iIntValue == 25) {
                this.al = this.bf.getPowerInCalPerMin();
            }
        }
    }

    private void x() {
        if (this.bf.getFitnessHashMap().containsKey(1)) {
            this.bc = this.bf.getTotalDistance();
        }
        if (this.bf.getFitnessHashMap().containsKey(6)) {
            this.be = this.bf.getTotalEnergy();
        }
        if (this.bf.getFitnessHashMap().containsKey(2)) {
            this.e = this.bf.getElapsedTime();
        }
        if (this.bf.getFitnessHashMap().containsKey(27)) {
            this.ba = this.bf.getStrokeCount();
        }
        if (this.bf.getFitnessHashMap().containsKey(23)) {
            this.au = this.bf.getStrideCount();
        }
    }

    private void m() {
        int i = this.bc;
        if (i > 0 && i >= this.ay) {
            this.ay = i;
        }
        int i2 = this.be;
        if (i2 > 0 && i2 >= this.bh) {
            this.bh = i2;
        }
        int i3 = this.e;
        if (i3 > 0 && i3 >= this.g) {
            this.g = i3;
        }
        int i4 = this.ba;
        if (i4 > 0 && i4 >= this.ax) {
            this.ax = i4;
        }
        int i5 = this.au;
        if (i5 <= 0 || i5 < this.aw) {
            return;
        }
        this.aw = i5;
    }

    private void s() {
        int i = this.g;
        if (i > 0 || this.q) {
            if (this.r) {
                this.r = false;
                LogUtil.a("Track_IDEQ_DataCleaner", "detectPauseState(otherEquip), now will get first time value:", Integer.valueOf(i));
                if (this.g > 2) {
                    LogUtil.a("Track_IDEQ_DataCleaner", "detectPauseState(otherEquip), got first time value and it is larger than 2");
                    this.h = this.g;
                    this.q = true;
                    this.g = 0;
                    return;
                }
                LogUtil.a("Track_IDEQ_DataCleaner", "detectPauseState(otherEquip), got first time value and it is NOT larger than 2");
            }
            if (this.h > 0) {
                LogUtil.a("Track_IDEQ_DataCleaner", "detectPauseState(otherEquip),", "now will handle the situation(got first time value and it is larger than 2)");
                int i2 = this.g;
                int i3 = this.h;
                if (i2 == i3) {
                    LogUtil.a("Track_IDEQ_DataCleaner", "mElapsedTimeValid1(otherEquip) (", Integer.valueOf(i2), ") is equals to mFirstTimeValueWhichIsLargerThan2");
                    this.g = 0;
                    return;
                } else {
                    if (i2 < i3) {
                        this.q = false;
                        LogUtil.a("Track_IDEQ_DataCleaner", "mElapsedTimeValid2(otherEquip) (", Integer.valueOf(i2), ") is smaller than mFirstTimeValueWhichIsLargerThan2");
                        this.h = 0;
                        this.g = 0;
                        return;
                    }
                    LogUtil.a("Track_IDEQ_DataCleaner", "mElapsedTimeValid3(otherEquip) (", Integer.valueOf(i2), ") is larger than mFirstTimeValueWhichIsLargerThan2");
                    this.h = 0;
                }
            }
            this.q = true;
            p();
        }
    }

    private void p() {
        w();
        k();
        b();
        int i = this.af;
        boolean z = (i == 2 && this.ag == 1) || i == 3;
        if (this.as == 3 && this.j) {
            LogUtil.a("Track_IDEQ_DataCleaner", "detected state and state already stop. do nothing(FTMS)");
        } else if (this.o && this.s && i == 2 && this.ag == 2) {
            LogUtil.a("Track_IDEQ_DataCleaner", "detected onPause state of FTMP (ForOtherEquipment)");
            this.as = 2;
            this.o = false;
            this.bb = SystemClock.elapsedRealtime();
            this.j = true;
        } else if (this.k && this.s && z) {
            LogUtil.a("Track_IDEQ_DataCleaner", "detected STOP state of FTMP (ForOtherEquipment)");
            this.as = 3;
            this.k = false;
            this.o = false;
        } else if (this.f43911c - this.ar >= 2500) {
            LogUtil.a("Track_IDEQ_DataCleaner", "detected time  (ForOtherEquipment) decreasing twice, mElapsedTimeValid is ", Integer.valueOf(this.g));
            this.as = 2;
            this.k = true;
            this.o = false;
            this.j = true;
        } else if (this.f43910b - this.ao >= 2000) {
            LogUtil.a("Track_IDEQ_DataCleaner", "detected onPause state (ForOtherEquipment), mElapsedTimeValid ", Integer.valueOf(this.g));
            this.as = 2;
            this.k = true;
            this.o = false;
            this.j = true;
        } else if (v()) {
            this.as = 1;
            this.k = true;
            this.o = true;
            this.j = true;
            this.bb = 0L;
        } else {
            LogUtil.a("Track_IDEQ_DataCleaner", "detected state and not meet any conditions(ForOtherEquipment)");
        }
        if (this.f43911c <= 0) {
            this.aa = this.g;
        }
        LogUtil.a("Track_IDEQ_DataCleaner", "startDetectPauseState  (ForOtherEquipment) mSportState:", Integer.valueOf(this.as));
    }

    private boolean v() {
        if (this.bf.getFitnessDataType() == 10 && SystemClock.elapsedRealtime() - this.bb >= 2000) {
            LogUtil.a("Track_IDEQ_DataCleaner", "FITNESS_DATA_INDOORBIKE_DATA AllowedToResume");
            return true;
        }
        if (SystemClock.elapsedRealtime() - this.bb < 4500) {
            return false;
        }
        LogUtil.a("Track_IDEQ_DataCleaner", "AllowedToResume");
        return true;
    }

    private void o() {
        t();
        r();
        l();
        q();
    }

    private void q() {
        int i = this.am;
        if (i > 0 && i >= this.aj) {
            this.aj = i;
        }
        int i2 = this.ai;
        if (i2 <= 0 || i2 < this.ae) {
            return;
        }
        this.ae = i2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0048  */
    private void l() {
        if (this.as == 0) {
            LogUtil.a("Track_IDEQ_DataCleaner", "in detectInvalidCalAndPowerValue: mSportState is IDLE and set cal 0");
            this.be = 0;
            this.bh = 0;
            return;
        }
        LogUtil.d("Track_IDEQ_DataCleaner", "in detectInvalidCalAndPowerValue: mEnergyRawLast:", Integer.valueOf(this.i), ", mTotalEnergyRaw:", Integer.valueOf(this.be));
        int i = this.i;
        if (i > 0) {
            int i2 = this.be;
            if (i2 - i > 20 || i > i2) {
                LogUtil.a("Track_IDEQ_DataCleaner", "in detectInvalidCalAndPowerValue: has been identified as invalid cal");
                this.be = this.i;
            } else {
                this.i = this.be;
            }
        } else {
            this.i = this.be;
        }
        this.bh = this.be;
        if (this.f > 1000) {
            LogUtil.a("Track_IDEQ_DataCleaner", "in detectInvalidCalAndPowerValue: mInstantaneousPowerRaw is invalid");
            this.f = (this.f + 50) / 100;
        }
        this.n = this.f;
        this.an = this.al;
    }

    private void t() {
        int i;
        if (!this.t && (this.l > 0 || this.av > 0 || this.ak > 0)) {
            LogUtil.a("Track_IDEQ_DataCleaner", "in detectInvalidSpeedValue and has get a speed value larger than 0");
            this.t = true;
        }
        if (this.t && this.l == 0 && this.av == 0 && this.ak == 0 && this.u > 0 && (i = this.as) != 0 && i != 3) {
            LogUtil.a("Track_IDEQ_DataCleaner", "in detectInvalidSpeedValue, speed is 0 and LastElapsedTime >0 ", "and state is not idle and stop, make ElapsedTime = LastElapsedTime");
            this.f43909a = this.u;
        }
        int i2 = this.l;
        if (i2 < 0 || i2 > 4000) {
            LogUtil.a("Track_IDEQ_DataCleaner", "in detectInvalidSpeedValue, speed is invalid, now set it 0");
            this.l = 0;
        }
        this.m = this.l;
        int i3 = this.av;
        if (i3 > 0) {
            this.at = i3;
        }
        int i4 = this.ak;
        if (i4 > 0) {
            this.aq = i4;
        }
    }

    private void r() {
        LogUtil.a("Track_IDEQ_DataCleaner", "in detectPauseState");
        int i = this.f43909a;
        if (i > 0 || this.q) {
            if (this.r) {
                this.r = false;
                LogUtil.a("Track_IDEQ_DataCleaner", "in detectPauseState, now will get first time value:", Integer.valueOf(i));
                if (this.f43909a > 2) {
                    LogUtil.a("Track_IDEQ_DataCleaner", "in detectPauseState, got first time value and it is larger than 2");
                    this.h = this.f43909a;
                    this.q = true;
                    this.f43909a = 0;
                    return;
                }
                LogUtil.a("Track_IDEQ_DataCleaner", "in detectPauseState, got first time value and it is NOT larger than 2");
            }
            if (this.h > 0) {
                LogUtil.a("Track_IDEQ_DataCleaner", "in detectPauseState, now will handle the situation(got first time value and it is larger than 2)");
                int i2 = this.f43909a;
                int i3 = this.h;
                if (i2 == i3) {
                    LogUtil.a("Track_IDEQ_DataCleaner", "mElapsedTimeForShowAndDetectPause1 (", Integer.valueOf(i2), ") is equals to mFirstTimeValueWhichIsLargerThan2");
                    this.f43909a = 0;
                    return;
                } else {
                    if (i2 < i3) {
                        this.q = false;
                        LogUtil.a("Track_IDEQ_DataCleaner", "mElapsedTimeForShowAndDetectPause2 (", Integer.valueOf(i2), ") is smaller than mFirstTimeValueWhichIsLargerThan2");
                        this.h = 0;
                        this.f43909a = 0;
                        return;
                    }
                    LogUtil.a("Track_IDEQ_DataCleaner", "mElapsedTimeForShowAndDetectPause3 (", Integer.valueOf(i2), ") is larger than mFirstTimeValueWhichIsLargerThan2");
                    this.h = 0;
                }
            }
            this.q = true;
            ab();
        }
    }

    private void ab() {
        LogUtil.a("Track_IDEQ_DataCleaner", "startDetectPauseState entry");
        aa();
        e();
        int i = this.af;
        boolean z = (i == 2 && this.ag == 1) || i == 3;
        if (this.as == 3 && this.j) {
            LogUtil.a("Track_IDEQ_DataCleaner", "detected state and state already stop. do nothing");
        } else if (this.o && this.s && i == 2 && this.ag == 2) {
            LogUtil.a("Track_IDEQ_DataCleaner", "detected onPause state of FTMP");
            this.as = 2;
            this.o = false;
            this.bb = SystemClock.elapsedRealtime();
            this.j = true;
        } else if (this.k && this.s && z) {
            LogUtil.a("Track_IDEQ_DataCleaner", "detected STOP state of FTMP");
            this.as = 3;
            this.k = false;
            this.o = false;
        } else {
            long j = this.f43911c;
            long j2 = this.ar;
            long j3 = this.ap;
            if (j - j2 >= j3) {
                LogUtil.a("Track_IDEQ_DataCleaner", "detected time decreasing twice, mElapsedTimeForShowAndDetectPause is ", Integer.valueOf(this.f43909a));
                this.as = 2;
                this.k = true;
                this.o = false;
                this.j = true;
            } else if (this.f43910b - this.ao >= j3) {
                LogUtil.a("Track_IDEQ_DataCleaner", "detected onPause state");
                this.as = 2;
                this.k = true;
                this.o = false;
                this.j = true;
            } else if (SystemClock.elapsedRealtime() - this.bb >= 4500) {
                this.as = 1;
                this.k = true;
                this.o = true;
                this.bb = 0L;
                this.j = true;
            } else {
                LogUtil.a("Track_IDEQ_DataCleaner", "detected state and not meet any conditions");
            }
        }
        if (this.f43911c <= 0) {
            this.u = this.f43909a;
        }
        LogUtil.a("Track_IDEQ_DataCleaner", "startDetectPauseState mSportState:", Integer.valueOf(this.as));
    }

    private void aa() {
        this.ap = 2500L;
        DeviceInformation deviceInformation = this.d;
        if (deviceInformation != null && deviceInformation.getModelString() != null && (this.d.getModelString().toUpperCase(Locale.ENGLISH).contains("T7XE") || this.d.getModelString().toUpperCase(Locale.ENGLISH).contains("T-7XE"))) {
            this.ap = C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS;
        }
        int i = this.u;
        if (i > 0 && i == this.f43909a) {
            if (this.ao == 0) {
                this.ao = SystemClock.elapsedRealtime();
            }
            this.f43910b = SystemClock.elapsedRealtime();
        } else {
            this.ao = 0L;
            this.f43910b = 0L;
        }
    }

    private void e() {
        int i = this.u;
        if (i > 0) {
            int i2 = this.f43909a;
            if (i - i2 > 2) {
                LogUtil.a("Track_IDEQ_DataCleaner", "detected time decreasing, ", ", mLastElapsedTimeForShowAndDetectPause:", Integer.valueOf(i), ", mElapsedTimeForShowAndDetectPause:", Integer.valueOf(i2));
                this.f43909a = this.u;
                this.f43911c = SystemClock.elapsedRealtime();
                if (this.ar == 0) {
                    this.ar = SystemClock.elapsedRealtime();
                    return;
                }
                return;
            }
        }
        if (i - this.f43909a <= 2) {
            this.ar = 0L;
            this.f43911c = 0L;
        } else {
            LogUtil.j("Track_IDEQ_DataCleaner", "Unknown state in startDetectPauseState");
        }
    }

    private void b() {
        int i = this.aa;
        if (i > 0) {
            int i2 = this.g;
            if (i - i2 > 2) {
                LogUtil.a("Track_IDEQ_DataCleaner", "detected time  (ForOtherEquipment) decreasing, ", ", mLastElapsedTimeValid:", Integer.valueOf(i), ", mElapsedTimeValid:", Integer.valueOf(i2));
                this.g = this.aa;
                this.f43911c = SystemClock.elapsedRealtime();
                if (this.ar == 0) {
                    this.ar = SystemClock.elapsedRealtime();
                    return;
                }
                return;
            }
        }
        if (i - this.g <= 2) {
            this.ar = 0L;
            this.f43911c = 0L;
        } else {
            LogUtil.j("Track_IDEQ_DataCleaner", "Unknown state in startDetectPauseState (ForOtherEquipment)");
        }
    }

    private void k() {
        int i = this.aa;
        if (i > 0 && i == this.g) {
            if (this.ao == 0) {
                this.ao = SystemClock.elapsedRealtime();
            }
            this.f43910b = SystemClock.elapsedRealtime();
        } else {
            this.ao = 0L;
            this.f43910b = 0L;
        }
    }

    public void d() {
        this.ak = 0;
        this.l = 0;
        this.f43909a = 0;
        this.be = 0;
        this.i = 0;
        this.bh = 0;
        this.f = 0;
        this.am = 0;
        this.aj = 0;
        this.ai = 0;
        this.ae = 0;
        this.bc = 0;
        this.ay = 0;
        this.ba = 0;
        this.ax = 0;
        this.e = 0;
        this.g = 0;
        this.au = 0;
        this.aw = 0;
        this.as = 0;
        this.h = 0;
        this.u = 0;
        this.aa = 0;
        this.ar = 0L;
        this.f43911c = 0L;
        this.ao = 0L;
        this.f43910b = 0L;
        this.r = true;
        this.q = false;
        this.t = false;
        this.k = false;
        this.o = false;
        this.j = false;
        this.bb = 0L;
        this.ap = 2500L;
        ad();
        ac();
    }
}
