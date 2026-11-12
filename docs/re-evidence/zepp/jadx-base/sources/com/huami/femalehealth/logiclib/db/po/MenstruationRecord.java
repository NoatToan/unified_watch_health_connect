package com.huami.femalehealth.logiclib.db.po;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.femalehealth.logiclib.db.DateConverter;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@TypeConverters({DateConverter.class})
@Entity(tableName = "MenstruationRecord")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\t\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b2\u00103J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\n\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010#R$\u0010+\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010.\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/huami/femalehealth/logiclib/db/po/MenstruationRecord;", "", "", "isUnspecified", "isSyncronizedToServer", "", "toString", "Ljava/util/Date;", "component1", "component2", "date", "inPeriod", "copy", "", "hashCode", "other", "equals", "a", "Ljava/util/Date;", "getDate", "()Ljava/util/Date;", "b", "Z", "getInPeriod", "()Z", "c", "Ljava/lang/String;", "getSId", "()Ljava/lang/String;", "setSId", "(Ljava/lang/String;)V", "sId", GoogleApiAvailabilityLight.a, "isSyncServer", "setSyncServer", "(Z)V", "", "e", "Ljava/lang/Long;", "getUpdateTime", "()Ljava/lang/Long;", "setUpdateTime", "(Ljava/lang/Long;)V", EcgData.TIMESTAMP_SERVER_UPDATED, "f", "Ljava/lang/Boolean;", "isEnd", "()Ljava/lang/Boolean;", "setEnd", "(Ljava/lang/Boolean;)V", "<init>", "(Ljava/util/Date;Z)V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MenstruationRecord {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @PrimaryKey
    @NotNull
    private final Date date;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean inPeriod;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private String sId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isSyncServer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Long updateTime = 0L;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Boolean isEnd = Boolean.TRUE;

    public MenstruationRecord(@NotNull Date date, boolean z) {
        this.date = date;
        this.inPeriod = z;
    }

    public static /* synthetic */ MenstruationRecord copy$default(MenstruationRecord menstruationRecord, Date date, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            date = menstruationRecord.date;
        }
        if ((i & 2) != 0) {
            z = menstruationRecord.inPeriod;
        }
        return menstruationRecord.copy(date, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Date getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getInPeriod() {
        return this.inPeriod;
    }

    @NotNull
    public final MenstruationRecord copy(@NotNull Date date, boolean inPeriod) {
        return new MenstruationRecord(date, inPeriod);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenstruationRecord)) {
            return false;
        }
        MenstruationRecord menstruationRecord = (MenstruationRecord) other;
        return Intrinsics.areEqual(this.date, menstruationRecord.date) && this.inPeriod == menstruationRecord.inPeriod;
    }

    @NotNull
    public final Date getDate() {
        return this.date;
    }

    public final boolean getInPeriod() {
        return this.inPeriod;
    }

    @Nullable
    public final String getSId() {
        return this.sId;
    }

    @Nullable
    public final Long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.date.hashCode() * 31;
        boolean z = this.inPeriod;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @Nullable
    /* JADX INFO: renamed from: isEnd, reason: from getter */
    public final Boolean getIsEnd() {
        return this.isEnd;
    }

    /* JADX INFO: renamed from: isSyncServer, reason: from getter */
    public final boolean getIsSyncServer() {
        return this.isSyncServer;
    }

    public final boolean isSyncronizedToServer() {
        return this.sId != null && this.isSyncServer;
    }

    public final boolean isUnspecified() {
        Long l = this.updateTime;
        return l == null || l.longValue() == 0;
    }

    public final void setEnd(@Nullable Boolean bool) {
        this.isEnd = bool;
    }

    public final void setSId(@Nullable String str) {
        this.sId = str;
    }

    public final void setSyncServer(boolean z) {
        this.isSyncServer = z;
    }

    public final void setUpdateTime(@Nullable Long l) {
        this.updateTime = l;
    }

    @NotNull
    public String toString() {
        String strConvertUTCDate$default;
        if (isUnspecified()) {
            strConvertUTCDate$default = "never";
        } else {
            DateHelper dateHelper = DateHelper.INSTANCE;
            Long l = this.updateTime;
            strConvertUTCDate$default = DateHelper.convertUTCDate$default(dateHelper, l == null ? 0L : l.longValue(), false, 2, null);
        }
        return JsonLexerKt.BEGIN_LIST + DateHelper.convertUTCDate$default(DateHelper.INSTANCE, this.date.getTime(), false, 2, null) + ',' + this.inPeriod + ",ut:" + strConvertUTCDate$default + ",id:" + ((Object) this.sId) + ",sync:" + this.isSyncServer + ",end:" + this.isEnd + JsonLexerKt.END_LIST;
    }
}
