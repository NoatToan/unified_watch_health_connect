package com.huami.training.db.po;

import androidx.room.DatabaseView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.training.dto.GenderPair;
import com.huami.training.dto.TrainingType;
import com.loc.z;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@DatabaseView("\n    SELECT Training.id, name, type, trainTimes, contentCount, joinedTime, lastTrainingTime, updateTime, expiry, hasDownloaded, squareImage\n    FROM Training INNER JOIN Participation\n    ON Training.id = Participation.trainingId\n    ORDER BY updateTime DESC\n")
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b8\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0014¢\u0006\u0004\bJ\u0010KJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0014HÆ\u0003J\u0094\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0019\u001a\u00020\b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b!\u0010\"J\t\u0010#\u001a\u00020\u0006HÖ\u0001J\t\u0010$\u001a\u00020\bHÖ\u0001J\u0013\u0010&\u001a\u00020\u00112\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0016\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0017\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0019\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001b\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010\u000bR\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010\rR\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b=\u0010;\u001a\u0004\b>\u0010\rR\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b?\u0010;\u001a\u0004\b@\u0010\rR\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bA\u0010;\u001a\u0004\bB\u0010\rR\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u00118\u0006@\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010\u0013R!\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00148\u0006@\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I¨\u0006L"}, d2 = {"Lcom/huami/training/db/po/JoinedTraining;", "", "", "component1", "Lcom/huami/training/dto/TrainingType;", "component2", "", "component3", "", "component4", "component5", "()Ljava/lang/Integer;", "component6", "()Ljava/lang/Long;", "component7", "component8", "component9", "", "component10", "()Ljava/lang/Boolean;", "Lcom/huami/training/dto/GenderPair;", "component11", "id", "type", "name", "trainTimes", "contentCount", "joinedTime", "lastTrainingTime", EcgData.TIMESTAMP_SERVER_UPDATED, "expiry", "hasDownloaded", "squareImage", "copy", "(JLcom/huami/training/dto/TrainingType;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Lcom/huami/training/dto/GenderPair;)Lcom/huami/training/db/po/JoinedTraining;", "toString", "hashCode", "other", "equals", "a", "J", "getId", "()J", "b", "Lcom/huami/training/dto/TrainingType;", "getType", "()Lcom/huami/training/dto/TrainingType;", "c", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", GoogleApiAvailabilityLight.a, LogUtil.I, "getTrainTimes", "()I", "e", "Ljava/lang/Integer;", "getContentCount", "f", "Ljava/lang/Long;", "getJoinedTime", "g", "getLastTrainingTime", "h", "getUpdateTime", "i", "getExpiry", z.j, "Ljava/lang/Boolean;", "getHasDownloaded", hl.k, "Lcom/huami/training/dto/GenderPair;", "getSquareImage", "()Lcom/huami/training/dto/GenderPair;", "<init>", "(JLcom/huami/training/dto/TrainingType;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Lcom/huami/training/dto/GenderPair;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class JoinedTraining {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final TrainingType type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int trainTimes;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer contentCount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long joinedTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long lastTrainingTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long updateTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long expiry;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    private final Boolean hasDownloaded;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @Nullable
    private final GenderPair<String> squareImage;

    public JoinedTraining(long j, @NotNull TrainingType trainingType, @Nullable String str, int i, @Nullable Integer num, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable Long l4, @Nullable Boolean bool, @Nullable GenderPair<String> genderPair) {
        this.id = j;
        this.type = trainingType;
        this.name = str;
        this.trainTimes = i;
        this.contentCount = num;
        this.joinedTime = l;
        this.lastTrainingTime = l2;
        this.updateTime = l3;
        this.expiry = l4;
        this.hasDownloaded = bool;
        this.squareImage = genderPair;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getHasDownloaded() {
        return this.hasDownloaded;
    }

    @Nullable
    public final GenderPair<String> component11() {
        return this.squareImage;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TrainingType getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTrainTimes() {
        return this.trainTimes;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getContentCount() {
        return this.contentCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getJoinedTime() {
        return this.joinedTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getLastTrainingTime() {
        return this.lastTrainingTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getUpdateTime() {
        return this.updateTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getExpiry() {
        return this.expiry;
    }

    @NotNull
    public final JoinedTraining copy(long id, @NotNull TrainingType type, @Nullable String name, int trainTimes, @Nullable Integer contentCount, @Nullable Long joinedTime, @Nullable Long lastTrainingTime, @Nullable Long updateTime, @Nullable Long expiry, @Nullable Boolean hasDownloaded, @Nullable GenderPair<String> squareImage) {
        return new JoinedTraining(id, type, name, trainTimes, contentCount, joinedTime, lastTrainingTime, updateTime, expiry, hasDownloaded, squareImage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JoinedTraining)) {
            return false;
        }
        JoinedTraining joinedTraining = (JoinedTraining) other;
        return this.id == joinedTraining.id && this.type == joinedTraining.type && Intrinsics.areEqual(this.name, joinedTraining.name) && this.trainTimes == joinedTraining.trainTimes && Intrinsics.areEqual(this.contentCount, joinedTraining.contentCount) && Intrinsics.areEqual(this.joinedTime, joinedTraining.joinedTime) && Intrinsics.areEqual(this.lastTrainingTime, joinedTraining.lastTrainingTime) && Intrinsics.areEqual(this.updateTime, joinedTraining.updateTime) && Intrinsics.areEqual(this.expiry, joinedTraining.expiry) && Intrinsics.areEqual(this.hasDownloaded, joinedTraining.hasDownloaded) && Intrinsics.areEqual(this.squareImage, joinedTraining.squareImage);
    }

    @Nullable
    public final Integer getContentCount() {
        return this.contentCount;
    }

    @Nullable
    public final Long getExpiry() {
        return this.expiry;
    }

    @Nullable
    public final Boolean getHasDownloaded() {
        return this.hasDownloaded;
    }

    public final long getId() {
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

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final GenderPair<String> getSquareImage() {
        return this.squareImage;
    }

    public final int getTrainTimes() {
        return this.trainTimes;
    }

    @NotNull
    public final TrainingType getType() {
        return this.type;
    }

    @Nullable
    public final Long getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        int iA = ((b.a(this.id) * 31) + this.type.hashCode()) * 31;
        String str = this.name;
        int iHashCode = (((iA + (str == null ? 0 : str.hashCode())) * 31) + this.trainTimes) * 31;
        Integer num = this.contentCount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.joinedTime;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.lastTrainingTime;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.updateTime;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.expiry;
        int iHashCode6 = (iHashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Boolean bool = this.hasDownloaded;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        GenderPair<String> genderPair = this.squareImage;
        return iHashCode7 + (genderPair != null ? genderPair.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "JoinedTraining(id=" + this.id + ", type=" + this.type + ", name=" + ((Object) this.name) + ", trainTimes=" + this.trainTimes + ", contentCount=" + this.contentCount + ", joinedTime=" + this.joinedTime + ", lastTrainingTime=" + this.lastTrainingTime + ", updateTime=" + this.updateTime + ", expiry=" + this.expiry + ", hasDownloaded=" + this.hasDownloaded + ", squareImage=" + this.squareImage + ')';
    }

    public /* synthetic */ JoinedTraining(long j, TrainingType trainingType, String str, int i, Integer num, Long l, Long l2, Long l3, Long l4, Boolean bool, GenderPair genderPair, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, trainingType, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : l, (i2 & 64) != 0 ? null : l2, (i2 & 128) != 0 ? null : l3, (i2 & 256) != 0 ? null : l4, (i2 & 512) != 0 ? null : bool, (i2 & 1024) != 0 ? null : genderPair);
    }
}
