package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.api.HealthDeviceEntryApi;
import com.huawei.health.device.callback.IDeviceEventHandler;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.model.DeviceInformation;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadResultCallBack;
import com.huawei.health.ecologydevice.clouddevice.DownloadDeviceInfoCallBack;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.datastruct.QrCodeOrNfcInfo;
import health.compact.a.HuaweiHealth;
import health.compact.a.LocalBroadcast;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class nyx {
    private static CopyOnWriteArrayList<String> e = new CopyOnWriteArrayList<>();

    public static void c(final String str, final QrCodeOrNfcInfo qrCodeOrNfcInfo, final DeviceInformation deviceInformation) {
        LogUtil.a("Track_IDEQ_BindIndoorEquipUtils", "bindEquipDevice");
        ThreadPoolManager.c().execute(new Runnable() { // from class: nyz
            @Override // java.lang.Runnable
            public final void run() {
                nyx.e(qrCodeOrNfcInfo, deviceInformation, str);
            }
        });
    }

    static /* synthetic */ void e(QrCodeOrNfcInfo qrCodeOrNfcInfo, DeviceInformation deviceInformation, String str) {
        MeasurableDevice bondedDeviceByUniqueId;
        String strC = nxs.d().c();
        if (!a(qrCodeOrNfcInfo, deviceInformation)) {
            if (TextUtils.isEmpty(str) && (bondedDeviceByUniqueId = dmg.a().getBondedDeviceByUniqueId(strC, false)) != null) {
                str = bondedDeviceByUniqueId.getProductId();
            }
            if (era.g(str)) {
                b(str, strC);
                return;
            }
            return;
        }
        e.add(strC);
        d(qrCodeOrNfcInfo, deviceInformation, strC);
    }

    private static void d(final QrCodeOrNfcInfo qrCodeOrNfcInfo, final DeviceInformation deviceInformation, final String str) {
        ReleaseLogUtil.d("Track_IDEQ_BindIndoorEquipUtils", "down index_all.json");
        DownloadManagerApi downloadManagerApi = (DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class);
        downloadManagerApi.addDownloadIndexAllCallBack(new DownloadResultCallBack() { // from class: nza
            @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadResultCallBack
            public final void setDownloadStatus(int i, int i2) {
                nyx.c(qrCodeOrNfcInfo, str, deviceInformation, i, i2);
            }
        });
        downloadManagerApi.downloadIndexAll();
    }

    static /* synthetic */ void c(QrCodeOrNfcInfo qrCodeOrNfcInfo, String str, DeviceInformation deviceInformation, int i, int i2) {
        if (i == 0) {
            return;
        }
        if (i == 1) {
            piq.e().c();
            e(qrCodeOrNfcInfo, str, deviceInformation);
        } else {
            LogUtil.j("Track_IDEQ_BindIndoorEquipUtils", "down index_all fail");
            e.remove(str);
        }
        ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).onDownloadIndexAllDestroy();
    }

    private static void e(QrCodeOrNfcInfo qrCodeOrNfcInfo, String str, DeviceInformation deviceInformation) {
        String strA;
        if (TextUtils.isEmpty(qrCodeOrNfcInfo.getDeviceType())) {
            LogUtil.a("Track_IDEQ_BindIndoorEquipUtils", "deviceType error");
            e.remove(str);
            return;
        }
        HealthDevice.HealthDeviceKind healthDeviceKind = HealthDevice.HealthDeviceKind.getHealthDeviceKind(qrCodeOrNfcInfo.getDeviceType());
        String strName = healthDeviceKind.name();
        if (!TextUtils.isEmpty(qrCodeOrNfcInfo.getPid())) {
            ProductMapInfo productMapInfoD = ProductMap.d(qrCodeOrNfcInfo.getPid());
            if (productMapInfoD != null) {
                strA = productMapInfoD.f();
            } else {
                a(qrCodeOrNfcInfo, deviceInformation, str, healthDeviceKind);
                return;
            }
        } else {
            strA = a(strName, deviceInformation.getBleDeviceName());
        }
        a(deviceInformation, str, strA, healthDeviceKind);
    }

    private static void a(final QrCodeOrNfcInfo qrCodeOrNfcInfo, final DeviceInformation deviceInformation, final String str, final HealthDevice.HealthDeviceKind healthDeviceKind) {
        efj.c().a(healthDeviceKind.name(), qrCodeOrNfcInfo.getPid(), new DownloadDeviceInfoCallBack() { // from class: nyx.5
            @Override // com.huawei.health.ecologydevice.clouddevice.DownloadDeviceInfoCallBack
            public void onSuccess() {
                ProductMapInfo productMapInfoD = ProductMap.d(qrCodeOrNfcInfo.getPid());
                if (productMapInfoD == null || !TextUtils.isEmpty(productMapInfoD.f())) {
                    nyx.e.remove(str);
                } else {
                    nyx.e(productMapInfoD.f(), nyx.e(deviceInformation, healthDeviceKind, productMapInfoD.f(), str), str);
                }
            }

            @Override // com.huawei.health.ecologydevice.clouddevice.DownloadDeviceInfoCallBack
            public void onFailure(int i) {
                nyx.e.remove(str);
            }

            @Override // com.huawei.health.ecologydevice.clouddevice.DownloadDeviceInfoCallBack
            public void onNetworkError() {
                nyx.e.remove(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static dmv e(DeviceInformation deviceInformation, HealthDevice.HealthDeviceKind healthDeviceKind, String str, String str2) {
        dmv dmvVar = new dmv();
        dmvVar.setDeviceName(deviceInformation.getBleDeviceName());
        dmvVar.setSerialNumber(deviceInformation.getSerialNumber());
        dmvVar.setProductId(str);
        dmvVar.d(str2);
        dmvVar.setKind(healthDeviceKind);
        return dmvVar;
    }

    private static void a(DeviceInformation deviceInformation, final String str, final String str2, HealthDevice.HealthDeviceKind healthDeviceKind) {
        if (TextUtils.isEmpty(str2)) {
            LogUtil.e("Track_IDEQ_BindIndoorEquipUtils", "productId error");
            e.remove(str);
            return;
        }
        final dmv dmvVarE = e(deviceInformation, healthDeviceKind, str2, str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        esw eswVar = new esw(HuaweiHealth.a(), healthDeviceKind.name(), 1, arrayList, new est() { // from class: nyx.1
            @Override // defpackage.ess
            public void onSuccess() {
                LogUtil.a("Track_IDEQ_BindIndoorEquipUtils", "startDownloadThirdPartyDevicePlugin onSuccess");
                nyx.e(str2, dmvVarE, str);
            }

            @Override // defpackage.ess
            public void onDownload(int i) {
                super.onDownload(i);
            }

            @Override // defpackage.ess
            public void onFailure(int i) {
                LogUtil.j("Track_IDEQ_BindIndoorEquipUtils", str, " download failure, errorCode is ", Integer.valueOf(i));
                nyx.e.remove(str);
            }
        });
        List<pjc> listC = piq.e().c(str2);
        if (!njy.e(listC)) {
            LogUtil.a("Track_IDEQ_BindIndoorEquipUtils", "DeviceDownloadSourceInfo ");
            eswVar.e(listC.get(0).g());
        }
        eswVar.b();
    }

    private static boolean a(QrCodeOrNfcInfo qrCodeOrNfcInfo, DeviceInformation deviceInformation) {
        if (qrCodeOrNfcInfo == null || deviceInformation == null) {
            LogUtil.a("Track_IDEQ_BindIndoorEquipUtils", "bindEquipDevice info error");
            return false;
        }
        String strC = nxs.d().c();
        if (TextUtils.isEmpty(strC) || ((HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class)).getBondedDeviceByUniqueId(strC) != null) {
            return false;
        }
        if (!e.contains(strC)) {
            return true;
        }
        LogUtil.a("Track_IDEQ_BindIndoorEquipUtils", "binding Device");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(final String str, final HealthDevice healthDevice, final String str2) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: nyy
            @Override // java.lang.Runnable
            public final void run() {
                String str3 = str;
                ((HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class)).bindDevice(str3, healthDevice, new IDeviceEventHandler() { // from class: nyx.3
                    @Override // com.huawei.health.device.callback.IDeviceEventHandler
                    public void onDeviceFound(HealthDevice healthDevice2) {
                        LogUtil.a("Track_IDEQ_BindIndoorEquipUtils", "onDeviceFound");
                    }

                    @Override // com.huawei.health.device.callback.IDeviceEventHandler
                    public void onScanFailed(int i) {
                        LogUtil.a("Track_IDEQ_BindIndoorEquipUtils", "onScanFailed code: ", Integer.valueOf(i));
                    }

                    @Override // com.huawei.health.device.callback.IDeviceEventHandler
                    public void onStateChanged(int i) {
                        LogUtil.a("Track_IDEQ_BindIndoorEquipUtils", "onStateChanged code: ", Integer.valueOf(i));
                        if (i == 7) {
                            String str4 = str3;
                            String str5 = str;
                            etg.d(str4, str5, str5);
                            Intent intent = new Intent();
                            intent.setAction("com.huawei.bone.action.UI_DEVICE_LIST_CHANGED");
                            BaseApplication.getContext().sendBroadcast(intent, LocalBroadcast.f36595c);
                            if (era.g(str3)) {
                                nyx.b(str3, str);
                            }
                        }
                        nyx.e.remove(str);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, String str2) {
        LogUtil.a("Track_IDEQ_BindIndoorEquipUtils", "registerDataClient");
        if (!nxs.d().h()) {
            LogUtil.j("Track_IDEQ_BindIndoorEquipUtils", "registerDataClient isDeviceBtConnected false");
        } else {
            esf esfVar = new esf();
            esfVar.c(esfVar.a(new esf.d(str, str2).e(nxs.d().a())), null);
        }
    }

    public static String a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            ArrayList<eds> arrayList = new ArrayList(16);
            arrayList.addAll(((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getDeviceList());
            if (njy.e(arrayList)) {
                LogUtil.a("Track_IDEQ_BindIndoorEquipUtils", "getDeviceInfoByBluetooth mAllDeviceList is empty");
                return "";
            }
            eds edsVar = null;
            String str3 = "";
            char c2 = 0;
            for (eds edsVar2 : arrayList) {
                if (edsVar2 != null && str.equals(edsVar2.s())) {
                    List<String> listD = edsVar2.d();
                    if (!njy.e(listD)) {
                        for (String str4 : listD) {
                            if (!TextUtils.isEmpty(str4) && a("PREFIX", str2, str4)) {
                                if (str4.length() > str3.length()) {
                                    edsVar = edsVar2;
                                    c2 = 1;
                                    str3 = str4;
                                } else if (str4.length() == str3.length()) {
                                    c2 = 2;
                                }
                            }
                        }
                    }
                }
            }
            if (edsVar != null && c2 == 1) {
                List<String> listAa = edsVar.aa();
                if (!njy.e(listAa) && listAa.size() == 1) {
                    return listAa.get(0);
                }
            }
        }
        return "";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074 A[RETURN] */
    private static boolean a(String str, String str2, String str3) {
        byte b2;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            str.hashCode();
            switch (str) {
                case "PREFIX":
                    b2 = 0;
                    break;
                case "SUFFIX":
                    b2 = 1;
                    break;
                case "EMPTY":
                    b2 = 2;
                    break;
                case "EXACT":
                    b2 = 3;
                    break;
                case "CONTAIN":
                    b2 = 4;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 != 0) {
                if (b2 != 1) {
                    if (b2 == 2) {
                        if (str2.contains(str3)) {
                            return true;
                        }
                    } else if (b2 != 3) {
                        if (b2 == 4) {
                            if (str2.contains(str3)) {
                                return true;
                            }
                        }
                    } else if (Objects.equals(str2, str3)) {
                        return true;
                    }
                } else if (str2.endsWith(str3)) {
                    return true;
                }
            } else if (str2.startsWith(str3)) {
                return true;
            }
        }
        return false;
    }
}
