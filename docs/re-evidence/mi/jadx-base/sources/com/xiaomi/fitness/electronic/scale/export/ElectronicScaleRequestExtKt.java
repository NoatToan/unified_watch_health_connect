package com.xiaomi.fitness.electronic.scale.export;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequestExtKt;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"instance", "Lcom/xiaomi/fitness/electronic/scale/export/ElectronicScaleRequest;", "Lcom/xiaomi/fitness/electronic/scale/export/ElectronicScaleRequest$Companion;", "getInstance", "(Lcom/xiaomi/fitness/electronic/scale/export/ElectronicScaleRequest$Companion;)Lcom/xiaomi/fitness/electronic/scale/export/ElectronicScaleRequest;", "instance$delegate", "Lkotlin/Lazy;", "SHARE_LIST_TYPE_SHARE_TO_OTHER", "", "SHARE_LIST_TYPE_SHARE_TO_ME", "electronic-scale-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ElectronicScaleRequestExtKt {
    public static final int SHARE_LIST_TYPE_SHARE_TO_ME = 2;
    public static final int SHARE_LIST_TYPE_SHARE_TO_OTHER = 1;

    @NotNull
    private static final Lazy instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: p58
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ElectronicScaleRequestExtKt.instance_delegate$lambda$0();
        }
    });

    @NotNull
    public static final ElectronicScaleRequest getInstance(@NotNull ElectronicScaleRequest.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (ElectronicScaleRequest) instance$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ElectronicScaleRequest instance_delegate$lambda$0() {
        return ((ElectronicScaleRequestPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), ElectronicScaleRequestPoint.class)).getElectronicScaleRequest();
    }
}
