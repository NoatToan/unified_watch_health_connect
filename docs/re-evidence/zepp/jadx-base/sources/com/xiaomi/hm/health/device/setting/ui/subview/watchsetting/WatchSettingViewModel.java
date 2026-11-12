package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.module.settings.ChangeListener;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.DisplayAndBrightness;
import com.huami.bluetooth.profile.channel.module.settings.entity.general.General;
import com.huami.bluetooth.profile.channel.module.settings.entity.language.SettingsLanguage;
import com.huami.bluetooth.profile.channel.module.settings.entity.offlinevoice.OfflineVoice;
import com.huami.bluetooth.profile.channel.module.settings.entity.screenlock.ScreenLockAndPassword;
import com.huami.bluetooth.profile.channel.module.settings.entity.soundandvibrate.SoundAndVibrate;
import com.huami.bluetooth.profile.channel.module.settings.entity.wearingway.WearingWay;
import com.huami.bluetooth.profile.channel.module.settings.entity.wearingway.v2.WearingWayV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.huami.device.feature.gesture.impl.GestureProtocolApiImpl;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.network.hmnetwork.properties.Property;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.setting.network.WatchSettingsManager;
import com.xiaomi.hm.health.device.setting.network.bean.WatchSettings;
import com.xiaomi.hm.health.device.setting.network.bean.Wearing;
import com.xiaomi.hm.health.device.setting.ui.subview.WatchSettingsChangeListener;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingVo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.repo.IWatchSettingRepo;
import com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeaturesViewModel;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import com.xiaomi.hm.health.model.account.HMNightModeConfig;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
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
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b&\u0018\u0000 ¸\u00012\u00020\u00012\u00020\u0002:\u0002¸\u0001B\t¢\u0006\u0006\b¶\u0001\u0010·\u0001JE\u0010\u000b\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032&\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0002J\b\u0010\u000f\u001a\u00020\nH\u0002J\b\u0010\u0010\u001a\u00020\nH\u0002J\u0016\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\nJ%\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016J\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bJ\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dJ\b\u0010 \u001a\u0004\u0018\u00010\u001fJ\b\u0010\"\u001a\u0004\u0018\u00010!J\b\u0010$\u001a\u0004\u0018\u00010#J\u0010\u0010&\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010(\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010*\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010!J\u000e\u0010,\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u0016J\u000e\u0010-\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u0016J\u0006\u0010/\u001a\u00020.J\b\u00100\u001a\u00020\nH\u0014J\u000e\u00103\u001a\u00020\n2\u0006\u00102\u001a\u000201J\"\u00105\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u00104\u0018\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b¢\u0006\u0004\b5\u00106J\u0006\u00107\u001a\u00020\u0016RB\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001d\u0010B\u001a\u00020>8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b?\u0010AR\u001d\u0010G\u001a\u00020C8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010@\u001a\u0004\bE\u0010FR\u0018\u0010I\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010HR\u0018\u0010K\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010JR\u001e\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010M0L8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010NR\u0018\u0010Q\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010PR\u0018\u0010S\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010RR\u0018\u0010V\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010Z\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u001c\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00160L8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010NR\u001c\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00160L8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010NR\u001c\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00160L8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010NR\u001c\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00160L8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010NR\u001c\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00160L8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010NR\u001c\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00160L8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010NR\u001c\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00160L8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010NR\u001c\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00160L8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010NR\u001c\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00160L8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010NR\u001c\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00160L8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010NR\u001c\u0010q\u001a\b\u0012\u0004\u0012\u00020o0L8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010NR\u001c\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00160L8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010NR\u001c\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00160L8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010NR\u001c\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00160L8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010NR\u001c\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00160L8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010NR\u001c\u0010{\u001a\b\u0012\u0004\u0012\u00020\u00160L8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010NR(\u0010\u0080\u0001\u001a\u0010\u0012\f\u0012\n |*\u0004\u0018\u00010\u00160\u00160L8\u0006@\u0006¢\u0006\f\n\u0004\b}\u0010N\u001a\u0004\b~\u0010\u007fR#\u0010\u0084\u0001\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010L8\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010N\u001a\u0005\b\u0083\u0001\u0010\u007fR\u001c\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0085\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001b\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0089\u00018B@\u0002X\u0082\u0004¢\u0006\u0007\u001a\u0005\b8\u0010\u008a\u0001R0\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008c\u00012\n\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008c\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001f\u0010\u0096\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010M0\u0093\u00018F@\u0006¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001d\u0010\u0098\u0001\u001a\t\u0012\u0004\u0012\u00020\u00160\u0093\u00018F@\u0006¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0095\u0001R\u001d\u0010\u009a\u0001\u001a\t\u0012\u0004\u0012\u00020\u00160\u0093\u00018F@\u0006¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u0095\u0001R\u001d\u0010\u009c\u0001\u001a\t\u0012\u0004\u0012\u00020\u00160\u0093\u00018F@\u0006¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u0095\u0001R\u001d\u0010\u009e\u0001\u001a\t\u0012\u0004\u0012\u00020\u00160\u0093\u00018F@\u0006¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u0095\u0001R\u001d\u0010 \u0001\u001a\t\u0012\u0004\u0012\u00020\u00160\u0093\u00018F@\u0006¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010\u0095\u0001R\u001d\u0010¢\u0001\u001a\t\u0012\u0004\u0012\u00020\u00160\u0093\u00018F@\u0006¢\u0006\b\u001a\u0006\b¡\u0001\u0010\u0095\u0001R\u001d\u0010¤\u0001\u001a\t\u0012\u0004\u0012\u00020\u00160\u0093\u00018F@\u0006¢\u0006\b\u001a\u0006\b£\u0001\u0010\u0095\u0001R\u001d\u0010¦\u0001\u001a\t\u0012\u0004\u0012\u00020\u00160\u0093\u00018F@\u0006¢\u0006\b\u001a\u0006\b¥\u0001\u0010\u0095\u0001R\u001d\u0010¨\u0001\u001a\t\u0012\u0004\u0012\u00020\u00160\u0093\u00018F@\u0006¢\u0006\b\u001a\u0006\b§\u0001\u0010\u0095\u0001R\u001d\u0010ª\u0001\u001a\t\u0012\u0004\u0012\u00020o0\u0093\u00018F@\u0006¢\u0006\b\u001a\u0006\b©\u0001\u0010\u0095\u0001R\u001d\u0010¬\u0001\u001a\t\u0012\u0004\u0012\u00020\u00160\u0093\u00018F@\u0006¢\u0006\b\u001a\u0006\b«\u0001\u0010\u0095\u0001R\u001d\u0010®\u0001\u001a\t\u0012\u0004\u0012\u00020\u00160\u0093\u00018F@\u0006¢\u0006\b\u001a\u0006\b\u00ad\u0001\u0010\u0095\u0001R\u001d\u0010°\u0001\u001a\t\u0012\u0004\u0012\u00020\u00160\u0093\u00018F@\u0006¢\u0006\b\u001a\u0006\b¯\u0001\u0010\u0095\u0001R\u001d\u0010²\u0001\u001a\t\u0012\u0004\u0012\u00020\u00160\u0093\u00018F@\u0006¢\u0006\b\u001a\u0006\b±\u0001\u0010\u0095\u0001R\u001d\u0010´\u0001\u001a\t\u0012\u0004\u0012\u00020\u00160\u0093\u00018F@\u0006¢\u0006\b\u001a\u0006\b³\u0001\u0010\u0095\u0001R\u001d\u0010µ\u0001\u001a\t\u0012\u0004\u0012\u00020\u00160\u0093\u00018F@\u0006¢\u0006\b\u001a\u0006\bµ\u0001\u0010\u0095\u0001¨\u0006¹\u0001"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/WatchSettingViewModel;", "Lcom/xiaomi/hm/health/device/setting/viewmodel/DeviceFeaturesViewModel;", "Lorg/koin/core/component/KoinComponent;", "", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "groupTypes", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "watchSettings", "", "e", "([Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;Ljava/util/HashMap;)V", "g", "h", "f", "i", "groupType", "Lcom/huami/bluetooth/profile/channel/module/settings/ChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "loadSort", "", "needDesc", "querySettings", "(Z[Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;)V", "queryScreenUnlockAndPassword", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/wearingway/WearingWay;", "getWearingWay", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/offlinevoice/OfflineVoice;", "getOfflineVoice", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/language/SettingsLanguage;", "getDeviceLanguage", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/SoundAndVibrate;", "getSoundAndVibrate", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/general/General;", "getGeneral", "wearingWay", "setWearingWay", "offlineVoice", "setOfflineVoice", "soundAndVibrate", "setSoundAndVibrate", "isVisible", "setSoundVibrationVisible", "setOfflineVoiceWakeUpVisible", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "getDeviceType", "onCleared", "", "direction", "setWearingDirection", ExifInterface.GPS_DIRECTION_TRUE, "getSettings", "(Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;)Ljava/lang/Object;", "needLoad", "b", "Ljava/util/HashMap;", "getWatchSettings", "()Ljava/util/HashMap;", "setWatchSettings", "(Ljava/util/HashMap;)V", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/repo/IWatchSettingRepo;", "c", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/repo/IWatchSettingRepo;", "watchSettingRepo", "Lcom/huami/devicex/manager/DeviceManagerApi;", GoogleApiAvailabilityLight.a, "a", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/wearingway/WearingWay;", "_wearingWay", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/offlinevoice/OfflineVoice;", "_offlineVoice", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/screenlock/ScreenLockAndPassword;", "Landroidx/lifecycle/MutableLiveData;", "_screenLockAndPassword", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/SoundAndVibrate;", "_soundAndVibrate", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/language/SettingsLanguage;", "_settingsLanguage", z.j, "Lcom/huami/bluetooth/profile/channel/module/settings/entity/general/General;", "_general", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", hl.k, "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "settingsModule", "l", "_soundVibrationVisible", "m", "_offlineVoiceWakeUpVisible", GoogleApiAvailabilityLight.b, "_wearModeVisible", "o", "_deviceLanguageVisible", com.google.android.exoplayer2.text.ttml.b.r, "_deviceGestureVisible", DTransferConstants.SEARCH_KEY, "_deviceMorningGreetingVisible", "r", "_displayBrightnessVisible", SOAP.XMLNS, "_dndModeVisible", "t", "_sleepModeVisible", "u", "_sportSettingVisible", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/DisplayListSupport;", "v", "_displayListVisible", "w", "_longPressSideVisible", "x", "_longPressUpVisible", "y", "_clickDownVisible", "z", "_clickSelectVisible", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "_isShowLoading", "kotlin.jvm.PlatformType", "B", "getNightModeVisible", "()Landroidx/lifecycle/MutableLiveData;", "nightModeVisible", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/loading/LoadingVo;", "C", "getLoadingLiveData", "loadingLiveData", "Lcom/xiaomi/hm/health/device/setting/ui/subview/WatchSettingsChangeListener;", LogUtil.D, "Lcom/xiaomi/hm/health/device/setting/ui/subview/WatchSettingsChangeListener;", "changeListener", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "()Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "hmMiLiProDevice", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/DisplayAndBrightness;", "value", "getDisplayBrightness", "()Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/DisplayAndBrightness;", "setDisplayBrightness", "(Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/DisplayAndBrightness;)V", "displayBrightness", "Landroidx/lifecycle/LiveData;", "getScreenLockAndPassword", "()Landroidx/lifecycle/LiveData;", "screenLockAndPassword", "getSoundVibrationVisible", "soundVibrationVisible", "getOfflineVoiceWakeUpVisible", "offlineVoiceWakeUpVisible", "getDeviceLanguageVisible", "deviceLanguageVisible", "getDeviceGestureVisible", "deviceGestureVisible", "getWearModeVisible", "wearModeVisible", "getDisplayBrightnessVisible", "displayBrightnessVisible", "getDndModeVisible", "dndModeVisible", "getSleepModeVisible", "sleepModeVisible", "getSportSettingVisible", "sportSettingVisible", "getDisplayListVisible", "displayListVisible", "getDeviceMorningGreetingVisible", "deviceMorningGreetingVisible", "getLongPressSideVisible", "longPressSideVisible", "getLongPressUpVisible", "longPressUpVisible", "getClickDownVisible", "clickDownVisible", "getClickSelectVisible", "clickSelectVisible", "isShowLoading", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WatchSettingViewModel extends DeviceFeaturesViewModel implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String E = "WatchSettingViewModel";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _isShowLoading;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> nightModeVisible;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<LoadingVo> loadingLiveData;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    private WatchSettingsChangeListener changeListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private HashMap<SettingsGroupType, Settings> watchSettings;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy watchSettingRepo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private WearingWay _wearingWay;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private OfflineVoice _offlineVoice;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<ScreenLockAndPassword> _screenLockAndPassword;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private SoundAndVibrate _soundAndVibrate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private SettingsLanguage _settingsLanguage;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private General _general;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private SettingsModule settingsModule;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _soundVibrationVisible;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _offlineVoiceWakeUpVisible;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _wearModeVisible;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _deviceLanguageVisible;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _deviceGestureVisible;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _deviceMorningGreetingVisible;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _displayBrightnessVisible;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _dndModeVisible;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _sleepModeVisible;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _sportSettingVisible;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<DisplayListSupport> _displayListVisible;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _longPressSideVisible;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _longPressUpVisible;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _clickDownVisible;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _clickSelectVisible;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/WatchSettingViewModel$Companion;", "", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "", "types", "", "a", "(Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;[Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;)Z", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean a(SettingsGroupType settingsGroupType, SettingsGroupType[] settingsGroupTypeArr) {
            return (settingsGroupTypeArr.length == 0) || ArraysKt___ArraysKt.contains(settingsGroupTypeArr, settingsGroupType);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingViewModel$queryScreenUnlockAndPassword$1", f = "WatchSettingViewModel.kt", i = {}, l = {240}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WatchSettingViewModel.this.new a(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IWatchSettingRepo iWatchSettingRepoC = WatchSettingViewModel.this.c();
                boolean z = this.c;
                this.a = 1;
                obj = iWatchSettingRepoC.queryScreenUnlockAndPassword(z, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ScreenLockAndPassword screenLockAndPassword = (ScreenLockAndPassword) obj;
            WatchSettingViewModel.this._isShowLoading.postValue(Boxing.boxBoolean(false));
            if (!(screenLockAndPassword instanceof Settings)) {
                screenLockAndPassword = null;
            }
            if (screenLockAndPassword != null) {
                WatchSettingViewModel watchSettingViewModel = WatchSettingViewModel.this;
                HashMap<SettingsGroupType, Settings> watchSettings = watchSettingViewModel.getWatchSettings();
                if (watchSettings != null) {
                    watchSettings.put(SettingsGroupType.SCREEN_UNLOCK_AND_PASSWORD, screenLockAndPassword);
                }
                WatchSettingExtsKt.getWatchSettingManager().onQuery(watchSettingViewModel.getWatchSettings());
            }
            WatchSettingViewModel watchSettingViewModel2 = WatchSettingViewModel.this;
            watchSettingViewModel2.e(new SettingsGroupType[]{SettingsGroupType.SCREEN_UNLOCK_AND_PASSWORD}, watchSettingViewModel2.getWatchSettings());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingViewModel$querySettings$1$1", f = "WatchSettingViewModel.kt", i = {}, l = {222}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ SettingsGroupType[] e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, SettingsGroupType[] settingsGroupTypeArr, Continuation<? super b> continuation) {
            super(2, continuation);
            this.d = z;
            this.e = settingsGroupTypeArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WatchSettingViewModel.this.new b(this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            WatchSettingViewModel watchSettingViewModel;
            SettingsModule settingsModule;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WatchSettingViewModel watchSettingViewModel2 = WatchSettingViewModel.this;
                IWatchSettingRepo iWatchSettingRepoC = watchSettingViewModel2.c();
                boolean z = this.d;
                SettingsGroupType[] settingsGroupTypeArr = this.e;
                this.a = watchSettingViewModel2;
                this.b = 1;
                Object objQuerySettings = iWatchSettingRepoC.querySettings(z, settingsGroupTypeArr, this);
                if (objQuerySettings == coroutine_suspended) {
                    return coroutine_suspended;
                }
                watchSettingViewModel = watchSettingViewModel2;
                obj = objQuerySettings;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                watchSettingViewModel = (WatchSettingViewModel) this.a;
                ResultKt.throwOnFailure(obj);
            }
            watchSettingViewModel.setWatchSettings((HashMap) obj);
            SettingsModule settingsModule2 = WatchSettingViewModel.this.settingsModule;
            Integer version = settingsModule2 == null ? null : settingsModule2.getVersion();
            if (WatchSettingViewModel.this.changeListener == null && version != null && version.intValue() >= 2) {
                WatchSettingViewModel.this.changeListener = new WatchSettingsChangeListener(WatchSettingViewModel.this.getWatchSettings());
                WatchSettingsChangeListener watchSettingsChangeListener = WatchSettingViewModel.this.changeListener;
                if (watchSettingsChangeListener != null && (settingsModule = WatchSettingViewModel.this.settingsModule) != null) {
                    settingsModule.addListener(watchSettingsChangeListener);
                }
            }
            WatchSettingExtsKt.getWatchSettingManager().onQuery(WatchSettingViewModel.this.getWatchSettings());
            WatchSettingViewModel.this._isShowLoading.postValue(Boxing.boxBoolean(false));
            WatchSettingViewModel watchSettingViewModel3 = WatchSettingViewModel.this;
            watchSettingViewModel3.e(this.e, watchSettingViewModel3.getWatchSettings());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingViewModel$setWearingDirection$1", f = "WatchSettingViewModel.kt", i = {}, l = {399}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<WatchSettings, Unit> {
            public final /* synthetic */ int a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i) {
                super(1);
                this.a = i;
            }

            public final void a(@NotNull WatchSettings watchSettings) {
                Wearing wearing = watchSettings.getWearing();
                if (wearing == null) {
                    return;
                }
                wearing.setWearingDirection(Integer.valueOf(this.a));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
                a(watchSettings);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(boolean z) {
                super(0);
                this.a = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "setWearingDirection: " + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WatchSettingViewModel.this.new c(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x003f  */
        /* JADX WARN: Code duplicated, block: B:19:0x0061  */
        /* JADX WARN: Code duplicated, block: B:21:0x006b  */
        /* JADX WARN: Code duplicated, block: B:22:0x006e  */
        /* JADX WARN: Code duplicated, block: B:24:0x0071  */
        /* JADX WARN: Code duplicated, block: B:25:0x0073  */
        /* JADX WARN: Code duplicated, block: B:28:0x007a  */
        /* JADX WARN: Code duplicated, block: B:31:0x0087  */
        /* JADX WARN: Code duplicated, block: B:32:0x0089  */
        /* JADX WARN: Code duplicated, block: B:35:0x0095  */
        /* JADX WARN: Code duplicated, block: B:36:0x0098  */
        /* JADX WARN: Code duplicated, block: B:38:0x009b  */
        /* JADX WARN: Code duplicated, block: B:39:0x009d  */
        /* JADX WARN: Code duplicated, block: B:42:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:44:0x00c3  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean zBooleanValue;
            WearingWay wearingWay;
            WearingWayV2 wearingWayV2;
            EnumData wearingDirection;
            HashMap<SettingsGroupType, Settings> watchSettings;
            Settings settings;
            WearingWayV2 wearingWayV3;
            EnumData wearingDirection2;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LoadingVo.Companion.postStartMsg$default(LoadingVo.INSTANCE, WatchSettingViewModel.this.getLoadingLiveData(), null, 2, null);
                WearingWayV2 wearingWayV4 = new WearingWayV2();
                wearingWayV4.setWearingDirection(new EnumData(this.c));
                SettingsModule settingsModule = WatchSettingViewModel.this.settingsModule;
                if (settingsModule == null) {
                    zBooleanValue = false;
                } else {
                    HashMap<SettingsGroupType, Settings> map = new HashMap<>();
                    map.put(SettingsGroupType.WEARING, wearingWayV4);
                    Unit unit = Unit.INSTANCE;
                    this.a = 1;
                    obj = settingsModule.writeSetting(map, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (zBooleanValue) {
                    wearingWay = WatchSettingViewModel.this._wearingWay;
                    if (wearingWay instanceof WearingWayV2) {
                        wearingWayV2 = (WearingWayV2) wearingWay;
                    } else {
                        wearingWayV2 = null;
                    }
                    if (wearingWayV2 == null) {
                        wearingDirection = null;
                    } else {
                        wearingDirection = wearingWayV2.getWearingDirection();
                    }
                    if (wearingDirection != null) {
                        wearingDirection.setValue(this.c);
                    }
                    watchSettings = WatchSettingViewModel.this.getWatchSettings();
                    if (watchSettings == null) {
                        settings = null;
                    } else {
                        settings = watchSettings.get(SettingsGroupType.WEARING);
                    }
                    if (settings instanceof WearingWayV2) {
                        wearingWayV3 = (WearingWayV2) settings;
                    } else {
                        wearingWayV3 = null;
                    }
                    if (wearingWayV3 == null) {
                        wearingDirection2 = null;
                    } else {
                        wearingDirection2 = wearingWayV3.getWearingDirection();
                    }
                    if (wearingDirection2 != null) {
                        wearingDirection2.setValue(this.c);
                    }
                    LoadingVo.Companion.postCancelMsg$default(LoadingVo.INSTANCE, WatchSettingViewModel.this.getLoadingLiveData(), null, 2, null);
                    WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new a(this.c), 1, null);
                } else {
                    LoadingVo.Companion.postFailMsg$default(LoadingVo.INSTANCE, WatchSettingViewModel.this.getLoadingLiveData(), null, 2, null);
                }
                HMLog.info(WatchSettingViewModel.E, new b(zBooleanValue));
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                zBooleanValue = false;
            } else {
                zBooleanValue = bool.booleanValue();
            }
            if (zBooleanValue) {
                wearingWay = WatchSettingViewModel.this._wearingWay;
                if (wearingWay instanceof WearingWayV2) {
                    wearingWayV2 = (WearingWayV2) wearingWay;
                } else {
                    wearingWayV2 = null;
                }
                if (wearingWayV2 == null) {
                    wearingDirection = null;
                } else {
                    wearingDirection = wearingWayV2.getWearingDirection();
                }
                if (wearingDirection != null) {
                    wearingDirection.setValue(this.c);
                }
                watchSettings = WatchSettingViewModel.this.getWatchSettings();
                if (watchSettings == null) {
                    settings = null;
                } else {
                    settings = watchSettings.get(SettingsGroupType.WEARING);
                }
                if (settings instanceof WearingWayV2) {
                    wearingWayV3 = (WearingWayV2) settings;
                } else {
                    wearingWayV3 = null;
                }
                if (wearingWayV3 == null) {
                    wearingDirection2 = null;
                } else {
                    wearingDirection2 = wearingWayV3.getWearingDirection();
                }
                if (wearingDirection2 != null) {
                    wearingDirection2.setValue(this.c);
                }
                LoadingVo.Companion.postCancelMsg$default(LoadingVo.INSTANCE, WatchSettingViewModel.this.getLoadingLiveData(), null, 2, null);
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new a(this.c), 1, null);
            } else {
                LoadingVo.Companion.postFailMsg$default(LoadingVo.INSTANCE, WatchSettingViewModel.this.getLoadingLiveData(), null, 2, null);
            }
            HMLog.info(WatchSettingViewModel.E, new b(zBooleanValue));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WatchSettingViewModel() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Object[] objArr = 0 == true ? 1 : 0;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        this.watchSettingRepo = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<IWatchSettingRepo>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.repo.IWatchSettingRepo, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IWatchSettingRepo invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(IWatchSettingRepo.class), objArr, objArr2);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr3 = 0 == true ? 1 : 0;
        final Object[] objArr4 = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingViewModel$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), objArr3, objArr4);
            }
        });
        MutableLiveData<ScreenLockAndPassword> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(null);
        Unit unit = Unit.INSTANCE;
        this._screenLockAndPassword = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        Boolean bool = Boolean.FALSE;
        mutableLiveData2.setValue(bool);
        this._soundVibrationVisible = mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>();
        mutableLiveData3.setValue(bool);
        this._offlineVoiceWakeUpVisible = mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4 = new MutableLiveData<>();
        mutableLiveData4.setValue(bool);
        this._wearModeVisible = mutableLiveData4;
        MutableLiveData<Boolean> mutableLiveData5 = new MutableLiveData<>();
        mutableLiveData5.setValue(bool);
        this._deviceLanguageVisible = mutableLiveData5;
        MutableLiveData<Boolean> mutableLiveData6 = new MutableLiveData<>();
        mutableLiveData6.setValue(bool);
        this._deviceGestureVisible = mutableLiveData6;
        MutableLiveData<Boolean> mutableLiveData7 = new MutableLiveData<>();
        mutableLiveData7.setValue(bool);
        this._deviceMorningGreetingVisible = mutableLiveData7;
        MutableLiveData<Boolean> mutableLiveData8 = new MutableLiveData<>();
        mutableLiveData8.setValue(bool);
        this._displayBrightnessVisible = mutableLiveData8;
        this._dndModeVisible = new MutableLiveData<>(bool);
        this._sleepModeVisible = new MutableLiveData<>(bool);
        this._sportSettingVisible = new MutableLiveData<>(bool);
        this._displayListVisible = new MutableLiveData<>();
        this._longPressSideVisible = new MutableLiveData<>(bool);
        this._longPressUpVisible = new MutableLiveData<>(bool);
        this._clickDownVisible = new MutableLiveData<>(bool);
        this._clickSelectVisible = new MutableLiveData<>(bool);
        MutableLiveData<Boolean> mutableLiveData9 = new MutableLiveData<>();
        mutableLiveData9.setValue(bool);
        this._isShowLoading = mutableLiveData9;
        this.nightModeVisible = new MutableLiveData<>(bool);
        this.loadingLiveData = new MutableLiveData<>();
        HMMiLiProDevice hMMiLiProDeviceB = b();
        this.settingsModule = hMMiLiProDeviceB != null ? (SettingsModule) hMMiLiProDeviceB.getChannelModule(SettingsModule.class) : null;
    }

    private final DeviceManagerApi a() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HMMiLiProDevice b() {
        return (HMMiLiProDevice) findDevice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IWatchSettingRepo c() {
        return (IWatchSettingRepo) this.watchSettingRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(SettingsGroupType[] groupTypes, HashMap<SettingsGroupType, Settings> watchSettings) {
        Companion companion = INSTANCE;
        SettingsGroupType settingsGroupType = SettingsGroupType.WEARING;
        if (companion.a(settingsGroupType, groupTypes)) {
            Settings settings = watchSettings == null ? null : watchSettings.get(settingsGroupType);
            WearingWay wearingWay = settings instanceof WearingWay ? (WearingWay) settings : null;
            this._wearingWay = wearingWay;
            WearingWayV2 wearingWayV2 = wearingWay instanceof WearingWayV2 ? (WearingWayV2) wearingWay : null;
            if (wearingWayV2 != null) {
                EnumData wearingDirection = wearingWayV2.getWearingDirection();
                ArrayList<Integer> enums = wearingDirection == null ? null : wearingDirection.getEnums();
                EnumData wearingDirection2 = wearingWayV2.getWearingDirection();
                Integer numValueOf = wearingDirection2 == null ? null : Integer.valueOf(wearingDirection2.getValue());
                EnumData wearingDirection3 = wearingWayV2.getWearingDirection();
                Integer numValueOf2 = wearingDirection3 == null ? null : Integer.valueOf(wearingDirection3.index());
                if ((enums == null || enums.isEmpty()) || numValueOf == null || numValueOf2 == null) {
                    this._wearModeVisible.postValue(Boolean.FALSE);
                } else {
                    this._wearModeVisible.postValue(Boolean.TRUE);
                }
            } else {
                this._wearModeVisible.postValue(Boolean.valueOf(wearingWay != null));
            }
        }
        SettingsGroupType settingsGroupType2 = SettingsGroupType.OFFLINE_VOICE;
        if (companion.a(settingsGroupType2, groupTypes)) {
            Settings settings2 = watchSettings == null ? null : watchSettings.get(settingsGroupType2);
            OfflineVoice offlineVoice = settings2 instanceof OfflineVoice ? (OfflineVoice) settings2 : null;
            this._offlineVoice = offlineVoice;
            this._offlineVoiceWakeUpVisible.postValue(Boolean.valueOf(offlineVoice != null));
        }
        SettingsGroupType settingsGroupType3 = SettingsGroupType.SOUND_AND_VIBRATION;
        if (companion.a(settingsGroupType3, groupTypes)) {
            Settings settings3 = watchSettings == null ? null : watchSettings.get(settingsGroupType3);
            SoundAndVibrate soundAndVibrate = settings3 instanceof SoundAndVibrate ? (SoundAndVibrate) settings3 : null;
            this._soundAndVibrate = soundAndVibrate;
            this._soundVibrationVisible.postValue(Boolean.valueOf(soundAndVibrate != null));
        }
        if (companion.a(SettingsGroupType.DISPLAY, groupTypes)) {
            this._displayBrightnessVisible.postValue(Boolean.valueOf(getDisplayBrightness() != null));
        }
        SettingsGroupType settingsGroupType4 = SettingsGroupType.LANGUAGE;
        if (companion.a(settingsGroupType4, groupTypes)) {
            Settings settings4 = watchSettings == null ? null : watchSettings.get(settingsGroupType4);
            SettingsLanguage settingsLanguage = settings4 instanceof SettingsLanguage ? (SettingsLanguage) settings4 : null;
            this._settingsLanguage = settingsLanguage;
            this._deviceLanguageVisible.postValue(Boolean.valueOf(settingsLanguage != null));
        }
        MutableLiveData<Boolean> mutableLiveData = this._deviceGestureVisible;
        HMBaseDevice hMBaseDeviceFindDevice = findDevice();
        mutableLiveData.postValue(Boolean.valueOf(hMBaseDeviceFindDevice != null && hMBaseDeviceFindDevice.supportModule(GestureProtocolApiImpl.class)));
        SettingsGroupType settingsGroupType5 = SettingsGroupType.GENERAL;
        if (companion.a(settingsGroupType5, groupTypes)) {
            Settings settings5 = watchSettings == null ? null : watchSettings.get(settingsGroupType5);
            this._general = settings5 instanceof General ? (General) settings5 : null;
            f();
            i();
            h();
            g();
        }
        SettingsGroupType settingsGroupType6 = SettingsGroupType.SCREEN_UNLOCK_AND_PASSWORD;
        if (companion.a(settingsGroupType6, groupTypes)) {
            MutableLiveData<ScreenLockAndPassword> mutableLiveData2 = this._screenLockAndPassword;
            Settings settings6 = watchSettings == null ? null : watchSettings.get(settingsGroupType6);
            mutableLiveData2.postValue(settings6 instanceof ScreenLockAndPassword ? (ScreenLockAndPassword) settings6 : null);
        }
        if (groupTypes.length == 0) {
            this._sportSettingVisible.postValue(Boolean.valueOf(ConfigHelperKt.hasFeature(a().getBoundDeviceSource(HMDeviceType.MILI), Feature.SUPPORT_SPORT_SETTING)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0026  */
    private final void f() {
        boolean z;
        General general = this._general;
        if ((general == null ? null : general.getDndMode()) == null) {
            z = false;
        } else {
            General general2 = this._general;
            if ((general2 == null ? null : general2.getDndStartTime()) == null) {
                z = false;
            } else {
                General general3 = this._general;
                if ((general3 != null ? general3.getDndStopTime() : null) != null) {
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        this._dndModeVisible.postValue(Boolean.valueOf(z));
    }

    private final void g() {
        Time nightModeStopTime;
        Time nightModeStartTime;
        EnumData nightMode;
        HMNightModeConfig hMNightModeConfigFromJsonString = HMNightModeConfig.fromJsonString();
        General general = this._general;
        boolean z = false;
        int i = 0;
        z = false;
        if (general != null && (nightMode = general.getNightMode()) != null) {
            int value = nightMode.getValue();
            if (value == 1) {
                i = 2;
            } else if (value == 2) {
                i = 1;
            }
            hMNightModeConfigFromJsonString.setNightMode(i);
            z = true;
        }
        General general2 = this._general;
        if (general2 != null && (nightModeStartTime = general2.getNightModeStartTime()) != null) {
            hMNightModeConfigFromJsonString.setStartMinute(WatchSettingExtsKt.toMinutes(nightModeStartTime));
            z = true;
        }
        General general3 = this._general;
        if (general3 != null && (nightModeStopTime = general3.getNightModeStopTime()) != null) {
            hMNightModeConfigFromJsonString.setEndMinute(WatchSettingExtsKt.toMinutes(nightModeStopTime));
            z = true;
        }
        if (z) {
            DeviceXFunctionsKt.getPropertyStoreApi().setProperty(Property.PROPERTY_NIGHT_MODE, hMNightModeConfigFromJsonString.toJsonString());
            DeviceXFunctionsKt.getPropertyStoreApi().postPropertiesToServer(true);
        }
        this.nightModeVisible.postValue(Boolean.valueOf(z));
    }

    private final void h() {
        MutableLiveData<Boolean> mutableLiveData = this._longPressSideVisible;
        General general = this._general;
        mutableLiveData.postValue(Boolean.valueOf((general == null ? null : general.getLongPressSideApp()) != null));
        MutableLiveData<Boolean> mutableLiveData2 = this._longPressUpVisible;
        General general2 = this._general;
        mutableLiveData2.postValue(Boolean.valueOf((general2 == null ? null : general2.getLongPressUpApp()) != null));
        MutableLiveData<Boolean> mutableLiveData3 = this._clickDownVisible;
        General general3 = this._general;
        mutableLiveData3.postValue(Boolean.valueOf((general3 == null ? null : general3.getClickDownApp()) != null));
        MutableLiveData<Boolean> mutableLiveData4 = this._clickSelectVisible;
        General general4 = this._general;
        mutableLiveData4.postValue(Boolean.valueOf((general4 != null ? general4.getClickSelectApp() : null) != null));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001a  */
    private final void i() {
        boolean z;
        General general = this._general;
        if ((general == null ? null : general.getSleepModeForDisplaySwitch()) == null) {
            z = false;
        } else {
            General general2 = this._general;
            if ((general2 != null ? general2.getSleepModeSmartEnableSwitch() : null) != null) {
                z = true;
            } else {
                z = false;
            }
        }
        this._sleepModeVisible.postValue(Boolean.valueOf(z));
    }

    public static /* synthetic */ void querySettings$default(WatchSettingViewModel watchSettingViewModel, boolean z, SettingsGroupType[] settingsGroupTypeArr, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        watchSettingViewModel.querySettings(z, settingsGroupTypeArr);
    }

    public final void addListener(@NotNull SettingsGroupType groupType, @NotNull ChangeListener listener) {
        WatchSettingsChangeListener watchSettingsChangeListener = this.changeListener;
        if (watchSettingsChangeListener == null) {
            return;
        }
        watchSettingsChangeListener.addListener(groupType, listener);
    }

    @NotNull
    public final LiveData<Boolean> getClickDownVisible() {
        return this._clickDownVisible;
    }

    @NotNull
    public final LiveData<Boolean> getClickSelectVisible() {
        return this._clickSelectVisible;
    }

    @NotNull
    public final LiveData<Boolean> getDeviceGestureVisible() {
        return this._deviceGestureVisible;
    }

    @Nullable
    /* JADX INFO: renamed from: getDeviceLanguage, reason: from getter */
    public final SettingsLanguage get_settingsLanguage() {
        return this._settingsLanguage;
    }

    @NotNull
    public final LiveData<Boolean> getDeviceLanguageVisible() {
        return this._deviceLanguageVisible;
    }

    @NotNull
    public final LiveData<Boolean> getDeviceMorningGreetingVisible() {
        return this._deviceMorningGreetingVisible;
    }

    @NotNull
    public final HMDeviceType getDeviceType() {
        HMBaseDevice hMBaseDeviceFindDevice = findDevice();
        HMDeviceType deviceType = hMBaseDeviceFindDevice == null ? null : hMBaseDeviceFindDevice.getDeviceType();
        return deviceType == null ? HMDeviceType.MILI : deviceType;
    }

    @Nullable
    public final DisplayAndBrightness getDisplayBrightness() {
        HashMap<SettingsGroupType, Settings> map = this.watchSettings;
        Settings settings = map == null ? null : map.get(SettingsGroupType.DISPLAY);
        if (settings instanceof DisplayAndBrightness) {
            return (DisplayAndBrightness) settings;
        }
        return null;
    }

    @NotNull
    public final LiveData<Boolean> getDisplayBrightnessVisible() {
        return this._displayBrightnessVisible;
    }

    @NotNull
    public final LiveData<DisplayListSupport> getDisplayListVisible() {
        return this._displayListVisible;
    }

    @NotNull
    public final LiveData<Boolean> getDndModeVisible() {
        return this._dndModeVisible;
    }

    @Nullable
    /* JADX INFO: renamed from: getGeneral, reason: from getter */
    public final General get_general() {
        return this._general;
    }

    @NotNull
    public final MutableLiveData<LoadingVo> getLoadingLiveData() {
        return this.loadingLiveData;
    }

    @NotNull
    public final LiveData<Boolean> getLongPressSideVisible() {
        return this._longPressSideVisible;
    }

    @NotNull
    public final LiveData<Boolean> getLongPressUpVisible() {
        return this._longPressUpVisible;
    }

    @NotNull
    public final MutableLiveData<Boolean> getNightModeVisible() {
        return this.nightModeVisible;
    }

    @Nullable
    /* JADX INFO: renamed from: getOfflineVoice, reason: from getter */
    public final OfflineVoice get_offlineVoice() {
        return this._offlineVoice;
    }

    @NotNull
    public final LiveData<Boolean> getOfflineVoiceWakeUpVisible() {
        return this._offlineVoiceWakeUpVisible;
    }

    @NotNull
    public final LiveData<ScreenLockAndPassword> getScreenLockAndPassword() {
        return this._screenLockAndPassword;
    }

    public final /* synthetic */ <T> T getSettings(SettingsGroupType groupType) {
        HashMap<SettingsGroupType, Settings> watchSettings = getWatchSettings();
        T t = watchSettings == null ? null : (T) ((Settings) watchSettings.get(groupType));
        Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
        return t;
    }

    @NotNull
    public final LiveData<Boolean> getSleepModeVisible() {
        return this._sleepModeVisible;
    }

    @Nullable
    /* JADX INFO: renamed from: getSoundAndVibrate, reason: from getter */
    public final SoundAndVibrate get_soundAndVibrate() {
        return this._soundAndVibrate;
    }

    @NotNull
    public final LiveData<Boolean> getSoundVibrationVisible() {
        return this._soundVibrationVisible;
    }

    @NotNull
    public final LiveData<Boolean> getSportSettingVisible() {
        return this._sportSettingVisible;
    }

    @Nullable
    public final HashMap<SettingsGroupType, Settings> getWatchSettings() {
        return this.watchSettings;
    }

    @NotNull
    public final LiveData<Boolean> getWearModeVisible() {
        return this._wearModeVisible;
    }

    @Nullable
    /* JADX INFO: renamed from: getWearingWay, reason: from getter */
    public final WearingWay get_wearingWay() {
        return this._wearingWay;
    }

    @NotNull
    public final LiveData<Boolean> isShowLoading() {
        return this._isShowLoading;
    }

    public final void loadSort() {
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new WatchSettingViewModel$loadSort$$inlined$safeLaunch$1(null, this), 2, null);
    }

    public final boolean needLoad() {
        HashMap<SettingsGroupType, Settings> map;
        SettingsModule settingsModule = this.settingsModule;
        Integer version = settingsModule == null ? null : settingsModule.getVersion();
        return version == null || version.intValue() < 2 || (map = this.watchSettings) == null || map.isEmpty();
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        CoroutineScopeKt.cancel$default(ViewModelKt.getViewModelScope(this), null, 1, null);
    }

    public final void queryScreenUnlockAndPassword(boolean needDesc) {
        this._isShowLoading.setValue(Boolean.TRUE);
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(needDesc, null), 2, null);
    }

    public final void querySettings(boolean needDesc, @NotNull SettingsGroupType[] groupTypes) {
        this._isShowLoading.setValue(Boolean.TRUE);
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new WatchSettingViewModel$querySettings$$inlined$safeLaunch$1(null, this, needDesc, groupTypes), 2, null);
    }

    public final void setDisplayBrightness(@Nullable DisplayAndBrightness displayAndBrightness) {
        HashMap<SettingsGroupType, Settings> map;
        if (displayAndBrightness == null || (map = this.watchSettings) == null) {
            return;
        }
        map.put(SettingsGroupType.DISPLAY, displayAndBrightness);
    }

    public final void setOfflineVoice(@Nullable OfflineVoice offlineVoice) {
        this._offlineVoice = offlineVoice;
    }

    public final void setOfflineVoiceWakeUpVisible(boolean isVisible) {
        this._offlineVoiceWakeUpVisible.setValue(Boolean.valueOf(isVisible));
    }

    public final void setSoundAndVibrate(@Nullable SoundAndVibrate soundAndVibrate) {
        this._soundAndVibrate = soundAndVibrate;
    }

    public final void setSoundVibrationVisible(boolean isVisible) {
        this._soundVibrationVisible.setValue(Boolean.valueOf(isVisible));
    }

    public final void setWatchSettings(@Nullable HashMap<SettingsGroupType, Settings> map) {
        this.watchSettings = map;
    }

    public final void setWearingDirection(int direction) {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new c(direction, null), 2, null);
    }

    public final void setWearingWay(@Nullable WearingWay wearingWay) {
        this._wearingWay = wearingWay;
    }
}
