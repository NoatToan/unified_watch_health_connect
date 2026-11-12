package com.xiaomi.hm.health.device.setting.viewmodel;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import androidx.arch.core.util.Function;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.CoroutineLiveDataKt;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.LiveDataScope;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import androidx.p010navigation.NavController;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ai.helper.DeviceSpeechSupportFuncKt;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.devicex.DeviceXBuilder;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.injection.keeper.DeviceTimeStoreApi;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.devicex.injection.webapi.FaqWebApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.databases.model.Reminder;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.alarm.AlarmClockManager;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.event.HMDeviceBatteryEvent;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.event.HMDeviceFwUpgradeEvent;
import com.xiaomi.hm.health.device.event.HMDeviceSyncDataEvent;
import com.xiaomi.hm.health.device.feature.sync.SyncCenterManager;
import com.xiaomi.hm.health.device.firmware.FwUpgradeFeature;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeManager;
import com.xiaomi.hm.health.device.setting.SoftFeature;
import com.xiaomi.hm.health.device.setting.consts.webapi.WebApi;
import com.xiaomi.hm.health.device.setting.inject.IDeviceFeatureDepends;
import com.xiaomi.hm.health.device.setting.pattern.FeatureTree;
import com.xiaomi.hm.health.device.setting.pattern.FeatureTreeFactory;
import com.xiaomi.hm.health.device.setting.vo.AlarmItemVo;
import com.xiaomi.hm.health.device.setting.vo.BandSettingVo;
import com.xiaomi.hm.health.device.setting.vo.ConnectStatus;
import com.xiaomi.hm.health.device.setting.vo.DeviceConnectedVo;
import com.xiaomi.hm.health.device.setting.vo.DisplayNameVo;
import com.xiaomi.hm.health.device.setting.vo.FaqVo;
import com.xiaomi.hm.health.device.setting.vo.IncomingCallVo;
import com.xiaomi.hm.health.device.setting.vo.InstructionVo;
import com.xiaomi.hm.health.device.setting.vo.LibVo;
import com.xiaomi.hm.health.device.setting.vo.LongSitAlertItemVo;
import com.xiaomi.hm.health.device.setting.vo.NightModeSettingVo;
import com.xiaomi.hm.health.device.setting.vo.OfflineVoiceCmdVo;
import com.xiaomi.hm.health.device.setting.vo.PlayHelpVo;
import com.xiaomi.hm.health.device.setting.vo.ReminderItemVo;
import com.xiaomi.hm.health.device.setting.vo.RingTypeVo;
import com.xiaomi.hm.health.device.setting.vo.VersionItemVo;
import com.xiaomi.hm.health.device.setting.vo.VibrateSettingVo;
import com.xiaomi.hm.health.device.setting.vo.WatchAppItemVo;
import com.xiaomi.hm.health.device.setting.vo.WatchSettingVo;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import com.xiaomi.hm.health.eventbus.EventBluetooth;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.smartplay.eventremind.EventRemindManager;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import de.greenrobot.event.EventBus;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ö\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 º\u00012\u00020\u00012\u00020\u0002:\u0002º\u0001B\u0019\u0012\u0006\u0010B\u001a\u00020?\u0012\u0006\u0010F\u001a\u00020C¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0003J\b\u0010\b\u001a\u00020\u0003H\u0002J\u0014\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\r\u001a\u00020\u0003H\u0002J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eH\u0016J\u0006\u0010\u0012\u001a\u00020\u0003J\u0006\u0010\u0013\u001a\u00020\u0003J\u0006\u0010\u0014\u001a\u00020\u0003J\u0006\u0010\u0015\u001a\u00020\u0003J\u0006\u0010\u0016\u001a\u00020\u0003J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017J\u0006\u0010\u001a\u001a\u00020\u0019J\b\u0010\u001b\u001a\u0004\u0018\u00010\tJ\u0006\u0010\u001c\u001a\u00020\tJ\u0006\u0010\u001d\u001a\u00020\u0003J\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000eJ\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u000eJ\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000eJ\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eJ\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u000eJ\u0006\u0010'\u001a\u00020\u0003J\u0006\u0010(\u001a\u00020\u0003J\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0\u000eJ\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u000eJ\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u000eJ\u0006\u0010.\u001a\u00020\u0003J\u0006\u0010/\u001a\u00020\u0003J\u0006\u00100\u001a\u00020\u0003J\u0006\u00101\u001a\u00020\u0003J\b\u00102\u001a\u0004\u0018\u00010*J\u0006\u00103\u001a\u00020\u0006J\u000e\u00106\u001a\u00020\u00032\u0006\u00105\u001a\u000204J\u000e\u00106\u001a\u00020\u00032\u0006\u00105\u001a\u000207J\u0006\u00108\u001a\u00020\u0003J\u000e\u00106\u001a\u00020\u00032\u0006\u00105\u001a\u000209J\u000e\u00106\u001a\u00020\u00032\u0006\u0010;\u001a\u00020:J\u000e\u00106\u001a\u00020\u00032\u0006\u00105\u001a\u00020<J\b\u0010=\u001a\u00020\u0003H\u0014J\u0006\u0010>\u001a\u00020\u0003R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001d\u0010K\u001a\u00020G8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bD\u0010JR\u001d\u0010P\u001a\u00020L8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010I\u001a\u0004\bN\u0010OR\u001d\u0010S\u001a\u00020Q8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010I\u001a\u0004\bH\u0010RR\u001d\u0010X\u001a\u00020T8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010I\u001a\u0004\bV\u0010WR\u001d\u0010[\u001a\u00020Y8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010I\u001a\u0004\bU\u0010ZR\u001d\u0010_\u001a\u00020\u00198D@\u0004X\u0084\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010I\u001a\u0004\b]\u0010^R%\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020a0`0\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010b\u001a\u0004\bc\u0010dR%\u0010j\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0f8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010g\u001a\u0004\bh\u0010iR\u001d\u0010m\u001a\u00020k8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010I\u001a\u0004\b\\\u0010lR\u001d\u0010q\u001a\u00020n8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bo\u0010I\u001a\u0004\b@\u0010pR\u001f\u0010t\u001a\b\u0012\u0004\u0012\u00020r0f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010g\u001a\u0004\bs\u0010iR\u001f\u0010w\u001a\b\u0012\u0004\u0012\u00020u0f8\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010g\u001a\u0004\bv\u0010iR\u001f\u0010z\u001a\b\u0012\u0004\u0012\u00020x0f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010g\u001a\u0004\by\u0010iR\u001f\u0010~\u001a\b\u0012\u0004\u0012\u00020{0f8\u0006@\u0006¢\u0006\f\n\u0004\b|\u0010g\u001a\u0004\b}\u0010iR\"\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020\u007f0f8\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010g\u001a\u0005\b\u0081\u0001\u0010iR\u001e\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0f8\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010gR\u001e\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020 0f8\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010gR\u001e\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020\"0f8\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010gR\u001e\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060f8\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010gR\u001e\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020%0f8\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010gR#\u0010\u0090\u0001\u001a\t\u0012\u0005\u0012\u00030\u008d\u00010f8\u0006@\u0006¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010g\u001a\u0005\b\u008f\u0001\u0010iR#\u0010\u0094\u0001\u001a\t\u0012\u0005\u0012\u00030\u0091\u00010f8\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010g\u001a\u0005\b\u0093\u0001\u0010iR\"\u0010\u0097\u0001\u001a\b\u0012\u0004\u0012\u00020\t0f8\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010g\u001a\u0005\b\u0096\u0001\u0010iR%\u0010\u009a\u0001\u001a\b\u0012\u0004\u0012\u00020*0f8\u0004@\u0004X\u0084\u0004¢\u0006\u000e\n\u0005\b\u0098\u0001\u0010g\u001a\u0005\b\u0099\u0001\u0010iR%\u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u00020,0f8\u0004@\u0004X\u0084\u0004¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010g\u001a\u0005\b\u009c\u0001\u0010iR#\u0010¡\u0001\u001a\t\u0012\u0005\u0012\u00030\u009e\u00010f8\u0006@\u0006¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010g\u001a\u0005\b \u0001\u0010iR#\u0010¥\u0001\u001a\t\u0012\u0005\u0012\u00030¢\u00010f8\u0006@\u0006¢\u0006\u000e\n\u0005\b£\u0001\u0010g\u001a\u0005\b¤\u0001\u0010iR#\u0010©\u0001\u001a\t\u0012\u0005\u0012\u00030¦\u00010f8\u0006@\u0006¢\u0006\u000e\n\u0005\b§\u0001\u0010g\u001a\u0005\b¨\u0001\u0010iR#\u0010\u00ad\u0001\u001a\t\u0012\u0005\u0012\u00030ª\u00010f8\u0006@\u0006¢\u0006\u000e\n\u0005\b«\u0001\u0010g\u001a\u0005\b¬\u0001\u0010iR#\u0010±\u0001\u001a\t\u0012\u0005\u0012\u00030®\u00010f8\u0006@\u0006¢\u0006\u000e\n\u0005\b¯\u0001\u0010g\u001a\u0005\b°\u0001\u0010iR#\u0010µ\u0001\u001a\t\u0012\u0005\u0012\u00030²\u00010\u000e8\u0006@\u0006¢\u0006\u000e\n\u0005\b³\u0001\u0010b\u001a\u0005\b´\u0001\u0010dR\"\u0010·\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060f8\u0006@\u0006¢\u0006\u000e\n\u0005\b¶\u0001\u0010g\u001a\u0005\b·\u0001\u0010i¨\u0006»\u0001"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/viewmodel/FeatureViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/component/KoinComponent;", "", hl.k, "m", "", "i", GoogleApiAvailabilityLight.b, "", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "Ljava/util/Calendar;", z.j, "o", "Landroidx/lifecycle/LiveData;", "", "Lcom/xiaomi/hm/health/device/setting/vo/WatchAppItemVo;", "loadAppItemFeature", "loadLibSetting", "loadRingTypeSetting", "loadBandSetting", "loadPlayHelpSetting", "prepareDeviceStatus", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "findDevice", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "findDeviceSource", "findMacAddress", "getDeviceVersion", "loadUpdateFwUpgradeVo", "Lcom/xiaomi/hm/health/device/setting/vo/IncomingCallVo;", "loadIncomingCallAlert", "Lcom/xiaomi/hm/health/device/setting/vo/AlarmItemVo;", "loadAlarmVo", "Lcom/xiaomi/hm/health/device/setting/vo/ReminderItemVo;", "loadReminderLiveData", "loadAppNotifySetting", "Lcom/xiaomi/hm/health/device/setting/vo/LongSitAlertItemVo;", "loadLongSitAlertSetting", "loadInstruction", "loadDeviceFaqSetting", "loadDeviceMacAddress", "Lcom/xiaomi/hm/health/databases/model/Device;", "loadDeviceLiveData", "Lcom/xiaomi/hm/health/device/setting/vo/DisplayNameVo;", "loadProductName", "loadOfflineVoiceCmd", "loadVibrateModeSetting", "loadNightModeSetting", "loadWatchSetting", "updateDisplayName", "isDataCenterSyncing", "Lcom/xiaomi/hm/health/device/event/HMDeviceConnectionEvent;", "event", "onEventMainThread", "Lcom/xiaomi/hm/health/device/event/HMDeviceBatteryEvent;", "retryConnect", "Lcom/xiaomi/hm/health/device/event/HMDeviceSyncDataEvent;", "Lcom/xiaomi/hm/health/eventbus/EventBluetooth;", "eventBluetooth", "Lcom/xiaomi/hm/health/device/event/HMDeviceFwUpgradeEvent;", "onCleared", "loadAssistantSettings", "Lcom/xiaomi/hm/health/device/setting/pattern/FeatureTree;", "a", "Lcom/xiaomi/hm/health/device/setting/pattern/FeatureTree;", "featureTree", "Landroid/content/Context;", "b", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/devicex/manager/DeviceManagerApi;", "c", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", GoogleApiAvailabilityLight.a, "e", "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApi", "Lcom/huami/devicex/injection/keeper/DeviceTimeStoreApi;", "()Lcom/huami/devicex/injection/keeper/DeviceTimeStoreApi;", "deviceTimeStoreApi", "Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "f", "g", "()Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "keeperProxyApi", "Lcom/huami/devicex/injection/webapi/FaqWebApi;", "()Lcom/huami/devicex/injection/webapi/FaqWebApi;", "faqWebApi", "h", "getHmBaseDeviceSource", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "hmBaseDeviceSource", "", "Lcom/xiaomi/hm/health/device/setting/SoftFeature;", "Landroidx/lifecycle/LiveData;", "getAllFeatureLiveData", "()Landroidx/lifecycle/LiveData;", "allFeatureLiveData", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/MutableLiveData;", "getAppItemFeatureLiveData", "()Landroidx/lifecycle/MutableLiveData;", "appItemFeatureLiveData", "Lcom/xiaomi/hm/health/device/setting/viewmodel/SoftFeatureCache;", "()Lcom/xiaomi/hm/health/device/setting/viewmodel/SoftFeatureCache;", "softFeatureCache", "Lcom/xiaomi/hm/health/device/setting/inject/IDeviceFeatureDepends;", "l", "()Lcom/xiaomi/hm/health/device/setting/inject/IDeviceFeatureDepends;", "deviceFeatureDepends", "Lcom/xiaomi/hm/health/device/setting/vo/LibVo;", "getLibVoLiveData", "libVoLiveData", "Lcom/xiaomi/hm/health/device/setting/vo/RingTypeVo;", "getRingTypeVoLiveData", "ringTypeVoLiveData", "Lcom/xiaomi/hm/health/device/setting/vo/BandSettingVo;", "getBandSettingLiveData", "bandSettingLiveData", "Lcom/xiaomi/hm/health/device/setting/vo/PlayHelpVo;", com.google.android.exoplayer2.text.ttml.b.r, "getPlayHelpLiveData", "playHelpLiveData", "Lcom/xiaomi/hm/health/device/setting/vo/VersionItemVo;", DTransferConstants.SEARCH_KEY, "getUpgradeVoLiveData", "upgradeVoLiveData", "r", "incomingCallDataLiveData", SOAP.XMLNS, "alarmLiveData", "t", "reminderLiveData", "u", "appNotifySettingLiveData", "v", "longSitAlertSettingLiveData", "Lcom/xiaomi/hm/health/device/setting/vo/FaqVo;", "w", "getFaqLiveData", "faqLiveData", "Lcom/xiaomi/hm/health/device/setting/vo/InstructionVo;", "x", "getInstructionLiveData", "instructionLiveData", "y", "getMacAddressLiveData", "macAddressLiveData", "z", "getDeviceLiveData", "deviceLiveData", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getProductNameLiveData", "productNameLiveData", "Lcom/xiaomi/hm/health/device/setting/vo/OfflineVoiceCmdVo;", "B", "getOfflineVoiceCmd", "offlineVoiceCmd", "Lcom/xiaomi/hm/health/device/setting/vo/VibrateSettingVo;", "C", "getVibrateSettingVoLiveData", "vibrateSettingVoLiveData", "Lcom/xiaomi/hm/health/device/setting/vo/NightModeSettingVo;", LogUtil.D, "getNightModeSettingVoLiveData", "nightModeSettingVoLiveData", "Lcom/xiaomi/hm/health/device/setting/vo/WatchSettingVo;", "E", "getWatchSettingLiveData", "watchSettingLiveData", "Lcom/xiaomi/hm/health/device/setting/vo/DeviceConnectedVo;", "F", "getSyncStatusLiveData", "syncStatusLiveData", "Lcom/xiaomi/hm/health/device/setting/vo/ConnectStatus;", "G", "getDisplayDialLiveData", "displayDialLiveData", "H", "isSupportLiveData", "<init>", "(Lcom/xiaomi/hm/health/device/setting/pattern/FeatureTree;Landroid/content/Context;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public class FeatureViewModel extends ViewModel implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int I = -100;
    private static final int J = 100;

    @NotNull
    private static final String K = "FeatureViewModel";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<DisplayNameVo> productNameLiveData;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<OfflineVoiceCmdVo> offlineVoiceCmd;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<VibrateSettingVo> vibrateSettingVoLiveData;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<NightModeSettingVo> nightModeSettingVoLiveData;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<WatchSettingVo> watchSettingLiveData;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<DeviceConnectedVo> syncStatusLiveData;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    private final LiveData<ConnectStatus> displayDialLiveData;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> isSupportLiveData;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final FeatureTree featureTree;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilsApi;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceTimeStoreApi;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy keeperProxyApi;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy faqWebApi;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy hmBaseDeviceSource;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Set<SoftFeature>> allFeatureLiveData;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<WatchAppItemVo>> appItemFeatureLiveData;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy softFeatureCache;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceFeatureDepends;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<LibVo> libVoLiveData;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<RingTypeVo> ringTypeVoLiveData;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<BandSettingVo> bandSettingLiveData;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<PlayHelpVo> playHelpLiveData;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<VersionItemVo> upgradeVoLiveData;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<IncomingCallVo> incomingCallDataLiveData;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<AlarmItemVo> alarmLiveData;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<ReminderItemVo> reminderLiveData;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> appNotifySettingLiveData;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<LongSitAlertItemVo> longSitAlertSettingLiveData;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<FaqVo> faqLiveData;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<InstructionVo> instructionLiveData;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> macAddressLiveData;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Device> deviceLiveData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/viewmodel/FeatureViewModel$Companion;", "", "", "getURL_OFFLINE_VOICE", "()Ljava/lang/String;", "URL_OFFLINE_VOICE", "", "DEFAULT_FIRST_INDEX", LogUtil.I, "DEFAULT_LAST_INDEX", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getURL_OFFLINE_VOICE() {
            return HMServerDef.getHost() + "t/zepp.offline.voice";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Landroidx/lifecycle/LiveDataScope;", "", "Lcom/xiaomi/hm/health/device/setting/SoftFeature;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel$allFeatureLiveData$1", f = "FeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<LiveDataScope<Set<? extends SoftFeature>>, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull LiveDataScope<Set<SoftFeature>> liveDataScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FeatureViewModel.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FeatureViewModel.this.featureTree.allFeatures();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<HMDeviceSource> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMDeviceSource invoke() {
            return FeatureViewModel.this.b().getBoundDeviceSource(HMDeviceType.MILI);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel$loadAlarmVo$1$1", f = "FeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FeatureViewModel.this.new c(continuation);
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
            int enableAlarmSize = AlarmClockManager.getInstance().getEnableAlarmSize();
            FeatureViewModel.this.alarmLiveData.postValue(new AlarmItemVo(enableAlarmSize > 0, enableAlarmSize));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/navigation/NavController;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<NavController, Unit> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        public final void a(@NotNull NavController navController) {
            navController.navigate(R.id.action_to_memberCard);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NavController navController) {
            a(navController);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel$loadAssistantSettings$1$isSupport$1", f = "FeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new e(continuation);
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
            return Boxing.boxBoolean(FeatureTreeFactory.INSTANCE.realCreate().isSupport(SoftFeature.SMART_ASSISTANT));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel$loadDeviceFaqSetting$1$1", f = "FeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMBaseDevice b;
        public final /* synthetic */ FeatureViewModel c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(HMBaseDevice hMBaseDevice, FeatureViewModel featureViewModel, Continuation<? super f> continuation) {
            super(2, continuation);
            this.b = hMBaseDevice;
            this.c = featureViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new f(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
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
            if (this.b.getDeviceInfo() == null) {
                return Unit.INSTANCE;
            }
            String strIsDeviceManualFaqShow = this.c.f().isDeviceManualFaqShow(this.b.getDeviceInfo());
            if (strIsDeviceManualFaqShow == null) {
                this.c.getFaqLiveData().postValue(new FaqVo(false, null));
            } else {
                this.c.getFaqLiveData().postValue(new FaqVo(this.c.featureTree.isSupport(SoftFeature.FEEDBACK), strIsDeviceManualFaqShow));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel$loadDeviceLiveData$1$1", f = "FeatureViewModel.kt", i = {}, l = {480}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ Deferred<DisplayNameVo> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Deferred<DisplayNameVo> deferred, Continuation<? super g> continuation) {
            super(2, continuation);
            this.d = deferred;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FeatureViewModel.this.new g(this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MutableLiveData mutableLiveData;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableLiveData<DisplayNameVo> productNameLiveData = FeatureViewModel.this.getProductNameLiveData();
                Deferred<DisplayNameVo> deferred = this.d;
                this.a = productNameLiveData;
                this.b = 1;
                Object objAwait = deferred.await(this);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableLiveData = productNameLiveData;
                obj = objAwait;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableLiveData = (MutableLiveData) this.a;
                ResultKt.throwOnFailure(obj);
            }
            mutableLiveData.setValue(obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/xiaomi/hm/health/device/setting/vo/DisplayNameVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel$loadDeviceLiveData$1$vo$1", f = "FeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DisplayNameVo>, Object> {
        public int a;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FeatureViewModel.this.new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super DisplayNameVo> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String string;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Device bindInfo = FeatureViewModel.this.b().getBindInfo(HMDeviceType.MILI);
            String displayName = bindInfo == null ? null : bindInfo.getDisplayName();
            String deviceDescription = FeatureViewModel.this.e().getDeviceDescription(FeatureViewModel.this.getHmBaseDeviceSource());
            String str = "";
            if (deviceDescription == null) {
                deviceDescription = "";
            }
            if (displayName != null && (string = StringsKt__StringsKt.trim(displayName).toString()) != null) {
                str = string;
            }
            return new DisplayNameVo(deviceDescription, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Calendar b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, Calendar calendar) {
            super(0);
            this.a = str;
            this.b = calendar;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "loadEarliestBoundTime address: " + this.a + " result: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel$loadIncomingCallAlert$1$1", f = "FeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FeatureViewModel.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
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
            HMMiliConfig miliConfig = HMPersonInfo.getInstance().getMiliConfig();
            FeatureViewModel.this.incomingCallDataLiveData.postValue(new IncomingCallVo(miliConfig.isInComingCallEnabled(), miliConfig.isPhoneNotifyDelayEnable(), miliConfig.getInComingCallNotifyTime()));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel$loadInstruction$1$1", f = "FeatureViewModel.kt", i = {}, l = {425}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMBaseDevice b;
        public final /* synthetic */ FeatureViewModel c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(0);
                this.a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "loadInstruction: " + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(HMBaseDevice hMBaseDevice, FeatureViewModel featureViewModel, Continuation<? super k> continuation) {
            super(2, continuation);
            this.b = hMBaseDevice;
            this.c = featureViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new k(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.b.getDeviceInfo() == null) {
                    return Unit.INSTANCE;
                }
                WebApi webApi = WebApi.INSTANCE;
                DeviceInfo deviceInfo = this.b.getDeviceInfo();
                Locale locale = Locale.getDefault();
                this.a = 1;
                obj = WebApi.loadH5Url$default(webApi, deviceInfo, locale, 75, (String) null, 0, this, 24, (Object) null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            String str = (String) obj;
            HMLog.info(FeatureViewModel.K, new a(str));
            this.c.getInstructionLiveData().postValue(new InstructionVo(str));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/xiaomi/hm/health/device/setting/vo/ReminderItemVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel$loadReminderLiveData$1$vo$1", f = "FeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ReminderItemVo>, Object> {
        public int a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(boolean z, Continuation<? super l> continuation) {
            super(2, continuation);
            this.b = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new l(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ReminderItemVo> continuation) {
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
            List<Reminder> enableReminders = EventRemindManager.getEnableReminders();
            return new ReminderItemVo(this.b, !enableReminders.isEmpty(), enableReminders);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel$loadUpdateFwUpgradeVo$1$1", f = "FeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public m(Continuation<? super m> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FeatureViewModel.this.new m(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
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
            HMBaseDevice hMBaseDeviceFindDevice = FeatureViewModel.this.findDevice();
            if (hMBaseDeviceFindDevice == null) {
                return Unit.INSTANCE;
            }
            HMDeviceSource deviceSource = hMBaseDeviceFindDevice.getMDeviceSource();
            HMDeviceType type = deviceSource.getType();
            HMFwOnlineUpgradeManager hMFwOnlineUpgradeManager = HMFwOnlineUpgradeManager.getInstance();
            boolean zSupportSilentUpgrade = FwUpgradeFeature.INSTANCE.supportSilentUpgrade(type);
            boolean zIsSupportContinueUpgrade = HMFwOnlineUpgradeManager.isSupportContinueUpgrade(deviceSource);
            FeatureViewModel.this.getUpgradeVoLiveData().postValue(new VersionItemVo(deviceSource, (DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade() && hMFwOnlineUpgradeManager.showUpdate(type)) || zSupportSilentUpgrade, FeatureViewModel.this.g().shouldShowRedDot(FeatureViewModel.this.context, type), (DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade() && hMFwOnlineUpgradeManager.useOnline(type)) ? hMFwOnlineUpgradeManager.hasFwUpgrade(FeatureViewModel.this.context, type) : HMFwUpgradeManager.getInstance().hasFwUpgrade(FeatureViewModel.this.context, type), zSupportSilentUpgrade, zIsSupportContinueUpgrade));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceSyncDataEvent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(HMDeviceSyncDataEvent hMDeviceSyncDataEvent) {
            super(0);
            this.a = hMDeviceSyncDataEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "HMDeviceSyncDataEvent:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel$onEventMainThread$3$1", f = "FeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMDeviceSyncDataEvent b;
        public final /* synthetic */ FeatureViewModel c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(HMDeviceSyncDataEvent hMDeviceSyncDataEvent, FeatureViewModel featureViewModel, Continuation<? super o> continuation) {
            super(2, continuation);
            this.b = hMDeviceSyncDataEvent;
            this.c = featureViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (HMDeviceType.MILI == this.b.getDeviceType()) {
                DeviceConnectedVo deviceConnectedVo = null;
                if (this.b.isStart()) {
                    deviceConnectedVo = new DeviceConnectedVo(0, ConnectStatus.SYNC, 0, false, null, null, 0, 125, null);
                } else if (this.b.isProgress()) {
                    deviceConnectedVo = new DeviceConnectedVo(this.b.getProgress().getPercent(), ConnectStatus.SYNC, 0, false, null, null, 0, 124, null);
                } else if (this.b.isStop()) {
                    this.c.o();
                }
                if (deviceConnectedVo != null) {
                    this.c.getSyncStatusLiveData().postValue(deviceConnectedVo);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel$prepareDeviceStatus$1$1", f = "FeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class p extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public p(Continuation<? super p> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FeatureViewModel.this.new p(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HMBaseDevice device = FeatureViewModel.this.b().getDevice();
            if (device != null) {
                FeatureViewModel featureViewModel = FeatureViewModel.this;
                if (device.isConnected()) {
                    featureViewModel.o();
                } else {
                    featureViewModel.getSyncStatusLiveData().postValue(new DeviceConnectedVo(0, ConnectStatus.CONNECTING, 0, false, null, null, 0, 125, null));
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel$updateDeviceInfo$1$1", f = "FeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class q extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ HMBaseDevice a;
            public final /* synthetic */ int b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HMBaseDevice hMBaseDevice, int i) {
                super(0);
                this.a = hMBaseDevice;
                this.b = i;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "lastCharge: " + this.a.getBatteryInfo().getLastCharge().getTime() + ", current: " + Calendar.getInstance().getTime() + ", delta: " + this.b;
            }
        }

        public q(Continuation<? super q> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FeatureViewModel.this.new q(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ConnectStatus connectStatus;
            DeviceConnectedVo deviceConnectedVo;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HMBaseDevice hMBaseDeviceFindDevice = FeatureViewModel.this.findDevice();
            if (hMBaseDeviceFindDevice == null) {
                return Unit.INSTANCE;
            }
            if (hMBaseDeviceFindDevice.isConnected()) {
                connectStatus = ConnectStatus.CONNECTED;
            } else {
                connectStatus = FeatureViewModel.this.i() ? ConnectStatus.UN_CONNECT : ConnectStatus.BLUETOOTH_DISABLE;
            }
            ConnectStatus connectStatus2 = connectStatus;
            if (hMBaseDeviceFindDevice.getBatteryInfo() != null) {
                int deltaDayCount = TimeUtils.getDeltaDayCount(hMBaseDeviceFindDevice.getBatteryInfo().getLastCharge(), Calendar.getInstance());
                HMLog.info(FeatureViewModel.K, new a(hMBaseDeviceFindDevice, deltaDayCount));
                int level = hMBaseDeviceFindDevice.getBatteryInfo().getLevel();
                boolean z = 1 == hMBaseDeviceFindDevice.getBatteryInfo().getDcStatus();
                Calendar lastCharge = hMBaseDeviceFindDevice.getBatteryInfo().getLastCharge();
                FeatureViewModel featureViewModel = FeatureViewModel.this;
                deviceConnectedVo = new DeviceConnectedVo(0, connectStatus2, level, z, lastCharge, featureViewModel.j(featureViewModel.findMacAddress()), deltaDayCount);
            } else {
                HMLog.e(FeatureViewModel.K, "Device battery info is null.", new Object[0]);
                FeatureViewModel featureViewModel2 = FeatureViewModel.this;
                deviceConnectedVo = new DeviceConnectedVo(0, connectStatus2, -1, false, null, featureViewModel2.j(featureViewModel2.findMacAddress()), Integer.MAX_VALUE);
            }
            FeatureViewModel.this.getSyncStatusLiveData().postValue(deviceConnectedVo);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FeatureViewModel(@NotNull FeatureTree featureTree, @NotNull Context context) {
        this.featureTree = featureTree;
        this.context = context;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel$special$$inlined$inject$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceUtilsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.DeviceUtilsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceUtilsApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), objArr2, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.deviceTimeStoreApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<DeviceTimeStoreApi>() { // from class: com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.keeper.DeviceTimeStoreApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceTimeStoreApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceTimeStoreApi.class), objArr4, objArr5);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode4 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.keeperProxyApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode4, (Function0) new Function0<KeeperProxyApi>() { // from class: com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel$special$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.keeper.KeeperProxyApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final KeeperProxyApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(KeeperProxyApi.class), objArr6, objArr7);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode5 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr8 = 0 == true ? 1 : 0;
        final Object[] objArr9 = 0 == true ? 1 : 0;
        this.faqWebApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode5, (Function0) new Function0<FaqWebApi>() { // from class: com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel$special$$inlined$inject$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.webapi.FaqWebApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final FaqWebApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(FaqWebApi.class), objArr8, objArr9);
            }
        });
        this.hmBaseDeviceSource = LazyKt__LazyJVMKt.lazy(new b());
        featureTree.setup();
        this.allFeatureLiveData = CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new a(null), 3, (Object) null);
        this.appItemFeatureLiveData = new MutableLiveData<>();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode6 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr10 = 0 == true ? 1 : 0;
        final Object[] objArr11 = 0 == true ? 1 : 0;
        this.softFeatureCache = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode6, (Function0) new Function0<SoftFeatureCache>() { // from class: com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel$special$$inlined$inject$default$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.viewmodel.SoftFeatureCache, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SoftFeatureCache invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(SoftFeatureCache.class), objArr10, objArr11);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode7 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr12 = 0 == true ? 1 : 0;
        final Object[] objArr13 = 0 == true ? 1 : 0;
        this.deviceFeatureDepends = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode7, (Function0) new Function0<IDeviceFeatureDepends>() { // from class: com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel$special$$inlined$inject$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.inject.IDeviceFeatureDepends, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IDeviceFeatureDepends invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(IDeviceFeatureDepends.class), objArr12, objArr13);
            }
        });
        this.libVoLiveData = new MutableLiveData<>();
        this.ringTypeVoLiveData = new MutableLiveData<>();
        this.bandSettingLiveData = new MutableLiveData<>();
        this.playHelpLiveData = new MutableLiveData<>();
        EventBus.getDefault().register(this);
        this.upgradeVoLiveData = new MutableLiveData<>();
        this.incomingCallDataLiveData = new MutableLiveData<>();
        this.alarmLiveData = new MutableLiveData<>();
        this.reminderLiveData = new MutableLiveData<>();
        this.appNotifySettingLiveData = new MutableLiveData<>();
        this.longSitAlertSettingLiveData = new MutableLiveData<>();
        this.faqLiveData = new MutableLiveData<>();
        this.instructionLiveData = new MutableLiveData<>();
        this.macAddressLiveData = new MutableLiveData<>();
        this.deviceLiveData = new MutableLiveData<>();
        this.productNameLiveData = new MutableLiveData<>();
        this.offlineVoiceCmd = new MutableLiveData<>();
        this.vibrateSettingVoLiveData = new MutableLiveData<>();
        this.nightModeSettingVoLiveData = new MutableLiveData<>();
        this.watchSettingLiveData = new MutableLiveData<>();
        MutableLiveData<DeviceConnectedVo> mutableLiveData = new MutableLiveData<>();
        this.syncStatusLiveData = mutableLiveData;
        this.displayDialLiveData = Transformations.distinctUntilChanged(Transformations.map(mutableLiveData, new Function<DeviceConnectedVo, ConnectStatus>() { // from class: com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel$special$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final ConnectStatus apply(DeviceConnectedVo deviceConnectedVo) {
                return deviceConnectedVo.getConnectStatus();
            }
        }));
        this.isSupportLiveData = new MutableLiveData<>();
    }

    private final IDeviceFeatureDepends a() {
        return (IDeviceFeatureDepends) this.deviceFeatureDepends.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceManagerApi b() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final DeviceTimeStoreApi c() {
        return (DeviceTimeStoreApi) this.deviceTimeStoreApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceUtilsApi e() {
        return (DeviceUtilsApi) this.deviceUtilsApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FaqWebApi f() {
        return (FaqWebApi) this.faqWebApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KeeperProxyApi g() {
        return (KeeperProxyApi) this.keeperProxyApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SoftFeatureCache h() {
        return (SoftFeatureCache) this.softFeatureCache.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public final boolean i() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            return false;
        }
        return defaultAdapter.isEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Calendar j(String address) {
        Calendar earliestBoundTime = c().getEarliestBoundTime(address == null ? "" : address);
        HMLog.info(K, new i(address, earliestBoundTime));
        return earliestBoundTime;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        HMBaseDevice hMBaseDeviceFindDevice = findDevice();
        boolean z = false;
        if (hMBaseDeviceFindDevice != null && DeviceSpeechSupportFuncKt.supportMIAI(hMBaseDeviceFindDevice)) {
            z = true;
        }
        if (z) {
            FeatureTree.setAppItem$default(this.featureTree, SoftFeature.XIAOAI, R.drawable.speech_icon_account_authorize_xiaoai_logo, 100, R.string.setting_app_xiaoai, false, null, 48, null);
            this.featureTree.removeAppItem(SoftFeature.ALEXA);
        }
        if (a().supportAlexa(DeviceXBuilder.INSTANCE.getContext())) {
            FeatureTree.setAppItem$default(this.featureTree, SoftFeature.ALEXA, R.drawable.layer_icon_alexa, 100, R.string.third_part_amazon_name, false, null, 48, null);
            this.featureTree.removeAppItem(SoftFeature.XIAOAI);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        if (a().supportAlexa(DeviceXBuilder.INSTANCE.getContext())) {
            FeatureTree.setAppItem$default(this.featureTree, SoftFeature.ALEXA, R.drawable.third_party_logo_alexa_round, -100, R.string.third_part_amazon_name, false, null, 48, null);
        }
    }

    private final void n() {
        o();
        loadUpdateFwUpgradeVo();
        loadOfflineVoiceCmd();
        loadInstruction();
        this.featureTree.reset();
        loadAppItemFeature();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new FeatureViewModel$updateDeviceInfo$$inlined$safeLaunch$1(null, this), 2, null);
    }

    @Nullable
    public final HMBaseDevice findDevice() {
        return b().getDevice(HMDeviceType.MILI);
    }

    @NotNull
    public final HMDeviceSource findDeviceSource() {
        return b().getBoundDeviceSource(HMDeviceType.MILI);
    }

    @Nullable
    public final String findMacAddress() {
        return b().getBoundDeviceAddress(HMDeviceType.MILI);
    }

    @NotNull
    public final LiveData<Set<SoftFeature>> getAllFeatureLiveData() {
        return this.allFeatureLiveData;
    }

    @NotNull
    public final MutableLiveData<List<WatchAppItemVo>> getAppItemFeatureLiveData() {
        return this.appItemFeatureLiveData;
    }

    @NotNull
    public final MutableLiveData<BandSettingVo> getBandSettingLiveData() {
        return this.bandSettingLiveData;
    }

    @NotNull
    public final MutableLiveData<Device> getDeviceLiveData() {
        return this.deviceLiveData;
    }

    @NotNull
    public final String getDeviceVersion() {
        String boundDeviceFirmwareVersion;
        String strReplace;
        HMBaseDevice hMBaseDeviceFindDevice = findDevice();
        return (hMBaseDeviceFindDevice == null || (boundDeviceFirmwareVersion = b().getBoundDeviceFirmwareVersion(hMBaseDeviceFindDevice.getDeviceType())) == null || (strReplace = new Regex("^[vV]").replace(boundDeviceFirmwareVersion, "")) == null) ? "" : strReplace;
    }

    @NotNull
    public final LiveData<ConnectStatus> getDisplayDialLiveData() {
        return this.displayDialLiveData;
    }

    @NotNull
    public final MutableLiveData<FaqVo> getFaqLiveData() {
        return this.faqLiveData;
    }

    @NotNull
    public final HMDeviceSource getHmBaseDeviceSource() {
        return (HMDeviceSource) this.hmBaseDeviceSource.getValue();
    }

    @NotNull
    public final MutableLiveData<InstructionVo> getInstructionLiveData() {
        return this.instructionLiveData;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final MutableLiveData<LibVo> getLibVoLiveData() {
        return this.libVoLiveData;
    }

    @NotNull
    public final MutableLiveData<String> getMacAddressLiveData() {
        return this.macAddressLiveData;
    }

    @NotNull
    public final MutableLiveData<NightModeSettingVo> getNightModeSettingVoLiveData() {
        return this.nightModeSettingVoLiveData;
    }

    @NotNull
    public final MutableLiveData<OfflineVoiceCmdVo> getOfflineVoiceCmd() {
        return this.offlineVoiceCmd;
    }

    @NotNull
    public final MutableLiveData<PlayHelpVo> getPlayHelpLiveData() {
        return this.playHelpLiveData;
    }

    @NotNull
    public final MutableLiveData<DisplayNameVo> getProductNameLiveData() {
        return this.productNameLiveData;
    }

    @NotNull
    public final MutableLiveData<RingTypeVo> getRingTypeVoLiveData() {
        return this.ringTypeVoLiveData;
    }

    @NotNull
    public final MutableLiveData<DeviceConnectedVo> getSyncStatusLiveData() {
        return this.syncStatusLiveData;
    }

    @NotNull
    public final MutableLiveData<VersionItemVo> getUpgradeVoLiveData() {
        return this.upgradeVoLiveData;
    }

    @NotNull
    public final MutableLiveData<VibrateSettingVo> getVibrateSettingVoLiveData() {
        return this.vibrateSettingVoLiveData;
    }

    @NotNull
    public final MutableLiveData<WatchSettingVo> getWatchSettingLiveData() {
        return this.watchSettingLiveData;
    }

    public final boolean isDataCenterSyncing() {
        HMBaseDevice hMBaseDeviceFindDevice = findDevice();
        if (hMBaseDeviceFindDevice == null) {
            return false;
        }
        return SyncCenterManager.INSTANCE.isSyncing(hMBaseDeviceFindDevice);
    }

    @NotNull
    public final MutableLiveData<Boolean> isSupportLiveData() {
        return this.isSupportLiveData;
    }

    @NotNull
    public final LiveData<AlarmItemVo> loadAlarmVo() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new FeatureViewModel$loadAlarmVo$$inlined$safeLaunch$1(null, this), 2, null);
        return this.alarmLiveData;
    }

    @NotNull
    public LiveData<List<WatchAppItemVo>> loadAppItemFeature() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getDefault()), null, new FeatureViewModel$loadAppItemFeature$$inlined$safeLaunch$1(null, this), 2, null);
        return this.appItemFeatureLiveData;
    }

    @NotNull
    public final LiveData<Boolean> loadAppNotifySetting() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new FeatureViewModel$loadAppNotifySetting$$inlined$safeLaunch$1(null, this), 2, null);
        return this.appNotifySettingLiveData;
    }

    public final void loadAssistantSettings() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new FeatureViewModel$loadAssistantSettings$$inlined$safeLaunch$1(null, this), 2, null);
    }

    public final void loadBandSetting() {
        this.bandSettingLiveData.setValue(new BandSettingVo(this.featureTree.isSupport(SoftFeature.DEVICE_SETTING), true));
    }

    public final void loadDeviceFaqSetting() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new FeatureViewModel$loadDeviceFaqSetting$$inlined$safeLaunch$1(null, this), 2, null);
    }

    @NotNull
    public final LiveData<Device> loadDeviceLiveData() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new FeatureViewModel$loadDeviceLiveData$$inlined$safeLaunch$1(null, this), 2, null);
        return this.deviceLiveData;
    }

    @NotNull
    public final LiveData<String> loadDeviceMacAddress() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new FeatureViewModel$loadDeviceMacAddress$$inlined$safeLaunch$1(null, this), 2, null);
        return this.macAddressLiveData;
    }

    @NotNull
    public final LiveData<IncomingCallVo> loadIncomingCallAlert() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new FeatureViewModel$loadIncomingCallAlert$$inlined$safeLaunch$1(null, this), 2, null);
        return this.incomingCallDataLiveData;
    }

    public final void loadInstruction() {
        if (GlobalConfig.get().isBuildMidong()) {
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new FeatureViewModel$loadInstruction$$inlined$safeLaunch$1(null, this), 2, null);
        }
    }

    public final void loadLibSetting() {
        this.libVoLiveData.setValue(new LibVo(HMDeviceConfig.supportLaptopUnLock() || HMDeviceConfig.supportTakePic() || (HMDeviceConfig.hasFeatureOffWistLock() && !HMDeviceConfig.showMiliSettingActivityOffWistLock()), true));
    }

    @NotNull
    public final LiveData<LongSitAlertItemVo> loadLongSitAlertSetting() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new FeatureViewModel$loadLongSitAlertSetting$$inlined$safeLaunch$1(null, this), 2, null);
        return this.longSitAlertSettingLiveData;
    }

    public final void loadNightModeSetting() {
        this.nightModeSettingVoLiveData.setValue(new NightModeSettingVo(this.featureTree.isSupport(SoftFeature.NIGHT_MODE), true));
    }

    public final void loadOfflineVoiceCmd() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new FeatureViewModel$loadOfflineVoiceCmd$$inlined$safeLaunch$1(null, this), 2, null);
    }

    public final void loadPlayHelpSetting() {
        this.playHelpLiveData.setValue(new PlayHelpVo(this.featureTree.isSupport(SoftFeature.PLAY_HELP), true));
    }

    @NotNull
    public final LiveData<DisplayNameVo> loadProductName() {
        loadDeviceLiveData();
        return this.productNameLiveData;
    }

    @NotNull
    public final LiveData<ReminderItemVo> loadReminderLiveData() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new FeatureViewModel$loadReminderLiveData$$inlined$safeLaunch$1(null, this), 2, null);
        return this.reminderLiveData;
    }

    public final void loadRingTypeSetting() {
        this.ringTypeVoLiveData.setValue(new RingTypeVo(this.featureTree.isSupport(SoftFeature.RING_TYPE), true));
    }

    public final void loadUpdateFwUpgradeVo() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new FeatureViewModel$loadUpdateFwUpgradeVo$$inlined$safeLaunch$1(null, this), 2, null);
    }

    public final void loadVibrateModeSetting() {
        this.vibrateSettingVoLiveData.setValue(new VibrateSettingVo(this.featureTree.isSupport(SoftFeature.VIBRATE_MODE), true));
    }

    public final void loadWatchSetting() {
        DeviceInfo deviceInfo;
        Feature deviceFeature;
        boolean zHasFeature = ConfigHelperKt.hasFeature(findDeviceSource(), com.xiaomi.hm.health.device.deviceconfig.Feature.GT3_SOURCE);
        HMBaseDevice hMBaseDeviceFindDevice = findDevice();
        boolean z = hMBaseDeviceFindDevice != null && hMBaseDeviceFindDevice.supportModule(SettingsModule.class);
        boolean zHasFeature2 = ConfigHelperKt.hasFeature(findDeviceSource(), com.xiaomi.hm.health.device.deviceconfig.Feature.SUPPORT_READ_FEATURE_FROM_DEVICE);
        HMBaseDevice hMBaseDeviceFindDevice2 = findDevice();
        this.watchSettingLiveData.setValue(new WatchSettingVo(((hMBaseDeviceFindDevice2 != null && (deviceInfo = hMBaseDeviceFindDevice2.getDeviceInfo()) != null && (deviceFeature = deviceInfo.getDeviceFeature()) != null) ? deviceFeature.hasSw(19) : false) || zHasFeature || zHasFeature2 || z, true));
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        EventBus.getDefault().unregister(this);
    }

    public final void onEventMainThread(@NotNull HMDeviceConnectionEvent event) {
        if (findDeviceSource().getType() == event.getDeviceType()) {
            if (event.isConnecting()) {
                this.syncStatusLiveData.setValue(new DeviceConnectedVo(0, ConnectStatus.CONNECTING, 0, false, null, null, 0, 125, null));
            } else if (event.isConnectingTimeout()) {
                this.syncStatusLiveData.setValue(new DeviceConnectedVo(0, ConnectStatus.FAILURE, 0, false, null, null, 0, 125, null));
            } else if (event.isConnected()) {
                n();
            }
        }
    }

    public final void prepareDeviceStatus() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new FeatureViewModel$prepareDeviceStatus$$inlined$safeLaunch$1(null, this), 2, null);
    }

    public final void retryConnect() {
        onEventMainThread(new HMDeviceConnectionEvent(0, findDeviceSource().getType()));
    }

    @Nullable
    public final Device updateDisplayName() {
        return b().getBindInfo(getHmBaseDeviceSource().getType());
    }

    public final void onEventMainThread(@NotNull HMDeviceBatteryEvent event) {
        if (findDeviceSource().getType() == event.getDeviceType()) {
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new FeatureViewModel$onEventMainThread$$inlined$safeLaunch$1(null, event, this), 2, null);
        }
    }

    public final void onEventMainThread(@NotNull HMDeviceSyncDataEvent event) {
        HMLog.info("HMDeviceSyncDataEvent", new n(event));
        if (DeviceXFunctionsKt.getBuildConfigApi().isSupportNoBlockDpui()) {
            return;
        }
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new FeatureViewModel$onEventMainThread$$inlined$safeLaunch$2(null, event, this), 2, null);
    }

    public final void onEventMainThread(@NotNull EventBluetooth eventBluetooth) {
        DeviceConnectedVo deviceConnectedVo = new DeviceConnectedVo(0, ConnectStatus.BLUETOOTH_DISABLE, 0, false, null, null, 0, 125, null);
        MutableLiveData<DeviceConnectedVo> mutableLiveData = this.syncStatusLiveData;
        if (eventBluetooth.isOn) {
            deviceConnectedVo = DeviceConnectedVo.copy$default(deviceConnectedVo, 0, ConnectStatus.CONNECTING, 0, false, null, null, 0, 125, null);
        }
        mutableLiveData.postValue(deviceConnectedVo);
    }

    public final void onEventMainThread(@NotNull HMDeviceFwUpgradeEvent event) {
        if (findDeviceSource().getType() == event.getDeviceSource().getType()) {
            if ((event.getFirmwareType() == HMFirmwareType.FIRMWARE_GPS_CEP || event.getFirmwareType() == HMFirmwareType.FIRMWARE_GPS_NMEA) && !this.featureTree.isSupport(SoftFeature.DISABLE_AGPS_OR_GDSP_STATUS)) {
                kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new FeatureViewModel$onEventMainThread$$inlined$safeLaunch$3(null, event, this), 2, null);
            }
        }
    }
}
