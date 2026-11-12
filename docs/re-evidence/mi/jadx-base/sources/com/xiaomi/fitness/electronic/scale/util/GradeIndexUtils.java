package com.xiaomi.fitness.electronic.scale.util;

import defpackage.qal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\n\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J \u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0007J \u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\u0007J \u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0018\u001a\u00020\u0007J\u000e\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001b¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/util/GradeIndexUtils;", "", "<init>", "()V", "bmiGrade", "", "bmi", "", "fatRatioGrade", "bfp", "age", "sex", "", "heartRateGrade", "heartRate", "waterComponentGrade", "bwp", "proteinComponentGrade", "pm", "boneSaltComponentgrade", "bmc", "weight", "muscleComponentGrade", "slm", "height", "visceralFatGrade", "vfr", "", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GradeIndexUtils {
    public final int bmiGrade(float bmi) {
        double d = bmi;
        if (d < 18.5d) {
            return 1;
        }
        if (d >= 18.5d && d < 24.0d) {
            return 2;
        }
        if (d < 24.0d || d >= 28.0d) {
            return d >= 28.0d ? 4 : 0;
        }
        return 3;
    }

    public final int boneSaltComponentgrade(float bmc, @Nullable String sex, float weight) {
        if (Intrinsics.areEqual(sex, "female")) {
            if (weight >= 45.0f) {
                double d = weight;
                if (45.0d > d || d > 60.0d) {
                    if (weight > 60.0f) {
                        if (bmc < 2.5d) {
                            return 1;
                        }
                    }
                    return 0;
                }
                if (bmc < 2.2d) {
                    return 1;
                }
            } else if (bmc < 1.8d) {
                return 1;
            }
            return 2;
        }
        if (Intrinsics.areEqual(sex, "male")) {
            if (weight >= 45.0f) {
                double d2 = weight;
                if (45.0d > d2 || d2 > 60.0d) {
                    if (weight > 60.0f) {
                        if (bmc < 3.2d) {
                            return 1;
                        }
                    }
                } else if (bmc < 2.5d) {
                    return 1;
                }
            } else if (bmc < 2.5d) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0127 A[ORIG_RETURN, RETURN] */
    public final int fatRatioGrade(float bfp, int age, @Nullable String sex) {
        qal.c("fatRatioGrade() " + bfp + " == " + age + " == " + sex);
        if (!Intrinsics.areEqual(sex, "female")) {
            if (Intrinsics.areEqual(sex, "male")) {
                if (age >= 0 && age < 40) {
                    if (bfp >= 10.0f) {
                        if (bfp < 10.0f || bfp >= 21.0f) {
                            if (bfp < 21.0f || bfp >= 26.0f) {
                                if (bfp >= 26.0f) {
                                    return 4;
                                }
                            }
                            return 3;
                        }
                        return 2;
                    }
                    return 1;
                }
                if (40 <= age && age < 60) {
                    if (bfp >= 11.0f) {
                        if (bfp < 11.0f || bfp >= 22.0f) {
                            if (bfp < 22.0f || bfp >= 27.0f) {
                                if (bfp >= 27.0f) {
                                    return 4;
                                }
                            }
                            return 3;
                        }
                        return 2;
                    }
                    return 1;
                }
                if (age >= 60) {
                    if (bfp >= 13.0f) {
                        if (bfp < 13.0f || bfp >= 24.0f) {
                            if (bfp < 24.0f || bfp >= 29.0f) {
                                if (bfp >= 29.0f) {
                                    return 4;
                                }
                            }
                            return 3;
                        }
                        return 2;
                    }
                    return 1;
                }
            }
            return 0;
        }
        if (age >= 0 && age < 40) {
            if (bfp >= 20.0f) {
                if (bfp < 20.0f || bfp >= 34.0f) {
                    if (bfp < 34.0f || bfp >= 39.0f) {
                        if (bfp >= 39.0f) {
                            return 4;
                        }
                        return 0;
                    }
                    return 3;
                }
                return 2;
            }
            return 1;
        }
        if (40 <= age && age < 60) {
            if (bfp >= 21.0f) {
                if (bfp < 21.0f || bfp >= 35.0f) {
                    if (bfp < 35.0f || bfp >= 40.0f) {
                        if (bfp >= 40.0f) {
                            return 4;
                        }
                        return 0;
                    }
                    return 3;
                }
                return 2;
            }
            return 1;
        }
        if (age >= 60) {
            if (bfp >= 22.0f) {
                if (bfp < 22.0f || bfp >= 36.0f) {
                    if (bfp < 36.0f || bfp >= 41.0f) {
                        if (bfp >= 41.0f) {
                            return 4;
                        }
                    }
                    return 3;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public final int heartRateGrade(int heartRate) {
        if (heartRate < 60) {
            return 1;
        }
        if (60 > heartRate || heartRate >= 100) {
            return heartRate >= 100 ? 3 : 0;
        }
        return 2;
    }

    /* JADX WARN: Code duplicated, block: B:88:0x0105 A[ORIG_RETURN, RETURN] */
    public final int muscleComponentGrade(float slm, @Nullable String sex, float height) {
        if (!Intrinsics.areEqual(sex, "female")) {
            if (Intrinsics.areEqual(sex, "male")) {
                if (height < 160.0f) {
                    double d = slm;
                    if (d >= 38.5d) {
                        if (38.5d > d || d > 46.5d) {
                            if (d > 46.5d) {
                                return 3;
                            }
                        }
                        return 2;
                    }
                    return 1;
                }
                double d2 = height;
                if (160.0d <= d2 && d2 <= 170.0d) {
                    if (slm >= 44.0f) {
                        double d3 = slm;
                        if (44.0d > d3 || d3 > 52.4d) {
                            if (d3 > 52.4d) {
                                return 3;
                            }
                        }
                        return 2;
                    }
                    return 1;
                }
                if (height > 170.0f) {
                    double d4 = slm;
                    if (d4 >= 49.4d) {
                        if (49.4d > d4 || d4 > 59.4d) {
                            if (d4 > 59.4d) {
                                return 3;
                            }
                        }
                        return 2;
                    }
                    return 1;
                }
            }
            return 0;
        }
        if (height < 150.0f) {
            double d5 = slm;
            if (d5 >= 29.1d) {
                if (29.1d > d5 || d5 > 34.7d) {
                    if (d5 > 34.7d) {
                        return 3;
                    }
                    return 0;
                }
                return 2;
            }
            return 1;
        }
        double d6 = height;
        if (150.0d <= d6 && d6 <= 160.0d) {
            double d7 = slm;
            if (d7 >= 32.9d) {
                if (32.9d > d7 || d7 > 37.5d) {
                    if (d7 > 37.5d) {
                        return 3;
                    }
                    return 0;
                }
                return 2;
            }
            return 1;
        }
        if (height > 160.0f) {
            double d8 = slm;
            if (d8 >= 36.5d) {
                if (36.5d > d8 || d8 > 42.5d) {
                    if (d8 > 42.5d) {
                        return 3;
                    }
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public final int proteinComponentGrade(float pm) {
        if (pm < 16.0f) {
            return 1;
        }
        double d = pm;
        if (16.0d > d || d > 20.0d) {
            return pm > 20.0f ? 3 : 0;
        }
        return 2;
    }

    public final int visceralFatGrade(short vfr) {
        double d = vfr;
        if (d <= 4.5d) {
            return 1;
        }
        if (d > 4.5d && d <= 9.5d) {
            return 2;
        }
        if (d <= 9.5d || d > 14.5d) {
            return d > 14.5d ? 4 : 0;
        }
        return 3;
    }

    public final int waterComponentGrade(float bwp, @Nullable String sex) {
        if (Intrinsics.areEqual(sex, "female")) {
            if (bwp >= 45.0f) {
                double d = bwp;
                if (45.0d > d || d > 60.0d) {
                    return bwp > 60.0f ? 3 : 0;
                }
                return 2;
            }
            return 1;
        }
        if (Intrinsics.areEqual(sex, "male")) {
            if (bwp >= 55.0f) {
                double d2 = bwp;
                if (55.0d > d2 || d2 > 65.0d) {
                    if (bwp > 65.0f) {
                        return 3;
                    }
                }
                return 2;
            }
            return 1;
        }
    }
}
