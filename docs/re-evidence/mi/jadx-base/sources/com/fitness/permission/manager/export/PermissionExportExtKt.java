package com.fitness.permission.manager.export;

import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"INSTANCE", "Lcom/fitness/permission/manager/export/IPermissionManager;", "Lcom/fitness/permission/manager/export/IPermissionManager$Companion;", "getINSTANCE", "(Lcom/fitness/permission/manager/export/IPermissionManager$Companion;)Lcom/fitness/permission/manager/export/IPermissionManager;", "INSTANCE$delegate", "Lkotlin/Lazy;", "permission-manager-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PermissionExportExtKt {

    @NotNull
    private static final Lazy INSTANCE$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: zrh
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PermissionExportExtKt.INSTANCE_delegate$lambda$0();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final IPermissionManager INSTANCE_delegate$lambda$0() {
        return ((PermissionPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), PermissionPoint.class)).getPermissionManger();
    }

    @NotNull
    public static final IPermissionManager getINSTANCE(@NotNull IPermissionManager.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (IPermissionManager) INSTANCE$delegate.getValue();
    }
}
