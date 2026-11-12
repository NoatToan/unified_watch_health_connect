package defpackage;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class q3s {
    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                hexString = '0' + hexString;
            }
            sb.append("0X");
            sb.append(hexString.toUpperCase());
            sb.append(",");
        }
        return sb.toString();
    }

    public static byte[] b(byte b2, byte b3, byte b4) {
        byte b5 = (byte) ((b3 >> 2) & 63);
        return new byte[]{(byte) (((((byte) ((b2 >> 3) & 31)) << 3) & 248) | ((b5 >> 3) & 31)), (byte) (((b5 << 5) & SportReportBaseParser.ReportType.avgFreq) | ((byte) ((b4 >> 3) & 31)))};
    }

    /* JADX WARN: Code duplicated, block: B:31:0x010b A[Catch: Exception -> 0x0074, TryCatch #0 {Exception -> 0x0074, blocks: (B:5:0x0009, B:7:0x002b, B:9:0x0034, B:16:0x004d, B:19:0x0077, B:21:0x00a6, B:23:0x00d3, B:27:0x00fe, B:29:0x0107, B:31:0x010b, B:32:0x011e, B:26:0x00eb, B:28:0x0102, B:33:0x0136, B:34:0x016c, B:39:0x0191, B:41:0x0199, B:42:0x01a4), top: B:46:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x011e A[SYNTHETIC] */
    public static byte[] c(Bitmap bitmap) {
        int i;
        int i2;
        Bitmap bitmap2 = bitmap;
        int i3 = 8;
        int i4 = 2;
        if (bitmap2 == null) {
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i5 = width * height * 2;
            byte[] bArr = new byte[i5];
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i6 < height) {
                byte[] bArr2 = new byte[width * 2];
                int i9 = 0;
                int i10 = 0;
                while (i9 < width) {
                    int pixel = bitmap2.getPixel(i9, i6);
                    int iRed = Color.red(pixel);
                    int iGreen = Color.green(pixel);
                    int iBlue = Color.blue(pixel);
                    if (iRed < i3) {
                        iRed = i3;
                    }
                    if (iGreen < i3) {
                        iGreen = i3;
                    }
                    if (iBlue < i3) {
                        iBlue = i3;
                    }
                    byte[] bArrB = b((byte) iRed, (byte) iGreen, (byte) iBlue);
                    bArr[i7] = bArrB[0];
                    bArr[i7 + 1] = bArrB[1];
                    i7 += 2;
                    bArr2[i10] = bArrB[1];
                    bArr2[i10 + 1] = bArrB[0];
                    i10 += 2;
                    i9++;
                    i4 = 2;
                }
                byte[] bArr3 = new byte[i4];
                bArr3[0] = bArr2[0];
                bArr3[1] = bArr2[1];
                String strA = a(bArr3);
                ArrayList arrayList4 = new ArrayList();
                byte[] bArr4 = new byte[2];
                byte[] bArr5 = {bArr2[0], bArr2[1]};
                int i11 = i8;
                int i12 = 1;
                int i13 = height;
                int i14 = 1;
                while (i12 < width) {
                    int i15 = i12 * 2;
                    byte[] bArr6 = bArr;
                    int i16 = i7;
                    byte b2 = bArr2[i15];
                    byte b3 = bArr2[i15 + 1];
                    byte[] bArr7 = bArr2;
                    ArrayList arrayList5 = arrayList;
                    String strA2 = a(new byte[]{b2, b3});
                    bArr4[0] = b2;
                    bArr4[1] = b3;
                    if (strA.equals(strA2)) {
                        if (i14 == 255) {
                            i2 = 1;
                            arrayList4.add(new byte[]{bArr5[0], bArr5[1], (byte) i14});
                        } else {
                            i = 1;
                            i14++;
                        }
                        if (i12 == width - 1) {
                            byte[] bArr8 = new byte[3];
                            bArr8[0] = bArr4[0];
                            bArr8[i] = bArr4[i];
                            bArr8[2] = (byte) i14;
                            arrayList4.add(bArr8);
                            i11 += i;
                        }
                        bArr5[0] = bArr4[0];
                        bArr5[1] = bArr4[1];
                        i12++;
                        strA = strA2;
                        bArr = bArr6;
                        bArr2 = bArr7;
                        i7 = i16;
                        arrayList = arrayList5;
                    } else {
                        arrayList4.add(new byte[]{bArr5[0], bArr5[1], (byte) i14});
                        i2 = 1;
                    }
                    i11 += i2;
                    i = 1;
                    i14 = 1;
                    if (i12 == width - 1) {
                        byte[] bArr9 = new byte[3];
                        bArr9[0] = bArr4[0];
                        bArr9[i] = bArr4[i];
                        bArr9[2] = (byte) i14;
                        arrayList4.add(bArr9);
                        i11 += i;
                    }
                    bArr5[0] = bArr4[0];
                    bArr5[1] = bArr4[1];
                    i12++;
                    strA = strA2;
                    bArr = bArr6;
                    bArr2 = bArr7;
                    i7 = i16;
                    arrayList = arrayList5;
                }
                arrayList2.add(f(arrayList4));
                arrayList3.add(new byte[]{(byte) ((i11 >> 8) & 255), (byte) (i11 & 255)});
                i6++;
                i3 = 8;
                height = i13;
                bArr = bArr;
                i7 = i7;
                arrayList = arrayList;
                bitmap2 = bitmap;
                i8 = i11;
                i4 = 2;
            }
            ArrayList arrayList6 = arrayList;
            byte[] bArr10 = bArr;
            ArrayList arrayList7 = new ArrayList();
            arrayList7.add(f(arrayList3));
            arrayList7.add(f(arrayList2));
            byte[] bArrF = f(arrayList7);
            byte[] bArr11 = bArrF.length >= i5 ? bArr10 : bArrF;
            arrayList6.add(bArr11);
            int length = bArr11.length % 4;
            if (length != 0) {
                byte[] bArr12 = new byte[4 - length];
                Arrays.fill(bArr12, (byte) -1);
                arrayList6.add(bArr12);
            }
            return f(arrayList6);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] d(List<byte[]> list) {
        if (list.size() == 1) {
            return list.get(0);
        }
        if (list.size() <= 0) {
            return null;
        }
        byte[] bArrE = e(list.get(0), list.get(1));
        for (int i = 2; i < list.size(); i++) {
            bArrE = e(bArrE, list.get(i));
        }
        return bArrE;
    }

    public static byte[] e(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static byte[] f(List<byte[]> list) {
        if (list.size() > 0) {
            return list.size() == 1 ? list.get(0) : d(list);
        }
        return null;
    }
}
