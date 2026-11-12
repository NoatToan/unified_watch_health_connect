package com.xiaomi.fitness.baseui.common;

import android.view.View;
import com.xiaomi.fitness.baseui.common.NetworkFallbackExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.n1j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007\u001a\u0014\u0010\b\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007¨\u0006\n"}, d2 = {"handleUnavailableNetworkAndShowFallbackPageIfNeed", "", "noNetwork", "Landroid/view/View;", "contentView", "retryBtn", "loadData", "Lkotlin/Function0;", "checkNetworkAndProcessIfAvailable", "function", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NetworkFallbackExtKt {
    public static final void checkNetworkAndProcessIfAvailable(@NotNull Function0<Unit> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        if (NetUtil.INSTANCE.getNetWorkAvailable(ApplicationExtKt.getApplication())) {
            function.invoke();
        } else {
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), n1j.common_hint_network_unavailable);
        }
    }

    public static final void handleUnavailableNetworkAndShowFallbackPageIfNeed(@NotNull final View noNetwork, @NotNull final View contentView, @Nullable final View view, @NotNull final Function0<Unit> loadData) {
        Intrinsics.checkNotNullParameter(noNetwork, "noNetwork");
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        Intrinsics.checkNotNullParameter(loadData, "loadData");
        if (NetUtil.INSTANCE.getNetWorkAvailable(ApplicationExtKt.getApplication())) {
            noNetwork.setVisibility(8);
            contentView.setVisibility(0);
            loadData.invoke();
        } else {
            noNetwork.setVisibility(0);
            contentView.setVisibility(8);
            if (view != null) {
                ViewExtKt.clickWithTrigger$default(view, 0L, new Function1() { // from class: ckg
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return NetworkFallbackExtKt.handleUnavailableNetworkAndShowFallbackPageIfNeed$lambda$0(noNetwork, contentView, view, loadData, (View) obj);
                    }
                }, 1, null);
            }
        }
    }

    public static /* synthetic */ void handleUnavailableNetworkAndShowFallbackPageIfNeed$default(View view, View view2, View view3, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            view3 = null;
        }
        handleUnavailableNetworkAndShowFallbackPageIfNeed(view, view2, view3, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleUnavailableNetworkAndShowFallbackPageIfNeed$lambda$0(View noNetwork, View contentView, View view, Function0 loadData, View it) {
        Intrinsics.checkNotNullParameter(noNetwork, "$noNetwork");
        Intrinsics.checkNotNullParameter(contentView, "$contentView");
        Intrinsics.checkNotNullParameter(loadData, "$loadData");
        Intrinsics.checkNotNullParameter(it, "it");
        handleUnavailableNetworkAndShowFallbackPageIfNeed(noNetwork, contentView, view, loadData);
        return Unit.INSTANCE;
    }
}
