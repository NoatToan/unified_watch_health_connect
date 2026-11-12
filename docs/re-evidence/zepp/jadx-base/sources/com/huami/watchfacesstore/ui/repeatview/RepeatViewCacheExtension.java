package com.huami.watchfacesstore.ui.repeatview;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0013\u001a\u00020\u0011\"\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0010\t\u001a\u00060\u0007R\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u0010\u001a\u00020\u000eR\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\"\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/watchfacesstore/ui/repeatview/RepeatViewCacheExtension;", "Landroidx/recyclerview/widget/RecyclerView$ViewCacheExtension;", "", "position", "type", "", "a", "Landroidx/recyclerview/widget/RecyclerView$Recycler;", "Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Landroid/view/View;", "getViewForPositionAndType", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "vh", "", "cacheViewHolder", "clear", "", "[I", "types", "", "b", "Ljava/util/Map;", "cachedMap", "<init>", "([I)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class RepeatViewCacheExtension extends RecyclerView.ViewCacheExtension {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final int[] types;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Map<Integer, RecyclerView.ViewHolder> cachedMap = new LinkedHashMap();

    public RepeatViewCacheExtension(@NotNull int... iArr) {
        this.types = iArr;
    }

    private final boolean a(int position, int type) {
        View view;
        if (!ArraysKt___ArraysKt.contains(this.types, type)) {
            return false;
        }
        RecyclerView.ViewHolder viewHolder = this.cachedMap.get(Integer.valueOf(position));
        ViewParent parent = null;
        if (viewHolder != null && (view = viewHolder.itemView) != null) {
            parent = view.getParent();
        }
        return parent == null;
    }

    public final void cacheViewHolder(int type, int position, @NotNull RecyclerView.ViewHolder vh) {
        if (!ArraysKt___ArraysKt.contains(this.types, type) || this.cachedMap.containsKey(Integer.valueOf(position))) {
            return;
        }
        this.cachedMap.put(Integer.valueOf(position), vh);
    }

    public final void clear() {
        this.cachedMap.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ViewCacheExtension
    @Nullable
    public View getViewForPositionAndType(@NotNull RecyclerView.Recycler recycler, int position, int type) {
        if (!ArraysKt___ArraysKt.contains(this.types, type)) {
            return null;
        }
        if (!a(position, type)) {
            this.cachedMap.remove(Integer.valueOf(position));
            return null;
        }
        RecyclerView.ViewHolder viewHolder = this.cachedMap.get(Integer.valueOf(position));
        if (viewHolder == null) {
            return null;
        }
        return viewHolder.itemView;
    }
}
