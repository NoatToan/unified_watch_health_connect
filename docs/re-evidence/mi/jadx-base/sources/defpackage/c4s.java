package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.miui.tsmclient.util.CardEnvironmentConfig;
import com.miui.tsmclient.util.IDeviceInfo;
import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.exception.NfcEeIOException;
import com.tsmclient.smartcard.terminal.APDUConstants;
import com.tsmclient.smartcard.terminal.BaseTerminal;
import com.tsmclient.smartcard.terminal.TerminalType;
import com.tsmclient.smartcard.terminal.external.IApduExecutor;
import com.tsmclient.smartcard.terminal.external.IChannel;
import com.tsmclient.smartcard.terminal.response.ScResponse;
import com.tsmclient.smartcard.util.ILogger;
import com.tsmclient.smartcard.util.LogUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class c4s extends BaseTerminal {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static IChannel f4930b;
    public static IChannel c;
    public static IApduExecutor d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IChannel f4931a;

    public c4s(Context context, String str) {
        super(context);
        this.mTerminalCategory = str;
        this.mTerminalType = TerminalType.PERIPHERAL;
    }

    public static void b(IApduExecutor iApduExecutor) {
        d = iApduExecutor;
    }

    public static void c(IChannel iChannel) {
        f4930b = iChannel;
    }

    public static void d(ILogger iLogger) {
        LogUtils.setLogger(iLogger);
    }

    public static void f(IChannel iChannel) {
        c = iChannel;
    }

    public final IChannel a() throws IOException {
        Object objNewInstance;
        if (TextUtils.isEmpty(this.mTerminalCategory)) {
            return null;
        }
        try {
            objNewInstance = Class.forName(this.mTerminalCategory + ".mitsmsdk.ChannelImpl").getConstructor(Context.class).newInstance(this.mContext.getApplicationContext());
        } catch (Exception unused) {
            objNewInstance = null;
        }
        if (objNewInstance instanceof IChannel) {
            return (IChannel) objNewInstance;
        }
        return null;
    }

    @Override // com.tsmclient.smartcard.terminal.IScTerminal
    public void checkNfcEEStatus() throws InterruptedException, IOException {
        try {
            open();
            if (ByteArray.equals(transmit(APDUConstants.SELECT_CRS).getStatus(), ScResponse.STATUS_SE_RESTRICT)) {
                throw new NfcEeIOException("nfc ee has been restricted", 5);
            }
            close();
        } catch (Throwable th) {
            close();
            throw th;
        }
    }

    public IApduExecutor e() {
        return d;
    }

    public IChannel g() {
        return this.f4931a;
    }

    @Override // com.tsmclient.smartcard.terminal.BaseTerminal
    public String getPrefKey(String str) {
        IDeviceInfo deviceInfo = CardEnvironmentConfig.getDeviceInfo();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(deviceInfo == null ? "" : deviceInfo.getDeviceId(this.mContext));
        return sb.toString();
    }

    @Override // com.tsmclient.smartcard.terminal.IScTerminal
    public String getSignedSpiPK() throws InterruptedException, IOException {
        throw new RuntimeException("getSignedSpiPK is not supported.");
    }

    @Override // com.tsmclient.smartcard.terminal.BaseTerminal
    public void internalClose() {
        IChannel iChannel = this.f4931a;
        if (iChannel != null) {
            try {
                iChannel.close();
            } catch (IOException unused) {
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
            }
            this.f4931a = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    /* JADX WARN: Code duplicated, block: B:25:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.tsmclient.smartcard.terminal.BaseTerminal
    public void internalConnect() throws InterruptedException, IOException {
        IChannel iChannelA;
        IChannel iChannel;
        if (this.f4931a != null) {
            throw new NfcEeIOException("nfc ee is open, close it first", 3);
        }
        if (this.mContext == null) {
            throw new IOException("context is null!");
        }
        if (!this.mTerminalCategory.endsWith(".customChannel")) {
            IChannel iChannel2 = f4930b;
            this.f4931a = iChannel2;
            if (iChannel2 == null) {
                iChannelA = a();
            }
            iChannel = this.f4931a;
            if (iChannel != null) {
                throw new NfcEeIOException("nfc is unavailable on this device", 1);
            }
            try {
                iChannel.open();
            } catch (IOException unused) {
                throw new NfcEeIOException("nfc was dead or nfc ee occurred an unknown error", 4);
            }
        }
        iChannelA = c;
        this.f4931a = iChannelA;
        iChannel = this.f4931a;
        if (iChannel != null) {
            throw new NfcEeIOException("nfc is unavailable on this device", 1);
        }
        iChannel.open();
    }

    @Override // com.tsmclient.smartcard.terminal.BaseTerminal
    public synchronized byte[] internalTransmit(byte[] bArr) throws InterruptedException, IOException {
        try {
            if (isInterruptible()) {
                Thread.sleep(1L);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f4931a.transceive(bArr);
    }
}
