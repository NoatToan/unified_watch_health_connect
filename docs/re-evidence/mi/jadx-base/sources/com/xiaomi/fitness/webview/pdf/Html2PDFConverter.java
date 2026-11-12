package com.xiaomi.fitness.webview.pdf;

import android.print.PDFPrintExtKt;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.webkit.WebView;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u000b¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/webview/pdf/Html2PDFConverter;", "", "<init>", "()V", "convert2Pdf", "", "webView", "Landroid/webkit/WebView;", "savePath", "", "callback", "Lkotlin/Function2;", "", "webview_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Html2PDFConverter {

    @NotNull
    public static final Html2PDFConverter INSTANCE = new Html2PDFConverter();

    private Html2PDFConverter() {
    }

    public final void convert2Pdf(@NotNull WebView webView, @NotNull String savePath, @NotNull Function2<? super Boolean, ? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(savePath, "savePath");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            PrintAttributes.MediaSize mediaSize = PrintAttributes.MediaSize.ISO_A4;
            PrintAttributes printAttributesBuild = new PrintAttributes.Builder().setMediaSize(mediaSize).setResolution(new PrintAttributes.Resolution("id", "print", 500, 500)).setColorMode(2).setMinMargins(PrintAttributes.Margins.NO_MARGINS).build();
            Intrinsics.checkNotNullExpressionValue(printAttributesBuild, "build(...)");
            PageRange[] pageRangeArr = {new PageRange(0, (webView.getContentHeight() * 500) / mediaSize.getHeightMils())};
            PrintDocumentAdapter printDocumentAdapterCreatePrintDocumentAdapter = webView.createPrintDocumentAdapter();
            Intrinsics.checkNotNull(printDocumentAdapterCreatePrintDocumentAdapter);
            PDFPrintExtKt.pdfPrint(printDocumentAdapterCreatePrintDocumentAdapter, printAttributesBuild, savePath, pageRangeArr, callback);
        } catch (Exception e) {
            Logger.w(PDFPrintExtKt.DOWNLOAD_TAG, "convert2Pdf", e);
            callback.invoke(Boolean.FALSE, "convert2Pdf error(" + e.getMessage() + ')');
        }
    }
}
