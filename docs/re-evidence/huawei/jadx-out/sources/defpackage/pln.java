package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.print.PrintManager;
import android.print.pdf.PrintedPdfDocument;
import android.text.TextUtils;
import androidx.print.PrintHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsocialshare.R;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes15.dex */
public class pln {
    private static gxt d;

    pln(gxt gxtVar) {
        d = gxtVar;
    }

    public void a(Activity activity) {
        gxt gxtVar = d;
        if (gxtVar == null || activity == null) {
            LogUtil.e("Share_PrintOrSavePdfInteractor", "createPdfDocument shareContent/activity is null");
            return;
        }
        if (njy.e(gxtVar.n())) {
            LogUtil.e("Share_PrintOrSavePdfInteractor", "createPdfDocument SaveFileImages is null");
            return;
        }
        Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("application/pdf");
        if (!TextUtils.isEmpty(d.p())) {
            LogUtil.a("Share_PrintOrSavePdfInteractor", "createPdfDocument shareTitleContent = ", d.p());
            intent.putExtra("android.intent.extra.TITLE", d.p());
        }
        intent.putExtra("android.provider.extra.INITIAL_URI", Uri.parse("content://com.android.externalstorage.documents/document"));
        activity.startActivityForResult(intent, 5);
    }

    public static void e(Context context, Intent intent) {
        final OutputStream outputStreamOpenOutputStream;
        if (intent == null) {
            LogUtil.e("Share_PrintOrSavePdfInteractor", "writeBitmapToPdf intent is null.");
            return;
        }
        Uri data = intent.getData();
        if (data == null) {
            LogUtil.e("Share_PrintOrSavePdfInteractor", "writeBitmapToPdf uri is null");
            return;
        }
        LogUtil.a("Share_PrintOrSavePdfInteractor", "writeBitmapToPdf File uri is: ", data.toString());
        try {
            outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(data);
        } catch (IOException unused) {
            LogUtil.e("Share_PrintOrSavePdfInteractor", "writeBitmapToPdf Failed to generate the PDF outputStream");
            outputStreamOpenOutputStream = null;
        }
        final PdfDocument pdfDocumentE = e();
        ThreadPoolManager.c().execute(new Runnable() { // from class: plv
            @Override // java.lang.Runnable
            public final void run() {
                pln.a(pdfDocumentE, outputStreamOpenOutputStream);
            }
        });
    }

