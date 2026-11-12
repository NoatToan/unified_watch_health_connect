package com.xiaomi.fitness.common.viewbinding;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import defpackage.bsq;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u0001*\n\b\u0001\u0010\u0004 \u0001*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0001\u0018B\u001b\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H$¢\u0006\u0004\b\b\u0010\tJ$\u0010\f\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0097\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00018\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/common/viewbinding/LifecycleViewBindingProperty;", "", "R", "Lbsq;", "T", "Lcom/xiaomi/fitness/common/viewbinding/ViewBindingProperty;", "thisRef", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "(Ljava/lang/Object;)Landroidx/lifecycle/LifecycleOwner;", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lbsq;", "", CervicalMucusRecord.Appearance.CLEAR, "()V", "Lkotlin/Function1;", "viewBinder", "Lkotlin/jvm/functions/Function1;", "viewBinding", "Lbsq;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "ClearOnDestroyLifecycleObserver", "common_release"}, k = 1, mv = {2, 0, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nViewBindingProperty.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewBindingProperty.kt\ncom/xiaomi/fitness/common/viewbinding/LifecycleViewBindingProperty\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n1#2:114\n*E\n"})
public abstract class LifecycleViewBindingProperty<R, T extends bsq> implements ViewBindingProperty<R, T> {

    @NotNull
    private final Function1<R, T> viewBinder;

    @Nullable
    private T viewBinding;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017R\u0016\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/common/viewbinding/LifecycleViewBindingProperty$ClearOnDestroyLifecycleObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "property", "Lcom/xiaomi/fitness/common/viewbinding/LifecycleViewBindingProperty;", "<init>", "(Lcom/xiaomi/fitness/common/viewbinding/LifecycleViewBindingProperty;)V", LifecycleConstantKt.ON_DESTROY, "", CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "Companion", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ClearOnDestroyLifecycleObserver implements DefaultLifecycleObserver {

        @NotNull
        private static final Companion Companion = new Companion(null);

        @NotNull
        private static final Handler mainHandler = new Handler(Looper.getMainLooper());

        @NotNull
        private final LifecycleViewBindingProperty<?, ?> property;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/common/viewbinding/LifecycleViewBindingProperty$ClearOnDestroyLifecycleObserver$Companion;", "", "<init>", "()V", "mainHandler", "Landroid/os/Handler;", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public ClearOnDestroyLifecycleObserver(@NotNull LifecycleViewBindingProperty<?, ?> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.property = property;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onDestroy$lambda$0(ClearOnDestroyLifecycleObserver this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.property.clear();
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(@NotNull LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            if (mainHandler.post(new Runnable() { // from class: com.xiaomi.fitness.common.viewbinding.a
                @Override // java.lang.Runnable
                public final void run() {
                    LifecycleViewBindingProperty.ClearOnDestroyLifecycleObserver.onDestroy$lambda$0(this.f11817a);
                }
            })) {
                return;
            }
            this.property.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleViewBindingProperty(@NotNull Function1<? super R, ? extends T> viewBinder) {
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        this.viewBinder = viewBinder;
    }

    @Override // com.xiaomi.fitness.common.viewbinding.ViewBindingProperty
    public void clear() {
        this.viewBinding = null;
    }

    @NotNull
    public abstract LifecycleOwner getLifecycleOwner(@NotNull R thisRef);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
        return getValue(obj, (KProperty<?>) kProperty);
    }

    @Override // kotlin.properties.ReadOnlyProperty
    @NotNull
    public T getValue(@NotNull R thisRef, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        T t = this.viewBinding;
        if (t != null) {
            return t;
        }
        Lifecycle lifecycle = getLifecycleOwner(thisRef).getLifecycle();
        T tInvoke2 = this.viewBinder.invoke2(thisRef);
        if (lifecycle.getState() != Lifecycle.State.DESTROYED) {
            lifecycle.addObserver(new ClearOnDestroyLifecycleObserver(this));
            this.viewBinding = tInvoke2;
        }
        return tInvoke2;
    }
}
