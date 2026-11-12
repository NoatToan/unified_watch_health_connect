package com.huami.bluetooth.profile.channel.model;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0005\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\b\u001a\u00028\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0006¨\u0006\u001b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/model/DispatchEvent;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lcom/huami/bluetooth/profile/channel/model/DispatchEventType;", "component1", "component2", "()Ljava/lang/Object;", "type", "data", "copy", "(Lcom/huami/bluetooth/profile/channel/model/DispatchEventType;Ljava/lang/Object;)Lcom/huami/bluetooth/profile/channel/model/DispatchEvent;", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/bluetooth/profile/channel/model/DispatchEventType;", "getType", "()Lcom/huami/bluetooth/profile/channel/model/DispatchEventType;", "b", "Ljava/lang/Object;", "getData", "<init>", "(Lcom/huami/bluetooth/profile/channel/model/DispatchEventType;Ljava/lang/Object;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DispatchEvent<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final DispatchEventType type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final T data;

    public DispatchEvent(@NotNull DispatchEventType dispatchEventType, T t) {
        this.type = dispatchEventType;
        this.data = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DispatchEvent copy$default(DispatchEvent dispatchEvent, DispatchEventType dispatchEventType, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            dispatchEventType = dispatchEvent.type;
        }
        if ((i & 2) != 0) {
            obj = dispatchEvent.data;
        }
        return dispatchEvent.copy(dispatchEventType, obj);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DispatchEventType getType() {
        return this.type;
    }

    public final T component2() {
        return this.data;
    }

    @NotNull
    public final DispatchEvent<T> copy(@NotNull DispatchEventType type, T data) {
        return new DispatchEvent<>(type, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DispatchEvent)) {
            return false;
        }
        DispatchEvent dispatchEvent = (DispatchEvent) other;
        return this.type == dispatchEvent.type && Intrinsics.areEqual(this.data, dispatchEvent.data);
    }

    public final T getData() {
        return this.data;
    }

    @NotNull
    public final DispatchEventType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        T t = this.data;
        return iHashCode + (t == null ? 0 : t.hashCode());
    }

    @NotNull
    public String toString() {
        return "DispatchEvent(type=" + this.type + ", data=" + this.data + ')';
    }
}
