package com.xiaomi.hm.health.devicex.navigation;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.gson.Gson;
import com.huami.account.ui.areas.SelectAreaHelper;
import com.huami.account.ui.bind.PhoneBindActivity;
import com.huami.core.device.wifi_settings.service.IWiFiControllerProxy;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity;
import com.huami.watch.companion.ui.activity.DeviceStatusActivity;
import com.huami.watch.companion.ui.activity.XiHuDeviceStatusActivity;
import com.huami.watchfacesstore.ui.WatchFacesStoreActivity;
import com.huami.worldclock.home.WorldClockActivity;
import com.xiaomi.hm.health.activity.MainTabActivity;
import com.xiaomi.hm.health.activity.StartUpActivity;
import com.xiaomi.hm.health.bodyfat.activity.InstructScale2Activity;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Alarm;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.GesScreenActivity;
import com.xiaomi.hm.health.device.HMAppSortActivity;
import com.xiaomi.hm.health.device.HMBindDeviceActivity;
import com.xiaomi.hm.health.device.HMBlueMonkeySettingActivity;
import com.xiaomi.hm.health.device.HMContinueUpgradeActivity;
import com.xiaomi.hm.health.device.HMDeviceHelperActivity;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMFwChangeLogActivity;
import com.xiaomi.hm.health.device.HMGt2SystemUpgradeActivity;
import com.xiaomi.hm.health.device.HMHeadsetSettingActivity;
import com.xiaomi.hm.health.device.HMMiLiSettingActivity;
import com.xiaomi.hm.health.device.HMNormandySettingActivity;
import com.xiaomi.hm.health.device.HMResetAlertDialog;
import com.xiaomi.hm.health.device.HMSelectCityActivity;
import com.xiaomi.hm.health.device.HMShoesCalibrateActivity;
import com.xiaomi.hm.health.device.HMShoesSettingActivity;
import com.xiaomi.hm.health.device.HMShoesUseActivity;
import com.xiaomi.hm.health.device.HMShortcutAppSortNewActivity;
import com.xiaomi.hm.health.device.HMShotcutAppSortActivity;
import com.xiaomi.hm.health.device.HMSportSortActivity;
import com.xiaomi.hm.health.device.HMTreadmillSettingActivity;
import com.xiaomi.hm.health.device.HMUnbindDeviceActivity;
import com.xiaomi.hm.health.device.HMUnifySelectDeviceActivity;
import com.xiaomi.hm.health.device.HMUnusedDeviceActivity;
import com.xiaomi.hm.health.device.HMUseDeviceActivity;
import com.xiaomi.hm.health.device.HMWeatherSettingActivity;
import com.xiaomi.hm.health.device.HMWeightSettingActivity;
import com.xiaomi.hm.health.device.HmBindFitbitActivity;
import com.xiaomi.hm.health.device.HmEarbudMusicActivity;
import com.xiaomi.hm.health.device.HmFitbitDeviceActivity;
import com.xiaomi.hm.health.device.InstallNormandyActivity;
import com.xiaomi.hm.health.device.MiliNowTimeSettingActivity;
import com.xiaomi.hm.health.device.NightModeActivity;
import com.xiaomi.hm.health.device.OffWistSettingActivity;
import com.xiaomi.hm.health.device.PhoneEnvActivity;
import com.xiaomi.hm.health.device.UnbindAlipayActivity;
import com.xiaomi.hm.health.device.amazfit_watch.WatchDetailActivity;
import com.xiaomi.hm.health.device.bind.analytic.ConstantKt;
import com.xiaomi.hm.health.device.capturedevice.DeviceQRInfo;
import com.xiaomi.hm.health.device.capturedevice.HMCaptureWatchQRActivity;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.earbud.activity.HmEarbudAlarmSetActivity;
import com.xiaomi.hm.health.device.earbud.activity.HmEarbudBreathTrainActivity;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeActivity;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeInfoActivity;
import com.xiaomi.hm.health.device.headset.SingleHeadsetUpgradeActivity;
import com.xiaomi.hm.health.device.health.ui.HealthDetectSettingActivity;
import com.xiaomi.hm.health.device.model.HMBrandType;
import com.xiaomi.hm.health.device.setting.ui.DeviceSettingActivity;
import com.xiaomi.hm.health.device.setting.ui.HMUnusedDeviceActivityNew;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXZeppNavigator;
import com.xiaomi.hm.health.device.settings.sport.MiliSportSettingActivity;
import com.xiaomi.hm.health.device.settings.sport.model.SportCategory;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinListActivity;
import com.xiaomi.hm.health.device.watchskinnew.ui.HMDialListActivity;
import com.xiaomi.hm.health.device.watchskinstore.ui.WatchSkinStoreActivity;
import com.xiaomi.hm.health.device.weight.InstructionWeightActivity;
import com.xiaomi.hm.health.device.weight.InstructionWeightBfsActivity;
import com.xiaomi.hm.health.discovery.WebHelper;
import com.xiaomi.hm.health.lightappstore.LightAppStore;
import com.xiaomi.hm.health.nfc.WalletActivity;
import com.xiaomi.hm.health.smalltool.ToolNavigateActivity;
import com.xiaomi.hm.health.speech.activity.SpeechEngineUpdateMiotAuthorizeActivity;
import com.xiaomi.hm.health.speech.speech.ui.AlexaLanguageSettingActivity;
import com.xiaomi.hm.health.ui.diagnosis.DiagnosisActivity;
import com.xiaomi.hm.health.ui.keekalive.KeepAliveActivity;
import com.xiaomi.hm.health.ui.keekalive.KeepAliveTipsActivity;
import com.xiaomi.hm.health.ui.language.DeviceLanguageSettingActivity;
import com.xiaomi.hm.health.ui.playmiband2.MiBand2InstructionActivity;
import com.xiaomi.hm.health.ui.playmiband2.MiBand3InstructionActivity;
import com.xiaomi.hm.health.ui.smartplay.AlertListActivityNew;
import com.xiaomi.hm.health.ui.smartplay.AppNotificationAlertActivity;
import com.xiaomi.hm.health.ui.smartplay.AvoidSpiteBindingActivity;
import com.xiaomi.hm.health.ui.smartplay.IdBroadcastActivity;
import com.xiaomi.hm.health.ui.smartplay.IncomingCallAlertActivity;
import com.xiaomi.hm.health.ui.smartplay.MiBandAlarmActivity;
import com.xiaomi.hm.health.ui.smartplay.RestoreDeviceConfigActivity;
import com.xiaomi.hm.health.ui.smartplay.ScreenUnlockActivity;
import com.xiaomi.hm.health.ui.smartplay.SetAlarmActivity;
import com.xiaomi.hm.health.ui.smartplay.SettingItemLibraryActivity;
import com.xiaomi.hm.health.ui.smartplay.SportHRBroadcastActivity;
import com.xiaomi.hm.health.ui.smartplay.appnotify.AddNotifyAppActivity;
import com.xiaomi.hm.health.ui.smartplay.customvibrate.ui.VibrateTypeActivity;
import com.xiaomi.hm.health.ui.smartplay.eventremind.EventRemindActivity;
import com.xiaomi.hm.health.ui.smartplay.logsit.LongSitAlertActivity;
import com.xiaomi.hm.health.utils.Utils;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\u0018\u0000 \u009e\u00012\u00020\u0001:\u0002\u009e\u0001B\t¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u001c\u0010\u000e\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\"\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J$\u0010\u0015\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J&\u0010\u0016\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00142\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0018\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u001bH\u0016J\u0018\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u001c\u0010 \u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010!\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010#\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\"H\u0016J\u0010\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0002H\u0016J \u0010)\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u00112\u0006\u0010(\u001a\u00020'H\u0016J \u0010,\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\fH\u0016J\u0010\u0010-\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010%\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\u0011H\u0016J \u00104\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u0002002\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u0011H\u0016J\u0018\u00105\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0018\u00106\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u00107\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u0002002\u0006\u00103\u001a\u00020\u0011H\u0016J\u0010\u00108\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u00109\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010:\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0019\u0010<\u001a\u00020\n2\b\u0010;\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b<\u0010=J\u0018\u0010?\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020>H\u0016J\u0018\u0010@\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u0002002\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010A\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010C\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J(\u0010F\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020\u000fH\u0016J\u0018\u0010H\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010G\u001a\u00020\fH\u0016J\u0010\u0010I\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010J\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\fH\u0016J\u0018\u0010L\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010K\u001a\u00020\u0011H\u0016J\u0010\u0010M\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010N\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010O\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010R\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010Q\u001a\u00020PH\u0016J\u0010\u0010S\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010T\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010U\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010V\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u0002002\u0006\u00103\u001a\u00020\u0011H\u0016J\u0010\u0010W\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010X\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010Y\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010Z\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010[\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u0002002\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u00103\u001a\u00020\u0011H\u0016J\u0010\u0010\\\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010]\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010^\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010_\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010`\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010c\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u0002002\u0006\u00103\u001a\u00020\u0011H\u0016J\u0018\u0010d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010h\u001a\u00020\u00062\u0006\u0010g\u001a\u00020fH\u0016J\u0010\u0010i\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010j\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\"\u0010p\u001a\u00020\u00062\u0006\u0010l\u001a\u00020k2\b\u0010n\u001a\u0004\u0018\u00010m2\u0006\u0010o\u001a\u00020fH\u0016J\u0018\u0010q\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010s\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010u\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J \u0010v\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010w\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010x\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u000200H\u0016J\u0010\u0010y\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010z\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010|\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u0002002\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010{\u001a\u00020\u0011H\u0016J(\u0010|\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u0002002\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010{\u001a\u00020\u00112\u0006\u0010}\u001a\u00020\u000fH\u0016J\u0010\u0010~\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u007f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0011\u0010\u0080\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0011\u0010\u0081\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0011\u0010\u0082\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0011\u0010\u0083\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J0\u0010\u0086\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u000f2\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0011\u0010\u0088\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0019\u0010\u0089\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\fH\u0016J\u0019\u0010\u008a\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\"\u0010\u008a\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0007\u0010\u008b\u0001\u001a\u00020\fH\u0016J\u0019\u0010\u008c\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J\u001a\u0010\u008e\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010\u008d\u0001\u001a\u00020fH\u0016J\u0011\u0010\u008f\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J$\u0010\u0091\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010\u0090\u0001\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0011\u0010\u0092\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0011\u0010\u0093\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0011\u0010\u0094\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0011\u0010\u0095\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0011\u0010\u0096\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\"\u0010\u0098\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00112\u0007\u0010\u0097\u0001\u001a\u00020\fH\u0016J\u0011\u0010\u0099\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0011\u0010\u009a\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0011\u0010\u009b\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u009f\u0001"}, d2 = {"Lcom/xiaomi/hm/health/devicex/navigation/DeviceXNavigatorImpl;", "Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXZeppNavigator;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/databases/model/Device;", "device", "", "navigateToUnused", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "Landroid/content/Intent;", "createDeviceSettingIntent", "", "packageName", "goToMarket", "", "fullTest", "", PhoneBindActivity.EXTRA_BIND_TYPE, "testPhoneEnv", "Landroid/bluetooth/BluetoothDevice;", "startBindWatch", "startBindWatchByScanAdv", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "startBind", "startBindShoes", "Lcom/xiaomi/hm/health/device/model/HMBrandType;", "startBindNormandy", "startBindHeadSetNew", "startBindEarbud", "startCapture", "startUseDeviceNewTask", "createMainTabIntent", "Lcom/huami/watch/companion/device/Device;", "startDeviceStatus", "fromContext", "showDeviceHelperActivity", "sourceType", "Lcom/xiaomi/hm/health/device/capturedevice/DeviceQRInfo;", "deviceQRInfo", "startBindDeviceActivityByQrCode", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "sn", "startBindActivityUseSnAndAddress", "startEarbudBreathTrainActivity", "helperType", "showReason", "Landroid/app/Activity;", "Lcom/xiaomi/hm/health/databases/model/Alarm;", "alarm", "requestCode", "startEarbudAlarmSetActivity", "startAppNotificationAlertActivity", "startFwUpgradeInfoActivity", "startUnbindDeviceActivityForResult", "startSingleHeadsetUpgradeActivity", "startEventRemindActivity", "startUnifySelectDeviceActivity", "isUpgrading", "createStartUpActivityIntent", "(Ljava/lang/Boolean;)Landroid/content/Intent;", "Lcom/huami/core/device/wifi_settings/service/IWiFiControllerProxy$ClickType;", "onControllerProxyClickHelp", "startHmFitbitDeviceActivity", "startBindFitbitActivity", "ctx", "launchWeightDevicePlay", "force", "newIntent", "startHMGt2SystemUpgradeActivity", "changeLog", "startHMFwChangeLogActivity", "isHMGt2SystemUpgradeActivity", "startContinueUpgradeActivity", "index", "startWatchSkinStoreActivity", "startHMDialListActivity", "startWatchFacesStoreActivity", "startWatchSkinListActivity", "Lcom/xiaomi/hm/health/device/settings/sport/model/SportCategory;", "category", "startMiliSportSettingActivity", "startAppSettings", "startKeepAliveTipsActivity", "startScreenUnlockActivity", "startAddNotifyAppActivity", "startWalletActivity", "startSettingItemLibraryActivity", "startSportHRBroadcastActivity", "startAvoidSpiteBindingActivity", "startHMUnbindDeviceActivity", "startIncomingCallAlertActivity", "startMiBandAlarmActivity", "startLongSitAlertActivity", "startIdBroadcastActivity", "startHMHrDetectSettingActivity", "startHMWeatherSettingActivity", "startGesScreenActivity", "startSpeechEngineUpdateMiotAuthorizeActivity", "startHMAppSortActivity", "startAlertListActivityNew", "Landroidx/fragment/app/FragmentManager;", "manager", "showHMResetAlertDialog", "startMiBand2InstructionActivity", "startOffWistSettingActivity", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "fm", "showAlexaLanguageSettingActivity", "startShortcutAppSort", "startHMSportSortActivity", "startNightModeActivity", "startKeepAliveActivity", "startDeviceLanguageSettingActivity", "startWorldClockActivity", "startMiliNowTimeSettingActivity", "startMiBand3InstructionActivity", "startVibrateTypeActivity", "startHMMiLiSettingActivity", "id", "startSetAlarmActivity", "isForceDark", "startHMSelectCityActivity", "startUnbindAlipayActivity", "startHmEarbudMusicActivity", "startHMTreadmillSettingActivity", "jumpToTreadmillFaq", "startHMShoesUseActivity", "fromUseOrBind", "isFirstBind", "startHMWeightSettingActivity", "(Landroid/content/Context;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "startHMBlueMonkeySettingActivity", "startHMHeadsetSettingActivity", "startRestoreDeviceConfigActivity", "restoreItems", "startToolNavigateActivity", "fragmentManager", "startAlexaAuthActivity", "startJsAppPage", "caliFrom", "startHMShoesCalibrateActivity", "startBindHeadSet", "startHMNormandySettingActivity", "startHMShoesSettingActivity", "startWatchDetailActivity", "startHMSelectShoesActivity", "key", "startDetailInfoActivity", "startPhoneAlarmActivity", "startHMSelectDeviceActivity", "startNotificationDiagnosisActivity", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceXNavigatorImpl implements DeviceXZeppNavigator {

    @NotNull
    private static final String a = "https://api.huami.com/t/mifit.play.scale.104";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "navigateToUnused, device null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "navigateToUnused, context null";
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    @NotNull
    public Intent createDeviceSettingIntent(@Nullable Context context, @NotNull HMDeviceSource source) {
        if (ConfigHelperKt.hasFeature(source, Feature.SUPPORT_NEW_DEVICE_SETTING)) {
            return new Intent(context, (Class<?>) DeviceSettingActivity.class);
        }
        if (!ConfigHelperKt.hasFeature(source, Feature.IS_VIRTUAL_DEVICE)) {
            return new Intent(context, (Class<?>) HMMiLiSettingActivity.class);
        }
        Intent intent = new Intent(context, (Class<?>) HmFitbitDeviceActivity.class);
        intent.putExtra("db_device", HMDeviceManager.getInstance().getDeviceBound(source.getType()));
        return intent;
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    @NotNull
    public Intent createMainTabIntent(@NotNull Context context) {
        return new Intent(context, (Class<?>) MainTabActivity.class);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    @NotNull
    public Intent createStartUpActivityIntent(@Nullable Boolean isUpgrading) {
        Intent intent = new Intent(DeviceXFunctionsKt.getContext(), (Class<?>) StartUpActivity.class);
        intent.putExtra(StartUpActivity.FROM_NOTIFY_KEY, StartUpActivity.FROM_NOTIFY);
        if (isUpgrading != null) {
            isUpgrading.booleanValue();
            intent.putExtra(StartUpActivity.KEY_IS_SYSTEM_UPGRADING, true);
        }
        return intent;
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void goToMarket(@Nullable Context context, @Nullable String packageName) {
        Utils.goToMarket(context, "com.huami.watch.hmwatchmanager");
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public boolean isHMGt2SystemUpgradeActivity(@NotNull Context context) {
        return context instanceof HMGt2SystemUpgradeActivity;
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void jumpToTreadmillFaq(@NotNull Context context) {
        HMTreadmillSettingActivity.INSTANCE.jumpToTreadmillFaq(context);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void launchWeightDevicePlay(@NotNull Context ctx, @NotNull HMDeviceSource source) {
        if (source == HMDeviceSource.WEIGHT_BODYFAT || source == HMDeviceSource.WEIGHT_BFS) {
            ctx.startActivity(new Intent(ctx, (Class<?>) InstructionWeightBfsActivity.class));
            return;
        }
        if (source == HMDeviceSource.WEIGHT_AMAZFIT_SCALE) {
            WebHelper.launch(a);
            return;
        }
        if (source == HMDeviceSource.WEIGHT_SCALE2) {
            ctx.startActivity(new Intent(ctx, (Class<?>) InstructScale2Activity.class));
        } else if (source == HMDeviceSource.WEIGHT) {
            ctx.startActivity(new Intent(ctx, (Class<?>) InstructionWeightActivity.class));
        } else {
            ctx.startActivity(new Intent(ctx, (Class<?>) InstructionWeightActivity.class));
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void navigateToDeviceSetting(@Nullable Context context, @NotNull HMDeviceSource hMDeviceSource) {
        DeviceXZeppNavigator.DefaultImpls.navigateToDeviceSetting(this, context, hMDeviceSource);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void navigateToUnused(@Nullable Context context, @Nullable Device device) {
        if (device == null) {
            HMLog.info$default(null, a.a, 1, null);
            return;
        }
        if (context == null) {
            HMLog.info$default(null, b.a, 1, null);
        } else {
            if (!ConfigHelperKt.hasFeature(HMDeviceSource.fromValue(device.getDevice_source().intValue()), Feature.SUPPORT_NEW_DEVICE_SETTING)) {
                HMUnusedDeviceActivity.start(context, device);
                return;
            }
            Intent intent = new Intent(context, (Class<?>) HMUnusedDeviceActivityNew.class);
            intent.putExtra("db_device", device);
            context.startActivity(intent);
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void onControllerProxyClickHelp(@NotNull Context context, @NotNull IWiFiControllerProxy.ClickType type) {
        HMDeviceHelperActivity.show(context, type == IWiFiControllerProxy.ClickType.CONNECT_TIPS ? 8 : 7, 3);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void showAlexaLanguageSettingActivity(@NotNull FragmentActivity activity, @Nullable CoroutineScope coroutineScope, @NotNull FragmentManager fm) {
        AlexaLanguageSettingActivity.INSTANCE.show(activity, fm);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void showDeviceHelperActivity(@NotNull Context fromContext) {
        HMDeviceHelperActivity.show(fromContext, 4, 2);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void showHMResetAlertDialog(@NotNull FragmentManager manager) {
        HMResetAlertDialog hMResetAlertDialog = new HMResetAlertDialog();
        FragmentTransaction fragmentTransactionBeginTransaction = manager.beginTransaction();
        fragmentTransactionBeginTransaction.setTransition(4099);
        hMResetAlertDialog.show(fragmentTransactionBeginTransaction, "df");
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startAddNotifyAppActivity(@NotNull Activity context, int requestCode) {
        context.startActivityForResult(new Intent(context, (Class<?>) AddNotifyAppActivity.class), requestCode);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startAlertListActivityNew(@NotNull Context context, @NotNull HMDeviceSource source) {
        Intent intent = new Intent(context, (Class<?>) AlertListActivityNew.class);
        if (source == HMDeviceSource.MILI_TOKYO) {
            intent.putExtras(AlertListActivityNew.createHideBundle(true, true, true, false));
        }
        context.startActivity(intent);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startAlexaAuthActivity(@NotNull Context context, @NotNull FragmentManager fragmentManager) {
        AlexaLanguageSettingActivity.INSTANCE.show(context, fragmentManager);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startAppNotificationAlertActivity(@NotNull Context context, @NotNull HMDeviceType type) {
        Intent intent = new Intent(context, (Class<?>) AppNotificationAlertActivity.class);
        intent.putExtra("deviceType", type.getValue());
        context.startActivity(intent);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startAppSettings(@NotNull Context context) {
        Utils.startAppSettings(context);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startAvoidSpiteBindingActivity(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) AvoidSpiteBindingActivity.class));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startBind(@NotNull Context context, @NotNull HMDeviceType type) {
        HMBindDeviceActivity.startBind(context, type);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startBindActivityUseSnAndAddress(@NotNull Context context, @NotNull String address, @NotNull String sn) {
        Intent intent = new Intent(context, (Class<?>) HMBindDeviceActivity.class);
        intent.putExtra("bind_type", 2);
        intent.putExtra("bind_address", address);
        intent.putExtra("bind_sn", sn);
        context.startActivity(intent);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startBindDeviceActivityByQrCode(@NotNull Context context, int sourceType, @NotNull DeviceQRInfo deviceQRInfo) {
        Intent intent = new Intent(context, (Class<?>) HMBindDeviceActivity.class);
        intent.putExtra("bind_type", sourceType);
        intent.putExtra("bind_device", BluetoothAdapter.getDefaultAdapter().getRemoteDevice(deviceQRInfo.getMac()));
        intent.putExtra("bind_address", deviceQRInfo.getMac());
        intent.putExtra(ConstantKt.KEY_BIND_MODE, 2);
        intent.putExtra("bind_device_source", HMDeviceSource.fromPnP(deviceQRInfo.getPnpNum(), deviceQRInfo.getPnpVersion()));
        context.startActivity(intent);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startBindEarbud(@NotNull Context context) {
        HMBindDeviceActivity.startBindEarbud(context);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startBindFitbitActivity(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) HmBindFitbitActivity.class));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startBindHeadSet(@NotNull Context context) {
        HMBindDeviceActivity.startBindHeadSet(context);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startBindHeadSetNew(@NotNull Context context, @NotNull HMDeviceSource source) {
        HMBindDeviceActivity.startBindHeadSetNew(context, source);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startBindNormandy(@NotNull Context context, @NotNull HMBrandType type) {
        HMBindDeviceActivity.startBindNormandy(context, type);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startBindShoes(@NotNull Context context) {
        HMBindDeviceActivity.startBindShoes(context);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startBindWatch(@Nullable Context context, @Nullable BluetoothDevice device, int bindType) {
        HMBindDeviceActivity.startBindWatch(context, device, bindType);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startBindWatchByScanAdv(@Nullable Context context, @Nullable BluetoothDevice device, @Nullable HMDeviceSource source) {
        HMBindDeviceActivity.startBindWatch(context, device, source);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startCapture(@NotNull Context context, int bindType) {
        HMCaptureWatchQRActivity.INSTANCE.startCapture(context, bindType);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startContinueUpgradeActivity(@NotNull Context context, boolean force, @NotNull String changeLog) {
        HMContinueUpgradeActivity.INSTANCE.launch(context, force, changeLog);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startDetailInfoActivity(@NotNull Context context, int type, @NotNull String key) {
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startDeviceLanguageSettingActivity(@NotNull Context context, @NotNull HMDeviceType type) {
        Intent intent = new Intent(context, (Class<?>) DeviceLanguageSettingActivity.class);
        intent.putExtra("type", type);
        context.startActivity(intent);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXZeppNavigator
    public void startDeviceStatus(@NotNull Context context, @NotNull com.huami.watch.companion.device.Device device) {
        Intent intent = DeviceUtil.isSmartOS(device) ? new Intent(context, (Class<?>) XiHuDeviceStatusActivity.class) : DeviceStatusActivity.intentWithAlexaTipDialog(context);
        Bundle bundle = new Bundle();
        bundle.putString(BaseDeviceStatusActivity.KEY_AREA, SelectAreaHelper.getArea().getValue());
        intent.putExtras(bundle);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startEarbudAlarmSetActivity(@NotNull Activity context, @NotNull Alarm alarm, int requestCode) {
        Intent intent = new Intent(context, (Class<?>) HmEarbudAlarmSetActivity.class);
        intent.putExtra("args_alarm", new Gson().toJson(alarm));
        context.startActivityForResult(intent, requestCode);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startEarbudBreathTrainActivity(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) HmEarbudBreathTrainActivity.class));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startEventRemindActivity(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) EventRemindActivity.class));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startFwUpgradeInfoActivity(@NotNull Context context, @NotNull HMDeviceSource source) {
        context.startActivity(HMFwUpgradeInfoActivity.newIntent(context, source));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startGesScreenActivity(@NotNull Context context, @NotNull HMDeviceSource source) {
        GesScreenActivity.launch(context, source);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startHMAppSortActivity(@NotNull Context context, @NotNull HMDeviceSource source) {
        HMAppSortActivity.launch(context, source);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startHMBlueMonkeySettingActivity(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) HMBlueMonkeySettingActivity.class));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startHMDialListActivity(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) HMDialListActivity.class));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startHMFwChangeLogActivity(@NotNull Context context, @NotNull String changeLog) {
        Intent intent = new Intent(context, (Class<?>) HMFwChangeLogActivity.class);
        intent.putExtra(HMFwUpgradeActivity.FW_UPGRADE_CHANGE_LOG, changeLog);
        context.startActivity(intent);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startHMGt2SystemUpgradeActivity(@NotNull Context context, boolean force, boolean isUpgrading, boolean newIntent) {
        HMGt2SystemUpgradeActivity.INSTANCE.launch(context, force, isUpgrading, newIntent);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startHMHeadsetSettingActivity(@NotNull Context context, @NotNull String address) {
        HMHeadsetSettingActivity.INSTANCE.start(context, address);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startHMHrDetectSettingActivity(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) HealthDetectSettingActivity.class));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startHMMiLiSettingActivity(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) HMMiLiSettingActivity.class));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startHMNormandySettingActivity(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) HMNormandySettingActivity.class));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startHMSelectCityActivity(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) HMSelectCityActivity.class));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startHMSelectDeviceActivity(@NotNull Context context) {
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startHMSelectShoesActivity(@NotNull Context context) {
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startHMShoesCalibrateActivity(@NotNull Context context, int caliFrom, @Nullable HMDeviceSource source) {
        Intent intent = new Intent(context, (Class<?>) HMShoesCalibrateActivity.class);
        intent.putExtra("cali_from", caliFrom);
        if (source != null) {
            intent.putExtra("device_source", source);
        }
        context.startActivity(intent);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startHMShoesSettingActivity(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) HMShoesSettingActivity.class));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startHMShoesUseActivity(@NotNull Context context) {
        Intent intent = new Intent(context, (Class<?>) HMShoesUseActivity.class);
        intent.putExtra(InstallNormandyActivity.EXTRA, true);
        context.startActivity(intent);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startHMSportSortActivity(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) HMSportSortActivity.class));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startHMTreadmillSettingActivity(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) HMTreadmillSettingActivity.class));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startHMUnbindDeviceActivity(@NotNull Activity context, int type, int requestCode) {
        Intent intent = new Intent();
        intent.setClass(context, HMUnbindDeviceActivity.class);
        intent.putExtra(HMUnbindDeviceActivity.UNBIND_TYPE_KEY, type);
        context.startActivityForResult(intent, requestCode);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startHMWeatherSettingActivity(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) HMWeatherSettingActivity.class));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startHMWeightSettingActivity(@NotNull Context context, @Nullable Boolean fromUseOrBind, @Nullable Boolean isFirstBind) {
        if (fromUseOrBind == null || isFirstBind == null) {
            context.startActivity(new Intent(context, (Class<?>) HMWeightSettingActivity.class));
        } else {
            HMWeightSettingActivity.launch(context, fromUseOrBind.booleanValue(), isFirstBind.booleanValue());
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startHmEarbudMusicActivity(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) HmEarbudMusicActivity.class));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startHmFitbitDeviceActivity(@NotNull Activity context, @NotNull Device device) {
        HmFitbitDeviceActivity.INSTANCE.launch(context, device);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startIdBroadcastActivity(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) IdBroadcastActivity.class));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startIncomingCallAlertActivity(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) IncomingCallAlertActivity.class));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startJsAppPage(@NotNull Context context) {
        LightAppStore.jumpAppSettingListPage(context);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startKeepAliveActivity(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) KeepAliveActivity.class));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startKeepAliveTipsActivity(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) KeepAliveTipsActivity.class));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startLongSitAlertActivity(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) LongSitAlertActivity.class));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startMiBand2InstructionActivity(@NotNull Context context) {
        MiBand2InstructionActivity.launch(context);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startMiBand3InstructionActivity(@NotNull Activity context) {
        MiBand3InstructionActivity.launch(context);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startMiBandAlarmActivity(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) MiBandAlarmActivity.class));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startMiliNowTimeSettingActivity(@NotNull Context context) {
        MiliNowTimeSettingActivity.INSTANCE.launch(context);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startMiliSportSettingActivity(@NotNull Context context, @NotNull SportCategory category) {
        Intent intent = new Intent(context, (Class<?>) MiliSportSettingActivity.class);
        intent.putExtra("SportCategoryName", context.getString(category.getNameResId()));
        intent.putExtra("SportTypeFilter", ArraysKt___ArraysKt.toIntArray(category.getSportTypes()));
        context.startActivity(intent);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startNightModeActivity(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) NightModeActivity.class));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startNotificationDiagnosisActivity(@NotNull Context context) {
        Intent intent = new Intent(context, (Class<?>) DiagnosisActivity.class);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startOffWistSettingActivity(@NotNull Context context) {
        OffWistSettingActivity.INSTANCE.launch(context);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startPhoneAlarmActivity(@NotNull Context context) {
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startRestoreDeviceConfigActivity(@NotNull Context context, @NotNull HMDeviceSource source) {
        RestoreDeviceConfigActivity.start(context, source);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startScreenUnlockActivity(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) ScreenUnlockActivity.class));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startSetAlarmActivity(@NotNull Activity context, int type, int id) {
        SetAlarmActivity.launch(context, type, id);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startSettingItemLibraryActivity(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) SettingItemLibraryActivity.class));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startShortcutAppSort(@NotNull Context context, @NotNull HMDeviceSource source) {
        context.startActivity((ConfigHelperKt.hasFeature(Feature.KONGMING_SERIES_S, source) || ConfigHelperKt.hasFeature(Feature.YORK_SERIES_S, source)) ? new Intent(context, (Class<?>) HMShortcutAppSortNewActivity.class) : new Intent(context, (Class<?>) HMShotcutAppSortActivity.class));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startSingleHeadsetUpgradeActivity(@NotNull Context context) {
        context.startActivity(SingleHeadsetUpgradeActivity.INSTANCE.newInstance(context));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startSpeechEngineUpdateMiotAuthorizeActivity(@NotNull Activity context, int requestCode) {
        context.startActivityForResult(new Intent(context, (Class<?>) SpeechEngineUpdateMiotAuthorizeActivity.class), requestCode);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startSportHRBroadcastActivity(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) SportHRBroadcastActivity.class));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startToolNavigateActivity(@NotNull Context context, int type) {
        ToolNavigateActivity.INSTANCE.to(context, type);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startUnbindAlipayActivity(@NotNull Context context, @NotNull HMDeviceSource source) {
        Intent intent = new Intent(context, (Class<?>) UnbindAlipayActivity.class);
        intent.putExtra(UnbindAlipayActivity.EXTRA, source.getValue());
        context.startActivity(intent);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startUnbindDeviceActivityForResult(@NotNull Activity context, int requestCode) {
        Intent intent = new Intent(context, (Class<?>) HMUnbindDeviceActivity.class);
        intent.putExtra(HMUnbindDeviceActivity.UNBIND_TYPE_KEY, 5);
        context.startActivityForResult(intent, requestCode);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startUnifySelectDeviceActivity(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) HMUnifySelectDeviceActivity.class));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startUseDeviceNewTask(@Nullable Context context, @Nullable Device device) {
        HMUseDeviceActivity.startNewTask(context, device);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startVibrateTypeActivity(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) VibrateTypeActivity.class));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startWalletActivity(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) WalletActivity.class));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startWatchDetailActivity(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) WatchDetailActivity.class));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startWatchFacesStoreActivity(@NotNull Context context) {
        WatchFacesStoreActivity.INSTANCE.actionStart(context);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startWatchSkinListActivity(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) WatchSkinListActivity.class));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startWatchSkinStoreActivity(@NotNull Context context, int index) {
        Intent intent = new Intent(context, (Class<?>) WatchSkinStoreActivity.class);
        intent.putExtra("index", index);
        context.startActivity(intent);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startWorldClockActivity(@NotNull Context context, @NotNull HMDeviceType type, @NotNull HMDeviceSource source) {
        Intent intent = new Intent(context, (Class<?>) WorldClockActivity.class);
        intent.putExtra("device_type", type);
        intent.putExtra("device_source", source);
        context.startActivity(intent);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public boolean testPhoneEnv(@Nullable Context context, boolean fullTest, int bindType) {
        return PhoneEnvActivity.testPhoneEnv(context, fullTest, bindType);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void showDeviceHelperActivity(@NotNull Context context, int helperType, int showReason) {
        HMDeviceHelperActivity.show(context, helperType, showReason);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startRestoreDeviceConfigActivity(@NotNull Context context, @NotNull HMDeviceSource source, @NotNull String restoreItems) {
        RestoreDeviceConfigActivity.start(context, source, restoreItems);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startSetAlarmActivity(@NotNull Activity context, int type, int id, boolean isForceDark) {
        SetAlarmActivity.launch(context, type, id, isForceDark);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator
    public void startAlertListActivityNew(@NotNull Context context) {
        Intent intent = new Intent(context, (Class<?>) AlertListActivityNew.class);
        intent.putExtras(AlertListActivityNew.createHideBundle());
        context.startActivity(intent);
    }
}
