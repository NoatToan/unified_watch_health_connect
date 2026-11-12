package com.xiaomi.fitness.sport_eco_manager.server;

import android.os.IBinder;
import android.os.IInterface;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport_eco_manager.server.BgLocationBinderDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u001a*\b\b\u0000\u0010\u0001*\u00020\u00022\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0003:\u0001\u001aB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u0011\u001a\u0004\u0018\u00018\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0096\u0002¢\u0006\u0002\u0010\u0015J.\u0010\u0016\u001a\u00020\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\b\u0010\u0018\u001a\u0004\u0018\u00018\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager/server/BgLocationBinderDelegate;", "T", "Landroid/os/IInterface;", "Lkotlin/properties/ReadWriteProperty;", "", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "field", "getField", "()Landroid/os/IInterface;", "setField", "(Landroid/os/IInterface;)V", "Landroid/os/IInterface;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Landroid/os/IInterface;", "setValue", "", "value", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Landroid/os/IInterface;)V", "Companion", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BgLocationBinderDelegate<T extends IInterface> implements ReadWriteProperty<Object, T> {

    @NotNull
    private static final String TAG = "BgLocationBinderDelegate";

    @Nullable
    private volatile T field;

    @NotNull
    private final String name;

    public BgLocationBinderDelegate(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setValue$lambda$0(BgLocationBinderDelegate this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.field = null;
        Logger.i(TAG, "binder dead " + this$0.name + ", field = null");
    }

    @Nullable
    public final T getField() {
        return this.field;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
        return getValue(obj, (KProperty<?>) kProperty);
    }

    public final void setField(@Nullable T t) {
        this.field = t;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public /* bridge */ /* synthetic */ void setValue(Object obj, KProperty kProperty, Object obj2) {
        setValue(obj, (KProperty<?>) kProperty, (IInterface) obj2);
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    @Nullable
    public T getValue(@Nullable Object thisRef, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        if (this.field == null) {
            Logger.i(TAG, "binder died or not init " + this.name);
        }
        return this.field;
    }

    public void setValue(@Nullable Object thisRef, @NotNull KProperty<?> property, @Nullable T value) {
        Intrinsics.checkNotNullParameter(property, "property");
        Logger.i(TAG, "binder " + this.name + " init ");
        if (value != null) {
            try {
                IBinder iBinderAsBinder = value.asBinder();
                if (iBinderAsBinder != null) {
                    iBinderAsBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: mi2
                        @Override // android.os.IBinder.DeathRecipient
                        public final void binderDied() {
                            BgLocationBinderDelegate.setValue$lambda$0(this.f26205a);
                        }
                    }, 0);
                }
            } catch (Exception e) {
                Logger.i(TAG, "binder set exception : " + e.getMessage() + " , name = " + this.name);
                return;
            }
        }
        this.field = value;
    }
}
