package com.huami.femalehealth.logiclib.dto;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.femalehealth.logiclib.helper.ext.NumberExtKt;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b!\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b5\u00106J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\b\u0010\b\u001a\u00020\u0002H\u0016J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0000J\u0006\u0010\u000b\u001a\u00020\u0002J\t\u0010\r\u001a\u00020\fHÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0011\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0012\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010%R$\u0010,\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b\u0007\u0010/\"\u0004\b0\u00101R$\u00103\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010.\u001a\u0004\b3\u0010/\"\u0004\b4\u00101¨\u00067"}, d2 = {"Lcom/huami/femalehealth/logiclib/dto/MenstruationDto;", "", "", "a", "", "isUnspecified", "isUnSyncServer", "isEnd", "toString", "dto", "compare", "msg", "", "component1", "component2", "component3", "()Ljava/lang/Long;", "time", "inPeriod", EcgData.TIMESTAMP_SERVER_UPDATED, "copy", "(JZLjava/lang/Long;)Lcom/huami/femalehealth/logiclib/dto/MenstruationDto;", "", "hashCode", "other", "equals", "J", "getTime", "()J", "b", "Z", "getInPeriod", "()Z", "c", "Ljava/lang/Long;", "getUpdateTime", "setUpdateTime", "(Ljava/lang/Long;)V", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getSId", "()Ljava/lang/String;", "setSId", "(Ljava/lang/String;)V", "sId", "e", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setEnd", "(Ljava/lang/Boolean;)V", "f", "isSyncServer", "setSyncServer", "<init>", "(JZLjava/lang/Long;)V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MenstruationDto {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long time;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean inPeriod;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Long updateTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private String sId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Boolean isEnd;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Boolean isSyncServer;

    public MenstruationDto(long j, boolean z, @Nullable Long l) {
        this.time = j;
        this.inPeriod = z;
        this.updateTime = l;
    }

    private final String a() {
        String strDateFormat;
        StringBuilder sb = new StringBuilder();
        sb.append(JsonLexerKt.BEGIN_LIST);
        sb.append(NumberExtKt.dateFormat(this.time));
        sb.append('(');
        sb.append(this.time);
        sb.append("),");
        sb.append(this.inPeriod ? "IN" : "NOT");
        sb.append(',');
        Long l = this.updateTime;
        String str = "0";
        if (l != null && (strDateFormat = NumberExtKt.dateFormat(l.longValue())) != null) {
            str = strDateFormat;
        }
        sb.append(str);
        sb.append(',');
        sb.append(this.isEnd);
        sb.append(",id:");
        sb.append((Object) this.sId);
        sb.append("]\n");
        return sb.toString();
    }

    public static /* synthetic */ MenstruationDto copy$default(MenstruationDto menstruationDto, long j, boolean z, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            j = menstruationDto.time;
        }
        if ((i & 2) != 0) {
            z = menstruationDto.inPeriod;
        }
        if ((i & 4) != 0) {
            l = menstruationDto.updateTime;
        }
        return menstruationDto.copy(j, z, l);
    }

    public final boolean compare(@NotNull MenstruationDto dto) {
        return dto.inPeriod == this.inPeriod && dto.time == this.time;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getInPeriod() {
        return this.inPeriod;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getUpdateTime() {
        return this.updateTime;
    }

    @NotNull
    public final MenstruationDto copy(long time, boolean inPeriod, @Nullable Long updateTime) {
        return new MenstruationDto(time, inPeriod, updateTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenstruationDto)) {
            return false;
        }
        MenstruationDto menstruationDto = (MenstruationDto) other;
        return this.time == menstruationDto.time && this.inPeriod == menstruationDto.inPeriod && Intrinsics.areEqual(this.updateTime, menstruationDto.updateTime);
    }

    public final boolean getInPeriod() {
        return this.inPeriod;
    }

    @Nullable
    public final String getSId() {
        return this.sId;
    }

    public final long getTime() {
        return this.time;
    }

    @Nullable
    public final Long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iA = b.a(this.time) * 31;
        boolean z = this.inPeriod;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iA + r1) * 31;
        Long l = this.updateTime;
        return i + (l == null ? 0 : l.hashCode());
    }

    @Nullable
    /* JADX INFO: renamed from: isEnd, reason: from getter */
    public final Boolean getIsEnd() {
        return this.isEnd;
    }

    @Nullable
    /* JADX INFO: renamed from: isSyncServer, reason: from getter */
    public final Boolean getIsSyncServer() {
        return this.isSyncServer;
    }

    public final boolean isUnSyncServer() {
        Boolean bool = this.isSyncServer;
        return bool == null || !bool.booleanValue();
    }

    public final boolean isUnspecified() {
        Long l = this.updateTime;
        return l == null || (l != null && l.longValue() == 0);
    }

    @NotNull
    public final String msg() {
        StringBuilder sb = new StringBuilder();
        sb.append(JsonLexerKt.BEGIN_LIST);
        sb.append(NumberExtKt.dateFormat(this.time));
        sb.append(',');
        sb.append(this.inPeriod);
        sb.append(',');
        Long l = this.updateTime;
        sb.append(NumberExtKt.dateFormat(l == null ? 0L : l.longValue()));
        sb.append(",id:");
        sb.append((Object) this.sId);
        sb.append(",isSync:");
        sb.append(this.isSyncServer);
        sb.append(",isEnd:");
        sb.append(this.isEnd);
        sb.append("]\n");
        return sb.toString();
    }

    public final void setEnd(@Nullable Boolean bool) {
        this.isEnd = bool;
    }

    public final void setSId(@Nullable String str) {
        this.sId = str;
    }

    public final void setSyncServer(@Nullable Boolean bool) {
        this.isSyncServer = bool;
    }

    public final void setUpdateTime(@Nullable Long l) {
        this.updateTime = l;
    }

    @NotNull
    public String toString() {
        return a();
    }

    /* JADX INFO: renamed from: isEnd, reason: collision with other method in class */
    public final boolean m3360isEnd() {
        Boolean bool = this.isEnd;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public /* synthetic */ MenstruationDto(long j, boolean z, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, z, (i & 4) != 0 ? 0L : l);
    }
}
