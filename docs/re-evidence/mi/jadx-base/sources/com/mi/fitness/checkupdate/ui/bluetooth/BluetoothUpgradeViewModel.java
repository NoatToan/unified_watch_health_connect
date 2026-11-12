package com.mi.fitness.checkupdate.ui.bluetooth;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.mi.fitness.checkupdate.model.LatestVersion;
import com.mi.fitness.checkupdate.ota.OtaResultTrack;
import com.mi.fitness.checkupdate.ota.SilentUpgradeExtKt;
import com.mi.fitness.checkupdate.ui.bluetooth.BluetoothUpgradeViewModel;
import com.mi.fitness.checkupdate.util.CheckUpdatePreferenceSupport;
import com.mi.fitness.checkupdate.util.CheckUpdateUtil;
import com.mi.fitness.checkupdate.util.DeviceSender;
import com.mi.fitness.checkupdate.util.Downloader;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.smarthome.framework.api.UserConfig;
import com.xiaomi.smarthome.library.bluetooth.OTAErrorCode;
import defpackage.kxo;
import defpackage.qch;
import defpackage.r72;
import defpackage.s33;
import defpackage.yyi;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 `2\u00020\u0001:\u0001`B\u0007¢\u0006\u0004\b_\u0010\u001eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001c\u0010\u0018J\r\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0007¢\u0006\u0004\b&\u0010\tJ\r\u0010'\u001a\u00020\u0004¢\u0006\u0004\b'\u0010\u001eJ\r\u0010(\u001a\u00020\u0004¢\u0006\u0004\b(\u0010\u001eJ\r\u0010)\u001a\u00020\u0004¢\u0006\u0004\b)\u0010\u001eJ\r\u0010*\u001a\u00020\u0004¢\u0006\u0004\b*\u0010\u001eJ)\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0-2\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0002¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u0007¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u000f¢\u0006\u0004\b3\u0010\u0018R\u001d\u00106\u001a\b\u0012\u0004\u0012\u000205048\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001d\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000f048\u0006¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u00109R\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0002048\u0006¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b=\u00109R\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020\u0002048\u0006¢\u0006\f\n\u0004\b>\u00107\u001a\u0004\b?\u00109R)\u0010@\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020-048\u0006¢\u0006\f\n\u0004\b@\u00107\u001a\u0004\bA\u00109R#\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0007048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u00109R1\u0010H\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 G*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010F0F048\u0006¢\u0006\f\n\u0004\bH\u00107\u001a\u0004\bI\u00109R\"\u0010J\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010\u0006R\"\u0010O\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010\u0018\"\u0004\bR\u0010SR(\u0010U\u001a\u0004\u0018\u00010\u000f2\b\u0010T\u001a\u0004\u0018\u00010\u000f8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bU\u0010P\"\u0004\bV\u0010SR\u0016\u0010W\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\"\u0010Y\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010X\u001a\u0004\bY\u0010\t\"\u0004\bZ\u00102R\u0016\u0010^\u001a\u0004\u0018\u00010[8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]¨\u0006a"}, d2 = {"Lcom/mi/fitness/checkupdate/ui/bluetooth/BluetoothUpgradeViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "", "tag", "", "menuAddItem", "(I)V", "", "currentModelHasChanged", "()Z", "Ljava/io/File;", "file", "updateFirmware", "(Ljava/io/File;)V", "mode", "", "segmentLength", "Lqch;", "otaListener", "startOta", "(ILjava/lang/String;ILqch;)V", "startGeneralOta", "(ILjava/lang/String;Lqch;)V", "getLatestVersionMD5", "()Ljava/lang/String;", "getLatestVersionUrl", "getFirmwareFile", "()Ljava/io/File;", "getCurrentVersion", "supportSilentOta", "()V", "itemId", "getMenuTitle", "(I)Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "attach", "(Landroid/os/Bundle;)V", "isFirmwareDownLoaded", "installFirmWare", "toInstall", "deleteFile", "downLoadFirmWareAndUpdate", "result", "code", "Lkotlin/Pair;", "getOtaFailReason", "(ZI)Lkotlin/Pair;", "visibility", "notifyUpgradeVisibility", "(Z)V", "getVersionHistoryH5Url", "Landroidx/lifecycle/MutableLiveData;", "Lcom/mi/fitness/checkupdate/model/LatestVersion;", "latestVersionLiveData", "Landroidx/lifecycle/MutableLiveData;", "getLatestVersionLiveData", "()Landroidx/lifecycle/MutableLiveData;", "sdUpgradePathLiveData", "getSdUpgradePathLiveData", "downloadProgressLiveData", "getDownloadProgressLiveData", "otaProgressLiveData", "getOtaProgressLiveData", "updateFirmwareLiveData", "getUpdateFirmwareLiveData", "supportSilentOtaSetting$delegate", "Lkotlin/Lazy;", "getSupportSilentOtaSetting", "supportSilentOtaSetting", "", "kotlin.jvm.PlatformType", "menuList", "getMenuList", "minBattery", "I", "getMinBattery", "()I", "setMinBattery", "tempCurrentDeviceModel", "Ljava/lang/String;", "getTempCurrentDeviceModel", "setTempCurrentDeviceModel", "(Ljava/lang/String;)V", "value", "localUrl", "setLocalUrl", "useLocalFile", "Z", "isDownloading", "setDownloading", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "<init>", "Companion", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBluetoothUpgradeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothUpgradeViewModel.kt\ncom/mi/fitness/checkupdate/ui/bluetooth/BluetoothUpgradeViewModel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,413:1\n13402#2,2:414\n*S KotlinDebug\n*F\n+ 1 BluetoothUpgradeViewModel.kt\ncom/mi/fitness/checkupdate/ui/bluetooth/BluetoothUpgradeViewModel\n*L\n177#1:414,2\n*E\n"})
public final class BluetoothUpgradeViewModel extends AbsViewModel {
    public static final int MENU_ITEM_HISTORY = 1;
    public static final int MENU_ITEM_SILENT_OTA = 2;

