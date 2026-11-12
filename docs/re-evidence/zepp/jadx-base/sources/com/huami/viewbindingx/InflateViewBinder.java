package com.huami.viewbindingx;

import android.app.Activity;
import android.view.LayoutInflater;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0015\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR%\u0010\u0011\u001a\n \r*\u0004\u0018\u00010\f0\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/huami/viewbindingx/InflateViewBinder;", "Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroid/app/Activity;", "activity", "inflate", "(Landroid/app/Activity;)Landroidx/viewbinding/ViewBinding;", "Landroidx/fragment/app/Fragment;", "fragment", "inflateF", "(Landroidx/fragment/app/Fragment;)Landroidx/viewbinding/ViewBinding;", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "a", "Lkotlin/Lazy;", "()Ljava/lang/reflect/Method;", "bindViewMethod", "Ljava/lang/Class;", "b", "Ljava/lang/Class;", "viewBindingClass", "<init>", "(Ljava/lang/Class;)V", "viewbindingx_release"}, k = 1, mv = {1, 4, 1})
public final class InflateViewBinder<T extends ViewBinding> {

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
            return InflateViewBinder.this.viewBindingClass.getMethod("inflate", LayoutInflater.class);
        }
    }

    public InflateViewBinder(@NotNull Class<T> cls) {
        this.viewBindingClass = cls;
    }

    private final Method a() {
        return (Method) this.bindViewMethod.getValue();
    }

    @NotNull
    public final T inflate(@NotNull Activity activity) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke = a().invoke(null, activity.getLayoutInflater());
        Objects.requireNonNull(objInvoke, "null cannot be cast to non-null type T");
        return (T) objInvoke;
    }

    @NotNull
    public final T inflateF(@NotNull Fragment fragment) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke = a().invoke(null, fragment.getLayoutInflater());
        Objects.requireNonNull(objInvoke, "null cannot be cast to non-null type T");
        return (T) objInvoke;
    }
}
