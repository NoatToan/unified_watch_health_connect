package com.mi.fitness.lpamanagement.export;

import com.mi.fitness.lpamanagement.export.LpaManagementHelperExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"instance", "Lcom/mi/fitness/lpamanagement/export/LpaManagementHelper;", "Lcom/mi/fitness/lpamanagement/export/LpaManagementHelper$Companion;", "getInstance", "(Lcom/mi/fitness/lpamanagement/export/LpaManagementHelper$Companion;)Lcom/mi/fitness/lpamanagement/export/LpaManagementHelper;", "instance$delegate", "Lkotlin/Lazy;", "lpa-management-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LpaManagementHelperExtKt {

    @NotNull
    private static final Lazy instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: zue
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LpaManagementHelperExtKt.instance_delegate$lambda$0();
        }
    });

    @NotNull
    public static final LpaManagementHelper getInstance(@NotNull LpaManagementHelper.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (LpaManagementHelper) instance$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LpaManagementHelper instance_delegate$lambda$0() {
        return ((LpaManagementPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), LpaManagementPoint.class)).getLpamanagementHelper();
    }
}
