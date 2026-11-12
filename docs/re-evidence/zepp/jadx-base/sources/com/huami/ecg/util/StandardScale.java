package com.huami.ecg.util;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0010"}, d2 = {"Lcom/huami/ecg/util/StandardScale;", "", "", "age", "", "getCardiacRisk", "sex", "", "getCardiacStrength", "getFemaleCardiacStrength", "getMaleCardiacStrength", "getHRV", "getFemalHRV", "getMaleHRV", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class StandardScale {
    public static final StandardScale INSTANCE = new StandardScale();

    private StandardScale() {
    }

    @Nullable
    public final int[] getCardiacRisk(int age) {
        if (10 <= age && 29 >= age) {
            return new int[]{1};
        }
        if (30 <= age && 49 >= age) {
            return new int[]{1, 2};
        }
        if (50 <= age && 69 >= age) {
            return new int[]{1, 2, 3};
        }
        if (70 <= age && 89 >= age) {
            return new int[]{1, 3, 4};
        }
        return null;
    }

    @Nullable
    public final float[] getCardiacStrength(int sex, int age) {
        return sex == 0 ? getFemaleCardiacStrength(age) : getMaleCardiacStrength(age);
    }

    @Nullable
    public final int[] getFemalHRV(int age) {
        if (10 <= age && 29 >= age) {
            return new int[]{25, 43, 61};
        }
        if (30 <= age && 49 >= age) {
            return new int[]{21, 31, 41};
        }
        if (50 <= age && 69 >= age) {
            return new int[]{18, 25, 32};
        }
        if (70 <= age && 89 >= age) {
            return new int[]{17, 22, 27};
        }
        return null;
    }

    @Nullable
    public final float[] getFemaleCardiacStrength(int age) {
        if (10 <= age && 29 >= age) {
            return new float[]{22.7836f, 36.8755f, 48.0448f};
        }
        if (30 <= age && 49 >= age) {
            return new float[]{25.5916f, 34.6781f, 42.7359f};
        }
        if (50 <= age && 69 >= age) {
            return new float[]{23.0916f, 30.5615f, 37.3755f};
        }
        if (70 <= age && 89 >= age) {
            return new float[]{18.9396f, 24.5562f, 31.3642f};
        }
        return null;
    }

    @Nullable
    public final int[] getHRV(int sex, int age) {
        return sex == 0 ? getFemalHRV(age) : getMaleHRV(age);
    }

    @Nullable
    public final float[] getMaleCardiacStrength(int age) {
        if (10 <= age && 29 >= age) {
            return new float[]{35.3329f, 48.2214f, 59.8812f};
        }
        if (30 <= age && 49 >= age) {
            return new float[]{26.8178f, 37.6781f, 46.6054f};
        }
        if (50 <= age && 69 >= age) {
            return new float[]{18.167f, 30.5562f, 35.3642f};
        }
        if (70 <= age && 89 >= age) {
            return new float[]{20.4396f, 26.8329f, 33.8642f};
        }
        return null;
    }

    @Nullable
    public final int[] getMaleHRV(int age) {
        if (10 <= age && 29 >= age) {
            return new int[]{35, 53, 71};
        }
        if (30 <= age && 49 >= age) {
            return new int[]{21, 34, 47};
        }
        if (50 <= age && 69 >= age) {
            return new int[]{14, 22, 30};
        }
        if (70 <= age && 89 >= age) {
            return new int[]{17, 22, 27};
        }
        return null;
    }
}
