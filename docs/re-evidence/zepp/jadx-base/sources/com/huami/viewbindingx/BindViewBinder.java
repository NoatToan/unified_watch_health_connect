package com.huami.viewbindingx;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0015\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0015\u0010\n\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010R%\u0010\u0016\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/huami/viewbindingx/BindViewBinder;", "Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroid/app/Activity;", "activity", "Landroid/view/View;", "a", "Landroidx/fragment/app/Fragment;", "fragment", "bind", "(Landroidx/fragment/app/Fragment;)Landroidx/viewbinding/ViewBinding;", "bindA", "(Landroid/app/Activity;)Landroidx/viewbinding/ViewBinding;", ViewHierarchyConstants.VIEW_KEY, "bindView", "(Landroid/view/View;)Landroidx/viewbinding/ViewBinding;", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "Lkotlin/Lazy;", "b", "()Ljava/lang/reflect/Method;", "bindViewMethod", "Ljava/lang/Class;", "Ljava/lang/Class;", "viewBindingClass", "<init>", "(Ljava/lang/Class;)V", "viewbindingx_release"}, k = 1, mv = {1, 4, 1})
public final class BindViewBinder<T extends ViewBinding> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy bindViewMethod = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new a());

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Class<T> viewBindingClass;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "a", "()Ljava/lang/reflect/Method;"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function0<Method> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Method invoke() {
            return BindViewBinder.this.viewBindingClass.getMethod("bind", View.class);
        }
    }

    public BindViewBinder(@NotNull Class<T> cls) {
        this.viewBindingClass = cls;
    }

    private final View a(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(android.R.id.content);
        if (viewGroup == null) {
            throw new IllegalStateException("Activity has no content view".toString());
        }
        int childCount = viewGroup.getChildCount();
        if (childCount == 0) {
            throw new IllegalStateException("Content view has no children. Provide root view explicitly".toString());
        }
        if (childCount == 1) {
            return viewGroup.getChildAt(0);
        }
        throw new IllegalStateException("More than one child view found in Activity content view".toString());
    }

    private final Method b() {
        return (Method) this.bindViewMethod.getValue();
    }

    @NotNull
    public final T bind(@NotNull Fragment fragment) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke = b().invoke(null, fragment.requireView());
        Objects.requireNonNull(objInvoke, "null cannot be cast to non-null type T");
        return (T) objInvoke;
    }

    @NotNull
    public final T bindA(@NotNull Activity activity) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke = b().invoke(null, a(activity));
        Objects.requireNonNull(objInvoke, "null cannot be cast to non-null type T");
        return (T) objInvoke;
    }

    @NotNull
    public final T bindView(@NotNull View view) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke = b().invoke(null, view);
        Objects.requireNonNull(objInvoke, "null cannot be cast to non-null type T");
        return (T) objInvoke;
    }
}
