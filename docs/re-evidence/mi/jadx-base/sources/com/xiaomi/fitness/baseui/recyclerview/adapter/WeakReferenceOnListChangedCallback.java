package com.xiaomi.fitness.baseui.recyclerview.adapter;

import androidx.databinding.f;
import com.xiaomi.fitness.baseui.Utils;
import com.xiaomi.onetrack.b.m;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00030\u0002B#\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000b\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\r\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ7\u0010\u0010\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0012\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\fR \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/baseui/recyclerview/adapter/WeakReferenceOnListChangedCallback;", "T", "Landroidx/databinding/f$a;", "Landroidx/databinding/f;", m.j, "", "onChanged", "(Landroidx/databinding/f;)V", "", "positionStart", "itemCount", "onItemRangeChanged", "(Landroidx/databinding/f;II)V", "onItemRangeInserted", "fromPosition", "toPosition", "onItemRangeMoved", "(Landroidx/databinding/f;III)V", "onItemRangeRemoved", "Ljava/lang/ref/WeakReference;", "Lcom/xiaomi/fitness/baseui/recyclerview/adapter/BaseAdapter;", "adapterRef", "Ljava/lang/ref/WeakReference;", "adapter", "items", "<init>", "(Lcom/xiaomi/fitness/baseui/recyclerview/adapter/BaseAdapter;Landroidx/databinding/f;)V", "ui_release"}, k = 1, mv = {2, 0, 0})
public final class WeakReferenceOnListChangedCallback<T> extends f.a<f<T>> {

    @NotNull
    private final WeakReference<BaseAdapter<T>> adapterRef;

    public WeakReferenceOnListChangedCallback(@NotNull BaseAdapter<T> adapter, @NotNull f<T> items) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(items, "items");
        this.adapterRef = AdapterReferenceCollector.INSTANCE.createRef(adapter, items, this);
    }

    @Override // androidx.databinding.f.a
    public void onChanged(@Nullable f<T> sender) {
        BaseAdapter<T> baseAdapter = this.adapterRef.get();
        if (baseAdapter == null) {
            return;
        }
        Utils.INSTANCE.ensureChangeOnMainThread();
        baseAdapter.notifyDataSetChanged();
    }

    @Override // androidx.databinding.f.a
    public void onItemRangeChanged(@Nullable f<T> sender, int positionStart, int itemCount) {
        onChanged(sender);
    }

    @Override // androidx.databinding.f.a
    public void onItemRangeInserted(@Nullable f<T> sender, int positionStart, int itemCount) {
        onChanged(sender);
    }

    @Override // androidx.databinding.f.a
    public void onItemRangeMoved(@Nullable f<T> sender, int fromPosition, int toPosition, int itemCount) {
        onChanged(sender);
    }

    @Override // androidx.databinding.f.a
    public void onItemRangeRemoved(@Nullable f<T> sender, int positionStart, int itemCount) {
        onChanged(sender);
    }
}
