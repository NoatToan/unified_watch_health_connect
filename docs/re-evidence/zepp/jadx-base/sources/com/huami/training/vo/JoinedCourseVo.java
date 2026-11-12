package com.huami.training.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.training.dto.TrainingType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u000e\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\b\u0010!\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010'\u001a\u00020\"¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0018\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\fR\u001b\u0010!\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010'\u001a\u00020\"8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/huami/training/vo/JoinedCourseVo;", "", "", "a", "J", "getId", "()J", "id", "", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "", "c", LogUtil.I, "getCourseCount", "()I", "courseCount", GoogleApiAvailabilityLight.a, "getTrainTimes", "setTrainTimes", "(I)V", "trainTimes", "e", "getExpiry", "expiry", "", "f", "Ljava/lang/Boolean;", "getHasDownloaded", "()Ljava/lang/Boolean;", "hasDownloaded", "Lcom/huami/training/dto/TrainingType;", "g", "Lcom/huami/training/dto/TrainingType;", "getTrainingType", "()Lcom/huami/training/dto/TrainingType;", "trainingType", "<init>", "(JLjava/lang/String;IILjava/lang/String;Ljava/lang/Boolean;Lcom/huami/training/dto/TrainingType;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class JoinedCourseVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int courseCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int trainTimes;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private final String expiry;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private final Boolean hasDownloaded;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final TrainingType trainingType;

    public JoinedCourseVo(long j, @NotNull String str, int i, int i2, @Nullable String str2, @Nullable Boolean bool, @NotNull TrainingType trainingType) {
        this.id = j;
        this.name = str;
        this.courseCount = i;
        this.trainTimes = i2;
        this.expiry = str2;
        this.hasDownloaded = bool;
        this.trainingType = trainingType;
    }

    public final int getCourseCount() {
        return this.courseCount;
    }

    @Nullable
    public final String getExpiry() {
        return this.expiry;
    }

    @Nullable
    public final Boolean getHasDownloaded() {
        return this.hasDownloaded;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getTrainTimes() {
        return this.trainTimes;
    }

    @NotNull
    public final TrainingType getTrainingType() {
        return this.trainingType;
    }

    public final void setTrainTimes(int i) {
        this.trainTimes = i;
    }
}
