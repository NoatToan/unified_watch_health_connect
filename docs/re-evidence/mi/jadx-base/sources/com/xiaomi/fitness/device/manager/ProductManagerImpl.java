package com.xiaomi.fitness.device.manager;

import com.xiaomi.fitness.device.manager.bean.Product;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001e\u0010\r\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bH\u0016¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ProductManagerImpl;", "Lcom/xiaomi/fitness/device/manager/BaseProductManager;", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "<init>", "()V", "getProductList", "", "predicate", "Lkotlin/Function1;", "", "getProductByModel", "model", "", "findProduct", "Companion", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nProductManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductManagerImpl.kt\ncom/xiaomi/fitness/device/manager/ProductManagerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n1368#2:43\n1454#2,5:44\n1863#2,2:49\n1863#2,2:51\n*S KotlinDebug\n*F\n+ 1 ProductManagerImpl.kt\ncom/xiaomi/fitness/device/manager/ProductManagerImpl\n*L\n18#1:43\n18#1:44,5\n24#1:49,2\n34#1:51,2\n*E\n"})
public final class ProductManagerImpl extends BaseProductManager<Product> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final List<ProductManager<? extends Product>> managers = new ArrayList();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ProductManagerImpl$Companion;", "", "<init>", "()V", "managers", "", "Lcom/xiaomi/fitness/device/manager/ProductManager;", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "getManagers$device_manager_release", "()Ljava/util/List;", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<ProductManager<? extends Product>> getManagers$device_manager_release() {
            return ProductManagerImpl.managers;
        }
    }

    @Override // com.xiaomi.fitness.device.manager.ProductManager
    @Nullable
    public Product findProduct(@NotNull Function1<? super Product, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Iterator<T> it = managers.iterator();
        while (it.hasNext()) {
            Product productFindProduct = ((ProductManager) it.next()).findProduct(predicate);
            if (productFindProduct != null) {
                return productFindProduct;
            }
        }
        return null;
    }

    @Override // com.xiaomi.fitness.device.manager.ProductManager
    @Nullable
    public Product getProductByModel(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Iterator<T> it = managers.iterator();
        while (it.hasNext()) {
            Product productByModel = ((ProductManager) it.next()).getProductByModel(model);
            if (productByModel != null) {
                return productByModel;
            }
        }
        return null;
    }

    @Override // com.xiaomi.fitness.device.manager.ProductManager
    @NotNull
    public List<Product> getProductList(@Nullable Function1<? super Product, Boolean> predicate) {
        List<ProductManager<? extends Product>> list = managers;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, ((ProductManager) it.next()).getProductList(predicate));
        }
        return arrayList;
    }
}
