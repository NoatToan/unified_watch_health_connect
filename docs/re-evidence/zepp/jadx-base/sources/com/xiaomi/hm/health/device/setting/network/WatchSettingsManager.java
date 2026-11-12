package com.xiaomi.hm.health.device.setting.network;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.assistant.ocr.camera.CameraActivity;
import com.huami.bluetooth.profile.channel.module.display_list_setting.DisplayBean;
import com.huami.bluetooth.profile.channel.module.display_list_setting.DisplayListSettingModule;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.v2.DisplayAndBrightnessV2;
import com.huami.bluetooth.profile.channel.module.settings.entity.general.General;
import com.huami.bluetooth.profile.channel.module.settings.entity.offlinevoice.v2.OfflineVoiceV2;
import com.huami.bluetooth.profile.channel.module.settings.entity.soundandvibrate.v2.SoundAndVibrateV2;
import com.huami.bluetooth.profile.channel.module.settings.entity.sport.Sport;
import com.huami.bluetooth.profile.channel.module.settings.entity.wearingway.v2.WearingWayV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumArray;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringEnum;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.koinstartup.KoinComponentAdapter;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.setting.DeviceCenter;
import com.xiaomi.hm.health.device.setting.appsort.repo.iddesc.MockAppSortIdDescImpl;
import com.xiaomi.hm.health.device.setting.network.WatchSettingsManager;
import com.xiaomi.hm.health.device.setting.network.bean.Display;
import com.xiaomi.hm.health.device.setting.network.bean.DndMode;
import com.xiaomi.hm.health.device.setting.network.bean.OfflineVoice;
import com.xiaomi.hm.health.device.setting.network.bean.QuickStart;
import com.xiaomi.hm.health.device.setting.network.bean.SleepMode;
import com.xiaomi.hm.health.device.setting.network.bean.Sort;
import com.xiaomi.hm.health.device.setting.network.bean.Sound;
import com.xiaomi.hm.health.device.setting.network.bean.WatchSettings;
import com.xiaomi.hm.health.device.setting.network.bean.Wearing;
import com.xiaomi.hm.health.device.setting.network.repo.IDefaultRepo;
import com.xiaomi.hm.health.device.setting.network.repo.IRepo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingExtsKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.repo.IWatchSettingRepo;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u0097\u00012\u00020\u00012\u00020\u0002:\u0002\u0097\u0001B\u0019\u0012\u0006\u0010k\u001a\u00020f\u0012\u0006\u0010q\u001a\u00020l¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J(\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bH\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003H\u0002J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0016\u0010\u0012\u001a\u00020\u000b*\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0002J\u0016\u0010\u0014\u001a\u00020\u000b*\u0004\u0018\u00010\u00132\u0006\u0010\u0011\u001a\u00020\rH\u0002J\u0018\u0010\u0017\u001a\u00020\u000b*\u0004\u0018\u00010\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u0016H\u0002J\u0018\u0010\u0019\u001a\u00020\u000b*\u0004\u0018\u00010\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u0016H\u0002J\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002J\u001c\u0010\"\u001a\u0004\u0018\u00010 2\u0006\u0010\n\u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010 H\u0002J\u0010\u0010$\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\rH\u0002J\u001a\u0010)\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010(\u001a\u00020'H\u0002J\"\u0010-\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010,\u001a\u00020'2\u0006\u0010(\u001a\u00020'H\u0002J)\u0010/\u001a\u00020\u000b2\b\u0010.\u001a\u0004\u0018\u00010\r2\u0006\u0010,\u001a\u00020'2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b/\u00100J)\u00102\u001a\u00020\u000b2\b\u00101\u001a\u0004\u0018\u00010\r2\u0006\u0010,\u001a\u00020'2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b2\u00100J)\u00104\u001a\u00020\u000b2\b\u00103\u001a\u0004\u0018\u00010\r2\u0006\u0010,\u001a\u00020'2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b4\u00100J)\u00106\u001a\u00020\u000b2\b\u00105\u001a\u0004\u0018\u00010\r2\u0006\u0010,\u001a\u00020'2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b6\u00100J\"\u00109\u001a\u00020\u000b2\b\u00108\u001a\u0004\u0018\u0001072\u0006\u0010,\u001a\u00020'2\u0006\u0010(\u001a\u00020'H\u0002J\"\u0010<\u001a\u00020\u000b2\b\u0010;\u001a\u0004\u0018\u00010:2\u0006\u0010,\u001a\u00020'2\u0006\u0010(\u001a\u00020'H\u0002J\u001c\u0010=\u001a\u0004\u0018\u00010'2\u0006\u0010\n\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010'H\u0002J\u001c\u0010@\u001a\u0004\u0018\u00010>2\u0006\u0010\n\u001a\u00020\u00032\b\u0010?\u001a\u0004\u0018\u00010>H\u0002J\u001c\u0010C\u001a\u0004\u0018\u00010A2\u0006\u0010\n\u001a\u00020\u00032\b\u0010B\u001a\u0004\u0018\u00010AH\u0002J\u001c\u0010G\u001a\u0004\u0018\u00010D2\b\u0010E\u001a\u0004\u0018\u00010D2\u0006\u0010F\u001a\u00020\u0016H\u0002J\u0010\u0010I\u001a\u00020H2\u0006\u0010\n\u001a\u00020\u0003H\u0002J2\u0010K\u001a\u0004\u0018\u00010\u00032&\u0010J\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bH\u0002J,\u0010L\u001a\u00020\u00032\"\u0010J\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\bH\u0002J\u001a\u0010O\u001a\u00020H2\b\u0010M\u001a\u0004\u0018\u00010A2\u0006\u0010N\u001a\u00020\u0003H\u0002J\u001a\u0010Q\u001a\u00020H2\b\u0010P\u001a\u0004\u0018\u00010>2\u0006\u0010N\u001a\u00020\u0003H\u0002J\u001a\u0010R\u001a\u00020H2\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010N\u001a\u00020\u0003H\u0002J\u0018\u0010S\u001a\u00020H2\u0006\u0010(\u001a\u00020'2\u0006\u0010N\u001a\u00020\u0003H\u0002J\u001a\u0010U\u001a\u00020H2\b\u0010T\u001a\u0004\u0018\u00010 2\u0006\u0010N\u001a\u00020\u0003H\u0002J\u001a\u0010W\u001a\u00020H2\b\u0010V\u001a\u0004\u0018\u00010\u001d2\u0006\u0010N\u001a\u00020\u0003H\u0002J\u001a\u0010Y\u001a\u00020H2\b\u0010X\u001a\u0004\u0018\u00010\u001a2\u0006\u0010N\u001a\u00020\u0003H\u0002J\u0006\u0010Z\u001a\u00020\u000bJ\u0006\u0010[\u001a\u00020\u000bJ)\u0010`\u001a\u00020H2\b\b\u0002\u0010\\\u001a\u00020\u000b2\u0017\u0010_\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020H0]¢\u0006\u0002\b^J\u0010\u0010a\u001a\u00020H2\b\u0010F\u001a\u0004\u0018\u00010\u0016J\u0010\u0010b\u001a\u00020H2\b\u0010F\u001a\u0004\u0018\u00010\u0016J\u0010\u0010c\u001a\u00020H2\b\u0010F\u001a\u0004\u0018\u00010\u0016J.\u0010d\u001a\u00020H2&\u0010J\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bJ\u0006\u0010e\u001a\u00020HR\u0019\u0010k\u001a\u00020f8\u0006@\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u0019\u0010q\u001a\u00020l8\u0006@\u0006¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u0016\u0010u\u001a\u00020r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u001d\u0010}\u001a\u00020x8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R \u0010\u0082\u0001\u001a\u00020~8B@\u0002X\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b\u007f\u0010z\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\"\u0010\u0087\u0001\u001a\u00030\u0083\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0084\u0001\u0010z\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u0089\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010\u0014R!\u0010\u008d\u0001\u001a\u00030\u008a\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b\u001c\u0010z\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0019\u0010\u0090\u0001\u001a\u00020\u000b8B@\u0002X\u0082\u0004¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001a\u0010\u0094\u0001\u001a\u00030\u0091\u00018V@\u0016X\u0096\u0004¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001¨\u0006\u0098\u0001"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/WatchSettingsManager;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/koinstartup/KoinComponentAdapter;", "Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "v", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "R", "watchSettings", "", "X", "", "type", "W", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "value", "a0", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "Z", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringData;", "", "b0", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringEnum;", "c0", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v2/DisplayAndBrightnessV2;", "deviceDisplay", "i", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/v2/SoundAndVibrateV2;", "deviceSound", "m", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/sport/Sport;", "deviceSport", GoogleApiAvailabilityLight.b, "num", com.google.android.exoplayer2.text.ttml.b.r, "Lcom/xiaomi/hm/health/device/setting/network/bean/General;", "accountGeneral", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/general/General;", CameraActivity.CONTENT_TYPE_GENERAL, LogUtil.D, "Lcom/xiaomi/hm/health/device/setting/network/bean/DndMode;", "accountDnd", "deviceGeneral", "F", "sideKey", "L", "(Ljava/lang/Integer;Lcom/huami/bluetooth/profile/channel/module/settings/entity/general/General;Lcom/huami/bluetooth/profile/channel/module/settings/entity/general/General;)Z", "upKey", "P", "downKey", "G", "selectKey", "K", "Lcom/xiaomi/hm/health/device/setting/network/bean/SleepMode;", "accountSleepMode", "l", "Lcom/xiaomi/hm/health/device/setting/network/bean/QuickStart;", "accountQuickStart", "J", com.loc.z.j, "Lcom/huami/bluetooth/profile/channel/module/settings/entity/wearingway/v2/WearingWayV2;", "deviceWearWay", "o", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/offlinevoice/v2/OfflineVoiceV2;", "deviceOfflineVoice", hl.k, "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumArray;", "deviceTypes", "config", ExifInterface.LATITUDE_SOUTH, "", "Y", "settingsMap", ExifInterface.GPS_DIRECTION_TRUE, "C", "offlineVoiceV2", "settings", LogUtil.I, "wearingWay", "Q", "H", "M", "sport", "O", "soundVibrate", "N", ServerProtocol.DIALOG_PARAM_DISPLAY, "E", "restoreAccountSync", "restoreDefaultSync", "refreshNow", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "action", "modify", "onQueryCtrlCenter", "onQueryScreenEdit", "onQueryAppSort", "onQuery", "onExitWatchSetting", "Lcom/xiaomi/hm/health/device/setting/network/repo/IRepo;", "a", "Lcom/xiaomi/hm/health/device/setting/network/repo/IRepo;", "getRepo", "()Lcom/xiaomi/hm/health/device/setting/network/repo/IRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lcom/xiaomi/hm/health/device/setting/network/repo/IDefaultRepo;", "b", "Lcom/xiaomi/hm/health/device/setting/network/repo/IDefaultRepo;", "getDefaultRepo", "()Lcom/xiaomi/hm/health/device/setting/network/repo/IDefaultRepo;", "defaultRepo", "Landroid/os/Handler;", "c", "Landroid/os/Handler;", "handler", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "Lcom/huami/devicex/manager/DeviceManagerApi;", "e", "Lkotlin/Lazy;", "r", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/repo/IWatchSettingRepo;", "f", "u", "()Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/repo/IWatchSettingRepo;", "watchSettingRepo", "Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "g", DTransferConstants.SEARCH_KEY, "()Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "deviceCenter", "h", "refresh", "Lkotlinx/coroutines/Job;", "t", "()Lkotlinx/coroutines/Job;", "job", SOAP.XMLNS, "()Z", "deviceMatch", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Lcom/xiaomi/hm/health/device/setting/network/repo/IRepo;Lcom/xiaomi/hm/health/device/setting/network/repo/IDefaultRepo;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WatchSettingsManager implements CoroutineScope, KoinComponentAdapter {

    @NotNull
    private static final String j = "WatchSettingsManager";
    private static final boolean k = true;
    private static final int l = 1440;
    private static final int m = 60;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IDefaultRepo defaultRepo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Handler handler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private WatchSettings watchSettings;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy watchSettingRepo;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceCenter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean refresh;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SettingsGroupType.values().length];
            iArr[SettingsGroupType.DISPLAY.ordinal()] = 1;
            iArr[SettingsGroupType.SOUND_AND_VIBRATION.ordinal()] = 2;
            iArr[SettingsGroupType.SPORT.ordinal()] = 3;
            iArr[SettingsGroupType.GENERAL.ordinal()] = 4;
            iArr[SettingsGroupType.WEARING.ordinal()] = 5;
            iArr[SettingsGroupType.OFFLINE_VOICE.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return PointCategory.INIT;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a0 extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "restoreDefaultSync e: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "parse buzzerScenes e: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b0 extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "return for " + this.a + " null or empty";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "device not match.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c0 extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ List<DisplayBean> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(String str, List<DisplayBean> list) {
            super(0);
            this.a = str;
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a + " restore, beans: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<CompletableJob> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CompletableJob invoke() {
            return JobKt__JobKt.d(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d0 extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Throwable b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(String str, Throwable th, String str2) {
            super(0);
            this.a = str;
            this.b = th;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "restore " + this.a + " e: " + this.b + ", raw data: " + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "modify, watchSettings null!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e0 extends Lambda implements Function0<String> {
        public static final e0 a = new e0();

        public e0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "restoreSync settingsModule null!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onExitWatchSetting save watchSettings null!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f0 extends Lambda implements Function0<String> {
        public static final f0 a = new f0();

        public f0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "restoreSync query failed!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ HashMap<SettingsGroupType, Settings> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(HashMap<SettingsGroupType, Settings> map) {
            super(0);
            this.a = map;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onQuery, settingsMap: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g0 extends Lambda implements Function0<String> {
        public g0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "save, refresh:" + WatchSettingsManager.this.refresh;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onQuery save watchSettings null!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h0 extends Lambda implements Function0<String> {
        public static final h0 a = new h0();

        public h0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "saved";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onQueryAppSort watchSettings null!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onQueryAppSort";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public static final k a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onQueryCtrlCenter watchSettings null!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onQueryCtrlCenter";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public static final m a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onQueryScreenEdit watchSettings null!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public static final n a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onQueryScreenEdit";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public static final o a = new o();

        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "watchSettings null when clone, create";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001j\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0004*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.network.WatchSettingsManager$querySettingsSync$1", f = "WatchSettingsManager.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
    public static final class p extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super HashMap<SettingsGroupType, Settings>>, Object> {
        public int a;

        public p(Continuation<? super p> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WatchSettingsManager.this.new p(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super HashMap<SettingsGroupType, Settings>> continuation) {
            return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.a = 1;
                obj = WatchSettingsManager.this.u().querySettings(true, new SettingsGroupType[0], this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "recoverSportRecoTypes fail: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<String> {
        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "refresh: " + WatchSettingsManager.this.refresh;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<String> {
        public static final s a = new s();

        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "restoreAccountSync device not match.";
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
            return "restoreAccountSync";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u extends Lambda implements Function0<String> {
        public static final u a = new u();

        public u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "restoreSync watchSettings null!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "restoreAccountSync e: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w extends Lambda implements Function0<String> {
        public static final w a = new w();

        public w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "restoreAccountSync device not match.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x extends Lambda implements Function0<String> {
        public static final x a = new x();

        public x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "restoreDefaultSync";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class y extends Lambda implements Function0<String> {
        public static final y a = new y();

        public y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "restoreDefaultSync watchSettings null!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class z extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.BooleanRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(Ref.BooleanRef booleanRef) {
            super(0);
            this.a = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "restoreDefaultSync ret: " + this.a.element;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WatchSettingsManager(@NotNull IRepo iRepo, @NotNull IDefaultRepo iDefaultRepo) {
        this.repo = iRepo;
        this.defaultRepo = iDefaultRepo;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.setting.network.WatchSettingsManager$special$$inlined$inject$default$1
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
        this.watchSettingRepo = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<IWatchSettingRepo>() { // from class: com.xiaomi.hm.health.device.setting.network.WatchSettingsManager$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.repo.IWatchSettingRepo, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IWatchSettingRepo invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(IWatchSettingRepo.class), objArr2, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.deviceCenter = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<DeviceCenter>() { // from class: com.xiaomi.hm.health.device.setting.network.WatchSettingsManager$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.DeviceCenter, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceCenter invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceCenter.class), objArr4, objArr5);
            }
        });
        HMLog.info(j, a.a);
        HandlerThread handlerThread = new HandlerThread(j);
        handlerThread.start();
        this.handler = new Handler(handlerThread.getLooper());
        this.job = LazyKt__LazyJVMKt.lazy(d.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(WatchSettingsManager watchSettingsManager, String str) {
        watchSettingsManager.v();
        WatchSettings watchSettings = watchSettingsManager.watchSettings;
        if (watchSettings == null) {
            HMLog.error$default(j, null, null, k.a, 6, null);
            return;
        }
        if (str == null || kotlin.text.m.isBlank(str)) {
            return;
        }
        HMLog.info(j, l.a);
        Sort sort = watchSettings.getSort();
        if (Intrinsics.areEqual(sort == null ? null : sort.getCtrlCenter(), str)) {
            return;
        }
        if (watchSettings.getSort() == null) {
            watchSettings.setSort(new Sort(null, null, null, 7, null));
        }
        watchSettingsManager.refresh = true;
        Sort sort2 = watchSettings.getSort();
        if (sort2 != null) {
            sort2.setCtrlCenter(str);
        }
        watchSettingsManager.Y(watchSettings);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(WatchSettingsManager watchSettingsManager, String str) {
        watchSettingsManager.v();
        WatchSettings watchSettings = watchSettingsManager.watchSettings;
        if (watchSettings == null) {
            HMLog.error$default(j, null, null, m.a, 6, null);
            return;
        }
        if (str == null || kotlin.text.m.isBlank(str)) {
            return;
        }
        HMLog.info(j, n.a);
        if (watchSettings.getSort() == null) {
            watchSettings.setSort(new Sort(null, null, null, 7, null));
        }
        Sort sort = watchSettings.getSort();
        if (Intrinsics.areEqual(sort == null ? null : sort.getScreenEdit(), str)) {
            return;
        }
        watchSettingsManager.refresh = true;
        Sort sort2 = watchSettings.getSort();
        if (sort2 != null) {
            sort2.setScreenEdit(str);
        }
        watchSettingsManager.Y(watchSettings);
    }

    private final WatchSettings C(HashMap<SettingsGroupType, Settings> settingsMap) {
        v();
        WatchSettings watchSettings = this.watchSettings;
        WatchSettings watchSettingsClone = watchSettings == null ? null : watchSettings.clone();
        if (watchSettingsClone == null) {
            HMLog.info(j, o.a);
            watchSettingsClone = new WatchSettings(null, null, null, null, null, null, null, null, null, null, 1023, null);
        }
        for (Map.Entry<SettingsGroupType, Settings> entry : settingsMap.entrySet()) {
            switch (WhenMappings.$EnumSwitchMapping$0[entry.getKey().ordinal()]) {
                case 1:
                    Settings value = entry.getValue();
                    E(value instanceof DisplayAndBrightnessV2 ? (DisplayAndBrightnessV2) value : null, watchSettingsClone);
                    break;
                case 2:
                    Settings value2 = entry.getValue();
                    N(value2 instanceof SoundAndVibrateV2 ? (SoundAndVibrateV2) value2 : null, watchSettingsClone);
                    break;
                case 3:
                    Settings value3 = entry.getValue();
                    O(value3 instanceof Sport ? (Sport) value3 : null, watchSettingsClone);
                    break;
                case 4:
                    Settings value4 = entry.getValue();
                    H(value4 instanceof General ? (General) value4 : null, watchSettingsClone);
                    break;
                case 5:
                    Settings value5 = entry.getValue();
                    Q(value5 instanceof WearingWayV2 ? (WearingWayV2) value5 : null, watchSettingsClone);
                    break;
                case 6:
                    Settings value6 = entry.getValue();
                    I(value6 instanceof OfflineVoiceV2 ? (OfflineVoiceV2) value6 : null, watchSettingsClone);
                    break;
            }
        }
        return watchSettingsClone;
    }

    private final boolean D(com.xiaomi.hm.health.device.setting.network.bean.General accountGeneral, General general) {
        boolean z2;
        if (accountGeneral == null) {
            return false;
        }
        String dateDisStyle = accountGeneral.getDateDisStyle();
        if (dateDisStyle == null) {
            z2 = false;
        } else {
            general.setDateDisplayStyle(new StringData(dateDisStyle));
            z2 = true;
        }
        Integer timeFormat = accountGeneral.getTimeFormat();
        if (timeFormat != null && timeFormat.intValue() == 0) {
            general.setTimeFormat(new EnumData(0));
            general.setTimeFormatFollowMobilePhoneSwitch(Boolean.FALSE);
            return true;
        }
        if (timeFormat != null && timeFormat.intValue() == 1) {
            general.setTimeFormat(new EnumData(1));
            general.setTimeFormatFollowMobilePhoneSwitch(Boolean.FALSE);
            return true;
        }
        if (timeFormat == null || timeFormat.intValue() != 2) {
            return z2;
        }
        general.setTimeFormatFollowMobilePhoneSwitch(Boolean.TRUE);
        return true;
    }

    private final void E(DisplayAndBrightnessV2 display, WatchSettings settings) {
        Display display2;
        if (display == null) {
            return;
        }
        Display display3 = new Display(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
        Boolean autoBrightness = display.getAutoBrightness();
        if (autoBrightness == null) {
            display2 = display3;
        } else {
            display2 = display3;
            display2.setAutoBrightness(Boolean.valueOf(autoBrightness.booleanValue()));
        }
        IntData brightness = display.getBrightness();
        if (brightness != null) {
            display2.setBrightness(Integer.valueOf(brightness.getValue()));
        }
        EnumData screenOffTime = display.getScreenOffTime();
        if (screenOffTime != null) {
            display2.setScreenOffTime(Integer.valueOf(screenOffTime.getValue()));
        }
        Boolean screenOffFollowCurrentDialSwitch = display.getScreenOffFollowCurrentDialSwitch();
        if (screenOffFollowCurrentDialSwitch != null) {
            display2.setScreenOffFollowCurrentDialSwitch(Boolean.valueOf(screenOffFollowCurrentDialSwitch.booleanValue()));
        }
        StringEnum screenOffDialId = display.getScreenOffDialId();
        if (screenOffDialId != null) {
            display2.setScreenOffDialId(screenOffDialId.getValue());
        }
        EnumData screenOffDisplayMode = display.getScreenOffDisplayMode();
        if (screenOffDisplayMode != null) {
            display2.setScreenOffDisplayMode(Integer.valueOf(screenOffDisplayMode.getValue()));
        }
        Time screenOffDisplayBeginTime = display.getScreenOffDisplayBeginTime();
        if (screenOffDisplayBeginTime != null) {
            display2.setScreenOffDisplayBeginTime(Integer.valueOf(WatchSettingExtsKt.toMinutes(screenOffDisplayBeginTime)));
        }
        Time screenOffDisplayEndTime = display.getScreenOffDisplayEndTime();
        if (screenOffDisplayEndTime != null) {
            display2.setScreenOffDisplayEndTime(Integer.valueOf(WatchSettingExtsKt.toMinutes(screenOffDisplayEndTime)));
        }
        EnumData screenOnByTurningWristMode = display.getScreenOnByTurningWristMode();
        if (screenOnByTurningWristMode != null) {
            display2.setScreenOnByTurningWristMode(Integer.valueOf(screenOnByTurningWristMode.getValue()));
        }
        EnumData screenOnByTurningWristActiveSpeed = display.getScreenOnByTurningWristActiveSpeed();
        if (screenOnByTurningWristActiveSpeed != null) {
            display2.setScreenOnByTurningWristActiveSpeed(Integer.valueOf(screenOnByTurningWristActiveSpeed.getValue()));
        }
        Time screenOnByTurningWristBeginTime = display.getScreenOnByTurningWristBeginTime();
        if (screenOnByTurningWristBeginTime != null) {
            display2.setScreenOnByTurningWristBeginTime(Integer.valueOf(WatchSettingExtsKt.toMinutes(screenOnByTurningWristBeginTime)));
        }
        Time screenOnByTurningWristEndTime = display.getScreenOnByTurningWristEndTime();
        if (screenOnByTurningWristEndTime != null) {
            display2.setScreenOnByTurningWristEndTime(Integer.valueOf(WatchSettingExtsKt.toMinutes(screenOnByTurningWristEndTime)));
        }
        Boolean screenOnByNewNotificationSwitch = display.getScreenOnByNewNotificationSwitch();
        if (screenOnByNewNotificationSwitch != null) {
            display2.setScreenOnByNewNotificationSwitch(Boolean.valueOf(screenOnByNewNotificationSwitch.booleanValue()));
        }
        StringEnum homeScreenStyle = display.getHomeScreenStyle();
        if (homeScreenStyle != null) {
            display2.setHomeScreenStyle(homeScreenStyle.getValue());
        }
        Boolean screenOnDuringSportSwitch = display.getScreenOnDuringSportSwitch();
        if (screenOnDuringSportSwitch != null) {
            display2.setScreenOnDuringSport(Boolean.valueOf(screenOnDuringSportSwitch.booleanValue()));
        }
        EnumData screenColorStyle = display.getScreenColorStyle();
        if (screenColorStyle != null) {
            display2.setScreenColorStyle(Integer.valueOf(screenColorStyle.getValue()));
        }
        settings.setDisplay(display2);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001f  */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    private final boolean F(DndMode accountDnd, General deviceGeneral, General general) {
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (accountDnd == null) {
            return false;
        }
        Integer dndAutoEnableMode = accountDnd.getDndAutoEnableMode();
        if (dndAutoEnableMode == null) {
            z2 = false;
        } else {
            if (!Z(deviceGeneral.getDndMode(), dndAutoEnableMode.intValue())) {
                dndAutoEnableMode = null;
            }
            if (dndAutoEnableMode == null) {
                z2 = false;
            } else {
                general.setDndMode(new EnumData(dndAutoEnableMode.intValue()));
                z2 = true;
            }
        }
        Integer dndTimingStartTime = accountDnd.getDndTimingStartTime();
        if (dndTimingStartTime != null) {
            int iIntValue = dndTimingStartTime.intValue();
            if (deviceGeneral.getDndStartTime() == null) {
                z3 = false;
            } else {
                if (iIntValue >= 0 && iIntValue <= 1440) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            if (!z3) {
                dndTimingStartTime = null;
            }
            if (dndTimingStartTime != null) {
                int iIntValue2 = dndTimingStartTime.intValue();
                general.setDndStartTime(new Time(iIntValue2 / 60, iIntValue2 % 60));
                z2 = true;
            }
        }
        Integer dndTimingEndTime = accountDnd.getDndTimingEndTime();
        if (dndTimingEndTime != null) {
            int iIntValue3 = dndTimingEndTime.intValue();
            if (deviceGeneral.getDndStopTime() != null) {
                if (iIntValue3 >= 0 && iIntValue3 <= 1440) {
                    z4 = true;
                }
            }
            Integer num = z4 ? dndTimingEndTime : null;
            if (num != null) {
                int iIntValue4 = num.intValue();
                general.setDndStopTime(new Time(iIntValue4 / 60, iIntValue4 % 60));
                return true;
            }
        }
        return z2;
    }

    private final boolean G(Integer downKey, General deviceGeneral, General general) {
        ArrayList<String> enums;
        if (downKey == null) {
            return false;
        }
        String strP = p(downKey.intValue());
        StringEnum clickDownApp = deviceGeneral.getClickDownApp();
        if (!((clickDownApp == null || (enums = clickDownApp.getEnums()) == null || !enums.contains(strP)) ? false : true)) {
            return false;
        }
        general.setClickDownApp(new StringEnum(strP, 0, null, false, 14, null));
        return true;
    }

    private final void H(General general, WatchSettings settings) {
        if (general == null) {
            return;
        }
        DndMode dndMode = new DndMode(null, null, null, 7, null);
        EnumData dndMode2 = general.getDndMode();
        if (dndMode2 != null) {
            dndMode.setDndAutoEnableMode(Integer.valueOf(dndMode2.getValue()));
        }
        Time dndStartTime = general.getDndStartTime();
        if (dndStartTime != null) {
            dndMode.setDndTimingStartTime(Integer.valueOf(WatchSettingExtsKt.toMinutes(dndStartTime)));
        }
        Time dndStopTime = general.getDndStopTime();
        if (dndStopTime != null) {
            dndMode.setDndTimingEndTime(Integer.valueOf(WatchSettingExtsKt.toMinutes(dndStopTime)));
        }
        settings.setDndMode(dndMode);
        QuickStart quickStart = new QuickStart(null, null, null, null, 15, null);
        StringEnum longPressSideApp = general.getLongPressSideApp();
        if (longPressSideApp != null) {
            quickStart.setTargetAppStartByLongPressSideKey(MockAppSortIdDescImpl.INSTANCE.hexStrToInt(longPressSideApp.getValue()));
        }
        StringEnum longPressUpApp = general.getLongPressUpApp();
        if (longPressUpApp != null) {
            quickStart.setTargetAppStartByLongPressUpKey(MockAppSortIdDescImpl.INSTANCE.hexStrToInt(longPressUpApp.getValue()));
        }
        StringEnum clickDownApp = general.getClickDownApp();
        if (clickDownApp != null) {
            quickStart.setTargetAppStartByClickDownKey(MockAppSortIdDescImpl.INSTANCE.hexStrToInt(clickDownApp.getValue()));
        }
        StringEnum clickSelectApp = general.getClickSelectApp();
        if (clickSelectApp != null) {
            quickStart.setTargetAppStartByClickSelectKey(MockAppSortIdDescImpl.INSTANCE.hexStrToInt(clickSelectApp.getValue()));
        }
        settings.setQuickStart(quickStart);
        M(general, settings);
    }

    private final void I(OfflineVoiceV2 offlineVoiceV2, WatchSettings settings) {
        if (offlineVoiceV2 == null) {
            return;
        }
        OfflineVoice offlineVoice = new OfflineVoice(null, null, null, null, 15, null);
        Boolean activeWithIn5SByTurningWristSwitch = offlineVoiceV2.getActiveWithIn5SByTurningWristSwitch();
        if (activeWithIn5SByTurningWristSwitch != null) {
            offlineVoice.setActiveWithInFiveSecondsByTurningWristSwitch(Boolean.valueOf(activeWithIn5SByTurningWristSwitch.booleanValue()));
        }
        Boolean activeWithIn5SWhenScreenOnSwitch = offlineVoiceV2.getActiveWithIn5SWhenScreenOnSwitch();
        if (activeWithIn5SWhenScreenOnSwitch != null) {
            offlineVoice.setActiveWithInFiveSecondsWhenScreenOnSwitch(Boolean.valueOf(activeWithIn5SWhenScreenOnSwitch.booleanValue()));
        }
        Boolean activeDuringScreenOnSwitch = offlineVoiceV2.getActiveDuringScreenOnSwitch();
        if (activeDuringScreenOnSwitch != null) {
            offlineVoice.setActiveDuringScreenOnSwitch(Boolean.valueOf(activeDuringScreenOnSwitch.booleanValue()));
        }
        EnumData language = offlineVoiceV2.getLanguage();
        if (language != null) {
            offlineVoice.setOfflineVoiceLanguage(Integer.valueOf(language.getValue()));
        }
        settings.setOfflineVoice(offlineVoice);
    }

    private final boolean J(QuickStart accountQuickStart, General deviceGeneral, General general) {
        if (accountQuickStart == null) {
            return false;
        }
        boolean zL = L(accountQuickStart.getTargetAppStartByLongPressSideKey(), deviceGeneral, general);
        if (P(accountQuickStart.getTargetAppStartByLongPressUpKey(), deviceGeneral, general)) {
            zL = true;
        }
        if (G(accountQuickStart.getTargetAppStartByClickDownKey(), deviceGeneral, general)) {
            zL = true;
        }
        if (K(accountQuickStart.getTargetAppStartByClickSelectKey(), deviceGeneral, general)) {
            return true;
        }
        return zL;
    }

    private final boolean K(Integer selectKey, General deviceGeneral, General general) {
        ArrayList<String> enums;
        if (selectKey == null) {
            return false;
        }
        String strP = p(selectKey.intValue());
        StringEnum clickSelectApp = deviceGeneral.getClickSelectApp();
        if (!((clickSelectApp == null || (enums = clickSelectApp.getEnums()) == null || !enums.contains(strP)) ? false : true)) {
            return false;
        }
        general.setClickSelectApp(new StringEnum(strP, 0, null, false, 14, null));
        return true;
    }

    private final boolean L(Integer sideKey, General deviceGeneral, General general) {
        ArrayList<String> enums;
        if (sideKey == null) {
            return false;
        }
        String strP = p(sideKey.intValue());
        StringEnum longPressSideApp = deviceGeneral.getLongPressSideApp();
        if (!((longPressSideApp == null || (enums = longPressSideApp.getEnums()) == null || !enums.contains(strP)) ? false : true)) {
            return false;
        }
        general.setLongPressSideApp(new StringEnum(strP, 0, null, false, 14, null));
        return true;
    }

    private final void M(General general, WatchSettings settings) {
        boolean z2;
        SleepMode sleepMode = new SleepMode(null, null, 3, null);
        Boolean sleepModeForDisplaySwitch = general.getSleepModeForDisplaySwitch();
        boolean z3 = false;
        if (sleepModeForDisplaySwitch == null) {
            z2 = true;
        } else {
            sleepMode.setSleepModeDisplay(Boolean.valueOf(sleepModeForDisplaySwitch.booleanValue()));
            z2 = false;
        }
        Boolean sleepModeSmartEnableSwitch = general.getSleepModeSmartEnableSwitch();
        if (sleepModeSmartEnableSwitch == null) {
            z3 = z2;
        } else {
            sleepMode.setSleepModeSmart(Boolean.valueOf(sleepModeSmartEnableSwitch.booleanValue()));
        }
        if (z3) {
            return;
        }
        settings.setSleepMode(sleepMode);
    }

    private final void N(SoundAndVibrateV2 soundVibrate, WatchSettings settings) {
        if (soundVibrate == null) {
            return;
        }
        Sound sound = new Sound(null, null, null, null, null, null, null, null, 255, null);
        Boolean remindSwitch = soundVibrate.getRemindSwitch();
        if (remindSwitch != null) {
            sound.setBellRemindSwitch(Boolean.valueOf(remindSwitch.booleanValue()));
        }
        Boolean coverScreenMutingSwitch = soundVibrate.getCoverScreenMutingSwitch();
        if (coverScreenMutingSwitch != null) {
            sound.setCoverScreenMutingSwitch(Boolean.valueOf(coverScreenMutingSwitch.booleanValue()));
        }
        IntData volume = soundVibrate.getVolume();
        if (volume != null) {
            sound.setVolume(Integer.valueOf(volume.getValue()));
        }
        Boolean vibrationFeedbackSwitch = soundVibrate.getVibrationFeedbackSwitch();
        if (vibrationFeedbackSwitch != null) {
            sound.setVibrationFeedbackSwitch(Boolean.valueOf(vibrationFeedbackSwitch.booleanValue()));
        }
        Boolean crownVibrationSwitch = soundVibrate.getCrownVibrationSwitch();
        if (crownVibrationSwitch != null) {
            sound.setCrownVibrationSwitch(Boolean.valueOf(crownVibrationSwitch.booleanValue()));
        }
        EnumArray buzzerScenes = soundVibrate.getBuzzerScenes();
        if (buzzerScenes != null) {
            sound.setBuzzerScenes(CollectionsKt___CollectionsKt.joinToString$default(buzzerScenes.getValues(), ",", null, null, 0, null, null, 62, null));
        }
        EnumData buzzerVibrateStrength = soundVibrate.getBuzzerVibrateStrength();
        if (buzzerVibrateStrength != null) {
            sound.setBuzzerVibrateStrength(Integer.valueOf(buzzerVibrateStrength.getValue()));
        }
        settings.setSound(sound);
    }

    private final void O(Sport sport, WatchSettings settings) {
        if (sport == null) {
            return;
        }
        com.xiaomi.hm.health.device.setting.network.bean.Sport sport2 = new com.xiaomi.hm.health.device.setting.network.bean.Sport(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        EnumData sportRecognitionSensitivity = sport.getSportRecognitionSensitivity();
        if (sportRecognitionSensitivity != null) {
            sport2.setSportRecognitionSensitivity(Integer.valueOf(sportRecognitionSensitivity.getValue()));
        }
        EnumArray sportRecognitionTypes = sport.getSportRecognitionTypes();
        if (sportRecognitionTypes != null && (!sportRecognitionTypes.getValues().isEmpty())) {
            sport2.setSportRecognitionTypes(CollectionsKt___CollectionsKt.joinToString$default(sportRecognitionTypes.getValues(), ",", null, null, 0, null, null, 62, null));
        }
        Boolean sportRecognizedRemindSwitch = sport.getSportRecognizedRemindSwitch();
        if (sportRecognizedRemindSwitch != null) {
            sport2.setSportRecognizedRemindSwitch(Boolean.valueOf(sportRecognizedRemindSwitch.booleanValue()));
        }
        EnumData poolSwimmingLaneLength = sport.getPoolSwimmingLaneLength();
        if (poolSwimmingLaneLength != null) {
            sport2.setPoolSwimmingLaneLength(Integer.valueOf(poolSwimmingLaneLength.getValue()));
        }
        EnumData rowingMachineWearingWrist = sport.getRowingMachineWearingWrist();
        if (rowingMachineWearingWrist != null) {
            sport2.setRowingMachineWearingWrist(Integer.valueOf(rowingMachineWearingWrist.getValue()));
        }
        EnumData gpsMode = sport.getGpsMode();
        if (gpsMode != null) {
            sport2.setGpsMode(Integer.valueOf(gpsMode.getValue()));
        }
        EnumData gpsSystemChoice = sport.getGpsSystemChoice();
        if (gpsSystemChoice != null) {
            sport2.setGpsSystemChoice(Integer.valueOf(gpsSystemChoice.getValue()));
        }
        EnumData gpsFrequencyBand = sport.getGpsFrequencyBand();
        if (gpsFrequencyBand != null) {
            sport2.setGpsFrequencyBand(Integer.valueOf(gpsFrequencyBand.getValue()));
        }
        EnumData gpsSearchingPreference = sport.getGpsSearchingPreference();
        if (gpsSearchingPreference != null) {
            sport2.setGpsSearchingPreference(Integer.valueOf(gpsSearchingPreference.getValue()));
        }
        EnumData gpsDataInterval = sport.getGpsDataInterval();
        if (gpsDataInterval != null) {
            sport2.setGpsDataInterval(Integer.valueOf(gpsDataInterval.getValue()));
        }
        Boolean aGpsOutOfDateRemindSwitch = sport.getAGpsOutOfDateRemindSwitch();
        if (aGpsOutOfDateRemindSwitch != null) {
            sport2.setAGpsOutOfDateRemindSwitch(Boolean.valueOf(aGpsOutOfDateRemindSwitch.booleanValue()));
        }
        Time aGpsOutOfDateRemindTime = sport.getAGpsOutOfDateRemindTime();
        if (aGpsOutOfDateRemindTime != null) {
            sport2.setAGpsOutOfDateRemindTime(Integer.valueOf(WatchSettingExtsKt.toMinutes(aGpsOutOfDateRemindTime)));
        }
        settings.setSport(sport2);
    }

    private final boolean P(Integer upKey, General deviceGeneral, General general) {
        ArrayList<String> enums;
        if (upKey == null) {
            return false;
        }
        String strP = p(upKey.intValue());
        StringEnum longPressUpApp = deviceGeneral.getLongPressUpApp();
        if (!((longPressUpApp == null || (enums = longPressUpApp.getEnums()) == null || !enums.contains(strP)) ? false : true)) {
            return false;
        }
        general.setLongPressUpApp(new StringEnum(strP, 0, null, false, 14, null));
        return true;
    }

    private final void Q(WearingWayV2 wearingWay, WatchSettings settings) {
        if (wearingWay == null) {
            return;
        }
        Wearing wearing = new Wearing(null, 1, null);
        EnumData wearingDirection = wearingWay.getWearingDirection();
        if (wearingDirection != null) {
            wearing.setWearingDirection(Integer.valueOf(wearingDirection.getValue()));
        }
        settings.setWearing(wearing);
    }

    private final HashMap<SettingsGroupType, Settings> R() {
        return (HashMap) kotlinx.coroutines.d.b(null, new p(null), 1, null);
    }

    private final EnumArray S(EnumArray deviceTypes, String config) {
        Object objM3845constructorimpl;
        ArrayList<Integer> enums = deviceTypes == null ? null : deviceTypes.getEnums();
        if (enums == null || enums.isEmpty()) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) config, new String[]{","}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSplit$default, 10));
            Iterator it2 = listSplit$default.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(Integer.parseInt((String) it2.next())));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (enums.contains(Integer.valueOf(((Number) obj).intValue()))) {
                    arrayList2.add(obj);
                }
            }
            objM3845constructorimpl = Result.m3845constructorimpl(arrayList2);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error$default(j, null, null, new q(thM3848exceptionOrNullimpl), 6, null);
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        List list = (List) objM3845constructorimpl;
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(list);
        Unit unit = Unit.INSTANCE;
        return new EnumArray(arrayList3, null, false, 6, null);
    }

    private final WatchSettings T(HashMap<SettingsGroupType, Settings> settingsMap) {
        if (!s() || settingsMap == null) {
            return null;
        }
        WatchSettings watchSettingsC = C(settingsMap);
        this.refresh = !Intrinsics.areEqual(this.watchSettings, watchSettingsC);
        HMLog.info(j, new r());
        if (this.refresh) {
            this.watchSettings = watchSettingsC;
        }
        return this.watchSettings;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(WatchSettingsManager watchSettingsManager, ConditionVariable conditionVariable, Ref.BooleanRef booleanRef) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            WatchSettings watchSettingsV = watchSettingsManager.v();
            if (watchSettingsV == null) {
                HMLog.error$default(j, null, null, u.a, 6, null);
                conditionVariable.open();
                return;
            }
            booleanRef.element = watchSettingsManager.X(watchSettingsV);
            conditionVariable.open();
            objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.error$default(null, null, null, new v(thM3848exceptionOrNullimpl), 7, null);
                conditionVariable.open();
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(WatchSettingsManager watchSettingsManager, ConditionVariable conditionVariable, Ref.BooleanRef booleanRef) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            WatchSettings watchSettings = watchSettingsManager.getDefaultRepo().getWatchSettings(watchSettingsManager.q().getDeviceSource());
            if (watchSettings == null) {
                HMLog.error$default(j, null, null, y.a, 6, null);
                conditionVariable.open();
                return;
            }
            booleanRef.element = watchSettingsManager.X(watchSettings);
            HMLog.info(j, new z(booleanRef));
            conditionVariable.open();
            objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.error$default(null, null, null, new a0(thM3848exceptionOrNullimpl), 7, null);
                conditionVariable.open();
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0047  */
    /* JADX WARN: Code duplicated, block: B:31:0x0049 A[Catch: all -> 0x00cd, TryCatch #1 {all -> 0x00cd, blocks: (B:28:0x0043, B:34:0x005f, B:35:0x006e, B:37:0x0074, B:31:0x0049), top: B:73:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f A[Catch: all -> 0x00cd, TryCatch #1 {all -> 0x00cd, blocks: (B:28:0x0043, B:34:0x005f, B:35:0x006e, B:37:0x0074, B:31:0x0049), top: B:73:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0074 A[Catch: all -> 0x00cd, TRY_LEAVE, TryCatch #1 {all -> 0x00cd, blocks: (B:28:0x0043, B:34:0x005f, B:35:0x006e, B:37:0x0074, B:31:0x0049), top: B:73:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:63:0x0108  */
    /* JADX WARN: Code duplicated, block: B:66:0x011b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0127  */
    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    private final boolean W(WatchSettings watchSettings, int type) {
        String appSort;
        String str;
        String str2;
        Object objM3845constructorimpl;
        Throwable thM3848exceptionOrNullimpl;
        List<DisplayBean> list;
        DisplayListSettingModule displayListSettingModule;
        List listSplit$default;
        ArrayList arrayList;
        Iterator it2;
        Sort sort;
        boolean z2 = true;
        if (type == 1) {
            Sort sort2 = watchSettings.getSort();
            if (sort2 == null) {
                appSort = null;
            } else {
                appSort = sort2.getAppSort();
            }
        } else if (type == 2) {
            Sort sort3 = watchSettings.getSort();
            if (sort3 == null) {
                appSort = null;
            } else {
                appSort = sort3.getScreenEdit();
            }
        } else if (type == 3 && (sort = watchSettings.getSort()) != null) {
            appSort = sort.getCtrlCenter();
        } else {
            appSort = null;
        }
        try {
            if (type == 1) {
                str = "appSort";
            } else {
                if (type != 2) {
                    if (type != 3) {
                        str2 = null;
                    } else {
                        str = "ctrlCenter";
                    }
                    Result.Companion companion = Result.Companion;
                    if (appSort == null) {
                        listSplit$default = null;
                    } else {
                        listSplit$default = StringsKt__StringsKt.split$default((CharSequence) appSort, new String[]{AESEncryptionHelper.SEPARATOR}, false, 0, 6, (Object) null);
                    }
                    if (listSplit$default == null) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSplit$default, 10));
                        it2 = listSplit$default.iterator();
                        while (it2.hasNext()) {
                            List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) it2.next(), new String[]{","}, false, 0, 6, (Object) null);
                            try {
                                arrayList.add(new DisplayBean(Integer.parseInt((String) listSplit$default2.get(0)), Byte.parseByte((String) listSplit$default2.get(1)), Integer.parseInt((String) listSplit$default2.get(2)), p(Integer.parseInt((String) listSplit$default2.get(3)))));
                            } catch (Throwable th) {
                                th = th;
                                Result.Companion companion2 = Result.Companion;
                                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                                thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                                if (thM3848exceptionOrNullimpl != null) {
                                    HMLog.info(j, new d0(str2, thM3848exceptionOrNullimpl, appSort));
                                }
                                if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                                    objM3845constructorimpl = null;
                                }
                                list = (List) objM3845constructorimpl;
                                if (list != null) {
                                    z2 = false;
                                }
                                if (z2) {
                                    HMLog.info(j, new b0(str2));
                                    return false;
                                }
                                HMLog.info(j, new c0(str2, list));
                                HMBaseDevice miliDevice = r().getMiliDevice();
                                displayListSettingModule = miliDevice != null ? (DisplayListSettingModule) miliDevice.getChannelModule(DisplayListSettingModule.class) : null;
                                if (displayListSettingModule == null) {
                                    return false;
                                }
                                return displayListSettingModule.updateList(type, list);
                            }
                        }
                    }
                    objM3845constructorimpl = Result.m3845constructorimpl(arrayList);
                    thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                    if (thM3848exceptionOrNullimpl != null) {
                        HMLog.info(j, new d0(str2, thM3848exceptionOrNullimpl, appSort));
                    }
                    if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                        objM3845constructorimpl = null;
                    }
                    list = (List) objM3845constructorimpl;
                    if (list != null && !list.isEmpty()) {
                        z2 = false;
                    }
                    if (z2) {
                        HMLog.info(j, new b0(str2));
                        return false;
                    }
                    HMLog.info(j, new c0(str2, list));
                    HMBaseDevice miliDevice2 = r().getMiliDevice();
                    if (miliDevice2 != null) {
                    }
                    if (displayListSettingModule == null) {
                        return false;
                    }
                    return displayListSettingModule.updateList(type, list);
                }
                str = "screenEdit";
            }
            Result.Companion companion3 = Result.Companion;
            if (appSort == null) {
                listSplit$default = null;
            } else {
                listSplit$default = StringsKt__StringsKt.split$default((CharSequence) appSort, new String[]{AESEncryptionHelper.SEPARATOR}, false, 0, 6, (Object) null);
            }
            if (listSplit$default == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSplit$default, 10));
                it2 = listSplit$default.iterator();
                while (it2.hasNext()) {
                    List listSplit$default3 = StringsKt__StringsKt.split$default((CharSequence) it2.next(), new String[]{","}, false, 0, 6, (Object) null);
                    arrayList.add(new DisplayBean(Integer.parseInt((String) listSplit$default3.get(0)), Byte.parseByte((String) listSplit$default3.get(1)), Integer.parseInt((String) listSplit$default3.get(2)), p(Integer.parseInt((String) listSplit$default3.get(3)))));
                }
            }
            objM3845constructorimpl = Result.m3845constructorimpl(arrayList);
        } catch (Throwable th2) {
            th = th2;
        }
        str2 = str;
        thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.info(j, new d0(str2, thM3848exceptionOrNullimpl, appSort));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        list = (List) objM3845constructorimpl;
        if (list != null) {
            z2 = false;
        }
        if (z2) {
            HMLog.info(j, new b0(str2));
            return false;
        }
        HMLog.info(j, new c0(str2, list));
        HMBaseDevice miliDevice3 = r().getMiliDevice();
        if (miliDevice3 != null) {
        }
        if (displayListSettingModule == null) {
            return false;
        }
        return displayListSettingModule.updateList(type, list);
    }

    private final boolean X(WatchSettings watchSettings) {
        HMBaseDevice miliDevice = r().getMiliDevice();
        SettingsModule settingsModule = miliDevice == null ? null : (SettingsModule) miliDevice.getChannelModule(SettingsModule.class);
        if (settingsModule == null) {
            HMLog.error$default(j, null, null, e0.a, 6, null);
            return false;
        }
        HashMap<SettingsGroupType, Settings> mapR = R();
        if (mapR == null || mapR.isEmpty()) {
            HMLog.error$default(j, null, null, f0.a, 6, null);
            return false;
        }
        HashMap<SettingsGroupType, Settings> map = new HashMap<>();
        SettingsGroupType settingsGroupType = SettingsGroupType.DISPLAY;
        Settings settings = mapR.get(settingsGroupType);
        DisplayAndBrightnessV2 displayAndBrightnessV2I = i(watchSettings, settings instanceof DisplayAndBrightnessV2 ? (DisplayAndBrightnessV2) settings : null);
        if (displayAndBrightnessV2I != null) {
            map.put(settingsGroupType, displayAndBrightnessV2I);
        }
        SettingsGroupType settingsGroupType2 = SettingsGroupType.SOUND_AND_VIBRATION;
        Settings settings2 = mapR.get(settingsGroupType2);
        SoundAndVibrateV2 soundAndVibrateV2M = m(watchSettings, settings2 instanceof SoundAndVibrateV2 ? (SoundAndVibrateV2) settings2 : null);
        if (soundAndVibrateV2M != null) {
            map.put(settingsGroupType2, soundAndVibrateV2M);
        }
        SettingsGroupType settingsGroupType3 = SettingsGroupType.SPORT;
        Settings settings3 = mapR.get(settingsGroupType3);
        Sport sportN = n(watchSettings, settings3 instanceof Sport ? (Sport) settings3 : null);
        if (sportN != null) {
            map.put(settingsGroupType3, sportN);
        }
        SettingsGroupType settingsGroupType4 = SettingsGroupType.GENERAL;
        Settings settings4 = mapR.get(settingsGroupType4);
        General generalJ = j(watchSettings, settings4 instanceof General ? (General) settings4 : null);
        if (generalJ != null) {
            map.put(settingsGroupType4, generalJ);
        }
        SettingsGroupType settingsGroupType5 = SettingsGroupType.WEARING;
        Settings settings5 = mapR.get(settingsGroupType5);
        WearingWayV2 wearingWayV2O = o(watchSettings, settings5 instanceof WearingWayV2 ? (WearingWayV2) settings5 : null);
        if (wearingWayV2O != null) {
            map.put(settingsGroupType5, wearingWayV2O);
        }
        SettingsGroupType settingsGroupType6 = SettingsGroupType.OFFLINE_VOICE;
        Settings settings6 = mapR.get(settingsGroupType6);
        OfflineVoiceV2 offlineVoiceV2K = k(watchSettings, settings6 instanceof OfflineVoiceV2 ? (OfflineVoiceV2) settings6 : null);
        if (offlineVoiceV2K != null) {
            map.put(settingsGroupType6, offlineVoiceV2K);
        }
        return settingsModule.writeSettingSync(map);
    }

    private final void Y(WatchSettings watchSettings) {
        if (s()) {
            HMLog.info(j, new g0());
            if (this.refresh) {
                this.repo.saveToLocalAndCloud(watchSettings);
                this.refresh = false;
                HMLog.info(j, h0.a);
            }
        }
    }

    private final boolean Z(EnumData enumData, int i2) {
        ArrayList<Integer> enums = enumData == null ? null : enumData.getEnums();
        if (enums == null || enums.isEmpty()) {
            return false;
        }
        return enums.contains(Integer.valueOf(i2));
    }

    private final boolean a0(IntData intData, int i2) {
        int iIntValue;
        Integer min = intData == null ? null : intData.getMin();
        if (min == null) {
            return false;
        }
        int iIntValue2 = min.intValue();
        Integer max = intData.getMax();
        return max != null && iIntValue2 < (iIntValue = max.intValue()) && iIntValue2 <= i2 && i2 <= iIntValue;
    }

    private final boolean b0(StringData stringData, String str) {
        if (stringData == null) {
            return false;
        }
        if (str == null || kotlin.text.m.isBlank(str)) {
            return false;
        }
        int length = str.length();
        Integer maxLength = stringData.getMaxLength();
        return length <= (maxLength == null ? Integer.MAX_VALUE : maxLength.intValue());
    }

    private final boolean c0(StringEnum stringEnum, String str) {
        if (stringEnum == null) {
            return false;
        }
        boolean z2 = true;
        if (str == null || kotlin.text.m.isBlank(str)) {
            return false;
        }
        ArrayList<String> enums = stringEnum.getEnums();
        if (enums != null && !enums.isEmpty()) {
            z2 = false;
        }
        if (z2) {
            return false;
        }
        return enums.contains(str);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x015e  */
    /* JADX WARN: Code duplicated, block: B:141:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:159:0x021e  */
    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    /* JADX WARN: Code duplicated, block: B:210:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:85:0x0127  */
    private final DisplayAndBrightnessV2 i(WatchSettings watchSettings, DisplayAndBrightnessV2 deviceDisplay) {
        Display display;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (deviceDisplay == null || (display = watchSettings.getDisplay()) == null) {
            return null;
        }
        DisplayAndBrightnessV2 displayAndBrightnessV2 = new DisplayAndBrightnessV2();
        Boolean autoBrightness = display.getAutoBrightness();
        boolean z7 = false;
        if (autoBrightness == null) {
            z2 = true;
        } else {
            autoBrightness.booleanValue();
            if (!(deviceDisplay.getAutoBrightness() != null)) {
                autoBrightness = null;
            }
            if (autoBrightness == null) {
                z2 = true;
            } else {
                displayAndBrightnessV2.setAutoBrightness(Boolean.valueOf(autoBrightness.booleanValue()));
                Unit unit = Unit.INSTANCE;
                z2 = false;
            }
        }
        Integer brightness = display.getBrightness();
        if (brightness != null) {
            if (!a0(deviceDisplay.getBrightness(), brightness.intValue())) {
                brightness = null;
            }
            if (brightness != null) {
                displayAndBrightnessV2.setBrightness(new IntData(brightness.intValue()));
                Unit unit2 = Unit.INSTANCE;
                z2 = false;
            }
        }
        Integer screenOffTime = display.getScreenOffTime();
        if (screenOffTime != null) {
            if (!Z(deviceDisplay.getScreenOffTime(), screenOffTime.intValue())) {
                screenOffTime = null;
            }
            if (screenOffTime != null) {
                displayAndBrightnessV2.setScreenOffTime(new EnumData(screenOffTime.intValue()));
                Unit unit3 = Unit.INSTANCE;
                z2 = false;
            }
        }
        Boolean screenOffFollowCurrentDialSwitch = display.getScreenOffFollowCurrentDialSwitch();
        if (screenOffFollowCurrentDialSwitch != null) {
            screenOffFollowCurrentDialSwitch.booleanValue();
            if (!(deviceDisplay.getScreenOffFollowCurrentDialSwitch() != null)) {
                screenOffFollowCurrentDialSwitch = null;
            }
            if (screenOffFollowCurrentDialSwitch != null) {
                displayAndBrightnessV2.setScreenOffFollowCurrentDialSwitch(Boolean.valueOf(screenOffFollowCurrentDialSwitch.booleanValue()));
                Unit unit4 = Unit.INSTANCE;
                z2 = false;
            }
        }
        String screenOffDialId = display.getScreenOffDialId();
        if (screenOffDialId != null) {
            String str = c0(deviceDisplay.getScreenOffDialId(), screenOffDialId) ? screenOffDialId : null;
            if (str != null) {
                displayAndBrightnessV2.setScreenOffDialId(new StringEnum(str, 0, null, false, 14, null));
                Unit unit5 = Unit.INSTANCE;
                z2 = false;
            }
        }
        Integer screenOffDisplayMode = display.getScreenOffDisplayMode();
        if (screenOffDisplayMode != null) {
            if (!Z(deviceDisplay.getScreenOffDisplayMode(), screenOffDisplayMode.intValue())) {
                screenOffDisplayMode = null;
            }
            if (screenOffDisplayMode != null) {
                displayAndBrightnessV2.setScreenOffDisplayMode(new EnumData(screenOffDisplayMode.intValue()));
                Unit unit6 = Unit.INSTANCE;
                z2 = false;
            }
        }
        Integer screenOffDisplayBeginTime = display.getScreenOffDisplayBeginTime();
        if (screenOffDisplayBeginTime != null) {
            int iIntValue = screenOffDisplayBeginTime.intValue();
            if (deviceDisplay.getScreenOffDisplayBeginTime() == null) {
                z6 = false;
            } else {
                if (iIntValue >= 0 && iIntValue <= 1440) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            }
            if (!z6) {
                screenOffDisplayBeginTime = null;
            }
            if (screenOffDisplayBeginTime != null) {
                int iIntValue2 = screenOffDisplayBeginTime.intValue();
                displayAndBrightnessV2.setScreenOffDisplayBeginTime(new Time(iIntValue2 / 60, iIntValue2 % 60));
                Unit unit7 = Unit.INSTANCE;
                z2 = false;
            }
        }
        Integer screenOffDisplayEndTime = display.getScreenOffDisplayEndTime();
        if (screenOffDisplayEndTime != null) {
            int iIntValue3 = screenOffDisplayEndTime.intValue();
            if (deviceDisplay.getScreenOffDisplayEndTime() == null) {
                z5 = false;
            } else {
                if (iIntValue3 >= 0 && iIntValue3 <= 1440) {
                    z5 = true;
                } else {
                    z5 = false;
                }
            }
            if (!z5) {
                screenOffDisplayEndTime = null;
            }
            if (screenOffDisplayEndTime != null) {
                int iIntValue4 = screenOffDisplayEndTime.intValue();
                displayAndBrightnessV2.setScreenOffDisplayEndTime(new Time(iIntValue4 / 60, iIntValue4 % 60));
                Unit unit8 = Unit.INSTANCE;
                z2 = false;
            }
        }
        Integer screenOnByTurningWristMode = display.getScreenOnByTurningWristMode();
        if (screenOnByTurningWristMode != null) {
            if (!Z(deviceDisplay.getScreenOnByTurningWristMode(), screenOnByTurningWristMode.intValue())) {
                screenOnByTurningWristMode = null;
            }
            if (screenOnByTurningWristMode != null) {
                displayAndBrightnessV2.setScreenOnByTurningWristMode(new EnumData(screenOnByTurningWristMode.intValue()));
                Unit unit9 = Unit.INSTANCE;
                z2 = false;
            }
        }
        Integer screenOnByTurningWristActiveSpeed = display.getScreenOnByTurningWristActiveSpeed();
        if (screenOnByTurningWristActiveSpeed != null) {
            if (!Z(deviceDisplay.getScreenOnByTurningWristActiveSpeed(), screenOnByTurningWristActiveSpeed.intValue())) {
                screenOnByTurningWristActiveSpeed = null;
            }
            if (screenOnByTurningWristActiveSpeed != null) {
                displayAndBrightnessV2.setScreenOnByTurningWristActiveSpeed(new EnumData(screenOnByTurningWristActiveSpeed.intValue()));
                Unit unit10 = Unit.INSTANCE;
                z2 = false;
            }
        }
        Integer screenOnByTurningWristBeginTime = display.getScreenOnByTurningWristBeginTime();
        if (screenOnByTurningWristBeginTime != null) {
            int iIntValue5 = screenOnByTurningWristBeginTime.intValue();
            if (deviceDisplay.getScreenOnByTurningWristBeginTime() == null) {
                z4 = false;
            } else {
                if (iIntValue5 >= 0 && iIntValue5 <= 1440) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            if (!z4) {
                screenOnByTurningWristBeginTime = null;
            }
            if (screenOnByTurningWristBeginTime != null) {
                int iIntValue6 = screenOnByTurningWristBeginTime.intValue();
                displayAndBrightnessV2.setScreenOnByTurningWristBeginTime(new Time(iIntValue6 / 60, iIntValue6 % 60));
                Unit unit11 = Unit.INSTANCE;
                z2 = false;
            }
        }
        Integer screenOnByTurningWristEndTime = display.getScreenOnByTurningWristEndTime();
        if (screenOnByTurningWristEndTime != null) {
            int iIntValue7 = screenOnByTurningWristEndTime.intValue();
            if (deviceDisplay.getScreenOnByTurningWristEndTime() == null) {
                z3 = false;
            } else {
                if (iIntValue7 >= 0 && iIntValue7 <= 1440) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            if (!z3) {
                screenOnByTurningWristEndTime = null;
            }
            if (screenOnByTurningWristEndTime != null) {
                int iIntValue8 = screenOnByTurningWristEndTime.intValue();
                displayAndBrightnessV2.setScreenOnByTurningWristEndTime(new Time(iIntValue8 / 60, iIntValue8 % 60));
                Unit unit12 = Unit.INSTANCE;
                z2 = false;
            }
        }
        Boolean screenOnByNewNotificationSwitch = display.getScreenOnByNewNotificationSwitch();
        if (screenOnByNewNotificationSwitch != null) {
            screenOnByNewNotificationSwitch.booleanValue();
            if (!(deviceDisplay.getScreenOnByNewNotificationSwitch() != null)) {
                screenOnByNewNotificationSwitch = null;
            }
            if (screenOnByNewNotificationSwitch != null) {
                displayAndBrightnessV2.setScreenOnByNewNotificationSwitch(Boolean.valueOf(screenOnByNewNotificationSwitch.booleanValue()));
                Unit unit13 = Unit.INSTANCE;
                z2 = false;
            }
        }
        Boolean screenOnDuringSport = display.getScreenOnDuringSport();
        if (screenOnDuringSport != null) {
            screenOnDuringSport.booleanValue();
            if (!(deviceDisplay.getScreenOnDuringSportSwitch() != null)) {
                screenOnDuringSport = null;
            }
            if (screenOnDuringSport != null) {
                displayAndBrightnessV2.setScreenOnDuringSportSwitch(Boolean.valueOf(screenOnDuringSport.booleanValue()));
                Unit unit14 = Unit.INSTANCE;
                z2 = false;
            }
        }
        Integer screenColorStyle = display.getScreenColorStyle();
        if (screenColorStyle != null) {
            if (!Z(deviceDisplay.getScreenColorStyle(), screenColorStyle.intValue())) {
                screenColorStyle = null;
            }
            if (screenColorStyle != null) {
                displayAndBrightnessV2.setScreenColorStyle(new EnumData(screenColorStyle.intValue()));
                Unit unit15 = Unit.INSTANCE;
                z2 = false;
            }
        }
        String homeScreenStyle = display.getHomeScreenStyle();
        if (homeScreenStyle != null) {
            String str2 = c0(deviceDisplay.getHomeScreenStyle(), homeScreenStyle) ? homeScreenStyle : null;
            if (str2 == null) {
                z7 = z2;
            } else {
                displayAndBrightnessV2.setHomeScreenStyle(new StringEnum(str2, 0, null, false, 14, null));
                Unit unit16 = Unit.INSTANCE;
            }
        } else {
            z7 = z2;
        }
        if (z7) {
            return null;
        }
        return displayAndBrightnessV2;
    }

    private final General j(WatchSettings watchSettings, General deviceGeneral) {
        if (deviceGeneral == null) {
            return null;
        }
        General general = new General();
        boolean z2 = !F(watchSettings.getDndMode(), deviceGeneral, general);
        if (D(watchSettings.getGeneral(), general)) {
            z2 = false;
        }
        if (J(watchSettings.getQuickStart(), deviceGeneral, general)) {
            z2 = false;
        }
        if (l(watchSettings.getSleepMode(), deviceGeneral, general) ? false : z2) {
            return null;
        }
        return general;
    }

    private final OfflineVoiceV2 k(WatchSettings watchSettings, OfflineVoiceV2 deviceOfflineVoice) {
        OfflineVoice offlineVoice;
        if (deviceOfflineVoice == null || (offlineVoice = watchSettings.getOfflineVoice()) == null) {
            return null;
        }
        OfflineVoiceV2 offlineVoiceV2 = new OfflineVoiceV2();
        Boolean activeWithInFiveSecondsByTurningWristSwitch = offlineVoice.getActiveWithInFiveSecondsByTurningWristSwitch();
        if (activeWithInFiveSecondsByTurningWristSwitch != null) {
            offlineVoiceV2.setActiveWithIn5SByTurningWristSwitch(Boolean.valueOf(activeWithInFiveSecondsByTurningWristSwitch.booleanValue()));
        }
        Boolean activeWithInFiveSecondsWhenScreenOnSwitch = offlineVoice.getActiveWithInFiveSecondsWhenScreenOnSwitch();
        if (activeWithInFiveSecondsWhenScreenOnSwitch != null) {
            offlineVoiceV2.setActiveWithIn5SWhenScreenOnSwitch(Boolean.valueOf(activeWithInFiveSecondsWhenScreenOnSwitch.booleanValue()));
        }
        Boolean activeDuringScreenOnSwitch = offlineVoice.getActiveDuringScreenOnSwitch();
        if (activeDuringScreenOnSwitch != null) {
            offlineVoiceV2.setActiveDuringScreenOnSwitch(Boolean.valueOf(activeDuringScreenOnSwitch.booleanValue()));
        }
        Integer offlineVoiceLanguage = offlineVoice.getOfflineVoiceLanguage();
        if (offlineVoiceLanguage != null) {
            Integer num = Z(deviceOfflineVoice.getLanguage(), offlineVoiceLanguage.intValue()) ? offlineVoiceLanguage : null;
            if (num != null) {
                offlineVoiceV2.setLanguage(new EnumData(num.intValue()));
            }
        }
        return offlineVoiceV2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001f  */
    private final boolean l(SleepMode accountSleepMode, General deviceGeneral, General general) {
        boolean z2;
        if (accountSleepMode == null) {
            return false;
        }
        Boolean sleepModeDisplay = accountSleepMode.getSleepModeDisplay();
        if (sleepModeDisplay == null) {
            z2 = false;
        } else {
            sleepModeDisplay.booleanValue();
            if (!(deviceGeneral.getSleepModeForDisplaySwitch() != null)) {
                sleepModeDisplay = null;
            }
            if (sleepModeDisplay == null) {
                z2 = false;
            } else {
                general.setSleepModeForDisplaySwitch(Boolean.valueOf(sleepModeDisplay.booleanValue()));
                z2 = true;
            }
        }
        Boolean sleepModeSmart = accountSleepMode.getSleepModeSmart();
        if (sleepModeSmart != null) {
            sleepModeSmart.booleanValue();
            Boolean bool = deviceGeneral.getSleepModeSmartEnableSwitch() != null ? sleepModeSmart : null;
            if (bool != null) {
                general.setSleepModeSmartEnableSwitch(Boolean.valueOf(bool.booleanValue()));
                return true;
            }
        }
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002b  */
    private final SoundAndVibrateV2 m(WatchSettings watchSettings, SoundAndVibrateV2 deviceSound) {
        Sound sound;
        boolean z2;
        Object objM3845constructorimpl;
        List listEmptyList;
        if (deviceSound == null || (sound = watchSettings.getSound()) == null) {
            return null;
        }
        SoundAndVibrateV2 soundAndVibrateV2 = new SoundAndVibrateV2();
        Boolean bellRemindSwitch = sound.getBellRemindSwitch();
        boolean z3 = true;
        boolean z4 = false;
        if (bellRemindSwitch == null) {
            z2 = true;
        } else {
            bellRemindSwitch.booleanValue();
            if (!(deviceSound.getRemindSwitch() != null)) {
                bellRemindSwitch = null;
            }
            if (bellRemindSwitch == null) {
                z2 = true;
            } else {
                soundAndVibrateV2.setRemindSwitch(Boolean.valueOf(bellRemindSwitch.booleanValue()));
                z2 = false;
            }
        }
        Boolean coverScreenMutingSwitch = sound.getCoverScreenMutingSwitch();
        if (coverScreenMutingSwitch != null) {
            soundAndVibrateV2.setCoverScreenMutingSwitch(Boolean.valueOf(coverScreenMutingSwitch.booleanValue()));
            z2 = false;
        }
        Integer volume = sound.getVolume();
        if (volume != null) {
            if (!a0(deviceSound.getVolume(), volume.intValue())) {
                volume = null;
            }
            if (volume != null) {
                soundAndVibrateV2.setVolume(new IntData(volume.intValue()));
                z2 = false;
            }
        }
        Boolean vibrationFeedbackSwitch = sound.getVibrationFeedbackSwitch();
        if (vibrationFeedbackSwitch != null) {
            vibrationFeedbackSwitch.booleanValue();
            if (!(deviceSound.getVibrationFeedbackSwitch() != null)) {
                vibrationFeedbackSwitch = null;
            }
            if (vibrationFeedbackSwitch != null) {
                soundAndVibrateV2.setVibrationFeedbackSwitch(Boolean.valueOf(vibrationFeedbackSwitch.booleanValue()));
                z2 = false;
            }
        }
        Boolean crownVibrationSwitch = sound.getCrownVibrationSwitch();
        if (crownVibrationSwitch != null) {
            crownVibrationSwitch.booleanValue();
            if (!(deviceSound.getCrownVibrationSwitch() != null)) {
                crownVibrationSwitch = null;
            }
            if (crownVibrationSwitch != null) {
                soundAndVibrateV2.setCrownVibrationSwitch(Boolean.valueOf(crownVibrationSwitch.booleanValue()));
                z2 = false;
            }
        }
        String buzzerScenes = sound.getBuzzerScenes();
        if (buzzerScenes != null) {
            try {
                Result.Companion companion = Result.Companion;
                if (buzzerScenes.length() != 0) {
                    z3 = false;
                }
                if (z3) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                } else {
                    List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) buzzerScenes, new String[]{","}, false, 0, 6, (Object) null);
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSplit$default, 10));
                    Iterator it2 = listSplit$default.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt((String) it2.next())));
                    }
                    listEmptyList = arrayList;
                }
                objM3845constructorimpl = Result.m3845constructorimpl(listEmptyList);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.error$default(j, null, null, new b(thM3848exceptionOrNullimpl), 6, null);
            }
            if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                objM3845constructorimpl = null;
            }
            List list = (List) objM3845constructorimpl;
            if (list == null) {
                z4 = z2;
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(list);
                Unit unit = Unit.INSTANCE;
                soundAndVibrateV2.setBuzzerScenes(new EnumArray(arrayList2, null, false, 6, null));
            }
            z2 = z4;
        }
        Integer buzzerVibrateStrength = sound.getBuzzerVibrateStrength();
        if (buzzerVibrateStrength != null) {
            soundAndVibrateV2.setBuzzerVibrateStrength(new EnumData(buzzerVibrateStrength.intValue()));
        }
        if (z2) {
            return null;
        }
        return soundAndVibrateV2;
    }

    public static /* synthetic */ void modify$default(WatchSettingsManager watchSettingsManager, boolean z2, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        watchSettingsManager.modify(z2, function1);
    }

    /* JADX WARN: Code duplicated, block: B:133:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:138:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    private final Sport n(WatchSettings watchSettings, Sport deviceSport) {
        com.xiaomi.hm.health.device.setting.network.bean.Sport sport;
        boolean z2;
        boolean z3;
        EnumArray enumArrayS;
        if (deviceSport == null || (sport = watchSettings.getSport()) == null) {
            return null;
        }
        Sport sport2 = new Sport();
        Integer sportRecognitionSensitivity = sport.getSportRecognitionSensitivity();
        boolean z4 = false;
        if (sportRecognitionSensitivity == null) {
            z2 = true;
        } else {
            if (!Z(deviceSport.getSportRecognitionSensitivity(), sportRecognitionSensitivity.intValue())) {
                sportRecognitionSensitivity = null;
            }
            if (sportRecognitionSensitivity == null) {
                z2 = true;
            } else {
                sport2.setSportRecognitionSensitivity(new EnumData(sportRecognitionSensitivity.intValue()));
                z2 = false;
            }
        }
        String sportRecognitionTypes = sport.getSportRecognitionTypes();
        if (sportRecognitionTypes != null && (enumArrayS = S(deviceSport.getSportRecognitionTypes(), sportRecognitionTypes)) != null) {
            sport2.setSportRecognitionTypes(enumArrayS);
            z2 = false;
        }
        Boolean sportRecognizedRemindSwitch = sport.getSportRecognizedRemindSwitch();
        if (sportRecognizedRemindSwitch != null) {
            sportRecognizedRemindSwitch.booleanValue();
            if (!(deviceSport.getSportRecognizedRemindSwitch() != null)) {
                sportRecognizedRemindSwitch = null;
            }
            if (sportRecognizedRemindSwitch != null) {
                sport2.setSportRecognizedRemindSwitch(Boolean.valueOf(sportRecognizedRemindSwitch.booleanValue()));
                z2 = false;
            }
        }
        Integer poolSwimmingLaneLength = sport.getPoolSwimmingLaneLength();
        if (poolSwimmingLaneLength != null) {
            if (!Z(deviceSport.getPoolSwimmingLaneLength(), poolSwimmingLaneLength.intValue())) {
                poolSwimmingLaneLength = null;
            }
            if (poolSwimmingLaneLength != null) {
                sport2.setPoolSwimmingLaneLength(new EnumData(poolSwimmingLaneLength.intValue()));
                z2 = false;
            }
        }
        Integer rowingMachineWearingWrist = sport.getRowingMachineWearingWrist();
        if (rowingMachineWearingWrist != null) {
            if (!Z(deviceSport.getRowingMachineWearingWrist(), rowingMachineWearingWrist.intValue())) {
                rowingMachineWearingWrist = null;
            }
            if (rowingMachineWearingWrist != null) {
                sport2.setRowingMachineWearingWrist(new EnumData(rowingMachineWearingWrist.intValue()));
                z2 = false;
            }
        }
        Integer gpsMode = sport.getGpsMode();
        if (gpsMode != null) {
            if (!Z(deviceSport.getGpsMode(), gpsMode.intValue())) {
                gpsMode = null;
            }
            if (gpsMode != null) {
                sport2.setGpsMode(new EnumData(gpsMode.intValue()));
                z2 = false;
            }
        }
        Integer gpsSystemChoice = sport.getGpsSystemChoice();
        if (gpsSystemChoice != null) {
            if (!Z(deviceSport.getGpsSystemChoice(), gpsSystemChoice.intValue())) {
                gpsSystemChoice = null;
            }
            if (gpsSystemChoice != null) {
                sport2.setGpsSystemChoice(new EnumData(gpsSystemChoice.intValue()));
                z2 = false;
            }
        }
        Integer gpsFrequencyBand = sport.getGpsFrequencyBand();
        if (gpsFrequencyBand != null) {
            if (!Z(deviceSport.getGpsFrequencyBand(), gpsFrequencyBand.intValue())) {
                gpsFrequencyBand = null;
            }
            if (gpsFrequencyBand != null) {
                sport2.setGpsFrequencyBand(new EnumData(gpsFrequencyBand.intValue()));
                z2 = false;
            }
        }
        Integer gpsSearchingPreference = sport.getGpsSearchingPreference();
        if (gpsSearchingPreference != null) {
            if (!Z(deviceSport.getGpsSearchingPreference(), gpsSearchingPreference.intValue())) {
                gpsSearchingPreference = null;
            }
            if (gpsSearchingPreference != null) {
                sport2.setGpsSearchingPreference(new EnumData(gpsSearchingPreference.intValue()));
                z2 = false;
            }
        }
        Integer gpsDataInterval = sport.getGpsDataInterval();
        if (gpsDataInterval != null) {
            if (!Z(deviceSport.getGpsDataInterval(), gpsDataInterval.intValue())) {
                gpsDataInterval = null;
            }
            if (gpsDataInterval != null) {
                sport2.setGpsDataInterval(new EnumData(gpsDataInterval.intValue()));
                z2 = false;
            }
        }
        Boolean aGpsOutOfDateRemindSwitch = sport.getAGpsOutOfDateRemindSwitch();
        if (aGpsOutOfDateRemindSwitch != null) {
            aGpsOutOfDateRemindSwitch.booleanValue();
            if (!(deviceSport.getAGpsOutOfDateRemindSwitch() != null)) {
                aGpsOutOfDateRemindSwitch = null;
            }
            if (aGpsOutOfDateRemindSwitch != null) {
                sport2.setAGpsOutOfDateRemindSwitch(Boolean.valueOf(aGpsOutOfDateRemindSwitch.booleanValue()));
                z2 = false;
            }
        }
        Integer aGpsOutOfDateRemindTime = sport.getAGpsOutOfDateRemindTime();
        if (aGpsOutOfDateRemindTime == null) {
            z4 = z2;
        } else {
            int iIntValue = aGpsOutOfDateRemindTime.intValue();
            if (deviceSport.getAGpsOutOfDateRemindTime() != null) {
                z3 = iIntValue >= 0 && iIntValue <= 1440;
            }
            if (!z3) {
                aGpsOutOfDateRemindTime = null;
            }
            if (aGpsOutOfDateRemindTime == null) {
                z4 = z2;
            } else {
                int iIntValue2 = aGpsOutOfDateRemindTime.intValue();
                sport2.setAGpsOutOfDateRemindTime(new Time(iIntValue2 / 60, iIntValue2 % 60));
            }
        }
        if (z4) {
            return null;
        }
        return sport2;
    }

    private final WearingWayV2 o(WatchSettings watchSettings, WearingWayV2 deviceWearWay) {
        Wearing wearing;
        if (deviceWearWay == null || (wearing = watchSettings.getWearing()) == null) {
            return null;
        }
        boolean z2 = true;
        WearingWayV2 wearingWayV2 = new WearingWayV2();
        Integer wearingDirection = wearing.getWearingDirection();
        if (wearingDirection != null) {
            if (!Z(deviceWearWay.getWearingDirection(), wearingDirection.intValue())) {
                wearingDirection = null;
            }
            if (wearingDirection != null) {
                wearingWayV2.setWearingDirection(new EnumData(wearingDirection.intValue()));
                z2 = false;
            }
        }
        if (z2) {
            return null;
        }
        return wearingWayV2;
    }

    private final String p(int num) {
        String hexString = Integer.toHexString(num);
        String str = "";
        for (int i2 = 0; i2 < 8 - hexString.length(); i2++) {
            str = ((Object) str) + "0";
        }
        String str2 = ((Object) str) + hexString;
        Locale locale = Locale.getDefault();
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        return str2.toUpperCase(locale);
    }

    private final DeviceCenter q() {
        return (DeviceCenter) this.deviceCenter.getValue();
    }

    private final DeviceManagerApi r() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final boolean s() {
        SettingsModule settingsModule;
        HMBaseDevice miliDevice = r().getMiliDevice();
        Integer version = null;
        if (miliDevice != null && (settingsModule = (SettingsModule) miliDevice.getChannelModule(SettingsModule.class)) != null) {
            version = settingsModule.getVersion();
        }
        boolean z2 = false;
        if (version == null) {
            return false;
        }
        boolean z3 = version.intValue() >= 2;
        if (ConfigHelperKt.hasMiliFeature(Feature.SUPPORT_SETTINGS_UPLOAD) && z3) {
            z2 = true;
        }
        if (!z2) {
            HMLog.info(j, c.a);
        }
        return z2;
    }

    private final Job t() {
        return (Job) this.job.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IWatchSettingRepo u() {
        return (IWatchSettingRepo) this.watchSettingRepo.getValue();
    }

    private final WatchSettings v() {
        WatchSettings watchSettings = this.watchSettings;
        if (watchSettings != null) {
            return watchSettings;
        }
        WatchSettings watchSettings2 = this.repo.getWatchSettings();
        this.watchSettings = watchSettings2;
        return watchSettings2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(Function1 function1, WatchSettings watchSettings, WatchSettingsManager watchSettingsManager, boolean z2) {
        function1.invoke(watchSettings);
        watchSettingsManager.refresh = true;
        if (z2) {
            watchSettingsManager.Y(watchSettings);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(WatchSettingsManager watchSettingsManager) {
        WatchSettings watchSettings = watchSettingsManager.watchSettings;
        if (watchSettings != null) {
            watchSettingsManager.Y(watchSettings);
        } else {
            HMLog.error$default(j, null, null, f.a, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(WatchSettingsManager watchSettingsManager, HashMap map) {
        HMLog.info(j, new g(map));
        WatchSettings watchSettingsT = watchSettingsManager.T(map);
        if (watchSettingsT != null) {
            watchSettingsManager.Y(watchSettingsT);
        } else {
            HMLog.error$default(j, null, null, h.a, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(WatchSettingsManager watchSettingsManager, String str) {
        watchSettingsManager.v();
        WatchSettings watchSettings = watchSettingsManager.watchSettings;
        if (watchSettings == null) {
            HMLog.error$default(j, null, null, i.a, 6, null);
            return;
        }
        if (str == null || kotlin.text.m.isBlank(str)) {
            return;
        }
        HMLog.info(j, j.a);
        if (watchSettings.getSort() == null) {
            watchSettings.setSort(new Sort(null, null, null, 7, null));
        }
        Sort sort = watchSettings.getSort();
        if (Intrinsics.areEqual(sort == null ? null : sort.getAppSort(), str)) {
            return;
        }
        watchSettingsManager.refresh = true;
        Sort sort2 = watchSettings.getSort();
        if (sort2 != null) {
            sort2.setAppSort(str);
        }
        watchSettingsManager.Y(watchSettings);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return t().plus(Dispatchers.getIO());
    }

    @NotNull
    public final IDefaultRepo getDefaultRepo() {
        return this.defaultRepo;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponentAdapter.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final IRepo getRepo() {
        return this.repo;
    }

    public final void modify(final boolean refreshNow, @NotNull final Function1<? super WatchSettings, Unit> action) {
        final WatchSettings watchSettings = this.watchSettings;
        if (watchSettings == null) {
            HMLog.error$default(j, null, null, e.a, 6, null);
        } else if (s()) {
            this.handler.post(new Runnable() { // from class: lh8
                @Override // java.lang.Runnable
                public final void run() {
                    WatchSettingsManager.w(action, watchSettings, this, refreshNow);
                }
            });
        }
    }

    public final void onExitWatchSetting() {
        if (s()) {
            this.handler.post(new Runnable() { // from class: eh8
                @Override // java.lang.Runnable
                public final void run() {
                    WatchSettingsManager.x(this.a);
                }
            });
        }
    }

    public final void onQuery(@Nullable final HashMap<SettingsGroupType, Settings> settingsMap) {
        if (s()) {
            this.handler.post(new Runnable() { // from class: kh8
                @Override // java.lang.Runnable
                public final void run() {
                    WatchSettingsManager.y(this.a, settingsMap);
                }
            });
        }
    }

    public final void onQueryAppSort(@Nullable final String config) {
        if (s()) {
            this.handler.post(new Runnable() { // from class: ih8
                @Override // java.lang.Runnable
                public final void run() {
                    WatchSettingsManager.z(this.a, config);
                }
            });
        }
    }

    public final void onQueryCtrlCenter(@Nullable final String config) {
        if (s()) {
            this.handler.post(new Runnable() { // from class: jh8
                @Override // java.lang.Runnable
                public final void run() {
                    WatchSettingsManager.A(this.a, config);
                }
            });
        }
    }

    public final void onQueryScreenEdit(@Nullable final String config) {
        if (s()) {
            this.handler.post(new Runnable() { // from class: hh8
                @Override // java.lang.Runnable
                public final void run() {
                    WatchSettingsManager.B(this.a, config);
                }
            });
        }
    }

    public final boolean restoreAccountSync() {
        if (!s()) {
            HMLog.info(j, s.a);
            return false;
        }
        HMLog.info(j, t.a);
        final ConditionVariable conditionVariable = new ConditionVariable();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        this.handler.post(new Runnable() { // from class: fh8
            @Override // java.lang.Runnable
            public final void run() {
                WatchSettingsManager.U(this.a, conditionVariable, booleanRef);
            }
        });
        conditionVariable.block();
        return booleanRef.element;
    }

    public final boolean restoreDefaultSync() {
        if (!s()) {
            HMLog.info(j, w.a);
            return false;
        }
        HMLog.info(j, x.a);
        final ConditionVariable conditionVariable = new ConditionVariable();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        this.handler.post(new Runnable() { // from class: gh8
            @Override // java.lang.Runnable
            public final void run() {
                WatchSettingsManager.V(this.a, conditionVariable, booleanRef);
            }
        });
        conditionVariable.block();
        return booleanRef.element;
    }
}
