package com.huami.discovery.bridge.jsbridge.handler;

import android.content.Context;
import com.huami.discovery.bridge.jsbridge.JsCallBackFunction;
import com.huami.discovery.bridge.jsbridge.api.ApiHandler;
import com.huami.discovery.bridge.jsbridge.common.ErrorMessage;
import com.huami.discovery.bridge.jsbridge.common.JsMessageCenter;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001c\u0010\b\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/discovery/bridge/jsbridge/handler/ThemeHandler;", "Lcom/huami/discovery/bridge/jsbridge/api/ApiHandler;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "a", "", "data", "handleData", "Lcom/huami/discovery/bridge/jsbridge/JsCallBackFunction;", "function", "", "Lcom/huami/discovery/bridge/jsbridge/common/ErrorMessage;", "getFailedResult", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "Companion", "bridge_release"}, k = 1, mv = {1, 5, 1})
public final class ThemeHandler implements ApiHandler {

    @NotNull
    public static final String THEME_ID = "APP_THEME";

    @NotNull
    private static final String b = "4021101";

    @NotNull
    private static final String c = "status";

    @NotNull
    private static final String d = "success";

    @NotNull
    private static final String e = "app-theme";

    @NotNull
    private static final String f = "THEME_DARK";

    @NotNull
    private static final String g = "THEME_LIGHT";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    public ThemeHandler(@NotNull Context context) {
        this.context = context;
    }

    private final boolean a(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    @NotNull
    public ErrorMessage getFailedResult() {
        return JsMessageCenter.get().getMessage("4021101");
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    public void handleData(@Nullable String data, @Nullable JsCallBackFunction function) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", "success");
        jSONObject.put(e, a(this.context) ? "THEME_DARK" : "THEME_LIGHT");
        if (function == null) {
            return;
        }
        function.onCallBack(jSONObject.toString());
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    public boolean handleData(@Nullable String data) {
        return true;
    }
}
