package defpackage;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.zjw.m65Acustomdialsdk.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class zes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static cdm f41203a;

    public static Bitmap a(byte[] bArr, int i, int i2, int i3, Bitmap bitmap, Bitmap bitmap2, boolean z) {
        Bitmap bitmapC = null;
        if (bitmap != null && bitmap2 != null) {
            Bitmap bitmapC2 = c(bitmap2, i, i2, i3);
            if (bitmapC2 == null) {
                return null;
            }
            bitmapC = a.c(bitmap, bitmapC2, 0, 0);
            if (z) {
                f41203a.onResponseCustomDialEffectImg(bitmapC);
            }
        }
        return bitmapC;
    }

    public static Bitmap c(Bitmap bitmap, int i, int i2, int i3) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        for (int i4 = 0; i4 < height; i4++) {
            for (int i5 = 0; i5 < width; i5++) {
                bitmapCreateBitmap.setPixel(i5, i4, Color.argb(Color.alpha(bitmap.getPixel(i5, i4)), i, i2, i3));
            }
        }
        return bitmapCreateBitmap;
    }

    public byte[] b(boolean z, byte[] bArr, int i, int i2, int i3, Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap == null || bitmap2 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("source_data = ");
        sb.append(bArr.length);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("getNewCustomClockDialData source_data len = ");
        sb2.append(bArr.length);
        int i4 = i;
        int i5 = i2;
        if (i4 < 8) {
            i4 = 8;
        }
        int i6 = i3;
        if (i5 < 8) {
            i5 = 8;
        }
        if (i6 < 8) {
            i6 = 8;
        }
        if (bArr.length < 202) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = bArr.length - 202;
        byte[] bArr2 = new byte[length];
        for (int i7 = 0; i7 < length; i7++) {
            bArr2[i7] = bArr[202 + i7];
        }
        int iA = a.a(bArr, 0, 2);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("AddressSize = ");
        sb3.append(iA);
        if (iA > 0) {
            int i8 = 2;
            for (int i9 = 0; i9 < iA; i9++) {
                int iA2 = a.a(bArr, i8, 4);
                StringBuilder sb4 = new StringBuilder();
                sb4.append("nowAddress = i = ");
                sb4.append(i9);
                sb4.append(" data = ");
                sb4.append(iA2);
                i8 += 4;
                bArr2[iA2] = (byte) i4;
                bArr2[iA2 + 1] = (byte) i5;
                bArr2[iA2 + 2] = (byte) i6;
            }
        }
        Bitmap bitmapA = a(bArr, i4, i5, i6, bitmap, bitmap2, false);
        Bitmap bitmapB = bitmapA != null ? a.b(bitmapA, 156, 182) : null;
        byte[] bArrC = bitmapB != null ? q3s.c(bitmapB) : null;
        byte[] bArrC2 = q3s.c(bitmap);
        int length2 = bArrC.length + SportReportBaseParser.ReportType.avgFreq + bArrC2.length;
        bArr2[96] = (byte) (length2 >> 24);
        bArr2[95] = (byte) ((16711680 & length2) >> 16);
        bArr2[94] = (byte) ((65280 & length2) >> 8);
        bArr2[93] = (byte) (length2 & 255);
        StringBuilder sb5 = new StringBuilder();
        sb5.append("dataSize = ");
        sb5.append(length2);
        byte[] bArrD = a.d(bitmapB, 1, SportReportBaseParser.ReportType.avgFreq, bArrC.length, 42, 38);
        q3s.a(bArrD);
        byte[] bArrD2 = a.d(bitmap, 2, bArrC.length + SportReportBaseParser.ReportType.avgFreq, bArrC2.length, 0, 0);
        arrayList.add(bArr2);
        arrayList.add(bArrD);
        arrayList.add(bArrD2);
        arrayList.add(bArrC);
        arrayList.add(bArrC2);
        byte[] bArrD3 = q3s.d(arrayList);
        ArrayList arrayList2 = new ArrayList();
        byte[] bArrA = fas.a(bArrD3, fas.b());
        arrayList2.add(bArrD3);
        arrayList2.add(bArrA);
        byte[] bArrE = a.e(bArrD3);
        if (bArrD3.length >= bArrE.length) {
            f41203a.onResponseCustomDialData(q3s.d(arrayList2));
        } else {
            f41203a.onResponseCustomDialData(bArrE);
        }
        return bArr2;
    }
}
