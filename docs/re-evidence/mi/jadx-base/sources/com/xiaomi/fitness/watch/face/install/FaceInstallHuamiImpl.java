package com.xiaomi.fitness.watch.face.install;

import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.bt.sdk.ISkinStorageStatusCallback;
import com.xiaomi.hm.health.bt.sdk.ISyncSkinCallback;
import com.xiaomi.hm.health.bt.sdk.data.DeviceBatteryInfo;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005Jy\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132 \u0010\u0014\u001a\u001c\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00070\u0015H\u0016¢\u0006\u0002\u0010\u0016J3\u0010\u0017\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0016¢\u0006\u0002\u0010\u001bR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/watch/face/install/FaceInstallHuamiImpl;", "Lcom/xiaomi/fitness/watch/face/install/FaceInstallBaseImpl;", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "<init>", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "preInstall", "", "id", "", "path", "version", "", MediaStoreUtil.MediaInfo.SIZE, "needCheckStorage", "", "license", "sign", "trialDuration", "", "action", "Lkotlin/Function3;", "(Ljava/lang/String;Ljava/lang/String;JJZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function3;)V", "doInstall", "segmentLength", "callback", "Lcom/xiaomi/fitness/watch/face/install/FaceInstallPushCallback;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/xiaomi/fitness/watch/face/install/FaceInstallPushCallback;)V", "TAG", "getTAG", "()Ljava/lang/String;", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceInstallHuamiImpl extends FaceInstallBaseImpl {

    @Nullable
    private final WearableDeviceModel deviceModel;

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.install.FaceInstallHuamiImpl$doInstall$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.install.FaceInstallHuamiImpl$doInstall$1", f = "FaceInstallHuamiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FaceInstallPushCallback $callback;
        final /* synthetic */ HuamiApiCaller $huamiApiCaller;
        final /* synthetic */ String $path;
        int label;
        final /* synthetic */ FaceInstallHuamiImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HuamiApiCaller huamiApiCaller, String str, FaceInstallPushCallback faceInstallPushCallback, FaceInstallHuamiImpl faceInstallHuamiImpl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$huamiApiCaller = huamiApiCaller;
            this.$path = str;
            this.$callback = faceInstallPushCallback;
            this.this$0 = faceInstallHuamiImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$huamiApiCaller, this.$path, this.$callback, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HuamiApiCaller huamiApiCaller = this.$huamiApiCaller;
            String str = this.$path;
            final FaceInstallPushCallback faceInstallPushCallback = this.$callback;
            final FaceInstallHuamiImpl faceInstallHuamiImpl = this.this$0;
            huamiApiCaller.syncSkin(str, new ISyncSkinCallback() { // from class: com.xiaomi.fitness.watch.face.install.FaceInstallHuamiImpl.doInstall.1.1
                @Override // com.xiaomi.hm.health.bt.sdk.ISyncSkinCallback
                public void onProgress(Progress p0) {
                    Intrinsics.checkNotNullParameter(p0, "p0");
                    AnyExtKt.main$default(null, new FaceInstallHuamiImpl$doInstall$1$1$onProgress$1(faceInstallPushCallback, p0, null), 1, null);
                }

                @Override // com.xiaomi.hm.health.bt.sdk.ISyncSkinCallback
                public void onStart() {
                    AnyExtKt.main$default(null, new FaceInstallHuamiImpl$doInstall$1$1$onStart$1(faceInstallPushCallback, null), 1, null);
                }

                @Override // com.xiaomi.hm.health.bt.sdk.ISyncSkinCallback
                public void onStop(int p0) {
                    Logger.i(faceInstallHuamiImpl.getTAG(), "installFace onStop: " + p0);
                    AnyExtKt.main$default(null, new FaceInstallHuamiImpl$doInstall$1$1$onStop$1(p0, faceInstallPushCallback, null), 1, null);
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.install.FaceInstallHuamiImpl$preInstall$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.install.FaceInstallHuamiImpl$preInstall$1", f = "FaceInstallHuamiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33801 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3<Boolean, Integer, Integer, Unit> $action;
        final /* synthetic */ HuamiApiCaller $huamiApiCaller;
        final /* synthetic */ String $path;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.install.FaceInstallHuamiImpl$preInstall$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.watch.face.install.FaceInstallHuamiImpl$preInstall$1$1", f = "FaceInstallHuamiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C08111 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function3<Boolean, Integer, Integer, Unit> $action;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C08111(Function3<? super Boolean, ? super Integer, ? super Integer, Unit> function3, Continuation<? super C08111> continuation) {
                super(2, continuation);
                this.$action = function3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C08111(this.$action, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$action.invoke(Boxing.boxBoolean(false), Boxing.boxInt(102), null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C08111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.install.FaceInstallHuamiImpl$preInstall$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.watch.face.install.FaceInstallHuamiImpl$preInstall$1$2", f = "FaceInstallHuamiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function3<Boolean, Integer, Integer, Unit> $action;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(Function3<? super Boolean, ? super Integer, ? super Integer, Unit> function3, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$action = function3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$action, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$action.invoke(Boxing.boxBoolean(false), Boxing.boxInt(4), null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C33801(HuamiApiCaller huamiApiCaller, String str, Function3<? super Boolean, ? super Integer, ? super Integer, Unit> function3, Continuation<? super C33801> continuation) {
            super(2, continuation);
            this.$huamiApiCaller = huamiApiCaller;
            this.$path = str;
            this.$action = function3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(Function3 function3, FaceInstallHuamiImpl faceInstallHuamiImpl, boolean z) {
            AnyExtKt.main$default(null, new FaceInstallHuamiImpl$preInstall$1$3$1(z, function3, faceInstallHuamiImpl, null), 1, null);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceInstallHuamiImpl.this.new C33801(this.$huamiApiCaller, this.$path, this.$action, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WearableDeviceModel wearableDeviceModel = FaceInstallHuamiImpl.this.deviceModel;
            if (wearableDeviceModel != null && DeviceModelExtKt.isL66(wearableDeviceModel)) {
                HuamiApiCaller huamiApiCaller = this.$huamiApiCaller;
                int[] watchFacesAllSync = huamiApiCaller != null ? huamiApiCaller.getWatchFacesAllSync() : null;
                Logger.i(FaceInstallHuamiImpl.this.getTAG(), "L66 onStorageCheck install: " + (watchFacesAllSync != null ? Boxing.boxInt(watchFacesAllSync.length) : null));
                if (watchFacesAllSync == null || watchFacesAllSync.length >= 10) {
                    AnyExtKt.main$default(null, new C08111(this.$action, null), 1, null);
                    return Unit.INSTANCE;
                }
            }
            HuamiApiCaller huamiApiCaller2 = this.$huamiApiCaller;
            DeviceBatteryInfo batteryLevel = huamiApiCaller2 != null ? huamiApiCaller2.getBatteryLevel() : null;
            if (batteryLevel != null && batteryLevel.getLevel() <= 10) {
                AnyExtKt.main$default(null, new AnonymousClass2(this.$action, null), 1, null);
                return Unit.INSTANCE;
            }
            HuamiApiCaller huamiApiCaller3 = this.$huamiApiCaller;
            if (huamiApiCaller3 != null) {
                String str = this.$path;
                final Function3<Boolean, Integer, Integer, Unit> function3 = this.$action;
                final FaceInstallHuamiImpl faceInstallHuamiImpl = FaceInstallHuamiImpl.this;
                huamiApiCaller3.storageStatus(str, new ISkinStorageStatusCallback() { // from class: com.xiaomi.fitness.watch.face.install.a
                    @Override // com.xiaomi.hm.health.bt.sdk.ISkinStorageStatusCallback
                    public final void onMemory(boolean z) {
                        FaceInstallHuamiImpl.C33801.invokeSuspend$lambda$0(function3, faceInstallHuamiImpl, z);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public FaceInstallHuamiImpl(@Nullable WearableDeviceModel wearableDeviceModel) {
        super(wearableDeviceModel);
        this.deviceModel = wearableDeviceModel;
    }

    @Override // com.xiaomi.fitness.watch.face.install.FaceInstallController
    public void doInstall(@Nullable String path, @Nullable String id, @Nullable Integer segmentLength, @NotNull FaceInstallPushCallback callback) {
        String mac;
        Intrinsics.checkNotNullParameter(callback, "callback");
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        if (wearableDeviceModel == null || (mac = DeviceModelExtKt.getMac(wearableDeviceModel)) == null) {
            mac = "";
        }
        HuamiApiCaller huaMiApiCaller = deviceManagerExtKt.getHuaMiApiCaller(mac);
        if (huaMiApiCaller == null) {
            callback.onFinish(false, 255);
        } else {
            AnyExtKt.io$default(null, new AnonymousClass1(huaMiApiCaller, path, callback, this, null), 1, null);
        }
    }

    @Override // com.xiaomi.fitness.watch.face.install.FaceInstallBaseImpl
    @NotNull
    public String getTAG() {
        return "FaceInstallHuamiImpl";
    }

    @Override // com.xiaomi.fitness.watch.face.install.FaceInstallController
    public void preInstall(@Nullable String id, @Nullable String path, long version, long size, boolean needCheckStorage, @Nullable String license, @Nullable String sign, @Nullable Integer trialDuration, @NotNull Function3<? super Boolean, ? super Integer, ? super Integer, Unit> action) {
        String mac;
        Intrinsics.checkNotNullParameter(action, "action");
        if (!needCheckStorage) {
            action.invoke(Boolean.TRUE, 0, null);
            return;
        }
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        if (wearableDeviceModel == null || (mac = DeviceModelExtKt.getMac(wearableDeviceModel)) == null) {
            mac = "";
        }
        AnyExtKt.io$default(null, new C33801(deviceManagerExtKt.getHuaMiApiCaller(mac), path, action, null), 1, null);
    }
}
