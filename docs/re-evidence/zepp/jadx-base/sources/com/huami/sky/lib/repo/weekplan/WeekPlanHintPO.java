package com.huami.sky.lib.repo.weekplan;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import kotlin.Metadata;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Parcelize
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002HÖ\u0001R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/huami/sky/lib/repo/weekplan/WeekPlanHintPO;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "type", "strId", "value", "copy", "", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", LogUtil.I, "getType", "()I", "getStrId", "getValue", "<init>", "(III)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WeekPlanHintPO implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WeekPlanHintPO> CREATOR = new Creator();
    private final int strId;
    private final int type;
    private final int value;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class Creator implements Parcelable.Creator<WeekPlanHintPO> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final WeekPlanHintPO createFromParcel(@NotNull Parcel parcel) {
            return new WeekPlanHintPO(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final WeekPlanHintPO[] newArray(int i) {
            return new WeekPlanHintPO[i];
        }
    }

    public WeekPlanHintPO(int i, int i2, int i3) {
        this.type = i;
        this.strId = i2;
        this.value = i3;
    }

    public static /* synthetic */ WeekPlanHintPO copy$default(WeekPlanHintPO weekPlanHintPO, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = weekPlanHintPO.type;
        }
        if ((i4 & 2) != 0) {
            i2 = weekPlanHintPO.strId;
        }
        if ((i4 & 4) != 0) {
            i3 = weekPlanHintPO.value;
        }
        return weekPlanHintPO.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStrId() {
        return this.strId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @NotNull
    public final WeekPlanHintPO copy(int type, int strId, int value) {
        return new WeekPlanHintPO(type, strId, value);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeekPlanHintPO)) {
            return false;
        }
        WeekPlanHintPO weekPlanHintPO = (WeekPlanHintPO) other;
        return this.type == weekPlanHintPO.type && this.strId == weekPlanHintPO.strId && this.value == weekPlanHintPO.value;
    }

    public final int getStrId() {
        return this.strId;
    }

    public final int getType() {
        return this.type;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((this.type * 31) + this.strId) * 31) + this.value;
    }

    @NotNull
    public String toString() {
        return "WeekPlanHintPO(type=" + this.type + ", strId=" + this.strId + ", value=" + this.value + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeInt(this.type);
        parcel.writeInt(this.strId);
        parcel.writeInt(this.value);
    }
}
