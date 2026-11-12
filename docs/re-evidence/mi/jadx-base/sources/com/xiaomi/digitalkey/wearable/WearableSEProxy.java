package com.xiaomi.digitalkey.wearable;

import com.xiaomi.digitalkey.ccc.terminal.IDKFTerminal;
import com.xiaomi.digitalkey.wearable.utils.ByteUtils;
import com.xiaomi.digitalkey.wearable.utils.Logger;
import com.xiaomi.digitalkey.wearable.utils.ReflectUtil;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class WearableSEProxy {
    private static final boolean DEBUG = Logger.LOG_SE;
    private static final String LogTag = "SDK-DKF-WearableSEProxy:";
    private static WearableSEProxy sInstance;
    Object mDKFTerminalInstance = initDKFTerminal();
    private IDKFTerminal mTerminal;

    public class AppletNotFoundException extends Exception {
        public AppletNotFoundException(String str) {
            super(str);
        }
    }

    private void closeDKFTerminal() throws IOException {
        IDKFTerminal iDKFTerminal = this.mTerminal;
        if (iDKFTerminal == null) {
            throw new IOException();
        }
        try {
            iDKFTerminal.close();
        } catch (IOException | InterruptedException unused) {
            throw new IOException();
        }
    }

    public static WearableSEProxy getInstance() {
        if (sInstance == null) {
            synchronized (WearableSEProxy.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new WearableSEProxy();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    private Object initDKFTerminal() {
        return ReflectUtil.newInstance(ReflectUtil.getClassFromName("com.xiaomi.digitalkey.ccc.terminal.DKFTerminal"), (Class<?>[]) null, new Object[0]);
    }

    private void openDKFTerminal() throws IOException {
        Object obj = this.mDKFTerminalInstance;
        if (obj == null) {
            throw new IOException();
        }
        IDKFTerminal iDKFTerminal = (IDKFTerminal) obj;
        this.mTerminal = iDKFTerminal;
        try {
            iDKFTerminal.open();
        } catch (IOException | InterruptedException unused) {
            throw new IOException();
        }
    }

    private byte[] transmitDKFTerminal(byte[] bArr) throws IOException {
        IDKFTerminal iDKFTerminal = this.mTerminal;
        if (iDKFTerminal == null) {
            throw new IOException("mTerminal is null");
        }
        try {
            return iDKFTerminal.transmit(bArr);
        } catch (IOException | InterruptedException unused) {
            throw new IOException();
        }
    }

    public void close_se() throws IOException {
        closeDKFTerminal();
    }

    public void open_se() throws IOException {
        openDKFTerminal();
    }

    public byte[] select(byte[] bArr) throws AppletNotFoundException, IOException {
        byte[] bArrTransmit = transmit(bArr, true);
        if (bArrTransmit != null && !ByteUtils.equals(bArrTransmit, new byte[]{106, -126}) && !ByteUtils.equals(bArrTransmit, new byte[]{105, -123})) {
            return bArrTransmit;
        }
        throw new AppletNotFoundException(ByteUtils.toHexString(bArr) + "Not Found!");
    }

    public synchronized byte[] transmit(byte[] bArr, boolean z) throws IOException {
        byte[] bArrTransmitDKFTerminal;
        try {
            if (z) {
                if (DEBUG) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("select aid: ");
                    sb.append(ByteUtils.toHexString(bArr));
                }
                int length = bArr.length;
                byte[] bArr2 = new byte[length + 6];
                bArr2[0] = 0;
                bArr2[1] = -92;
                bArr2[2] = 4;
                bArr2[3] = 0;
                bArr2[4] = (byte) bArr.length;
                System.arraycopy(bArr, 0, bArr2, 5, bArr.length);
                bArr2[length + 5] = 0;
                bArrTransmitDKFTerminal = transmitDKFTerminal(bArr2);
            } else {
                if (DEBUG) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("transit apdu: ");
                    sb2.append(ByteUtils.toHexString(bArr));
                }
                bArrTransmitDKFTerminal = transmitDKFTerminal(bArr);
            }
        } catch (Throwable th) {
            throw th;
        }
        return bArrTransmitDKFTerminal;
    }
}
