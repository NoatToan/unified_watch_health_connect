package com.xiaomi.fitness.feedback.bugreport;

import android.view.View;
import com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseBindingViewHolder;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import defpackage.bv1;
import defpackage.ni9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/feedback/bugreport/FeedBackSubCategoryHolder;", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseBindingViewHolder;", "Lni9;", "Lcom/xiaomi/fitness/feedback/bugreport/FeedbackDeviceInfo;", DeviceTagInterface.CUSTOM_TAG_TYPE, "", "bindView", "(Lni9;Lcom/xiaomi/fitness/feedback/bugreport/FeedbackDeviceInfo;)V", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FeedBackSubCategoryHolder extends BaseBindingViewHolder<ni9, FeedbackDeviceInfo> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedBackSubCategoryHolder(@NotNull View view) {
        super(bv1.c, view);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseBindingViewHolder
    public void bindView(@NotNull ni9 ni9Var, @NotNull FeedbackDeviceInfo t) {
        Intrinsics.checkNotNullParameter(ni9Var, "<this>");
        Intrinsics.checkNotNullParameter(t, "t");
    }
}
