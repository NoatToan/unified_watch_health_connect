package com.xiaomi.hm.health.device.setting.appsort;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u001c\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\t\u001a\u00020\u00058\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/IdSortItem;", "Lcom/xiaomi/hm/health/device/setting/appsort/AppItem;", "", "component1", "component2", "", "component3", "name", "id", "canDisable", "copy", "toString", "", "hashCode", "", "other", "equals", "e", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "f", "getId", "g", "Z", "getCanDisable", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class IdSortItem extends AppItem {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean canDisable;

    public /* synthetic */ IdSortItem(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? true : z);
    }

    public static /* synthetic */ IdSortItem copy$default(IdSortItem idSortItem, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = idSortItem.getName();
        }
        if ((i & 2) != 0) {
            str2 = idSortItem.id;
        }
        if ((i & 4) != 0) {
            z = idSortItem.getCanDisable();
        }
        return idSortItem.copy(str, str2, z);
    }

    @NotNull
    public final String component1() {
        return getName();
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean component3() {
        return getCanDisable();
    }

    @NotNull
    public final IdSortItem copy(@NotNull String name, @NotNull String id, boolean canDisable) {
        return new IdSortItem(name, id, canDisable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdSortItem)) {
            return false;
        }
        IdSortItem idSortItem = (IdSortItem) other;
        return Intrinsics.areEqual(getName(), idSortItem.getName()) && Intrinsics.areEqual(this.id, idSortItem.id) && getCanDisable() == idSortItem.getCanDisable();
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.AppItem
    public boolean getCanDisable() {
        return this.canDisable;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.AppItem
    @NotNull
    public String getName() {
        return this.name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iHashCode = ((getName().hashCode() * 31) + this.id.hashCode()) * 31;
        boolean canDisable = getCanDisable();
        ?? r1 = canDisable;
        if (canDisable) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public String toString() {
        return "IdSortItem(name=" + getName() + ", id=" + this.id + ", canDisable=" + getCanDisable() + ")";
    }

    public IdSortItem(@NotNull String str, @NotNull String str2, boolean z) {
        super(str, -1, -1, z);
        this.name = str;
        this.id = str2;
        this.canDisable = z;
    }
}
