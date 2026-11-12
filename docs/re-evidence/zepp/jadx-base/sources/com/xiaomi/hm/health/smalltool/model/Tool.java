package com.xiaomi.hm.health.smalltool.model;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.account.HMLoginManager;
import com.huami.account.utils.PolicyTipUtil;
import com.huami.assistant.ui.activity.AlarmListActivity;
import com.huami.assistant.ui.activity.SmartActivity;
import com.huami.assistant.ui.v2.ScheduleActivity;
import com.huami.bluetooth.profile.channel.module.find.FindDeviceWrapper;
import com.huami.devicex.injection.basic.MiuiFnApi;
import com.huami.discovery.bridge.util.NetUtil;
import com.huami.femalehealth.uilib.viewmodel.FemaleMifitViewModel;
import com.huami.sleepassistant.lib.ui.base.Navigator;
import com.huami.snore.ui.activity.SnoreMonitorActivity;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.device.config.DeviceFeature;
import com.huami.watch.companion.sync.ble.SyncBleUtil;
import com.huami.watch.companion.ui.activity.FindWatchActivity;
import com.huami.watch.companion.ui.activity.NotificationSettingActivity;
import com.huami.watch.companion.ui.activity.SportSettingActivity;
import com.huami.watch.companion.ui.activity.WidgetAndAppActivity;
import com.huami.watch.companion.unlock.UnlockScanHelper;
import com.huami.watch.companion.watchface.WatchFaceActivity;
import com.huami.watch.companion.watchface.XiHuWatchFaceManagerActivity;
import com.huami.watch.companion.ximalaya.XimaCategoryActivity;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.toast.IconToast;
import com.huami.worldclock.home.WorldClockActivity;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.bodyfat.activity.AddGuestActivity;
import com.xiaomi.hm.health.bodyfat.activity.BabyWeightActivity;
import com.xiaomi.hm.health.bodyfat.activity.BalanceDetailsActivity;
import com.xiaomi.hm.health.bodyfat.activity.ConnectScaleActivity;
import com.xiaomi.hm.health.bodyfat.activity.OneFootDetailActivity;
import com.xiaomi.hm.health.bodyfat.slimming.view.LoseWeightPlanEnterActivity;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMAppSortActivity;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMNewAppSortActivity;
import com.xiaomi.hm.health.device.HMNewToDoListActivity;
import com.xiaomi.hm.health.device.HMShortcutAppSortNewActivity;
import com.xiaomi.hm.health.device.HMShotcutAppSortActivity;
import com.xiaomi.hm.health.device.HmEarbudMusicActivity;
import com.xiaomi.hm.health.device.alarm.AlarmClockManager;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel;
import com.xiaomi.hm.health.device.settings.sport.MiliSportSettingActivity;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinManager;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinUtils;
import com.xiaomi.hm.health.di.koin.util.FemaleCheckUtil;
import com.xiaomi.hm.health.discovery.WebHelper;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.nfc.WalletActivity;
import com.xiaomi.hm.health.relation.RelationServiceKt;
import com.xiaomi.hm.health.smalltool.ToolNavigateActivity;
import com.xiaomi.hm.health.smalltool.model.INavigate;
import com.xiaomi.hm.health.ui.goal.ui.GoalSummaryActivity;
import com.xiaomi.hm.health.ui.smartplay.AppNotificationAlertActivity;
import com.xiaomi.hm.health.ui.smartplay.HuamiOSAlarmActivity;
import com.xiaomi.hm.health.ui.smartplay.MiBandAlarmActivity;
import com.xiaomi.hm.health.ui.smartplay.ScreenUnlockActivity;
import com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneActivity;
import com.xiaomi.hm.health.ui.smartplay.customvibrate.ui.VibrateTypeActivity;
import com.xiaomi.hm.health.ui.smartplay.eventremind.EventRemindActivity;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SpreadBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'SPORT_RUN' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b:\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B/\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b5\u00106B=\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u000f\u0012\f\u00107\u001a\b\u0012\u0004\u0012\u00020%0,¢\u0006\u0004\b5\u00108BK\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u000f\u0012\f\u00107\u001a\b\u0012\u0004\u0012\u00020%0,\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020%0,¢\u0006\u0004\b5\u00109BK\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u000f\u0012\f\u00107\u001a\b\u0012\u0004\u0012\u00020%0,\u0012\f\u00101\u001a\b\u0012\u0004\u0012\u0002000,¢\u0006\u0004\b5\u0010:BY\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u000f\u0012\f\u00107\u001a\b\u0012\u0004\u0012\u00020%0,\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020%0,\u0012\f\u00101\u001a\b\u0012\u0004\u0012\u0002000,¢\u0006\u0004\b5\u0010;Ba\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u000f\u0012\f\u00107\u001a\b\u0012\u0004\u0012\u00020%0,\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020%0,\u0012\u0006\u0010\"\u001a\u00020\u0007\u0012\f\u00101\u001a\b\u0012\u0004\u0012\u0002000,¢\u0006\u0004\b5\u0010<BS\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\f\u00107\u001a\b\u0012\u0004\u0012\u00020%0,\u0012\f\u00101\u001a\b\u0012\u0004\u0012\u0002000,¢\u0006\u0004\b5\u0010=B[\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\f\u00107\u001a\b\u0012\u0004\u0012\u00020%0,\u0012\u0006\u0010\"\u001a\u00020\u0007\u0012\f\u00101\u001a\b\u0012\u0004\u0012\u0002000,¢\u0006\u0004\b5\u0010>Ba\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\f\u00107\u001a\b\u0012\u0004\u0012\u00020%0,\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020%0,\u0012\f\u00101\u001a\b\u0012\u0004\u0012\u0002000,¢\u0006\u0004\b5\u0010?B[\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\u0006\u0010&\u001a\u00020%\u0012\f\u00107\u001a\b\u0012\u0004\u0012\u00020%0,\u0012\f\u00101\u001a\b\u0012\u0004\u0012\u0002000,¢\u0006\u0004\b5\u0010@Bs\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\u0006\u0010&\u001a\u00020%\u0012\f\u00107\u001a\b\u0012\u0004\u0012\u00020%0,\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020%0,\u0012\f\u00101\u001a\b\u0012\u0004\u0012\u0002000,\u0012\b\b\u0002\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b5\u0010ABG\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u00107\u001a\b\u0012\u0004\u0012\u00020%0,\u0012\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010,\u0012\u000e\u00101\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010,\u0012\u0006\u00103\u001a\u00020\u0007¢\u0006\u0004\b5\u0010BJ\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R\u0019\u0010\u000b\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u00020\u000f8F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\"\u0010\u0019\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\"\u0010\u001c\u001a\u00020\u00078F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\"\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\"\u0010&\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001e\u0010/\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010.R\u001e\u00101\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\"\u00103\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010\u001d\u001a\u0004\b3\u0010\u001f\"\u0004\b4\u0010!j\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bi¨\u0006j"}, d2 = {"Lcom/xiaomi/hm/health/smalltool/model/Tool;", "", "Lcom/xiaomi/hm/health/smalltool/model/ITool;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "device", "", "isSupport", "open", "", "key", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "", "nameResId", LogUtil.I, "getNameResId", "()I", "setNameResId", "(I)V", "iconResId", "getIconResId", "setIconResId", com.google.android.exoplayer2.text.ttml.b.H, "getBackgroundColor", "setBackgroundColor", "needDevice", "Z", "getNeedDevice", "()Z", "setNeedDevice", "(Z)V", "showWhenNotSupport", "getShowWhenNotSupport", "setShowWhenNotSupport", "Lcom/xiaomi/hm/health/smalltool/model/IFilter;", "supportMcuMode", "Lcom/xiaomi/hm/health/smalltool/model/IFilter;", "getSupportMcuMode", "()Lcom/xiaomi/hm/health/smalltool/model/IFilter;", "setSupportMcuMode", "(Lcom/xiaomi/hm/health/smalltool/model/IFilter;)V", "", "filters", "[Lcom/xiaomi/hm/health/smalltool/model/IFilter;", "notSupportFilters", "Lcom/xiaomi/hm/health/smalltool/model/INavigate;", "navigations", "[Lcom/xiaomi/hm/health/smalltool/model/INavigate;", "isOnlyBelongPlay", "setOnlyBelongPlay", "<init>", "(Ljava/lang/String;ILjava/lang/String;III)V", "supportFilters", "(Ljava/lang/String;ILjava/lang/String;III[Lcom/xiaomi/hm/health/smalltool/model/IFilter;)V", "(Ljava/lang/String;ILjava/lang/String;III[Lcom/xiaomi/hm/health/smalltool/model/IFilter;[Lcom/xiaomi/hm/health/smalltool/model/IFilter;)V", "(Ljava/lang/String;ILjava/lang/String;III[Lcom/xiaomi/hm/health/smalltool/model/IFilter;[Lcom/xiaomi/hm/health/smalltool/model/INavigate;)V", "(Ljava/lang/String;ILjava/lang/String;III[Lcom/xiaomi/hm/health/smalltool/model/IFilter;[Lcom/xiaomi/hm/health/smalltool/model/IFilter;[Lcom/xiaomi/hm/health/smalltool/model/INavigate;)V", "(Ljava/lang/String;ILjava/lang/String;III[Lcom/xiaomi/hm/health/smalltool/model/IFilter;[Lcom/xiaomi/hm/health/smalltool/model/IFilter;Z[Lcom/xiaomi/hm/health/smalltool/model/INavigate;)V", "(Ljava/lang/String;ILjava/lang/String;IIIZ[Lcom/xiaomi/hm/health/smalltool/model/IFilter;[Lcom/xiaomi/hm/health/smalltool/model/INavigate;)V", "(Ljava/lang/String;ILjava/lang/String;IIIZ[Lcom/xiaomi/hm/health/smalltool/model/IFilter;Z[Lcom/xiaomi/hm/health/smalltool/model/INavigate;)V", "(Ljava/lang/String;ILjava/lang/String;IIIZ[Lcom/xiaomi/hm/health/smalltool/model/IFilter;[Lcom/xiaomi/hm/health/smalltool/model/IFilter;[Lcom/xiaomi/hm/health/smalltool/model/INavigate;)V", "(Ljava/lang/String;ILjava/lang/String;IIIZLcom/xiaomi/hm/health/smalltool/model/IFilter;[Lcom/xiaomi/hm/health/smalltool/model/IFilter;[Lcom/xiaomi/hm/health/smalltool/model/INavigate;)V", "(Ljava/lang/String;ILjava/lang/String;IIIZLcom/xiaomi/hm/health/smalltool/model/IFilter;[Lcom/xiaomi/hm/health/smalltool/model/IFilter;[Lcom/xiaomi/hm/health/smalltool/model/IFilter;[Lcom/xiaomi/hm/health/smalltool/model/INavigate;Z)V", "(Ljava/lang/String;ILjava/lang/String;[Lcom/xiaomi/hm/health/smalltool/model/IFilter;[Lcom/xiaomi/hm/health/smalltool/model/IFilter;[Lcom/xiaomi/hm/health/smalltool/model/INavigate;Z)V", "TREADMILL", "SPORT_RUN", "SPORT_WALK", "SPORT_BIKE", "TRAINING_FITNESS", "ASSISTANT", "NFC_WALLET", "ALARM", "REMINDER", "TARGET_TRACK", "SCALE_BABY", "LOSE_WEIGHT_PLAN", "HJ_SCALE_BALANCE", "SCALE_BALANCE", FindWatchActivity.MAIN_MODULE_TOOL_KEY_NAME, "WATCHFACE_SETTING", "TRAINING_BREATHE", "STRESS_TRAINING_BREATH", "CALL_ALERT", "APP_ALERT", "CUSTOM_VIBRATE", "SPORT_HELP", "WIDGET_MANAGER", "UNLOCK_SCRENN", "FRIENT", "TARGET_SETTING", XimaCategoryActivity.MAIN_MODULE_TOOL_KEY_NAME, "SNORE_MONITOR", ToolKey.ZENBUDS, "FEMALE_HEALTH", "GUEST_MODE", "WORLD_CLOCK", "BAND_APPS_SETTING", "SHORTCUTS_SETTING", "TODO_LIST", "EDIT_CARD", "EXERCISE_PLAN", "ATTEND_COURSE", "OFFLINE_VOICE_COMD", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class Tool implements ITool {
    private static final /* synthetic */ Tool[] $VALUES;
    public static final Tool ALARM;
    public static final Tool APP_ALERT;
    public static final Tool ASSISTANT;
    public static final Tool ATTEND_COURSE;
    public static final Tool BAND_APPS_SETTING;
    public static final Tool CALL_ALERT;
    public static final Tool CUSTOM_VIBRATE;
    public static final Tool EDIT_CARD;
    public static final Tool EXERCISE_PLAN;
    public static final Tool FEMALE_HEALTH;
    public static final Tool FIND_DEVICE;
    public static final Tool FRIENT;
    public static final Tool GUEST_MODE;
    public static final Tool HJ_SCALE_BALANCE;
    public static final Tool LOSE_WEIGHT_PLAN;
    public static final Tool NFC_WALLET;
    public static final Tool OFFLINE_VOICE_COMD;
    public static final Tool REMINDER;
    public static final Tool SCALE_BABY;
    public static final Tool SCALE_BALANCE;
    public static final Tool SHORTCUTS_SETTING;
    public static final Tool SNORE_MONITOR;
    public static final Tool SPORT_BIKE;
    public static final Tool SPORT_HELP;
    public static final Tool SPORT_RUN;
    public static final Tool SPORT_WALK;
    public static final Tool STRESS_TRAINING_BREATH;
    public static final Tool TARGET_SETTING;
    public static final Tool TARGET_TRACK;
    public static final Tool TODO_LIST;
    public static final Tool TRAINING_BREATHE;
    public static final Tool TRAINING_FITNESS;
    public static final Tool TREADMILL = new Tool("TREADMILL", 0, ToolKey.TREADMILL, R.string.runnings_sport_type_treadmill, R.drawable.ic_snp_30, R.color.s41, false, new IFilter[]{Filter.TREADMILL}, new INavigate[]{new Navigate(new INavigate() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.1
        @Override // com.xiaomi.hm.health.smalltool.model.INavigate
        public boolean to(@NotNull Context context, @Nullable HMDeviceSource hMDeviceSource) {
            return INavigate.DefaultImpls.to(this, context, hMDeviceSource);
        }

        @Override // com.xiaomi.hm.health.smalltool.model.INavigate
        public boolean to(@NotNull Context context) {
            if (PolicyTipUtil.userInfoPolicyApi().interceptWithShowTip()) {
                return true;
            }
            ToolNavigateActivity.INSTANCE.to(context, 5);
            return INavigate.DefaultImpls.to(this, context);
        }
    }, new String[0])});
    public static final Tool UNLOCK_SCRENN;
    public static final Tool WATCHFACE_SETTING;
    public static final Tool WIDGET_MANAGER;
    public static final Tool WORLD_CLOCK;
    public static final Tool XIMALAYA;
    public static final Tool ZENBUDS;

    @ColorRes
    private int backgroundColor;

    @Nullable
    private IFilter[] filters;

    @DrawableRes
    private int iconResId;
    private boolean isOnlyBelongPlay;

    @NotNull
    private final String key;

    @StringRes
    private int nameResId;

    @Nullable
    private INavigate[] navigations;
    private boolean needDevice;

    @Nullable
    private IFilter[] notSupportFilters;
    private boolean showWhenNotSupport;

    @NotNull
    private IFilter supportMcuMode;

    /* JADX INFO: renamed from: com.xiaomi.hm.health.smalltool.model.Tool$18, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"com/xiaomi/hm/health/smalltool/model/Tool$18", "Lcom/xiaomi/hm/health/smalltool/model/INavigate;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "to", "", "a", LogUtil.I, "mFindCount", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class AnonymousClass18 implements INavigate {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private int mFindCount;

        @Override // com.xiaomi.hm.health.smalltool.model.INavigate
        public boolean to(@NotNull Context context, @Nullable HMDeviceSource hMDeviceSource) {
            return INavigate.DefaultImpls.to(this, context, hMDeviceSource);
        }

        @Override // com.xiaomi.hm.health.smalltool.model.INavigate
        public boolean to(@NotNull final Context context) {
            HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
            if (device == null) {
                return false;
            }
            FindDeviceWrapper.INSTANCE.findDevice(device, new HMCallback<Boolean>() { // from class: com.xiaomi.hm.health.smalltool.model.Tool$18$to$1
                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public /* bridge */ /* synthetic */ void onFinish(Boolean bool) {
                    onFinish(bool.booleanValue());
                }

                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public void onFinish(boolean success) {
                    if (success) {
                        Tool.AnonymousClass18 anonymousClass18 = this.a;
                        anonymousClass18.mFindCount++;
                        if (anonymousClass18.mFindCount == 4) {
                            this.a.mFindCount = 0;
                            Toast.makeText(context, HMDeviceConfig.hasBoundWatch() ? R.string.chaohu_setting_finding_tips : R.string.mili_setting_finding_tips, 0).show();
                        }
                    }
                }
            });
            return true;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.smalltool.model.Tool$35, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u000b²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u0084\u0002"}, d2 = {"com/xiaomi/hm/health/smalltool/model/Tool$35", "Lcom/xiaomi/hm/health/smalltool/model/IFilter;", "Lorg/koin/core/component/KoinComponent;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "device", "", "match", "Lcom/huami/devicex/injection/basic/MiuiFnApi;", "miuiFnApi", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class AnonymousClass35 implements IFilter, KoinComponent {
        private static final MiuiFnApi a(Lazy<? extends MiuiFnApi> lazy) {
            return lazy.getValue();
        }

        @Override // org.koin.core.component.KoinComponent
        @NotNull
        public Koin getKoin() {
            return KoinComponent.DefaultImpls.getKoin(this);
        }

        @Override // com.xiaomi.hm.health.smalltool.model.IFilter
        public boolean match(@Nullable HMDeviceSource hMDeviceSource) {
            return IFilter.DefaultImpls.match(this, hMDeviceSource);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.xiaomi.hm.health.smalltool.model.IFilter
        public boolean match(@NotNull Context context, @Nullable HMDeviceSource device) {
            LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
            final Qualifier qualifier = null;
            final Object[] objArr = 0 == true ? 1 : 0;
            return !a(LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<MiuiFnApi>() { // from class: com.xiaomi.hm.health.smalltool.model.Tool$35$match$$inlined$inject$default$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.MiuiFnApi, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final MiuiFnApi invoke() {
                    KoinComponent koinComponent = this;
                    return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(MiuiFnApi.class), qualifier, objArr);
                }
            })).isMiui(context);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Filter filter = Filter.SUPPORT;
        SPORT_RUN = new Tool("SPORT_RUN", 1, "PB", R.string.small_tool_item_sport_run, R.drawable.ic_run_24, R.color.p3, new IFilter[]{filter}, new INavigate[]{new Navigate(new INavigate() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.2
            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context, @Nullable HMDeviceSource hMDeviceSource) {
                return INavigate.DefaultImpls.to(this, context, hMDeviceSource);
            }

            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context) {
                if (PolicyTipUtil.userInfoPolicyApi().interceptWithShowTip()) {
                    return true;
                }
                ToolNavigateActivity.INSTANCE.to(context, 1);
                return true;
            }
        }, "DEFAULT => SPORT_RUN")});
        SPORT_WALK = new Tool("SPORT_WALK", 2, ToolKey.SPORT_WALK, R.string.small_tool_item_sport_walk, R.drawable.ic_walk_24, R.color.p3, new IFilter[]{filter}, new INavigate[]{new Navigate(new INavigate() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.3
            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context, @Nullable HMDeviceSource hMDeviceSource) {
                return INavigate.DefaultImpls.to(this, context, hMDeviceSource);
            }

            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context) {
                if (PolicyTipUtil.userInfoPolicyApi().interceptWithShowTip()) {
                    return true;
                }
                ToolNavigateActivity.INSTANCE.to(context, 2);
                return true;
            }
        }, "DEFAULT => SPORT_WALK")});
        SPORT_BIKE = new Tool("SPORT_BIKE", 3, ToolKey.SPORT_BIKE, R.string.small_tool_item_sport_bike, R.drawable.ic_cycling_24, R.color.p3, new IFilter[]{filter}, new INavigate[]{new Navigate(new INavigate() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.4
            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context, @Nullable HMDeviceSource hMDeviceSource) {
                return INavigate.DefaultImpls.to(this, context, hMDeviceSource);
            }

            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context) {
                if (PolicyTipUtil.userInfoPolicyApi().interceptWithShowTip()) {
                    return true;
                }
                ToolNavigateActivity.INSTANCE.to(context, 3);
                return true;
            }
        }, "DEFAULT => SPORT_BIKE")});
        Filter filter2 = Filter.USER_OVERSEA;
        Filter filter3 = Filter.LOCALE_OVERSEA;
        TRAINING_FITNESS = new Tool("TRAINING_FITNESS", 4, ToolKey.TRAINING_FITNESS, R.string.small_tool_item_training_fitness, R.drawable.ic_work_out_24, R.color.p3, new IFilter[]{filter}, new IFilter[]{filter2, filter3}, new INavigate[]{new Navigate(new INavigate() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.5
            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context, @Nullable HMDeviceSource hMDeviceSource) {
                return INavigate.DefaultImpls.to(this, context, hMDeviceSource);
            }

            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context) {
                ToolNavigateActivity.INSTANCE.to(context, 4);
                return true;
            }
        }, "DEFAULT => SPORT_WORKOUT")});
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        HMDeviceSource hMDeviceSource = HMDeviceSource.WATCH_AMAZFIT_QOG;
        spreadBuilder.add(hMDeviceSource);
        spreadBuilder.addSpread(ToolConfigKt.getWATCH_XIHU_SERIES());
        IFilter[] iFilterArr = {new Filter.Devices((HMDeviceSource[]) spreadBuilder.toArray(new HMDeviceSource[spreadBuilder.size()]))};
        Filter filter4 = Filter.SMART_WATCH_OVERSEA;
        HMDeviceSource[] watch_xihu_oversea = ToolConfigKt.getWATCH_XIHU_OVERSEA();
        ASSISTANT = new Tool("ASSISTANT", 5, ToolKey.ASSISTANT, R.string.small_tool_item_assistant, R.drawable.ic_shortcut_cards_24, R.color.s15, iFilterArr, new IFilter[]{filter2, filter4, new Filter.Devices((HMDeviceSource[]) Arrays.copyOf(watch_xihu_oversea, watch_xihu_oversea.length))}, new INavigate[]{new Navigate(SmartActivity.class, new String[0])});
        Filter filter5 = Filter.NOT_SUPPORT;
        IFilter[] iFilterArr2 = {Filter.BAND_NFC, Filter.SMART_WATCH_NFC, new Filter.SmartWatch(new Function1<Device, Boolean>() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.m
            public final boolean a(@NotNull Device device) {
                return DeviceFeature.isSupportNFC(device);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Device device) {
                return Boolean.valueOf(a(device));
            }
        })};
        HMDeviceSource[] band_mi = ToolConfigKt.getBAND_MI();
        NFC_WALLET = new Tool("NFC_WALLET", 6, ToolKey.NFC_WALLET, R.string.small_tool_item_nfc_wallet, R.drawable.ic_nfc_card_24, R.color.s15, true, filter5, iFilterArr2, new IFilter[]{new Filter.Devices((HMDeviceSource[]) Arrays.copyOf(band_mi, band_mi.length)), filter2, filter4, new IFilter() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.7
            @Override // com.xiaomi.hm.health.smalltool.model.IFilter
            public boolean match(@NotNull Context context, @Nullable HMDeviceSource hMDeviceSource2) {
                return IFilter.DefaultImpls.match(this, context, hMDeviceSource2);
            }

            @Override // com.xiaomi.hm.health.smalltool.model.IFilter
            public boolean match(@Nullable HMDeviceSource device) {
                return GlobalConfig.get().isBuildAmazfit();
            }
        }}, new INavigate[]{new Navigate(WalletActivity.class, new String[0])}, !GlobalConfig.get().isBuildAmazfit());
        Filter filter6 = Filter.BAND;
        HMDeviceSource[] watch_everest_2_series = ToolConfigKt.getWATCH_EVEREST_2_SERIES();
        IFilter[] iFilterArr3 = {filter6, new Filter.Devices((HMDeviceSource[]) Arrays.copyOf(watch_everest_2_series, watch_everest_2_series.length)), new Filter.SmartWatch(new Function1<Device, Boolean>() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.n
            public final boolean a(@NotNull Device device) {
                return DeviceUtil.isSupportAlarm(device);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Device device) {
                return Boolean.valueOf(a(device));
            }
        })};
        HMDeviceSource[] watch_smart_family = ToolConfigKt.getWATCH_SMART_FAMILY();
        HMDeviceSource[] mili_aneto_series = ToolConfigKt.getMILI_ANETO_SERIES();
        IFilter[] iFilterArr4 = {new Filter.Devices((HMDeviceSource[]) Arrays.copyOf(watch_smart_family, watch_smart_family.length)), new Filter.Devices((HMDeviceSource[]) Arrays.copyOf(mili_aneto_series, mili_aneto_series.length))};
        Filter filter7 = Filter.SMART_WATCH;
        DefaultConstructorMarker defaultConstructorMarker = null;
        ALARM = new Tool("ALARM", 7, ToolKey.ALARM, R.string.small_tool_item_alarm, R.drawable.ic_alarm_24, R.color.s15, true, filter5, iFilterArr3, iFilterArr4, new INavigate[]{new Navigate((Pair<? extends IFilter, ? extends Object>) TuplesKt.to(filter6, new INavigate() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.9
            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context, @Nullable HMDeviceSource hMDeviceSource2) {
                return INavigate.DefaultImpls.to(this, context, hMDeviceSource2);
            }

            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context) {
                if (AlarmClockManager.isSupportAlarmModule()) {
                    HuamiOSAlarmActivity.navigation2Alarm(context, false);
                    return true;
                }
                MiBandAlarmActivity.navigation2Alarm(context, false);
                return true;
            }
        }), new String[0]), new Navigate((Pair<? extends IFilter, ? extends Object>) TuplesKt.to(filter7, AlarmListActivity.class), new String[0])}, false, 512, defaultConstructorMarker);
        REMINDER = new Tool("REMINDER", 8, ToolKey.REMINDER, R.string.small_tool_item_reminder, R.drawable.ic_event_reminder_24, R.color.s15, new IFilter[]{new Filter.Band(new Function1<HMDeviceSource, Boolean>() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.a
            public final boolean a(@Nullable HMDeviceSource hMDeviceSource2) {
                return ConfigHelperKt.hasFeature(Feature.REMINDER_SOURCE_S, hMDeviceSource2);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(HMDeviceSource hMDeviceSource2) {
                return Boolean.valueOf(a(hMDeviceSource2));
            }
        })}, new INavigate[]{new Navigate(new INavigate() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.11
            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context, @Nullable HMDeviceSource hMDeviceSource2) {
                return INavigate.DefaultImpls.to(this, context, hMDeviceSource2);
            }

            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context) {
                HMDeviceSource deviceSource;
                HMBaseDevice miliDevice = HMDeviceManager.getInstance().getMiliDevice();
                boolean z = false;
                if (miliDevice != null && (deviceSource = miliDevice.getDeviceSource()) != null && ConfigHelperKt.hasFeature(deviceSource, Feature.GT3_SOURCE)) {
                    z = true;
                }
                context.startActivity(z ? new Intent(context, (Class<?>) ScheduleActivity.class) : new Intent(context, (Class<?>) EventRemindActivity.class));
                return true;
            }
        }, new String[0])});
        TARGET_TRACK = new Tool("TARGET_TRACK", 9, ToolKey.TARGET_TRACK, R.string.small_tool_item_target_track, R.drawable.ic_small_tool_item_target_track, R.color.s15);
        SCALE_BABY = new Tool("SCALE_BABY", 10, ToolKey.SCALE_BABY, R.string.small_tool_item_scale_baby, R.drawable.ic_weigh_infant_24, R.color.s20, false, new IFilter[]{new AdultBobyScaleWeight(null, 1, 0 == true ? 1 : 0)}, new INavigate[]{new Navigate(new INavigate() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.12
            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context, @Nullable HMDeviceSource hMDeviceSource2) {
                return INavigate.DefaultImpls.to(this, context, hMDeviceSource2);
            }

            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context) {
                if (!HMWeightUtils.isAmazfitScale()) {
                    context.startActivity(new Intent(context, (Class<?>) BabyWeightActivity.class));
                    return true;
                }
                ConnectScaleActivity.Companion companion = ConnectScaleActivity.INSTANCE;
                companion.launch(context, companion.getTYPE_BABY_WEIGHT());
                return true;
            }
        }, "DEFAULT => SCALE_BABY")});
        LOSE_WEIGHT_PLAN = new Tool("LOSE_WEIGHT_PLAN", 11, ToolKey.LOSE_WEIGHT_PLAN, R.string.lose_weight_plan, R.drawable.ic_body_fat_24, R.color.s20, false, new IFilter[]{new IFilter() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.13
            @Override // com.xiaomi.hm.health.smalltool.model.IFilter
            public boolean match(@Nullable HMDeviceSource hMDeviceSource2) {
                return IFilter.DefaultImpls.match(this, hMDeviceSource2);
            }

            @Override // com.xiaomi.hm.health.smalltool.model.IFilter
            public boolean match(@NotNull Context context, @Nullable HMDeviceSource device) {
                return HMLoginManager.isAdultGlobal() && HMDeviceManager.getInstance().hasBound(HMDeviceSource.WEIGHT_AMAZFIT_SCALE);
            }
        }}, true, new INavigate[]{new Navigate(new INavigate() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.14
            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context) {
                return INavigate.DefaultImpls.to(this, context);
            }

            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context, @Nullable HMDeviceSource device) {
                if (NetUtil.isNetworkConnected(context)) {
                    context.startActivity(new Intent(context, (Class<?>) LoseWeightPlanEnterActivity.class));
                    return true;
                }
                IconToast.showError(context, context.getString(R.string.no_network_connection));
                return false;
            }
        }, new String[0])});
        HJ_SCALE_BALANCE = new Tool("HJ_SCALE_BALANCE", 12, "PHNL", R.string.bodyfat_title_measure_balance, R.drawable.ic_ac_30, R.color.s20, false, new IFilter[]{new IFilter() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.15
            @Override // com.xiaomi.hm.health.smalltool.model.IFilter
            public boolean match(@Nullable HMDeviceSource hMDeviceSource2) {
                return IFilter.DefaultImpls.match(this, hMDeviceSource2);
            }

            @Override // com.xiaomi.hm.health.smalltool.model.IFilter
            public boolean match(@NotNull Context context, @Nullable HMDeviceSource device) {
                return HMDeviceManager.getInstance().hasBound(HMDeviceSource.WEIGHT_AMAZFIT_SCALE);
            }
        }}, true, new INavigate[]{new Navigate(new INavigate() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.16
            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context) {
                return INavigate.DefaultImpls.to(this, context);
            }

            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context, @Nullable HMDeviceSource device) {
                BalanceDetailsActivity.INSTANCE.startMe(context, Long.parseLong(HMPersonInfo.getInstance().getUserInfo().getUserid()));
                return true;
            }
        }, new String[0])});
        SCALE_BALANCE = new Tool("SCALE_BALANCE", 13, ToolKey.SCALE_BALANCE, R.string.small_tool_item_training_balance, R.drawable.ic_boof_24, R.color.s20, false, new IFilter[]{new Filter.Devices(HMDeviceSource.WEIGHT_BFS)}, new INavigate[]{new Navigate(OneFootDetailActivity.class, new String[0])});
        HMDeviceSource[] watch_everest_2_series2 = ToolConfigKt.getWATCH_EVEREST_2_SERIES();
        FIND_DEVICE = new Tool(FindWatchActivity.MAIN_MODULE_TOOL_KEY_NAME, 14, ToolKey.FIND_DEVICE, R.string.small_tool_item_find_device, R.drawable.ic_find_device_24, R.color.s15, new IFilter[]{filter6, new Filter.Devices((HMDeviceSource[]) Arrays.copyOf(watch_everest_2_series2, watch_everest_2_series2.length)), new Filter.SmartWatch(new Function1<Device, Boolean>() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.b
            public final boolean a(@NotNull Device device) {
                return DeviceUtil.isSupportFindWatch(device);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Device device) {
                return Boolean.valueOf(a(device));
            }
        })}, new INavigate[]{new Navigate((Pair<? extends IFilter, ? extends Object>) TuplesKt.to(filter6, new AnonymousClass18()), "BAND => FIND_DEVICE"), new Navigate((Pair<? extends IFilter, ? extends Object>) TuplesKt.to(filter7, new Navigate.SmartWatch(new Function2<Context, Device, Boolean>() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.c
            public final boolean a(@NotNull Context context, @NotNull Device device) {
                if (DeviceSource.isSeriesEverest2(device)) {
                    SyncBleUtil.sendAlertFindWatch();
                    return true;
                }
                context.startActivity(new Intent(context, (Class<?>) FindWatchActivity.class));
                return true;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Boolean invoke(Context context, Device device) {
                return Boolean.valueOf(a(context, device));
            }
        })), "SMART_WATCH => FIND_DEVICE")});
        WATCHFACE_SETTING = new Tool("WATCHFACE_SETTING", 15, ToolKey.WATCHFACE_SETTING, R.string.small_tool_item_watchface_setting, R.drawable.ic_dial_24, R.color.s15, false, (IFilter) new Filter.SmartWatch(new Function1<Device, Boolean>() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.d
            public final boolean a(@NotNull Device device) {
                return DeviceFeature.isSupportWatchFaceSetting(device);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Device device) {
                return Boolean.valueOf(a(device));
            }
        }), new IFilter[]{new Filter.Band(new Function1<HMDeviceSource, Boolean>() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.e
            public final boolean a(@Nullable HMDeviceSource hMDeviceSource2) {
                return WatchSkinUtils.getWatchfaceType(hMDeviceSource2) != -1 || HMDeviceConfig.isSupportNewWatchStore(hMDeviceSource2);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(HMDeviceSource hMDeviceSource2) {
                return Boolean.valueOf(a(hMDeviceSource2));
            }
        }), filter7}, new INavigate[]{new Navigate((Pair<? extends IFilter, ? extends Object>) TuplesKt.to(filter6, new INavigate() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.22
            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context) {
                return INavigate.DefaultImpls.to(this, context);
            }

            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context, @Nullable HMDeviceSource device) {
                WatchSkinManager.jumpToWatchSkinPage(context, device);
                return true;
            }
        }), "BAND => WATCHFACE_SETTING"), new Navigate((Pair<? extends IFilter, ? extends Object>) TuplesKt.to(filter7, new Navigate.SmartWatch(new Function2<Context, Device, Boolean>() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.f
            public final boolean a(@NotNull Context context, @NotNull Device device) {
                if (DeviceSource.isSeriesXihu(device)) {
                    context.startActivity(new Intent(context, (Class<?>) XiHuWatchFaceManagerActivity.class));
                    return true;
                }
                WatchFaceActivity.to(context, device.getCpuId());
                return true;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Boolean invoke(Context context, Device device) {
                return Boolean.valueOf(a(context, device));
            }
        })), "SMARTWATCH => WATCHFACE_SETTING")});
        TRAINING_BREATHE = new Tool("TRAINING_BREATHE", 16, ToolKey.TRAINING_BREATHE, R.string.small_tool_item_training_breathe_new, R.drawable.ic_sleep_pranayama_24, R.color.s25, new IFilter[]{filter}, new IFilter[]{filter2, filter3}, false, new INavigate[]{new Navigate(new INavigate() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.24
            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context, @Nullable HMDeviceSource hMDeviceSource2) {
                return INavigate.DefaultImpls.to(this, context, hMDeviceSource2);
            }

            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context) {
                Navigator.INSTANCE.startBreatheTraining(context);
                return true;
            }
        }, "DEFAULT => TRAINING_BREATHE")});
        STRESS_TRAINING_BREATH = new Tool("STRESS_TRAINING_BREATH", 17, ToolKey.STRESS_TRAINING_BREATH, R.string.stress_breathe_training, R.drawable.ic_stress_reliever_24, R.color.s25, new IFilter[]{filter}, new IFilter[]{filter2, filter3}, false, new INavigate[]{new Navigate(new INavigate() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.25
            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context, @Nullable HMDeviceSource hMDeviceSource2) {
                return INavigate.DefaultImpls.to(this, context, hMDeviceSource2);
            }

            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context) {
                Navigator.INSTANCE.startBreatheTraining(context, 2);
                return true;
            }
        }, "DEFAULT => TRAINING_BREATHE")});
        CALL_ALERT = new Tool("CALL_ALERT", 18, ToolKey.CALL_ALERT, R.string.incoming_call_alert, R.drawable.ic_incoming_call_24, R.color.s15, true, new IFilter[]{filter6}, new INavigate[]{new Navigate(new INavigate() { // from class: com.xiaomi.hm.health.ui.smartplay.IncomingCallNavigate
            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context, @Nullable HMDeviceSource hMDeviceSource2) {
                return INavigate.DefaultImpls.to(this, context, hMDeviceSource2);
            }

            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context) {
                if (HMDevicePropertyCache.INSTANCE.getInstance().getMiliFeature().hasSw(20)) {
                    context.startActivity(new Intent(context, (Class<?>) BtPhoneActivity.class));
                    return true;
                }
                context.startActivity(new Intent(context, (Class<?>) IncomingCallAlertActivity.class));
                return true;
            }
        }, "DEFAULT => CALL_ALERT")});
        APP_ALERT = new Tool("APP_ALERT", 19, ToolKey.APP_ALERT, R.string.app_notification_alert, R.drawable.ic_notice_24, R.color.s15, true, new IFilter[]{filter6, filter7}, new INavigate[]{new Navigate((Pair<? extends IFilter, ? extends Object>) TuplesKt.to(filter6, new INavigate() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.26
            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context) {
                return INavigate.DefaultImpls.to(this, context);
            }

            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context, @Nullable HMDeviceSource device) {
                Intent intent = new Intent(context, (Class<?>) AppNotificationAlertActivity.class);
                intent.putExtra("deviceType", HMDeviceType.MILI.getValue());
                context.startActivity(intent);
                return true;
            }
        }), "BAND => APP_ALERT"), new Navigate((Pair<? extends IFilter, ? extends Object>) TuplesKt.to(filter7, new Navigate.SmartWatch(new Function2<Context, Device, Boolean>() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.g
            public final boolean a(@NotNull Context context, @NotNull Device device) {
                context.startActivity(new Intent(context, (Class<?>) NotificationSettingActivity.class));
                return true;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Boolean invoke(Context context, Device device) {
                return Boolean.valueOf(a(context, device));
            }
        })), "SMARTWATCH => APP_ALERT")});
        CUSTOM_VIBRATE = new Tool("CUSTOM_VIBRATE", 20, ToolKey.CUSTOM_VIBRATE, R.string.tool_custom_vibrate, R.drawable.ic_vibration_24, R.color.s15, true, new IFilter[]{new Filter.Band(new Function1<HMDeviceSource, Boolean>() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.h
            public final boolean a(@Nullable HMDeviceSource hMDeviceSource2) {
                return ConfigHelperKt.hasFeature(Feature.CUSTOM_VIBRATE, hMDeviceSource2);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(HMDeviceSource hMDeviceSource2) {
                return Boolean.valueOf(a(hMDeviceSource2));
            }
        })}, new INavigate[]{new Navigate(VibrateTypeActivity.class, new String[0])});
        HMDeviceSource[] watch_sport_family = ToolConfigKt.getWATCH_SPORT_FAMILY();
        HMDeviceSource[] mili_aneto_series2 = ToolConfigKt.getMILI_ANETO_SERIES();
        IFilter[] iFilterArr5 = {new Filter.Devices((HMDeviceSource[]) Arrays.copyOf(watch_sport_family, watch_sport_family.length)), new Filter.Devices((HMDeviceSource[]) Arrays.copyOf(mili_aneto_series2, mili_aneto_series2.length))};
        Filter filter8 = Filter.ANETO;
        SPORT_HELP = new Tool("SPORT_HELP", 21, ToolKey.SPORT_HELP, R.string.tool_sport_help, R.drawable.ic_exercise_assistant_24, R.color.s15, true, (IFilter) filter5, iFilterArr5, new INavigate[]{new Navigate((Pair<? extends IFilter, ? extends Object>) TuplesKt.to(filter7, new Navigate.SmartWatch(new Function2<Context, Device, Boolean>() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.i
            public final boolean a(@NotNull Context context, @NotNull Device device) {
                SportSettingActivity.start(context);
                return true;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Boolean invoke(Context context, Device device) {
                return Boolean.valueOf(a(context, device));
            }
        })), "SMARTWATCH => SPORT_HELP"), new Navigate((Pair<? extends IFilter, ? extends Object>) TuplesKt.to(filter8, new INavigate() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.30
            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context, @Nullable HMDeviceSource hMDeviceSource2) {
                return INavigate.DefaultImpls.to(this, context, hMDeviceSource2);
            }

            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context) {
                MiliSportSettingActivity.INSTANCE.launch(context);
                return true;
            }
        }), "ANETO => SPORT_HELP")});
        HMDeviceSource[] watch_sport_family2 = ToolConfigKt.getWATCH_SPORT_FAMILY();
        HMDeviceSource[] mili_aneto_series3 = ToolConfigKt.getMILI_ANETO_SERIES();
        WIDGET_MANAGER = new Tool("WIDGET_MANAGER", 22, ToolKey.WIDGET_MANAGER, R.string.tool_manager_little_part, R.drawable.ic_widget_manager_24, R.color.s15, true, new IFilter[]{new Filter.Devices((HMDeviceSource[]) Arrays.copyOf(watch_sport_family2, watch_sport_family2.length)), new Filter.Devices((HMDeviceSource[]) Arrays.copyOf(mili_aneto_series3, mili_aneto_series3.length))}, new INavigate[]{new Navigate((Pair<? extends IFilter, ? extends Object>) TuplesKt.to(filter7, new Navigate.SmartWatch(new Function2<Context, Device, Boolean>() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.j
            public final boolean a(@NotNull Context context, @NotNull Device device) {
                Intent intent = new Intent(context, (Class<?>) WidgetAndAppActivity.class);
                intent.putExtra("deviceModel", DeviceUtil.getHuamiModel(device));
                intent.addFlags(536870912);
                context.startActivity(intent);
                return true;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Boolean invoke(Context context, Device device) {
                return Boolean.valueOf(a(context, device));
            }
        })), "SMARTWATCH => SMALL_MANAGER"), new Navigate((Pair<? extends IFilter, ? extends Object>) TuplesKt.to(filter8, new INavigate() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.32
            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context, @Nullable HMDeviceSource hMDeviceSource2) {
                return INavigate.DefaultImpls.to(this, context, hMDeviceSource2);
            }

            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context) {
                HMAppSortActivity.launch(context, HMDeviceSource.MILI_ANETO);
                return true;
            }
        }), "ANETO => SMALL_MANAGER")});
        UNLOCK_SCRENN = new Tool("UNLOCK_SCRENN", 23, ToolKey.UNLOCK_SCRENN, R.string.unlock_screen, R.drawable.ic_screen_unlock_24, R.color.s15, true, new IFilter[]{filter6, new Filter.SmartWatch(new Function2<Context, Device, Boolean>() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.k
            public final boolean a(@NotNull Context context, @NotNull Device device) {
                return (!DeviceUtil.isRomSupportUnlock(context) || DeviceSource.isSeriesXihu(device) || DeviceSource.isSeriesEverest2(device)) ? false : true;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Boolean invoke(Context context, Device device) {
                return Boolean.valueOf(a(context, device));
            }
        })}, new IFilter[]{new IFilter() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.34
            @Override // com.xiaomi.hm.health.smalltool.model.IFilter
            public boolean match(@NotNull Context context, @Nullable HMDeviceSource hMDeviceSource2) {
                return IFilter.DefaultImpls.match(this, context, hMDeviceSource2);
            }

            @Override // com.xiaomi.hm.health.smalltool.model.IFilter
            public boolean match(@Nullable HMDeviceSource device) {
                return HMDeviceConfig.isTokyo();
            }
        }, new AnonymousClass35()}, new INavigate[]{new Navigate((Pair<? extends IFilter, ? extends Object>) TuplesKt.to(filter6, new INavigate() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.36
            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context, @Nullable HMDeviceSource hMDeviceSource2) {
                return INavigate.DefaultImpls.to(this, context, hMDeviceSource2);
            }

            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context) {
                context.startActivity(new Intent(context, (Class<?>) ScreenUnlockActivity.class));
                return true;
            }
        }), "BAND => UNLOCK_SCRENN"), new Navigate((Pair<? extends IFilter, ? extends Object>) TuplesKt.to(filter7, new Navigate.SmartWatch(new Function2<Context, Device, Boolean>() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.l
            public final boolean a(@NotNull Context context, @NotNull Device device) {
                UnlockScanHelper.getHelper(context).checkWatchRandomAddress((Activity) context);
                return true;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Boolean invoke(Context context, Device device) {
                return Boolean.valueOf(a(context, device));
            }
        })), "SMARTWATCH => UNLOCK_SCRENN")});
        FRIENT = new Tool("FRIENT", 24, ToolKey.FRIENT, R.string.small_tool_item_frient, R.drawable.ic_friends_24, R.color.p5, new IFilter[]{filter}, new INavigate[]{new Navigate(RelationServiceKt.getRelationService().friendActivityClass(), new String[0])});
        TARGET_SETTING = new Tool("TARGET_SETTING", 25, ToolKey.TARGET_SETTING, R.string.small_tool_item_target_setting, R.drawable.ic_target_setting_24, R.color.s15, new IFilter[]{filter}, new INavigate[]{new Navigate(new INavigate() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.38
            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context, @Nullable HMDeviceSource hMDeviceSource2) {
                return INavigate.DefaultImpls.to(this, context, hMDeviceSource2);
            }

            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context) {
                if (PolicyTipUtil.userInfoPolicyApi().interceptWithShowTip()) {
                    return true;
                }
                context.startActivity(new Intent(context, (Class<?>) GoalSummaryActivity.class));
                return true;
            }
        }, "DEFAULT => TARGET_SETTING")});
        SpreadBuilder spreadBuilder2 = new SpreadBuilder(5);
        spreadBuilder2.add(HMDeviceSource.WATCH_AMAZFIT);
        spreadBuilder2.add(HMDeviceSource.WATCH_EVEREST);
        spreadBuilder2.add(HMDeviceSource.WATCH_EVEREST_2S);
        spreadBuilder2.add(hMDeviceSource);
        spreadBuilder2.addSpread(ToolConfigKt.getWATCH_EVEREST_2_SERIES_MAINLAND());
        XIMALAYA = new Tool(XimaCategoryActivity.MAIN_MODULE_TOOL_KEY_NAME, 26, ToolKey.XIMALAYA, R.string.small_tool_item_ximalaya, R.drawable.ic_himalaya_24, R.color.p3, true, filter5, new IFilter[]{new Filter.Devices((HMDeviceSource[]) spreadBuilder2.toArray(new HMDeviceSource[spreadBuilder2.size()]))}, new IFilter[]{filter2, filter4}, new INavigate[]{new Navigate(XimaCategoryActivity.class, new String[0])}, false, 512, defaultConstructorMarker);
        SNORE_MONITOR = new Tool("SNORE_MONITOR", 27, ToolKey.SNORE_MONITOR, R.string.small_tool_item_snore_monitor, R.drawable.ic_monitor_snoring_24, R.color.s25, new IFilter[]{filter}, new IFilter[]{filter2, filter3}, false, new INavigate[]{new Navigate(new INavigate() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.39
            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context, @Nullable HMDeviceSource hMDeviceSource2) {
                return INavigate.DefaultImpls.to(this, context, hMDeviceSource2);
            }

            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context) {
                if (PolicyTipUtil.userInfoPolicyApi().interceptWithShowTip()) {
                    return true;
                }
                context.startActivity(new Intent(context, (Class<?>) SnoreMonitorActivity.class));
                return true;
            }
        }, "DEFAULT => SNORE_MONITOR")});
        ZENBUDS = new Tool(ToolKey.ZENBUDS, 28, ToolKey.ZENBUDS, R.string.small_tool_item_zenbuds, R.drawable.ic_zenbuds_24, R.color.s41, false, (IFilter) filter5, new IFilter[]{Filter.CHOPIN_HANDSET}, new INavigate[]{new Navigate(HmEarbudMusicActivity.class, new String[0])});
        FEMALE_HEALTH = new Tool("FEMALE_HEALTH", 29, ToolKey.FEMALE_HEALTH, R.string.fh_female_health, R.drawable.ic_women_s_health_24, R.color.p5, false, new IFilter[]{Filter.FILTER_FEMALE_HEALTH}, true, new INavigate[]{new Navigate(new INavigate() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.40
            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context, @Nullable HMDeviceSource hMDeviceSource2) {
                return INavigate.DefaultImpls.to(this, context, hMDeviceSource2);
            }

            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context) {
                FemaleMifitViewModel femaleViewModel;
                if (!PolicyTipUtil.userInfoPolicyApi().interceptWithShowTip() && (femaleViewModel = FemaleCheckUtil.INSTANCE.getFemaleViewModel()) != null) {
                    FemaleMifitViewModel.jumpToFemaleHealth$default(femaleViewModel, context, false, 2, null);
                }
                return true;
            }
        }, "BAND => FEMALE_HEALTH")});
        GUEST_MODE = new Tool("GUEST_MODE", 30, ToolKey.GUEST_MODE, R.string.guest_mode, R.drawable.ic_visitors_24, R.color.s20, false, new IFilter[]{Filter.GUEST_MODE_FILTER}, true, new INavigate[]{new Navigate(new INavigate() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.41
            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context) {
                return INavigate.DefaultImpls.to(this, context);
            }

            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context, @Nullable HMDeviceSource mDeviceSource) {
                AddGuestActivity.INSTANCE.startMe(context, 2);
                return true;
            }
        }, "WEIGHT => GUEST_MODE")});
        Filter filter9 = Filter.YORK;
        Filter filter10 = Filter.COMO_NESS;
        WORLD_CLOCK = new Tool("WORLD_CLOCK", 31, ToolKey.WORLD_CLOCK, R.string.app_sort_world_clock, R.drawable.ic_world_clock_24, R.color.s15, false, new IFilter[]{filter9, filter10}, true, new INavigate[]{new Navigate(new INavigate() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.42
            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context) {
                return INavigate.DefaultImpls.to(this, context);
            }

            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context, @Nullable HMDeviceSource device) {
                Intent intent = new Intent(context, (Class<?>) WorldClockActivity.class);
                intent.putExtra("device_type", HMDeviceType.MILI);
                intent.putExtra("device_source", device);
                context.startActivity(intent);
                return true;
            }
        }, "BAND => WORLD_CLOCK")});
        BAND_APPS_SETTING = new Tool("BAND_APPS_SETTING", 32, ToolKey.BAND_APPS_SETTING, R.string.setting_peyto_apps_title_device, R.drawable.ic_das_24, R.color.s15, false, new IFilter[]{filter9, filter10}, true, new INavigate[]{new Navigate(new INavigate() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.43
            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context) {
                return INavigate.DefaultImpls.to(this, context);
            }

            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context, @Nullable HMDeviceSource device) {
                if (ConfigHelperKt.hasFeature(Feature.COMO_NESS_SERIES_S, device)) {
                    context.startActivity(new Intent(context, (Class<?>) HMNewAppSortActivity.class));
                    return true;
                }
                HMAppSortActivity.launch(context, device);
                return true;
            }
        }, "BAND => BAND_APPS_SETTING")});
        SHORTCUTS_SETTING = new Tool("SHORTCUTS_SETTING", 33, ToolKey.SHORTCUTS_SETTING, R.string.setting_shotcut_apps_title, R.drawable.ic_shortcut_settings_24, R.color.s15, false, new IFilter[]{filter9}, true, new INavigate[]{new Navigate(new INavigate() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.44
            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context) {
                return INavigate.DefaultImpls.to(this, context);
            }

            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context, @Nullable HMDeviceSource mDeviceSource) {
                context.startActivity((ConfigHelperKt.hasFeature(Feature.KONGMING_SERIES_S, mDeviceSource) || ConfigHelperKt.hasFeature(Feature.YORK_SERIES_S, mDeviceSource)) ? new Intent(context, (Class<?>) HMShortcutAppSortNewActivity.class) : new Intent(context, (Class<?>) HMShotcutAppSortActivity.class));
                return true;
            }
        }, "BAND => SHORTCUTS_SETTING")});
        TODO_LIST = new Tool("TODO_LIST", 34, ToolKey.TODO_LIST, R.string.device_todo, R.drawable.ic_to_do_24, R.color.s15, false, new IFilter[]{new IFilter() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.45
            @Override // com.xiaomi.hm.health.smalltool.model.IFilter
            public boolean match(@Nullable HMDeviceSource hMDeviceSource2) {
                return IFilter.DefaultImpls.match(this, hMDeviceSource2);
            }

            @Override // com.xiaomi.hm.health.smalltool.model.IFilter
            public boolean match(@NotNull Context context, @Nullable HMDeviceSource device) {
                return HMDevicePropertyCache.INSTANCE.getInstance().getMiliFeature().hasSw(30);
            }
        }}, true, new INavigate[]{new Navigate(new INavigate() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.46
            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context) {
                return INavigate.DefaultImpls.to(this, context);
            }

            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context, @Nullable HMDeviceSource device) {
                context.startActivity(new Intent(context, (Class<?>) HMNewToDoListActivity.class));
                return true;
            }
        }, new String[0])});
        EDIT_CARD = new Tool("EDIT_CARD", 35, ToolKey.EDIT_CARD, new IFilter[]{filter}, (IFilter[]) null, (INavigate[]) null, true);
        EXERCISE_PLAN = new Tool("EXERCISE_PLAN", 36, ToolKey.EXERCISE_PLAN, new IFilter[]{filter}, new IFilter[]{filter2, filter3}, (INavigate[]) null, true);
        ATTEND_COURSE = new Tool("ATTEND_COURSE", 37, ToolKey.ATTEND_COURSE, new IFilter[]{filter}, new IFilter[]{filter2, filter3}, (INavigate[]) null, true);
        OFFLINE_VOICE_COMD = new Tool("OFFLINE_VOICE_COMD", 38, ToolKey.OFFLINE_VOICE_COMD, R.string.offline_voice_cmd_new, R.drawable.ic_oacw_24, R.color.s15, false, new IFilter[]{new IFilter() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.47
            @Override // com.xiaomi.hm.health.smalltool.model.IFilter
            public boolean match(@Nullable HMDeviceSource hMDeviceSource2) {
                return IFilter.DefaultImpls.match(this, hMDeviceSource2);
            }

            @Override // com.xiaomi.hm.health.smalltool.model.IFilter
            public boolean match(@NotNull Context context, @Nullable HMDeviceSource device) {
                return HMDeviceConfig.supportOfflineCmd(device) && (Language.isSimplifiedChinese() || Language.isEnglish());
            }
        }}, true, new INavigate[]{new Navigate(new INavigate() { // from class: com.xiaomi.hm.health.smalltool.model.Tool.48
            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context, @Nullable HMDeviceSource hMDeviceSource2) {
                return INavigate.DefaultImpls.to(this, context, hMDeviceSource2);
            }

            @Override // com.xiaomi.hm.health.smalltool.model.INavigate
            public boolean to(@NotNull Context context) {
                WebHelper.launch(FeatureViewModel.INSTANCE.getURL_OFFLINE_VOICE());
                return true;
            }
        }, new String[0])});
        $VALUES = a();
    }

    private Tool(String str, @StringRes int i2, @DrawableRes String str2, @ColorRes int i3, int i4, int i5) {
        super(str, i2);
        this.nameResId = -1;
        this.iconResId = -1;
        this.backgroundColor = -1;
        this.needDevice = true;
        this.showWhenNotSupport = true;
        this.supportMcuMode = Filter.SUPPORT;
        this.key = str2;
        this.nameResId = i3;
        this.iconResId = i4;
        this.backgroundColor = i5;
    }

    private static final /* synthetic */ Tool[] a() {
        return new Tool[]{TREADMILL, SPORT_RUN, SPORT_WALK, SPORT_BIKE, TRAINING_FITNESS, ASSISTANT, NFC_WALLET, ALARM, REMINDER, TARGET_TRACK, SCALE_BABY, LOSE_WEIGHT_PLAN, HJ_SCALE_BALANCE, SCALE_BALANCE, FIND_DEVICE, WATCHFACE_SETTING, TRAINING_BREATHE, STRESS_TRAINING_BREATH, CALL_ALERT, APP_ALERT, CUSTOM_VIBRATE, SPORT_HELP, WIDGET_MANAGER, UNLOCK_SCRENN, FRIENT, TARGET_SETTING, XIMALAYA, SNORE_MONITOR, ZENBUDS, FEMALE_HEALTH, GUEST_MODE, WORLD_CLOCK, BAND_APPS_SETTING, SHORTCUTS_SETTING, TODO_LIST, EDIT_CARD, EXERCISE_PLAN, ATTEND_COURSE, OFFLINE_VOICE_COMD};
    }

    public static Tool valueOf(String str) {
        return (Tool) Enum.valueOf(Tool.class, str);
    }

    public static Tool[] values() {
        return (Tool[]) $VALUES.clone();
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getIconResId() {
        String str = this.key;
        if (Intrinsics.areEqual(str, WATCHFACE_SETTING.key)) {
            return HMDeviceConfig.isSupportWatchStore() ? R.drawable.ic_dial_mall_24 : R.drawable.ic_dial_24;
        }
        if (Intrinsics.areEqual(str, REMINDER.key)) {
            return HMDeviceConfig.isSchedule() ? R.drawable.ic_schedule_24 : R.drawable.ic_event_reminder_24;
        }
        return this.iconResId;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final int getNameResId() {
        String str = this.key;
        if (Intrinsics.areEqual(str, WATCHFACE_SETTING.key)) {
            return HMDeviceConfig.isSupportWatchStore() ? R.string.wf_home_tab_name_1 : R.string.small_tool_item_watchface_setting;
        }
        if (Intrinsics.areEqual(str, REMINDER.key)) {
            return HMDeviceConfig.isSchedule() ? R.string.schedule : R.string.small_tool_item_reminder;
        }
        if (Intrinsics.areEqual(str, CALL_ALERT.key)) {
            return HMDeviceConfig.hasCall() ? R.string.widget_call : R.string.incoming_call_alert;
        }
        return this.nameResId;
    }

    public final boolean getNeedDevice() {
        return Intrinsics.areEqual(this.key, WATCHFACE_SETTING.key) ? !HMDeviceConfig.isSupportWatchStore() : this.needDevice;
    }

    public final boolean getShowWhenNotSupport() {
        return this.showWhenNotSupport;
    }

    @NotNull
    public final IFilter getSupportMcuMode() {
        return this.supportMcuMode;
    }

    /* JADX INFO: renamed from: isOnlyBelongPlay, reason: from getter */
    public final boolean getIsOnlyBelongPlay() {
        return this.isOnlyBelongPlay;
    }

    @Override // com.xiaomi.hm.health.smalltool.model.ITool
    public boolean isSupport(@NotNull Context context, @Nullable HMDeviceSource hMDeviceSource, @Nullable IFilter[] iFilterArr, @Nullable IFilter[] iFilterArr2) {
        return ITool.DefaultImpls.isSupport(this, context, hMDeviceSource, iFilterArr, iFilterArr2);
    }

    @Override // com.xiaomi.hm.health.smalltool.model.ITool
    public boolean open(@NotNull Context context, @Nullable HMDeviceSource hMDeviceSource, @Nullable INavigate[] iNavigateArr) {
        return ITool.DefaultImpls.open(this, context, hMDeviceSource, iNavigateArr);
    }

    public final void setBackgroundColor(int i2) {
        this.backgroundColor = i2;
    }

    public final void setIconResId(int i2) {
        this.iconResId = i2;
    }

    public final void setNameResId(int i2) {
        this.nameResId = i2;
    }

    public final void setNeedDevice(boolean z) {
        this.needDevice = z;
    }

    public final void setOnlyBelongPlay(boolean z) {
        this.isOnlyBelongPlay = z;
    }

    public final void setShowWhenNotSupport(boolean z) {
        this.showWhenNotSupport = z;
    }

    public final void setSupportMcuMode(@NotNull IFilter iFilter) {
        this.supportMcuMode = iFilter;
    }

    @Override // com.xiaomi.hm.health.smalltool.model.ITool
    public boolean isSupport(@NotNull Context context, @Nullable HMDeviceSource device) {
        return isSupport(context, device, this.filters, this.notSupportFilters);
    }

    @Override // com.xiaomi.hm.health.smalltool.model.ITool
    public boolean open(@NotNull Context context, @Nullable HMDeviceSource device) {
        return open(context, device, this.navigations);
    }

    private Tool(String str, @StringRes int i2, @DrawableRes String str2, @ColorRes int i3, int i4, int i5, IFilter[] iFilterArr) {
        this(str, i2, str2, i3, i4, i5);
        this.filters = iFilterArr;
        this.needDevice = (ArraysKt___ArraysKt.contains((Filter[]) iFilterArr, Filter.SUPPORT) || ArraysKt___ArraysKt.contains((Filter[]) iFilterArr, Filter.SCALE)) ? false : true;
    }

    private Tool(String str, @StringRes int i2, @DrawableRes String str2, @ColorRes int i3, int i4, int i5, IFilter[] iFilterArr, IFilter[] iFilterArr2) {
        this(str, i2, str2, i3, i4, i5, iFilterArr);
        this.notSupportFilters = iFilterArr2;
    }

    private Tool(String str, @StringRes int i2, @DrawableRes String str2, @ColorRes int i3, int i4, int i5, IFilter[] iFilterArr, INavigate[] iNavigateArr) {
        this(str, i2, str2, i3, i4, i5, iFilterArr);
        this.navigations = iNavigateArr;
    }

    private Tool(String str, @StringRes int i2, @DrawableRes String str2, @ColorRes int i3, int i4, int i5, IFilter[] iFilterArr, IFilter[] iFilterArr2, INavigate[] iNavigateArr) {
        this(str, i2, str2, i3, i4, i5, iFilterArr, iNavigateArr);
        this.notSupportFilters = iFilterArr2;
    }

    private Tool(String str, @StringRes int i2, @DrawableRes String str2, @ColorRes int i3, int i4, int i5, IFilter[] iFilterArr, IFilter[] iFilterArr2, boolean z, INavigate[] iNavigateArr) {
        this(str, i2, str2, i3, i4, i5, iFilterArr, iNavigateArr);
        this.notSupportFilters = iFilterArr2;
        this.showWhenNotSupport = z;
    }

    private Tool(String str, @StringRes int i2, @DrawableRes String str2, @ColorRes int i3, int i4, int i5, boolean z, IFilter[] iFilterArr, INavigate[] iNavigateArr) {
        this(str, i2, str2, i3, i4, i5);
        this.needDevice = z;
        this.filters = iFilterArr;
        this.navigations = iNavigateArr;
    }

    private Tool(String str, @StringRes int i2, @DrawableRes String str2, @ColorRes int i3, int i4, int i5, boolean z, IFilter[] iFilterArr, boolean z2, INavigate[] iNavigateArr) {
        this(str, i2, str2, i3, i4, i5);
        this.needDevice = z;
        this.filters = iFilterArr;
        this.navigations = iNavigateArr;
        this.showWhenNotSupport = z2;
    }

    private Tool(String str, @StringRes int i2, @DrawableRes String str2, @ColorRes int i3, int i4, int i5, boolean z, IFilter[] iFilterArr, IFilter[] iFilterArr2, INavigate[] iNavigateArr) {
        this(str, i2, str2, i3, i4, i5, z, iFilterArr, iNavigateArr);
        this.notSupportFilters = iFilterArr2;
    }

    private Tool(String str, @StringRes int i2, @DrawableRes String str2, @ColorRes int i3, int i4, int i5, boolean z, IFilter iFilter, IFilter[] iFilterArr, INavigate[] iNavigateArr) {
        this(str, i2, str2, i3, i4, i5, z, iFilterArr, iNavigateArr);
        this.supportMcuMode = iFilter;
    }

    public /* synthetic */ Tool(String str, int i2, String str2, int i3, int i4, int i5, boolean z, IFilter iFilter, IFilter[] iFilterArr, IFilter[] iFilterArr2, INavigate[] iNavigateArr, boolean z2, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i2, str2, i3, i4, i5, z, iFilter, iFilterArr, iFilterArr2, iNavigateArr, (i6 & 512) != 0 ? true : z2);
    }

    private Tool(String str, @StringRes int i2, @DrawableRes String str2, @ColorRes int i3, int i4, int i5, boolean z, IFilter iFilter, IFilter[] iFilterArr, IFilter[] iFilterArr2, INavigate[] iNavigateArr, boolean z2) {
        this(str, i2, str2, i3, i4, i5, z, iFilter, iFilterArr, iNavigateArr);
        this.notSupportFilters = iFilterArr2;
        this.showWhenNotSupport = z2;
    }

    private Tool(String str, int i2, String str2, IFilter[] iFilterArr, IFilter[] iFilterArr2, INavigate[] iNavigateArr, boolean z) {
        super(str, i2);
        this.nameResId = -1;
        this.iconResId = -1;
        this.backgroundColor = -1;
        this.needDevice = true;
        this.showWhenNotSupport = true;
        this.supportMcuMode = Filter.SUPPORT;
        this.key = str2;
        this.filters = iFilterArr;
        this.notSupportFilters = iFilterArr2;
        this.navigations = iNavigateArr;
        this.isOnlyBelongPlay = z;
    }
}
