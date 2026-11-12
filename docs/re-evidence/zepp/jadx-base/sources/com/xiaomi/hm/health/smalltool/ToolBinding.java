package com.xiaomi.hm.health.smalltool;

import android.annotation.SuppressLint;
import android.widget.ImageView;
import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.watch.util.Log;
import com.xiaomi.hm.health.smalltool.model.Tool;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007J0\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007J0\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007J8\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0003J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/smalltool/ToolBinding;", "", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "Lcom/xiaomi/hm/health/smalltool/model/Tool;", "items", "", "setItems", "myItems", "setItemsWithoutNotify", "", "withNotify", "a", "Landroid/widget/ImageView;", "imageView", "", "resId", "setImageResource", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ToolBinding {

    @NotNull
    public static final ToolBinding INSTANCE = new ToolBinding();

    private ToolBinding() {
    }

    @JvmStatic
    private static final void a(RecyclerView recyclerView, List<? extends Tool> items, List<? extends Tool> myItems, boolean withNotify) {
        Log.d("SmallTool-Binding", "SetItems: SupportTools, WithNotify: " + withNotify, new Object[0]);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.xiaomi.hm.health.smalltool.ToolSortAdapter");
        ToolSortAdapter toolSortAdapter = (ToolSortAdapter) adapter;
        if (items == null || myItems == null) {
            return;
        }
        toolSortAdapter.updateData(items, myItems);
        if (withNotify) {
            toolSortAdapter.notifyDataSetChanged();
        }
    }

    @BindingAdapter({"android:src"})
    @JvmStatic
    public static final void setImageResource(@NotNull ImageView imageView, int resId) {
        imageView.setImageResource(resId);
    }

    @BindingAdapter({"items"})
    @JvmStatic
    @SuppressLint({"NotifyDataSetChanged"})
    public static final void setItems(@NotNull RecyclerView recyclerView, @Nullable List<? extends Tool> items) {
        Log.d("SmallTool-Binding", "SetItems: MyTools", new Object[0]);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.xiaomi.hm.health.smalltool.ToolMyToolsAdapter");
        ToolMyToolsAdapter toolMyToolsAdapter = (ToolMyToolsAdapter) adapter;
        if (items == null) {
            return;
        }
        toolMyToolsAdapter.updateData(items);
        toolMyToolsAdapter.notifyDataSetChanged();
    }

    @JvmStatic
    public static final void setItemsWithoutNotify(@NotNull RecyclerView recyclerView, @Nullable List<? extends Tool> items, @Nullable List<? extends Tool> myItems) {
        a(recyclerView, items, myItems, false);
    }

    @BindingAdapter({"items", "myItems"})
    @JvmStatic
    public static final void setItems(@NotNull RecyclerView recyclerView, @Nullable List<? extends Tool> items, @Nullable List<? extends Tool> myItems) {
        a(recyclerView, items, myItems, true);
    }
}
