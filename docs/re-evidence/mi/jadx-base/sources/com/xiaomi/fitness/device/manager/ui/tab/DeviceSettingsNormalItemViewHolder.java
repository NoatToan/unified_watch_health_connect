package com.xiaomi.fitness.device.manager.ui.tab;

import android.view.View;
import com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseBindingViewHolder;
import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import defpackage.hni;
import defpackage.nuf;
import defpackage.p76;
import defpackage.zv1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceSettingsNormalItemViewHolder;", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseBindingViewHolder;", "Lp76;", "Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;", DeviceTagInterface.CUSTOM_TAG_TYPE, "", "bindView", "(Lp76;Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;)V", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeviceSettingsNormalItemViewHolder extends BaseBindingViewHolder<p76, TabContentItem> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSettingsNormalItemViewHolder(@NotNull View view) {
        super(zv1.g, view);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseBindingViewHolder
    public void bindView(@NotNull p76 p76Var, @NotNull TabContentItem t) {
        Intrinsics.checkNotNullParameter(p76Var, "<this>");
        Intrinsics.checkNotNullParameter(t, "t");
        this.itemView.setBackgroundResource(hni.common_card_bg_white);
        nuf.f(this.itemView);
    }
}
