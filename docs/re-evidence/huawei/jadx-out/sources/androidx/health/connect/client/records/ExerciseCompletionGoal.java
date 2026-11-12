package androidx.health.connect.client.records;

import androidx.health.connect.client.units.Energy;
import androidx.health.connect.client.units.Length;
import com.huawei.hms.network.embedded.g4;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zcp;
import java.time.Duration;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b&\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\r"}, d2 = {"Landroidx/health/connect/client/records/ExerciseCompletionGoal;", "", "<init>", "()V", "DistanceGoal", "DistanceAndDurationGoal", "StepsGoal", "DurationGoal", "RepetitionsGoal", "TotalCaloriesBurnedGoal", "ActiveCaloriesBurnedGoal", "UnknownGoal", "ManualCompletion", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ExerciseCompletionGoal {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Landroidx/health/connect/client/records/ExerciseCompletionGoal$DistanceGoal;", "Landroidx/health/connect/client/records/ExerciseCompletionGoal;", "distance", "Landroidx/health/connect/client/units/Length;", "<init>", "(Landroidx/health/connect/client/units/Length;)V", "getDistance", "()Landroidx/health/connect/client/units/Length;", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "", "toString", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DistanceGoal extends ExerciseCompletionGoal {
        private final Length distance;

        public final Length getDistance() {
            return this.distance;
        }

        public DistanceGoal(Length length) {
            zcp.c(length, "");
            this.distance = length;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof DistanceGoal) {
                return zcp.b(this.distance, ((DistanceGoal) other).distance);
            }
            return false;
        }

        public int hashCode() {
            return this.distance.hashCode();
        }

        public String toString() {
            return "DistanceGoal(distance=" + this.distance + g4.l;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Landroidx/health/connect/client/records/ExerciseCompletionGoal$DistanceAndDurationGoal;", "Landroidx/health/connect/client/records/ExerciseCompletionGoal;", "distance", "Landroidx/health/connect/client/units/Length;", "duration", "Ljava/time/Duration;", "<init>", "(Landroidx/health/connect/client/units/Length;Ljava/time/Duration;)V", "getDistance", "()Landroidx/health/connect/client/units/Length;", "getDuration", "()Ljava/time/Duration;", "equals", "", "other", "", "toString", "", WatchFaceConstant.HASHCODE, "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DistanceAndDurationGoal extends ExerciseCompletionGoal {
        private final Length distance;
        private final Duration duration;

        public final Length getDistance() {
            return this.distance;
        }

        public final Duration getDuration() {
            return this.duration;
        }

        public DistanceAndDurationGoal(Length length, Duration duration) {
            zcp.c(length, "");
            zcp.c(duration, "");
            this.distance = length;
            this.duration = duration;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DistanceAndDurationGoal)) {
                return false;
            }
            DistanceAndDurationGoal distanceAndDurationGoal = (DistanceAndDurationGoal) other;
            return zcp.b(this.distance, distanceAndDurationGoal.distance) && zcp.b(this.duration, distanceAndDurationGoal.duration);
        }

        public String toString() {
            return "DistanceAndDurationGoal(distance=" + this.distance + ", duration=" + this.duration + g4.l;
        }

        public int hashCode() {
            return (this.distance.hashCode() * 31) + this.duration.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Landroidx/health/connect/client/records/ExerciseCompletionGoal$StepsGoal;", "Landroidx/health/connect/client/records/ExerciseCompletionGoal;", MedalConstants.EVENT_STEPS, "", "<init>", "(I)V", "getSteps", "()I", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "toString", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StepsGoal extends ExerciseCompletionGoal {
        private final int steps;

        public final int getSteps() {
            return this.steps;
        }

        public StepsGoal(int i) {
            this.steps = i;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StepsGoal) && this.steps == ((StepsGoal) other).steps;
        }

        public int hashCode() {
            return this.steps;
        }

        public String toString() {
            return "StepsGoal(steps=" + this.steps + g4.l;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Landroidx/health/connect/client/records/ExerciseCompletionGoal$DurationGoal;", "Landroidx/health/connect/client/records/ExerciseCompletionGoal;", "duration", "Ljava/time/Duration;", "<init>", "(Ljava/time/Duration;)V", "getDuration", "()Ljava/time/Duration;", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "", "toString", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DurationGoal extends ExerciseCompletionGoal {
        private final Duration duration;

        public final Duration getDuration() {
            return this.duration;
        }

        public DurationGoal(Duration duration) {
            zcp.c(duration, "");
            this.duration = duration;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof DurationGoal) {
                return zcp.b(this.duration, ((DurationGoal) other).duration);
            }
            return false;
        }

        public int hashCode() {
            return this.duration.hashCode();
        }

        public String toString() {
            return "DurationGoal(duration=" + this.duration + g4.l;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Landroidx/health/connect/client/records/ExerciseCompletionGoal$RepetitionsGoal;", "Landroidx/health/connect/client/records/ExerciseCompletionGoal;", "repetitions", "", "<init>", "(I)V", "getRepetitions", "()I", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "toString", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RepetitionsGoal extends ExerciseCompletionGoal {
        private final int repetitions;

        public final int getRepetitions() {
            return this.repetitions;
        }

        public RepetitionsGoal(int i) {
            this.repetitions = i;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RepetitionsGoal) && this.repetitions == ((RepetitionsGoal) other).repetitions;
        }

        public int hashCode() {
            return Integer.hashCode(this.repetitions);
        }

        public String toString() {
            return "RepetitionsGoal(repetitions=" + this.repetitions + g4.l;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Landroidx/health/connect/client/records/ExerciseCompletionGoal$TotalCaloriesBurnedGoal;", "Landroidx/health/connect/client/records/ExerciseCompletionGoal;", BleConstants.TOTAL_CALORIES, "Landroidx/health/connect/client/units/Energy;", "<init>", "(Landroidx/health/connect/client/units/Energy;)V", "getTotalCalories", "()Landroidx/health/connect/client/units/Energy;", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "", "toString", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TotalCaloriesBurnedGoal extends ExerciseCompletionGoal {
        private final Energy totalCalories;

        public final Energy getTotalCalories() {
            return this.totalCalories;
        }

        public TotalCaloriesBurnedGoal(Energy energy) {
            zcp.c(energy, "");
            this.totalCalories = energy;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof TotalCaloriesBurnedGoal) {
                return zcp.b(this.totalCalories, ((TotalCaloriesBurnedGoal) other).totalCalories);
            }
            return false;
        }

        public int hashCode() {
            return this.totalCalories.hashCode();
        }

        public String toString() {
            return "TotalCaloriesBurnedGoal(totalCalories=" + this.totalCalories + g4.l;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Landroidx/health/connect/client/records/ExerciseCompletionGoal$ActiveCaloriesBurnedGoal;", "Landroidx/health/connect/client/records/ExerciseCompletionGoal;", "activeCalories", "Landroidx/health/connect/client/units/Energy;", "<init>", "(Landroidx/health/connect/client/units/Energy;)V", "getActiveCalories", "()Landroidx/health/connect/client/units/Energy;", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "", "toString", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ActiveCaloriesBurnedGoal extends ExerciseCompletionGoal {
        private final Energy activeCalories;

        public final Energy getActiveCalories() {
            return this.activeCalories;
        }

        public ActiveCaloriesBurnedGoal(Energy energy) {
            zcp.c(energy, "");
            this.activeCalories = energy;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof ActiveCaloriesBurnedGoal) {
                return zcp.b(this.activeCalories, ((ActiveCaloriesBurnedGoal) other).activeCalories);
            }
            return false;
        }

        public int hashCode() {
            return this.activeCalories.hashCode();
        }

        public String toString() {
            return "ActiveCaloriesBurnedGoal(activeCalories=" + this.activeCalories + g4.l;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Landroidx/health/connect/client/records/ExerciseCompletionGoal$UnknownGoal;", "Landroidx/health/connect/client/records/ExerciseCompletionGoal;", "<init>", "()V", "toString", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UnknownGoal extends ExerciseCompletionGoal {
        public static final UnknownGoal INSTANCE = new UnknownGoal();

        private UnknownGoal() {
        }

        public String toString() {
            return "UnknownGoal()";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Landroidx/health/connect/client/records/ExerciseCompletionGoal$ManualCompletion;", "Landroidx/health/connect/client/records/ExerciseCompletionGoal;", "<init>", "()V", "toString", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ManualCompletion extends ExerciseCompletionGoal {
        public static final ManualCompletion INSTANCE = new ManualCompletion();

        private ManualCompletion() {
        }

        public String toString() {
            return "ManualCompletion()";
        }
    }
}
