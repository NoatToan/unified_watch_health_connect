package com.xiaomi.wearable.yrn.modules;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.component.Constants;
import com.miui.circulate.device.api.Column;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.contact.export.SyncStateListener;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.a;
import com.xiaomi.fitness.device.manager.bean.BatteryInfo;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceParameter;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.e;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDevice;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.device.manager.l;
import com.xiaomi.fitness.habit.ui.HabitShareActivity;
import com.xiaomi.fitness.watch.face.export.FaceHelper;
import com.xiaomi.fitness.watch.face.export.FaceHelperExtKt;
import com.xiaomi.fitness.watch.face.export.IFaceListener;
import com.xiaomi.fitness.watch.face.export.data.FaceEditPhotoBean;
import com.xiaomi.fitness.watch.face.export.data.WatchFace;
import com.xiaomi.fitness.watch.face.export.data.WatchFaceSlotItem;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import com.xiaomi.wearable.yrn.modules.WearDeviceModule;
import defpackage.dsf;
import defpackage.s7r;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0081\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u00030:P\u0018\u00002\u00020\u0001:\u0001ZB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0018\u001a\u00020\u0007H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u0018\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u0018\u0010\"\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J \u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u0010\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u0016H\u0007J\u0010\u0010)\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u0016H\u0007J:\u0010*\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u00162\b\u0010,\u001a\u0004\u0018\u00010\u00072\u0006\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u001cH\u0007J\b\u00102\u001a\u00020\u001aH\u0007J\b\u00103\u001a\u00020\u001aH\u0007J\b\u00107\u001a\u00020\u001aH\u0007J\b\u00108\u001a\u00020\u001aH\u0007J\b\u0010<\u001a\u00020\u001aH\u0007J\b\u0010=\u001a\u00020\u001aH\u0007J\u0018\u0010>\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u0018\u0010?\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J \u0010@\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\u001c2\u0006\u0010C\u001a\u00020\u001cH\u0007J\u0010\u0010D\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u0007H\u0007JD\u0010E\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020\u00072\u0006\u0010G\u001a\u00020\u00072\b\u0010H\u001a\u0004\u0018\u00010\u00072\b\u0010I\u001a\u0004\u0018\u00010\u00072\u0006\u0010J\u001a\u00020&2\u0006\u0010B\u001a\u00020\u001c2\u0006\u0010C\u001a\u00020\u001cH\u0007J \u0010K\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010B\u001a\u00020\u001c2\u0006\u0010C\u001a\u00020\u001cH\u0007J\u0010\u0010L\u001a\u00020\u001a2\u0006\u0010M\u001a\u00020NH\u0007J\b\u0010R\u001a\u00020\u001aH\u0007J\u0010\u0010S\u001a\u00020\u001a2\u0006\u0010M\u001a\u00020NH\u0007J\u0012\u0010T\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u000106H\u0002J\u0010\u0010W\u001a\u00020U2\u0006\u0010X\u001a\u00020YH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R#\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR#\u0010\u000f\u001a\n \n*\u0004\u0018\u00010\u00100\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\b\u0012\u00060\u0017R\u00020\u00000\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0004\n\u0002\u00101R\u001c\u00104\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000106\u0012\u0004\u0012\u00020\u001a05X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00109\u001a\u00020:X\u0082\u0004¢\u0006\u0004\n\u0002\u0010;R\u0010\u0010O\u001a\u00020PX\u0082\u0004¢\u0006\u0004\n\u0002\u0010Q¨\u0006["}, d2 = {"Lcom/xiaomi/wearable/yrn/modules/WearDeviceModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "TAG", "", "encoder", "Ljava/util/Base64$Encoder;", "kotlin.jvm.PlatformType", "getEncoder", "()Ljava/util/Base64$Encoder;", "encoder$delegate", "Lkotlin/Lazy;", "decoder", "Ljava/util/Base64$Decoder;", "getDecoder", "()Ljava/util/Base64$Decoder;", "decoder$delegate", "dataHandlers", "", "", "Lcom/xiaomi/wearable/yrn/modules/WearDeviceModule$RNDataHandlerWrapper;", "getName", "getCurrentDeviceModel", "", "callback", "Lcom/facebook/react/bridge/Callback;", "getCurrentAccessoryDevice", "isHaveAccessoryDevice", "getDeviceModel", "did", "getDeviceModels", "isConnected", "sendMessageToDevice", Constants.KEY_REQUEST_DATA, "options", "Lcom/facebook/react/bridge/ReadableMap;", "registerDeviceReportHandler", "type", "removeDeviceReportHandler", "sendFileToDevice", "detailType", "path", "segmentLength", "finishCallback", "onDeviceStatusListener", "com/xiaomi/wearable/yrn/modules/WearDeviceModule$onDeviceStatusListener$1", "Lcom/xiaomi/wearable/yrn/modules/WearDeviceModule$onDeviceStatusListener$1;", "addDeviceConnectStatusListener", "removeDeviceConnectStatusListener", "deviceChangedListener", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "addDeviceChangeListener", "removeDeviceChangeListener", "syncStateListener", "com/xiaomi/wearable/yrn/modules/WearDeviceModule$syncStateListener$1", "Lcom/xiaomi/wearable/yrn/modules/WearDeviceModule$syncStateListener$1;", "addSyncStateListener", "removeSyncStateListener", "getDeviceCapability", "getDeviceCapabilityV2", "connectDevice", "connectDid", "success", "failure", "disconnectDevice", "bindDevice", "model", "mac", "bleName", "nodeId", "bindParameter", "unbindDevice", "getWatchFace", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "faceChangeListener", "com/xiaomi/wearable/yrn/modules/WearDeviceModule$faceChangeListener$1", "Lcom/xiaomi/wearable/yrn/modules/WearDeviceModule$faceChangeListener$1;", "registerFaceChangeListener", "supportImageSegment", "convertDeviceModel", "Lcom/facebook/react/bridge/WritableMap;", "deviceModel", "convertWatchFace", "watchFace", "Lcom/xiaomi/fitness/watch/face/export/data/WatchFace;", "RNDataHandlerWrapper", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWearDeviceModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WearDeviceModule.kt\ncom/xiaomi/wearable/yrn/modules/WearDeviceModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,639:1\n1863#2,2:640\n1863#2,2:646\n1863#2,2:648\n1863#2,2:650\n1863#2,2:652\n1863#2,2:658\n1863#2,2:660\n216#3,2:642\n216#3,2:644\n216#3,2:654\n13402#4,2:656\n*S KotlinDebug\n*F\n+ 1 WearDeviceModule.kt\ncom/xiaomi/wearable/yrn/modules/WearDeviceModule\n*L\n86#1:640,2\n497#1:646,2\n526#1:648,2\n532#1:650,2\n535#1:652,2\n599#1:658,2\n614#1:660,2\n405#1:642,2\n469#1:644,2\n538#1:654,2\n594#1:656,2\n*E\n"})
public final class WearDeviceModule extends ReactContextBaseJavaModule {

