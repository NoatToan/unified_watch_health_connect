package com.huami.thirdparty.support.viewbinding;

import android.view.View;
import androidx.annotation.IdRes;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;
import com.huami.thirdparty.support.viewbinding.internal.ViewBindingCache;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001a6\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u000b\u001aG\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0000\u0010\f*\u00020\u0002\"\b\b\u0001\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rH\u0007¢\u0006\u0004\b\u0006\u0010\u000f\u001ac\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0000\u0010\f*\u00020\u0002\"\b\b\u0001\u0010\u0001*\u00020\u0000*\u00020\u00022\u0014\b\u0004\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u00010\r2\u0014\b\u0006\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\rH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0013\u001aM\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0014\b\u0004\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u00000\r2\b\b\u0001\u0010\u0015\u001a\u00020\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/fragment/app/Fragment;", "Lcom/huami/thirdparty/support/viewbinding/CreateMethod;", "createMethod", "Lcom/huami/thirdparty/support/viewbinding/ViewBindingProperty;", "viewBindingFragment", "(Landroidx/fragment/app/Fragment;Lcom/huami/thirdparty/support/viewbinding/CreateMethod;)Lcom/huami/thirdparty/support/viewbinding/ViewBindingProperty;", "viewBinding", "Ljava/lang/Class;", "viewBindingClass", "(Landroidx/fragment/app/Fragment;Ljava/lang/Class;Lcom/huami/thirdparty/support/viewbinding/CreateMethod;)Lcom/huami/thirdparty/support/viewbinding/ViewBindingProperty;", "F", "Lkotlin/Function1;", "viewBinder", "(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)Lcom/huami/thirdparty/support/viewbinding/ViewBindingProperty;", "Landroid/view/View;", "vbFactory", "viewProvider", "(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/huami/thirdparty/support/viewbinding/ViewBindingProperty;", "", "viewBindingRootId", "(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;I)Lcom/huami/thirdparty/support/viewbinding/ViewBindingProperty;", "support_release"}, k = 2, mv = {1, 5, 1})
@JvmName(name = "ReflectionFragmentViewBindings")
public final class ReflectionFragmentViewBindings {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CreateMethod.values().length];
            iArr[CreateMethod.BIND.ordinal()] = 1;
            iArr[CreateMethod.INFLATE.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/fragment/app/Fragment;", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a<T> extends Lambda implements Function1<Fragment, T> {
        public final /* synthetic */ Class<T> a;
        public final /* synthetic */ Fragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class<T> cls, Fragment fragment) {
            super(1);
            this.a = cls;
            this.b = fragment;
        }

        /* JADX WARN: Incorrect return type in method signature: (Landroidx/fragment/app/Fragment;)TT; */
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final ViewBinding invoke(@NotNull Fragment fragment) {
            return ViewBindingCache.INSTANCE.getBind$support_release(this.a).bind(this.b.requireView());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/fragment/app/Fragment;", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b<T> extends Lambda implements Function1<Fragment, T> {
        public final /* synthetic */ Class<T> a;
        public final /* synthetic */ Fragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Class<T> cls, Fragment fragment) {
            super(1);
            this.a = cls;
            this.b = fragment;
        }

        /* JADX WARN: Incorrect return type in method signature: (Landroidx/fragment/app/Fragment;)TT; */
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final ViewBinding invoke(@NotNull Fragment fragment) {
            return ViewBindingCache.INSTANCE.getInflateWithLayoutInflater$support_release(this.a).inflate(this.b.getLayoutInflater(), null, false);
        }
    }

    @JvmName(name = "viewBindingFragment")
    public static final /* synthetic */ <T extends ViewBinding> ViewBindingProperty<Fragment, T> viewBindingFragment(Fragment fragment, CreateMethod createMethod) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return viewBindingFragment(fragment, ViewBinding.class, createMethod);
    }

    public static /* synthetic */ ViewBindingProperty viewBindingFragment$default(Fragment fragment, CreateMethod createMethod, int i, Object obj) {
        if ((i & 1) != 0) {
            createMethod = CreateMethod.BIND;
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return viewBindingFragment(fragment, ViewBinding.class, createMethod);
    }

    @JvmName(name = "viewBindingFragment")
    @NotNull
    public static final <T extends ViewBinding> ViewBindingProperty<Fragment, T> viewBindingFragment(@NotNull Fragment fragment, @NotNull Class<T> cls, @NotNull CreateMethod createMethod) {
        int i = WhenMappings.$EnumSwitchMapping$0[createMethod.ordinal()];
        if (i == 1) {
            return viewBindingFragment(fragment, new a(cls, fragment));
        }
        if (i == 2) {
            return viewBindingFragment(fragment, new b(cls, fragment));
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ ViewBindingProperty viewBindingFragment$default(Fragment fragment, Class cls, CreateMethod createMethod, int i, Object obj) {
        if ((i & 2) != 0) {
            createMethod = CreateMethod.BIND;
        }
        return viewBindingFragment(fragment, cls, createMethod);
    }

    @JvmName(name = "viewBindingFragment")
    @NotNull
    public static final <F extends Fragment, T extends ViewBinding> ViewBindingProperty<F, T> viewBindingFragment(@NotNull Fragment fragment, @NotNull Function1<? super F, ? extends T> function1) {
        return new c(function1);
    }

    public static /* synthetic */ ViewBindingProperty viewBindingFragment$default(Fragment fragment, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = ReflectionFragmentViewBindings$viewBinding$3.INSTANCE;
        }
        return viewBindingFragment(fragment, new ReflectionFragmentViewBindings$viewBinding$4(function1, function2));
    }

    @JvmName(name = "viewBindingFragment")
    @NotNull
    public static final <F extends Fragment, T extends ViewBinding> ViewBindingProperty<F, T> viewBindingFragment(@NotNull Fragment fragment, @NotNull Function1<? super View, ? extends T> function1, @NotNull Function1<? super F, ? extends View> function2) {
        return viewBindingFragment(fragment, new ReflectionFragmentViewBindings$viewBinding$4(function1, function2));
    }

    @JvmName(name = "viewBindingFragment")
    @NotNull
    public static final <T extends ViewBinding> ViewBindingProperty<Fragment, T> viewBindingFragment(@NotNull Fragment fragment, @NotNull final Function1<? super View, ? extends T> function1, @IdRes final int i) {
        return viewBindingFragment(fragment, new Function1<Fragment, T>() { // from class: com.huami.thirdparty.support.viewbinding.ReflectionFragmentViewBindings$viewBinding$$inlined$viewBindingFragment$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Incorrect return type in method signature: (Landroidx/fragment/app/Fragment;)TT; */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final ViewBinding invoke(@NotNull Fragment fragment2) {
                return (ViewBinding) function1.invoke(fragment2.requireView().findViewById(i));
            }
        });
    }
}
