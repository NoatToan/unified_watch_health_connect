package com.huami.phn.core.webapi;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003HÆ\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/huami/phn/core/webapi/UserEventList;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "component1", "", "component2", "()Ljava/lang/Long;", "items", "next", "copy", "(Ljava/util/List;Ljava/lang/Long;)Lcom/huami/phn/core/webapi/UserEventList;", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "b", "Ljava/lang/Long;", "getNext", "<init>", "(Ljava/util/List;Ljava/lang/Long;)V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class UserEventList<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<T> items;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long next;

    /* JADX WARN: Multi-variable type inference failed */
    public UserEventList(@NotNull List<? extends T> list, @Nullable Long l) {
        this.items = list;
        this.next = l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserEventList copy$default(UserEventList userEventList, List list, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            list = userEventList.items;
        }
        if ((i & 2) != 0) {
            l = userEventList.next;
        }
        return userEventList.copy(list, l);
    }

    @NotNull
    public final List<T> component1() {
        return this.items;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getNext() {
        return this.next;
    }

    @NotNull
    public final UserEventList<T> copy(@NotNull List<? extends T> items, @Nullable Long next) {
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
    public final Long getNext() {
        return this.next;
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        Long l = this.next;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    @NotNull
    public String toString() {
        return "UserEventList(items=" + this.items + ", next=" + this.next + ")";
    }

    public /* synthetic */ UserEventList(List list, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : l);
    }
}
