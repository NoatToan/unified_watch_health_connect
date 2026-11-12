package com.xiaomi.hm.health.bt.profile.menstruation;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.b;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\b\u0018\u0000 92\u00020\u0001:\u00019BM\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\f\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b7\u00108J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\bHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J_\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\f2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0001J\t\u0010\u001a\u001a\u00020\fHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003R\u0019\u0010\u0011\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0012\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0019\u0010\u0013\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\u0019\u0010\u0014\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0015\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0019\u0010\u0016\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*R\u0019\u0010\u0017\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u0006:"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationTotalRecord;", "Ljava/io/Serializable;", "", "toString", "", "component1", "component2", "component3", "", "component4", "component5", "component6", "", "component7", "", "Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationRecord;", "component8", "version", "cyclePeriodDays", "menstruationPeriodDays", "lastPeriodBeginDay", "lastPeriodEndDay", "recordBeginDay", "recordCount", "records", "copy", "hashCode", "", "other", "", "equals", "a", "B", "getVersion", "()B", "b", "getCyclePeriodDays", "c", "getMenstruationPeriodDays", GoogleApiAvailabilityLight.a, "J", "getLastPeriodBeginDay", "()J", "e", "getLastPeriodEndDay", "f", "getRecordBeginDay", "g", LogUtil.I, "getRecordCount", "()I", "h", "Ljava/util/List;", "getRecords", "()Ljava/util/List;", "<init>", "(BBBJJJILjava/util/List;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MenstruationTotalRecord implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final byte version;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final byte cyclePeriodDays;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final byte menstruationPeriodDays;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long lastPeriodBeginDay;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final long lastPeriodEndDay;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final long recordBeginDay;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int recordCount;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final List<MenstruationRecord> records;

    public MenstruationTotalRecord(byte b, byte b2, byte b3, long j, long j2, long j3, int i, @NotNull List<MenstruationRecord> list) {
        this.version = b;
        this.cyclePeriodDays = b2;
        this.menstruationPeriodDays = b3;
        this.lastPeriodBeginDay = j;
        this.lastPeriodEndDay = j2;
        this.recordBeginDay = j3;
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

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getLastPeriodBeginDay() {
        return this.lastPeriodBeginDay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getLastPeriodEndDay() {
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
    public final List<MenstruationRecord> component8() {
        return this.records;
    }

    @NotNull
    public final MenstruationTotalRecord copy(byte version, byte cyclePeriodDays, byte menstruationPeriodDays, long lastPeriodBeginDay, long lastPeriodEndDay, long recordBeginDay, int recordCount, @NotNull List<MenstruationRecord> records) {
        return new MenstruationTotalRecord(version, cyclePeriodDays, menstruationPeriodDays, lastPeriodBeginDay, lastPeriodEndDay, recordBeginDay, recordCount, records);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenstruationTotalRecord)) {
            return false;
        }
        MenstruationTotalRecord menstruationTotalRecord = (MenstruationTotalRecord) other;
        return this.version == menstruationTotalRecord.version && this.cyclePeriodDays == menstruationTotalRecord.cyclePeriodDays && this.menstruationPeriodDays == menstruationTotalRecord.menstruationPeriodDays && this.lastPeriodBeginDay == menstruationTotalRecord.lastPeriodBeginDay && this.lastPeriodEndDay == menstruationTotalRecord.lastPeriodEndDay && this.recordBeginDay == menstruationTotalRecord.recordBeginDay && this.recordCount == menstruationTotalRecord.recordCount && Intrinsics.areEqual(this.records, menstruationTotalRecord.records);
    }

    public final byte getCyclePeriodDays() {
        return this.cyclePeriodDays;
    }

    public final long getLastPeriodBeginDay() {
        return this.lastPeriodBeginDay;
    }

    public final long getLastPeriodEndDay() {
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
    public final List<MenstruationRecord> getRecords() {
        return this.records;
    }

    public final byte getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((((((((this.version * 31) + this.cyclePeriodDays) * 31) + this.menstruationPeriodDays) * 31) + b.a(this.lastPeriodBeginDay)) * 31) + b.a(this.lastPeriodEndDay)) * 31) + b.a(this.recordBeginDay)) * 31) + this.recordCount) * 31) + this.records.hashCode();
    }

    @NotNull
    public String toString() {
        return "version: " + ((int) this.version) + ", cyclePeriodDays: " + ((int) this.cyclePeriodDays) + "\n, menstruationPeriodDays: " + ((int) this.menstruationPeriodDays) + "\n, lastPeriodBeginDay: " + this.lastPeriodBeginDay + "\n, lastPeriodEndDay: " + this.lastPeriodEndDay + "\n, recordBeginDay: " + this.recordBeginDay + "\n, recordCount: " + this.recordCount + "\n, records: " + CollectionsKt___CollectionsKt.joinToString$default(this.records, null, null, null, 0, null, null, 63, null);
    }
}
