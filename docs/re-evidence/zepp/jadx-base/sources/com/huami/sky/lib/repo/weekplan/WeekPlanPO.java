package com.huami.sky.lib.repo.weekplan;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Parcelize
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\nHÆ\u0001J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\r\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/huami/sky/lib/repo/weekplan/WeekPlanPO;", "Landroid/os/Parcelable;", "", "other", "", "equals", "", "hashCode", "", "component1", "", "component2", "timeStamp", "dateStr", "copy", "toString", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", "J", "getTimeStamp", "()J", "Ljava/lang/String;", "getDateStr", "()Ljava/lang/String;", "<init>", "(JLjava/lang/String;)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WeekPlanPO implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WeekPlanPO> CREATOR = new Creator();

    @NotNull
    private final String dateStr;
    private final long timeStamp;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class Creator implements Parcelable.Creator<WeekPlanPO> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final WeekPlanPO createFromParcel(@NotNull Parcel parcel) {
            return new WeekPlanPO(parcel.readLong(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final WeekPlanPO[] newArray(int i) {
            return new WeekPlanPO[i];
        }
    }

    public WeekPlanPO(long j, @NotNull String str) {
        this.timeStamp = j;
        this.dateStr = str;
    }

    public static /* synthetic */ WeekPlanPO copy$default(WeekPlanPO weekPlanPO, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = weekPlanPO.timeStamp;
        }
        if ((i & 2) != 0) {
            str = weekPlanPO.dateStr;
        }
        return weekPlanPO.copy(j, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDateStr() {
        return this.dateStr;
    }

    @NotNull
    public final WeekPlanPO copy(long timeStamp, @NotNull String dateStr) {
        return new WeekPlanPO(timeStamp, dateStr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(WeekPlanPO.class, other == null ? null : other.getClass())) {
            return false;
        }
        Objects.requireNonNull(other, "null cannot be cast to non-null type com.huami.sky.lib.repo.weekplan.WeekPlanPO");
        return Intrinsics.areEqual(this.dateStr, ((WeekPlanPO) other).dateStr);
    }

    @NotNull
    public final String getDateStr() {
        return this.dateStr;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        return this.dateStr.hashCode();
    }

    @NotNull
    public String toString() {
        return "WeekPlanPO(timeStamp=" + this.timeStamp + ", dateStr=" + this.dateStr + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeLong(this.timeStamp);
        parcel.writeString(this.dateStr);
    }
}
