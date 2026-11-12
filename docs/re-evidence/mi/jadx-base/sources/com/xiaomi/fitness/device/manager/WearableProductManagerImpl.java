package com.xiaomi.fitness.device.manager;

import android.os.IBinder;
import android.os.RemoteException;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.WearableProductManagerImpl;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.add.DeviceInfo;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import com.xiaomi.fitness.device.manager.extensions.DeviceExtKt;
import com.xiaomi.fitness.device.model.api.ProductManagerInternal;
import com.xiaomi.fitness.service.BinderDelegate;
import com.xiaomi.fitness.service.ServiceConnector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b+\u0010\nJ\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ+\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001a\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR/\u0010'\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000b0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/device/manager/WearableProductManagerImpl;", "Lcom/xiaomi/fitness/device/model/api/ProductManagerInternal;", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "", "canAccess", "(Lcom/xiaomi/fitness/device/manager/bean/Product;)Z", "validStatus", "filter", "", CervicalMucusRecord.Appearance.CLEAR, "()V", "Lcom/xiaomi/fitness/device/manager/OnProductChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addProductChangeListener", "(Lcom/xiaomi/fitness/device/manager/OnProductChangeListener;)V", "removeProductChangeListener", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableProduct;", "predicate", "", "getProductList", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "", "model", "getProductByModel", "(Ljava/lang/String;)Lcom/xiaomi/fitness/device/manager/export/bean/WearableProduct;", "findProduct", "(Lkotlin/jvm/functions/Function1;)Lcom/xiaomi/fitness/device/manager/export/bean/WearableProduct;", "Lcom/xiaomi/fitness/device/manager/export/add/DeviceInfo;", "getDeviceInfoList", "()Ljava/util/List;", "Lcom/xiaomi/fitness/device/manager/j;", "<set-?>", "mRemoteProductManager$delegate", "Lcom/xiaomi/fitness/service/BinderDelegate;", "getMRemoteProductManager", "()Lcom/xiaomi/fitness/device/manager/j;", "setMRemoteProductManager", "(Lcom/xiaomi/fitness/device/manager/j;)V", "mRemoteProductManager", "", "mChangeListeners", "Ljava/util/List;", "<init>", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nWearableProductManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WearableProductManagerImpl.kt\ncom/xiaomi/fitness/device/manager/WearableProductManagerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,109:1\n1863#2,2:110\n*S KotlinDebug\n*F\n+ 1 WearableProductManagerImpl.kt\ncom/xiaomi/fitness/device/manager/WearableProductManagerImpl\n*L\n87#1:110,2\n*E\n"})
public final class WearableProductManagerImpl extends ProductManagerInternal {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(WearableProductManagerImpl.class, "mRemoteProductManager", "getMRemoteProductManager()Lcom/xiaomi/fitness/device/manager/ProductManagerRemote;", 0))};

    @NotNull
    private final List<OnProductChangeListener> mChangeListeners;

    /* JADX INFO: renamed from: mRemoteProductManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final BinderDelegate mRemoteProductManager = new BinderDelegate("mRemoteProductManager");

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.WearableProductManagerImpl$addProductChangeListener$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.WearableProductManagerImpl$addProductChangeListener$1", f = "WearableProductManagerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OnProductChangeListener $listener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OnProductChangeListener onProductChangeListener, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$listener = onProductChangeListener;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WearableProductManagerImpl.this.new AnonymousClass1(this.$listener, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WearableProductManagerImpl.this.mChangeListeners.add(this.$listener);
            j mRemoteProductManager = WearableProductManagerImpl.this.getMRemoteProductManager();
            if (mRemoteProductManager != null && mRemoteProductManager.isProductNotEmpty()) {
                this.$listener.onChange();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.WearableProductManagerImpl$removeProductChangeListener$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.WearableProductManagerImpl$removeProductChangeListener$1", f = "WearableProductManagerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C19141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OnProductChangeListener $listener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19141(OnProductChangeListener onProductChangeListener, Continuation<? super C19141> continuation) {
            super(2, continuation);
            this.$listener = onProductChangeListener;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WearableProductManagerImpl.this.new C19141(this.$listener, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WearableProductManagerImpl.this.mChangeListeners.remove(this.$listener);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public WearableProductManagerImpl() {
        ArrayList arrayList = new ArrayList();
        this.mChangeListeners = arrayList;
        final OnProductChangeListenerAdapter onProductChangeListenerAdapter = new OnProductChangeListenerAdapter(arrayList);
        ServiceConnector.INSTANCE.getBinder(6, new Function1() { // from class: e8r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WearableProductManagerImpl._init_$lambda$0(this.f16395a, onProductChangeListenerAdapter, (IBinder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(WearableProductManagerImpl this$0, OnProductChangeListenerAdapter changeListener, IBinder iBinder) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(changeListener, "$changeListener");
        this$0.setMRemoteProductManager(j.a.asInterface(iBinder));
        j mRemoteProductManager = this$0.getMRemoteProductManager();
        if (mRemoteProductManager != null) {
            mRemoteProductManager.addProductChangeListener(changeListener);
        }
        return Unit.INSTANCE;
    }

    private final boolean canAccess(Product product) {
        return product.getAccessType() == 0 || product.getAccessType() == 1;
    }

    private final boolean filter(Product product) {
        return (DeviceExtKt.isEcg(product) || DeviceModelExtKt.isLibai(product)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j getMRemoteProductManager() {
        return (j) this.mRemoteProductManager.getValue((Object) this, $$delegatedProperties[0]);
    }

    private final void setMRemoteProductManager(j jVar) {
        this.mRemoteProductManager.setValue((Object) this, $$delegatedProperties[0], jVar);
    }

    private final boolean validStatus(Product product) {
        return product.getStatus() == 3 || product.getStatus() == 1;
    }

    @Override // com.xiaomi.fitness.device.manager.BaseProductManager, com.xiaomi.fitness.device.manager.ProductManager
    public void addProductChangeListener(@NotNull OnProductChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("ProductManagerImpl addProductChangeListener " + getMRemoteProductManager());
        AnyExtKt.main$default(null, new AnonymousClass1(listener, null), 1, null);
    }

    @Override // com.xiaomi.fitness.device.manager.BaseProductManager, com.xiaomi.fitness.device.manager.ProductManager
    public void clear() throws RemoteException {
        j mRemoteProductManager = getMRemoteProductManager();
        if (mRemoteProductManager != null) {
            mRemoteProductManager.clear();
        }
    }

    @Override // com.xiaomi.fitness.device.manager.ProductManager
    public /* bridge */ /* synthetic */ Product findProduct(Function1 function1) {
        return findProduct((Function1<? super WearableProduct, Boolean>) function1);
    }

    @Override // com.xiaomi.fitness.device.model.api.ProductManagerInternal
    @NotNull
    public List<DeviceInfo> getDeviceInfoList() {
        ArrayList arrayList = new ArrayList();
        for (WearableProduct wearableProduct : getProductList(null)) {
            if (canAccess(wearableProduct) && validStatus(wearableProduct) && filter(wearableProduct)) {
                arrayList.add(DeviceExtKt.toDeviceInfo(wearableProduct));
            }
        }
        return arrayList;
    }

    @Override // com.xiaomi.fitness.device.manager.ProductManager
    @NotNull
    public List<WearableProduct> getProductList(@Nullable final Function1<? super WearableProduct, Boolean> predicate) {
        List<WearableProduct> productList;
        Logger.i("getProductList:" + (getMRemoteProductManager() == null), new Object[0]);
        j mRemoteProductManager = getMRemoteProductManager();
        return (mRemoteProductManager == null || (productList = mRemoteProductManager.getProductList(new k.a() { // from class: com.xiaomi.fitness.device.manager.WearableProductManagerImpl.getProductList.1
            @Override // com.xiaomi.fitness.device.manager.k
            public boolean predicate(WearableProduct p) {
                Intrinsics.checkNotNullParameter(p, "p");
                Logger.i("predicate", new Object[0]);
                Function1<WearableProduct, Boolean> function1 = predicate;
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
        AnyExtKt.main$default(null, new C19141(listener, null), 1, null);
    }

    @Override // com.xiaomi.fitness.device.manager.ProductManager
    @Nullable
    public WearableProduct findProduct(@NotNull final Function1<? super WearableProduct, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        j mRemoteProductManager = getMRemoteProductManager();
        if (mRemoteProductManager != null) {
            return mRemoteProductManager.findProduct(new k.a() { // from class: com.xiaomi.fitness.device.manager.WearableProductManagerImpl.findProduct.1
                @Override // com.xiaomi.fitness.device.manager.k
                public boolean predicate(WearableProduct p) {
                    Intrinsics.checkNotNullParameter(p, "p");
                    return predicate.invoke2(p).booleanValue();
                }
            });
        }
        return null;
    }

    @Override // com.xiaomi.fitness.device.manager.ProductManager
    @Nullable
    public WearableProduct getProductByModel(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        j mRemoteProductManager = getMRemoteProductManager();
        if (mRemoteProductManager != null) {
            return mRemoteProductManager.getProductByModel(model);
        }
        return null;
    }
}
