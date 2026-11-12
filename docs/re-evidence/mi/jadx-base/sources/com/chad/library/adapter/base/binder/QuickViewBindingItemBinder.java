package com.chad.library.adapter.base.binder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import defpackage.bsq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u0004:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00028\u00012\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/chad/library/adapter/base/binder/QuickViewBindingItemBinder;", "T", "Lbsq;", "VB", "Lcom/chad/library/adapter/base/binder/BaseItemBinder;", "Lcom/chad/library/adapter/base/binder/QuickViewBindingItemBinder$BinderVBHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/binder/QuickViewBindingItemBinder$BinderVBHolder;", "Landroid/view/LayoutInflater;", "layoutInflater", "onCreateViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Lbsq;", "<init>", "()V", "BinderVBHolder", "com.github.CymChad.brvah"}, k = 1, mv = {1, 4, 0})
public abstract class QuickViewBindingItemBinder<T, VB extends bsq> extends BaseItemBinder<T, BinderVBHolder<VB>> {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/chad/library/adapter/base/binder/QuickViewBindingItemBinder$BinderVBHolder;", "Lbsq;", "VB", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "viewBinding", "Lbsq;", "getViewBinding", "()Lbsq;", "<init>", "(Lbsq;)V", "com.github.CymChad.brvah"}, k = 1, mv = {1, 4, 0})
    public static final class BinderVBHolder<VB extends bsq> extends BaseViewHolder {

        @NotNull
        private final VB viewBinding;

        /* JADX WARN: Illegal instructions before constructor call */
        public BinderVBHolder(@NotNull VB vb) {
            View root = vb.getRoot();
            Intrinsics.checkExpressionValueIsNotNull(root, "viewBinding.root");
            super(root);
            this.viewBinding = vb;
        }

        @NotNull
        public final VB getViewBinding() {
            return this.viewBinding;
        }
    }

    @NotNull
    public abstract VB onCreateViewBinding(@NotNull LayoutInflater layoutInflater, @NotNull ViewGroup parent, int viewType);

    @Override // com.chad.library.adapter.base.binder.BaseItemBinder
    @NotNull
    public BinderVBHolder<VB> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        Intrinsics.checkExpressionValueIsNotNull(layoutInflaterFrom, "LayoutInflater.from(parent.context)");
        return new BinderVBHolder<>(onCreateViewBinding(layoutInflaterFrom, parent, viewType));
    }
}
