package defpackage;

import android.text.TextUtils;
import health.compact.a.LogUtil;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes10.dex */
public class lnk {
    private static final Object d = new Object();
    private static lnk e;

    public static lnk d() {
        lnk lnkVar;
        synchronized (d) {
            if (e == null) {
                e = new lnk();
            }
            lnkVar = e;
        }
        return lnkVar;
    }

    public lmv d(byte[] bArr) {
        LogUtil.b("ParseDeviceLocalName", "enter parseBroadcastData");
        if (bArr == null) {
            return new lmv(null, 0);
        }
        return c(bArr);
    }

    private lmv c(byte[] bArr) {
        byte b2;
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        String str = null;
        int i = 0;
        while (byteBufferOrder.remaining() > 2 && (b2 = byteBufferOrder.get()) > 0) {
            byte b3 = byteBufferOrder.get();
            if (b3 != 1) {
                if (b3 != 9) {
                    int iPosition = (byteBufferOrder.position() + b2) - 1;
                    if (iPosition <= byteBufferOrder.limit() && iPosition >= 0) {
                        byteBufferOrder.position(iPosition);
                    }
                } else {
                    int i2 = b2 - 1;
                    if (i2 > 0) {
                        byte[] bArr2 = new byte[i2];
                        if (i2 > byteBufferOrder.remaining()) {
                            LogUtil.d("ParseDeviceLocalName", "parseBroadcastData BufferUnderflowException");
                        } else {
                            byteBufferOrder.get(bArr2);
                            try {
                                str = new String(bArr2, "utf-8");
                            } catch (UnsupportedEncodingException unused) {
                                LogUtil.d("ParseDeviceLocalName", "parseBroadcastData UnsupportedEncodingException");
                            }
                        }
                    }
                }
            } else if ((byteBufferOrder.get() & 4) == 0) {
                i = 3;
            }
            if (!TextUtils.isEmpty(str)) {
                break;
            }
        }
        return new lmv(str, i);
    }
}
