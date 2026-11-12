package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.manager.powerkit.PowerKitManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class mal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f41260a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static mal f41261c = new mal();

    private mal() {
    }

    public static mal b() {
        mal malVar;
        synchronized (f41260a) {
            if (f41261c == null) {
                f41261c = new mal();
            }
            malVar = f41261c;
        }
        return malVar;
    }

    public static void a(final Context context, final boolean z) {
        LogUtil.a("SyncHwMusicAccountUtils", "getHwMusicAccountSendToWear enter:");
        if (context == null) {
            ReleaseLogUtil.e("R_SyncHwMusicAccountUtils", "getHwMusicAccountSendToWear context is null");
            return;
        }
        DeviceInfo deviceInfoD = mgg.d("SyncHwMusicAccountUtils");
        if (deviceInfoD == null) {
            ReleaseLogUtil.e("R_SyncHwMusicAccountUtils", "getHwMusicAccountSendToWear, deviceInfo is null.");
            return;
        }
        if (!d(deviceInfoD)) {
            ReleaseLogUtil.e("R_SyncHwMusicAccountUtils", "getHwMusicAccountSendToWear, not support.");
            return;
        }
        DeviceCapability deviceCapabilityA = eej.a(deviceInfoD.getDeviceIdentify());
        if (deviceCapabilityA == null || !deviceCapabilityA.isSupportMusicInfoList()) {
            ReleaseLogUtil.e("R_SyncHwMusicAccountUtils", "getHwMusicAccountSendToWear, isn't Support Music.");
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: map
            @Override // java.lang.Runnable
            public final void run() {
                mal.c();
            }
        });
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        ThreadPoolManager.c().execute(new Runnable() { // from class: mat
            @Override // java.lang.Runnable
            public final void run() {
                mal.a(context, countDownLatch, z);
            }
        });
        try {
            LogUtil.a("SyncHwMusicAccountUtils", "getHwMusicAccountSendToWear isOnTime:", Boolean.valueOf(countDownLatch.await(3L, TimeUnit.SECONDS)));
        } catch (InterruptedException unused) {
            LogUtil.j("SyncHwMusicAccountUtils", "getHwMusicAccountSendToWear InterruptedException");
        }
    }

    static /* synthetic */ void c() {
        c("com.huawei.music");
        c("com.android.mediacenter");
    }

    static /* synthetic */ void a(Context context, CountDownLatch countDownLatch, boolean z) {
        ContentResolver contentResolver = context.getContentResolver();
        ContentProviderClient contentProviderClient = null;
        try {
            if (contentResolver == null) {
                ReleaseLogUtil.e("R_SyncHwMusicAccountUtils", "getHwMusicAccountSendToWear: resolver is null");
                return;
            }
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(Uri.parse("content://com.android.mediacenter.healthprovider/InfoForWatch"));
            countDownLatch.countDown();
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                ReleaseLogUtil.e("R_SyncHwMusicAccountUtils", "getHwMusicAccountSendToWear, client is null.");
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                    return;
                }
                return;
            }
            a(context, z, contentResolver);
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                contentProviderClientAcquireUnstableContentProviderClient.close();
            }
        } catch (RuntimeException unused) {
            LogUtil.e("SyncHwMusicAccountUtils", "getHwMusicAccountSendToWear DeadObjectException");
        } finally {
            if (0 != 0) {
                contentProviderClient.close();
            }
        }
    }

    private static boolean d(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return false;
        }
        int powerSaveModel = deviceInfo.getPowerSaveModel();
        boolean z = deviceInfo.getSportVersion() == 1 && deviceInfo.getSingleFrameDevice() == 1;
        boolean z2 = powerSaveModel == 1;
        LogUtil.a("SyncHwMusicAccountUtils", "SportVersion:", Integer.valueOf(deviceInfo.getSportVersion()), ",SingleFrameDevice:", Integer.valueOf(deviceInfo.getSingleFrameDevice()), " ,isPowerSaveModel:", Boolean.valueOf(z2));
        return !z || z2;
    }

    private static void a(Context context, boolean z, ContentResolver contentResolver) {
        Bundle bundleCall = contentResolver.call(Uri.parse("content://com.android.mediacenter.healthprovider/InfoForWatch"), "getVIPInfo", (String) null, (Bundle) null);
        if (bundleCall != null && !bundleCall.isEmpty()) {
            b(context, bundleCall);
        } else {
            ReleaseLogUtil.e("R_SyncHwMusicAccountUtils", "getHwMusicAccountSendToWear: bundle is null");
        }
        if (!z) {
            LogUtil.a("SyncHwMusicAccountUtils", "getHwMusicAccountSendToWear: hasGetHistroy is false.");
        } else if (contentResolver.call(Uri.parse("content://com.android.mediacenter.healthprovider/InfoForWatch"), "recentlyPlayChanged", (String) null, (Bundle) null) != null) {
            lzq.d(false);
            LogUtil.a("SyncHwMusicAccountUtils", "notify music app get history record success.");
        }
    }

    private static void c(String str) {
        LogUtil.a("SyncHwMusicAccountUtils", "applyForMusicResource enter. musicPackageName: ", str);
        PowerKitManager.a().a(str, 100, "user-getHwMusicAccountSendToWear");
        PowerKitManager.a().b(str, 100, "user-getHwMusicAccountSendToWear");
    }

    private static void b(Context context, Bundle bundle) {
        LogUtil.a("SyncHwMusicAccountUtils", " getHwMusicAccountSendToWear dealAccountInfoAction enter");
        String string = bundle.getString(JsbMapKeyNames.H5_USER_ID);
        String string2 = bundle.getString("validPeriod");
        String string3 = bundle.getString("musicAppType");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
            ReleaseLogUtil.e("R_SyncHwMusicAccountUtils", " dealAccountInfoAction bundle value is invaliad!");
            return;
        }
        try {
            int i = Integer.parseInt(string2);
            int i2 = Integer.parseInt(string3);
            mak makVar = new mak();
            makVar.e(i2);
            makVar.a(i);
            makVar.e(string);
            List<DeviceInfo> listE = mgg.e("SyncHwMusicAccountUtils");
            if (listE == null || listE.size() == 0) {
                ReleaseLogUtil.e("R_SyncHwMusicAccountUtils", "getHwMusicAccountSendToWear has no ConnectDevices");
                return;
            }
            Iterator<DeviceInfo> it = listE.iterator();
            while (it.hasNext()) {
                DeviceCapability deviceCapabilityA = eej.a(it.next().getDeviceIdentify());
                if (deviceCapabilityA != null && deviceCapabilityA.isSupportMusicInfoList()) {
                    lzq.b(makVar);
                    ReleaseLogUtil.d("R_SyncHwMusicAccountUtils", "getHwMusicAccountSendToWear when succeed");
                }
            }
        } catch (NumberFormatException unused) {
            LogUtil.e("SyncHwMusicAccountUtils", "getHwMusicAccountSendToWear NumberFormatException");
        }
    }

    public static void a(Context context) {
        List<DeviceInfo> listE = mgg.e("SyncHwMusicAccountUtils");
        if (listE == null || listE.size() == 0) {
            LogUtil.j("SyncHwMusicAccountUtils", "notifyHistoryRecord no connect device.");
            return;
        }
        Iterator<DeviceInfo> it = listE.iterator();
        while (it.hasNext()) {
            DeviceCapability deviceCapabilityA = eej.a(it.next().getDeviceIdentify());
            if (deviceCapabilityA != null && deviceCapabilityA.isSupportMusicInfoList()) {
                c(context);
                LogUtil.a("SyncHwMusicAccountUtils", "notifyHistoryRecord when succeed");
            }
        }
    }

    private static void c(Context context) throws Throwable {
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        LogUtil.a("SyncHwMusicAccountUtils", "notifyMusicApp enter.");
        c("com.huawei.music");
        c("com.android.mediacenter");
        ContentProviderClient contentProviderClient = null;
        ContentResolver contentResolver = context != null ? context.getContentResolver() : null;
        try {
            try {
                if (contentResolver != null) {
                    contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(Uri.parse("content://com.android.mediacenter.healthprovider/InfoForWatch"));
                    try {
                        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                            LogUtil.j("SyncHwMusicAccountUtils", "notifyMusicApp, client is null.");
                            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                contentProviderClientAcquireUnstableContentProviderClient.close();
                                return;
                            }
                            return;
                        }
                        if (contentResolver.call(Uri.parse("content://com.android.mediacenter.healthprovider/InfoForWatch"), "recentlyPlayChanged", (String) null, (Bundle) null) != null) {
                            LogUtil.a("SyncHwMusicAccountUtils", "notifyMusicApp success.");
                        }
                        contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                    } catch (RuntimeException unused) {
                        contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                        LogUtil.e("SyncHwMusicAccountUtils", "notifyMusicApp DeadObjectException");
                        if (contentProviderClient != null) {
                            contentProviderClient.close();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                        }
                        throw th;
                    }
                } else {
                    LogUtil.j("SyncHwMusicAccountUtils", "notifyMusicApp: resolver is null");
                }
                if (contentProviderClient != null) {
                    contentProviderClient.close();
                }
            } catch (RuntimeException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
            contentProviderClientAcquireUnstableContentProviderClient = contentProviderClient;
        }
    }
}
