package com.xiaomi.fitness.device.manager.ui.scan;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import com.xiaomi.fit.device.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.handler.JobHandlerProvider;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableProductManager;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import com.xiaomi.fitness.device.manager.export.scan.BleDevice;
import com.xiaomi.fitness.device.manager.ui.scan.ScanManager;
import com.xiaomi.fitness.device.manager.ui.scan.recognize.BeaconRecognizer;
import com.xiaomi.fitness.device.manager.ui.scan.recognize.LocalBeaconRecognizer;
import com.xiaomi.fitness.device.manager.ui.scan.recognize.NameRecognizer;
import com.xiaomi.fitness.device.manager.ui.scan.recognize.Recognizer;
import com.xiaomi.fitness.mijia.sdk.api.MiJiaBleScanCallback;
import com.xiaomi.fitness.mijia.sdk.data.AdvPacket;
import com.xiaomi.fitness.mijia.sdk.data.MiJiaScanDevice;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import com.xiaomi.fitness.rn.export.RNDeviceModel;
import com.xiaomi.fitness.rn.export.RNProductManager;
import com.xiaomi.fitness.rn.export.bean.RNProduct;
import com.xiaomi.fitness.rn.export.extensions.RNDeviceManagerExtKt;
import com.xiaomi.fitness.rn.extetions.ProductExtKt;
import com.xiaomi.fitness.rn.sdk.MiJiaSDKCompat;
import defpackage.s33;
import defpackage.sbl;
import defpackage.ydl;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import no.nordicsemi.android.support.v18.scanner.ScanResult;
import no.nordicsemi.android.support.v18.scanner.ScanSettings;
import no.nordicsemi.android.support.v18.scanner.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b:\u0010\rJ3\u0010\n\u001a\u00020\t2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J4\u0010\u0018\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0002\b\u0016¢\u0006\u0004\b\u0018\u0010\u0019J@\u0010\u001e\u001a\u00020\t2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00122\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJT\u0010\"\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00122\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00122\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0002\b\u0016¢\u0006\u0004\b\"\u0010#JT\u0010$\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00122\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00122\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0002\b\u0016¢\u0006\u0004\b$\u0010#J<\u0010%\u001a\u00020\t2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u00032\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b%\u0010&J<\u0010'\u001a\u00020\t2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u00032\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b'\u0010&J\r\u0010(\u001a\u00020\t¢\u0006\u0004\b(\u0010\rJ&\u0010)\u001a\u00020\t2\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0002\b\u0016¢\u0006\u0004\b)\u0010*R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001b\u00109\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010-\u001a\u0004\b8\u0010/¨\u0006;"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/scan/ScanManager;", "", "", "Lcom/xiaomi/fitness/device/manager/ui/scan/recognize/Recognizer;", "recognizers", "Lno/nordicsemi/android/support/v18/scanner/ScanResult;", "result", "Lcom/xiaomi/fitness/device/manager/ui/scan/SearchCallback;", "callback", "", "recognizeSearchResult", "([Lcom/xiaomi/fitness/device/manager/ui/scan/recognize/Recognizer;Lno/nordicsemi/android/support/v18/scanner/ScanResult;Lcom/xiaomi/fitness/device/manager/ui/scan/SearchCallback;)V", "stopWearDeviceScan", "()V", "Lcom/xiaomi/fitness/mijia/sdk/data/MiJiaScanDevice;", "Lcom/xiaomi/fitness/device/manager/export/scan/BleDevice;", "toBleDevice", "(Lcom/xiaomi/fitness/mijia/sdk/data/MiJiaScanDevice;)Lcom/xiaomi/fitness/device/manager/export/scan/BleDevice;", "", "", "namePrefixList", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "block", "searchByNamePrefix", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "", "productIdList", "", "checkRegistered", "searchBleByMiBeacon", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Z)V", "wearProductIdList", "localProductIdList", "searchBleByNamePrefixOrMiBeacon", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "searchBleByNamePrefixOrMiBeaconOnlyWear", "searchByRecognizers", "([Lcom/xiaomi/fitness/device/manager/ui/scan/recognize/Recognizer;Lkotlin/jvm/functions/Function1;)V", "searchByRecognizersOnlyWear", "stopSearch", "searchOnlyMijia", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/os/Handler;", "mTimerHandler$delegate", "Lkotlin/Lazy;", "getMTimerHandler", "()Landroid/os/Handler;", "mTimerHandler", "Ljava/lang/Runnable;", "mScanTimeoutRunnable", "Ljava/lang/Runnable;", "Lsbl;", "mScanCallback", "Lsbl;", "mRecognizeJob$delegate", "getMRecognizeJob", "mRecognizeJob", "<init>", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nScanManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanManager.kt\ncom/xiaomi/fitness/device/manager/ui/scan/ScanManager\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,289:1\n13402#2,2:290\n*S KotlinDebug\n*F\n+ 1 ScanManager.kt\ncom/xiaomi/fitness/device/manager/ui/scan/ScanManager\n*L\n197#1:290,2\n*E\n"})
public final class ScanManager {

