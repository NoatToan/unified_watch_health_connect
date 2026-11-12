package com.huami.applet.jsengine;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.applet.ConstantKt;
import com.huami.applet.bluetooth.core.HMAppletProtocolProxyKt;
import com.huami.applet.bluetooth.store.StoreProtocolProxyKt;
import com.huami.applet.jsengine.engine.AppletWebView;
import com.huami.applet.jsengine.engine.DefaultEngineImpl;
import com.huami.applet.jsengine.engine.JsEngine;
import com.huami.applet.jsengine.monitor.JsEngineAnalyticsImpl;
import com.huami.applet.jsengine.monitor.JsEngineEventHandlerImpl;
import com.huami.applet.jsengine.plugin.AppletPlugin;
import com.huami.applet.jsengine.plugin.Fetch;
import com.huami.applet.jsengine.plugin.JavascriptExecuteInterface;
import com.huami.applet.jsengine.plugin.LiveStorage;
import com.huami.applet.jsengine.plugin.LoadFile;
import com.huami.applet.jsengine.plugin.LocalStorage;
import com.huami.applet.jsengine.plugin.Messaging;
import com.huami.applet.jsengine.plugin.OpenAuthWindow;
import com.huami.applet.jsengine.plugin.PermissionInfo;
import com.huami.applet.jsengine.plugin.SettingsStorage;
import com.huami.applet.jsengine.plugin.SystemInfo;
import com.huami.applet.jsengine.plugin.UserInfo;
import com.huami.applet.jsengine.plugin.UserSettingInfo;
import com.huami.applet.utils.UtilsKt;
import com.huami.tools.analytics.DbUtils;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002\u001a \u0010\r\u001a\u00020\f*\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002\"\u001c\u0010\u0012\u001a\u00020\u000e8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u001c\u0010\u0018\u001a\u00020\u00138\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"(\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\t8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"(\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001e0\t8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c¨\u0006\""}, d2 = {"", "name", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/applet/jsengine/engine/JsEngine;", "defaultEngineContainer", "Lcom/huami/applet/jsengine/engine/AppletWebView;", "settingContainer", "sampleContainer", "", "Lcom/huami/applet/jsengine/plugin/AppletPlugin;", "plugin", "", "a", "Lcom/huami/applet/jsengine/monitor/JsEngineEventHandlerImpl;", "Lcom/huami/applet/jsengine/monitor/JsEngineEventHandlerImpl;", "getJsEngineEventHandler", "()Lcom/huami/applet/jsengine/monitor/JsEngineEventHandlerImpl;", "jsEngineEventHandler", "Lcom/huami/applet/jsengine/monitor/JsEngineAnalyticsImpl;", "b", "Lcom/huami/applet/jsengine/monitor/JsEngineAnalyticsImpl;", "getJsEngineAnalyticsImpl", "()Lcom/huami/applet/jsengine/monitor/JsEngineAnalyticsImpl;", "jsEngineAnalyticsImpl", "c", "Ljava/util/Map;", "getJsEngineRecord", "()Ljava/util/Map;", "jsEngineRecord", "Lcom/huami/applet/jsengine/plugin/JavascriptExecuteInterface;", GoogleApiAvailabilityLight.a, "getWebViewRecord", "webViewRecord", "applet_release"}, k = 2, mv = {1, 5, 1})
public final class ContainerFactoryKt {

    @NotNull
    private static final JsEngineEventHandlerImpl a = new JsEngineEventHandlerImpl();

    @NotNull
    private static final JsEngineAnalyticsImpl b = new JsEngineAnalyticsImpl();

    @NotNull
    private static final Map<String, JsEngine> c = new LinkedHashMap();

    @NotNull
    private static final Map<String, JavascriptExecuteInterface> d = new LinkedHashMap();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<byte[], Unit> {
        public final /* synthetic */ AppletWebView a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AppletWebView appletWebView) {
            super(1);
            this.a = appletWebView;
        }

        public final void a(@NotNull byte[] bArr) {
            if (ByteBuffer.wrap(bArr).get() == 2) {
                StoreProtocolProxyKt.getStoreProtocol().dispatchResult(bArr);
                return;
            }
            AppletWebView appletWebView = this.a;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            StringBuilder sb = new StringBuilder();
            sb.append('\"');
            sb.append((Object) UtilsKt.byteToHexString(bArr));
            sb.append('\"');
            appletWebView.complete(String.format("window.BLE.onMessage(%s)", Arrays.copyOf(new Object[]{sb.toString()}, 1)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    private static final void a(Map<String, AppletPlugin> map, AppletPlugin appletPlugin) {
        for (String str : appletPlugin.moduleName()) {
            map.put(str, appletPlugin);
        }
    }

    @NotNull
    public static final JsEngine defaultEngineContainer(@NotNull String str, @NotNull Context context) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a(linkedHashMap, new Fetch(context.getApplicationContext()));
        a(linkedHashMap, new Messaging());
        a(linkedHashMap, new SettingsStorage());
        a(linkedHashMap, new LocalStorage());
        a(linkedHashMap, new UserSettingInfo());
        a(linkedHashMap, new LiveStorage());
        a(linkedHashMap, new LoadFile());
        a(linkedHashMap, new UserInfo());
        a(linkedHashMap, new SystemInfo());
        DefaultEngineImpl defaultEngineImpl = new DefaultEngineImpl(context.getApplicationContext(), str, b, a, linkedHashMap);
        getJsEngineRecord().put(str, defaultEngineImpl);
        return defaultEngineImpl;
    }

    @NotNull
    public static final JsEngineAnalyticsImpl getJsEngineAnalyticsImpl() {
        return b;
    }

    @NotNull
    public static final JsEngineEventHandlerImpl getJsEngineEventHandler() {
        return a;
    }

    @NotNull
    public static final Map<String, JsEngine> getJsEngineRecord() {
        return c;
    }

    @NotNull
    public static final Map<String, JavascriptExecuteInterface> getWebViewRecord() {
        return d;
    }

    @NotNull
    public static final AppletWebView sampleContainer(@NotNull Context context) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a(linkedHashMap, new Fetch(context.getApplicationContext()));
        a(linkedHashMap, new Messaging());
        a(linkedHashMap, new SettingsStorage());
        a(linkedHashMap, new LocalStorage());
        a(linkedHashMap, new LiveStorage());
        a(linkedHashMap, new LoadFile());
        a(linkedHashMap, new OpenAuthWindow());
        a(linkedHashMap, new UserSettingInfo());
        a(linkedHashMap, new PermissionInfo());
        a(linkedHashMap, new UserInfo());
        a(linkedHashMap, new SystemInfo());
        AppletWebView appletWebView = new AppletWebView(context.getApplicationContext(), ConstantKt.SAMPLE_WEBVIEW_NAME, b, a, linkedHashMap);
        getWebViewRecord().put(ConstantKt.SAMPLE_WEBVIEW_NAME, appletWebView);
        HMAppletProtocolProxyKt.getHMAppletProtocolProxy().onMessage(new a(appletWebView));
        return appletWebView;
    }

    @NotNull
    public static final AppletWebView settingContainer(@NotNull Context context) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a(linkedHashMap, new Fetch(context.getApplicationContext()));
        a(linkedHashMap, new SettingsStorage());
        a(linkedHashMap, new LoadFile());
        a(linkedHashMap, new OpenAuthWindow());
        a(linkedHashMap, new UserSettingInfo());
        a(linkedHashMap, new PermissionInfo());
        a(linkedHashMap, new UserInfo());
        a(linkedHashMap, new SystemInfo());
        AppletWebView appletWebView = new AppletWebView(context.getApplicationContext(), "setting", b, a, linkedHashMap);
        getWebViewRecord().put("setting", appletWebView);
        return appletWebView;
    }
}
