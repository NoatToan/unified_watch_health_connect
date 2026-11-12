package com.xiaomi.fitness.devicesettings.di;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.os.RemoteException;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import androidx.databinding.ObservableBoolean;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import com.example.aivs.export.AivsHelper;
import com.example.aivs.export.AivsHelperExtKt;
import com.example.aivs.export.PrivacyCallback;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.google.gson.Gson;
import com.mi.health.sleep.SleepDataHelperKt;
import com.miui.circulate.device.api.Column;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.MultiplePermissionsBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.StringExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.IItemChangesWithDevice;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import com.xiaomi.fitness.device.manager.export.bean.TabContentSwitchItem;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.devicesettings.base.about.DeviceInfoFragment;
import com.xiaomi.fitness.devicesettings.base.aivs.AivsPrivacySetting;
import com.xiaomi.fitness.devicesettings.base.aivs.Data;
import com.xiaomi.fitness.devicesettings.base.aivs.PrivacySet;
import com.xiaomi.fitness.devicesettings.base.clock.AlarmClockFragment;
import com.xiaomi.fitness.devicesettings.base.sedenraty.SedentaryFragment;
import com.xiaomi.fitness.devicesettings.base.unlock.laptop.AuthorizeUnlockFragment;
import com.xiaomi.fitness.devicesettings.base.unlock.phone.UnlockPhoneFragment;
import com.xiaomi.fitness.devicesettings.base.worldclock.WorldClockFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.aod.AODSettingFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.applayout.WatchAppLayoutSettingFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.appsort.AppSortFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordListActivity;
import com.xiaomi.fitness.devicesettings.bluttooth.connectnewphone.ConnectNewPhoneFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.directcard.DirectCardFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.emergencycontact.EmergencyContactFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.falldetection.FallDetectionFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.temp.TemperatureSettingFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.music.MusicFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.screenwake.ScreenWakeForBleFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.shortcut.BleShortcutFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.sleepmodel.SleepModelFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.sportsort.SportSortFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.stock.StockListFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.TodoExtKt;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiTodoSettingHelper;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.TodoRemindFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.wearmode.SwitchWearModeFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetGroupManagerFragment;
import com.xiaomi.fitness.devicesettings.common.avs.AivsSettingFragment;
import com.xiaomi.fitness.devicesettings.common.contact.TopContactsActivity;
import com.xiaomi.fitness.devicesettings.common.ecg.ECGMeasureRemindFragment;
import com.xiaomi.fitness.devicesettings.common.eventremind.EventReminderFragment;
import com.xiaomi.fitness.devicesettings.common.extensions.ContextExtKt;
import com.xiaomi.fitness.devicesettings.common.finddevice.FindDeviceFragment;
import com.xiaomi.fitness.devicesettings.common.hotspot.HotspotFragment;
import com.xiaomi.fitness.devicesettings.common.language.LanguageSettingFragment;
import com.xiaomi.fitness.devicesettings.common.lock.UnWearSettingFragment;
import com.xiaomi.fitness.devicesettings.common.offlinemap.OfflineMapManagerActivity;
import com.xiaomi.fitness.devicesettings.common.offlinemap.receiver.UsbPermissionReceiver;
import com.xiaomi.fitness.devicesettings.common.track.TrackSettingFragment;
import com.xiaomi.fitness.devicesettings.common.vitality.VitalitySettingFragment;
import com.xiaomi.fitness.devicesettings.common.zenmode.ZenModeSettingFragment;
import com.xiaomi.fitness.devicesettings.di.FeatureItemModule;
import com.xiaomi.fitness.devicesettings.export.N62SVersionPreference;
import com.xiaomi.fitness.devicesettings.export.SettingsPageUtilExtKt;
import com.xiaomi.fitness.devicesettings.huami.alarmnotify.HuaMiAlarmNotifyFragment;
import com.xiaomi.fitness.devicesettings.huami.appsort.HuaMiAppSortFragment;
import com.xiaomi.fitness.devicesettings.huami.blbroadcast.BLTBroadCastFragment;
import com.xiaomi.fitness.devicesettings.huami.goalremind.GoalRemindFragment;
import com.xiaomi.fitness.devicesettings.huami.handletype.WearLocationFragment;
import com.xiaomi.fitness.devicesettings.huami.heartrate.HeartRateBroadCastFragment;
import com.xiaomi.fitness.devicesettings.huami.limitbind.LimitBindFragment;
import com.xiaomi.fitness.devicesettings.huami.nightmode.NightModeSetFragment;
import com.xiaomi.fitness.devicesettings.huami.photo.PhotoSetFragment;
import com.xiaomi.fitness.devicesettings.huami.screenwake.ScreenWakeForHuamiFragment;
import com.xiaomi.fitness.devicesettings.huami.shortcut.HuaMiShortcutSortFragment;
import com.xiaomi.fitness.devicesettings.huami.typesort.SportTypeSortFragment;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeListFragment;
import com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetFragment;
import com.xiaomi.fitness.devicesettings.utils.Constants;
import com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference;
import com.xiaomi.fitness.devicesettings.utils.ZenUtils;
import com.xiaomi.fitness.devicesettings.xms.b;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.milink.export.MilinkManager;
import com.xiaomi.fitness.milink.export.MilinkManagerExtKt;
import com.xiaomi.fitness.sync.export.di.SyncExportManager;
import com.xiaomi.fitness.sync.export.di.SyncExtKt;
import com.xiaomi.fitness.wearos.export.WearOSUtil;
import com.xiaomi.fitness.wearos.export.WearOsExtKt;
import defpackage.av6;
import defpackage.d2m;
import defpackage.eu6;
import defpackage.jni;
import defpackage.wzi;
import defpackage.xc6;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u008a\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\tH\u0007J\b\u0010\u000b\u001a\u00020\tH\u0007J\b\u0010\f\u001a\u00020\tH\u0007J\b\u0010\r\u001a\u00020\tH\u0007J\b\u0010\u000e\u001a\u00020\tH\u0007J\b\u0010\u000f\u001a\u00020\tH\u0007J\b\u0010\u0010\u001a\u00020\tH\u0007J\b\u0010\u0011\u001a\u00020\tH\u0007J\b\u0010\u0012\u001a\u00020\tH\u0007J\b\u0010\u0013\u001a\u00020\tH\u0007J\b\u0010\u0014\u001a\u00020\tH\u0007J\b\u0010\u0015\u001a\u00020\tH\u0007J\b\u0010\u0016\u001a\u00020\tH\u0007J\b\u0010\u0017\u001a\u00020\tH\u0007J\b\u0010\u0018\u001a\u00020\tH\u0007J\b\u0010\u0019\u001a\u00020\tH\u0007J\b\u0010\u001a\u001a\u00020\tH\u0007J\b\u0010\u001b\u001a\u00020\tH\u0007J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0005J\b\u0010'\u001a\u00020\tH\u0007J\b\u0010(\u001a\u00020\tH\u0007J\b\u0010)\u001a\u00020\tH\u0007J\b\u0010*\u001a\u00020\tH\u0007J\b\u0010+\u001a\u00020\tH\u0007J\b\u0010,\u001a\u00020\tH\u0007J\b\u0010-\u001a\u00020\tH\u0007J\b\u0010.\u001a\u00020\tH\u0007J\b\u0010/\u001a\u00020\tH\u0007J\b\u00100\u001a\u00020\tH\u0007J\b\u00101\u001a\u00020\tH\u0007J\b\u00104\u001a\u000203H\u0002J\b\u00105\u001a\u00020\tH\u0007J\b\u00106\u001a\u00020\tH\u0007J\b\u00107\u001a\u000203H\u0002J\b\u00108\u001a\u00020\tH\u0007J\b\u00109\u001a\u00020\tH\u0007J\b\u0010:\u001a\u00020\tH\u0007J\b\u0010;\u001a\u00020\tH\u0007J\b\u0010<\u001a\u00020\tH\u0007J\u0010\u0010=\u001a\u00020\u001f2\u0006\u0010>\u001a\u00020?H\u0002J\b\u0010@\u001a\u00020\tH\u0007J\b\u0010A\u001a\u00020\tH\u0007J\b\u0010B\u001a\u00020\tH\u0007J\b\u0010C\u001a\u00020\tH\u0007J\b\u0010D\u001a\u00020\tH\u0007J\b\u0010E\u001a\u00020\tH\u0007J\b\u0010F\u001a\u00020\tH\u0007J\b\u0010G\u001a\u00020\tH\u0007J\b\u0010H\u001a\u00020\tH\u0007J\b\u0010L\u001a\u00020\tH\u0007J\b\u0010M\u001a\u00020\tH\u0007J\b\u0010N\u001a\u00020\tH\u0007J\u0010\u0010O\u001a\u00020\u001f2\u0006\u0010P\u001a\u00020?H\u0002J\b\u0010Q\u001a\u00020\tH\u0007J\b\u0010R\u001a\u00020\tH\u0007J\b\u0010S\u001a\u00020\tH\u0007J\b\u0010U\u001a\u00020\tH\u0002J\u0015\u0010V\u001a\u00020W2\b\u0010X\u001a\u0004\u0018\u00010$¢\u0006\u0002\u0010YJ\b\u0010Z\u001a\u00020\tH\u0007J\b\u0010[\u001a\u00020\tH\u0007J\b\u0010\\\u001a\u00020\tH\u0007Jp\u0010]\u001a\u00020W2\u0006\u0010^\u001a\u00020_2\u000e\b\u0002\u0010`\u001a\b\u0012\u0002\b\u0003\u0018\u00010a2\u000e\b\u0002\u0010b\u001a\b\u0012\u0002\b\u0003\u0018\u00010a2\u000e\b\u0002\u0010c\u001a\b\u0012\u0002\b\u0003\u0018\u00010a2\u000e\b\u0002\u0010d\u001a\b\u0012\u0002\b\u0003\u0018\u00010a2\u000e\b\u0002\u0010e\u001a\b\u0012\u0002\b\u0003\u0018\u00010a2\u000e\b\u0002\u0010f\u001a\b\u0012\u0002\b\u0003\u0018\u00010aH\u0002J\u0012\u0010g\u001a\u0004\u0018\u00010?2\u0006\u0010^\u001a\u00020_H\u0002J·\u0001\u0010h\u001a\u00020\t2\u0006\u0010i\u001a\u00020$2\b\b\u0001\u0010j\u001a\u00020$2\b\b\u0001\u0010k\u001a\u00020$2\n\b\u0003\u0010l\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010m\u001a\u00020\u001f2\b\b\u0002\u0010n\u001a\u00020\u001f2\n\b\u0002\u0010o\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010p\u001a\u0010\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020W\u0018\u00010q2\u001b\b\u0002\u0010r\u001a\u0015\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u001f\u0018\u00010q¢\u0006\u0002\bs2\u001b\b\u0002\u0010t\u001a\u0015\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u001f\u0018\u00010q¢\u0006\u0002\bs2\u000e\b\u0002\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00050vH\u0002¢\u0006\u0002\u0010wJ\u008c\u0001\u0010x\u001a\u0002032\u0006\u0010i\u001a\u00020$2\b\b\u0001\u0010j\u001a\u00020$2\b\b\u0001\u0010k\u001a\u00020$2\n\b\u0003\u0010l\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010y\u001a\u00020\u001f2\u0016\b\u0002\u0010z\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020W\u0018\u00010q2\u001b\b\u0002\u0010r\u001a\u0015\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u001f\u0018\u00010q¢\u0006\u0002\bs2\u0016\b\u0002\u0010{\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020W\u0018\u00010qH\u0002¢\u0006\u0002\u0010|J$\u0010}\u001a\u00020W2\u0006\u0010~\u001a\u00020\u00052\u0012\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020W0qH\u0002J\u001d\u0010\u0080\u0001\u001a\u00020W2\u0012\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020W0qH\u0002J\t\u0010\u0081\u0001\u001a\u00020\u001fH\u0002J\u001b\u0010\u0082\u0001\u001a\u00020W2\b\u0010>\u001a\u0004\u0018\u00010?2\u0006\u00102\u001a\u000203H\u0002JL\u0010\u0083\u0001\u001a\u00020W2\u000e\u0010\u0084\u0001\u001a\t\u0012\u0004\u0012\u00020\u00050\u0085\u00012\u000e\u0010\u0086\u0001\u001a\t\u0012\u0004\u0012\u00020\u00050\u0085\u00012\u0007\u0010\u0087\u0001\u001a\u00020\u001f2\u0012\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020W0qH\u0002¢\u0006\u0003\u0010\u0088\u0001J\u0011\u0010\u0089\u0001\u001a\u00020W2\u0006\u0010^\u001a\u00020_H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u000e\u00102\u001a\u000203X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020JX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u008b\u0001"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/di/FeatureItemModule;", "", "<init>", "()V", "sTag", "", "mGson", "Lcom/google/gson/Gson;", "providePressureItem", "Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;", "provideSpo2Item", "provideSleepItem", "provideHeartRateItem", "provideAppLayoutItem", "provideSedentaryItem", "provideStandRemindItem", "provideSportSortItem", "provideSleepModelItem", "provideEmergencyContactItem", "provideAppSortItem", "provideKeepAliveHelpItem", "provideHOTSPOTItem", "provideUserGuideItem", "provideShortcutItem", "provideGoalRemindItem", "provideHandleTypeItem", "provideLimitBindItem", "provideWidgetManagerItem", "createWidgetManagerItem", "Lcom/xiaomi/fitness/devicesettings/di/FeatureItemModule$WidgetManagerItem;", "isN62SShowWidget", "", "REGEX_FIRMWARE_VERSION", "getREGEX_FIRMWARE_VERSION", "()Ljava/lang/String;", "compareFirmwareVersion", "", "latestVersion", "currentVersion", "provideDirectCardItem", "provideWorldClockItem", "provideUnlockPhoneItem", "provideUnlockLaptopItem", "provideVibrateModeItem", "provideBlueToothBroadcastItem", "provideHeartRateBroadcastItem", "provideVitalityItem", "provideTrackItem", "provideAODItem", "provideXiaoaiSkillCenterItem", "syncScheduleItem", "Lcom/xiaomi/fitness/device/manager/export/bean/TabContentSwitchItem;", "createSyncScheduleItem", "provideSyncScheduleItem", "provideSyncMiuiTodoItem", "createSyncMiuiTodoItem", "provideTodoRemindItem", "provideNightModeItem", "provideAlarmNotifyItem", "provideAboutDeviceItem", "provideMusicManagerItem", "isShowMusicEntrance", "device", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "provideAudioRecordItem", "provideWristScreenWakeItem", "provideStockListItem", "provideWeatherItem", "provideContactItem", "provideLanguageItem", "provideZenModeItem", "provideEventRemindItem", "provideOfflineMapItem", "findClickLastTime", "", "findClickCount", "provideFindDeviceItem", "provideAlarmItem", "provideConnectNewPhoneItem", "ifSupportMiuiClockAlert", "deviceModel", "provideLockOffWristItem", "provideCameraSettingItem", "provideSwitchWearModeItem", "switchWearModeItem", "createSwitchWearModeItem", "setWearMode", "", "mode", "(Ljava/lang/Integer;)V", "provideBPMeasureRemindSettingItem", "provideECGMeasureRemindSettingItem", "provideTemperatureSettingItem", "gotoPage", "context", "Landroid/content/Context;", "targetClass", "Ljava/lang/Class;", "huamiTargetClass", "panguTargetClass", "kongmingTargetClass", "bleTargetClass", "wearosTargetClass", "getCurrentDeviceModel", "createFeatureItem", "type", "icon", "title", Column.SUBTITLE, "more", "remind", "remindText", "onClickListener", "Lkotlin/Function1;", "itemVisible", "Lkotlin/ExtensionFunctionType;", "needConnect", "rightTextWithDot", "Landroidx/lifecycle/MutableLiveData;", "(IIILjava/lang/Integer;ZZLjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/MutableLiveData;)Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;", "createFeatureSwitchItem", "switchOn", "onCheckedChangeListener", "onDeviceChange", "(IIILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/xiaomi/fitness/device/manager/export/bean/TabContentSwitchItem;", "getPrivacySettings", "did", "callback", "requestCalendarPermission", "mergePreferenceByPermission", "isWearOsCalendarSyncOpen", "showCalendarPermissionDialog", "permissions", "", "descriptions", "needGoSetting", "([Ljava/lang/String;[Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "usbConnect", "WidgetManagerItem", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFeatureItemModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeatureItemModule.kt\ncom/xiaomi/fitness/devicesettings/di/FeatureItemModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1554:1\n1#2:1555\n216#3,2:1556\n*S KotlinDebug\n*F\n+ 1 FeatureItemModule.kt\ncom/xiaomi/fitness/devicesettings/di/FeatureItemModule\n*L\n1530#1:1556,2\n*E\n"})
public final class FeatureItemModule {

