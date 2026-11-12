package com.xiaomi.fitness.rn.export;

import com.xiaomi.fitness.device.manager.ProductManager;
import com.xiaomi.fitness.rn.export.bean.RNProduct;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005J\b\u0010\u0003\u001a\u00020\u0004H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/rn/export/RNProductManager;", "Lcom/xiaomi/fitness/device/manager/ProductManager;", "Lcom/xiaomi/fitness/rn/export/bean/RNProduct;", "update", "", "Companion", "export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RNProductManager extends ProductManager<RNProduct> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/rn/export/RNProductManager$Companion;", "", "<init>", "()V", "export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void update();
}
