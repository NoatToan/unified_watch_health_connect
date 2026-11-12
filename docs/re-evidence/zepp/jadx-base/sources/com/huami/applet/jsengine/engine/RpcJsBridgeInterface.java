package com.huami.applet.jsengine.engine;

import android.webkit.JavascriptInterface;
import androidx.annotation.Keep;
import com.huami.applet.ConstantKt;
import com.huami.applet.jsengine.engine.RpcJsBridgeInterface;
import com.huami.applet.jsengine.plugin.AppletPlugin;
import com.huami.applet.jsengine.plugin.JavascriptExecuteInterface;
import com.huami.applet.utils.UtilsKt;
import com.huami.tools.log.HMLog;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.upnp.Argument;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\"\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/applet/jsengine/engine/RpcJsBridgeInterface;", "", "", Argument.ELEM_NAME, "", "b", "argument2", "postMessage", "", "Lcom/huami/applet/jsengine/plugin/AppletPlugin;", "a", "Ljava/util/Map;", "pluginMap", "Lcom/huami/applet/jsengine/plugin/JavascriptExecuteInterface;", "Lcom/huami/applet/jsengine/plugin/JavascriptExecuteInterface;", "jsExecuteImpl", "<init>", "(Ljava/util/Map;Lcom/huami/applet/jsengine/plugin/JavascriptExecuteInterface;)V", "applet_release"}, k = 1, mv = {1, 5, 1})
public final class RpcJsBridgeInterface {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Map<String, AppletPlugin> pluginMap;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final JavascriptExecuteInterface jsExecuteImpl;

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
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Object a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj) {
            super(0);
            this.a = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a + ",未匹配到对应Plugin";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.getMessage();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RpcJsBridgeInterface(@NotNull Map<String, ? extends AppletPlugin> map, @NotNull JavascriptExecuteInterface javascriptExecuteInterface) {
        this.pluginMap = map;
        this.jsExecuteImpl = javascriptExecuteInterface;
    }

    private final void b(final String argument) {
        UtilsKt.executeOnSubThread(new Runnable() { // from class: tf6
            @Override // java.lang.Runnable
            public final void run() {
                RpcJsBridgeInterface.c(this.a, argument);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(RpcJsBridgeInterface rpcJsBridgeInterface, String str) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            HMLog.info(ConstantKt.TAG_APPLET, new a(str));
            Object objOpt = new JSONObject(str).optJSONObject("method").opt("module");
            Unit unit = null;
            if (rpcJsBridgeInterface.pluginMap.get(objOpt) != null) {
                AppletPlugin appletPlugin = rpcJsBridgeInterface.pluginMap.get(objOpt);
                if (appletPlugin != null) {
                    appletPlugin.invokeMethod(str, rpcJsBridgeInterface.jsExecuteImpl);
                    unit = Unit.INSTANCE;
                }
            } else {
                HMLog.warn$default(ConstantKt.TAG_APPLET, null, new b(objOpt), 2, null);
                unit = Unit.INSTANCE;
            }
            objM3845constructorimpl = Result.m3845constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            thM3848exceptionOrNullimpl.printStackTrace();
            HMLog.error(ConstantKt.TAG_APPLET, ConstantKt.CODE_PLUGIN, thM3848exceptionOrNullimpl, new c(thM3848exceptionOrNullimpl));
        }
    }

    @JavascriptInterface
    @Keep
    public final void postMessage(@NotNull String argument, @NotNull String argument2) {
        b(argument);
    }

    @JavascriptInterface
    @Keep
    public final void postMessage(@NotNull String argument) {
        b(argument);
    }
}
