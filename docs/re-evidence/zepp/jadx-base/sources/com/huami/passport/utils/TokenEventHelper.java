package com.huami.passport.utils;

import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.huami.account.service.model.LoginViewOptions;
import com.huami.passport.Configs;
import com.huami.passport.entity.LoginToken;
import com.huami.passport.entity.Token;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0001R\u0016\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/huami/passport/utils/TokenEventHelper;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/passport/entity/LoginToken;", LoginViewOptions.EXTRA_LOGIN_TOKEN, "", "postLoginTokenRefresh", "Lcom/huami/passport/entity/Token;", "appToken", "postAppTokenRefresh", "", "ACTION_LOGIN_TOKEN_REFRESH", "Ljava/lang/String;", "ACTION_APP_TOKEN_REFRESH", "<init>", "()V", "passport_release"}, k = 1, mv = {1, 5, 1})
public final class TokenEventHelper {

    @NotNull
    public static final String ACTION_APP_TOKEN_REFRESH = "com.huami.passport.APP_TOKEN_REFRESH";

    @NotNull
    public static final String ACTION_LOGIN_TOKEN_REFRESH = "com.huami.passport.LOGIN_TOKEN_REFRESH";

    @NotNull
    public static final TokenEventHelper INSTANCE = new TokenEventHelper();

    private TokenEventHelper() {
    }

    @JvmStatic
    @JvmName(name = "postAppTokenRefresh")
    public static final void postAppTokenRefresh(@NotNull Context context, @NotNull Token appToken) {
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(context);
        Intent intent = new Intent(ACTION_APP_TOKEN_REFRESH);
        intent.putExtra(Configs.Params.APP_TOKEN, appToken);
        Unit unit = Unit.INSTANCE;
        localBroadcastManager.sendBroadcast(intent);
    }

    @JvmStatic
    @JvmName(name = "postLoginTokenRefresh")
    public static final void postLoginTokenRefresh(@NotNull Context context, @NotNull LoginToken loginToken) {
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(context);
        Intent intent = new Intent(ACTION_LOGIN_TOKEN_REFRESH);
        intent.putExtra("login_token", loginToken);
        Unit unit = Unit.INSTANCE;
        localBroadcastManager.sendBroadcast(intent);
    }
}
