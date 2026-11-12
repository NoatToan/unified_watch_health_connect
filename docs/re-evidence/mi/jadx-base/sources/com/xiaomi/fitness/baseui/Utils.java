package com.xiaomi.fitness.baseui;

import android.os.Looper;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import defpackage.sk5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0006\u0010\u0011\u001a\u00020\u0007J\u0010\u0010\u0012\u001a\u00020\u000b2\b\b\u0001\u0010\u0013\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/baseui/Utils;", "", "<init>", "()V", "TAG", "", "throwMissingVariable", "", "binding", "Landroidx/databinding/ViewDataBinding;", "bindingVariable", "", "layoutRes", "findLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "view", "Landroid/view/View;", "ensureChangeOnMainThread", "getColor", "color", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncom/xiaomi/fitness/baseui/Utils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"})
public final class Utils {

    @NotNull
    public static final Utils INSTANCE = new Utils();

    @NotNull
    private static final String TAG = "BCAdapters";

    private Utils() {
    }

    public final void ensureChangeOnMainThread() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new IllegalStateException("You must only modify the ObservableList on the main thread.".toString());
        }
    }

    @Nullable
    public final LifecycleOwner findLifecycleOwner(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewDataBinding viewDataBindingG = sk5.g(view);
        LifecycleOwner lifecycleOwnerC = viewDataBindingG != null ? viewDataBindingG.C() : null;
        Object context = view.getContext();
        return (lifecycleOwnerC == null && (context instanceof LifecycleOwner)) ? (LifecycleOwner) context : lifecycleOwnerC;
    }

    public final int getColor(int color) {
        return ApplicationExtKt.getApplication().getResources().getColor(color, null);
    }

    public final void throwMissingVariable(@NotNull ViewDataBinding binding, int bindingVariable, int layoutRes) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        String resourceName = binding.getRoot().getContext().getResources().getResourceName(layoutRes);
        throw new IllegalStateException("Could not bind variable '" + sk5.f(bindingVariable) + "' in layout '" + resourceName + "'");
    }
}
