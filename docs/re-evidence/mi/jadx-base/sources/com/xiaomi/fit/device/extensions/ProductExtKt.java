package com.xiaomi.fit.device.extensions;

import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\f\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\t\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\n\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u000b\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\f\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\r\u001a\u00020\u0001*\u00020\u0002¨\u0006\u000e"}, d2 = {"isEarphone", "", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "isHuaMi", "isBle", "isBloodSugar", "isWearOS", "isDual", "isJumpScale", "isLocalSportMachine", "isRequestBond", "createBondWithoutDialog", "isSupportSppProxy", "isSupportBleProxy", "device-manager_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ProductExtKt {
    public static final boolean createBondWithoutDialog(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        List<String> features = product.getFeatures();
        if (features != null) {
            return features.contains(Feature.CREATE_BOND_WITHOUT_DIALOG);
        }
        return false;
    }

    public static final boolean isBle(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return product.getType() == 3 || product.getType() == 2;
    }

    public static final boolean isBloodSugar(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return product.getType() == 12;
    }

    public static final boolean isDual(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return product.getType() == 6 || product.getType() == 7;
    }

    public static final boolean isEarphone(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return product.getType() == 14;
    }

    public static final boolean isHuaMi(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return product.getType() == 5;
    }

    public static final boolean isJumpScale(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return product.getType() == 11;
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

    public static final boolean isSupportBleProxy(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        List<String> features = product.getFeatures();
        if (features != null) {
            return features.contains(Feature.BLE_PROXY);
        }
        return false;
    }

    public static final boolean isSupportSppProxy(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        List<String> features = product.getFeatures();
        if (features != null) {
            return features.contains(Feature.SPP_PROXY);
        }
        return false;
    }

    public static final boolean isWearOS(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return product.getType() == 1;
    }
}
