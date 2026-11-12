package com.xiaomi.fitness.aivs.init;

import android.app.Application;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.example.aivs.export.AivsHelper;
import com.example.aivs.export.AivsHelperExtKt;
import com.huami.bluetooth.profile.channel.module.voice.VoiceConfig;
import com.xiaomi.fitness.aivs.base.BaseAivsService;
import com.xiaomi.fitness.aivs.base.BaseAivsSpeechRecognizerManager;
import com.xiaomi.fitness.aivs.util.BindVoiceAssistUtil;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.SyncStateListener;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.hm.health.bt.sdk.IVoiceCallback;
import defpackage.jhi;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\t*\u0001\u0011\b\u0017\u0018\u0000 \u00162\u00020\u0001:\u0003\u0016\u0017\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\u000f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u0013\u001a\u00020\rH\u0007J\b\u0010\u0014\u001a\u00020\rH\u0007J\b\u0010\u0015\u001a\u00020\rH\u0002R\u0012\u0010\b\u001a\u00060\tR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00060\u000bR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/aivs/init/AivsComponent;", "", "<init>", "()V", "getHuamiSuggesstList", "", "", "list", "curDataHandler", "Lcom/xiaomi/fitness/aivs/init/AivsComponent$DataHandlerImpl;", "curVoiceCallback", "Lcom/xiaomi/fitness/aivs/init/AivsComponent$VoiceCallbackImpl;", "sendBackSuccessReceiver", "", "result", "sendBackErrorReceiver", "aivsReceiver", "com/xiaomi/fitness/aivs/init/AivsComponent$aivsReceiver$1", "Lcom/xiaomi/fitness/aivs/init/AivsComponent$aivsReceiver$1;", "initAivsInMain", "initAivs", "deleteLlmImageCache", "Companion", "VoiceCallbackImpl", "DataHandlerImpl", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "小爱同学")
@SourceDebugExtension({"SMAP\nAivsComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AivsComponent.kt\ncom/xiaomi/fitness/aivs/init/AivsComponent\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,349:1\n13402#2,2:350\n*S KotlinDebug\n*F\n+ 1 AivsComponent.kt\ncom/xiaomi/fitness/aivs/init/AivsComponent\n*L\n343#1:350,2\n*E\n"})
public class AivsComponent {

    @NotNull
    public static final String ACTION_GET_PRIVACY_SETTING = "com.mi.health.aivs.get_privacy_setting";

    @NotNull
    public static final String ACTION_ON_PRIVACY_CALLBACK = "com.mi.health.aivs.privacy_setting_callback";

    @NotNull
    public static final String ACTION_SYNC_NLP_ENGINE = "sync_nlp_engine";

    @NotNull
    public static final String EXTRA_CALLBACK_TYPE_ERROR = "extra_callback_type_error";

    @NotNull
    public static final String EXTRA_CALLBACK_TYPE_SUCCESS = "extra_callback_type_success";

    @NotNull
    public static final String EXTRA_PARAM_GET_PRIVACY_SETTING = "param_get_privacy_setting";

    @NotNull
    public static final String EXTRA_PARAM_SET_PRIVACY_SETTING = "param_set_privacy_setting";

    @NotNull
    public static final String KEY_CALLBACK_RESULT = "key_callback_result";

    @NotNull
    public static final String KEY_CALLBACK_TYPE = "key_callback_type";

    @NotNull
    public static final String KEY_DID = "key_did";

    @NotNull
    public static final String KEY_IS_PRIVACY_CHECKED = "key_is_privacy_checked";

    @NotNull
    public static final String KEY_PRIVACY_SETTING = "key_privacy_setting";

    @NotNull
    public static final String TAG = "AivsComponent";

    @NotNull
    private final DataHandlerImpl curDataHandler = new DataHandlerImpl();

    @NotNull
    private final VoiceCallbackImpl curVoiceCallback = new VoiceCallbackImpl();

