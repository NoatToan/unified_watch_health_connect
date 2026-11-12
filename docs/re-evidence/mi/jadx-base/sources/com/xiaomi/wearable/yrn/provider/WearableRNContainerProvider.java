package com.xiaomi.wearable.yrn.provider;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.facebook.react.ReactRootView;
import com.facebook.yrn.manager.YRNReactContainerView;
import com.mibi.sdk.component.params.SdkContants;
import com.swmansion.gesturehandler.react.RNGestureHandlerEnabledRootView;
import com.xiaomi.wearable.yrn.views.WearableRNLoadingView;
import defpackage.h1d;
import defpackage.o1d;
import defpackage.v1d;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/wearable/yrn/provider/WearableRNContainerProvider;", "Lh1d;", "Landroid/content/Context;", "context", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "Lo1d;", "getLoadingOrRetryViewProvider", "(Landroid/content/Context;Landroid/os/Bundle;)Lo1d;", "Landroid/view/View;", "getDowngradeView", "(Landroid/content/Context;Landroid/os/Bundle;)Landroid/view/View;", "Lv1d;", "getReactRootViewProvider", "(Landroid/content/Context;Landroid/os/Bundle;)Lv1d;", "<init>", "()V", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WearableRNContainerProvider implements h1d {
    @Override // defpackage.h1d
    @Nullable
    public View getDowngradeView(@Nullable Context context, @Nullable Bundle bundle) {
        return null;
    }

    @Override // defpackage.h1d
    @Nullable
    public o1d getLoadingOrRetryViewProvider(@Nullable Context context, @Nullable Bundle bundle) {
        if (context == null) {
            return null;
        }
        return new WearableRNLoadingView(context, null, 0, 6, null);
    }

    @Override // defpackage.h1d
    @NotNull
    public v1d getReactRootViewProvider(@Nullable Context context, @Nullable Bundle bundle) {
        return new v1d() { // from class: com.xiaomi.wearable.yrn.provider.WearableRNContainerProvider.getReactRootViewProvider.1
            @Override // defpackage.v1d
            public void destroyReactRootView(YRNReactContainerView containerView) {
                ReactRootView reactRootView = containerView != null ? containerView.getReactRootView() : null;
                RNGestureHandlerEnabledRootView rNGestureHandlerEnabledRootView = reactRootView instanceof RNGestureHandlerEnabledRootView ? (RNGestureHandlerEnabledRootView) reactRootView : null;
                if (rNGestureHandlerEnabledRootView != null) {
                    rNGestureHandlerEnabledRootView.t();
                }
            }

            @Override // com.facebook.yrn.manager.YRNReactContainerView.OnReactRootViewProvider
            public RNGestureHandlerEnabledRootView getNewView(Context context2) {
                return new RNGestureHandlerEnabledRootView(context2);
            }
        };
    }
}
