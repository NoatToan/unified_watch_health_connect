package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class p3s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public edm f29971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29972b = 20;
    public int c = SportReportBaseParser.ReportType.exitTime;
    public int d = SportReportBaseParser.ReportType.exitTime;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    public int i = 0;
    public int j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f29973k = 0;

    public final Bitmap a(Bitmap bitmap, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
        int i8 = 0;
        for (int i9 = 0; i9 < i5; i9++) {
            for (int i10 = 0; i10 < i4; i10++) {
                bitmapCreateBitmap.setPixel(i10, i9, Color.argb(bArr[i8] & 255, i, i2, i3));
                i8++;
            }
        }
        if (bitmap == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(bitmapCreateBitmap, i6, i7, (Paint) null);
        canvas.save();
        canvas.restore();
        int width = bitmapCreateBitmap2.getWidth();
        int height = bitmapCreateBitmap2.getHeight();
        return Bitmap.createBitmap(bitmapCreateBitmap2, i6, i7, (width < i4 || height < i4) ? width > height ? height : width : i4, i5, (Matrix) null, false);
    }

    public Bitmap b(byte[] bArr, int i, int i2, int i3, Bitmap bitmap, Bitmap bitmap2, boolean z) {
        Bitmap bitmapB = eas.b(bitmap, e(bitmap2, i, i2, i3), 0, 0);
        if (z) {
            this.f29971a.onResponseCustomDialEffectImg(bitmapB);
        }
        return bitmapB;
    }

    public byte[] c(byte[] bArr, int i, int i2, int i3, Bitmap bitmap, Bitmap bitmap2) {
        byte[] bArrG = eas.g(bArr, 0, this.f29972b);
        Bitmap bitmapA = eas.a(b(bArr, i, i2, i3, bitmap, bitmap2, false), this.c, this.d);
        this.e = ((bArrG[0] & 16777215) << 24) | ((bArrG[1] & 65535) << 16) | ((bArrG[2] & 255) << 8) | (bArrG[3] & 255);
        this.f = ((bArrG[4] & 16777215) << 24) | ((bArrG[5] & 65535) << 16) | ((bArrG[6] & 255) << 8) | (bArrG[7] & 255);
        this.g = ((bArrG[8] & 16777215) << 24) | ((bArrG[9] & 65535) << 16) | ((bArrG[10] & 255) << 8) | (bArrG[11] & 255);
        this.h = ((bArrG[12] & 16777215) << 24) | ((bArrG[13] & 65535) << 16) | ((bArrG[14] & 255) << 8) | (bArrG[15] & 255);
        this.i = bArrG[16] & 255;
        this.j = bArrG[17] & 255;
        this.f29973k = bArrG[18] & 255;
        int i4 = i < 8 ? 8 : i;
        int i5 = i2 < 8 ? 8 : i2;
        int i6 = i3 < 8 ? 8 : i3;
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        byte[] bArrD = eas.d(bitmap);
        byte[] bArrD2 = eas.d(bitmapA);
        arrayList.add(eas.g(bArr, this.e, this.f));
        arrayList.add(bArrD2);
        arrayList.add(bArrD);
        for (int i7 = 0; i7 < this.f29973k; i7++) {
            byte[] bArrD3 = d(i4, i5, i6, bArr, bitmap, this.g + (this.j * i7));
            if (bArrD3 != null) {
                arrayList.add(bArrD3);
            }
        }
        byte[] bArrE = eas.e(arrayList);
        this.f29971a.onResponseCustomDialData(bArrE);
        return bArrE;
    }

    public final byte[] d(int i, int i2, int i3, byte[] bArr, Bitmap bitmap, int i4) {
        byte[] bArrD;
        ArrayList arrayList = new ArrayList();
        byte[] bArrG = eas.g(bArr, i4, this.j);
        int i5 = ((bArrG[0] & 16777215) << 24) | ((bArrG[1] & 65535) << 16) | ((bArrG[2] & 255) << 8) | (bArrG[3] & 255);
        int i6 = ((16777215 & bArrG[4]) << 24) | ((bArrG[5] & 65535) << 16) | ((bArrG[6] & 255) << 8) | (bArrG[7] & 255);
        int i7 = bArrG[8] & 255;
        int i8 = ((bArrG[9] & 255) << 8) | (bArrG[10] & 255);
        int i9 = ((bArrG[11] & 255) << 8) | (bArrG[12] & 255);
        int i10 = ((bArrG[13] & 255) << 8) | (bArrG[14] & 255);
        int i11 = ((bArrG[15] & 255) << 8) | (bArrG[16] & 255);
        int i12 = i5 + this.f29972b;
        if (i7 == 0 || i6 == 0) {
            bArrD = null;
        } else {
            int i13 = i10 * i11;
            int i14 = 0;
            bArrD = null;
            while (i14 < i7) {
                bArrD = eas.d(a(bitmap, eas.g(bArr, i12 + (i13 * i14), i13), i, i2, i3, i10, i11, i8, i9));
                arrayList.add(bArrD);
                i14++;
                i13 = i13;
            }
        }
        if (arrayList.size() > 0) {
            return arrayList.size() == 1 ? bArrD : eas.e(arrayList);
        }
        return null;
    }

    public final Bitmap e(Bitmap bitmap, int i, int i2, int i3) {
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
}
