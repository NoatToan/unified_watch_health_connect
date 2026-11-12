package com.xiaomi.hm.health.smalltool;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.xiaomi.hm.health.databinding.SmallToolGridTitleBinding;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/smalltool/ToolTitleHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "titleResId", "", "bindTo", "Lcom/xiaomi/hm/health/databinding/SmallToolGridTitleBinding;", "a", "Lcom/xiaomi/hm/health/databinding/SmallToolGridTitleBinding;", "getBinding", "()Lcom/xiaomi/hm/health/databinding/SmallToolGridTitleBinding;", "binding", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "<init>", "(Landroid/view/View;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ToolTitleHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SmallToolGridTitleBinding binding;

    public ToolTitleHolder(@NotNull View view) {
        super(view);
        this.binding = SmallToolGridTitleBinding.bind(view);
    }

    public final void bindTo(int titleResId) {
        this.binding.setTitleResId(Integer.valueOf(titleResId));
    }

    @NotNull
    public final SmallToolGridTitleBinding getBinding() {
        return this.binding;
    }
}
