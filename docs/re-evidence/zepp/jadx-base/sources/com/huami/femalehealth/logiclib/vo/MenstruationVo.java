package com.huami.femalehealth.logiclib.vo;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.db.entity.EcgData;
import defpackage.b;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\b\u0018\u0000 ,2\u00020\u0001:\u0001,B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b*\u0010+J:\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tJ\u000b\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\tHÆ\u0003J=\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0007\u0010!R\u0019\u0010\b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010!R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "", "", "id", "Ljava/util/Date;", "date", "", "isEnd", "inPeriod", "", EcgData.TIMESTAMP_SERVER_UPDATED, "clone", "component1", "component2", "component3", "component4", "component5", "copy", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "Ljava/util/Date;", "getDate", "()Ljava/util/Date;", "c", "Z", "()Z", GoogleApiAvailabilityLight.a, "getInPeriod", "e", "J", "getUpdateTime", "()J", "setUpdateTime", "(J)V", "<init>", "(Ljava/lang/String;Ljava/util/Date;ZZJ)V", "Companion", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MenstruationVo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final MenstruationVo f = new MenstruationVo(null, new Date(), false, false, 0);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final Date date;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean isEnd;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final boolean inPeriod;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private long updateTime;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/huami/femalehealth/logiclib/vo/MenstruationVo$Companion;", "", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "EMPTY", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "getEMPTY", "()Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "<init>", "()V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MenstruationVo getEMPTY() {
            return MenstruationVo.f;
        }
    }

    public MenstruationVo(@Nullable String str, @NotNull Date date, boolean z, boolean z2, long j) {
        this.id = str;
        this.date = date;
        this.isEnd = z;
        this.inPeriod = z2;
        this.updateTime = j;
    }

    public static /* synthetic */ MenstruationVo clone$default(MenstruationVo menstruationVo, String str, Date date, boolean z, boolean z2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = menstruationVo.id;
        }
        if ((i & 2) != 0) {
            date = menstruationVo.date;
        }
        Date date2 = date;
        if ((i & 4) != 0) {
            z = menstruationVo.isEnd;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = menstruationVo.inPeriod;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            j = menstruationVo.updateTime;
        }
        return menstruationVo.clone(str, date2, z3, z4, j);
    }

    public static /* synthetic */ MenstruationVo copy$default(MenstruationVo menstruationVo, String str, Date date, boolean z, boolean z2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = menstruationVo.id;
        }
        if ((i & 2) != 0) {
            date = menstruationVo.date;
        }
        Date date2 = date;
        if ((i & 4) != 0) {
            z = menstruationVo.isEnd;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = menstruationVo.inPeriod;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            j = menstruationVo.updateTime;
        }
        return menstruationVo.copy(str, date2, z3, z4, j);
    }

    @NotNull
    public final MenstruationVo clone(@Nullable String id, @NotNull Date date, boolean isEnd, boolean inPeriod, long updateTime) {
        return new MenstruationVo(id, date, isEnd, inPeriod, updateTime);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsEnd() {
        return this.isEnd;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getInPeriod() {
        return this.inPeriod;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    @NotNull
    public final MenstruationVo copy(@Nullable String id, @NotNull Date date, boolean isEnd, boolean inPeriod, long updateTime) {
        return new MenstruationVo(id, date, isEnd, inPeriod, updateTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenstruationVo)) {
            return false;
        }
        MenstruationVo menstruationVo = (MenstruationVo) other;
        return Intrinsics.areEqual(this.id, menstruationVo.id) && Intrinsics.areEqual(this.date, menstruationVo.date) && this.isEnd == menstruationVo.isEnd && this.inPeriod == menstruationVo.inPeriod && this.updateTime == menstruationVo.updateTime;
    }

    @NotNull
    public final Date getDate() {
        return this.date;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    public final boolean getInPeriod() {
        return this.inPeriod;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        String str = this.id;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.date.hashCode()) * 31;
        boolean z = this.isEnd;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.inPeriod;
        return ((i + (z2 ? 1 : z2)) * 31) + b.a(this.updateTime);
    }

    public final boolean isEnd() {
        return this.isEnd;
    }

    public final void setUpdateTime(long j) {
        this.updateTime = j;
    }

    @NotNull
    public String toString() {
        return "MenstruationVo(id=" + ((Object) this.id) + ", date=" + this.date + ", isEnd=" + this.isEnd + ", inPeriod=" + this.inPeriod + ", updateTime=" + this.updateTime + ')';
    }

    public /* synthetic */ MenstruationVo(String str, Date date, boolean z, boolean z2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, date, z, z2, (i & 16) != 0 ? 0L : j);
    }
}
