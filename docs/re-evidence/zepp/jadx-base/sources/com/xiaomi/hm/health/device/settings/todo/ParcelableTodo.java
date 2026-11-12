package com.xiaomi.hm.health.device.settings.todo;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.todo.Todo;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Parcelize
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\bC\u0010DB\t\b\u0016¢\u0006\u0004\bC\u0010EJ\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002J!\u0010\t\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u000b\u001a\u00020\u0006HÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010Jh\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u001d\u001a\u00020\fHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001J\u0013\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010\"\u001a\u00020\u0004HÖ\u0001J\u0019\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u0015\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0016\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0017\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u0010R\u001b\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b8\u0010\u0010R\u0019\u0010\u0018\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b9\u00101\u001a\u0004\b:\u00103R\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b;\u00105\u001a\u0004\b<\u0010\u0010R\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b=\u00105\u001a\u0004\b>\u0010\u0010R\u0013\u0010B\u001a\u00020?8F@\u0006¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006F"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/todo/ParcelableTodo;", "Landroid/os/Parcelable;", "", "supportWorkdayRepeat", "", "checkedRepeat", "", "date", "time", "isRemindTimeChanged", "(Ljava/lang/Long;Ljava/lang/Long;)Z", "component1", "", "component2", "component3", "component4", "()Ljava/lang/Long;", "component5", "component6", "component7", "component8", "id", "content", "sourceType", "repeat", "completeTime", "firstRemind", "copy", "(JLjava/lang/String;ILjava/lang/Long;Ljava/lang/Long;ILjava/lang/Long;Ljava/lang/Long;)Lcom/xiaomi/hm/health/device/settings/todo/ParcelableTodo;", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", "a", "J", "getId", "()J", "b", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "c", LogUtil.I, "getSourceType", "()I", GoogleApiAvailabilityLight.a, "Ljava/lang/Long;", "getDate", "e", "getTime", "f", "getRepeat", "g", "getCompleteTime", "h", "getFirstRemind", "Lcom/huami/bluetooth/profile/channel/module/todo/Todo$Source;", "getSource", "()Lcom/huami/bluetooth/profile/channel/module/todo/Todo$Source;", "source", "<init>", "(JLjava/lang/String;ILjava/lang/Long;Ljava/lang/Long;ILjava/lang/Long;Ljava/lang/Long;)V", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ParcelableTodo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ParcelableTodo> CREATOR = new Creator();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String content;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int sourceType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long date;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long time;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int repeat;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long completeTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long firstRemind;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class Creator implements Parcelable.Creator<ParcelableTodo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ParcelableTodo createFromParcel(@NotNull Parcel parcel) {
            return new ParcelableTodo(parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ParcelableTodo[] newArray(int i) {
            return new ParcelableTodo[i];
        }
    }

    public ParcelableTodo(long j, @NotNull String str, int i, @Nullable Long l, @Nullable Long l2, int i2, @Nullable Long l3, @Nullable Long l4) {
        this.id = j;
        this.content = str;
        this.sourceType = i;
        this.date = l;
        this.time = l2;
        this.repeat = i2;
        this.completeTime = l3;
        this.firstRemind = l4;
    }

    public static /* synthetic */ int checkedRepeat$default(ParcelableTodo parcelableTodo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return parcelableTodo.checkedRepeat(z);
    }

    public final int checkedRepeat(boolean supportWorkdayRepeat) {
        return TodoRepeat.checkFlag(this.repeat, this.date, supportWorkdayRepeat);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSourceType() {
        return this.sourceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getDate() {
        return this.date;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getRepeat() {
        return this.repeat;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getCompleteTime() {
        return this.completeTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getFirstRemind() {
        return this.firstRemind;
    }

    @NotNull
    public final ParcelableTodo copy(long id, @NotNull String content, int sourceType, @Nullable Long date, @Nullable Long time, int repeat, @Nullable Long completeTime, @Nullable Long firstRemind) {
        return new ParcelableTodo(id, content, sourceType, date, time, repeat, completeTime, firstRemind);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParcelableTodo)) {
            return false;
        }
        ParcelableTodo parcelableTodo = (ParcelableTodo) other;
        return this.id == parcelableTodo.id && Intrinsics.areEqual(this.content, parcelableTodo.content) && this.sourceType == parcelableTodo.sourceType && Intrinsics.areEqual(this.date, parcelableTodo.date) && Intrinsics.areEqual(this.time, parcelableTodo.time) && this.repeat == parcelableTodo.repeat && Intrinsics.areEqual(this.completeTime, parcelableTodo.completeTime) && Intrinsics.areEqual(this.firstRemind, parcelableTodo.firstRemind);
    }

    @Nullable
    public final Long getCompleteTime() {
        return this.completeTime;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final Long getDate() {
        return this.date;
    }

    @Nullable
    public final Long getFirstRemind() {
        return this.firstRemind;
    }

    public final long getId() {
        return this.id;
    }

    public final int getRepeat() {
        return this.repeat;
    }

    @NotNull
    public final Todo.Source getSource() {
        int i = this.sourceType;
        if (i != 1) {
            return i != 2 ? Todo.Source.Default.INSTANCE : Todo.Source.Alexa.INSTANCE;
        }
        return Todo.Source.XiaoAi.INSTANCE;
    }

    public final int getSourceType() {
        return this.sourceType;
    }

    @Nullable
    public final Long getTime() {
        return this.time;
    }

    public int hashCode() {
        int iA = ((((defpackage.b.a(this.id) * 31) + this.content.hashCode()) * 31) + this.sourceType) * 31;
        Long l = this.date;
        int iHashCode = (iA + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.time;
        int iHashCode2 = (((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31) + this.repeat) * 31;
        Long l3 = this.completeTime;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.firstRemind;
        return iHashCode3 + (l4 != null ? l4.hashCode() : 0);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    /* JADX WARN: Code duplicated, block: B:5:0x0008  */
    public final boolean isRemindTimeChanged(@Nullable Long date, @Nullable Long time) {
        boolean z;
        boolean z2;
        Long l = this.date;
        if (l == null && date == null) {
            z = false;
        } else {
            if (l != null && date != null) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(getDate().longValue());
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(date.longValue());
                if (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
                    z = false;
                }
            }
            z = true;
        }
        Long l2 = this.time;
        if (l2 == null && time == null) {
            z2 = false;
        } else {
            if (l2 != null && time != null) {
                Calendar calendar3 = Calendar.getInstance();
                calendar3.setTimeInMillis(getTime().longValue());
                Calendar calendar4 = Calendar.getInstance();
                calendar4.setTimeInMillis(time.longValue());
                if (calendar3.get(10) == calendar4.get(10) && calendar3.get(12) == calendar4.get(12)) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        return z || z2;
    }

    @NotNull
    public String toString() {
        return "ParcelableTodo(id=" + this.id + ", content=" + this.content + ", sourceType=" + this.sourceType + ", date=" + this.date + ", time=" + this.time + ", repeat=" + this.repeat + ", completeTime=" + this.completeTime + ", firstRemind=" + this.firstRemind + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeLong(this.id);
        parcel.writeString(this.content);
        parcel.writeInt(this.sourceType);
        Long l = this.date;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.time;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeInt(this.repeat);
        Long l3 = this.completeTime;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        Long l4 = this.firstRemind;
        if (l4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l4.longValue());
        }
    }

    public ParcelableTodo() {
        this(0L, "", 0, null, null, 0, null, null);
    }
}
