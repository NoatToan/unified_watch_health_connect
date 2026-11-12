package com.huami.femalehealth.logiclib.dto;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.femalehealth.logiclib.helper.ext.NumberExtKt;
import defpackage.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b \b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0017\u001a\u00020\b\u0012\u0006\u0010\u0018\u001a\u00020\r\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b<\u0010=J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\t\u0010\f\u001a\u00020\bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003Jj\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\r2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u001c\u001a\u00020\rHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0012\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#\"\u0004\b&\u0010'R\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#\"\u0004\b*\u0010'R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\nR\u001b\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010\nR\u0019\u0010\u0017\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0018\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lcom/huami/femalehealth/logiclib/dto/MenstruationTotalDto;", "", "", "toString", "", "component1", "component2", "component3", "", "component4", "()Ljava/lang/Long;", "component5", "component6", "", "component7", "", "Lcom/huami/femalehealth/logiclib/dto/MenstruationDto;", "component8", "version", "cyclePeriodDays", "menstruationPeriodDays", "lastPeriodBeginDay", "lastPeriodEndDay", "recordBeginDay", "recordCount", "records", "copy", "(BBBLjava/lang/Long;Ljava/lang/Long;JILjava/util/List;)Lcom/huami/femalehealth/logiclib/dto/MenstruationTotalDto;", "hashCode", "other", "", "equals", "a", "B", "getVersion", "()B", "b", "getCyclePeriodDays", "setCyclePeriodDays", "(B)V", "c", "getMenstruationPeriodDays", "setMenstruationPeriodDays", GoogleApiAvailabilityLight.a, "Ljava/lang/Long;", "getLastPeriodBeginDay", "e", "getLastPeriodEndDay", "f", "J", "getRecordBeginDay", "()J", "g", LogUtil.I, "getRecordCount", "()I", "h", "Ljava/util/List;", "getRecords", "()Ljava/util/List;", "<init>", "(BBBLjava/lang/Long;Ljava/lang/Long;JILjava/util/List;)V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MenstruationTotalDto {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final byte version;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private byte cyclePeriodDays;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private byte menstruationPeriodDays;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final Long lastPeriodBeginDay;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private final Long lastPeriodEndDay;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final long recordBeginDay;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int recordCount;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final List<MenstruationDto> records;

    public MenstruationTotalDto(byte b, byte b2, byte b3, @Nullable Long l, @Nullable Long l2, long j, int i, @NotNull List<MenstruationDto> list) {
        this.version = b;
        this.cyclePeriodDays = b2;
        this.menstruationPeriodDays = b3;
        this.lastPeriodBeginDay = l;
        this.lastPeriodEndDay = l2;
        this.recordBeginDay = j;
        this.recordCount = i;
        this.records = list;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final byte getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final byte getCyclePeriodDays() {
        return this.cyclePeriodDays;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final byte getMenstruationPeriodDays() {
        return this.menstruationPeriodDays;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getLastPeriodBeginDay() {
        return this.lastPeriodBeginDay;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getLastPeriodEndDay() {
        return this.lastPeriodEndDay;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getRecordBeginDay() {
        return this.recordBeginDay;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getRecordCount() {
        return this.recordCount;
    }

    @NotNull
    public final List<MenstruationDto> component8() {
        return this.records;
    }

    @NotNull
    public final MenstruationTotalDto copy(byte version, byte cyclePeriodDays, byte menstruationPeriodDays, @Nullable Long lastPeriodBeginDay, @Nullable Long lastPeriodEndDay, long recordBeginDay, int recordCount, @NotNull List<MenstruationDto> records) {
        return new MenstruationTotalDto(version, cyclePeriodDays, menstruationPeriodDays, lastPeriodBeginDay, lastPeriodEndDay, recordBeginDay, recordCount, records);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenstruationTotalDto)) {
            return false;
        }
        MenstruationTotalDto menstruationTotalDto = (MenstruationTotalDto) other;
        return this.version == menstruationTotalDto.version && this.cyclePeriodDays == menstruationTotalDto.cyclePeriodDays && this.menstruationPeriodDays == menstruationTotalDto.menstruationPeriodDays && Intrinsics.areEqual(this.lastPeriodBeginDay, menstruationTotalDto.lastPeriodBeginDay) && Intrinsics.areEqual(this.lastPeriodEndDay, menstruationTotalDto.lastPeriodEndDay) && this.recordBeginDay == menstruationTotalDto.recordBeginDay && this.recordCount == menstruationTotalDto.recordCount && Intrinsics.areEqual(this.records, menstruationTotalDto.records);
    }

    public final byte getCyclePeriodDays() {
        return this.cyclePeriodDays;
    }

    @Nullable
    public final Long getLastPeriodBeginDay() {
        return this.lastPeriodBeginDay;
    }

    @Nullable
    public final Long getLastPeriodEndDay() {
        return this.lastPeriodEndDay;
    }

    public final byte getMenstruationPeriodDays() {
        return this.menstruationPeriodDays;
    }

    public final long getRecordBeginDay() {
        return this.recordBeginDay;
    }

    public final int getRecordCount() {
        return this.recordCount;
    }

    @NotNull
    public final List<MenstruationDto> getRecords() {
        return this.records;
    }

    public final byte getVersion() {
        return this.version;
    }

    public int hashCode() {
        int i = ((((this.version * 31) + this.cyclePeriodDays) * 31) + this.menstruationPeriodDays) * 31;
        Long l = this.lastPeriodBeginDay;
        int iHashCode = (i + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.lastPeriodEndDay;
        return ((((((iHashCode + (l2 != null ? l2.hashCode() : 0)) * 31) + b.a(this.recordBeginDay)) * 31) + this.recordCount) * 31) + this.records.hashCode();
    }

    public final void setCyclePeriodDays(byte b) {
        this.cyclePeriodDays = b;
    }

    public final void setMenstruationPeriodDays(byte b) {
        this.menstruationPeriodDays = b;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("period=");
        sb.append((int) this.menstruationPeriodDays);
        sb.append(", cycle=");
        sb.append((int) this.cyclePeriodDays);
        sb.append(", lastPeriodBeginDay=");
        Long l = this.lastPeriodBeginDay;
        sb.append((Object) (l == null ? null : NumberExtKt.dateFormat(l.longValue())));
        sb.append(", lastPeriodEndDay=");
        Long l2 = this.lastPeriodEndDay;
        sb.append((Object) (l2 != null ? NumberExtKt.dateFormat(l2.longValue()) : null));
        sb.append(", recordBeginDay=");
        sb.append(NumberExtKt.dateFormat(this.recordBeginDay));
        sb.append(", records=");
        sb.append(this.records);
        return sb.toString();
    }
}
