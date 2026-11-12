package com.mi.fitness.checkupdate.eco.bluetooth;

import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.mi.fitness.checkupdate.eco.bluetooth.EcoBluetoothUpgradeViewModel;
import com.mi.fitness.checkupdate.eco.ota.EcoSilentUpgradeExtKt;
import com.mi.fitness.checkupdate.eco.util.EcoDeviceSender;
import com.mi.fitness.checkupdate.model.LatestVersion;
import com.mi.fitness.checkupdate.ota.OtaResultTrack;
import com.mi.fitness.checkupdate.util.CheckUpdatePreferenceSupport;
import com.mi.fitness.checkupdate.util.CheckUpdateUtil;
import com.mi.fitness.checkupdate.util.DeviceSender;
import com.mi.fitness.checkupdate.util.Downloader;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt;
import com.xiaomi.smarthome.library.bluetooth.OTAErrorCode;
import defpackage.kxo;
import defpackage.lxo;
import defpackage.qch;
import defpackage.r72;
import defpackage.s33;
import defpackage.yyi;
import java.io.File;
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
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 V2\u00020\u0001:\u0001VB\u0007¢\u0006\u0004\bU\u0010\u001bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0019\u0010\u0015J\r\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0004¢\u0006\u0004\b#\u0010\u001bJ\r\u0010$\u001a\u00020\u0004¢\u0006\u0004\b$\u0010\u001bJ\r\u0010%\u001a\u00020\u0004¢\u0006\u0004\b%\u0010\u001bJ\r\u0010&\u001a\u00020\u0004¢\u0006\u0004\b&\u0010\u001bJ)\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0)2\u0006\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020\u0007¢\u0006\u0004\b*\u0010+R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\t0,8\u0006¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020\u00070,8\u0006¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u00101R\u001d\u00106\u001a\b\u0012\u0004\u0012\u00020\u00070,8\u0006¢\u0006\f\n\u0004\b6\u0010/\u001a\u0004\b7\u00101R)\u00108\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00070)0,8\u0006¢\u0006\f\n\u0004\b8\u0010/\u001a\u0004\b9\u00101R#\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0,8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u00101R\"\u0010>\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR(\u0010E\u001a\u0004\u0018\u00010\t2\b\u0010D\u001a\u0004\u0018\u00010\t8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\"\u0010K\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010F\u001a\u0004\bL\u0010\u0015\"\u0004\bM\u0010HR$\u0010O\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010T¨\u0006W"}, d2 = {"Lcom/mi/fitness/checkupdate/eco/bluetooth/EcoBluetoothUpgradeViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Ljava/io/File;", "file", "", "updateFirmware", "(Ljava/io/File;)V", "", "mode", "", "segmentLength", "Lqch;", "otaListener", "startOta", "(ILjava/lang/String;ILqch;)V", "did", "startLocalOta", "(Ljava/lang/String;ILjava/lang/String;Lqch;)V", "startGeneralOta", "(ILjava/lang/String;Lqch;)V", "getLatestVersionMD5", "()Ljava/lang/String;", "getLatestVersionUrl", "getFirmwareFile", "()Ljava/io/File;", "getCurrentVersion", "supportSilentOta", "()V", "Landroid/os/Bundle;", "savedInstanceState", "attach", "(Landroid/os/Bundle;)V", "", "isFirmwareDownLoaded", "()Z", "installFirmWare", "toInstall", "deleteFile", "downLoadFirmWareAndUpdate", "result", "code", "Lkotlin/Pair;", "getOtaFailReason", "(ZI)Lkotlin/Pair;", "Landroidx/lifecycle/MutableLiveData;", "Lcom/mi/fitness/checkupdate/model/LatestVersion;", "latestVersionLiveData", "Landroidx/lifecycle/MutableLiveData;", "getLatestVersionLiveData", "()Landroidx/lifecycle/MutableLiveData;", "sdUpgradePathLiveData", "getSdUpgradePathLiveData", "downloadProgressLiveData", "getDownloadProgressLiveData", "otaProgressLiveData", "getOtaProgressLiveData", "updateFirmwareLiveData", "getUpdateFirmwareLiveData", "supportSilentOtaSetting$delegate", "Lkotlin/Lazy;", "getSupportSilentOtaSetting", "supportSilentOtaSetting", "minBattery", "I", "getMinBattery", "()I", "setMinBattery", "(I)V", "value", "localUrl", "Ljava/lang/String;", "setLocalUrl", "(Ljava/lang/String;)V", "useLocalFile", "Z", "localDeviceModel", "getLocalDeviceModel", "setLocalDeviceModel", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "deviceModel", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "getDeviceModel", "()Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "setDeviceModel", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;)V", "<init>", "Companion", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class EcoBluetoothUpgradeViewModel extends AbsViewModel {

    @NotNull
    public static final String TAG = "CheckUpdate";

    @Nullable
    private EcoDeviceModel deviceModel;

    @Nullable
    private String localUrl;
    private int minBattery;
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
    private final Lazy supportSilentOtaSetting = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: hj7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoBluetoothUpgradeViewModel.supportSilentOtaSetting_delegate$lambda$0();
        }
    });

    @NotNull
    private String localDeviceModel = new String();

    /* JADX INFO: renamed from: com.mi.fitness.checkupdate.eco.bluetooth.EcoBluetoothUpgradeViewModel$downLoadFirmWareAndUpdate$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.fitness.checkupdate.eco.bluetooth.EcoBluetoothUpgradeViewModel$downLoadFirmWareAndUpdate$1", f = "EcoBluetoothUpgradeViewModel.kt", i = {}, l = {323}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.mi.fitness.checkupdate.eco.bluetooth.EcoBluetoothUpgradeViewModel$downLoadFirmWareAndUpdate$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.mi.fitness.checkupdate.eco.bluetooth.EcoBluetoothUpgradeViewModel$downLoadFirmWareAndUpdate$1$1", f = "EcoBluetoothUpgradeViewModel.kt", i = {}, l = {325, 335}, m = "invokeSuspend", n = {}, s = {})
        public static final class C02881 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EcoBluetoothUpgradeViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02881(EcoBluetoothUpgradeViewModel ecoBluetoothUpgradeViewModel, Continuation<? super C02881> continuation) {
                super(2, continuation);
                this.this$0 = ecoBluetoothUpgradeViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(EcoBluetoothUpgradeViewModel ecoBluetoothUpgradeViewModel, File file) {
                ecoBluetoothUpgradeViewModel.getDownloadProgressLiveData().setValue(100);
                ecoBluetoothUpgradeViewModel.setLocalUrl(file.getAbsolutePath());
                ecoBluetoothUpgradeViewModel.installFirmWare();
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$1(EcoBluetoothUpgradeViewModel ecoBluetoothUpgradeViewModel, String str) {
                ecoBluetoothUpgradeViewModel.getDownloadProgressLiveData().setValue(-1);
                Logger.i("CheckUpdate", "downLoadFirmWareAndUpdate error:" + str);
                return Unit.INSTANCE;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C02881(this.this$0, continuation);
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
                final EcoBluetoothUpgradeViewModel ecoBluetoothUpgradeViewModel = this.this$0;
                Function0<Unit> function0 = new Function0() { // from class: com.mi.fitness.checkupdate.eco.bluetooth.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EcoBluetoothUpgradeViewModel.AnonymousClass1.C02881.invokeSuspend$lambda$0(ecoBluetoothUpgradeViewModel, firmwareFile);
                    }
                };
                final EcoBluetoothUpgradeViewModel ecoBluetoothUpgradeViewModel2 = this.this$0;
                Function1<? super String, Unit> function1 = new Function1() { // from class: com.mi.fitness.checkupdate.eco.bluetooth.b
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return EcoBluetoothUpgradeViewModel.AnonymousClass1.C02881.invokeSuspend$lambda$1(ecoBluetoothUpgradeViewModel2, (String) obj2);
                    }
                };
                this.label = 1;
                obj = downloader.download(latestVersionUrl, firmwareFile, latestVersionMD5, function0, function1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                final EcoBluetoothUpgradeViewModel ecoBluetoothUpgradeViewModel3 = this.this$0;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.mi.fitness.checkupdate.eco.bluetooth.EcoBluetoothUpgradeViewModel.downLoadFirmWareAndUpdate.1.1.3

                    /* JADX INFO: renamed from: com.mi.fitness.checkupdate.eco.bluetooth.EcoBluetoothUpgradeViewModel$downLoadFirmWareAndUpdate$1$1$3$1, reason: invalid class name and collision with other inner class name */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "com.mi.fitness.checkupdate.eco.bluetooth.EcoBluetoothUpgradeViewModel$downLoadFirmWareAndUpdate$1$1$3$1", f = "EcoBluetoothUpgradeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    public static final class C02891 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ int $progress;
                        int label;
                        final /* synthetic */ EcoBluetoothUpgradeViewModel this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C02891(EcoBluetoothUpgradeViewModel ecoBluetoothUpgradeViewModel, int i, Continuation<? super C02891> continuation) {
                            super(2, continuation);
                            this.this$0 = ecoBluetoothUpgradeViewModel;
                            this.$progress = i;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C02891(this.this$0, this.$progress, continuation);
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
                            return ((C02891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(int i2, Continuation<? super Unit> continuation) {
                        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new C02891(ecoBluetoothUpgradeViewModel3, i2, null), continuation);
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
                return ((C02881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcoBluetoothUpgradeViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C02881 c02881 = new C02881(EcoBluetoothUpgradeViewModel.this, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c02881, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.mi.fitness.checkupdate.eco.bluetooth.EcoBluetoothUpgradeViewModel$supportSilentOta$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.fitness.checkupdate.eco.bluetooth.EcoBluetoothUpgradeViewModel$supportSilentOta$1", f = "EcoBluetoothUpgradeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13671 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C13671(Continuation<? super C13671> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcoBluetoothUpgradeViewModel.this.new C13671(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MutableLiveData<Boolean> supportSilentOtaSetting = EcoBluetoothUpgradeViewModel.this.getSupportSilentOtaSetting();
            EcoDeviceModel deviceModel = EcoBluetoothUpgradeViewModel.this.getDeviceModel();
            supportSilentOtaSetting.postValue(deviceModel != null ? Boxing.boxBoolean(EcoSilentUpgradeExtKt.supportSilentUpgrade(deviceModel)) : null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C13671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getFirmwareFile() {
        String strF = r72.f(Environment.DIRECTORY_DOWNLOADS);
        String str = File.separator;
        EcoDeviceModel ecoDeviceModel = this.deviceModel;
        File file = new File(strF + str + (ecoDeviceModel != null ? EcoDeviceModelExtKt.getModel(ecoDeviceModel) : null));
        if (!file.exists()) {
            file.mkdirs();
        }
        String latestVersionMD5 = getLatestVersionMD5();
        if (latestVersionMD5 == null) {
            latestVersionMD5 = "";
        }
        return new File(file, latestVersionMD5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getLatestVersionMD5() {
        LatestVersion value = this.latestVersionLiveData.getValue();
        EcoDeviceModel ecoDeviceModel = this.deviceModel;
        if (ecoDeviceModel != null && EcoDeviceModelExtKt.getOtaMode(ecoDeviceModel) == 1 && value != null && !TextUtils.isEmpty(value.getVersion())) {
            CheckUpdatePreferenceSupport checkUpdatePreferenceSupport = CheckUpdatePreferenceSupport.INSTANCE;
            EcoDeviceModel ecoDeviceModel2 = this.deviceModel;
            String did = ecoDeviceModel2 != null ? ecoDeviceModel2.getDid() : null;
            EcoDeviceModel ecoDeviceModel3 = this.deviceModel;
            if (checkUpdatePreferenceSupport.isDeviceOtaUpgradedByVersion(did, ecoDeviceModel3 != null ? EcoDeviceModelExtKt.getFirmwareVersion(ecoDeviceModel3) : null, value.getVersion())) {
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
        EcoDeviceModel ecoDeviceModel = this.deviceModel;
        if (ecoDeviceModel != null && EcoDeviceModelExtKt.getOtaMode(ecoDeviceModel) == 1 && value != null && !TextUtils.isEmpty(value.getVersion())) {
            CheckUpdatePreferenceSupport checkUpdatePreferenceSupport = CheckUpdatePreferenceSupport.INSTANCE;
            EcoDeviceModel ecoDeviceModel2 = this.deviceModel;
            String did = ecoDeviceModel2 != null ? ecoDeviceModel2.getDid() : null;
            EcoDeviceModel ecoDeviceModel3 = this.deviceModel;
            if (checkUpdatePreferenceSupport.isDeviceOtaUpgradedByVersion(did, ecoDeviceModel3 != null ? EcoDeviceModelExtKt.getFirmwareVersion(ecoDeviceModel3) : null, value.getVersion())) {
                return value.getFullPackageUrl();
            }
        }
        if (value != null) {
            return value.getUrl();
        }
        return null;
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
        DeviceSender.INSTANCE.prepareOta(value.getForce(), 0, value.getVersion(), value.getMD5(), new Function1() { // from class: ij7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoBluetoothUpgradeViewModel.startGeneralOta$lambda$5(this.f21196a, mode, file, otaListener, (kxo) obj);
            }
        }, new Function1() { // from class: jj7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoBluetoothUpgradeViewModel.startGeneralOta$lambda$6(otaListener, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startGeneralOta$lambda$5(EcoBluetoothUpgradeViewModel this$0, int i, String file, qch otaListener, kxo kxoVar) {
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
            int i2 = kxoVar.d;
            if (i2 == 0) {
                i2 = 20;
            }
            this$0.minBattery = i2;
            otaListener.onError(7, "");
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
        otaListener.onError(-1, "");
        return Unit.INSTANCE;
    }

    private final void startLocalOta(String did, final int mode, final String file, final qch otaListener) {
        LatestVersion value = this.latestVersionLiveData.getValue();
        if (value == null) {
            value = new LatestVersion();
            value.setMd5(MD5Util.getFileMD5(new File(file)));
            value.setVersion("0");
            value.setForce(false);
        }
        EcoDeviceSender.INSTANCE.prepareOta(did, value.getForce(), 0, value.getVersion(), value.getMD5(), new Function1() { // from class: kj7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoBluetoothUpgradeViewModel.startLocalOta$lambda$3(this.f23911a, mode, file, otaListener, (lxo) obj);
            }
        }, new Function1() { // from class: lj7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoBluetoothUpgradeViewModel.startLocalOta$lambda$4(otaListener, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startLocalOta$lambda$3(EcoBluetoothUpgradeViewModel this$0, int i, String file, qch otaListener, lxo lxoVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(file, "$file");
        Intrinsics.checkNotNullParameter(otaListener, "$otaListener");
        Logger.i("CheckUpdate", "startLocalOta: reason: " + (lxoVar != null ? Integer.valueOf(lxoVar.c) : null));
        Integer numValueOf = lxoVar != null ? Integer.valueOf(lxoVar.c) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            this$0.startOta(i, file, lxoVar.d, otaListener);
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            otaListener.onError(8, "");
        } else if (numValueOf != null && numValueOf.intValue() == 4) {
            otaListener.onError(7, "");
        } else if (numValueOf != null && numValueOf.intValue() == 3) {
            otaListener.onError(5, "");
        } else {
            otaListener.onError(-1, "");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startLocalOta$lambda$4(qch otaListener, int i) {
        Intrinsics.checkNotNullParameter(otaListener, "$otaListener");
        otaListener.onError(-1, "");
        return Unit.INSTANCE;
    }

    private final void startOta(int mode, String file, int segmentLength, qch otaListener) {
        EcoDeviceSender.INSTANCE.startOta(mode, 0, file, segmentLength, this.deviceModel, otaListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData supportSilentOtaSetting_delegate$lambda$0() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toInstall$lambda$2(EcoBluetoothUpgradeViewModel this$0, File file, boolean z) {
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
        EcoDeviceModel ecoDeviceModel = this.deviceModel;
        if (ecoDeviceModel != null) {
            final int otaMode = EcoDeviceModelExtKt.getOtaMode(ecoDeviceModel);
            if (otaMode != 1 && otaMode != 2 && TextUtils.isEmpty(this.localDeviceModel)) {
                this.updateFirmwareLiveData.setValue(new Pair<>(Boolean.FALSE, -2));
                return;
            }
            qch qchVar = new qch() { // from class: com.mi.fitness.checkupdate.eco.bluetooth.EcoBluetoothUpgradeViewModel$updateFirmware$otaListener$1
                @Override // defpackage.qch
                public void onComplete() {
                    LatestVersion latestVersion;
                    EcoDeviceModel deviceModel;
                    String version;
                    String firmwareVersion;
                    String model;
                    Logger.i("CheckUpdate", "onCompleted");
                    OtaResultTrack otaResultTrack = OtaResultTrack.INSTANCE;
                    EcoDeviceModel deviceModel2 = this.this$0.getDeviceModel();
                    String str = (deviceModel2 == null || (model = EcoDeviceModelExtKt.getModel(deviceModel2)) == null) ? "" : model;
                    EcoDeviceModel deviceModel3 = this.this$0.getDeviceModel();
                    String str2 = (deviceModel3 == null || (firmwareVersion = EcoDeviceModelExtKt.getFirmwareVersion(deviceModel3)) == null) ? "" : firmwareVersion;
                    LatestVersion latestVersion2 = value;
                    otaResultTrack.otaFinish(true, str, str2, (latestVersion2 == null || (version = latestVersion2.getVersion()) == null) ? "" : version, (64 & 16) != 0 ? 0 : 0, (64 & 32) != 0 ? "" : null, (64 & 64) != 0 ? 0 : 0);
                    if (otaMode == 1 && (latestVersion = value) != null && !TextUtils.isEmpty(latestVersion.getVersion()) && (deviceModel = this.this$0.getDeviceModel()) != null) {
                        LatestVersion latestVersion3 = value;
                        CheckUpdatePreferenceSupport checkUpdatePreferenceSupport = CheckUpdatePreferenceSupport.INSTANCE;
                        String did = deviceModel.getDid();
                        String firmwareVersion2 = EcoDeviceModelExtKt.getFirmwareVersion(deviceModel);
                        if (firmwareVersion2 == null) {
                            firmwareVersion2 = "";
                        }
                        String version2 = latestVersion3.getVersion();
                        checkUpdatePreferenceSupport.setDeviceOtaUpgradedByVersion(did, firmwareVersion2, version2 != null ? version2 : "");
                    }
                    this.this$0.getUpdateFirmwareLiveData().setValue(new Pair<>(Boolean.TRUE, 0));
                    this.this$0.deleteFile();
                }

                @Override // defpackage.qch
                public void onError(int code, String msg) {
                    Logger.e("CheckUpdate", "onError:" + code + ",msg:" + msg);
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
            } else if (TextUtils.isEmpty(this.localDeviceModel)) {
                String absolutePath2 = file.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath2, "getAbsolutePath(...)");
                startGeneralOta(otaMode, absolutePath2, qchVar);
            } else {
                EcoDeviceModel ecoDeviceModel2 = this.deviceModel;
                String did = ecoDeviceModel2 != null ? ecoDeviceModel2.getDid() : null;
                String absolutePath3 = file.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath3, "getAbsolutePath(...)");
                startLocalOta(did, otaMode, absolutePath3, qchVar);
            }
        }
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            return;
        }
        Object obj = savedInstanceState.get("key_latest_version");
        if (obj != null) {
            this.latestVersionLiveData.setValue((LatestVersion) obj);
        }
        String string = savedInstanceState.getString("key_sd_upgrade_path");
        if (string != null) {
            setLocalUrl(string);
            this.sdUpgradePathLiveData.setValue(string);
        }
        String string2 = savedInstanceState.getString(EcoBluetoothUpgradeFragment.LOCAL_SPORT_TYPE, "");
        this.localDeviceModel = string2;
        this.deviceModel = TextUtils.isEmpty(string2) ? (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getCurrentDeviceModel() : EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(this.localDeviceModel);
    }

    public final void deleteFile() {
        if (this.useLocalFile || TextUtils.isEmpty(this.localUrl)) {
            return;
        }
        File file = new File(this.localUrl);
        if (file.exists()) {
            try {
                file.delete();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void downLoadFirmWareAndUpdate() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    @Nullable
    public final String getCurrentVersion() {
        EcoDeviceModel ecoDeviceModel = this.deviceModel;
        if (ecoDeviceModel != null) {
            return EcoDeviceModelExtKt.getFirmwareVersion(ecoDeviceModel);
        }
        return null;
    }

    @Nullable
    public final EcoDeviceModel getDeviceModel() {
        return this.deviceModel;
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
    public final String getLocalDeviceModel() {
        return this.localDeviceModel;
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
        if (!s33.e()) {
            return new Pair<>(-100, "bluetooth_disable");
        }
        EcoDeviceModel ecoDeviceModel = this.deviceModel;
        return ((ecoDeviceModel == null || ecoDeviceModel.getIsDeviceConnected()) && code != -3) ? new Pair<>(Integer.valueOf(code), "") : new Pair<>(Integer.valueOf(OTAErrorCode.READ_FRIMWARE_VERSION_FAIL), "disconnect");
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
    public final MutableLiveData<Pair<Boolean, Integer>> getUpdateFirmwareLiveData() {
        return this.updateFirmwareLiveData;
    }

    public final void installFirmWare() {
        this.otaProgressLiveData.setValue(0);
        toInstall();
    }

    public final boolean isFirmwareDownLoaded() {
        return !TextUtils.isEmpty(this.localUrl);
    }

    public final void setDeviceModel(@Nullable EcoDeviceModel ecoDeviceModel) {
        this.deviceModel = ecoDeviceModel;
    }

    public final void setLocalDeviceModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.localDeviceModel = str;
    }

    public final void setMinBattery(int i) {
        this.minBattery = i;
    }

    public final void supportSilentOta() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C13671(null), 3, null);
    }

    public final void toInstall() {
        if (!isFirmwareDownLoaded()) {
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), yyi.x);
            return;
        }
        final File file = new File(this.localUrl);
        if (file.exists()) {
            CheckUpdateUtil.INSTANCE.checkAndOpenBluetooth(new Function1() { // from class: gj7
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return EcoBluetoothUpgradeViewModel.toInstall$lambda$2(this.f19049a, file, ((Boolean) obj).booleanValue());
                }
            });
        } else {
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), yyi.x);
        }
    }
}
