package com.huami.treadmill.data;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.sleepassistant.apilib.utils.WebConst;
import defpackage.b;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@TypeConverters({DateConverters.class})
@Entity(tableName = "td_record")
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b)\u0010*J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J1\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0011\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\r\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/huami/treadmill/data/TdRecord;", "", "", "component1", "Ljava/util/Date;", "component2", "", "component3", "", "component4", "runDis", "date", "useTime", "id", "copy", "", "toString", "hashCode", "other", "", "equals", "F", "getRunDis", "()F", "setRunDis", "(F)V", "Ljava/util/Date;", "getDate", "()Ljava/util/Date;", "setDate", "(Ljava/util/Date;)V", "J", "getUseTime", "()J", "setUseTime", "(J)V", LogUtil.I, "getId", "()I", WebConst.QueryParam.SET_ID, "(I)V", "<init>", "(FLjava/util/Date;JI)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TdRecord {

    @NotNull
    private Date date;

    @PrimaryKey(autoGenerate = true)
    private int id;
    private float runDis;
    private long useTime;

    public TdRecord(float f, @NotNull Date date, long j, int i) {
        this.runDis = f;
        this.date = date;
        this.useTime = j;
        this.id = i;
    }

    public static /* synthetic */ TdRecord copy$default(TdRecord tdRecord, float f, Date date, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = tdRecord.runDis;
        }
        if ((i2 & 2) != 0) {
            date = tdRecord.date;
        }
        Date date2 = date;
        if ((i2 & 4) != 0) {
            j = tdRecord.useTime;
        }
        long j2 = j;
        if ((i2 & 8) != 0) {
            i = tdRecord.id;
        }
        return tdRecord.copy(f, date2, j2, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getRunDis() {
        return this.runDis;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getUseTime() {
        return this.useTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    public final TdRecord copy(float runDis, @NotNull Date date, long useTime, int id) {
        return new TdRecord(runDis, date, useTime, id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TdRecord)) {
            return false;
        }
        TdRecord tdRecord = (TdRecord) other;
        return Intrinsics.areEqual((Object) Float.valueOf(this.runDis), (Object) Float.valueOf(tdRecord.runDis)) && Intrinsics.areEqual(this.date, tdRecord.date) && this.useTime == tdRecord.useTime && this.id == tdRecord.id;
    }

    @NotNull
    public final Date getDate() {
        return this.date;
    }

    public final int getId() {
        return this.id;
    }

    public final float getRunDis() {
        return this.runDis;
    }

    public final long getUseTime() {
        return this.useTime;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.runDis) * 31) + this.date.hashCode()) * 31) + b.a(this.useTime)) * 31) + this.id;
    }

    public final void setDate(@NotNull Date date) {
        this.date = date;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setRunDis(float f) {
        this.runDis = f;
    }

    public final void setUseTime(long j) {
        this.useTime = j;
    }

    @NotNull
    public String toString() {
        return "TdRecord(runDis=" + this.runDis + ", date=" + this.date + ", useTime=" + this.useTime + ", id=" + this.id + ')';
    }

    public /* synthetic */ TdRecord(float f, Date date, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0.0f : f, date, j, (i2 & 8) != 0 ? 0 : i);
    }
}
