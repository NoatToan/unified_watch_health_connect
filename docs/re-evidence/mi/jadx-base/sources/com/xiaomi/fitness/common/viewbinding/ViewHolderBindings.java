package com.xiaomi.fitness.common.viewbinding;

import android.view.View;
import androidx.core.view.c;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.bsq;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001aE\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002*\u00028\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b\u001ac\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002*\u00028\u00002\u0014\b\u0004\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00010\u00042\u0014\b\u0006\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\f\u001aW\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002*\u00028\u00002\u0014\b\u0004\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00010\u00042\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"Landroidx/recyclerview/widget/RecyclerView$d0;", "VH", "Lbsq;", "T", "Lkotlin/Function1;", "viewBinder", "Lcom/xiaomi/fitness/common/viewbinding/ViewBindingProperty;", "viewBinding", "(Landroidx/recyclerview/widget/RecyclerView$d0;Lkotlin/jvm/functions/Function1;)Lcom/xiaomi/fitness/common/viewbinding/ViewBindingProperty;", "Landroid/view/View;", "vbFactory", "viewProvider", "(Landroidx/recyclerview/widget/RecyclerView$d0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/xiaomi/fitness/common/viewbinding/ViewBindingProperty;", "", "viewBindingRootId", "(Landroidx/recyclerview/widget/RecyclerView$d0;Lkotlin/jvm/functions/Function1;I)Lcom/xiaomi/fitness/common/viewbinding/ViewBindingProperty;", "common_release"}, k = 2, mv = {2, 0, 0})
@JvmName(name = "ViewHolderBindings")
public final class ViewHolderBindings {

    /* JADX INFO: Add missing generic type declarations: [VH, T] */
    /* JADX INFO: renamed from: com.xiaomi.fitness.common.viewbinding.ViewHolderBindings$viewBinding$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
    public static final class AnonymousClass2<T, VH> implements Function1<VH, T> {
        final /* synthetic */ Function1<View, T> $vbFactory;
        final /* synthetic */ Function1<VH, View> $viewProvider;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function1<? super VH, ? extends View> function1, Function1<? super View, ? extends T> function2) {
            this.$viewProvider = function1;
            this.$vbFactory = function2;
        }

        /* JADX WARN: Incorrect return type in method signature: (TVH;)TT; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final bsq invoke2(RecyclerView.d0 viewHolder) {
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            return (bsq) this.$vbFactory.invoke2(this.$viewProvider.invoke2(viewHolder));
        }
    }

    @NotNull
    public static final <VH extends RecyclerView.d0, T extends bsq> ViewBindingProperty<VH, T> viewBinding(@NotNull VH vh, @NotNull Function1<? super VH, ? extends T> viewBinder) {
        Intrinsics.checkNotNullParameter(vh, "<this>");
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        return new LazyViewBindingProperty(viewBinder);
    }

    public static /* synthetic */ ViewBindingProperty viewBinding$default(RecyclerView.d0 d0Var, Function1 vbFactory, Function1 viewProvider, int i, Object obj) {
        if ((i & 2) != 0) {
            viewProvider = new PropertyReference1Impl() { // from class: com.xiaomi.fitness.common.viewbinding.ViewHolderBindings.viewBinding.1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj2) {
                    return ((RecyclerView.d0) obj2).itemView;
                }
            };
        }
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        Intrinsics.checkNotNullParameter(viewProvider, "viewProvider");
        return new LazyViewBindingProperty(new AnonymousClass2(viewProvider, vbFactory));
    }

    @NotNull
    public static final <VH extends RecyclerView.d0, T extends bsq> ViewBindingProperty<VH, T> viewBinding(@NotNull VH vh, @NotNull Function1<? super View, ? extends T> vbFactory, @NotNull Function1<? super VH, ? extends View> viewProvider) {
        Intrinsics.checkNotNullParameter(vh, "<this>");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        Intrinsics.checkNotNullParameter(viewProvider, "viewProvider");
        return new LazyViewBindingProperty(new AnonymousClass2(viewProvider, vbFactory));
    }

    @NotNull
    public static final <VH extends RecyclerView.d0, T extends bsq> ViewBindingProperty<VH, T> viewBinding(@NotNull VH vh, @NotNull final Function1<? super View, ? extends T> vbFactory, final int i) {
        Intrinsics.checkNotNullParameter(vh, "<this>");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        return new LazyViewBindingProperty(new Function1<VH, T>() { // from class: com.xiaomi.fitness.common.viewbinding.ViewHolderBindings.viewBinding.3
            /* JADX WARN: Incorrect return type in method signature: (TVH;)TT; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final bsq invoke2(RecyclerView.d0 viewHolder) {
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                Function1<View, T> function1 = vbFactory;
                View itemView = viewHolder.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                return (bsq) function1.invoke2(c.o0(itemView, i));
            }
        });
    }
}
