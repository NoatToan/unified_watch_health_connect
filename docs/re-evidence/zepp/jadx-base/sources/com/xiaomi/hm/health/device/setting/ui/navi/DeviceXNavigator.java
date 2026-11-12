package com.xiaomi.hm.health.device.setting.ui.navi;

import android.app.Activity;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.integrity.IntegrityManager;
import com.huami.account.ui.bind.PhoneBindActivity;
import com.huami.core.device.wifi_settings.service.IWiFiControllerProxy;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Alarm;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.capturedevice.DeviceQRInfo;
import com.xiaomi.hm.health.device.model.HMBrandType;
import com.xiaomi.hm.health.device.settings.sport.model.SportCategory;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0011\bf\u0018\u0000 \u009b\u00012\u00020\u0001:\u0002\u009b\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bH&J\u001a\u0010\f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u001c\u0010\u000f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH&J\"\u0010\u0014\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H&J$\u0010\u0016\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0013\u001a\u00020\u0012H&J&\u0010\u0017\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00152\b\u0010\t\u001a\u0004\u0018\u00010\bH&J\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H&J\u001c\u0010\u0019\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0002H&J \u0010 \u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001eH&J \u0010#\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\rH&J\u0010\u0010$\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J \u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012H&J \u0010+\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020'2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0012H&J\u0018\u0010.\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,H&J\u0018\u0010/\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&J\u0018\u00100\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020'2\u0006\u0010*\u001a\u00020\u0012H&J\u0010\u00101\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u00102\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u00103\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001b\u00105\u001a\u00020\n2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b5\u00106J\u0018\u00108\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010-\u001a\u000207H&J\u0018\u00109\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020'2\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010:\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010<\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&J(\u0010?\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u00102\u0006\u0010>\u001a\u00020\u0010H&J\u0018\u0010A\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010@\u001a\u00020\rH&J\u0010\u0010B\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H&J \u0010C\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00102\u0006\u0010@\u001a\u00020\rH&J\u0018\u0010E\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u0012H&J\u0010\u0010F\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010G\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010H\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010K\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010J\u001a\u00020IH&J\u0010\u0010L\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010M\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010N\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010O\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020'2\u0006\u0010*\u001a\u00020\u0012H&J\u0010\u0010P\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010Q\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010R\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010S\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J \u0010T\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020'2\u0006\u0010-\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0012H&J\u0010\u0010U\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010V\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010W\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010X\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010Y\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010Z\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010[\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&J\u0018\u0010\\\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020'2\u0006\u0010*\u001a\u00020\u0012H&J\u0018\u0010]\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&J\u0018\u0010^\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010a\u001a\u00020\u00062\u0006\u0010`\u001a\u00020_H&J\u0010\u0010b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010c\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010^\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J$\u0010i\u001a\u00020\u00062\u0006\u0010e\u001a\u00020d2\n\b\u0002\u0010g\u001a\u0004\u0018\u00010f2\u0006\u0010h\u001a\u00020_H&J\u0018\u0010j\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010k\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010l\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010m\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,H&J \u0010o\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,2\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010p\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010q\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020'H&J\u0010\u0010r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010s\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J \u0010u\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020'2\u0006\u0010-\u001a\u00020\u00122\u0006\u0010t\u001a\u00020\u0012H&J(\u0010u\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020'2\u0006\u0010-\u001a\u00020\u00122\u0006\u0010t\u001a\u00020\u00122\u0006\u0010v\u001a\u00020\u0010H&J\u0010\u0010w\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010x\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010y\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010z\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010{\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010|\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J,\u0010\u007f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010}\u001a\u0004\u0018\u00010\u00102\b\u0010~\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0011\u0010\u0081\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0019\u0010\u0082\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\rH&J\u0019\u0010\u0083\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&J\"\u0010\u0083\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0007\u0010\u0084\u0001\u001a\u00020\rH&J\u0019\u0010\u0085\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u0012H&J\u001a\u0010\u0087\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010\u0086\u0001\u001a\u00020_H&J\u0011\u0010\u0088\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0019\u0010\u0089\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,H&J\u0011\u0010\u008a\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001a\u0010\u008c\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010-\u001a\u00030\u008b\u0001H&J\u0019\u0010\u008d\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&J\u0011\u0010\u008e\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J$\u0010\u0090\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010\u008f\u0001\u001a\u00020\u00122\b\u0010\t\u001a\u0004\u0018\u00010\bH&J\u0011\u0010\u0091\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0011\u0010\u0092\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0011\u0010\u0093\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0011\u0010\u0094\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0011\u0010\u0095\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\"\u0010\u0097\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00122\u0007\u0010\u0096\u0001\u001a\u00020\rH&J\u0011\u0010\u0098\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0011\u0010\u0099\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0011\u0010\u009a\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u009c\u0001"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/databases/model/Device;", "device", "", "navigateToUnused", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "Landroid/content/Intent;", "createDeviceSettingIntent", "navigateToDeviceSetting", "", "packageName", "goToMarket", "", "fullTest", "", PhoneBindActivity.EXTRA_BIND_TYPE, "testPhoneEnv", "Landroid/bluetooth/BluetoothDevice;", "startBindWatch", "startBindWatchByScanAdv", "startCapture", "startUseDeviceNewTask", "createMainTabIntent", "fromContext", "showDeviceHelperActivity", "sourceType", "Lcom/xiaomi/hm/health/device/capturedevice/DeviceQRInfo;", "deviceQRInfo", "startBindDeviceActivityByQrCode", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "sn", "startBindActivityUseSnAndAddress", "startEarbudBreathTrainActivity", "helperType", "showReason", "Landroid/app/Activity;", "Lcom/xiaomi/hm/health/databases/model/Alarm;", "alarm", "requestCode", "startEarbudAlarmSetActivity", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "startAppNotificationAlertActivity", "startFwUpgradeInfoActivity", "startUnbindDeviceActivityForResult", "startSingleHeadsetUpgradeActivity", "startEventRemindActivity", "startUnifySelectDeviceActivity", "isUpgrading", "createStartUpActivityIntent", "(Ljava/lang/Boolean;)Landroid/content/Intent;", "Lcom/huami/core/device/wifi_settings/service/IWiFiControllerProxy$ClickType;", "onControllerProxyClickHelp", "startHmFitbitDeviceActivity", "startBindFitbitActivity", "ctx", "launchWeightDevicePlay", "force", "newIntent", "startHMGt2SystemUpgradeActivity", "changeLog", "startHMFwChangeLogActivity", "isHMGt2SystemUpgradeActivity", "startContinueUpgradeActivity", "index", "startWatchSkinStoreActivity", "startHMDialListActivity", "startWatchFacesStoreActivity", "startWatchSkinListActivity", "Lcom/xiaomi/hm/health/device/settings/sport/model/SportCategory;", "category", "startMiliSportSettingActivity", "startAppSettings", "startKeepAliveTipsActivity", "startScreenUnlockActivity", "startAddNotifyAppActivity", "startWalletActivity", "startSettingItemLibraryActivity", "startSportHRBroadcastActivity", "startAvoidSpiteBindingActivity", "startHMUnbindDeviceActivity", "startIncomingCallAlertActivity", "startMiBandAlarmActivity", "startLongSitAlertActivity", "startIdBroadcastActivity", "startHMHrDetectSettingActivity", "startHMWeatherSettingActivity", "startGesScreenActivity", "startSpeechEngineUpdateMiotAuthorizeActivity", "startHMAppSortActivity", "startAlertListActivityNew", "Landroidx/fragment/app/FragmentManager;", "manager", "showHMResetAlertDialog", "startMiBand2InstructionActivity", "startOffWistSettingActivity", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "fm", "showAlexaLanguageSettingActivity", "startShortcutAppSort", "startHMSportSortActivity", "startNightModeActivity", "startKeepAliveActivity", "startDeviceLanguageSettingActivity", "startWorldClockActivity", "startMiliNowTimeSettingActivity", "startMiBand3InstructionActivity", "startVibrateTypeActivity", "startHMMiLiSettingActivity", "id", "startSetAlarmActivity", "isForceDark", "startHMSelectCityActivity", "startUnbindAlipayActivity", "startHmEarbudMusicActivity", "startHMTreadmillSettingActivity", "jumpToTreadmillFaq", "startHMShoesUseActivity", "fromUseOrBind", "isFirstBind", "startHMWeightSettingActivity", "(Landroid/content/Context;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "startHMBlueMonkeySettingActivity", "startHMHeadsetSettingActivity", "startRestoreDeviceConfigActivity", "restoreItems", "startToolNavigateActivity", "fragmentManager", "startAlexaAuthActivity", "startJsAppPage", "startBind", "startBindShoes", "Lcom/xiaomi/hm/health/device/model/HMBrandType;", "startBindNormandy", "startBindHeadSetNew", "startBindEarbud", "caliFrom", "startHMShoesCalibrateActivity", "startBindHeadSet", "startHMNormandySettingActivity", "startHMShoesSettingActivity", "startWatchDetailActivity", "startHMSelectShoesActivity", "key", "startDetailInfoActivity", "startPhoneAlarmActivity", "startHMSelectDeviceActivity", "startNotificationDiagnosisActivity", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface DeviceXNavigator {

    @NotNull
    public static final String ARGS_ALARM = "args_alarm";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;
    public static final int UNBIND_EARBUD = 5;
    public static final int UNBIND_MILI = 0;
    public static final int UNBIND_OTHER = 3;
    public static final int UNBIND_SHOES = 2;
    public static final int UNBIND_TREADMILL = 4;
    public static final int UNBIND_WEIGHT = 1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0016\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0016\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator$Companion;", "", "", "ARGS_ALARM", "Ljava/lang/String;", "", "UNBIND_MILI", LogUtil.I, "UNBIND_WEIGHT", "UNBIND_SHOES", "UNBIND_OTHER", "UNBIND_TREADMILL", "UNBIND_EARBUD", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @NotNull
        public static final String ARGS_ALARM = "args_alarm";
        public static final int UNBIND_EARBUD = 5;
        public static final int UNBIND_MILI = 0;
        public static final int UNBIND_OTHER = 3;
        public static final int UNBIND_SHOES = 2;
        public static final int UNBIND_TREADMILL = 4;
        public static final int UNBIND_WEIGHT = 1;
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ Intent createStartUpActivityIntent$default(DeviceXNavigator deviceXNavigator, Boolean bool, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createStartUpActivityIntent");
            }
            if ((i & 1) != 0) {
                bool = null;
            }
            return deviceXNavigator.createStartUpActivityIntent(bool);
        }

        public static void navigateToDeviceSetting(@NotNull DeviceXNavigator deviceXNavigator, @Nullable Context context, @NotNull HMDeviceSource hMDeviceSource) {
            Intent intentCreateDeviceSettingIntent = deviceXNavigator.createDeviceSettingIntent(context, hMDeviceSource);
            if (intentCreateDeviceSettingIntent == null || context == null) {
                return;
            }
            context.startActivity(intentCreateDeviceSettingIntent);
        }

        public static /* synthetic */ void showAlexaLanguageSettingActivity$default(DeviceXNavigator deviceXNavigator, FragmentActivity fragmentActivity, CoroutineScope coroutineScope, FragmentManager fragmentManager, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showAlexaLanguageSettingActivity");
            }
            if ((i & 2) != 0) {
                coroutineScope = null;
            }
            deviceXNavigator.showAlexaLanguageSettingActivity(fragmentActivity, coroutineScope, fragmentManager);
        }
    }

    @Nullable
    Intent createDeviceSettingIntent(@Nullable Context context, @NotNull HMDeviceSource source);

    @NotNull
    Intent createMainTabIntent(@NotNull Context context);

    @NotNull
    Intent createStartUpActivityIntent(@Nullable Boolean isUpgrading);

    void goToMarket(@Nullable Context context, @Nullable String packageName);

    boolean isHMGt2SystemUpgradeActivity(@NotNull Context context);

    void jumpToTreadmillFaq(@NotNull Context context);

    void launchWeightDevicePlay(@NotNull Context ctx, @NotNull HMDeviceSource source);

    void navigateToDeviceSetting(@Nullable Context context, @NotNull HMDeviceSource source);

    void navigateToUnused(@Nullable Context context, @Nullable Device device);

    void onControllerProxyClickHelp(@NotNull Context context, @NotNull IWiFiControllerProxy.ClickType type);

    void showAlexaLanguageSettingActivity(@NotNull FragmentActivity activity, @Nullable CoroutineScope coroutineScope, @NotNull FragmentManager fm);

    void showDeviceHelperActivity(@NotNull Context fromContext);

    void showDeviceHelperActivity(@NotNull Context context, int helperType, int showReason);

    void showHMResetAlertDialog(@NotNull FragmentManager manager);

    void startAddNotifyAppActivity(@NotNull Activity context, int requestCode);

    void startAlertListActivityNew(@NotNull Context context);

    void startAlertListActivityNew(@NotNull Context context, @NotNull HMDeviceSource source);

    void startAlexaAuthActivity(@NotNull Context context, @NotNull FragmentManager fragmentManager);

    void startAppNotificationAlertActivity(@NotNull Context context, @NotNull HMDeviceType type);

    void startAppSettings(@NotNull Context context);

    void startAvoidSpiteBindingActivity(@NotNull Context context);

    void startBind(@NotNull Context context, @NotNull HMDeviceType type);

    void startBindActivityUseSnAndAddress(@NotNull Context context, @NotNull String address, @NotNull String sn);

    void startBindDeviceActivityByQrCode(@NotNull Context context, int sourceType, @NotNull DeviceQRInfo deviceQRInfo);

    void startBindEarbud(@NotNull Context context);

    void startBindFitbitActivity(@NotNull Context context);

    void startBindHeadSet(@NotNull Context context);

    void startBindHeadSetNew(@NotNull Context context, @NotNull HMDeviceSource source);

    void startBindNormandy(@NotNull Context context, @NotNull HMBrandType type);

    void startBindShoes(@NotNull Context context);

    void startBindWatch(@Nullable Context context, @Nullable BluetoothDevice device, int bindType);

    void startBindWatchByScanAdv(@Nullable Context context, @Nullable BluetoothDevice device, @Nullable HMDeviceSource source);

    void startCapture(@NotNull Context context, int bindType);

    void startContinueUpgradeActivity(@NotNull Context context, boolean force, @NotNull String changeLog);

    void startDetailInfoActivity(@NotNull Context context, int type, @NotNull String key);

    void startDeviceLanguageSettingActivity(@NotNull Context context, @NotNull HMDeviceType type);

    void startEarbudAlarmSetActivity(@NotNull Activity context, @NotNull Alarm alarm, int requestCode);

    void startEarbudBreathTrainActivity(@NotNull Context context);

    void startEventRemindActivity(@NotNull Context context);

    void startFwUpgradeInfoActivity(@NotNull Context context, @NotNull HMDeviceSource source);

    void startGesScreenActivity(@NotNull Context context, @NotNull HMDeviceSource source);

    void startHMAppSortActivity(@NotNull Context context, @NotNull HMDeviceSource source);

    void startHMBlueMonkeySettingActivity(@NotNull Context context);

    void startHMDialListActivity(@NotNull Context context);

    void startHMFwChangeLogActivity(@NotNull Context context, @NotNull String changeLog);

    void startHMGt2SystemUpgradeActivity(@NotNull Context context, boolean force, boolean isUpgrading, boolean newIntent);

    void startHMHeadsetSettingActivity(@NotNull Context context, @NotNull String address);

    void startHMHrDetectSettingActivity(@NotNull Context context);

    void startHMMiLiSettingActivity(@NotNull Context context);

    void startHMNormandySettingActivity(@NotNull Context context);

    void startHMSelectCityActivity(@NotNull Context context);

    void startHMSelectDeviceActivity(@NotNull Context context);

    void startHMSelectShoesActivity(@NotNull Context context);

    void startHMShoesCalibrateActivity(@NotNull Context context, int caliFrom, @Nullable HMDeviceSource source);

    void startHMShoesSettingActivity(@NotNull Context context);

    void startHMShoesUseActivity(@NotNull Context context);

    void startHMSportSortActivity(@NotNull Context context);

    void startHMTreadmillSettingActivity(@NotNull Context context);

    void startHMUnbindDeviceActivity(@NotNull Activity context, int type, int requestCode);

    void startHMWeatherSettingActivity(@NotNull Context context);

    void startHMWeightSettingActivity(@NotNull Context context, @Nullable Boolean fromUseOrBind, @Nullable Boolean isFirstBind);

    void startHmEarbudMusicActivity(@NotNull Context context);

    void startHmFitbitDeviceActivity(@NotNull Activity context, @NotNull Device device);

    void startIdBroadcastActivity(@NotNull Context context);

    void startIncomingCallAlertActivity(@NotNull Context context);

    void startJsAppPage(@NotNull Context context);

    void startKeepAliveActivity(@NotNull Context context);

    void startKeepAliveTipsActivity(@NotNull Context context);

    void startLongSitAlertActivity(@NotNull Context context);

    void startMiBand2InstructionActivity(@NotNull Context context);

    void startMiBand3InstructionActivity(@NotNull Activity context);

    void startMiBandAlarmActivity(@NotNull Context context);

    void startMiliNowTimeSettingActivity(@NotNull Context context);

    void startMiliSportSettingActivity(@NotNull Context context, @NotNull SportCategory category);

    void startNightModeActivity(@NotNull Context context);

    void startNotificationDiagnosisActivity(@NotNull Context context);

    void startOffWistSettingActivity(@NotNull Context context);

    void startPhoneAlarmActivity(@NotNull Context context);

    void startRestoreDeviceConfigActivity(@NotNull Context context, @NotNull HMDeviceSource source);

    void startRestoreDeviceConfigActivity(@NotNull Context context, @NotNull HMDeviceSource source, @NotNull String restoreItems);

    void startScreenUnlockActivity(@NotNull Context context);

    void startSetAlarmActivity(@NotNull Activity context, int type, int id);

    void startSetAlarmActivity(@NotNull Activity context, int type, int id, boolean isForceDark);

    void startSettingItemLibraryActivity(@NotNull Context context);

    void startShortcutAppSort(@NotNull Context context, @NotNull HMDeviceSource source);

    void startSingleHeadsetUpgradeActivity(@NotNull Context context);

    void startSpeechEngineUpdateMiotAuthorizeActivity(@NotNull Activity context, int requestCode);

    void startSportHRBroadcastActivity(@NotNull Context context);

    void startToolNavigateActivity(@NotNull Context context, int type);

    void startUnbindAlipayActivity(@NotNull Context context, @NotNull HMDeviceSource source);

    void startUnbindDeviceActivityForResult(@NotNull Activity context, int requestCode);

    void startUnifySelectDeviceActivity(@NotNull Context context);

    void startUseDeviceNewTask(@Nullable Context context, @Nullable Device device);

    void startVibrateTypeActivity(@NotNull Context context);

    void startWalletActivity(@NotNull Context context);

    void startWatchDetailActivity(@NotNull Context context);

    void startWatchFacesStoreActivity(@NotNull Context context);

    void startWatchSkinListActivity(@NotNull Context context);

    void startWatchSkinStoreActivity(@NotNull Context context, int index);

    void startWorldClockActivity(@NotNull Context context, @NotNull HMDeviceType type, @NotNull HMDeviceSource source);

    boolean testPhoneEnv(@Nullable Context context, boolean fullTest, int bindType);
}
