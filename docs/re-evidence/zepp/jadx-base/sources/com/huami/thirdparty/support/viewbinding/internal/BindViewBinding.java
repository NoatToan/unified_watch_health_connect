package com.huami.thirdparty.support.viewbinding.internal;

import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.viewbinding.ViewBinding;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003B\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001e\u0010\f\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/huami/thirdparty/support/viewbinding/internal/BindViewBinding;", "Landroidx/viewbinding/ViewBinding;", "VB", "", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "bind", "(Landroid/view/View;)Landroidx/viewbinding/ViewBinding;", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "a", "Ljava/lang/reflect/Method;", "bindViewBinding", "Ljava/lang/Class;", "viewBindingClass", "<init>", "(Ljava/lang/Class;)V", "support_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class BindViewBinding<VB extends ViewBinding> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Method bindViewBinding;

    public BindViewBinding(@NotNull Class<VB> cls) {
        this.bindViewBinding = cls.getMethod("bind", View.class);
    }

    @NotNull
    public final VB bind(@NotNull View view) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke = this.bindViewBinding.invoke(null, view);
        Objects.requireNonNull(objInvoke, "null cannot be cast to non-null type VB of com.huami.thirdparty.support.viewbinding.internal.BindViewBinding");
        return (VB) objInvoke;
    }
}
