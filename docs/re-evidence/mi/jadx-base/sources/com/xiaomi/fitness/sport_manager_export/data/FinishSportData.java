package com.xiaomi.fitness.sport_manager_export.data;

import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.sport_xms.data.SportXmsFinishData;
import com.xiaomi.fitness.training_plan_export.model.TrainingPlanFinishData;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/sport_manager_export/data/FinishSportData;", "Ljava/io/Serializable;", "<init>", "()V", DailyRecordKey.sportType, "", "getSportType", "()I", "setSportType", "(I)V", "sportXmsFinishSportData", "Lcom/xiaomi/fitness/sport_xms/data/SportXmsFinishData;", "getSportXmsFinishSportData", "()Lcom/xiaomi/fitness/sport_xms/data/SportXmsFinishData;", "setSportXmsFinishSportData", "(Lcom/xiaomi/fitness/sport_xms/data/SportXmsFinishData;)V", "extraData", "Lcom/xiaomi/fitness/sport_manager_export/data/SportResponseExtraData;", "getExtraData", "()Lcom/xiaomi/fitness/sport_manager_export/data/SportResponseExtraData;", "setExtraData", "(Lcom/xiaomi/fitness/sport_manager_export/data/SportResponseExtraData;)V", "trainingPlanFinishData", "Lcom/xiaomi/fitness/training_plan_export/model/TrainingPlanFinishData;", "getTrainingPlanFinishData", "()Lcom/xiaomi/fitness/training_plan_export/model/TrainingPlanFinishData;", "setTrainingPlanFinishData", "(Lcom/xiaomi/fitness/training_plan_export/model/TrainingPlanFinishData;)V", "toString", "", "sport-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FinishSportData implements Serializable {

    @Nullable
    private SportResponseExtraData extraData;
    private int sportType;

    @Nullable
    private SportXmsFinishData sportXmsFinishSportData;

    @Nullable
    private TrainingPlanFinishData trainingPlanFinishData;

    @Nullable
    public final SportResponseExtraData getExtraData() {
        return this.extraData;
    }

    public final int getSportType() {
        return this.sportType;
    }

    @Nullable
    public final SportXmsFinishData getSportXmsFinishSportData() {
        return this.sportXmsFinishSportData;
    }

    @Nullable
    public final TrainingPlanFinishData getTrainingPlanFinishData() {
        return this.trainingPlanFinishData;
    }

    public final void setExtraData(@Nullable SportResponseExtraData sportResponseExtraData) {
        this.extraData = sportResponseExtraData;
    }

    public final void setSportType(int i) {
        this.sportType = i;
    }

    public final void setSportXmsFinishSportData(@Nullable SportXmsFinishData sportXmsFinishData) {
        this.sportXmsFinishSportData = sportXmsFinishData;
    }

    public final void setTrainingPlanFinishData(@Nullable TrainingPlanFinishData trainingPlanFinishData) {
        this.trainingPlanFinishData = trainingPlanFinishData;
    }

    @NotNull
    public String toString() {
        TrainingPlanFinishData trainingPlanFinishData = this.trainingPlanFinishData;
        Long lValueOf = trainingPlanFinishData != null ? Long.valueOf(trainingPlanFinishData.getPlanId()) : null;
        TrainingPlanFinishData trainingPlanFinishData2 = this.trainingPlanFinishData;
        Integer sportCourseId = trainingPlanFinishData2 != null ? trainingPlanFinishData2.getSportCourseId() : null;
        TrainingPlanFinishData trainingPlanFinishData3 = this.trainingPlanFinishData;
        return "FinishSportData(trainingPlanFinishData(planId=" + lValueOf + ",sportCourseId=" + sportCourseId + ",serverCourseId=" + (trainingPlanFinishData3 != null ? trainingPlanFinishData3.getServerCourseId() : null) + "))";
    }
}
