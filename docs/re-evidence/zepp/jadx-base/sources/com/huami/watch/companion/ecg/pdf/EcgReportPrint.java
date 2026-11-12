package com.huami.watch.companion.ecg.pdf;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.pdf.PdfDocument;
import android.text.TextPaint;
import android.text.TextUtils;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.ecg.core.model.FilterRecord;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.ecg.R;
import com.huami.watch.companion.ecg.analytics.EcgAnalyticsManagerKt;
import com.huami.watch.util.DensityUtil;
import com.huami.watch.util.DeviceCompatibility;
import com.huami.watch.util.TimeUtil;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import io.netty.util.internal.StringUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.LongCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002JH\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0002J6\u0010\u0017\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0002J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0004H\u0002J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\bH\u0002J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0002J \u0010)\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'¨\u0006-"}, d2 = {"Lcom/huami/watch/companion/ecg/pdf/EcgReportPrint;", "", "Lcom/huami/watch/companion/ecg/pdf/EcgInfo;", "ecgInfo", "Landroid/graphics/pdf/PdfDocument;", "h", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", DTransferConstants.PAGE, "totalPage", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Paint;", "paint", "x", "y", "ch", "", "b", "", "", "ecgData", "c", "", "fileName", "pdfDocument", "Ljava/io/File;", "g", "a", "duration", GoogleApiAvailabilityLight.a, "e", "Landroid/graphics/drawable/Drawable;", "drawable", "Landroid/graphics/Bitmap;", "f", "Lcom/huami/ecg/core/db/entity/EcgData;", EcgAnalyticsManagerKt.ECG, "Lcom/huami/ecg/core/model/FilterRecord;", "record", "generatePDF", "<init>", "()V", "Companion", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
@TargetApi(19)
public final class EcgReportPrint {

    @JvmField
    public static boolean IS_EXPORT_RAW_DATA = false;

    @NotNull
    private static final String a = "Ecg-PdfReportPrint";
    private static final double b = 2479.0d;
    private static final double c = 3508.0d;
    private static final int d = 14000;
    private static final int e = 1750;
    private static final float f = 1.1811286f;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<EcgReportPrint> g = LazyKt__LazyJVMKt.lazy(a.a);

