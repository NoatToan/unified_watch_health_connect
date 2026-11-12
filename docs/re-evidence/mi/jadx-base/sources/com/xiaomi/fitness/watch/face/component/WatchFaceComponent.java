package com.xiaomi.fitness.watch.face.component;

import com.fitness.banner.export.compare.ABTestResponseResult;
import com.fitness.banner.export.compare.ICompare;
import com.fitness.banner.export.compare.ICompareKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.watch.face.component.WatchFaceComponent;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.export.FaceHelper;
import com.xiaomi.fitness.watch.face.export.FaceHelperExtKt;
import com.xiaomi.fitness.watch.face.export.FaceHelperImpl;
import com.xiaomi.fitness.watch.face.export.exportview.FaceIcon;
import com.xiaomi.fitness.watch.face.helper.FacePreference;
import com.xiaomi.fitness.watch.face.schema.FaceSchema;
import defpackage.s7r;
import defpackage.xfl;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00060\fR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/watch/face/component/WatchFaceComponent;", "", "<init>", "()V", "TAG", "", "currentDid", "setFaceComponent", "", "faceSyncListener", "registerSchema", "faceChangeDataHandler", "Lcom/xiaomi/fitness/watch/face/component/WatchFaceComponent$FaceChangeDataHandler;", "getIfSupportMultiPhotoFace", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getTestType", "FaceChangeDataHandler", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "watch-face")
public final class WatchFaceComponent {

    @NotNull
    private final String TAG = "WatchFaceComponent";

    @NotNull
    private String currentDid = "";

