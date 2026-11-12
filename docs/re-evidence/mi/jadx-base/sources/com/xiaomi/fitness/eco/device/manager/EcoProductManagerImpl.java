package com.xiaomi.fitness.eco.device.manager;

import android.os.IBinder;
import android.os.RemoteException;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.device.manager.OnProductChangeListener;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceModelExtKt;
import com.xiaomi.fitness.eco.device.manager.EcoProductManagerImpl;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoAddDeviceInfo;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoProduct;
import com.xiaomi.fitness.eco.device.manager.extensions.EcoDeviceExtKt;
import com.xiaomi.fitness.eco.device.manager.extensions.EcoInstanceExtKt;
import com.xiaomi.fitness.eco.device.model.api.EcoProductManagerInternal;
import com.xiaomi.fitness.eco.device.model.api.EcoProductManagerRemoteInternal;
import com.xiaomi.fitness.service.BinderDelegate;
import com.xiaomi.fitness.service.ServiceConnector;
import defpackage.aw7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b(\u0010\nJ\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ+\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001a\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR/\u0010'\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/EcoProductManagerImpl;", "Lcom/xiaomi/fitness/eco/device/model/api/EcoProductManagerInternal;", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "", "canAccess", "(Lcom/xiaomi/fitness/device/manager/bean/Product;)Z", "validStatus", "filter", "", CervicalMucusRecord.Appearance.CLEAR, "()V", "Lcom/xiaomi/fitness/device/manager/OnProductChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addProductChangeListener", "(Lcom/xiaomi/fitness/device/manager/OnProductChangeListener;)V", "removeProductChangeListener", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoProduct;", "predicate", "", "getProductList", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "", "model", "getProductByModel", "(Ljava/lang/String;)Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoProduct;", "findProduct", "(Lkotlin/jvm/functions/Function1;)Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoProduct;", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoAddDeviceInfo;", "getDeviceInfoList", "()Ljava/util/List;", "Lcom/xiaomi/fitness/eco/device/manager/c;", "<set-?>", "mRemoteProductManager$delegate", "Lcom/xiaomi/fitness/service/BinderDelegate;", "getMRemoteProductManager", "()Lcom/xiaomi/fitness/eco/device/manager/c;", "setMRemoteProductManager", "(Lcom/xiaomi/fitness/eco/device/manager/c;)V", "mRemoteProductManager", "<init>", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEcoProductManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoProductManagerImpl.kt\ncom/xiaomi/fitness/eco/device/manager/EcoProductManagerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,105:1\n1863#2,2:106\n*S KotlinDebug\n*F\n+ 1 EcoProductManagerImpl.kt\ncom/xiaomi/fitness/eco/device/manager/EcoProductManagerImpl\n*L\n82#1:106,2\n*E\n"})
public final class EcoProductManagerImpl extends EcoProductManagerInternal {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(EcoProductManagerImpl.class, "mRemoteProductManager", "getMRemoteProductManager()Lcom/xiaomi/fitness/eco/device/manager/EcoProductManagerRemote;", 0))};

    /* JADX INFO: renamed from: mRemoteProductManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final BinderDelegate mRemoteProductManager = new BinderDelegate("mEcoRemoteProductManager");

    public EcoProductManagerImpl() {
        if (ApplicationExtKt.isSameProcess(ApplicationExtKt.getApplication(), ":device")) {
            setMRemoteProductManager(EcoInstanceExtKt.getInstance(EcoProductManagerRemoteInternal.INSTANCE));
        } else {
            ServiceConnector.INSTANCE.getBinder(60, new Function1() { // from class: yv7
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return EcoProductManagerImpl._init_$lambda$0(this.f40606a, (IBinder) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(EcoProductManagerImpl this$0, IBinder iBinder) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setMRemoteProductManager(c.a.asInterface(iBinder));
        return Unit.INSTANCE;
    }

    private final boolean canAccess(Product product) {
        return product.getAccessType() == 0 || product.getAccessType() == 1;
    }

    private final boolean filter(Product product) {
        return (product.getType() == 4 || DeviceModelExtKt.isLibai(product)) ? false : true;
    }

    private final c getMRemoteProductManager() {
        return (c) this.mRemoteProductManager.getValue((Object) this, $$delegatedProperties[0]);
    }

    private final void setMRemoteProductManager(c cVar) {
        this.mRemoteProductManager.setValue((Object) this, $$delegatedProperties[0], cVar);
    }

    private final boolean validStatus(Product product) {
        return product.getStatus() == 3 || product.getStatus() == 1;
    }

    @Override // com.xiaomi.fitness.device.manager.BaseProductManager, com.xiaomi.fitness.device.manager.ProductManager
    public void addProductChangeListener(@NotNull OnProductChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        EcoDeviceModelExtKt.logi("EcoProductManagerImpl addProductChangeListener " + getMRemoteProductManager());
    }

    @Override // com.xiaomi.fitness.device.manager.BaseProductManager, com.xiaomi.fitness.device.manager.ProductManager
    public void clear() throws RemoteException {
        c mRemoteProductManager = getMRemoteProductManager();
        if (mRemoteProductManager != null) {
            mRemoteProductManager.clear();
        }
    }

    @Override // com.xiaomi.fitness.device.manager.ProductManager
    public /* bridge */ /* synthetic */ Product findProduct(Function1 function1) {
        return findProduct((Function1<? super EcoProduct, Boolean>) function1);
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.EcoProductManager
    @NotNull
    public List<EcoAddDeviceInfo> getDeviceInfoList() {
        ArrayList arrayList = new ArrayList();
        for (EcoProduct ecoProduct : getProductList(null)) {
            if (canAccess(ecoProduct) && validStatus(ecoProduct) && filter(ecoProduct)) {
                arrayList.add(EcoDeviceExtKt.toEcoAddDeviceInfo(ecoProduct));
            }
        }
        return arrayList;
    }

    @Override // com.xiaomi.fitness.device.manager.ProductManager
    @NotNull
    public List<EcoProduct> getProductList(@Nullable final Function1<? super EcoProduct, Boolean> predicate) {
        List<EcoProduct> productList;
        c mRemoteProductManager = getMRemoteProductManager();
        return (mRemoteProductManager == null || (productList = mRemoteProductManager.getProductList(new aw7.a() { // from class: com.xiaomi.fitness.eco.device.manager.EcoProductManagerImpl.getProductList.1
            @Override // defpackage.aw7
            public boolean predicate(EcoProduct p) {
                Intrinsics.checkNotNullParameter(p, "p");
                Function1<EcoProduct, Boolean> function1 = predicate;
                if (function1 != null) {
                    return function1.invoke2(p).booleanValue();
                }
                return true;
            }
        })) == null) ? CollectionsKt__CollectionsKt.emptyList() : productList;
    }

    @Override // com.xiaomi.fitness.device.manager.BaseProductManager, com.xiaomi.fitness.device.manager.ProductManager
    public void removeProductChangeListener(@NotNull OnProductChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.xiaomi.fitness.device.manager.ProductManager
    @Nullable
    public EcoProduct findProduct(@NotNull final Function1<? super EcoProduct, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        c mRemoteProductManager = getMRemoteProductManager();
        if (mRemoteProductManager != null) {
            return mRemoteProductManager.findProduct(new aw7.a() { // from class: com.xiaomi.fitness.eco.device.manager.EcoProductManagerImpl.findProduct.1
                @Override // defpackage.aw7
                public boolean predicate(EcoProduct p) {
                    Intrinsics.checkNotNullParameter(p, "p");
                    return predicate.invoke2(p).booleanValue();
                }
            });
        }
        return null;
    }

    @Override // com.xiaomi.fitness.device.manager.ProductManager
    @Nullable
    public EcoProduct getProductByModel(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        c mRemoteProductManager = getMRemoteProductManager();
        if (mRemoteProductManager != null) {
            return mRemoteProductManager.getProductByModel(model);
        }
        return null;
    }
}
