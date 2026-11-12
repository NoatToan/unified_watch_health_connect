package com.xiaomi.fitness.medal.schema;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.miui.circulate.device.api.Constant;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.webview.WebViewActivity;
import com.xiaomi.fitness.webview.healthwebview.HealthWebViewActivity;
import com.xiaomi.passport.jsb.PassportJsbWebViewPageConfig;
import defpackage.y0c;
import java.net.URLDecoder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0004¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/medal/schema/WebSchemaHadler;", "Ly0c;", "", "authority", "()Ljava/lang/String;", "Landroid/content/Context;", "context", "Landroid/net/Uri;", SportRecordBundleKey.BUNDLE_PARAM_URI, "", "doProcess", "(Landroid/content/Context;Landroid/net/Uri;)V", "param", "decodeParam", "(Ljava/lang/String;)Ljava/lang/String;", "AUTHORITY", "Ljava/lang/String;", "getAUTHORITY", "TAB_STATUS", "getTAB_STATUS", "TAG_MINE", "getTAG_MINE", "TAB_HEALTH", "getTAB_HEALTH", "<init>", "()V", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WebSchemaHadler extends y0c {

    @NotNull
    private final String AUTHORITY = PassportJsbWebViewPageConfig.ActionBarConfig.VAL_ACTION_BAR_STYLE_WEB;

    @NotNull
    private final String TAB_STATUS = "status";

    @NotNull
    private final String TAG_MINE = "mine";

    @NotNull
    private final String TAB_HEALTH = Constant.DeviceCategory.HEALTH;

    @Override // defpackage.y0c
    @NotNull
    /* JADX INFO: renamed from: authority, reason: from getter */
    public String getAUTHORITY() {
        return this.AUTHORITY;
    }

    @Nullable
    public final String decodeParam(@Nullable String param) {
        return !TextUtils.isEmpty(param) ? URLDecoder.decode(param) : "";
    }

    @Override // defpackage.y0c
    public void doProcess(@NotNull Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        String queryParameter = uri.getQueryParameter("url");
        if (TextUtils.isEmpty(queryParameter)) {
            return;
        }
        String queryParameter2 = uri.getQueryParameter("native_title");
        MainTab.Companion companion = MainTab.INSTANCE;
        int index_health = companion.getINDEX_HEALTH();
        String queryParameter3 = uri.getQueryParameter("targetTab");
        if (queryParameter3 != null) {
            if (Intrinsics.areEqual(queryParameter3, this.TAB_HEALTH)) {
                index_health = companion.getINDEX_HEALTH();
            } else if (Intrinsics.areEqual(queryParameter3, this.TAG_MINE)) {
                index_health = companion.getINDEX_ME();
            }
        }
        Intent intent = new Intent(context, (Class<?>) HealthWebViewActivity.class);
        intent.putExtra(WebViewActivity.BACK_MAIN_TAB_KEY, index_health);
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        intent.putExtra(WebViewActivity.TITLE, queryParameter2);
        intent.putExtra("URL", decodeParam(queryParameter));
        intent.putExtra(WebViewActivity.IS_FROM_SCHEMA, true);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    @NotNull
    public final String getAUTHORITY() {
        return this.AUTHORITY;
    }

    @NotNull
    public final String getTAB_HEALTH() {
        return this.TAB_HEALTH;
    }

    @NotNull
    public final String getTAB_STATUS() {
        return this.TAB_STATUS;
    }

    @NotNull
    public final String getTAG_MINE() {
        return this.TAG_MINE;
    }
}
