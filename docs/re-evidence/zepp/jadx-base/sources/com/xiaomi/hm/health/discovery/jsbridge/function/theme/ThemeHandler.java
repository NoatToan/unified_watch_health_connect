package com.xiaomi.hm.health.discovery.jsbridge.function.theme;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.alipay.sdk.m.l.c;
import com.huami.discovery.bridge.jsbridge.JsCallBackFunction;
import com.huami.discovery.bridge.jsbridge.api.ApiHandler;
import com.huami.discovery.bridge.jsbridge.common.ErrorMessage;
import com.huami.discovery.bridge.jsbridge.common.JsMessageCenter;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.utils.BraceletForegroundCallBack;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001c\u0010\b\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/discovery/jsbridge/function/theme/ThemeHandler;", "Lcom/huami/discovery/bridge/jsbridge/api/ApiHandler;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "a", "", "data", "handleData", "Lcom/huami/discovery/bridge/jsbridge/JsCallBackFunction;", "function", "", "Lcom/huami/discovery/bridge/jsbridge/common/ErrorMessage;", "getFailedResult", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ThemeHandler implements ApiHandler {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String b = "APP_THEME";

    @NotNull
    private static final String c = "4021101";

    @NotNull
    private static final String d = "status";

    @NotNull
    private static final String e = "success";

    @NotNull
    private static final String f = "app-theme";

    @NotNull
    private static final String g = "THEME_DARK";

    @NotNull
    private static final String h = "THEME_LIGHT";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/discovery/jsbridge/function/theme/ThemeHandler$Companion;", "", "", c.n, "", "intercept", "APP_THEME", "Ljava/lang/String;", "ERROR_CODE", "STATUS", com.alipay.sdk.m.f0.c.p, "THEME_DARK", "THEME_ID", "THEME_LIGHT", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean intercept(@NotNull String apiName) {
            return Intrinsics.areEqual(apiName, "APP_THEME");
        }
    }

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
        Activity topActivity = BraceletForegroundCallBack.getTopActivity();
        Context context = topActivity instanceof AppCompatActivity ? (AppCompatActivity) topActivity : null;
        if (context == null) {
            context = this.context;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", "success");
        jSONObject.put(f, a(context) ? "THEME_DARK" : "THEME_LIGHT");
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
