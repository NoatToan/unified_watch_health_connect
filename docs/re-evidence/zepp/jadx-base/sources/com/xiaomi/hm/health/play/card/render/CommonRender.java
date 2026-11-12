package com.xiaomi.hm.health.play.card.render;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.p008lifecycle.LifecycleOwner;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.databinding.PlayCardCommonLayoutBinding;
import com.xiaomi.hm.health.play.PlayTool;
import com.xiaomi.hm.health.play.card.AbstractCardRender;
import com.xiaomi.hm.health.play.card.AbstractDeviceCardRenderKt;
import com.xiaomi.hm.health.play.card.CardUiData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u0019\u0010\u0017\u001a\u00020\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/play/card/render/CommonRender;", "Lcom/xiaomi/hm/health/play/card/AbstractCardRender;", "Lcom/xiaomi/hm/health/databinding/PlayCardCommonLayoutBinding;", "", "isDeviceActive", "", "e", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "rootView", "getLayoutViewBinding", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/play/card/CardUiData;", "uiParams", "onCardClick", "setUiData", "Landroidx/lifecycle/LifecycleOwner;", "g", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "<init>", "(Landroidx/lifecycle/LifecycleOwner;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class CommonRender extends AbstractCardRender<PlayCardCommonLayoutBinding> {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final LifecycleOwner lifecycleOwner;

    public CommonRender(@NotNull LifecycleOwner lifecycleOwner) {
        this.lifecycleOwner = lifecycleOwner;
    }

    private final void e(boolean isDeviceActive) {
        ConstraintLayout constraintLayout;
        if (isDeviceActive) {
            ConstraintLayout root = getBinding().getRoot();
            constraintLayout = root instanceof ViewGroup ? root : null;
            if (constraintLayout == null) {
                return;
            }
            AbstractDeviceCardRenderKt.setChildAlpha(constraintLayout, 1.0f);
            return;
        }
        ConstraintLayout root2 = getBinding().getRoot();
        constraintLayout = root2 instanceof ViewGroup ? root2 : null;
        if (constraintLayout == null) {
            return;
        }
        AbstractDeviceCardRenderKt.setChildAlpha(constraintLayout, 0.4f);
    }

    @NotNull
    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    public void onCardClick(@NotNull Context context, @NotNull CardUiData uiParams) {
        if (uiParams.getPlayTool().isDeviceActive()) {
            super.onCardClick(context, uiParams);
        }
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    public void setUiData(@NotNull Context context, @NotNull CardUiData uiParams) {
        String string;
        PlayTool playTool;
        CardUiData mUiParam = getMUiParam();
        boolean zIsDeviceActive = false;
        if (mUiParam != null && (playTool = mUiParam.getPlayTool()) != null) {
            zIsDeviceActive = playTool.isDeviceActive();
        }
        e(zIsDeviceActive);
        PlayCardCommonLayoutBinding binding = getBinding();
        Integer toolIconRes = uiParams.getPlayTool().getToolIconRes();
        if (toolIconRes != null) {
            binding.llTitle.ivIcon.setImageResource(toolIconRes.intValue());
        }
        Integer toolNameRes = uiParams.getPlayTool().getToolNameRes();
        if (toolNameRes != null) {
            binding.llTitle.tvName.setText(context.getResources().getString(toolNameRes.intValue()));
        }
        TextView textView = binding.tvDesc;
        if (zIsDeviceActive) {
            string = uiParams.getPlayTool().isLongCard() ? context.getResources().getString(uiParams.getPlayTool().getSubLongTitleRes()) : context.getResources().getString(uiParams.getPlayTool().getSubTitleRes());
        } else {
            string = context.getResources().getString(R.string.play_device_not_active);
        }
        textView.setText(string);
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    @NotNull
    public PlayCardCommonLayoutBinding getLayoutViewBinding(@NotNull LayoutInflater inflater, @NotNull ViewGroup rootView) {
        return PlayCardCommonLayoutBinding.inflate(inflater, rootView, true);
    }
}
