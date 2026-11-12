package com.huami.training.db.po;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.sleepassistant.apilib.utils.WebConst;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Entity(indices = {@Index(unique = true, value = {"trainingId"})})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b7\u00108J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ`\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0007R\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u0007R\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010\u0007R\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010\u0007R$\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\r\"\u0004\b0\u00101R\"\u00106\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u0010!\u001a\u0004\b3\u0010#\"\u0004\b4\u00105¨\u00069"}, d2 = {"Lcom/huami/training/db/po/Participation;", "", "", "component1", "", "component2", "component3", "()Ljava/lang/Long;", "component4", "component5", "component6", "", "component7", "()Ljava/lang/Boolean;", "trainingId", "trainTimes", "joinedTime", "lastTrainingTime", EcgData.TIMESTAMP_SERVER_UPDATED, "expiry", "hasDownloaded", "copy", "(JILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/huami/training/db/po/Participation;", "", "toString", "hashCode", "other", "equals", "a", "J", "getTrainingId", "()J", "b", LogUtil.I, "getTrainTimes", "()I", "c", "Ljava/lang/Long;", "getJoinedTime", GoogleApiAvailabilityLight.a, "getLastTrainingTime", "e", "getUpdateTime", "f", "getExpiry", "g", "Ljava/lang/Boolean;", "getHasDownloaded", "setHasDownloaded", "(Ljava/lang/Boolean;)V", "h", "getId", WebConst.QueryParam.SET_ID, "(I)V", "id", "<init>", "(JILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Participation {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long trainingId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int trainTimes;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long joinedTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long lastTrainingTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long updateTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long expiry;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private Boolean hasDownloaded;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @PrimaryKey(autoGenerate = true)
    private int id;

    public Participation(long j, int i, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable Long l4, @Nullable Boolean bool) {
        this.trainingId = j;
        this.trainTimes = i;
        this.joinedTime = l;
        this.lastTrainingTime = l2;
        this.updateTime = l3;
        this.expiry = l4;
        this.hasDownloaded = bool;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTrainingId() {
        return this.trainingId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTrainTimes() {
        return this.trainTimes;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getJoinedTime() {
        return this.joinedTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getLastTrainingTime() {
        return this.lastTrainingTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getUpdateTime() {
        return this.updateTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getExpiry() {
        return this.expiry;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getHasDownloaded() {
        return this.hasDownloaded;
    }

    @NotNull
    public final Participation copy(long trainingId, int trainTimes, @Nullable Long joinedTime, @Nullable Long lastTrainingTime, @Nullable Long updateTime, @Nullable Long expiry, @Nullable Boolean hasDownloaded) {
        return new Participation(trainingId, trainTimes, joinedTime, lastTrainingTime, updateTime, expiry, hasDownloaded);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Participation)) {
            return false;
        }
        Participation participation = (Participation) other;
        return this.trainingId == participation.trainingId && this.trainTimes == participation.trainTimes && Intrinsics.areEqual(this.joinedTime, participation.joinedTime) && Intrinsics.areEqual(this.lastTrainingTime, participation.lastTrainingTime) && Intrinsics.areEqual(this.updateTime, participation.updateTime) && Intrinsics.areEqual(this.expiry, participation.expiry) && Intrinsics.areEqual(this.hasDownloaded, participation.hasDownloaded);
    }

    @Nullable
    public final Long getExpiry() {
        return this.expiry;
    }

    @Nullable
    public final Boolean getHasDownloaded() {
        return this.hasDownloaded;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Long getJoinedTime() {
        return this.joinedTime;
    }

    @Nullable
    public final Long getLastTrainingTime() {
        return this.lastTrainingTime;
    }

    public final int getTrainTimes() {
        return this.trainTimes;
    }

    public final long getTrainingId() {
        return this.trainingId;
    }

    @Nullable
    public final Long getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        int iA = ((b.a(this.trainingId) * 31) + this.trainTimes) * 31;
        Long l = this.joinedTime;
        int iHashCode = (iA + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.lastTrainingTime;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.updateTime;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.expiry;
        int iHashCode4 = (iHashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Boolean bool = this.hasDownloaded;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final void setHasDownloaded(@Nullable Boolean bool) {
        this.hasDownloaded = bool;
    }

    public final void setId(int i) {
        this.id = i;
    }

    @NotNull
    public String toString() {
        return "Participation(trainingId=" + this.trainingId + ", trainTimes=" + this.trainTimes + ", joinedTime=" + this.joinedTime + ", lastTrainingTime=" + this.lastTrainingTime + ", updateTime=" + this.updateTime + ", expiry=" + this.expiry + ", hasDownloaded=" + this.hasDownloaded + ')';
    }

    public /* synthetic */ Participation(long j, int i, Long l, Long l2, Long l3, Long l4, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, (i2 & 4) != 0 ? null : l, (i2 & 8) != 0 ? null : l2, (i2 & 16) != 0 ? null : l3, (i2 & 32) != 0 ? null : l4, (i2 & 64) != 0 ? null : bool);
    }
}
