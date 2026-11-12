package com.huami.third.alipay.ui;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ@\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¨\u0006\u0010"}, d2 = {"Lcom/huami/third/alipay/ui/AlipayBind;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "host", "userId", "appId", "Lcom/huami/third/alipay/ui/LoadingView;", "loadingView", "Lcom/huami/third/alipay/ui/BindInterceptor;", "bindInterceptor", "", "open", "<init>", "()V", "alipay-ui_release"}, k = 1, mv = {1, 4, 1})
public final class AlipayBind {

    @NotNull
    public static final AlipayBind INSTANCE = new AlipayBind();

    private AlipayBind() {
    }

    @JvmStatic
    public static final void open(@NotNull Context context, @NotNull String host, @NotNull String userId, @NotNull String appId, @Nullable LoadingView loadingView, @Nullable BindInterceptor bindInterceptor) {
        AlipayHolder alipayHolder = AlipayHolder.INSTANCE;
        alipayHolder.setLoadingView(loadingView);
        alipayHolder.setHost(host);
        alipayHolder.setBindInterceptor(bindInterceptor);
        context.startActivity(AlipayBindActivity.INSTANCE.getIntent(context, userId, appId));
    }
}
