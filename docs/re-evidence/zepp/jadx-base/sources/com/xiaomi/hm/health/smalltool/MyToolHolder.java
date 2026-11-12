package com.xiaomi.hm.health.smalltool;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.xiaomi.hm.health.databinding.MyToolsGridItemBinding;
import com.xiaomi.hm.health.smalltool.model.Tool;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R!\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/smalltool/MyToolHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/xiaomi/hm/health/smalltool/model/Tool;", "item", "Lcom/xiaomi/hm/health/smalltool/ToolViewModel;", "viewModel", "", "bindTo", "Lcom/xiaomi/hm/health/databinding/MyToolsGridItemBinding;", "kotlin.jvm.PlatformType", "a", "Lcom/xiaomi/hm/health/databinding/MyToolsGridItemBinding;", "getBinding", "()Lcom/xiaomi/hm/health/databinding/MyToolsGridItemBinding;", "binding", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "<init>", "(Landroid/view/View;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class MyToolHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final MyToolsGridItemBinding binding;

    public MyToolHolder(@NotNull View view) {
        super(view);
        this.binding = MyToolsGridItemBinding.bind(view);
    }

    public final void bindTo(@NotNull Tool item, @NotNull ToolViewModel viewModel) {
        this.binding.setItem(item);
        this.binding.setViewmodel(viewModel);
        this.binding.getRoot().setTransitionName(item.name());
    }

    public final MyToolsGridItemBinding getBinding() {
        return this.binding;
    }
}
