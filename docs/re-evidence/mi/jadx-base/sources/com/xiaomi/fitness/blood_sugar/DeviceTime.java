package com.xiaomi.fitness.blood_sugar;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0011HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/blood_sugar/DeviceTime;", "Landroid/os/Parcelable;", "activeExpireTime", "", "activeTime", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getActiveExpireTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getActiveTime", "writeToParcel", "", "flags", "", "describeContents", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/Long;)Lcom/xiaomi/fitness/blood_sugar/DeviceTime;", "equals", "", "other", "", "hashCode", "toString", "", "CREATOR", "blood-sugar-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceTime implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Long activeExpireTime;

    @Nullable
    private final Long activeTime;

    /* JADX INFO: renamed from: com.xiaomi.fitness.blood_sugar.DeviceTime$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/blood_sugar/DeviceTime$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/blood_sugar/DeviceTime;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fitness/blood_sugar/DeviceTime;", "blood-sugar-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<DeviceTime> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public DeviceTime createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeviceTime(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public DeviceTime[] newArray(int size) {
            return new DeviceTime[size];
        }
    }

    public DeviceTime(@Nullable Long l, @Nullable Long l2) {
        this.activeExpireTime = l;
        this.activeTime = l2;
    }

    public static /* synthetic */ DeviceTime copy$default(DeviceTime deviceTime, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = deviceTime.activeExpireTime;
        }
        if ((i & 2) != 0) {
            l2 = deviceTime.activeTime;
        }
        return deviceTime.copy(l, l2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getActiveExpireTime() {
        return this.activeExpireTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getActiveTime() {
        return this.activeTime;
    }

    @NotNull
    public final DeviceTime copy(@Nullable Long activeExpireTime, @Nullable Long activeTime) {
        return new DeviceTime(activeExpireTime, activeTime);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceTime)) {
            return false;
        }
        DeviceTime deviceTime = (DeviceTime) other;
        return Intrinsics.areEqual(this.activeExpireTime, deviceTime.activeExpireTime) && Intrinsics.areEqual(this.activeTime, deviceTime.activeTime);
    }

    @Nullable
    public final Long getActiveExpireTime() {
        return this.activeExpireTime;
    }

    @Nullable
    public final Long getActiveTime() {
        return this.activeTime;
    }

    public int hashCode() {
        Long l = this.activeExpireTime;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.activeTime;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DeviceTime(activeExpireTime=" + this.activeExpireTime + ", activeTime=" + this.activeTime + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeValue(this.activeExpireTime);
        parcel.writeValue(this.activeTime);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DeviceTime(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Class cls = Long.TYPE;
        Object value = parcel.readValue(cls.getClassLoader());
        Long l = value instanceof Long ? (Long) value : null;
        Object value2 = parcel.readValue(cls.getClassLoader());
        this(l, value2 instanceof Long ? (Long) value2 : null);
    }
}
