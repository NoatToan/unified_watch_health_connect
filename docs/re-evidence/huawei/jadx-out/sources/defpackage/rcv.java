package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.DeviceParameter;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IAddDeviceStateAIDLCallback;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.device.interactors.CompatibilityInteractor;
import com.huawei.ui.main.stories.nps.interactors.HwNpsManager;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class rcv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static lvb f47154b;
    private static final Object d = new Object();
    private static rcv e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private eet f47155a = new eet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f47156c;

    private rcv(Context context) {
        this.f47156c = context;
    }

    public static rcv a(Context context) {
        rcv rcvVar;
        synchronized (d) {
            if (e == null) {
                e = new rcv(BaseApplication.getContext());
            }
            f47154b = lvb.e();
            lzb.b();
            lvv.c(BaseApplication.getContext());
            lvx.d();
            lza.d();
            rcvVar = e;
        }
        return rcvVar;
    }

    public DeviceInfo d() {
        return mgg.c("DeviceInteractors");
    }

    public List<DeviceInfo> b() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ACTIVE_DEVICES, null, "DeviceInteractors");
        if (deviceList == null || deviceList.size() == 0) {
            return deviceList;
        }
        ArrayList arrayList = new ArrayList(10);
        for (DeviceInfo deviceInfo : deviceList) {
            if ("main_relationship".equals(deviceInfo.getRelationship()) || eel.d(deviceInfo.getProductType())) {
                arrayList.add(deviceInfo);
            }
        }
        return arrayList;
    }

    public List<DeviceInfo> i() {
        return ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "DeviceInteractors");
    }

    public void b(List<String> list, boolean z) {
        try {
            f47154b.d(list, z);
        } catch (RemoteException e2) {
            LogUtil.e("DeviceInteractors", "unPair RemoteException = ", e2.getMessage());
            lug.b(BaseApplication.getContext(), null);
        }
    }

    public boolean g() {
        try {
            return f47154b.c();
        } catch (RemoteException e2) {
            LogUtil.e("DeviceInteractors", "isPrompt RemoteException = ", e2.getMessage());
            lug.e(BaseApplication.getContext());
            return true;
        }
    }

    public boolean j() {
        try {
            return f47154b.a();
        } catch (RemoteException unused) {
            LogUtil.e("DeviceInteractors", "isOutgoingCall RemoteException");
            lug.e(BaseApplication.getContext());
            return false;
        }
    }

    public void c(List<DeviceInfo> list) {
        try {
            LogUtil.a("DeviceInteractors", "migrateUsedDeviceList = ");
            f47154b.b(list);
        } catch (RemoteException e2) {
            LogUtil.e("DeviceInteractors", "RemoteException = ", e2.getMessage());
            lug.b(BaseApplication.getContext(), null);
        }
    }

    public static int a(int i) {
        int iB = lvi.a(i).b();
        return (iB != -1 || edg.e().get(Integer.valueOf(i)) == null) ? iB : edg.e().get(Integer.valueOf(i)).intValue();
    }

    public static int b(String str) {
        return lvi.c(str);
    }

    public void a(DeviceParameter deviceParameter, String str, IAddDeviceStateAIDLCallback iAddDeviceStateAIDLCallback) {
        try {
            lug.c(iAddDeviceStateAIDLCallback);
            f47154b.d(deviceParameter, str, iAddDeviceStateAIDLCallback);
        } catch (RemoteException e2) {
            LogUtil.e("DeviceInteractors", "RemoteException = ", e2.getMessage());
            lug.b(BaseApplication.getContext(), null);
            if (iAddDeviceStateAIDLCallback != null) {
                try {
                    iAddDeviceStateAIDLCallback.onAddDeviceState(4);
                } catch (RemoteException e3) {
                    LogUtil.e("DeviceInteractors", " callback RemoteException = ", e3.getMessage());
                }
            }
        }
    }

    public String a() {
        DeviceInfo deviceInfoD = d();
        if (deviceInfoD == null) {
            LogUtil.a("DeviceInteractors", "getCurrentDeviceName() getCurrentDeviceInfo() == null");
            return "";
        }
        return deviceInfoD.getDeviceName();
    }

    public List<String> e() {
        List<DeviceInfo> listI = i();
        ArrayList arrayList = new ArrayList(16);
        if (listI == null) {
            LogUtil.a("DeviceInteractors", "getCurrentUsedDeviceNameList() getCurrentDeviceInfo() == null");
            return arrayList;
        }
        LogUtil.a("DeviceInteractors", "deviceInfo.size() =", Integer.valueOf(listI.size()));
        for (DeviceInfo deviceInfo : listI) {
            LogUtil.a("DeviceInteractors", "getCurrentUsedDeviceNameList() name = ", deviceInfo.getDeviceName());
            arrayList.add(deviceInfo.getDeviceName());
        }
        return arrayList;
    }

    public int c() {
        DeviceInfo deviceInfoD = d();
        if (deviceInfoD == null) {
            LogUtil.a("DeviceInteractors", "getCurrentDeviceConnectState() getCurrentDeviceInfo() is null");
            return 0;
        }
        return deviceInfoD.getDeviceConnectState();
    }

    public int a(String str) {
        DeviceInfo deviceInfoB = mgg.b(str, "DeviceInteractors");
        if (deviceInfoB == null) {
            LogUtil.a("DeviceInteractors", "getCurrentDeviceConnectState() getCurrentDeviceInfo() is null");
            return 0;
        }
        return deviceInfoB.getDeviceConnectState();
    }

    public boolean h() {
        DeviceInfo deviceInfoF = f();
        return deviceInfoF != null && deviceInfoF.getSportVersion() == 1 && deviceInfoF.getSingleFrameDevice() == 1;
    }

    public String d(int i) {
        LogUtil.a("DeviceInteractors", "transDeviceProductTypeIntToStr: deviceProductType = ", Integer.valueOf(i));
        if (mgi.c("DeviceInteractors") != null && (i == 23 || i == 24)) {
            String strI = lvi.a(i).i();
            LogUtil.a("DeviceInteractors", "transDeviceProductTypeIntToStr: mDeviceProductType = ", strI);
            return strI;
        }
        DeviceInfo deviceInfoD = d();
        if (deviceInfoD == null) {
            return lvi.a(i).i();
        }
        String strI2 = "PORSCHE DESIGN";
        if ((TextUtils.isEmpty(deviceInfoD.getDeviceName()) || !TextUtils.equals(deviceInfoD.getDeviceName(), "PORSCHE DESIGN")) && (TextUtils.isEmpty(deviceInfoD.getDeviceModel()) || !TextUtils.equals(deviceInfoD.getDeviceModel(), "PORSCHE DESIGN"))) {
            strI2 = lvi.a(i).i();
        }
        LogUtil.a("DeviceInteractors", "transDeviceProductTypeIntToStr: mDeviceProductType = ", strI2);
        return strI2;
    }

    public String e(int i) {
        LogUtil.a("DeviceInteractors", "transDeviceProductTypeIntToStrReadyDevice: deviceProductType ", Integer.valueOf(i));
        if (mgi.c("DeviceInteractors") != null && eel.d(i)) {
            String strI = lvi.a(i).i();
            LogUtil.a("DeviceInteractors", "mDeviceProductType  ", strI);
            return strI;
        }
        String strI2 = lvi.a(i).i();
        LogUtil.a("DeviceInteractors", "mDeviceProductType ", strI2);
        return strI2;
    }

    public DeviceInfo f() {
        LogUtil.a("DeviceInteractors", "Enter initNpsRequestDeviceInfo !");
        if (f47154b == null) {
            return null;
        }
        DeviceInfo deviceInfoC = mgg.c("DeviceInteractors");
        if (deviceInfoC == null) {
            deviceInfoC = mgi.c("DeviceInteractors");
        }
        if (deviceInfoC == null) {
            deviceInfoC = HwNpsManager.getInstance().getFollowedDeviceInfo();
        }
        if (deviceInfoC != null) {
            lrw.h(deviceInfoC.getSoftVersion());
            lrw.j(deviceInfoC.getDeviceModel());
            lrw.f(deviceInfoC.getCertModel());
            HwNpsManager.getInstance().setNpsIdentify(deviceInfoC);
            a(deviceInfoC);
            lrw.l(deviceInfoC.getDeviceIdentify());
            lrw.g(eeq.d(deviceInfoC.getUuid()));
            lsy.a(new Runnable() { // from class: rcv.3
                @Override // java.lang.Runnable
                public void run() {
                    lrw.a(GRSManager.c(rcv.this.f47156c).getCommonCountryCode());
                }
            });
            ReleaseLogUtil.e("Nps_DeviceInteractors", "init wear nps, delete weight nps");
            lrw.m("");
        }
        LogUtil.a("DeviceInteractors", "Leave initNpsRequestDeviceInfo !");
        return deviceInfoC;
    }

    private void a(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return;
        }
        int productType = deviceInfo.getProductType();
        String strD = mga.d(deviceInfo);
        LogUtil.a("DeviceInteractors", "initNpsRequestDeviceInfo WearName : ", strD);
        lrw.n(strD);
        if (productType > 37 && productType != 54 && productType != 263) {
            lrw.n(deviceInfo.getDeviceModel());
            return;
        }
        if (productType == 18) {
            if ("CRIUS-B69".toUpperCase(Locale.ENGLISH).equals(deviceInfo.getDeviceModel())) {
                lrw.n(deviceInfo.getDeviceModel());
                return;
            }
            return;
        }
        if (productType != 19) {
            switch (productType) {
                case 34:
                case 35:
                    lrw.n(deviceInfo.getDeviceModel());
                    break;
                case 36:
                    String deviceModel = deviceInfo.getDeviceModel();
                    if (deviceModel != null && deviceModel.toUpperCase(Locale.ENGLISH).contains("B49")) {
                        lrw.n(deviceInfo.getDeviceModel());
                    }
                    LogUtil.a("DeviceInteractors", "setWearName:", 36, ", deviceModel:", deviceModel, ", wearName:", lrw.g());
                    break;
                default:
                    LogUtil.d("DeviceInteractors", "setWearName default branch.");
                    break;
            }
            return;
        }
        if ("TERRA-B69".toUpperCase(Locale.ENGLISH).equals(deviceInfo.getDeviceModel()) || "TERRA-B79".toUpperCase(Locale.ENGLISH).equals(deviceInfo.getDeviceModel())) {
            lrw.n(deviceInfo.getDeviceModel());
        }
    }

    public boolean d(String str) {
        LogUtil.a("DeviceInteractors", "isDeviceBinded(): ", str);
        if (str == null) {
            return false;
        }
        int length = 0;
        boolean z = false;
        while (length < str.length()) {
            try {
                int i = length + 2;
                String strSubstring = str.substring(length, i);
                String strSubstring2 = str.substring(i, (Integer.parseInt(strSubstring, 16) * 2) + length + 2);
                length += strSubstring.length() + (Integer.parseInt(strSubstring, 16) * 2);
                if (h(strSubstring2)) {
                    return true;
                }
                if (strSubstring2.startsWith("FF7D02") && strSubstring2.length() == 16) {
                    try {
                        for (eew eewVar : this.f47155a.b(strSubstring2.substring(strSubstring2.length() - 10, strSubstring2.length())).e()) {
                            if (lsk.a(eewVar.e(), 16) == 1) {
                                if (eewVar.b().endsWith("FFFF")) {
                                    LogUtil.a("DeviceInteractors", "true");
                                    z = true;
                                }
                            } else {
                                LogUtil.e("DeviceInteractors", "isDeviceBinded() unknow TLV.tag() ");
                            }
                        }
                    } catch (eeu e2) {
                        LogUtil.e("DeviceInteractors", "getResult() COMMAND_ID_MUNE_SET = ", e2.getMessage());
                    }
                }
            } catch (IndexOutOfBoundsException unused) {
                LogUtil.e("DeviceInteractors", "isDeviceBinded IndexOutOfBoundsException");
            }
        }
        return z;
    }

    public String e(String str) {
        if (str == null) {
            return null;
        }
        int length = 0;
        while (length < str.length()) {
            try {
                int i = length + 2;
                String strSubstring = str.substring(length, i);
                String strSubstring2 = str.substring(i, (CommonUtil.b(strSubstring, 16) * 2) + length + 2);
                length += strSubstring.length() + (CommonUtil.b(strSubstring, 16) * 2);
                LogUtil.a("DeviceInteractors", "indexString:", strSubstring, "position:", Integer.valueOf(length));
                if ("16".equals(strSubstring2.substring(0, 2)) && strSubstring2.length() > 6) {
                    String strB = b(strSubstring2, false);
                    String strB2 = b(strSubstring2, true);
                    LogUtil.a("DeviceInteractors", "getDeviceProductId productId:", strB, " subModelId: ", strB2);
                    if (!TextUtils.isEmpty(strB) && !TextUtils.isEmpty(strB2)) {
                        return strB + Constants.LINK + strB2;
                    }
                    if (TextUtils.isEmpty(strB)) {
                        return null;
                    }
                    return strB;
                }
            } catch (IndexOutOfBoundsException unused) {
                LogUtil.e("DeviceInteractors", "parseDeviceProductId IndexOutOfBoundsException");
                return null;
            }
        }
        return null;
    }

    private String b(String str, boolean z) {
        LogUtil.a("DeviceInteractors", "valueString:", str);
        String strSubstring = str.substring(2, 6);
        LogUtil.a("DeviceInteractors", "service:", strSubstring);
        if (!"EEFD".equals(strSubstring)) {
            return null;
        }
        String strSubstring2 = str.substring(6, str.length());
        if (strSubstring2.length() < 6) {
            return null;
        }
        int length = 0;
        String strSubstring3 = strSubstring2.substring(0, 6);
        LogUtil.a("DeviceInteractors", "autoHeadString:", strSubstring3);
        if (!"010101".equals(strSubstring3)) {
            return null;
        }
        String strSubstring4 = strSubstring2.substring(6, strSubstring2.length());
        LogUtil.a("DeviceInteractors", "typeValueString:", strSubstring4);
        while (length < strSubstring4.length()) {
            String strSubstring5 = strSubstring4.substring(length, length + 2);
            int iB = CommonUtil.b(strSubstring5, 16);
            LogUtil.a("DeviceInteractors", "position:", Integer.valueOf(length), "indexString:", strSubstring5, "typeValue:", Integer.valueOf(iB));
            int i = 4;
            if (iB != 5 && iB != 10 && iB != 19) {
                if (iB == 3) {
                    i = 6;
                } else if (iB == 18) {
                    i = 8;
                    if (!z) {
                        String strSubstring6 = strSubstring4.substring(strSubstring5.length() + length, length + strSubstring5.length() + 8);
                        LogUtil.a("DeviceInteractors", "productString:", strSubstring6);
                        return eeq.d(strSubstring6);
                    }
                } else {
                    if (z && iB == 4) {
                        return strSubstring4.substring(strSubstring5.length() + length, length + strSubstring5.length() + 2);
                    }
                    i = 2;
                }
            }
            length += strSubstring5.length() + i;
        }
        return null;
    }

    private boolean h(String str) {
        String string;
        if (!str.startsWith("16EEFD")) {
            LogUtil.j("DeviceInteractors", "this value is not start with type hex value");
            return false;
        }
        String strSubstring = str.substring(6);
        if (!strSubstring.startsWith("010101") || strSubstring.length() < 24) {
            LogUtil.j("DeviceInteractors", "this value is not start with find hex value or length is error");
            return false;
        }
        String strB = b(str, false);
        if (TextUtils.isEmpty(strB)) {
            LogUtil.a("DeviceInteractors", "productId is null");
            return false;
        }
        LogUtil.a("DeviceInteractors", "productId: ", strB);
        try {
            ApplicationInfo applicationInfo = BaseApplication.getContext().getPackageManager().getApplicationInfo(BaseApplication.getContext().getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                LogUtil.j("DeviceInteractors", "appInfo data is null");
                return false;
            }
            string = applicationInfo.metaData.getString("is-support-direct-connect");
            while (strB.length() < 6) {
                strB = "0" + strB;
            }
            LogUtil.a("DeviceInteractors", "deviceModel: ", string);
            if (!TextUtils.isEmpty(string) && string.contains(strB)) {
                LogUtil.a("DeviceInteractors", "support scan is true");
                return true;
            }
            LogUtil.a("DeviceInteractors", "value string is not contains device");
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("DeviceInteractors", "getFrontParam PackageManager.NameNotFoundException");
            string = null;
        }
    }

    public void e(final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("DeviceInteractors", "migrateWearDeviceList enter");
        if (lsy.a(new Runnable() { // from class: rcv.2
            @Override // java.lang.Runnable
            public void run() {
                List<DeviceInfo> listI = rcv.this.i();
                if (listI != null && !listI.isEmpty()) {
                    LogUtil.a("DeviceInteractors", "migrateWearDeviceList health has device");
                    iBaseResponseCallback.a(100001, null);
                } else {
                    rcv.this.b(new IBaseResponseCallback() { // from class: rcv.2.3
                        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                        /* JADX INFO: renamed from: onResponse */
                        public void a(int i, Object obj) {
                            if (i == 0 && (obj instanceof List)) {
                                rcv.this.c((List<DeviceInfo>) obj);
                                iBaseResponseCallback.a(0, null);
                                return;
                            }
                            iBaseResponseCallback.a(100001, null);
                        }
                    });
                }
            }
        }) == -1) {
            iBaseResponseCallback.a(100001, null);
        }
    }

    public void b(final IBaseResponseCallback iBaseResponseCallback) {
        fic.e().b(new CompatibilityInteractor().a(), new IBaseResponseCallback() { // from class: rcv.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("DeviceInteractors", "getHuaweiWearDeviceListByTypes errorCode：", Integer.valueOf(i));
                if (i == 0 && (obj instanceof List)) {
                    List list = (List) obj;
                    if (list.size() > 0) {
                        iBaseResponseCallback.a(0, list);
                        return;
                    } else {
                        iBaseResponseCallback.a(100001, null);
                        return;
                    }
                }
                iBaseResponseCallback.a(100001, null);
            }
        });
    }

    public int c(String str) {
        LogUtil.a("DeviceInteractors", "enter getAllowDisturbListItem()");
        return mer.a().a(str);
    }
}
