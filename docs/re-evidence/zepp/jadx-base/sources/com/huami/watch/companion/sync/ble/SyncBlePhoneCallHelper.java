package com.huami.watch.companion.sync.ble;

import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.companion.sync.BaseSyncHelper;
import com.huami.watch.transport.ble.connection.BleConnection;
import com.huami.watch.util.Log;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertMode;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertModeExt;
import com.xiaomi.hm.health.bt.profile.slre.HMLFEvent;
import com.xiaomi.hm.health.bt.profile.slre.LfType;

/* JADX INFO: loaded from: classes16.dex */
public class SyncBlePhoneCallHelper extends BaseSyncHelper {
    private static final String g = "Sync-BLE-PhoneCall";
    private PhoneCallListener e;
    private BleConnection.DataListener f = new a();

    public interface PhoneCallListener {
        void onPhoneCallHangUp();

        void onPhoneCallIgnore();
    }

    public class a implements BleConnection.DataListener {
        public a() {
        }

        @Override // com.huami.watch.transport.ble.connection.BleConnection.DataListener
        public void onReceiveData(HMLFEvent hMLFEvent) {
            if (SyncBlePhoneCallHelper.this.e == null || hMLFEvent == null) {
                return;
            }
            int i = b.a[hMLFEvent.getLfType().ordinal()];
            if (i == 1) {
                Log.d(SyncBlePhoneCallHelper.g, "OnReceive EndCall!!", new Object[0]);
                SyncBlePhoneCallHelper.this.e.onPhoneCallHangUp();
            } else {
                if (i != 2) {
                    return;
                }
                Log.d(SyncBlePhoneCallHelper.g, "OnReceive Ignore!!", new Object[0]);
                SyncBlePhoneCallHelper.this.e.onPhoneCallIgnore();
            }
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LfType.values().length];
            a = iArr;
            try {
                iArr[LfType.END_CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[LfType.IGNORE_CALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static SyncBlePhoneCallHelper getHelper() {
        return (SyncBlePhoneCallHelper) BaseSyncHelper.getHelper(null, null, SyncBlePhoneCallHelper.class);
    }

    public static void sendPhoneCall(String str) {
        Log.d(g, "Send PhoneCall...", new Object[0]);
        SyncBleUtil.c(new HMAlertModeExt(HMAlertMode.ALERT_INCALL, str));
    }

    public static void sendPhoneCallEnd() {
        Log.d(g, "Send PhoneCall End...", new Object[0]);
        SyncBleUtil.c(new HMAlertModeExt(HMAlertMode.ALERT_INCALL, (String) null, (byte) 0));
    }

    public SyncBlePhoneCallHelper listener(PhoneCallListener phoneCallListener) {
        this.e = phoneCallListener;
        CompanionApplication.get().mBleConnection.addDataListener(this.f);
        return this;
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public boolean onStart() {
        return false;
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public void release() {
        super.release();
        this.e = null;
        CompanionApplication.get().mBleConnection.removeDataListener(this.f);
    }
}