    static /* synthetic */ void a(PdfDocument pdfDocument, OutputStream outputStream) {
        try {
            pdfDocument.writeTo(outputStream);
        } catch (IOException unused) {
            LogUtil.e("Share_PrintOrSavePdfInteractor", "writePdf PDF CREATE FAIL");
        } finally {
            pdfDocument.close();
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException unused2) {
                    LogUtil.e("Share_PrintOrSavePdfInteractor", "writePdf Pdf create error");
                }
            }
        }
    }

    private static PdfDocument e() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = d.n().iterator();
        while (it.hasNext()) {
            arrayList.add(qqf.a(it.next()));
        }
        int widthMils = (PrintAttributes.MediaSize.ISO_A4.getWidthMils() * 72) / 1000;
        float width = widthMils / ((Bitmap) arrayList.get(0)).getWidth();
        int height = (int) (((Bitmap) arrayList.get(0)).getHeight() * width);
        Matrix matrix = new Matrix();
        matrix.postScale(width, width);
        Paint paint = new Paint(1);
        PdfDocument pdfDocument = new PdfDocument();
        for (int i = 0; i < arrayList.size(); i++) {
            PdfDocument.Page pageStartPage = pdfDocument.startPage(new PdfDocument.PageInfo.Builder(widthMils, height, i).create());
            pageStartPage.getCanvas().drawBitmap((Bitmap) arrayList.get(i), matrix, paint);
            pdfDocument.finishPage(pageStartPage);
        }
        return pdfDocument;
    }

    public void a(Context context) {
        gxt gxtVar = d;
        if (gxtVar == null || context == null) {
            LogUtil.e("Share_PrintOrSavePdfInteractor", "printBitmap fail:mShareContent/mContext is null");
            return;
        }
        if (njy.e(gxtVar.n())) {
            LogUtil.e("Share_PrintOrSavePdfInteractor", "printBitmap SaveFileImages is null");
            return;
        }
        String str = context.getString(R.string.IDS_app_name_health) + " Physical examination.pdf";
        if (!TextUtils.isEmpty(d.p())) {
            str = d.p() + ".pdf";
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = d.n().iterator();
        while (it.hasNext()) {
            arrayList.add(qqf.a(it.next()));
        }
        if (arrayList.size() == 1) {
            PrintHelper printHelper = new PrintHelper(context);
            printHelper.setScaleMode(1);
            printHelper.printBitmap(str, (Bitmap) arrayList.get(0));
            return;
        }
        ((PrintManager) context.getSystemService("print")).print(str, new b(context, arrayList, str), null);
    }

    static class b extends PrintDocumentAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f45608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f45609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ArrayList<Bitmap> f45610c;
        private String d;
        private PdfDocument e;
        private int h;
        private int j;

        b(Context context, ArrayList<Bitmap> arrayList, String str) {
            this.f45608a = context;
            this.f45610c = arrayList;
            this.d = str;
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(PrintAttributes printAttributes, final PrintAttributes printAttributes2, final CancellationSignal cancellationSignal, final PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: plu
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45621c.b(printAttributes2, cancellationSignal, layoutResultCallback);
                }
            });
        }

        /* synthetic */ void b(PrintAttributes printAttributes, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback) {
            this.e = new PrintedPdfDocument(this.f45608a, printAttributes);
            this.f45609b = (PrintAttributes.MediaSize.ISO_A4.getHeightMils() * 72) / 1000;
            this.j = (PrintAttributes.MediaSize.ISO_A4.getWidthMils() * 72) / 1000;
            if (cancellationSignal.isCanceled()) {
                layoutResultCallback.onLayoutCancelled();
                LogUtil.j("Share_PrintOrSavePdfInteractor", "SharePrintDocumentAdapter onLayout cancellationSignal.isCanceled()");
                return;
            }
            int size = this.f45610c.size();
            this.h = size;
            if (size <= 1) {
                layoutResultCallback.onLayoutFailed("onLayout Page count is zero.");
            }
            layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.d).setContentType(0).setPageCount(this.h).build(), true);
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(final PageRange[] pageRangeArr, final ParcelFileDescriptor parcelFileDescriptor, final CancellationSignal cancellationSignal, final PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: pls
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45616c.a(pageRangeArr, cancellationSignal, writeResultCallback, parcelFileDescriptor);
                }
            });
        }

        /* synthetic */ void a(PageRange[] pageRangeArr, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback, ParcelFileDescriptor parcelFileDescriptor) {
            for (int i = 0; i < this.h; i++) {
                try {
                    if (c(pageRangeArr, i)) {
                        PdfDocument.Page pageStartPage = this.e.startPage(new PdfDocument.PageInfo.Builder(this.j, this.f45609b, i).create());
                        if (cancellationSignal.isCanceled()) {
                            writeResultCallback.onWriteCancelled();
                            this.e.close();
                            this.e = null;
                            LogUtil.j("Share_PrintOrSavePdfInteractor", "SharePrintDocumentAdapter onWrite cancellationSignal.isCanceled()");
                            return;
                        }
                        a(pageStartPage, i);
                        this.e.finishPage(pageStartPage);
                    }
                } catch (Throwable th) {
                    this.e.close();
                    this.e = null;
                    throw th;
                }
            }
            try {
                this.e.writeTo(new FileOutputStream(parcelFileDescriptor.getFileDescriptor()));
                this.e.close();
                this.e = null;
                writeResultCallback.onWriteFinished(pageRangeArr);
            } catch (IOException e) {
                writeResultCallback.onWriteFailed(e.toString());
                LogUtil.e("Share_PrintOrSavePdfInteractor", "SharePrintDocumentAdapter onWrite e: ", e.getMessage());
                this.e.close();
                this.e = null;
            }
        }

        private boolean c(PageRange[] pageRangeArr, int i) {
            for (PageRange pageRange : pageRangeArr) {
                if (i >= pageRange.getStart() && i <= pageRange.getEnd()) {
                    return true;
                }
            }
            return false;
        }

        private void a(PdfDocument.Page page, int i) {
            Canvas canvas = page.getCanvas();
            if (njy.e(this.f45610c)) {
                LogUtil.e("Share_PrintOrSavePdfInteractor", "SharePrintDocumentAdapter drawPage bitmaps is null");
                return;
            }
            Paint paint = new Paint();
            Bitmap bitmap = this.f45610c.get(i);
            if (bitmap == null) {
                LogUtil.e("Share_PrintOrSavePdfInteractor", "SharePrintDocumentAdapter drawPage bitmap is null, pageNumber: ", Integer.valueOf(i));
                return;
            }
            float width = this.j / bitmap.getWidth();
            Matrix matrix = new Matrix();
            matrix.postScale(width, width);
            canvas.drawBitmap(bitmap, matrix, paint);
        }
    }
}
