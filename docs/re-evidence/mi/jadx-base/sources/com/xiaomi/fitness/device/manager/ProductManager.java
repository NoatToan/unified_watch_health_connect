package com.xiaomi.fitness.device.manager;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.device.manager.bean.Product;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u0000 \u0015*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001\u0015J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J&\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH&J\u0017\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0010\u001a\u00020\u0011H&¢\u0006\u0002\u0010\u0012J#\u0010\u0013\u001a\u0004\u0018\u00018\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0002\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ProductManager;", "T", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "", CervicalMucusRecord.Appearance.CLEAR, "", "addProductChangeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/device/manager/OnProductChangeListener;", "removeProductChangeListener", "getProductList", "", "predicate", "Lkotlin/Function1;", "", "getProductByModel", "model", "", "(Ljava/lang/String;)Lcom/xiaomi/fitness/device/manager/bean/Product;", "findProduct", "(Lkotlin/jvm/functions/Function1;)Lcom/xiaomi/fitness/device/manager/bean/Product;", "Companion", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ProductManager<T extends Product> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ProductManager$Companion;", "", "<init>", "()V", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ List getProductList$default(ProductManager productManager, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getProductList");
            }
            if ((i & 1) != 0) {
                function1 = null;
            }
            return productManager.getProductList(function1);
        }
    }

    void addProductChangeListener(@NotNull OnProductChangeListener listener);

    void clear();

    @Nullable
    T findProduct(@NotNull Function1<? super T, Boolean> predicate);

    @Nullable
    T getProductByModel(@NotNull String model);

    @NotNull
    List<T> getProductList(@Nullable Function1<? super T, Boolean> predicate);

    void removeProductChangeListener(@NotNull OnProductChangeListener listener);
}
