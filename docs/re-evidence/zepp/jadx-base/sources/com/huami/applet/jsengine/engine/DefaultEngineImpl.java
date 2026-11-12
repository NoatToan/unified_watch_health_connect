package com.huami.applet.jsengine.engine;

import android.content.Context;
import android.os.Environment;
import com.huami.applet.jsengine.monitor.JsEngineAnalyticsInterface;
import com.huami.applet.jsengine.monitor.JsEngineEventHandler;
import com.huami.applet.jsengine.plugin.AppletPlugin;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B=\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/huami/applet/jsengine/engine/DefaultEngineImpl;", "Lcom/huami/applet/jsengine/engine/JsEngine;", "", "str", "", "eval", "destroy", "Lcom/huami/applet/jsengine/engine/AppletWebView;", "a", "Lcom/huami/applet/jsengine/engine/AppletWebView;", "appletWebView", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "name", "Lcom/huami/applet/jsengine/monitor/JsEngineAnalyticsInterface;", "jsEngineAnalyticsInterface", "Lcom/huami/applet/jsengine/monitor/JsEngineEventHandler;", "jsEngineEventHandler", "", "Lcom/huami/applet/jsengine/plugin/AppletPlugin;", "pluginMap", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/huami/applet/jsengine/monitor/JsEngineAnalyticsInterface;Lcom/huami/applet/jsengine/monitor/JsEngineEventHandler;Ljava/util/Map;)V", "Companion", "applet_release"}, k = 1, mv = {1, 5, 1})
public final class DefaultEngineImpl implements JsEngine {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0 == true ? 1 : 0);

    @NotNull
    private static String b = "file:///android_asset/js-engine-bootstrap.html";

    @NotNull
    private static String c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final AppletWebView appletWebView;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/huami/applet/jsengine/engine/DefaultEngineImpl$Companion;", "", "", "bootUrl", "Ljava/lang/String;", "getBootUrl", "()Ljava/lang/String;", "setBootUrl", "(Ljava/lang/String;)V", "bootUrlDebug", "getBootUrlDebug", "setBootUrlDebug", "<init>", "()V", "applet_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getBootUrl() {
            return DefaultEngineImpl.b;
        }

        @NotNull
        public final String getBootUrlDebug() {
            return DefaultEngineImpl.c;
        }

        public final void setBootUrl(@NotNull String str) {
            DefaultEngineImpl.b = str;
        }

        public final void setBootUrlDebug(@NotNull String str) {
            DefaultEngineImpl.c = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("Init WebView  exception:", this.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        StringBuilder sb = new StringBuilder();
        sb.append("file://");
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        sb.append((Object) (externalStorageDirectory != null ? externalStorageDirectory.getAbsolutePath() : null));
        sb.append("/Android/js-engine-bootstrap.html");
        c = sb.toString();
    }

    public DefaultEngineImpl(@NotNull Context context, @NotNull String str, @NotNull JsEngineAnalyticsInterface jsEngineAnalyticsInterface, @NotNull JsEngineEventHandler jsEngineEventHandler, @NotNull Map<String, ? extends AppletPlugin> map) {
        AppletWebView appletWebView;
        try {
            appletWebView = new AppletWebView(context, str, jsEngineAnalyticsInterface, jsEngineEventHandler, map);
        } catch (Exception e) {
            HMLog.error$default(null, null, null, new a(e), 7, null);
            appletWebView = null;
        }
        this.appletWebView = appletWebView;
        if (appletWebView == null) {
            return;
        }
        appletWebView.loadUrl(b);
    }

    @Override // com.huami.applet.jsengine.engine.JsEngine
    public void destroy() {
        AppletWebView appletWebView = this.appletWebView;
        if (appletWebView == null) {
            return;
        }
        appletWebView.destroy();
    }

    @Override // com.huami.applet.jsengine.engine.JsEngine
    public void eval(@NotNull String str) {
        AppletWebView appletWebView = this.appletWebView;
        if (appletWebView == null) {
            return;
        }
        appletWebView.complete(str);
    }

    public /* synthetic */ DefaultEngineImpl(Context context, String str, JsEngineAnalyticsInterface jsEngineAnalyticsInterface, JsEngineEventHandler jsEngineEventHandler, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, jsEngineAnalyticsInterface, jsEngineEventHandler, (i & 16) != 0 ? r.emptyMap() : map);
    }
}
