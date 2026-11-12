package com.xiaomi.hm.health.play.card.intelligence;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.p008lifecycle.LifecycleOwner;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.databinding.PlayCardCommonLayoutBinding;
import com.xiaomi.hm.health.play.card.AbstractDeviceCardRender;
import com.xiaomi.hm.health.play.card.CardUiData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u0007H\u0016¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/play/card/intelligence/SimpleCardRender;", "Lcom/xiaomi/hm/health/play/card/AbstractDeviceCardRender;", "Lcom/xiaomi/hm/health/databinding/PlayCardCommonLayoutBinding;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/play/card/CardUiData;", "uiParams", "", "setCommonData", "setDeviceData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "rootView", "getLayoutViewBinding", "onDeviceNotConnected", "onDeviceNotActive", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "<init>", "(Landroidx/lifecycle/LifecycleOwner;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public class SimpleCardRender extends AbstractDeviceCardRender<PlayCardCommonLayoutBinding> {
    public SimpleCardRender(@NotNull LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.play.card.AbstractDeviceCardRender
    public void onDeviceNotActive() {
        ((PlayCardCommonLayoutBinding) getBinding()).tvDesc.setText(R.string.play_device_not_active);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.play.card.AbstractDeviceCardRender
    public void onDeviceNotConnected() {
        ((PlayCardCommonLayoutBinding) getBinding()).tvDesc.setText(R.string.training_playing_hr_exception_device_disconnect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.play.card.AbstractDeviceCardRender
    public void setCommonData(@NotNull Context context, @NotNull CardUiData uiParams) {
        Integer toolNameRes = uiParams.getPlayTool().getToolNameRes();
        if (toolNameRes != null) {
            ((PlayCardCommonLayoutBinding) getBinding()).llTitle.tvName.setText(toolNameRes.intValue());
        }
        Integer toolIconRes = uiParams.getPlayTool().getToolIconRes();
        if (toolIconRes == null) {
            return;
        }
        ((PlayCardCommonLayoutBinding) getBinding()).llTitle.ivIcon.setImageResource(toolIconRes.intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.play.card.AbstractDeviceCardRender
    public void setDeviceData(@NotNull Context context, @NotNull CardUiData uiParams) {
        if (uiParams.getPlayTool().isLongCard()) {
            ((PlayCardCommonLayoutBinding) getBinding()).tvDesc.setText(uiParams.getPlayTool().getSubLongTitleRes());
        } else {
            ((PlayCardCommonLayoutBinding) getBinding()).tvDesc.setText(uiParams.getPlayTool().getSubTitleRes());
        }
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    @NotNull
    public PlayCardCommonLayoutBinding getLayoutViewBinding(@NotNull LayoutInflater inflater, @NotNull ViewGroup rootView) {
        return PlayCardCommonLayoutBinding.inflate(inflater, rootView, true);
    }
}
