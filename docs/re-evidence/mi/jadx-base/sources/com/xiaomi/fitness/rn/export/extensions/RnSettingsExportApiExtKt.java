package com.xiaomi.fitness.rn.export.extensions;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.rn.export.RnSettingsExportApi;
import com.xiaomi.fitness.rn.export.extensions.RnSettingsExportApiExtKt;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"instance", "Lcom/xiaomi/fitness/rn/export/RnSettingsExportApi;", "Lcom/xiaomi/fitness/rn/export/RnSettingsExportApi$Companion;", "getInstance", "(Lcom/xiaomi/fitness/rn/export/RnSettingsExportApi$Companion;)Lcom/xiaomi/fitness/rn/export/RnSettingsExportApi;", "instance$delegate", "Lkotlin/Lazy;", "export_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RnSettingsExportApiExtKt {

    @NotNull
    private static final Lazy instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: pvk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RnSettingsExportApiExtKt.instance_delegate$lambda$0();
        }
    });

    @NotNull
    public static final RnSettingsExportApi getInstance(@NotNull RnSettingsExportApi.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (RnSettingsExportApi) instance$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RnSettingsExportApi instance_delegate$lambda$0() {
        return ((RnSettingsExportPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), RnSettingsExportPoint.class)).getRnSettingsExport();
    }
}
