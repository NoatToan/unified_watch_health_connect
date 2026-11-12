package com.xiaomi.hm.health.device.webapi;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J2\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\b\u001a\u0004\u0018\u00018\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0006¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/device/webapi/UserEventList;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "component1", "component2", "()Ljava/lang/Object;", "items", "next", "copy", "(Ljava/util/List;Ljava/lang/Object;)Lcom/xiaomi/hm/health/device/webapi/UserEventList;", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "b", "Ljava/lang/Object;", "getNext", "<init>", "(Ljava/util/List;Ljava/lang/Object;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class UserEventList<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<T> items;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final T next;

    /* JADX WARN: Multi-variable type inference failed */
    public UserEventList(@NotNull List<? extends T> list, @Nullable T t) {
        this.items = list;
        this.next = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserEventList copy$default(UserEventList userEventList, List list, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            list = userEventList.items;
        }
        if ((i & 2) != 0) {
            obj = userEventList.next;
        }
        return userEventList.copy(list, obj);
    }

    @NotNull
    public final List<T> component1() {
        return this.items;
    }

    @Nullable
    public final T component2() {
        return this.next;
    }

    @NotNull
    public final UserEventList<T> copy(@NotNull List<? extends T> items, @Nullable T next) {
        return new UserEventList<>(items, next);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserEventList)) {
            return false;
        }
        UserEventList userEventList = (UserEventList) other;
        return Intrinsics.areEqual(this.items, userEventList.items) && Intrinsics.areEqual(this.next, userEventList.next);
    }

    @NotNull
    public final List<T> getItems() {
        return this.items;
    }

    @Nullable
    public final T getNext() {
        return this.next;
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        T t = this.next;
        return iHashCode + (t == null ? 0 : t.hashCode());
    }

    @NotNull
    public String toString() {
        return "UserEventList(items=" + this.items + ", next=" + this.next + ")";
    }

    public /* synthetic */ UserEventList(List list, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : obj);
    }
}
