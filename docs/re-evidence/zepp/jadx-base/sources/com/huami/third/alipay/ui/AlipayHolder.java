package com.huami.third.alipay.ui;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/huami/third/alipay/ui/AlipayHolder;", "", "Lcom/huami/third/alipay/ui/LoadingView;", "a", "Lcom/huami/third/alipay/ui/LoadingView;", "getLoadingView", "()Lcom/huami/third/alipay/ui/LoadingView;", "setLoadingView", "(Lcom/huami/third/alipay/ui/LoadingView;)V", "loadingView", "", "b", "Ljava/lang/String;", "getHost", "()Ljava/lang/String;", "setHost", "(Ljava/lang/String;)V", "host", "Lcom/huami/third/alipay/ui/BindInterceptor;", "c", "Lcom/huami/third/alipay/ui/BindInterceptor;", "getBindInterceptor", "()Lcom/huami/third/alipay/ui/BindInterceptor;", "setBindInterceptor", "(Lcom/huami/third/alipay/ui/BindInterceptor;)V", "bindInterceptor", "<init>", "()V", "alipay-ui_release"}, k = 1, mv = {1, 4, 1})
public final class AlipayHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private static LoadingView loadingView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private static BindInterceptor bindInterceptor;

    @NotNull
    public static final AlipayHolder INSTANCE = new AlipayHolder();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static String host = "";

    private AlipayHolder() {
    }

    @Nullable
    public final BindInterceptor getBindInterceptor() {
        return bindInterceptor;
    }

    @NotNull
    public final String getHost() {
        return host;
    }

    @Nullable
    public final LoadingView getLoadingView() {
        return loadingView;
    }

    public final void setBindInterceptor(@Nullable BindInterceptor bindInterceptor2) {
        bindInterceptor = bindInterceptor2;
    }

    public final void setHost(@NotNull String str) {
        host = str;
    }

    public final void setLoadingView(@Nullable LoadingView loadingView2) {
        loadingView = loadingView2;
    }
}
