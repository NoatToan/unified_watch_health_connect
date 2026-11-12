package com.mi.health_provider.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u0018\u0010\"\u001a\u00020#2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020%H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001b¨\u0006("}, d2 = {"Lcom/mi/health_provider/data/RecentDailyDataItem;", "Landroid/os/Parcelable;", "<init>", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "time", "", "getTime", "()J", "setTime", "(J)V", "lastHrItem", "Lcom/mi/health_provider/data/RecordValueItem;", "getLastHrItem", "()Lcom/mi/health_provider/data/RecordValueItem;", "setLastHrItem", "(Lcom/mi/health_provider/data/RecordValueItem;)V", "lasSpo2Item", "getLasSpo2Item", "setLasSpo2Item", "abnormalLowHrItem", "Lcom/mi/health_provider/data/RecentAbnormalDataItem;", "getAbnormalLowHrItem", "()Lcom/mi/health_provider/data/RecentAbnormalDataItem;", "setAbnormalLowHrItem", "(Lcom/mi/health_provider/data/RecentAbnormalDataItem;)V", "abnormalHighHrItem", "getAbnormalHighHrItem", "setAbnormalHighHrItem", "abnormalSpo2Item", "getAbnormalSpo2Item", "setAbnormalSpo2Item", "writeToParcel", "", "flags", "", "describeContents", "CREATOR", "health-provider_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecentDailyDataItem implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private RecentAbnormalDataItem abnormalHighHrItem;

    @Nullable
    private RecentAbnormalDataItem abnormalLowHrItem;

    @Nullable
    private RecentAbnormalDataItem abnormalSpo2Item;

    @Nullable
    private RecordValueItem lasSpo2Item;

    @Nullable
    private RecordValueItem lastHrItem;
    private long time;

    /* JADX INFO: renamed from: com.mi.health_provider.data.RecentDailyDataItem$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/mi/health_provider/data/RecentDailyDataItem$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/mi/health_provider/data/RecentDailyDataItem;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/mi/health_provider/data/RecentDailyDataItem;", "health-provider_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<RecentDailyDataItem> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public RecentDailyDataItem createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RecentDailyDataItem(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public RecentDailyDataItem[] newArray(int size) {
            return new RecentDailyDataItem[size];
        }
    }

    public RecentDailyDataItem() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecentDailyDataItem(@NotNull Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.time = parcel.readLong();
        this.lastHrItem = (RecordValueItem) parcel.readParcelable(RecordValueItem.class.getClassLoader());
        this.lasSpo2Item = (RecordValueItem) parcel.readParcelable(RecordValueItem.class.getClassLoader());
        this.abnormalLowHrItem = (RecentAbnormalDataItem) parcel.readParcelable(RecentAbnormalDataItem.class.getClassLoader());
        this.abnormalHighHrItem = (RecentAbnormalDataItem) parcel.readParcelable(RecentAbnormalDataItem.class.getClassLoader());
        this.abnormalSpo2Item = (RecentAbnormalDataItem) parcel.readParcelable(RecentAbnormalDataItem.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final RecentAbnormalDataItem getAbnormalHighHrItem() {
        return this.abnormalHighHrItem;
    }

    @Nullable
    public final RecentAbnormalDataItem getAbnormalLowHrItem() {
        return this.abnormalLowHrItem;
    }

    @Nullable
    public final RecentAbnormalDataItem getAbnormalSpo2Item() {
        return this.abnormalSpo2Item;
    }

    @Nullable
    public final RecordValueItem getLasSpo2Item() {
        return this.lasSpo2Item;
    }

    @Nullable
    public final RecordValueItem getLastHrItem() {
        return this.lastHrItem;
    }

    public final long getTime() {
        return this.time;
    }

    public final void setAbnormalHighHrItem(@Nullable RecentAbnormalDataItem recentAbnormalDataItem) {
        this.abnormalHighHrItem = recentAbnormalDataItem;
    }

    public final void setAbnormalLowHrItem(@Nullable RecentAbnormalDataItem recentAbnormalDataItem) {
        this.abnormalLowHrItem = recentAbnormalDataItem;
    }

    public final void setAbnormalSpo2Item(@Nullable RecentAbnormalDataItem recentAbnormalDataItem) {
        this.abnormalSpo2Item = recentAbnormalDataItem;
    }

    public final void setLasSpo2Item(@Nullable RecordValueItem recordValueItem) {
        this.lasSpo2Item = recordValueItem;
    }

    public final void setLastHrItem(@Nullable RecordValueItem recordValueItem) {
        this.lastHrItem = recordValueItem;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeLong(this.time);
        parcel.writeParcelable(this.lastHrItem, flags);
        parcel.writeParcelable(this.lasSpo2Item, flags);
        parcel.writeParcelable(this.abnormalLowHrItem, flags);
        parcel.writeParcelable(this.abnormalHighHrItem, flags);
        parcel.writeParcelable(this.abnormalSpo2Item, flags);
    }
}
