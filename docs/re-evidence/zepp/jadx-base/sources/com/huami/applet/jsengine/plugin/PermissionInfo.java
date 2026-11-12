package com.huami.applet.jsengine.plugin;

import com.huami.applet.ConstantKt;
import com.huami.applet.extension.JavascriptExecuteExtKt;
import com.huami.applet.utils.UtilsKt;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.upnp.Argument;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\u0011"}, d2 = {"Lcom/huami/applet/jsengine/plugin/PermissionInfo;", "Lcom/huami/applet/jsengine/plugin/AppletPlugin;", "", "appId", "Lorg/json/JSONObject;", "a", "", "", "moduleName", "()[Ljava/lang/String;", Argument.ELEM_NAME, "Lcom/huami/applet/jsengine/plugin/JavascriptExecuteInterface;", "result", "", "invokeMethod", "<init>", "()V", "applet_release"}, k = 1, mv = {1, 5, 1})
public final class PermissionInfo implements AppletPlugin {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("appId:", Integer.valueOf(this.a));
        }
    }

    private final JSONObject a(int appId) {
        HMLog.info(ConstantKt.TAG_APPLET, new a(appId));
        return new JSONObject().put("access_internet", false);
    }

    @Override // com.huami.applet.jsengine.plugin.AppletPlugin
    @NotNull
    public String[] actionNames() {
        return AppletPlugin.DefaultImpls.actionNames(this);
    }

    @Override // com.huami.applet.jsengine.plugin.AppletPlugin
    public void invokeMethod(@NotNull String argument, @NotNull JavascriptExecuteInterface result) {
        Unit unit;
        JSONObject jSONObject = new JSONObject(argument);
        String strOptString = jSONObject.optString("id");
        JSONObject jSONObjectA = a(jSONObject.optJSONObject("params").optInt("appId"));
        if (jSONObjectA == null) {
            unit = null;
        } else {
            JavascriptExecuteExtKt.onRpcMessage(result, UtilsKt.packRpcResult(strOptString, jSONObjectA, null).toString());
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            JavascriptExecuteExtKt.onRpcMessage(result, UtilsKt.packRpcResult$default(strOptString, null, "数据获取失败", 2, null).toString());
        }
    }

    @Override // com.huami.applet.jsengine.plugin.AppletPlugin
    @NotNull
    public String[] moduleName() {
        return new String[]{"appSettings.framework.permission"};
    }
}
