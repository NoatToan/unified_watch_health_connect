package com.mi.health_provider.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0011H\u0016J\b\u0010\"\u001a\u00020\u0011H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006$"}, d2 = {"Lcom/mi/health_provider/data/RecentAbnormalDataItem;", "Landroid/os/Parcelable;", "<init>", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "startTime", "", "getStartTime", "()J", "setStartTime", "(J)V", "endTime", "getEndTime", "setEndTime", "lowValue", "", "getLowValue", "()I", "setLowValue", "(I)V", "highValue", "getHighValue", "setHighValue", "multi", "", "getMulti", "()Z", "setMulti", "(Z)V", "writeToParcel", "", "flags", "describeContents", "CREATOR", "health-provider_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecentAbnormalDataItem implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private long endTime;
    private int highValue;
    private int lowValue;
    private boolean multi;
    private long startTime;

    /* JADX INFO: renamed from: com.mi.health_provider.data.RecentAbnormalDataItem$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/mi/health_provider/data/RecentAbnormalDataItem$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/mi/health_provider/data/RecentAbnormalDataItem;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/mi/health_provider/data/RecentAbnormalDataItem;", "health-provider_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<RecentAbnormalDataItem> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public RecentAbnormalDataItem createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RecentAbnormalDataItem(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public RecentAbnormalDataItem[] newArray(int size) {
            return new RecentAbnormalDataItem[size];
        }
    }

    public RecentAbnormalDataItem() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecentAbnormalDataItem(@NotNull Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.startTime = parcel.readLong();
        this.endTime = parcel.readLong();
        this.lowValue = parcel.readInt();
        this.highValue = parcel.readInt();
        this.multi = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final int getHighValue() {
        return this.highValue;
    }

    public final int getLowValue() {
        return this.lowValue;
    }

    public final boolean getMulti() {
        return this.multi;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setHighValue(int i) {
        this.highValue = i;
    }

    public final void setLowValue(int i) {
        this.lowValue = i;
    }

    public final void setMulti(boolean z) {
        this.multi = z;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
        parcel.writeInt(this.lowValue);
        parcel.writeInt(this.highValue);
        parcel.writeByte(this.multi ? (byte) 1 : (byte) 0);
    }
}
