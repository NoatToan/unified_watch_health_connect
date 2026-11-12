package androidx.health.connect.client.records;

import androidx.health.connect.client.units.Mass;
import androidx.health.connect.client.units.Power;
import androidx.health.connect.client.units.Velocity;
import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zcp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\f"}, d2 = {"Landroidx/health/connect/client/records/ExercisePerformanceTarget;", "", "<init>", "()V", "PowerTarget", "SpeedTarget", "CadenceTarget", "HeartRateTarget", "WeightTarget", "RateOfPerceivedExertionTarget", "AmrapTarget", "UnknownTarget", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ExercisePerformanceTarget {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0012"}, d2 = {"Landroidx/health/connect/client/records/ExercisePerformanceTarget$PowerTarget;", "Landroidx/health/connect/client/records/ExercisePerformanceTarget;", "minPower", "Landroidx/health/connect/client/units/Power;", "maxPower", "<init>", "(Landroidx/health/connect/client/units/Power;Landroidx/health/connect/client/units/Power;)V", "getMinPower", "()Landroidx/health/connect/client/units/Power;", "getMaxPower", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "", "toString", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PowerTarget extends ExercisePerformanceTarget {
        private final Power maxPower;
        private final Power minPower;

        public final Power getMinPower() {
            return this.minPower;
        }

        public final Power getMaxPower() {
            return this.maxPower;
        }

        public PowerTarget(Power power, Power power2) {
            zcp.c(power, "");
            zcp.c(power2, "");
            this.minPower = power;
            this.maxPower = power2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PowerTarget)) {
                return false;
            }
            PowerTarget powerTarget = (PowerTarget) other;
            return zcp.b(this.minPower, powerTarget.minPower) && zcp.b(this.maxPower, powerTarget.maxPower);
        }

        public int hashCode() {
            return (this.minPower.hashCode() * 31) + this.maxPower.hashCode();
        }

        public String toString() {
            return "PowerTarget(minPower=" + this.minPower + ", maxPower=" + this.maxPower + g4.l;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0012"}, d2 = {"Landroidx/health/connect/client/records/ExercisePerformanceTarget$SpeedTarget;", "Landroidx/health/connect/client/records/ExercisePerformanceTarget;", "minSpeed", "Landroidx/health/connect/client/units/Velocity;", "maxSpeed", "<init>", "(Landroidx/health/connect/client/units/Velocity;Landroidx/health/connect/client/units/Velocity;)V", "getMinSpeed", "()Landroidx/health/connect/client/units/Velocity;", "getMaxSpeed", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "", "toString", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SpeedTarget extends ExercisePerformanceTarget {
        private final Velocity maxSpeed;
        private final Velocity minSpeed;

        public final Velocity getMinSpeed() {
            return this.minSpeed;
        }

        public final Velocity getMaxSpeed() {
            return this.maxSpeed;
        }

        public SpeedTarget(Velocity velocity, Velocity velocity2) {
            zcp.c(velocity, "");
            zcp.c(velocity2, "");
            this.minSpeed = velocity;
            this.maxSpeed = velocity2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SpeedTarget)) {
                return false;
            }
            SpeedTarget speedTarget = (SpeedTarget) other;
            return zcp.b(this.minSpeed, speedTarget.minSpeed) && zcp.b(this.maxSpeed, speedTarget.maxSpeed);
        }

        public int hashCode() {
            return (this.minSpeed.hashCode() * 31) + this.maxSpeed.hashCode();
        }

        public String toString() {
            return "SpeedTarget(minSpeed=" + this.minSpeed + ", maxSpeed=" + this.maxSpeed + g4.l;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0012"}, d2 = {"Landroidx/health/connect/client/records/ExercisePerformanceTarget$CadenceTarget;", "Landroidx/health/connect/client/records/ExercisePerformanceTarget;", "minCadence", "", "maxCadence", "<init>", "(DD)V", "getMinCadence", "()D", "getMaxCadence", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "", "toString", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CadenceTarget extends ExercisePerformanceTarget {
        private final double maxCadence;
        private final double minCadence;

        public final double getMinCadence() {
            return this.minCadence;
        }

        public final double getMaxCadence() {
            return this.maxCadence;
        }

        public CadenceTarget(double d, double d2) {
            this.minCadence = d;
            this.maxCadence = d2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CadenceTarget)) {
                return false;
            }
            CadenceTarget cadenceTarget = (CadenceTarget) other;
            return this.minCadence == cadenceTarget.minCadence && this.maxCadence == cadenceTarget.maxCadence;
        }

        public int hashCode() {
            return (Double.hashCode(this.minCadence) * 31) + Double.hashCode(this.maxCadence);
        }

        public String toString() {
            return "CadenceTarget(minCadence=" + this.minCadence + ", maxCadence=" + this.maxCadence + g4.l;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0012"}, d2 = {"Landroidx/health/connect/client/records/ExercisePerformanceTarget$HeartRateTarget;", "Landroidx/health/connect/client/records/ExercisePerformanceTarget;", "minHeartRate", "", "maxHeartRate", "<init>", "(DD)V", "getMinHeartRate", "()D", "getMaxHeartRate", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "", "toString", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HeartRateTarget extends ExercisePerformanceTarget {
        private final double maxHeartRate;
        private final double minHeartRate;

        public final double getMinHeartRate() {
            return this.minHeartRate;
        }

        public final double getMaxHeartRate() {
            return this.maxHeartRate;
        }

        public HeartRateTarget(double d, double d2) {
            this.minHeartRate = d;
            this.maxHeartRate = d2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeartRateTarget)) {
                return false;
            }
            HeartRateTarget heartRateTarget = (HeartRateTarget) other;
            return this.minHeartRate == heartRateTarget.minHeartRate && this.maxHeartRate == heartRateTarget.maxHeartRate;
        }

        public int hashCode() {
            return (Double.hashCode(this.minHeartRate) * 31) + Double.hashCode(this.maxHeartRate);
        }

        public String toString() {
            return "HeartRateTarget(minHeartRate=" + this.minHeartRate + ", maxHeartRate=" + this.maxHeartRate + g4.l;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Landroidx/health/connect/client/records/ExercisePerformanceTarget$WeightTarget;", "Landroidx/health/connect/client/records/ExercisePerformanceTarget;", "mass", "Landroidx/health/connect/client/units/Mass;", "<init>", "(Landroidx/health/connect/client/units/Mass;)V", "getMass", "()Landroidx/health/connect/client/units/Mass;", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "", "toString", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WeightTarget extends ExercisePerformanceTarget {
        private final Mass mass;

        public final Mass getMass() {
            return this.mass;
        }

        public WeightTarget(Mass mass) {
            zcp.c(mass, "");
            this.mass = mass;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof WeightTarget) {
                return zcp.b(this.mass, ((WeightTarget) other).mass);
            }
            return false;
        }

        public int hashCode() {
            return this.mass.hashCode();
        }

        public String toString() {
            return "WeightTarget(mass=" + this.mass + g4.l;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Landroidx/health/connect/client/records/ExercisePerformanceTarget$RateOfPerceivedExertionTarget;", "Landroidx/health/connect/client/records/ExercisePerformanceTarget;", "rpe", "", "<init>", "(I)V", "getRpe", "()I", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "toString", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RateOfPerceivedExertionTarget extends ExercisePerformanceTarget {
        private final int rpe;

        public final int getRpe() {
            return this.rpe;
        }

        public RateOfPerceivedExertionTarget(int i) {
            this.rpe = i;
            if (i < 0 || i >= 11) {
                throw new IllegalArgumentException("RPE value must be between 0 and 10, inclusive.".toString());
            }
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RateOfPerceivedExertionTarget) && this.rpe == ((RateOfPerceivedExertionTarget) other).rpe;
        }

        public int hashCode() {
            return Integer.hashCode(this.rpe);
        }

        public String toString() {
            return "RateOfPerceivedExertionTarget(rpe=" + this.rpe + g4.l;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Landroidx/health/connect/client/records/ExercisePerformanceTarget$AmrapTarget;", "Landroidx/health/connect/client/records/ExercisePerformanceTarget;", "<init>", "()V", "toString", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AmrapTarget extends ExercisePerformanceTarget {
        public static final AmrapTarget INSTANCE = new AmrapTarget();

        private AmrapTarget() {
        }

        public String toString() {
            return "AmrapTarget()";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Landroidx/health/connect/client/records/ExercisePerformanceTarget$UnknownTarget;", "Landroidx/health/connect/client/records/ExercisePerformanceTarget;", "<init>", "()V", "toString", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UnknownTarget extends ExercisePerformanceTarget {
        public static final UnknownTarget INSTANCE = new UnknownTarget();

        private UnknownTarget() {
        }

        public String toString() {
            return "UnknownTarget()";
        }
    }
}
