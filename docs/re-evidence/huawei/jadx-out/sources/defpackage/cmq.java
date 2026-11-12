package defpackage;

import android.text.TextUtils;
import health.compact.a.LogUtil;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes23.dex */
public class cmq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static cmq f1793b;
    private static final Object e = new Object();

    public static cmq e() {
        cmq cmqVar;
        synchronized (e) {
            if (f1793b == null) {
                f1793b = new cmq();
            }
            cmqVar = f1793b;
        }
        return cmqVar;
    }

    public cme a(byte[] bArr) {
        LogUtil.b("ParseDeviceLocalName", "enter parseBroadcastData");
        if (bArr == null) {
            return new cme(null, 0);
        }
        return e(bArr);
    }

    private cme e(byte[] bArr) {
        byte b2;
        String str = null;
        if (bArr == null) {
            return null;
        }
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
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
                            LogUtil.e("ParseDeviceLocalName", "parseBroadcastData BufferUnderflowException");
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
        return new cme(str, i);
    }
}
