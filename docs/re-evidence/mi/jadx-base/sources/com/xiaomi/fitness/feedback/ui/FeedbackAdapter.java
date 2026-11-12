package com.xiaomi.fitness.feedback.ui;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Lifecycle;
import com.xiaomi.fitness.baseui.recyclerview.adapter.BaseBindingAdapter;
import com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseBindingViewHolder;
import defpackage.bv1;
import defpackage.vi9;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0007\b\t\nB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/feedback/ui/FeedbackAdapter;", "Lcom/xiaomi/fitness/baseui/recyclerview/adapter/BaseBindingAdapter;", "Lcom/xiaomi/fitness/feedback/ui/FeedbackItemInfo;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "<init>", "(Landroidx/lifecycle/Lifecycle;)V", "DeviceViewHolder", "AppViewHolder", "LabelViewHolder", "BottomViewHolder", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FeedbackAdapter extends BaseBindingAdapter<FeedbackItemInfo> {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/feedback/ui/FeedbackAdapter$AppViewHolder;", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseBindingViewHolder;", "Landroidx/databinding/ViewDataBinding;", "Lcom/xiaomi/fitness/feedback/ui/FeedbackItemInfo;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AppViewHolder extends BaseBindingViewHolder<ViewDataBinding, FeedbackItemInfo> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppViewHolder(@NotNull View view) {
            super(bv1.c, view);
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/feedback/ui/FeedbackAdapter$BottomViewHolder;", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseBindingViewHolder;", "Landroidx/databinding/ViewDataBinding;", "Lcom/xiaomi/fitness/feedback/ui/FeedbackItemInfo;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BottomViewHolder extends BaseBindingViewHolder<ViewDataBinding, FeedbackItemInfo> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BottomViewHolder(@NotNull View view) {
            super(bv1.c, view);
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/feedback/ui/FeedbackAdapter$DeviceViewHolder;", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseBindingViewHolder;", "Lvi9;", "Lcom/xiaomi/fitness/feedback/ui/FeedbackItemInfo;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class DeviceViewHolder extends BaseBindingViewHolder<vi9, FeedbackItemInfo> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeviceViewHolder(@NotNull View view) {
            super(bv1.c, view);
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/feedback/ui/FeedbackAdapter$LabelViewHolder;", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseBindingViewHolder;", "Landroidx/databinding/ViewDataBinding;", "Lcom/xiaomi/fitness/feedback/ui/FeedbackItemInfo;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LabelViewHolder extends BaseBindingViewHolder<ViewDataBinding, FeedbackItemInfo> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LabelViewHolder(@NotNull View view) {
            super(bv1.c, view);
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FeedbackAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ FeedbackAdapter(Lifecycle lifecycle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : lifecycle);
    }

    public FeedbackAdapter(@Nullable Lifecycle lifecycle) {
        super(lifecycle);
    }
}
