package com.xiaomi.fitness.device.manager.remote;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.text.TextUtils;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.mi.fitness.checkupdate.ui.huami.HuamiUpgradeFragment;
import com.miui.tsmclient.database.DatabaseConstants;
import com.xiaomi.fit.device.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.IOExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.device.manager.DevicePreference;
import com.xiaomi.fitness.device.manager.api.DeviceRequest;
import com.xiaomi.fitness.device.manager.api.model.ProductListData;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import com.xiaomi.fitness.device.manager.i;
import com.xiaomi.fitness.device.manager.k;
import com.xiaomi.fitness.device.manager.remote.ProductManagerRemoteImpl;
import com.xiaomi.fitness.device.model.api.ProductManagerRemoteInternal;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 K2\u00020\u0001:\u0001KB\u0019\b\u0007\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00105\u001a\u000204¢\u0006\u0004\bI\u0010JJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u0004*\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u0004*\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u0015J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00180\u001fH\u0096@¢\u0006\u0004\b\u0010\u0010\u001dJ\u000f\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b \u0010\u0017J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b%\u0010$J\u001f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u001f2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b)\u0010*J\u0019\u0010,\u001a\u0004\u0018\u00010(2\u0006\u0010+\u001a\u00020\u0002H\u0016¢\u0006\u0004\b,\u0010-J\u001b\u0010.\u001a\u0004\u0018\u00010(2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u000eH\u0016¢\u0006\u0004\b0\u0010\u0017R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R&\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020(078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0018\u0010<\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001b\u0010C\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010\u0017R\u0016\u0010D\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020!0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006L"}, d2 = {"Lcom/xiaomi/fitness/device/manager/remote/ProductManagerRemoteImpl;", "Lcom/xiaomi/fitness/device/model/api/ProductManagerRemoteInternal;", "", "locale", "", "loadProductsFromFile", "(Ljava/lang/String;)V", "getFilePath", "(Ljava/lang/String;)Ljava/lang/String;", "", "getLastModifyTime", "()J", "Lcom/xiaomi/fitness/device/manager/api/model/ProductListData;", "data", "", "reset", "update", "(Lcom/xiaomi/fitness/device/manager/api/model/ProductListData;Z)V", "saveProducts", "(Lcom/xiaomi/fitness/device/manager/api/model/ProductListData;)V", "notifyProductChange", "()V", "isNeedUpdateLastModifyTime", "()Z", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "mergeAndroidFeature", "(Lcom/xiaomi/fitness/device/manager/bean/Product;)V", "mergeFeature", "load", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", CervicalMucusRecord.Appearance.CLEAR, "", "hasProduct", "Lcom/xiaomi/fitness/device/manager/i;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addProductChangeListener", "(Lcom/xiaomi/fitness/device/manager/i;)V", "removeProductChangeListener", "Lcom/xiaomi/fitness/device/manager/k;", "predicate", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableProduct;", "getProductList", "(Lcom/xiaomi/fitness/device/manager/k;)Ljava/util/List;", "model", "getProductByModel", "(Ljava/lang/String;)Lcom/xiaomi/fitness/device/manager/export/bean/WearableProduct;", "findProduct", "(Lcom/xiaomi/fitness/device/manager/k;)Lcom/xiaomi/fitness/device/manager/export/bean/WearableProduct;", "isProductNotEmpty", "Lcom/xiaomi/fitness/device/manager/api/DeviceRequest;", "mDeviceRequest", "Lcom/xiaomi/fitness/device/manager/api/DeviceRequest;", "Lcom/google/gson/Gson;", "mGson", "Lcom/google/gson/Gson;", "Ljava/util/concurrent/ConcurrentHashMap;", "mProducts", "Ljava/util/concurrent/ConcurrentHashMap;", "getMProducts$device_manager_chinaProductRelease", "()Ljava/util/concurrent/ConcurrentHashMap;", "lastRegion", "Ljava/lang/String;", "isNeedLoadFromAsset", "Z", "needUpdateLastModifyTime$delegate", "Lkotlin/Lazy;", "getNeedUpdateLastModifyTime", "needUpdateLastModifyTime", "mLastModifyTime", "J", "Landroid/os/RemoteCallbackList;", "mChangeListeners", "Landroid/os/RemoteCallbackList;", "<init>", "(Lcom/xiaomi/fitness/device/manager/api/DeviceRequest;Lcom/google/gson/Gson;)V", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nProductManagerRemoteImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductManagerRemoteImpl.kt\ncom/xiaomi/fitness/device/manager/remote/ProductManagerRemoteImpl\n+ 2 FileUtils.kt\ncom/xiaomi/fitness/common/utils/FileUtils\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ListExt.kt\ncom/xiaomi/fitness/common/extensions/ListExtKt\n*L\n1#1,268:1\n524#2,5:269\n1863#3,2:274\n1863#3,2:295\n1863#3,2:297\n90#4,19:276\n*S KotlinDebug\n*F\n+ 1 ProductManagerRemoteImpl.kt\ncom/xiaomi/fitness/device/manager/remote/ProductManagerRemoteImpl\n*L\n96#1:269,5\n165#1:274,2\n198#1:295,2\n212#1:297,2\n187#1:276,19\n*E\n"})
public final class ProductManagerRemoteImpl extends ProductManagerRemoteInternal {

    @NotNull
    private static final String CONFIG_DIR = "config";
    public static final int KEY_PRODUCT_MANAGER_BINDER = 6;
    private boolean isNeedLoadFromAsset;

    @Nullable
    private String lastRegion;

    @NotNull
    private final RemoteCallbackList<i> mChangeListeners;

    @NotNull
    private DeviceRequest mDeviceRequest;

    @NotNull
    private Gson mGson;
    private long mLastModifyTime;

    @NotNull
    private final ConcurrentHashMap<String, WearableProduct> mProducts;

    /* JADX INFO: renamed from: needUpdateLastModifyTime$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy needUpdateLastModifyTime;

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.remote.ProductManagerRemoteImpl$clear$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.remote.ProductManagerRemoteImpl$clear$1", f = "ProductManagerRemoteImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FileUtils.INSTANCE.deleteFile(new File(ApplicationExtKt.getApplication().getFilesDir(), "config"));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.remote.ProductManagerRemoteImpl$load$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.remote.ProductManagerRemoteImpl", f = "ProductManagerRemoteImpl.kt", i = {}, l = {84}, m = "load", n = {}, s = {})
    public static final class C19571 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C19571(Continuation<? super C19571> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProductManagerRemoteImpl.this.load(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.remote.ProductManagerRemoteImpl$saveProducts$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.remote.ProductManagerRemoteImpl$saveProducts$1", f = "ProductManagerRemoteImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C19581 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ProductListData $data;
        int label;
        final /* synthetic */ ProductManagerRemoteImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19581(ProductListData productListData, ProductManagerRemoteImpl productManagerRemoteImpl, Continuation<? super C19581> continuation) {
            super(2, continuation);
            this.$data = productListData;
            this.this$0 = productManagerRemoteImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C19581(this.$data, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$data.setDataList(this.this$0.getProductList(null));
            List<WearableProduct> dataList = this.$data.getDataList();
            DeviceModelExtKt.logi("saveProducts() called with: data = " + (dataList != null ? Boxing.boxInt(dataList.size()) : null));
            FileUtils fileUtils = FileUtils.INSTANCE;
            String filePath = this.this$0.getFilePath(LocaleUtil.getCurrentLocale());
            String json = this.this$0.mGson.toJson(this.$data);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            fileUtils.writeStrToFile(filePath, json);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.remote.ProductManagerRemoteImpl$update$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.remote.ProductManagerRemoteImpl", f = "ProductManagerRemoteImpl.kt", i = {0}, l = {113}, m = "update", n = {"this"}, s = {"L$0"})
    public static final class C19591 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C19591(Continuation<? super C19591> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProductManagerRemoteImpl.this.update(this);
        }
    }

    public ProductManagerRemoteImpl(@NotNull DeviceRequest mDeviceRequest, @NotNull Gson mGson) {
        Intrinsics.checkNotNullParameter(mDeviceRequest, "mDeviceRequest");
        Intrinsics.checkNotNullParameter(mGson, "mGson");
        this.mDeviceRequest = mDeviceRequest;
        this.mGson = mGson;
        this.mProducts = new ConcurrentHashMap<>();
        this.lastRegion = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion();
        boolean z = true;
        this.isNeedLoadFromAsset = true;
        this.needUpdateLastModifyTime = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: pbi
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(ProductManagerRemoteImpl.needUpdateLastModifyTime_delegate$lambda$0(this.f30208a));
            }
        });
        this.mChangeListeners = new RemoteCallbackList<>();
        if (!TextUtils.isEmpty(this.lastRegion) && !Intrinsics.areEqual(this.lastRegion, "cn")) {
            z = false;
        }
        this.isNeedLoadFromAsset = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getFilePath(String locale) {
        File filesDir = ApplicationExtKt.getApplication().getFilesDir();
        String str = File.separator;
        return filesDir + str + "config" + str + DatabaseConstants.CACHE_KEY_PRODUCT_PREFFIX + locale + ".json";
    }

    private final long getLastModifyTime() {
        DevicePreference devicePreference = DevicePreference.INSTANCE;
        String app_latest_version_name = devicePreference.getAPP_LATEST_VERSION_NAME();
        String versionName = AppUtil.getVersionName();
        devicePreference.setAPP_LATEST_VERSION_NAME(versionName);
        if (Intrinsics.areEqual(app_latest_version_name, versionName)) {
            return this.mLastModifyTime;
        }
        return 0L;
    }

    private final boolean getNeedUpdateLastModifyTime() {
        return ((Boolean) this.needUpdateLastModifyTime.getValue()).booleanValue();
    }

    private final boolean isNeedUpdateLastModifyTime() {
        String currentLocale = LocaleUtil.getCurrentLocale();
        DevicePreference devicePreference = DevicePreference.INSTANCE;
        if (Intrinsics.areEqual(currentLocale, devicePreference.getLAST_LOCALE())) {
            return true;
        }
        devicePreference.setLAST_LOCALE(currentLocale);
        return false;
    }

    private final void loadProductsFromFile(String locale) {
        FileUtils fileUtils = FileUtils.INSTANCE;
        Gson gson = this.mGson;
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(getFilePath(locale)));
        try {
            Object objFromJson = gson.fromJson((Reader) inputStreamReader, (Class<Object>) ProductListData.class);
            IOExtKt.closeSilently(fileUtils, inputStreamReader);
            update((ProductListData) objFromJson, true);
        } catch (Throwable th) {
            IOExtKt.closeSilently(fileUtils, inputStreamReader);
            throw th;
        }
    }

    private final void mergeAndroidFeature(Product product) {
        StringBuilder sb = new StringBuilder();
        sb.append(product.getProductId());
        sb.append(",start mergeAndroidFeature,");
        if (product.getAndroidFeature() != null) {
            if (product.getFeatures() == null) {
                product.setFeatures(new ArrayList());
                sb.append("feature size 0,");
            }
            List<String> features = product.getFeatures();
            Intrinsics.checkNotNull(features);
            List<String> androidFeature = product.getAndroidFeature();
            Intrinsics.checkNotNull(androidFeature);
            features.addAll(androidFeature);
            sb.append("android feature list size:");
            List<String> androidFeature2 = product.getAndroidFeature();
            Intrinsics.checkNotNull(androidFeature2);
            sb.append(androidFeature2.size());
            sb.append(",");
            List<String> androidFeature3 = product.getAndroidFeature();
            Intrinsics.checkNotNull(androidFeature3);
            androidFeature3.clear();
            product.setAndroidFeature(null);
        }
        sb.append(HuamiUpgradeFragment.DONE_TAG);
        Logger.i("ProductModel:" + ((Object) sb), new Object[0]);
    }

    private final void mergeFeature(Product product) {
        StringBuilder sb = new StringBuilder();
        sb.append(product.getProductId());
        sb.append(",start mergeFeature,");
        if (product.getWhitelistFeature() != null) {
            if (product.getFeatures() == null) {
                product.setFeatures(new ArrayList());
                sb.append("feature size 0,");
            }
            List<String> features = product.getFeatures();
            Intrinsics.checkNotNull(features);
            List<String> whitelistFeature = product.getWhitelistFeature();
            Intrinsics.checkNotNull(whitelistFeature);
            features.addAll(whitelistFeature);
            sb.append("white list size:");
            List<String> whitelistFeature2 = product.getWhitelistFeature();
            Intrinsics.checkNotNull(whitelistFeature2);
            sb.append(whitelistFeature2.size());
            sb.append(",");
            List<String> whitelistFeature3 = product.getWhitelistFeature();
            Intrinsics.checkNotNull(whitelistFeature3);
            whitelistFeature3.clear();
            product.setWhitelistFeature(null);
        }
        sb.append(HuamiUpgradeFragment.DONE_TAG);
        Logger.i("ProductModel:" + ((Object) sb), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean needUpdateLastModifyTime_delegate$lambda$0(ProductManagerRemoteImpl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.isNeedUpdateLastModifyTime();
    }

    private final void notifyProductChange() {
        RemoteCallbackList<i> remoteCallbackList = this.mChangeListeners;
        try {
            try {
                try {
                    int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i = 0; i < iBeginBroadcast; i++) {
                        try {
                            IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                            Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                            ((i) broadcastItem).onRemoteChange();
                        } catch (Exception e) {
                            Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                } catch (Exception e2) {
                    Logger.e("An exception occurred during RemoteCallbackList forEach", e2);
                    remoteCallbackList.finishBroadcast();
                }
            } catch (Throwable th) {
                try {
                    remoteCallbackList.finishBroadcast();
                } catch (Exception e3) {
                    Logger.e("An exception occurred when finishBroadcast", e3);
                }
                throw th;
            }
        } catch (Exception e4) {
            Logger.e("An exception occurred when finishBroadcast", e4);
        }
    }

    private final void saveProducts(ProductListData data) {
        AnyExtKt.io$default(null, new C19581(data, this, null), 1, null);
    }

    @Override // com.xiaomi.fitness.device.model.api.ProductManagerRemoteInternal, com.xiaomi.fitness.device.manager.j.a, com.xiaomi.fitness.device.manager.j
    public void addProductChangeListener(@NotNull i listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mChangeListeners.register(listener);
    }

    @Override // com.xiaomi.fitness.device.model.api.ProductManagerRemoteInternal, com.xiaomi.fitness.device.manager.j
    public void clear() {
        this.mProducts.clear();
        this.mLastModifyTime = 0L;
        AnyExtKt.io$default(null, new AnonymousClass1(null), 1, null);
    }

    @Override // com.xiaomi.fitness.device.model.api.ProductManagerRemoteInternal, com.xiaomi.fitness.device.manager.j
    @Nullable
    public synchronized WearableProduct findProduct(@Nullable k predicate) {
        Collection<WearableProduct> collectionValues = this.mProducts.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        for (WearableProduct wearableProduct : collectionValues) {
            if (predicate == null || predicate.predicate(wearableProduct)) {
                return wearableProduct;
            }
        }
        return null;
    }

    @NotNull
    public final ConcurrentHashMap<String, WearableProduct> getMProducts$device_manager_chinaProductRelease() {
        return this.mProducts;
    }

    @Override // com.xiaomi.fitness.device.model.api.ProductManagerRemoteInternal, com.xiaomi.fitness.device.manager.j
    @Nullable
    public WearableProduct getProductByModel(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return this.mProducts.get(model);
    }

    @Override // com.xiaomi.fitness.device.model.api.ProductManagerRemoteInternal, com.xiaomi.fitness.device.manager.j
    @NotNull
    public synchronized List<WearableProduct> getProductList(@Nullable k predicate) {
        try {
            if (predicate == null) {
                Collection<WearableProduct> collectionValues = this.mProducts.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
                return CollectionsKt___CollectionsKt.toList(collectionValues);
            }
            ArrayList arrayList = new ArrayList();
            Collection<WearableProduct> collectionValues2 = this.mProducts.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues2, "<get-values>(...)");
            for (WearableProduct wearableProduct : collectionValues2) {
                if (predicate.predicate(wearableProduct)) {
                    Intrinsics.checkNotNull(wearableProduct);
                    arrayList.add(wearableProduct);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.xiaomi.fitness.device.model.api.ProductManagerRemoteInternal
    public boolean hasProduct() {
        File file = new File(getFilePath(LocaleUtil.getCurrentLocale()));
        return file.exists() && file.length() > 0;
    }

    @Override // com.xiaomi.fitness.device.model.api.ProductManagerRemoteInternal, com.xiaomi.fitness.device.manager.j
    public boolean isProductNotEmpty() {
        return !this.mProducts.isEmpty();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.xiaomi.fitness.device.model.api.ProductManagerRemoteInternal
    @Nullable
    public Object load(@NotNull Continuation<? super Unit> continuation) {
        C19571 c19571;
        if (continuation instanceof C19571) {
            c19571 = (C19571) continuation;
            int i = c19571.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c19571.label = i - Integer.MIN_VALUE;
            } else {
                c19571 = new C19571(continuation);
            }
        } else {
            c19571 = new C19571(continuation);
        }
        Object obj = c19571.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c19571.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceModelExtKt.logi("app create loadFromAsset:" + this.isNeedLoadFromAsset);
                String currentLocale = LocaleUtil.getCurrentLocale();
                try {
                    loadProductsFromFile(currentLocale);
                } catch (JsonSyntaxException e) {
                    DeviceModelExtKt.loge("load() called with JsonSyntaxException " + RomUtils.isXiaomi());
                    if (RegionPreference.INSTANCE.getPRIVACY_AGREE()) {
                        if (RomUtils.isXiaomi()) {
                            ProductReporterKt.reportProductSyntax(getFilePath(currentLocale), e.getMessage());
                        }
                        c19571.label = 1;
                        if (update(c19571) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                } catch (Exception e2) {
                    DeviceModelExtKt.loge("load local error", e2);
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e3) {
            DeviceModelExtKt.loge("load() update request exception " + e3.getMessage());
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.device.model.api.ProductManagerRemoteInternal, com.xiaomi.fitness.device.manager.j.a, com.xiaomi.fitness.device.manager.j
    public void removeProductChangeListener(@NotNull i listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mChangeListeners.unregister(listener);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.xiaomi.fitness.device.model.api.ProductManagerRemoteInternal
    @Nullable
    public Object update(@NotNull Continuation<? super List<? extends Product>> continuation) {
        C19591 c19591;
        ProductManagerRemoteImpl productManagerRemoteImpl;
        if (continuation instanceof C19591) {
            c19591 = (C19591) continuation;
            int i = c19591.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c19591.label = i - Integer.MIN_VALUE;
            } else {
                c19591 = new C19591(continuation);
            }
        } else {
            c19591 = new C19591(continuation);
        }
        Object productByCategory = c19591.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c19591.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(productByCategory);
            DeviceRequest deviceRequest = this.mDeviceRequest;
            long lastModifyTime = getLastModifyTime();
            c19591.L$0 = this;
            c19591.label = 1;
            productByCategory = deviceRequest.getProductByCategory(lastModifyTime, c19591);
            if (productByCategory == coroutine_suspended) {
                return coroutine_suspended;
            }
            productManagerRemoteImpl = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            productManagerRemoteImpl = (ProductManagerRemoteImpl) c19591.L$0;
            ResultKt.throwOnFailure(productByCategory);
        }
        productManagerRemoteImpl.update((ProductListData) productByCategory, false);
        return productManagerRemoteImpl.getProductList(null);
    }

    private final void update(ProductListData data, boolean reset) {
        long lastModifyTime = data.getLastModifyTime();
        boolean needUpdateLastModifyTime = getNeedUpdateLastModifyTime();
        List<WearableProduct> dataList = data.getDataList();
        DeviceModelExtKt.logi("update products " + lastModifyTime + ". needUpdateLastModifyTime=" + needUpdateLastModifyTime + ", reset=" + reset + ", data=" + (dataList != null ? Integer.valueOf(dataList.size()) : null));
        if (getNeedUpdateLastModifyTime()) {
            this.mLastModifyTime = data.getLastModifyTime();
        }
        List<WearableProduct> dataList2 = data.getDataList();
        if (reset) {
            this.mProducts.clear();
        }
        List<WearableProduct> list = dataList2;
        boolean z = list == null || list.isEmpty();
        DeviceModelExtKt.logi("The size of product list is " + z + ", and mProducts are " + this.mProducts);
        if (z) {
            return;
        }
        boolean productWhiteListSwitch = DevicePreference.INSTANCE.getProductWhiteListSwitch();
        Intrinsics.checkNotNull(dataList2);
        for (WearableProduct wearableProduct : dataList2) {
            if (productWhiteListSwitch) {
                mergeFeature(wearableProduct);
            }
            mergeAndroidFeature(wearableProduct);
            this.mProducts.put(wearableProduct.getModel(), wearableProduct);
        }
        notifyProductChange();
        saveProducts(data);
    }
}
