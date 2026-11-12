package com.huami.applet.jsengine.plugin;

import android.content.Intent;
import android.net.Uri;
import com.huami.applet.ConstantKt;
import com.huami.applet.extension.JavascriptExecuteExtKt;
import com.huami.applet.jsengine.engine.AppletWebView;
import com.huami.applet.utils.UtilsKt;
import com.huami.sleepassistant.apilib.utils.WebConst;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.upnp.Argument;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u000e"}, d2 = {"Lcom/huami/applet/jsengine/plugin/OpenAuthWindow;", "Lcom/huami/applet/jsengine/plugin/AppletPlugin;", "", "", "moduleName", "()[Ljava/lang/String;", Argument.ELEM_NAME, "Lcom/huami/applet/jsengine/plugin/JavascriptExecuteInterface;", "result", "", "invokeMethod", "<init>", "()V", "Companion", "applet_release"}, k = 1, mv = {1, 5, 1})
public final class OpenAuthWindow implements AppletPlugin {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static String a = "";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/huami/applet/jsengine/plugin/OpenAuthWindow$Companion;", "", "Lcom/huami/applet/jsengine/engine/AppletWebView;", "appletWebView", "", "fullReturnUrl", "errorMsg", "", "packGetResult", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", WebConst.QueryParam.SET_ID, "(Ljava/lang/String;)V", "<init>", "()V", "applet_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void packGetResult$default(Companion companion, AppletWebView appletWebView, String str, String str2, int i, Object obj) throws JSONException {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            companion.packGetResult(appletWebView, str, str2);
        }

        @NotNull
        public final String getId() {
            return OpenAuthWindow.a;
        }

        public final void packGetResult(@NotNull AppletWebView appletWebView, @Nullable String fullReturnUrl, @Nullable String errorMsg) throws JSONException {
            JavascriptExecuteExtKt.onRpcMessage(appletWebView, UtilsKt.packRpcResult(getId(), new JSONObject().put("fullReturnUrl", fullReturnUrl), errorMsg).toString());
        }

        public final void setId(@NotNull String str) {
            OpenAuthWindow.a = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return String.valueOf(this.a.getMessage());
        }
    }

    @Override // com.huami.applet.jsengine.plugin.AppletPlugin
    @NotNull
    public String[] actionNames() {
        return AppletPlugin.DefaultImpls.actionNames(this);
    }

    @Override // com.huami.applet.jsengine.plugin.AppletPlugin
    public void invokeMethod(@NotNull String argument, @NotNull JavascriptExecuteInterface result) {
        Object objM3845constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.Companion;
            JSONObject jSONObject = new JSONObject(argument);
            String strOptString = jSONObject.optJSONObject("params").optString("targetUrl");
            a = jSONObject.optString("id");
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(strOptString));
            intent.setFlags(268435456);
            result.context().startActivity(intent);
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = kotlin.Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error$default(ConstantKt.TAG_APPLET, ConstantKt.CODE_PLUGIN, null, new a(thM3848exceptionOrNullimpl), 4, null);
        }
    }

    @Override // com.huami.applet.jsengine.plugin.AppletPlugin
    @NotNull
    public String[] moduleName() {
        return new String[]{"appSettings.framework.auth"};
    }
}
