package miui.bluetooth.ble;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes23.dex */
public class MiBleUnlockProfile extends MiBleProfile {

    public interface OnUnlockStateChangeListener {
        public static final byte STATE_AUTHORISED = 1;
        public static final byte STATE_LOCKED = 0;
        public static final byte STATE_UNLOCKED = 2;

        void onUnlocked(byte b);
    }

    public class a implements MiBleProfile.IPropertyNotifyCallback {
        public final /* synthetic */ OnUnlockStateChangeListener a;

        public a(OnUnlockStateChangeListener onUnlockStateChangeListener) {
            this.a = onUnlockStateChangeListener;
        }

        @Override // miui.bluetooth.ble.MiBleProfile.IPropertyNotifyCallback
        public void notifyProperty(int i, byte[] bArr) {
            if (i == 1) {
                this.a.onUnlocked(bArr != null ? bArr[0] : (byte) 0);
            }
        }
    }

    public MiBleUnlockProfile(Context context, String str, MiBleProfile.IProfileStateChangeCallback iProfileStateChangeCallback) {
        super(context, str, iProfileStateChangeCallback);
    }

    public void registerUnlockListener(OnUnlockStateChangeListener onUnlockStateChangeListener) {
        if (onUnlockStateChangeListener == null) {
            return;
        }
        registerPropertyNotifyCallback(1, new a(onUnlockStateChangeListener));
    }

    public boolean setLock(String str) {
        if (!isReady()) {
            return false;
        }
        try {
            return this.mService.authorize(this.mDevice, this.mClientId, str);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean setRssiThreshold(int i) {
        if (!isReady()) {
            return false;
        }
        try {
            return this.mService.setRssiThreshold(this.mDevice, this.mClientId, i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean unlock() {
        if (!isReady()) {
            return false;
        }
        try {
            return this.mService.authenticate(this.mDevice, this.mClientId);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void unregisterUnlockListener() {
        unregisterPropertyNotifyCallback(1);
    }
}
