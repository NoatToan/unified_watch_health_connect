package com.huawei.health.ecologydevice.manager;

import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.api.EventBusApi;
import com.huawei.health.device.api.HealthDeviceEntryApi;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.manager.DeviceCloudSharePreferencesManager;
import com.huawei.health.device.manager.ResourceFileListener;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import defpackage.dmm;
import defpackage.dmz;
import defpackage.dxc;
import defpackage.dxw;
import defpackage.dym;
import defpackage.ekg;
import defpackage.eky;
import defpackage.elg;
import defpackage.elh;
import defpackage.eli;
import defpackage.elj;
import defpackage.elk;
import defpackage.elx;
import defpackage.emc;
import defpackage.njy;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.HEXUtils;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import io.jsonwebtoken.Header;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public class ResourceManager {
    private static final Map<String, elh> e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f6548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<String> f6549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private eky f6550c;
    private ResourceFileListener d;

    static class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final ResourceManager f6553c = new ResourceManager();
    }

    private ResourceManager() {
        this.f6548a = new Object();
        LogUtil.a("EcologyDevice_ResourceManager", "ResourceManager getInstance()");
        this.f6550c = new eky();
    }

    public static ResourceManager c() {
        return d.f6553c;
    }

    public void d() {
        l();
        j();
    }

    public void i() {
        if (e() || a()) {
            LogUtil.a("EcologyDevice_ResourceManager", "ResourceManager updateResource is isToUpdate");
            h();
        }
    }

    public void g() {
        DeviceCloudSharePreferencesManager deviceCloudSharePreferencesManager = new DeviceCloudSharePreferencesManager(dxw.d(), "devicedownloadtime");
        String strB = deviceCloudSharePreferencesManager.b("currentAppVersion");
        if ("chinaVersion".equals(strB) || "overseaVersion".equals(strB)) {
            String str = Utils.o() ? "overseaVersion" : "chinaVersion";
            if (strB.equals(str)) {
                return;
            }
            LogUtil.a("EcologyDevice_ResourceManager", "ResourceManager updateGroupList version changed");
            deviceCloudSharePreferencesManager.b("currentAppVersion", str);
            this.f6550c.d().clear();
            this.f6550c.d();
            return;
        }
        LogUtil.a("EcologyDevice_ResourceManager", "ResourceManager updateGroupList first enter");
        if (!Utils.o()) {
            deviceCloudSharePreferencesManager.b("currentAppVersion", "chinaVersion");
        } else {
            deviceCloudSharePreferencesManager.b("currentAppVersion", "overseaVersion");
        }
    }

    public void e(ResourceFileListener resourceFileListener) {
        LogUtil.a("EcologyDevice_ResourceManager", "ResourceManager =====registerResultCallback");
        synchronized (this.f6548a) {
            this.d = resourceFileListener;
        }
    }

    public void c(int i, String str) {
        synchronized (this.f6548a) {
            ResourceFileListener resourceFileListener = this.d;
            if (resourceFileListener != null) {
                resourceFileListener.onResult(i, str);
            } else {
                LogUtil.j("EcologyDevice_ResourceManager", "ResourceManager sendResultCallBack resultCallBack is null");
            }
        }
    }

    public void f() {
        synchronized (this.f6548a) {
            this.d = null;
        }
    }

    public eky b() {
        return (eky) dym.d(this.f6550c);
    }

    public String a(String str) {
        return elg.e().b(str);
    }

    public elh d(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.d("EcologyDevice_ResourceManager", "ResourceManager getProductInfo paramProductId is empty");
            return null;
        }
        String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFKC);
        LogUtil.d("EcologyDevice_ResourceManager", "ResourceManager getProductInfo ID:", strNormalize);
        elh elhVarB = b(strNormalize);
        return elhVarB == null ? g(strNormalize) : elhVarB;
    }

    public elh b(String str) {
        Map<String, elh> map = e;
        if (map.size() > 0 && map.get(str) != null) {
            return map.get(str);
        }
        LogUtil.a("EcologyDevice_ResourceManager", "ResourceManager getProductInfoFromProductFile");
        elh elhVarC = eli.c(elg.e().c(str));
        if (elhVarC != null && elhVarC.d().size() > 0) {
            String strC = CommonUtil.c(elg.e().d(elhVarC.t(), elhVarC.d().get(0).d()));
            if (strC == null) {
                LogUtil.j("EcologyDevice_ResourceManager", "ResourceManager getProductInfoFromProductFile path is not exists ID:", str);
                return elhVarC;
            }
            if (!new File(strC).exists()) {
                LogUtil.j("EcologyDevice_ResourceManager", "ResourceManager getProductInfoFromProductFile file is not exists ID:", str);
                return elhVarC;
            }
            map.put(str, elhVarC);
            LogUtil.a("EcologyDevice_ResourceManager", "cache from product file, ID: ", str);
        }
        return elhVarC;
    }

    private elh g(String str) {
        LogUtil.a("EcologyDevice_ResourceManager", "ResourceManager getProductInfoFromBondedDevice");
        HealthDevice bondedDevice = ((HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class)).getBondedDevice(str);
        MeasurableDevice measurableDevice = bondedDevice instanceof MeasurableDevice ? (MeasurableDevice) bondedDevice : null;
        if (measurableDevice == null) {
            LogUtil.j("EcologyDevice_ResourceManager", "ResourceManager getProductInfoFromBondedDevice the device is null! ID:", str);
            return null;
        }
        if (!"0".equals(measurableDevice.getMeasureKitUuid()) && !str.contains(Constants.LINK)) {
            return d("ic_heartrate_devices", str, measurableDevice.getDeviceName(), measurableDevice.getAddress(), measurableDevice);
        }
        if (!"0".equals(measurableDevice.getMeasureKitUuid()) && str.contains(Constants.LINK)) {
            return d("", str, "", "", measurableDevice);
        }
        LogUtil.j("EcologyDevice_ResourceManager", "ResourceManager getProductInfoFromBondedDevice the productInfo is null! ID:", str);
        return null;
    }

    private elh d(String str, String str2, String str3, String str4, MeasurableDevice measurableDevice) {
        elh elhVar = new elh();
        elhVar.l(str2);
        elhVar.b(str, str3, str4);
        elhVar.a("1");
        dmm.e eVar = new dmm.e();
        eVar.e(1);
        eVar.b(10L, TimeUnit.SECONDS);
        elhVar.b(eVar.b());
        elhVar.f(measurableDevice.getMeasureKitUuid());
        elhVar.a(measurableDevice.getKind());
        if (!"".equals(measurableDevice.getDeviceName())) {
            e.put(str2, elhVar);
            LogUtil.a("EcologyDevice_ResourceManager", "cache from device db, productId: ", str2);
        }
        return elhVar;
    }

    public void l() {
        DeviceCloudSharePreferencesManager deviceCloudSharePreferencesManager = new DeviceCloudSharePreferencesManager(dxw.d(), "devicedownloadtime");
        if (deviceCloudSharePreferencesManager.d("userchange") == Utils.o()) {
            this.f6550c.c().clear();
            if (!Utils.o()) {
                deviceCloudSharePreferencesManager.c("userchange", true);
            } else {
                deviceCloudSharePreferencesManager.c("userchange", false);
            }
        }
    }

    public boolean e() {
        LogUtil.a("EcologyDevice_ResourceManager", "ResourceManager isToUpdate");
        return elx.a().e();
    }

    public boolean a() {
        LogUtil.a("EcologyDevice_ResourceManager", "ResourceManager isFirstToDownload");
        return elx.a().b();
    }

    public boolean c(String str) {
        return elx.a().c(str);
    }

    public boolean h(String str) {
        return elx.a().h(str);
    }

    public void h() {
        String strC;
        final String str;
        LogUtil.a("EcologyDevice_ResourceManager", "DeviceCloudUtil toDownloadSingleXmlFile()");
        if (!Utils.o()) {
            LogUtil.a("EcologyDevice_ResourceManager", "toDownloadSingleXmlFile to download groups.xml");
            strC = ekg.c("devicekindgroups_new");
            str = dxc.e + "groups.xml";
        } else {
            LogUtil.a("EcologyDevice_ResourceManager", "toDownloadSingleXmlFile to download groups_abroad.xml");
            if (CommonUtil.cj()) {
                strC = ekg.c("devicekindgroups_new");
                str = dxc.e + "groups.xml";
            } else if (!TextUtils.equals(o(), "true")) {
                LogUtil.a("EcologyDevice_ResourceManager", "toDownloadSingleXmlFile user disagree download resoure");
                ((EventBusApi) Services.b("PluginDevice", EventBusApi.class)).publishDeviceDownMsg();
                return;
            } else {
                strC = ekg.c("devicekindgroupsabroad_new");
                str = dxc.e + "groups_abroad.xml";
            }
        }
        a(GRSManager.c(BaseApplication.getContext()).getUrl("getLatestVersion"), strC, new ResourceFileListener() { // from class: elr
            @Override // com.huawei.health.device.manager.ResourceFileListener
            public final void onResult(int i, String str2) {
                this.f33146a.b(str, i, str2);
            }
        });
    }

    public /* synthetic */ void b(String str, int i, String str2) {
        if (i == 200) {
            LogUtil.a("EcologyDevice_ResourceManager", "DeviceCloudUtil toDownloadSingleXmlFile() resCode =", Integer.valueOf(i));
            d(ekg.d(str2), str);
        }
    }

    public void c(ArrayList<elj> arrayList) {
        if (njy.e(arrayList)) {
            LogUtil.j("EcologyDevice_ResourceManager", "toDownloadZipFilesFromKind fileInfo is empty");
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (elj eljVar : arrayList) {
            LogUtil.a("EcologyDevice_ResourceManager", "download id:", eljVar.c());
            arrayList2.add(eljVar.c());
        }
        int size = arrayList2.size() % 20;
        int size2 = arrayList2.size() / 20;
        if (size > 0) {
            size2++;
        }
        for (int i = 1; i <= size2; i++) {
            ArrayList<String> arrayList3 = new ArrayList<>();
            if (arrayList2.size() % 20 > 0 && i == size2) {
                int i2 = (i - 1) * 20;
                arrayList3.addAll(arrayList2.subList(i2, i2 + size));
            } else {
                arrayList3.addAll(arrayList2.subList((i - 1) * 20, i * 20));
            }
            d(arrayList3);
        }
    }

    public void d(ArrayList<String> arrayList) {
        if (njy.e(arrayList)) {
            return;
        }
        LogUtil.a("EcologyDevice_ResourceManager", "DeviceCloudUtil toDownloadZipFile fileIds size is ", Integer.valueOf(arrayList.size()));
        a(GRSManager.c(BaseApplication.getContext()).getUrl("getLatestVersion"), ekg.c(arrayList), new ResourceFileListener() { // from class: elp
            @Override // com.huawei.health.device.manager.ResourceFileListener
            public final void onResult(int i, String str) {
                this.d.b(i, str);
            }
        });
    }

    public /* synthetic */ void b(int i, String str) {
        List<emc> listA;
        if (i == 200 && (listA = ekg.a(str)) != null) {
            LogUtil.a("EcologyDevice_ResourceManager", "DeviceCloudUtil toDownloadZipFile resultObjects is not null");
            c(listA, false);
        }
    }

    public void a(ArrayList<String> arrayList, final boolean z) {
        LogUtil.a("EcologyDevice_ResourceManager", "toDownResZipGetSize download resource enter");
        if (!njy.e(arrayList)) {
            this.f6549b = arrayList;
        }
        LogUtil.a("EcologyDevice_ResourceManager", "toDownResZipGetSize mFileIds.size > 0");
        if (Utils.o() && !TextUtils.equals(o(), "true")) {
            LogUtil.a("EcologyDevice_ResourceManager", "toDownResZipGetSize download resource");
            ((EventBusApi) Services.b("PluginDevice", EventBusApi.class)).publishSingleDeviceDownMsg();
            return;
        }
        LogUtil.a("EcologyDevice_ResourceManager", "toDownResZipGetSize china network");
        if (!njy.e(this.f6549b)) {
            LogUtil.a("EcologyDevice_ResourceManager", "toDownResZipGetSize fileIds size is ", Integer.valueOf(this.f6549b.size()));
            a(GRSManager.c(BaseApplication.getContext()).getUrl("getLatestVersion"), ekg.c(this.f6549b), new ResourceFileListener() { // from class: ely
                @Override // com.huawei.health.device.manager.ResourceFileListener
                public final void onResult(int i, String str) {
                    this.e.a(z, i, str);
                }
            });
        }
        LogUtil.a("EcologyDevice_ResourceManager", "toDownResZipGetSize end");
    }

    public /* synthetic */ void a(boolean z, int i, String str) {
        List<emc> listA;
        this.f6549b.clear();
        if (i != 200 || (listA = ekg.a(str)) == null) {
            return;
        }
        LogUtil.a("EcologyDevice_ResourceManager", "toDownResZipGetSize is not null");
        c(listA, z);
    }

    public void b(ArrayList<String> arrayList) {
        if (!njy.e(arrayList)) {
            this.f6549b = arrayList;
        }
        if (Utils.o() && !TextUtils.equals(o(), "true")) {
            LogUtil.a("EcologyDevice_ResourceManager", "toDownResZip user disagree download resource");
            ((EventBusApi) Services.b("PluginDevice", EventBusApi.class)).publishSingleDeviceDownMsg();
        } else {
            if (njy.e(this.f6549b)) {
                return;
            }
            LogUtil.a("EcologyDevice_ResourceManager", "DeviceCloudUtil toDownResZip fileIds size is ", Integer.valueOf(this.f6549b.size()));
            a(GRSManager.c(BaseApplication.getContext()).getUrl("getLatestVersion"), ekg.c(this.f6549b), new ResourceFileListener() { // from class: elu
                @Override // com.huawei.health.device.manager.ResourceFileListener
                public final void onResult(int i, String str) {
                    this.d.e(i, str);
                }
            });
        }
    }

    public /* synthetic */ void e(int i, String str) {
        List<emc> listA;
        this.f6549b.clear();
        if (i != 200 || (listA = ekg.a(str)) == null) {
            return;
        }
        LogUtil.a("EcologyDevice_ResourceManager", "DeviceCloudUtil toDownResZip is not null");
        c(listA, false);
    }

    private String o() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), "oversea_user_agreed");
        LogUtil.a("EcologyDevice_ResourceManager", "getUserAgreeStatus onclick userAgreed :", strE);
        return strE;
    }

    private void o(String str) {
        String strSubstring;
        if (str == null) {
            return;
        }
        int iLastIndexOf = str.lastIndexOf("_new");
        if (iLastIndexOf != -1 && str.length() >= iLastIndexOf) {
            strSubstring = str.substring(0, iLastIndexOf);
        } else {
            strSubstring = "";
        }
        LogUtil.a("EcologyDevice_ResourceManager", "ResourceManager setProductsCatch productID ", strSubstring);
        String strC = elg.e().c(strSubstring);
        LogUtil.a("EcologyDevice_ResourceManager", "ResourceManager setProductsCatch filePath ", strC);
        elh elhVarC = eli.c(strC);
        if (elhVarC != null) {
            Map<String, elh> map = e;
            map.remove(elhVarC.t());
            map.put(elhVarC.t(), elhVarC);
        }
    }

    private void c(List<emc> list, final boolean z) {
        if (list == null) {
            return;
        }
        AtomicInteger atomicInteger = new AtomicInteger(1);
        LogUtil.a("EcologyDevice_ResourceManager", "DeviceCloudUtil toDownloadFileList is not null");
        for (final emc emcVar : list) {
            dxw.d(new PriorityRunnable(atomicInteger.getAndIncrement()) { // from class: com.huawei.health.ecologydevice.manager.ResourceManager.4
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.a("EcologyDevice_ResourceManager", "FileManager toDownloadFileList the file is not exists");
                    String str = dxc.f32474a + emcVar.a() + ".zip";
                    if (!z) {
                        ResourceManager.this.c(str, emcVar);
                        return;
                    }
                    double dE = ResourceManager.e(emcVar.e());
                    LogUtil.a("EcologyDevice_ResourceManager", "File size ", Double.valueOf(dE));
                    if (dE <= 0.0d) {
                        return;
                    }
                    ResourceManager.this.c(300, String.valueOf(dE));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, final emc emcVar) {
        final String strA = emcVar.a();
        elx.a().e(this.f6550c, emcVar.e(), str, new ResourceFileListener() { // from class: elv
            @Override // com.huawei.health.device.manager.ResourceFileListener
            public final void onResult(int i, String str2) {
                this.f33150a.a(strA, emcVar, i, str2);
            }
        });
    }

    public /* synthetic */ void a(String str, emc emcVar, int i, String str2) {
        if (i != 200000) {
            c(-1, str);
            return;
        }
        LogUtil.a("EcologyDevice_ResourceManager", "ResourceManager downLoadResourceFiled resultCode ", Integer.valueOf(i));
        String str3 = dxc.f32474a + str + ".zip";
        String str4 = dxc.d;
        if (!TextUtils.isEmpty(str) && str.contains("6d5416d9-2167-41df-ab10-c492e152b44f")) {
            str4 = dxc.f32475b;
        }
        if (a(str3, emcVar)) {
            return;
        }
        LogUtil.a("EcologyDevice_ResourceManager", "ResourceManager downLoadResourceFiled resultObject.getFileId():", str);
        if (str.startsWith("6d5416d9-2167-41df-ab10-c492e152b44f")) {
            c(str3, str4, str);
        } else {
            elx.a().c(str3, null, str4, new e(this));
            o(str);
        }
    }

    private void c(String str, String str2, String str3) {
        if (!new File(str2 + "6d5416d9-2167-41df-ab10-c492e152b44f" + File.separator + "libs" + File.separator + "am16.dex").exists()) {
            elx.a().c(str, null, str2, new e(this));
            o(str3);
            return;
        }
        LogUtil.a("EcologyDevice_ResourceManager", "ResourceManager downLoadResourceFiled DeviceCloudConstants DEVICE_GOODIX Resource exit");
        n();
        try {
            CommonUtil.d(str, dmz.f32036a, true);
        } catch (Exception unused) {
            LogUtil.e("EcologyDevice_ResourceManager", "ResourceManager downLoadResourceFiled copy fail");
        }
    }

    private void n() {
        File file = new File(dmz.e);
        if (file.exists()) {
            return;
        }
        LogUtil.a("EcologyDevice_ResourceManager", "initDest DeviceCloudConstants DEVICE_GOODIX Cache Path Make", Boolean.valueOf(file.mkdirs()));
    }

    private boolean a(String str, emc emcVar) {
        String strD = this.f6550c.d(emcVar.a());
        String strA = elx.a().a(str, "SHA-256");
        if (strD.equals(strA)) {
            return false;
        }
        LogUtil.a("EcologyDevice_ResourceManager", "checkZipHashCode the download check hash is fail, hash_value=", strD, " hash_value_zip=", strA);
        File file = new File(str);
        if (!file.exists()) {
            return true;
        }
        if (file.delete()) {
            LogUtil.a("EcologyDevice_ResourceManager", "checkZipHashCode the zip file hash value is wrong, so delete zhe zip file success");
            return true;
        }
        LogUtil.a("EcologyDevice_ResourceManager", "checkZipHashCode the zip file hash value is wrong, so delete zhe zip file fail");
        return true;
    }

    public String a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
            return HEXUtils.a(messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            LogUtil.e("EcologyDevice_ResourceManager", "ResourceManager getHashCodeForString e=", e2.getMessage());
            return "";
        }
    }

    public void d(String str, InputStream inputStream, ResourceFileListener resourceFileListener) {
        a(str, inputStream, resourceFileListener);
    }

    private void a(final String str, final InputStream inputStream, final ResourceFileListener resourceFileListener) {
        if (resourceFileListener == null) {
            LogUtil.a("EcologyDevice_ResourceManager", "ResourceManager executorServiceRunnable resourceFileListener == null");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: eln
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.c(str, inputStream, resourceFileListener);
                }
            });
        }
    }

    public /* synthetic */ void c(String str, InputStream inputStream, final ResourceFileListener resourceFileListener) {
        elx.a().c(str, inputStream, dxc.d, new ResourceFileListener() { // from class: elm
            @Override // com.huawei.health.device.manager.ResourceFileListener
            public final void onResult(int i, String str2) {
                this.e.c(resourceFileListener, i, str2);
            }
        });
    }

    public /* synthetic */ void c(ResourceFileListener resourceFileListener, int i, String str) {
        LogUtil.a("EcologyDevice_ResourceManager", "onResult, resultCode : ", Integer.valueOf(i), "resultValue : ", str);
        if (i != 200) {
            resourceFileListener.onResult(-1, "unzip failed");
            return;
        }
        LogUtil.a("EcologyDevice_ResourceManager", "resultCode : ", Integer.valueOf(i), "UNZIP file productId : ", str);
        if (!elg.e().d(str)) {
            elg.e().a(str);
            resourceFileListener.onResult(40004, "zip is error");
            return;
        }
        LogUtil.a("EcologyDevice_ResourceManager", "the file is right");
        i(str);
        LogUtil.a("EcologyDevice_ResourceManager", "CommonUtil.isTestThirdDeviceVersion:", Boolean.valueOf(CommonUtil.cj()));
        if (CommonUtil.cj()) {
            l(str);
        }
        resourceFileListener.onResult(200, "unzip finished");
    }

    private void i(String str) {
        elh elhVarD = c().d(str);
        if (elhVarD == null) {
            LogUtil.a("EcologyDevice_ResourceManager", "productInfo is null");
            return;
        }
        if ("NULL".equals(elhVarD.o()) || elhVarD.o() == null) {
            LogUtil.j("EcologyDevice_ResourceManager", "productInfo.getMeasureEntry() is null");
        } else {
            a(str, elhVarD);
        }
        LogUtil.a("EcologyDevice_ResourceManager", "===productInfo is not", ",===Entry:", elhVarD.o());
        c().b().d();
        LogUtil.a("EcologyDevice_ResourceManager", "productGroups size =", Integer.valueOf(c().b().c().size()));
        c().b().b(elhVarD.m(), "home", new elj(elhVarD.t(), elhVarD.ab(), "", ""));
    }

    private void l(String str) {
        SharedPreferences.Editor editorEdit = BaseApplication.getContext().getSharedPreferences("data", 0).edit();
        editorEdit.putString("productId", str);
        editorEdit.apply();
    }

    private void a(String str, elh elhVar) {
        try {
            File file = new File(dxc.d + str + File.separator + str + File.separator + (elhVar.o().substring(0, elhVar.o().indexOf(":") - 3) + Header.COMPRESSION_ALGORITHM));
            String canonicalPath = file.getCanonicalPath();
            LogUtil.a("EcologyDevice_ResourceManager", "unZipLib jniLibs");
            int iLastIndexOf = canonicalPath.lastIndexOf("/");
            if (!file.exists() || iLastIndexOf == -1) {
                LogUtil.a("EcologyDevice_ResourceManager", "not exists jnilibs");
            } else {
                elx.a().c(canonicalPath, null, canonicalPath.substring(0, iLastIndexOf), new ResourceFileListener() { // from class: ell
                    @Override // com.huawei.health.device.manager.ResourceFileListener
                    public final void onResult(int i, String str2) {
                        LogUtil.a("EcologyDevice_ResourceManager", "unZip jniLibs resultCode ", Integer.valueOf(i));
                    }
                });
            }
        } catch (IOException e2) {
            LogUtil.e("EcologyDevice_ResourceManager", "unZipLib", e2.getMessage());
        }
    }

    private static void a(final String str, final String str2, final ResourceFileListener resourceFileListener) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: elt
            @Override // java.lang.Runnable
            public final void run() {
                elx.a().a(str, str2, resourceFileListener);
            }
        });
    }

    private void d(emc emcVar, final String str) {
        if (emcVar == null) {
            LogUtil.j("EcologyDevice_ResourceManager", "ResourceManager toDownloadGroupsFile resultObject is null");
            return;
        }
        final String strE = emcVar.e();
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("EcologyDevice_ResourceManager", "ResourceManager toDownloadGroupsFile url is null");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: elq
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.e(strE, str);
                }
            });
        }
    }

    public /* synthetic */ void e(String str, String str2) {
        elx.a().e(this.f6550c, str, str2, new e(this));
    }

    static class e implements ResourceFileListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<ResourceManager> f6554c;

        e(ResourceManager resourceManager) {
            this.f6554c = new WeakReference<>(resourceManager);
        }

        @Override // com.huawei.health.device.manager.ResourceFileListener
        public void onResult(int i, String str) {
            ResourceManager resourceManager;
            WeakReference<ResourceManager> weakReference = this.f6554c;
            if (weakReference == null || (resourceManager = weakReference.get()) == null) {
                return;
            }
            resourceManager.c(i, str);
        }
    }

    public void j() {
        LogUtil.a("EcologyDevice_ResourceManager", "ResourceManager unzipForRes");
        ArrayList<elk> arrayListD = this.f6550c.d();
        DeviceCloudSharePreferencesManager deviceCloudSharePreferencesManager = new DeviceCloudSharePreferencesManager(dxw.d(), "devicedownloadtime");
        if ("NoFirst".equals(deviceCloudSharePreferencesManager.b("firstUnzipRes"))) {
            LogUtil.a("EcologyDevice_ResourceManager", "ResourceManager unzipForRes() firstUnzipRes is NoFirst");
        } else if (Utils.o()) {
            a(arrayListD, deviceCloudSharePreferencesManager, "abroadFirstUnzipResource");
        } else {
            a(arrayListD, deviceCloudSharePreferencesManager, "firstUnzipResource");
        }
    }

    private void a(final ArrayList<elk> arrayList, DeviceCloudSharePreferencesManager deviceCloudSharePreferencesManager, String str) {
        if ("0".equals(deviceCloudSharePreferencesManager.b(str))) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: els
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33148c.e(arrayList);
                }
            });
            deviceCloudSharePreferencesManager.b(str, "NoFirst");
        }
    }

    public /* synthetic */ void e(ArrayList arrayList) {
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a(((elk) it.next()).b());
            }
            c(200, MessageConstant.GROUP_MEDAL_TYPE);
        } catch (Exception unused) {
            LogUtil.e("EcologyDevice_ResourceManager", "ResourceManager unzip Exception");
        }
    }

    private void a(ArrayList<elj> arrayList) {
        Iterator<elj> it = arrayList.iterator();
        while (it.hasNext()) {
            String strA = it.next().a();
            if (!"6d5416d9-2167-41df-ab10-c492e152b44f".equals(strA)) {
                elx.a().c(strA, null, dxc.d, new e(this));
            } else {
                elx.a().c(strA, null, dxc.f32475b, new e(this));
            }
        }
    }

    abstract class PriorityRunnable implements Runnable, Comparable<PriorityRunnable> {
        private int mPriority;

        PriorityRunnable(int i) {
            if (i < 0) {
                throw new IllegalArgumentException();
            }
            this.mPriority = i;
        }

        @Override // java.lang.Comparable
        public int compareTo(PriorityRunnable priorityRunnable) {
            if (priorityRunnable == null) {
                return 0;
            }
            return Integer.compare(priorityRunnable.getPriority(), getPriority());
        }

        public int getPriority() {
            return this.mPriority;
        }
    }

    public static double e(String str) {
        if (str == null) {
            return 0.0d;
        }
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                httpURLConnection = uRLConnectionOpenConnection instanceof HttpURLConnection ? (HttpURLConnection) uRLConnectionOpenConnection : null;
                return httpURLConnection != null ? httpURLConnection.getContentLength() : 0.0d;
            } catch (IOException e2) {
                LogUtil.e("EcologyDevice_ResourceManager", "ResourceManager getDownloadFileSize IOException e=", e2.getMessage());
                return 0.0d;
            }
        } finally {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
    }

    public void f(String str) {
        elx.a().c(str, null, dxc.d, new ResourceFileListener() { // from class: elz
            @Override // com.huawei.health.device.manager.ResourceFileListener
            public final void onResult(int i, String str2) {
                LogUtil.a("EcologyDevice_ResourceManager", "ResourceManager unZipWiFiDevice resultCode=", Integer.valueOf(i), " resultValue:", str2);
            }
        });
    }

    public void j(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Map<String, elh> map = e;
        if (map.containsKey(str)) {
            LogUtil.d("EcologyDevice_ResourceManager", "removeCacheMapByProductId productId = ", str);
            map.remove(str);
        }
    }

    public void c(Handler handler, MassageGunConfig.MassageGunCallback massageGunCallback) {
        new MassageGunConfig().d(handler, massageGunCallback);
    }
}
