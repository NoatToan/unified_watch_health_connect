package com.xiaomi.fitness.rn.extetions;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.device.manager.OnProductChangeListener;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.rn.export.RNProductManager;
import com.xiaomi.fitness.rn.export.bean.RNProduct;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016J$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001e\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/rn/extetions/RNProductManagerPlayImpl;", "Lcom/xiaomi/fitness/rn/export/RNProductManager;", "<init>", "()V", "update", "", CervicalMucusRecord.Appearance.CLEAR, "addProductChangeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/device/manager/OnProductChangeListener;", "removeProductChangeListener", "getProductList", "", "Lcom/xiaomi/fitness/rn/export/bean/RNProduct;", "predicate", "Lkotlin/Function1;", "", "getProductByModel", "model", "", "findProduct", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RNProductManagerPlayImpl implements RNProductManager {
    @Override // com.xiaomi.fitness.device.manager.ProductManager
    public void addProductChangeListener(@NotNull OnProductChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.xiaomi.fitness.device.manager.ProductManager
    public void clear() {
    }

    @Override // com.xiaomi.fitness.device.manager.ProductManager
    @Nullable
    public RNProduct findProduct(@NotNull Function1<? super RNProduct, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return null;
    }

    @Override // com.xiaomi.fitness.device.manager.ProductManager
    @Nullable
    public RNProduct getProductByModel(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }

    @Override // com.xiaomi.fitness.device.manager.ProductManager
    @NotNull
    public List<RNProduct> getProductList(@Nullable Function1<? super RNProduct, Boolean> predicate) {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // com.xiaomi.fitness.device.manager.ProductManager
    public void removeProductChangeListener(@NotNull OnProductChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.xiaomi.fitness.rn.export.RNProductManager
    public void update() {
    }

    @Override // com.xiaomi.fitness.device.manager.ProductManager
    public /* bridge */ /* synthetic */ Product findProduct(Function1 function1) {
        return findProduct((Function1<? super RNProduct, Boolean>) function1);
    }
}
