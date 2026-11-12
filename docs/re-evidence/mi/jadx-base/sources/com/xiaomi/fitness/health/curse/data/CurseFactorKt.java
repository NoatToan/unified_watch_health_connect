package com.xiaomi.fitness.health.curse.data;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import defpackage.c0j;
import defpackage.eri;
import defpackage.iji;
import defpackage.ni4;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0010\u0010\u0005\u001a\u00020\u00012\b\b\u0001\u0010\u0006\u001a\u00020\u0001\u001a\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u001a\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0001\u001a\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001\u001a\u0016\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n\u001a\u0012\u0010\u0011\u001a\u00020\u00012\b\b\u0001\u0010\u0012\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"LEVEL_NONE", "", "LEVEL_LITE", "LEVEL_MID", "LEVEL_BAD", "getValue", "id", "getName", "", "factor", "Lcom/xiaomi/fitness/health/curse/data/CurseFactor;", "getFactor", "type", "level2Obj", "Lcom/xiaomi/fitness/health/curse/data/FactorLevel;", "level", "circleColor", "getColor", "color", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CurseFactorKt {
    public static final int LEVEL_BAD = 2;
    public static final int LEVEL_LITE = 0;
    public static final int LEVEL_MID = 1;
    public static final int LEVEL_NONE = -1;

    public static final int circleColor(@NotNull FactorLevel level, @NotNull CurseFactor factor) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(factor, "factor");
        if (factor instanceof CurseFactor.Hurt) {
            if (Intrinsics.areEqual(level, FactorLevel.None.INSTANCE)) {
                return getColor(iji.l0);
            }
            if (Intrinsics.areEqual(level, FactorLevel.Lite.INSTANCE)) {
                return getColor(iji.j0);
            }
            if (Intrinsics.areEqual(level, FactorLevel.Mid.INSTANCE)) {
                return getColor(iji.k0);
            }
            if (Intrinsics.areEqual(level, FactorLevel.Bad.INSTANCE)) {
                return getColor(iji.i0);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (factor instanceof CurseFactor.Blood) {
            if (Intrinsics.areEqual(level, FactorLevel.None.INSTANCE)) {
                return getColor(iji.c0);
            }
            if (Intrinsics.areEqual(level, FactorLevel.Lite.INSTANCE)) {
                return getColor(iji.a0);
            }
            if (Intrinsics.areEqual(level, FactorLevel.Mid.INSTANCE)) {
                return getColor(iji.b0);
            }
            if (Intrinsics.areEqual(level, FactorLevel.Bad.INSTANCE)) {
                return getColor(iji.Z);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(factor instanceof CurseFactor.Motion)) {
            throw new NoWhenBranchMatchedException();
        }
        if (Intrinsics.areEqual(level, FactorLevel.None.INSTANCE)) {
            return getColor(iji.p0);
        }
        if (Intrinsics.areEqual(level, FactorLevel.Lite.INSTANCE)) {
            return getColor(iji.n0);
        }
        if (Intrinsics.areEqual(level, FactorLevel.Mid.INSTANCE)) {
            return getColor(iji.o0);
        }
        if (Intrinsics.areEqual(level, FactorLevel.Bad.INSTANCE)) {
            return getColor(iji.m0);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final int getColor(int i) {
        return ni4.c(ApplicationExtKt.getApplication(), i);
    }

    @NotNull
    public static final CurseFactor getFactor(int i) {
        if (i != 1) {
            return i != 2 ? CurseFactor.Hurt.INSTANCE : CurseFactor.Motion.INSTANCE;
        }
        return CurseFactor.Blood.INSTANCE;
    }

    @NotNull
    public static final String getName(@NotNull CurseFactor factor) {
        Intrinsics.checkNotNullParameter(factor, "factor");
        if (Intrinsics.areEqual(factor, CurseFactor.Hurt.INSTANCE)) {
            return ResourceExtKt.getString(c0j.X5);
        }
        if (Intrinsics.areEqual(factor, CurseFactor.Blood.INSTANCE)) {
            return ResourceExtKt.getString(c0j.H5);
        }
        if (Intrinsics.areEqual(factor, CurseFactor.Motion.INSTANCE)) {
            return ResourceExtKt.getString(c0j.c6);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int getValue(int i) {
        if (i == eri.a0) {
            return 2;
        }
        return i == eri.Lb ? 1 : 0;
    }

    @NotNull
    public static final FactorLevel level2Obj(int i) {
        if (i == 0) {
            return FactorLevel.Lite.INSTANCE;
        }
        if (i != 1) {
            return i != 2 ? FactorLevel.None.INSTANCE : FactorLevel.Bad.INSTANCE;
        }
        return FactorLevel.Mid.INSTANCE;
    }
}
