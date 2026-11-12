package com.huami.viewbindingx;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.DefaultLifecycleObserver;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBinding;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import defpackage.x51;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 \u001f*\n\b\u0000\u0010\u0002 \u0000*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0002 \u0010B\u001b\u0012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H$¢\u0006\u0004\b\b\u0010\tJ$\u0010\f\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0097\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000f\u001a\u00020\u000eH\u0007R\u0018\u0010\u0012\u001a\u0004\u0018\u00018\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R&\u0010\u0016\u001a\u00120\u0013R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00018\u00008\b@\bX\u0088\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006!"}, d2 = {"Lcom/huami/viewbindingx/LifeViewBindingProperty;", "", "R", "Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/properties/ReadOnlyProperty;", "thisRef", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "(Ljava/lang/Object;)Landroidx/lifecycle/LifecycleOwner;", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Landroidx/viewbinding/ViewBinding;", "", "clear", "a", "Landroidx/viewbinding/ViewBinding;", "viewBinding", "Lcom/huami/viewbindingx/LifeViewBindingProperty$ClearOnDestroyLifecycleObserver;", "b", "Lcom/huami/viewbindingx/LifeViewBindingProperty$ClearOnDestroyLifecycleObserver;", "lifecycleObserver", "c", "Ljava/lang/Object;", "Lkotlin/Function1;", GoogleApiAvailabilityLight.a, "Lkotlin/jvm/functions/Function1;", "viewBinder", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "f", "ClearOnDestroyLifecycleObserver", "viewbindingx_release"}, k = 1, mv = {1, 4, 1})
public abstract class LifeViewBindingProperty<R, T extends ViewBinding> implements ReadOnlyProperty<R, T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private T viewBinding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final LifeViewBindingProperty<R, T>.ClearOnDestroyLifecycleObserver lifecycleObserver = new ClearOnDestroyLifecycleObserver();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private R thisRef;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Function1<R, T> viewBinder;

    @NotNull
    private static final a f = new a(null);
    private static final Handler e = new Handler(Looper.getMainLooper());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¨\u0006\b"}, d2 = {"Lcom/huami/viewbindingx/LifeViewBindingProperty$ClearOnDestroyLifecycleObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/LifecycleOwner;", DataCacher.o, "", "onDestroy", "<init>", "(Lcom/huami/viewbindingx/LifeViewBindingProperty;)V", "viewbindingx_release"}, k = 1, mv = {1, 4, 1})
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
            LifeViewBindingProperty.this.clear();
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/viewbindingx/LifeViewBindingProperty$a", "", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "<init>", "()V", "viewbindingx_release"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001 \u0000*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "R", "Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            LifeViewBindingProperty.this.viewBinding = null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001 \u0000*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "R", "Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            LifeViewBindingProperty.this.viewBinding = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LifeViewBindingProperty(@NotNull Function1<? super R, ? extends T> function1) {
        this.viewBinder = function1;
    }

    @MainThread
    public final void clear() {
        R r = this.thisRef;
        if (r != null) {
            this.thisRef = null;
            getLifecycleOwner(r).getLifecycle().removeObserver(this.lifecycleObserver);
            e.post(new b());
        }
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
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            e.post(new c());
        } else {
            lifecycle.addObserver(this.lifecycleObserver);
            this.viewBinding = tInvoke;
        }
        return tInvoke;
    }
}