    @NotNull
    private final String TAG;

    @NotNull
    private final Map<Integer, RNDataHandlerWrapper> dataHandlers;

    /* JADX INFO: renamed from: decoder$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy decoder;

    @NotNull
    private final Function1<WearableDeviceModel, Unit> deviceChangedListener;

    /* JADX INFO: renamed from: encoder$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy encoder;

    @NotNull
    private final WearDeviceModule$faceChangeListener$1 faceChangeListener;

    @NotNull
    private final WearDeviceModule$onDeviceStatusListener$1 onDeviceStatusListener;

    @NotNull
    private final WearDeviceModule$syncStateListener$1 syncStateListener;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/wearable/yrn/modules/WearDeviceModule$RNDataHandlerWrapper;", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "", "did", "", "type", "Ls7r;", "packet", "", "handlePacket", "(Ljava/lang/String;ILs7r;)Z", "<init>", "(Lcom/xiaomi/wearable/yrn/modules/WearDeviceModule;)V", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class RNDataHandlerWrapper extends DataHandlerWrapper {
        public RNDataHandlerWrapper() {
        }

        @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
        public boolean handlePacket(@NotNull String did, int type, @Nullable s7r packet) {
            Intrinsics.checkNotNullParameter(did, "did");
            if (packet != null) {
                String strEncodeToString = WearDeviceModule.this.getEncoder().encodeToString(dsf.i(packet));
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("key", String.valueOf(type));
                writableMapCreateMap.putString("value", strEncodeToString);
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) WearDeviceModule.this.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("RECEIVER_DEVICE_REPORT_MESSAGE", writableMapCreateMap);
                Logger.i(WearDeviceModule.this.TAG, "handlePacket send success");
            } else {
                Logger.i(WearDeviceModule.this.TAG, "handlePacket send fail");
            }
            return super.handlePacket(did, type, packet);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v10, types: [com.xiaomi.wearable.yrn.modules.WearDeviceModule$faceChangeListener$1] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.xiaomi.wearable.yrn.modules.WearDeviceModule$onDeviceStatusListener$1] */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.xiaomi.wearable.yrn.modules.WearDeviceModule$syncStateListener$1] */
    public WearDeviceModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.TAG = "WearDeviceModule";
        this.encoder = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: f7r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Base64.getEncoder();
            }
        });
        this.decoder = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: g7r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Base64.getDecoder();
            }
        });
        this.dataHandlers = new LinkedHashMap();
        this.onDeviceStatusListener = new OnDeviceStatusListener() { // from class: com.xiaomi.wearable.yrn.modules.WearDeviceModule$onDeviceStatusListener$1
            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectFailure(String did, int errorCode, int retryTimes) {
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectStart(String did) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("status", "WEAR_DEVICE_STATUS_CONNECT_CONNECTING");
                writableMapCreateMap.putString("did", did);
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.this$0.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("WEAR_DEVICE_CONNECT_STATUS_CHANGE", writableMapCreateMap);
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectSuccess(String did) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("status", "WEAR_DEVICE_STATUS_CONNECT_CONNECTED");
                writableMapCreateMap.putString("did", did);
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.this$0.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("WEAR_DEVICE_CONNECT_STATUS_CHANGE", writableMapCreateMap);
                Logger.i(this.this$0.TAG, "onConnectSuccess " + did);
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onDisconnect(String did) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("status", "WEAR_DEVICE_STATUS_DISCONNECT");
                writableMapCreateMap.putString("did", did);
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.this$0.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("WEAR_DEVICE_CONNECT_STATUS_CHANGE", writableMapCreateMap);
                Logger.i(this.this$0.TAG, "onDisconnect " + did);
            }
        };
        this.deviceChangedListener = new Function1() { // from class: h7r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WearDeviceModule.deviceChangedListener$lambda$4(this.f19786a, (WearableDeviceModel) obj);
            }
        };
        this.syncStateListener = new SyncStateListener() { // from class: com.xiaomi.wearable.yrn.modules.WearDeviceModule$syncStateListener$1
            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onFinish(String did, int code) {
                Intrinsics.checkNotNullParameter(did, "did");
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("status", "WEAR_DEVICE_SYNC_FINISH");
                writableMapCreateMap.putString("did", did);
                writableMapCreateMap.putInt("code", code);
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.this$0.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("WEAR_DEVICE_SYNC", writableMapCreateMap);
                Logger.i(this.this$0.TAG, "onFinish " + did + " " + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onStart(String did) {
                Intrinsics.checkNotNullParameter(did, "did");
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("status", "WEAR_DEVICE_SYNC_START");
                writableMapCreateMap.putString("did", did);
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.this$0.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("WEAR_DEVICE_SYNC", writableMapCreateMap);
                Logger.i(this.this$0.TAG, "onStart " + did);
            }

            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onSyncing(String did, int progress) {
                Intrinsics.checkNotNullParameter(did, "did");
            }
        };
        this.faceChangeListener = new IFaceListener() { // from class: com.xiaomi.wearable.yrn.modules.WearDeviceModule$faceChangeListener$1
            @Override // com.xiaomi.fitness.watch.face.export.IFaceListener
            public void onFaceChanged(String faceId) {
                Intrinsics.checkNotNullParameter(faceId, "faceId");
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.this$0.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("FACE_LIST_CHANGE", "");
                Logger.i(this.this$0.TAG, "onFaceChanged " + faceId);
            }
        };
    }

    private final WritableMap convertDeviceModel(WearableDeviceModel deviceModel) {
        Map<String, String> featureMap;
        List<String> androidFeature;
        List<String> whitelistFeature;
        List<String> features;
        Integer iotSubCategoryId;
        Integer image_format;
        Integer image_format_exist;
        Float android_scale;
        List<String> wearOsModelIds;
        Map<String, String> extraValues;
        WritableMap writableMapCreateMap = Arguments.createMap();
        Logger.d(this.TAG, "convertDeviceModel " + (deviceModel != null ? Integer.valueOf(deviceModel.getDeviceStatus()) : null));
        if (deviceModel == null) {
            Intrinsics.checkNotNull(writableMapCreateMap);
            return writableMapCreateMap;
        }
        writableMapCreateMap.putInt("deviceStatus", deviceModel.getDeviceStatus());
        writableMapCreateMap.putBoolean("isDeviceConnected", deviceModel.getIsDeviceConnected());
        writableMapCreateMap.putString("did", deviceModel.getDid());
        writableMapCreateMap.putBoolean("isCurrent", deviceModel.getIsCurrent());
        writableMapCreateMap.putString("alias", deviceModel.getAlias());
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        WearableDeviceInfo deviceInfo = deviceModel.getDeviceInfo();
        WritableMap writableMapCreateMap3 = Arguments.createMap();
        WearableDevice wearableDevice = (WearableDevice) deviceInfo.device;
        writableMapCreateMap3.putString("did", wearableDevice != null ? wearableDevice.getDid() : null);
        writableMapCreateMap3.putString("model", wearableDevice != null ? wearableDevice.getModel() : null);
        writableMapCreateMap3.putString("name", wearableDevice != null ? wearableDevice.getName() : null);
        WritableMap writableMapCreateMap4 = Arguments.createMap();
        if (wearableDevice != null && (extraValues = wearableDevice.getExtraValues()) != null) {
            for (Map.Entry<String, String> entry : extraValues.entrySet()) {
                writableMapCreateMap4.putString(entry.getKey(), entry.getValue());
            }
            Unit unit = Unit.INSTANCE;
        }
        Unit unit2 = Unit.INSTANCE;
        writableMapCreateMap3.putMap("extraValues", writableMapCreateMap4);
        writableMapCreateMap3.putString("identifier", wearableDevice != null ? wearableDevice.getIdentifier() : null);
        writableMapCreateMap3.putString("alias", wearableDevice != null ? wearableDevice.getAlias() : null);
        writableMapCreateMap3.putInt("status", wearableDevice != null ? wearableDevice.getStatus() : -1);
        WritableMap writableMapCreateMap5 = Arguments.createMap();
        Device.Detail detail = wearableDevice != null ? wearableDevice.getDetail() : null;
        writableMapCreateMap5.putString("mac", detail != null ? detail.getMac() : null);
        writableMapCreateMap5.putString("sn", detail != null ? detail.getSn() : null);
        writableMapCreateMap5.putString("token", detail != null ? detail.getToken() : null);
        writableMapCreateMap5.putString("encryptKey", detail != null ? detail.getEncryptKey() : null);
        writableMapCreateMap5.putString("irqKey", detail != null ? detail.getIrqKey() : null);
        writableMapCreateMap5.putString("beaconKey", detail != null ? detail.getBeaconKey() : null);
        writableMapCreateMap5.putString("thirdNodeId", detail != null ? detail.getThirdNodeId() : null);
        writableMapCreateMap5.putString("authKey", detail != null ? detail.getAuthKey() : null);
        writableMapCreateMap5.putString("macAddress", detail != null ? detail.getMacAddress() : null);
        writableMapCreateMap5.putString("deviceId", detail != null ? detail.getDeviceId() : null);
        writableMapCreateMap5.putString("phoneId", detail != null ? detail.getPhoneId() : null);
        writableMapCreateMap5.putString("randomMac", detail != null ? detail.getRandomMac() : null);
        writableMapCreateMap5.putString("nodeId", detail != null ? detail.getNodeId() : null);
        writableMapCreateMap3.putMap("detail", writableMapCreateMap5);
        writableMapCreateMap3.putInt("uploaded", wearableDevice != null ? wearableDevice.getUploaded() : 1);
        writableMapCreateMap2.putMap("device", writableMapCreateMap3);
        writableMapCreateMap2.putString("firmwareVersion", deviceInfo.getFirmwareVersion());
        WritableMap writableMapCreateMap6 = Arguments.createMap();
        Product product = deviceInfo.getProduct();
        writableMapCreateMap6.putInt("appVersion", product != null ? product.getAppVersion() : 0);
        WritableArray writableArrayCreateArray = Arguments.createArray();
        if (product != null && (wearOsModelIds = product.getWearOsModelIds()) != null) {
            Iterator<T> it = wearOsModelIds.iterator();
            while (it.hasNext()) {
                writableArrayCreateArray.pushString((String) it.next());
            }
            Unit unit3 = Unit.INSTANCE;
        }
        writableMapCreateMap6.putArray("wearOsModelIds", writableArrayCreateArray);
        writableMapCreateMap6.putString("model", product != null ? product.getModel() : null);
        writableMapCreateMap6.putString("productName", product != null ? product.getProductName() : null);
        writableMapCreateMap6.putString("bltNamePrefix", product != null ? product.getBltNamePrefix() : null);
        writableMapCreateMap6.putString(HabitShareActivity.KEY_BIG_ICON, product != null ? product.getBigIcon() : null);
        writableMapCreateMap6.putString("bigIcon3", product != null ? product.getBigIcon3() : null);
        writableMapCreateMap6.putString("bigPreview", product != null ? product.getBigPreview() : null);
        writableMapCreateMap6.putString("smallIcon", product != null ? product.getSmallIcon() : null);
        WritableMap writableMapCreateMap7 = Arguments.createMap();
        Product.Size size = product != null ? product.getSize() : null;
        writableMapCreateMap7.putInt("width", size != null ? size.getWidth() : 0);
        writableMapCreateMap7.putInt("height", size != null ? size.getHeight() : 0);
        writableMapCreateMap7.putInt("radius", size != null ? size.getRadius() : 0);
        writableMapCreateMap7.putDouble("ratio", size != null ? size.getRatio() : 0.0d);
        writableMapCreateMap7.putDouble("scale", (size == null || (android_scale = size.getAndroid_scale()) == null) ? 0.0d : android_scale.floatValue());
        writableMapCreateMap7.putInt("image_format_exist", (size == null || (image_format_exist = size.getImage_format_exist()) == null) ? 0 : image_format_exist.intValue());
        writableMapCreateMap7.putInt("image_format", (size == null || (image_format = size.getImage_format()) == null) ? 0 : image_format.intValue());
        writableMapCreateMap6.putMap(MediaStoreUtil.MediaInfo.SIZE, writableMapCreateMap7);
        writableMapCreateMap6.putInt("discovery", product != null ? product.getDiscovery() : 0);
        writableMapCreateMap6.putInt("status", product != null ? product.getStatus() : 0);
        writableMapCreateMap6.putInt("type", product != null ? product.getType() : 0);
        writableMapCreateMap6.putString("alias", product != null ? product.getAlias() : null);
        writableMapCreateMap6.putInt("ota", product != null ? product.getOta() : 0);
        writableMapCreateMap6.putInt(CardInfo.KEY_CARD_GROUP_ID, product != null ? product.getGroupId() : 0);
        writableMapCreateMap6.putInt("iotSubCategoryId", (product == null || (iotSubCategoryId = product.getIotSubCategoryId()) == null) ? 0 : iotSubCategoryId.intValue());
        writableMapCreateMap6.putInt("accessType", product != null ? product.getAccessType() : 0);
        WritableArray writableArrayCreateArray2 = Arguments.createArray();
        if (product != null && (features = product.getFeatures()) != null) {
            Iterator<T> it2 = features.iterator();
            while (it2.hasNext()) {
                writableArrayCreateArray2.pushString((String) it2.next());
            }
            Unit unit4 = Unit.INSTANCE;
        }
        writableMapCreateMap6.putArray("features", writableArrayCreateArray2);
        WritableArray writableArrayCreateArray3 = Arguments.createArray();
        if (product != null && (whitelistFeature = product.getWhitelistFeature()) != null) {
            Iterator<T> it3 = whitelistFeature.iterator();
            while (it3.hasNext()) {
                writableArrayCreateArray3.pushString((String) it3.next());
            }
            Unit unit5 = Unit.INSTANCE;
        }
        writableMapCreateMap6.putArray("whitelistFeature", writableArrayCreateArray3);
        WritableArray writableArrayCreateArray4 = Arguments.createArray();
        if (product != null && (androidFeature = product.getAndroidFeature()) != null) {
            Iterator<T> it4 = androidFeature.iterator();
            while (it4.hasNext()) {
                writableArrayCreateArray4.pushString((String) it4.next());
            }
            Unit unit6 = Unit.INSTANCE;
        }
        writableMapCreateMap6.putArray("androidFeature", writableArrayCreateArray4);
        WritableMap writableMapCreateMap8 = Arguments.createMap();
        if (product != null && (featureMap = product.getFeatureMap()) != null) {
            for (Map.Entry<String, String> entry2 : featureMap.entrySet()) {
                writableMapCreateMap8.putString(entry2.getKey(), entry2.getValue());
            }
            Unit unit7 = Unit.INSTANCE;
        }
        writableMapCreateMap6.putMap("featureMap", writableMapCreateMap8);
        writableMapCreateMap6.putString("agps", product != null ? product.getAgps() : null);
        writableMapCreateMap6.putString("category", product != null ? product.getCategory() : null);
        writableMapCreateMap6.putString("subcategory", product != null ? product.getSubcategory() : null);
        writableMapCreateMap6.putString("skuBigIcon", product != null ? product.getSkuBigIcon() : null);
        writableMapCreateMap2.putMap("product", writableMapCreateMap6);
        writableMapCreateMap2.putString("bleName", deviceInfo.getBleName());
        WritableMap writableMapCreateMap9 = Arguments.createMap();
        BatteryInfo batteryInfo = deviceInfo.getBatteryInfo();
        writableMapCreateMap9.putInt(Column.BATTERY, batteryInfo.getBattery());
        WritableMap writableMapCreateMap10 = Arguments.createMap();
        BatteryInfo.ChargeInfo chargeInfo = batteryInfo.getChargeInfo();
        writableMapCreateMap10.putInt("state", chargeInfo != null ? chargeInfo.getState() : 0);
        writableMapCreateMap10.putInt("timestamp", chargeInfo != null ? (int) chargeInfo.getTimestamp() : 0);
        writableMapCreateMap9.putMap("chargeInfo", writableMapCreateMap10);
        writableMapCreateMap9.putInt(Constants.KEY_CHARGE_STATUS, batteryInfo.getChargeStatus());
        writableMapCreateMap9.putBoolean("isCharging", batteryInfo.getIsCharging());
        writableMapCreateMap9.putBoolean("isChargeFull", batteryInfo.getIsChargeFull());
        writableMapCreateMap9.putInt("lastChargeDays", batteryInfo.getLastChargeDays());
        writableMapCreateMap9.putInt("chargeDays", batteryInfo.getChargeDays());
        writableMapCreateMap2.putMap("batteryInfo", writableMapCreateMap9);
        writableMapCreateMap2.putString("oob", deviceInfo.getOob());
        writableMapCreateMap2.putBoolean("bindServer", deviceInfo.getBindServer());
        writableMapCreateMap2.putInt(Column.BATTERY, deviceInfo.getBattery());
        writableMapCreateMap.putMap("deviceInfo", writableMapCreateMap2);
        Logger.d(this.TAG, "convertDeviceModel " + writableMapCreateMap);
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    private final WritableMap convertWatchFace(WatchFace watchFace) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("id", watchFace.getId());
        writableMapCreateMap.putString("name", watchFace.getName());
        writableMapCreateMap.putBoolean("isCurrent", watchFace.isCurrent());
        writableMapCreateMap.putBoolean("canRemove", watchFace.getCanRemove());
        writableMapCreateMap.putBoolean("canEdit", watchFace.getCanEdit());
        writableMapCreateMap.putString("style", watchFace.getStyle());
        writableMapCreateMap.putDouble(CommonConstants.KEY_VERSION_CODE, watchFace.getVersionCode());
        writableMapCreateMap.putString("backgroundImage", watchFace.getBackgroundImage());
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (String str : watchFace.getBackgroundImageList()) {
            writableArrayCreateArray.pushString(str);
        }
        Unit unit = Unit.INSTANCE;
        writableMapCreateMap.putArray("backgroundImageList", writableArrayCreateArray);
        writableMapCreateMap.putBoolean("supportImageGroup", watchFace.getSupportImageGroup());
        ArrayList<FaceEditPhotoBean> imageGroupList = watchFace.getImageGroupList();
        if (imageGroupList != null) {
            WritableArray writableArrayCreateArray2 = Arguments.createArray();
            for (FaceEditPhotoBean faceEditPhotoBean : imageGroupList) {
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putInt("positionIndex", faceEditPhotoBean.getPositionIndex());
                writableMapCreateMap2.putMap("backgroundImage", Arguments.createMap());
                if (faceEditPhotoBean.getForegroundImage() != null) {
                    writableMapCreateMap2.putMap("foregroundImage", Arguments.createMap());
                }
                writableArrayCreateArray2.pushMap(writableMapCreateMap2);
            }
            Unit unit2 = Unit.INSTANCE;
            writableMapCreateMap.putArray("imageGroupList", writableArrayCreateArray2);
        }
        writableMapCreateMap.putInt("supportMaxCount", watchFace.getSupportMaxCount());
        writableMapCreateMap.putInt("styleColorIndex", watchFace.getStyleColorIndex());
        ArrayList<WatchFaceSlotItem> slotItems = watchFace.getSlotItems();
        if (slotItems != null) {
            WritableArray writableArrayCreateArray3 = Arguments.createArray();
            for (WatchFaceSlotItem watchFaceSlotItem : slotItems) {
                WritableMap writableMapCreateMap3 = Arguments.createMap();
                writableMapCreateMap3.putString("slotId", watchFaceSlotItem.getSlotId());
                writableMapCreateMap3.putString("widgetId", watchFaceSlotItem.getWidgetId());
                writableMapCreateMap3.putInt("positionIndex", watchFaceSlotItem.getPositionIndex());
                writableArrayCreateArray3.pushMap(writableMapCreateMap3);
            }
            Unit unit3 = Unit.INSTANCE;
            writableMapCreateMap.putArray("slotItems", writableArrayCreateArray3);
        }
        writableMapCreateMap.putBoolean("onTrial", watchFace.getOnTrial());
        writableMapCreateMap.putString("templateId", watchFace.getTemplateId());
        writableMapCreateMap.putString("icon", watchFace.icon);
        writableMapCreateMap.putString("spiritColor", watchFace.getSpiritColor());
        writableMapCreateMap.putBoolean("hasSpiritColor", watchFace.getHasSpiritColor());
        writableMapCreateMap.putString("styleUrl", watchFace.getStyleUrl());
        writableMapCreateMap.putString(AppStateModule.APP_STATE_BACKGROUND, watchFace.getBottom_background());
        writableMapCreateMap.putInt("albumPictureType", watchFace.getAlbum_picture_type());
        writableMapCreateMap.putInt("faceType", watchFace.getFaceType());
        writableMapCreateMap.putBoolean("isPortraitFace", watchFace.getIsPortraitFace());
        writableMapCreateMap.putInt("bgImg", watchFace.getBgImg());
        writableMapCreateMap.putBoolean("isLocalTestFace", watchFace.isLocalTestFace());
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "apply(...)");
        return writableMapCreateMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deviceChangedListener$lambda$4(WearDeviceModule this$0, WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this$0.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("WEAR_DEVICE_SWITCH", this$0.convertDeviceModel(wearableDeviceModel));
        Logger.i(this$0.TAG, "deviceChangedListener " + wearableDeviceModel);
        return Unit.INSTANCE;
    }

    private final Base64.Decoder getDecoder() {
        return (Base64.Decoder) this.decoder.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Base64.Encoder getEncoder() {
        return (Base64.Encoder) this.encoder.getValue();
    }

    @ReactMethod
    public final void addDeviceChangeListener() {
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceChangeListener(this.deviceChangedListener);
        Logger.i(this.TAG, "addDeviceChangeListener");
    }

    @ReactMethod
    public final void addDeviceConnectStatusListener() {
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(this.onDeviceStatusListener);
        Logger.i(this.TAG, "addDeviceConnectStatusListener");
    }

    @ReactMethod
    public final void addSyncStateListener() {
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).addSyncStateListener(this.syncStateListener);
    }

    @ReactMethod
    public final void bindDevice(@NotNull String model, @NotNull String mac, @Nullable String bleName, @Nullable String nodeId, @NotNull ReadableMap bindParameter, @NotNull final Callback success, @NotNull final Callback failure) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(bindParameter, "bindParameter");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(failure, "failure");
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).bindDevice(new DeviceParameter(model, mac, bleName, nodeId, null, false, bindParameter.hasKey("did") ? bindParameter.getString("did") : null, 0, 32, null), new a.AbstractBinderC0419a() { // from class: com.xiaomi.wearable.yrn.modules.WearDeviceModule.bindDevice.1
            @Override // com.xiaomi.fitness.device.manager.a
            public void dismissPairingCode() {
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onBindFailure(int status) {
                failure.invoke(Integer.valueOf(status));
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onBindSuccess(String did) {
                success.invoke(new Object[0]);
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onConnectFailure(int status) {
                failure.invoke(Integer.valueOf(status));
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onConnectSuccess() {
                success.invoke(new Object[0]);
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onPairingFailure(int status) {
                failure.invoke(Integer.valueOf(status));
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onPairingSuccess(byte[] key) {
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onRequestDeviceFailure() {
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onRequestDeviceSuccess() {
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void showPairingCode(String code, e callback) {
            }
        });
    }

    @ReactMethod
    public final void connectDevice(@NotNull final String connectDid, @NotNull final Callback success, @NotNull final Callback failure) {
        Intrinsics.checkNotNullParameter(connectDid, "connectDid");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(failure, "failure");
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        DeviceManagerExtKt.getInstance(companion).connectDevice(connectDid);
        DeviceManagerExtKt.getInstance(companion).addDeviceStatusListener(new OnDeviceStatusListener() { // from class: com.xiaomi.wearable.yrn.modules.WearDeviceModule.connectDevice.1
            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectFailure(String did, int errorCode, int retryTimes) {
                if (Intrinsics.areEqual(connectDid, did)) {
                    failure.invoke(Integer.valueOf(errorCode));
                    DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceStatusListener(this);
                }
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectStart(String did) {
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectSuccess(String did) {
                if (Intrinsics.areEqual(connectDid, did)) {
                    success.invoke(new Object[0]);
                    DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceStatusListener(this);
                }
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onDisconnect(String did) {
                if (Intrinsics.areEqual(connectDid, did)) {
                    failure.invoke(2000);
                    DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceStatusListener(this);
                }
            }
        });
    }

    @ReactMethod
    public final void disconnectDevice(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).disconnectDevice(did);
    }

    @ReactMethod
    public final void getCurrentAccessoryDevice(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(convertDeviceModel((WearableDeviceModel) CollectionsKt___CollectionsKt.firstOrNull((List) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getAccessoryDeviceModels())));
    }

    @ReactMethod
    public final void getCurrentDeviceModel(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(convertDeviceModel((WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel()));
    }

    @ReactMethod
    public final void getDeviceCapability(@NotNull String did, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Integer.valueOf(DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceCapability(did)));
    }

    @ReactMethod
    public final void getDeviceCapabilityV2(@NotNull String did, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Integer.valueOf(DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceCapabilityV2(did)));
    }

    @ReactMethod
    public final void getDeviceModel(@NotNull String did, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(convertDeviceModel((WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did)));
    }

    @ReactMethod
    public final void getDeviceModels(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Iterable deviceModels = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModels();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator it = deviceModels.iterator();
        while (it.hasNext()) {
            writableArrayCreateArray.pushMap(convertDeviceModel((WearableDeviceModel) it.next()));
        }
        callback.invoke(writableArrayCreateArray);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "WearDeviceModule";
    }

    @ReactMethod
    public final void getWatchFace(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        Map<String, WatchFace> faceList = FaceHelperExtKt.getInstance(FaceHelper.INSTANCE).getFaceList();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (Map.Entry<String, WatchFace> entry : faceList.entrySet()) {
            entry.getKey();
            writableArrayCreateArray.pushMap(convertWatchFace(entry.getValue()));
        }
        promise.resolve(writableArrayCreateArray);
        Logger.d(this.TAG, "getWatchFace " + faceList);
    }

    @ReactMethod
    public final void isConnected(@NotNull String did, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callback, "callback");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did);
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(wearableDeviceModel != null ? wearableDeviceModel.getIsDeviceConnected() : false);
        callback.invoke(objArr);
    }

    @ReactMethod
    public final void isHaveAccessoryDevice(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(((WearableDeviceModel) CollectionsKt___CollectionsKt.firstOrNull((List) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getAccessoryDeviceModels())) != null);
        callback.invoke(objArr);
    }

    @ReactMethod
    public final void registerDeviceReportHandler(int type) {
        Logger.i(this.TAG, "registerDeviceReportHandler " + type);
        if (this.dataHandlers.get(Integer.valueOf(type)) == null) {
            RNDataHandlerWrapper rNDataHandlerWrapper = new RNDataHandlerWrapper();
            this.dataHandlers.put(Integer.valueOf(type), rNDataHandlerWrapper);
            DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).addDataHandler(type, rNDataHandlerWrapper);
            return;
        }
        Logger.i(this.TAG, "registerDeviceReportHandler duplicate " + type);
    }

    @ReactMethod
    public final void registerFaceChangeListener() {
        FaceHelperExtKt.getInstance(FaceHelper.INSTANCE).addFaceEventListener(this.faceChangeListener);
        Logger.i(this.TAG, "registerFaceChangeListener");
    }

    @ReactMethod
    public final void removeDeviceChangeListener() {
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceChangeListener(this.deviceChangedListener);
        Logger.i(this.TAG, "removeDeviceChangeListener");
    }

    @ReactMethod
    public final void removeDeviceConnectStatusListener() {
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceStatusListener(this.onDeviceStatusListener);
        Logger.i(this.TAG, "removeDeviceConnectStatusListener");
    }

    @ReactMethod
    public final void removeDeviceReportHandler(int type) {
        RNDataHandlerWrapper rNDataHandlerWrapper = this.dataHandlers.get(Integer.valueOf(type));
        if (rNDataHandlerWrapper == null) {
            return;
        }
        Logger.i(this.TAG, "removeDeviceReportHandler " + type);
        this.dataHandlers.remove(Integer.valueOf(type));
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).removeDataHandler(type, rNDataHandlerWrapper);
    }

    @ReactMethod
    public final void removeSyncStateListener() {
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).removeSyncStateListener(this.syncStateListener);
    }

    @ReactMethod
    public final void sendFileToDevice(@NotNull String did, int type, int detailType, @Nullable final String path, int segmentLength, @NotNull final Callback finishCallback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(finishCallback, "finishCallback");
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).sendFile(did, type, detailType, path, segmentLength, new SyncStateListener() { // from class: com.xiaomi.wearable.yrn.modules.WearDeviceModule.sendFileToDevice.1
            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onFinish(String did2, int code) {
                Intrinsics.checkNotNullParameter(did2, "did");
                int i = code == 0 ? 0 : -1;
                finishCallback.invoke(did2, Integer.valueOf(i));
                Logger.i(WearDeviceModule.this.TAG, "sendFileToDevice onFinish " + did2 + " " + code + " " + i);
            }

            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onStart(String did2) {
                Intrinsics.checkNotNullParameter(did2, "did");
            }

            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onSyncing(String did2, int progress) {
                Intrinsics.checkNotNullParameter(did2, "did");
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("key", path);
                writableMapCreateMap.putInt("value", progress);
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) WearDeviceModule.this.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("DEVICE_TRANSPORT_FILE_MESSAGE", writableMapCreateMap);
            }
        });
    }

    @ReactMethod
    public final void sendMessageToDevice(@NotNull String requestData, @NotNull ReadableMap options, @NotNull final Callback callback) throws InvalidProtocolBufferNanoException {
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(callback, "callback");
        s7r s7rVarL = s7r.L(getDecoder().decode(requestData));
        if (options.getBoolean("needResponse")) {
            DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
            Intrinsics.checkNotNull(s7rVarL);
            DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, s7rVarL, true, new OnSyncCallback() { // from class: com.xiaomi.wearable.yrn.modules.WearDeviceModule.sendMessageToDevice.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    Logger.i(WearDeviceModule.this.TAG, "packet send fail: " + code);
                    callback.invoke(Integer.valueOf(code), null);
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    if (result == null || !result.isSuccess() || result.getPacket() == null) {
                        onError(did, type, 255);
                        return;
                    }
                    callback.invoke(0, WearDeviceModule.this.getEncoder().encodeToString(dsf.i(result.getPacket())));
                    Logger.i(WearDeviceModule.this.TAG, "packet send success");
                }
            }, 0, 8, null);
        } else {
            DeviceContact deviceSyncExtKt2 = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
            Intrinsics.checkNotNull(s7rVarL);
            DeviceContact.DefaultImpls.call$default(deviceSyncExtKt2, s7rVarL, false, null, 0, 14, null);
        }
    }

    @ReactMethod
    public final void supportImageSegment(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.resolve(Boolean.valueOf(FaceHelperExtKt.getInstance(FaceHelper.INSTANCE).supportImageSegment()));
        Logger.i(this.TAG, "supportImageSegment");
    }

    @ReactMethod
    public final void unbindDevice(@NotNull String did, @NotNull final Callback success, @NotNull final Callback failure) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(failure, "failure");
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).unbindDevice(did, new l.a() { // from class: com.xiaomi.wearable.yrn.modules.WearDeviceModule.unbindDevice.1
            @Override // com.xiaomi.fitness.device.manager.l
            public void onFail(int code) {
                failure.invoke(Integer.valueOf(code));
            }

            @Override // com.xiaomi.fitness.device.manager.l
            public void onSuccess() {
                success.invoke(new Object[0]);
            }
        });
    }
}