    @NotNull
    private static final Object h = new Object();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0007\u001a\u00020\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/huami/watch/companion/ecg/pdf/EcgReportPrint$Companion;", "", "Lcom/huami/watch/companion/ecg/pdf/EcgReportPrint;", "instance$delegate", "Lkotlin/Lazy;", "getInstance", "()Lcom/huami/watch/companion/ecg/pdf/EcgReportPrint;", DefaultSettingsSpiCall.n, "mSyncObj", "Ljava/lang/Object;", "getMSyncObj", "()Ljava/lang/Object;", "", "IS_EXPORT_RAW_DATA", "Z", "", "LINE_MAX_POINT", LogUtil.I, "PAGE_MAX_POINT", "", "PDF_PAGE_HEIGHT", LogUtil.D, "PDF_PAGE_WIDTH", "", "SMALL_BOX_STEP", "F", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EcgReportPrint getInstance() {
            return (EcgReportPrint) EcgReportPrint.g.getValue();
        }

        @NotNull
        public final Object getMSyncObj() {
            return EcgReportPrint.h;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watch/companion/ecg/pdf/EcgReportPrint;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<EcgReportPrint> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EcgReportPrint invoke() {
            return new EcgReportPrint();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ File a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(File file) {
            super(0);
            this.a = file;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("心电文件路径：", this.a.getAbsolutePath());
        }
    }

    private final String a(EcgInfo ecgInfo) {
        String dateTime = TimeUtil.formatDateTime(ecgInfo.getTimeStamps() * ((long) 1000), "yyyyMMddHHmm");
        return ecgInfo.isOneself() ? ecgInfo.getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String().getString(R.string.ecg_pdf_filename_self, ecgInfo.getName(), dateTime) : ecgInfo.getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String().getString(R.string.ecg_pdf_filename_other, dateTime);
    }

    private final void b(Context context, int page, int totalPage, Canvas canvas, Paint paint, int x, int y, int ch) {
        float f2;
        float f3;
        float f4;
        float f5;
        paint.setColor(Color.parseColor("#DEDEDE"));
        paint.setStrokeWidth(DensityUtil.dpToPx(context, 0.5f));
        int i = (ch * 30) + 1;
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            f2 = x;
            float f6 = f2 + (i2 * 11.8f);
            f3 = y;
            canvas.drawLine(f6, f3, f6, f3 + ((i - 1) * 11.8f), paint);
            if (i3 >= 176) {
                break;
            } else {
                i2 = i3;
            }
        }
        if (i > 0) {
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                float f7 = f3 + (i4 * 11.8f);
                canvas.drawLine(f2, f7, f2 + (175 * 11.8f), f7, paint);
                if (i5 >= i) {
                    break;
                } else {
                    i4 = i5;
                }
            }
        }
        paint.setStrokeWidth(DensityUtil.dpToPx(context, 1.0f));
        int i6 = (ch * 6) + 1;
        int i7 = 0;
        while (true) {
            int i8 = i7 + 1;
            float f8 = f2 + (i7 * 59.0f);
            canvas.drawLine(f8, f3, f8, f3 + ((i6 - 1) * 59.0f), paint);
            if (i8 >= 36) {
                break;
            } else {
                i7 = i8;
            }
        }
        if (i6 > 0) {
            int i9 = 0;
            while (true) {
                int i10 = i9 + 1;
                float f9 = f3 + (i9 * 59.0f);
                canvas.drawLine(f2, f9, f2 + (35 * 59.0f), f9, paint);
                if (i10 >= i6) {
                    break;
                } else {
                    i9 = i10;
                }
            }
        }
        paint.setStrokeWidth(DensityUtil.dpToPx(context, 1.5f));
        int i11 = ch + 1;
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            float f10 = f2 + (i12 * 295.0f);
            canvas.drawLine(f10, f3, f10, f3 + ((i11 - 1) * 354.0f), paint);
            if (i13 >= 8) {
                break;
            } else {
                i12 = i13;
            }
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(32.0f);
        textPaint.setColor(Color.parseColor("#8A8A8F"));
        if (i11 > 0) {
            int i14 = 0;
            int i15 = 0;
            while (true) {
                int i16 = i14 + 1;
                float f11 = f3 + (i14 * 354.0f);
                float f12 = f2 + (7 * 295.0f);
                int i17 = i14;
                canvas.drawLine(f2, f11, f12, f11, paint);
                if (i17 != 0) {
                    i15++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(((page - 1) * 56) + (i15 * 7));
                    sb.append('s');
                    f5 = f11;
                    canvas.drawText(sb.toString(), f12 + 10, f5, textPaint);
                } else {
                    f5 = f11;
                }
                if (i16 >= i11) {
                    break;
                } else {
                    i14 = i16;
                }
            }
            f4 = f5;
        } else {
            f4 = 0.0f;
        }
        textPaint.setTextSize(32.0f);
        textPaint.setColor(Color.parseColor("#8A8A8F"));
        canvas.drawText(context.getString(R.string.ecg_pdf_remark, Integer.valueOf(totalPage), Integer.valueOf(page)), 1570.0f, f4 + 40, textPaint);
        if (page == 1) {
            paint.setStrokeWidth(3.0f);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(Color.parseColor("#000000"));
            canvas.translate(296.5f, 646.0f);
            Path path = new Path();
            path.lineTo(29.5f, 0.0f);
            path.lineTo(29.5f, -118.0f);
            path.lineTo(88.5f, -118.0f);
            path.lineTo(88.5f, 0.0f);
            path.lineTo(118.0f, 0.0f);
            canvas.drawPath(path, paint);
            canvas.translate(-296.5f, -646.0f);
        }
    }

    private final void c(List<Float> ecgData, Paint paint, Canvas canvas, int x, int y) {
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(3.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.parseColor("#000000"));
        canvas.translate(x, y);
        int size = ecgData.size();
        int i = e;
        int iCeil = (int) Math.ceil(size / e);
        if (iCeil <= 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            int i4 = i2 * e;
            int i5 = size - i4;
            int i6 = 1 <= i5 && i5 < i ? i4 + i5 : 0;
            if (i5 >= i) {
                i6 = i4 + e;
            }
            if (i5 < 0) {
                i6 = i4 + e + i5;
            }
            List<Float> listSubList = ecgData.subList(i4, i6);
            Path path = new Path();
            canvas.translate(0.0f, i2 == 0 ? 177.0f : 354.0f);
            int size2 = listSubList.size();
            if (size2 > 0) {
                int i7 = 0;
                while (true) {
                    int i8 = i7 + 1;
                    float fFloatValue = listSubList.get(i7).floatValue();
                    if (!(-1.5f <= fFloatValue && fFloatValue <= 1.5f)) {
                        fFloatValue = fFloatValue > 0.0f ? 1.5f : -1.5f;
                    }
                    path.lineTo(i7 * f, -(fFloatValue * 118));
                    if (i8 >= size2) {
                        break;
                    } else {
                        i7 = i8;
                    }
                }
            }
            canvas.drawPath(path, paint);
            if (i3 >= iCeil) {
                return;
            }
            i2 = i3;
            i = e;
        }
    }

    private final String d(Context context, int duration) {
        int i = duration / 60;
        int i2 = duration % 60;
        return i + StringUtil.SPACE + context.getString(i > 1 ? R.string.unit_minutes : R.string.unit_minute) + StringUtil.SPACE + i2 + StringUtil.SPACE + context.getString(i2 > 1 ? R.string.unit_seconds : R.string.unit_second);
    }

    private final String e(Context context) {
        try {
            return context.getResources().getString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.labelRes);
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    private final Bitmap f(Drawable drawable) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    private final File g(Context context, String fileName, PdfDocument pdfDocument) throws IOException {
        File file;
        FileOutputStream fileOutputStream = null;
        try {
            if (TextUtils.isEmpty(fileName)) {
                file = File.createTempFile(LongCompanionObject.INSTANCE.toString(), System.currentTimeMillis() + ".pdf");
            } else {
                file = new File(context.getExternalFilesDir(null), fileName);
            }
            boolean zExists = file.exists();
            if (zExists) {
                zExists = !file.delete();
            }
            if (!zExists) {
                zExists = file.createNewFile();
            }
            if (zExists) {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    pdfDocument.writeTo(fileOutputStream2);
                    fileOutputStream2.close();
                    pdfDocument.close();
                    fileOutputStream = fileOutputStream2;
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    HMLog.e(a, "写入心电pdf文件异常", e);
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw e;
                }
            }
            HMLog.info(a, new b(file));
            return file;
        } catch (IOException e3) {
            e = e3;
        }
    }

    private final PdfDocument h(EcgInfo ecgInfo) {
        int iCeil;
        int i;
        int iCeil2;
        int i2;
        EcgReportPrint ecgReportPrint;
        int i3;
        PdfDocument pdfDocument = new PdfDocument();
        List<Float> ecgData = ecgInfo.getEcgData();
        int size = ecgData.size();
        double dCeil = Math.ceil(size / 250.0f);
        int iCeil3 = (int) Math.ceil(ecgInfo.getRawDataLength() / 250.0f);
        int iCeil4 = (int) Math.ceil(dCeil / ((double) 56.0f));
        Paint paint = new Paint();
        if (iCeil4 <= 0) {
            return pdfDocument;
        }
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            int i6 = i4 * 14000;
            int i7 = size - i6;
            if (1 <= i7 && i7 < 14000) {
                i = i6 + i7;
                iCeil = (int) Math.ceil(i7 / 1750.0f);
            } else {
                iCeil = 0;
                i = 0;
            }
            if (i7 >= 14000) {
                i = i6 + 14000;
                iCeil = 8;
            }
            if (i7 < 0) {
                i = i6 + 14000 + i7;
                iCeil2 = (int) Math.ceil((i7 + 14000) / 1750.0f);
            } else {
                iCeil2 = iCeil;
            }
            List<Float> listSubList = ecgData.subList(i6, i);
            PdfDocument.Page pageStartPage = pdfDocument.startPage(new PdfDocument.PageInfo.Builder(2479, 3508, i5).create());
            Canvas canvas = pageStartPage.getCanvas();
            if (i4 == 0) {
                TextPaint textPaint = new TextPaint();
                textPaint.setColor(Color.parseColor("#8A8A8F"));
                textPaint.setTextSize(40.0f);
                String string = ecgInfo.getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String().getString(R.string.ecg_pdf_basic_info);
                canvas.drawText(string, 208.0f, 133.0f, textPaint);
                Rect rect = new Rect();
                textPaint.getTextBounds(string, 0, string.length(), rect);
                int iHeight = rect.height();
                canvas.drawText(ecgInfo.getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String().getString(R.string.ecg_pdf_ecg_info), 923.0f, 133.0f, textPaint);
                textPaint.setColor(Color.parseColor("#000000"));
                textPaint.setFakeBoldText(true);
                String string2 = ecgInfo.getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String().getString(R.string.ecg_pdf_user_name);
                Rect rect2 = new Rect();
                textPaint.getTextBounds(string2, 0, string2.length(), rect2);
                int iHeight2 = rect2.height();
                int iWidth = rect2.width();
                float f2 = iHeight + 153;
                canvas.drawText(string2, 208.0f, f2, textPaint);
                textPaint.setFakeBoldText(false);
                float f3 = iWidth;
                float f4 = 213.0f + f3;
                canvas.drawText(ecgInfo.getName(), f4, f2, textPaint);
                String string3 = ecgInfo.getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String().getString(R.string.ecg_pdf_measure_time);
                Rect rect3 = new Rect();
                textPaint.setFakeBoldText(true);
                textPaint.getTextBounds(string3, 0, string3.length(), rect3);
                int iWidth2 = rect3.width();
                canvas.drawText(string3, 923.0f, f2, textPaint);
                textPaint.setFakeBoldText(false);
                float f5 = iWidth2 + 928.0f;
                canvas.drawText(TimeUtil.formatDateTime(((long) 1000) * ecgInfo.getTimeStamps(), "yyyy-MM-dd HH:mm"), f5, f2, textPaint);
                int i8 = iHeight2 + DataTypeSource.SPORT_TYPE_CHESS + iHeight2;
                String string4 = ecgInfo.getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String().getString(R.string.ecg_pdf_user_gender);
                textPaint.setFakeBoldText(true);
                float f6 = i8;
                canvas.drawText(string4, 208.0f, f6, textPaint);
                textPaint.setFakeBoldText(false);
                String string5 = ecgInfo.getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String().getString(ecgInfo.getGender() == 0 ? R.string.ecg_pdf_gender_female : R.string.ecg_pdf_gender_male);
                if (!ecgInfo.isOneself()) {
                    string5 = "--";
                }
                Rect rect4 = new Rect();
                textPaint.getTextBounds(string5, 0, string5.length(), rect4);
                int iWidth3 = rect4.width();
                canvas.drawText(string5, f4, f6, textPaint);
                textPaint.setFakeBoldText(true);
                float f7 = 312.0f + f3;
                canvas.drawText(ecgInfo.getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String().getString(R.string.ecg_pdf_user_age), iWidth3 + f7, f6, textPaint);
                textPaint.setFakeBoldText(false);
                i2 = i5;
                String string6 = ecgInfo.getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String().getString(R.string.ecg_pdf_user_age_info, String.valueOf(ecgInfo.getAge()));
                if (!ecgInfo.isOneself()) {
                    string6 = "--";
                }
                canvas.drawText(string6, iWidth3 + iWidth + iWidth + 317.0f, f6, textPaint);
                String string7 = ecgInfo.getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String().getString(R.string.ecg_pdf_duration);
                textPaint.setFakeBoldText(true);
                canvas.drawText(string7, 923.0f, f6, textPaint);
                textPaint.setFakeBoldText(false);
                ecgReportPrint = this;
                canvas.drawText(ecgReportPrint.d(ecgInfo.getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String(), iCeil3), f5, f6, textPaint);
                String string8 = ecgInfo.getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String().getString(R.string.ecg_pdf_user_height);
                textPaint.setFakeBoldText(true);
                float f8 = iHeight2 + 193 + iHeight2 + iHeight2;
                canvas.drawText(string8, 208.0f, f8, textPaint);
                textPaint.setFakeBoldText(false);
                String str = ecgInfo.getHeight() + "cm";
                if (!ecgInfo.isOneself()) {
                    str = "--";
                }
                int iMeasureText = (int) textPaint.measureText(str);
                canvas.drawText(str, f4, f8, textPaint);
                textPaint.setFakeBoldText(true);
                float f9 = iMeasureText;
                canvas.drawText(ecgInfo.getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String().getString(R.string.ecg_pdf_user_weight), f7 + f9, f8, textPaint);
                textPaint.setFakeBoldText(false);
                canvas.drawText(!ecgInfo.isOneself() ? "--" : ecgInfo.getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String().getString(R.string.ecg_pdf_user_weight_info, String.valueOf(ecgInfo.getWeight())), 317.0f + f3 + f9 + f3, f8, textPaint);
                String string9 = ecgInfo.getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String().getString(R.string.ecg_pdf_avg_hr);
                textPaint.setFakeBoldText(true);
                canvas.drawText(string9, 923.0f, f8, textPaint);
                textPaint.setFakeBoldText(false);
                canvas.drawText(ecgInfo.getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String().getString(R.string.ecg_pdf_avg_hr_info, Integer.valueOf(ecgInfo.getAvgHr())), f5, f8, textPaint);
                Bitmap bitmapF = ecgReportPrint.f(ecgInfo.getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String().getApplicationInfo().loadIcon(ecgInfo.getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String().getPackageManager()));
                RectF rectF = new RectF(1894.0f, 136.0f, 1982.0f, 224.0f);
                if (bitmapF != null) {
                    canvas.drawBitmap(bitmapF, (Rect) null, rectF, paint);
                    Unit unit = Unit.INSTANCE;
                }
                textPaint.setTextSize(68.0f);
                canvas.drawText(ecgReportPrint.e(ecgInfo.getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String()), 2002.0f, 200.0f, textPaint);
                String string10 = ecgInfo.getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String().getString(R.string.ecg_pdf_gain);
                textPaint.setTextSize(32.0f);
                textPaint.setColor(Color.parseColor("#8A8A8F"));
                canvas.drawText(string10, 1735.0f, 404.0f, textPaint);
                i3 = 430;
            } else {
                i2 = i5;
                ecgReportPrint = this;
                i3 = 200;
            }
            int i9 = i2;
            b(ecgInfo.getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String(), i2, iCeil4, canvas, paint, 208, i3, iCeil2);
            c(listSubList, paint, canvas, 208, i3);
            PdfDocument pdfDocument2 = pdfDocument;
            pdfDocument2.finishPage(pageStartPage);
            int i10 = iCeil4;
            if (i9 >= i10) {
                return pdfDocument2;
            }
            iCeil4 = i10;
            ecgData = ecgData;
            size = size;
            pdfDocument = pdfDocument2;
            i4 = i9;
        }
    }

    @Nullable
    public final File generatePDF(@NotNull Context context, @NotNull EcgData ecg, @NotNull FilterRecord record) {
        synchronized (h) {
            if (!DeviceCompatibility.isKitkat()) {
                HMLog.e(a, "Generate PDF is not available for your android version.", new Object[0]);
                return null;
            }
            EcgInfo ecgInfo = new EcgInfo(context, ecg, record, IS_EXPORT_RAW_DATA);
            try {
                return g(context, a(ecgInfo), h(ecgInfo));
            } catch (Exception e2) {
                HMLog.e(a, e2.getMessage(), e2);
                return null;
            }
        }
    }
}
