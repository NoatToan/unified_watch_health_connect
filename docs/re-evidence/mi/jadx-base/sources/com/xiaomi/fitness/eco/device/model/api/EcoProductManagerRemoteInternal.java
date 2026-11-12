package com.xiaomi.fitness.eco.device.model.api;

import android.os.RemoteException;
import com.xiaomi.fitness.device.manager.i;
import com.xiaomi.fitness.eco.device.manager.c;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoProduct;
import defpackage.aw7;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H¦@¢\u0006\u0004\b\u0007\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/eco/device/model/api/EcoProductManagerRemoteInternal;", "Lcom/xiaomi/fitness/eco/device/manager/c$a;", "", "load", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoProduct;", "update", "<init>", "()V", "Companion", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class EcoProductManagerRemoteInternal extends c.a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/eco/device/model/api/EcoProductManagerRemoteInternal$Companion;", "", "<init>", "()V", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.xiaomi.fitness.eco.device.manager.c.a, com.xiaomi.fitness.eco.device.manager.c
    public abstract /* synthetic */ void addProductChangeListener(i iVar) throws RemoteException;

    public abstract /* synthetic */ void clear() throws RemoteException;

    public abstract /* synthetic */ EcoProduct findProduct(aw7 aw7Var) throws RemoteException;

    public abstract /* synthetic */ EcoProduct getProductByModel(String str) throws RemoteException;

    public abstract /* synthetic */ List getProductList(aw7 aw7Var) throws RemoteException;

    @Nullable
    public abstract Object load(@NotNull Continuation<? super Unit> continuation);

    @Override // com.xiaomi.fitness.eco.device.manager.c.a, com.xiaomi.fitness.eco.device.manager.c
    public abstract /* synthetic */ void removeProductChangeListener(i iVar) throws RemoteException;

    @Nullable
    public abstract Object update(@NotNull Continuation<? super List<EcoProduct>> continuation);
}
