package com.reactnativepagerview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/reactnativepagerview/ViewPagerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/FrameLayout;", "getContainer", "()Landroid/widget/FrameLayout;", "container", "<init>", "(Landroid/widget/FrameLayout;)V", "Companion", "react-native-pager-view_release"}, k = 1, mv = {2, 0, 0})
public final class ViewPagerViewHolder extends RecyclerView.d0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/reactnativepagerview/ViewPagerViewHolder$Companion;", "", "<init>", "()V", "create", "Lcom/reactnativepagerview/ViewPagerViewHolder;", "parent", "Landroid/view/ViewGroup;", "react-native-pager-view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ViewPagerViewHolder create(@NotNull ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            FrameLayout frameLayout = new FrameLayout(parent.getContext());
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.setSaveEnabled(false);
            return new ViewPagerViewHolder(frameLayout, null);
        }
    }

    public /* synthetic */ ViewPagerViewHolder(FrameLayout frameLayout, DefaultConstructorMarker defaultConstructorMarker) {
        this(frameLayout);
    }

    @NotNull
    public final FrameLayout getContainer() {
        View view = this.itemView;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.FrameLayout");
        return (FrameLayout) view;
    }

    private ViewPagerViewHolder(FrameLayout frameLayout) {
        super(frameLayout);
    }
}
