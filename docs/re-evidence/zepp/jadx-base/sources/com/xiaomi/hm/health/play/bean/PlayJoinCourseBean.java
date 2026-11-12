package com.xiaomi.hm.health.play.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.training.dto.TrainingType;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003JI\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\tHÆ\u0001J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\r\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b!\u0010 R\u0019\u0010\u0010\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0011\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\"\u001a\u0004\b%\u0010$¨\u0006("}, d2 = {"Lcom/xiaomi/hm/health/play/bean/PlayJoinCourseBean;", "", "", "component1", "Lcom/huami/training/dto/TrainingType;", "component2", "", "component3", "component4", "", "component5", "component6", "id", "trainingType", "courseImg", "courseName", "courseNum", "trainingTimes", "copy", "toString", "hashCode", "other", "", "equals", "J", "getId", "()J", "Lcom/huami/training/dto/TrainingType;", "getTrainingType", "()Lcom/huami/training/dto/TrainingType;", "Ljava/lang/String;", "getCourseImg", "()Ljava/lang/String;", "getCourseName", LogUtil.I, "getCourseNum", "()I", "getTrainingTimes", "<init>", "(JLcom/huami/training/dto/TrainingType;Ljava/lang/String;Ljava/lang/String;II)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PlayJoinCourseBean {

    @Nullable
    private final String courseImg;

    @Nullable
    private final String courseName;
    private final int courseNum;
    private final long id;
    private final int trainingTimes;

    @NotNull
    private final TrainingType trainingType;

    public PlayJoinCourseBean(long j, @NotNull TrainingType trainingType, @Nullable String str, @Nullable String str2, int i, int i2) {
        this.id = j;
        this.trainingType = trainingType;
        this.courseImg = str;
        this.courseName = str2;
        this.courseNum = i;
        this.trainingTimes = i2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TrainingType getTrainingType() {
        return this.trainingType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCourseImg() {
        return this.courseImg;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCourseName() {
        return this.courseName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getCourseNum() {
        return this.courseNum;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getTrainingTimes() {
        return this.trainingTimes;
    }

    @NotNull
    public final PlayJoinCourseBean copy(long id, @NotNull TrainingType trainingType, @Nullable String courseImg, @Nullable String courseName, int courseNum, int trainingTimes) {
        return new PlayJoinCourseBean(id, trainingType, courseImg, courseName, courseNum, trainingTimes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayJoinCourseBean)) {
            return false;
        }
        PlayJoinCourseBean playJoinCourseBean = (PlayJoinCourseBean) other;
        return this.id == playJoinCourseBean.id && this.trainingType == playJoinCourseBean.trainingType && Intrinsics.areEqual(this.courseImg, playJoinCourseBean.courseImg) && Intrinsics.areEqual(this.courseName, playJoinCourseBean.courseName) && this.courseNum == playJoinCourseBean.courseNum && this.trainingTimes == playJoinCourseBean.trainingTimes;
    }

    @Nullable
    public final String getCourseImg() {
        return this.courseImg;
    }

    @Nullable
    public final String getCourseName() {
        return this.courseName;
    }

    public final int getCourseNum() {
        return this.courseNum;
    }

    public final long getId() {
        return this.id;
    }

    public final int getTrainingTimes() {
        return this.trainingTimes;
    }

    @NotNull
    public final TrainingType getTrainingType() {
        return this.trainingType;
    }

    public int hashCode() {
        int iA = ((b.a(this.id) * 31) + this.trainingType.hashCode()) * 31;
        String str = this.courseImg;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.courseName;
        return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.courseNum) * 31) + this.trainingTimes;
    }

    @NotNull
    public String toString() {
        return "PlayJoinCourseBean(id=" + this.id + ", trainingType=" + this.trainingType + ", courseImg=" + this.courseImg + ", courseName=" + this.courseName + ", courseNum=" + this.courseNum + ", trainingTimes=" + this.trainingTimes + ")";
    }
}
