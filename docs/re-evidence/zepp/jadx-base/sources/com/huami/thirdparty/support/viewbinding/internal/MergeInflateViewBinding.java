package com.huami.thirdparty.support.viewbinding.internal;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.viewbinding.ViewBinding;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\n\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/thirdparty/support/viewbinding/internal/MergeInflateViewBinding;", "Landroidx/viewbinding/ViewBinding;", "VB", "Lcom/huami/thirdparty/support/viewbinding/internal/InflateViewBinding;", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroid/view/ViewGroup;", "parent", "", "attachToParent", "inflate", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Landroidx/viewbinding/ViewBinding;", "Ljava/lang/reflect/Method;", "b", "Ljava/lang/reflect/Method;", "inflateViewBinding", "<init>", "(Ljava/lang/reflect/Method;)V", "support_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class MergeInflateViewBinding<VB extends ViewBinding> extends InflateViewBinding<VB> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Method inflateViewBinding;

    public MergeInflateViewBinding(@NotNull Method method) {
        super(method);
        this.inflateViewBinding = method;
    }

    @Override // com.huami.thirdparty.support.viewbinding.internal.InflateViewBinding
    @NotNull
    public VB inflate(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup parent, boolean attachToParent) throws IllegalAccessException, InvocationTargetException {
        if (attachToParent) {
            Object objInvoke = this.inflateViewBinding.invoke(null, layoutInflater, parent);
            Objects.requireNonNull(objInvoke, "null cannot be cast to non-null type VB of com.huami.thirdparty.support.viewbinding.internal.MergeInflateViewBinding");
            return (VB) objInvoke;
        }
        throw new IllegalArgumentException((InflateViewBinding.class.getSimpleName() + " supports inflate only with attachToParent=true").toString());
    }
}