    @NotNull
    private final AivsComponent$aivsReceiver$1 aivsReceiver = new AivsComponent$aivsReceiver$1(this);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/aivs/init/AivsComponent$DataHandlerImpl;", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "<init>", "(Lcom/xiaomi/fitness/aivs/init/AivsComponent;)V", "handleData", "", "did", "", "type", "", "data", "", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class DataHandlerImpl extends DataHandlerWrapper {
        public DataHandlerImpl() {
        }

        @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
        public boolean handleData(@NotNull String did, int type, @Nullable byte[] data) {
            boolean zIsSupportFeature;
            byte b2;
            Intrinsics.checkNotNullParameter(did, "did");
            if (type == 103) {
                WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getDeviceModel(did);
                if ((wearableDeviceModel == null && (wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel()) == null) || !(zIsSupportFeature = DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "xiaoai"))) {
                    return false;
                }
                ByteBuffer byteBufferOrder = ByteBuffer.wrap(data).order(ByteOrder.BIG_ENDIAN);
                Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "order(...)");
                if (byteBufferOrder.get() == 0 && ((b2 = byteBufferOrder.get()) == 1 || b2 == 2 || b2 == 3 || b2 == 4)) {
                    Logger.i(AivsComponent.TAG, "handleData did:" + did + " dataSize:" + (data != null ? Integer.valueOf(data.length) : null));
                    WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getDeviceModel(did);
                    if (wearableDeviceModel2 == null && (wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel()) == null) {
                        return false;
                    }
                    Logger.i(AivsComponent.TAG, "handleData isDeviceConnected:" + wearableDeviceModel2.getIsDeviceConnected() + " isSupportXiaoai " + zIsSupportFeature);
                    if (wearableDeviceModel2.getIsDeviceConnected() && zIsSupportFeature) {
                        BaseAivsService aivsService = BaseAivsService.INSTANCE.getAivsService(wearableDeviceModel2.getDid(), 101);
                        String did2 = wearableDeviceModel2.getDid();
                        if (data == null) {
                            data = new byte[0];
                        }
                        aivsService.receiveAudioData(did2, data);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/aivs/init/AivsComponent$VoiceCallbackImpl;", "Lcom/xiaomi/hm/health/bt/sdk/IVoiceCallback;", "<init>", "(Lcom/xiaomi/fitness/aivs/init/AivsComponent;)V", "did", "", "getDid", "()Ljava/lang/String;", "aivsService", "Lcom/xiaomi/fitness/aivs/base/BaseAivsService;", "getAivsService", "()Lcom/xiaomi/fitness/aivs/base/BaseAivsService;", "onStartSession", "", "voiceConfig", "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "onStopSession", "onAudioData", "data", "", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAivsComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AivsComponent.kt\ncom/xiaomi/fitness/aivs/init/AivsComponent$VoiceCallbackImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,349:1\n1#2:350\n*E\n"})
    public final class VoiceCallbackImpl implements IVoiceCallback {
        public VoiceCallbackImpl() {
        }

        private final BaseAivsService getAivsService() {
            String did = getDid();
            if (did != null) {
                return BaseAivsService.INSTANCE.getAivsService(did, 100);
            }
            return null;
        }

        @Nullable
        public final String getDid() {
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel != null) {
                return wearableDeviceModel.getDid();
            }
            return null;
        }

        @Override // com.xiaomi.hm.health.bt.sdk.IVoiceCallback
        public void onAudioData(@NotNull byte[] data) {
            BaseAivsService aivsService;
            Intrinsics.checkNotNullParameter(data, "data");
            Logger.d(AivsComponent.TAG, "onAudioData");
            String did = getDid();
            if (did == null || (aivsService = getAivsService()) == null) {
                return;
            }
            aivsService.receiveAudioData(did, data);
        }

        @Override // com.xiaomi.hm.health.bt.sdk.IVoiceCallback
        public void onStartSession(@NotNull VoiceConfig voiceConfig) {
            HuamiApiCaller huaMiApiCaller;
            BaseAivsService aivsService;
            ArrayList<String> suggestList;
            Intrinsics.checkNotNullParameter(voiceConfig, "voiceConfig");
            Logger.i(AivsComponent.TAG, "onStartSession voiceConfig.recordCodec:" + ((int) voiceConfig.getRecordCodec()));
            WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
            if (wearableDeviceModel == null || (huaMiApiCaller = DeviceManagerExtKt.getInstance(companion).getHuaMiApiCaller(DeviceModelExtKt.getMac(wearableDeviceModel))) == null) {
                return;
            }
            if (!NetUtil.INSTANCE.getNetWorkAvailable(ApplicationExtKt.getApplication())) {
                huaMiApiCaller.sendVoiceNetworkDisable();
                return;
            }
            BaseAivsService aivsService2 = getAivsService();
            if (aivsService2 != null) {
                aivsService2.onStartSession(voiceConfig);
            }
            BaseAivsService aivsService3 = getAivsService();
            List<String> huamiSuggesstList = null;
            if (aivsService3 != null && aivsService3.isEngineReady()) {
                BaseAivsService aivsService4 = getAivsService();
                if (aivsService4 != null && (suggestList = aivsService4.getSuggestList()) != null) {
                    huamiSuggesstList = AivsComponent.this.getHuamiSuggesstList(suggestList);
                }
                huaMiApiCaller.sendVoiceReadyCommand(huamiSuggesstList);
                return;
            }
            BaseAivsService aivsService5 = getAivsService();
            if (aivsService5 == null || !aivsService5.isEngineIdle() || (aivsService = getAivsService()) == null) {
                return;
            }
            BaseAivsService.initEngine$default(aivsService, null, 1, null);
        }

        @Override // com.xiaomi.hm.health.bt.sdk.IVoiceCallback
        public void onStopSession() {
            BaseAivsSpeechRecognizerManager mSpeechRecognizerManager;
            Logger.d(AivsComponent.TAG, "onStopSession");
            BaseAivsService aivsService = getAivsService();
            if (aivsService == null || (mSpeechRecognizerManager = aivsService.getMSpeechRecognizerManager()) == null) {
                return;
            }
            mSpeechRecognizerManager.dialogFinish();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.aivs.init.AivsComponent$initAivs$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.aivs.init.AivsComponent$initAivs$4", f = "AivsComponent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AivsComponent.this.new AnonymousClass4(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AivsComponent.this.deleteLlmImageCache();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteLlmImageCache() {
        File externalFilesDir = ApplicationExtKt.getApplication().getExternalFilesDir("aivs-llm");
        if (externalFilesDir == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        File[] fileArrListFiles = externalFilesDir.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.isFile() && jCurrentTimeMillis - file.lastModified() > 60000) {
                    file.delete();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendBackErrorReceiver(String result) {
        Logger.i(TAG, "sendBackErrorReceiver result is " + result);
        Intent intent = new Intent(ACTION_ON_PRIVACY_CALLBACK);
        intent.putExtra(KEY_CALLBACK_TYPE, EXTRA_CALLBACK_TYPE_ERROR);
        intent.putExtra(KEY_CALLBACK_RESULT, result);
        ApplicationExtKt.getApplication().sendBroadcast(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendBackSuccessReceiver(String result) {
        Logger.i(TAG, "sendBackSuccessReceiver result is " + result);
        Intent intent = new Intent(ACTION_ON_PRIVACY_CALLBACK);
        intent.putExtra(KEY_CALLBACK_TYPE, EXTRA_CALLBACK_TYPE_SUCCESS);
        intent.putExtra(KEY_CALLBACK_RESULT, result);
        ApplicationExtKt.getApplication().sendBroadcast(intent);
    }

    @NotNull
    public final List<String> getHuamiSuggesstList(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        if (!list.isEmpty()) {
            return list;
        }
        String[] stringArray = AppUtil.getApp().getResources().getStringArray(jhi.f22810a);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        return ArraysKt___ArraysKt.toList(stringArray);
    }

    @ComponentTask(notEarlierThan = 4, onMainThread = false, processName = ":device")
    public final void initAivs() {
        if (Build.VERSION.SDK_INT >= 33) {
            Application application = ApplicationExtKt.getApplication();
            AivsComponent$aivsReceiver$1 aivsComponent$aivsReceiver$1 = this.aivsReceiver;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(ACTION_GET_PRIVACY_SETTING);
            intentFilter.addAction(ACTION_SYNC_NLP_ENGINE);
            Unit unit = Unit.INSTANCE;
            application.registerReceiver(aivsComponent$aivsReceiver$1, intentFilter, 2);
        } else {
            Application application2 = ApplicationExtKt.getApplication();
            AivsComponent$aivsReceiver$1 aivsComponent$aivsReceiver$2 = this.aivsReceiver;
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction(ACTION_GET_PRIVACY_SETTING);
            intentFilter2.addAction(ACTION_SYNC_NLP_ENGINE);
            Unit unit2 = Unit.INSTANCE;
            application2.registerReceiver(aivsComponent$aivsReceiver$2, intentFilter2);
        }
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).addDataHandler(103, this.curDataHandler);
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(new OnDeviceFullStatusListener() { // from class: com.xiaomi.fitness.aivs.init.AivsComponent.initAivs.3
            @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener, com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectFailure(String did, int errorCode, int retryTimes) {
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener, com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectStart(String did) {
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener, com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectSuccess(String did) {
                if (did == null) {
                    Logger.i(AivsComponent.TAG, "onConnectSuccess did is null");
                    return;
                }
                BindVoiceAssistUtil.INSTANCE.bindService();
                WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getDeviceModel(did);
                if (wearableDeviceModel == null) {
                    return;
                }
                String did2 = wearableDeviceModel.getDid();
                WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
                String did3 = wearableDeviceModel2 != null ? wearableDeviceModel2.getDid() : null;
                Logger.i(AivsComponent.TAG, "onStart did: " + did2 + " currentDeviceDid:" + did3 + " isDeviceConnected:" + wearableDeviceModel.getIsDeviceConnected() + " product.type = " + wearableDeviceModel.getProduct().getType() + " isHuami:" + DeviceModelExtKt.isHuaMi(wearableDeviceModel) + " isBluetooth:" + DeviceModelExtKt.isBluetooth(wearableDeviceModel) + " isSupportFeature " + DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "xiaoai"));
                if (wearableDeviceModel.getIsDeviceConnected() && DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "xiaoai")) {
                    if (!DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
                        DeviceModelExtKt.isBluetooth(wearableDeviceModel);
                        return;
                    }
                    HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(companion).getHuaMiApiCaller(DeviceModelExtKt.getMac(wearableDeviceModel));
                    if (huaMiApiCaller != null) {
                        huaMiApiCaller.setVoiceCallback(AivsComponent.this.curVoiceCallback);
                    }
                }
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener
            public void onDestroy(String did, boolean isRemoved) {
                super.onDestroy(did, isRemoved);
                if (!isRemoved || did == null) {
                    return;
                }
                BaseAivsService.INSTANCE.removeAivsService(did);
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener, com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onDisconnect(String did) {
                Logger.i(AivsComponent.TAG, "onDisconnect " + did);
                if (did == null) {
                    Logger.i(AivsComponent.TAG, "onDisconnect did is null");
                }
            }
        });
        AnyExtKt.io$default(null, new AnonymousClass4(null), 1, null);
    }

    @ComponentTask(notEarlierThan = 4, onMainThread = true)
    public final void initAivsInMain() {
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).addSyncStateListener(new SyncStateListener() { // from class: com.xiaomi.fitness.aivs.init.AivsComponent.initAivsInMain.1
            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onFinish(String did, int code) {
                Intrinsics.checkNotNullParameter(did, "did");
                Logger.d(AivsComponent.TAG, "onFinish:did: " + did + " code: " + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onStart(String did) {
                Intrinsics.checkNotNullParameter(did, "did");
                AivsHelperExtKt.getInstance(AivsHelper.INSTANCE).syncNlpEngine();
            }

            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onSyncing(String did, int progress) {
                Intrinsics.checkNotNullParameter(did, "did");
                Logger.d(AivsComponent.TAG, "onSyncing did: " + did + " progress: " + progress);
            }
        });
    }
}
