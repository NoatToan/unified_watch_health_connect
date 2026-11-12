package com.huami.ecg.chart.pdf;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.pdf.PdfDocument;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextPaint;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import com.google.zxing.pdf417.PDF417Common;
import com.huami.ecg.chart.R;
import com.huami.ecg.chart.model.EcgLostData;
import com.huami.ecg.chart.utils.EcgChartUtils;
import com.huami.ecg.chart.utils.UIUtils;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.tools.log.HMLog;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.cybergarage.soap.SOAP;

/* JADX INFO: loaded from: classes8.dex */
@TargetApi(19)
public class EcgReportPrint {
    private static final String a = "EcgReportPrint";
    private static final int b = 250;
    private static final int c = 2479;
    private static final int d = 208;
    private static final int e = 2271;
    private static final int f = 88;
    private static final int g = 3508;
    private static final int h = 14000;
    private static final int i = Color.parseColor("#8A8A8F");
    private static final int j = Color.parseColor("#000000");
    private static final int k = 177;
    private static final int l = 7;

    public interface PdfGenerationListener {
        void pdfGenerationFailure(Exception exc);

        void pdfGenerationSuccess(File file);
    }

    public static class a extends Exception {
        private String a;

        public a(String str) {
            this.a = str;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "APINotSupportedException{mErrorMessage='" + this.a + "'}";
        }
    }

    public static class b extends AsyncTask<Void, Void, File> {
        private EcgInfo a;
        private String b;
        private PdfGenerationListener c;
        private Exception d;
        private int e = 1750;
        private float f = 1.1811286f;
        private Paint g;
        private Paint h;

        public b(EcgInfo ecgInfo, String str, PdfGenerationListener pdfGenerationListener) {
            this.a = ecgInfo;
            this.b = str;
            this.c = pdfGenerationListener;
        }

        private static void a(List<PdfBreakPoint> list, int i, EcgLostData ecgLostData, float f, float f2) {
            int i2 = i / 7;
            list.add(new PdfBreakPoint(f, f2, i2, (i % 7) - i2, ecgLostData.getType()));
        }

        private void c(List<PdfBreakPoint> list, Canvas canvas, int i, int i2) {
            for (PdfBreakPoint pdfBreakPoint : list) {
                if (pdfBreakPoint != null && pdfBreakPoint.getPage() == i2 && pdfBreakPoint.getLine() == i) {
                    canvas.drawRect(pdfBreakPoint.getRectLeft(), -177.0f, pdfBreakPoint.getRectRight(), 177.0f, this.h);
                }
            }
        }

        private List<PdfBreakPoint> f(List<Float> list) {
            ArrayList arrayList = new ArrayList();
            List<EcgLostData> ecgLostDataList = this.a.getEcgLostDataList();
            if (ecgLostDataList != null && !ecgLostDataList.isEmpty()) {
                int size = ecgLostDataList.size();
                int size2 = list.size() / 1750;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    EcgLostData ecgLostData = ecgLostDataList.get(i3);
                    int start = ecgLostData.getStart() + i;
                    int lostLen = ecgLostData.getLostLen();
                    int i4 = start + lostLen;
                    while (i2 < size2) {
                        int i5 = this.e;
                        int i6 = i2 * i5;
                        int i7 = i5 + i6;
                        if (start >= i6 && start <= i7 && i4 <= i7) {
                            float fG = g(start, i2);
                            float fG2 = g(i4, i2);
                            if (ecgLostData.getType() != 0) {
                                i += lostLen;
                            }
                            a(arrayList, i2, ecgLostData, fG, fG2);
                            break;
                        }
                        if (start < i6 || start > i7 || i4 <= i7) {
                            if (start < i6 && i4 >= i6 && i4 <= i7) {
                                float fG3 = g(i4, i2);
                                if (ecgLostData.getType() != 0) {
                                    i += i4 - i6;
                                }
                                a(arrayList, i2, ecgLostData, 0.0f, fG3);
                                break;
                            }
                        } else {
                            float fG4 = g(start, i2);
                            float fG5 = g(i7, i2);
                            if (ecgLostData.getType() != 0) {
                                i += i7 - start;
                            }
                            a(arrayList, i2, ecgLostData, fG4, fG5);
                        }
                        i2++;
                    }
                }
            }
            return arrayList;
        }

        private float g(int i, int i2) {
            return (i - (i2 * this.e)) * this.f;
        }

