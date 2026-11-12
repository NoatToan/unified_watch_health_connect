package com.huami.nfc.door.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Parcelize
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002HÖ\u0001R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004¨\u0006\u001a"}, d2 = {"Lcom/huami/nfc/door/entity/DoorCardExtraEntity;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/Integer;", "dataType", "copy", "(Ljava/lang/Integer;)Lcom/huami/nfc/door/entity/DoorCardExtraEntity;", "", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", "a", "Ljava/lang/Integer;", "getDataType", "<init>", "(Ljava/lang/Integer;)V", "nfc-door_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DoorCardExtraEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DoorCardExtraEntity> CREATOR = new Creator();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("dataType")
    @Nullable
    private final Integer dataType;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class Creator implements Parcelable.Creator<DoorCardExtraEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final DoorCardExtraEntity createFromParcel(@NotNull Parcel parcel) {
            return new DoorCardExtraEntity(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final DoorCardExtraEntity[] newArray(int i) {
            return new DoorCardExtraEntity[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DoorCardExtraEntity() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public DoorCardExtraEntity(@Nullable Integer num) {
        this.dataType = num;
    }

    public static /* synthetic */ DoorCardExtraEntity copy$default(DoorCardExtraEntity doorCardExtraEntity, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = doorCardExtraEntity.dataType;
        }
        return doorCardExtraEntity.copy(num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getDataType() {
        return this.dataType;
    }

    @NotNull
    public final DoorCardExtraEntity copy(@Nullable Integer dataType) {
        return new DoorCardExtraEntity(dataType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DoorCardExtraEntity) && Intrinsics.areEqual(this.dataType, ((DoorCardExtraEntity) other).dataType);
    }

    @Nullable
    public final Integer getDataType() {
        return this.dataType;
    }

    public int hashCode() {
        Integer num = this.dataType;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    @NotNull
    public String toString() {
        return "DoorCardExtraEntity(dataType=" + this.dataType + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        int iIntValue;
        Integer num = this.dataType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public /* synthetic */ DoorCardExtraEntity(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num);
    }
}
