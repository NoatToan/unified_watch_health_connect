package com.huami.third.wechat.ui;

import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bRR\u0010\u0018\u001a2\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/huami/third/wechat/ui/WeChatHolder;", "", "Lcom/huami/third/wechat/ui/LoadingView;", "a", "Lcom/huami/third/wechat/ui/LoadingView;", "getLoadingView", "()Lcom/huami/third/wechat/ui/LoadingView;", "setLoadingView", "(Lcom/huami/third/wechat/ui/LoadingView;)V", "loadingView", "Lkotlin/Function2;", "Landroidx/fragment/app/FragmentActivity;", "Lkotlin/ParameterName;", "name", "activity", "", "content", "", "b", "Lkotlin/jvm/functions/Function2;", "getSendToWatch", "()Lkotlin/jvm/functions/Function2;", "setSendToWatch", "(Lkotlin/jvm/functions/Function2;)V", "sendToWatch", "<init>", "()V", "wechat-ui_release"}, k = 1, mv = {1, 5, 1})
public final class WeChatHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private static LoadingView loadingView;

    @NotNull
    public static final WeChatHolder INSTANCE = new WeChatHolder();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static Function2<? super FragmentActivity, ? super String, Unit> sendToWatch = a.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Landroidx/fragment/app/FragmentActivity;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function2<FragmentActivity, String, Unit> {
        public static final a a = new a();

        public a() {
            super(2);
        }

        public final void a(@NotNull FragmentActivity fragmentActivity, @NotNull String str) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(FragmentActivity fragmentActivity, String str) {
            a(fragmentActivity, str);
            return Unit.INSTANCE;
        }
    }

    private WeChatHolder() {
    }

    @Nullable
    public final LoadingView getLoadingView() {
        return loadingView;
    }

    @NotNull
    public final Function2<FragmentActivity, String, Unit> getSendToWatch() {
        return sendToWatch;
    }

    public final void setLoadingView(@Nullable LoadingView loadingView2) {
        loadingView = loadingView2;
    }

    public final void setSendToWatch(@NotNull Function2<? super FragmentActivity, ? super String, Unit> function2) {
        sendToWatch = function2;
    }
}
