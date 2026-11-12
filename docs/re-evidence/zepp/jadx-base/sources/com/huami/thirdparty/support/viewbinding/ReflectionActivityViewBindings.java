package com.huami.thirdparty.support.viewbinding;

import android.app.Activity;
import android.view.View;
import androidx.annotation.IdRes;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ComponentActivity;
import androidx.exifinterface.media.ExifInterface;
import androidx.viewbinding.ViewBinding;
import com.huami.thirdparty.support.viewbinding.internal.DefaultActivityViewBingingRootProvider;
import com.huami.thirdparty.support.viewbinding.internal.ViewBindingCache;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001a6\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u000b\u001aK\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0006\u0010\u000f\u001a6\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b\u0012\u0010\u0013\u001aA\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0014\u001aG\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0000\u0010\u0015*\u00020\u0002\"\b\b\u0001\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH\u0007¢\u0006\u0004\b\u0006\u0010\u0017\u001ac\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0000\u0010\u0015*\u00020\u0002\"\b\b\u0001\u0010\u0001*\u00020\u0000*\u00020\u00022\u0014\b\u0004\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u00010\f2\u0014\b\u0006\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\fH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u001a\u001aM\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0014\b\u0004\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u001b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/core/app/ComponentActivity;", "", "viewBindingRootId", "Lcom/huami/thirdparty/support/viewbinding/ViewBindingProperty;", "viewBindingActivity", "(Landroidx/core/app/ComponentActivity;I)Lcom/huami/thirdparty/support/viewbinding/ViewBindingProperty;", "viewBinding", "Ljava/lang/Class;", "viewBindingClass", "(Landroidx/core/app/ComponentActivity;Ljava/lang/Class;I)Lcom/huami/thirdparty/support/viewbinding/ViewBindingProperty;", "Lkotlin/Function1;", "Landroid/view/View;", "rootViewProvider", "(Landroidx/core/app/ComponentActivity;Ljava/lang/Class;Lkotlin/jvm/functions/Function1;)Lcom/huami/thirdparty/support/viewbinding/ViewBindingProperty;", "Lcom/huami/thirdparty/support/viewbinding/CreateMethod;", "createMethod", "inflateViewBindingActivity", "(Landroidx/core/app/ComponentActivity;Lcom/huami/thirdparty/support/viewbinding/CreateMethod;)Lcom/huami/thirdparty/support/viewbinding/ViewBindingProperty;", "(Landroidx/core/app/ComponentActivity;Ljava/lang/Class;Lcom/huami/thirdparty/support/viewbinding/CreateMethod;)Lcom/huami/thirdparty/support/viewbinding/ViewBindingProperty;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "viewBinder", "(Landroidx/core/app/ComponentActivity;Lkotlin/jvm/functions/Function1;)Lcom/huami/thirdparty/support/viewbinding/ViewBindingProperty;", "vbFactory", "viewProvider", "(Landroidx/core/app/ComponentActivity;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/huami/thirdparty/support/viewbinding/ViewBindingProperty;", "(Landroidx/core/app/ComponentActivity;Lkotlin/jvm/functions/Function1;I)Lcom/huami/thirdparty/support/viewbinding/ViewBindingProperty;", "support_release"}, k = 2, mv = {1, 5, 1})
@JvmName(name = "ReflectionActivityViewBindings")
public final class ReflectionActivityViewBindings {

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
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/core/app/ComponentActivity;", "activity", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a<T> extends Lambda implements Function1<ComponentActivity, T> {
        public final /* synthetic */ int a;
        public final /* synthetic */ Class<T> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, Class<T> cls) {
            super(1);
            this.a = i;
            this.b = cls;
        }

        /* JADX WARN: Incorrect return type in method signature: (Landroidx/core/app/ComponentActivity;)TT; */
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final ViewBinding invoke(@NotNull ComponentActivity componentActivity) {
            return ViewBindingCache.INSTANCE.getBind$support_release(this.b).bind(ActivityCompat.requireViewById(componentActivity, this.a));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/core/app/ComponentActivity;", "activity", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b<T> extends Lambda implements Function1<ComponentActivity, T> {
        public final /* synthetic */ Class<T> a;
        public final /* synthetic */ Function1<ComponentActivity, View> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Class<T> cls, Function1<? super ComponentActivity, ? extends View> function1) {
            super(1);
            this.a = cls;
            this.b = function1;
        }

        /* JADX WARN: Incorrect return type in method signature: (Landroidx/core/app/ComponentActivity;)TT; */
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final ViewBinding invoke(@NotNull ComponentActivity componentActivity) {
            return ViewBindingCache.INSTANCE.getBind$support_release(this.a).bind(this.b.invoke(componentActivity));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class c extends FunctionReferenceImpl implements Function1<Activity, View> {
        public c(DefaultActivityViewBingingRootProvider defaultActivityViewBingingRootProvider) {
            super(1, defaultActivityViewBingingRootProvider, DefaultActivityViewBingingRootProvider.class, "findRootView", "findRootView(Landroid/app/Activity;)Landroid/view/View;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final View invoke(@NotNull Activity activity) {
            return ((DefaultActivityViewBingingRootProvider) this.receiver).findRootView(activity);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/core/app/ComponentActivity;", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d<T> extends Lambda implements Function1<ComponentActivity, T> {
        public final /* synthetic */ Class<T> a;
        public final /* synthetic */ ComponentActivity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Class<T> cls, ComponentActivity componentActivity) {
            super(1);
            this.a = cls;
            this.b = componentActivity;
        }

        /* JADX WARN: Incorrect return type in method signature: (Landroidx/core/app/ComponentActivity;)TT; */
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final ViewBinding invoke(@NotNull ComponentActivity componentActivity) {
            return ViewBindingCache.INSTANCE.getInflateWithLayoutInflater$support_release(this.a).inflate(this.b.getLayoutInflater(), null, false);
        }
    }

    @JvmName(name = "inflateViewBindingActivity")
    public static final /* synthetic */ <T extends ViewBinding> ViewBindingProperty<ComponentActivity, T> inflateViewBindingActivity(ComponentActivity componentActivity, CreateMethod createMethod) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return inflateViewBindingActivity(componentActivity, ViewBinding.class, createMethod);
    }

    public static /* synthetic */ ViewBindingProperty inflateViewBindingActivity$default(ComponentActivity componentActivity, CreateMethod createMethod, int i, Object obj) {
        if ((i & 1) != 0) {
            createMethod = CreateMethod.BIND;
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return inflateViewBindingActivity(componentActivity, ViewBinding.class, createMethod);
    }

    @JvmName(name = "viewBindingActivity")
    public static final /* synthetic */ <T extends ViewBinding> ViewBindingProperty<ComponentActivity, T> viewBindingActivity(ComponentActivity componentActivity, @IdRes int i) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return viewBindingActivity(componentActivity, ViewBinding.class, i);
    }

    public static /* synthetic */ ViewBindingProperty viewBindingActivity$default(ComponentActivity componentActivity, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = new ReflectionActivityViewBindings$viewBinding$5(DefaultActivityViewBingingRootProvider.INSTANCE);
        }
        return viewBindingActivity(componentActivity, new ReflectionActivityViewBindings$viewBinding$6(function1, function2));
    }

    @JvmName(name = "inflateViewBindingActivity")
    @NotNull
    public static final <T extends ViewBinding> ViewBindingProperty<ComponentActivity, T> inflateViewBindingActivity(@NotNull ComponentActivity componentActivity, @NotNull Class<T> cls, @NotNull CreateMethod createMethod) {
        int i = WhenMappings.$EnumSwitchMapping$0[createMethod.ordinal()];
        if (i == 1) {
            return viewBindingActivity(componentActivity, cls, new c(DefaultActivityViewBingingRootProvider.INSTANCE));
        }
        if (i == 2) {
            return viewBindingActivity(componentActivity, new d(cls, componentActivity));
        }
        throw new NoWhenBranchMatchedException();
    }

    @JvmName(name = "viewBindingActivity")
    @NotNull
    public static final <T extends ViewBinding> ViewBindingProperty<ComponentActivity, T> viewBindingActivity(@NotNull ComponentActivity componentActivity, @NotNull Class<T> cls, @IdRes int i) {
        return viewBindingActivity(componentActivity, new a(i, cls));
    }

    public static /* synthetic */ ViewBindingProperty inflateViewBindingActivity$default(ComponentActivity componentActivity, Class cls, CreateMethod createMethod, int i, Object obj) {
        if ((i & 2) != 0) {
            createMethod = CreateMethod.BIND;
        }
        return inflateViewBindingActivity(componentActivity, cls, createMethod);
    }

    @JvmName(name = "viewBindingActivity")
    @NotNull
    public static final <T extends ViewBinding> ViewBindingProperty<ComponentActivity, T> viewBindingActivity(@NotNull ComponentActivity componentActivity, @NotNull Class<T> cls, @NotNull Function1<? super ComponentActivity, ? extends View> function1) {
        return viewBindingActivity(componentActivity, new b(cls, function1));
    }

    @JvmName(name = "viewBindingActivity")
    @NotNull
    public static final <A extends ComponentActivity, T extends ViewBinding> ViewBindingProperty<A, T> viewBindingActivity(@NotNull ComponentActivity componentActivity, @NotNull Function1<? super A, ? extends T> function1) {
        return new com.huami.thirdparty.support.viewbinding.a(function1);
    }

    @JvmName(name = "viewBindingActivity")
    @NotNull
    public static final <A extends ComponentActivity, T extends ViewBinding> ViewBindingProperty<A, T> viewBindingActivity(@NotNull ComponentActivity componentActivity, @NotNull Function1<? super View, ? extends T> function1, @NotNull Function1<? super A, ? extends View> function2) {
        return viewBindingActivity(componentActivity, new ReflectionActivityViewBindings$viewBinding$6(function1, function2));
    }

    @JvmName(name = "viewBindingActivity")
    @NotNull
    public static final <T extends ViewBinding> ViewBindingProperty<ComponentActivity, T> viewBindingActivity(@NotNull ComponentActivity componentActivity, @NotNull final Function1<? super View, ? extends T> function1, @IdRes final int i) {
        return viewBindingActivity(componentActivity, new Function1<ComponentActivity, T>() { // from class: com.huami.thirdparty.support.viewbinding.ReflectionActivityViewBindings$viewBinding$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Incorrect return type in method signature: (Landroidx/core/app/ComponentActivity;)TT; */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final ViewBinding invoke(@NotNull ComponentActivity componentActivity2) {
                return (ViewBinding) function1.invoke(componentActivity2.findViewById(i));
            }
        });
    }
}
