package defpackage;

import android.text.TextUtils;
import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.huami.bluetooth.profile.ecf.data.HidStatus;
import com.huami.bluetooth.profile.ecf.data.StandAlertConfig;
import com.xiaomi.hm.health.bt.device.HMDeviceFeature;
import com.xiaomi.hm.health.bt.model.HMAutoBacklightInfo;
import com.xiaomi.hm.health.bt.model.HMHrReminder;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import com.xiaomi.hm.health.bt.model.HMTarget;
import com.xiaomi.hm.health.bt.profile.base.a;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.io.ByteArrayOutputStream;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public class ojs implements zr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z8 f29233a;

    public ojs(z8 z8Var) {
        this.f29233a = z8Var;
    }

    @Override // defpackage.zr
    public a a(@NotNull qd qdVar) {
        a aVarM = m();
        if (aVarM == null) {
            aVarM = n();
        }
        if (HMDeviceFeature.hasFeatureBaseResource(qdVar) && aVarM != null) {
            aVarM.a(k());
            aVarM.a(l());
        }
        return aVarM;
    }

    @Override // defpackage.zr
    public boolean b(boolean z) {
        qe qeVarA = this.f29233a.a(new byte[]{6, 3, 0, !z ? 1 : 0}, 3);
        return qeVarA != null && qeVarA.d((byte) 6);
    }

    @Override // defpackage.zr
    public boolean c(boolean z) {
        qe qeVarA = this.f29233a.a(new byte[]{6, 34, 0, z ? (byte) 1 : (byte) 0}, 3);
        return qeVarA != null && qeVarA.d((byte) 6);
    }

    @Override // defpackage.zr
    public boolean d(boolean z) {
        return false;
    }

    @Override // defpackage.zr
    public Boolean e() {
        return null;
    }

    @Override // defpackage.zr
    public boolean enableAtrialAlertSleepNotDisturb(boolean z) {
        t5t.d("EcfImpl", "非HuamiOS版本不支持enableAtrialAlertSleepNotDisturb");
        return false;
    }

    @Override // defpackage.zr
    public boolean enableOsa(boolean z) {
        t5t.d("EcfImpl", "ECF版本的OSA开关设置在ECFController中，代码不好迁过来，故出此下策。");
        return false;
    }

    @Override // defpackage.zr
    public boolean enablePressure(boolean z) {
        t5t.d("EcfImpl", "ECF版本的Pressure开关设置在ECFController中，代码不好迁过来，故出此下策。");
        return false;
    }

    @Override // defpackage.zr
    public boolean enablePressureAlert(boolean z) {
        t5t.d("EcfImpl", "非HuamiOS版本不支持enablePressureAlert");
        return false;
    }

    @Override // defpackage.zr
    public boolean f(boolean z) {
        qe qeVarA = this.f29233a.a(new byte[]{6, 31, 0, z ? (byte) 1 : (byte) 0}, 3);
        return qeVarA != null && qeVarA.d((byte) 6);
    }

    @Override // defpackage.zr
    public boolean g(boolean z) {
        qe qeVarA = this.f29233a.a(new byte[]{6, 1, 0, z ? (byte) 1 : (byte) 0}, 3);
        return qeVarA != null && qeVarA.d((byte) 6);
    }

    @Override // defpackage.zr
    public Boolean getAtrialAlertSleepNotDisturbEnable() {
        t5t.d("EcfImpl", "非HuamiOS版本不支持getAtrialAlertSleepNotDisturbEnable");
        return null;
    }

    @Override // defpackage.zr
    public Boolean getAtrialFibEnable() {
        t5t.d("EcfImpl", "非huamiOS版本的getAtrialFibEnable开关设置在ECFController或HRS中，代码不好迁过来，故出此下策。");
        return null;
    }

    @Override // defpackage.zr
    public Integer getHrMaxValue() {
        return null;
    }

    @Override // defpackage.zr
    public HMHrReminder getLowHrReminder() {
        t5t.d("EcfImpl", "非HuamiOS版本不支持getLowHrReminder");
        return null;
    }

    @Override // defpackage.zr
    public Boolean getOsaEnable() {
        t5t.d("EcfImpl", "非huamiOS版本的getOsaEnable开关设置在ECFController或HRS中，代码不好迁过来，故出此下策。");
        return null;
    }

    @Override // defpackage.zr
    public Boolean getPressureAlertEnable() {
        t5t.d("EcfImpl", "非HuamiOS版本不支持getPressureAlertEnable");
        return null;
    }

    @Override // defpackage.zr
    public Boolean getPressureEnable() {
        t5t.d("EcfImpl", "非huamiOS版本的getPressureEnable开关设置在ECFController或HRS中，代码不好迁过来，故出此下策。");
        return null;
    }

    @Override // defpackage.zr
    public Boolean h() {
        t5t.d("EcfImpl", "非HuamiOS版本不支持getSleepingBloodPressureMonitor");
        return Boolean.FALSE;
    }

    @Override // defpackage.zr
    public boolean i(boolean z) {
        qe qeVarA = this.f29233a.a(new byte[]{6, 32, 0, z ? (byte) 1 : (byte) 0}, 3);
        return qeVarA != null && qeVarA.d((byte) 6);
    }

    @Override // defpackage.zr
    public boolean j(boolean z) {
        t5t.d("EcfImpl", "ECF版本的AtrialFib开关设置在ECFController中，代码不好迁过来，故出此下策。");
        return false;
    }

    @Override // defpackage.zr
    public boolean k(boolean z) {
        qe qeVarA = this.f29233a.a(new byte[]{6, 2, 0, !z ? 1 : 0}, 3);
        return qeVarA != null && qeVarA.d((byte) 6);
    }

    public final q9 l() {
        qe qeVarB = this.f29233a.b(new byte[]{HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION});
        if (qeVarB != null && qeVarB.d(HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION)) {
            try {
                byte[] bArrI = qeVarB.i();
                t5t.d("EcfImpl", "external resource data:" + tet.x(bArrI));
                int length = bArrI.length - 1;
                byte[] bArr = new byte[length];
                System.arraycopy(bArrI, 0, bArr, 0, length);
                String[] strArrSplit = new String(bArr).split(",");
                int i = -1;
                int i2 = (strArrSplit.length <= 0 || TextUtils.isEmpty(strArrSplit[0])) ? -1 : Integer.parseInt(strArrSplit[0]);
                if (strArrSplit.length > 1 && !TextUtils.isEmpty(strArrSplit[1])) {
                    i = Integer.parseInt(strArrSplit[1]);
                }
                return new q9(i2, i);
            } catch (Exception e) {
                t5t.d("EcfImpl", "external resource error:" + e.getMessage());
            }
        }
        return null;
    }

    @Override // defpackage.zr
    public boolean m(boolean z) {
        qe qeVarA = this.f29233a.a(new byte[]{6, 15, 0, z ? (byte) 1 : (byte) 0}, 3);
        return qeVarA != null && qeVarA.d((byte) 6);
    }

    public final a n() {
        qe qeVarB = this.f29233a.b(new byte[]{17});
        if (qeVarB == null || !qeVarB.d((byte) 17)) {
            t5t.d("EcfImpl", "getResInfo failed!!!");
        } else {
            byte[] bArrI = qeVarB.i();
            t5t.d("EcfImpl", "getResInfo:" + tet.x(bArrI));
            if (bArrI == null || bArrI.length < 1) {
                return null;
            }
            try {
                return b(bArrI);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // defpackage.zr
    public boolean setHrMaxValue(int i) {
        return false;
    }

    @Override // defpackage.zr
    public boolean setLowHrReminder(@NotNull HMHrReminder hMHrReminder) {
        t5t.d("EcfImpl", "非HuamiOS版本不支持setLowHrReminder");
        return false;
    }

    @Override // defpackage.zr
    public Boolean d() {
        t5t.d("EcfImpl", "不支持getBodyEnergySwitch");
        return null;
    }

    @Override // defpackage.zr
    public boolean e(boolean z) {
        t5t.d("EcfImpl", "ECF版本的HrSleep开关设置在ECFController中，代码不好迁过来，故出此下策。");
        return false;
    }

    @Override // defpackage.zr
    public Boolean j() {
        t5t.d("EcfImpl", "非huamiOS版本的getHrSleepEnable开关设置在ECFController或HRS中，代码不好迁过来，故出此下策。");
        return null;
    }

    @Override // defpackage.zr
    public boolean h(boolean z) {
        t5t.d("EcfImpl", "不支持setBodyEnergySwitch");
        return false;
    }

    @Override // defpackage.zr
    public Integer b() {
        t5t.d("EcfImpl", "非huamiOS版本的getHeartRateInterval开关设置在ECFController或HRS中，代码不好迁过来，故出此下策。");
        return null;
    }

    @Override // defpackage.zr
    public Integer c() {
        t5t.d("EcfImpl", "非HuamiOS版本不支持getLowSpo2Alert");
        return null;
    }

    @Override // defpackage.zr
    public Boolean f() {
        t5t.d("EcfImpl", "非huamiOS版本的getSportHeartRate开关设置在ECFController或HRS中，代码不好迁过来，故出此下策。");
        return null;
    }

    @Override // defpackage.zr
    public HMHrReminder g() {
        t5t.d("EcfImpl", "非HuamiOS版本不支持getHighHrReminder");
        return null;
    }

    @Override // defpackage.zr
    public Boolean i() {
        t5t.d("EcfImpl", "非HuamiOS版本不支持getSmartSpo2");
        return null;
    }

    public final lxs k() {
        byte b2;
        int i = 0;
        qe qeVarB = this.f29233a.b(new byte[]{HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_DETAIL});
        if (qeVarB != null && qeVarB.d(HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_DETAIL)) {
            byte[] bArrI = qeVarB.i();
            t5t.d("EcfImpl", "base resource data:" + tet.x(bArrI));
            if (bArrI != null && bArrI.length >= 2) {
                int i2 = bArrI[0] & 255;
                byte b3 = bArrI[1];
                int i3 = b3 & 255;
                if ((b3 & 1) == 1) {
                    i = (bArrI[2] & 255) | ((bArrI[3] & 255) << 8) | ((bArrI[4] & 255) << 16) | ((bArrI[5] & 255) << 24);
                    b2 = bArrI[6];
                } else {
                    b2 = 0;
                }
                return new lxs(i2, i3, i, b2);
            }
        }
        return null;
    }

    public final a m() {
        int i;
        qe qeVarB = this.f29233a.b(new byte[]{AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT});
        if (qeVarB != null && qeVarB.d(AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT)) {
            byte[] bArrI = qeVarB.i();
            t5t.d("EcfImpl", "getOtherVersion:" + tet.x(bArrI));
            if (bArrI == null || bArrI.length < 1) {
                return null;
            }
            a aVar = new a();
            byte b2 = bArrI[0];
            if ((b2 & 1) == 1) {
                aVar.f(bArrI[1] & 255);
                i = 2;
            } else {
                i = 1;
            }
            if (((b2 >> 1) & 1) == 1) {
                int i2 = 1 + i;
                int i3 = bArrI[i] & 255;
                int i4 = bArrI.length > i2 ? bArrI[i2] & 255 : -1;
                aVar.c(i3);
                aVar.b(i4);
            }
            return aVar;
        }
        t5t.d("EcfImpl", "getOtherVersion failed!!!");
        return null;
    }

    @Override // defpackage.zr
    public boolean b(int i) {
        t5t.d("EcfImpl", "非HuamiOS版本不支持setLowSpo2Alert");
        return false;
    }

    @Override // defpackage.zr
    public boolean a(@NotNull StandAlertConfig standAlertConfig) {
        return this.f29233a.a(a9.d.f784b, standAlertConfig.getBytes());
    }

    public final a b(byte[] bArr) {
        int i;
        int i2;
        a aVar = new a();
        int i3 = bArr[0] & 255;
        aVar.g(i3);
        byte b2 = bArr[1];
        int i4 = bArr[2] & 255;
        t5t.d("EcfImpl", "parseResInfo language: " + i4);
        aVar.a(new HMLanguage(i4));
        if ((b2 & 1) == 1) {
            aVar.e((bArr[3] & 255) | ((bArr[4] & 255) << 8) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 24));
            aVar.f(bArr[7] & 255);
            i = 8;
        } else {
            i = 3;
        }
        if (((b2 >> 1) & 1) == 1) {
            int i5 = i + 4;
            int i6 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
            aVar.b(i6);
            if (i3 == 1) {
                if ((i6 & 1) != 0) {
                    i += 5;
                    aVar.c(bArr[i5] & 255);
                } else {
                    i = i5;
                }
                if ((i6 & 2) != 0) {
                    aVar.c(bArr[i] & 255);
                    i++;
                }
            } else if (i3 >= 2) {
                i += 5;
                aVar.c(bArr[i5] & 255);
            } else {
                i = i5;
            }
        }
        if (((b2 >> 2) & 1) == 1 && (i2 = i + 1) <= bArr.length) {
            aVar.a(bArr[i]);
            i = i2;
        }
        if (((b2 >> 3) & 1) == 1 && i + 4 <= bArr.length) {
            aVar.d(((bArr[i + 3] & 255) << 24) | ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16));
        }
        t5t.m("EcfImpl", "getResInfo:" + aVar);
        return aVar;
    }

    @Override // defpackage.zr
    public boolean a(@NotNull HMTarget hMTarget, Integer num) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(58);
            byte b2 = (hMTarget.getStepRemind() == null || hMTarget.getStepTarget() == null) ? (byte) 0 : (byte) 1;
            if (hMTarget.getCalorieRemind() != null && hMTarget.getCalorieTarget() != null) {
                b2 = (byte) (b2 | 2);
            }
            if (hMTarget.getDistanceRemind() != null && hMTarget.getDistanceTarget() != null) {
                b2 = (byte) (b2 | 4);
            }
            byteArrayOutputStream.write(tet.r(b2, 4));
            if (hMTarget.getStepRemind() != null && hMTarget.getStepTarget() != null) {
                byteArrayOutputStream.write(hMTarget.getStepRemind().booleanValue() ? 1 : 0);
                byteArrayOutputStream.write(tet.r(hMTarget.getStepTarget().longValue(), 4));
            }
            if (hMTarget.getCalorieRemind() != null && hMTarget.getCalorieTarget() != null) {
                byteArrayOutputStream.write(hMTarget.getCalorieRemind().booleanValue() ? 1 : 0);
                byteArrayOutputStream.write(tet.r(hMTarget.getCalorieTarget().longValue(), 4));
            }
            if (hMTarget.getDistanceRemind() != null && hMTarget.getDistanceTarget() != null) {
                byteArrayOutputStream.write(hMTarget.getDistanceRemind().booleanValue() ? 1 : 0);
                byteArrayOutputStream.write(tet.r(hMTarget.getDistanceTarget().longValue(), 4));
            }
        } catch (Exception e) {
            t5t.d("EcfImpl", "setTargets e: " + e);
        }
        t5t.d("EcfImpl", "setTargets cmd: " + tet.x(byteArrayOutputStream.toByteArray()));
        boolean zC = this.f29233a.c(byteArrayOutputStream.toByteArray(), 2);
        t5t.d("EcfImpl", "setTargets, ret: " + zC);
        return zC;
    }

    @Override // defpackage.zr
    public boolean l(boolean z) {
        t5t.d("EcfImpl", "非HuamiOS版本不支持setSleepingBloodPressureMonitor");
        return false;
    }

    @Override // defpackage.zr
    public boolean a(boolean z, int i) {
        t5t.d("EcfImpl", "非huamiOS版本的setAlldayHeartRate开关设置在ECFController或HRS中，代码不好迁过来，故出此下策。");
        return false;
    }

    @Override // defpackage.zr
    public boolean a(boolean z) {
        t5t.d("EcfImpl", "非HuamiOS版本不支持setSmartSpo2");
        return false;
    }

    @Override // defpackage.zr
    public boolean a(@NotNull HMHrReminder hMHrReminder) {
        qe qeVarA = this.f29233a.a(new byte[]{6, 26, 0, hMHrReminder.isEnable() ? (byte) 1 : (byte) 0, (byte) hMHrReminder.getHr()}, 3);
        return qeVarA != null && qeVarA.d((byte) 6);
    }

    @Override // defpackage.zr
    public boolean a(@NotNull HidStatus hidStatus) {
        return this.f29233a.a(new a9.e(), hidStatus.getBytes());
    }

    @Override // defpackage.zr
    public boolean a(@NotNull fd fdVar, boolean z) {
        byte[] bArr = new byte[5];
        bArr[0] = 6;
        bArr[1] = 16;
        bArr[2] = 0;
        if (fdVar == fd.ALERT_INCALL) {
            bArr[3] = 0;
        } else if (fdVar == fd.ALERT_SMS) {
            bArr[3] = 1;
        }
        bArr[4] = z ? (byte) 1 : (byte) 0;
        qe qeVarA = this.f29233a.a(bArr, 3);
        return qeVarA != null && qeVarA.d((byte) 6);
    }

    @Override // defpackage.zr
    public boolean a(int i) {
        t5t.d("EcfImpl", "非HuamiOS版本不支持setActivityMode");
        return false;
    }

    @Override // defpackage.zr
    public Boolean a() {
        qe qeVarA;
        byte b2;
        b9 b9VarF = this.f29233a.f();
        if (b9VarF != null && (qeVarA = b9VarF.a()) != null) {
            if (qeVarA.f() == e9.UNKNOW_COMMAND.getT()) {
                return null;
            }
            byte[] bArrI = qeVarA.i();
            if (qeVarA.f() == e9.SUCCESS.getT() && bArrI != null) {
                if (bArrI.length == 1 && ((b2 = bArrI[0]) == 1 || b2 == 0)) {
                    return Boolean.valueOf(b2 == 1);
                }
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.zr
    public boolean a(HMAutoBacklightInfo hMAutoBacklightInfo) {
        byte[] bArr;
        if (hMAutoBacklightInfo.getMode() == 1) {
            bArr = new byte[]{26, (byte) hMAutoBacklightInfo.getMode(), (byte) hMAutoBacklightInfo.getStartHour(), (byte) hMAutoBacklightInfo.getStartMinute(), (byte) hMAutoBacklightInfo.getStopHour(), (byte) hMAutoBacklightInfo.getStopMinute()};
        } else {
            bArr = new byte[]{26, (byte) hMAutoBacklightInfo.getMode()};
        }
        qe qeVarB = this.f29233a.b(bArr);
        return qeVarB != null && qeVarB.d((byte) 26);
    }
}
