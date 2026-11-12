package com.huami.thirdparty.support.viewbinding;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.DefaultLifecycleObserver;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBinding;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.thirdparty.support.viewbinding.LifecycleViewBindingProperty;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import defpackage.x51;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u0000 \u001f*\n\b\u0000\u0010\u0002 \u0000*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0002 \u0011B\u001b\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H$¢\u0006\u0004\b\b\u0010\tJ$\u0010\f\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0097\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000f\u001a\u00020\u000eH\u0017R\"\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00018\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R&\u0010\u001a\u001a\u00120\u0017R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0006\u001a\u0004\u0018\u00018\u00008\b@\bX\u0088\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/huami/thirdparty/support/viewbinding/LifecycleViewBindingProperty;", "", "R", "Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/thirdparty/support/viewbinding/ViewBindingProperty;", "thisRef", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "(Ljava/lang/Object;)Landroidx/lifecycle/LifecycleOwner;", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Landroidx/viewbinding/ViewBinding;", "", "clear", "Lkotlin/Function1;", "a", "Lkotlin/jvm/functions/Function1;", "viewBinder", "b", "Landroidx/viewbinding/ViewBinding;", "viewBinding", "Lcom/huami/thirdparty/support/viewbinding/LifecycleViewBindingProperty$ClearOnDestroyLifecycleObserver;", "c", "Lcom/huami/thirdparty/support/viewbinding/LifecycleViewBindingProperty$ClearOnDestroyLifecycleObserver;", "lifecycleObserver", GoogleApiAvailabilityLight.a, "Ljava/lang/Object;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "e", "ClearOnDestroyLifecycleObserver", "support_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class LifecycleViewBindingProperty<R, T extends ViewBinding> implements ViewBindingProperty<R, T> {

    @NotNull
    private static final a e = new a(null);

    @Deprecated
    @NotNull
    private static final Handler f = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function1<R, T> viewBinder;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private T viewBinding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final LifecycleViewBindingProperty<R, T>.ClearOnDestroyLifecycleObserver lifecycleObserver = new ClearOnDestroyLifecycleObserver();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private R thisRef;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¨\u0006\b"}, d2 = {"Lcom/huami/thirdparty/support/viewbinding/LifecycleViewBindingProperty$ClearOnDestroyLifecycleObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/LifecycleOwner;", DataCacher.o, "", "onDestroy", "<init>", "(Lcom/huami/thirdparty/support/viewbinding/LifecycleViewBindingProperty;)V", "support_release"}, k = 1, mv = {1, 5, 1})
    public final class ClearOnDestroyLifecycleObserver implements DefaultLifecycleObserver {
        public ClearOnDestroyLifecycleObserver() {
        }

        @Override // androidx.p008lifecycle.DefaultLifecycleObserver, androidx.p008lifecycle.FullLifecycleObserver
        public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            x51.a(this, lifecycleOwner);
        }

        @Override // androidx.p008lifecycle.DefaultLifecycleObserver, androidx.p008lifecycle.FullLifecycleObserver
        @MainThread
        public void onDestroy(@NotNull LifecycleOwner owner) {
            LifecycleViewBindingProperty.this.clear();
        }

        @Override // androidx.p008lifecycle.DefaultLifecycleObserver, androidx.p008lifecycle.FullLifecycleObserver
        public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            x51.c(this, lifecycleOwner);
        }

        @Override // androidx.p008lifecycle.DefaultLifecycleObserver, androidx.p008lifecycle.FullLifecycleObserver
        public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
            x51.d(this, lifecycleOwner);
        }

        @Override // androidx.p008lifecycle.DefaultLifecycleObserver, androidx.p008lifecycle.FullLifecycleObserver
        public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
            x51.e(this, lifecycleOwner);
        }

        @Override // androidx.p008lifecycle.DefaultLifecycleObserver, androidx.p008lifecycle.FullLifecycleObserver
        public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            x51.f(this, lifecycleOwner);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/thirdparty/support/viewbinding/LifecycleViewBindingProperty$a", "", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "<init>", "()V", "support_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleViewBindingProperty(@NotNull Function1<? super R, ? extends T> function1) {
        this.viewBinder = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(LifecycleViewBindingProperty lifecycleViewBindingProperty) {
        lifecycleViewBindingProperty.viewBinding = null;
    }

    @Override // com.huami.thirdparty.support.viewbinding.ViewBindingProperty
    @MainThread
    public void clear() {
        R r = this.thisRef;
        if (r == null) {
            return;
        }
        this.thisRef = null;
        getLifecycleOwner(r).getLifecycle().removeObserver(this.lifecycleObserver);
        f.post(new Runnable() { // from class: hm4
            @Override // java.lang.Runnable
            public final void run() {
                LifecycleViewBindingProperty.b(this.a);
            }
        });
    }

    @NotNull
    public abstract LifecycleOwner getLifecycleOwner(@NotNull R thisRef);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
        return getValue(obj, (KProperty<?>) kProperty);
    }

    @Override // kotlin.properties.ReadOnlyProperty
    @MainThread
    @NotNull
    public T getValue(@NotNull R thisRef, @NotNull KProperty<?> property) {
        T t = this.viewBinding;
        if (t != null) {
            return t;
        }
        this.thisRef = thisRef;
        Lifecycle lifecycle = getLifecycleOwner(thisRef).getLifecycle();
        T tInvoke = this.viewBinder.invoke(thisRef);
        if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
            lifecycle.addObserver(this.lifecycleObserver);
            this.viewBinding = tInvoke;
        }
        return tInvoke;
    }
}
