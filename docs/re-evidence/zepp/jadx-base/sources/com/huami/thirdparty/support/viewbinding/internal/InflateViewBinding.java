package com.huami.thirdparty.support.viewbinding.internal;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.viewbinding.ViewBinding;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b!\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\n\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/thirdparty/support/viewbinding/internal/InflateViewBinding;", "Landroidx/viewbinding/ViewBinding;", "VB", "", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroid/view/ViewGroup;", "parent", "", "attachToParent", "inflate", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Landroidx/viewbinding/ViewBinding;", "Ljava/lang/reflect/Method;", "a", "Ljava/lang/reflect/Method;", "inflateViewBinding", "<init>", "(Ljava/lang/reflect/Method;)V", "support_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public abstract class InflateViewBinding<VB extends ViewBinding> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Method inflateViewBinding;

    public InflateViewBinding(@NotNull Method method) {
        this.inflateViewBinding = method;
    }

    @NotNull
    public abstract VB inflate(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup parent, boolean attachToParent);
}
