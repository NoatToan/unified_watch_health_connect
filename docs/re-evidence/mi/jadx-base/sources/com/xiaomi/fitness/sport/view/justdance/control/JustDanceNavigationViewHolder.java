package com.xiaomi.fitness.sport.view.justdance.control;

import android.view.View;
import android.view.ViewGroup;
import androidx.work.WorkInfo;
import com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseBindingViewHolder;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.sport.view.justdance.PhoneActionNavigation;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import defpackage.ipn;
import defpackage.nv1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sport/view/justdance/control/JustDanceNavigationViewHolder;", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseBindingViewHolder;", "Lipn;", "Lcom/xiaomi/fitness/sport/view/justdance/PhoneActionNavigation;", DeviceTagInterface.CUSTOM_TAG_TYPE, "", "bindView", "(Lipn;Lcom/xiaomi/fitness/sport/view/justdance/PhoneActionNavigation;)V", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class JustDanceNavigationViewHolder extends BaseBindingViewHolder<ipn, PhoneActionNavigation> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JustDanceNavigationViewHolder(@NotNull View view) {
        super(nv1.g, view);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseBindingViewHolder
    public void bindView(@NotNull ipn ipnVar, @NotNull PhoneActionNavigation t) {
        Intrinsics.checkNotNullParameter(ipnVar, "<this>");
        Intrinsics.checkNotNullParameter(t, "t");
        int screenWidth = (DisplayUtil.getScreenWidth() - (ExtUtilsKt.getDp(26) * 2)) + WorkInfo.STOP_REASON_NOT_STOPPED;
        ViewGroup.LayoutParams layoutParams = ipnVar.getRoot().getLayoutParams();
        layoutParams.width = screenWidth / t.getTotalCount();
        ipnVar.getRoot().setLayoutParams(layoutParams);
        ipnVar.A.setImageResource(t.getShortcutImage());
    }
}
