package com.github.mikephil.charting.animation;

import android.animation.TimeInterpolator;

/* JADX INFO: loaded from: classes13.dex */
public class Easing {
    private static final float DOUBLE_PI = 6.2831855f;
    public static final EasingFunction Linear = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.1
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f14) {
            return f14;
        }
    };
    public static final EasingFunction EaseInQuad = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.2
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f14) {
            return f14 * f14;
        }
    };
    public static final EasingFunction EaseOutQuad = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.3
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f14) {
            return (f14 - 2.0f) * (-f14);
        }
    };
    public static final EasingFunction EaseInOutQuad = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.4
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f14) {
            float f15;
            float f16 = f14 * 2.0f;
            if (f16 < 1.0f) {
                f15 = 0.5f * f16;
            } else {
                float f17 = f16 - 1.0f;
                f15 = ((f17 - 2.0f) * f17) - 1.0f;
                f16 = -0.5f;
            }
            return f15 * f16;
        }
    };
    public static final EasingFunction EaseInCubic = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.5
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f14) {
            return (float) Math.pow(f14, 3.0d);
        }
    };
    public static final EasingFunction EaseOutCubic = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.6
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f14) {
            return ((float) Math.pow(f14 - 1.0f, 3.0d)) + 1.0f;
        }
    };
    public static final EasingFunction EaseInOutCubic = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.7
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f14) {
            float f15 = f14 * 2.0f;
            return (f15 < 1.0f ? (float) Math.pow(f15, 3.0d) : ((float) Math.pow(f15 - 2.0f, 3.0d)) + 2.0f) * 0.5f;
        }
    };
    public static final EasingFunction EaseInQuart = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.8
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f14) {
            return (float) Math.pow(f14, 4.0d);
        }
    };
    public static final EasingFunction EaseOutQuart = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.9
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f14) {
            return -(((float) Math.pow(f14 - 1.0f, 4.0d)) - 1.0f);
        }
    };
    public static final EasingFunction EaseInOutQuart = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.10
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f14) {
            float fPow;
            float f15;
            float f16 = f14 * 2.0f;
            if (f16 < 1.0f) {
                fPow = (float) Math.pow(f16, 4.0d);
                f15 = 0.5f;
            } else {
                fPow = ((float) Math.pow(f16 - 2.0f, 4.0d)) - 2.0f;
                f15 = -0.5f;
            }
            return fPow * f15;
        }
    };
    public static final EasingFunction EaseInSine = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.11
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f14) {
            return (-((float) Math.cos(((double) f14) * 1.5707963267948966d))) + 1.0f;
        }
    };
    public static final EasingFunction EaseOutSine = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.12
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f14) {
            return (float) Math.sin(((double) f14) * 1.5707963267948966d);
        }
    };
    public static final EasingFunction EaseInOutSine = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.13
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f14) {
            return (((float) Math.cos(((double) f14) * 3.141592653589793d)) - 1.0f) * (-0.5f);
        }
    };
    public static final EasingFunction EaseInExpo = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.14
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f14) {
            if (f14 == 0.0f) {
                return 0.0f;
            }
            return (float) Math.pow(2.0d, (f14 - 1.0f) * 10.0f);
        }
    };
    public static final EasingFunction EaseOutExpo = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.15
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f14) {
            if (f14 == 1.0f) {
                return 1.0f;
            }
            return -((float) Math.pow(2.0d, (f14 + 1.0f) * (-10.0f)));
        }
    };
    public static final EasingFunction EaseInOutExpo = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.16
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f14) {
            if (f14 == 0.0f) {
                return 0.0f;
            }
            if (f14 == 1.0f) {
                return 1.0f;
            }
            float f15 = f14 * 2.0f;
            return (f15 < 1.0f ? (float) Math.pow(2.0d, (f15 - 1.0f) * 10.0f) : (-((float) Math.pow(2.0d, (f15 - 1.0f) * (-10.0f)))) + 2.0f) * 0.5f;
        }
    };
    public static final EasingFunction EaseInCirc = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.17
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f14) {
            return -(((float) Math.sqrt(1.0f - (f14 * f14))) - 1.0f);
        }
    };
    public static final EasingFunction EaseOutCirc = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.18
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f14) {
            float f15 = f14 - 1.0f;
            return (float) Math.sqrt(1.0f - (f15 * f15));
        }
    };
    public static final EasingFunction EaseInOutCirc = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.19
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f14) {
            float fSqrt;
            float f15;
            float f16 = f14 * 2.0f;
            if (f16 < 1.0f) {
                fSqrt = ((float) Math.sqrt(1.0f - (f16 * f16))) - 1.0f;
                f15 = -0.5f;
            } else {
                float f17 = f16 - 2.0f;
                fSqrt = ((float) Math.sqrt(1.0f - (f17 * f17))) + 1.0f;
                f15 = 0.5f;
            }
            return fSqrt * f15;
        }
    };
    public static final EasingFunction EaseInElastic = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.20
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f14) {
            if (f14 == 0.0f) {
                return 0.0f;
            }
            if (f14 == 1.0f) {
                return 1.0f;
            }
            float f15 = f14 - 1.0f;
            return -(((float) Math.pow(2.0d, 10.0f * f15)) * ((float) Math.sin(((f15 - (0.047746483f * ((float) Math.asin(1.0d)))) * Easing.DOUBLE_PI) / 0.3f)));
        }
    };
    public static final EasingFunction EaseOutElastic = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.21
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f14) {
            if (f14 == 0.0f) {
                return 0.0f;
            }
            if (f14 == 1.0f) {
                return 1.0f;
            }
            return (((float) Math.pow(2.0d, (-10.0f) * f14)) * ((float) Math.sin(((f14 - (0.047746483f * ((float) Math.asin(1.0d)))) * Easing.DOUBLE_PI) / 0.3f))) + 1.0f;
        }
    };
    public static final EasingFunction EaseInOutElastic = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.22
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f14) {
            if (f14 == 0.0f) {
                return 0.0f;
            }
            float f15 = f14 * 2.0f;
            if (f15 == 2.0f) {
                return 1.0f;
            }
            float fAsin = ((float) Math.asin(1.0d)) * 0.07161972f;
            if (f15 < 1.0f) {
                float f16 = f15 - 1.0f;
                return ((float) Math.pow(2.0d, 10.0f * f16)) * ((float) Math.sin(((f16 * 1.0f) - fAsin) * Easing.DOUBLE_PI * 2.2222223f)) * (-0.5f);
            }
            float f17 = f15 - 1.0f;
            return (((float) Math.pow(2.0d, (-10.0f) * f17)) * 0.5f * ((float) Math.sin(((f17 * 1.0f) - fAsin) * Easing.DOUBLE_PI * 2.2222223f))) + 1.0f;
        }
    };
    public static final EasingFunction EaseInBack = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.23
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f14) {
            return ((f14 * 2.70158f) - 1.70158f) * f14 * f14;
        }
    };
    public static final EasingFunction EaseOutBack = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.24
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f14) {
            float f15 = f14 - 1.0f;
            return (((f15 * 2.70158f) + 1.70158f) * f15 * f15) + 1.0f;
        }
    };
    public static final EasingFunction EaseInOutBack = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.25
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f14) {
            float f15;
            float f16 = f14 * 2.0f;
            if (f16 < 1.0f) {
                f15 = ((3.5949094f * f16) - 2.5949094f) * f16 * f16;
            } else {
                float f17 = f16 - 2.0f;
                f15 = (((3.5949094f * f17) + 2.5949094f) * f17 * f17) + 2.0f;
            }
            return f15 * 0.5f;
        }
    };
    public static final EasingFunction EaseInBounce = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.26
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f14) {
            return 1.0f - Easing.EaseOutBounce.getInterpolation(1.0f - f14);
        }
    };
    public static final EasingFunction EaseOutBounce = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.27
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f14) {
            if (f14 < 0.36363637f) {
                return 7.5625f * f14 * f14;
            }
            if (f14 < 0.72727275f) {
                float f15 = f14 - 0.54545456f;
                return (7.5625f * f15 * f15) + 0.75f;
            }
            if (f14 < 0.90909094f) {
                float f16 = f14 - 0.8181818f;
                return (7.5625f * f16 * f16) + 0.9375f;
            }
            float f17 = f14 - 0.95454544f;
            return (7.5625f * f17 * f17) + 0.984375f;
        }
    };
    public static final EasingFunction EaseInOutBounce = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.28
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f14) {
            return f14 < 0.5f ? Easing.EaseInBounce.getInterpolation(f14 * 2.0f) * 0.5f : (Easing.EaseOutBounce.getInterpolation((f14 * 2.0f) - 1.0f) * 0.5f) + 0.5f;
        }
    };

    public interface EasingFunction extends TimeInterpolator {
        @Override // android.animation.TimeInterpolator
        float getInterpolation(float f14);
    }
}
