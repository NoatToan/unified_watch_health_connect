package defpackage;

import android.text.TextUtils;
import com.huawei.health.device.open.data.HealthDataParser;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.math.BigDecimal;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class dow implements HealthDataParser {
    private boolean d = false;

    public static int b(byte b2, byte b3) {
        return ((b2 & 255) << 8) | (b3 & 255);
    }

    @Override // com.huawei.health.device.open.data.HealthDataParser
    public HealthData parseData(byte[] bArr) {
        return null;
    }

    public void b(boolean z) {
        this.d = z;
    }

    public drd a(byte[] bArr) {
        if (bArr == null) {
            LogUtil.j("HwWspMeasureDataParser", "buffer is null");
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        if (length > 70) {
            LogUtil.a("HwWspMeasureDataParser", "parseManagerInfoForNew is above 70 bytes");
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr2);
            byte[] bArr3 = new byte[30];
            byteBufferWrap.get(bArr3);
            byte[] bArr4 = new byte[40];
            byteBufferWrap.get(bArr4);
            String strTrim = "";
            String strTrim2 = new String(bArr4, StandardCharsets.UTF_8).trim();
            LogUtil.a("HwWspMeasureDataParser", "deviceIdStr:", strTrim2);
            try {
                int i = byteBufferWrap.get() & 255;
                byte[] bArr5 = new byte[i];
                if (byteBufferWrap.limit() - byteBufferWrap.position() >= i) {
                    byteBufferWrap.get(bArr5);
                }
                strTrim = new String(bArr5, StandardCharsets.UTF_8).trim();
                LogUtil.a("HwWspMeasureDataParser", "accountInfoStr:", strTrim);
            } catch (BufferUnderflowException e) {
                LogUtil.j("HwWspMeasureDataParser", "UnsupportedEncodingException while OutOfBounds info", e.getMessage());
            }
            return new drd(bArr3, strTrim2, strTrim);
        }
        return d(bArr2);
    }

    public drd d(byte[] bArr) {
        if (bArr == null) {
            LogUtil.j("HwWspMeasureDataParser", "parsing manager info failed with null data");
            return null;
        }
        int length = bArr.length;
        if (length == 0) {
            LogUtil.j("HwWspMeasureDataParser", "no manager info");
            return new drd(new byte[0], "", "");
        }
        if (length <= 30) {
            return null;
        }
        byte[] bArr2 = new byte[30];
        System.arraycopy(bArr, 0, bArr2, 0, 30);
        int i = length - 30;
        byte[] bArr3 = new byte[i];
        System.arraycopy(bArr, 30, bArr3, 0, i);
        return new drd(bArr2, new String(bArr3, StandardCharsets.UTF_8).trim(), "");
    }

    public int e(byte[] bArr) {
        byte b2;
        if (bArr == null) {
            return -1;
        }
        if (this.d) {
            if (bArr.length <= 0) {
                return -1;
            }
            b2 = bArr[0];
        } else {
            if (bArr.length < 5) {
                return -1;
            }
            b2 = bArr[3];
        }
        if (b2 == 0) {
            return 0;
        }
        if (b2 == 1) {
            return 1;
        }
        if (b2 == 2) {
            return 2;
        }
        return b2 == 3 ? 3 : -1;
    }

    public int i(byte[] bArr) {
        byte b2;
        if (bArr == null) {
            return -1;
        }
        if (this.d) {
            if (bArr.length <= 0) {
                return -1;
            }
            b2 = bArr[0];
        } else {
            if (bArr.length < 5) {
                return -1;
            }
            b2 = bArr[3];
        }
        try {
            return Integer.parseInt(Integer.toString(b2 & 255, 16));
        } catch (NumberFormatException e) {
            LogUtil.e("HwWspMeasureDataParser", "parseUnit exception:", e.getMessage());
            return -1;
        }
    }

    public String c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[5];
        if (this.d) {
            if (bArr.length < 5) {
                return null;
            }
        } else {
            if (bArr.length < 10) {
                return null;
            }
            System.arraycopy(bArr, 3, bArr2, 0, 5);
            bArr = bArr2;
        }
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public byte[] c(String str) {
        if (str == null) {
            LogUtil.e("HwWspMeasureDataParser", "huid is null");
            return new byte[0];
        }
        byte[] bArr = new byte[30];
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        if (bytes != null) {
            System.arraycopy(bytes, 0, bArr, 0, Math.min(bytes.length, 30));
        }
        return bArr;
    }

    public byte[] e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HwWspMeasureDataParser", "uid is null");
            return new byte[0];
        }
        byte[] bArr = new byte[32];
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        if (bytes != null) {
            System.arraycopy(bytes, 0, bArr, 0, Math.min(bytes.length, 32));
        }
        return bArr;
    }

    public byte[] e(byte[] bArr, byte[] bArr2, int i, int i2, dnj dnjVar) {
        byte[] bArr3;
        if (bArr == null || bArr2 == null) {
            return new byte[0];
        }
        if (dnjVar == null) {
            return new byte[0];
        }
        if (dnjVar.a() == -1) {
            bArr3 = new byte[69];
        } else {
            bArr3 = new byte[70];
        }
        int iMin = Math.min(bArr.length, 30);
        int iMin2 = Math.min(bArr2.length, 32);
        System.arraycopy(bArr, 0, bArr3, 0, iMin);
        System.arraycopy(bArr2, 0, bArr3, 30, iMin2);
        bArr3[62] = (byte) i;
        bArr3[63] = (byte) dnjVar.c();
        bArr3[64] = (byte) (dnjVar.e() & 255);
        bArr3[65] = (byte) ((dnjVar.e() >> 8) & 255);
        int iFloatValue = (int) new BigDecimal(Float.toString(dnjVar.r())).multiply(new BigDecimal(String.valueOf(100))).floatValue();
        LogUtil.d("HwWspMeasureDataParser", "weightIntValue = ", Integer.valueOf(iFloatValue));
        bArr3[66] = (byte) (iFloatValue & 255);
        bArr3[67] = (byte) ((iFloatValue >> 8) & 255);
        bArr3[68] = (byte) i2;
        if (dnjVar.a() != -1) {
            bArr3[69] = (byte) dnjVar.a();
        }
        ReleaseLogUtil.d("R_Weight_HwWspMeasureDataParser", Integer.valueOf(String.valueOf(dnjVar.e()).length()), Integer.valueOf(dnjVar.e()), Integer.valueOf(String.valueOf(dnjVar.r()).length()), Float.valueOf(dnjVar.r()), Integer.valueOf(String.valueOf(dnjVar.c()).length()), Integer.valueOf(dnjVar.c()), Integer.valueOf(String.valueOf(dnjVar.a()).length()), Integer.valueOf(dnjVar.a()), ", type is ", Integer.valueOf(i2));
        return bArr3;
    }

    public byte[] c(String str, String str2) {
        byte[] bArr = new byte[70];
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        byte[] bytes2 = str2.getBytes(StandardCharsets.UTF_8);
        if (bytes != null && bytes2 != null) {
            int iMin = Math.min(bytes.length, 30);
            int length = bytes.length <= 40 ? bytes2.length : 40;
            System.arraycopy(bytes, 0, bArr, 0, iMin);
            System.arraycopy(bytes2, 0, bArr, 30, length);
        }
        return bArr;
    }

    public static byte[] c(List<byte[]> list) {
        byte[] bArr = list.get(0);
        byte[] bArr2 = list.get(1);
        return new byte[]{bArr[0], bArr[1], bArr[2], bArr[4], bArr[5], bArr[6], bArr[7], bArr[8], bArr[9], bArr[10], bArr[12], bArr[13], bArr[14], bArr2[4], bArr2[5]};
    }

    public static dom b(byte[] bArr) {
        if (bArr == null || bArr.length < 5 || bArr.length > 20) {
            return null;
        }
        byte[] bArrB = b(bArr[1]);
        byte[] bArrB2 = b(bArr[2]);
        byte[] bArrB3 = b(bArr[3]);
        int length = bArrB.length + bArrB2.length + bArrB3.length;
        LogUtil.a("HwWspMeasureDataParser", "count === ", Integer.valueOf(length));
        byte[] bArr2 = new byte[length];
        c(bArr2, bArrB, bArrB2, bArrB3);
        StringBuilder sb = new StringBuilder(16);
        int i = 0;
        while (i < 4) {
            sb.append((int) bArr2[i]);
            i++;
        }
        StringBuilder sb2 = new StringBuilder(16);
        while (i < 8) {
            sb2.append((int) bArr2[i]);
            i++;
        }
        StringBuilder sb3 = new StringBuilder(16);
        while (i < 12) {
            sb3.append((int) bArr2[i]);
            i++;
        }
        StringBuilder sb4 = new StringBuilder(16);
        while (i < 22) {
            sb4.append((int) bArr2[i]);
            i++;
        }
        return b(sb, sb2, sb3, sb4, bArr);
    }

    private static dom b(StringBuilder sb, StringBuilder sb2, StringBuilder sb3, StringBuilder sb4, byte[] bArr) {
        StringBuilder sb5 = new StringBuilder(16);
        try {
            sb5.append(Integer.parseInt(sb.toString(), 2));
            sb5.append(".");
            sb5.append(Integer.parseInt(sb2.toString(), 2));
            sb5.append(".");
            sb5.append(Integer.parseInt(sb3.toString(), 2));
            sb5.append(".");
            sb5.append(Integer.parseInt(sb4.toString(), 2));
        } catch (NumberFormatException unused) {
            LogUtil.e("HwWspMeasureDataParser", "spliceVersion exception");
        }
        dom domVar = new dom();
        domVar.b(sb5.toString());
        ReleaseLogUtil.d("R_Weight_HwWspMeasureDataParser", "version ", sb5.toString());
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 4, bArr2, 0, bArr.length - 4);
        domVar.d(new String(g(bArr2)));
        LogUtil.d("HwWspMeasureDataParser", "dataInfos ==== ", domVar.b());
        domVar.e(bArr);
        return domVar;
    }

    private static void c(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        System.arraycopy(bArr3, 0, bArr, bArr2.length, bArr3.length);
        System.arraycopy(bArr4, 0, bArr, bArr2.length + bArr3.length, bArr4.length);
    }

    private static byte[] b(byte b2) {
        byte[] bArr = new byte[8];
        for (int i = 7; i >= 0; i--) {
            bArr[i] = (byte) (b2 & 1);
            b2 = (byte) (b2 >> 1);
        }
        return bArr;
    }

    private static char[] g(byte[] bArr) {
        Charset charset = StandardCharsets.US_ASCII;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length);
        byteBufferAllocate.put(bArr);
        byteBufferAllocate.flip();
        return charset.decode(byteBufferAllocate).array();
    }

    public static byte[] b(int i) {
        return new byte[]{(byte) i};
    }

    public static String e(byte[] bArr, int i) {
        byte b2;
        byte b3;
        byte b4;
        byte b5;
        byte b6;
        if (bArr == null || bArr.length < i + 7 || i < 0) {
            LogUtil.j("HwWspMeasureDataParser", "HwWspMeasureDataParser parseTimeStamp illegal bytes");
            return "";
        }
        int iA = doa.a(bArr, i, 2);
        if (iA < 2000) {
            LogUtil.j("HwWspMeasureDataParser", "HwWspMeasureDataParser parse time Stamp: wrong time");
            b6 = 0;
            b5 = 0;
            b2 = 0;
            b3 = 0;
            b4 = 0;
            iA = 2000;
        } else {
            byte b7 = bArr[i + 2];
            b2 = bArr[i + 3];
            b3 = bArr[i + 4];
            b4 = bArr[i + 5];
            b5 = bArr[i + 6];
            b6 = b7;
        }
        String str = String.format(Locale.ENGLISH, "%d-%d-%d %d:%d:%d", Integer.valueOf(iA), Integer.valueOf(b6), Integer.valueOf(b2), Integer.valueOf(b3), Integer.valueOf(b4), Integer.valueOf(b5));
        LogUtil.d("HwWspMeasureDataParser", "HwWspMeasureDataParser parseTimeStamp ", str);
        return str;
    }
}
