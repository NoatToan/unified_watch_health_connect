package defpackage;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.pdf.PdfDocument;
import android.text.TextUtils;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes9.dex */
public class bqh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f4483a = 5000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static float f4484b = 0.0f;
    public static float c = 0.0f;
    public static float d = 170.10101f;
    public static float e = 14.175084f;
    public static UserProfile f;
    public static a g;
    public static int h;
    public static long i;
    public static Float j = Float.valueOf(0.0f);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static List<Float> f4485k = new ArrayList();

    public interface a {
        void GenerateError(sgq sgqVar);

        void GenerateSuccess(String str);
    }

    public static void a() {
        j = Float.valueOf(0.0f);
        f4485k.clear();
    }

    public static Path b(float f2, float f3, float f4, float f5, float f6, float f7, Canvas canvas, Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(0.2f);
        paint.setColor(Color.parseColor("#EBEBEB"));
        Path path = new Path();
        for (int i2 = 0; i2 < 3; i2++) {
            float f8 = 85.05051f + f5;
            for (int i3 = 0; i3 < 250; i3++) {
                float f9 = (((i3 * f3) + 14.175084f) / 5.0f) + f4;
                path.moveTo(f9, d + f5);
                path.lineTo(f9, d + f8);
            }
            for (int i4 = 0; i4 <= 29; i4++) {
                float f10 = (((i4 * f2) + 14.175084f) / 5.0f) + f5;
                path.moveTo(f4, d + f10);
                path.lineTo(f6, f10 + d);
            }
            f5 = 30.0f + f8;
        }
        canvas.drawPath(path, paint);
        path.reset();
        return path;
    }

    public static void c(Canvas canvas, Paint paint, int i2) {
        paint.setColor(-16777216);
        paint.setStyle(Paint.Style.FILL);
        Typeface typeface = Typeface.DEFAULT;
        paint.setTypeface(typeface);
        paint.setTextSize(18.0f);
        try {
            Rect rect = new Rect();
            paint.setColor(-16777216);
            paint.setTextSize(20.0f);
            paint.setTypeface(Typeface.DEFAULT_BOLD);
            String string = AppUtil.getApp().getResources().getString(c0j.Ba);
            paint.getTextBounds(string, 0, string.length(), rect);
            canvas.drawText(string, 66.622894f, 56.700336f, paint);
            paint.setTextSize(12.0f);
            paint.setTypeface(typeface);
            String string2 = AppUtil.getApp().getResources().getString(c0j.ya);
            if (f.getSex() == null) {
                string2 = "-";
            } else if (Objects.equals(f.getSex(), "female")) {
                string2 = AppUtil.getApp().getResources().getString(c0j.xa);
            }
            String name = f.getName();
            StringBuilder sb = new StringBuilder();
            if (name.equals("")) {
                sb.append("-");
            } else {
                int length = name.length();
                for (int i3 = length; i3 > 0; i3--) {
                    if (length == 3) {
                        sb.append(Marker.ANY_MARKER);
                        sb.append(name.substring(1, 3));
                        break;
                    } else {
                        if (i3 == 3) {
                            sb.append(name.substring(length - 3, length));
                            break;
                        }
                        sb.append(Marker.ANY_MARKER);
                    }
                }
            }
            String string3 = AppUtil.getApp().getResources().getString(c0j.Ca, sb, string2, Integer.valueOf(f.getAge()));
            paint.getTextBounds(string3, 0, string3.length(), rect);
            canvas.drawText(string3, 66.622894f, 80.79798f, paint);
            paint.setTextSize(12.0f);
            String str = AppUtil.getApp().getResources().getString(c0j.Da) + TimeDateUtil.getDateYYYYMMDDHHmmLocalFormat(i, false);
            paint.getTextBounds(str, 0, str.length(), rect);
            canvas.drawText(str, 775.3771f - rect.width(), 80.79798f, paint);
            paint.setTextSize(12.0f);
            int i4 = h;
            String quantityString = AppUtil.getApp().getResources().getQuantityString(qxi.c0, h, i4 != 0 ? String.valueOf(i4) : "--");
            paint.getTextBounds(quantityString, 0, quantityString.length(), rect);
            canvas.drawText(quantityString, 78.622894f, d, paint);
            paint.setTextSize(6.0f);
            paint.setAlpha(30);
            for (int i5 = 0; i5 < 30; i5++) {
                int i6 = ((i2 - 1) * 30) + i5;
                String quantityString2 = AppUtil.getApp().getResources().getQuantityString(qxi.V1, i6, Integer.valueOf(i6));
                paint.getTextBounds(quantityString2, 0, quantityString2.length(), rect);
                canvas.drawText(quantityString2, ((i5 % 10) * 5 * 14.175084f) + 66.622894f + 2.0f, d + 14.175084f + 85.05051f + ((i5 / 10) * 115.05051f) + 10.0f, paint);
            }
            paint.setAlpha(70);
            paint.setTextSize(8.0f);
            String string4 = AppUtil.getApp().getResources().getString(c0j.za);
            paint.getTextBounds(string4, 0, string4.length(), rect);
            canvas.drawText(string4, 66.622894f, d + 368.5522f, paint);
            paint.setTextSize(8.0f);
            String string5 = AppUtil.getApp().getResources().getString(c0j.Aa);
            paint.getTextBounds(string5, 0, string5.length(), rect);
            canvas.drawText(string5, 775.3771f - rect.width(), d + 368.5522f, paint);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @TargetApi(19)
    public static void d(String str, List<Float> list, UserProfile userProfile, Integer num, Long l, a aVar) {
        FileOutputStream fileOutputStream;
        a();
        f = userProfile;
        h = num.intValue();
        i = l.longValue();
        try {
            g = aVar;
            int size = list.size();
            c = 3.0f;
            f4484b = 3.0f * 14.175084f * 6.0f;
            PdfDocument pdfDocument = new PdfDocument();
            PdfDocument.PageInfo pageInfoCreate = new PdfDocument.PageInfo.Builder(842, 595, 1).create();
            int i2 = size / (f4483a * 3);
            if (i2 == 0) {
                i2 = 1;
            }
            for (int i3 = 1; i3 <= i2; i3++) {
                f(pdfDocument.startPage(pageInfoCreate), pdfDocument, list, i3);
            }
            if (g == null || TextUtils.isEmpty(str)) {
                return;
            }
            String strSubstring = str.substring(0, str.lastIndexOf(File.separator));
            Logger.i("filePathOnly" + strSubstring, new Object[0]);
            e(new File(strSubstring));
            try {
                fileOutputStream = new FileOutputStream(new File(str));
            } catch (FileNotFoundException e2) {
                if (g != null) {
                    f = new UserProfile();
                }
                Logger.i("生成pdf失败", new Object[0]);
                g.GenerateError(new sgq());
                e2.printStackTrace();
                fileOutputStream = null;
            }
            try {
                try {
                    pdfDocument.writeTo(fileOutputStream);
                } catch (IOException e3) {
                    if (g != null) {
                        f = new UserProfile();
                    }
                    Logger.i("生成pdf失败2", new Object[0]);
                    e3.printStackTrace();
                    g.GenerateError(new sgq());
                }
                pdfDocument.close();
                Logger.i("生成pdf成功了", new Object[0]);
                g.GenerateSuccess(str);
            } catch (Throwable th) {
                pdfDocument.close();
                throw th;
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public static void e(File file) {
        if (!file.isDirectory()) {
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        int i2 = 0;
        while (true) {
            Objects.requireNonNull(fileArrListFiles);
            if (i2 >= fileArrListFiles.length) {
                return;
            }
            fileArrListFiles[i2].delete();
            i2++;
        }
    }

    public static void f(PdfDocument.Page page, PdfDocument pdfDocument, List<Float> list, int i2) {
        float f2 = c * 14.175084f * 6.0f;
        f4484b = f2;
        float f3 = e;
        int i3 = (i2 - 1) * f4483a * 3;
        Canvas canvas = page.getCanvas();
        Paint paint = new Paint();
        c(canvas, paint, i2);
        Path pathB = b(14.175084f, 14.175084f, 66.622894f, f3, 775.3771f, f2, canvas, paint);
        paint.setStrokeWidth(0.4f);
        paint.setColor(Color.parseColor("#D1D1D1"));
        Path path = new Path();
        path.moveTo(66.622894f, 95.05051f);
        path.lineTo(775.3771f, 95.05051f);
        for (int i4 = 0; i4 < c; i4++) {
            float f4 = 85.05051f + f3;
            for (int i5 = 0; i5 < 51; i5++) {
                float f5 = (i5 * 14.175084f) + 66.622894f;
                path.moveTo(f5, f3 + d);
                if (i5 % 5 == 0) {
                    path.lineTo(f5, d + f4 + 10.0f);
                } else {
                    path.lineTo(f5, d + f4);
                }
            }
            for (int i6 = 0; i6 <= 6; i6++) {
                float f6 = (i6 * 14.175084f) + f3;
                path.moveTo(66.622894f, d + f6);
                path.lineTo(775.3771f, f6 + d);
            }
            f3 = 30.0f + f4;
        }
        canvas.drawPath(path, paint);
        path.reset();
        paint.setColor(Color.parseColor("#000000"));
        paint.setStrokeWidth(0.7f);
        if (i2 == 1) {
            for (int i7 = 0; i7 < 2; i7++) {
                float f7 = (i7 * 14.175084f) + 66.622894f + 5.6700335f;
                pathB.moveTo(f7, d + 14.175084f + 14.175084f);
                pathB.lineTo(f7, d + 42.525253f + 14.175084f);
            }
            pathB.moveTo(72.29293f, d + 14.175084f + 14.175084f);
            pathB.lineTo(86.46802f, d + 14.175084f + 14.175084f);
            int i8 = 0;
            while (i8 < 2) {
                float f8 = i8;
                float f9 = (f8 * 14.175084f) + 66.622894f;
                pathB.moveTo((f8 * 5.6700335f) + f9, d + 42.525253f + 14.175084f);
                i8++;
                pathB.lineTo(f9 + (i8 * 5.6700335f), d + 42.525253f + 14.175084f);
            }
        }
        canvas.drawPath(pathB, paint);
        pathB.reset();
        paint.setColor(Color.parseColor("#FF5959"));
        paint.setStrokeWidth(0.7f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        loop5: for (int i9 = 0; i9 < c; i9++) {
            int i10 = (f4483a * i9) + i3;
            for (int i11 = 0; i11 < f4483a; i11++) {
                int i12 = i10 + i11;
                if (i12 >= list.size()) {
                    break loop5;
                }
                float fFloatValue = list.get(i12).floatValue();
                double d2 = fFloatValue;
                if (d2 > 1.5d || d2 < -1.5d) {
                    pathB.moveTo(((i11 * 708.7542f) / f4483a) + 66.622894f, g(d2 > 1.5d ? 1.5f : -1.5f, i9));
                } else {
                    if (i11 == 0) {
                        pathB.moveTo(((0 * 708.7542f) / f4483a) + 66.622894f, g(fFloatValue, i9));
                    }
                    pathB.lineTo(((i11 * 708.7542f) / f4483a) + 66.622894f, g(fFloatValue, i9));
                }
            }
        }
        canvas.drawPath(pathB, paint);
        pathB.reset();
        paint.setStyle(Paint.Style.FILL);
        float f10 = d - 13.55f;
        float f11 = 13.55f + f10;
        pathB.moveTo(71.622894f, f11);
        float f12 = 5.0f + f10;
        float f13 = f10 + 10.0f;
        pathB.arcTo(66.622894f, f12, 71.622894f, f13, -225.0f, 225.0f, false);
        pathB.arcTo(71.622894f, f12, 76.622894f, f13, -180.0f, 225.0f, false);
        pathB.lineTo(71.622894f, f11);
        canvas.drawPath(pathB, paint);
        pdfDocument.finishPage(page);
    }

    public static float g(float f2, int i2) {
        float fH = (((d + 14.175084f) + (i2 * 115.05051f)) + 42.525253f) - h(f2);
        StringBuilder sb = new StringBuilder();
        sb.append("Y height:");
        sb.append(fH);
        return fH;
    }

    public static float h(float f2) {
        return (float) ((((double) f2) / 1.5d) * 3.0d * 14.175084114074707d);
    }
}