    @NotNull
    public static final String TAG = "CheckUpdate";
    private boolean isDownloading;

    @Nullable
    private String localUrl;
    private boolean useLocalFile;

    @NotNull
    private final MutableLiveData<LatestVersion> latestVersionLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<String> sdUpgradePathLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Integer> downloadProgressLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Integer> otaProgressLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Pair<Boolean, Integer>> updateFirmwareLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: supportSilentOtaSetting$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy supportSilentOtaSetting = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: o33
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BluetoothUpgradeViewModel.supportSilentOtaSetting_delegate$lambda$0();
        }
    });

    @NotNull
    private final MutableLiveData<List<Integer>> menuList = new MutableLiveData<>(new ArrayList());
    private int minBattery = 20;

    @NotNull
    private String tempCurrentDeviceModel = "";

    /* JADX INFO: renamed from: com.mi.fitness.checkupdate.ui.bluetooth.BluetoothUpgradeViewModel$downLoadFirmWareAndUpdate$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.fitness.checkupdate.ui.bluetooth.BluetoothUpgradeViewModel$downLoadFirmWareAndUpdate$1", f = "BluetoothUpgradeViewModel.kt", i = {}, l = {347}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.mi.fitness.checkupdate.ui.bluetooth.BluetoothUpgradeViewModel$downLoadFirmWareAndUpdate$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.mi.fitness.checkupdate.ui.bluetooth.BluetoothUpgradeViewModel$downLoadFirmWareAndUpdate$1$1", f = "BluetoothUpgradeViewModel.kt", i = {}, l = {349, 361}, m = "invokeSuspend", n = {}, s = {})
        public static final class C02931 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ BluetoothUpgradeViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02931(BluetoothUpgradeViewModel bluetoothUpgradeViewModel, Continuation<? super C02931> continuation) {
                super(2, continuation);
                this.this$0 = bluetoothUpgradeViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(BluetoothUpgradeViewModel bluetoothUpgradeViewModel, File file) {
                bluetoothUpgradeViewModel.setDownloading(false);
                bluetoothUpgradeViewModel.getDownloadProgressLiveData().setValue(100);
                bluetoothUpgradeViewModel.setLocalUrl(file.getAbsolutePath());
                bluetoothUpgradeViewModel.installFirmWare();
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$1(BluetoothUpgradeViewModel bluetoothUpgradeViewModel, String str) {
                bluetoothUpgradeViewModel.setDownloading(false);
                bluetoothUpgradeViewModel.getDownloadProgressLiveData().setValue(-1);
                Logger.i("CheckUpdate", "downLoadFirmWareAndUpdate error:" + str);
                return Unit.INSTANCE;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C02931(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                final File firmwareFile = this.this$0.getFirmwareFile();
                Downloader downloader = Downloader.INSTANCE;
                String latestVersionUrl = this.this$0.getLatestVersionUrl();
                String latestVersionMD5 = this.this$0.getLatestVersionMD5();
                final BluetoothUpgradeViewModel bluetoothUpgradeViewModel = this.this$0;
                Function0<Unit> function0 = new Function0() { // from class: com.mi.fitness.checkupdate.ui.bluetooth.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BluetoothUpgradeViewModel.AnonymousClass1.C02931.invokeSuspend$lambda$0(bluetoothUpgradeViewModel, firmwareFile);
                    }
                };
                final BluetoothUpgradeViewModel bluetoothUpgradeViewModel2 = this.this$0;
                Function1<? super String, Unit> function1 = new Function1() { // from class: com.mi.fitness.checkupdate.ui.bluetooth.d
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return BluetoothUpgradeViewModel.AnonymousClass1.C02931.invokeSuspend$lambda$1(bluetoothUpgradeViewModel2, (String) obj2);
                    }
                };
                this.label = 1;
                obj = downloader.download(latestVersionUrl, firmwareFile, latestVersionMD5, function0, function1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                final BluetoothUpgradeViewModel bluetoothUpgradeViewModel3 = this.this$0;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.mi.fitness.checkupdate.ui.bluetooth.BluetoothUpgradeViewModel.downLoadFirmWareAndUpdate.1.1.3

                    /* JADX INFO: renamed from: com.mi.fitness.checkupdate.ui.bluetooth.BluetoothUpgradeViewModel$downLoadFirmWareAndUpdate$1$1$3$1, reason: invalid class name and collision with other inner class name */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "com.mi.fitness.checkupdate.ui.bluetooth.BluetoothUpgradeViewModel$downLoadFirmWareAndUpdate$1$1$3$1", f = "BluetoothUpgradeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    public static final class C02941 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ int $progress;
                        int label;
                        final /* synthetic */ BluetoothUpgradeViewModel this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C02941(BluetoothUpgradeViewModel bluetoothUpgradeViewModel, int i, Continuation<? super C02941> continuation) {
                            super(2, continuation);
                            this.this$0 = bluetoothUpgradeViewModel;
                            this.$progress = i;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C02941(this.this$0, this.$progress, continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            this.this$0.getDownloadProgressLiveData().setValue(Boxing.boxInt(this.$progress));
                            return Unit.INSTANCE;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((C02941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(int i2, Continuation<? super Unit> continuation) {
                        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new C02941(bluetoothUpgradeViewModel3, i2, null), continuation);
                        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
                    }
                };
                this.label = 2;
                if (((Flow) obj).collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C02931) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BluetoothUpgradeViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C02931 c02931 = new C02931(BluetoothUpgradeViewModel.this, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c02931, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.mi.fitness.checkupdate.ui.bluetooth.BluetoothUpgradeViewModel$supportSilentOta$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.fitness.checkupdate.ui.bluetooth.BluetoothUpgradeViewModel$supportSilentOta$1", f = "BluetoothUpgradeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13761 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C13761(Continuation<? super C13761> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BluetoothUpgradeViewModel.this.new C13761(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WearableDeviceModel deviceModel = BluetoothUpgradeViewModel.this.getDeviceModel();
            if (deviceModel != null && SilentUpgradeExtKt.supportSilentUpgrade(deviceModel)) {
                BluetoothUpgradeViewModel.this.menuAddItem(2);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C13761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final boolean currentModelHasChanged() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        return !Intrinsics.areEqual(wearableDeviceModel != null ? DeviceModelExtKt.getModel(wearableDeviceModel) : null, this.tempCurrentDeviceModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WearableDeviceModel getDeviceModel() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getFirmwareFile() {
        String strF = r72.f(Environment.DIRECTORY_DOWNLOADS);
        String str = File.separator;
        WearableDeviceModel deviceModel = getDeviceModel();
        File file = new File(strF + str + (deviceModel != null ? DeviceModelExtKt.getModel(deviceModel) : null));
        if (!file.exists()) {
            file.mkdirs();
        }
        String latestVersionMD5 = getLatestVersionMD5();
        if (latestVersionMD5 == null) {
            latestVersionMD5 = "";
        }
        return new File(file, latestVersionMD5 + ApplicationExtKt.getProcessName(ApplicationExtKt.getApplication()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getLatestVersionMD5() {
        LatestVersion value = this.latestVersionLiveData.getValue();
        WearableDeviceModel deviceModel = getDeviceModel();
        if (deviceModel != null && DeviceModelExtKt.getOtaMode(deviceModel) == 1 && value != null && !TextUtils.isEmpty(value.getVersion())) {
            CheckUpdatePreferenceSupport checkUpdatePreferenceSupport = CheckUpdatePreferenceSupport.INSTANCE;
            WearableDeviceModel deviceModel2 = getDeviceModel();
            String did = deviceModel2 != null ? deviceModel2.getDid() : null;
            WearableDeviceModel deviceModel3 = getDeviceModel();
            if (checkUpdatePreferenceSupport.isDeviceOtaUpgradedByVersion(did, deviceModel3 != null ? DeviceModelExtKt.getFirmwareVersion(deviceModel3) : null, value.getVersion())) {
                return value.getMd5();
            }
        }
        if (value != null) {
            return value.getMD5();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getLatestVersionUrl() {
        LatestVersion value = this.latestVersionLiveData.getValue();
        WearableDeviceModel deviceModel = getDeviceModel();
        if (deviceModel != null && DeviceModelExtKt.getOtaMode(deviceModel) == 1 && value != null && !TextUtils.isEmpty(value.getVersion())) {
            CheckUpdatePreferenceSupport checkUpdatePreferenceSupport = CheckUpdatePreferenceSupport.INSTANCE;
            WearableDeviceModel deviceModel2 = getDeviceModel();
            String did = deviceModel2 != null ? deviceModel2.getDid() : null;
            WearableDeviceModel deviceModel3 = getDeviceModel();
            if (checkUpdatePreferenceSupport.isDeviceOtaUpgradedByVersion(did, deviceModel3 != null ? DeviceModelExtKt.getFirmwareVersion(deviceModel3) : null, value.getVersion())) {
                return value.getFullPackageUrl();
            }
        }
        if (value != null) {
            return value.getUrl();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void menuAddItem(int tag) {
        List<Integer> value = this.menuList.getValue();
        if (value != null && !value.contains(Integer.valueOf(tag))) {
            value.add(Integer.valueOf(tag));
        }
        this.menuList.postValue(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLocalUrl(String str) {
        Logger.d("CheckUpdate", "localUrl changed:" + str);
        this.localUrl = str;
    }

    private final void startGeneralOta(final int mode, final String file, final qch otaListener) {
        LatestVersion value = this.latestVersionLiveData.getValue();
        if (value == null) {
            value = new LatestVersion();
            value.setMd5(MD5Util.getFileMD5(new File(file)));
            value.setVersion("0");
            value.setForce(false);
        }
        DeviceSender.INSTANCE.prepareOta(value.getForce(), 0, value.getVersion(), value.getMD5(), new Function1() { // from class: p33
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BluetoothUpgradeViewModel.startGeneralOta$lambda$5(this.f29953a, mode, file, otaListener, (kxo) obj);
            }
        }, new Function1() { // from class: q33
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BluetoothUpgradeViewModel.startGeneralOta$lambda$6(otaListener, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startGeneralOta$lambda$5(BluetoothUpgradeViewModel this$0, int i, String file, qch otaListener, kxo kxoVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(file, "$file");
        Intrinsics.checkNotNullParameter(otaListener, "$otaListener");
        Logger.i("CheckUpdate", "startGeneralOta: reason: " + (kxoVar != null ? Integer.valueOf(kxoVar.c) : null));
        Integer numValueOf = kxoVar != null ? Integer.valueOf(kxoVar.c) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            this$0.startOta(i, file, kxoVar.e, otaListener);
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            otaListener.onComplete();
        } else if (numValueOf != null && numValueOf.intValue() == 4) {
            otaListener.onError(7, UserConfig.KEY_CAMERA_LIST_SORT_ORDER);
        } else if (numValueOf != null && numValueOf.intValue() == 3) {
            otaListener.onError(5, "");
        } else {
            otaListener.onError(-1, "");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startGeneralOta$lambda$6(qch otaListener, int i) {
        Intrinsics.checkNotNullParameter(otaListener, "$otaListener");
        Logger.i("CheckUpdate", "prepareOta failed code:" + i);
        otaListener.onError(-1, "");
        return Unit.INSTANCE;
    }

    private final void startOta(int mode, String file, int segmentLength, qch otaListener) {
        DeviceSender.INSTANCE.startOta(mode, 0, file, segmentLength, otaListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData supportSilentOtaSetting_delegate$lambda$0() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toInstall$lambda$3(BluetoothUpgradeViewModel this$0, File file, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(file, "$file");
        if (z) {
            this$0.updateFirmware(file);
        } else {
            this$0.updateFirmwareLiveData.setValue(new Pair<>(Boolean.FALSE, -1));
        }
        return Unit.INSTANCE;
    }

    private final void updateFirmware(File file) {
        OtaResultTrack.INSTANCE.otaStart();
        final LatestVersion value = this.latestVersionLiveData.getValue();
        WearableDeviceModel deviceModel = getDeviceModel();
        if (deviceModel != null) {
            final int otaMode = DeviceModelExtKt.getOtaMode(deviceModel);
            if (otaMode != 1 && otaMode != 2) {
                this.updateFirmwareLiveData.setValue(new Pair<>(Boolean.FALSE, -2));
                return;
            }
            qch qchVar = new qch() { // from class: com.mi.fitness.checkupdate.ui.bluetooth.BluetoothUpgradeViewModel$updateFirmware$otaListener$1
                @Override // defpackage.qch
                public void onComplete() {
                    LatestVersion latestVersion;
                    WearableDeviceModel deviceModel2;
                    String version;
                    String firmwareVersion;
                    String model;
                    Logger.i("CheckUpdate", "onCompleted");
                    OtaResultTrack otaResultTrack = OtaResultTrack.INSTANCE;
                    WearableDeviceModel deviceModel3 = this.this$0.getDeviceModel();
                    String str = (deviceModel3 == null || (model = DeviceModelExtKt.getModel(deviceModel3)) == null) ? "" : model;
                    WearableDeviceModel deviceModel4 = this.this$0.getDeviceModel();
                    String str2 = (deviceModel4 == null || (firmwareVersion = DeviceModelExtKt.getFirmwareVersion(deviceModel4)) == null) ? "" : firmwareVersion;
                    LatestVersion latestVersion2 = value;
                    otaResultTrack.otaFinish(true, str, str2, (latestVersion2 == null || (version = latestVersion2.getVersion()) == null) ? "" : version, (64 & 16) != 0 ? 0 : 0, (64 & 32) != 0 ? "" : null, (64 & 64) != 0 ? 0 : 0);
                    if (otaMode == 1 && (latestVersion = value) != null && !TextUtils.isEmpty(latestVersion.getVersion()) && (deviceModel2 = this.this$0.getDeviceModel()) != null) {
                        LatestVersion latestVersion3 = value;
                        CheckUpdatePreferenceSupport checkUpdatePreferenceSupport = CheckUpdatePreferenceSupport.INSTANCE;
                        String did = deviceModel2.getDid();
                        String firmwareVersion2 = DeviceModelExtKt.getFirmwareVersion(deviceModel2);
                        if (firmwareVersion2 == null) {
                            firmwareVersion2 = "";
                        }
                        String version2 = latestVersion3.getVersion();
                        checkUpdatePreferenceSupport.setDeviceOtaUpgradedByVersion(did, firmwareVersion2, version2 != null ? version2 : "");
                    }
                    this.this$0.getUpdateFirmwareLiveData().setValue(new Pair<>(Boolean.TRUE, 0));
                    this.this$0.deleteFile();
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v5, types: [com.mi.fitness.checkupdate.ui.bluetooth.BluetoothUpgradeViewModel] */
                /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.StringBuilder] */
                /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.lang.String] */
                /* JADX WARN: Type inference failed for: r7v10 */
                /* JADX WARN: Type inference failed for: r7v11 */
                /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r7v5 */
                /* JADX WARN: Type inference failed for: r7v6, types: [int] */
                /* JADX WARN: Type inference failed for: r7v8 */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // defpackage.qch
                public void onError(int code, String msg) {
                    Intrinsics.checkNotNullParameter(msg, "msg");
                    Logger.e("CheckUpdate", "onError:" + code + ",msg:" + ((String) msg));
                    if (code == 7) {
                        ?? r0 = this.this$0;
                        try {
                            if (otaMode == 1) {
                                String strSubstring = msg.substring(msg.length() - 3, msg.length() - 1);
                                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                                Logger.e("CheckUpdate", "battery = " + strSubstring);
                                msg = Integer.parseInt(strSubstring);
                            } else {
                                msg = Integer.parseInt(msg);
                            }
                        } catch (NumberFormatException unused) {
                            Logger.e("CheckUpdate", "Catch Ota exception:" + code + ":" + msg);
                            msg = 20;
                        }
                        r0.setMinBattery(msg);
                    }
                    this.this$0.getUpdateFirmwareLiveData().setValue(new Pair<>(Boolean.FALSE, Integer.valueOf(code)));
                }

                @Override // defpackage.qch
                public void onProgress(int progress) {
                    Logger.i("CheckUpdate", "onProgressChanged" + progress);
                    this.this$0.getOtaProgressLiveData().setValue(Integer.valueOf(progress));
                }

                @Override // defpackage.qch
                public void onStart() {
                    Logger.i("CheckUpdate", "onStart: ");
                }
            };
            if (otaMode == 1) {
                String absolutePath = file.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                startOta(otaMode, absolutePath, 0, qchVar);
            } else {
                String absolutePath2 = file.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath2, "getAbsolutePath(...)");
                startGeneralOta(otaMode, absolutePath2, qchVar);
            }
        }
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        String model;
        if (savedInstanceState == null) {
            return;
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (model = DeviceModelExtKt.getModel(wearableDeviceModel)) == null) {
            model = "";
        }
        this.tempCurrentDeviceModel = model;
        Object obj = savedInstanceState.get("key_latest_version");
        if (obj != null) {
            this.latestVersionLiveData.setValue((LatestVersion) obj);
        }
        String string = savedInstanceState.getString("key_sd_upgrade_path");
        if (string != null) {
            setLocalUrl(string);
            this.sdUpgradePathLiveData.setValue(string);
        }
        if (RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            menuAddItem(1);
        }
    }

    public final void deleteFile() {
        if (this.useLocalFile || TextUtils.isEmpty(this.localUrl)) {
            return;
        }
        File file = new File(this.localUrl);
        if (file.exists()) {
            File parentFile = file.getParentFile();
            Logger.i("CheckUpdate", "deleteFile() called " + (parentFile != null ? parentFile.getPath() : null));
            if (parentFile != null) {
                try {
                    File[] fileArrListFiles = parentFile.listFiles();
                    if (fileArrListFiles != null) {
                        for (File file2 : fileArrListFiles) {
                            file2.delete();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public final void downLoadFirmWareAndUpdate() {
        if (this.isDownloading) {
            return;
        }
        this.isDownloading = true;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    @Nullable
    public final String getCurrentVersion() {
        WearableDeviceModel deviceModel = getDeviceModel();
        if (deviceModel != null) {
            return DeviceModelExtKt.getFirmwareVersion(deviceModel);
        }
        return null;
    }

    @NotNull
    public final MutableLiveData<Integer> getDownloadProgressLiveData() {
        return this.downloadProgressLiveData;
    }

    @NotNull
    public final MutableLiveData<LatestVersion> getLatestVersionLiveData() {
        return this.latestVersionLiveData;
    }

    @NotNull
    public final MutableLiveData<List<Integer>> getMenuList() {
        return this.menuList;
    }

    @NotNull
    public final String getMenuTitle(int itemId) {
        if (itemId != 1) {
            return itemId != 2 ? "" : ResourceExtKt.getString(yyi.R);
        }
        return ResourceExtKt.getString(yyi.Q);
    }

    public final int getMinBattery() {
        return this.minBattery;
    }

    @NotNull
    public final Pair<Integer, String> getOtaFailReason(boolean result, int code) {
        Logger.i("CheckUpdate", "getOtaFailReason() called with: result = " + result + ", code = " + code);
        if (result) {
            return new Pair<>(Integer.valueOf(code), "");
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (s33.e()) {
            return ((wearableDeviceModel == null || wearableDeviceModel.getIsDeviceConnected()) && code != -3) ? new Pair<>(Integer.valueOf(code), "") : new Pair<>(Integer.valueOf(OTAErrorCode.READ_FRIMWARE_VERSION_FAIL), "disconnect");
        }
        return new Pair<>(-100, "bluetooth_disable");
    }

    @NotNull
    public final MutableLiveData<Integer> getOtaProgressLiveData() {
        return this.otaProgressLiveData;
    }

    @NotNull
    public final MutableLiveData<String> getSdUpgradePathLiveData() {
        return this.sdUpgradePathLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getSupportSilentOtaSetting() {
        return (MutableLiveData) this.supportSilentOtaSetting.getValue();
    }

    @NotNull
    public final String getTempCurrentDeviceModel() {
        return this.tempCurrentDeviceModel;
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, Integer>> getUpdateFirmwareLiveData() {
        return this.updateFirmwareLiveData;
    }

    @NotNull
    public final String getVersionHistoryH5Url() {
        String str;
        String currentRegion = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = currentRegion.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (Intrinsics.areEqual(lowerCase, "cn")) {
            str = "";
        } else {
            str = lowerCase + ".";
        }
        WearableDeviceModel deviceModel = getDeviceModel();
        String model = deviceModel != null ? DeviceModelExtKt.getModel(deviceModel) : null;
        if (model == null) {
            return "";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("https://" + str + "watch.iot.mi.com/html/appfw-versions/index.html?model=" + model + "&locale=%s", Arrays.copyOf(new Object[]{LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    public final void installFirmWare() {
        this.otaProgressLiveData.setValue(0);
        toInstall();
    }

    /* JADX INFO: renamed from: isDownloading, reason: from getter */
    public final boolean getIsDownloading() {
        return this.isDownloading;
    }

    public final boolean isFirmwareDownLoaded() {
        return !TextUtils.isEmpty(this.localUrl);
    }

    public final void notifyUpgradeVisibility(boolean visibility) {
        Intent intent = new Intent(SilentUpgradeExtKt.IN_OTA_PAGE_ACTION);
        intent.putExtra("in_ota_page", visibility);
        intent.setPackage(AppUtil.getApp().getPackageName());
        AppUtil.getApp().sendBroadcast(intent);
    }

    public final void setDownloading(boolean z) {
        this.isDownloading = z;
    }

    public final void setMinBattery(int i) {
        this.minBattery = i;
    }

    public final void setTempCurrentDeviceModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tempCurrentDeviceModel = str;
    }

    public final void supportSilentOta() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C13761(null), 3, null);
    }

    public final void toInstall() {
        if (!isFirmwareDownLoaded()) {
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), yyi.x);
            return;
        }
        final File file = new File(this.localUrl);
        if (!file.exists()) {
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), yyi.x);
        } else if (!currentModelHasChanged()) {
            CheckUpdateUtil.INSTANCE.checkAndOpenBluetooth(new Function1() { // from class: n33
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BluetoothUpgradeViewModel.toInstall$lambda$3(this.f27500a, file, ((Boolean) obj).booleanValue());
                }
            });
        } else {
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), yyi.x);
            deleteFile();
        }
    }
}
