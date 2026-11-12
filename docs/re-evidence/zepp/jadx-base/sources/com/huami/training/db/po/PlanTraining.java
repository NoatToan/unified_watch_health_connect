package com.huami.training.db.po;

import androidx.room.Entity;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodpressure_core.p002const.BloodPressureConst;
import com.loc.z;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Entity(primaryKeys = {BloodPressureConst.ParamKey.PLANID, "trainingId", "dayIndex"})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b@\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u001b\u001a\u00020\r\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\bK\u0010LJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u000f\u001a\u00020\u0007HÆ\u0003J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J¢\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\"\u0010#J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\t\u0010%\u001a\u00020\u0007HÖ\u0001J\u0013\u0010'\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0015\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0016\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0018\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010\nR\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010\fR\u0019\u0010\u001b\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b\u001b\u0010>R\u0019\u0010\u001c\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b?\u00103\u001a\u0004\b@\u00105R\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bA\u00107\u001a\u0004\bB\u0010\nR\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\bC\u0010/\u001a\u0004\bD\u00101R\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\bE\u0010/\u001a\u0004\bF\u00101R\u001b\u0010 \u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\bG\u0010/\u001a\u0004\bH\u00101R\u001b\u0010!\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\bI\u0010/\u001a\u0004\bJ\u00101¨\u0006M"}, d2 = {"Lcom/huami/training/db/po/PlanTraining;", "", "", "component1", "component2", "", "component3", "", "component4", "component5", "()Ljava/lang/Long;", "component6", "()Ljava/lang/Integer;", "", "component7", "component8", "component9", "component10", "component11", "component12", "component13", BloodPressureConst.ParamKey.PLANID, "trainingId", "name", "dayOfWeek", "duration", "consumption", "isFinished", "dayIndex", "articleId", "articleTitle", "articleDescription", "articleLink", "articleImageUrl", "copy", "(JJLjava/lang/String;ILjava/lang/Long;Ljava/lang/Integer;ZILjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huami/training/db/po/PlanTraining;", "toString", "hashCode", "other", "equals", "a", "J", "getPlanId", "()J", "b", "getTrainingId", "c", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", GoogleApiAvailabilityLight.a, LogUtil.I, "getDayOfWeek", "()I", "e", "Ljava/lang/Long;", "getDuration", "f", "Ljava/lang/Integer;", "getConsumption", "g", "Z", "()Z", "h", "getDayIndex", "i", "getArticleId", z.j, "getArticleTitle", hl.k, "getArticleDescription", "l", "getArticleLink", "m", "getArticleImageUrl", "<init>", "(JJLjava/lang/String;ILjava/lang/Long;Ljava/lang/Integer;ZILjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PlanTraining {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long planId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long trainingId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int dayOfWeek;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long duration;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer consumption;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final boolean isFinished;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final int dayIndex;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long articleId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    private final String articleTitle;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @Nullable
    private final String articleDescription;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @Nullable
    private final String articleLink;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @Nullable
    private final String articleImageUrl;

    public PlanTraining(long j, long j2, @Nullable String str, int i, @Nullable Long l, @Nullable Integer num, boolean z, int i2, @Nullable Long l2, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.planId = j;
        this.trainingId = j2;
        this.name = str;
        this.dayOfWeek = i;
        this.duration = l;
        this.consumption = num;
        this.isFinished = z;
        this.dayIndex = i2;
        this.articleId = l2;
        this.articleTitle = str2;
        this.articleDescription = str3;
        this.articleLink = str4;
        this.articleImageUrl = str5;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getPlanId() {
        return this.planId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getArticleTitle() {
        return this.articleTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getArticleDescription() {
        return this.articleDescription;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getArticleLink() {
        return this.articleLink;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getArticleImageUrl() {
        return this.articleImageUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTrainingId() {
        return this.trainingId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDayOfWeek() {
        return this.dayOfWeek;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getDuration() {
        return this.duration;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getConsumption() {
        return this.consumption;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsFinished() {
        return this.isFinished;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getDayIndex() {
        return this.dayIndex;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getArticleId() {
        return this.articleId;
    }

    @NotNull
    public final PlanTraining copy(long planId, long trainingId, @Nullable String name, int dayOfWeek, @Nullable Long duration, @Nullable Integer consumption, boolean isFinished, int dayIndex, @Nullable Long articleId, @Nullable String articleTitle, @Nullable String articleDescription, @Nullable String articleLink, @Nullable String articleImageUrl) {
        return new PlanTraining(planId, trainingId, name, dayOfWeek, duration, consumption, isFinished, dayIndex, articleId, articleTitle, articleDescription, articleLink, articleImageUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlanTraining)) {
            return false;
        }
        PlanTraining planTraining = (PlanTraining) other;
        return this.planId == planTraining.planId && this.trainingId == planTraining.trainingId && Intrinsics.areEqual(this.name, planTraining.name) && this.dayOfWeek == planTraining.dayOfWeek && Intrinsics.areEqual(this.duration, planTraining.duration) && Intrinsics.areEqual(this.consumption, planTraining.consumption) && this.isFinished == planTraining.isFinished && this.dayIndex == planTraining.dayIndex && Intrinsics.areEqual(this.articleId, planTraining.articleId) && Intrinsics.areEqual(this.articleTitle, planTraining.articleTitle) && Intrinsics.areEqual(this.articleDescription, planTraining.articleDescription) && Intrinsics.areEqual(this.articleLink, planTraining.articleLink) && Intrinsics.areEqual(this.articleImageUrl, planTraining.articleImageUrl);
    }

    @Nullable
    public final String getArticleDescription() {
        return this.articleDescription;
    }

    @Nullable
    public final Long getArticleId() {
        return this.articleId;
    }

    @Nullable
    public final String getArticleImageUrl() {
        return this.articleImageUrl;
    }

    @Nullable
    public final String getArticleLink() {
        return this.articleLink;
    }

    @Nullable
    public final String getArticleTitle() {
        return this.articleTitle;
    }

    @Nullable
    public final Integer getConsumption() {
        return this.consumption;
    }

    public final int getDayIndex() {
        return this.dayIndex;
    }

    public final int getDayOfWeek() {
        return this.dayOfWeek;
    }

    @Nullable
    public final Long getDuration() {
        return this.duration;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final long getPlanId() {
        return this.planId;
    }

    public final long getTrainingId() {
        return this.trainingId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v36 */
    public int hashCode() {
        int iA = ((b.a(this.planId) * 31) + b.a(this.trainingId)) * 31;
        String str = this.name;
        int iHashCode = (((iA + (str == null ? 0 : str.hashCode())) * 31) + this.dayOfWeek) * 31;
        Long l = this.duration;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.consumption;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z = this.isFinished;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (((iHashCode3 + r1) * 31) + this.dayIndex) * 31;
        Long l2 = this.articleId;
        int iHashCode4 = (i + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.articleTitle;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.articleDescription;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.articleLink;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.articleImageUrl;
        return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final boolean isFinished() {
        return this.isFinished;
    }

    @NotNull
    public String toString() {
        return "PlanTraining(planId=" + this.planId + ", trainingId=" + this.trainingId + ", name=" + ((Object) this.name) + ", dayOfWeek=" + this.dayOfWeek + ", duration=" + this.duration + ", consumption=" + this.consumption + ", isFinished=" + this.isFinished + ", dayIndex=" + this.dayIndex + ", articleId=" + this.articleId + ", articleTitle=" + ((Object) this.articleTitle) + ", articleDescription=" + ((Object) this.articleDescription) + ", articleLink=" + ((Object) this.articleLink) + ", articleImageUrl=" + ((Object) this.articleImageUrl) + ')';
    }
}
