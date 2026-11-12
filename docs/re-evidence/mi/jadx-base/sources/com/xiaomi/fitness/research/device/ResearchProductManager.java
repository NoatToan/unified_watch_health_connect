package com.xiaomi.fitness.research.device;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fitness.common.extensions.GsonExtKt;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.WearableProductManager;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import com.xiaomi.fitness.research.device.ResearchProductManager;
import com.xiaomi.fitness.service.BinderDelegate;
import com.xiaomi.fitness.service.ServiceConnector;
import defpackage.lbi;
import defpackage.qbi;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR/\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/research/device/ResearchProductManager;", "Lcom/xiaomi/fitness/device/manager/export/WearableProductManager;", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableProduct;", "", "predicate", "", "getProductList", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "", "model", "getProductByModel", "(Ljava/lang/String;)Lcom/xiaomi/fitness/device/manager/export/bean/WearableProduct;", "findProduct", "(Lkotlin/jvm/functions/Function1;)Lcom/xiaomi/fitness/device/manager/export/bean/WearableProduct;", "Llbi;", "<set-?>", "mProductInfoFetcher$delegate", "Lcom/xiaomi/fitness/service/BinderDelegate;", "getMProductInfoFetcher", "()Llbi;", "setMProductInfoFetcher", "(Llbi;)V", "mProductInfoFetcher", "<init>", "()V", "Companion", "research-support_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nResearchProductManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResearchProductManager.kt\ncom/xiaomi/fitness/research/device/ResearchProductManager\n+ 2 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n*L\n1#1,56:1\n63#2:57\n53#2,7:58\n63#2:65\n53#2,7:66\n*S KotlinDebug\n*F\n+ 1 ResearchProductManager.kt\ncom/xiaomi/fitness/research/device/ResearchProductManager\n*L\n45#1:57\n45#1:58,7\n54#1:65\n54#1:66,7\n*E\n"})
public final class ResearchProductManager extends WearableProductManager {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(ResearchProductManager.class, "mProductInfoFetcher", "getMProductInfoFetcher()Lcom/xiaomi/fitness/research/ProductInfoFetcher;", 0))};
    public static final int PRODUCT_FETCHER_BINDER_CODE = 502;

    /* JADX INFO: renamed from: mProductInfoFetcher$delegate, reason: from kotlin metadata */
    @NotNull
    private final BinderDelegate mProductInfoFetcher = new BinderDelegate("ProductInfoFetcher");

    public ResearchProductManager() {
        ServiceConnector.INSTANCE.getBinder(502, new Function1() { // from class: ppk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ResearchProductManager._init_$lambda$0(this.f30619a, (IBinder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(ResearchProductManager this$0, IBinder iBinder) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setMProductInfoFetcher(lbi.a.asInterface(iBinder));
        return Unit.INSTANCE;
    }

    private final lbi getMProductInfoFetcher() {
        return (lbi) this.mProductInfoFetcher.getValue((Object) this, $$delegatedProperties[0]);
    }

    private final void setMProductInfoFetcher(lbi lbiVar) {
        this.mProductInfoFetcher.setValue((Object) this, $$delegatedProperties[0], lbiVar);
    }

    @Override // com.xiaomi.fitness.device.manager.ProductManager
    public /* bridge */ /* synthetic */ Product findProduct(Function1 function1) {
        return findProduct((Function1<? super WearableProduct, Boolean>) function1);
    }

    @Override // com.xiaomi.fitness.device.manager.ProductManager
    @NotNull
    public List<WearableProduct> getProductList(@Nullable final Function1<? super WearableProduct, Boolean> predicate) throws RemoteException {
        List<WearableProduct> list;
        String productList = null;
        if (predicate == null) {
            lbi mProductInfoFetcher = getMProductInfoFetcher();
            if (mProductInfoFetcher != null) {
                productList = mProductInfoFetcher.getProductList(null);
            }
        } else {
            lbi mProductInfoFetcher2 = getMProductInfoFetcher();
            if (mProductInfoFetcher2 != null) {
                productList = mProductInfoFetcher2.getProductList(new qbi.a() { // from class: com.xiaomi.fitness.research.device.ResearchProductManager$getProductList$products$1
                    @Override // defpackage.qbi
                    public boolean predicate(String p) {
                        Intrinsics.checkNotNullParameter(p, "p");
                        Function1<WearableProduct, Boolean> function1 = predicate;
                        GsonBuilder gsonBuilder = new GsonBuilder();
                        gsonBuilder.excludeFieldsWithModifiers(8, 128).enableComplexMapKeySerialization().serializeNulls().serializeSpecialFloatingPointValues().setLenient();
                        Gson gsonCreate = gsonBuilder.create();
                        Intrinsics.checkNotNullExpressionValue(gsonCreate, "create(...)");
                        return function1.invoke2((WearableProduct) gsonCreate.fromJson(p, new TypeToken<WearableProduct>() { // from class: com.xiaomi.fitness.research.device.ResearchProductManager$getProductList$products$1$predicate$$inlined$jsonToBean$1
                        }.getType())).booleanValue();
                    }
                });
            }
        }
        return (productList == null || (list = GsonExtKt.toList(productList, WearableProduct.class)) == null) ? CollectionsKt__CollectionsKt.emptyList() : list;
    }

    @Override // com.xiaomi.fitness.device.manager.ProductManager
    @Nullable
    public WearableProduct findProduct(@NotNull final Function1<? super WearableProduct, Boolean> predicate) {
        String strFindProduct;
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        lbi mProductInfoFetcher = getMProductInfoFetcher();
        if (mProductInfoFetcher == null || (strFindProduct = mProductInfoFetcher.findProduct(new qbi.a() { // from class: com.xiaomi.fitness.research.device.ResearchProductManager.findProduct.1
            @Override // defpackage.qbi
            public boolean predicate(String p) {
                Intrinsics.checkNotNullParameter(p, "p");
                Function1<WearableProduct, Boolean> function1 = predicate;
                GsonBuilder gsonBuilder = new GsonBuilder();
                gsonBuilder.excludeFieldsWithModifiers(8, 128).enableComplexMapKeySerialization().serializeNulls().serializeSpecialFloatingPointValues().setLenient();
                Gson gsonCreate = gsonBuilder.create();
                Intrinsics.checkNotNullExpressionValue(gsonCreate, "create(...)");
                return function1.invoke2((WearableProduct) gsonCreate.fromJson(p, new TypeToken<WearableProduct>() { // from class: com.xiaomi.fitness.research.device.ResearchProductManager$findProduct$1$predicate$$inlined$jsonToBean$1
                }.getType())).booleanValue();
            }
        })) == null) {
            return null;
        }
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.excludeFieldsWithModifiers(8, 128).enableComplexMapKeySerialization().serializeNulls().serializeSpecialFloatingPointValues().setLenient();
        Gson gsonCreate = gsonBuilder.create();
        Intrinsics.checkNotNullExpressionValue(gsonCreate, "create(...)");
        return (WearableProduct) gsonCreate.fromJson(strFindProduct, new TypeToken<WearableProduct>() { // from class: com.xiaomi.fitness.research.device.ResearchProductManager$findProduct$$inlined$jsonToBean$1
        }.getType());
    }

    @Override // com.xiaomi.fitness.device.manager.ProductManager
    @Nullable
    public WearableProduct getProductByModel(@NotNull String model) {
        String productByModel;
        Intrinsics.checkNotNullParameter(model, "model");
        lbi mProductInfoFetcher = getMProductInfoFetcher();
        if (mProductInfoFetcher == null || (productByModel = mProductInfoFetcher.getProductByModel(model)) == null) {
            return null;
        }
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.excludeFieldsWithModifiers(8, 128).enableComplexMapKeySerialization().serializeNulls().serializeSpecialFloatingPointValues().setLenient();
        Gson gsonCreate = gsonBuilder.create();
        Intrinsics.checkNotNullExpressionValue(gsonCreate, "create(...)");
        return (WearableProduct) gsonCreate.fromJson(productByModel, new TypeToken<WearableProduct>() { // from class: com.xiaomi.fitness.research.device.ResearchProductManager$getProductByModel$$inlined$jsonToBean$1
        }.getType());
    }
}
