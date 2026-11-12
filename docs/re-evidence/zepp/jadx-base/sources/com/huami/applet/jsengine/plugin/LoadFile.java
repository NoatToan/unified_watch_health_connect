package com.huami.applet.jsengine.plugin;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.huami.applet.AppletConfig;
import com.huami.applet.ConstantKt;
import com.huami.applet.extension.FileExtKt;
import com.huami.applet.extension.JavascriptExecuteExtKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.upnp.Argument;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J \u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J \u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J \u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J \u0010\u0012\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/huami/applet/jsengine/plugin/LoadFile;", "Lcom/huami/applet/jsengine/plugin/AppletPlugin;", "", "id", "", "appId", "action", "Lcom/huami/applet/jsengine/plugin/JavascriptExecuteInterface;", "result", "", "a", "e", "f", "b", "c", "handler", "h", "errorMsg", "g", GoogleApiAvailabilityLight.a, "", "moduleName", "()[Ljava/lang/String;", "actionNames", Argument.ELEM_NAME, "invokeMethod", "Lcom/google/gson/Gson;", "Lcom/google/gson/Gson;", "gson", "<init>", "()V", "applet_release"}, k = 1, mv = {1, 5, 1})
public final class LoadFile implements AppletPlugin {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Gson gson = new Gson();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "未匹配到对应LoadFile action";
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
            return Intrinsics.stringPlus("设置代码路径：", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("服务代码路径：", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
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
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
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
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "LoadFile文件加载出错";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2) {
            super(0);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "id：" + this.a + ',' + this.b;
        }
    }

    private final void a(String id, int appId, String action, JavascriptExecuteInterface result) {
        if (Intrinsics.areEqual(action, actionNames()[0])) {
            e(id, appId, result);
        } else if (Intrinsics.areEqual(action, actionNames()[1])) {
            f(id, appId, result);
        } else {
            HMLog.warn$default(ConstantKt.TAG_APPLET, null, a.a, 2, null);
        }
    }

    private final String b(int appId, JavascriptExecuteInterface result) {
        String strStringPlus = Intrinsics.stringPlus(d(result, appId), "/setting.js");
        HMLog.info(ConstantKt.TAG_APPLET, new b(strStringPlus));
        return strStringPlus;
    }

    private final String c(int appId, JavascriptExecuteInterface result) {
        String strStringPlus = Intrinsics.stringPlus(d(result, appId), "/app-side.js");
        HMLog.info(ConstantKt.TAG_APPLET, new c(strStringPlus));
        return strStringPlus;
    }

    private final String d(JavascriptExecuteInterface result, int appId) {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) result.context().getFilesDir().getCanonicalPath());
        sb.append("/light_app_store/");
        AppletConfig.Companion companion = AppletConfig.INSTANCE;
        sb.append((Object) companion.getUserId());
        sb.append('/');
        HMBaseDevice hmBaseDevice = companion.getHmBaseDevice();
        sb.append((Object) (hmBaseDevice == null ? null : hmBaseDevice.getAddress()));
        sb.append('/');
        sb.append(appId);
        sb.append("/app-side");
        return sb.toString();
    }

    private final void e(String id, int appId, JavascriptExecuteInterface result) {
        Unit unit;
        if (appId == 0) {
            g(id, "appId is empty", result);
            return;
        }
        String strB = b(appId, result);
        HMLog.info(ConstantKt.TAG_APPLET, new d(strB));
        String fileContent = FileExtKt.readFileContent(new File(strB));
        if (fileContent == null) {
            unit = null;
        } else {
            h(id, fileContent, result);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            g(id, Intrinsics.stringPlus("file read error. appId: ", Integer.valueOf(appId)), result);
        }
    }

    private final void f(String id, int appId, JavascriptExecuteInterface result) {
        Unit unit;
        if (appId == 0) {
            g(id, "appId is empty", result);
            return;
        }
        String strC = c(appId, result);
        HMLog.info(ConstantKt.TAG_APPLET, new e(strC));
        String fileContent = FileExtKt.readFileContent(new File(strC));
        if (fileContent == null) {
            unit = null;
        } else {
            h(id, fileContent, result);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            g(id, Intrinsics.stringPlus("file read error. appId: ", Integer.valueOf(appId)), result);
        }
    }

    private final void g(String id, String errorMsg, JavascriptExecuteInterface handler) {
        HMLog.error$default(ConstantKt.TAG_APPLET, ConstantKt.CODE_PLUGIN, null, new g(id, errorMsg), 4, null);
        JavascriptExecuteExtKt.onRpcMessage(handler, this.gson.toJson(new Content(ConstantKt.RPC_VERSION, id, null, new Error(errorMsg), 4, null)));
    }

    private final void h(String id, String result, JavascriptExecuteInterface handler) {
        JavascriptExecuteExtKt.onRpcMessage(handler, this.gson.toJson(new Content(ConstantKt.RPC_VERSION, id, new Result(result), null, 8, null)));
    }

    @Override // com.huami.applet.jsengine.plugin.AppletPlugin
    @NotNull
    public String[] actionNames() {
        return new String[]{"getSettingsCode", "getWorkerCode"};
    }

    @Override // com.huami.applet.jsengine.plugin.AppletPlugin
    public void invokeMethod(@NotNull String argument, @NotNull JavascriptExecuteInterface result) {
        Object objM3845constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.Companion;
            JSONObject jSONObject = new JSONObject(argument);
            a(jSONObject.optString("id"), jSONObject.optJSONObject("params").optInt("appId"), jSONObject.optJSONObject("method").optString("action"), result);
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = kotlin.Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error(ConstantKt.TAG_APPLET, ConstantKt.CODE_PLUGIN, thM3848exceptionOrNullimpl, f.a);
        }
    }

    @Override // com.huami.applet.jsengine.plugin.AppletPlugin
    @NotNull
    public String[] moduleName() {
        return new String[]{"appSettings.framework.code", "main.scheduling.code"};
    }
}
