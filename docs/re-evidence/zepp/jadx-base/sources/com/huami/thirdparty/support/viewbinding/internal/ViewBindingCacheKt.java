package com.huami.thirdparty.support.viewbinding.internal;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.viewbinding.ViewBinding;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0001¨\u0006\u0006"}, d2 = {"Landroidx/viewbinding/ViewBinding;", "VB", "Ljava/lang/Class;", "viewBindingClass", "Lcom/huami/thirdparty/support/viewbinding/internal/InflateViewBinding;", "InflateViewBinding", "support_release"}, k = 2, mv = {1, 5, 1})
public final class ViewBindingCacheKt {
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final <VB extends ViewBinding> InflateViewBinding<VB> InflateViewBinding(@NotNull Class<VB> cls) {
        try {
            return new FullInflateViewBinding(cls.getMethod("inflate", LayoutInflater.class, ViewGroup.class, Boolean.TYPE));
        } catch (NoSuchMethodException unused) {
            return new MergeInflateViewBinding(cls.getMethod("inflate", LayoutInflater.class, ViewGroup.class));
        }
    }
}
