package defpackage;

import com.huawei.health.device.model.FitnessData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.datastruct.FitnessMachineFeature;
import com.huawei.indoorequip.datastruct.IndoorEquipTrainerData;
import com.huawei.indoorequip.datastruct.MachineControlPointResponse;
import com.huawei.indoorequip.datastruct.MachineStatus;
import com.huawei.indoorequip.datastruct.SupportDataRange;
import com.huawei.indoorequip.datastruct.TrainingStatus;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public class nxq extends nxv {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FitnessMachineFeature f43908c = new FitnessMachineFeature();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IndoorEquipTrainerData f43906a = new IndoorEquipTrainerData();
    private TrainingStatus j = new TrainingStatus();
    private MachineStatus e = new MachineStatus();
    private SupportDataRange d = new SupportDataRange();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MachineControlPointResponse f43907b = new MachineControlPointResponse();

    public IndoorEquipTrainerData d() {
        return this.f43906a;
    }

    public MachineStatus c() {
        return this.e;
    }

    public TrainingStatus a() {
        return this.j;
    }

    public FitnessMachineFeature c(byte[] bArr) {
        if (bArr != null) {
            this.f43908c.clearData();
            int iD = d(bArr, 20, 0);
            int iD2 = d(bArr, 20, 4);
            LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) ParseFitnessMachineFeatureCharacteristic: machineFeatureFlag:", Integer.valueOf(iD), ", targetFeatureFlag:", Integer.valueOf(iD2));
            this.f43908c.setFitnessMachineFeature(iD);
            this.f43908c.setTargetSettingFeature(iD2);
        }
        return this.f43908c;
    }

    private IndoorEquipTrainerData o(byte[] bArr) {
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) parseRowerDataCharacteristic");
        int iD = d(bArr, 18, 0);
        this.f43906a.setFlags(iD);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) RowerDataCharacteristic, intFlags:", Integer.valueOf(iD));
        y(bArr, ad(bArr, q(bArr, m(bArr, p(bArr, j(bArr, z(bArr, 2, iD), iD), iD), iD), iD), iD), iD);
        return this.f43906a;
    }

    private int z(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return i;
        }
        if ((i2 & 1) == 0) {
            int iD = d(bArr, 17, i);
            this.f43906a.setStrokeRate(iD);
            LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) RowerDataCharacteristic, Stroke_Rate:", Integer.valueOf(iD));
            int iD2 = d(bArr, 18, i + 1);
            i += 3;
            this.f43906a.setStrokeCount(iD2);
            LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) RowerDataCharacteristic, Stroke_Count:", Integer.valueOf(iD2));
        }
        if ((i2 & 2) == 0) {
            return i;
        }
        int iD3 = d(bArr, 17, i);
        int i3 = i + 1;
        this.f43906a.setAverageStrokeRate(iD3);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) RowerDataCharacteristic, Average_Stroke_Rate:", Integer.valueOf(iD3));
        return i3;
    }

    private int j(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return i;
        }
        if ((i2 & 4) != 0) {
            int iD = d(bArr, i);
            i += 3;
            this.f43906a.setTotalDistance(iD);
            LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) RowerDataCharacteristic, totalDistance:", Integer.valueOf(iD));
        }
        if ((i2 & 8) != 0) {
            int iD2 = d(bArr, 18, i);
            i += 2;
            this.f43906a.setInstantaneousPace(iD2);
            LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) RowerDataCharacteristic, Instantaneous_Pace:", Integer.valueOf(iD2));
        }
        if ((i2 & 16) == 0) {
            return i;
        }
        int iD3 = d(bArr, 18, i);
        int i3 = i + 2;
        this.f43906a.setAveragePace(iD3);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) RowerDataCharacteristic, Average_Pace:", Integer.valueOf(iD3));
        return i3;
    }

    private int p(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return i;
        }
        if ((i2 & 32) != 0) {
            int iD = d(bArr, 18, i);
            i += 2;
            this.f43906a.setInstantaneousPower(iD);
            LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) RowerDataCharacteristic, Instantaneous_Power:", Integer.valueOf(iD));
        }
        if ((i2 & 64) != 0) {
            int iD2 = d(bArr, 18, i);
            i += 2;
            this.f43906a.setAveragePower(iD2);
            LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) RowerDataCharacteristic, Average_Power:", Integer.valueOf(iD2));
        }
        if ((i2 & 128) == 0) {
            return i;
        }
        int iD3 = d(bArr, 18, i);
        int i3 = i + 2;
        this.f43906a.setResistanceLevel(iD3);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) RowerDataCharacteristic, Resistance_Level:", Integer.valueOf(iD3));
        return i3;
    }

    private int m(byte[] bArr, int i, int i2) {
        if (bArr == null || (i2 & 256) == 0) {
            return i;
        }
        int iD = d(bArr, 18, i);
        this.f43906a.setTotalEnergy(iD);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) RowerDataCharacteristic, Total_Energy:", Integer.valueOf(iD));
        int iD2 = d(bArr, 18, i + 2);
        this.f43906a.setEnergyPerHour(iD2);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) RowerDataCharacteristic, Energy_Per_Hour:", Integer.valueOf(iD2));
        int iD3 = d(bArr, 17, i + 4);
        int i3 = i + 5;
        this.f43906a.setEnergyPerMin(iD3);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) RowerDataCharacteristic, Energy_Per_Minute:", Integer.valueOf(iD3));
        return i3;
    }

    private int q(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return i;
        }
        if ((i2 & 512) != 0) {
            int iD = d(bArr, 17, i);
            i++;
            this.f43906a.setHeartRate(iD);
            LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) RowerDataCharacteristic, Heart_Rate:", Integer.valueOf(iD));
        }
        if ((i2 & 1024) == 0) {
            return i;
        }
        int iD2 = d(bArr, 17, i);
        int i3 = i + 1;
        this.f43906a.setMetabolicEquivalent(iD2);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) RowerDataCharacteristic, Metabolic_Equivalent:", Integer.valueOf(iD2));
        return i3;
    }

    private int ad(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return i;
        }
        if ((i2 & 2048) != 0) {
            int iD = d(bArr, 18, i);
            i += 2;
            this.f43906a.setElapsedTime(iD);
            LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) RowerDataCharacteristic, Elapsed_Time:", Integer.valueOf(iD));
        }
        if ((i2 & 4096) == 0) {
            return i;
        }
        int iD2 = d(bArr, 18, i);
        int i3 = i + 2;
        this.f43906a.setRemainingTime(iD2);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) RowerDataCharacteristic, Remaining_Time:", Integer.valueOf(iD2));
        return i3;
    }

    private int y(byte[] bArr, int i, int i2) {
        if (bArr == null || (i2 & 8192) == 0) {
            return i;
        }
        int iD = d(bArr, 18, i);
        this.f43906a.setWeight(iD);
        int iD2 = d(bArr, 18, i + 2);
        this.f43906a.setStrokeCountForStrengthModel(iD2);
        int iD3 = d(bArr, 18, i + 4);
        this.f43906a.setTotalActionGroups(iD3);
        int iD4 = d(bArr, 18, i + 6);
        this.f43906a.setNumberOfActionsPerGroup(iD4);
        int iD5 = d(bArr, 18, i + 8);
        int i3 = i + 10;
        this.f43906a.setFrequencyOfAction(iD5);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) RowerDataCharacteristic, weight:", Integer.valueOf(iD), " strokeCountForStrength:", Integer.valueOf(iD2), " totalActionGroups:", Integer.valueOf(iD3), " numberOfActionsPerGroup:", Integer.valueOf(iD4), " frequencyOfAction:", Integer.valueOf(iD5));
        return i3;
    }

    private IndoorEquipTrainerData f(byte[] bArr) {
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) parseCrossTrainerDataCharacteristic");
        int iD = d(bArr, 0);
        this.f43906a.setFlags(iD);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) CrossTrainerDataCharacteristic, intFlags:", Integer.valueOf(iD));
        ab(bArr, n(bArr, o(bArr, w(bArr, s(bArr, k(bArr, u(bArr, x(bArr, 3, iD), iD), iD), iD), iD), iD), iD), iD);
        return this.f43906a;
    }

    private int x(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return i;
        }
        if ((i2 & 1) == 0) {
            int iD = d(bArr, 18, i);
            i += 2;
            this.f43906a.setInstantaneousSpeed(iD);
            LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) CrossTrainerDataCharacteristic, Instantaneous_Speed:", Integer.valueOf(iD));
        }
        if ((i2 & 2) != 0) {
            int iD2 = d(bArr, 18, i);
            i += 2;
            this.f43906a.setAverageSpeed(iD2);
            LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) CrossTrainerDataCharacteristic, Average_Speed:", Integer.valueOf(iD2));
        }
        if ((i2 & 4) == 0) {
            return i;
        }
        int iD3 = d(bArr, i);
        int i3 = i + 3;
        this.f43906a.setTotalDistance(iD3);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) CrossTrainerDataCharacteristic, totalDistance:", Integer.valueOf(iD3));
        return i3;
    }

    private int u(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return i;
        }
        if ((i2 & 8) != 0) {
            int iD = d(bArr, 18, i);
            this.f43906a.setStepPerMinute(iD);
            LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) CrossTrainerDataCharacteristic, Step_Per_Minute:", Integer.valueOf(iD));
            int iD2 = d(bArr, 18, i + 2);
            i += 4;
            this.f43906a.setAverateStepRate(iD2);
            LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) CrossTrainerDataCharacteristic, Average_Step_Rate:", Integer.valueOf(iD2));
        }
        if ((i2 & 16) == 0) {
            return i;
        }
        int iD3 = d(bArr, 18, i);
        int i3 = i + 2;
        this.f43906a.setStrideCount(iD3 * 2);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) CrossTrainerDataCharacteristic, STRIDE_COUNT:", Integer.valueOf(iD3));
        return i3;
    }

    private int k(byte[] bArr, int i, int i2) {
        if (bArr == null || (i2 & 32) == 0) {
            return i;
        }
        int iD = d(bArr, 18, i);
        this.f43906a.setPositiveElevationGain(iD);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) CrossTrainerDataCharacteristic, Positive_Elevation_Gain:", Integer.valueOf(iD));
        int iD2 = d(bArr, 18, i + 2);
        int i3 = i + 4;
        this.f43906a.setNegativeElevationGain(iD2);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) CrossTrainerDataCharacteristic, Negative_Elevation_Gain:", Integer.valueOf(iD2));
        return i3;
    }

    private int s(byte[] bArr, int i, int i2) {
        if (bArr == null || (i2 & 64) == 0) {
            return i;
        }
        int iD = d(bArr, 18, i);
        this.f43906a.setInclination(iD);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) CrossTrainerDataCharacteristic, Inclination:", Integer.valueOf(iD));
        int iD2 = d(bArr, 18, i + 2);
        int i3 = i + 4;
        this.f43906a.setRampAngleSetting(iD2);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) CrossTrainerDataCharacteristic, Ramp_Angle_Setting:", Integer.valueOf(iD2));
        return i3;
    }

    private int w(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return i;
        }
        if ((i2 & 128) != 0) {
            int iD = d(bArr, 18, i);
            i += 2;
            this.f43906a.setResistanceLevel(iD);
            LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) CrossTrainerDataCharacteristic, Resistance_Level:", Integer.valueOf(iD));
        }
        if ((i2 & 256) != 0) {
            int iD2 = d(bArr, 18, i);
            i += 2;
            this.f43906a.setInstantaneousPower(iD2);
            LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) CrossTrainerDataCharacteristic, Instantaneous_Power:", Integer.valueOf(iD2));
        }
        if ((i2 & 512) == 0) {
            return i;
        }
        int iD3 = d(bArr, 18, i);
        int i3 = i + 2;
        this.f43906a.setAveragePower(iD3);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) CrossTrainerDataCharacteristic, Average_Power:", Integer.valueOf(iD3));
        return i3;
    }

    private int o(byte[] bArr, int i, int i2) {
        if (bArr == null || (i2 & 1024) == 0) {
            return i;
        }
        int iD = d(bArr, 18, i);
        this.f43906a.setTotalEnergy(iD);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) CrossTrainerDataCharacteristic, Total_Energy:", Integer.valueOf(iD));
        int iD2 = d(bArr, 18, i + 2);
        this.f43906a.setEnergyPerHour(iD2);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) CrossTrainerDataCharacteristic, Energy_Per_Hour:", Integer.valueOf(iD2));
        int iD3 = d(bArr, 17, i + 4);
        int i3 = i + 5;
        this.f43906a.setEnergyPerMin(iD3);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) CrossTrainerDataCharacteristic, Energy_Per_Minute:", Integer.valueOf(iD3));
        return i3;
    }

    private int n(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return i;
        }
        if ((i2 & 2048) != 0) {
            int iD = d(bArr, 17, i);
            i++;
            this.f43906a.setHeartRate(iD);
            LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) CrossTrainerDataCharacteristic, Heart_Rate:", Integer.valueOf(iD));
        }
        if ((i2 & 4096) == 0) {
            return i;
        }
        int iD2 = d(bArr, 17, i);
        int i3 = i + 1;
        this.f43906a.setMetabolicEquivalent(iD2);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) CrossTrainerDataCharacteristic, Metabolic_Equivalent:", Integer.valueOf(iD2));
        return i3;
    }

    private int ab(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            if ((i2 & 8192) != 0) {
                int iD = d(bArr, 18, i);
                i += 2;
                this.f43906a.setElapsedTime(iD);
                LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) CrossTrainerDataCharacteristic, Elapsed_Time:", Integer.valueOf(iD));
            }
            if ((i2 & 16384) != 0) {
                int iD2 = d(bArr, 18, i);
                i += 2;
                this.f43906a.setRemainingTime(iD2);
                LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) CrossTrainerDataCharacteristic, Remaining_Time:", Integer.valueOf(iD2));
            }
            if ((32768 & i2) != 0) {
                this.f43906a.setMovementDirection(false);
                LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) CrossTrainerDataCharacteristic, MovementDirection: Backward");
                return i;
            }
            this.f43906a.setMovementDirection(true);
            LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) CrossTrainerDataCharacteristic, MovementDirection: Forward");
        }
        return i;
    }

    private IndoorEquipTrainerData n(byte[] bArr) {
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) parseIndoorBikeDataCharacteristic");
        int iD = d(bArr, 18, 0);
        this.f43906a.setFlags(iD);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) IndoorBikeDataCharacteristic, intFlags:", Integer.valueOf(iD));
        aa(bArr, r(bArr, l(bArr, t(bArr, h(bArr, v(bArr, 2, iD), iD), iD), iD), iD), iD);
        return this.f43906a;
    }

    private int v(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return i;
        }
        if ((i2 & 1) == 0) {
            int iD = d(bArr, 18, i);
            i += 2;
            this.f43906a.setInstantaneousSpeed(iD);
            LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) IndoorBikeDataCharacteristic, Instantaneous_Speed:", Integer.valueOf(iD));
        }
        if ((i2 & 2) != 0) {
            int iD2 = d(bArr, 18, i);
            i += 2;
            this.f43906a.setAverageSpeed(iD2);
            LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) IndoorBikeDataCharacteristic, Average_Speed:", Integer.valueOf(iD2));
        }
        if ((i2 & 4) != 0) {
            int iD3 = d(bArr, 18, i);
            i += 2;
            this.f43906a.setInstantaneousCadence(iD3);
            LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) IndoorBikeDataCharacteristic, Instantaneous_Cadence:", Integer.valueOf(iD3));
        }
        if ((i2 & 8) == 0) {
            return i;
        }
        int iD4 = d(bArr, 18, i);
        int i3 = i + 2;
        this.f43906a.setAverageCadence(iD4);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) IndoorBikeDataCharacteristic, Average_Cadence:", Integer.valueOf(iD4));
        return i3;
    }

    private int h(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return i;
        }
        if ((i2 & 16) != 0) {
            int iD = d(bArr, i);
            i += 3;
            this.f43906a.setTotalDistance(iD);
            LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) IndoorBikeDataCharacteristic, totalDistance:", Integer.valueOf(iD));
        }
        if ((i2 & 32) == 0) {
            return i;
        }
        int iD2 = d(bArr, 18, i);
        int i3 = i + 2;
        this.f43906a.setResistanceLevel(iD2);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) IndoorBikeDataCharacteristic, Resistance_Level:", Integer.valueOf(iD2));
        return i3;
    }

    private int t(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return i;
        }
        if ((i2 & 64) != 0) {
            int iD = d(bArr, 18, i);
            i += 2;
            this.f43906a.setInstantaneousPower(iD);
            LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) IndoorBikeDataCharacteristic, Instantaneous_Power:", Integer.valueOf(iD));
        }
        if ((i2 & 128) == 0) {
            return i;
        }
        int iD2 = d(bArr, 18, i);
        int i3 = i + 2;
        this.f43906a.setAveragePower(iD2);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) IndoorBikeDataCharacteristic, Average_Power:", Integer.valueOf(iD2));
        return i3;
    }

    private int l(byte[] bArr, int i, int i2) {
        if (bArr == null || (i2 & 256) == 0) {
            return i;
        }
        int iD = d(bArr, 18, i);
        this.f43906a.setTotalEnergy(iD);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) IndoorBikeDataCharacteristic, Total_Energy:", Integer.valueOf(iD));
        int iD2 = d(bArr, 18, i + 2);
        this.f43906a.setEnergyPerHour(iD2);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) IndoorBikeDataCharacteristic, Energy_Per_Hour:", Integer.valueOf(iD2));
        int iD3 = d(bArr, 17, i + 4);
        int i3 = i + 5;
        this.f43906a.setEnergyPerMin(iD3);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) IndoorBikeDataCharacteristic, Energy_Per_Minute:", Integer.valueOf(iD3));
        return i3;
    }

    private int r(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return i;
        }
        if ((i2 & 512) != 0) {
            int iD = d(bArr, 17, i);
            i++;
            this.f43906a.setHeartRate(iD);
            LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) IndoorBikeDataCharacteristic, Heart_Rate:", Integer.valueOf(iD));
        }
        if ((i2 & 1024) == 0) {
            return i;
        }
        int iD2 = d(bArr, 17, i);
        int i3 = i + 1;
        this.f43906a.setMetabolicEquivalent(iD2);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) IndoorBikeDataCharacteristic, Metabolic_Equivalent:", Integer.valueOf(iD2));
        return i3;
    }

    private int aa(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return i;
        }
        if ((i2 & 2048) != 0) {
            int iD = d(bArr, 18, i);
            i += 2;
            this.f43906a.setElapsedTime(iD);
            LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) IndoorBikeDataCharacteristic, Elapsed_Time:", Integer.valueOf(iD));
        }
        if ((i2 & 4096) == 0) {
            return i;
        }
        int iD2 = d(bArr, 18, i);
        int i3 = i + 2;
        this.f43906a.setRemainingTime(iD2);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) IndoorBikeDataCharacteristic, Remaining_Time:", Integer.valueOf(iD2));
        return i3;
    }

    private IndoorEquipTrainerData l(byte[] bArr) {
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) ParseTreadmillDataCharacteristic");
        int iD = d(bArr, 18, 0);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) ParseTreadmillDataCharacteristic, intFlags:", Integer.valueOf(iD));
        this.f43906a.setFlags(iD);
        int iD2 = d(bArr, 18, 2);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS)  ParseTreadmillDataCharacteristic, instantSpeed:", Integer.valueOf(iD2));
        this.f43906a.setInstantaneousSpeed(iD2);
        int iA = a(bArr, i(bArr, b(bArr, 4, iD), iD), iD);
        if ((iD & 16) != 0) {
            int iD3 = d(bArr, 18, iA);
            LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) ParseTreadmillDataCharacteristic, positiveGain:", Integer.valueOf(iD3));
            this.f43906a.setPositiveElevationGain(iD3);
            int iD4 = d(bArr, 18, iA + 2);
            LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) ParseTreadmillDataCharacteristic, negativeGain:", Integer.valueOf(iD4));
            iA += 4;
            this.f43906a.setNegativeElevationGain(iD4);
        }
        int iE = e(bArr, iA, iD);
        if ((iD & 64) != 0) {
            int iD5 = d(bArr, 17, iE);
            LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) ParseTreadmillDataCharacteristic, averagePace:", Integer.valueOf(iD5));
            iE++;
            this.f43906a.setAveragePace(iD5);
        }
        int iG = g(bArr, iE, iD);
        if ((iD & 256) != 0) {
            int iD6 = d(bArr, 17, iG);
            LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) ParseTreadmillDataCharacteristic, heartRate:", Integer.valueOf(iD6));
            iG++;
            this.f43906a.setHeartRate(iD6);
        }
        if ((iD & 512) != 0) {
            int iD7 = d(bArr, 17, iG);
            LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) ParseTreadmillDataCharacteristic, metabolic:", Integer.valueOf(iD7));
            iG++;
            this.f43906a.setMetabolicEquivalent(iD7);
        }
        f(bArr, ac(bArr, c(bArr, iG, iD), iD), iD);
        return this.f43906a;
    }

    public IndoorEquipTrainerData a(byte[] bArr, String str) {
        if (bArr == null) {
            return null;
        }
        this.f43906a.clearData();
        if ("00002ACD-0000-1000-8000-00805f9b34fb".toUpperCase(Locale.ENGLISH).equals(str)) {
            this.f43906a.setFitnessDataType(3);
            return l(bArr);
        }
        if ("00002AD1-0000-1000-8000-00805f9b34fb".toUpperCase(Locale.ENGLISH).equals(str)) {
            this.f43906a.setFitnessDataType(11);
            return o(bArr);
        }
        if ("00002AD2-0000-1000-8000-00805f9b34fb".toUpperCase(Locale.ENGLISH).equals(str)) {
            this.f43906a.setFitnessDataType(10);
            return n(bArr);
        }
        if (!"00002ACE-0000-1000-8000-00805f9b34fb".toUpperCase(Locale.ENGLISH).equals(str)) {
            return null;
        }
        this.f43906a.setFitnessDataType(6);
        return f(bArr);
    }

    private int b(byte[] bArr, int i, int i2) {
        if (bArr == null || (i2 & 2) == 0) {
            return i;
        }
        int iD = d(bArr, 18, i);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) ParseTreadmillDataCharacteristic, averageSpeed:", Integer.valueOf(iD));
        int i3 = i + 2;
        this.f43906a.setAverageSpeed(iD);
        return i3;
    }

    private int i(byte[] bArr, int i, int i2) {
        if (bArr == null || (i2 & 4) == 0) {
            return i;
        }
        int iD = d(bArr, i);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) ParseTreadmillDataCharacteristic, totalDistance:", Integer.valueOf(iD));
        int i3 = i + 3;
        this.f43906a.setTotalDistance(iD);
        return i3;
    }

    private int ac(byte[] bArr, int i, int i2) {
        if (bArr == null || (i2 & 4096) == 0) {
            return i;
        }
        int iD = d(bArr, 18, i);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) ParseTreadmillDataCharacteristic, forceOnBelt:", Integer.valueOf(iD));
        int i3 = i + 2;
        this.f43906a.setForceOnBelt(iD);
        int iD2 = d(bArr, 18, i3);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) ParseTreadmillDataCharacteristic, powerOutput:", Integer.valueOf(iD2));
        this.f43906a.setPowerOutPut(iD2);
        return i3;
    }

    private void f(byte[] bArr, int i, int i2) {
        if (bArr == null || (i2 & 8192) == 0) {
            return;
        }
        int iD = d(bArr, i);
        LogUtil.a("Track_IDEQ_FtmsParser", "zoro ParseTreadmillDataCharacteristic, totalStep:", Integer.valueOf(iD));
        this.f43906a.setTotalStep(iD);
    }

    private int c(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return i;
        }
        if ((i2 & 1024) != 0) {
            int iD = d(bArr, 18, i);
            LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) ParseTreadmillDataCharacteristic, elapsedTime:", Integer.valueOf(iD));
            i += 2;
            this.f43906a.setElapsedTime(iD);
        }
        if ((i2 & 2048) == 0) {
            return i;
        }
        int iD2 = d(bArr, 18, i);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) ParseTreadmillDataCharacteristic, remainTime:", Integer.valueOf(iD2));
        int i3 = i + 2;
        this.f43906a.setRemainingTime(iD2);
        return i3;
    }

    private int g(byte[] bArr, int i, int i2) {
        if (bArr == null || (i2 & 128) == 0) {
            return i;
        }
        int iD = d(bArr, 18, i);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) ParseTreadmillDataCharacteristic, totalEnergy:", Integer.valueOf(iD));
        this.f43906a.setTotalEnergy(iD);
        int iD2 = d(bArr, 18, i + 2);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) ParseTreadmillDataCharacteristic, energyPerHour:", Integer.valueOf(iD2));
        this.f43906a.setEnergyPerHour(iD2);
        int iD3 = d(bArr, 17, i + 4);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) ParseTreadmillDataCharacteristic, energyPerMin:", Integer.valueOf(iD3));
        int i3 = i + 5;
        this.f43906a.setEnergyPerMin(iD3);
        return i3;
    }

    private int e(byte[] bArr, int i, int i2) {
        if (bArr == null || (i2 & 32) == 0) {
            return i;
        }
        int iD = d(bArr, 17, i);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) ParseTreadmillDataCharacteristic, instantPace:", Integer.valueOf(iD));
        int i3 = i + 1;
        this.f43906a.setInstantaneousPace(iD);
        return i3;
    }

    private int a(byte[] bArr, int i, int i2) {
        if (bArr == null || (i2 & 8) == 0) {
            return i;
        }
        int iD = d(bArr, 18, i);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) ParseTreadmillDataCharacteristic, inclination:", Integer.valueOf(iD));
        this.f43906a.setInclination(iD);
        int iD2 = d(bArr, 18, i + 2);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) ParseTreadmillDataCharacteristic, rampSetting:", Integer.valueOf(iD2));
        int i3 = i + 4;
        this.f43906a.setRampAngleSetting(iD2);
        return i3;
    }

    public TrainingStatus h(byte[] bArr) {
        if (bArr != null) {
            this.j.clearData();
            int iD = d(bArr, 17, 0);
            int iD2 = d(bArr, 17, 1);
            LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) ParseTrainingStatusCharacteristic: flags:", Integer.valueOf(iD), ", trainStatus:", Integer.valueOf(iD2));
            this.j.setTrainingStatus(iD2);
        }
        return this.j;
    }

    public MachineStatus b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        this.e.clearData();
        int iD = d(bArr, 17, 0);
        LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) ParseMachineStatusCharacteristic: opCode:", Integer.valueOf(iD));
        this.e.setOpCode(iD);
        if (iD == 2) {
            int iD2 = d(bArr, 17, 1);
            LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) ParseMachineStatusCharacteristic: controlInformation:", Integer.valueOf(iD2));
            this.e.setMachineStatusCharacteristic(iD2);
        } else if (iD != 21) {
            switch (iD) {
                case 5:
                    int iD3 = d(bArr, 18, 1);
                    LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) ParseMachineStatusCharacteristic: targetSpeed:", Integer.valueOf(iD3));
                    this.e.setMachineStatusCharacteristic(iD3);
                    break;
                case 6:
                    int iD4 = d(bArr, 18, 1);
                    LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) ParseMachineStatusCharacteristic: targetInclination:", Integer.valueOf(iD4));
                    this.e.setMachineStatusCharacteristic(iD4);
                    break;
                case 7:
                    int iD5 = d(bArr, 17, 1);
                    LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) ParseMachineStatusCharacteristic: targetResistance:", Integer.valueOf(iD5));
                    this.e.setMachineStatusCharacteristic(iD5);
                    break;
                case 8:
                    int iD6 = d(bArr, 18, 1);
                    LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) ParseMachineStatusCharacteristic: targetPower:", Integer.valueOf(iD6));
                    this.e.setMachineStatusCharacteristic(iD6);
                    break;
                case 9:
                    this.e.setMachineStatusCharacteristic(d(bArr, 17, 1));
                    break;
                case 10:
                    int iD7 = d(bArr, 18, 1);
                    LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) ParseMachineStatusCharacteristic: targetExpendedEnergy:", Integer.valueOf(iD7));
                    this.e.setMachineStatusCharacteristic(iD7);
                    break;
                case 11:
                    int iD8 = d(bArr, 18, 1);
                    LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) ParseMachineStatusCharacteristic: targetExpendedEnergy2:", Integer.valueOf(iD8));
                    this.e.setMachineStatusCharacteristic(iD8);
                    break;
                case 12:
                    int iD9 = d(bArr, 18, 1);
                    LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) ParseMachineStatusCharacteristic: targetStrides:", Integer.valueOf(iD9));
                    this.e.setMachineStatusCharacteristic(iD9);
                    break;
                case 13:
                    int iD10 = d(bArr, 1);
                    LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) ParseMachineStatusCharacteristic: targetDistance:", Integer.valueOf(iD10));
                    this.e.setMachineStatusCharacteristic(iD10);
                    break;
                case 14:
                    int iD11 = d(bArr, 18, 1);
                    LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) ParseMachineStatusCharacteristic: targetTrainingTime:", Integer.valueOf(iD11));
                    this.e.setMachineStatusCharacteristic(iD11);
                    break;
            }
        } else {
            int iD12 = d(bArr, 18, 1);
            LogUtil.a("Track_IDEQ_FtmsParser", "(FTMP_TS) ParseMachineStatusCharacteristic: targetCadence:", Integer.valueOf(iD12));
            this.e.setMachineStatusCharacteristic(iD12);
        }
        return this.e;
    }

    public FitnessData e(byte[] bArr) {
        if (bArr == null) {
            return this.f43907b;
        }
        this.f43907b.clearData();
        if (bArr.length > 3) {
            this.f43907b.setResultIntParameter(d(bArr, 18, 3));
        }
        this.f43907b.setResponseOpCode(d(bArr, 17, 0));
        this.f43907b.setRequestOpCode(d(bArr, 17, 1));
        this.f43907b.setResultCode(d(bArr, 17, 2));
        return this.f43907b;
    }

    public SupportDataRange j(byte[] bArr) {
        if (bArr != null) {
            this.d.clearData();
            int iD = d(bArr, 18, 0);
            int iD2 = d(bArr, 18, 2);
            int iD3 = d(bArr, 18, 4);
            this.d.setMinSpeed(iD);
            this.d.setMaxSpeed(iD2);
            this.d.setMinIncrementSpeed(iD3);
        }
        return this.d;
    }

    public SupportDataRange a(byte[] bArr) {
        if (bArr != null) {
            this.d.clearData();
            int iD = d(bArr, 34, 0);
            int iD2 = d(bArr, 34, 2);
            int iD3 = d(bArr, 18, 4);
            this.d.setMinInclination(iD);
            this.d.setMaxInclination(iD2);
            this.d.setMinIncreInclination(iD3);
        }
        return this.d;
    }

    public SupportDataRange g(byte[] bArr) {
        if (bArr != null) {
            this.d.clearData();
            int iD = d(bArr, 34, 0);
            int iD2 = d(bArr, 34, 2);
            int iD3 = d(bArr, 18, 4);
            this.d.setMinLevel(iD);
            this.d.setMaxLevel(iD2);
            this.d.setMinIncrementLevel(iD3);
        }
        return this.d;
    }

    public SupportDataRange d(byte[] bArr) {
        if (bArr != null) {
            this.d.clearData();
            int iD = d(bArr, 17, 0);
            int iD2 = d(bArr, 17, 1);
            int iD3 = d(bArr, 17, 2);
            this.d.setMinHeartRate(iD);
            this.d.setMaxHeartRate(iD2);
            this.d.setMinIncrementHeartRate(iD3);
        }
        return this.d;
    }

    public SupportDataRange i(byte[] bArr) {
        if (bArr != null) {
            this.d.clearData();
            int iD = d(bArr, 34, 0);
            int iD2 = d(bArr, 34, 2);
            int iD3 = d(bArr, 18, 4);
            this.d.setMinPower(iD);
            this.d.setMaxPower(iD2);
            this.d.setMinIncrementPower(iD3);
        }
        return this.d;
    }

    public SupportDataRange e() {
        return this.d;
    }
}
