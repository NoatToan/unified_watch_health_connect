package com.huami.watch.companion.sync.ble;

import android.content.Context;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.companion.sync.BaseSyncHelper;
import com.huami.watch.companion.usersettings.UserSettings;
import com.huami.watch.companion.usersettings.UserSettingsKeys;
import com.huami.watch.notification.data.MiPushSupport;
import com.huami.watch.notification.data.NotificationData;
import com.huami.watch.notification.data.NotificationKeyData;
import com.huami.watch.notification.data.StatusBarNotificationData;
import com.huami.watch.transport.ble.connection.BleConnection;
import com.huami.watch.util.Log;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.smartwatch.HMSmartWatchDevice;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertApp;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertModeExt;
import com.xiaomi.hm.health.bt.profile.amc.HMMusicControl;
import com.xiaomi.hm.health.bt.profile.slre.HMLFEvent;
import com.xiaomi.hm.health.bt.profile.slre.LfType;

/* JADX INFO: loaded from: classes16.dex */
public class SyncBleNotificationHelper extends BaseSyncHelper {
    private static final String i = "Sync-BLE-Notification";
    private NotificationListener f;
    private HMMusicControl h;
    private final SparseArray<NotificationKeyData> e = new SparseArray<>();
    private BleConnection.DataListener g = new a();

    public interface NotificationListener {
        void onMusicControlReceived(byte b);

        void onNotificationBlocked(String str);

        void onNotificationRemoved(NotificationKeyData notificationKeyData);
    }

    public class a implements BleConnection.DataListener {
        public a() {
        }

        @Override // com.huami.watch.transport.ble.connection.BleConnection.DataListener
        public void onReceiveData(HMLFEvent hMLFEvent) {
            byte[] extra;
            NotificationKeyData notificationKeyDataE;
            if (SyncBleNotificationHelper.this.f == null || hMLFEvent == null || (extra = hMLFEvent.getExtra()) == null || extra.length <= 0) {
                return;
            }
            int i = d.a[hMLFEvent.getLfType().ordinal()];
            if (i == 1) {
                int i2 = extra[0] & 255;
                synchronized (SyncBleNotificationHelper.this.e) {
                    notificationKeyDataE = SyncBleNotificationHelper.this.e(i2);
                    SyncBleNotificationHelper.this.e.remove(i2);
                }
                if (notificationKeyDataE != null) {
                    SyncBleNotificationHelper.this.f.onNotificationRemoved(notificationKeyDataE);
                    return;
                }
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                SyncBleNotificationHelper.this.f.onMusicControlReceived(extra[0]);
                return;
            }
            String str = null;
            try {
                str = new String(extra);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (str == null || str.length() <= 1 || !str.endsWith("\u0000")) {
                return;
            }
            String strTrim = str.substring(0, str.length() - 1).trim();
            if (strTrim.length() > 0) {
                SyncBleNotificationHelper.this.f.onNotificationBlocked(strTrim);
            }
        }
    }

    public class b extends HMCallback {
        public b() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            Log.d(SyncBleNotificationHelper.i, "Send MusicControl State, Success: " + z, new Object[0]);
        }
    }

