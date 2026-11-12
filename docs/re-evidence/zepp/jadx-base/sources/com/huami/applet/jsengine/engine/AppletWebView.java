package com.huami.applet.jsengine.engine;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.applet.ConstantKt;
import com.huami.applet.extension.ContextExtKt;
import com.huami.applet.jsengine.engine.AppletWebView;
import com.huami.applet.jsengine.monitor.JsEngineAnalyticsInterface;
import com.huami.applet.jsengine.monitor.JsEngineEventHandler;
import com.huami.applet.jsengine.plugin.AppletPlugin;
import com.huami.applet.jsengine.plugin.JavascriptExecuteInterface;
import com.huami.applet.utils.UtilsKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xmlywind.sdk.common.mta.PointCategory;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\f\u001a\u00020\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u0014\b\u0002\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!¢\u0006\u0004\b/\u00100J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0003J\u000e\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007J-\u0010\u000f\u001a\u00020\u00032%\b\u0002\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nJ\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016R\u001c\u0010\f\u001a\u00020\u00108\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\"\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0016\u0010&\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00061"}, d2 = {"Lcom/huami/applet/jsengine/engine/AppletWebView;", "Landroid/webkit/WebView;", "Lcom/huami/applet/jsengine/plugin/JavascriptExecuteInterface;", "", "e", "c", GoogleApiAvailabilityLight.a, "", Constants.ENABLED, "setDebug", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "status", "onLoadSuccessListener", "setOnLoadSuccessListener", "", "message", PointCategory.COMPLETE, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "destroy", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/huami/applet/jsengine/monitor/JsEngineAnalyticsInterface;", "b", "Lcom/huami/applet/jsengine/monitor/JsEngineAnalyticsInterface;", "jsEngineAnalyticsInterface", "Lcom/huami/applet/jsengine/monitor/JsEngineEventHandler;", "Lcom/huami/applet/jsengine/monitor/JsEngineEventHandler;", "jsEngineEventHandler", "", "Lcom/huami/applet/jsengine/plugin/AppletPlugin;", "Ljava/util/Map;", "pluginMap", "Z", "isDebug", "Landroid/os/Handler;", "f", "Landroid/os/Handler;", "mainHandler", "Lcom/huami/applet/jsengine/engine/MonitoredWebViewClient;", "g", "Lcom/huami/applet/jsengine/engine/MonitoredWebViewClient;", "monitoredWebViewClient", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/huami/applet/jsengine/monitor/JsEngineAnalyticsInterface;Lcom/huami/applet/jsengine/monitor/JsEngineEventHandler;Ljava/util/Map;)V", "applet_release"}, k = 1, mv = {1, 5, 1})
public class AppletWebView extends WebView implements JavascriptExecuteInterface {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final JsEngineAnalyticsInterface jsEngineAnalyticsInterface;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final JsEngineEventHandler jsEngineEventHandler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Map<String, AppletPlugin> pluginMap;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isDebug;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Handler mainHandler;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MonitoredWebViewClient monitoredWebViewClient;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("webView注入内容：", this.a);
        }
    }

    public /* synthetic */ AppletWebView(Context context, String str, JsEngineAnalyticsInterface jsEngineAnalyticsInterface, JsEngineEventHandler jsEngineEventHandler, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, jsEngineAnalyticsInterface, jsEngineEventHandler, (i & 16) != 0 ? r.emptyMap() : map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(AppletWebView appletWebView, String str) {
        long jNanoTime = System.nanoTime();
        HMLog.info(ConstantKt.TAG_APPLET, new a(str));
        appletWebView.evaluateJavascript(str, null);
        Unit unit = Unit.INSTANCE;
        HMLog.info(ConstantKt.TAG_APPLET, new UtilsKt.AnonymousClass1("jsEngine-evaluateJavascript", System.nanoTime() - jNanoTime));
    }

    private final void c() {
        addJavascriptInterface(new RpcJsBridgeInterface(this.pluginMap, this), "RPC");
        addJavascriptInterface(new MessageJsBridgeInterface(this.pluginMap, this), "BLE");
        addJavascriptInterface(new LogJsBridgeInterface(this.pluginMap, this), "LOG");
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private final void d() {
        WebView.setWebContentsDebuggingEnabled(this.isDebug);
        getSettings().setDomStorageEnabled(true);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setCacheMode(2);
        getSettings().setAllowUniversalAccessFromFileURLs(false);
        getSettings().setAllowFileAccess(true);
        getSettings().setAllowFileAccessFromFileURLs(false);
        getSettings().setBlockNetworkLoads(true);
        getSettings().setGeolocationEnabled(false);
        if (Build.VERSION.SDK_INT >= 21) {
            getSettings().setMixedContentMode(0);
        }
    }

    private final void e() {
        setWebChromeClient(new MonitoredWebChromeClient(this.jsEngineEventHandler));
        setWebViewClient(this.monitoredWebViewClient);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setOnLoadSuccessListener$default(AppletWebView appletWebView, Function1 function1, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOnLoadSuccessListener");
        }
        if ((i & 1) != 0) {
            function1 = null;
        }
        appletWebView.setOnLoadSuccessListener(function1);
    }

    @Override // com.huami.applet.jsengine.plugin.JavascriptExecuteInterface
    public void complete(@NotNull final String message) {
        UtilsKt.executeOnMainThread(new Runnable() { // from class: oi
            @Override // java.lang.Runnable
            public final void run() {
                AppletWebView.b(this.a, message);
            }
        });
    }

    @Override // com.huami.applet.jsengine.plugin.JavascriptExecuteInterface
    @NotNull
    public Context context() {
        return getContext();
    }

    @Override // android.webkit.WebView
    public void destroy() {
        loadUrl("about:blank");
        stopLoading();
        clearHistory();
        removeAllViews();
        clearCache(true);
        super.destroy();
    }

    @Override // com.huami.applet.jsengine.plugin.JavascriptExecuteInterface
    @NotNull
    public String getName() {
        return this.name;
    }

    public final void setDebug(boolean enabled) {
        WebView.setWebContentsDebuggingEnabled(enabled);
        getSettings().setBlockNetworkLoads(!enabled);
    }

    public final void setOnLoadSuccessListener(@Nullable Function1<? super Boolean, Unit> onLoadSuccessListener) {
        this.monitoredWebViewClient.setOnLoadSuccessListener(onLoadSuccessListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppletWebView(@NotNull Context context, @NotNull String str, @NotNull JsEngineAnalyticsInterface jsEngineAnalyticsInterface, @NotNull JsEngineEventHandler jsEngineEventHandler, @NotNull Map<String, ? extends AppletPlugin> map) {
        super(context);
        this.name = str;
        this.jsEngineAnalyticsInterface = jsEngineAnalyticsInterface;
        this.jsEngineEventHandler = jsEngineEventHandler;
        this.pluginMap = map;
        this.isDebug = ContextExtKt.isDebug(context);
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.monitoredWebViewClient = new MonitoredWebViewClient(jsEngineEventHandler);
        d();
        e();
        c();
    }
}
