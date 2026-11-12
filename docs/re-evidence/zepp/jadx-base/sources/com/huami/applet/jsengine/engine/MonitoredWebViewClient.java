package com.huami.applet.jsengine.engine;

import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.applet.ConstantKt;
import com.huami.applet.extension.Otherwise;
import com.huami.applet.extension.WithData;
import com.huami.applet.jsengine.exception.JavascriptException;
import com.huami.applet.jsengine.monitor.JsEngineEventHandler;
import com.huami.tools.log.HMLog;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J-\u0010\r\u001a\u00020\u000b2%\b\u0002\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006J&\u0010\u0014\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0017J\u001c\u0010\u0016\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0016J\u001c\u0010\u0018\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u0019\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR3\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/huami/applet/jsengine/engine/MonitoredWebViewClient;", "Landroid/webkit/WebViewClient;", "Landroid/webkit/RenderProcessGoneDetail;", "renderProcessGoneDetail", "", "a", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "status", "", "onLoadSuccessListener", "setOnLoadSuccessListener", "Landroid/webkit/WebView;", ViewHierarchyConstants.VIEW_KEY, "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceError;", "error", "onReceivedError", "url", "onPageFinished", "detail", "onRenderProcessGone", "shouldOverrideUrlLoading", "Lcom/huami/applet/jsengine/monitor/JsEngineEventHandler;", "Lcom/huami/applet/jsengine/monitor/JsEngineEventHandler;", "jsEngineEventHandler", "b", "Z", "loadSuccess", "c", "Lkotlin/jvm/functions/Function1;", "<init>", "(Lcom/huami/applet/jsengine/monitor/JsEngineEventHandler;)V", "applet_release"}, k = 1, mv = {1, 5, 1})
public final class MonitoredWebViewClient extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final JsEngineEventHandler jsEngineEventHandler;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean loadSuccess;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Function1<? super Boolean, Unit> onLoadSuccessListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ WebResourceRequest a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WebResourceRequest webResourceRequest) {
            super(0);
            this.a = webResourceRequest;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            WebResourceRequest webResourceRequest = this.a;
            sb.append(webResourceRequest == null ? null : webResourceRequest.getUrl());
            sb.append("：加载失败");
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "shouldOverrideUrlLoading";
        }
    }

    public MonitoredWebViewClient(@NotNull JsEngineEventHandler jsEngineEventHandler) {
        this.jsEngineEventHandler = jsEngineEventHandler;
    }

    private final String a(RenderProcessGoneDetail renderProcessGoneDetail) {
        if (Build.VERSION.SDK_INT < 26) {
            return "WebView process has been crashed or killed. " + Arrays.toString(Thread.currentThread().getStackTrace());
        }
        if (!renderProcessGoneDetail.didCrash()) {
            return "WebView process has been killed";
        }
        return "WebView process has been crashed. " + Arrays.toString(Thread.currentThread().getStackTrace());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setOnLoadSuccessListener$default(MonitoredWebViewClient monitoredWebViewClient, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        monitoredWebViewClient.setOnLoadSuccessListener(function1);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(@Nullable WebView view, @Nullable String url) {
        Unit unit;
        super.onPageFinished(view, url);
        if (!this.loadSuccess) {
            Otherwise otherwise = Otherwise.INSTANCE;
            return;
        }
        Function1<? super Boolean, Unit> function1 = this.onLoadSuccessListener;
        if (function1 == null) {
            unit = null;
        } else {
            function1.invoke(Boolean.TRUE);
            unit = Unit.INSTANCE;
        }
        new WithData(unit);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(21)
    public void onReceivedError(@Nullable WebView view, @Nullable WebResourceRequest request, @Nullable WebResourceError error) {
        super.onReceivedError(view, request, error);
        this.loadSuccess = false;
        Function1<? super Boolean, Unit> function1 = this.onLoadSuccessListener;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        HMLog.warn$default(ConstantKt.TAG_WEB_VIEW, null, new a(request), 2, null);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(@Nullable WebView view, @Nullable RenderProcessGoneDetail detail) {
        String strA;
        String str = "WebView crash";
        if (detail != null && (strA = a(detail)) != null) {
            str = strA;
        }
        this.jsEngineEventHandler.onUncaughtJavascriptError(new JavascriptException(str, Integer.parseInt(ConstantKt.CODE_SYSTEM)));
        HMLog.error$default(ConstantKt.TAG_APPLET, ConstantKt.CODE_SYSTEM, null, new b(str), 4, null);
        return super.onRenderProcessGone(view, detail);
    }

    public final void setOnLoadSuccessListener(@Nullable Function1<? super Boolean, Unit> onLoadSuccessListener) {
        this.onLoadSuccessListener = onLoadSuccessListener;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(@Nullable WebView view, @Nullable WebResourceRequest request) {
        HMLog.info(ConstantKt.TAG_APPLET, c.a);
        return super.shouldOverrideUrlLoading(view, request);
    }
}
