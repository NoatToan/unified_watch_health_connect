package com.mi.health.permission;

import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import defpackage.fai;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.aspectj.lang.NoAspectBoundException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/mi/health/permission/PermissionAspectJ;", "", "Lfai;", "point", "", "permissionStat", "(Lfai;)V", "<init>", "()V", "permission-manager_release"}, k = 1, mv = {2, 0, 0})
public final class PermissionAspectJ {
    private static /* synthetic */ Throwable ajc$initFailureCause;
    public static /* synthetic */ PermissionAspectJ ajc$perSingletonInstance;

    static {
        try {
            ajc$postClinit();
        } catch (Throwable th) {
            ajc$initFailureCause = th;
        }
    }

    private static /* synthetic */ void ajc$postClinit() {
        ajc$perSingletonInstance = new PermissionAspectJ();
    }

    public static PermissionAspectJ aspectOf() {
        PermissionAspectJ permissionAspectJ = ajc$perSingletonInstance;
        if (permissionAspectJ != null) {
            return permissionAspectJ;
        }
        throw new NoAspectBoundException("com.mi.health.permission.PermissionAspectJ", ajc$initFailureCause);
    }

    public static boolean hasAspect() {
        return ajc$perSingletonInstance != null;
    }

    public final void permissionStat(@NotNull fai point) throws Throwable {
        Intrinsics.checkNotNullParameter(point, "point");
        Object[] objArrC = point.c();
        PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE).statisticAppPermissionOnResult((List) objArrC[0], (List) objArrC[1]);
        point.d(objArrC);
    }
}
