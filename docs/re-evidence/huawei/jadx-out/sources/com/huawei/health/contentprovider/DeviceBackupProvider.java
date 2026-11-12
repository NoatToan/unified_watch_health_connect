package com.huawei.health.contentprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.manager.powerkit.PowerKitManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.login.huaweilogin.HuaweiLoginManager;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.login.ui.login.util.ILoginCallback;
import defpackage.clw;
import defpackage.cno;
import defpackage.coq;
import defpackage.cpc;
import defpackage.cqd;
import defpackage.ecu;
import defpackage.edf;
import defpackage.eel;
import defpackage.mdy;
import defpackage.mkf;
import defpackage.mkl;
import defpackage.mko;
import defpackage.mmu;
import defpackage.mmx;
import defpackage.mxg;
import defpackage.pil;
import health.compact.a.CommonUtil;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes26.dex */
public class DeviceBackupProvider extends ContentProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final UriMatcher f6277b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6278a = 0;
    private String d;
    private String e;

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f6277b = uriMatcher;
        uriMatcher.addURI("com.huawei.health.provider.DeviceBackupProvider", "files/mmkv/keyvaldb_encrypt_udsdevice", 1);
        uriMatcher.addURI("com.huawei.health.provider.DeviceBackupProvider", "files/mmkv/keyvaldb_encrypt_udsdevice.crc", 2);
        uriMatcher.addURI("com.huawei.health.provider.DeviceBackupProvider", "files/mmkv/keyvaldb_unencrypt", 3);
        uriMatcher.addURI("com.huawei.health.provider.DeviceBackupProvider", "files/mmkv/keyvaldb_unencrypt.crc", 4);
        uriMatcher.addURI("com.huawei.health.provider.DeviceBackupProvider", "shared_prefs/relation.xml", 5);
        uriMatcher.addURI("com.huawei.health.provider.DeviceBackupProvider", "files/plugin.zip", 6);
        uriMatcher.addURI("com.huawei.health.provider.DeviceBackupProvider", "databases/notification.db", 7);
        uriMatcher.addURI("com.huawei.health.provider.DeviceBackupProvider", "databases/notification.db-journal", 8);
        uriMatcher.addURI("com.huawei.health.provider.DeviceBackupProvider", "files/mmkv/1000", 9);
        uriMatcher.addURI("com.huawei.health.provider.DeviceBackupProvider", "files/mmkv/1000.crc", 10);
        uriMatcher.addURI("com.huawei.health.provider.DeviceBackupProvider", "files/mmkv/1", 11);
        uriMatcher.addURI("com.huawei.health.provider.DeviceBackupProvider", "files/mmkv/1.crc", 12);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        LogUtil.b("DeviceBackupProvider", "onCreate");
        return true;
    }

    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, Bundle bundle) {
        d();
        if (TextUtils.isEmpty(str)) {
            LogUtil.d("DeviceBackupProvider", "call unkonw method");
            return null;
        }
        if ("backup_start".equals(str)) {
            return b(str2, bundle);
        }
        if ("backup_query".equals(str)) {
            return a(str2, bundle);
        }
        if ("backup_complete".equals(str)) {
            return h();
        }
        if ("backup_recover_start".equals(str)) {
            return d(bundle);
        }
        if ("backup_recover_complete".equals(str)) {
            return j();
        }
        if ("notifyCloneFinish".equals(str)) {
            b();
            return null;
        }
        LogUtil.d("DeviceBackupProvider", "call unkonw method: ", str);
        return null;
    }

    private Bundle b(String str, Bundle bundle) {
        LogUtil.b("DeviceBackupProvider", "handleBackupStart arg: ", str, " extras: ", bundle);
        String lowerCase = Build.BRAND.toLowerCase(Locale.ENGLISH);
        LogUtil.b("DeviceBackupProvider", "handleBackupStart phoneBrand: ", lowerCase, " versionCode: ", Integer.valueOf(Build.VERSION.SDK_INT));
        if ("backup".equals(str) && bundle != null) {
            ReleaseLogUtil.c("DEVMGR_DeviceBackupProvider", "handleBackupStart backup enter");
            if (!"huawei".equals(lowerCase)) {
                ReleaseLogUtil.c("DEVMGR_DeviceBackupProvider", "handleBackupStart is emui system or third, not support.");
                return new Bundle();
            }
            Bundle bundle2 = bundle.getBundle("new_phone_ability_info");
            if (bundle2 == null) {
                return new Bundle();
            }
            String string = bundle2.getString("version_number");
            String string2 = bundle2.getString("new_phone_bluetooth_name");
            String string3 = bundle2.getString("new_phone_brand_name");
            LogUtil.b("DeviceBackupProvider", "backup versionNumber: ", string, " newPhoneBluetoothName: ", string2, " newPhoneBrandName: ", string3, " newPhoneIsEmui: ", Boolean.valueOf(bundle2.getBoolean("new_phone_is_emui")));
            if (!"huawei".equals(string3)) {
                ReleaseLogUtil.d("DEVMGR_DeviceBackupProvider", "handleBackupStart newPhoneBundle is not hw.");
                return new Bundle();
            }
            mmu.e().d(string2);
            List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "handleBackupStart");
            if (deviceList == null || deviceList.size() == 0) {
                return new Bundle();
            }
            ArrayList arrayList = new ArrayList(16);
            ArrayList arrayList2 = new ArrayList(16);
            HashMap map = new HashMap(16);
            for (DeviceInfo deviceInfo : deviceList) {
                if (cqd.c(deviceInfo, 223) && deviceInfo.getDeviceActiveState() == 1) {
                    arrayList2.add(deviceInfo.getDeviceIdentify());
                    map.put(deviceInfo.getDeviceIdentify(), true);
                } else {
                    arrayList.add(deviceInfo.getDeviceIdentify());
                }
            }
            mmu.e().c(map);
            LogUtil.b("DeviceBackupProvider", "handleBackupStart mSupportConnectNewDevices: ", Arrays.asList(arrayList2));
            mmu.e().b(arrayList2);
            mkf.e(BaseApplication.getContext()).unPair(arrayList, false);
            return null;
        }
        if ("restore".equals(str)) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("version_number", mdy.h());
            bundle3.putString("new_phone_bluetooth_name", e());
            bundle3.putString("new_phone_brand_name", lowerCase);
            bundle3.putBoolean("new_phone_is_emui", CommonUtil.as());
            Bundle bundle4 = new Bundle();
            bundle4.putBundle("ability_info", bundle3);
            LogUtil.b("DeviceBackupProvider", "handleBackupStart restore abilityBundle: ", bundle3);
            return bundle4;
        }
        LogUtil.b("DeviceBackupProvider", "handleBackupStart else arg.");
        return null;
    }

    private Bundle a(String str, Bundle bundle) {
        List<DeviceInfo> deviceList;
        ReleaseLogUtil.c("DEVMGR_DeviceBackupProvider", "handleBackupQuery arg: ", str);
        String lowerCase = Build.BRAND.toLowerCase(Locale.ENGLISH);
        LogUtil.b("DeviceBackupProvider", "handleBackupQuery phoneBrand: ", lowerCase, " versionCode: ", Integer.valueOf(Build.VERSION.SDK_INT));
        if (!"huawei".equals(lowerCase)) {
            ReleaseLogUtil.c("DEVMGR_DeviceBackupProvider", "handleBackupQuery third, not support.");
            return null;
        }
        if ("backup".equals(str) && ((deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "handleBackupQuery")) == null || deviceList.size() == 0)) {
            LogUtil.e("DeviceBackupProvider", "handleBackupQuery no device, return.");
            return null;
        }
        LogUtil.b("DeviceBackupProvider", "handleBackupQuery insert data");
        ArrayList<String> arrayList = new ArrayList<>(16);
        arrayList.add("content://com.huawei.health.provider.DeviceBackupProvider/files/mmkv/keyvaldb_encrypt_udsdevice");
        arrayList.add("content://com.huawei.health.provider.DeviceBackupProvider/files/mmkv/keyvaldb_encrypt_udsdevice.crc");
        arrayList.add("content://com.huawei.health.provider.DeviceBackupProvider/files/mmkv/keyvaldb_unencrypt");
        arrayList.add("content://com.huawei.health.provider.DeviceBackupProvider/files/mmkv/keyvaldb_unencrypt.crc");
        arrayList.add("content://com.huawei.health.provider.DeviceBackupProvider/shared_prefs/relation.xml");
        arrayList.add("content://com.huawei.health.provider.DeviceBackupProvider/files/plugin.zip");
        arrayList.add("content://com.huawei.health.provider.DeviceBackupProvider/databases/notification.db");
        arrayList.add("content://com.huawei.health.provider.DeviceBackupProvider/databases/notification.db-journal");
        arrayList.add("content://com.huawei.health.provider.DeviceBackupProvider/files/mmkv/1000");
        arrayList.add("content://com.huawei.health.provider.DeviceBackupProvider/files/mmkv/1000.crc");
        arrayList.add("content://com.huawei.health.provider.DeviceBackupProvider/files/mmkv/1");
        arrayList.add("content://com.huawei.health.provider.DeviceBackupProvider/files/mmkv/1.crc");
        Bundle bundle2 = new Bundle();
        bundle2.putInt("version", 1);
        bundle2.putStringArrayList("openfile_uri_list", arrayList);
        LogUtil.b("DeviceBackupProvider", "handleBackupQuery result: ", bundle2);
        return bundle2;
    }

    private static String e() {
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, "ro.config.marketing_name");
            if (objInvoke != null && (objInvoke instanceof String)) {
                return (String) objInvoke;
            }
            return "";
        } catch (Exception e) {
            LogUtil.e("DeviceBackupProvider", "getMarketingName Exception: ", cpc.c(e));
            return "";
        }
    }

    public void b() {
        ReleaseLogUtil.c("DEVMGR_DeviceBackupProvider", "notifyCloneFinish enter");
        if (NetworkUtil.h()) {
            ReleaseLogUtil.c("DEVMGR_DeviceBackupProvider", "notifyCloneFinish have network");
            f();
        } else {
            ReleaseLogUtil.c("DEVMGR_DeviceBackupProvider", "notifyCloneFinish no have network");
            i();
        }
    }

    private void f() {
        String accountInfo = LoginInit.getInstance(getContext()).getAccountInfo(1011);
        this.e = accountInfo;
        LogUtil.b("DeviceBackupProvider", "handleBackupRecoverComplete mOldUserId: ", accountInfo);
        HuaweiLoginManager.getInstance().hmsHasLogined(new ILoginCallback() { // from class: com.huawei.health.contentprovider.DeviceBackupProvider.1
            @Override // com.huawei.login.ui.login.util.ILoginCallback
            public void onLoginSuccess(Object obj) {
                ThreadPoolManager.c().a("DeviceBackupProvider", new Runnable() { // from class: com.huawei.health.contentprovider.DeviceBackupProvider.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        DeviceBackupProvider.this.a();
                    }
                });
            }

            @Override // com.huawei.login.ui.login.util.ILoginCallback
            public void onLoginFailed(Object obj) {
                DeviceBackupProvider.this.i();
            }
        }, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.d = LoginInit.getInstance(getContext()).getAccountInfo(1011);
        ReleaseLogUtil.c("DEVMGR_DeviceBackupProvider", "backup onLoginSuccess");
        LogUtil.b("DeviceBackupProvider", "backup onLoginSuccess currentHuid: ", this.d, " mOldUserId: ", this.e);
        mkl.d().b();
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "cloneSignIn");
        int i = 200;
        for (int i2 = 0; i2 < 5; i2++) {
            try {
                if (coq.d(deviceList)) {
                    ReleaseLogUtil.c("DEVMGR_DeviceBackupProvider", "singIn get device is null, waitTime: ", Integer.valueOf(i));
                    Thread.sleep(i);
                    i *= 2;
                    deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "cloneSignIn");
                } else {
                    ReleaseLogUtil.c("DEVMGR_DeviceBackupProvider", "singIn get device list success.");
                    break;
                }
            } catch (InterruptedException unused) {
                ReleaseLogUtil.c("DEVMGR_DeviceBackupProvider", "singIn InterruptedException.");
            }
        }
        if (this.d.equals(this.e)) {
            a(deviceList);
            return;
        }
        ReleaseLogUtil.c("DEVMGR_DeviceBackupProvider", "singIn account is not equals.");
        if (coq.d(deviceList)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (DeviceInfo deviceInfo : deviceList) {
            if (deviceInfo.getSupportAccountSwitch() == 1) {
                arrayList.add(deviceInfo.getDeviceIdentify());
            }
        }
        mkf.e(BaseApplication.getContext()).unPair(arrayList, false);
    }

    private void a(List<DeviceInfo> list) {
        SharedPreferenceManager.d(String.valueOf(10024), "cloneSceneForProcessReconnect", 0);
        mmu.e().a(true);
        mmu.e().b();
        c();
        c(list);
        for (DeviceInfo deviceInfo : list) {
            boolean zC = cqd.c(deviceInfo, 223);
            String relationship = deviceInfo.getRelationship();
            int deviceConnectState = deviceInfo.getDeviceConnectState();
            LogUtil.b("DeviceBackupProvider", "singIn deviceInfo.getRelationship: ", relationship, " deviceConnectStatus: ", Integer.valueOf(deviceConnectState), " deviceName:", deviceInfo.getDeviceName(), " isSupportConnectNewPhone: ", Boolean.valueOf(zC));
            if (zC && "main_relationship".equalsIgnoreCase(deviceInfo.getRelationship())) {
                ReleaseLogUtil.c("DEVMGR_DeviceBackupProvider", "singIn startAllReconnect.");
                cno.a().e(1);
                return;
            }
        }
    }

    private void c(List<DeviceInfo> list) {
        if (coq.d(list)) {
            ReleaseLogUtil.d("DEVMGR_DeviceBackupProvider", "handleSystemCloneRelationFail deviceInfo is empty.");
            return;
        }
        for (DeviceInfo deviceInfo : list) {
            if (TextUtils.isEmpty(deviceInfo.getRelationship())) {
                boolean zD = eel.d(deviceInfo.getProductType(), deviceInfo.getAutoDetectSwitchStatus());
                boolean zE = mxg.b().e(deviceInfo.getProductType(), deviceInfo.getDeviceIdentify());
                if (zD || zE) {
                    deviceInfo.setRelationship("followed_relationship");
                } else if (deviceInfo.getDeviceActiveState() == 1) {
                    ReleaseLogUtil.c("DEVMGR_DeviceBackupProvider", "singIn find main device.");
                    deviceInfo.setRelationship("main_relationship");
                } else if (deviceInfo.getDeviceActiveState() == 0 && mxg.b().a(deviceInfo)) {
                    deviceInfo.setRelationship("assistant_relationship");
                }
            }
        }
        mkl.d().c(list, "signSuccessEqualsUser");
    }

    private void c() {
        if (CommonUtil.bc()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.contentprovider.DeviceBackupProvider.3
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.b("DeviceBackupProvider", "PowerKitManager initDeviceInfo reconnectDevice request");
                    PowerKitManager.a().d("DeviceBackupProvider", 65535, 30000L, "user-reconnectDevice");
                    LogUtil.b("DeviceBackupProvider", "PowerKitManager signIn reconnectDevice request end");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        int i = this.f6278a + 1;
        this.f6278a = i;
        ReleaseLogUtil.c("DEVMGR_DeviceBackupProvider", "tryLogin mTryCount: ", Integer.valueOf(i));
        int i2 = this.f6278a;
        if (i2 > 6) {
            ReleaseLogUtil.d("DEVMGR_DeviceBackupProvider", "tryLogin reach max return, mTryCount: ", Integer.valueOf(i2));
        } else if (NetworkUtil.h()) {
            ReleaseLogUtil.c("DEVMGR_DeviceBackupProvider", "notifyCloneFinish have network again");
            f();
        } else {
            new Timer().schedule(new TimerTask() { // from class: com.huawei.health.contentprovider.DeviceBackupProvider.4
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    ReleaseLogUtil.c("DEVMGR_DeviceBackupProvider", "tryLogin start.");
                    DeviceBackupProvider.this.i();
                }
            }, 10000L);
        }
    }

    private Bundle h() {
        ReleaseLogUtil.c("DEVMGR_DeviceBackupProvider", "handleBackupComplete enter.");
        return null;
    }

    private Bundle d(Bundle bundle) {
        ReleaseLogUtil.c("DEVMGR_DeviceBackupProvider", "handleBackupRecoverStart start.");
        boolean z = bundle.getInt("version", 1) <= 1;
        ArrayList<String> arrayList = new ArrayList<>(16);
        arrayList.add("content://com.huawei.health.provider.DeviceBackupProvider/files/mmkv/keyvaldb_encrypt_udsdevice");
        arrayList.add("content://com.huawei.health.provider.DeviceBackupProvider/files/mmkv/keyvaldb_encrypt_udsdevice.crc");
        arrayList.add("content://com.huawei.health.provider.DeviceBackupProvider/files/mmkv/keyvaldb_unencrypt");
        arrayList.add("content://com.huawei.health.provider.DeviceBackupProvider/files/mmkv/keyvaldb_unencrypt.crc");
        arrayList.add("content://com.huawei.health.provider.DeviceBackupProvider/shared_prefs/relation.xml");
        arrayList.add("content://com.huawei.health.provider.DeviceBackupProvider/files/plugin.zip");
        arrayList.add("content://com.huawei.health.provider.DeviceBackupProvider/databases/notification.db");
        arrayList.add("content://com.huawei.health.provider.DeviceBackupProvider/databases/notification.db-journal");
        arrayList.add("content://com.huawei.health.provider.DeviceBackupProvider/files/mmkv/1000");
        arrayList.add("content://com.huawei.health.provider.DeviceBackupProvider/files/mmkv/1000.crc");
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("permit", z);
        bundle2.putStringArrayList("openfile_uri_list", arrayList);
        LogUtil.b("DeviceBackupProvider", "handleBackupRecoverStart result: ", bundle2);
        return bundle2;
    }

    private Bundle j() throws Throwable {
        ReleaseLogUtil.c("DEVMGR_DeviceBackupProvider", "handleBackupRecoverComplete enter.");
        pil.e(getContext().getFilesDir().getPath() + File.separator + "plugin.zip", edf.f32777a);
        mmx.b();
        mko.e(true, true);
        mkl.d();
        g();
        SharedPreferenceManager.d(String.valueOf(10024), "cloneSceneForProcessReconnect", 1);
        return null;
    }

    private void g() {
        LogUtil.b("DeviceBackupProvider", "initDeviceInfo");
        clw.d(true);
        clw.c();
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        String str2;
        boolean zCreateNewFile;
        LogUtil.b("DeviceBackupProvider", "openFile uri: ", uri.toString(), " mode: ", str, " lastPath: ", uri.getLastPathSegment());
        int iMatch = f6277b.match(uri);
        LogUtil.b("DeviceBackupProvider", "openFile code: ", Integer.valueOf(iMatch));
        switch (iMatch) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 9:
            case 10:
            case 11:
            case 12:
                str2 = getContext().getFilesDir().getPath() + File.separator + "mmkv" + File.separator + uri.getLastPathSegment();
                break;
            case 5:
                str2 = getContext().getDataDir().getPath() + File.separator + "shared_prefs" + File.separator + uri.getLastPathSegment();
                break;
            case 6:
                str2 = getContext().getFilesDir().getPath() + File.separator + uri.getLastPathSegment();
                break;
            case 7:
            case 8:
                str2 = getContext().getDataDir().getPath() + File.separator + "databases" + File.separator + uri.getLastPathSegment();
                break;
            default:
                str2 = "";
                break;
        }
        File file = new File(str2);
        int i = "r".equals(str) ? 268435456 : 536870912;
        if (i == 536870912 && !file.exists()) {
            try {
                zCreateNewFile = file.createNewFile();
            } catch (IOException e) {
                LogUtil.d("DeviceBackupProvider", "openFile createNewFile e: ", e.getMessage());
                zCreateNewFile = false;
            }
            LogUtil.b("DeviceBackupProvider", "openFile isSuccess: ", Boolean.valueOf(zCreateNewFile));
        }
        ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, i);
        LogUtil.b("DeviceBackupProvider", "openFile parcelFileDescriptor: ", parcelFileDescriptorOpen.toString());
        return parcelFileDescriptorOpen;
    }

    private void d() {
        int callingUid = Binder.getCallingUid();
        Context context = getContext();
        String readPermission = getReadPermission();
        int callingPid = Binder.getCallingPid();
        if (TextUtils.isEmpty(readPermission)) {
            return;
        }
        context.enforcePermission(readPermission, callingPid, callingUid, "Permission Denial: reading " + getClass().getName() + " from pid=" + Binder.getCallingPid() + ", uid=" + Binder.getCallingUid() + " requires " + readPermission);
    }
}
