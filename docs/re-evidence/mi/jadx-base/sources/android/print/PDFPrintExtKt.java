package android.print;

import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import com.xiaomi.fitness.common.log.Logger;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aG\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\u0010\u000e\u001aA\u0010\u000f\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\fH\u0002¢\u0006\u0002\u0010\u0010\u001a\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"DOWNLOAD_TAG", "", "pdfPrint", "", "Landroid/print/PrintDocumentAdapter;", "printAttributes", "Landroid/print/PrintAttributes;", "savePath", "mRanges", "", "Landroid/print/PageRange;", "callback", "Lkotlin/Function2;", "", "(Landroid/print/PrintDocumentAdapter;Landroid/print/PrintAttributes;Ljava/lang/String;[Landroid/print/PageRange;Lkotlin/jvm/functions/Function2;)V", "startWrite", "(Landroid/print/PrintDocumentAdapter;Ljava/lang/String;[Landroid/print/PageRange;Lkotlin/jvm/functions/Function2;)V", "getOutputFile", "Landroid/os/ParcelFileDescriptor;", "filePath", "webview_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PDFPrintExtKt {

    @NotNull
    public static final String DOWNLOAD_TAG = "DownloadWebView";

    private static final ParcelFileDescriptor getOutputFile(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            return ParcelFileDescriptor.open(file, 805306368);
        } catch (Exception e) {
            Logger.w(DOWNLOAD_TAG, "getOutputFile", e);
            return null;
        }
    }

    public static final void pdfPrint(@NotNull final PrintDocumentAdapter printDocumentAdapter, @NotNull PrintAttributes printAttributes, @NotNull final String savePath, @NotNull final PageRange[] mRanges, @NotNull final Function2<? super Boolean, ? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(printDocumentAdapter, "<this>");
        Intrinsics.checkNotNullParameter(printAttributes, "printAttributes");
        Intrinsics.checkNotNullParameter(savePath, "savePath");
        Intrinsics.checkNotNullParameter(mRanges, "mRanges");
        Intrinsics.checkNotNullParameter(callback, "callback");
        printDocumentAdapter.onLayout(null, printAttributes, null, new PrintDocumentAdapter.LayoutResultCallback() { // from class: android.print.PDFPrintExtKt.pdfPrint.1
            @Override // android.print.PrintDocumentAdapter.LayoutResultCallback
            public void onLayoutCancelled() {
                super.onLayoutCancelled();
                callback.invoke(Boolean.FALSE, "pdfPrint: onLayoutCancelled");
            }

            @Override // android.print.PrintDocumentAdapter.LayoutResultCallback
            public void onLayoutFailed(CharSequence error) {
                super.onLayoutFailed(error);
                callback.invoke(Boolean.FALSE, "pdfPrint: onLayoutFailed(" + ((Object) error) + ')');
            }

            @Override // android.print.PrintDocumentAdapter.LayoutResultCallback
            public void onLayoutFinished(PrintDocumentInfo info, boolean changed) {
                super.onLayoutFinished(info, changed);
                Logger.w(PDFPrintExtKt.DOWNLOAD_TAG, "pdfPrint: onLayoutFinished, changed(" + changed + ')');
                PDFPrintExtKt.startWrite(printDocumentAdapter, savePath, mRanges, callback);
            }
        }, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startWrite(PrintDocumentAdapter printDocumentAdapter, String str, PageRange[] pageRangeArr, final Function2<? super Boolean, ? super String, Unit> function2) {
        ParcelFileDescriptor outputFile = getOutputFile(str);
        if (outputFile == null) {
            function2.invoke(Boolean.FALSE, "getOutputFile error");
        } else {
            printDocumentAdapter.onWrite(pageRangeArr, outputFile, new CancellationSignal(), new PrintDocumentAdapter.WriteResultCallback() { // from class: android.print.PDFPrintExtKt.startWrite.1
                @Override // android.print.PrintDocumentAdapter.WriteResultCallback
                public void onWriteCancelled() {
                    super.onWriteCancelled();
                    function2.invoke(Boolean.FALSE, "startWrite: onWriteCancelled");
                }

                @Override // android.print.PrintDocumentAdapter.WriteResultCallback
                public void onWriteFailed(CharSequence error) {
                    super.onWriteFailed(error);
                    function2.invoke(Boolean.FALSE, "startWrite: onWriteFailed(" + ((Object) error) + ')');
                }

                @Override // android.print.PrintDocumentAdapter.WriteResultCallback
                public void onWriteFinished(PageRange[] pages) {
                    super.onWriteFinished(pages);
                    Logger.i(PDFPrintExtKt.DOWNLOAD_TAG, "startWrite: onWriteFinished");
                    Function2<Boolean, String, Unit> function3 = function2;
                    boolean z = false;
                    if (pages != null) {
                        if (!(pages.length == 0)) {
                            z = true;
                        }
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    StringBuilder sb = new StringBuilder();
                    sb.append("onWriteFinished(");
                    sb.append(pages != null ? Integer.valueOf(pages.length) : null);
                    sb.append(')');
                    function3.invoke(boolValueOf, sb.toString());
                }
            });
        }
    }
}
