package com.xiaomi.fitness.research.device;

import com.xiaomi.fitness.common.extensions.GsonExtKt;
import com.xiaomi.fitness.device.manager.ProductManager;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableProductManager;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import com.xiaomi.fitness.research.device.ProductInfoFetcherImpl;
import defpackage.lbi;
import defpackage.qbi;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/research/device/ProductInfoFetcherImpl;", "Llbi$a;", "", "model", "getProductByModel", "(Ljava/lang/String;)Ljava/lang/String;", "Lqbi;", "predicate", "getProductList", "(Lqbi;)Ljava/lang/String;", "findProduct", "", "getVersion", "()I", "Lcom/xiaomi/fitness/device/manager/export/WearableProductManager;", "mProductManager$delegate", "Lkotlin/Lazy;", "getMProductManager", "()Lcom/xiaomi/fitness/device/manager/export/WearableProductManager;", "mProductManager", "<init>", "()V", "research-support_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ProductInfoFetcherImpl extends lbi.a {

    /* JADX INFO: renamed from: mProductManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mProductManager = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: obi
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ProductInfoFetcherImpl.mProductManager_delegate$lambda$0();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean findProduct$lambda$2(qbi predicate, WearableProduct it) {
        Intrinsics.checkNotNullParameter(predicate, "$predicate");
        Intrinsics.checkNotNullParameter(it, "it");
        return predicate.predicate(GsonExtKt.toJson(it));
    }

    private final WearableProductManager getMProductManager() {
        return (WearableProductManager) this.mProductManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getProductList$lambda$1(qbi qbiVar, WearableProduct it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return qbiVar.predicate(GsonExtKt.toJson(it));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableProductManager mProductManager_delegate$lambda$0() {
        return DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE);
    }

    @Override // defpackage.lbi
    @Nullable
    public String findProduct(@NotNull final qbi predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return GsonExtKt.toJson(getMProductManager().findProduct(new Function1() { // from class: nbi
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(ProductInfoFetcherImpl.findProduct$lambda$2(predicate, (WearableProduct) obj));
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lbi
    @Nullable
    public String getProductByModel(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        WearableProduct wearableProduct = (WearableProduct) getMProductManager().getProductByModel(model);
        if (wearableProduct != null) {
            return GsonExtKt.toJson(wearableProduct);
        }
        return null;
    }

    @Override // defpackage.lbi
    @Nullable
    public String getProductList(@Nullable final qbi predicate) {
        return predicate == null ? GsonExtKt.toJson(ProductManager.DefaultImpls.getProductList$default(getMProductManager(), null, 1, null)) : GsonExtKt.toJson(getMProductManager().getProductList(new Function1() { // from class: mbi
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(ProductInfoFetcherImpl.getProductList$lambda$1(predicate, (WearableProduct) obj));
            }
        }));
    }

    @Override // defpackage.lbi
    public int getVersion() {
        return 0;
    }
}
