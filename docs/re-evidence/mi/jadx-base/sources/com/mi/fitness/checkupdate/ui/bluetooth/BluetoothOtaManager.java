package com.mi.fitness.checkupdate.ui.bluetooth;

import android.os.Environment;
import com.mi.fitness.checkupdate.model.LatestVersion;
import com.mi.fitness.checkupdate.ota.DownloadListener;
import com.mi.fitness.checkupdate.ota.IOtaManager;
import com.mi.fitness.checkupdate.ota.SilentUpgradeExtKt;
import com.mi.fitness.checkupdate.ota.SilentUpgradeManager;
import com.mi.fitness.checkupdate.ui.bluetooth.BluetoothOtaManager;
import com.mi.fitness.checkupdate.util.CheckUpdatePreferenceSupport;
import com.mi.fitness.checkupdate.util.DeviceSender;
import com.mi.fitness.checkupdate.util.Downloader;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import defpackage.kxo;
import defpackage.qch;
import defpackage.r72;
import java.io.File;
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
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 52\u00020\u0001:\u00015B\u0011\b\u0016\u0012\u0006\u00103\u001a\u00020\u0015¢\u0006\u0004\b4\u0010\u001eB\u0011\b\u0016\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b4\u0010)J#\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0007J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b \u0010\u001eJ\u0017\u0010!\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b!\u0010\"R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010*\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010\u001eR\u0016\u00102\u001a\u0004\u0018\u00010/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00066"}, d2 = {"Lcom/mi/fitness/checkupdate/ui/bluetooth/BluetoothOtaManager;", "Lcom/mi/fitness/checkupdate/ota/IOtaManager;", "Lkotlin/Function1;", "", "", "callback", "prepareOta", "(Lkotlin/jvm/functions/Function1;)V", "", "mode", "Lkxo;", "result", "onDeviceReady", "(ILkxo;Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lcom/mi/fitness/checkupdate/ota/DownloadListener;", "downloadListener", "startDownload", "(Lkotlinx/coroutines/CoroutineScope;Lcom/mi/fitness/checkupdate/ota/DownloadListener;)V", "startUpgrade", "", "md5", "Ljava/io/File;", "getFirmwareFile", "(Ljava/lang/String;)Ljava/io/File;", "isDownloaded", "()Z", "reason", "interruptIfNeed", "(Ljava/lang/String;)V", "did", "recordPushed", "isPushed", "(Ljava/lang/String;)Z", "Lcom/mi/fitness/checkupdate/model/LatestVersion;", "updateInfo", "Lcom/mi/fitness/checkupdate/model/LatestVersion;", "getUpdateInfo", "()Lcom/mi/fitness/checkupdate/model/LatestVersion;", "setUpdateInfo", "(Lcom/mi/fitness/checkupdate/model/LatestVersion;)V", "localPath", "Ljava/lang/String;", "getLocalPath", "()Ljava/lang/String;", "setLocalPath", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel", "path", "<init>", "Companion", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBluetoothOtaManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothOtaManager.kt\ncom/mi/fitness/checkupdate/ui/bluetooth/BluetoothOtaManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n1#2:211\n*E\n"})
public final class BluetoothOtaManager implements IOtaManager {

    @NotNull
    private static final String TAG = "BluetoothOtaManager";

    @Nullable
    private String localPath;

    @NotNull
    private LatestVersion updateInfo;

