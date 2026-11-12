package com.xiaomi.fit.eco.device.extensions;

import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0007"}, d2 = {"isHuaMi", "", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "isBle", "isWearOS", "isRequestBond", "isLocalSportMachine", "eco-device-manager_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EcoProductExtKt {
    public static final boolean isBle(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return product.getType() == 3 || product.getType() == 2;
    }

    public static final boolean isHuaMi(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return product.getType() == 5;
    }

    public static final boolean isLocalSportMachine(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return product.getAccessType() == 1;
    }

    public static final boolean isRequestBond(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        List<String> features = product.getFeatures();
        if (features != null) {
            return features.contains(Feature.REQUEST_BOND);
        }
        return false;
    }

    public static final boolean isWearOS(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return product.getType() == 1;
    }
}
