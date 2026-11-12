package com.huami.applet.extension;

import com.huami.applet.ConstantKt;
import com.huami.applet.jsengine.ContainerFactoryKt;
import com.huami.applet.jsengine.engine.JsEngine;
import com.huami.applet.jsengine.plugin.JavascriptExecuteInterface;
import com.huami.tools.log.HMLog;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¨\u0006\t"}, d2 = {"Lcom/huami/applet/jsengine/plugin/JavascriptExecuteInterface;", "", "msg", "", "onRpcMessage", "onRpcMainMessage", "onRpcSettingMessage", "onRpcSampleMessage", "a", "applet_release"}, k = 2, mv = {1, 5, 1})
public final class JavascriptExecuteExtKt {

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
            return Intrinsics.stringPlus("onRpcMessage:", this.a);
        }
    }

    private static final String a(String str) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("window.RPC.onMessage(%s)", Arrays.copyOf(new Object[]{str}, 1));
        HMLog.info(ConstantKt.TAG_APPLET, new a(str2));
        return str2;
    }

    public static final void onRpcMainMessage(@NotNull String str) {
        String strA = a(str);
        JsEngine jsEngine = ContainerFactoryKt.getJsEngineRecord().get("main");
        if (jsEngine == null) {
            return;
        }
        jsEngine.eval(strA);
    }

    public static final void onRpcMessage(@NotNull JavascriptExecuteInterface javascriptExecuteInterface, @NotNull String str) {
        javascriptExecuteInterface.complete(a(str));
    }

    public static final void onRpcSampleMessage(@NotNull String str) {
        String strA = a(str);
        JavascriptExecuteInterface javascriptExecuteInterface = ContainerFactoryKt.getWebViewRecord().get(ConstantKt.SAMPLE_WEBVIEW_NAME);
        if (javascriptExecuteInterface == null) {
            return;
        }
        javascriptExecuteInterface.complete(strA);
    }

    public static final void onRpcSettingMessage(@NotNull String str) {
        String strA = a(str);
        JavascriptExecuteInterface javascriptExecuteInterface = ContainerFactoryKt.getWebViewRecord().get("setting");
        if (javascriptExecuteInterface == null) {
            return;
        }
        javascriptExecuteInterface.complete(strA);
    }
}