    public class c extends HMCallback {
        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            Log.d(SyncBleNotificationHelper.i, "Send MusicControl Enable, Success: " + z, new Object[0]);
        }
    }

    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LfType.values().length];
            a = iArr;
            try {
                iArr[LfType.DELETE_MSG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[LfType.NOTIFICATION_BLOCK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[LfType.MUSIC_CONTROL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private int d(@NonNull NotificationKeyData notificationKeyData) {
        int i2 = 0;
        while (true) {
            if (i2 >= this.e.size()) {
                i2 = -1;
                break;
            }
            if (notificationKeyData.equals(this.e.valueAt(i2))) {
                break;
            }
            i2++;
        }
        if (i2 <= -1 || i2 >= this.e.size()) {
            return -1;
        }
        int iKeyAt = this.e.keyAt(i2);
        Log.d(i, "Find Same Key [" + notificationKeyData + "], Id: " + iKeyAt, new Object[0]);
        return iKeyAt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public NotificationKeyData e(int i2) {
        int iIndexOfKey = this.e.indexOfKey(i2);
        if (iIndexOfKey > -1) {
            return this.e.valueAt(iIndexOfKey);
        }
        return null;
    }

    private static void f(int i2) {
        Log.d(i, "Sync Notification Remove To Watch, [Id: " + i2 + "]", new Object[0]);
        SyncBleUtil.c(new HMAlertModeExt(i2, (byte) 2));
    }

    private static void g(Context context, int i2, StatusBarNotificationData statusBarNotificationData, boolean z) {
        Log.d(i, "Sync Notification To Watch, [Id: " + i2 + ", Key: " + statusBarNotificationData.key + ", IsUpdate: " + z + "]", new Object[0]);
        HMAlertApp hMAlertApp = HMAlertApp.GENERIC;
        NotificationData notificationData = statusBarNotificationData.notification;
        HMAlertModeExt hMAlertModeExt = new HMAlertModeExt(hMAlertApp, notificationData.title, notificationData.text);
        hMAlertModeExt.setAppName(MiPushSupport.isFromMiPush(statusBarNotificationData.pkg) ? statusBarNotificationData.targetPkg : statusBarNotificationData.pkg);
        hMAlertModeExt.setId(i2);
        SyncBleUtil.c(hMAlertModeExt);
    }

    public static SyncBleNotificationHelper getHelper() {
        return (SyncBleNotificationHelper) BaseSyncHelper.getHelper(null, null, SyncBleNotificationHelper.class);
    }

    public static void sendEnableMusicControl(boolean z) {
        Log.d(i, "Send MusicControl Enable[" + z + "]...", new Object[0]);
        HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
        if (hMSmartWatchDevice != null) {
            hMSmartWatchDevice.enableMusicControl(z, new c());
        }
    }

    public SyncBleNotificationHelper listener(NotificationListener notificationListener) {
        this.f = notificationListener;
        CompanionApplication.get().mBleConnection.addDataListener(this.g);
        return this;
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public void onRelease() {
        super.onRelease();
        this.f = null;
        CompanionApplication.get().mBleConnection.removeDataListener(this.g);
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public boolean onStart() {
        return false;
    }

    public void syncMusicControlStateToWatch(@NonNull HMMusicControl hMMusicControl) {
        Log.d(i, "Send MusicControl State[" + hMMusicControl + "]...", new Object[0]);
        HMMusicControl hMMusicControl2 = this.h;
        if (hMMusicControl2 != null && hMMusicControl2.toString().equals(hMMusicControl.toString())) {
            if (this.h.getVolume() == hMMusicControl.getVolume()) {
                Log.d(i, "MusicControl Info Duplicated, Abort!!", new Object[0]);
                return;
            }
            hMMusicControl.setOnlyVolume(true);
        }
        this.h = hMMusicControl;
        HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
        if (hMSmartWatchDevice != null) {
            hMSmartWatchDevice.sendMusicControl(hMMusicControl, new b());
        }
    }

    public void syncNotificationRemoveToWatch(@NonNull StatusBarNotificationData statusBarNotificationData) {
        int iD;
        synchronized (this.e) {
            iD = this.e.size() > 0 ? d(NotificationKeyData.from(statusBarNotificationData)) : -1;
        }
        if (iD > -1) {
            this.e.remove(iD);
            f(iD);
        }
    }

    public void syncNotificationToWatch(@NonNull Context context, @NonNull StatusBarNotificationData statusBarNotificationData) {
        int iKeyAt;
        boolean z;
        synchronized (this.e) {
            NotificationKeyData notificationKeyDataFrom = NotificationKeyData.from(statusBarNotificationData);
            iKeyAt = 1;
            z = false;
            if (this.e.size() > 0) {
                int iD = d(notificationKeyDataFrom);
                if (iD > -1) {
                    iKeyAt = iD;
                    z = true;
                } else {
                    SparseArray<NotificationKeyData> sparseArray = this.e;
                    iKeyAt = 1 + sparseArray.keyAt(sparseArray.size() - 1);
                }
            }
            this.e.put(iKeyAt, notificationKeyDataFrom);
        }
        g(context, iKeyAt, statusBarNotificationData, z);
    }

    public static void sendEnableMusicControl(@NonNull Context context) {
        sendEnableMusicControl(UserSettings.getBoolean(context.getContentResolver(), UserSettingsKeys.KEY_WATCH_MUSIC_CONTROLLER, false));
    }
}
