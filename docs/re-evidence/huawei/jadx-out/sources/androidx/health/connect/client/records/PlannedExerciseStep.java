package androidx.health.connect.client.records;

import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zcm;
import defpackage.zcp;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001d\u001a\u00020\u0003H\u0016J\b\u0010\u001e\u001a\u00020\u000bH\u0016R\u0017\u0010\u0002\u001a\u00020\u0003¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u0003¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006 "}, d2 = {"Landroidx/health/connect/client/records/PlannedExerciseStep;", "", "exerciseType", "", "exercisePhase", "completionGoal", "Landroidx/health/connect/client/records/ExerciseCompletionGoal;", "performanceTargets", "", "Landroidx/health/connect/client/records/ExercisePerformanceTarget;", "description", "", "<init>", "(IILandroidx/health/connect/client/records/ExerciseCompletionGoal;Ljava/util/List;Ljava/lang/String;)V", "getExerciseType$annotations", "()V", "getExerciseType", "()I", "getExercisePhase$annotations", "getExercisePhase", "getCompletionGoal", "()Landroidx/health/connect/client/records/ExerciseCompletionGoal;", "getPerformanceTargets", "()Ljava/util/List;", "getDescription", "()Ljava/lang/String;", "equals", "", "other", WatchFaceConstant.HASHCODE, "toString", "Companion", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PlannedExerciseStep {
    public static final int EXERCISE_PHASE_ACTIVE = 3;
    public static final int EXERCISE_PHASE_COOLDOWN = 4;
    public static final int EXERCISE_PHASE_RECOVERY = 5;
    public static final int EXERCISE_PHASE_REST = 2;
    public static final int EXERCISE_PHASE_UNKNOWN = 0;
    public static final int EXERCISE_PHASE_WARMUP = 1;
    private final ExerciseCompletionGoal completionGoal;
    private final String description;
    private final int exercisePhase;
    private final int exerciseType;
    private final List<ExercisePerformanceTarget> performanceTargets;

    public static /* synthetic */ void getExercisePhase$annotations() {
    }

    public static /* synthetic */ void getExerciseType$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlannedExerciseStep(int i, int i2, ExerciseCompletionGoal exerciseCompletionGoal, List<? extends ExercisePerformanceTarget> list, String str) {
        zcp.c(exerciseCompletionGoal, "");
        zcp.c(list, "");
        this.exerciseType = i;
        this.exercisePhase = i2;
        this.completionGoal = exerciseCompletionGoal;
        this.performanceTargets = list;
        this.description = str;
    }

    public /* synthetic */ PlannedExerciseStep(int i, int i2, ExerciseCompletionGoal exerciseCompletionGoal, List list, String str, int i3, zcm zcmVar) {
        this(i, i2, exerciseCompletionGoal, list, (i3 & 16) != 0 ? null : str);
    }

    public final int getExerciseType() {
        return this.exerciseType;
    }

    public final int getExercisePhase() {
        return this.exercisePhase;
    }

    public final ExerciseCompletionGoal getCompletionGoal() {
        return this.completionGoal;
    }

    public final List<ExercisePerformanceTarget> getPerformanceTargets() {
        return this.performanceTargets;
    }

    public final String getDescription() {
        return this.description;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlannedExerciseStep)) {
            return false;
        }
        PlannedExerciseStep plannedExerciseStep = (PlannedExerciseStep) other;
        return this.exerciseType == plannedExerciseStep.exerciseType && this.exercisePhase == plannedExerciseStep.exercisePhase && zcp.b((Object) this.description, (Object) plannedExerciseStep.description) && zcp.b(this.completionGoal, plannedExerciseStep.completionGoal) && zcp.b(this.performanceTargets, plannedExerciseStep.performanceTargets);
    }

    public int hashCode() {
        int i = this.exerciseType;
        int i2 = this.exercisePhase;
        String str = this.description;
        return (((((((i * 31) + i2) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.completionGoal.hashCode()) * 31) + this.performanceTargets.hashCode();
    }

    public String toString() {
        return "PlannedExerciseStep(exerciseType=" + this.exerciseType + ", exerciseCategory=" + this.exercisePhase + ", description=" + this.description + ", completionGoal=" + this.completionGoal + ", performanceTargets=" + this.performanceTargets + g4.l;
    }
}
