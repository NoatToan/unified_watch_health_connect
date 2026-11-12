package com.xiaomi.fitness.nfc.ui.realname;

import android.content.Context;
import android.webkit.JavascriptInterface;
import defpackage.kad;
import defpackage.uwc;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/realname/RealNameJavaScriptImpl;", "Lkad;", "", "exitPage", "()V", "", "getCplc", "()Ljava/lang/String;", "Luwc;", "mIRealNameWebView", "Luwc;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Luwc;)V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class RealNameJavaScriptImpl extends kad {

    @NotNull
    private final uwc mIRealNameWebView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealNameJavaScriptImpl(@NotNull Context context, @NotNull uwc mIRealNameWebView) {
        super(context, mIRealNameWebView);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mIRealNameWebView, "mIRealNameWebView");
        this.mIRealNameWebView = mIRealNameWebView;
    }

    @Override // defpackage.kad
    @JavascriptInterface
    public void exitPage() {
        this.mIRealNameWebView.finishFromWeb();
    }

    @JavascriptInterface
    @NotNull
    public final String getCplc() {
        String cplc = this.mIRealNameWebView.getCplc();
        Intrinsics.checkNotNullExpressionValue(cplc, "getCplc(...)");
        return cplc;
    }
}
