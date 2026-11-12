package com.huami.femalehealth.logiclib.vo;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.hmdateformat.date.HMDataFormatKt;
import com.huami.hmdateformat.date.HMPattern;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import defpackage.b;
import defpackage.yi;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b3\b\u0086\b\u0018\u0000 E2\u00020\u0001:\u0001EBC\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u0006\u0010 \u001a\u00020\f\u0012\u0006\u0010!\u001a\u00020\u0004\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010#\u001a\u00020\u0013¢\u0006\u0004\bB\u0010CB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\bB\u0010DJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0015\u001a\u00020\fH\u0016J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0019\u001a\u00020\fHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0013HÆ\u0003JS\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\f2\b\b\u0002\u0010!\u001a\u00020\u00042\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010#\u001a\u00020\u0013HÆ\u0001J\t\u0010%\u001a\u00020\u0006HÖ\u0001R\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u001e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u001f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\"\u0010 \u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0019\u0010!\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b5\u0010*\u001a\u0004\b6\u0010,R\u001b\u0010\"\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b7\u0010&\u001a\u0004\b8\u0010(R\u0019\u0010#\u001a\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b#\u0010;R$\u0010?\u001a\u00020\f2\u0006\u0010<\u001a\u00020\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b=\u00100\u001a\u0004\b>\u00102R\u0013\u0010A\u001a\u00020\f8F@\u0006¢\u0006\u0006\u001a\u0004\b@\u00102¨\u0006F"}, d2 = {"Lcom/huami/femalehealth/logiclib/vo/HistoryItemVo;", "Landroid/os/Parcelable;", "Lcom/huami/hmdateformat/date/HMPattern;", TrainingWebConst.QueryParam.VIDEO_FORMAT, "", "time", "", "a", "getMenstrualPeriodString", "getMenstrualEndTimeString", "Landroid/os/Parcel;", "parcel", "", DataCacher.j, "", "writeToParcel", "describeContents", "", "other", "", "equals", "hashCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "id", "menstrualPeriod", "menstrualEndTime", "cycle", "month", "userId", "isEnd", "copy", "toString", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "J", "getMenstrualPeriod", "()J", "c", "getMenstrualEndTime", GoogleApiAvailabilityLight.a, LogUtil.I, "getCycle", "()I", "setCycle", "(I)V", "e", "getMonth", "f", "getUserId", "g", "Z", "()Z", "<set-?>", "h", "getType", "type", "getDur", "dur", "<init>", "(Ljava/lang/String;JJIJLjava/lang/String;Z)V", "(Landroid/os/Parcel;)V", "CREATOR", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HistoryItemVo implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int TYPE_ADD = 17;
    public static final int TYPE_NORMAL = 16;

    @NotNull
    private static final HistoryItemVo i;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long menstrualPeriod;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long menstrualEndTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private int cycle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final long month;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final String userId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final boolean isEnd;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int type;

    /* JADX INFO: renamed from: com.huami.femalehealth.logiclib.vo.HistoryItemVo$CREATOR, reason: from kotlin metadata */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\f\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/femalehealth/logiclib/vo/HistoryItemVo$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/huami/femalehealth/logiclib/vo/HistoryItemVo;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/huami/femalehealth/logiclib/vo/HistoryItemVo;", "ADD_TYPE_VO", "Lcom/huami/femalehealth/logiclib/vo/HistoryItemVo;", "getADD_TYPE_VO", "()Lcom/huami/femalehealth/logiclib/vo/HistoryItemVo;", "TYPE_ADD", LogUtil.I, "TYPE_NORMAL", "<init>", "()V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion implements Parcelable.Creator<HistoryItemVo> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HistoryItemVo getADD_TYPE_VO() {
            return HistoryItemVo.i;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public HistoryItemVo createFromParcel(@NotNull Parcel parcel) {
            return new HistoryItemVo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public HistoryItemVo[] newArray(int size) {
            return new HistoryItemVo[size];
        }
    }

    static {
        HistoryItemVo historyItemVo = new HistoryItemVo("", 0L, 0L, 0, 0L, "", false);
        historyItemVo.type = 17;
        i = historyItemVo;
    }

    public HistoryItemVo(@Nullable String str, long j, long j2, int i2, long j3, @Nullable String str2, boolean z) {
        this.id = str;
        this.menstrualPeriod = j;
        this.menstrualEndTime = j2;
        this.cycle = i2;
        this.month = j3;
        this.userId = str2;
        this.isEnd = z;
        this.type = 16;
    }

    private final String a(HMPattern format, long time) {
        return HMDataFormatKt.getFormatTime$default(time, format, (Locale) null, 2, (Object) null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getMenstrualPeriod() {
        return this.menstrualPeriod;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getMenstrualEndTime() {
        return this.menstrualEndTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCycle() {
        return this.cycle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getMonth() {
        return this.month;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsEnd() {
        return this.isEnd;
    }

    @NotNull
    public final HistoryItemVo copy(@Nullable String id, long menstrualPeriod, long menstrualEndTime, int cycle, long month, @Nullable String userId, boolean isEnd) {
        return new HistoryItemVo(id, menstrualPeriod, menstrualEndTime, cycle, month, userId, isEnd);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(HistoryItemVo.class, other == null ? null : other.getClass())) {
            return false;
        }
        Objects.requireNonNull(other, "null cannot be cast to non-null type com.huami.femalehealth.logiclib.vo.HistoryItemVo");
        HistoryItemVo historyItemVo = (HistoryItemVo) other;
        return Intrinsics.areEqual(this.id, historyItemVo.id) && this.menstrualPeriod == historyItemVo.menstrualPeriod && this.menstrualEndTime == historyItemVo.menstrualEndTime && this.cycle == historyItemVo.cycle && this.month == historyItemVo.month && Intrinsics.areEqual(this.userId, historyItemVo.userId) && this.isEnd == historyItemVo.isEnd && this.type == historyItemVo.type;
    }

    public final int getCycle() {
        return this.cycle;
    }

    public final int getDur() {
        return DateHelper.INSTANCE.daysBetween(new Date(this.menstrualPeriod), new Date(this.menstrualEndTime));
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    public final long getMenstrualEndTime() {
        return this.menstrualEndTime;
    }

    @NotNull
    public final String getMenstrualEndTimeString(@NotNull HMPattern format) {
        return a(format, this.menstrualEndTime);
    }

    public final long getMenstrualPeriod() {
        return this.menstrualPeriod;
    }

    @NotNull
    public final String getMenstrualPeriodString(@NotNull HMPattern format) {
        return a(format, this.menstrualPeriod);
    }

    public final long getMonth() {
        return this.month;
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (((((((((str != null ? str.hashCode() : 0) * 31) + b.a(this.menstrualPeriod)) * 31) + b.a(this.menstrualEndTime)) * 31) + this.cycle) * 31) + b.a(this.month)) * 31;
        String str2 = this.userId;
        return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + yi.a(this.isEnd)) * 31) + this.type;
    }

    public final boolean isEnd() {
        return this.isEnd;
    }

    public final void setCycle(int i2) {
        this.cycle = i2;
    }

    @NotNull
    public String toString() {
        return "HistoryItemVo(id=" + ((Object) this.id) + ", menstrualPeriod=" + this.menstrualPeriod + ", menstrualEndTime=" + this.menstrualEndTime + ", cycle=" + this.cycle + ", month=" + this.month + ", userId=" + ((Object) this.userId) + ", isEnd=" + this.isEnd + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeLong(this.menstrualPeriod);
        parcel.writeLong(this.menstrualEndTime);
        parcel.writeInt(this.cycle);
        parcel.writeLong(this.month);
        parcel.writeString(this.userId);
        parcel.writeByte(this.isEnd ? (byte) 1 : (byte) 0);
    }

    public HistoryItemVo(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readByte() != 0);
    }
}
