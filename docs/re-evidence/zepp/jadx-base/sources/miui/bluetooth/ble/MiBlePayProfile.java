package miui.bluetooth.ble;

import android.content.Context;
import android.os.RemoteException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes23.dex */
public class MiBlePayProfile extends MiBleProfile {

    public interface OnRSSIChangedListerner {
        void onRssi(int i);
    }

    public class a implements MiBleProfile.IPropertyNotifyCallback {
        public final /* synthetic */ OnRSSIChangedListerner a;

        public a(OnRSSIChangedListerner onRSSIChangedListerner) {
            this.a = onRSSIChangedListerner;
        }

        @Override // miui.bluetooth.ble.MiBleProfile.IPropertyNotifyCallback
        public void notifyProperty(int i, byte[] bArr) {
            if (i == 4 && bArr != null && bArr.length == 4) {
                this.a.onRssi(ByteBuffer.wrap(bArr).getInt());
            }
        }
    }

    public MiBlePayProfile(Context context, String str, MiBleProfile.IProfileStateChangeCallback iProfileStateChangeCallback) {
        super(context, str, iProfileStateChangeCallback);
    }

    public byte[] encrypt(byte[] bArr) {
        if (!isReady()) {
            return null;
        }
        try {
            return this.mService.encrypt(this.mDevice, this.mClientId, bArr);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void registerRssiChangedListener(OnRSSIChangedListerner onRSSIChangedListerner) {
        if (onRSSIChangedListerner == null) {
            return;
        }
        registerPropertyNotifyCallback(4, new a(onRSSIChangedListerner));
    }

    public boolean setEncryptionKey(byte[] bArr) {
        if (!isReady()) {
            return false;
        }
        try {
            return this.mService.setEncryptionKey(this.mDevice, this.mClientId, bArr);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void unregisterRssiChangedListener() {
        unregisterPropertyNotifyCallback(4);
    }
}
