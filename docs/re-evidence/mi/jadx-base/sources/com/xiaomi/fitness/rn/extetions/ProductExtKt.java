package com.xiaomi.fitness.rn.extetions;

import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.rn.RNProductManagerImpl;
import com.xiaomi.fitness.rn.export.RNProductManager;
import com.xiaomi.fitness.rn.extetions.ProductExtKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"instance", "Lcom/xiaomi/fitness/rn/export/RNProductManager;", "Lcom/xiaomi/fitness/rn/export/RNProductManager$Companion;", "getInstance", "(Lcom/xiaomi/fitness/rn/export/RNProductManager$Companion;)Lcom/xiaomi/fitness/rn/export/RNProductManager;", "instance$delegate", "Lkotlin/Lazy;", "sdk_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ProductExtKt {

    @NotNull
    private static final Lazy instance$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: kbi
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ProductExtKt.instance_delegate$lambda$0();
        }
    });

    @NotNull
    public static final RNProductManager getInstance(@NotNull RNProductManager.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (RNProductManager) instance$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RNProductManager instance_delegate$lambda$0() {
        return AppUtil.INSTANCE.isPlayChannel() ? new RNProductManagerPlayImpl() : new RNProductManagerImpl();
    }
}
