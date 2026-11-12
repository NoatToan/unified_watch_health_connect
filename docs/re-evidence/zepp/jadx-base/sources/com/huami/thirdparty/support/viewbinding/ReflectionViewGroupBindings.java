package com.huami.thirdparty.support.viewbinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.viewbinding.ViewBinding;
import com.huami.thirdparty.support.viewbinding.internal.ViewBindingCache;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a6\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u000b\u001a4\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0087\b¢\u0006\u0004\b\u0006\u0010\u000e\u001a?\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0006\u0010\u000f\u001a<\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0014\b\u0004\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0010H\u0086\bø\u0001\u0000\u001aF\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0014\b\u0004\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00028\u00000\u00102\b\b\u0001\u0010\u0014\u001a\u00020\u0013H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/view/ViewGroup;", "Lcom/huami/thirdparty/support/viewbinding/CreateMethod;", "createMethod", "Lcom/huami/thirdparty/support/viewbinding/ViewBindingProperty;", "viewBindingFragment", "(Landroid/view/ViewGroup;Lcom/huami/thirdparty/support/viewbinding/CreateMethod;)Lcom/huami/thirdparty/support/viewbinding/ViewBindingProperty;", "viewBinding", "Ljava/lang/Class;", "viewBindingClass", "(Landroid/view/ViewGroup;Ljava/lang/Class;Lcom/huami/thirdparty/support/viewbinding/CreateMethod;)Lcom/huami/thirdparty/support/viewbinding/ViewBindingProperty;", "", "attachToRoot", "(Landroid/view/ViewGroup;Z)Lcom/huami/thirdparty/support/viewbinding/ViewBindingProperty;", "(Landroid/view/ViewGroup;Ljava/lang/Class;Z)Lcom/huami/thirdparty/support/viewbinding/ViewBindingProperty;", "Lkotlin/Function1;", "vbFactory", "Landroid/view/View;", "", "viewBindingRootId", "support_release"}, k = 2, mv = {1, 5, 1})
@JvmName(name = "ReflectionViewGroupBindings")
public final class ReflectionViewGroupBindings {

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

    @NotNull
    public static final <T extends ViewBinding> ViewBindingProperty<ViewGroup, T> viewBinding(@NotNull ViewGroup viewGroup, @NotNull final Function1<? super ViewGroup, ? extends T> function1) {
        return new LazyViewBindingProperty(new Function1<ViewGroup, T>() { // from class: com.huami.thirdparty.support.viewbinding.ReflectionViewGroupBindings.viewBinding.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Incorrect return type in method signature: (Landroid/view/ViewGroup;)TT; */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final ViewBinding invoke(@NotNull ViewGroup viewGroup2) {
                return (ViewBinding) function1.invoke(viewGroup2);
            }
        });
    }

    @JvmName(name = "viewBindingFragment")
    public static final /* synthetic */ <T extends ViewBinding> ViewBindingProperty<ViewGroup, T> viewBindingFragment(ViewGroup viewGroup, CreateMethod createMethod) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return viewBindingFragment(viewGroup, ViewBinding.class, createMethod);
    }

    public static /* synthetic */ ViewBindingProperty viewBindingFragment$default(ViewGroup viewGroup, CreateMethod createMethod, int i, Object obj) {
        if ((i & 1) != 0) {
            createMethod = CreateMethod.BIND;
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return viewBindingFragment(viewGroup, ViewBinding.class, createMethod);
    }

    @NotNull
    public static final <T extends ViewBinding> ViewBindingProperty<ViewGroup, T> viewBinding(@NotNull ViewGroup viewGroup, @NotNull final Function1<? super View, ? extends T> function1, @IdRes final int i) {
        return new LazyViewBindingProperty(new Function1<ViewGroup, T>() { // from class: com.huami.thirdparty.support.viewbinding.ReflectionViewGroupBindings.viewBinding.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Incorrect return type in method signature: (Landroid/view/ViewGroup;)TT; */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final ViewBinding invoke(@NotNull ViewGroup viewGroup2) {
                return (ViewBinding) function1.invoke(ViewCompat.requireViewById(viewGroup2, i));
            }
        });
    }

    @JvmName(name = "viewBindingFragment")
    @NotNull
    public static final <T extends ViewBinding> ViewBindingProperty<ViewGroup, T> viewBindingFragment(@NotNull ViewGroup viewGroup, @NotNull final Class<T> cls, @NotNull CreateMethod createMethod) {
        int i = WhenMappings.$EnumSwitchMapping$0[createMethod.ordinal()];
        if (i == 1) {
            return new LazyViewBindingProperty(new Function1<ViewGroup, T>() { // from class: com.huami.thirdparty.support.viewbinding.ReflectionViewGroupBindings$viewBinding$$inlined$viewBinding$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Incorrect return type in method signature: (Landroid/view/ViewGroup;)TT; */
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final ViewBinding invoke(@NotNull ViewGroup viewGroup2) {
                    return ViewBindingCache.INSTANCE.getBind$support_release(cls).bind(viewGroup2);
                }
            });
        }
        if (i == 2) {
            return viewBindingFragment(viewGroup, (Class) cls, true);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ ViewBindingProperty viewBindingFragment$default(ViewGroup viewGroup, Class cls, CreateMethod createMethod, int i, Object obj) {
        if ((i & 2) != 0) {
            createMethod = CreateMethod.BIND;
        }
        return viewBindingFragment(viewGroup, cls, createMethod);
    }

    @JvmName(name = "viewBindingFragment")
    public static final /* synthetic */ <T extends ViewBinding> ViewBindingProperty<ViewGroup, T> viewBindingFragment(ViewGroup viewGroup, boolean z) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return viewBindingFragment(viewGroup, ViewBinding.class, z);
    }

    @JvmName(name = "viewBindingFragment")
    @NotNull
    public static final <T extends ViewBinding> ViewBindingProperty<ViewGroup, T> viewBindingFragment(@NotNull final ViewGroup viewGroup, @NotNull final Class<T> cls, final boolean z) {
        return new LazyViewBindingProperty(new Function1<ViewGroup, T>() { // from class: com.huami.thirdparty.support.viewbinding.ReflectionViewGroupBindings$viewBinding$$inlined$viewBinding$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Incorrect return type in method signature: (Landroid/view/ViewGroup;)TT; */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final ViewBinding invoke(@NotNull ViewGroup viewGroup2) {
                return ViewBindingCache.INSTANCE.getInflateWithLayoutInflater$support_release(cls).inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup2, z);
            }
        });
    }
}
