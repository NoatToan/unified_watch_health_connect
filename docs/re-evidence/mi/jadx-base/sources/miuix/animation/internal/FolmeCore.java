package miuix.animation.internal;

import android.animation.FloatEvaluator;
import android.animation.IntEvaluator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import miuix.animation.FolmeFactory;
import miuix.animation.IAnimTarget;
import miuix.animation.function.Differentiable;
import miuix.animation.motion.Motion;
import miuix.animation.physics.AccelerateOperator;
import miuix.animation.physics.EquilibriumChecker;
import miuix.animation.physics.FrictionOperator;
import miuix.animation.physics.PhysicsOperator;
import miuix.animation.physics.SpringOperator;
import miuix.animation.property.FloatProperty;
import miuix.animation.property.IIntValueProperty;
import miuix.animation.utils.CommonUtils;
import miuix.animation.utils.EaseManager;
import miuix.animation.utils.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public class FolmeCore {
    private static final long LONGEST_DURATION_NANOS = 10000000000L;
    public static final long NANOS_TO_MS = 1000000;
    public static final long NANOS_TO_S = 1000000000;
    static final SpringOperator sSpring = new SpringOperator();
    static final AccelerateOperator sAccelerate = new AccelerateOperator();
    static final FrictionOperator sFriction = new FrictionOperator();
    static IntEvaluator sIntEvaluator = new IntEvaluator();
    static FloatEvaluator sFloatEvaluator = new FloatEvaluator();
    static final ThreadLocal<EquilibriumChecker> mCheckerLocal = new ThreadLocal<>();

    public static void doAnimationFrame(IAnimTarget iAnimTarget, boolean z, AnimData animData, long j, double d, int i) {
        long j2 = j - animData.startTime;
        if (EaseManager.isPhysicsStyle(animData.ease.style)) {
            updatePhysicsAnim(iAnimTarget, animData, z, j2, d, i);
            return;
        }
        if (EaseManager.isPhysicsMotionStyle(animData.ease.style)) {
            updatePhysicsMotionAnim(animData, j2);
            return;
        }
        EaseManager.EaseStyle easeStyle = animData.ease;
        if (easeStyle instanceof EaseManager.InterpolateEaseStyle) {
            updateInterpolatorAnim(animData, z, j2 / NANOS_TO_MS);
        } else if (EaseManager.isDurationMotionStyle(easeStyle.style)) {
            updateDurationMotionAnim(animData, z, j2);
        }
    }

    private static void doArgbPhysicsCalculation(AnimData animData, double d) {
        boolean z;
        double d2 = animData.velocity;
        PhysicsOperator phyOperator = getPhyOperator(animData.ease.style);
        if (phyOperator == null || (((z = phyOperator instanceof SpringOperator)) && AnimValueUtils.isInvalid(animData.targetValue))) {
            animData.value = 1.0d;
            animData.velocity = 0.0d;
        } else if (z) {
            if (animData.frameCount == 1) {
                double d3 = animData.progress;
                double d4 = animData.ease.factors[0];
                double[] dArr = animData.ease.parameters;
                SpringOperator.updateValues(animData, d4, dArr[1], dArr[2], d, true);
                animData.progress = d3;
            }
            double d5 = animData.ease.factors[0];
            double[] dArr2 = animData.ease.parameters;
            SpringOperator.updateValues(animData, d5, dArr2[1], dArr2[2], d, true);
        } else {
            double[] dArr3 = animData.ease.parameters;
            double dUpdateVelocity = phyOperator.updateVelocity(d2, dArr3[0], dArr3[1], d, 1.0d, animData.progress);
            double d6 = animData.progress + ((animData.velocity + dUpdateVelocity) * 0.5d * d);
            animData.progress = d6;
            if (d6 > 1.0d) {
                animData.progress = 1.0d;
            } else if (d6 < 0.0d) {
                animData.progress = 0.0d;
            }
            animData.velocity = dUpdateVelocity;
        }
        Integer num = (Integer) CommonUtils.sArgbEvaluator.evaluate((float) animData.progress, Integer.valueOf((int) animData.startValue), Integer.valueOf((int) animData.targetValue));
        if (LogUtils.isLogFrameEnable() || LogUtils.isLogDetailEnable()) {
            LogUtils.debug("doArgbPhysics p='" + animData.property.getName() + "' color=" + Integer.toHexString(num.intValue()) + " fraction=" + animData.progress, new Object[0]);
        }
        animData.value = num.doubleValue();
    }

    private static void doPhysicsCalculation(AnimData animData, double d) {
        boolean z;
        double d2 = animData.velocity;
        PhysicsOperator phyOperator = getPhyOperator(animData.ease.style);
        if (phyOperator == null || (((z = phyOperator instanceof SpringOperator)) && AnimValueUtils.isInvalid(animData.targetValue))) {
            animData.value = animData.targetValue;
            animData.velocity = 0.0d;
            return;
        }
        if (!z) {
            double[] dArr = animData.ease.parameters;
            double dUpdateVelocity = phyOperator.updateVelocity(d2, dArr[0], dArr[1], d, animData.targetValue, animData.value);
            double d3 = animData.value + ((animData.velocity + dUpdateVelocity) * 0.5d * d);
            animData.value = d3;
            if (Double.isInfinite(d3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("doPhysicsCalculation data.value isInfinite! startVelocity ");
                sb.append(d2);
                sb.append(" velocity ");
                sb.append(dUpdateVelocity);
                sb.append(" data.ease.parameters ");
                sb.append(animData.ease.parameters);
                sb.append(" delta ");
                sb.append(d);
                sb.append(" data.targetValue ");
                sb.append(animData.targetValue);
                sb.append(" data.velocity ");
                sb.append(animData.velocity);
            }
            animData.velocity = dUpdateVelocity;
            return;
        }
        if (animData.frameCount == 1) {
            double d4 = animData.value;
            double d5 = animData.ease.factors[0];
            double[] dArr2 = animData.ease.parameters;
            SpringOperator.updateValues(animData, d5, dArr2[1], dArr2[2], d, false);
            animData.value = d4;
        }
        double d6 = animData.ease.factors[0];
        double[] dArr3 = animData.ease.parameters;
        SpringOperator.updateValues(animData, d6, dArr3[1], dArr3[2], d, false);
        if (Double.isInfinite(animData.value)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("doPhysicsCalculation data.value isInfinite! startVelocity ");
            sb2.append(d2);
            sb2.append(" data.ease.parameters ");
            sb2.append(animData.ease.parameters);
            sb2.append(" delta ");
            sb2.append(d);
            sb2.append(" data.targetValue ");
            sb2.append(animData.targetValue);
            sb2.append(" data.velocity ");
            sb2.append(animData.velocity);
        }
    }

    private static double evaluateValue(AnimData animData, float f) {
        TypeEvaluator evaluator = getEvaluator(animData.property);
        return evaluator instanceof IntEvaluator ? ((IntEvaluator) evaluator).evaluate(f, Integer.valueOf((int) animData.startValue), Integer.valueOf((int) animData.targetValue)).doubleValue() : ((FloatEvaluator) evaluator).evaluate(f, (Number) Float.valueOf((float) animData.startValue), (Number) Float.valueOf((float) animData.targetValue)).doubleValue();
    }

    private static TypeEvaluator getEvaluator(FloatProperty floatProperty) {
        return floatProperty instanceof IIntValueProperty ? sIntEvaluator : sFloatEvaluator;
    }

    public static PhysicsOperator getPhyOperator(int i) {
        if (i == -4) {
            return sFriction;
        }
        if (i == -3) {
            return sAccelerate;
        }
        if (i != -2) {
            return null;
        }
        return sSpring;
    }

    public static float getVelocityThreshold() {
        EquilibriumChecker equilibriumChecker = (EquilibriumChecker) CommonUtils.getLocal(FolmeFactory.getEngine().getObjPool(), mCheckerLocal, EquilibriumChecker.class);
        if (equilibriumChecker != null) {
            return equilibriumChecker.getVelocityThreshold();
        }
        return 0.0f;
    }

    public static boolean isAnimRunning(EquilibriumChecker equilibriumChecker, FloatProperty floatProperty, int i, double d, double d2, long j) {
        boolean z = !equilibriumChecker.isAtEquilibrium(i, d, d2);
        if (!z || j <= 10000000000L) {
            return z;
        }
        if (LogUtils.isLogMainEnabled()) {
            LogUtils.debug("animation for " + floatProperty.getName() + " stopped for running time too long, totalTime_nanos = " + j, new Object[0]);
        }
        return false;
    }

    private static boolean isUsingSpringPhy(AnimData animData) {
        return animData.ease.style == -2;
    }

    private static float regulateProgress(float f) {
        if (f > 1.0f) {
            return 1.0f;
        }
        if (f < 0.0f) {
            return 0.0f;
        }
        return f;
    }

    private static void setFinishValue(AnimData animData) {
        if (isUsingSpringPhy(animData)) {
            animData.value = animData.targetValue;
        }
    }

    private static void updateDurationMotionAnim(AnimData animData, boolean z, long j) {
        EaseManager.DurationMotionEaseStyle durationMotionEaseStyle = (EaseManager.DurationMotionEaseStyle) animData.ease;
        double d = j / (durationMotionEaseStyle.factors[0] * 1000000.0d);
        Motion durationMotion = EaseManager.getDurationMotion(durationMotionEaseStyle);
        if (d > 1.0d) {
            animData.progress = durationMotion.stopPosition();
            animData.value = animData.targetValue;
            animData.velocity = durationMotion.stopSpeed();
            animData.setOp((byte) 3);
        } else {
            Differentiable differentiableSolve = durationMotion.solve();
            double dApply = differentiableSolve.apply(d);
            animData.progress = dApply;
            if (z) {
                animData.value = ((Integer) CommonUtils.sArgbEvaluator.evaluate((float) dApply, Integer.valueOf((int) animData.startValue), Integer.valueOf((int) animData.targetValue))).doubleValue();
            } else {
                double d2 = animData.startValue;
                animData.value = d2 + ((animData.targetValue - d2) * dApply);
            }
            animData.velocity = differentiableSolve.derivative().apply(d);
        }
        if (Double.isInfinite(animData.value)) {
            StringBuilder sb = new StringBuilder();
            sb.append("updateDurationMotionAnim data.value isInfinite!  data.ease ");
            sb.append(durationMotionEaseStyle);
            sb.append(" totalTimeNanos ");
            sb.append(j);
            sb.append(" data.progress ");
            sb.append(animData.progress);
        }
    }

    @Deprecated
    private static void updateInterpolatorAnim(AnimData animData, boolean z, long j) {
        EaseManager.InterpolateEaseStyle interpolateEaseStyle = (EaseManager.InterpolateEaseStyle) animData.ease;
        TimeInterpolator interpolator = EaseManager.getInterpolator(interpolateEaseStyle);
        long j2 = interpolateEaseStyle.duration;
        if (j < j2) {
            animData.progress = interpolator.getInterpolation(j / j2);
        } else {
            animData.setOp((byte) 3);
            animData.progress = 1.0d;
        }
        if (z) {
            animData.value = ((Integer) CommonUtils.sArgbEvaluator.evaluate((float) animData.progress, Integer.valueOf((int) animData.startValue), Integer.valueOf((int) animData.targetValue))).doubleValue();
        } else {
            animData.value = evaluateValue(animData, (float) animData.progress);
        }
        if (Double.isInfinite(animData.value)) {
            StringBuilder sb = new StringBuilder();
            sb.append("updateInterpolatorAnim data.value isInfinite!  data.ease ");
            sb.append(interpolateEaseStyle);
            sb.append(" totalTime_ms ");
            sb.append(j);
            sb.append(" interpolator ");
            sb.append(interpolator);
            sb.append(" data.progress ");
            sb.append(animData.progress);
        }
    }

    private static void updatePhysicsAnim(IAnimTarget iAnimTarget, AnimData animData, boolean z, long j, double d, int i) {
        EquilibriumChecker equilibriumChecker = (EquilibriumChecker) CommonUtils.getLocal(FolmeFactory.getEngine().getObjPool(), mCheckerLocal, EquilibriumChecker.class);
        if (animData.property.getMinVisibleChange() == -1.0f) {
            FloatProperty floatProperty = animData.property;
            floatProperty.setMinVisibleChange(iAnimTarget.getMinVisibleChange(floatProperty.getName()));
        }
        equilibriumChecker.init(animData.property, animData.targetValue);
        for (int i2 = 0; i2 < i; i2++) {
            if (z) {
                doArgbPhysicsCalculation(animData, d);
            } else {
                doPhysicsCalculation(animData, d);
            }
            if (!isAnimRunning(equilibriumChecker, animData.property, animData.ease.style, animData.value, animData.velocity, j)) {
                animData.setOp((byte) 3);
                if (LogUtils.isLogMoreEnable()) {
                    LogUtils.debug("----- updatePhysicsAnim data.setOp(AnimTask.OP_END)", new Object[0]);
                }
                setFinishValue(animData);
                return;
            }
        }
    }

    private static void updatePhysicsMotionAnim(AnimData animData, long j) {
        Motion motion = ((EaseManager.PhysicsMotionEaseStyle) animData.ease).motion;
        double dFinishTime = motion.finishTime();
        double d = animData.duration;
        if (!Double.isFinite(dFinishTime) || d < dFinishTime) {
            Differentiable differentiableSolve = motion.solve();
            animData.value = ((animData.targetValue - animData.startValue) * differentiableSolve.apply(d)) + animData.startValue;
            animData.velocity = differentiableSolve.derivative().apply(d);
        } else {
            animData.value = ((animData.targetValue - animData.startValue) * motion.stopPosition()) + animData.startValue;
            animData.velocity = motion.stopSpeed();
            animData.setOp((byte) 3);
        }
    }
}
