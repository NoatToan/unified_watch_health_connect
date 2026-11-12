package com.huami.applet.jsengine.plugin;

import com.huami.applet.ConstantKt;
import com.huami.applet.extension.JavascriptExecuteExtKt;
import com.huami.applet.utils.UtilsKt;
import com.huami.tools.log.HMLog;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.cybergarage.upnp.Argument;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0010"}, d2 = {"Lcom/huami/applet/jsengine/plugin/UserSettingInfo;", "Lcom/huami/applet/jsengine/plugin/AppletPlugin;", "Lorg/json/JSONObject;", "a", "", "", "moduleName", "()[Ljava/lang/String;", "actionNames", Argument.ELEM_NAME, "Lcom/huami/applet/jsengine/plugin/JavascriptExecuteInterface;", "result", "", "invokeMethod", "<init>", "()V", "applet_release"}, k = 1, mv = {1, 5, 1})
public final class UserSettingInfo implements AppletPlugin {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.ObjectRef<String> a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ref.ObjectRef<String> objectRef, String str) {
            super(0);
            this.a = objectRef;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "当前语言环境:" + this.a.element + ", 国家:" + ((Object) this.b);
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
            return Intrinsics.stringPlus("User setting info (rpc protocol), js app id is > ", this.a);
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
            return Intrinsics.stringPlus("Js app get User setting info error: wrong action name : ", this.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.String] */
    private final JSONObject a() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = Locale.getDefault().getLanguage();
        String country = Locale.getDefault().getCountry();
        HMLog.info(ConstantKt.TAG_APPLET, new a(objectRef, country));
        objectRef.element = ((String) objectRef.element) + '-' + ((Object) country);
        return new JSONObject().put("lang", objectRef.element);
    }

    @Override // com.huami.applet.jsengine.plugin.AppletPlugin
    @NotNull
    public String[] actionNames() {
        return new String[]{"getUserSettings"};
    }

    @Override // com.huami.applet.jsengine.plugin.AppletPlugin
    public void invokeMethod(@NotNull String argument, @NotNull JavascriptExecuteInterface result) throws JSONException {
        Object objM3845constructorimpl;
        JSONObject jSONObject = new JSONObject(argument);
        String strOptString = jSONObject.optString("id");
        HMLog.info(ConstantKt.TAG_APPLET, new b(strOptString));
        String string = jSONObject.getJSONObject("method").getString("action");
        if (!string.equals(actionNames()[0])) {
            HMLog.error$default(ConstantKt.TAG_APPLET, null, null, new c(string), 6, null);
            JavascriptExecuteExtKt.onRpcMessage(result, UtilsKt.packRpcResult$default(strOptString, null, "Action name error > " + ((Object) string) + ", but protocol action name is > " + actionNames()[0], 2, null).toString());
            return;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.Companion;
            JavascriptExecuteExtKt.onRpcMessage(result, UtilsKt.packRpcResult(strOptString, a(), null).toString());
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (kotlin.Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
            JavascriptExecuteExtKt.onRpcMessage(result, UtilsKt.packRpcResult$default(strOptString, null, "数据获取失败", 2, null).toString());
        }
    }

    @Override // com.huami.applet.jsengine.plugin.AppletPlugin
    @NotNull
    public String[] moduleName() {
        return new String[]{"appSettings.framework.userSettings"};
    }
}
