package com.huawei.hms.scankit.p;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.text.TextUtils;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.ml.scan.HmsScanBase;
import com.huawei.hms.ml.scan.HmsScanResult;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
public class r6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile r6 f16304a;

    public static s6 c() {
        return new s6("", null, new u6[]{new u6(-2.0f, -2.0f), new u6(-2.0f, -2.0f), new u6(-2.0f, -2.0f), new u6(-2.0f, -2.0f)}, BarcodeFormat.NONE);
    }

    public HmsScan[] b(Bitmap bitmap, int i, boolean z, w3 w3Var) {
        w3.c cVarA;
        if (w3Var != null) {
            w3Var.a("single");
            cVarA = w3Var.a(z, bitmap.getHeight() * bitmap.getWidth());
            if (bitmap.getHeight() < 30 || bitmap.getWidth() < 30) {
                cVarA.a(-1005);
            }
        } else {
            cVarA = null;
        }
        s6[] s6VarArrB = n1.b(bitmap, new x6(i, z));
        o4.d("Scankit", "start totalParseResult");
        HmsScan[] hmsScanArrA = y6.a(s6VarArrB);
        if (w3Var != null) {
            w3Var.a(hmsScanArrA, cVarA);
        }
        return hmsScanArrA;
    }

    public static HmsScan b() {
        return new HmsScan("", HmsScanBase.FORMAT_UNKNOWN, "", HmsScan.PURE_TEXT_FORM, null, new Point[]{new Point(-2, -2), new Point(-2, -2), new Point(-2, -2), new Point(-2, -2)}, null, null).setZoomValue(1.0d);
    }

    public HmsScan[] a(Bitmap bitmap, int i, boolean z, w3 w3Var) {
        w3.c cVarA;
        o4.d("Scankit", "start decodeWithBitmapWorkMulti");
        if (w3Var != null) {
            w3Var.a("multi");
            cVarA = w3Var.a(z, bitmap.getHeight() * bitmap.getWidth());
            if (bitmap.getHeight() < 30 || bitmap.getWidth() < 30) {
                cVarA.a(-1005);
            }
        } else {
            cVarA = null;
        }
        o4.d("Scankit", "end decodeWithBitmapWorkMulti");
        s6[] s6VarArrA = n1.a(bitmap, new x6(i, z));
        o4.d("Scankit", "start totalParseResult");
        HmsScan[] hmsScanArrA = y6.a(s6VarArrA);
        o4.d("Scankit", "end totalParseResult");
        if (w3Var != null) {
            w3Var.a(hmsScanArrA, cVarA);
        }
        return hmsScanArrA;
    }

    public HmsScanResult a(byte[] bArr, int i, int i2, int i3, boolean z, boolean z2, w3 w3Var) {
        w3.c cVarA;
        if (w3Var != null) {
            w3Var.a("single");
            cVarA = w3Var.a(z, i2 * i);
            if (i2 < 30 || i < 30) {
                cVarA.a(-1005);
            }
        } else {
            cVarA = null;
        }
        w3.c cVar = cVarA;
        o4.d("Scankit", "start decodeSingleCode");
        s6[] s6VarArrC = n1.c(bArr, new x6(i, i2, i3, true, z));
        o4.d("Scankit", "start totalParseResult");
        HmsScan[] hmsScanArrA = y6.a(s6VarArrC);
        o4.d("Scankit", "end totalParseResult");
        if (w3Var != null) {
            w3Var.a(hmsScanArrA, cVar);
        }
        if (!z2) {
            o4.d("Scankit", "start hmsResultTrans");
            hmsScanArrA = w7.a(hmsScanArrA);
            o4.d("Scankit", "end hmsResultTrans");
        }
        int i4 = i3 == 0 ? HmsScanBase.ALL_SCAN_TYPE : i3;
        if (r3.d) {
            return new HmsScanResult(4099, hmsScanArrA);
        }
        if (r3.e) {
            return new HmsScanResult(4100, hmsScanArrA);
        }
        if (r3.h && hmsScanArrA.length == 0) {
            int i5 = HmsScanBase.QRCODE_SCAN_TYPE;
            if ((i4 & i5) == i5) {
                return new HmsScanResult(4097, hmsScanArrA);
            }
        }
        if (hmsScanArrA.length == 0) {
            return new HmsScanResult(4096, hmsScanArrA);
        }
        if (hmsScanArrA.length > 0 && !TextUtils.isEmpty(hmsScanArrA[0].getOriginalValue())) {
            return new HmsScanResult(0, hmsScanArrA);
        }
        if (hmsScanArrA.length > 0 && hmsScanArrA[0].getZoomValue() > 1.0d) {
            return new HmsScanResult(4098, hmsScanArrA);
        }
        return new HmsScanResult(4096, new HmsScan[0]);
    }

    public HmsScan[] a(ByteBuffer byteBuffer, int i, int i2, int i3, boolean z, w3 w3Var) {
        w3.c cVarA;
        if (w3Var != null) {
            w3Var.a("multi");
            int i4 = i2 * i;
            cVarA = w3Var.a(z, i4);
            if (i >= 30 && i2 >= 30) {
                if (byteBuffer.array().length < i4) {
                    cVarA.a(-1008);
                }
            } else {
                cVarA.a(-1007);
            }
        } else {
            cVarA = null;
        }
        HmsScan[] hmsScanArrA = y6.a(n1.a(byteBuffer, new x6(i, i2, i3, true, z)));
        if (w3Var != null) {
            w3Var.a(hmsScanArrA, cVarA);
        }
        return hmsScanArrA;
    }

    public static r6 a() {
        if (f16304a == null) {
            synchronized (r6.class) {
                if (f16304a == null) {
                    f16304a = new r6();
                }
            }
        }
        return f16304a;
    }
}
