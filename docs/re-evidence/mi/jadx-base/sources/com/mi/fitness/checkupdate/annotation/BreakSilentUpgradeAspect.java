package com.mi.fitness.checkupdate.annotation;

import com.mi.fitness.checkupdate.ota.SilentUpgradeManager;
import com.mi.fitness.checkupdate.ota.SilentUpgradeState;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.auf;
import defpackage.fai;
import defpackage.k53;
import defpackage.obm;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.aspectj.lang.NoAspectBoundException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/mi/fitness/checkupdate/annotation/BreakSilentUpgradeAspect;", "", "Lk53;", "breakSilentUpgrade", "", "pointcutBreak", "(Lk53;)V", "Lfai;", "joinPoint", "aroundBreakSilentUpgrade", "(Lfai;Lk53;)Ljava/lang/Object;", "<init>", "()V", "Companion", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BreakSilentUpgradeAspect {

    @NotNull
    private static final String TAG = "BreakSilentUpgradeAspec";
    private static /* synthetic */ Throwable ajc$initFailureCause;
    public static /* synthetic */ BreakSilentUpgradeAspect ajc$perSingletonInstance;

    static {
        try {
            ajc$postClinit();
        } catch (Throwable th) {
            ajc$initFailureCause = th;
        }
    }

    private static /* synthetic */ void ajc$postClinit() {
        ajc$perSingletonInstance = new BreakSilentUpgradeAspect();
    }

    public static BreakSilentUpgradeAspect aspectOf() {
        BreakSilentUpgradeAspect breakSilentUpgradeAspect = ajc$perSingletonInstance;
        if (breakSilentUpgradeAspect != null) {
            return breakSilentUpgradeAspect;
        }
        throw new NoAspectBoundException("com.mi.fitness.checkupdate.annotation.BreakSilentUpgradeAspect", ajc$initFailureCause);
    }

    public static boolean hasAspect() {
        return ajc$perSingletonInstance != null;
    }

    @Nullable
    public final Object aroundBreakSilentUpgrade(@NotNull fai joinPoint, @NotNull k53 breakSilentUpgrade) throws Throwable {
        Intrinsics.checkNotNullParameter(joinPoint, "joinPoint");
        Intrinsics.checkNotNullParameter(breakSilentUpgrade, "breakSilentUpgrade");
        long jCurrentTimeMillis = System.currentTimeMillis();
        obm obmVarA = joinPoint.a();
        Intrinsics.checkNotNull(obmVarA, "null cannot be cast to non-null type org.aspectj.lang.reflect.MethodSignature");
        Method methodA = ((auf) obmVarA).a();
        if (!methodA.isAnnotationPresent(k53.class)) {
            return joinPoint.b();
        }
        SilentUpgradeManager silentUpgradeManager = SilentUpgradeManager.INSTANCE;
        SilentUpgradeState silentUpgradeState = silentUpgradeManager.getSilentUpgradeState();
        Logger.i(TAG, "aroundBreakSilentUpgrade: state = " + silentUpgradeState);
        if (silentUpgradeState == SilentUpgradeState.UPGRADE_PUSHING) {
            Logger.i(TAG, "aroundBreakSilentUpgrade: cancel silent upgrade");
            String name = methodA.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            silentUpgradeManager.interruptSelf(name);
        }
        Logger.i(TAG, "aroundBreakSilentUpgrade: end cost = " + (System.currentTimeMillis() - jCurrentTimeMillis));
        return joinPoint.b();
    }

    public final void pointcutBreak(@NotNull k53 breakSilentUpgrade) {
        Intrinsics.checkNotNullParameter(breakSilentUpgrade, "breakSilentUpgrade");
    }
}
