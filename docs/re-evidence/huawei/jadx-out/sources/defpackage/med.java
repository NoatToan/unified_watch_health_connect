package defpackage;

import android.text.TextUtils;
import com.amap.api.maps.model.amap3dmodeltile.AMap3DTileBuildType;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.HEXUtils;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class med implements DataReceiveCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f41491a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static med f41492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IBaseResponseCallback f41493c;
    private IBaseResponseCallback d;
    private meg e = new meg();

    private med() {
    }

    public static med c() {
        med medVar;
        synchronized (f41491a) {
            if (f41492b == null) {
                LogUtil.a("HwWheelSizeManager", "getInstance");
                f41492b = new med();
            }
            medVar = f41492b;
        }
        return medVar;
    }

    public meg a() {
        return this.e;
    }

    public void e() {
        edc.e().registerDeviceSampleListener("hw.unitedevice.rimSizeSet", this);
    }

    private void j() {
        edc.e().unRegisterDeviceSampleListener("hw.unitedevice.rimSizeSet");
    }

    public void b() {
        j();
        this.f41493c = null;
    }

    public void c(DeviceInfo deviceInfo, IBaseResponseCallback iBaseResponseCallback) {
        this.d = iBaseResponseCallback;
        e();
        if (deviceInfo == null || !eey.d(deviceInfo, 98) || deviceInfo.getDeviceConnectState() != 2) {
            LogUtil.j("HwWheelSizeManager", "sendSettingDeviceCommand no send command");
            return;
        }
        boolean zSendSampleConfigCommand = edc.e().sendSampleConfigCommand(deviceInfo, c(1), "HwWheelSizeManager");
        LogUtil.a("HwWheelSizeManager", "constructSampleConfig: ", c(1));
        if (zSendSampleConfigCommand) {
            return;
        }
        LogUtil.j("HwWheelSizeManager", "sendSettingDeviceCommand fail");
    }

    private String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(HEXUtils.b(8) + HEXUtils.b(8) + String.format(Locale.ENGLISH, "%016x", Long.valueOf(this.e.b())));
        sb.append(HEXUtils.b(9) + HEXUtils.b(2) + HEXUtils.a(this.e.a()));
        sb.append(HEXUtils.b(10) + HEXUtils.b(1) + HEXUtils.b(this.e.c()));
        sb.append(HEXUtils.b(11) + HEXUtils.b(1) + HEXUtils.b(this.e.e()));
        LogUtil.a("HwWheelSizeManager", "constructSampleConfigInfo structStringBuilder: ", sb.toString());
        return sb.toString();
    }

    public void e(DeviceInfo deviceInfo, IBaseResponseCallback iBaseResponseCallback) {
        this.f41493c = iBaseResponseCallback;
        e();
        if (deviceInfo == null || !eey.d(deviceInfo, 98) || deviceInfo.getDeviceConnectState() != 2) {
            LogUtil.j("HwWheelSizeManager", "sendQueryDeviceCommand no send command");
        } else {
            if (edc.e().sendSampleConfigCommand(deviceInfo, c(2), "HwWheelSizeManager")) {
                return;
            }
            LogUtil.j("HwWheelSizeManager", "sendQueryDeviceCommand fail");
        }
    }

    private eef c(int i) {
        eef eefVar = new eef();
        eeg eegVar = new eeg();
        eefVar.setSrcPkgName("hw.unitedevice.rimSizeSet");
        eefVar.setWearPkgName("rimSizeSet");
        eefVar.setCommandId(1);
        ArrayList arrayList = new ArrayList(5);
        if (i == 1) {
            eegVar.b(900100006L);
            eegVar.b(i);
            eegVar.d(HEXUtils.a(d()));
            arrayList.add(eegVar);
            eefVar.setConfigInfoList(arrayList);
            return eefVar;
        }
        if (i == 2) {
            eegVar.b(900100006L);
            eegVar.b(i);
            arrayList.add(eegVar);
            eefVar.setConfigInfoList(arrayList);
            return eefVar;
        }
        LogUtil.d("HwWheelSizeManager", "configAction is null");
        return eefVar;
    }

    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
        if (deviceInfo == null || a(eecVar)) {
            LogUtil.j("HwWheelSizeManager", "device == null or isCheckSampleError");
            return;
        }
        if (eecVar instanceof eef) {
            LogUtil.a("HwWheelSizeManager", "onDataReceived");
            List<eeg> configInfoList = ((eef) eecVar).getConfigInfoList();
            if (configInfoList == null || configInfoList.size() == 0) {
                LogUtil.j("HwWheelSizeManager", "onDataReceived sampleConfigInfoList empty");
                return;
            }
            eeg eegVar = configInfoList.get(0);
            LogUtil.a("HwWheelSizeManager", "onDataReceived configAction", Integer.valueOf(eegVar.d()));
            if (eegVar.d() == 1) {
                this.d.a(i, eegVar);
            }
            a(i, deviceInfo, configInfoList, eegVar);
        }
    }

    private void a(int i, DeviceInfo deviceInfo, List<eeg> list, eeg eegVar) {
        if (eegVar.d() == 2) {
            mee.a(deviceInfo.getDeviceIdentify(), HEXUtils.a(eegVar.e()));
            IBaseResponseCallback iBaseResponseCallback = this.f41493c;
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(i, list.get(0));
            }
            this.f41493c = null;
        }
    }

    private boolean a(eec eecVar) {
        if (eecVar == null) {
            LogUtil.a("HwWheelSizeManager", "sampleBase == null");
            return true;
        }
        if (eecVar.getCommandId() == 1 && "rimSizeSet".equals(eecVar.getSrcPkgName()) && "hw.unitedevice.rimSizeSet".equals(eecVar.getWearPkgName())) {
            return false;
        }
        LogUtil.j("HwWheelSizeManager", "message: ", eecVar.toString());
        return true;
    }

    public String d(String str) {
        int i;
        String str2;
        String switchSettingFromDb = mhs.a().getSwitchSettingFromDb(mip.a(str));
        LogUtil.a("HwWheelSizeManager", "getValue is ", switchSettingFromDb);
        String strD = "";
        if (TextUtils.isEmpty(switchSettingFromDb)) {
            return "";
        }
        if ("-1".equals(switchSettingFromDb) && mef.c().size() > 9) {
            return e(mef.c().get(9));
        }
        List listAsList = Arrays.asList(switchSettingFromDb.split(","));
        if (listAsList.size() > 3) {
            int i2 = 0;
            try {
                i = Integer.parseInt((String) listAsList.get(2));
                try {
                    i2 = Integer.parseInt((String) listAsList.get(3));
                } catch (NumberFormatException unused) {
                    LogUtil.e("getRimSize NumberFormatException", new Object[0]);
                }
            } catch (NumberFormatException unused2) {
                i = 0;
            }
            if (i == 0 && mef.c().size() <= i2) {
                LogUtil.j("HwWheelSizeManager", "getRimSize id is error.");
                return "";
            }
            if (i == 0) {
                str2 = mef.c().get(i2);
            } else {
                str2 = (String) listAsList.get(1);
            }
            strD = d(i, str2);
        }
        LogUtil.a("HwWheelSizeManager", "rim size : ", strD);
        return strD;
    }

    private String e(String str) {
        String[] strArrSplit = str.split("  ");
        if (strArrSplit.length <= 1) {
            return str;
        }
        String str2 = strArrSplit[1];
        return str2.substring(0, str2.length() - 2);
    }

    private String d(int i, String str) {
        LogUtil.a("HwWheelSizeManager", "selectTag is : ", Integer.valueOf(i));
        if (i == 0) {
            str = e(str);
        }
        return (i == 1 && AMap3DTileBuildType.HOUSING.equals(str) && mef.c().size() > 9) ? e(mef.c().get(9)) : str;
    }

    public String a(DeviceInfo deviceInfo) {
        int iC = c().a().c();
        int iA = c().a().a();
        int iE = c().a().e();
        long jB = c().a().b();
        LogUtil.a("HwWheelSizeManager", "settingRimSize timeFromDevice = ", Long.valueOf(jB));
        String switchSettingFromDb = mhs.a().getSwitchSettingFromDb(mip.a(deviceInfo.getDeviceIdentify()));
        if ((iC == 1 && iA == 3000) || "-1".equals(switchSettingFromDb)) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_bolt_not_set);
        }
        long jM = 0;
        if (!TextUtils.isEmpty(switchSettingFromDb)) {
            try {
                jM = Long.parseLong((String) Arrays.asList(switchSettingFromDb.split(",")).get(0));
            } catch (NumberFormatException unused) {
                LogUtil.e("HwWheelSizeManager", "settingRimSize NumberFormatException");
            }
            jM = CommonUtil.m(BaseApplication.getContext(), String.format(Locale.ENGLISH, "%016d", Long.valueOf(jM)));
            LogUtil.a("HwWheelSizeManager", "settingRimSize timeFromSetting = ", Long.valueOf(jM));
        }
        String strD = c().a().d();
        if (deviceInfo.getDeviceIdentify() != null && deviceInfo.getDeviceIdentify().equals(strD) && (jB > jM || TextUtils.isEmpty(switchSettingFromDb))) {
            mhs.a().setSwitchSettingToDb(mip.a(deviceInfo.getDeviceIdentify()), mip.e(String.valueOf(jB), iA + "," + iC + "," + iE));
        }
        return c(mhs.a().getSwitchSettingFromDb(mip.a(deviceInfo.getDeviceIdentify())), iE, iC);
    }

    private String c(String str, int i, int i2) {
        String quantityString;
        String string = BaseApplication.getContext().getResources().getString(R.string.IDS_bolt_not_set);
        if (TextUtils.isEmpty(str)) {
            return string;
        }
        List listAsList = Arrays.asList(str.split(","));
        if (listAsList.size() > 3) {
            try {
                i = Integer.parseInt((String) listAsList.get(3));
                i2 = Integer.parseInt((String) listAsList.get(2));
            } catch (NumberFormatException unused) {
                LogUtil.e("settingRimSize NumberFormatException", new Object[0]);
            }
            if (i2 == 0 && mef.c().size() <= i) {
                LogUtil.j("HwWheelSizeManager", "getRimFromDb id is error.");
                return string;
            }
            try {
                int i3 = Integer.parseInt((String) listAsList.get(1));
                String strE = UnitUtil.e(i3, 1, 0);
                if (i2 == 0) {
                    quantityString = mef.c().get(i);
                } else {
                    quantityString = BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_bolt_wheel_set_unit, i3, strE);
                }
                return quantityString;
            } catch (NumberFormatException unused2) {
                LogUtil.e("HwWheelSizeManager", "getRimFromDb NumberFormatException");
                return string;
            }
        }
        return (String) listAsList.get(1);
    }
}