    /* JADX INFO: renamed from: com.mi.fitness.checkupdate.ui.bluetooth.BluetoothOtaManager$startDownload$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.fitness.checkupdate.ui.bluetooth.BluetoothOtaManager$startDownload$1", f = "BluetoothOtaManager.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13741 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DownloadListener $downloadListener;
        int label;

        /* JADX INFO: renamed from: com.mi.fitness.checkupdate.ui.bluetooth.BluetoothOtaManager$startDownload$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.mi.fitness.checkupdate.ui.bluetooth.BluetoothOtaManager$startDownload$1$1", f = "BluetoothOtaManager.kt", i = {}, l = {66, 75}, m = "invokeSuspend", n = {}, s = {})
        public static final class C02911 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ DownloadListener $downloadListener;
            int label;
            final /* synthetic */ BluetoothOtaManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02911(BluetoothOtaManager bluetoothOtaManager, DownloadListener downloadListener, Continuation<? super C02911> continuation) {
                super(2, continuation);
                this.this$0 = bluetoothOtaManager;
                this.$downloadListener = downloadListener;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(DownloadListener downloadListener) {
                downloadListener.onProgress(null, 100);
                downloadListener.onFinish(true);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$1(DownloadListener downloadListener, String str) {
                downloadListener.onFinish(false);
                return Unit.INSTANCE;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C02911(this.this$0, this.$downloadListener, continuation);
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
                Downloader downloader = Downloader.INSTANCE;
                String url = this.this$0.getUpdateInfo().getUrl();
                if (url == null) {
                    url = "";
                }
                BluetoothOtaManager bluetoothOtaManager = this.this$0;
                String md5 = bluetoothOtaManager.getUpdateInfo().getMD5();
                if (md5 == null) {
                    md5 = "";
                }
                File firmwareFile = bluetoothOtaManager.getFirmwareFile(md5);
                String md6 = this.this$0.getUpdateInfo().getMD5();
                if (md6 == null) {
                    md6 = "";
                }
                final DownloadListener downloadListener = this.$downloadListener;
                Function0<Unit> function0 = new Function0() { // from class: com.mi.fitness.checkupdate.ui.bluetooth.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BluetoothOtaManager.C13741.C02911.invokeSuspend$lambda$0(downloadListener);
                    }
                };
                final DownloadListener downloadListener2 = this.$downloadListener;
                Function1<? super String, Unit> function1 = new Function1() { // from class: com.mi.fitness.checkupdate.ui.bluetooth.b
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return BluetoothOtaManager.C13741.C02911.invokeSuspend$lambda$1(downloadListener2, (String) obj2);
                    }
                };
                this.label = 1;
                obj = downloader.download(url, firmwareFile, md6, function0, function1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                final DownloadListener downloadListener3 = this.$downloadListener;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.mi.fitness.checkupdate.ui.bluetooth.BluetoothOtaManager.startDownload.1.1.3

                    /* JADX INFO: renamed from: com.mi.fitness.checkupdate.ui.bluetooth.BluetoothOtaManager$startDownload$1$1$3$1, reason: invalid class name and collision with other inner class name */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "com.mi.fitness.checkupdate.ui.bluetooth.BluetoothOtaManager$startDownload$1$1$3$1", f = "BluetoothOtaManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    public static final class C02921 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ DownloadListener $downloadListener;
                        final /* synthetic */ int $progress;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C02921(DownloadListener downloadListener, int i, Continuation<? super C02921> continuation) {
                            super(2, continuation);
                            this.$downloadListener = downloadListener;
                            this.$progress = i;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C02921(this.$downloadListener, this.$progress, continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            this.$downloadListener.onProgress(null, this.$progress);
                            return Unit.INSTANCE;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((C02921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(int i2, Continuation<? super Unit> continuation) {
                        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new C02921(downloadListener3, i2, null), continuation);
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
                return ((C02911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13741(DownloadListener downloadListener, Continuation<? super C13741> continuation) {
            super(2, continuation);
            this.$downloadListener = downloadListener;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BluetoothOtaManager.this.new C13741(this.$downloadListener, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C02911 c02911 = new C02911(BluetoothOtaManager.this, this.$downloadListener, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c02911, this) == coroutine_suspended) {
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
            return ((C13741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public BluetoothOtaManager(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.localPath = path;
        LatestVersion latestVersion = new LatestVersion();
        this.updateInfo = latestVersion;
        latestVersion.setMd5(MD5Util.getFileMD5(new File(path)));
        this.updateInfo.setVersion("0");
        this.updateInfo.setForce(false);
    }

    private final WearableDeviceModel getMDeviceModel() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    private final void onDeviceReady(int mode, kxo result, final Function1<? super Boolean, Unit> callback) {
        Logger.d(TAG, "onDeviceReady() called with: result = " + result);
        DeviceSender deviceSender = DeviceSender.INSTANCE;
        String absolutePath = this.localPath;
        if (absolutePath != null) {
            Intrinsics.checkNotNull(absolutePath);
        } else {
            String md5 = this.updateInfo.getMD5();
            if (md5 == null) {
                md5 = "";
            }
            absolutePath = getFirmwareFile(md5).getAbsolutePath();
        }
        String str = absolutePath;
        Intrinsics.checkNotNull(str);
        deviceSender.startOta(mode, 1, str, result != null ? result.e : 0, new qch() { // from class: com.mi.fitness.checkupdate.ui.bluetooth.BluetoothOtaManager.onDeviceReady.1
            private boolean start;

            public final boolean getStart() {
                return this.start;
            }

            @Override // defpackage.qch
            public void onComplete() {
                Logger.i(BluetoothOtaManager.TAG, "onComplete() called");
                SilentUpgradeExtKt.finished(SilentUpgradeManager.INSTANCE);
            }

            @Override // defpackage.qch
            public void onError(int code, String msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                Logger.i(BluetoothOtaManager.TAG, "onError() called with: code = " + code);
                SilentUpgradeExtKt.interrupted(SilentUpgradeManager.INSTANCE, code);
            }

            @Override // defpackage.qch
            public void onProgress(int progress) {
                Logger.i(BluetoothOtaManager.TAG, "onProgress() called with: progress = " + progress);
                if (this.start) {
                    return;
                }
                this.start = true;
                callback.invoke2(Boolean.TRUE);
            }

            @Override // defpackage.qch
            public void onStart() {
                Logger.i(BluetoothOtaManager.TAG, "onStart: called");
            }

            public final void setStart(boolean z) {
                this.start = z;
            }
        });
    }

    private final void prepareOta(final Function1<? super Boolean, Unit> callback) {
        DeviceSender.INSTANCE.prepareOta(false, 15, this.updateInfo.getVersion(), this.updateInfo.getMD5(), new Function1() { // from class: r23
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BluetoothOtaManager.prepareOta$lambda$1(this.f32100a, callback, (kxo) obj);
            }
        }, new Function1() { // from class: s23
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BluetoothOtaManager.prepareOta$lambda$2(callback, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit prepareOta$lambda$1(BluetoothOtaManager this$0, Function1 callback, kxo kxoVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Logger.i(TAG, "preOtaCheck: " + (kxoVar != null ? Integer.valueOf(kxoVar.c) : null));
        Integer numValueOf = kxoVar != null ? Integer.valueOf(kxoVar.c) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            this$0.onDeviceReady(2, kxoVar, callback);
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            WearableDeviceModel mDeviceModel = this$0.getMDeviceModel();
            if (mDeviceModel != null) {
                this$0.recordPushed(mDeviceModel.getDid());
            }
        } else {
            callback.invoke2(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit prepareOta$lambda$2(Function1 callback, int i) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Logger.i(TAG, "preOtaCheck: result fail reason " + i);
        callback.invoke2(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    @Override // com.mi.fitness.checkupdate.ota.IOtaManager
    @NotNull
    public File getFirmwareFile(@NotNull String md5) {
        Intrinsics.checkNotNullParameter(md5, "md5");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        String processName = ApplicationExtKt.getProcessName(ApplicationExtKt.getApplication());
        File file = new File(r72.f(Environment.DIRECTORY_DOWNLOADS) + File.separator + (wearableDeviceModel != null ? DeviceModelExtKt.getModel(wearableDeviceModel) : null));
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, md5 + processName);
    }

    @Nullable
    public final String getLocalPath() {
        return this.localPath;
    }

    @NotNull
    public final LatestVersion getUpdateInfo() {
        return this.updateInfo;
    }

    @Override // com.mi.fitness.checkupdate.ota.IOtaManager
    public void interruptIfNeed(@NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Logger.i(TAG, "interruptIfNeed: " + SilentUpgradeManager.INSTANCE.getSilentUpgradeState());
        DeviceSender.INSTANCE.pauseOta();
    }

    @Override // com.mi.fitness.checkupdate.ota.IOtaManager
    public boolean isDownloaded() {
        String md5 = this.updateInfo.getMD5();
        if (md5 == null || md5.length() == 0) {
            return false;
        }
        String md6 = this.updateInfo.getMD5();
        Intrinsics.checkNotNull(md6);
        return Intrinsics.areEqual(MD5Util.getFileMD5(getFirmwareFile(md6)), this.updateInfo.getMD5());
    }

    @Override // com.mi.fitness.checkupdate.ota.IOtaManager
    public boolean isPushed(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        Logger.i(TAG, "isPushed() called with: did = " + did);
        String version = this.updateInfo.getVersion();
        return version != null && CheckUpdatePreferenceSupport.INSTANCE.isSilentUpgradePushed(did, version);
    }

    @Override // com.mi.fitness.checkupdate.ota.IOtaManager
    public void recordPushed(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        Logger.i(TAG, "recordPushed() called with: did = " + did);
        String version = this.updateInfo.getVersion();
        if (version != null) {
            Logger.i(TAG, "recordPushed: version " + this.updateInfo.getVersion());
            CheckUpdatePreferenceSupport.INSTANCE.setSilentUpgradePushed(did, version);
        }
        SilentUpgradeExtKt.finished(SilentUpgradeManager.INSTANCE);
    }

    public final void setLocalPath(@Nullable String str) {
        this.localPath = str;
    }

    public final void setUpdateInfo(@NotNull LatestVersion latestVersion) {
        Intrinsics.checkNotNullParameter(latestVersion, "<set-?>");
        this.updateInfo = latestVersion;
    }

    @Override // com.mi.fitness.checkupdate.ota.IOtaManager
    public void startDownload(@NotNull CoroutineScope scope, @NotNull DownloadListener downloadListener) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(downloadListener, "downloadListener");
        String diffUrl = this.updateInfo.getDiffUrl();
        boolean z = false;
        if (diffUrl != null && diffUrl.length() > 0) {
            z = true;
        }
        Logger.i(TAG, "startDownload: diffUrl = " + z);
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new C13741(downloadListener, null), 3, null);
    }

    @Override // com.mi.fitness.checkupdate.ota.IOtaManager
    public void startUpgrade(@NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Logger.d(TAG, "startUpgrade() called");
        if (!DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).isIDLE()) {
            Logger.i(TAG, "startUpgrade: current queue status is busy");
            callback.invoke2(Boolean.FALSE);
            return;
        }
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        if (mDeviceModel == null || DeviceModelExtKt.getOtaMode(mDeviceModel) != 1) {
            prepareOta(callback);
        } else {
            onDeviceReady(1, null, callback);
        }
    }

    public BluetoothOtaManager(@NotNull LatestVersion updateInfo) {
        Intrinsics.checkNotNullParameter(updateInfo, "updateInfo");
        this.updateInfo = updateInfo;
    }
}
