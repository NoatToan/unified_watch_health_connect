package com.xiaomi.hm.health.bt.profile.sport;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/SportTypeItem;", "Ljava/io/Serializable;", "", "visible", "", "component1", "component2", "type", "status", "copy", "", "toString", "hashCode", "", "other", "equals", "I", "getType", "()I", "getStatus", "<init>", "(II)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class SportTypeItem implements Serializable {
    private static final long serialVersionUID = 1;
    private final int status;
    private final int type;

    public SportTypeItem(int i, int i2) {
        this.type = i;
        this.status = i2;
    }

    public static /* synthetic */ SportTypeItem copy$default(SportTypeItem sportTypeItem, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = sportTypeItem.type;
        }
        if ((i3 & 2) != 0) {
            i2 = sportTypeItem.status;
        }
        return sportTypeItem.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final SportTypeItem copy(int type, int status) {
        return new SportTypeItem(type, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportTypeItem)) {
            return false;
        }
        SportTypeItem sportTypeItem = (SportTypeItem) other;
        return this.type == sportTypeItem.type && this.status == sportTypeItem.status;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (Integer.hashCode(this.type) * 31) + Integer.hashCode(this.status);
    }

    @NotNull
    public String toString() {
        return "SportTypeItem(type=" + this.type + ", status=" + this.status + ')';
    }

    public final boolean visible() {
        return this.status == 1;
    }

    public /* synthetic */ SportTypeItem(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? 1 : i2);
    }
}
