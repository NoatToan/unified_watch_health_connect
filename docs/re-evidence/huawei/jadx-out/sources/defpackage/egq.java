package defpackage;

import com.huawei.health.ecologydevice.fitness.dataparser.secondropecommand.CommandArrayList;
import com.huawei.health.ecologydevice.fitness.datastruct.BaseRopeData;
import com.huawei.health.ecologydevice.fitness.datastruct.BatteryStatus;
import com.huawei.health.ecologydevice.fitness.datastruct.DeviceInformation;
import com.huawei.health.ecologydevice.fitness.datastruct.ExclusivePlayListData;
import com.huawei.health.ecologydevice.fitness.datastruct.HistoryData;
import com.huawei.health.ecologydevice.fitness.datastruct.LogOperationsData;
import com.huawei.health.ecologydevice.fitness.datastruct.RopeModeSettingData;
import com.huawei.health.ecologydevice.fitness.datastruct.RopeRealData;
import com.huawei.health.ecologydevice.fitness.datastruct.RopeTrainingStatusData;
import com.huawei.health.ecologydevice.fitness.datastruct.RopeVoiceCourseOperationsData;
import com.huawei.health.ecologydevice.fitness.datastruct.SettingStatusData;
import com.huawei.health.ecologydevice.fitness.datastruct.SwitchStatusData;
import com.huawei.health.ecologydevice.fitness.datastruct.VideoCourseOperationsData;
import health.compact.a.util.LogUtil;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class egq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<Integer, BaseRopeData> f32955c = new HashMap();
    private long e = System.currentTimeMillis();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BatteryStatus f32954b = new BatteryStatus();
    private ConcurrentHashMap<Integer, ehj> j = new ConcurrentHashMap<>();
    private ConcurrentHashMap<Integer, ehh> d = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DeviceInformation f32953a = new DeviceInformation();
    private RopeTrainingStatusData g = new RopeTrainingStatusData();

    public egq() {
        d();
    }

    private void d() {
        this.f32955c.put(100, new SwitchStatusData());
        this.f32955c.put(200, new SettingStatusData());
        this.f32955c.put(300, new RopeModeSettingData());
        this.f32955c.put(400, new RopeVoiceCourseOperationsData());
        this.f32955c.put(500, new VideoCourseOperationsData());
        this.f32955c.put(600, new LogOperationsData());
        this.f32955c.put(700, new ExclusivePlayListData());
    }

    public BaseRopeData e(int i) {
        return this.f32955c.get(Integer.valueOf(i * 100));
    }

    public BaseRopeData d(byte[] bArr) {
        int iD = ehn.d(bArr, 17, 0);
        if (iD > 255 || iD < 0) {
            LogUtil.a("PDROPE_RopeDataParser", "parseRopeDataCharacteristic, invalid command!");
            return null;
        }
        switch (iD) {
            case 2:
                return g(bArr, 1);
            case 3:
            default:
                return i(bArr, iD);
            case 4:
                return h(bArr, 1);
            case 5:
                return j(bArr, 1);
            case 6:
                return a(bArr, 1);
            case 7:
                return c(bArr, 1);
            case 8:
                return e(bArr, 1);
            case 9:
                return b(bArr, 1);
            case 10:
                return d(bArr, 1);
            case 11:
                return f(bArr, 1);
        }
    }

    public RopeRealData h(byte[] bArr, int i) {
        if (bArr == null || bArr.length == 0 || bArr.length > 32) {
            LogUtil.a("PDROPE_RopeDataParser", "RopeRealData is error");
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.e;
        this.e = System.currentTimeMillis();
        if (bArr.length != 20) {
            LogUtil.a("PDROPE_RopeDataParser", "old parseRopeRealDataCharacteristic: data");
            RopeRealData ropeRealDataD = new ehj().d(bArr, i);
            if (ropeRealDataD == null) {
                return null;
            }
            if (jCurrentTimeMillis > 50) {
                ropeRealDataD.setUpdateTime(jCurrentTimeMillis);
            }
            return ropeRealDataD;
        }
        int iD = ehn.d(bArr, 17, 19);
        ehj ehjVar = this.j.get(Integer.valueOf(iD));
        if (ehjVar == null) {
            ehjVar = new ehj();
            this.j.put(Integer.valueOf(iD), ehjVar);
        }
        if (ehjVar.d(0, ehn.c(bArr, 0, bArr.length - 1))) {
            return a(iD, ehjVar, jCurrentTimeMillis);
        }
        return null;
    }

    private RopeRealData a(int i, ehj ehjVar, long j) {
        RopeRealData ropeRealDataA = ehjVar.a();
        if (ropeRealDataA != null) {
            if (j > 50 && j != 0) {
                ropeRealDataA.setUpdateTime(j);
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j2 = this.e;
                this.e = System.currentTimeMillis();
                ropeRealDataA.setUpdateTime(jCurrentTimeMillis - j2);
            }
        }
        this.j.remove(Integer.valueOf(i));
        return ropeRealDataA;
    }

    public BaseRopeData a(CommandArrayList commandArrayList) {
        BaseRopeData baseRopeDataE = e(commandArrayList.e());
        if (baseRopeDataE == null) {
            return baseRopeDataE;
        }
        baseRopeDataE.setCode(commandArrayList.c());
        baseRopeDataE.setData(commandArrayList.f());
        baseRopeDataE.setFlag(commandArrayList.b());
        baseRopeDataE.setDataLength(commandArrayList.d());
        baseRopeDataE.setOffset(0);
        return baseRopeDataE.parseData();
    }

    public BatteryStatus g(byte[] bArr, int i) {
        this.f32954b.setButteryStatus(ehn.d(bArr, 17, i));
        return this.f32954b;
    }

    public HistoryData j(byte[] bArr, int i) {
        if (bArr != null && bArr.length != 0 && bArr.length <= 20) {
            if (bArr.length == 20) {
                int iD = ehn.d(bArr, 17, 19);
                ehh ehhVar = this.d.get(Integer.valueOf(iD));
                if (ehhVar == null) {
                    ehhVar = new ehh();
                    this.d.put(Integer.valueOf(iD), ehhVar);
                }
                if (ehhVar.d(0, ehn.c(bArr, 0, bArr.length - 1))) {
                    return e(iD, ehhVar);
                }
                return null;
            }
            if (bArr == null || bArr.length % 14 != 2) {
                LogUtil.a("PDROPE_RopeDataParser", "parseRopeHistoryDataCharacteristic data is invalid");
            } else {
                int iD2 = ehn.d(bArr, 17, i) & 15;
                if (iD2 == 0) {
                    return null;
                }
                if ((bArr.length - 2) / 14 != iD2) {
                    LogUtil.a("PDROPE_RopeDataParser", "parseRopeHistoryDataCharacteristic data invalid");
                    return null;
                }
                return new ehh().e(bArr, i);
            }
        }
        return null;
    }

    private HistoryData e(int i, ehh ehhVar) {
        HistoryData historyDataA = ehhVar.a();
        this.d.remove(Integer.valueOf(i));
        return historyDataA;
    }

    private BaseRopeData i(byte[] bArr, int i) {
        int i2 = i & 63;
        boolean z = (i & 128) != 0;
        int iD = ehn.d(bArr, 17, 1);
        int iD2 = ehn.d(bArr, 17, 2);
        if (iD2 == 4) {
            ehj ehjVar = this.j.get(Integer.valueOf(i2));
            if (ehjVar == null) {
                ehjVar = new ehj();
                this.j.put(Integer.valueOf(i2), ehjVar);
            }
            if (!z) {
                ehjVar.e(true);
                ehjVar.b(iD + 1);
            }
            if (ehjVar.d(iD, ehn.c(bArr, 3, bArr.length - 3))) {
                return a(i2, ehjVar, 0L);
            }
            return null;
        }
        if (iD2 == 5) {
            ehh ehhVar = this.d.get(Integer.valueOf(i2));
            if (ehhVar == null) {
                ehhVar = new ehh();
                this.d.put(Integer.valueOf(i2), ehhVar);
            }
            if (!z) {
                ehhVar.e(true);
                ehhVar.b(iD + 1);
            }
            if (ehhVar.d(iD, ehn.c(bArr, 3, bArr.length - 3))) {
                return e(i2, ehhVar);
            }
            return null;
        }
        LogUtil.a("PDROPE_RopeDataParser", "parseRopeDataCharacteristic, Unrecognized Rope Data!");
        return null;
    }

    public DeviceInformation a(byte[] bArr, int i) {
        String str = new String(bArr, i, bArr.length - i, StandardCharsets.UTF_8);
        LogUtil.a("PDROPE_RopeDataParser", "ParseDeviceInformationManufacturer: manufacturerString:", str);
        this.f32953a.setManufacturerString(str);
        LogUtil.a("PDROPE_RopeDataParser", "SPORT_TYPE_ROPE_SKIPPING:", 283);
        this.f32953a.setDeviceType(283);
        return this.f32953a;
    }

    public DeviceInformation c(byte[] bArr, int i) {
        String str = new String(bArr, i, bArr.length - i, StandardCharsets.UTF_8);
        LogUtil.a("PDROPE_RopeDataParser", "ParseDeviceInformationModel: modelNumber:", str);
        this.f32953a.setModelString(str);
        return this.f32953a;
    }

    public DeviceInformation e(byte[] bArr, int i) {
        String str = new String(bArr, i, bArr.length - i, StandardCharsets.UTF_8);
        LogUtil.a("PDROPE_RopeDataParser", "ParseDeviceInformationModel: SN:", nio.e(str));
        this.f32953a.setSerialNumber(str);
        return this.f32953a;
    }

    public DeviceInformation d(byte[] bArr, int i) {
        String str = new String(bArr, i, bArr.length - i, StandardCharsets.UTF_8);
        LogUtil.a("PDROPE_RopeDataParser", "ParseDeviceInformationModel: HardwareVersion:", str);
        this.f32953a.setHardwareVersion(str);
        return this.f32953a;
    }

    public DeviceInformation b(byte[] bArr, int i) {
        String str = new String(bArr, i, bArr.length - i, StandardCharsets.UTF_8);
        LogUtil.a("PDROPE_RopeDataParser", "ParseDeviceInformationModel: SoftwareVersion:", str);
        this.f32953a.setSoftwareVersion(str);
        return this.f32953a;
    }

    public RopeTrainingStatusData f(byte[] bArr, int i) {
        int iD = ehn.d(bArr, 17, i);
        this.g.setDeviceTrainingStatus(iD);
        LogUtil.a("PDROPE_RopeDataParser", "RopeDataCharacteristic RopeTrainingStatusData status:", Integer.valueOf(iD));
        return this.g;
    }
}
