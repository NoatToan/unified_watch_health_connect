package com.xiaomi.fitness.baseui.recyclerview.viewholder;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.adapter.BaseAdapter;
import com.xiaomi.fitness.baseui.recyclerview.adapter.BaseBindingAdapter;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import defpackage.m9h;
import defpackage.sk5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u0002*\u0004\b\u0001\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00030\u0004B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u0014*\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0014¢\u0006\u0002\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u00142\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u00028\u0000X\u0084\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseBindingViewHolder;", "VDB", "Landroidx/databinding/ViewDataBinding;", "T", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseViewHolder;", "variableId", "", "view", "Landroid/view/View;", "<init>", "(ILandroid/view/View;)V", "getVariableId", "()I", "mBinding", "getMBinding", "()Landroidx/databinding/ViewDataBinding;", "setMBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "bind", "", DeviceTagInterface.CUSTOM_TAG_TYPE, "(Ljava/lang/Object;)V", "bindView", "(Landroidx/databinding/ViewDataBinding;Ljava/lang/Object;)V", "registerLifecycle", "adapter", "Lcom/xiaomi/fitness/baseui/recyclerview/adapter/BaseAdapter;", "addOnRebindCallback", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseBindingViewHolder<VDB extends ViewDataBinding, T> extends BaseViewHolder<T> {
    private VDB mBinding;
    private final int variableId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseBindingViewHolder(int i, @NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.variableId = i;
        VDB vdb = (VDB) sk5.c(this.itemView);
        Intrinsics.checkNotNull(vdb);
        this.mBinding = vdb;
    }

    public final void addOnRebindCallback(@Nullable final RecyclerView recyclerView) {
        VDB vdb = this.mBinding;
        if (vdb != null) {
            vdb.j(new m9h<ViewDataBinding>() { // from class: com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseBindingViewHolder.addOnRebindCallback.1
                @Override // defpackage.m9h
                public void onCanceled(ViewDataBinding binding) {
                    int bindingAdapterPosition;
                    Intrinsics.checkNotNullParameter(binding, "binding");
                    RecyclerView recyclerView2 = recyclerView;
                    if (recyclerView2 == null || recyclerView2.isComputingLayout() || (bindingAdapterPosition = this.getBindingAdapterPosition()) == -1) {
                        return;
                    }
                    try {
                        this.getMAdapter().notifyItemChanged(bindingAdapterPosition, BaseBindingAdapter.INSTANCE.getDATA_INVALIDATION());
                    } catch (IllegalStateException unused) {
                    }
                }

                @Override // defpackage.m9h
                public boolean onPreBind(ViewDataBinding binding) {
                    Intrinsics.checkNotNullParameter(binding, "binding");
                    RecyclerView recyclerView2 = recyclerView;
                    return recyclerView2 != null && recyclerView2.isComputingLayout();
                }
            });
        }
    }

    @Override // com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseViewHolder
    public void bind(T t) {
        bindView(this.mBinding, t);
    }

    public void bindView(VDB vdb, T t) {
    }

    public final VDB getMBinding() {
        return this.mBinding;
    }

    public final int getVariableId() {
        return this.variableId;
    }

    @Override // com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseViewHolder
    public void registerLifecycle(@NotNull BaseAdapter<T> adapter) {
        VDB vdb;
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.registerLifecycle(adapter);
        if (getMAdapter().getLifecycle() == null || (vdb = this.mBinding) == null) {
            return;
        }
        vdb.l0(this);
    }

    public final void setMBinding(VDB vdb) {
        this.mBinding = vdb;
    }
}
