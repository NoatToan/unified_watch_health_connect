package com.xiaomi.fitness.baseui.recyclerview.viewholder;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.adapter.BaseAdapter;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import defpackage.nfe;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010'\u001a\u00020\u0012¢\u0006\u0004\b(\u0010)J\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00028\u0000H&¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\nJ!\u0010\u0016\u001a\u00028\u0001\"\b\b\u0001\u0010\u0013*\u00020\u00122\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\bR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseViewHolder;", "T", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroidx/lifecycle/LifecycleOwner;", "Lcom/xiaomi/fitness/baseui/recyclerview/adapter/BaseAdapter;", "adapter", "", "registerLifecycle", "(Lcom/xiaomi/fitness/baseui/recyclerview/adapter/BaseAdapter;)V", "unregisterLifecycle$ui_release", "()V", "unregisterLifecycle", "item", "onBindViewHolder", "(Ljava/lang/Object;)V", DeviceTagInterface.CUSTOM_TAG_TYPE, "bind", "unbind", "Landroid/view/View;", "V", "", "viewId", "getView", "(I)Landroid/view/View;", "Landroidx/lifecycle/LifecycleRegistry;", "mLifecycle", "Landroidx/lifecycle/LifecycleRegistry;", "mAdapter", "Lcom/xiaomi/fitness/baseui/recyclerview/adapter/BaseAdapter;", "getMAdapter", "()Lcom/xiaomi/fitness/baseui/recyclerview/adapter/BaseAdapter;", "setMAdapter", "Lnfe;", "lifecycleObserver", "Lnfe;", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "view", "<init>", "(Landroid/view/View;)V", "ui_release"}, k = 1, mv = {2, 0, 0})
public abstract class BaseViewHolder<T> extends RecyclerView.d0 implements LifecycleOwner {

    @Nullable
    private nfe lifecycleObserver;
    protected BaseAdapter<T> mAdapter;
    private LifecycleRegistry mLifecycle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public abstract void bind(T t);

    @Override // androidx.lifecycle.LifecycleOwner
    @NotNull
    public Lifecycle getLifecycle() {
        LifecycleRegistry lifecycleRegistry = this.mLifecycle;
        if (lifecycleRegistry != null) {
            return lifecycleRegistry;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mLifecycle");
        return null;
    }

    @NotNull
    public final BaseAdapter<T> getMAdapter() {
        BaseAdapter<T> baseAdapter = this.mAdapter;
        if (baseAdapter != null) {
            return baseAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        return null;
    }

    @NotNull
    public final <V extends View> V getView(int viewId) {
        V v = (V) this.itemView.findViewById(viewId);
        Intrinsics.checkNotNullExpressionValue(v, "findViewById(...)");
        return v;
    }

    public void onBindViewHolder(T item) {
        bind(item);
    }

    public void registerLifecycle(@NotNull BaseAdapter<T> adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        setMAdapter(adapter);
        this.mLifecycle = new LifecycleRegistry(this);
        Lifecycle lifecycle = getMAdapter().getLifecycle();
        if (lifecycle != null) {
            LifecycleRegistry lifecycleRegistry = this.mLifecycle;
            if (lifecycleRegistry == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLifecycle");
                lifecycleRegistry = null;
            }
            ViewHolderLifecycleObserver viewHolderLifecycleObserver = new ViewHolderLifecycleObserver(lifecycle, lifecycleRegistry);
            this.lifecycleObserver = viewHolderLifecycleObserver;
            Intrinsics.checkNotNull(viewHolderLifecycleObserver);
            lifecycle.addObserver(viewHolderLifecycleObserver);
        }
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        ViewTreeLifecycleOwner.set(itemView, this);
    }

    public final void setMAdapter(@NotNull BaseAdapter<T> baseAdapter) {
        Intrinsics.checkNotNullParameter(baseAdapter, "<set-?>");
        this.mAdapter = baseAdapter;
    }

    public void unbind() {
    }

    public final void unregisterLifecycle$ui_release() {
        Lifecycle lifecycle;
        if (this.lifecycleObserver == null || (lifecycle = getMAdapter().getLifecycle()) == null) {
            return;
        }
        nfe nfeVar = this.lifecycleObserver;
        Intrinsics.checkNotNull(nfeVar);
        lifecycle.removeObserver(nfeVar);
    }
}
