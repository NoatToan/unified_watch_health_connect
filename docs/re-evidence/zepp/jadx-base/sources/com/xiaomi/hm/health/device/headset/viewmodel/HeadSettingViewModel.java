package com.xiaomi.hm.health.device.headset.viewmodel;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.device.HeadsetDevice;
import com.huami.bluetooth.profile.channel.module.HeadPhoneModule;
import com.huami.bluetooth.profile.ecf.data.HeadsetSportSetting;
import com.huami.bluetooth.profile.ecf.data.HrBroadcastType;
import com.huami.bluetooth.profile.ecf.data.HrReminderInfo;
import com.huami.bluetooth.profile.ecf.data.NoiseControl;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.LullabyDevice;
import com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.H5UrlSource;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineAnalyticsKt;
import com.xiaomi.hm.health.device.headset.bean.HeadsetBatteryInfo;
import com.xiaomi.hm.health.device.headset.bean.HeadsetPart;
import com.xiaomi.hm.health.device.headset.bean.HeadsetSettings;
import com.xiaomi.hm.health.device.headset.common.MozartH5;
import com.xiaomi.hm.health.device.headset.pattern.HeadsetFeatureTree;
import com.xiaomi.hm.health.device.headset.pattern.HeadsetSoftFeature;
import com.xiaomi.hm.health.device.headset.vo.CervicalProtectionVo;
import com.xiaomi.hm.health.device.headset.vo.HeadsetSportSettingVo;
import com.xiaomi.hm.health.device.headset.vo.HearingHealthStatusVo;
import com.xiaomi.hm.health.device.headset.vo.HrReminderInfoVo;
import com.xiaomi.hm.health.device.headset.vo.NoiseReductionModeVo;
import com.xiaomi.hm.health.device.headset.vo.PercussionBroadcastVo;
import com.xiaomi.hm.health.device.headset.vo.RunningRecognitionVo;
import com.xiaomi.hm.health.device.headset.vo.SmartPlayVo;
import com.xiaomi.hm.health.device.headset.vo.WearInductionVo;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u0000 ¤\u00012\u00020\u00012\u00020\u0002:\u0001\u000bB\u0011\u0012\u0006\u00101\u001a\u00020/¢\u0006\u0006\b¢\u0001\u0010£\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH\u0002J\u000e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\u0003J\u0006\u0010\u0010\u001a\u00020\u0003J\u000e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\bJ\u000e\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\bJ\u0006\u0010\u0015\u001a\u00020\u0003J\u0006\u0010\u0016\u001a\u00020\u0003J\u000e\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\bJ\u000e\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\bJ\u000e\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\bJ\u000e\u0010 \u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001eJ\u000e\u0010!\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\bJ\u000e\u0010$\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\"J\"\u0010'\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\b2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030%J%\u0010*\u001a\u00020\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u00032\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00030%J\u000e\u0010.\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\bR\u0016\u00101\u001a\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00100R\u001f\u00107\u001a\b\u0012\u0004\u0012\u00020\b028\u0006@\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R#\u0010<\u001a\b\u0012\u0004\u0012\u000208028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u00106R\u0018\u0010?\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010B\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010AR\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010I\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010HR\u001d\u0010L\u001a\u00020J8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b3\u0010KR\u001e\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u00104R\u001f\u0010Q\u001a\u0004\u0018\u00010O8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b9\u0010PR\u0016\u0010U\u001a\u00020R8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001c\u0010W\u001a\b\u0012\u0004\u0012\u00020\b028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u00104R\u001c\u0010Y\u001a\b\u0012\u0004\u0012\u00020\b028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u00104R\"\u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020[0Z028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u00104R,\u0010`\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f0^028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u00104R\u001e\u0010c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010a028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u00104R\u001e\u0010f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010d028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u00104R\u001e\u0010i\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010g028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u00104R\u001e\u0010l\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010j028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u00104R\u001e\u0010o\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010m028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u00104R\u001e\u0010r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010p028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u00104R\u001e\u0010u\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010s028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u00104R\u001e\u0010x\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010v028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u00104R\u001e\u0010{\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010y028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u00104R\u0018\u0010\u007f\u001a\u0004\u0018\u00010|8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u001b\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0080\u00018B@\u0002X\u0082\u0004¢\u0006\u0007\u001a\u0005\bD\u0010\u0081\u0001R)\u0010\u0087\u0001\u001a\u00020\u00052\u0007\u0010\u0083\u0001\u001a\u00020\u00058F@BX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0005\bM\u0010\u0086\u0001R\u001f\u0010\u008b\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0088\u00018F@\u0006¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001d\u0010\u008c\u0001\u001a\t\u0012\u0004\u0012\u00020\b0\u0088\u00018F@\u0006¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008a\u0001R\u001d\u0010\u008e\u0001\u001a\t\u0012\u0004\u0012\u00020\b0\u0088\u00018F@\u0006¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008a\u0001R#\u0010\u0090\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020[0Z0\u0088\u00018F@\u0006¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u008a\u0001R-\u0010\u0092\u0001\u001a\u0019\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f0^0\u0088\u00018F@\u0006¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u008a\u0001R\u001e\u0010\u0018\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010a0\u0088\u00018F@\u0006¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u008a\u0001R\u001f\u0010\u0095\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010d0\u0088\u00018F@\u0006¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u008a\u0001R\u001f\u0010\u0097\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010g0\u0088\u00018F@\u0006¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u008a\u0001R\u001e\u0010)\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010j0\u0088\u00018F@\u0006¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u008a\u0001R\u001f\u0010\u009a\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010m0\u0088\u00018F@\u0006¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u008a\u0001R\u001e\u0010\u001f\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010p0\u0088\u00018F@\u0006¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u008a\u0001R\u001f\u0010\u009d\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010s0\u0088\u00018F@\u0006¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u008a\u0001R\u001f\u0010\u009f\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010v0\u0088\u00018F@\u0006¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u008a\u0001R\u001f\u0010¡\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010y0\u0088\u00018F@\u0006¢\u0006\b\u001a\u0006\b \u0001\u0010\u008a\u0001¨\u0006¥\u0001"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/viewmodel/HeadSettingViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/component/KoinComponent;", "", "h", "Lcom/xiaomi/hm/health/device/headset/bean/HeadsetSettings;", "g", "e", "", z.j, "result", "a", "", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "initHeadsetNeedCondition", "dismissCheckingDelay", "cancelChecking", "enable", "setDeviceEnable", "isActive", "loadBatteryInfo", "loadHeadsetBaseInfo", "getHeadsetNoiseReduction", "Lcom/huami/bluetooth/profile/ecf/data/NoiseControl;", "noiseControl", "setHeadsetNoiseReduction", "isOpen", "setRunningRecognition", "setWearInduction", "setPercussionBroadcast", "Lcom/huami/bluetooth/profile/ecf/data/HrReminderInfo;", "hrReminderInfo", "setHrReminder", "setBeatEnhancement", "Lcom/huami/bluetooth/profile/ecf/data/HrBroadcastType;", "type", "setHrBroadcast", "Lkotlin/Function1;", "callBack", "enableReportHeadsetInfo", "hearingHealth", "cervicalProtection", "updateLiveDataCache", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "getRebootCount", "setSmartPlay", "Lcom/xiaomi/hm/health/device/headset/pattern/HeadsetFeatureTree;", "Lcom/xiaomi/hm/health/device/headset/pattern/HeadsetFeatureTree;", "headsetFeatureTree", "Landroidx/lifecycle/MutableLiveData;", "b", "Landroidx/lifecycle/MutableLiveData;", "getCheckingLiveData", "()Landroidx/lifecycle/MutableLiveData;", "checkingLiveData", "Lcom/xiaomi/hm/health/device/headset/common/MozartH5;", "c", "Lkotlin/Lazy;", "getMozartH5UrlLiveData", "mozartH5UrlLiveData", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "_address", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "deviceType", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "f", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "Lcom/xiaomi/hm/health/databases/model/Device;", "Lcom/xiaomi/hm/health/databases/model/Device;", "device", "Lcom/huami/devicex/manager/DeviceManagerApi;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "i", "_writingResult", "Lcom/huami/bluetooth/profile/channel/module/HeadPhoneModule;", "()Lcom/huami/bluetooth/profile/channel/module/HeadPhoneModule;", "headPhoneModule", "Ljava/util/concurrent/atomic/AtomicBoolean;", hl.k, "Ljava/util/concurrent/atomic/AtomicBoolean;", "_isSetting", "l", "_isLimitViewOperate", "m", "_deviceEnable", "", "Lcom/xiaomi/hm/health/device/headset/bean/HeadsetBatteryInfo;", GoogleApiAvailabilityLight.b, "_headsetBatteryInfos", "Lkotlin/Pair;", "o", "_headsetBaseInfo", "Lcom/xiaomi/hm/health/device/headset/vo/NoiseReductionModeVo;", com.google.android.exoplayer2.text.ttml.b.r, "_noiseControl", "Lcom/xiaomi/hm/health/device/headset/vo/RunningRecognitionVo;", DTransferConstants.SEARCH_KEY, "_runningRecognition", "Lcom/xiaomi/hm/health/device/headset/vo/WearInductionVo;", "r", "_wearInduction", "Lcom/xiaomi/hm/health/device/headset/vo/CervicalProtectionVo;", SOAP.XMLNS, "_cervicalProtection", "Lcom/xiaomi/hm/health/device/headset/vo/PercussionBroadcastVo;", "t", "_percussionBroadcast", "Lcom/xiaomi/hm/health/device/headset/vo/HrReminderInfoVo;", "u", "_hrReminderInfo", "Lcom/xiaomi/hm/health/device/headset/vo/HeadsetSportSettingVo;", "v", "_headsetSportSetting", "Lcom/xiaomi/hm/health/device/headset/vo/HearingHealthStatusVo;", "w", "_statusHearingHealth", "Lcom/xiaomi/hm/health/device/headset/vo/SmartPlayVo;", "x", "_smartPlay", "Lkotlinx/coroutines/Job;", "y", "Lkotlinx/coroutines/Job;", "job", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "()Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "hmDevice", "value", "getHeadsetSettings", "()Lcom/xiaomi/hm/health/device/headset/bean/HeadsetSettings;", "(Lcom/xiaomi/hm/health/device/headset/bean/HeadsetSettings;)V", "headsetSettings", "Landroidx/lifecycle/LiveData;", "getWritingResult", "()Landroidx/lifecycle/LiveData;", "writingResult", "isLimitViewOperate", "getDeviceEnable", "deviceEnable", "getHeadsetBatteryInfos", "headsetBatteryInfos", "getHeadsetBaseInfo", "headsetBaseInfo", "getNoiseControl", "getRunningRecognition", "runningRecognition", "getWearInduction", "wearInduction", "getCervicalProtection", "getPercussionBroadcast", "percussionBroadcast", "getHrReminderInfo", "getHeadsetSportSetting", "headsetSportSetting", "getStatusHearingHealth", "statusHearingHealth", "getSmartPlay", "smartPlay", "<init>", "(Lcom/xiaomi/hm/health/device/headset/pattern/HeadsetFeatureTree;)V", "z", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HeadSettingViewModel extends ViewModel implements KoinComponent {

    @Deprecated
    @NotNull
    private static final String A = "HeadSettingViewModel";

    @Deprecated
    public static final long CONN_TIME_OUT_SEC = 30000;

    @NotNull
    private static final a z = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HeadsetFeatureTree headsetFeatureTree;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private String _address;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private Device device;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _writingResult;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy headPhoneModule;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final AtomicBoolean _isSetting;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _isLimitViewOperate;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _deviceEnable;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<HeadsetBatteryInfo>> _headsetBatteryInfos;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Pair<String, String>> _headsetBaseInfo;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<NoiseReductionModeVo> _noiseControl;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<RunningRecognitionVo> _runningRecognition;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<WearInductionVo> _wearInduction;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<CervicalProtectionVo> _cervicalProtection;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<PercussionBroadcastVo> _percussionBroadcast;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<HrReminderInfoVo> _hrReminderInfo;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<HeadsetSportSettingVo> _headsetSportSetting;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<HearingHealthStatusVo> _statusHearingHealth;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<SmartPlayVo> _smartPlay;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    private Job job;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> checkingLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy mozartH5UrlLiveData = LazyKt__LazyJVMKt.lazy(new r());

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private HMDeviceType deviceType = HMDeviceType.VDevice;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private HMDeviceSource deviceSource = HMDeviceSource.VDEVICE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"com/xiaomi/hm/health/device/headset/viewmodel/HeadSettingViewModel$a", "", "", "CONN_TIME_OUT_SEC", "J", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.headset.viewmodel.HeadSettingViewModel$dismissCheckingDelay$1", f = "HeadSettingViewModel.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HeadSettingViewModel.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.a = 1;
                if (DelayKt.delay(30000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            HeadSettingViewModel.this.getCheckingLiveData().postValue(Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.headset.viewmodel.HeadSettingViewModel$enableReportHeadsetInfo$1$1", f = "HeadSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Function1<Boolean, Unit> b;
        public final /* synthetic */ Boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function1<? super Boolean, Unit> function1, Boolean bool, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = function1;
            this.c = bool;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Function1<Boolean, Unit> function1 = this.b;
            Boolean bool = this.c;
            function1.invoke(Boxing.boxBoolean(bool == null ? false : bool.booleanValue()));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            Boolean value = HeadSettingViewModel.this.getDeviceEnable().getValue();
            HMBaseDevice hMBaseDeviceF = HeadSettingViewModel.this.f();
            return "deviceEnable:" + value + ",connect status:" + (hMBaseDeviceF == null ? null : Boolean.valueOf(hMBaseDeviceF.isConnected()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.headset.viewmodel.HeadSettingViewModel$getHeadsetAllConfigInfo$2$10$resultPercussionBroadcast$1", f = "HeadSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HeadSettingViewModel.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HeadSettingViewModel.this._percussionBroadcast.postValue(new PercussionBroadcastVo(null, false));
            HeadsetDevice headsetDevice = (HeadsetDevice) HeadSettingViewModel.this.f();
            if (headsetDevice == null) {
                return null;
            }
            return headsetDevice.getPercussionBroadcast();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/ecf/data/HrReminderInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.headset.viewmodel.HeadSettingViewModel$getHeadsetAllConfigInfo$2$12$resultHrReminderInfo$1", f = "HeadSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super HrReminderInfo>, Object> {
        public int a;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HeadSettingViewModel.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super HrReminderInfo> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HeadSettingViewModel.this._hrReminderInfo.postValue(new HrReminderInfoVo(null, false));
            HeadsetDevice headsetDevice = (HeadsetDevice) HeadSettingViewModel.this.f();
            if (headsetDevice == null) {
                return null;
            }
            return headsetDevice.getHrReminder();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/ecf/data/HeadsetSportSetting;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.headset.viewmodel.HeadSettingViewModel$getHeadsetAllConfigInfo$2$14$resultHeadsetSportSetting$1", f = "HeadSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super HeadsetSportSetting>, Object> {
        public int a;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HeadSettingViewModel.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super HeadsetSportSetting> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HeadSettingViewModel.this._headsetSportSetting.postValue(new HeadsetSportSettingVo(null, false));
            HeadsetDevice headsetDevice = (HeadsetDevice) HeadSettingViewModel.this.f();
            if (headsetDevice == null) {
                return null;
            }
            return headsetDevice.getHeadsetSportSetting();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.headset.viewmodel.HeadSettingViewModel$getHeadsetAllConfigInfo$2$16$hearingHealthResult$1", f = "HeadSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HeadSettingViewModel.this.new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HeadSettingViewModel.this._statusHearingHealth.postValue(new HearingHealthStatusVo(null, false));
            HeadsetDevice headsetDevice = (HeadsetDevice) HeadSettingViewModel.this.f();
            if (headsetDevice == null) {
                return null;
            }
            return headsetDevice.getHearingHealth();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.headset.viewmodel.HeadSettingViewModel$getHeadsetAllConfigInfo$2$18$smartPlayResult$1", f = "HeadSettingViewModel.kt", i = {}, l = {335}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HeadSettingViewModel.this.new i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HeadSettingViewModel.this._smartPlay.postValue(new SmartPlayVo(null, false));
                HeadPhoneModule headPhoneModuleC = HeadSettingViewModel.this.c();
                if (headPhoneModuleC == null) {
                    return null;
                }
                this.a = 1;
                obj = headPhoneModuleC.getSmartPlay(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (Boolean) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/ecf/data/NoiseControl;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.headset.viewmodel.HeadSettingViewModel$getHeadsetAllConfigInfo$2$2$resultNoiseControl$1", f = "HeadSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super NoiseControl>, Object> {
        public int a;

        public j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HeadSettingViewModel.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super NoiseControl> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HeadSettingViewModel.this._noiseControl.postValue(new NoiseReductionModeVo(null, false));
            HeadsetDevice headsetDevice = (HeadsetDevice) HeadSettingViewModel.this.f();
            if (headsetDevice == null) {
                return null;
            }
            return headsetDevice.getNoiseControl();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.headset.viewmodel.HeadSettingViewModel$getHeadsetAllConfigInfo$2$4$resultRunningRecognition$1", f = "HeadSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        public k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HeadSettingViewModel.this.new k(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HeadSettingViewModel.this._runningRecognition.postValue(new RunningRecognitionVo(null, false));
            HeadsetDevice headsetDevice = (HeadsetDevice) HeadSettingViewModel.this.f();
            if (headsetDevice == null) {
                return null;
            }
            return headsetDevice.getRunningRecognition();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.headset.viewmodel.HeadSettingViewModel$getHeadsetAllConfigInfo$2$6$resultWearInduction$1", f = "HeadSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        public l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HeadSettingViewModel.this.new l(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HeadSettingViewModel.this._wearInduction.postValue(new WearInductionVo(null, false));
            HeadsetDevice headsetDevice = (HeadsetDevice) HeadSettingViewModel.this.f();
            if (headsetDevice == null) {
                return null;
            }
            return headsetDevice.getWearInduction();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.headset.viewmodel.HeadSettingViewModel$getHeadsetAllConfigInfo$2$8$resultCervicalProtection$1", f = "HeadSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        public m(Continuation<? super m> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HeadSettingViewModel.this.new m(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HeadSettingViewModel.this._cervicalProtection.postValue(new CervicalProtectionVo(null, false));
            HeadsetDevice headsetDevice = (HeadsetDevice) HeadSettingViewModel.this.f();
            if (headsetDevice == null) {
                return null;
            }
            return headsetDevice.getCervicalProtection();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.headset.viewmodel.HeadSettingViewModel$getRebootCount$1$1", f = "HeadSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Function1<Integer, Unit> b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public n(Function1<? super Integer, Unit> function1, int i, Continuation<? super n> continuation) {
            super(2, continuation);
            this.b = function1;
            this.c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new n(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.b.invoke(Boxing.boxInt(this.c));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/HeadPhoneModule;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<HeadPhoneModule> {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HeadPhoneModule invoke() {
            HMBaseDevice hMBaseDeviceF = HeadSettingViewModel.this.f();
            if (hMBaseDeviceF == null) {
                return null;
            }
            return (HeadPhoneModule) hMBaseDeviceF.getChannelModule(HeadPhoneModule.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/base/BatteryInfo;", HMFwOnlineAnalyticsKt.BATTERY, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function1<BatteryInfo, Boolean> {
        public static final p a = new p();

        public p() {
            super(1);
        }

        public final boolean a(@Nullable BatteryInfo batteryInfo) {
            if (batteryInfo == null) {
                return false;
            }
            return batteryInfo.isCharging();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(BatteryInfo batteryInfo) {
            return Boolean.valueOf(a(batteryInfo));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.headset.viewmodel.HeadSettingViewModel$loadH5Url$1", f = "HeadSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class q extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public q(Continuation<? super q> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HeadSettingViewModel.this.new q(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HeadSettingViewModel.this.getMozartH5UrlLiveData().postValue(H5UrlSource.INSTANCE.getMozartH5UrlStatic(HeadSettingViewModel.this.deviceSource));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/hm/health/device/headset/common/MozartH5;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<MutableLiveData<MozartH5>> {
        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<MozartH5> invoke() {
            MutableLiveData<MozartH5> mutableLiveData = new MutableLiveData<>();
            HeadSettingViewModel.this.h();
            return mutableLiveData;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<String> {
        public final /* synthetic */ NoiseControl a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(NoiseControl noiseControl) {
            super(0);
            this.a = noiseControl;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "noiseControlType:" + this.a.getNoiseControlType() + ",noiseReductionMode:" + this.a.getNoiseReductionMode();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t extends Lambda implements Function0<String> {
        public static final t a = new t();

        public t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "The headset is currently writing settings";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HeadSettingViewModel(@NotNull HeadsetFeatureTree headsetFeatureTree) {
        this.headsetFeatureTree = headsetFeatureTree;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.headset.viewmodel.HeadSettingViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
        this._writingResult = new MutableLiveData<>(null);
        this.headPhoneModule = LazyKt__LazyJVMKt.lazy(new o());
        this._isSetting = new AtomicBoolean(false);
        Boolean bool = Boolean.FALSE;
        this._isLimitViewOperate = new MutableLiveData<>(bool);
        this._deviceEnable = new MutableLiveData<>(bool);
        this._headsetBatteryInfos = new MutableLiveData<>(new ArrayList());
        this._headsetBaseInfo = new MutableLiveData<>(new Pair(null, null));
        this._noiseControl = new MutableLiveData<>(null);
        this._runningRecognition = new MutableLiveData<>(null);
        this._wearInduction = new MutableLiveData<>(null);
        this._cervicalProtection = new MutableLiveData<>(null);
        this._percussionBroadcast = new MutableLiveData<>(null);
        this._hrReminderInfo = new MutableLiveData<>(new HrReminderInfoVo(null, false, 3, null));
        this._headsetSportSetting = new MutableLiveData<>(null);
        this._statusHearingHealth = new MutableLiveData<>(null);
        this._smartPlay = new MutableLiveData<>(null);
        headsetFeatureTree.setup();
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(boolean result) {
        this._isSetting.set(false);
        this._writingResult.postValue(Boolean.valueOf(result));
        this._isLimitViewOperate.postValue(Boolean.FALSE);
    }

    private final DeviceManagerApi b() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HeadPhoneModule c() {
        return (HeadPhoneModule) this.headPhoneModule.getValue();
    }

    private final void e() {
        if (!Intrinsics.areEqual(getDeviceEnable().getValue(), Boolean.FALSE)) {
            HMBaseDevice hMBaseDeviceF = f();
            boolean z2 = false;
            if (hMBaseDeviceF != null && hMBaseDeviceF.isConnected()) {
                z2 = true;
            }
            if (z2) {
                kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new HeadSettingViewModel$getHeadsetAllConfigInfo$$inlined$safeLaunch$1(null, this), 2, null);
                return;
            }
        }
        HMLog.info(A, new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HMBaseDevice f() {
        return b().getDevice(HMDeviceType.HEADSET);
    }

    private final HeadsetSettings g() {
        HeadsetSettings headsetSettings = new HeadsetSettings(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 131071, null);
        headsetSettings.setGestureSettings(this.headsetFeatureTree.isSupport(HeadsetSoftFeature.GESTURE_SETTINGS));
        headsetSettings.setMusicEqualizer(this.headsetFeatureTree.isSupport(HeadsetSoftFeature.MUSIC_EQUALIZER));
        headsetSettings.setAmbientSoundMonitoring(this.headsetFeatureTree.isSupport(HeadsetSoftFeature.AMBIENT_SOUND_MONITORING));
        headsetSettings.setSportsSettings(this.headsetFeatureTree.isSupport(HeadsetSoftFeature.SPORTS_SETTINGS));
        headsetSettings.setHearingHealth(this.headsetFeatureTree.isSupport(HeadsetSoftFeature.HEARING_HEALTH));
        headsetSettings.setCervicalProtection(this.headsetFeatureTree.isSupport(HeadsetSoftFeature.CERVICAL_PROTECTION));
        headsetSettings.setVoiceControl(this.headsetFeatureTree.isSupport(HeadsetSoftFeature.VOICE_CONTROL));
        headsetSettings.setWearInduction(this.headsetFeatureTree.isSupport(HeadsetSoftFeature.WEAR_INDUCTION));
        headsetSettings.setNoiseReduction(this.headsetFeatureTree.isSupport(HeadsetSoftFeature.NOISE_REDUCTION));
        headsetSettings.setRunningRecognition(this.headsetFeatureTree.isSupport(HeadsetSoftFeature.SPORT_RUNNING_RECOGNITION));
        headsetSettings.setSportHighHrReminder(this.headsetFeatureTree.isSupport(HeadsetSoftFeature.SPORT_HIGH_HEART_RATE_REMINDER));
        headsetSettings.setBeatEnhancement(this.headsetFeatureTree.isSupport(HeadsetSoftFeature.SPORT_BEAT_ENHANCEMENT));
        headsetSettings.setPercussionBroadcast(this.headsetFeatureTree.isSupport(HeadsetSoftFeature.SPORT_PERCUSSION_BROADCAST));
        headsetSettings.setHrBroadcast(this.headsetFeatureTree.isSupport(HeadsetSoftFeature.HEART_RATE_BROADCAST));
        headsetSettings.setSkySleepRelax(this.headsetFeatureTree.isSupport(HeadsetSoftFeature.SKY_SLEEP_RELAX));
        headsetSettings.setHeadsetAlarm(this.headsetFeatureTree.isSupport(HeadsetSoftFeature.HEADSET_ALARM));
        headsetSettings.setSmartPlayMusic(this.headsetFeatureTree.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC));
        return headsetSettings;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new q(null), 2, null);
    }

    private final void i(HeadsetSettings headsetSettings) {
    }

    private final boolean j() {
        if (this._isSetting.get()) {
            HMLog.info(A, t.a);
            return false;
        }
        this._isSetting.set(true);
        this._writingResult.setValue(null);
        this._isLimitViewOperate.setValue(Boolean.TRUE);
        return true;
    }

    public static /* synthetic */ void updateLiveDataCache$default(HeadSettingViewModel headSettingViewModel, Boolean bool, Boolean bool2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bool = null;
        }
        if ((i2 & 2) != 0) {
            bool2 = null;
        }
        headSettingViewModel.updateLiveDataCache(bool, bool2);
    }

    public final void cancelChecking() {
        Job job = this.job;
        if (job == null) {
            return;
        }
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
    }

    public final void dismissCheckingDelay() {
        Job job = this.job;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.job = kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new b(null), 2, null);
    }

    public final void enableReportHeadsetInfo(boolean enable, @NotNull Function1<? super Boolean, Unit> callBack) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new HeadSettingViewModel$enableReportHeadsetInfo$$inlined$safeLaunch$1(null, this, enable, callBack), 2, null);
    }

    @NotNull
    public final LiveData<CervicalProtectionVo> getCervicalProtection() {
        return this._cervicalProtection;
    }

    @NotNull
    public final MutableLiveData<Boolean> getCheckingLiveData() {
        return this.checkingLiveData;
    }

    @NotNull
    public final LiveData<Boolean> getDeviceEnable() {
        return this._deviceEnable;
    }

    @NotNull
    public final LiveData<Pair<String, String>> getHeadsetBaseInfo() {
        return this._headsetBaseInfo;
    }

    @NotNull
    public final LiveData<List<HeadsetBatteryInfo>> getHeadsetBatteryInfos() {
        return this._headsetBatteryInfos;
    }

    public final void getHeadsetNoiseReduction() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new HeadSettingViewModel$getHeadsetNoiseReduction$$inlined$safeLaunch$1(null, this), 2, null);
    }

    @NotNull
    public final HeadsetSettings getHeadsetSettings() {
        return g();
    }

    @NotNull
    public final LiveData<HeadsetSportSettingVo> getHeadsetSportSetting() {
        return this._headsetSportSetting;
    }

    @NotNull
    public final LiveData<HrReminderInfoVo> getHrReminderInfo() {
        return this._hrReminderInfo;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final MutableLiveData<MozartH5> getMozartH5UrlLiveData() {
        return (MutableLiveData) this.mozartH5UrlLiveData.getValue();
    }

    @NotNull
    public final LiveData<NoiseReductionModeVo> getNoiseControl() {
        return this._noiseControl;
    }

    @NotNull
    public final LiveData<PercussionBroadcastVo> getPercussionBroadcast() {
        return this._percussionBroadcast;
    }

    public final void getRebootCount(@NotNull Function1<? super Integer, Unit> callBack) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new HeadSettingViewModel$getRebootCount$$inlined$safeLaunch$1(null, this, callBack), 2, null);
    }

    @NotNull
    public final LiveData<RunningRecognitionVo> getRunningRecognition() {
        return this._runningRecognition;
    }

    @NotNull
    public final LiveData<SmartPlayVo> getSmartPlay() {
        return this._smartPlay;
    }

    @NotNull
    public final LiveData<HearingHealthStatusVo> getStatusHearingHealth() {
        return this._statusHearingHealth;
    }

    @NotNull
    public final LiveData<WearInductionVo> getWearInduction() {
        return this._wearInduction;
    }

    @NotNull
    public final LiveData<Boolean> getWritingResult() {
        return this._writingResult;
    }

    public final void initHeadsetNeedCondition(@NotNull String address) {
        this._address = address;
        Device bindDevice = b().getBindDevice(HMDeviceType.HEADSET, address);
        if (bindDevice == null) {
            bindDevice = null;
        } else {
            this.deviceSource = HMDeviceSource.fromValue(bindDevice.getDevice_source().intValue());
            this.deviceType = HMDeviceType.fromValue(bindDevice.getDevice_type().intValue());
            Unit unit = Unit.INSTANCE;
        }
        this.device = bindDevice;
    }

    @NotNull
    public final LiveData<Boolean> isLimitViewOperate() {
        return this._isLimitViewOperate;
    }

    public final void loadBatteryInfo(boolean isActive) {
        if (!isActive) {
            ArrayList arrayList = new ArrayList();
            if (this.deviceSource == HMDeviceSource.OTHER_LULLABY) {
                arrayList.add(new HeadsetBatteryInfo(null, false, HeadsetPart.Right));
            } else {
                arrayList.add(new HeadsetBatteryInfo(null, false, HeadsetPart.Left));
                arrayList.add(new HeadsetBatteryInfo(null, false, HeadsetPart.Right));
                arrayList.add(new HeadsetBatteryInfo(null, false, HeadsetPart.Box));
            }
            this._headsetBatteryInfos.setValue(arrayList);
            return;
        }
        IHMAuthCallback device = b().getDevice(HMDeviceType.HEADSET);
        if (device == null || !(device instanceof HeadsetDevice)) {
            return;
        }
        p pVar = p.a;
        ArrayList arrayList2 = new ArrayList();
        if (device instanceof LullabyDevice) {
            BatteryInfo batteryInfo = ((LullabyDevice) device).getBatteryInfo();
            arrayList2.add(new HeadsetBatteryInfo(batteryInfo, pVar.invoke(batteryInfo).booleanValue(), HeadsetPart.Right));
        } else {
            HeadsetDevice headsetDevice = (HeadsetDevice) device;
            BatteryInfo batteryInfo2 = headsetDevice.getBatteryInfo(HeadsetDevice.Part.Left.INSTANCE);
            BatteryInfo batteryInfo3 = headsetDevice.getBatteryInfo(HeadsetDevice.Part.Right.INSTANCE);
            BatteryInfo batteryInfo4 = headsetDevice.getBatteryInfo(HeadsetDevice.Part.Box.INSTANCE);
            arrayList2.add(new HeadsetBatteryInfo(batteryInfo2, pVar.invoke(batteryInfo2).booleanValue(), HeadsetPart.Left));
            arrayList2.add(new HeadsetBatteryInfo(batteryInfo3, pVar.invoke(batteryInfo3).booleanValue(), HeadsetPart.Right));
            arrayList2.add(new HeadsetBatteryInfo(batteryInfo4, pVar.invoke(batteryInfo4).booleanValue(), HeadsetPart.Box));
        }
        this._headsetBatteryInfos.setValue(arrayList2);
    }

    public final void loadHeadsetBaseInfo() {
        MutableLiveData<Pair<String, String>> mutableLiveData = this._headsetBaseInfo;
        Device device = this.device;
        String displayName = device == null ? null : device.getDisplayName();
        Device device2 = this.device;
        mutableLiveData.setValue(new Pair<>(displayName, device2 != null ? device2.getFirmware_version() : null));
    }

    public final void setBeatEnhancement(boolean enable) {
        if (j()) {
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new HeadSettingViewModel$setBeatEnhancement$$inlined$safeLaunch$1(null, this, enable), 2, null);
        }
    }

    public final void setDeviceEnable(boolean enable) {
        this._deviceEnable.setValue(Boolean.valueOf(enable));
        if (enable) {
            loadBatteryInfo(enable);
            this.headsetFeatureTree.reset();
            e();
        }
    }

    public final void setHeadsetNoiseReduction(@NotNull NoiseControl noiseControl) {
        if (j()) {
            HMLog.info(A, new s(noiseControl));
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new HeadSettingViewModel$setHeadsetNoiseReduction$$inlined$safeLaunch$1(null, this, noiseControl), 2, null);
        }
    }

    public final void setHrBroadcast(@NotNull HrBroadcastType type) {
        if (j()) {
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new HeadSettingViewModel$setHrBroadcast$$inlined$safeLaunch$1(null, this, type), 2, null);
        }
    }

    public final void setHrReminder(@NotNull HrReminderInfo hrReminderInfo) {
        if (j()) {
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new HeadSettingViewModel$setHrReminder$$inlined$safeLaunch$1(null, this, hrReminderInfo), 2, null);
        }
    }

    public final void setPercussionBroadcast(boolean enable) {
        if (j()) {
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new HeadSettingViewModel$setPercussionBroadcast$$inlined$safeLaunch$1(null, this, enable), 2, null);
        }
    }

    public final void setRunningRecognition(boolean isOpen) {
        if (j()) {
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new HeadSettingViewModel$setRunningRecognition$$inlined$safeLaunch$1(null, this, isOpen), 2, null);
        }
    }

    public final void setSmartPlay(boolean enable) {
        if (j()) {
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new HeadSettingViewModel$setSmartPlay$$inlined$safeLaunch$1(null, this, enable), 2, null);
        }
    }

    public final void setWearInduction(boolean enable) {
        if (j()) {
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new HeadSettingViewModel$setWearInduction$$inlined$safeLaunch$1(null, this, enable), 2, null);
        }
    }

    public final void updateLiveDataCache(@Nullable Boolean hearingHealth, @Nullable Boolean cervicalProtection) {
        if (hearingHealth != null) {
            boolean zBooleanValue = hearingHealth.booleanValue();
            HearingHealthStatusVo value = this._statusHearingHealth.getValue();
            if (value != null) {
                value.setStatusHearingHealth(Boolean.valueOf(zBooleanValue));
            }
        }
        if (cervicalProtection == null) {
            return;
        }
        boolean zBooleanValue2 = cervicalProtection.booleanValue();
        CervicalProtectionVo value2 = this._cervicalProtection.getValue();
        if (value2 == null) {
            return;
        }
        value2.setCervicalProtection(Boolean.valueOf(zBooleanValue2));
    }
}
