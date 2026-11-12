package com.huami.thirdparty.support.viewbinding;

import android.app.Dialog;
import android.view.View;
import android.view.Window;
import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.DialogFragment;
import androidx.viewbinding.ViewBinding;
import com.huami.thirdparty.support.viewbinding.internal.ViewBindingCache;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a6\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u000b\u001a\u0014\u0010\r\u001a\u00020\f*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0003\u001aG\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0000\u0010\u000e*\u00020\u0002\"\b\b\u0001\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000fH\u0007¢\u0006\u0004\b\u0006\u0010\u0011\u001ac\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0000\u0010\u000e*\u00020\u0002\"\b\b\u0001\u0010\u0001*\u00020\u0000*\u00020\u00022\u0014\b\u0004\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00010\u000f2\u0014\b\u0004\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u000fH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0014\u001aM\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0014\b\u0004\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u000f2\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/fragment/app/DialogFragment;", "", "viewBindingRootId", "Lcom/huami/thirdparty/support/viewbinding/ViewBindingProperty;", "viewBindingDialogFragment", "(Landroidx/fragment/app/DialogFragment;I)Lcom/huami/thirdparty/support/viewbinding/ViewBindingProperty;", "dialogViewBinding", "Ljava/lang/Class;", "viewBindingClass", "(Landroidx/fragment/app/DialogFragment;Ljava/lang/Class;I)Lcom/huami/thirdparty/support/viewbinding/ViewBindingProperty;", "Landroid/view/View;", "a", "F", "Lkotlin/Function1;", "viewBinder", "(Landroidx/fragment/app/DialogFragment;Lkotlin/jvm/functions/Function1;)Lcom/huami/thirdparty/support/viewbinding/ViewBindingProperty;", "vbFactory", "viewProvider", "(Landroidx/fragment/app/DialogFragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/huami/thirdparty/support/viewbinding/ViewBindingProperty;", "(Landroidx/fragment/app/DialogFragment;Lkotlin/jvm/functions/Function1;I)Lcom/huami/thirdparty/support/viewbinding/ViewBindingProperty;", "support_release"}, k = 2, mv = {1, 5, 1})
@JvmName(name = "ReflectionDialogFragmentViewBindings")
public final class ReflectionDialogFragmentViewBindings {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/fragment/app/DialogFragment;", "dialogFragment", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a<T> extends Lambda implements Function1<DialogFragment, T> {
        public final /* synthetic */ Class<T> a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class<T> cls, int i) {
            super(1);
            this.a = cls;
            this.b = i;
        }

        /* JADX WARN: Incorrect return type in method signature: (Landroidx/fragment/app/DialogFragment;)TT; */
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final ViewBinding invoke(@NotNull DialogFragment dialogFragment) {
            return ViewBindingCache.INSTANCE.getBind$support_release(this.a).bind(ReflectionDialogFragmentViewBindings.a(dialogFragment, this.b));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final View a(DialogFragment dialogFragment, int i) {
        Dialog dialog = dialogFragment.getDialog();
        if (dialog == null) {
            throw new IllegalStateException("Dialog hasn't been created yet".toString());
        }
        Window window = dialog.getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window".toString());
        }
        View decorView = window.getDecorView();
        return i != 0 ? decorView.findViewById(i) : decorView;
    }

    @JvmName(name = "viewBindingDialogFragment")
    public static final /* synthetic */ <T extends ViewBinding> ViewBindingProperty<DialogFragment, T> viewBindingDialogFragment(DialogFragment dialogFragment, @IdRes int i) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return viewBindingDialogFragment(dialogFragment, ViewBinding.class, i);
    }

    @JvmName(name = "viewBindingDialogFragment")
    @NotNull
    public static final <T extends ViewBinding> ViewBindingProperty<DialogFragment, T> viewBindingDialogFragment(@NotNull DialogFragment dialogFragment, @NotNull Class<T> cls, @IdRes int i) {
        return viewBindingDialogFragment(dialogFragment, new a(cls, i));
    }

    @JvmName(name = "viewBindingDialogFragment")
    @NotNull
    public static final <F extends DialogFragment, T extends ViewBinding> ViewBindingProperty<F, T> viewBindingDialogFragment(@NotNull DialogFragment dialogFragment, @NotNull Function1<? super F, ? extends T> function1) {
        return new b(function1);
    }

    @JvmName(name = "viewBindingDialogFragment")
    @NotNull
    public static final <F extends DialogFragment, T extends ViewBinding> ViewBindingProperty<F, T> viewBindingDialogFragment(@NotNull DialogFragment dialogFragment, @NotNull final Function1<? super View, ? extends T> function1, @NotNull final Function1<? super F, ? extends View> function2) {
        return viewBindingDialogFragment(dialogFragment, new Function1<F, T>() { // from class: com.huami.thirdparty.support.viewbinding.ReflectionDialogFragmentViewBindings$dialogViewBinding$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Incorrect return type in method signature: (TF;)TT; */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final ViewBinding invoke(@NotNull DialogFragment dialogFragment2) {
                return (ViewBinding) function1.invoke(function2.invoke(dialogFragment2));
            }
        });
    }

    @JvmName(name = "viewBindingDialogFragment")
    @NotNull
    public static final <T extends ViewBinding> ViewBindingProperty<DialogFragment, T> viewBindingDialogFragment(@NotNull DialogFragment dialogFragment, @NotNull final Function1<? super View, ? extends T> function1, @IdRes final int i) {
        return viewBindingDialogFragment(dialogFragment, new Function1<DialogFragment, T>() { // from class: com.huami.thirdparty.support.viewbinding.ReflectionDialogFragmentViewBindings$dialogViewBinding$$inlined$viewBindingDialogFragment$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Incorrect return type in method signature: (Landroidx/fragment/app/DialogFragment;)TT; */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final ViewBinding invoke(@NotNull DialogFragment dialogFragment2) {
                return (ViewBinding) function1.invoke(dialogFragment2.getDialog().getWindow().getDecorView().findViewById(i));
            }
        });
    }
}