    @NotNull
    private final FaceChangeDataHandler faceChangeDataHandler = new FaceChangeDataHandler();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/watch/face/component/WatchFaceComponent$FaceChangeDataHandler;", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "", "did", "", "type", "Ls7r;", "packet", "", "handlePacket", "(Ljava/lang/String;ILs7r;)Z", "<init>", "(Lcom/xiaomi/fitness/watch/face/component/WatchFaceComponent;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class FaceChangeDataHandler extends DataHandlerWrapper {
        public FaceChangeDataHandler() {
        }

        @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
        public boolean handlePacket(@NotNull String did, int type, @Nullable s7r packet) {
            Intrinsics.checkNotNullParameter(did, "did");
            Logger.i(WatchFaceComponent.this.TAG, "faceChangeListener type: " + type);
            if (type != 4 || packet == null) {
                return false;
            }
            int i = packet.f;
            Logger.i(WatchFaceComponent.this.TAG, "faceChangeListener id: " + i);
            if (i == 0) {
                FaceHelper faceHelperExtKt = FaceHelperExtKt.getInstance(FaceHelper.INSTANCE);
                Intrinsics.checkNotNull(faceHelperExtKt, "null cannot be cast to non-null type com.xiaomi.fitness.watch.face.export.FaceHelperImpl");
                ((FaceHelperImpl) faceHelperExtKt).onSyncFaceFinish(packet);
                return false;
            }
            FaceHelper.Companion companion = FaceHelper.INSTANCE;
            FaceHelper faceHelperExtKt2 = FaceHelperExtKt.getInstance(companion);
            Intrinsics.checkNotNull(faceHelperExtKt2, "null cannot be cast to non-null type com.xiaomi.fitness.watch.face.export.FaceHelperImpl");
            if (((FaceHelperImpl) faceHelperExtKt2).getRemoveInvalidFaces()) {
                Logger.i(WatchFaceComponent.this.TAG, "removeInvalidFaces, return");
            }
            if (i != 1 && i != 2) {
                return false;
            }
            Logger.i(WatchFaceComponent.this.TAG, "faceChangeListener packet: " + packet);
            FaceHelper faceHelperExtKt3 = FaceHelperExtKt.getInstance(companion);
            Intrinsics.checkNotNull(faceHelperExtKt3, "null cannot be cast to non-null type com.xiaomi.fitness.watch.face.export.FaceHelperImpl");
            ((FaceHelperImpl) faceHelperExtKt3).syncLocalFace();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.component.WatchFaceComponent$getIfSupportMultiPhotoFace$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.component.WatchFaceComponent$getIfSupportMultiPhotoFace$1", f = "WatchFaceComponent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WearableDeviceModel $deviceModel;
        int label;
        final /* synthetic */ WatchFaceComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WearableDeviceModel wearableDeviceModel, WatchFaceComponent watchFaceComponent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$deviceModel = wearableDeviceModel;
            this.this$0 = watchFaceComponent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$deviceModel, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(DeviceModelExtKt.getMac(this.$deviceModel));
            if (huaMiApiCaller == null) {
                return Unit.INSTANCE;
            }
            boolean zIsSupportDialFontCustomColor = huaMiApiCaller.isSupportDialFontCustomColor();
            Logger.i(this.this$0.TAG, "getIfSupportMultiPhotoFace: " + zIsSupportDialFontCustomColor);
            FaceManager.INSTANCE.setSupportHuamiMultiPhoto(zIsSupportDialFontCustomColor);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.component.WatchFaceComponent$getTestType$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.component.WatchFaceComponent$getTestType$1", f = "WatchFaceComponent.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33621 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WearableDeviceModel $deviceModel;
        int label;
        final /* synthetic */ WatchFaceComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33621(WearableDeviceModel wearableDeviceModel, WatchFaceComponent watchFaceComponent, Continuation<? super C33621> continuation) {
            super(2, continuation);
            this.$deviceModel = wearableDeviceModel;
            this.this$0 = watchFaceComponent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C33621(this.$deviceModel, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            boolean z = true;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ICompare instance = ICompareKt.getINSTANCE(ICompare.INSTANCE);
                WearableDeviceModel wearableDeviceModel = this.$deviceModel;
                this.label = 1;
                obj = instance.getTestResult(2, wearableDeviceModel, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ABTestResponseResult aBTestResponseResult = (ABTestResponseResult) obj;
            int status = aBTestResponseResult.getStatus();
            int groupType = aBTestResponseResult.getGroupType();
            String layerName = aBTestResponseResult.getLayerName();
            if (layerName == null) {
                layerName = "";
            }
            long groupId = aBTestResponseResult.getGroupId();
            ICompare.Companion companion = ICompare.INSTANCE;
            ICompareKt.getINSTANCE(companion).setLayerName(layerName);
            if (status != 3) {
                ICompareKt.getINSTANCE(companion).setGroupId(CollectionsKt__CollectionsJVMKt.listOf(String.valueOf(groupId)));
            }
            Logger.i(this.this$0.TAG, "getTestType status: " + status + " groupType: " + groupType);
            FacePreference facePreference = FacePreference.INSTANCE;
            facePreference.updatePurchaseButton(status == 2 || (status == 1 && groupType == 1));
            if (status != 2 && (status != 1 || groupType != 2)) {
                z = false;
            }
            facePreference.updateBulletScreen(z);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void faceSyncListener() {
        Logger.i(this.TAG, "add addDeviceChangeListener");
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).addDataHandler(4, this.faceChangeDataHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getIfSupportMultiPhotoFace(WearableDeviceModel deviceModel) {
        AnyExtKt.io$default(null, new AnonymousClass1(deviceModel, this, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getTestType(WearableDeviceModel deviceModel) {
        ScopeExtKt.scopeNet(Dispatchers.getIO(), new C33621(deviceModel, this, null));
    }

    private final void registerSchema() {
        xfl.a().d(new FaceSchema());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setFaceComponent$lambda$0(WatchFaceComponent this$0, WearableDeviceModel wearableDeviceModel) {
        String did;
        WearableDeviceInfo deviceInfo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(this$0.TAG, "onDeviceChange to " + ((wearableDeviceModel == null || (deviceInfo = wearableDeviceModel.getDeviceInfo()) == null) ? null : deviceInfo.getName()));
        if (!Intrinsics.areEqual(wearableDeviceModel != null ? wearableDeviceModel.getDid() : null, this$0.currentDid)) {
            if (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null) {
                did = "";
            }
            this$0.currentDid = did;
            FaceManager.INSTANCE.reset();
        }
        if (wearableDeviceModel == null) {
            return Unit.INSTANCE;
        }
        Logger.i(this$0.TAG, "to prevent foreground process rebuild, refreshFaceIcon");
        FaceIcon.setProperty(DeviceModelExtKt.getSize(wearableDeviceModel));
        return Unit.INSTANCE;
    }

    @ComponentTask(notLaterThan = 8, onMainThread = false)
    public final void setFaceComponent() {
        faceSyncListener();
        registerSchema();
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        DeviceManagerExtKt.getInstance(companion).addDeviceStatusListener(new OnDeviceStatusListener() { // from class: com.xiaomi.fitness.watch.face.component.WatchFaceComponent.setFaceComponent.1
            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectFailure(String did, int errorCode, int retryTimes) {
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectStart(String did) {
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectSuccess(String did) {
                WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
                if (did == null) {
                    did = "";
                }
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) deviceManagerExtKt.getDeviceModel(did);
                if (wearableDeviceModel == null) {
                    return;
                }
                if (DeviceModelExtKt.isL66(wearableDeviceModel)) {
                    WatchFaceComponent.this.getIfSupportMultiPhotoFace(wearableDeviceModel);
                }
                WatchFaceComponent.this.getTestType(wearableDeviceModel);
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onDisconnect(String did) {
                Logger.i(WatchFaceComponent.this.TAG, did + " onDisconnect, clear all local faces");
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                Logger.i(WatchFaceComponent.this.TAG, did + " onDisconnect, mainDevice: " + (wearableDeviceModel != null ? wearableDeviceModel.getDid() : null));
                if (Intrinsics.areEqual(wearableDeviceModel != null ? wearableDeviceModel.getDid() : null, did)) {
                    FaceManager.INSTANCE.disconnect();
                }
            }
        });
        DeviceManagerExtKt.getInstance(companion).addDeviceChangeListener(new Function1() { // from class: c5r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WatchFaceComponent.setFaceComponent$lambda$0(this.f4966a, (WearableDeviceModel) obj);
            }
        });
    }
}
