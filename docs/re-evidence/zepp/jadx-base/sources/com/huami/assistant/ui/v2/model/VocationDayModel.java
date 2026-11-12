package com.huami.assistant.ui.v2.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.assistant.ui.v2.db.converter.VocationDayConverters;
import com.huami.sleepassistant.apilib.utils.WebConst;
import defpackage.b;
import defpackage.yi;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@TypeConverters({VocationDayConverters.class})
@Entity(tableName = "vocation_model")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b5\u00106J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0007HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\nHÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003JE\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u000eHÆ\u0001J\t\u0010\u0017\u001a\u00020\nHÖ\u0001R\"\u0010\u0010\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0011\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\"\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010\u0013\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\"\u0010\u0014\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b\u0014\u0010,\"\u0004\b-\u0010.R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00067"}, d2 = {"Lcom/huami/assistant/ui/v2/model/VocationDayModel;", "", "other", "", "equals", "", "hashCode", "", "component1", "component2", "", "component3", "component4", "component5", "Ljava/util/Date;", "component6", "id", "requestTimestampInMs", "code", "year", "isVocation", "date", "copy", "toString", "a", "J", "getId", "()J", WebConst.QueryParam.SET_ID, "(J)V", "b", "getRequestTimestampInMs", "setRequestTimestampInMs", "c", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", GoogleApiAvailabilityLight.a, "getYear", "setYear", "e", "Z", "()Z", "setVocation", "(Z)V", "f", "Ljava/util/Date;", "getDate", "()Ljava/util/Date;", "setDate", "(Ljava/util/Date;)V", "<init>", "(JJLjava/lang/String;Ljava/lang/String;ZLjava/util/Date;)V", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class VocationDayModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private long requestTimestampInMs;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private String code;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private String year;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private boolean isVocation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private Date date;

    public VocationDayModel(long j, long j2, @NotNull String str, @NotNull String str2, boolean z, @NotNull Date date) {
        this.id = j;
        this.requestTimestampInMs = j2;
        this.code = str;
        this.year = str2;
        this.isVocation = z;
        this.date = date;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getRequestTimestampInMs() {
        return this.requestTimestampInMs;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getYear() {
        return this.year;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsVocation() {
        return this.isVocation;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Date getDate() {
        return this.date;
    }

    @NotNull
    public final VocationDayModel copy(long id, long requestTimestampInMs, @NotNull String code, @NotNull String year, boolean isVocation, @NotNull Date date) {
        return new VocationDayModel(id, requestTimestampInMs, code, year, isVocation, date);
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof VocationDayModel)) {
            return false;
        }
        VocationDayModel vocationDayModel = (VocationDayModel) other;
        return vocationDayModel.requestTimestampInMs == this.requestTimestampInMs && Intrinsics.areEqual(vocationDayModel.code, this.code) && Intrinsics.areEqual(vocationDayModel.year, this.year) && vocationDayModel.isVocation == this.isVocation && this.date.getTime() == this.date.getTime();
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final Date getDate() {
        return this.date;
    }

    public final long getId() {
        return this.id;
    }

    public final long getRequestTimestampInMs() {
        return this.requestTimestampInMs;
    }

    @NotNull
    public final String getYear() {
        return this.year;
    }

    public int hashCode() {
        return (((((((((b.a(this.id) * 31) + b.a(this.requestTimestampInMs)) * 31) + this.code.hashCode()) * 31) + this.year.hashCode()) * 31) + yi.a(this.isVocation)) * 31) + this.date.hashCode();
    }

    public final boolean isVocation() {
        return this.isVocation;
    }

    public final void setCode(@NotNull String str) {
        this.code = str;
    }

    public final void setDate(@NotNull Date date) {
        this.date = date;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setRequestTimestampInMs(long j) {
        this.requestTimestampInMs = j;
    }

    public final void setVocation(boolean z) {
        this.isVocation = z;
    }

    public final void setYear(@NotNull String str) {
        this.year = str;
    }

    @NotNull
    public String toString() {
        return "VocationDayModel(id=" + this.id + ", requestTimestampInMs=" + this.requestTimestampInMs + ", code=" + this.code + ", year=" + this.year + ", isVocation=" + this.isVocation + ", date=" + this.date + ")";
    }

    public /* synthetic */ VocationDayModel(long j, long j2, String str, String str2, boolean z, Date date, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? "" : str, str2, (i & 16) != 0 ? false : z, date);
    }
}
