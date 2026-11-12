package com.xiaomi.fitness.route.export.track;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b+\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010.\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001eJ\t\u0010/\u001a\u00020\fHÆ\u0003J\t\u00100\u001a\u00020\tHÆ\u0003Jr\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\tHÖ\u0001J\t\u00106\u001a\u00020\u0007HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u001cR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\r\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\r\u0010\u001e\"\u0004\b \u0010!R\u001a\u0010\u000e\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\"\"\u0004\b#\u0010$R\u001e\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0019\"\u0004\b&\u0010'¨\u00067"}, d2 = {"Lcom/xiaomi/fitness/route/export/track/Route;", "", "mFile", "Lcom/xiaomi/fitness/route/export/track/File;", "icon", "Lcom/xiaomi/fitness/route/export/track/Icon;", "route_id", "", "time", "", "value", "deleted", "", "isDelSelected", "isToDeviceSelected", "strategyId", "<init>", "(Lcom/xiaomi/fitness/route/export/track/File;Lcom/xiaomi/fitness/route/export/track/Icon;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;ZI)V", "getMFile", "()Lcom/xiaomi/fitness/route/export/track/File;", "getIcon", "()Lcom/xiaomi/fitness/route/export/track/Icon;", "getRoute_id", "()Ljava/lang/String;", "getTime", "()I", "getValue", "setValue", "(Ljava/lang/String;)V", "getDeleted", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "setDelSelected", "(Ljava/lang/Boolean;)V", "()Z", "setToDeviceSelected", "(Z)V", "getStrategyId", "setStrategyId", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/xiaomi/fitness/route/export/track/File;Lcom/xiaomi/fitness/route/export/track/Icon;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;ZI)Lcom/xiaomi/fitness/route/export/track/Route;", "equals", "other", "hashCode", "toString", "route-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Route {

    @Nullable
    private final Boolean deleted;

    @Nullable
    private final Icon icon;

    @Nullable
    private Boolean isDelSelected;
    private boolean isToDeviceSelected;

    @SerializedName("file")
    @Nullable
    private final File mFile;

    @NotNull
    private final String route_id;

    @SerializedName("strategy_id")
    private int strategyId;
    private final int time;

    @Nullable
    private String value;

    public Route(@Nullable File file, @Nullable Icon icon, @NotNull String route_id, int i, @Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2, boolean z, int i2) {
        Intrinsics.checkNotNullParameter(route_id, "route_id");
        this.mFile = file;
        this.icon = icon;
        this.route_id = route_id;
        this.time = i;
        this.value = str;
        this.deleted = bool;
        this.isDelSelected = bool2;
        this.isToDeviceSelected = z;
        this.strategyId = i2;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final File getMFile() {
        return this.mFile;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Icon getIcon() {
        return this.icon;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRoute_id() {
        return this.route_id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getDeleted() {
        return this.deleted;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getIsDelSelected() {
        return this.isDelSelected;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsToDeviceSelected() {
        return this.isToDeviceSelected;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getStrategyId() {
        return this.strategyId;
    }

    @NotNull
    public final Route copy(@Nullable File mFile, @Nullable Icon icon, @NotNull String route_id, int time, @Nullable String value, @Nullable Boolean deleted, @Nullable Boolean isDelSelected, boolean isToDeviceSelected, int strategyId) {
        Intrinsics.checkNotNullParameter(route_id, "route_id");
        return new Route(mFile, icon, route_id, time, value, deleted, isDelSelected, isToDeviceSelected, strategyId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Route)) {
            return false;
        }
        Route route = (Route) other;
        return Intrinsics.areEqual(this.mFile, route.mFile) && Intrinsics.areEqual(this.icon, route.icon) && Intrinsics.areEqual(this.route_id, route.route_id) && this.time == route.time && Intrinsics.areEqual(this.value, route.value) && Intrinsics.areEqual(this.deleted, route.deleted) && Intrinsics.areEqual(this.isDelSelected, route.isDelSelected) && this.isToDeviceSelected == route.isToDeviceSelected && this.strategyId == route.strategyId;
    }

    @Nullable
    public final Boolean getDeleted() {
        return this.deleted;
    }

    @Nullable
    public final Icon getIcon() {
        return this.icon;
    }

    @Nullable
    public final File getMFile() {
        return this.mFile;
    }

    @NotNull
    public final String getRoute_id() {
        return this.route_id;
    }

    public final int getStrategyId() {
        return this.strategyId;
    }

    public final int getTime() {
        return this.time;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        File file = this.mFile;
        int iHashCode = (file == null ? 0 : file.hashCode()) * 31;
        Icon icon = this.icon;
        int iHashCode2 = (((((iHashCode + (icon == null ? 0 : icon.hashCode())) * 31) + this.route_id.hashCode()) * 31) + Integer.hashCode(this.time)) * 31;
        String str = this.value;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.deleted;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isDelSelected;
        return ((((iHashCode4 + (bool2 != null ? bool2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isToDeviceSelected)) * 31) + Integer.hashCode(this.strategyId);
    }

    @Nullable
    public final Boolean isDelSelected() {
        return this.isDelSelected;
    }

    public final boolean isToDeviceSelected() {
        return this.isToDeviceSelected;
    }

    public final void setDelSelected(@Nullable Boolean bool) {
        this.isDelSelected = bool;
    }

    public final void setStrategyId(int i) {
        this.strategyId = i;
    }

    public final void setToDeviceSelected(boolean z) {
        this.isToDeviceSelected = z;
    }

    public final void setValue(@Nullable String str) {
        this.value = str;
    }

    @NotNull
    public String toString() {
        return "Route(mFile=" + this.mFile + ", icon=" + this.icon + ", route_id=" + this.route_id + ", time=" + this.time + ", value=" + this.value + ", deleted=" + this.deleted + ", isDelSelected=" + this.isDelSelected + ", isToDeviceSelected=" + this.isToDeviceSelected + ", strategyId=" + this.strategyId + ")";
    }

    public /* synthetic */ Route(File file, Icon icon, String str, int i, String str2, Boolean bool, Boolean bool2, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, icon, str, i, str2, (i3 & 32) != 0 ? Boolean.FALSE : bool, (i3 & 64) != 0 ? Boolean.FALSE : bool2, (i3 & 128) != 0 ? false : z, (i3 & 256) != 0 ? 0 : i2);
    }
}