    @NotNull
    public static final FeatureItemModule INSTANCE;

    @NotNull
    private static final String REGEX_FIRMWARE_VERSION;
    private static int findClickCount = 0;
    private static long findClickLastTime = 0;

    @NotNull
    private static final Gson mGson;

    @NotNull
    public static final String sTag = "FeatureItemModule";

    @NotNull
    private static TabContentItem switchWearModeItem;

    @NotNull
    private static TabContentSwitchItem syncScheduleItem;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/di/FeatureItemModule$WidgetManagerItem;", "Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;", "Lcom/xiaomi/fitness/device/manager/export/IItemChangesWithDevice;", "<init>", "()V", "onDeviceChanged", "", "did", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WidgetManagerItem extends TabContentItem implements IItemChangesWithDevice {
        /* JADX WARN: Illegal instructions before constructor call */
        public WidgetManagerItem() {
            MutableLiveData<String> liveData;
            int i = jni.I0;
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel == null || !DeviceModelExtKt.isWearOS(wearableDeviceModel)) {
                String string = ApplicationExtKt.getApplication().getString(wzi.ba);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                liveData = StringExtKt.toLiveData(string);
            } else {
                String string2 = ApplicationExtKt.getApplication().getString(wzi.z9);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                liveData = StringExtKt.toLiveData(string2);
            }
            super(11, 155, i, liveData, null, false, null, null, null, new Function1() { // from class: af9
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return FeatureItemModule.WidgetManagerItem._init_$lambda$1((Context) obj);
                }
            }, new Function1() { // from class: bf9
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(FeatureItemModule.WidgetManagerItem._init_$lambda$2((WearableDeviceModel) obj));
                }
            }, null, null, 6640, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit _init_$lambda$1(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (!NetUtil.INSTANCE.getNetWorkAvailable(context)) {
                ToastUtil.showShortToast(wzi.common_hint_network_unavailable);
            }
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel != null) {
                if (DeviceModelExtKt.isWearOS(wearableDeviceModel)) {
                    FeatureItemModule.gotoPage$default(FeatureItemModule.INSTANCE, context, WearOsExtKt.getInstance(WearOSUtil.INSTANCE).gotoWearOsTilePage(), null, null, null, null, null, 124, null);
                } else {
                    FeatureItemModule.gotoPage$default(FeatureItemModule.INSTANCE, context, WidgetGroupManagerFragment.class, null, null, null, null, null, 124, null);
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean _init_$lambda$2(WearableDeviceModel wearableDeviceModel) {
            Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
            return (DeviceModelExtKt.isWearOS(wearableDeviceModel) || DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "widget")) && FeatureItemModule.INSTANCE.isN62SShowWidget();
        }

        @Override // com.xiaomi.fitness.device.manager.export.IItemChangesWithDevice
        public void onDeviceChanged(@NotNull String did) {
            Intrinsics.checkNotNullParameter(did, "did");
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did);
            String string = (wearableDeviceModel == null || !DeviceModelExtKt.isWearOS(wearableDeviceModel)) ? ApplicationExtKt.getApplication().getString(wzi.ba) : ApplicationExtKt.getApplication().getString(wzi.z9);
            Intrinsics.checkNotNull(string);
            Logger.d("onDeviceChanged", "changeTitle = " + string);
            getTitle().postValue(string);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.di.FeatureItemModule$showCalendarPermissionDialog$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/devicesettings/di/FeatureItemModule$showCalendarPermissionDialog$1", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class C21531 extends av6 {
        final /* synthetic */ Function1<Boolean, Unit> $callback;
        final /* synthetic */ String[] $descriptions;
        final /* synthetic */ boolean $needGoSetting;
        final /* synthetic */ String[] $permissions;

        /* JADX WARN: Multi-variable type inference failed */
        public C21531(boolean z, String[] strArr, String[] strArr2, Function1<? super Boolean, Unit> function1) {
            this.$needGoSetting = z;
            this.$permissions = strArr;
            this.$descriptions = strArr2;
            this.$callback = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$2(final Function1 callback, MultiplePermissionsBuilder permissions) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullParameter(permissions, "$this$permissions");
            permissions.allGranted(new Function0() { // from class: cf9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FeatureItemModule.C21531.onDialogClick$lambda$2$lambda$0(callback);
                }
            });
            permissions.denied(new Function1() { // from class: df9
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return FeatureItemModule.C21531.onDialogClick$lambda$2$lambda$1(callback, (List) obj);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$2$lambda$0(Function1 callback) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            callback.invoke2(Boolean.TRUE);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$2$lambda$1(Function1 callback, List it) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullParameter(it, "it");
            callback.invoke2(Boolean.FALSE);
            return Unit.INSTANCE;
        }

        @Override // defpackage.av6
        public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
            Activity currentActivity;
            super.onDialogClick(dialogName, dialog, which);
            if (which == -2) {
                if (dialog != null) {
                    dialog.dismiss();
                }
                this.$callback.invoke2(Boolean.FALSE);
            } else if (which == -1 && (currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity()) != null) {
                if (this.$needGoSetting) {
                    PermissionsUtil.INSTANCE.toPermissionSetting(currentActivity);
                    return;
                }
                String[] strArr = this.$permissions;
                String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                String[] strArr3 = this.$descriptions;
                final Function1<Boolean, Unit> function1 = this.$callback;
                PermissionExtKt.permissions((FragmentActivity) currentActivity, strArr2, strArr3, (Function1<? super MultiplePermissionsBuilder, Unit>) new Function1() { // from class: ef9
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return FeatureItemModule.C21531.onDialogClick$lambda$2(function1, (MultiplePermissionsBuilder) obj);
                    }
                });
            }
        }
    }

    static {
        FeatureItemModule featureItemModule = new FeatureItemModule();
        INSTANCE = featureItemModule;
        mGson = new Gson();
        REGEX_FIRMWARE_VERSION = "^(\\d+).(\\d+).(\\d+)$";
        syncScheduleItem = featureItemModule.createSyncScheduleItem();
        switchWearModeItem = featureItemModule.createSwitchWearModeItem();
    }

    private FeatureItemModule() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    private final TabContentItem createFeatureItem(int type, int icon, int title, Integer subtitle, boolean more, boolean remind, String remindText, Function1<? super Context, Unit> onClickListener, Function1<? super WearableDeviceModel, Boolean> itemVisible, Function1<? super WearableDeviceModel, Boolean> needConnect, MutableLiveData<String> rightTextWithDot) {
        MutableLiveData<String> liveData;
        if (subtitle != null) {
            String string = ApplicationExtKt.getApplication().getString(subtitle.intValue());
            if (string != null) {
                liveData = StringExtKt.toLiveData(string);
            } else {
                liveData = null;
            }
        } else {
            liveData = null;
        }
        String string2 = ApplicationExtKt.getApplication().getString(title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new TabContentItem(11, type, icon, StringExtKt.toLiveData(string2), liveData, more, new ObservableBoolean(remind), remindText != null ? StringExtKt.toLiveData(remindText) : null, needConnect, onClickListener, itemVisible, null, rightTextWithDot, 2048, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TabContentItem createFeatureItem$default(FeatureItemModule featureItemModule, int i, int i2, int i3, Integer num, boolean z, boolean z2, String str, Function1 function1, Function1 function2, Function1 function3, MutableLiveData mutableLiveData, int i4, Object obj) {
        return featureItemModule.createFeatureItem(i, i2, i3, (i4 & 8) != 0 ? null : num, (i4 & 16) != 0 ? true : z, (i4 & 32) != 0 ? false : z2, (i4 & 64) != 0 ? null : str, (i4 & 128) != 0 ? null : function1, (i4 & 256) != 0 ? null : function2, (i4 & 512) != 0 ? null : function3, (i4 & 1024) != 0 ? StringExtKt.toLiveData("") : mutableLiveData);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    private final TabContentSwitchItem createFeatureSwitchItem(int type, int icon, int title, Integer subtitle, boolean switchOn, Function1<? super Boolean, Unit> onCheckedChangeListener, Function1<? super WearableDeviceModel, Boolean> itemVisible, Function1<? super String, Unit> onDeviceChange) {
        MutableLiveData<String> liveData;
        if (subtitle != null) {
            String string = ApplicationExtKt.getApplication().getString(subtitle.intValue());
            if (string != null) {
                liveData = StringExtKt.toLiveData(string);
            } else {
                liveData = null;
            }
        } else {
            liveData = null;
        }
        MutableLiveData<String> mutableLiveData = liveData;
        String string2 = ApplicationExtKt.getApplication().getString(title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new TabContentSwitchItem(type, icon, StringExtKt.toLiveData(string2), 0, mutableLiveData, null, new MutableLiveData(Boolean.valueOf(switchOn)), itemVisible, onCheckedChangeListener, onDeviceChange, 40, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TabContentSwitchItem createFeatureSwitchItem$default(FeatureItemModule featureItemModule, int i, int i2, int i3, Integer num, boolean z, Function1 function1, Function1 function2, Function1 function3, int i4, Object obj) {
        return featureItemModule.createFeatureSwitchItem(i, i2, i3, (i4 & 8) != 0 ? null : num, (i4 & 16) != 0 ? false : z, (i4 & 32) != 0 ? null : function1, (i4 & 64) != 0 ? null : function2, (i4 & 128) != 0 ? null : function3);
    }

    private final TabContentItem createSwitchWearModeItem() {
        TabContentItem tabContentItemCreateFeatureItem$default = createFeatureItem$default(this, 174, jni.T0, wzi.y9, null, false, true, "", new Function1() { // from class: dc9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.createSwitchWearModeItem$lambda$107((Context) obj);
            }
        }, new Function1() { // from class: ec9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.createSwitchWearModeItem$lambda$108((WearableDeviceModel) obj));
            }
        }, null, null, 1560, null);
        switchWearModeItem = tabContentItemCreateFeatureItem$default;
        return tabContentItemCreateFeatureItem$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createSwitchWearModeItem$lambda$107(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gotoPage$default(INSTANCE, it, SwitchWearModeFragment.class, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createSwitchWearModeItem$lambda$108(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return (DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceCapability(createFeatureItem.getDid()) & 1024) != 0;
    }

    private final TabContentSwitchItem createSyncMiuiTodoItem() {
        final TabContentSwitchItem tabContentSwitchItemCreateFeatureSwitchItem$default = createFeatureSwitchItem$default(this, 204, jni.J, wzi.l8, Integer.valueOf(wzi.m8), MiuiTodoSettingHelper.INSTANCE.queryCurrentDeviceMiuiTodoSwitchStatus(), null, new Function1() { // from class: jb9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.createSyncMiuiTodoItem$lambda$65((WearableDeviceModel) obj));
            }
        }, null, 160, null);
        tabContentSwitchItemCreateFeatureSwitchItem$default.setOnCheckedChanged(new Function1() { // from class: kb9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.createSyncMiuiTodoItem$lambda$68$lambda$66(tabContentSwitchItemCreateFeatureSwitchItem$default, ((Boolean) obj).booleanValue());
            }
        });
        DeviceSettingsPreference.INSTANCE.registerOnSharedPreferenceChangeListener(new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: lb9
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                FeatureItemModule.createSyncMiuiTodoItem$lambda$68$lambda$67(tabContentSwitchItemCreateFeatureSwitchItem$default, sharedPreferences, str);
            }
        });
        return tabContentSwitchItemCreateFeatureSwitchItem$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createSyncMiuiTodoItem$lambda$65(WearableDeviceModel createFeatureSwitchItem) {
        Intrinsics.checkNotNullParameter(createFeatureSwitchItem, "$this$createFeatureSwitchItem");
        return TodoExtKt.getShowMiuiTodoEntranceEnable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createSyncMiuiTodoItem$lambda$68$lambda$66(TabContentSwitchItem this_apply, boolean z) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), wzi.u);
            this_apply.getSwitchOn().postValue(Boolean.valueOf(!z));
            return Unit.INSTANCE;
        }
        this_apply.getSwitchOn().postValue(Boolean.valueOf(z));
        MiuiTodoSettingHelper.INSTANCE.updateMiuiTodoSwitchStatus(wearableDeviceModel.getDid(), z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createSyncMiuiTodoItem$lambda$68$lambda$67(TabContentSwitchItem this_apply, SharedPreferences sharedPreferences, String str) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        if (str == null || !StringsKt__StringsJVMKt.startsWith$default(str, "sync_miui_todo", false, 2, null)) {
            return;
        }
        boolean zQueryCurrentDeviceMiuiTodoSwitchStatus = MiuiTodoSettingHelper.INSTANCE.queryCurrentDeviceMiuiTodoSwitchStatus();
        Logger.i("MIUI_TODO", "onSharedPreferenceChanged " + str + ";" + zQueryCurrentDeviceMiuiTodoSwitchStatus);
        this_apply.getSwitchOn().postValue(Boolean.valueOf(zQueryCurrentDeviceMiuiTodoSwitchStatus));
    }

    private final TabContentSwitchItem createSyncScheduleItem() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        final boolean zIsWearOS = wearableDeviceModel != null ? DeviceModelExtKt.isWearOS(wearableDeviceModel) : false;
        final TabContentSwitchItem tabContentSwitchItemCreateFeatureSwitchItem$default = createFeatureSwitchItem$default(this, 161, jni.F0, wzi.Oa, zIsWearOS ? null : Integer.valueOf(wzi.Pa), false, null, new Function1() { // from class: xd9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.createSyncScheduleItem$lambda$58((WearableDeviceModel) obj));
            }
        }, new Function1() { // from class: yd9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.createSyncScheduleItem$lambda$59((String) obj);
            }
        }, 48, null);
        tabContentSwitchItemCreateFeatureSwitchItem$default.setOnCheckedChanged(new Function1() { // from class: zd9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.createSyncScheduleItem$lambda$64$lambda$63(tabContentSwitchItemCreateFeatureSwitchItem$default, zIsWearOS, ((Boolean) obj).booleanValue());
            }
        });
        syncScheduleItem = tabContentSwitchItemCreateFeatureSwitchItem$default;
        return tabContentSwitchItemCreateFeatureSwitchItem$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createSyncScheduleItem$lambda$58(WearableDeviceModel createFeatureSwitchItem) {
        Intrinsics.checkNotNullParameter(createFeatureSwitchItem, "$this$createFeatureSwitchItem");
        return DeviceModelExtKt.isWearOS(createFeatureSwitchItem) || (DeviceModelExtKt.isSupportFeature(createFeatureSwitchItem, "calendar") && RomUtils.isXiaomi());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createSyncScheduleItem$lambda$59(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        boolean zIsWearOS = wearableDeviceModel != null ? DeviceModelExtKt.isWearOS(wearableDeviceModel) : false;
        Logger.i(sTag, "onDeviceChange currentIsWearOs: " + zIsWearOS);
        MutableLiveData<String> subtitle = syncScheduleItem.getSubtitle();
        if (subtitle != null) {
            subtitle.postValue(zIsWearOS ? null : ApplicationExtKt.getApplication().getString(wzi.Pa));
        }
        syncScheduleItem.getSwitchOn().postValue(Boolean.valueOf(zIsWearOS ? false : INSTANCE.mergePreferenceByPermission()));
        if (zIsWearOS) {
            INSTANCE.isWearOsCalendarSyncOpen(wearableDeviceModel, syncScheduleItem);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createSyncScheduleItem$lambda$64$lambda$63(final TabContentSwitchItem this_apply, final boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        final WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), wzi.common_hint_unkonwn_error);
            this_apply.getSwitchOn().postValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
        if (!wearableDeviceModel.getIsDeviceConnected()) {
            this_apply.getSwitchOn().postValue(Boolean.valueOf(!z2));
            return Unit.INSTANCE;
        }
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("click_v3", "56.50.1.1.22825"), "name", "image_table_btn", "result", Boolean.valueOf(z2));
        Logger.i(sTag, "setOnCheckedChanged:" + z2);
        if (z2) {
            INSTANCE.requestCalendarPermission(new Function1() { // from class: wa9
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return FeatureItemModule.createSyncScheduleItem$lambda$64$lambda$63$lambda$61(z, wearableDeviceModel, this_apply, ((Boolean) obj).booleanValue());
                }
            });
        } else if (z) {
            WearOsExtKt.getInstance(WearOSUtil.INSTANCE).setCalendarSync(wearableDeviceModel.getDeviceInfo().getNodeID(), false, new Function1() { // from class: ya9
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return FeatureItemModule.createSyncScheduleItem$lambda$64$lambda$63$lambda$62(this_apply, ((Boolean) obj).booleanValue());
                }
            });
        } else {
            DeviceSettingsPreference.INSTANCE.setNeedSyncSchedule(false);
            SyncExtKt.getInstance(SyncExportManager.INSTANCE).clearAllCalendars(wearableDeviceModel);
            this_apply.getSwitchOn().postValue(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createSyncScheduleItem$lambda$64$lambda$63$lambda$61(boolean z, WearableDeviceModel wearableDeviceModel, final TabContentSwitchItem this_apply, boolean z2) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Logger.i(sTag, "setOnCheckedChanged:" + z2 + " " + z);
        if (z2) {
            if (z) {
                WearOsExtKt.getInstance(WearOSUtil.INSTANCE).setCalendarSync(wearableDeviceModel.getDeviceInfo().getNodeID(), true, new Function1() { // from class: ie9
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return FeatureItemModule.createSyncScheduleItem$lambda$64$lambda$63$lambda$61$lambda$60(this_apply, ((Boolean) obj).booleanValue());
                    }
                });
            } else {
                DeviceSettingsPreference.INSTANCE.setNeedSyncSchedule(true);
                this_apply.getSwitchOn().postValue(Boolean.TRUE);
                SyncExtKt.getInstance(SyncExportManager.INSTANCE).syncCalendarToDevice(wearableDeviceModel, true, null, new eu6<Boolean>() { // from class: com.xiaomi.fitness.devicesettings.di.FeatureItemModule$createSyncScheduleItem$3$1$1$2
                    @Override // defpackage.eu6
                    public void onError(int errorCode) {
                        Logger.i("sync engine setSyncScheduleSwitch error: " + errorCode, new Object[0]);
                    }

                    @Override // defpackage.eu6
                    public void onResult(Boolean result) {
                    }
                });
            }
        } else if (!z) {
            DeviceSettingsPreference.INSTANCE.setNeedSyncSchedule(false);
            this_apply.getSwitchOn().postValue(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createSyncScheduleItem$lambda$64$lambda$63$lambda$61$lambda$60(TabContentSwitchItem this_apply, boolean z) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        this_apply.getSwitchOn().postValue(Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createSyncScheduleItem$lambda$64$lambda$63$lambda$62(TabContentSwitchItem this_apply, boolean z) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        this_apply.getSwitchOn().postValue(Boolean.valueOf(!z));
        return Unit.INSTANCE;
    }

    private final WidgetManagerItem createWidgetManagerItem() {
        return new WidgetManagerItem();
    }

    private final WearableDeviceModel getCurrentDeviceModel(Context context) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            ToastExtKt.toastShort(context, "device is null");
        }
        return wearableDeviceModel;
    }

    private final void getPrivacySettings(String did, final Function1<? super Boolean, Unit> callback) {
        AivsHelperExtKt.getInstance(AivsHelper.INSTANCE).getPrivacySettings(did, new PrivacyCallback() { // from class: com.xiaomi.fitness.devicesettings.di.FeatureItemModule.getPrivacySettings.1
            @Override // com.example.aivs.export.PrivacyCallback
            public void onError(String var1) {
                Logger.e("VOICE_OPTIMISE", "getPrivacySettings error :" + var1);
                callback.invoke2(Boolean.FALSE);
            }

            @Override // com.example.aivs.export.PrivacyCallback
            public void onSuccess(String var1) {
                Data data;
                PrivacySet privacy_set;
                Boolean speechRecognition;
                Logger.d("VOICE_OPTIMISE", "getPrivacySettings onSuccess :" + var1);
                AivsPrivacySetting aivsPrivacySetting = (AivsPrivacySetting) FeatureItemModule.mGson.fromJson(var1, AivsPrivacySetting.class);
                if (aivsPrivacySetting == null || (data = aivsPrivacySetting.getData()) == null || (privacy_set = data.getPrivacy_set()) == null || (speechRecognition = privacy_set.getSpeechRecognition()) == null) {
                    Function1<Boolean, Unit> function1 = callback;
                    Logger.e("VOICE_OPTIMISE", "getPrivacySettings error:setPrivacySetting is empty");
                    function1.invoke2(Boolean.FALSE);
                    return;
                }
                Function1<Boolean, Unit> function2 = callback;
                Logger.d("VOICE_OPTIMISE", "getPrivacySettings speechRecognition :" + speechRecognition.booleanValue());
                function2.invoke2(speechRecognition);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002c  */
    private final void gotoPage(Context context, Class<?> targetClass, Class<?> huamiTargetClass, Class<?> panguTargetClass, Class<?> kongmingTargetClass, Class<?> bleTargetClass, Class<?> wearosTargetClass) {
        if (targetClass == null) {
            WearableDeviceModel currentDeviceModel = getCurrentDeviceModel(context);
            if (currentDeviceModel == null) {
                targetClass = null;
            } else if (DeviceModelExtKt.isHuaMi(currentDeviceModel)) {
                if (huamiTargetClass == null) {
                    if (DeviceModelExtKt.isKongMing(currentDeviceModel)) {
                        panguTargetClass = kongmingTargetClass;
                    }
                    targetClass = panguTargetClass;
                } else {
                    targetClass = huamiTargetClass;
                }
            } else if (DeviceModelExtKt.isBluetooth(currentDeviceModel)) {
                targetClass = bleTargetClass;
            } else if (DeviceModelExtKt.isWearOS(currentDeviceModel)) {
                targetClass = wearosTargetClass;
            } else {
                targetClass = null;
            }
        }
        if (targetClass != null) {
            ContextExtKt.gotoPage$default(context, targetClass, null, 2, null);
        } else {
            ToastExtKt.toastShort(context, "unsupported device");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void gotoPage$default(FeatureItemModule featureItemModule, Context context, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, int i, Object obj) {
        featureItemModule.gotoPage(context, (i & 2) != 0 ? null : cls, (i & 4) != 0 ? null : cls2, (i & 8) != 0 ? null : cls3, (i & 16) != 0 ? null : cls4, (i & 32) != 0 ? null : cls5, (i & 64) == 0 ? cls6 : null);
    }

    private final boolean ifSupportMiuiClockAlert(WearableDeviceModel deviceModel) {
        int i;
        if (!RomUtils.isXiaomi() || !DeviceModelExtKt.isSupportFeature(deviceModel, "miui_clock_alert") || DeviceModelExtKt.isL66(deviceModel)) {
            return false;
        }
        try {
            i = ApplicationExtKt.getApplication().getPackageManager().getPackageInfo(SleepDataHelperKt.DEAK_CLOCK_PKG, 1).versionCode;
        } catch (Exception e) {
            e.printStackTrace();
            i = 0;
        }
        if (AppUtil.INSTANCE.isPlayChannel()) {
            if (i < 13010101) {
                return false;
            }
        } else if (i < 13010901) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isN62SShowWidget() {
        String str;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        Logger.i(sTag, "isN62SShowWidget device model: " + (wearableDeviceModel != null ? DeviceModelExtKt.getModel(wearableDeviceModel) : null));
        Map mapMapOf = MapsKt__MapsKt.mapOf(TuplesKt.to("mijia.watch.n62s", "1.3.0"), TuplesKt.to("miwear.watch.n67cn", "1.2.131"));
        if (wearableDeviceModel != null && mapMapOf.keySet().contains(DeviceModelExtKt.getModel(wearableDeviceModel))) {
            String firmwareVersion = DeviceModelExtKt.getFirmwareVersion(wearableDeviceModel);
            Logger.i(sTag, "isN62SShowWidget firmwareVersion: " + firmwareVersion);
            if (firmwareVersion == null || firmwareVersion.length() == 0) {
                firmwareVersion = N62SVersionPreference.INSTANCE.getN62SVersion(wearableDeviceModel.getDid());
            }
            if (firmwareVersion == null || firmwareVersion.length() == 0 || (str = (String) mapMapOf.get(DeviceModelExtKt.getModel(wearableDeviceModel))) == null) {
                return true;
            }
            try {
                return compareFirmwareVersion(firmwareVersion, str) < 0;
            } catch (Throwable th) {
                Logger.e(sTag, "isN62SShowWidget  throw exception: " + th);
            }
        }
        return true;
    }

    private final boolean isShowMusicEntrance(WearableDeviceModel device) {
        if (DeviceModelExtKt.isSupportFeature(device, Feature.LOCAL_MUSIC)) {
            return true;
        }
        MilinkManager.Companion companion = MilinkManager.INSTANCE;
        return ((MilinkManagerExtKt.getInstance(companion).isPhoneSupportMilink() && MilinkManagerExtKt.getInstance(companion).isDeviceSupportMilink()) || DeviceModelExtKt.isHuaMi(device)) ? false : true;
    }

    private final void isWearOsCalendarSyncOpen(WearableDeviceModel device, final TabContentSwitchItem syncScheduleItem2) {
        WearableDeviceInfo deviceInfo;
        Logger.i(sTag, "sync isWearOsCalendarSyncOpen");
        if (!PermissionsUtil.shouldRequestPermission(new String[]{"android.permission.READ_CALENDAR"})) {
            WearOsExtKt.getInstance(WearOSUtil.INSTANCE).getCalendarSync((device == null || (deviceInfo = device.getDeviceInfo()) == null) ? null : deviceInfo.getNodeID(), new Function1() { // from class: vb9
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return FeatureItemModule.isWearOsCalendarSyncOpen$lambda$124(syncScheduleItem2, ((Boolean) obj).booleanValue());
                }
            });
        } else {
            syncScheduleItem2.getSwitchOn().postValue(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit isWearOsCalendarSyncOpen$lambda$124(TabContentSwitchItem syncScheduleItem2, boolean z) {
        Intrinsics.checkNotNullParameter(syncScheduleItem2, "$syncScheduleItem");
        syncScheduleItem2.getSwitchOn().postValue(Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    private final boolean mergePreferenceByPermission() {
        DeviceSettingsPreference deviceSettingsPreference = DeviceSettingsPreference.INSTANCE;
        boolean zIsNeedSyncSchedule = deviceSettingsPreference.isNeedSyncSchedule();
        boolean z = !PermissionsUtil.shouldRequestPermission(new String[]{"android.permission.READ_CALENDAR"});
        if (zIsNeedSyncSchedule && !z) {
            deviceSettingsPreference.setNeedSyncSchedule(false);
            WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
            if (wearableDeviceModel == null) {
                return false;
            }
            if (wearableDeviceModel.getIsDeviceConnected()) {
                Logger.i("mergePreferenceByPermission", "no permission, switch off");
                SyncExtKt.getInstance(SyncExportManager.INSTANCE).clearAllCalendars(wearableDeviceModel);
            } else {
                Logger.i("mergePreferenceByPermission", "no permission, wait connect");
                DeviceManagerExtKt.getInstance(companion).addDeviceStatusListener(new OnDeviceStatusListener() { // from class: com.xiaomi.fitness.devicesettings.di.FeatureItemModule$mergePreferenceByPermission$onDeviceStatusListener$1
                    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
                    public void onConnectFailure(String did, int errorCode, int retryTimes) {
                    }

                    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
                    public void onConnectStart(String did) {
                    }

                    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
                    public void onConnectSuccess(String did) {
                        if (did != null) {
                            Logger.i("mergePreferenceByPermission", "no permission, switch off");
                            WearableDeviceManager.Companion companion2 = WearableDeviceManager.INSTANCE;
                            WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion2).getDeviceModel(did);
                            if (wearableDeviceModel2 == null) {
                                return;
                            }
                            SyncExtKt.getInstance(SyncExportManager.INSTANCE).clearAllCalendars(wearableDeviceModel2);
                            DeviceManagerExtKt.getInstance(companion2).removeDeviceStatusListener(this);
                        }
                    }

                    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
                    public void onDisconnect(String did) {
                    }
                });
            }
        }
        return zIsNeedSyncSchedule && z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideAODItem$lambda$54(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gotoPage$default(INSTANCE, it, AODSettingFragment.class, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideAODItem$lambda$55(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return (DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceCapability(createFeatureItem.getDid()) & 65536) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideAboutDeviceItem$lambda$75(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gotoPage$default(INSTANCE, it, DeviceInfoFragment.class, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideAlarmItem$lambda$100(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return DeviceModelExtKt.isSupportFeature(createFeatureItem, Feature.CLOCK) || INSTANCE.ifSupportMiuiClockAlert(createFeatureItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideAlarmItem$lambda$99(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("click_v3", "56.50.1.1.22823"), "name", "device_tab_alarm_enter");
        gotoPage$default(INSTANCE, it, AlarmClockFragment.class, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideAlarmNotifyItem$lambda$73(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gotoPage$default(INSTANCE, it, HuaMiAlarmNotifyFragment.class, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideAlarmNotifyItem$lambda$74(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideAppLayoutItem$lambda$8(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gotoPage$default(INSTANCE, it, WatchAppLayoutSettingFragment.class, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideAppLayoutItem$lambda$9(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return DeviceModelExtKt.isSupportFeature(createFeatureItem, Feature.APP_LAYOUT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideAppSortItem$lambda$20(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gotoPage$default(INSTANCE, it, null, HuaMiAppSortFragment.class, null, null, AppSortFragment.class, AppSortFragment.class, 26, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideAppSortItem$lambda$21(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return DeviceModelExtKt.isSupportFeature(createFeatureItem, Feature.LAUNCHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideAudioRecordItem$lambda$78(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (((WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel()) != null) {
            it.startActivity(new Intent(it, (Class<?>) AudioRecordListActivity.class));
        } else {
            ToastUtil.INSTANCE.showToast(wzi.q);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideAudioRecordItem$lambda$79(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        int deviceCapabilityV2 = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceCapabilityV2(createFeatureItem.getDid());
        boolean z = (deviceCapabilityV2 & 1024) != 0;
        boolean z2 = (524288 & deviceCapabilityV2) != 0;
        boolean zIsAtLeastHyperOS2 = RomUtils.INSTANCE.isAtLeastHyperOS2(ApplicationExtKt.getApplication());
        xc6.d("isSupportAudioRecord  deviceCapabilityV2:" + deviceCapabilityV2);
        if (z) {
            return (z2 && zIsAtLeastHyperOS2) ? false : true;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideAudioRecordItem$lambda$80(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideBPMeasureRemindSettingItem$lambda$109(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.startActivity(HealthPageExtKt.getInstance(IHealthPage.INSTANCE).goBloodPressureMeasurePage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideBPMeasureRemindSettingItem$lambda$110(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return DeviceModelExtKt.isSupportFeature(createFeatureItem, "blood_pressure");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideBlueToothBroadcastItem$lambda$46(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gotoPage$default(INSTANCE, it, BLTBroadCastFragment.class, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideBlueToothBroadcastItem$lambda$47(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return DeviceModelExtKt.isSupportFeature(createFeatureItem, Feature.BLUETOOTH_BROADCAST);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideCameraSettingItem$lambda$105(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gotoPage$default(INSTANCE, it, PhotoSetFragment.class, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideCameraSettingItem$lambda$106(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return !DeviceModelExtKt.isL66(createFeatureItem) && DeviceModelExtKt.isSupportFeature(createFeatureItem, Feature.TAKE_PHOTO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideConnectNewPhoneItem$lambda$101(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ContextExtKt.gotoConnectNewPhone$default(it, ConnectNewPhoneFragment.class, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideConnectNewPhoneItem$lambda$102(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return (DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceCapability(createFeatureItem.getDid()) & 262144) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideContactItem$lambda$87(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.startActivity(new Intent(it, (Class<?>) TopContactsActivity.class));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideContactItem$lambda$88(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return DeviceModelExtKt.isSupportFeature(createFeatureItem, "contact");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideDirectCardItem$lambda$36(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gotoPage$default(INSTANCE, it, null, HuaMiShortcutSortFragment.class, null, null, DirectCardFragment.class, null, 90, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideDirectCardItem$lambda$37(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return DeviceModelExtKt.isSupportFeature(createFeatureItem, Feature.TILE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideECGMeasureRemindSettingItem$lambda$111(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gotoPage$default(INSTANCE, it, ECGMeasureRemindFragment.class, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideECGMeasureRemindSettingItem$lambda$112(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return DeviceModelExtKt.isSupportFeature(createFeatureItem, Feature.ECG_MEASURE_REMIND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideEmergencyContactItem$lambda$18(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return Unit.INSTANCE;
        }
        gotoPage$default(INSTANCE, it, (DeviceManagerExtKt.getInstance(companion).getDeviceCapability(wearableDeviceModel.getDid()) & 32768) == 32768 ? FallDetectionFragment.class : EmergencyContactFragment.class, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideEmergencyContactItem$lambda$19(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return DeviceModelExtKt.isSupportFeature(createFeatureItem, Feature.EMERGENCY_CONTACT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideEventRemindItem$lambda$93(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gotoPage$default(INSTANCE, it, EventReminderFragment.class, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideEventRemindItem$lambda$94(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return TodoExtKt.getShowEventReminderEntranceEnable(createFeatureItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideFindDeviceItem$lambda$97(final Context it) throws RemoteException {
        Intrinsics.checkNotNullParameter(it, "it");
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return Unit.INSTANCE;
        }
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("click_v3", "56.50.1.1.22827"), "name", "device_tab_find_device");
        if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            HuamiApiCaller huamiDevice = com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.getHuamiDevice(wearableDeviceModel);
            if (huamiDevice != null) {
                huamiDevice.alertFind();
            }
        } else if (DeviceModelExtKt.isBluetooth(wearableDeviceModel) | DeviceModelExtKt.isWearOS(wearableDeviceModel)) {
            if (System.currentTimeMillis() - findClickLastTime < 60000) {
                int i = findClickCount + 1;
                findClickCount = i;
                Logger.i("find device count: " + i, new Object[0]);
                if (findClickCount == 5) {
                    ToastExtKt.toastShort(it, wzi.x1);
                }
            } else {
                findClickCount = 0;
                findClickLastTime = System.currentTimeMillis();
            }
            if ((DeviceManagerExtKt.getInstance(companion).getDeviceCapability(wearableDeviceModel.getDid()) & 2097152) != 0) {
                gotoPage$default(INSTANCE, it, FindDeviceFragment.class, null, null, null, null, null, 124, null);
            } else {
                new DeviceSettingsXmsImpl().startFindDevice(wearableDeviceModel.getDid(), new b.a() { // from class: com.xiaomi.fitness.devicesettings.di.FeatureItemModule$provideFindDeviceItem$1$1
                    @Override // com.xiaomi.fitness.devicesettings.xms.b
                    public void onResult(int status) {
                        if (status == 1) {
                            ToastExtKt.toastShort(it, wzi.x4);
                        } else {
                            ToastExtKt.toastShort(it, wzi.Ra);
                        }
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideFindDeviceItem$lambda$98(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return DeviceModelExtKt.isSupportFeature(createFeatureItem, Feature.FIND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideGoalRemindItem$lambda$29(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gotoPage$default(INSTANCE, it, null, GoalRemindFragment.class, null, null, null, null, 122, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideGoalRemindItem$lambda$30(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return DeviceModelExtKt.isSupportFeature(createFeatureItem, Feature.GOAL_REMIND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideHOTSPOTItem$lambda$23(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gotoPage$default(INSTANCE, it, HotspotFragment.class, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideHOTSPOTItem$lambda$24(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return DeviceModelExtKt.isSupportFeature(createFeatureItem, "pan");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideHandleTypeItem$lambda$31(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gotoPage$default(INSTANCE, it, WearLocationFragment.class, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideHandleTypeItem$lambda$32(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return DeviceModelExtKt.isSupportFeature(createFeatureItem, Feature.WEAR_TYPE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideHeartRateBroadcastItem$lambda$48(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gotoPage$default(INSTANCE, it, HeartRateBroadCastFragment.class, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideHeartRateBroadcastItem$lambda$49(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return DeviceModelExtKt.isSupportFeature(createFeatureItem, Feature.SPORT_HR_BROADCAST);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideHeartRateItem$lambda$6(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        SettingsPageUtilExtKt.getSettingsPageUtil().gotoHeartRatePage(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideHeartRateItem$lambda$7(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return DeviceModelExtKt.isHuaMi(createFeatureItem) || DeviceModelExtKt.isSupportFeature(createFeatureItem, "heart_rate");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideKeepAliveHelpItem$lambda$22(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Constants.goKeepAliveBrowserActivity$default(Constants.INSTANCE, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideLanguageItem$lambda$89(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gotoPage$default(INSTANCE, it, null, LanguageSettingFragment.class, null, null, null, null, 122, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideLanguageItem$lambda$90(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return DeviceModelExtKt.isSupportFeature(createFeatureItem, "language");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideLimitBindItem$lambda$33(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gotoPage$default(INSTANCE, it, LimitBindFragment.class, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideLimitBindItem$lambda$34(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return DeviceModelExtKt.isSupportFeature(createFeatureItem, Feature.RESTRICT_BIND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideLockOffWristItem$lambda$103(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gotoPage$default(INSTANCE, it, UnWearSettingFragment.class, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideLockOffWristItem$lambda$104(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return DeviceModelExtKt.isSupportFeature(createFeatureItem, Feature.WRIST_LOCK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideMusicManagerItem$lambda$76(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gotoPage$default(INSTANCE, it, MusicFragment.class, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideMusicManagerItem$lambda$77(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return INSTANCE.isShowMusicEntrance(createFeatureItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideNightModeItem$lambda$71(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gotoPage$default(INSTANCE, it, NightModeSetFragment.class, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideNightModeItem$lambda$72(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.isSupportNightMode(createFeatureItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideOfflineMapItem$lambda$95(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Constants.INSTANCE.goOfflineMapActivity();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideOfflineMapItem$lambda$96(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return (DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceCapability(createFeatureItem.getDid()) & 134217728) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit providePressureItem$lambda$0(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        SettingsPageUtilExtKt.getSettingsPageUtil().gotoPressurePage(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean providePressureItem$lambda$1(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return DeviceModelExtKt.isHuaMi(createFeatureItem) || DeviceModelExtKt.isSupportFeature(createFeatureItem, Feature.PRESSURE_MONITOR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideSedentaryItem$lambda$10(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gotoPage$default(INSTANCE, it, SedentaryFragment.class, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideSedentaryItem$lambda$11(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return DeviceModelExtKt.isSupportFeature(createFeatureItem, Feature.SEDENTARY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideShortcutItem$lambda$27(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gotoPage$default(INSTANCE, it, BleShortcutFragment.class, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideShortcutItem$lambda$28(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return DeviceModelExtKt.isSupportFeature(createFeatureItem, Feature.SHORTCUT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideSleepItem$lambda$4(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        SettingsPageUtilExtKt.getSettingsPageUtil().gotoSleepPage(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideSleepItem$lambda$5(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return DeviceModelExtKt.isSupportFeature(createFeatureItem, Feature.ASSIST_SLEEP) && !DeviceModelExtKt.isKongMing(createFeatureItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideSleepModelItem$lambda$16(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("click_v3", "56.50.1.1.22820"), "name", "device_tab_sleep_model_enter");
        gotoPage$default(INSTANCE, it, SleepModelFragment.class, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideSleepModelItem$lambda$17(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return DeviceModelExtKt.isSupportFeature(createFeatureItem, "bedtime_clock");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideSpo2Item$lambda$2(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        SettingsPageUtilExtKt.getSettingsPageUtil().gotoSpo2Page(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideSpo2Item$lambda$3(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return DeviceModelExtKt.isSupportFeature(createFeatureItem, Feature.BLOOD_OXYGEN_MONITOR) || DeviceModelExtKt.isL66(createFeatureItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideSportSortItem$lambda$14(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gotoPage$default(INSTANCE, it, null, SportTypeSortFragment.class, null, null, SportSortFragment.class, null, 90, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideSportSortItem$lambda$15(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return DeviceModelExtKt.isSupportFeature(createFeatureItem, Feature.SPORT_SORT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideStandRemindItem$lambda$12(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gotoPage$default(INSTANCE, it, SedentaryFragment.class, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideStandRemindItem$lambda$13(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return DeviceModelExtKt.isSupportFeature(createFeatureItem, Feature.STAND_REMINDER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideStockListItem$lambda$83(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gotoPage$default(INSTANCE, it, null, null, null, null, StockListFragment.class, null, 94, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideStockListItem$lambda$84(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return DeviceModelExtKt.isSupportFeature(createFeatureItem, "stock");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideTemperatureSettingItem$lambda$113(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gotoPage$default(INSTANCE, it, TemperatureSettingFragment.class, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideTemperatureSettingItem$lambda$114(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return (DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceCapabilityV2(createFeatureItem.getDid()) & 65536) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideTodoRemindItem$lambda$69(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gotoPage$default(INSTANCE, it, TodoRemindFragment.class, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideTodoRemindItem$lambda$70(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return TodoExtKt.getShowAppTodoRemindEntranceEnable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideTrackItem$lambda$52(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gotoPage$default(INSTANCE, it, TrackSettingFragment.class, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideTrackItem$lambda$53(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        return ((DeviceManagerExtKt.getInstance(companion).getDeviceCapability(createFeatureItem.getDid()) & 134217728) == 0 && (DeviceManagerExtKt.getInstance(companion).getDeviceCapabilityV2(createFeatureItem.getDid()) & 4) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideUnlockLaptopItem$lambda$42(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gotoPage$default(INSTANCE, it, AuthorizeUnlockFragment.class, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideUnlockLaptopItem$lambda$43(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.isSupportUnlockLaptop(createFeatureItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideUnlockPhoneItem$lambda$40(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("click_v3", "56.50.1.1.22828"), "name", "device_tab_unlock_phone");
        gotoPage$default(INSTANCE, it, UnlockPhoneFragment.class, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideUnlockPhoneItem$lambda$41(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.isSupportUnlockPhone(createFeatureItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideUserGuideItem$lambda$25(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Constants.INSTANCE.goUserGuideBrowserActivity();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideUserGuideItem$lambda$26(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return DeviceModelExtKt.isSupportFeature(createFeatureItem, Feature.GUIDE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideVibrateModeItem$lambda$44(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gotoPage$default(INSTANCE, it, VibrateModeListFragment.class, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideVibrateModeItem$lambda$45(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return DeviceModelExtKt.isHuaMi(createFeatureItem) || (DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceCapability(createFeatureItem.getDid()) & 2048) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideVitalityItem$lambda$50(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gotoPage$default(INSTANCE, it, VitalitySettingFragment.class, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideVitalityItem$lambda$51(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return (DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceCapability(createFeatureItem.getDid()) & 4096) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideWeatherItem$lambda$85(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gotoPage$default(INSTANCE, it, null, WeatherSetFragment.class, null, null, WeatherSetFragment.class, WeatherSetFragment.class, 26, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideWeatherItem$lambda$86(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return DeviceModelExtKt.isSupportFeature(createFeatureItem, "weather");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideWorldClockItem$lambda$38(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gotoPage$default(INSTANCE, it, WorldClockFragment.class, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideWorldClockItem$lambda$39(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.isSupportWorldClock(createFeatureItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideWristScreenWakeItem$lambda$81(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gotoPage$default(INSTANCE, it, null, ScreenWakeForHuamiFragment.class, null, null, ScreenWakeForBleFragment.class, ScreenWakeForBleFragment.class, 26, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideWristScreenWakeItem$lambda$82(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.isSupportWristScreenWake(createFeatureItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideXiaoaiSkillCenterItem$lambda$56(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gotoPage$default(INSTANCE, it, AivsSettingFragment.class, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideXiaoaiSkillCenterItem$lambda$57(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.isSupportXiaoAi(createFeatureItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideZenModeItem$lambda$91(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (WearOsExtKt.getInstance(WearOSUtil.INSTANCE).isWearOSZenMode()) {
            Logger.i("ZenMode", "not support wearos sdk ZenMode sync");
        } else {
            gotoPage$default(INSTANCE, it, ZenModeSettingFragment.class, null, null, null, null, null, 124, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideZenModeItem$lambda$92(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return ZenUtils.INSTANCE.isSupportZenMode(createFeatureItem) && !WearOsExtKt.getInstance(WearOSUtil.INSTANCE).isWearOSZenMode();
    }

    private final void requestCalendarPermission(final Function1<? super Boolean, Unit> callback) {
        final String[] strArr = {"android.permission.READ_CALENDAR"};
        final String[] strArr2 = {ResourceExtKt.getString(wzi.df)};
        if (!PermissionsUtil.shouldRequestPermission(strArr)) {
            callback.invoke2(Boolean.TRUE);
            return;
        }
        try {
            final Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
            if (PermissionExtKt.supportMiuiPermissionEnable()) {
                Intrinsics.checkNotNull(currentActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                PermissionExtKt.permissions((FragmentActivity) currentActivity, (String[]) Arrays.copyOf(strArr, 1), strArr2, (Function1<? super MultiplePermissionsBuilder, Unit>) new Function1() { // from class: vc9
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return FeatureItemModule.requestCalendarPermission$lambda$123(callback, currentActivity, strArr, strArr2, (MultiplePermissionsBuilder) obj);
                    }
                });
            } else {
                showCalendarPermissionDialog(strArr, strArr2, false, callback);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestCalendarPermission$lambda$123(final Function1 callback, final Activity activity, final String[] permissions, final String[] descriptions, MultiplePermissionsBuilder permissions2) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(permissions, "$permissions");
        Intrinsics.checkNotNullParameter(descriptions, "$descriptions");
        Intrinsics.checkNotNullParameter(permissions2, "$this$permissions");
        permissions2.allGranted(new Function0() { // from class: za9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FeatureItemModule.requestCalendarPermission$lambda$123$lambda$120(callback);
            }
        });
        permissions2.denied(new Function1() { // from class: ab9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.requestCalendarPermission$lambda$123$lambda$122(callback, activity, permissions, descriptions, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestCalendarPermission$lambda$123$lambda$120(Function1 callback) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.invoke2(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestCalendarPermission$lambda$123$lambda$122(final Function1 callback, Activity activity, final String[] permissions, final String[] descriptions, List it) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(permissions, "$permissions");
        Intrinsics.checkNotNullParameter(descriptions, "$descriptions");
        Intrinsics.checkNotNullParameter(it, "it");
        callback.invoke2(Boolean.FALSE);
        IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE), "android.permission.READ_CALENDAR", activity, null, null, null, new Function0() { // from class: ud9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FeatureItemModule.requestCalendarPermission$lambda$123$lambda$122$lambda$121(permissions, descriptions, callback);
            }
        }, 28, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestCalendarPermission$lambda$123$lambda$122$lambda$121(String[] permissions, String[] descriptions, Function1 callback) {
        Intrinsics.checkNotNullParameter(permissions, "$permissions");
        Intrinsics.checkNotNullParameter(descriptions, "$descriptions");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        INSTANCE.showCalendarPermissionDialog(permissions, descriptions, true, callback);
        return Unit.INSTANCE;
    }

    private final void showCalendarPermissionDialog(String[] permissions, String[] descriptions, boolean needGoSetting, Function1<? super Boolean, Unit> callback) {
        String string = ResourceExtKt.getString(wzi.e6);
        SpannableString spannableString = new SpannableString(string + "\n\r\n\r" + ResourceExtKt.getString(wzi.h6));
        spannableString.setSpan(new StyleSpan(1), 0, string.length(), 17);
        CommonDialog commonDialogAddDialogCallback = new CommonDialog.c("sync schedule").setDialogTitle(wzi.of).setDialogDescriptionString(new DialogParams.DialogDescriptionString(spannableString)).setPositiveText(wzi.common_allow).setNegativeText(wzi.common_reject).setCancelable(false).create().addDialogCallback(new C21531(needGoSetting, permissions, descriptions, callback));
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        Intrinsics.checkNotNull(currentActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        commonDialogAddDialogCallback.showIfNeed(((FragmentActivity) currentActivity).getSupportFragmentManager());
    }

    private final void usbConnect(Context context) {
        Object systemService = context.getSystemService("usb");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.usb.UsbManager");
        UsbManager usbManager = (UsbManager) systemService;
        HashMap<String, UsbDevice> deviceList = usbManager.getDeviceList();
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(UsbPermissionReceiver.ACTION_USB_PERMISSION), 67108864);
        if (deviceList.isEmpty()) {
            context.registerReceiver(new UsbPermissionReceiver(), new IntentFilter(UsbPermissionReceiver.ACTION_USB_PERMISSION), 2);
        }
        Intrinsics.checkNotNull(deviceList);
        UsbDevice value = null;
        for (Map.Entry<String, UsbDevice> entry : deviceList.entrySet()) {
            String deviceName = entry.getValue().getDeviceName();
            Intrinsics.checkNotNullExpressionValue(deviceName, "getDeviceName(...)");
            Logger.i("LoggerOfflineMap", "device name = " + deviceName + ",venderId = " + entry.getValue().getVendorId() + ",productId = " + entry.getValue().getProductId());
            value = entry.getValue();
        }
        UsbDevice usbDevice = value;
        if (usbDevice == null) {
            ToastUtil.showLongToast("请连接设备！");
            Logger.i("OfflineMap", "device为空");
            return;
        }
        if (usbManager.hasPermission(usbDevice)) {
            Logger.i("OfflineMap", "deviceName:" + usbDevice.getDeviceName() + ",已获得权限");
            context.startActivity(new Intent(context, (Class<?>) OfflineMapManagerActivity.class));
            return;
        }
        Logger.i("OfflineMap", "deviceName:" + usbDevice.getDeviceName() + ",未获得权限");
        usbManager.requestPermission(usbDevice, broadcast);
    }

    public final int compareFirmwareVersion(@NotNull String latestVersion, @NotNull String currentVersion) {
        Intrinsics.checkNotNullParameter(latestVersion, "latestVersion");
        Intrinsics.checkNotNullParameter(currentVersion, "currentVersion");
        Pattern patternCompile = Pattern.compile(REGEX_FIRMWARE_VERSION);
        Matcher matcher = patternCompile.matcher(latestVersion);
        Matcher matcher2 = patternCompile.matcher(currentVersion);
        if (!matcher.matches() || !matcher2.matches()) {
            throw new IllegalArgumentException("firmware version not matched".toString());
        }
        for (int i = 1; i < 4; i++) {
            String strGroup = matcher.group(i);
            Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
            int i2 = Integer.parseInt(strGroup);
            String strGroup2 = matcher2.group(i);
            Intrinsics.checkNotNullExpressionValue(strGroup2, "group(...)");
            int i3 = Integer.parseInt(strGroup2);
            if (i2 > i3) {
                return 1;
            }
            if (i2 < i3) {
                return -1;
            }
        }
        return 0;
    }

    @NotNull
    public final String getREGEX_FIRMWARE_VERSION() {
        return REGEX_FIRMWARE_VERSION;
    }

    @NotNull
    public final TabContentItem provideAODItem() {
        return createFeatureItem$default(this, 177, jni.O, wzi.R, null, false, false, null, new Function1() { // from class: zc9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideAODItem$lambda$54((Context) obj);
            }
        }, new Function1() { // from class: ad9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideAODItem$lambda$55((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideAboutDeviceItem() {
        return createFeatureItem$default(this, 145, jni.k0, wzi.w, null, false, false, null, new Function1() { // from class: sc9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideAboutDeviceItem$lambda$75((Context) obj);
            }
        }, null, null, null, 1912, null);
    }

    @NotNull
    public final TabContentItem provideAlarmItem() {
        return createFeatureItem$default(this, 120, jni.C, wzi.I, null, false, false, null, new Function1() { // from class: fe9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideAlarmItem$lambda$99((Context) obj);
            }
        }, new Function1() { // from class: ge9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideAlarmItem$lambda$100((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideAlarmNotifyItem() {
        return createFeatureItem$default(this, 163, jni.l0, wzi.L, null, false, false, null, new Function1() { // from class: ne9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideAlarmNotifyItem$lambda$73((Context) obj);
            }
        }, new Function1() { // from class: pe9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideAlarmNotifyItem$lambda$74((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideAppLayoutItem() {
        return createFeatureItem$default(this, 129, jni.m0, wzi.V, null, false, false, null, new Function1() { // from class: ma9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideAppLayoutItem$lambda$8((Context) obj);
            }
        }, new Function1() { // from class: pb9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideAppLayoutItem$lambda$9((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideAppSortItem() {
        return createFeatureItem$default(this, 128, jni.n0, wzi.W, null, false, false, null, new Function1() { // from class: bc9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideAppSortItem$lambda$20((Context) obj);
            }
        }, new Function1() { // from class: cc9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideAppSortItem$lambda$21((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideAudioRecordItem() {
        return createFeatureItem$default(this, 216, jni.p, wzi.x6, null, false, false, null, new Function1() { // from class: bd9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideAudioRecordItem$lambda$78((Context) obj);
            }
        }, new Function1() { // from class: cd9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideAudioRecordItem$lambda$79((WearableDeviceModel) obj));
            }
        }, new Function1() { // from class: dd9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideAudioRecordItem$lambda$80((WearableDeviceModel) obj));
            }
        }, null, 1144, null);
    }

    @NotNull
    public final TabContentItem provideBPMeasureRemindSettingItem() {
        return createFeatureItem$default(this, 182, jni.y, wzi.c1, null, false, false, null, new Function1() { // from class: ue9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideBPMeasureRemindSettingItem$lambda$109((Context) obj);
            }
        }, new Function1() { // from class: ve9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideBPMeasureRemindSettingItem$lambda$110((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideBlueToothBroadcastItem() {
        return createFeatureItem$default(this, 135, jni.D, wzi.d1, null, false, false, null, new Function1() { // from class: oa9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideBlueToothBroadcastItem$lambda$46((Context) obj);
            }
        }, new Function1() { // from class: pa9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideBlueToothBroadcastItem$lambda$47((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideCameraSettingItem() {
        return createFeatureItem$default(this, 125, jni.p0, wzi.j6, null, false, false, null, new Function1() { // from class: sa9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideCameraSettingItem$lambda$105((Context) obj);
            }
        }, new Function1() { // from class: ta9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideCameraSettingItem$lambda$106((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideConnectNewPhoneItem() {
        return createFeatureItem$default(this, 211, jni.g0, wzi.U0, null, false, false, null, new Function1() { // from class: le9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideConnectNewPhoneItem$lambda$101((Context) obj);
            }
        }, new Function1() { // from class: me9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideConnectNewPhoneItem$lambda$102((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideContactItem() {
        return createFeatureItem$default(this, 164, jni.G0, wzi.N2, null, false, false, null, new Function1() { // from class: qc9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideContactItem$lambda$87((Context) obj);
            }
        }, new Function1() { // from class: rc9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideContactItem$lambda$88((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideDirectCardItem() {
        return createFeatureItem$default(this, 127, jni.A0, wzi.ia, null, false, false, null, new Function1() { // from class: vd9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideDirectCardItem$lambda$36((Context) obj);
            }
        }, new Function1() { // from class: wd9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideDirectCardItem$lambda$37((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideECGMeasureRemindSettingItem() {
        return createFeatureItem$default(this, 181, jni.z, wzi.t3, null, false, false, null, new Function1() { // from class: jc9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideECGMeasureRemindSettingItem$lambda$111((Context) obj);
            }
        }, new Function1() { // from class: kc9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideECGMeasureRemindSettingItem$lambda$112((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideEmergencyContactItem() {
        return createFeatureItem$default(this, 157, jni.q0, wzi.S3, null, false, false, null, new Function1() { // from class: yb9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideEmergencyContactItem$lambda$18((Context) obj);
            }
        }, new Function1() { // from class: zb9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideEmergencyContactItem$lambda$19((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideEventRemindItem() {
        return createFeatureItem$default(this, 121, jni.E, wzi.e4, null, false, false, null, new Function1() { // from class: gd9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideEventRemindItem$lambda$93((Context) obj);
            }
        }, new Function1() { // from class: id9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideEventRemindItem$lambda$94((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideFindDeviceItem() {
        return createFeatureItem$default(this, 134, jni.F, wzi.r4, null, false, false, null, new Function1() { // from class: mc9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideFindDeviceItem$lambda$97((Context) obj);
            }
        }, new Function1() { // from class: nc9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideFindDeviceItem$lambda$98((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideGoalRemindItem() {
        return createFeatureItem$default(this, 118, jni.r0, wzi.D4, null, false, false, null, new Function1() { // from class: pd9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideGoalRemindItem$lambda$29((Context) obj);
            }
        }, new Function1() { // from class: qd9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideGoalRemindItem$lambda$30((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideHOTSPOTItem() {
        return createFeatureItem$default(this, 169, jni.B, wzi.d5, null, false, false, null, new Function1() { // from class: xa9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideHOTSPOTItem$lambda$23((Context) obj);
            }
        }, new Function1() { // from class: gb9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideHOTSPOTItem$lambda$24((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideHandleTypeItem() {
        return createFeatureItem$default(this, 133, jni.f22950k, wzi.l9, null, false, false, null, new Function1() { // from class: hb9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideHandleTypeItem$lambda$31((Context) obj);
            }
        }, new Function1() { // from class: ib9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideHandleTypeItem$lambda$32((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideHeartRateBroadcastItem() {
        return createFeatureItem$default(this, 136, jni.u0, wzi.S4, null, false, false, null, new Function1() { // from class: je9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideHeartRateBroadcastItem$lambda$48((Context) obj);
            }
        }, new Function1() { // from class: ke9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideHeartRateBroadcastItem$lambda$49((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideHeartRateItem() {
        return createFeatureItem$default(this, 113, jni.s0, wzi.W4, null, false, false, null, new Function1() { // from class: qa9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideHeartRateItem$lambda$6((Context) obj);
            }
        }, new Function1() { // from class: ra9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideHeartRateItem$lambda$7((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideKeepAliveHelpItem() {
        WearableDeviceInfo deviceInfo;
        int i = jni.v0;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        return createFeatureItem$default(this, 112, i, (wearableDeviceModel == null || (deviceInfo = wearableDeviceModel.getDeviceInfo()) == null || !deviceInfo.isBandType()) ? wzi.t : wzi.s, null, false, false, null, new Function1() { // from class: he9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideKeepAliveHelpItem$lambda$22((Context) obj);
            }
        }, null, null, StringExtKt.toLiveData(!d2m.y(ApplicationExtKt.getApplication()) ? " " : ""), 888, null);
    }

    @NotNull
    public final TabContentItem provideLanguageItem() {
        return createFeatureItem$default(this, 137, jni.o0, wzi.n5, null, false, false, null, new Function1() { // from class: wb9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideLanguageItem$lambda$89((Context) obj);
            }
        }, new Function1() { // from class: xb9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideLanguageItem$lambda$90((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideLimitBindItem() {
        return createFeatureItem$default(this, 141, jni.l, wzi.o5, null, false, false, null, new Function1() { // from class: ae9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideLimitBindItem$lambda$33((Context) obj);
            }
        }, new Function1() { // from class: be9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideLimitBindItem$lambda$34((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideLockOffWristItem() {
        return createFeatureItem$default(this, 138, jni.w0, wzi.r5, null, false, false, null, new Function1() { // from class: ob9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideLockOffWristItem$lambda$103((Context) obj);
            }
        }, new Function1() { // from class: qb9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideLockOffWristItem$lambda$104((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideMusicManagerItem() {
        return createFeatureItem$default(this, 201, jni.P, wzi.z5, null, false, false, null, new Function1() { // from class: mb9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideMusicManagerItem$lambda$76((Context) obj);
            }
        }, new Function1() { // from class: nb9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideMusicManagerItem$lambda$77((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideNightModeItem() {
        return createFeatureItem$default(this, 132, jni.x0, wzi.N5, null, false, false, null, new Function1() { // from class: ye9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideNightModeItem$lambda$71((Context) obj);
            }
        }, new Function1() { // from class: na9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideNightModeItem$lambda$72((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideOfflineMapItem() {
        return createFeatureItem$default(this, 212, jni.G, wzi.X5, null, false, false, null, new Function1() { // from class: ed9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideOfflineMapItem$lambda$95((Context) obj);
            }
        }, new Function1() { // from class: fd9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideOfflineMapItem$lambda$96((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem providePressureItem() {
        return createFeatureItem$default(this, 116, jni.y0, wzi.m6, null, false, false, null, new Function1() { // from class: wc9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.providePressureItem$lambda$0((Context) obj);
            }
        }, new Function1() { // from class: hd9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.providePressureItem$lambda$1((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideSedentaryItem() {
        return createFeatureItem$default(this, 117, jni.z0, wzi.Z6, null, false, false, null, new Function1() { // from class: ld9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideSedentaryItem$lambda$10((Context) obj);
            }
        }, new Function1() { // from class: md9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideSedentaryItem$lambda$11((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideShortcutItem() {
        return createFeatureItem$default(this, 153, jni.t0, wzi.a5, null, false, false, null, new Function1() { // from class: rb9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideShortcutItem$lambda$27((Context) obj);
            }
        }, new Function1() { // from class: sb9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideShortcutItem$lambda$28((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideSleepItem() {
        return createFeatureItem$default(this, 114, jni.B0, wzi.k7, null, false, false, null, new Function1() { // from class: ce9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideSleepItem$lambda$4((Context) obj);
            }
        }, new Function1() { // from class: ee9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideSleepItem$lambda$5((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideSleepModelItem() {
        return createFeatureItem$default(this, 156, jni.B0, wzi.g7, null, false, false, null, new Function1() { // from class: hc9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideSleepModelItem$lambda$16((Context) obj);
            }
        }, new Function1() { // from class: ic9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideSleepModelItem$lambda$17((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideSpo2Item() {
        return createFeatureItem$default(this, 115, jni.C0, wzi.L7, null, false, false, null, new Function1() { // from class: oe9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideSpo2Item$lambda$2((Context) obj);
            }
        }, new Function1() { // from class: ze9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideSpo2Item$lambda$3((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideSportSortItem() {
        return createFeatureItem$default(this, 126, jni.D0, wzi.N7, null, false, false, null, new Function1() { // from class: xc9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideSportSortItem$lambda$14((Context) obj);
            }
        }, new Function1() { // from class: yc9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideSportSortItem$lambda$15((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideStandRemindItem() {
        return createFeatureItem$default(this, 165, jni.z0, wzi.a8, null, false, false, null, new Function1() { // from class: nd9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideStandRemindItem$lambda$12((Context) obj);
            }
        }, new Function1() { // from class: od9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideStandRemindItem$lambda$13((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideStockListItem() {
        return createFeatureItem$default(this, 123, jni.E0, wzi.b8, null, false, false, null, new Function1() { // from class: fc9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideStockListItem$lambda$83((Context) obj);
            }
        }, new Function1() { // from class: gc9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideStockListItem$lambda$84((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideSwitchWearModeItem() {
        return createSwitchWearModeItem();
    }

    @NotNull
    public final TabContentItem provideSyncMiuiTodoItem() {
        return createSyncMiuiTodoItem();
    }

    @NotNull
    public final TabContentItem provideSyncScheduleItem() {
        return createSyncScheduleItem();
    }

    @NotNull
    public final TabContentItem provideTemperatureSettingItem() {
        return createFeatureItem$default(this, 217, jni.n, wzi.he, null, false, false, null, new Function1() { // from class: jd9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideTemperatureSettingItem$lambda$113((Context) obj);
            }
        }, new Function1() { // from class: kd9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideTemperatureSettingItem$lambda$114((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideTodoRemindItem() {
        return createFeatureItem$default(this, 205, jni.J, wzi.w8, null, false, false, null, new Function1() { // from class: tb9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideTodoRemindItem$lambda$69((Context) obj);
            }
        }, new Function1() { // from class: ub9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideTodoRemindItem$lambda$70((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideTrackItem() {
        return createFeatureItem$default(this, 179, jni.U, wzi.C8, null, false, false, null, new Function1() { // from class: se9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideTrackItem$lambda$52((Context) obj);
            }
        }, new Function1() { // from class: te9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideTrackItem$lambda$53((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideUnlockLaptopItem() {
        return createFeatureItem$default(this, 140, jni.K, wzi.G8, null, false, false, null, new Function1() { // from class: oc9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideUnlockLaptopItem$lambda$42((Context) obj);
            }
        }, new Function1() { // from class: pc9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideUnlockLaptopItem$lambda$43((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideUnlockPhoneItem() {
        return createFeatureItem$default(this, 139, jni.L, wzi.J8, null, false, false, null, new Function1() { // from class: ua9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideUnlockPhoneItem$lambda$40((Context) obj);
            }
        }, new Function1() { // from class: va9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideUnlockPhoneItem$lambda$41((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideUserGuideItem() {
        return createFeatureItem$default(this, 152, jni.X0, wzi.V8, null, false, false, null, new Function1() { // from class: ac9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideUserGuideItem$lambda$25((Context) obj);
            }
        }, new Function1() { // from class: lc9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideUserGuideItem$lambda$26((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideVibrateModeItem() {
        return createFeatureItem$default(this, 131, jni.m, wzi.f9, null, false, false, null, new Function1() { // from class: tc9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideVibrateModeItem$lambda$44((Context) obj);
            }
        }, new Function1() { // from class: uc9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideVibrateModeItem$lambda$45((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideVitalityItem() {
        return createFeatureItem$default(this, 173, jni.V, wzi.h9, null, false, false, null, new Function1() { // from class: qe9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideVitalityItem$lambda$50((Context) obj);
            }
        }, new Function1() { // from class: re9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideVitalityItem$lambda$51((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideWeatherItem() {
        return createFeatureItem$default(this, 122, jni.H0, wzi.M9, null, false, false, null, new Function1() { // from class: db9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideWeatherItem$lambda$85((Context) obj);
            }
        }, new Function1() { // from class: eb9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideWeatherItem$lambda$86((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideWidgetManagerItem() {
        return createWidgetManagerItem();
    }

    @NotNull
    public final TabContentItem provideWorldClockItem() {
        return createFeatureItem$default(this, 124, jni.J0, wzi.L2, null, false, false, null, new Function1() { // from class: rd9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideWorldClockItem$lambda$38((Context) obj);
            }
        }, new Function1() { // from class: td9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideWorldClockItem$lambda$39((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideWristScreenWakeItem() {
        return createFeatureItem$default(this, 130, jni.K0, wzi.Aa, null, false, false, null, new Function1() { // from class: we9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideWristScreenWakeItem$lambda$81((Context) obj);
            }
        }, new Function1() { // from class: xe9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideWristScreenWakeItem$lambda$82((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideXiaoaiSkillCenterItem() {
        return createFeatureItem$default(this, 142, jni.L0, wzi.Ja, null, false, false, null, new Function1() { // from class: sd9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideXiaoaiSkillCenterItem$lambda$56((Context) obj);
            }
        }, new Function1() { // from class: de9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideXiaoaiSkillCenterItem$lambda$57((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    @NotNull
    public final TabContentItem provideZenModeItem() {
        return createFeatureItem$default(this, 166, jni.M0, wzi.Na, null, false, false, null, new Function1() { // from class: bb9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideZenModeItem$lambda$91((Context) obj);
            }
        }, new Function1() { // from class: cb9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideZenModeItem$lambda$92((WearableDeviceModel) obj));
            }
        }, null, null, 1656, null);
    }

    public final void setWearMode(@Nullable Integer mode) {
        String string;
        MutableLiveData<String> remindText = switchWearModeItem.getRemindText();
        if (remindText != null) {
            if (mode != null && mode.intValue() == 0) {
                string = ResourceExtKt.getString(wzi.m9);
            } else if (mode != null && mode.intValue() == 1) {
                string = ResourceExtKt.getString(wzi.p9);
            } else {
                string = (mode != null && mode.intValue() == 2) ? ResourceExtKt.getString(wzi.s9) : "";
            }
            remindText.postValue(string);
        }
    }
}
