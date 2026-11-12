package com.xiaomi.fitness.milink.circulate;

import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackConstant;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.miui.circulate.api.bean.CirculateParam;
import com.miui.circulate.api.exception.CirculateException;
import com.miui.circulate.api.protocol.audio.support.MediaMetaData;
import com.miui.circulate.api.service.CirculateDeviceInfo;
import com.miui.circulate.api.service.CirculateServiceInfo;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.milink.bean.ExtraAudioData;
import com.xiaomi.fitness.milink.bean.ExtraHeadsetData;
import com.xiaomi.fitness.milink.util.MilinkHelper;
import com.xiaomi.fitness.milink.util.MilinkOneTrackHelper;
import defpackage.knb;
import defpackage.xw3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010!\n\u0002\b\u0010\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00103\u001a\u00020\u0002¢\u0006\u0004\bo\u0010pJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0010J\u001b\u0010\u0015\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0010J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0011H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0004H\u0016¢\u0006\u0004\b(\u0010#J0\u0010,\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0004H\u0016¢\u0006\u0004\b.\u0010#J#\u00101\u001a\u00020\u00062\b\u0010/\u001a\u0004\u0018\u00010\u00042\b\u00100\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b1\u00102R\u0017\u00103\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R$\u00108\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010>\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010 R$\u0010D\u001a\u0004\u0018\u00010C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010K\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Q\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010#R\"\u0010V\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bV\u0010\u0019\"\u0004\bX\u0010&R\"\u0010Y\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010\u001cR\"\u0010^\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010Z\u001a\u0004\b_\u0010\\\"\u0004\b`\u0010\u001cR\u001d\u0010b\u001a\b\u0012\u0004\u0012\u00020\t0a8\u0006¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\"\u0010f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010Z\u001a\u0004\bg\u0010\\\"\u0004\bh\u0010\u001cR\u0017\u0010i\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u001a\u0010m\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\bm\u0010Z\u001a\u0004\bn\u0010\\¨\u0006q"}, d2 = {"Lcom/xiaomi/fitness/milink/circulate/BaseDeviceController;", "", "Lcom/miui/circulate/api/service/CirculateDeviceInfo;", "targetDeviceInfo", "", "toServiceType", "", "circulateTo", "(Lcom/miui/circulate/api/service/CirculateDeviceInfo;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "deviceType", "getCirculateServiceTypeByDevice", "(Ljava/lang/String;)I", "Lcom/miui/circulate/api/service/CirculateServiceInfo;", "serviceInfo", "onServiceFound", "(Lcom/miui/circulate/api/service/CirculateServiceInfo;)V", "", "onServiceLost", "(Lcom/miui/circulate/api/service/CirculateServiceInfo;)Z", "onServiceUpdate", "onConnect", "onDisconnect", "()V", "onSearchConnect", "()Z", "id", "updateOutputId", "(Ljava/lang/String;)V", "Lcom/miui/circulate/api/protocol/audio/support/MediaMetaData;", "metaData", "onMediaInfoChange", "(Lcom/miui/circulate/api/protocol/audio/support/MediaMetaData;)V", "state", "onPlayStateChange", "(I)V", "isCirculate", "updateLatestPosition", "(Z)V", "volume", "setVolume", "cmd", "intValue", "strValue", "handleAudioControl", "(IILjava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleTvControl", "voiceMode", "multiConnection", "handleHeadsetControl", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "deviceInfo", "Lcom/miui/circulate/api/service/CirculateDeviceInfo;", "getDeviceInfo", "()Lcom/miui/circulate/api/service/CirculateDeviceInfo;", "Lxw3;", "circulateClient", "Lxw3;", "getCirculateClient", "()Lxw3;", "setCirculateClient", "(Lxw3;)V", "mediaMetaData", "Lcom/miui/circulate/api/protocol/audio/support/MediaMetaData;", "getMediaMetaData", "()Lcom/miui/circulate/api/protocol/audio/support/MediaMetaData;", "setMediaMetaData", "Lcom/xiaomi/fitness/milink/bean/ExtraAudioData;", "extraAudioData", "Lcom/xiaomi/fitness/milink/bean/ExtraAudioData;", "getExtraAudioData", "()Lcom/xiaomi/fitness/milink/bean/ExtraAudioData;", "setExtraAudioData", "(Lcom/xiaomi/fitness/milink/bean/ExtraAudioData;)V", "Lcom/xiaomi/fitness/milink/bean/ExtraHeadsetData;", "extraHeadsetData", "Lcom/xiaomi/fitness/milink/bean/ExtraHeadsetData;", "getExtraHeadsetData", "()Lcom/xiaomi/fitness/milink/bean/ExtraHeadsetData;", "setExtraHeadsetData", "(Lcom/xiaomi/fitness/milink/bean/ExtraHeadsetData;)V", "playState", "I", "getPlayState", "()I", "setPlayState", "isSpeaker", "Z", "setSpeaker", "outputId", "Ljava/lang/String;", "getOutputId", "()Ljava/lang/String;", "setOutputId", "connectId", "getConnectId", "setConnectId", "", "audioGroupDevices", "Ljava/util/List;", "getAudioGroupDevices", "()Ljava/util/List;", "logicalId", "getLogicalId", "setLogicalId", "mLock", "Ljava/lang/Object;", "getMLock", "()Ljava/lang/Object;", "TAG", "getTAG", "<init>", "(Lcom/miui/circulate/api/service/CirculateDeviceInfo;)V", "milink_release"}, k = 1, mv = {2, 0, 0})
public class BaseDeviceController {

    @NotNull
    private final String TAG;

    @NotNull
    private final List<String> audioGroupDevices;

    @Nullable
    private xw3 circulateClient;

    @NotNull
    private String connectId;

    @NotNull
    private final CirculateDeviceInfo deviceInfo;

    @Nullable
    private ExtraAudioData extraAudioData;

    @Nullable
    private ExtraHeadsetData extraHeadsetData;
    private volatile boolean isSpeaker;

    @NotNull
    private String logicalId;

    @NotNull
    private final Object mLock;

    @Nullable
    private MediaMetaData mediaMetaData;

    @NotNull
    private volatile String outputId;
    private int playState;

    /* JADX INFO: renamed from: com.xiaomi.fitness.milink.circulate.BaseDeviceController$circulateTo$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.milink.circulate.BaseDeviceController", f = "BaseDeviceController.kt", i = {0}, l = {185}, m = "circulateTo", n = {"targetDeviceInfo"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseDeviceController.this.circulateTo(null, 0, this);
        }
    }

    public BaseDeviceController(@NotNull CirculateDeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        this.deviceInfo = deviceInfo;
        this.outputId = "";
        this.connectId = "";
        this.audioGroupDevices = new ArrayList();
        this.logicalId = "";
        this.mLock = new Object();
        this.TAG = "MilinkHelper_Base";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:100:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:70:0x01de  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:76:0x0209  */
    /* JADX WARN: Code duplicated, block: B:78:0x0213  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0244  */
    /* JADX WARN: Code duplicated, block: B:83:0x0264  */
    /* JADX WARN: Code duplicated, block: B:85:0x0268  */
    /* JADX WARN: Code duplicated, block: B:86:0x026a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0271  */
    /* JADX WARN: Code duplicated, block: B:90:0x0276  */
    /* JADX WARN: Code duplicated, block: B:92:0x027b  */
    /* JADX WARN: Code duplicated, block: B:94:0x028f  */
    /* JADX WARN: Code duplicated, block: B:97:0x029c  */
    /* JADX WARN: Code duplicated, block: B:99:0x02a9 A[RETURN] */
    /* JADX WARN: Instruction removed from duplicated block: B:74:0x01e9, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:81:0x0244, please report this as an issue */
    public final Object circulateTo(CirculateDeviceInfo circulateDeviceInfo, int i, Continuation<? super Unit> continuation) throws CirculateException {
        AnonymousClass1 anonymousClass1;
        String sn;
        String did;
        String model;
        String name;
        CirculateDeviceInfo deviceInfo;
        CirculateDeviceInfo circulateDeviceInfo2;
        boolean z;
        CirculateParam circulateParamD;
        List<CirculateDeviceInfo> listMutableListOf;
        List<CirculateDeviceInfo> listMutableListOf2;
        xw3 xw3Var;
        int i2;
        knb headsetController;
        boolean z2;
        PhoneDeviceController localDeviceController;
        CirculateDeviceInfo deviceInfo2;
        BaseDeviceController deviceController;
        BaseDeviceController deviceController2;
        String firmwareVersion;
        WearableDeviceInfo deviceInfo3;
        CirculateDeviceInfo circulateDeviceInfo3 = circulateDeviceInfo;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = anonymousClass1.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            Logger.i(getTAG(), "intent circulate to " + circulateDeviceInfo3.c);
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
            OneTrackStatBean oneTrackStatBean = new OneTrackStatBean(OneTrackConstant.EVENT_NAME_CONNECTIVITY, "56.52.1.1.22970");
            Object[] objArr = new Object[20];
            objArr[0] = "name";
            objArr[1] = "device_switch_command";
            objArr[2] = "source";
            MilinkOneTrackHelper milinkOneTrackHelper = MilinkOneTrackHelper.INSTANCE;
            objArr[3] = milinkOneTrackHelper.getMilinkOneTrackSource(this.deviceInfo);
            objArr[4] = "did";
            objArr[5] = milinkOneTrackHelper.getPrivacyDeviceId(this.deviceInfo.f10301a);
            objArr[6] = "target_type";
            objArr[7] = milinkOneTrackHelper.getMilinkOneTrackSource(circulateDeviceInfo3);
            objArr[8] = "device_did";
            objArr[9] = milinkOneTrackHelper.getPrivacyDeviceId(circulateDeviceInfo3.f10301a);
            objArr[10] = CirculateDeviceInfo.DEVICE_SN;
            String str = "";
            if (wearableDeviceModel == null || (deviceInfo3 = wearableDeviceModel.getDeviceInfo()) == null || (sn = deviceInfo3.getSn()) == null) {
                sn = "";
            }
            objArr[11] = sn;
            objArr[12] = "wearable_id";
            if (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null) {
                did = "";
            }
            objArr[13] = did;
            objArr[14] = "device_model";
            if (wearableDeviceModel == null || (model = DeviceModelExtKt.getModel(wearableDeviceModel)) == null) {
                model = "";
            }
            objArr[15] = model;
            objArr[16] = "device_name";
            if (wearableDeviceModel == null || (name = DeviceModelExtKt.getName(wearableDeviceModel)) == null) {
                name = "";
            }
            objArr[17] = name;
            objArr[18] = "device_version";
            if (wearableDeviceModel != null && (firmwareVersion = DeviceModelExtKt.getFirmwareVersion(wearableDeviceModel)) != null) {
                str = firmwareVersion;
            }
            objArr[19] = str;
            oneTrackExtKt.reportData(oneTrackStatBean, objArr);
            MilinkHelper milinkHelper = MilinkHelper.INSTANCE;
            BaseDeviceController currentDeviceController = milinkHelper.getCurrentDeviceController();
            if (currentDeviceController == null || (deviceInfo = currentDeviceController.deviceInfo) == null) {
                PhoneDeviceController localDeviceController2 = milinkHelper.getLocalDeviceController();
                if (localDeviceController2 == null) {
                    return Unit.INSTANCE;
                }
                deviceInfo = localDeviceController2.getDeviceInfo();
            }
            int circulateServiceTypeByDevice = getCirculateServiceTypeByDevice(deviceInfo.d);
            CirculateParam.b bVarE = new CirculateParam.b().e(CirculateServiceInfo.a(circulateServiceTypeByDevice));
            Logger.i(getTAG(), "transform service from " + circulateServiceTypeByDevice + " to " + i);
            if (circulateServiceTypeByDevice != i) {
                bVarE.f(CirculateServiceInfo.a(i));
            }
            if (i == 393216) {
                BaseDeviceController deviceController3 = milinkHelper.getDeviceController(circulateDeviceInfo3.f10301a);
                if (deviceController3 == null) {
                    return Unit.INSTANCE;
                }
                BaseDeviceController deviceController4 = milinkHelper.getDeviceController(deviceController3.connectId);
                if (deviceController4 == null) {
                    Logger.i(getTAG(), "circulate to " + circulateDeviceInfo3.c + " but connect device not found");
                    return Unit.INSTANCE;
                }
                circulateDeviceInfo2 = deviceController4.deviceInfo;
                if (Intrinsics.areEqual(deviceInfo.f10301a, "local_device_id")) {
                    String id = circulateDeviceInfo3.f10301a;
                    Intrinsics.checkNotNullExpressionValue(id, "id");
                    updateOutputId(id);
                    z = true;
                }
                if (circulateServiceTypeByDevice == 393216) {
                    deviceController = milinkHelper.getDeviceController(deviceInfo.f10301a);
                    if (deviceController == null) {
                        return Unit.INSTANCE;
                    }
                    deviceController2 = milinkHelper.getDeviceController(deviceController.connectId);
                    if (deviceController2 == null) {
                        Logger.i(getTAG(), "circulate from " + deviceInfo.c + " but connect device not found");
                        return Unit.INSTANCE;
                    }
                    deviceInfo = deviceController2.deviceInfo;
                    if (Intrinsics.areEqual(circulateDeviceInfo3.f10301a, "local_device_id")) {
                        String id2 = circulateDeviceInfo3.f10301a;
                        Intrinsics.checkNotNullExpressionValue(id2, "id");
                        updateOutputId(id2);
                        z = true;
                    }
                }
                Logger.i(getTAG(), "real circulate from " + deviceInfo.c + " to " + circulateDeviceInfo2.c);
                circulateParamD = bVarE.d();
                if (z) {
                    Logger.i(getTAG(), "circulate on local, to: " + circulateDeviceInfo3.c);
                    headsetController = milinkHelper.getHeadsetController();
                    if (headsetController != null) {
                        if (i == 393216) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        localDeviceController = milinkHelper.getLocalDeviceController();
                        if (localDeviceController != null) {
                            deviceInfo2 = localDeviceController.getDeviceInfo();
                        } else {
                            deviceInfo2 = null;
                        }
                        headsetController.v(z2, deviceInfo2);
                    }
                } else {
                    listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(deviceInfo);
                    listMutableListOf2 = CollectionsKt__CollectionsKt.mutableListOf(circulateDeviceInfo2);
                    xw3Var = this.circulateClient;
                    if (xw3Var != null) {
                        xw3Var.a(listMutableListOf, listMutableListOf2, circulateParamD);
                    }
                }
                if (Intrinsics.areEqual(circulateDeviceInfo3.d, "Headset")) {
                    anonymousClass1.L$0 = circulateDeviceInfo3;
                    anonymousClass1.label = 1;
                    if (DelayKt.delay(1000L, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i2 = 393216;
                }
                return Unit.INSTANCE;
            }
            circulateDeviceInfo2 = circulateDeviceInfo3;
            z = false;
            if (circulateServiceTypeByDevice == 393216) {
                deviceController = milinkHelper.getDeviceController(deviceInfo.f10301a);
                if (deviceController == null) {
                    return Unit.INSTANCE;
                }
                deviceController2 = milinkHelper.getDeviceController(deviceController.connectId);
                if (deviceController2 == null) {
                    Logger.i(getTAG(), "circulate from " + deviceInfo.c + " but connect device not found");
                    return Unit.INSTANCE;
                }
                deviceInfo = deviceController2.deviceInfo;
                if (Intrinsics.areEqual(circulateDeviceInfo3.f10301a, "local_device_id")) {
                    String id3 = circulateDeviceInfo3.f10301a;
                    Intrinsics.checkNotNullExpressionValue(id3, "id");
                    updateOutputId(id3);
                    z = true;
                }
            }
            Logger.i(getTAG(), "real circulate from " + deviceInfo.c + " to " + circulateDeviceInfo2.c);
            circulateParamD = bVarE.d();
            if (z) {
                Logger.i(getTAG(), "circulate on local, to: " + circulateDeviceInfo3.c);
                headsetController = milinkHelper.getHeadsetController();
                if (headsetController != null) {
                    if (i == 393216) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    localDeviceController = milinkHelper.getLocalDeviceController();
                    if (localDeviceController != null) {
                        deviceInfo2 = localDeviceController.getDeviceInfo();
                    } else {
                        deviceInfo2 = null;
                    }
                    headsetController.v(z2, deviceInfo2);
                }
            } else {
                listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(deviceInfo);
                listMutableListOf2 = CollectionsKt__CollectionsKt.mutableListOf(circulateDeviceInfo2);
                xw3Var = this.circulateClient;
                if (xw3Var != null) {
                    xw3Var.a(listMutableListOf, listMutableListOf2, circulateParamD);
                }
            }
            if (Intrinsics.areEqual(circulateDeviceInfo3.d, "Headset")) {
                anonymousClass1.L$0 = circulateDeviceInfo3;
                anonymousClass1.label = 1;
                if (DelayKt.delay(1000L, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i2 = 393216;
            }
            return Unit.INSTANCE;
        }
        if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        circulateDeviceInfo3 = (CirculateDeviceInfo) anonymousClass1.L$0;
        ResultKt.throwOnFailure(obj);
        i2 = 393216;
        CirculateServiceInfo circulateServiceInfoC = circulateDeviceInfo3.c(i2);
        knb headsetController2 = MilinkHelper.INSTANCE.getHeadsetController();
        if (headsetController2 != null) {
            headsetController2.u(circulateServiceInfoC);
        }
        return Unit.INSTANCE;
    }

    private final int getCirculateServiceTypeByDevice(String deviceType) {
        Logger.i(getTAG(), "getServiceTypeByDevice: " + deviceType);
        return Intrinsics.areEqual(deviceType, "Headset") ? 393216 : 65536;
    }

    public static /* synthetic */ Object handleAudioControl$suspendImpl(BaseDeviceController baseDeviceController, int i, int i2, String str, boolean z, Continuation<? super Unit> continuation) throws CirculateException {
        Logger.i(baseDeviceController.getTAG(), "handleAudioControl " + baseDeviceController.deviceInfo.c);
        if (i == 6) {
            BaseDeviceController deviceController = MilinkHelper.INSTANCE.getDeviceController(str);
            if (deviceController != null) {
                CirculateDeviceInfo circulateDeviceInfo = deviceController.deviceInfo;
                Object objCirculateTo = baseDeviceController.circulateTo(circulateDeviceInfo, baseDeviceController.getCirculateServiceTypeByDevice(circulateDeviceInfo.d), continuation);
                return objCirculateTo == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCirculateTo : Unit.INSTANCE;
            }
            Logger.i(baseDeviceController.getTAG(), "intent circulate to " + str + " fail, device not found");
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void onConnect$default(BaseDeviceController baseDeviceController, CirculateServiceInfo circulateServiceInfo, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onConnect");
        }
        if ((i & 1) != 0) {
            circulateServiceInfo = null;
        }
        baseDeviceController.onConnect(circulateServiceInfo);
    }

    @NotNull
    public final List<String> getAudioGroupDevices() {
        return this.audioGroupDevices;
    }

    @Nullable
    public final xw3 getCirculateClient() {
        return this.circulateClient;
    }

    @NotNull
    public final String getConnectId() {
        return this.connectId;
    }

    @NotNull
    public final CirculateDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @Nullable
    public final ExtraAudioData getExtraAudioData() {
        return this.extraAudioData;
    }

    @Nullable
    public final ExtraHeadsetData getExtraHeadsetData() {
        return this.extraHeadsetData;
    }

    @NotNull
    public final String getLogicalId() {
        return this.logicalId;
    }

    @NotNull
    public final Object getMLock() {
        return this.mLock;
    }

    @Nullable
    public final MediaMetaData getMediaMetaData() {
        return this.mediaMetaData;
    }

    @NotNull
    public final String getOutputId() {
        return this.outputId;
    }

    public final int getPlayState() {
        return this.playState;
    }

    @NotNull
    public String getTAG() {
        return this.TAG;
    }

    @Nullable
    public Object handleAudioControl(int i, int i2, @NotNull String str, boolean z, @NotNull Continuation<? super Unit> continuation) {
        return handleAudioControl$suspendImpl(this, i, i2, str, z, continuation);
    }

    public void handleHeadsetControl(@Nullable Integer voiceMode, @Nullable Integer multiConnection) {
        Logger.i(getTAG(), "handleHeadsetControl " + this.deviceInfo.c);
    }

    public void handleTvControl(int cmd) {
        Logger.i(getTAG(), "handleTvControl " + this.deviceInfo.c);
    }

    /* JADX INFO: renamed from: isSpeaker, reason: from getter */
    public final boolean getIsSpeaker() {
        return this.isSpeaker;
    }

    public void onConnect(@Nullable CirculateServiceInfo serviceInfo) {
        Logger.i(getTAG(), this.deviceInfo.c + " onConnect");
        String id = this.deviceInfo.f10301a;
        Intrinsics.checkNotNullExpressionValue(id, "id");
        updateOutputId(id);
    }

    public void onDisconnect() {
        Logger.i(getTAG(), this.deviceInfo.c + " onDisconnect");
    }

    public void onMediaInfoChange(@Nullable MediaMetaData metaData) {
    }

    public void onPlayStateChange(int state) {
    }

    public boolean onSearchConnect() {
        Logger.i(getTAG(), this.deviceInfo.c + " onSearchConnect");
        return false;
    }

    public void onServiceFound(@NotNull CirculateServiceInfo serviceInfo) {
        Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
        Logger.i(getTAG(), this.deviceInfo.c + " onServiceFound");
        if (this.deviceInfo.c(serviceInfo.c) == null) {
            this.deviceInfo.i.add(serviceInfo);
        }
    }

    public final boolean onServiceLost(@NotNull CirculateServiceInfo serviceInfo) {
        Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
        Logger.i(getTAG(), this.deviceInfo.c + " onServiceLost");
        if (this.deviceInfo.c(serviceInfo.c) != null) {
            this.deviceInfo.h(serviceInfo);
            Logger.i(getTAG(), "onServiceLost remove " + serviceInfo + " remain " + this.deviceInfo.i.size());
        }
        if (this.deviceInfo.i.size() > 0) {
            return false;
        }
        Logger.i(getTAG(), "onServiceLost service empty, need remove");
        return true;
    }

    public void onServiceUpdate(@NotNull CirculateServiceInfo serviceInfo) {
        Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
        Logger.i(getTAG(), this.deviceInfo.c + " onServiceUpdate");
        this.deviceInfo.i.add(serviceInfo);
    }

    public final void setCirculateClient(@Nullable xw3 xw3Var) {
        this.circulateClient = xw3Var;
    }

    public final void setConnectId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.connectId = str;
    }

    public final void setExtraAudioData(@Nullable ExtraAudioData extraAudioData) {
        this.extraAudioData = extraAudioData;
    }

    public final void setExtraHeadsetData(@Nullable ExtraHeadsetData extraHeadsetData) {
        this.extraHeadsetData = extraHeadsetData;
    }

    public final void setLogicalId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.logicalId = str;
    }

    public final void setMediaMetaData(@Nullable MediaMetaData mediaMetaData) {
        this.mediaMetaData = mediaMetaData;
    }

    public final void setOutputId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.outputId = str;
    }

    public final void setPlayState(int i) {
        this.playState = i;
    }

    public final void setSpeaker(boolean z) {
        this.isSpeaker = z;
    }

    public void setVolume(int volume) {
    }

    public void updateLatestPosition(boolean isCirculate) {
        Logger.i(getTAG(), "updateLatestPosition " + this.deviceInfo.c);
    }

    public final void updateOutputId(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        MilinkHelper milinkHelper = MilinkHelper.INSTANCE;
        PhoneDeviceController localDeviceController = milinkHelper.getLocalDeviceController();
        if (localDeviceController != null) {
            localDeviceController.updatePhoneOutputId(id);
        }
        milinkHelper.setCurrentDeviceController(milinkHelper.getDeviceController(id));
    }
}
