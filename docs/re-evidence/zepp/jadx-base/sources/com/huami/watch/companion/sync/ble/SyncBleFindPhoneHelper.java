package com.huami.watch.companion.sync.ble;

import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.companion.findphone.AskAndAnswer;
import com.huami.watch.companion.sync.BaseSyncHelper;
import com.huami.watch.transport.ble.connection.BleConnection;
import com.huami.watch.util.Log;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.smartwatch.HMSmartWatchDevice;
import com.xiaomi.hm.health.bt.profile.slre.HMLFEvent;
import com.xiaomi.hm.health.bt.profile.slre.LfType;

/* JADX INFO: loaded from: classes16.dex */
public class SyncBleFindPhoneHelper extends BaseSyncHelper {
    private static final String f = "Sync-BLE-Notification";
    private BleConnection.DataListener e = new BleConnection.DataListener() { // from class: dj7
        @Override // com.huami.watch.transport.ble.connection.BleConnection.DataListener
        public final void onReceiveData(HMLFEvent hMLFEvent) {
            this.a.b(hMLFEvent);
        }
    };

    public class a extends HMCallback {
        public a() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            Log.d(SyncBleFindPhoneHelper.f, "Sync Found Phone To Watch, Success: " + z, new Object[0]);
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LfType.values().length];
            a = iArr;
            try {
                iArr[LfType.FIND_PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[LfType.STOP_FIND_PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(HMLFEvent hMLFEvent) {
        if (hMLFEvent != null) {
            int i = b.a[hMLFEvent.getLfType().ordinal()];
            if (i == 1) {
                c();
            } else {
                if (i != 2) {
                    return;
                }
                Log.d(f, "On FindPhone Stop Event Received!!", new Object[0]);
            }
        }
    }

    private void c() {
        Log.d(f, "On FindPhone Event Received!!", new Object[0]);
        AskAndAnswer.onFindPhoneBLEReceived();
        HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
        if (hMSmartWatchDevice != null) {
            hMSmartWatchDevice.findPhoneConfirm(new a());
        }
    }

    public static SyncBleFindPhoneHelper getHelper() {
        return (SyncBleFindPhoneHelper) BaseSyncHelper.getHelper(null, null, SyncBleFindPhoneHelper.class);
    }

    public void init() {
        Log.d(f, "Init BLE FindPhoneHelper...", new Object[0]);
        CompanionApplication.get().mBleConnection.addDataListener(this.e);
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public void onRelease() {
        super.onRelease();
        CompanionApplication.get().mBleConnection.removeDataListener(this.e);
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public boolean onStart() {
        return false;
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public String tag() {
        return f;
    }
}
