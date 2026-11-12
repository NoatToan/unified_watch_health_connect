package com.huami.third.alexa;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\r"}, d2 = {"Lcom/huami/third/alexa/AlexaBind;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "productId", "deviceId", "Lcom/huami/third/alexa/AuthCallback;", "authCallback", "", "open", "<init>", "()V", "alexa-ui_release"}, k = 1, mv = {1, 5, 1})
public final class AlexaBind {

    @NotNull
    public static final AlexaBind INSTANCE = new AlexaBind();

    private AlexaBind() {
    }

    @JvmStatic
    public static final void open(@NotNull Context context, @NotNull String productId, @Nullable String deviceId, @Nullable AuthCallback authCallback) {
        AlexaHolder.INSTANCE.setAuthCallback(authCallback);
        context.startActivity(AmazonBindActivity.INSTANCE.getIntent(context, productId, deviceId));
    }

    public static /* synthetic */ void open$default(Context context, String str, String str2, AuthCallback authCallback, int i, Object obj) {
        if ((i & 8) != 0) {
            authCallback = null;
        }
        open(context, str, str2, authCallback);
    }
}
