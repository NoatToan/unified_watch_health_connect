package com.xiaomi.fitness.eco.device.manager;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.eco.device.manager.export.IBindGuideAction;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoProduct;
import com.xiaomi.fitness.eco.device.manager.ui.ResetGuideView;
import defpackage.wc0;
import defpackage.yzi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/ResetGuideHelper;", "", "Landroidx/fragment/app/FragmentActivity;", "context", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoProduct;", "product", "Lcom/xiaomi/fitness/eco/device/manager/export/IBindGuideAction;", "action", "Lwc0;", "actionBar", "", "removeContentView", "", "showResetGuideView", "(Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoProduct;Lcom/xiaomi/fitness/eco/device/manager/export/IBindGuideAction;Lwc0;Z)V", "<init>", "()V", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ResetGuideHelper {

    @NotNull
    public static final ResetGuideHelper INSTANCE = new ResetGuideHelper();

    private ResetGuideHelper() {
    }

    public final void showResetGuideView(@NotNull FragmentActivity context, @NotNull EcoProduct product, @NotNull final IBindGuideAction action, @Nullable wc0 actionBar, final boolean removeContentView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(action, "action");
        View decorView = context.getWindow().getDecorView();
        Intrinsics.checkNotNull(decorView, "null cannot be cast to non-null type android.widget.FrameLayout");
        final FrameLayout frameLayout = (FrameLayout) decorView;
        final ResetGuideView resetGuideView = new ResetGuideView(context, product, null, 4, null);
        resetGuideView.setOnActionListener(new ResetGuideView.OnActionListener() { // from class: com.xiaomi.fitness.eco.device.manager.ResetGuideHelper.showResetGuideView.1
            @Override // com.xiaomi.fitness.eco.device.manager.ui.ResetGuideView.OnActionListener
            public void onBack() {
                action.onBack();
                if (removeContentView) {
                    frameLayout.removeView(resetGuideView);
                }
            }

            @Override // com.xiaomi.fitness.eco.device.manager.ui.ResetGuideView.OnActionListener
            public void onKnown() {
                action.onKnown();
            }
        });
        if (actionBar != null) {
            actionBar.setTitle(ResourceExtKt.getString(yzi.J0));
        }
        frameLayout.addView(resetGuideView);
    }
}
