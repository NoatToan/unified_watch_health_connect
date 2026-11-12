package com.xiaomi.fitness.eco.device.manager.remote;

import android.app.Application;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.Gson;
import com.mi.fitness.checkupdate.ui.huami.HuamiUpgradeFragment;
import com.miui.tsmclient.database.DatabaseConstants;
import com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.IOExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.AssetUtil;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.device.manager.i;
import com.xiaomi.fitness.eco.device.manager.EcoDevicePreference;
import com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest;
import com.xiaomi.fitness.eco.device.manager.api.model.EcoProductListData;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoProduct;
import com.xiaomi.fitness.eco.device.manager.remote.EcoProductManagerRemoteImpl;
import com.xiaomi.fitness.eco.device.model.api.EcoProductManagerRemoteInternal;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import defpackage.aw7;
import defpackage.h4b;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
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
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 I2\u00020\u0001:\u0001IB\u0019\b\u0007\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00103\u001a\u000202¢\u0006\u0004\bG\u0010HJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0004*\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u0004*\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00190 H\u0096@¢\u0006\u0004\b\u0011\u0010\u001eJ\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b%\u0010$J\u001f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00190 2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J\u0019\u0010+\u001a\u0004\u0018\u00010\u00192\u0006\u0010*\u001a\u00020\u0002H\u0016¢\u0006\u0004\b+\u0010,J\u001b\u0010-\u001a\u0004\u0018\u00010\u00192\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R&\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0019058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0018\u0010:\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u001b\u0010A\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010\u0018R\u0016\u0010B\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020!0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006J"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/remote/EcoProductManagerRemoteImpl;", "Lcom/xiaomi/fitness/eco/device/model/api/EcoProductManagerRemoteInternal;", "", "locale", "", "loadProductsFromAssets", "(Ljava/lang/String;)V", "loadProductsFromFile", "getFilePath", "(Ljava/lang/String;)Ljava/lang/String;", "", "getLastModifyTime", "()J", "Lcom/xiaomi/fitness/eco/device/manager/api/model/EcoProductListData;", "data", "", "reset", "update", "(Lcom/xiaomi/fitness/eco/device/manager/api/model/EcoProductListData;Z)V", "saveProducts", "(Lcom/xiaomi/fitness/eco/device/manager/api/model/EcoProductListData;)V", "notifyProductChange", "()V", "isNeedUpdateLastModifyTime", "()Z", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoProduct;", "mergeAndroidFeature", "(Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoProduct;)V", "mergeFeature", "load", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", CervicalMucusRecord.Appearance.CLEAR, "", "Lcom/xiaomi/fitness/device/manager/i;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addProductChangeListener", "(Lcom/xiaomi/fitness/device/manager/i;)V", "removeProductChangeListener", "Law7;", "predicate", "getProductList", "(Law7;)Ljava/util/List;", "model", "getProductByModel", "(Ljava/lang/String;)Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoProduct;", "findProduct", "(Law7;)Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoProduct;", "Lcom/xiaomi/fitness/eco/device/manager/api/EcoDeviceRequest;", "mDeviceRequest", "Lcom/xiaomi/fitness/eco/device/manager/api/EcoDeviceRequest;", "Lcom/google/gson/Gson;", "mGson", "Lcom/google/gson/Gson;", "Ljava/util/concurrent/ConcurrentHashMap;", "mProducts", "Ljava/util/concurrent/ConcurrentHashMap;", "getMProducts$eco_device_manager_chinaProductRelease", "()Ljava/util/concurrent/ConcurrentHashMap;", "lastRegion", "Ljava/lang/String;", "isNeedLoadFromAsset", "Z", "needUpdateLastModifyTime$delegate", "Lkotlin/Lazy;", "getNeedUpdateLastModifyTime", "needUpdateLastModifyTime", "mLastModifyTime", "J", "Landroid/os/RemoteCallbackList;", "mChangeListeners", "Landroid/os/RemoteCallbackList;", "<init>", "(Lcom/xiaomi/fitness/eco/device/manager/api/EcoDeviceRequest;Lcom/google/gson/Gson;)V", "Companion", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEcoProductManagerRemoteImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoProductManagerRemoteImpl.kt\ncom/xiaomi/fitness/eco/device/manager/remote/EcoProductManagerRemoteImpl\n+ 2 AssetUtil.kt\ncom/xiaomi/fitness/common/utils/AssetUtil\n+ 3 FileUtils.kt\ncom/xiaomi/fitness/common/utils/FileUtils\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ListExt.kt\ncom/xiaomi/fitness/common/extensions/ListExtKt\n*L\n1#1,245:1\n59#2,5:246\n524#3,5:251\n1863#4,2:256\n1863#4,2:277\n1863#4,2:279\n90#5,19:258\n*S KotlinDebug\n*F\n+ 1 EcoProductManagerRemoteImpl.kt\ncom/xiaomi/fitness/eco/device/manager/remote/EcoProductManagerRemoteImpl\n*L\n76#1:246,5\n85#1:251,5\n147#1:256,2\n179#1:277,2\n193#1:279,2\n168#1:258,19\n*E\n"})
public final class EcoProductManagerRemoteImpl extends EcoProductManagerRemoteInternal {

