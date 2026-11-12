package com.xiaomi.fitness.rn;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.smarthome.core.modelconfig.PluginDeviceManager;
import com.xiaomi.fitness.device.manager.OnProductChangeListener;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.rn.export.RNProductManager;
import com.xiaomi.fitness.rn.export.bean.RNProduct;
import com.xiaomi.smarthome.core.server.internal.CoreError;
import defpackage.sbq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016J$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001e\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\f\u0010\u0015\u001a\u00020\r*\u00020\u0016H\u0002¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/rn/RNProductManagerImpl;", "Lcom/xiaomi/fitness/rn/export/RNProductManager;", "<init>", "()V", "update", "", CervicalMucusRecord.Appearance.CLEAR, "addProductChangeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/device/manager/OnProductChangeListener;", "removeProductChangeListener", "getProductList", "", "Lcom/xiaomi/fitness/rn/export/bean/RNProduct;", "predicate", "Lkotlin/Function1;", "", "getProductByModel", "model", "", "findProduct", "toProduct", "Lcom/smarthome/core/modelconfig/PluginDeviceInfo;", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRNProductManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RNProductManagerImpl.kt\ncom/xiaomi/fitness/rn/RNProductManagerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,94:1\n1863#2,2:95\n1863#2,2:97\n*S KotlinDebug\n*F\n+ 1 RNProductManagerImpl.kt\ncom/xiaomi/fitness/rn/RNProductManagerImpl\n*L\n46#1:95,2\n68#1:97,2\n*E\n"})
public final class RNProductManagerImpl implements RNProductManager {
    private final RNProduct toProduct(PluginDeviceInfo pluginDeviceInfo) {
        RNProduct rNProduct = new RNProduct();
        rNProduct.setSmallIcon(pluginDeviceInfo.h());
        rNProduct.setIotSubCategoryId(Integer.valueOf(pluginDeviceInfo.u()));
        rNProduct.setProductName(pluginDeviceInfo.o());
        rNProduct.setProductId(pluginDeviceInfo.q());
        rNProduct.setBigIcon(pluginDeviceInfo.i());
        rNProduct.setBigIcon3(pluginDeviceInfo.i());
        String strE = pluginDeviceInfo.e();
        rNProduct.setBigPreview((strE == null || strE.length() == 0) ? pluginDeviceInfo.i() : pluginDeviceInfo.e());
        rNProduct.setAppVersion(pluginDeviceInfo.k());
        rNProduct.setAccessType(pluginDeviceInfo.r());
        rNProduct.setModel(pluginDeviceInfo.l());
        rNProduct.setRssiArray(CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(pluginDeviceInfo.a())));
        rNProduct.setCategory(pluginDeviceInfo.c());
        rNProduct.setType(13);
        return rNProduct;
    }

    @Override // com.xiaomi.fitness.device.manager.ProductManager
    public void addProductChangeListener(@NotNull OnProductChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.xiaomi.fitness.device.manager.ProductManager
    public void clear() {
        PluginDeviceManager.INSTANCE.getInstance().clearConfig();
    }

    @Override // com.xiaomi.fitness.device.manager.ProductManager
    public /* bridge */ /* synthetic */ Product findProduct(Function1 function1) {
        return findProduct((Function1<? super RNProduct, Boolean>) function1);
    }

    @Override // com.xiaomi.fitness.device.manager.ProductManager
    @NotNull
    public List<RNProduct> getProductList(@Nullable Function1<? super RNProduct, Boolean> predicate) {
        ArrayList arrayList = new ArrayList();
        for (PluginDeviceInfo pluginDeviceInfo : PluginDeviceManager.INSTANCE.getInstance().getPluginInfoMap().values()) {
            if (!Intrinsics.areEqual(pluginDeviceInfo.l(), "yunmai.scales.ms3001")) {
                RNProduct product = toProduct(pluginDeviceInfo);
                if (predicate == null) {
                    arrayList.add(product);
                } else if (predicate.invoke2(product).booleanValue()) {
                    arrayList.add(product);
                }
            }
        }
        return arrayList;
    }

    @Override // com.xiaomi.fitness.device.manager.ProductManager
    public void removeProductChangeListener(@NotNull OnProductChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.xiaomi.fitness.rn.export.RNProductManager
    public void update() {
        PluginDeviceManager.INSTANCE.getInstance().updateConfig(true, new sbq() { // from class: com.xiaomi.fitness.rn.RNProductManagerImpl.update.1
            @Override // defpackage.sbq
            public void onFailure(CoreError error) {
                StringBuilder sb = new StringBuilder();
                sb.append("onFailure: ");
                sb.append(error);
            }

            @Override // defpackage.sbq
            public void onSuccess(boolean deviceListChanged, boolean developerListChanged) {
                StringBuilder sb = new StringBuilder();
                sb.append("Icon");
                sb.append(deviceListChanged);
            }
        });
    }

    @Override // com.xiaomi.fitness.device.manager.ProductManager
    @Nullable
    public RNProduct findProduct(@NotNull Function1<? super RNProduct, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Iterator<T> it = PluginDeviceManager.INSTANCE.getInstance().getPluginInfoMap().values().iterator();
        RNProduct rNProduct = null;
        while (it.hasNext()) {
            RNProduct product = toProduct((PluginDeviceInfo) it.next());
            if (predicate.invoke2(product).booleanValue()) {
                rNProduct = product;
            }
        }
        return rNProduct;
    }

    @Override // com.xiaomi.fitness.device.manager.ProductManager
    @Nullable
    public RNProduct getProductByModel(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        PluginDeviceInfo pluginInfo = PluginDeviceManager.INSTANCE.getInstance().getPluginInfo(model);
        if (pluginInfo != null) {
            return toProduct(pluginInfo);
        }
        return null;
    }
}
