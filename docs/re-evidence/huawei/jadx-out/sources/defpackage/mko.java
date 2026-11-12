package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.location.LocationManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.DeviceParameter;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.unitedevice.entity.UniteDevice;
import com.huawei.wisecloud.drmclient.license.HwDrmConstant;
import health.compact.a.DbManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes10.dex */
public class mko {
    private static int a(int i) {
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 20 && i != 21 && i != 34 && i != 35 && i != 60 && i != 61 && i != 65) {
                        switch (i) {
                            case 8:
                            case 10:
                                break;
                            case 9:
                                break;
                            case 11:
                                break;
                            default:
                                return -1;
                        }
                    }
                }
                return 3;
            }
            return 2;
        }
        return 4;
    }

    public static Date c(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return new SimpleDateFormat(HwDrmConstant.TIME_FORMAT).parse(str);
        } catch (ParseException unused) {
            LogUtil.e("HwDmsUtil", "exception parseException");
            return null;
        }
    }

    private static int e(int i) {
        if (!eel.d(i) && i != -2 && i != 5 && i != 7 && i != 58 && i != 64 && i != 0 && i != 1 && i != 18 && i != 19 && i != 44 && i != 45) {
            switch (i) {
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    break;
                default:
                    return -1;
            }
        }
        return 1;
    }

    public static int b(int i) {
        LogUtil.a("HwDmsUtil", "getDeviceClassification() deviceType", Integer.valueOf(i));
        int iE = e(i);
        if (iE == -1) {
            iE = a(i);
        }
        if (iE == -1) {
            iE = eev.b(i);
        }
        LogUtil.a("HwDmsUtil", "getDeviceClassification() deviceClassification", Integer.valueOf(iE));
        return iE;
    }

    public static boolean c(int i) {
        if (i == 2) {
            return true;
        }
        return PermissionUtil.a() && i == 1;
    }

    public static boolean a() {
        boolean zIsProviderEnabled;
        boolean zIsProviderEnabled2;
        LocationManager locationManager = BaseApplication.getContext().getSystemService("location") instanceof LocationManager ? (LocationManager) BaseApplication.getContext().getSystemService("location") : null;
        if (locationManager != null) {
            zIsProviderEnabled2 = locationManager.isProviderEnabled(GeocodeSearch.GPS);
            LogUtil.a("HwDmsUtil", "isGPSLocationEnable：", Boolean.valueOf(zIsProviderEnabled2));
            if (lmq.e() || lmq.c()) {
                return zIsProviderEnabled2;
            }
            zIsProviderEnabled = locationManager.isProviderEnabled("network");
        } else {
            zIsProviderEnabled = true;
            zIsProviderEnabled2 = true;
        }
        LogUtil.a("HwDmsUtil", "isNetWorkLocationEnable：", Boolean.valueOf(zIsProviderEnabled));
        return zIsProviderEnabled2 || zIsProviderEnabled;
    }

    public static void d(int i, int i2, DeviceParameter deviceParameter) {
        LogUtil.a("HwDmsUtil", "showDialogTip, style: ", Integer.valueOf(i), " ,content: ", Integer.valueOf(i2));
        Bundle bundle = new Bundle();
        bundle.putInt(TtmlNode.TAG_STYLE, i);
        bundle.putInt("content", i2);
        bundle.putParcelable("device_parameter", deviceParameter);
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(BaseApplication.getAppPackage(), "com.huawei.ui.device.activity.pairing.HwBtDialogActivity"));
            intent.setFlags(268435456);
            intent.putExtras(bundle);
            BaseApplication.getContext().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("HwDmsUtil", "showDialogTip ActivityNotFoundException.");
        }
    }

    public static DeviceCommand a(lnr lnrVar) {
        DeviceCommand deviceCommand = new DeviceCommand();
        if (lnrVar == null) {
            LogUtil.j("HwDmsUtil", "convertToDeviceCommand btDeviceCommand is null.");
            return deviceCommand;
        }
        deviceCommand.setServiceId(lnrVar.h());
        deviceCommand.setCommandId(lnrVar.c());
        deviceCommand.setDataLength(lnrVar.a());
        byte[] bArrD = lnrVar.d();
        if (bArrD.length < 2) {
            return null;
        }
        byte[] bArr = new byte[bArrD.length - 2];
        System.arraycopy(bArrD, 2, bArr, 0, bArrD.length - 2);
        deviceCommand.setDataContent(bArr);
        deviceCommand.setNeedAck(lnrVar.j());
        deviceCommand.setNeedEncrypt(lnrVar.i());
        deviceCommand.setmIdentify(lnrVar.g());
        deviceCommand.setPriority(lnrVar.f());
        return deviceCommand;
    }

    public static void c(DeviceCommand deviceCommand) {
        if (deviceCommand == null) {
            LogUtil.j("HwDmsUtil", "checkSyncTimeCommand deviceCommand is null.");
            return;
        }
        int serviceID = deviceCommand.getServiceID();
        int commandID = deviceCommand.getCommandID();
        if (serviceID == 1 && commandID == 5) {
            LogUtil.a("HwDmsUtil", "checkSyncTimeCommand sync time.");
            byte[] bArrA = lmw.a();
            if (bArrA.length < 2) {
                LogUtil.j("HwDmsUtil", "checkSyncTimeCommand srcData length is error.");
                return;
            }
            byte[] bArr = new byte[bArrA.length - 2];
            System.arraycopy(bArrA, 2, bArr, 0, bArrA.length - 2);
            deviceCommand.setDataContent(bArr);
        }
    }

    public static DeviceCapability a(String str) {
        UniteDevice uniteDeviceB = mkm.d().b(str);
        if (uniteDeviceB == null || uniteDeviceB.getCapability() == null) {
            return new DeviceCapability();
        }
        return uniteDeviceB.getCapability().getCompatibleCapacity();
    }

    public static boolean e(DeviceInfo deviceInfo) {
        mxg mxgVarB = mxg.b();
        for (DeviceInfo deviceInfo2 : mkm.d().e()) {
            if (mxgVarB.a(deviceInfo2)) {
                LogUtil.a("HwDmsUtil", "disconnectNewChannelDevice isSupportMultiConnect:", cpl.e(deviceInfo2.getDeviceIdentify()));
            } else if (deviceInfo != null && deviceInfo2.getDeviceActiveState() == 1 && !deviceInfo2.getDeviceIdentify().equalsIgnoreCase(deviceInfo.getDeviceIdentify()) && !mxgVarB.e(deviceInfo2.getProductType(), deviceInfo2.getDeviceIdentify())) {
                mkm.d().c(deviceInfo2.getDeviceIdentify());
                return true;
            }
        }
        return false;
    }

    public static void e(boolean z, boolean z2) {
        String str;
        LogUtil.a("HwDmsUtil", "enter updateHasDeviceDbInfo with hasDevice = " + z);
        DbManager.a(BaseApplication.getContext(), String.valueOf(1000), "has_device_table", 2, "hasDeviceKey varchar primary key ,hasDeviceValue hasDeviceValue varchar");
        final ContentValues contentValues = new ContentValues();
        if (z2) {
            contentValues.put("hasDeviceKey", "hasUdsDeviceInfo");
            str = "hasDeviceKey='hasUdsDeviceInfo'";
        } else {
            contentValues.put("hasDeviceKey", "hasDeviceInfo");
            str = "hasDeviceKey='hasDeviceInfo'";
        }
        if (z) {
            contentValues.put("hasDeviceValue", String.valueOf(1));
        } else {
            contentValues.put("hasDeviceValue", String.valueOf(0));
        }
        if (e(str)) {
            DbManager.d dVar = new DbManager.d();
            dVar.b(BaseApplication.getContext());
            dVar.c(String.valueOf(1000));
            dVar.b("has_device_table");
            dVar.e(2);
            DbManager.d(dVar, contentValues, str);
            return;
        }
        ThreadPoolManager.c().a("HwDmsUtil", new Runnable() { // from class: mko.3
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("HwDmsUtil", "enter updateHasDeviceDbInfo insert.");
                DbManager.c(BaseApplication.getContext(), String.valueOf(1000), "has_device_table", 2, contentValues);
            }
        });
    }

    private static boolean e(String str) {
        LogUtil.a("HwDmsUtil", "enter isHaveKeyInfo");
        Cursor cursorC = DbManager.c(BaseApplication.getContext(), String.valueOf(1000), "has_device_table", 2, str);
        boolean z = false;
        if (cursorC != null) {
            z = cursorC.getCount() > 0;
            cursorC.close();
        }
        LogUtil.d("HwDmsUtil", "isHaveKeyInfo:", Boolean.valueOf(z));
        return z;
    }

    public static UniteDevice d(DeviceInfo deviceInfo) {
        if (deviceInfo != null) {
            return mkm.d().b(deviceInfo.getDeviceIdentify());
        }
        return null;
    }
}