    @NotNull
    private static final String CONFIG_DIR = "eco_config";
    public static final int KEY_PRODUCT_MANAGER_BINDER = 60;
    private boolean isNeedLoadFromAsset;

    @Nullable
    private String lastRegion;

    @NotNull
    private final RemoteCallbackList<i> mChangeListeners;

    @NotNull
    private EcoDeviceRequest mDeviceRequest;

    @NotNull
    private Gson mGson;
    private long mLastModifyTime;

    @NotNull
    private final ConcurrentHashMap<String, EcoProduct> mProducts;

    /* JADX INFO: renamed from: needUpdateLastModifyTime$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy needUpdateLastModifyTime;

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.remote.EcoProductManagerRemoteImpl$clear$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.remote.EcoProductManagerRemoteImpl$clear$1", f = "EcoProductManagerRemoteImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcoProductManagerRemoteImpl.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FileUtils.INSTANCE.deleteFile(new File(ApplicationExtKt.getApplication().getFilesDir(), EcoProductManagerRemoteImpl.CONFIG_DIR));
            EcoProductManagerRemoteImpl.this.loadProductsFromAssets(LocaleUtil.getCurrentLocale());
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.remote.EcoProductManagerRemoteImpl$saveProducts$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.remote.EcoProductManagerRemoteImpl$saveProducts$1", f = "EcoProductManagerRemoteImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22821 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ EcoProductListData $data;
        int label;
        final /* synthetic */ EcoProductManagerRemoteImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22821(EcoProductListData ecoProductListData, EcoProductManagerRemoteImpl ecoProductManagerRemoteImpl, Continuation<? super C22821> continuation) {
            super(2, continuation);
            this.$data = ecoProductListData;
            this.this$0 = ecoProductManagerRemoteImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C22821(this.$data, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$data.setDataList(this.this$0.getProductList(null));
            FileUtils fileUtils = FileUtils.INSTANCE;
            String filePath = this.this$0.getFilePath(LocaleUtil.getCurrentLocale());
            String json = this.this$0.mGson.toJson(this.$data);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            fileUtils.writeStrToFile(filePath, json);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.remote.EcoProductManagerRemoteImpl$update$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.remote.EcoProductManagerRemoteImpl", f = "EcoProductManagerRemoteImpl.kt", i = {0}, l = {103}, m = "update", n = {"this"}, s = {"L$0"})
    public static final class C22831 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C22831(Continuation<? super C22831> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EcoProductManagerRemoteImpl.this.update(this);
        }
    }

    public EcoProductManagerRemoteImpl(@NotNull EcoDeviceRequest mDeviceRequest, @NotNull Gson mGson) {
        Intrinsics.checkNotNullParameter(mDeviceRequest, "mDeviceRequest");
        Intrinsics.checkNotNullParameter(mGson, "mGson");
        this.mDeviceRequest = mDeviceRequest;
        this.mGson = mGson;
        this.mProducts = new ConcurrentHashMap<>();
        this.lastRegion = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion();
        boolean z = true;
        this.isNeedLoadFromAsset = true;
        this.needUpdateLastModifyTime = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: zv7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(EcoProductManagerRemoteImpl.needUpdateLastModifyTime_delegate$lambda$0(this.f41711a));
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
        return filesDir + str + CONFIG_DIR + str + DatabaseConstants.CACHE_KEY_PRODUCT_PREFFIX + locale + ".json";
    }

    private final long getLastModifyTime() {
        EcoDevicePreference ecoDevicePreference = EcoDevicePreference.INSTANCE;
        String app_latest_version_name = ecoDevicePreference.getAPP_LATEST_VERSION_NAME();
        String versionName = AppUtil.getVersionName();
        ecoDevicePreference.setAPP_LATEST_VERSION_NAME(versionName);
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
        EcoDevicePreference ecoDevicePreference = EcoDevicePreference.INSTANCE;
        if (Intrinsics.areEqual(currentLocale, ecoDevicePreference.getLAST_LOCALE())) {
            return true;
        }
        ecoDevicePreference.setLAST_LOCALE(currentLocale);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadProductsFromAssets(String locale) {
        try {
            if (this.isNeedLoadFromAsset) {
                AssetUtil assetUtil = AssetUtil.INSTANCE;
                Application application = ApplicationExtKt.getApplication();
                Gson gson = this.mGson;
                InputStreamReader inputStreamReader = new InputStreamReader(application.getAssets().open(getFilePath(locale)));
                try {
                    Object objFromJson = gson.fromJson((Reader) inputStreamReader, (Class<Object>) EcoProductListData.class);
                    IOExtKt.closeSilently(assetUtil, inputStreamReader);
                    update((EcoProductListData) objFromJson, true);
                } catch (Throwable th) {
                    IOExtKt.closeSilently(assetUtil, inputStreamReader);
                    throw th;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private final void loadProductsFromFile(String locale) {
        FileUtils fileUtils = FileUtils.INSTANCE;
        Gson gson = this.mGson;
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(getFilePath(locale)));
        try {
            Object objFromJson = gson.fromJson((Reader) inputStreamReader, (Class<Object>) EcoProductListData.class);
            IOExtKt.closeSilently(fileUtils, inputStreamReader);
            update((EcoProductListData) objFromJson, true);
        } catch (Throwable th) {
            IOExtKt.closeSilently(fileUtils, inputStreamReader);
            throw th;
        }
    }

    private final void mergeAndroidFeature(EcoProduct ecoProduct) {
        StringBuilder sb = new StringBuilder();
        sb.append(ecoProduct.getProductId());
        sb.append(",start mergeAndroidFeature,");
        if (ecoProduct.getAndroidFeature() != null) {
            if (ecoProduct.getFeatures() == null) {
                ecoProduct.setFeatures(new ArrayList());
                sb.append("feature size 0,");
            }
            List<String> features = ecoProduct.getFeatures();
            Intrinsics.checkNotNull(features);
            List<String> androidFeature = ecoProduct.getAndroidFeature();
            Intrinsics.checkNotNull(androidFeature);
            features.addAll(androidFeature);
            sb.append("android feature list size:");
            List<String> androidFeature2 = ecoProduct.getAndroidFeature();
            Intrinsics.checkNotNull(androidFeature2);
            sb.append(androidFeature2.size());
            sb.append(",");
            List<String> androidFeature3 = ecoProduct.getAndroidFeature();
            Intrinsics.checkNotNull(androidFeature3);
            androidFeature3.clear();
            ecoProduct.setAndroidFeature(null);
        }
        sb.append(HuamiUpgradeFragment.DONE_TAG);
        Logger.i("ProductModel:" + ((Object) sb), new Object[0]);
    }

    private final void mergeFeature(EcoProduct ecoProduct) {
        StringBuilder sb = new StringBuilder();
        sb.append(ecoProduct.getProductId());
        sb.append(",start mergeFeature,");
        if (ecoProduct.getWhitelistFeature() != null) {
            if (ecoProduct.getFeatures() == null) {
                ecoProduct.setFeatures(new ArrayList());
                sb.append("feature size 0,");
            }
            List<String> features = ecoProduct.getFeatures();
            Intrinsics.checkNotNull(features);
            List<String> whitelistFeature = ecoProduct.getWhitelistFeature();
            Intrinsics.checkNotNull(whitelistFeature);
            features.addAll(whitelistFeature);
            sb.append("white list size:");
            List<String> whitelistFeature2 = ecoProduct.getWhitelistFeature();
            Intrinsics.checkNotNull(whitelistFeature2);
            sb.append(whitelistFeature2.size());
            sb.append(",");
            List<String> whitelistFeature3 = ecoProduct.getWhitelistFeature();
            Intrinsics.checkNotNull(whitelistFeature3);
            whitelistFeature3.clear();
            ecoProduct.setWhitelistFeature(null);
        }
        sb.append(HuamiUpgradeFragment.DONE_TAG);
        Logger.i("ProductModel:" + ((Object) sb), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean needUpdateLastModifyTime_delegate$lambda$0(EcoProductManagerRemoteImpl this$0) {
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

    private final void saveProducts(EcoProductListData data) {
        AnyExtKt.io$default(null, new C22821(data, this, null), 1, null);
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoProductManagerRemoteInternal, com.xiaomi.fitness.eco.device.manager.c.a, com.xiaomi.fitness.eco.device.manager.c
    public void addProductChangeListener(@NotNull i listener) throws RemoteException {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mChangeListeners.register(listener);
        if (!this.mProducts.isEmpty()) {
            listener.onRemoteChange();
        }
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoProductManagerRemoteInternal, com.xiaomi.fitness.eco.device.manager.c
    public void clear() {
        this.mProducts.clear();
        this.mLastModifyTime = 0L;
        AnyExtKt.io$default(null, new AnonymousClass1(null), 1, null);
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoProductManagerRemoteInternal, com.xiaomi.fitness.eco.device.manager.c
    @Nullable
    public synchronized EcoProduct findProduct(@Nullable aw7 predicate) {
        Collection<EcoProduct> collectionValues = this.mProducts.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        for (EcoProduct ecoProduct : collectionValues) {
            if (predicate == null || predicate.predicate(ecoProduct)) {
                return ecoProduct;
            }
        }
        return null;
    }

    @NotNull
    public final ConcurrentHashMap<String, EcoProduct> getMProducts$eco_device_manager_chinaProductRelease() {
        return this.mProducts;
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoProductManagerRemoteInternal, com.xiaomi.fitness.eco.device.manager.c
    @Nullable
    public EcoProduct getProductByModel(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return this.mProducts.get(model);
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoProductManagerRemoteInternal, com.xiaomi.fitness.eco.device.manager.c
    @NotNull
    public synchronized List<EcoProduct> getProductList(@Nullable aw7 predicate) {
        try {
            if (predicate == null) {
                Collection<EcoProduct> collectionValues = this.mProducts.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
                return CollectionsKt___CollectionsKt.toList(collectionValues);
            }
            ArrayList arrayList = new ArrayList();
            Collection<EcoProduct> collectionValues2 = this.mProducts.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues2, "<get-values>(...)");
            for (EcoProduct ecoProduct : collectionValues2) {
                if (predicate.predicate(ecoProduct)) {
                    Intrinsics.checkNotNull(ecoProduct);
                    arrayList.add(ecoProduct);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoProductManagerRemoteInternal
    @Nullable
    public Object load(@NotNull Continuation<? super Unit> continuation) {
        EcoDeviceModelExtKt.logd("app create loadFromAsset:" + this.isNeedLoadFromAsset);
        String currentLocale = LocaleUtil.getCurrentLocale();
        try {
            loadProductsFromFile(currentLocale);
        } catch (Exception unused) {
            loadProductsFromAssets(currentLocale);
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoProductManagerRemoteInternal, com.xiaomi.fitness.eco.device.manager.c.a, com.xiaomi.fitness.eco.device.manager.c
    public void removeProductChangeListener(@NotNull i listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mChangeListeners.unregister(listener);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.xiaomi.fitness.eco.device.model.api.EcoProductManagerRemoteInternal
    @Nullable
    public Object update(@NotNull Continuation<? super List<EcoProduct>> continuation) {
        C22831 c22831;
        EcoProductManagerRemoteImpl ecoProductManagerRemoteImpl;
        if (continuation instanceof C22831) {
            c22831 = (C22831) continuation;
            int i = c22831.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22831.label = i - Integer.MIN_VALUE;
            } else {
                c22831 = new C22831(continuation);
            }
        } else {
            c22831 = new C22831(continuation);
        }
        Object productByCategory = c22831.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c22831.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(productByCategory);
            EcoDeviceRequest ecoDeviceRequest = this.mDeviceRequest;
            long lastModifyTime = getLastModifyTime();
            c22831.L$0 = this;
            c22831.label = 1;
            productByCategory = ecoDeviceRequest.getProductByCategory(lastModifyTime, c22831);
            if (productByCategory == coroutine_suspended) {
                return coroutine_suspended;
            }
            ecoProductManagerRemoteImpl = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ecoProductManagerRemoteImpl = (EcoProductManagerRemoteImpl) c22831.L$0;
            ResultKt.throwOnFailure(productByCategory);
        }
        EcoProductListData ecoProductListData = (EcoProductListData) productByCategory;
        EcoDeviceModelExtKt.logi("get config :" + h4b.c(ecoProductListData));
        ecoProductManagerRemoteImpl.update(ecoProductListData, false);
        return ecoProductManagerRemoteImpl.getProductList(null);
    }

    private final void update(EcoProductListData data, boolean reset) {
        EcoDeviceModelExtKt.logi("update products " + data.getLastModifyTime() + ". needUpdateLastModifyTime=" + getNeedUpdateLastModifyTime() + ", reset=" + reset);
        if (getNeedUpdateLastModifyTime()) {
            this.mLastModifyTime = data.getLastModifyTime();
        }
        List<EcoProduct> dataList = data.getDataList();
        if (reset) {
            this.mProducts.clear();
        }
        List<EcoProduct> list = dataList;
        boolean z = list == null || list.isEmpty();
        EcoDeviceModelExtKt.logi("The size of product list is " + z + ", and mProducts are " + h4b.c(this.mProducts.values()));
        if (z) {
            return;
        }
        boolean productWhiteListSwitch = EcoDevicePreference.INSTANCE.getProductWhiteListSwitch();
        Intrinsics.checkNotNull(dataList);
        for (EcoProduct ecoProduct : dataList) {
            if (productWhiteListSwitch) {
                mergeFeature(ecoProduct);
            }
            mergeAndroidFeature(ecoProduct);
            this.mProducts.put(ecoProduct.getModel(), ecoProduct);
        }
        notifyProductChange();
        saveProducts(data);
    }
}
