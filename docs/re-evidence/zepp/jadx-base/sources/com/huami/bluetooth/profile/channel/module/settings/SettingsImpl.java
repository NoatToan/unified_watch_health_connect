package com.huami.bluetooth.profile.channel.module.settings;

import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.settings.entity.connection.Connection;
import com.huami.bluetooth.profile.channel.module.settings.entity.deviceinformation.DeviceInformation;
import com.huami.bluetooth.profile.channel.module.settings.entity.general.General;
import com.huami.bluetooth.profile.channel.module.settings.entity.general.IGeneralOperator;
import com.huami.bluetooth.profile.channel.module.settings.entity.health.Health;
import com.huami.bluetooth.profile.channel.module.settings.entity.language.SettingsLanguage;
import com.huami.bluetooth.profile.channel.module.settings.entity.screenlock.ScreenLockAndPassword;
import com.huami.bluetooth.profile.channel.module.settings.entity.sport.Sport;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Flag;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntPrimaryData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntegerArray;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.TimeStamp;
import com.huami.bluetooth.profile.ecf.data.HidStatus;
import com.huami.bluetooth.profile.ecf.data.NowTimeConfig;
import com.huami.bluetooth.profile.ecf.data.StandAlertConfig;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.core.device.wifi_settings.ui.WifiSetActivity;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import com.loc.z;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.model.HMAutoBacklightInfo;
import com.xiaomi.hm.health.bt.model.HMDisconnectRemindConfig;
import com.xiaomi.hm.health.bt.model.HMHrReminder;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import com.xiaomi.hm.health.bt.model.HMSilentConfig;
import com.xiaomi.hm.health.bt.model.HMTarget;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertMode;
import com.xiaomi.hm.health.bt.profile.base.BaseResourceInfo;
import com.xiaomi.hm.health.bt.profile.base.ExternalResourceInfo;
import com.xiaomi.hm.health.bt.profile.base.HMOtherVersion;
import com.xiaomi.hm.health.bt.profile.base.SystemImageStatus;
import com.xiaomi.hm.health.bt.profile.sport.SportRemindConfig;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u0012\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ¨\u00012\u00020\u00012\u00020\u0002:\u0002¨\u0001B\u001d\u0012\b\u0010¢\u0001\u001a\u00030 \u0001\u0012\b\u0010¥\u0001\u001a\u00030£\u0001¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J6\u0010\f\u001a\u00020\u00052,\u0010\u000b\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bj\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\n0\u0007H\u0002J\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\rH\u0002J\u0018\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012H\u0002J!\u0010\u0015\u001a\u0004\u0018\u00010\r*\u00020\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\f\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0002J\f\u0010\u001b\u001a\u00020\u0018*\u00020\u001aH\u0002J,\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003`\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J \u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002J\u0014\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002J\u000e\u0010$\u001a\u0004\u0018\u00010\r*\u00020#H\u0002J\u000e\u0010%\u001a\u0004\u0018\u00010#*\u00020\rH\u0002J\u0018\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012H\u0002J\u0018\u0010*\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u0005H\u0016J\u0010\u0010+\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'H\u0016J\u0012\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010-\u001a\u00020,H\u0016J\u0012\u00101\u001a\u00020\u00052\b\u00100\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u00103\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H\u0016J\u0010\u00106\u001a\u00020\u00052\u0006\u00105\u001a\u000204H\u0016J\n\u00107\u001a\u0004\u0018\u000104H\u0016J\u0010\u00108\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H\u0016J\u0010\u0010:\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u0005H\u0016J\u0010\u0010<\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u0005H\u0016J\u0012\u0010>\u001a\u00020\u00052\b\u0010=\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010A\u001a\u00020\u00052\u0006\u0010@\u001a\u00020?H\u0016J\u0010\u0010C\u001a\u00020\u00052\u0006\u0010B\u001a\u00020?H\u0016J\u0010\u0010E\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u0005H\u0016J\u0010\u0010H\u001a\u00020\u00052\u0006\u0010G\u001a\u00020FH\u0016J\u0012\u0010I\u001a\u00020\u00052\b\u00100\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010J\u001a\u00020\u0005H\u0016J\b\u0010K\u001a\u00020\u0005H\u0016J\b\u0010L\u001a\u00020\u0011H\u0016J\u0010\u0010M\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H\u0016J\u0010\u0010N\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H\u0016J\u0010\u0010O\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H\u0016J\u0011\u0010P\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\bP\u0010QJ\u0012\u0010S\u001a\u00020\u00052\b\u00100\u001a\u0004\u0018\u00010RH\u0016J\u0010\u0010T\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H\u0016J\u0011\u0010U\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\bU\u0010QJ\u0010\u0010V\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H\u0016J\u0011\u0010W\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\bW\u0010QJ\u0010\u0010Y\u001a\u00020\u00052\u0006\u0010X\u001a\u00020\u0011H\u0016J\u0011\u0010Z\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\bZ\u0010[J\u0010\u0010\\\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H\u0016J\u0011\u0010]\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b]\u0010QJ\u0010\u0010^\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H\u0016J\u0011\u0010_\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b_\u0010QJ\u0010\u0010`\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H\u0016J\u0011\u0010a\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\ba\u0010QJ\u0010\u0010b\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H\u0016J\u0011\u0010c\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\bc\u0010QJ\u0010\u0010d\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H\u0016J\u0011\u0010e\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\be\u0010QJ\u0010\u0010h\u001a\u00020\u00052\u0006\u0010g\u001a\u00020fH\u0016J\n\u0010i\u001a\u0004\u0018\u00010fH\u0016J\u0010\u0010j\u001a\u00020\u00052\u0006\u0010g\u001a\u00020fH\u0016J\n\u0010k\u001a\u0004\u0018\u00010fH\u0016J\u0010\u0010l\u001a\u00020\u00052\u0006\u00100\u001a\u00020#H\u0016J\n\u0010m\u001a\u0004\u0018\u00010#H\u0016J!\u0010o\u001a\u00020\u00052\u0006\u0010n\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\bo\u0010pJ\u0018\u0010t\u001a\u00020\u00052\u0006\u0010q\u001a\u00020\u00052\u0006\u0010s\u001a\u00020rH\u0016J\u0018\u0010v\u001a\u00020\u00052\u0006\u0010q\u001a\u00020\u00052\u0006\u0010u\u001a\u00020rH\u0016J)\u0010x\u001a\u00020\u00052\u0006\u0010q\u001a\u00020\u00052\u0006\u0010w\u001a\u00020r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\bx\u0010yJ\u0018\u0010{\u001a\u00020\u00052\u0006\u0010q\u001a\u00020\u00052\u0006\u0010z\u001a\u00020rH\u0016J\u0018\u0010}\u001a\u00020\u00052\u0006\u0010q\u001a\u00020\u00052\u0006\u0010|\u001a\u00020rH\u0016J\n\u0010~\u001a\u0004\u0018\u00010\u000eH\u0016J\u0019\u0010\u0080\u0001\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u00052\u0006\u0010\u007f\u001a\u00020\u0011H\u0016J\u0013\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0005\b\u0081\u0001\u0010[J/\u0010\u0087\u0001\u001a\u00020\u00052\u0007\u0010\u0082\u0001\u001a\u00020?2\b\u0010\u0084\u0001\u001a\u00030\u0083\u00012\b\u0010\u0085\u0001\u001a\u00030\u0083\u00012\u0007\u0010\u0086\u0001\u001a\u00020?H\u0016J\u0011\u0010\u0088\u0001\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0011H\u0016J\u0011\u0010\u0089\u0001\u001a\u00020\u0005H\u0016¢\u0006\u0005\b\u0089\u0001\u0010QJ\u001a\u0010\u008b\u0001\u001a\u00020\u00052\u0006\u0010q\u001a\u00020\u00052\u0007\u0010\u008a\u0001\u001a\u00020rH\u0016J\u001a\u0010\u008d\u0001\u001a\u00020\u00052\u0006\u0010q\u001a\u00020\u00052\u0007\u0010\u008c\u0001\u001a\u00020rH\u0016J\u0011\u0010\u008e\u0001\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H\u0016J\u0013\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0005\b\u008f\u0001\u0010QJ\u0011\u0010\u0090\u0001\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H\u0016J\u0013\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0005\b\u0091\u0001\u0010QJ\u0011\u0010\u0092\u0001\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H\u0016J\u0012\u0010\u0094\u0001\u001a\u00020\u00052\u0007\u0010\u001e\u001a\u00030\u0093\u0001H\u0016J\u0011\u0010\u0095\u0001\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u0005H\u0016J\u0013\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0005\b\u0096\u0001\u0010QJ\u0013\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0005\b\u0097\u0001\u0010QJ\u0013\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0005\b\u0098\u0001\u0010QJ\u0013\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0005\b\u0099\u0001\u0010QJ\u0013\u0010\u009c\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009a\u0001\u001a\u00020\u0005H\u0016J\u0012\u0010\u009e\u0001\u001a\u00020\u00052\u0007\u0010\u009d\u0001\u001a\u00020\u0005H\u0016J\u0013\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0005\b\u009f\u0001\u0010QR\u0019\u0010¢\u0001\u001a\u00030 \u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010¡\u0001R\u0019\u0010¥\u0001\u001a\u00030£\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b&\u0010¤\u0001¨\u0006©\u0001"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/SettingsImpl;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsApi;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/general/IGeneralOperator;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "settings", "", "m", "Lkotlin/Function0;", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lkotlin/collections/HashMap;", "action", GoogleApiAvailabilityLight.b, "Lcom/huami/bluetooth/profile/channel/module/settings/entity/health/Health;", "Lcom/xiaomi/hm/health/bt/model/HMTarget;", "f", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "c", "settingsVersion", hl.k, "(Lcom/xiaomi/hm/health/bt/model/HMTarget;Ljava/lang/Integer;)Lcom/huami/bluetooth/profile/channel/module/settings/entity/health/Health;", "Lcom/xiaomi/hm/health/bt/model/HMDisconnectRemindConfig;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/general/General;", "a", "Lcom/xiaomi/hm/health/bt/model/HMSilentConfig;", z.j, GoogleApiAvailabilityLight.a, "", "info", "Lkotlin/Pair;", "h", "Lcom/xiaomi/hm/health/bt/profile/base/BaseResourceInfo;", "g", "Lcom/huami/bluetooth/profile/ecf/data/StandAlertConfig;", "i", "e", "b", "Lcom/xiaomi/hm/health/bt/profile/alert/HMAlertMode;", "mode", "show", "showContactSync", "isContactShow", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "Lcom/xiaomi/hm/health/bt/profile/base/HMOtherVersion;", "getDeviceInfoSync", "config", "setDisconnectRemind", "enable", "setMultiLinkSwitch", "Lcom/huami/bluetooth/profile/ecf/data/HidStatus;", "hidStatus", "setHidStatus", "getHidStatus", "setConnectedAdvSwitch", WatchFaceApi.CUSTOMIZABLE_DISABLE, "setRestrictedBindingSwitch", "is12Hour", "setTimeFormat", TrainingWebConst.QueryParam.VIDEO_FORMAT, "setDateDisplayStyle", "", "calendar", "setOtherCalendar", "dayOfWeek", "setWeeklyStartTime", TdmillHmFragment.ARG_IS_METRIC, "setMileageUnit", "Lcom/huami/bluetooth/profile/ecf/data/NowTimeConfig;", "nowTimeConfig", "setHourlyAnnounceSwitch", "setSilent", "stopDevice", "startDevice", "getSwimLogSwitch", "enableSwimLog", "enableHrBroadcast", "enableSportHeartRate", "getSportHeartRate", "()Ljava/lang/Boolean;", "Lcom/xiaomi/hm/health/bt/profile/sport/SportRemindConfig;", "setSportRemindConfig", "enableOsa", "getOsaEnable", "setSmartSpo2", "getSmartSpo2", "value", "setLowSpo2Alert", "getLowSpo2Alert", "()Ljava/lang/Integer;", "enablePressure", "getPressureEnable", "enablePressureAlert", "getPressureAlertEnable", "enableHrSleep", "getHrSleepEnable", "enableAtrialFib", "getAtrialFibEnable", "enableAtrialAlertSleepNotDisturb", "getAtrialAlertSleepNotDisturbEnable", "Lcom/xiaomi/hm/health/bt/model/HMHrReminder;", "hrReminder", "setHighHrReminder", "getHighHrReminder", "setLowHrReminder", "getLowHrReminder", "setStandAlertConfig", "getStandAlertConfig", "target", "setTargets", "(Lcom/xiaomi/hm/health/bt/model/HMTarget;Ljava/lang/Integer;)Z", "remind", "", "distance", "setDistanceTarget", "calorie", "setCalorieTarget", "step", "setStepTarget", "(ZJLjava/lang/Integer;)Z", "weight", "setWeightTarget", "sleep", "setSleepTarget", "getTargets", "interval", "setAlldayHeartRate", "getHeartRateInterval", "type", "", "percents", "zones", "restHR", "setHeartRateZoneSync", "setActivityMode", "getOffWristLockState", "stand", "setStandTarget", "activity", "setActivityTarget", "setInComingCallDisplayContacts", "readInComingCallDisplayContacts", "setSmsDisplayContacts", "readSmsDisplayContacts", "setSleepingBloodPressureMonitor", "Lcom/xiaomi/hm/health/bt/model/HMAutoBacklightInfo;", "setNightMode", "disableHid", "isHidDisable", "getLockStatus", "getSleepingBloodPressureMonitor", "getAutoOtaAtNightSwitch", "open", "", "setAutoOtaAtNightSwitch", WifiSetActivity.KEY_CONNECT, "setHidConnect", "isHidConnect", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "settingsModule", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsCallback;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsCallback;", "settingsCallback", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;Lcom/huami/bluetooth/profile/channel/module/settings/SettingsCallback;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class SettingsImpl implements SettingsApi, IGeneralOperator {

    @NotNull
    private static final String c = "SettingsImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SettingsModule settingsModule;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SettingsCallback settingsCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMAlertMode.values().length];
            iArr[HMAlertMode.ALERT_INCALL.ordinal()] = 1;
            iArr[HMAlertMode.ALERT_SMS.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000j\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0003H\n"}, d2 = {"Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<HashMap<SettingsGroupType, Settings>> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, int i) {
            super(0);
            this.a = z;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final HashMap<SettingsGroupType, Settings> invoke() {
            EnumData enumData = new EnumData(this.a ? this.b : 0);
            Health healthNewInstance$default = Health.Companion.newInstance$default(Health.INSTANCE, null, null, 3, null);
            if (healthNewInstance$default == null) {
                return null;
            }
            healthNewInstance$default.setHrAllayDetectionFrequency(enumData);
            return healthNewInstance$default.toMap();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000j\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0003H\n"}, d2 = {"Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<HashMap<SettingsGroupType, Settings>> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final HashMap<SettingsGroupType, Settings> invoke() {
            String str = this.a;
            if (str == null || m.isBlank(str)) {
                return null;
            }
            General general = new General();
            general.setDateDisplayStyle(new StringData(this.a));
            return general.toMap();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000j\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0003H\n"}, d2 = {"Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<HashMap<SettingsGroupType, Settings>> {
        public final /* synthetic */ byte a;
        public final /* synthetic */ byte[] b;
        public final /* synthetic */ byte[] c;
        public final /* synthetic */ byte d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(byte b, byte[] bArr, byte[] bArr2, byte b2) {
            super(0);
            this.a = b;
            this.b = bArr;
            this.c = bArr2;
            this.d = b2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final HashMap<SettingsGroupType, Settings> invoke() {
            Sport sport = new Sport();
            sport.setReserveHeartRateMode(new EnumData(this.a & 255));
            byte[] bArr = this.b;
            int length = bArr.length;
            ArrayList arrayList = new ArrayList(bArr.length);
            for (byte b : bArr) {
                arrayList.add(Integer.valueOf(b & 255));
            }
            sport.setReserveHeartRateValueList(new IntegerArray(length, arrayList, null, null, null, null, false, 124, null));
            byte[] bArr2 = this.c;
            int length2 = bArr2.length;
            ArrayList arrayList2 = new ArrayList(bArr2.length);
            for (byte b2 : bArr2) {
                arrayList2.add(Integer.valueOf(b2 & 255));
            }
            sport.setMaximumHeartRateValueList(new IntegerArray(length2, arrayList2, null, null, null, null, false, 124, null));
            byte b3 = this.d;
            if (b3 > 0) {
                sport.setRestHeartRate(new IntData(this.d & 255));
            } else {
                Debug.fi(SettingsImpl.c, Intrinsics.stringPlus("warning: resetHR: ", Byte.valueOf(b3)));
            }
            return sport.toMap();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000j\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0003H\n"}, d2 = {"Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<HashMap<SettingsGroupType, Settings>> {
        public final /* synthetic */ HMHrReminder a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HMHrReminder hMHrReminder) {
            super(0);
            this.a = hMHrReminder;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final HashMap<SettingsGroupType, Settings> invoke() {
            EnumData enumData = new EnumData(this.a.isEnable() ? this.a.getHr() : 0);
            Health healthNewInstance$default = Health.Companion.newInstance$default(Health.INSTANCE, null, null, 3, null);
            if (healthNewInstance$default == null) {
                return null;
            }
            healthNewInstance$default.setHrTooHighRemindValue(enumData);
            return healthNewInstance$default.toMap();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000j\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0003H\n"}, d2 = {"Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<HashMap<SettingsGroupType, Settings>> {
        public final /* synthetic */ HMHrReminder a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(HMHrReminder hMHrReminder) {
            super(0);
            this.a = hMHrReminder;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final HashMap<SettingsGroupType, Settings> invoke() {
            EnumData enumData = new EnumData(this.a.isEnable() ? this.a.getHr() : 0);
            Health healthNewInstance$default = Health.Companion.newInstance$default(Health.INSTANCE, null, null, 3, null);
            if (healthNewInstance$default == null) {
                return null;
            }
            healthNewInstance$default.setHrTooLowRemindValue(enumData);
            return healthNewInstance$default.toMap();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000j\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0003H\n"}, d2 = {"Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<HashMap<SettingsGroupType, Settings>> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final HashMap<SettingsGroupType, Settings> invoke() {
            EnumData enumData = new EnumData(!this.a ? 1 : 0);
            General general = new General();
            general.setMileageUnit(enumData);
            return general.toMap();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000j\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0003H\n"}, d2 = {"Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<HashMap<SettingsGroupType, Settings>> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final HashMap<SettingsGroupType, Settings> invoke() {
            EnumData enumData = new EnumData(!this.a ? 1 : 0);
            General general = new General();
            general.setTimeFormat(enumData);
            return general.toMap();
        }
    }

    public SettingsImpl(@NotNull SettingsModule settingsModule, @NotNull SettingsCallback settingsCallback) {
        this.settingsModule = settingsModule;
        this.settingsCallback = settingsCallback;
    }

    private final General a(HMDisconnectRemindConfig hMDisconnectRemindConfig) {
        General general = new General();
        general.setConnLostRemindSwitch(Boolean.valueOf(hMDisconnectRemindConfig.isEnable()));
        general.setConnLostRemindStartTime(new Time(hMDisconnectRemindConfig.getStartHour(), hMDisconnectRemindConfig.getStartMinute()));
        general.setConnLostRemindStopTime(new Time(hMDisconnectRemindConfig.getStopHour(), hMDisconnectRemindConfig.getStopMinute()));
        return general;
    }

    private final ArrayList<Integer> b() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Health.Companion companion = Health.INSTANCE;
        arrayList.add(Integer.valueOf(companion.getKEY_STAND_UP_REMIND_SWITCH()));
        arrayList.add(Integer.valueOf(companion.getKEY_STAND_UP_REMIND_START_TIME()));
        arrayList.add(Integer.valueOf(companion.getKEY_STAND_UP_REMIND_STOP_TIME()));
        arrayList.add(Integer.valueOf(companion.getKEY_MIDDY_REST_DND_SWITCH()));
        arrayList.add(Integer.valueOf(companion.getKEY_MIDDY_REST_START_TIME()));
        arrayList.add(Integer.valueOf(companion.getKEY_MIDDY_REST_STOP_TIME()));
        return arrayList;
    }

    private final ArrayList<Integer> c() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Health.Companion companion = Health.INSTANCE;
        arrayList.add(Integer.valueOf(companion.getKEY_TARGET_ACHIEVE_REMIND_SWITCH()));
        arrayList.add(Integer.valueOf(companion.getKEY_STEP_TARGET()));
        arrayList.add(Integer.valueOf(companion.getKEY_CALORIE_TARGET()));
        arrayList.add(Integer.valueOf(companion.getKEY_WEIGHT_TARGET()));
        arrayList.add(Integer.valueOf(companion.getKEY_SLEEP_TARGET()));
        return arrayList;
    }

    private final HashMap<SettingsGroupType, Settings> d(Settings settings) {
        HashMap<SettingsGroupType, Settings> map = new HashMap<>();
        map.put(settings.getGroupType(), settings);
        return map;
    }

    private final StandAlertConfig e(Health health) {
        Boolean standUpRemindSwitch = health.getStandUpRemindSwitch();
        Time standUpRemindStartTime = health.getStandUpRemindStartTime();
        Time standUpRemindStopTime = health.getStandUpRemindStopTime();
        Boolean middyRestDndSwitch = health.getMiddyRestDndSwitch();
        Time middyRestStartTime = health.getMiddyRestStartTime();
        Time middyRestStopTime = health.getMiddyRestStopTime();
        if (standUpRemindSwitch != null && standUpRemindStartTime != null && standUpRemindStopTime != null && middyRestDndSwitch != null && middyRestStartTime != null && middyRestStopTime != null) {
            return new StandAlertConfig(standUpRemindSwitch.booleanValue(), 60, standUpRemindStartTime, standUpRemindStopTime, middyRestDndSwitch.booleanValue(), middyRestStartTime, middyRestStopTime);
        }
        Debug.fi(c, "health2StandAlertConfig all null");
        return null;
    }

    private final HMTarget f(Health health) {
        Boolean targetAchieveRemindSwitch = health.getTargetAchieveRemindSwitch();
        IntPrimaryData stepTarget = health.getStepTarget();
        Long lValueOf = stepTarget == null ? null : Long.valueOf(stepTarget.getValue());
        IntData calorieTarget = health.getCalorieTarget();
        Long lValueOf2 = calorieTarget == null ? null : Long.valueOf(calorieTarget.getValue());
        IntData weightTarget = health.getWeightTarget();
        Long lValueOf3 = weightTarget == null ? null : Long.valueOf(weightTarget.getValue());
        IntData sleepTarget = health.getSleepTarget();
        Long lValueOf4 = sleepTarget == null ? null : Long.valueOf(sleepTarget.getValue());
        Debug.fi(c, "healthTarget query result: reminderSwitch=" + targetAchieveRemindSwitch + ", stepTarget=" + lValueOf + ", colorieTarget=" + lValueOf2 + ", weightTarget=" + lValueOf3 + ", sleepData=" + lValueOf4);
        if (targetAchieveRemindSwitch != null || lValueOf != null || lValueOf2 != null || lValueOf3 != null || lValueOf4 != null) {
            return new HMTarget(targetAchieveRemindSwitch, lValueOf, targetAchieveRemindSwitch, lValueOf2, null, null, targetAchieveRemindSwitch, lValueOf3, targetAchieveRemindSwitch, lValueOf4, null, null, null, null, 15360, null);
        }
        Debug.fi(c, "health2Target all null");
        return null;
    }

    private final BaseResourceInfo g(String info) {
        Pair<Integer, Integer> pairH;
        if (info == null || (pairH = h(info)) == null) {
            return null;
        }
        BaseResourceInfo baseResourceInfo = new BaseResourceInfo();
        baseResourceInfo.setVersion(pairH.getFirst().intValue());
        baseResourceInfo.setFlag(pairH.getSecond().intValue());
        return baseResourceInfo;
    }

    private final Pair<Integer, Integer> h(String info) {
        Object objM3845constructorimpl;
        if (info == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) info, new String[]{","}, false, 0, 6, (Object) null);
            objM3845constructorimpl = Result.m3845constructorimpl(new Pair(Integer.valueOf(Integer.parseInt((String) listSplit$default.get(0))), Integer.valueOf(Integer.parseInt((String) listSplit$default.get(1)))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            Debug.fi(c, Intrinsics.stringPlus("parseVersionFlag: ", thM3848exceptionOrNullimpl));
        }
        return (Pair) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
    }

    private final Health i(StandAlertConfig standAlertConfig) {
        Health healthNewInstance$default = Health.Companion.newInstance$default(Health.INSTANCE, null, null, 3, null);
        if (healthNewInstance$default == null) {
            return null;
        }
        healthNewInstance$default.setStandUpRemindSwitch(Boolean.valueOf(standAlertConfig.getEnable()));
        healthNewInstance$default.setStandUpRemindStartTime(standAlertConfig.getStartTime());
        healthNewInstance$default.setStandUpRemindStopTime(standAlertConfig.getEndTime());
        healthNewInstance$default.setMiddyRestDndSwitch(Boolean.valueOf(standAlertConfig.getEnableDnd()));
        healthNewInstance$default.setMiddyRestStartTime(standAlertConfig.getDndStartTime());
        healthNewInstance$default.setMiddyRestStopTime(standAlertConfig.getDndEndTime());
        return healthNewInstance$default;
    }

    private final General j(HMSilentConfig hMSilentConfig) {
        int i;
        General general = new General();
        if (hMSilentConfig.isEnable()) {
            i = hMSilentConfig.isSmart() ? 1 : 2;
        } else {
            i = 0;
        }
        general.setDndMode(new EnumData(i));
        general.setDndStartTime(new Time(hMSilentConfig.getStartHour(), hMSilentConfig.getStartMinute()));
        general.setDndStopTime(new Time(hMSilentConfig.getStopHour(), hMSilentConfig.getStopMinute()));
        general.setWristBrightInDNDSwitch(Boolean.valueOf(hMSilentConfig.isEnableWristLift()));
        return general;
    }

    private final Health k(HMTarget hMTarget, Integer num) {
        if (hMTarget.getStepTarget() != null && num == null) {
            Debug.fi(c, "stepTarget: " + hMTarget.getStepTarget() + ", settingsVersion null!");
            return null;
        }
        Health healthNewInstance = Health.INSTANCE.newInstance(hMTarget.getStepTarget(), num);
        if (healthNewInstance == null) {
            return null;
        }
        Boolean stepRemind = hMTarget.getStepRemind();
        Boolean bool = Boolean.TRUE;
        healthNewInstance.setTargetAchieveRemindSwitch(Boolean.valueOf(Intrinsics.areEqual(stepRemind, bool) || Intrinsics.areEqual(hMTarget.getCalorieRemind(), bool) || Intrinsics.areEqual(hMTarget.getWeightRemind(), bool) || Intrinsics.areEqual(hMTarget.getSleepRemind(), bool) || Intrinsics.areEqual(hMTarget.getStandRemind(), bool) || Intrinsics.areEqual(hMTarget.getActivityRemind(), bool)));
        Long calorieTarget = hMTarget.getCalorieTarget();
        if (calorieTarget != null) {
            healthNewInstance.setCalorieTarget(new IntData((int) calorieTarget.longValue()));
        }
        Long weightTarget = hMTarget.getWeightTarget();
        if (weightTarget != null) {
            healthNewInstance.setWeightTarget(new IntData((int) weightTarget.longValue()));
        }
        Long sleepTarget = hMTarget.getSleepTarget();
        if (sleepTarget != null) {
            healthNewInstance.setSleepTarget(new IntData((int) sleepTarget.longValue()));
        }
        Long standTarget = hMTarget.getStandTarget();
        if (standTarget != null) {
            healthNewInstance.setStandTarget(new IntData((int) standTarget.longValue()));
        }
        Long activityTarget = hMTarget.getActivityTarget();
        if (activityTarget != null) {
            healthNewInstance.setActivityTarget(new IntData((int) activityTarget.longValue()));
        }
        return healthNewInstance;
    }

    public static /* synthetic */ Health l(SettingsImpl settingsImpl, HMTarget hMTarget, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        return settingsImpl.k(hMTarget, num);
    }

    private final boolean m(Settings settings) {
        if (this.settingsCallback.connected()) {
            return this.settingsModule.writeSettingSync(settings == null ? null : settings.toMap());
        }
        return false;
    }

    private final boolean n(Function0<? extends HashMap<SettingsGroupType, Settings>> action) {
        if (this.settingsCallback.connected()) {
            return this.settingsModule.writeSettingSync(action.invoke());
        }
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean disableHid(boolean disable) {
        General general = new General();
        general.setDisableHid(Boolean.valueOf(disable));
        Unit unit = Unit.INSTANCE;
        return m(general);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean enableAtrialAlertSleepNotDisturb(boolean enable) {
        Settings settings = null;
        Health healthNewInstance$default = Health.Companion.newInstance$default(Health.INSTANCE, null, null, 3, null);
        if (healthNewInstance$default != null) {
            healthNewInstance$default.setHeartHealthyRemindDndInSleepSwitch(Boolean.valueOf(enable));
            Unit unit = Unit.INSTANCE;
            settings = healthNewInstance$default;
        }
        return m(settings);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean enableAtrialFib(boolean enable) {
        Settings settings = null;
        Health healthNewInstance$default = Health.Companion.newInstance$default(Health.INSTANCE, null, null, 3, null);
        if (healthNewInstance$default != null) {
            healthNewInstance$default.setHeartHealthyMonitorSwitch(Boolean.valueOf(enable));
            Unit unit = Unit.INSTANCE;
            settings = healthNewInstance$default;
        }
        return m(settings);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean enableHrBroadcast(boolean enable) {
        Settings settings = null;
        Health healthNewInstance$default = Health.Companion.newInstance$default(Health.INSTANCE, null, null, 3, null);
        if (healthNewInstance$default != null) {
            healthNewInstance$default.setHrAdvertisementInActiveSwitch(Boolean.valueOf(enable));
            Unit unit = Unit.INSTANCE;
            settings = healthNewInstance$default;
        }
        return m(settings);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean enableHrSleep(boolean enable) {
        Settings settings = null;
        Health healthNewInstance$default = Health.Companion.newInstance$default(Health.INSTANCE, null, null, 3, null);
        if (healthNewInstance$default != null) {
            healthNewInstance$default.setScientificSleepSwitch(Boolean.valueOf(enable));
            Unit unit = Unit.INSTANCE;
            settings = healthNewInstance$default;
        }
        return m(settings);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean enableOsa(boolean enable) {
        Settings settings = null;
        Health healthNewInstance$default = Health.Companion.newInstance$default(Health.INSTANCE, null, null, 3, null);
        if (healthNewInstance$default != null) {
            healthNewInstance$default.setOsaSwitch(Boolean.valueOf(enable));
            Unit unit = Unit.INSTANCE;
            settings = healthNewInstance$default;
        }
        return m(settings);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean enablePressure(boolean enable) {
        Settings settings = null;
        Health healthNewInstance$default = Health.Companion.newInstance$default(Health.INSTANCE, null, null, 3, null);
        if (healthNewInstance$default != null) {
            healthNewInstance$default.setAllDayPressureSwitch(Boolean.valueOf(enable));
            Unit unit = Unit.INSTANCE;
            settings = healthNewInstance$default;
        }
        return m(settings);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean enablePressureAlert(boolean enable) {
        Settings settings = null;
        Health healthNewInstance$default = Health.Companion.newInstance$default(Health.INSTANCE, null, null, 3, null);
        if (healthNewInstance$default != null) {
            healthNewInstance$default.setRelievePressureRemindSwitch(Boolean.valueOf(enable));
            Unit unit = Unit.INSTANCE;
            settings = healthNewInstance$default;
        }
        return m(settings);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean enableSportHeartRate(boolean enable) {
        Settings settings = null;
        Health healthNewInstance$default = Health.Companion.newInstance$default(Health.INSTANCE, null, null, 3, null);
        if (healthNewInstance$default != null) {
            healthNewInstance$default.setHrActivityMonitorSwitch(Boolean.valueOf(enable));
            Unit unit = Unit.INSTANCE;
            settings = healthNewInstance$default;
        }
        return m(settings);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean enableSwimLog(boolean enable) {
        Sport sport = new Sport();
        sport.setSwimLogSwitch(Boolean.valueOf(enable));
        Unit unit = Unit.INSTANCE;
        return m(sport);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public Boolean getAtrialAlertSleepNotDisturbEnable() {
        if ((this.settingsCallback.connected() ? this : null) == null) {
            return null;
        }
        Settings settingsQueryFieldsSync = this.settingsModule.queryFieldsSync(false, SettingsGroupType.HEALTH, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(Health.INSTANCE.getKEY_HEART_HEALTHY_REMIND_DND_IN_SLEEP_SWITCH())));
        Health health = settingsQueryFieldsSync instanceof Health ? (Health) settingsQueryFieldsSync : null;
        if (health == null) {
            return null;
        }
        return health.getHeartHealthyRemindDndInSleepSwitch();
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public Boolean getAtrialFibEnable() {
        if ((this.settingsCallback.connected() ? this : null) == null) {
            return null;
        }
        Settings settingsQueryFieldsSync = this.settingsModule.queryFieldsSync(false, SettingsGroupType.HEALTH, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(Health.INSTANCE.getKEY_HEART_HEALTHY_MONITOR_SWITCH())));
        Health health = settingsQueryFieldsSync instanceof Health ? (Health) settingsQueryFieldsSync : null;
        if (health == null) {
            return null;
        }
        return health.getHeartHealthyMonitorSwitch();
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public Boolean getAutoOtaAtNightSwitch() {
        if (!this.settingsCallback.connected()) {
            return null;
        }
        Settings settingsQueryFieldsSync = this.settingsModule.queryFieldsSync(false, SettingsGroupType.GENERAL, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(General.INSTANCE.getKEY_AUTO_OTA_AT_NIGHT_SWITCH())));
        General general = settingsQueryFieldsSync instanceof General ? (General) settingsQueryFieldsSync : null;
        if (general == null) {
            return null;
        }
        return general.getAutoOtaAtNightSwitch();
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public HMOtherVersion getDeviceInfoSync(@NotNull HMDeviceSource source) {
        Pair<Integer, Integer> pairH;
        Pair<Integer, Integer> pairH2;
        Pair<Integer, Integer> pairH3;
        SettingsModule settingsModule = this.settingsModule;
        SettingsGroupType settingsGroupType = SettingsGroupType.DEVICE_INFORMATION;
        SettingsGroupType settingsGroupType2 = SettingsGroupType.LANGUAGE;
        HashMap<SettingsGroupType, Settings> mapQuerySettingsSync = settingsModule.querySettingsSync(false, new SettingsGroupType[]{settingsGroupType, settingsGroupType2});
        if (mapQuerySettingsSync == null) {
            return null;
        }
        Settings settings = mapQuerySettingsSync.get(settingsGroupType);
        DeviceInformation deviceInformation = settings instanceof DeviceInformation ? (DeviceInformation) settings : null;
        if (deviceInformation == null) {
            return null;
        }
        HMOtherVersion hMOtherVersion = new HMOtherVersion();
        IntData upgradeOrder = deviceInformation.getUpgradeOrder();
        if (upgradeOrder != null) {
            hMOtherVersion.setVersion(upgradeOrder.getValue());
        }
        Flag languageFamily = deviceInformation.getLanguageFamily();
        if (languageFamily != null) {
            hMOtherVersion.setFwFlag(languageFamily.getFlag());
        }
        StringData baseResourceVersion = deviceInformation.getBaseResourceVersion();
        if (baseResourceVersion != null) {
            hMOtherVersion.setBaseResourceInfo(g(baseResourceVersion.getStringData()));
        }
        EnumData systemImageStatus = deviceInformation.getSystemImageStatus();
        if (systemImageStatus != null) {
            hMOtherVersion.setSystemImageStatus(SystemImageStatus.INSTANCE.fromValue(systemImageStatus.getValue()));
        }
        StringData increaseResourceVersion = deviceInformation.getIncreaseResourceVersion();
        if (increaseResourceVersion != null && (pairH3 = h(increaseResourceVersion.getStringData())) != null) {
            hMOtherVersion.setResourceVersion(pairH3.getFirst().intValue());
            hMOtherVersion.setResourceFlag(pairH3.getSecond().intValue());
        }
        StringData fontVersion = deviceInformation.getFontVersion();
        if (fontVersion != null && (pairH2 = h(fontVersion.getStringData())) != null) {
            hMOtherVersion.setFontVersion(pairH2.getFirst().intValue());
            hMOtherVersion.setFontFlag(pairH2.getSecond().intValue());
        }
        StringData externalResourceVersion = deviceInformation.getExternalResourceVersion();
        if (externalResourceVersion != null && (pairH = h(externalResourceVersion.getStringData())) != null) {
            hMOtherVersion.setExternalResourceInfo(new ExternalResourceInfo(pairH.getFirst().intValue(), pairH.getSecond().intValue()));
        }
        StringData gpsFirmwareVersion = deviceInformation.getGpsFirmwareVersion();
        if (gpsFirmwareVersion != null) {
            hMOtherVersion.setGpsVersion(gpsFirmwareVersion.getStringData());
        }
        Flag aGpsType = deviceInformation.getAGpsType();
        if (aGpsType != null) {
            hMOtherVersion.setAGpsType(Integer.valueOf(aGpsType.getFlag()));
        }
        TimeStamp aGpsUpgradeTime = deviceInformation.getAGpsUpgradeTime();
        if (aGpsUpgradeTime != null) {
            hMOtherVersion.setAGpsUpgradeTime(Long.valueOf(aGpsUpgradeTime.getTimeStamp()));
        }
        TimeStamp aGpsExpirationTime = deviceInformation.getAGpsExpirationTime();
        if (aGpsExpirationTime != null) {
            hMOtherVersion.setAGpsExpirationTime(Long.valueOf(aGpsExpirationTime.getTimeStamp()));
        }
        hMOtherVersion.setDomesticProduct(deviceInformation.isDomesticProduct());
        hMOtherVersion.setDifferentialPackageOtaMark(deviceInformation.getDifferentialPackageOtaMark());
        EnumData languageEnum = SettingsLanguage.INSTANCE.getLanguageEnum(mapQuerySettingsSync.get(settingsGroupType2));
        if (languageEnum != null) {
            hMOtherVersion.setLanguage(new HMLanguage(languageEnum.getValue()));
        }
        return hMOtherVersion;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public Integer getHeartRateInterval() {
        EnumData hrAllayDetectionFrequency;
        if ((this.settingsCallback.connected() ? this : null) == null) {
            return null;
        }
        Settings settingsQueryFieldsSync = this.settingsModule.queryFieldsSync(false, SettingsGroupType.HEALTH, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(Health.INSTANCE.getKEY_HR_ALL_DAY_DETECTION_FREQUENCY())));
        Health health = settingsQueryFieldsSync instanceof Health ? (Health) settingsQueryFieldsSync : null;
        if (health == null || (hrAllayDetectionFrequency = health.getHrAllayDetectionFrequency()) == null) {
            return null;
        }
        return Integer.valueOf(hrAllayDetectionFrequency.getValue());
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public HidStatus getHidStatus() {
        if (!this.settingsCallback.connected()) {
            return null;
        }
        Connection connection = (Connection) this.settingsModule.queryFieldsSync(false, SettingsGroupType.CONNECTION, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(Connection.INSTANCE.getKEY_HID_SWITCH())));
        Boolean hidSwitch = connection == null ? null : connection.getHidSwitch();
        if (hidSwitch == null) {
            return null;
        }
        return hidSwitch.booleanValue() ? new HidStatus.HidConnect() : new HidStatus.HidDisconnect();
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public HMHrReminder getHighHrReminder() {
        EnumData hrTooHighRemindValue;
        HMHrReminder hMHrReminder = null;
        if ((this.settingsCallback.connected() ? this : null) != null) {
            Settings settingsQueryFieldsSync = this.settingsModule.queryFieldsSync(false, SettingsGroupType.HEALTH, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(Health.INSTANCE.getKEY_HR_TOO_HIGH_REMIND_VALUE())));
            Health health = settingsQueryFieldsSync instanceof Health ? (Health) settingsQueryFieldsSync : null;
            if (health != null && (hrTooHighRemindValue = health.getHrTooHighRemindValue()) != null) {
                int value = hrTooHighRemindValue.getValue();
                hMHrReminder = new HMHrReminder(value > 0);
                hMHrReminder.setHr(value);
            }
        }
        return hMHrReminder;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public Boolean getHrSleepEnable() {
        if ((this.settingsCallback.connected() ? this : null) == null) {
            return null;
        }
        Settings settingsQueryFieldsSync = this.settingsModule.queryFieldsSync(false, SettingsGroupType.HEALTH, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(Health.INSTANCE.getKEY_SCIENTIFIC_SLEEP_SWITCH())));
        Health health = settingsQueryFieldsSync instanceof Health ? (Health) settingsQueryFieldsSync : null;
        if (health == null) {
            return null;
        }
        return health.getScientificSleepSwitch();
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public Boolean getLockStatus() {
        if (!this.settingsCallback.connected()) {
            return null;
        }
        Settings settingsQueryFieldsSync = this.settingsModule.queryFieldsSync(false, SettingsGroupType.DEVICE_INFORMATION, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(DeviceInformation.INSTANCE.getKEY_LOCK_STATUS())));
        DeviceInformation deviceInformation = settingsQueryFieldsSync instanceof DeviceInformation ? (DeviceInformation) settingsQueryFieldsSync : null;
        if (deviceInformation == null) {
            return null;
        }
        return deviceInformation.getLockStatus();
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public HMHrReminder getLowHrReminder() {
        EnumData hrTooLowRemindValue;
        HMHrReminder hMHrReminder = null;
        if ((this.settingsCallback.connected() ? this : null) != null) {
            Settings settingsQueryFieldsSync = this.settingsModule.queryFieldsSync(false, SettingsGroupType.HEALTH, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(Health.INSTANCE.getKEY_HR_TOO_LOW_REMIND_VALUE())));
            Health health = settingsQueryFieldsSync instanceof Health ? (Health) settingsQueryFieldsSync : null;
            if (health != null && (hrTooLowRemindValue = health.getHrTooLowRemindValue()) != null) {
                int value = hrTooLowRemindValue.getValue();
                hMHrReminder = new HMHrReminder(value > 0);
                hMHrReminder.setHr(value);
            }
        }
        return hMHrReminder;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public Integer getLowSpo2Alert() {
        EnumData spo2LowLevelRemindValue;
        if ((this.settingsCallback.connected() ? this : null) == null) {
            return null;
        }
        Settings settingsQueryFieldsSync = this.settingsModule.queryFieldsSync(false, SettingsGroupType.HEALTH, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(Health.INSTANCE.getKEY_SPO2_LOW_LEVEL_REMIND_VALUE())));
        Health health = settingsQueryFieldsSync instanceof Health ? (Health) settingsQueryFieldsSync : null;
        if (health == null || (spo2LowLevelRemindValue = health.getSpo2LowLevelRemindValue()) == null) {
            return null;
        }
        return Integer.valueOf(spo2LowLevelRemindValue.getValue());
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @NotNull
    public Boolean getOffWristLockState() {
        Boolean bool;
        boolean zBooleanValue = false;
        if (this.settingsCallback.connected()) {
            Settings settingsQueryFieldsSync = this.settingsModule.queryFieldsSync(false, SettingsGroupType.SCREEN_UNLOCK_AND_PASSWORD, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(ScreenLockAndPassword.INSTANCE.getKEY_SWITCH())));
            ScreenLockAndPassword screenLockAndPassword = settingsQueryFieldsSync instanceof ScreenLockAndPassword ? (ScreenLockAndPassword) settingsQueryFieldsSync : null;
            if (screenLockAndPassword != null && (bool = screenLockAndPassword.getSwitch()) != null) {
                zBooleanValue = bool.booleanValue();
            }
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public Boolean getOsaEnable() {
        if ((this.settingsCallback.connected() ? this : null) == null) {
            return null;
        }
        Settings settingsQueryFieldsSync = this.settingsModule.queryFieldsSync(false, SettingsGroupType.HEALTH, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(Health.INSTANCE.getKEY_OSA_SWITCH())));
        Health health = settingsQueryFieldsSync instanceof Health ? (Health) settingsQueryFieldsSync : null;
        if (health == null) {
            return null;
        }
        return health.getOsaSwitch();
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public Boolean getPressureAlertEnable() {
        if ((this.settingsCallback.connected() ? this : null) == null) {
            return null;
        }
        Settings settingsQueryFieldsSync = this.settingsModule.queryFieldsSync(false, SettingsGroupType.HEALTH, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(Health.INSTANCE.getKEY_RELIEVE_PRESSURE_REMIND_SWITCH())));
        Health health = settingsQueryFieldsSync instanceof Health ? (Health) settingsQueryFieldsSync : null;
        if (health == null) {
            return null;
        }
        return health.getRelievePressureRemindSwitch();
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public Boolean getPressureEnable() {
        if ((this.settingsCallback.connected() ? this : null) == null) {
            return null;
        }
        Settings settingsQueryFieldsSync = this.settingsModule.queryFieldsSync(false, SettingsGroupType.HEALTH, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(Health.INSTANCE.getKEY_ALL_DAY_PRESSURE_SWITCH())));
        Health health = settingsQueryFieldsSync instanceof Health ? (Health) settingsQueryFieldsSync : null;
        if (health == null) {
            return null;
        }
        return health.getAllDayPressureSwitch();
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public Boolean getSleepingBloodPressureMonitor() {
        if ((this.settingsCallback.connected() ? this : null) == null) {
            return null;
        }
        Settings settingsQueryFieldsSync = this.settingsModule.queryFieldsSync(false, SettingsGroupType.HEALTH, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(Health.INSTANCE.getKEY_SLEEP_BLOOD_PRESSURE_MONITOR())));
        Health health = settingsQueryFieldsSync instanceof Health ? (Health) settingsQueryFieldsSync : null;
        if (health == null) {
            return null;
        }
        return health.getBloodPressureMonitorSwitch();
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public Boolean getSmartSpo2() {
        if ((this.settingsCallback.connected() ? this : null) == null) {
            return null;
        }
        Settings settingsQueryFieldsSync = this.settingsModule.queryFieldsSync(false, SettingsGroupType.HEALTH, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(Health.INSTANCE.getKEY_SMART_SPO2_MONITOR_SWITCH())));
        Health health = settingsQueryFieldsSync instanceof Health ? (Health) settingsQueryFieldsSync : null;
        if (health == null) {
            return null;
        }
        return health.getSmartSpo2MonitorSwitch();
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public Boolean getSportHeartRate() {
        if ((this.settingsCallback.connected() ? this : null) == null) {
            return null;
        }
        Settings settingsQueryFieldsSync = this.settingsModule.queryFieldsSync(false, SettingsGroupType.HEALTH, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(Health.INSTANCE.getKEY_HR_ACTIVITY_MONITOR_SWITCH())));
        Health health = settingsQueryFieldsSync instanceof Health ? (Health) settingsQueryFieldsSync : null;
        if (health == null) {
            return null;
        }
        return health.getHrActivityMonitorSwitch();
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public StandAlertConfig getStandAlertConfig() {
        if (!this.settingsCallback.connected()) {
            return null;
        }
        Settings settingsQueryFieldsSync = this.settingsModule.queryFieldsSync(false, SettingsGroupType.HEALTH, b());
        Health health = settingsQueryFieldsSync instanceof Health ? (Health) settingsQueryFieldsSync : null;
        if (health == null) {
            return null;
        }
        return e(health);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public int getSwimLogSwitch() {
        Sport sport;
        Boolean swimLogSwitch;
        if (!this.settingsCallback.connected() || (sport = (Sport) this.settingsModule.queryFieldsSync(false, SettingsGroupType.SPORT, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(Sport.INSTANCE.getKEY_SWIM_LOG_SWITCH())))) == null || (swimLogSwitch = sport.getSwimLogSwitch()) == null) {
            return -1;
        }
        return ByteUtilsKt.toInt(swimLogSwitch.booleanValue());
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public HMTarget getTargets() {
        if (!this.settingsCallback.connected()) {
            return null;
        }
        Settings settingsQueryFieldsSync = this.settingsModule.queryFieldsSync(false, SettingsGroupType.HEALTH, c());
        Health health = settingsQueryFieldsSync instanceof Health ? (Health) settingsQueryFieldsSync : null;
        if (health == null) {
            return null;
        }
        return f(health);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean isContactShow(@NotNull HMAlertMode mode) {
        Boolean inComingCallDisplayContacts;
        int i = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        if (i != 1) {
            if (i == 2 && (inComingCallDisplayContacts = readInComingCallDisplayContacts()) != null) {
                return inComingCallDisplayContacts.booleanValue();
            }
            return false;
        }
        Boolean smsDisplayContacts = readSmsDisplayContacts();
        if (smsDisplayContacts == null) {
            return false;
        }
        return smsDisplayContacts.booleanValue();
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public Boolean isHidConnect() {
        if (!this.settingsCallback.connected()) {
            return null;
        }
        Settings settingsQueryFieldsSync = this.settingsModule.queryFieldsSync(false, SettingsGroupType.GENERAL, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(General.INSTANCE.getKEY_HID_CONNECT())));
        General general = settingsQueryFieldsSync instanceof General ? (General) settingsQueryFieldsSync : null;
        if (general == null) {
            return null;
        }
        return general.getHidConnect();
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public Boolean isHidDisable() {
        if (!this.settingsCallback.connected()) {
            return null;
        }
        Settings settingsQueryFieldsSync = this.settingsModule.queryFieldsSync(false, SettingsGroupType.GENERAL, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(General.INSTANCE.getKEY_DISABLE_HID())));
        General general = settingsQueryFieldsSync instanceof General ? (General) settingsQueryFieldsSync : null;
        if (general == null) {
            return null;
        }
        return general.getDisableHid();
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.entity.general.IGeneralOperator
    @Nullable
    public Boolean readInComingCallDisplayContacts() {
        if (!this.settingsCallback.connected()) {
            return null;
        }
        Settings settingsQueryFieldsSync = this.settingsModule.queryFieldsSync(false, SettingsGroupType.GENERAL, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(General.INSTANCE.getKEY_INCOMING_CALL_DISPLAY_CONTACTS_SWITCH())));
        General general = settingsQueryFieldsSync instanceof General ? (General) settingsQueryFieldsSync : null;
        if (general == null) {
            return null;
        }
        return general.getInComingCallDisplayContactsSwitch();
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.entity.general.IGeneralOperator
    @Nullable
    public Boolean readSmsDisplayContacts() {
        if (!this.settingsCallback.connected()) {
            return null;
        }
        Settings settingsQueryFieldsSync = this.settingsModule.queryFieldsSync(false, SettingsGroupType.GENERAL, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(General.INSTANCE.getKEY_SMS_DISPLAY_CONTACTS_SWITCH())));
        General general = settingsQueryFieldsSync instanceof General ? (General) settingsQueryFieldsSync : null;
        if (general == null) {
            return null;
        }
        return general.getSmsDisplayContactsSwitch();
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setActivityMode(int mode) {
        Settings settings = null;
        Health healthNewInstance$default = Health.Companion.newInstance$default(Health.INSTANCE, null, null, 3, null);
        if (healthNewInstance$default != null) {
            healthNewInstance$default.setActivityMode(new EnumData(mode));
            Unit unit = Unit.INSTANCE;
            settings = healthNewInstance$default;
        }
        return m(settings);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setActivityTarget(boolean remind, long activity) {
        return m(l(this, new HMTarget(null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(remind), Long.valueOf(activity), 4095, null), null, 1, null));
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setAlldayHeartRate(boolean enable, int interval) {
        return n(new a(enable, interval));
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public void setAutoOtaAtNightSwitch(boolean open) {
        General general = new General();
        general.setAutoOtaAtNightSwitch(Boolean.valueOf(open));
        Unit unit = Unit.INSTANCE;
        m(general);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setCalorieTarget(boolean remind, long calorie) {
        return m(l(this, new HMTarget(null, null, Boolean.valueOf(remind), Long.valueOf(calorie), null, null, null, null, null, null, null, null, null, null, 16371, null), null, 1, null));
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setConnectedAdvSwitch(boolean enable) {
        Connection connection = new Connection();
        connection.setConnectedAdvSwitch(Boolean.valueOf(enable));
        Unit unit = Unit.INSTANCE;
        return m(connection);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setDateDisplayStyle(@Nullable String format) {
        return n(new b(format));
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setDisconnectRemind(@Nullable HMDisconnectRemindConfig config) {
        return m(config == null ? null : a(config));
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setDistanceTarget(boolean remind, long distance) {
        Debug.fi(c, "设置距离目标只在旧协议上支持，但App并没有此设置，故Settings协议不支持！");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setHeartRateZoneSync(byte type, @NotNull byte[] percents, @NotNull byte[] zones, byte restHR) {
        return n(new c(type, percents, zones, restHR));
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setHidConnect(boolean connect) {
        General general = new General();
        general.setHidConnect(Boolean.valueOf(connect));
        Unit unit = Unit.INSTANCE;
        return m(general);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setHidStatus(@NotNull HidStatus hidStatus) {
        Connection connection = new Connection();
        connection.setMultiLinkSwitch(Boolean.valueOf(ByteUtilsKt.toBoolean((byte) hidStatus.getStatus())));
        Unit unit = Unit.INSTANCE;
        return m(connection);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setHighHrReminder(@NotNull HMHrReminder hrReminder) {
        return n(new d(hrReminder));
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setHourlyAnnounceSwitch(@NotNull NowTimeConfig nowTimeConfig) {
        return m(nowTimeConfig.getGeneral());
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.entity.general.IGeneralOperator
    public boolean setInComingCallDisplayContacts(boolean enable) {
        General general = new General();
        general.setInComingCallDisplayContactsSwitch(Boolean.valueOf(enable));
        Unit unit = Unit.INSTANCE;
        return m(general);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setLowHrReminder(@NotNull HMHrReminder hrReminder) {
        return n(new e(hrReminder));
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setLowSpo2Alert(int value) {
        Settings settings = null;
        Health healthNewInstance$default = Health.Companion.newInstance$default(Health.INSTANCE, null, null, 3, null);
        if (healthNewInstance$default != null) {
            healthNewInstance$default.setSpo2LowLevelRemindValue(new EnumData(value));
            Unit unit = Unit.INSTANCE;
            settings = healthNewInstance$default;
        }
        return m(settings);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setMileageUnit(boolean isMetric) {
        return n(new f(isMetric));
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setMultiLinkSwitch(boolean enable) {
        Connection connection = new Connection();
        connection.setMultiLinkSwitch(Boolean.valueOf(enable));
        Unit unit = Unit.INSTANCE;
        return m(connection);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setNightMode(@NotNull HMAutoBacklightInfo info) {
        General general = new General();
        int mode = info.getMode();
        int i = 2;
        if (mode != 1) {
            i = mode != 2 ? 0 : 1;
        }
        general.setNightMode(new EnumData(i));
        if (info.getMode() == 1) {
            general.setNightModeStartTime(new Time(info.getStartHour(), info.getStartMinute()));
            general.setNightModeStopTime(new Time(info.getStopHour(), info.getStopMinute()));
        }
        return m(general);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setOtherCalendar(byte calendar) {
        General general = new General();
        general.setOtherCalendar(new EnumData(calendar));
        Unit unit = Unit.INSTANCE;
        return m(general);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setRestrictedBindingSwitch(boolean disable) {
        Connection connection = new Connection();
        connection.setRestrictedBindingSwitch(Boolean.valueOf(disable));
        Unit unit = Unit.INSTANCE;
        return m(connection);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setSilent(@Nullable HMSilentConfig config) {
        return m(config == null ? null : j(config));
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setSleepTarget(boolean remind, long sleep) {
        return m(l(this, new HMTarget(null, null, null, null, null, null, null, null, Boolean.valueOf(remind), Long.valueOf(sleep), null, null, null, null, 15615, null), null, 1, null));
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setSleepingBloodPressureMonitor(boolean enable) {
        Settings settings = null;
        Health healthNewInstance$default = Health.Companion.newInstance$default(Health.INSTANCE, null, null, 3, null);
        if (healthNewInstance$default != null) {
            healthNewInstance$default.setBloodPressureMonitorSwitch(Boolean.valueOf(enable));
            Unit unit = Unit.INSTANCE;
            settings = healthNewInstance$default;
        }
        return m(settings);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setSmartSpo2(boolean enable) {
        Settings settings = null;
        Health healthNewInstance$default = Health.Companion.newInstance$default(Health.INSTANCE, null, null, 3, null);
        if (healthNewInstance$default != null) {
            healthNewInstance$default.setSmartSpo2MonitorSwitch(Boolean.valueOf(enable));
            Unit unit = Unit.INSTANCE;
            settings = healthNewInstance$default;
        }
        return m(settings);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.entity.general.IGeneralOperator
    public boolean setSmsDisplayContacts(boolean enable) {
        General general = new General();
        general.setSmsDisplayContactsSwitch(Boolean.valueOf(enable));
        Unit unit = Unit.INSTANCE;
        return m(general);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setSportRemindConfig(@Nullable SportRemindConfig config) {
        Debug.fi(c, "setSportRemindConfig接口在huamiOS中暂不需要实现！");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setStandAlertConfig(@NotNull StandAlertConfig config) {
        return m(i(config));
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setStandTarget(boolean remind, long stand) {
        return m(l(this, new HMTarget(null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(remind), Long.valueOf(stand), null, null, 13311, null), null, 1, null));
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setStepTarget(boolean remind, long step, @Nullable Integer settingsVersion) {
        return m(k(new HMTarget(Boolean.valueOf(remind), Long.valueOf(step), null, null, null, null, null, null, null, null, null, null, null, null, 16380, null), settingsVersion));
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setTargets(@NotNull HMTarget target, @Nullable Integer settingsVersion) {
        return m(k(target, settingsVersion));
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setTimeFormat(boolean is12Hour) {
        return n(new g(is12Hour));
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setWeeklyStartTime(byte dayOfWeek) {
        General general = new General();
        general.setWeeklyStartTime(new EnumData(dayOfWeek));
        Unit unit = Unit.INSTANCE;
        return m(general);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setWeightTarget(boolean remind, long weight) {
        return m(l(this, new HMTarget(null, null, null, null, null, null, Boolean.valueOf(remind), Long.valueOf(weight), null, null, null, null, null, null, 16191, null), null, 1, null));
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean showContactSync(@NotNull HMAlertMode mode, boolean show) {
        int i = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        if (i == 1) {
            return setInComingCallDisplayContacts(show);
        }
        if (i != 2) {
            return false;
        }
        return setSmsDisplayContacts(show);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.entity.general.IGeneralOperator
    public boolean startDevice() throws DeviceNotSupportStartDeviceException {
        SettingsModule settingsModule = this.settingsModule;
        SettingsGroupType settingsGroupType = SettingsGroupType.GENERAL;
        General.Companion companion = General.INSTANCE;
        Settings settingsQueryFieldsSync = settingsModule.queryFieldsSync(false, settingsGroupType, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(companion.getKEY_ENABLE_DEVICE())));
        if (settingsQueryFieldsSync == null) {
            throw new DeviceNotSupportStartDeviceException("Not support general settings");
        }
        Boolean bool = settingsQueryFieldsSync.getBoolean(companion.getKEY_ENABLE_DEVICE());
        if (bool == null) {
            throw new DeviceNotSupportStartDeviceException("No support start device");
        }
        if (bool.booleanValue()) {
            Debug.fi(c, "Device already enabled");
            return true;
        }
        General general = new General();
        general.setEnableDevice(Boolean.TRUE);
        Unit unit = Unit.INSTANCE;
        return m(general);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean stopDevice() {
        General general = new General();
        general.setEnableDevice(Boolean.FALSE);
        Unit unit = Unit.INSTANCE;
        return m(general);
    }
}