        private void h() {
            Paint paint = new Paint();
            this.h = paint;
            paint.setAntiAlias(true);
            this.h.setColor(Color.parseColor("#40ff0000"));
            Paint paint2 = new Paint();
            this.g = paint2;
            paint2.setAntiAlias(true);
            this.g.setColor(ContextCompat.getColor(this.a.getContext(), R.color.ecg_chart_red_d6));
            this.g.setTextSize(UIUtils.sp2pix(this.a.getContext(), 12.0f));
        }

        private List<Float> i(List<Float> list, List<EcgLostData> list2) {
            if (list2 == null || list2.isEmpty()) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            for (int size = list2.size() - 1; size >= 0; size--) {
                EcgLostData ecgLostData = list2.get(size);
                if (ecgLostData != null && ecgLostData.getType() != 0) {
                    int start = ecgLostData.getStart();
                    int lostLen = ecgLostData.getLostLen();
                    for (int i = 0; i < lostLen; i++) {
                        arrayList.add(start + i, Float.valueOf(0.0f));
                    }
                }
            }
            return arrayList;
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0077  */
        private File k(PdfDocument pdfDocument) throws IOException {
            String str = this.b;
            File fileCreateTempFile = (str == null || str.isEmpty()) ? File.createTempFile(Long.toString(System.currentTimeMillis()), "pdf") : new File(this.b);
            File parentFile = fileCreateTempFile.getParentFile();
            if (!parentFile.exists() && !parentFile.mkdirs()) {
                throw new IllegalStateException("Couldn't create directory: " + parentFile);
            }
            boolean zExists = fileCreateTempFile.exists();
            if (zExists) {
                zExists = !fileCreateTempFile.delete();
            }
            FileOutputStream fileOutputStream = null;
            if (!zExists) {
                try {
                    zExists = fileCreateTempFile.createNewFile();
                } catch (IOException e) {
                    e = e;
                    e.printStackTrace();
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw e;
                }
            }
            if (zExists) {
                FileOutputStream fileOutputStream2 = new FileOutputStream(fileCreateTempFile);
                try {
                    pdfDocument.writeTo(fileOutputStream2);
                    fileOutputStream2.close();
                    pdfDocument.close();
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    e.printStackTrace();
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw e;
                }
            }
            return fileCreateTempFile;
        }

        private void l(PdfDocument pdfDocument) {
            int i;
            int iCeil;
            int iCeil2;
            int i2;
            PdfDocument pdfDocument2 = pdfDocument;
            h();
            List<Float> listI = i(this.a.getEcgData(), this.a.getEcgLostDataList());
            List<PdfBreakPoint> listF = f(listI);
            int size = listI.size();
            int iCeil3 = (int) Math.ceil(size / 250.0f);
            int iCeil4 = (int) Math.ceil(this.a.getRawDataLength() / 250.0f);
            int iCeil5 = (int) Math.ceil(iCeil3 / 56.0f);
            Paint paint = new Paint();
            int i3 = 0;
            while (i3 < iCeil5) {
                int i4 = i3 * 14000;
                int i5 = size - i4;
                if (i5 >= 14000 || i5 <= 0) {
                    i = 0;
                    iCeil = 0;
                } else {
                    i = i4 + i5;
                    iCeil = (int) Math.ceil(i5 / 1750.0f);
                }
                if (i5 >= 14000) {
                    i = i4 + 14000;
                    iCeil = 8;
                }
                if (i5 < 0) {
                    i = i4 + 14000 + i5;
                    iCeil2 = (int) Math.ceil((i5 + 14000) / 1750.0f);
                } else {
                    iCeil2 = iCeil;
                }
                List<Float> listSubList = listI.subList(i4, i);
                int i6 = i3 + 1;
                PdfDocument.Page pageStartPage = pdfDocument2.startPage(new PdfDocument.PageInfo.Builder(EcgReportPrint.c, EcgReportPrint.g, i6).create());
                Canvas canvas = pageStartPage.getCanvas();
                if (i3 == 0) {
                    TextPaint textPaint = new TextPaint();
                    textPaint.setColor(EcgReportPrint.i);
                    textPaint.setTextSize(40.0f);
                    String string = this.a.getContext().getString(R.string.ecg_pdf_basics);
                    canvas.drawText(string, 208.0f, 133.0f, textPaint);
                    Rect rect = new Rect();
                    textPaint.getTextBounds(string, 0, string.length(), rect);
                    int iHeight = rect.height();
                    canvas.drawText(this.a.getContext().getString(R.string.ecg_pdf_info), 923.0f, 133.0f, textPaint);
                    textPaint.setColor(EcgReportPrint.j);
                    String string2 = this.a.getContext().getString(R.string.ecg_pdf_name);
                    Rect rect2 = new Rect();
                    textPaint.getTextBounds(string2, 0, string2.length(), rect2);
                    int iHeight2 = rect2.height();
                    int iMeasureText = (int) textPaint.measureText(string2);
                    float f = iHeight + 153;
                    canvas.drawText(string2, 208.0f, f, textPaint);
                    textPaint.setColor(EcgReportPrint.i);
                    canvas.drawText(this.a.getName(), iMeasureText + 213, f, textPaint);
                    String string3 = this.a.getContext().getString(R.string.ecg_pdf_start_time);
                    textPaint.setColor(EcgReportPrint.j);
                    int iMeasureText2 = (int) textPaint.measureText(string3);
                    canvas.drawText(string3, 923.0f, f, textPaint);
                    textPaint.setColor(EcgReportPrint.i);
                    canvas.drawText(new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date(this.a.getTimeStamps() * 1000)), iMeasureText2 + PDF417Common.MAX_CODEWORDS_IN_BARCODE, f, textPaint);
                    int i7 = iHeight2 + DataTypeSource.SPORT_TYPE_CHESS + iHeight2;
                    String string4 = this.a.getContext().getString(R.string.ecg_pdf_sex);
                    textPaint.setColor(EcgReportPrint.j);
                    float f2 = i7;
                    canvas.drawText(string4, 208.0f, f2, textPaint);
                    textPaint.setColor(EcgReportPrint.i);
                    String string5 = this.a.getContext().getString(this.a.getGender() == 0 ? R.string.ecg_pdf_gender_female : R.string.ecg_pdf_gender_male);
                    if (!this.a.isOneself()) {
                        string5 = "--";
                    }
                    Rect rect3 = new Rect();
                    textPaint.getTextBounds(string5, 0, string5.length(), rect3);
                    int iWidth = rect3.width();
                    canvas.drawText(string5, ((int) textPaint.measureText(string4)) + 213, f2, textPaint);
                    textPaint.setColor(EcgReportPrint.j);
                    String string6 = this.a.getContext().getString(R.string.ecg_pdf_age);
                    float f3 = iMeasureText + 312 + iWidth;
                    canvas.drawText(string6, f3, f2, textPaint);
                    textPaint.setColor(EcgReportPrint.i);
                    String str = this.a.getAge() + this.a.getContext().getString(R.string.ecg_pdf_years_old);
                    if (!this.a.isOneself()) {
                        str = "--";
                    }
                    float fMeasureText = ((int) textPaint.measureText(string6)) + iWidth + iMeasureText + TypedValues.AttributesType.TYPE_EASING;
                    canvas.drawText(str, fMeasureText, f2, textPaint);
                    String string7 = this.a.getContext().getString(R.string.ecg_pdf_duration);
                    textPaint.setColor(EcgReportPrint.j);
                    int iMeasureText3 = (int) textPaint.measureText(string7);
                    canvas.drawText(string7, 923.0f, f2, textPaint);
                    textPaint.setColor(EcgReportPrint.i);
                    canvas.drawText(EcgChartUtils.INSTANCE.secondToTime(this.a.getContext(), iCeil4), iMeasureText3 + PDF417Common.MAX_CODEWORDS_IN_BARCODE, f2, textPaint);
                    String string8 = this.a.getContext().getString(R.string.ecg_pdf_height);
                    textPaint.setColor(EcgReportPrint.j);
                    int i8 = iHeight2 + 193 + iHeight2 + iHeight2;
                    float f4 = i8;
                    canvas.drawText(string8, 208.0f, f4, textPaint);
                    textPaint.setColor(EcgReportPrint.i);
                    String str2 = this.a.getHeight() + "cm";
                    int iMeasureText4 = (int) textPaint.measureText(string8);
                    if (!this.a.isOneself()) {
                        str2 = "--";
                    }
                    textPaint.measureText(str2);
                    canvas.drawText(str2, iMeasureText4 + 213, f4, textPaint);
                    textPaint.setColor(EcgReportPrint.j);
                    String string9 = this.a.getContext().getString(R.string.ecg_pdf_weight);
                    textPaint.measureText(string9);
                    canvas.drawText(string9, f3, f4, textPaint);
                    textPaint.setColor(EcgReportPrint.i);
                    canvas.drawText(!this.a.isOneself() ? "--" : this.a.getWeight() + this.a.getContext().getString(R.string.ecg_pdf_kg), fMeasureText, f4, textPaint);
                    String string10 = this.a.getContext().getString(R.string.ecg_pdf_ahr);
                    textPaint.setColor(EcgReportPrint.j);
                    int iMeasureText5 = (int) textPaint.measureText(string10);
                    canvas.drawText(string10, 923.0f, f4, textPaint);
                    textPaint.setColor(EcgReportPrint.i);
                    canvas.drawText(this.a.getAvgHr() + this.a.getContext().getString(R.string.ecg_pdf_chest_heart_rate_unit), iMeasureText5 + PDF417Common.MAX_CODEWORDS_IN_BARCODE, f4, textPaint);
                    String string11 = this.a.getContext().getString(R.string.ecg_pdf_algo_result);
                    textPaint.setColor(EcgReportPrint.j);
                    int iMeasureText6 = (int) textPaint.measureText(string11);
                    float f5 = i8 + iHeight2 + 20;
                    canvas.drawText(string11, 923.0f, f5, textPaint);
                    textPaint.setColor(EcgReportPrint.i);
                    canvas.drawText(this.a.getAfibResult(), iMeasureText6 + PDF417Common.MAX_CODEWORDS_IN_BARCODE, f5, textPaint);
                    textPaint.setTextSize(68.0f);
                    textPaint.setColor(EcgReportPrint.j);
                    String string12 = this.a.getContext().getString(R.string.ecg_pdf_app_name);
                    int iMeasureText7 = 2271 - ((int) textPaint.measureText(string12));
                    canvas.drawText(string12, iMeasureText7, 200.0f, textPaint);
                    Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.a.getContext().getResources(), this.a.getAppIconResId());
                    int i9 = iMeasureText7 - 8;
                    RectF rectF = new RectF(i9 - 88, 136.0f, i9, 224.0f);
                    if (bitmapDecodeResource != null) {
                        canvas.drawBitmap(bitmapDecodeResource, (Rect) null, rectF, paint);
                    }
                    String string13 = this.a.getContext().getString(R.string.ecg_pdf_calibration);
                    textPaint.setTextSize(32.0f);
                    textPaint.setColor(EcgReportPrint.i);
                    canvas.drawText(string13, 2271 - ((int) textPaint.measureText(string13)), 404.0f, textPaint);
                    i2 = 430;
                } else {
                    i2 = 200;
                }
                d(i6, iCeil5, canvas, paint, EcgReportPrint.d, i2, iCeil2);
                e(listSubList, paint, canvas, EcgReportPrint.d, i2, i3, listF);
                pdfDocument.finishPage(pageStartPage);
                pdfDocument2 = pdfDocument;
                i3 = i6;
                listI = listI;
                size = size;
                listF = listF;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public File doInBackground(Void... voidArr) {
            try {
                PdfDocument pdfDocument = new PdfDocument();
                l(pdfDocument);
                return k(pdfDocument);
            } catch (Exception e) {
                e.printStackTrace();
                this.d = e;
                return null;
            }
        }

        public void d(int i, int i2, Canvas canvas, Paint paint, int i3, int i4, int i5) {
            float f;
            paint.setColor(Color.parseColor("#DEDEDE"));
            paint.setStrokeWidth(1.0f);
            int i6 = (i5 * 30) + 1;
            for (int i7 = 0; i7 < 176; i7++) {
                float f2 = i3 + (i7 * 11.8f);
                float f3 = i4;
                canvas.drawLine(f2, f3, f2, f3 + ((i6 - 1) * 11.8f), paint);
            }
            for (int i8 = 0; i8 < i6; i8++) {
                float f4 = i3;
                float f5 = i4 + (i8 * 11.8f);
                canvas.drawLine(f4, f5, f4 + (175 * 11.8f), f5, paint);
            }
            paint.setStrokeWidth(2.0f);
            int i9 = (i5 * 6) + 1;
            for (int i10 = 0; i10 < 36; i10++) {
                float f6 = i3 + (i10 * 59.0f);
                float f7 = i4;
                canvas.drawLine(f6, f7, f6, f7 + ((i9 - 1) * 59.0f), paint);
            }
            for (int i11 = 0; i11 < i9; i11++) {
                float f8 = i3;
                float f9 = i4 + (i11 * 59.0f);
                canvas.drawLine(f8, f9, f8 + (35 * 59.0f), f9, paint);
            }
            paint.setStrokeWidth(4.0f);
            int i12 = i5 + 1;
            float f10 = 295.0f;
            for (int i13 = 0; i13 < 8; i13++) {
                float f11 = i3 + (i13 * 295.0f);
                float f12 = i4;
                canvas.drawLine(f11, f12, f11, f12 + ((i12 - 1) * 354.0f), paint);
            }
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(32.0f);
            textPaint.setColor(Color.parseColor("#8A8A8F"));
            float f13 = 0.0f;
            int i14 = 0;
            int i15 = 0;
            while (i14 < i12) {
                float f14 = i4 + (i14 * 354.0f);
                float f15 = i3;
                float f16 = f15 + (7 * f10);
                int i16 = i14;
                canvas.drawLine(f15, f14, f16, f14, paint);
                if (i16 != 0) {
                    i15++;
                    f = f14;
                    canvas.drawText((((i - 1) * 56) + (i15 * 7)) + SOAP.XMLNS, f16 + 10.0f, f, textPaint);
                } else {
                    f = f14;
                }
                i14 = i16 + 1;
                f13 = f;
                f10 = 295.0f;
            }
            textPaint.setTextSize(32.0f);
            textPaint.setColor(Color.parseColor("#8A8A8F"));
            canvas.drawText(this.a.getContext().getString(R.string.ecg_pdf_tips, Integer.valueOf(i2), Integer.valueOf(i)), 1570.0f, f13 + 40.0f, textPaint);
            if (i == 1) {
                float f17 = i4 + 129.8f;
                paint.setStrokeWidth(3.0f);
                paint.setStyle(Paint.Style.STROKE);
                paint.setColor(Color.parseColor("#000000"));
                canvas.translate(296.5f, f17);
                Path path = new Path();
                path.lineTo(29.5f, 0.0f);
                path.lineTo(29.5f, -118.0f);
                path.lineTo(88.5f, -118.0f);
                path.lineTo(88.5f, 0.0f);
                path.lineTo(118.0f, 0.0f);
                canvas.drawPath(path, paint);
                canvas.translate(-296.5f, -f17);
            }
        }

        public void e(List<Float> list, Paint paint, Canvas canvas, int i, int i2, int i3, List<PdfBreakPoint> list2) {
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(3.0f);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(Color.parseColor("#000000"));
            canvas.translate(i, i2);
            int size = list.size();
            int iCeil = (int) Math.ceil(size / this.e);
            int i4 = 0;
            while (i4 < iCeil) {
                int i5 = this.e;
                int i6 = size - (i4 * i5);
                int i7 = i4 * i5;
                int i8 = (i6 <= 0 || i6 >= i5) ? 0 : i7 + i6;
                if (i6 >= i5) {
                    i8 = i7 + i5;
                }
                if (i6 < 0) {
                    i8 = i5 + i7 + i6;
                }
                List<Float> listSubList = list.subList(i7, i8);
                Path path = new Path();
                canvas.translate(0.0f, i4 == 0 ? 177 : 354);
                int size2 = listSubList.size();
                c(list2, canvas, i4, i3);
                for (int i9 = 0; i9 < size2; i9++) {
                    path.lineTo(i9 * this.f, -(listSubList.get(i9).floatValue() * 118.0f));
                }
                canvas.drawPath(path, paint);
                i4++;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(File file) {
            super.onPostExecute(file);
            if (file != null) {
                this.c.pdfGenerationSuccess(file);
            } else {
                this.c.pdfGenerationFailure(this.d);
            }
        }
    }

    public static final void generatePDF(EcgInfo ecgInfo, String str, PdfGenerationListener pdfGenerationListener) {
        if (Build.VERSION.SDK_INT >= 19) {
            new b(ecgInfo, str, pdfGenerationListener).execute(new Void[0]);
        } else {
            HMLog.e(a, "Generate PDF is not available for your android version.", new Object[0]);
            pdfGenerationListener.pdfGenerationFailure(new a("Generate PDF is not available for your android version."));
        }
    }
}
