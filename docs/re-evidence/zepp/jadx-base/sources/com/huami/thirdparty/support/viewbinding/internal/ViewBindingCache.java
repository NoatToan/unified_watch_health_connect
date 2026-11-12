package com.huami.thirdparty.support.viewbinding.internal;

import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import androidx.viewbinding.ViewBinding;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u000f\u001a\u00020\u000eR0\u0010\u0013\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R0\u0010\u0015\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/huami/thirdparty/support/viewbinding/internal/ViewBindingCache;", "", "Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "viewBindingClass", "Lcom/huami/thirdparty/support/viewbinding/internal/InflateViewBinding;", "getInflateWithLayoutInflater$support_release", "(Ljava/lang/Class;)Lcom/huami/thirdparty/support/viewbinding/internal/InflateViewBinding;", "getInflateWithLayoutInflater", "Lcom/huami/thirdparty/support/viewbinding/internal/BindViewBinding;", "getBind$support_release", "(Ljava/lang/Class;)Lcom/huami/thirdparty/support/viewbinding/internal/BindViewBinding;", "getBind", "", "clear", "", "a", "Ljava/util/Map;", "inflateCache", "b", "bindCache", "<init>", "()V", "support_release"}, k = 1, mv = {1, 5, 1})
public final class ViewBindingCache {

    @NotNull
    public static final ViewBindingCache INSTANCE = new ViewBindingCache();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Map<Class<? extends ViewBinding>, InflateViewBinding<ViewBinding>> inflateCache = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final Map<Class<? extends ViewBinding>, BindViewBinding<ViewBinding>> bindCache = new LinkedHashMap();

    private ViewBindingCache() {
    }

    public final void clear() {
        inflateCache.clear();
        bindCache.clear();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public final <T extends ViewBinding> BindViewBinding<T> getBind$support_release(@NotNull Class<T> viewBindingClass) {
        Map<Class<? extends ViewBinding>, BindViewBinding<ViewBinding>> map = bindCache;
        Object bindViewBinding = map.get(viewBindingClass);
        if (bindViewBinding == null) {
            bindViewBinding = new BindViewBinding(viewBindingClass);
            map.put((Class<? extends ViewBinding>) viewBindingClass, (BindViewBinding<ViewBinding>) bindViewBinding);
        }
        return (BindViewBinding) bindViewBinding;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public final <T extends ViewBinding> InflateViewBinding<T> getInflateWithLayoutInflater$support_release(@NotNull Class<T> viewBindingClass) {
        Map<Class<? extends ViewBinding>, InflateViewBinding<ViewBinding>> map = inflateCache;
        Object objInflateViewBinding = map.get(viewBindingClass);
        if (objInflateViewBinding == null) {
            objInflateViewBinding = ViewBindingCacheKt.InflateViewBinding(viewBindingClass);
            map.put((Class<? extends ViewBinding>) viewBindingClass, (InflateViewBinding<ViewBinding>) objInflateViewBinding);
        }
        return (InflateViewBinding) objInflateViewBinding;
    }
}
