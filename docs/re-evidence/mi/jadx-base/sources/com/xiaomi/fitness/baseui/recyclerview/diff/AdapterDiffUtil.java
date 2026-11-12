package com.xiaomi.fitness.baseui.recyclerview.diff;

import androidx.recyclerview.widget.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B5\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\bR\u001c\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/baseui/recyclerview/diff/AdapterDiffUtil;", "T", "Landroidx/recyclerview/widget/h$b;", "", "oldItemPosition", "newItemPosition", "", "areItemsTheSame", "(II)Z", "getOldListSize", "()I", "getNewListSize", "areContentsTheSame", "", "oldList", "Ljava/util/List;", "newList", "Lcom/xiaomi/fitness/baseui/recyclerview/diff/DiffCallback;", "callback", "Lcom/xiaomi/fitness/baseui/recyclerview/diff/DiffCallback;", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/xiaomi/fitness/baseui/recyclerview/diff/DiffCallback;)V", "ui_release"}, k = 1, mv = {2, 0, 0})
public final class AdapterDiffUtil<T> extends h.b {

    @NotNull
    private final DiffCallback<T> callback;

    @Nullable
    private final List<T> newList;

    @Nullable
    private final List<T> oldList;

    /* JADX WARN: Multi-variable type inference failed */
    public AdapterDiffUtil(@Nullable List<? extends T> list, @Nullable List<? extends T> list2, @NotNull DiffCallback<T> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.oldList = list;
        this.newList = list2;
        this.callback = callback;
    }

    @Override // androidx.recyclerview.widget.h.b
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        List<T> list = this.oldList;
        if ((list != null ? list.get(oldItemPosition) : null) == null) {
            return false;
        }
        List<T> list2 = this.newList;
        if ((list2 != null ? list2.get(newItemPosition) : null) != null) {
            return this.callback.areContentsTheSame(this.oldList.get(oldItemPosition), this.newList.get(newItemPosition));
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.h.b
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        List<T> list = this.oldList;
        if ((list != null ? list.get(oldItemPosition) : null) == null) {
            return false;
        }
        List<T> list2 = this.newList;
        if ((list2 != null ? list2.get(newItemPosition) : null) != null) {
            return this.callback.areItemsTheSame(this.oldList.get(oldItemPosition), this.newList.get(newItemPosition));
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.h.b
    public int getNewListSize() {
        List<T> list = this.newList;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.h.b
    public int getOldListSize() {
        List<T> list = this.oldList;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