    @Nullable
    private sbl mScanCallback;

    @Nullable
    private Runnable mScanTimeoutRunnable;

    /* JADX INFO: renamed from: mTimerHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mTimerHandler = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: tdl
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ScanManager.mTimerHandler_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: mRecognizeJob$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mRecognizeJob = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: udl
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ScanManager.mRecognizeJob_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.ui.scan.ScanManager$searchByRecognizers$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.ui.scan.ScanManager$searchByRecognizers$3", f = "ScanManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ a $scanner;
        final /* synthetic */ ScanSettings $settings;
        int label;
        final /* synthetic */ ScanManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(a aVar, ScanSettings scanSettings, ScanManager scanManager, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$scanner = aVar;
            this.$settings = scanSettings;
            this.this$0 = scanManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$scanner, this.$settings, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DeviceModelExtKt.logi("start scan");
            a aVar = this.$scanner;
            ScanSettings scanSettings = this.$settings;
            sbl sblVar = this.this$0.mScanCallback;
            Intrinsics.checkNotNull(sblVar);
            aVar.b(null, scanSettings, sblVar);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.ui.scan.ScanManager$searchByRecognizersOnlyWear$3, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.ui.scan.ScanManager$searchByRecognizersOnlyWear$3", f = "ScanManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C19723 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ a $scanner;
        final /* synthetic */ ScanSettings $settings;
        int label;
        final /* synthetic */ ScanManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19723(a aVar, ScanSettings scanSettings, ScanManager scanManager, Continuation<? super C19723> continuation) {
            super(2, continuation);
            this.$scanner = aVar;
            this.$settings = scanSettings;
            this.this$0 = scanManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C19723(this.$scanner, this.$settings, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DeviceModelExtKt.logi("start scan");
            a aVar = this.$scanner;
            ScanSettings scanSettings = this.$settings;
            sbl sblVar = this.this$0.mScanCallback;
            Intrinsics.checkNotNull(sblVar);
            aVar.b(null, scanSettings, sblVar);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19723) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final Handler getMRecognizeJob() {
        return (Handler) this.mRecognizeJob.getValue();
    }

    private final Handler getMTimerHandler() {
        return (Handler) this.mTimerHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler mRecognizeJob_delegate$lambda$1() {
        return JobHandlerProvider.newJobHandler$default(JobHandlerProvider.INSTANCE, null, 1, null).newJob();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler mTimerHandler_delegate$lambda$0() {
        return new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recognizeSearchResult(final Recognizer[] recognizers, final ScanResult result, final SearchCallback callback) {
        getMRecognizeJob().post(new Runnable() { // from class: vdl
            @Override // java.lang.Runnable
            public final void run() {
                ScanManager.recognizeSearchResult$lambda$6(recognizers, result, this, callback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void recognizeSearchResult$lambda$6(Recognizer[] recognizers, ScanResult result, ScanManager this$0, final SearchCallback callback) {
        Intrinsics.checkNotNullParameter(recognizers, "$recognizers");
        Intrinsics.checkNotNullParameter(result, "$result");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        for (Recognizer recognizer : recognizers) {
            ydl ydlVarD = result.d();
            DeviceModelExtKt.logd("ScanDevice recognize ScanResult, return: " + (ydlVarD != null ? ydlVarD.d() : null));
            final BleDevice bleDeviceRecognize = recognizer.recognize(result);
            if (bleDeviceRecognize != null) {
                WearableProduct wearableProduct = (WearableProduct) DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).getProductByModel(bleDeviceRecognize.getModel());
                if (bleDeviceRecognize.getName() == null && wearableProduct != null) {
                    bleDeviceRecognize.setName(wearableProduct.getProductName());
                }
                this$0.getMTimerHandler().post(new Runnable() { // from class: wdl
                    @Override // java.lang.Runnable
                    public final void run() {
                        ScanManager.recognizeSearchResult$lambda$6$lambda$5$lambda$4(callback, bleDeviceRecognize);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void recognizeSearchResult$lambda$6$lambda$5$lambda$4(SearchCallback callback, BleDevice bleDevice) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.getOnFound().invoke2(bleDevice);
    }

    public static /* synthetic */ void searchBleByMiBeacon$default(ScanManager scanManager, List list, Function1 function1, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        scanManager.searchBleByMiBeacon(list, function1, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void searchByRecognizers$lambda$2(SearchCallback callback, ScanManager this$0) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DeviceModelExtKt.logi("scan timeout");
        callback.getOnStop();
        this$0.stopSearch();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void searchByRecognizersOnlyWear$lambda$3(SearchCallback callback, ScanManager this$0) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DeviceModelExtKt.logi("scan timeout");
        callback.getOnStop();
        this$0.stopSearch();
    }

    private final void stopWearDeviceScan() {
        if (this.mScanCallback != null) {
            DeviceModelExtKt.logi("stop scan");
            a aVarA = a.a();
            sbl sblVar = this.mScanCallback;
            Intrinsics.checkNotNull(sblVar);
            aVarA.d(sblVar);
            this.mScanCallback = null;
        }
        if (this.mScanTimeoutRunnable != null) {
            Handler mTimerHandler = getMTimerHandler();
            Runnable runnable = this.mScanTimeoutRunnable;
            Intrinsics.checkNotNull(runnable);
            mTimerHandler.removeCallbacks(runnable);
            this.mScanTimeoutRunnable = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BleDevice toBleDevice(MiJiaScanDevice miJiaScanDevice) {
        RNProduct productByModel;
        String mac = miJiaScanDevice.getMac();
        AdvPacket packet = miJiaScanDevice.getPacket();
        BleDevice bleDevice = new BleDevice("", mac, packet != null ? packet.getProductId() : -1, miJiaScanDevice.getModel(), miJiaScanDevice.getPacket(), miJiaScanDevice.getMac(), 0, false, 192, null);
        try {
            productByModel = ProductExtKt.getInstance(RNProductManager.INSTANCE).getProductByModel(miJiaScanDevice.getModel());
        } catch (Exception e) {
            e.printStackTrace();
            Logger.i("ScanManager", "RNProductManager.instance.getProductByModel(" + miJiaScanDevice.getModel() + ") error");
            productByModel = null;
        }
        if (productByModel != null) {
            bleDevice.setName(productByModel.getProductName());
        }
        return bleDevice;
    }

    public final void searchBleByMiBeacon(@Nullable List<Integer> productIdList, @NotNull Function1<? super SearchCallback, Unit> block, boolean checkRegistered) {
        Intrinsics.checkNotNullParameter(block, "block");
        searchByRecognizers(new Recognizer[]{new BeaconRecognizer(productIdList, checkRegistered)}, block);
    }

    public final void searchBleByNamePrefixOrMiBeacon(@NotNull List<String> namePrefixList, @Nullable List<Integer> wearProductIdList, @Nullable List<Integer> localProductIdList, @NotNull Function1<? super SearchCallback, Unit> block) {
        Intrinsics.checkNotNullParameter(namePrefixList, "namePrefixList");
        Intrinsics.checkNotNullParameter(block, "block");
        searchByRecognizers(new Recognizer[]{new NameRecognizer(namePrefixList), new BeaconRecognizer(wearProductIdList, false, 2, null), new LocalBeaconRecognizer(localProductIdList)}, block);
    }

    public final void searchBleByNamePrefixOrMiBeaconOnlyWear(@NotNull List<String> namePrefixList, @Nullable List<Integer> wearProductIdList, @Nullable List<Integer> localProductIdList, @NotNull Function1<? super SearchCallback, Unit> block) {
        Intrinsics.checkNotNullParameter(namePrefixList, "namePrefixList");
        Intrinsics.checkNotNullParameter(block, "block");
        searchByRecognizersOnlyWear(new Recognizer[]{new NameRecognizer(namePrefixList), new BeaconRecognizer(wearProductIdList, false, 2, null), new LocalBeaconRecognizer(localProductIdList)}, block);
    }

    public final void searchByNamePrefix(@NotNull List<String> namePrefixList, @NotNull Function1<? super SearchCallback, Unit> block) {
        Intrinsics.checkNotNullParameter(namePrefixList, "namePrefixList");
        Intrinsics.checkNotNullParameter(block, "block");
        searchByRecognizers(new Recognizer[]{new NameRecognizer(namePrefixList)}, block);
    }

    @SuppressLint({"MissingPermission"})
    public final void searchByRecognizers(@NotNull final Recognizer[] recognizers, @NotNull Function1<? super SearchCallback, Unit> block) {
        Intrinsics.checkNotNullParameter(recognizers, "recognizers");
        Intrinsics.checkNotNullParameter(block, "block");
        Logger.i("ScanManager", "searchByRecognizers");
        stopWearDeviceScan();
        final SearchCallback searchCallback = new SearchCallback();
        block.invoke2(searchCallback);
        if (!s33.e()) {
            searchCallback.getOnFailed().invoke2(-1);
            return;
        }
        this.mScanTimeoutRunnable = new Runnable() { // from class: sdl
            @Override // java.lang.Runnable
            public final void run() {
                ScanManager.searchByRecognizers$lambda$2(searchCallback, this);
            }
        };
        a aVarA = a.a();
        Intrinsics.checkNotNullExpressionValue(aVarA, "getScanner(...)");
        ScanSettings scanSettingsA = new ScanSettings.b().d(false).j(2).a();
        Intrinsics.checkNotNullExpressionValue(scanSettingsA, "build(...)");
        this.mScanCallback = new sbl() { // from class: com.xiaomi.fitness.device.manager.ui.scan.ScanManager.searchByRecognizers.2
            @Override // defpackage.sbl
            public void onBatchScanResults(List<ScanResult> results) {
                Intrinsics.checkNotNullParameter(results, "results");
                super.onBatchScanResults(results);
                Logger.i("ScanManager", "onBatchScanResults");
            }

            @Override // defpackage.sbl
            public void onScanFailed(int errorCode) {
                super.onScanFailed(errorCode);
                Logger.i("ScanManager", "onScanFailed");
                searchCallback.getOnFailed().invoke2(Integer.valueOf(errorCode));
                ScanManager.this.stopSearch();
            }

            @Override // defpackage.sbl
            public void onScanResult(int callbackType, ScanResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                super.onScanResult(callbackType, result);
                Logger.i("ScanManager", "onScanResult");
                ScanManager scanManager = ScanManager.this;
                Recognizer[] recognizerArr = recognizers;
                scanManager.recognizeSearchResult((Recognizer[]) Arrays.copyOf(recognizerArr, recognizerArr.length), result, searchCallback);
            }
        };
        AnyExtKt.io$default(null, new AnonymousClass3(aVarA, scanSettingsA, this, null), 1, null);
        Handler mTimerHandler = getMTimerHandler();
        Runnable runnable = this.mScanTimeoutRunnable;
        Intrinsics.checkNotNull(runnable);
        mTimerHandler.postDelayed(runnable, 30000L);
        searchOnlyMijia(block);
    }

    @SuppressLint({"MissingPermission"})
    public final void searchByRecognizersOnlyWear(@NotNull final Recognizer[] recognizers, @NotNull Function1<? super SearchCallback, Unit> block) {
        Intrinsics.checkNotNullParameter(recognizers, "recognizers");
        Intrinsics.checkNotNullParameter(block, "block");
        Logger.i("ScanManager", "searchByRecognizers");
        stopWearDeviceScan();
        final SearchCallback searchCallback = new SearchCallback();
        block.invoke2(searchCallback);
        if (!s33.e()) {
            searchCallback.getOnFailed().invoke2(-1);
            return;
        }
        this.mScanTimeoutRunnable = new Runnable() { // from class: xdl
            @Override // java.lang.Runnable
            public final void run() {
                ScanManager.searchByRecognizersOnlyWear$lambda$3(searchCallback, this);
            }
        };
        a aVarA = a.a();
        Intrinsics.checkNotNullExpressionValue(aVarA, "getScanner(...)");
        ScanSettings scanSettingsA = new ScanSettings.b().d(false).j(2).a();
        Intrinsics.checkNotNullExpressionValue(scanSettingsA, "build(...)");
        this.mScanCallback = new sbl() { // from class: com.xiaomi.fitness.device.manager.ui.scan.ScanManager.searchByRecognizersOnlyWear.2
            @Override // defpackage.sbl
            public void onBatchScanResults(List<ScanResult> results) {
                Intrinsics.checkNotNullParameter(results, "results");
                super.onBatchScanResults(results);
                Logger.i("ScanManager", "onBatchScanResults");
            }

            @Override // defpackage.sbl
            public void onScanFailed(int errorCode) {
                super.onScanFailed(errorCode);
                Logger.i("ScanManager", "onScanFailed");
                searchCallback.getOnFailed().invoke2(Integer.valueOf(errorCode));
                ScanManager.this.stopSearch();
            }

            @Override // defpackage.sbl
            public void onScanResult(int callbackType, ScanResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                super.onScanResult(callbackType, result);
                Logger.i("ScanManager", "onScanResult");
                ScanManager scanManager = ScanManager.this;
                Recognizer[] recognizerArr = recognizers;
                scanManager.recognizeSearchResult((Recognizer[]) Arrays.copyOf(recognizerArr, recognizerArr.length), result, searchCallback);
            }
        };
        AnyExtKt.io$default(null, new C19723(aVarA, scanSettingsA, this, null), 1, null);
        Handler mTimerHandler = getMTimerHandler();
        Runnable runnable = this.mScanTimeoutRunnable;
        Intrinsics.checkNotNull(runnable);
        mTimerHandler.postDelayed(runnable, 30000L);
    }

    public final void searchOnlyMijia(@NotNull Function1<? super SearchCallback, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (AppUtil.INSTANCE.isPlayChannel()) {
            return;
        }
        final SearchCallback searchCallback = new SearchCallback();
        block.invoke2(searchCallback);
        if (s33.e()) {
            MiJiaSDKCompat.INSTANCE.getInstance().startScanDevice(new MiJiaBleScanCallback() { // from class: com.xiaomi.fitness.device.manager.ui.scan.ScanManager.searchOnlyMijia.1
                @Override // com.xiaomi.fitness.mijia.sdk.api.MiJiaBleScanCallback
                public void onDeviceFounded(MiJiaScanDevice device) {
                    Intrinsics.checkNotNullParameter(device, "device");
                    DeviceModelExtKt.logi("MiJiaSDKCompat onDeviceFounded(" + device.getModel() + ") ");
                    RNDeviceManager rNDeviceManagerExtKt = RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE);
                    String mac = device.getMac();
                    if (mac == null) {
                        mac = "";
                    }
                    RNDeviceModel rNDeviceModel = (RNDeviceModel) rNDeviceManagerExtKt.getDeviceModelByMac(mac);
                    AdvPacket packet = device.getPacket();
                    if ((packet == null || !packet.isRegistered()) && !Intrinsics.areEqual(device.getModel(), "yunmai.scales.ms3001") && rNDeviceModel == null) {
                        searchCallback.getOnFound().invoke2(this.toBleDevice(device));
                        return;
                    }
                    DeviceModelExtKt.logi("device(" + device.getMac() + ") has been registered");
                }

                @Override // com.xiaomi.fitness.mijia.sdk.api.MiJiaBleScanCallback
                public void onScanCanceled() {
                    searchCallback.getOnStop();
                }

                @Override // com.xiaomi.fitness.mijia.sdk.api.MiJiaBleScanCallback
                public void onScanStarted() {
                }

                @Override // com.xiaomi.fitness.mijia.sdk.api.MiJiaBleScanCallback
                public void onScanStopped() {
                    searchCallback.getOnStop();
                }
            }, 30000);
        } else {
            searchCallback.getOnFailed().invoke2(-1);
        }
    }

    public final void stopSearch() {
        stopWearDeviceScan();
        MiJiaSDKCompat.INSTANCE.getInstance().stopScan();
    }
}
