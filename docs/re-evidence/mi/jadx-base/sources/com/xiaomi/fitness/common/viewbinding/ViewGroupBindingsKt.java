package com.xiaomi.fitness.common.viewbinding;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.c;
import defpackage.bsq;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aK\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\n\u001aM\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u000e\u001aU\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"Lbsq;", "T", "Landroid/view/ViewGroup;", "Lkotlin/Function1;", "vbFactory", "Lcom/xiaomi/fitness/common/viewbinding/ViewBindingProperty;", "viewBinding", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;)Lcom/xiaomi/fitness/common/viewbinding/ViewBindingProperty;", "", "lifecycleAware", "(Landroid/view/ViewGroup;ZLkotlin/jvm/functions/Function1;)Lcom/xiaomi/fitness/common/viewbinding/ViewBindingProperty;", "", "viewBindingRootId", "Landroid/view/View;", "(Landroid/view/ViewGroup;ILkotlin/jvm/functions/Function1;)Lcom/xiaomi/fitness/common/viewbinding/ViewBindingProperty;", "(Landroid/view/ViewGroup;IZLkotlin/jvm/functions/Function1;)Lcom/xiaomi/fitness/common/viewbinding/ViewBindingProperty;", "common_release"}, k = 2, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nViewGroupBindings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewGroupBindings.kt\ncom/xiaomi/fitness/common/viewbinding/ViewGroupBindingsKt\n*L\n1#1,82:1\n49#1,4:83\n74#1,4:87\n*S KotlinDebug\n*F\n+ 1 ViewGroupBindings.kt\ncom/xiaomi/fitness/common/viewbinding/ViewGroupBindingsKt\n*L\n35#1:83,4\n59#1:87,4\n*E\n"})
public final class ViewGroupBindingsKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.xiaomi.fitness.common.viewbinding.ViewGroupBindingsKt$viewBinding$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
    public static final class AnonymousClass2<T> implements Function1<ViewGroup, T> {
        final /* synthetic */ Function1<ViewGroup, T> $vbFactory;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function1<? super ViewGroup, ? extends T> function1) {
            this.$vbFactory = function1;
        }

        /* JADX WARN: Incorrect return type in method signature: (Landroid/view/ViewGroup;)TT; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final bsq invoke2(ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
            return (bsq) this.$vbFactory.invoke2(viewGroup);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.xiaomi.fitness.common.viewbinding.ViewGroupBindingsKt$viewBinding$4, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nViewGroupBindings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewGroupBindings.kt\ncom/xiaomi/fitness/common/viewbinding/ViewGroupBindingsKt$viewBinding$4\n+ 2 ViewBindingUtil.kt\ncom/xiaomi/fitness/common/viewbinding/ViewBindingUtilKt\n*L\n1#1,82:1\n18#2:83\n*S KotlinDebug\n*F\n+ 1 ViewGroupBindings.kt\ncom/xiaomi/fitness/common/viewbinding/ViewGroupBindingsKt$viewBinding$4\n*L\n78#1:83\n*E\n"})
    public static final class AnonymousClass4<T> implements Function1<ViewGroup, T> {
        final /* synthetic */ Function1<View, T> $vbFactory;
        final /* synthetic */ int $viewBindingRootId;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(Function1<? super View, ? extends T> function1, int i) {
            this.$vbFactory = function1;
            this.$viewBindingRootId = i;
        }

        /* JADX WARN: Incorrect return type in method signature: (Landroid/view/ViewGroup;)TT; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final bsq invoke2(ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
            return (bsq) this.$vbFactory.invoke2(c.o0(viewGroup, this.$viewBindingRootId));
        }
    }

    @Deprecated(message = "will be remove")
    @NotNull
    public static final <T extends bsq> ViewBindingProperty<ViewGroup, T> viewBinding(@NotNull ViewGroup viewGroup, boolean z, @NotNull final Function1<? super ViewGroup, ? extends T> vbFactory) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        if (viewGroup.isInEditMode()) {
            return new EagerViewBindingProperty(vbFactory.invoke2(viewGroup));
        }
        return z ? new ViewGroupViewBindingProperty(new Function1<ViewGroup, T>() { // from class: com.xiaomi.fitness.common.viewbinding.ViewGroupBindingsKt.viewBinding.1
            /* JADX WARN: Incorrect return type in method signature: (Landroid/view/ViewGroup;)TT; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final bsq invoke2(ViewGroup viewGroup2) {
                Intrinsics.checkNotNullParameter(viewGroup2, "viewGroup");
                return (bsq) vbFactory.invoke2(viewGroup2);
            }
        }) : new LazyViewBindingProperty(new AnonymousClass2(vbFactory));
    }

    @NotNull
    public static final <T extends bsq> ViewBindingProperty<ViewGroup, T> viewBinding(@NotNull ViewGroup viewGroup, int i, boolean z, @NotNull final Function1<? super View, ? extends T> vbFactory) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        if (viewGroup.isInEditMode()) {
            return new EagerViewBindingProperty(vbFactory.invoke2(viewGroup));
        }
        if (z) {
            return new ViewGroupViewBindingProperty(new Function1<ViewGroup, T>() { // from class: com.xiaomi.fitness.common.viewbinding.ViewGroupBindingsKt.viewBinding.3
                /* JADX WARN: Incorrect return type in method signature: (Landroid/view/ViewGroup;)TT; */
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final bsq invoke2(ViewGroup viewGroup2) {
                    Intrinsics.checkNotNullParameter(viewGroup2, "viewGroup");
                    return (bsq) vbFactory.invoke2(viewGroup2);
                }
            });
        }
        return new LazyViewBindingProperty(new AnonymousClass4(vbFactory, i));
    }

    @NotNull
    public static final <T extends bsq> ViewBindingProperty<ViewGroup, T> viewBinding(@NotNull ViewGroup viewGroup, @NotNull Function1<? super ViewGroup, ? extends T> vbFactory) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        return viewGroup.isInEditMode() ? new EagerViewBindingProperty(vbFactory.invoke2(viewGroup)) : new LazyViewBindingProperty(new AnonymousClass2(vbFactory));
    }

    @NotNull
    public static final <T extends bsq> ViewBindingProperty<ViewGroup, T> viewBinding(@NotNull ViewGroup viewGroup, int i, @NotNull Function1<? super View, ? extends T> vbFactory) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        return viewGroup.isInEditMode() ? new EagerViewBindingProperty(vbFactory.invoke2(viewGroup)) : new LazyViewBindingProperty(new AnonymousClass4(vbFactory, i));
    }
}
