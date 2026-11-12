package com.xiaomi.fitness.device.model.api;

import android.os.RemoteException;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import com.xiaomi.fitness.device.manager.i;
import com.xiaomi.fitness.device.manager.j;
import com.xiaomi.fitness.device.manager.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H¦@¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/device/model/api/ProductManagerRemoteInternal;", "Lcom/xiaomi/fitness/device/manager/j$a;", "", "load", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "update", "", "hasProduct", "()Z", "<init>", "()V", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class ProductManagerRemoteInternal extends j.a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/device/model/api/ProductManagerRemoteInternal$Companion;", "", "<init>", "()V", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.xiaomi.fitness.device.manager.j.a, com.xiaomi.fitness.device.manager.j
    public abstract /* synthetic */ void addProductChangeListener(i iVar) throws RemoteException;

    public abstract /* synthetic */ void clear() throws RemoteException;

    public abstract /* synthetic */ WearableProduct findProduct(k kVar) throws RemoteException;

    public abstract /* synthetic */ WearableProduct getProductByModel(String str) throws RemoteException;

    public abstract /* synthetic */ List getProductList(k kVar) throws RemoteException;

    public abstract boolean hasProduct();

    public abstract /* synthetic */ boolean isProductNotEmpty() throws RemoteException;

    @Nullable
    public abstract Object load(@NotNull Continuation<? super Unit> continuation);

    @Override // com.xiaomi.fitness.device.manager.j.a, com.xiaomi.fitness.device.manager.j
    public abstract /* synthetic */ void removeProductChangeListener(i iVar) throws RemoteException;

    @Nullable
    public abstract Object update(@NotNull Continuation<? super List<? extends Product>> continuation);
}
