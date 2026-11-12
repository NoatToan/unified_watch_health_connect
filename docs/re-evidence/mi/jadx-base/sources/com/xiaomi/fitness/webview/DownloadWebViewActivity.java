package com.xiaomi.fitness.webview;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.print.PDFPrintExtKt;
import android.widget.Button;
import androidx.core.content.FileProvider;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.webview.DownloadWebViewActivity;
import com.xiaomi.fitness.webview.pdf.Html2PDFConverter;
import defpackage.poi;
import defpackage.q1j;
import defpackage.wc0;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\b\u001a\u00020\u0005H\u0002J \u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/webview/DownloadWebViewActivity;", "Lcom/xiaomi/fitness/webview/WebViewActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "pdfPrint", "chooseOpenPDFPage", "context", "Landroid/content/Context;", "path", "", "chooseTitle", "Companion", "webview_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DownloadWebViewActivity extends WebViewActivity {

    @NotNull
    public static final String KEY_DOWNLOAD_PDF_NAME = "key_pdf_name";

    private final void chooseOpenPDFPage(Context context, String path, String chooseTitle) {
        Logger.i(PDFPrintExtKt.DOWNLOAD_TAG, "chooseOpenPDFPage(" + chooseTitle + ')');
        File file = new File(path);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(FileProvider.getUriForFile(context, FileUtils.getAuthorityFileProvider(), file), "application/pdf");
        intent.addFlags(1);
        try {
            startActivity(Intent.createChooser(intent, chooseTitle));
        } catch (ActivityNotFoundException e) {
            Logger.e(PDFPrintExtKt.DOWNLOAD_TAG, "ActivityNotFoundException", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(DownloadWebViewActivity this$0, Button it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.pdfPrint();
        return Unit.INSTANCE;
    }

    private final void pdfPrint() {
        String stringExtra = getIntent().getStringExtra(KEY_DOWNLOAD_PDF_NAME);
        if (stringExtra == null || stringExtra.length() == 0) {
            String date = TimeUtils.formatDate("yyyyMMdd", Long.valueOf(System.currentTimeMillis()));
            StringBuilder sb = new StringBuilder();
            String mTitle = getMTitle();
            if (mTitle == null) {
                mTitle = getString(q1j.f30992a);
                Intrinsics.checkNotNullExpressionValue(mTitle, "getString(...)");
            }
            sb.append(mTitle);
            sb.append('_');
            sb.append(date);
            stringExtra = sb.toString();
        }
        File externalFilesDir = getExternalFilesDir(PDFPrintExtKt.DOWNLOAD_TAG);
        if (((externalFilesDir != null ? Boolean.valueOf(externalFilesDir.exists()) : null) == null || !externalFilesDir.exists()) && externalFilesDir != null) {
            externalFilesDir.mkdirs();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null);
        sb2.append(File.separator);
        sb2.append(stringExtra);
        sb2.append(".pdf");
        final String string = sb2.toString();
        Html2PDFConverter.INSTANCE.convert2Pdf(getWebView(), string, new Function2() { // from class: a47
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DownloadWebViewActivity.pdfPrint$lambda$1(string, this, ((Boolean) obj).booleanValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pdfPrint$lambda$1(String filePath, DownloadWebViewActivity this$0, boolean z, String msg) {
        Intrinsics.checkNotNullParameter(filePath, "$filePath");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Logger.i(PDFPrintExtKt.DOWNLOAD_TAG, "convert2Pdf(" + filePath + "), success=" + z + ", msg=" + msg);
        if (z) {
            String string = this$0.getString(q1j.f);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            this$0.chooseOpenPDFPage(this$0, filePath, string);
        } else {
            ToastUtil.showLongToast(q1j.common_download_fail);
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity, com.xiaomi.fitness.webview.Hilt_WebViewActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button button = new Button(this);
        button.setContentDescription(getString(q1j.e));
        button.setBackground(getDrawable(poi.h));
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setEndView(button);
        }
        ViewExtKt.clickWithTrigger(button, 1000L, new Function1() { // from class: b47
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DownloadWebViewActivity.onCreate$lambda$0(this.f3781a, (Button) obj);
            }
        });
    }
}
