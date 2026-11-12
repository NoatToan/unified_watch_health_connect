package com.xiaomi.fitness.common.viewbinding;

import android.view.View;
import androidx.core.view.c;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import defpackage.bsq;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001aG\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001ac\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002*\u00020\u00002\u0014\b\u0004\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00010\u00042\u0014\b\u0006\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\r\u001aW\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002*\u00020\u00002\u0014\b\u0004\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00010\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, d2 = {"Landroidx/fragment/app/Fragment;", "F", "Lbsq;", "T", "Lkotlin/Function1;", "viewBinder", "Lcom/xiaomi/fitness/common/viewbinding/ViewBindingProperty;", "viewBindingFragment", "(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)Lcom/xiaomi/fitness/common/viewbinding/ViewBindingProperty;", "viewBinding", "Landroid/view/View;", "vbFactory", "viewProvider", "(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/xiaomi/fitness/common/viewbinding/ViewBindingProperty;", "", "viewBindingRootId", "(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;I)Lcom/xiaomi/fitness/common/viewbinding/ViewBindingProperty;", "common_release"}, k = 2, mv = {2, 0, 0})
@JvmName(name = "FragmentViewBindings")
@SourceDebugExtension({"SMAP\nFragmentViewBindings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewBindings.kt\ncom/xiaomi/fitness/common/viewbinding/FragmentViewBindings\n*L\n1#1,96:1\n68#1:97\n68#1:98\n*S KotlinDebug\n*F\n+ 1 FragmentViewBindings.kt\ncom/xiaomi/fitness/common/viewbinding/FragmentViewBindings\n*L\n85#1:97\n90#1:98\n*E\n"})
public final class FragmentViewBindings {
    @JvmName(name = "viewBindingFragment")
    @NotNull
    public static final <F extends Fragment, T extends bsq> ViewBindingProperty<F, T> viewBindingFragment(@NotNull Fragment fragment, @NotNull Function1<? super F, ? extends T> viewBinder) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        return fragment instanceof DialogFragment ? new DialogFragmentViewBindingProperty(viewBinder) : new FragmentViewBindingProperty(viewBinder);
    }

    public static /* synthetic */ ViewBindingProperty viewBindingFragment$default(Fragment fragment, Function1 vbFactory, Function1 viewProvider, int i, Object obj) {
        if ((i & 2) != 0) {
            viewProvider = FragmentViewBindings$viewBinding$1.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        Intrinsics.checkNotNullParameter(viewProvider, "viewProvider");
        return viewBindingFragment(fragment, new FragmentViewBindings$viewBinding$2(vbFactory, viewProvider));
    }

    @JvmName(name = "viewBindingFragment")
    @NotNull
    public static final <F extends Fragment, T extends bsq> ViewBindingProperty<F, T> viewBindingFragment(@NotNull Fragment fragment, @NotNull Function1<? super View, ? extends T> vbFactory, @NotNull Function1<? super F, ? extends View> viewProvider) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        Intrinsics.checkNotNullParameter(viewProvider, "viewProvider");
        return viewBindingFragment(fragment, new FragmentViewBindings$viewBinding$2(vbFactory, viewProvider));
    }

    @JvmName(name = "viewBindingFragment")
    @NotNull
    public static final <F extends Fragment, T extends bsq> ViewBindingProperty<F, T> viewBindingFragment(@NotNull Fragment fragment, @NotNull final Function1<? super View, ? extends T> vbFactory, final int i) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        if (fragment instanceof DialogFragment) {
            ViewBindingProperty<F, T> viewBindingPropertyViewBindingFragment = viewBindingFragment(fragment, new Function1<DialogFragment, T>() { // from class: com.xiaomi.fitness.common.viewbinding.FragmentViewBindings$viewBinding$$inlined$viewBindingFragment$1
                /* JADX WARN: Incorrect return type in method signature: (Landroidx/fragment/app/DialogFragment;)TT; */
                public final bsq invoke(Fragment fragment2) {
                    Intrinsics.checkNotNullParameter(fragment2, "fragment");
                    return (bsq) vbFactory.invoke2(ViewBindingUtilKt.getRootView((DialogFragment) fragment2, i));
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Object invoke2(DialogFragment dialogFragment) {
                    return invoke((Fragment) dialogFragment);
                }
            });
            Intrinsics.checkNotNull(viewBindingPropertyViewBindingFragment, "null cannot be cast to non-null type com.xiaomi.fitness.common.viewbinding.ViewBindingProperty<F of com.xiaomi.fitness.common.viewbinding.FragmentViewBindings.viewBinding, T of com.xiaomi.fitness.common.viewbinding.FragmentViewBindings.viewBinding>");
            return viewBindingPropertyViewBindingFragment;
        }
        return viewBindingFragment(fragment, new Function1<F, T>() { // from class: com.xiaomi.fitness.common.viewbinding.FragmentViewBindings$viewBinding$$inlined$viewBindingFragment$2
            /* JADX WARN: Incorrect return type in method signature: (TF;)TT; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final bsq invoke2(Fragment fragment2) {
                Intrinsics.checkNotNullParameter(fragment2, "fragment");
                Function1 function1 = vbFactory;
                View viewRequireView = fragment2.requireView();
                Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                return (bsq) function1.invoke2(c.o0(viewRequireView, i));
            }
        });
    }
}
