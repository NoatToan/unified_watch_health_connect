package com.xiaomi.hm.health.device;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleObserver;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.OnLifecycleEvent;
import androidx.p008lifecycle.ViewModelProvider;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.arch.helper.Resource;
import com.huami.bluetooth.device.HeadsetDevice;
import com.huami.bluetooth.profile.ecf.data.HeadsetSportSetting;
import com.huami.bluetooth.profile.ecf.data.HrBroadcastType;
import com.huami.bluetooth.profile.ecf.data.HrReminderInfo;
import com.huami.bluetooth.profile.ecf.data.NoiseControl;
import com.huami.bluetooth.profile.ecf.data.NoiseControlType;
import com.huami.bluetooth.profile.ecf.data.NoiseReductionMode;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.koinstartup.KoinComponentAdapter;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.lib.view.scroll.HMScrollView;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.util.net.NetUtil;
import com.huami.widget.toast.IconToast;
import com.huami.widget.typeface.TypefaceTextView;
import com.loc.z;
import com.xiaomi.hm.health.bt.classic.EqEntity;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.Status;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.slre.HMLFEvent;
import com.xiaomi.hm.health.bt.profile.slre.LfType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMHeadsetSettingActivity;
import com.xiaomi.hm.health.device.HMHeadsetSettingActivity.a;
import com.xiaomi.hm.health.device.bind.HMUnbindBaseLogic;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.equalizer.EqualizerViewModel;
import com.xiaomi.hm.health.device.equalizer.EqualizerViewModelFactory;
import com.xiaomi.hm.health.device.event.HMDeviceBatteryEvent;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeInfoActivity;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeManager;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineManager;
import com.xiaomi.hm.health.device.fw_upgrade.NetFwUpgradeManager;
import com.xiaomi.hm.health.device.headset.HeadSetActionActivity;
import com.xiaomi.hm.health.device.headset.HeadsetResetActivity;
import com.xiaomi.hm.health.device.headset.HeadsetSideListenActivity;
import com.xiaomi.hm.health.device.headset.HeadsetSportSettingActivity;
import com.xiaomi.hm.health.device.headset.bean.HeadsetBatteryInfo;
import com.xiaomi.hm.health.device.headset.bean.HeadsetPart;
import com.xiaomi.hm.health.device.headset.bean.HeadsetSettings;
import com.xiaomi.hm.health.device.headset.common.MozartH5;
import com.xiaomi.hm.health.device.headset.help.HrReminderHelper;
import com.xiaomi.hm.health.device.headset.type.HeadSetSeekBar;
import com.xiaomi.hm.health.device.headset.ui.CervicalProtectionActivity;
import com.xiaomi.hm.health.device.headset.ui.HeadsetActionNewActivity;
import com.xiaomi.hm.health.device.headset.ui.HeadsetHearingHealthActivity;
import com.xiaomi.hm.health.device.headset.ui.HeadsetResetNewActivity;
import com.xiaomi.hm.health.device.headset.ui.fragment.CustomAlertDialogFragment;
import com.xiaomi.hm.health.device.headset.ui.fragment.HrReminderSheetDialogFragment;
import com.xiaomi.hm.health.device.headset.viewmodel.HeadSettingViewModel;
import com.xiaomi.hm.health.device.headset.viewmodel.HeadsetViewModelProvider;
import com.xiaomi.hm.health.device.headset.vo.CervicalProtectionVo;
import com.xiaomi.hm.health.device.headset.vo.HeadsetSportSettingVo;
import com.xiaomi.hm.health.device.headset.vo.HearingHealthStatusVo;
import com.xiaomi.hm.health.device.headset.vo.HrReminderInfoVo;
import com.xiaomi.hm.health.device.headset.vo.NoiseReductionModeVo;
import com.xiaomi.hm.health.device.headset.vo.PercussionBroadcastVo;
import com.xiaomi.hm.health.device.headset.vo.RunningRecognitionVo;
import com.xiaomi.hm.health.device.headset.vo.SmartPlayVo;
import com.xiaomi.hm.health.device.headset.vo.WearInductionVo;
import com.xiaomi.hm.health.device.view.EditDeviceDisplayNameDialog;
import com.xiaomi.hm.health.discovery.WebHelper;
import com.xiaomi.hm.health.eventbus.EventFwCheckResult;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.xiaomi.hm.health.ui.widget.HeartRateSeekBar;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import de.greenrobot.event.EventBus;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ÿ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u000e*\u0003b\u0093\u0001\u0018\u0000 \u009d\u00012\u00020\u00012\u00020\u0002:\u0007\u009d\u0001_\u009e\u0001\u009f\u0001B\t¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\t\u001a\u00020\u0003H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0002J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0014\u0010\u0010\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0002J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J\b\u0010\u0015\u001a\u00020\u0003H\u0002J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0003H\u0002J\b\u0010\u001a\u001a\u00020\u0007H\u0002J\b\u0010\u001b\u001a\u00020\u0003H\u0002J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0007H\u0002J\b\u0010\u001e\u001a\u00020\u0003H\u0002J\b\u0010\u001f\u001a\u00020\u0007H\u0002J\b\u0010 \u001a\u00020\u0007H\u0002J\b\u0010!\u001a\u00020\u0003H\u0002J\b\u0010\"\u001a\u00020\u0003H\u0002J\"\u0010(\u001a\u00020\u00032\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010'\u001a\u00020\u0007H\u0002J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010*\u001a\u00020)H\u0002J\u0012\u0010,\u001a\u00020\u00032\b\u0010*\u001a\u0004\u0018\u00010\u0000H\u0002J\u0010\u0010-\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0012\u00100\u001a\u00020\u00032\b\u0010/\u001a\u0004\u0018\u00010.H\u0002J\u0010\u00103\u001a\u00020\u00032\u0006\u00102\u001a\u000201H\u0002J\u0010\u00106\u001a\u00020\u00032\u0006\u00105\u001a\u000204H\u0002J\u0010\u00109\u001a\u0002042\u0006\u00108\u001a\u000207H\u0002J\u0010\u0010<\u001a\u00020\u00032\u0006\u0010;\u001a\u00020:H\u0002J\u0010\u0010=\u001a\u00020\u00032\u0006\u0010;\u001a\u00020:H\u0002J\u0010\u0010>\u001a\u00020:2\u0006\u0010;\u001a\u000207H\u0002J\u0010\u0010@\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u0007H\u0002J\b\u0010A\u001a\u00020\u0003H\u0002J\u0010\u0010C\u001a\u00020\u00032\u0006\u0010B\u001a\u00020\u0007H\u0002J\u0010\u0010E\u001a\u00020\u00032\u0006\u0010D\u001a\u00020\u0007H\u0002J\u0018\u0010G\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u000e2\u0006\u0010D\u001a\u00020\u0007H\u0002J\u0012\u0010H\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\u0010\u0010J\u001a\u00020\u00032\u0006\u0010I\u001a\u00020\u0005H\u0014J\"\u0010P\u001a\u00020\u00032\u0006\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020K2\b\u0010O\u001a\u0004\u0018\u00010NH\u0014J\u0012\u0010S\u001a\u00020\u00072\b\u0010R\u001a\u0004\u0018\u00010QH\u0016J\u000e\u0010V\u001a\u00020\u00032\u0006\u0010U\u001a\u00020TJ\u000e\u0010V\u001a\u00020\u00032\u0006\u0010X\u001a\u00020WJ\u000e\u0010V\u001a\u00020\u00032\u0006\u0010Z\u001a\u00020YJ\u000e\u0010\\\u001a\u00020\u00032\u0006\u0010X\u001a\u00020[J\b\u0010]\u001a\u00020\u0003H\u0014R\u0018\u0010a\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010e\u001a\u00020b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010i\u001a\u00020f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010m\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010p\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010t\u001a\u00020q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0018\u0010z\u001a\u0004\u0018\u00010w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0018\u0010~\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001b\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0081\u0001R\u0019\u0010\u0087\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R#\u0010\u008d\u0001\u001a\u00030\u0088\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R#\u0010\u0092\u0001\u001a\u00030\u008e\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008f\u0001\u0010\u008a\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001a\u0010\u0096\u0001\u001a\u00030\u0093\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001b\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0081\u0001R\u0019\u0010\u009a\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u0086\u0001¨\u0006 \u0001"}, d2 = {"Lcom/xiaomi/hm/health/device/HMHeadsetSettingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/huami/koinstartup/KoinComponentAdapter;", "", "U0", "Landroid/os/Bundle;", "savedInstanceState", "", "k0", "m1", "A0", "Lcom/xiaomi/hm/health/device/headset/bean/HeadsetSettings;", "settings", "G1", "Landroid/view/View;", "visible", "q1", "initViews", "l0", "isOperate", "l1", "T0", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "b0", "r1", "e1", "g1", Status.PRE_CONNECT_STATE_CONNECTED, "I1", "c0", "i0", "K1", "B1", "A1", "Lcom/xiaomi/hm/health/device/HMHeadsetSettingActivity$Part;", "part", "Lcom/xiaomi/hm/health/bt/profile/base/BatteryInfo;", "batteryInfo", "isCharging", "F1", "Landroid/app/Activity;", "activity", "s1", "j0", "C1", "Lcom/huami/bluetooth/profile/ecf/data/NoiseControl;", "noiseControl", "H1", "Lcom/huami/bluetooth/profile/ecf/data/NoiseControlType;", "noiseControlType", "d0", "Lcom/huami/bluetooth/profile/ecf/data/NoiseReductionMode;", "noiseReductionMode", "y1", "", "mode", "e0", "Lcom/huami/bluetooth/profile/ecf/data/HrBroadcastType;", "type", "J1", "u1", "h0", "isChecked", "i1", "t1", "isEnable", "k1", "enable", "f1", ViewHierarchyConstants.VIEW_KEY, "p1", "onCreate", "outState", "onSaveInstanceState", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "Lcom/xiaomi/hm/health/eventbus/EventFwCheckResult;", "result", "onEventMainThread", "Lcom/xiaomi/hm/health/device/event/HMDeviceBatteryEvent;", "event", "Lcom/huami/bluetooth/device/HeadsetDevice$HeadsetDeviceState;", "state", "Lcom/xiaomi/hm/health/bt/profile/slre/HMLFEvent;", "onEvent", "onDestroy", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "a", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "hrAlertDialogFragment", "com/xiaomi/hm/health/device/HMHeadsetSettingActivity$hrLifecycleObserver$1", "b", "Lcom/xiaomi/hm/health/device/HMHeadsetSettingActivity$hrLifecycleObserver$1;", "hrLifecycleObserver", "Lcom/xiaomi/hm/health/device/headset/viewmodel/HeadSettingViewModel;", "c", "Lcom/xiaomi/hm/health/device/headset/viewmodel/HeadSettingViewModel;", "viewModel", "Lcom/xiaomi/hm/health/device/equalizer/EqualizerViewModel;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/device/equalizer/EqualizerViewModel;", "eqViewModel", "e", "Ljava/lang/String;", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "f", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "deviceType", "g", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "Lcom/xiaomi/hm/health/databases/model/Device;", "h", "Lcom/xiaomi/hm/health/databases/model/Device;", "device", "Lcom/xiaomi/hm/health/device/headset/ui/fragment/HrReminderSheetDialogFragment;", "i", "Lcom/xiaomi/hm/health/device/headset/ui/fragment/HrReminderSheetDialogFragment;", "hrReminderDialog", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", z.j, "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loadingDlg", hl.k, "setLoadingDlg", "l", "Z", "isLimitOperate", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "m", "Lkotlin/Lazy;", "g0", "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApi", "Lcom/huami/devicex/manager/DeviceManagerApi;", GoogleApiAvailabilityLight.b, "f0", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "com/xiaomi/hm/health/device/HMHeadsetSettingActivity$unbindListener$1", "o", "Lcom/xiaomi/hm/health/device/HMHeadsetSettingActivity$unbindListener$1;", "unbindListener", com.google.android.exoplayer2.text.ttml.b.r, "mCheckingDialog", DTransferConstants.SEARCH_KEY, "isCheckByUser", "<init>", "()V", "Companion", "LifecycleComponent", "Part", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HMHeadsetSettingActivity extends AppCompatActivity implements KoinComponentAdapter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String r = "HMHeadsetSettingActivity";

    @NotNull
    private static final String s = "device_address";
    private static final int t = 1;
    private static final long u = 1500;
    private static final int v = 20;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private AlertDialogFragment hrAlertDialogFragment;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private HeadSettingViewModel viewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private EqualizerViewModel eqViewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String address;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private Device device;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private HrReminderSheetDialogFragment hrReminderDialog;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog loadingDlg;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog setLoadingDlg;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean isLimitOperate;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilsApi;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final HMHeadsetSettingActivity$unbindListener$1 unbindListener;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog mCheckingDialog;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private boolean isCheckByUser;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private HMHeadsetSettingActivity$hrLifecycleObserver$1 hrLifecycleObserver = new LifecycleObserver() { // from class: com.xiaomi.hm.health.device.HMHeadsetSettingActivity$hrLifecycleObserver$1
        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public final void onStart() {
            View view;
            AlertDialogFragment alertDialogFragment = this.a.hrAlertDialogFragment;
            TextView textView = null;
            if (alertDialogFragment != null && (view = alertDialogFragment.getView()) != null) {
                textView = (TextView) view.findViewById(R.id.dialog_message);
            }
            if (textView == null) {
                return;
            }
            textView.setGravity(17);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        public final void onStop() {
            Lifecycle lifecycle;
            AlertDialogFragment alertDialogFragment = this.a.hrAlertDialogFragment;
            if (alertDialogFragment == null || (lifecycle = alertDialogFragment.getLifecycle()) == null) {
                return;
            }
            lifecycle.removeObserver(this);
        }
    };

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private HMDeviceType deviceType = HMDeviceType.VDevice;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private HMDeviceSource deviceSource = HMDeviceSource.VDEVICE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/device/HMHeadsetSettingActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "", "start", "", "DISMISS_DIALOG_DELAY", "J", "EXTRA_DEVICE_ADDRESS", "Ljava/lang/String;", "", "HEADSET_BATTERY_LOW_LEVEL", LogUtil.I, "REQUEST_CODE_RESET", "TAG", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void start(@NotNull Context context, @NotNull String address) {
            Intent intent = new Intent(context, (Class<?>) HMHeadsetSettingActivity.class);
            intent.putExtra(HMHeadsetSettingActivity.s, address);
            Unit unit = Unit.INSTANCE;
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/device/HMHeadsetSettingActivity$LifecycleComponent;", "Landroidx/lifecycle/LifecycleObserver;", "", "onResume", "<init>", "(Lcom/xiaomi/hm/health/device/HMHeadsetSettingActivity;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public final class LifecycleComponent implements LifecycleObserver {
        public LifecycleComponent() {
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        public final void onResume() {
            ((ListTile) HMHeadsetSettingActivity.this.findViewById(R.id.item_check_firmware)).setDotted(HMHeadsetSettingActivity.this.i0());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012B'\b\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002\u0012\b\b\u0001\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\u0082\u0001\u0003\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/device/HMHeadsetSettingActivity$Part;", "", "", "a", LogUtil.I, "getBatteryView", "()I", "batteryView", "b", "getPercentView", "percentView", "c", "getChargeView", "chargeView", "<init>", "(III)V", "Box", "Left", "Right", "Lcom/xiaomi/hm/health/device/HMHeadsetSettingActivity$Part$Left;", "Lcom/xiaomi/hm/health/device/HMHeadsetSettingActivity$Part$Right;", "Lcom/xiaomi/hm/health/device/HMHeadsetSettingActivity$Part$Box;", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static abstract class Part {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int batteryView;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int percentView;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int chargeView;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/device/HMHeadsetSettingActivity$Part$Box;", "Lcom/xiaomi/hm/health/device/HMHeadsetSettingActivity$Part;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
        public static final class Box extends Part {

            @NotNull
            public static final Box INSTANCE = new Box();

            private Box() {
                super(R.id.tv_box_battery, R.id.tv_box_battery_percent, R.id.iv_box_charge, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/device/HMHeadsetSettingActivity$Part$Left;", "Lcom/xiaomi/hm/health/device/HMHeadsetSettingActivity$Part;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
        public static final class Left extends Part {

            @NotNull
            public static final Left INSTANCE = new Left();

            private Left() {
                super(R.id.tv_left_battery, R.id.tv_left_battery_percent, R.id.iv_left_charge, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/device/HMHeadsetSettingActivity$Part$Right;", "Lcom/xiaomi/hm/health/device/HMHeadsetSettingActivity$Part;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
        public static final class Right extends Part {

            @NotNull
            public static final Right INSTANCE = new Right();

            private Right() {
                super(R.id.tv_right_battery, R.id.tv_right_battery_percent, R.id.iv_right_charge, null);
            }
        }

        private Part(@IdRes int i, @IdRes int i2, @IdRes int i3) {
            this.batteryView = i;
            this.percentView = i2;
            this.chargeView = i3;
        }

        public /* synthetic */ Part(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, i3);
        }

        public final int getBatteryView() {
            return this.batteryView;
        }

        public final int getChargeView() {
            return this.chargeView;
        }

        public final int getPercentView() {
            return this.percentView;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[HeadsetPart.values().length];
            iArr[HeadsetPart.Left.ordinal()] = 1;
            iArr[HeadsetPart.Right.ordinal()] = 2;
            iArr[HeadsetPart.Box.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NoiseReductionMode.values().length];
            iArr2[NoiseReductionMode.ADAPTIVE.ordinal()] = 1;
            iArr2[NoiseReductionMode.MOVEMENT.ordinal()] = 2;
            iArr2[NoiseReductionMode.TRAFFIC.ordinal()] = 3;
            iArr2[NoiseReductionMode.INDOOR.ordinal()] = 4;
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[HMDeviceSource.values().length];
            iArr3[HMDeviceSource.OTHER_MOZART.ordinal()] = 1;
            iArr3[HMDeviceSource.OTHER_LULLABY.ordinal()] = 2;
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[NoiseControlType.values().length];
            iArr4[NoiseControlType.CLOSE.ordinal()] = 1;
            iArr4[NoiseControlType.PENETRATE.ordinal()] = 2;
            iArr4[NoiseControlType.NOISE_REDUCTION.ordinal()] = 3;
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[HrBroadcastType.values().length];
            iArr5[HrBroadcastType.CLOSE.ordinal()] = 1;
            iArr5[HrBroadcastType.AUTO.ordinal()] = 2;
            iArr5[HrBroadcastType.OPEN.ordinal()] = 3;
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"com/xiaomi/hm/health/device/HMHeadsetSettingActivity$a", "Lcom/xiaomi/hm/health/device/headset/type/HeadSetSeekBar;", "", "getProgress", "getMax", "", "getWidth", "Lcom/xiaomi/hm/health/ui/widget/HeartRateSeekBar;", "a", "Lcom/xiaomi/hm/health/ui/widget/HeartRateSeekBar;", "seekBar", "<init>", "(Lcom/xiaomi/hm/health/device/HMHeadsetSettingActivity;Lcom/xiaomi/hm/health/ui/widget/HeartRateSeekBar;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public final class a implements HeadSetSeekBar {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final HeartRateSeekBar seekBar;

        public a(HeartRateSeekBar heartRateSeekBar) {
            this.seekBar = heartRateSeekBar;
        }

        @Override // com.xiaomi.hm.health.device.headset.type.HeadSetSeekBar
        public float getMax() {
            return this.seekBar.getMax();
        }

        @Override // com.xiaomi.hm.health.device.headset.type.HeadSetSeekBar
        public float getProgress() {
            return this.seekBar.getProgress();
        }

        @Override // com.xiaomi.hm.health.device.headset.type.HeadSetSeekBar
        public int getWidth() {
            return this.seekBar.getWidth();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Integer, Unit> {
        public b() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }

        public final void b(int i) {
            new AlertDialogFragment.Builder(HMHeadsetSettingActivity.this).setCancelable(false).setMessage(HMHeadsetSettingActivity.this.getString(R.string.reboot_count, new Object[]{Integer.valueOf(i)})).setNeutralButton(R.string.gotit, new DialogInterface.OnClickListener() { // from class: com.xiaomi.hm.health.device.f
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    HMHeadsetSettingActivity.b.c(dialogInterface, i2);
                }
            }).create().show(HMHeadsetSettingActivity.this.getSupportFragmentManager());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            b(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "result", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Boolean, Unit> {
        public static final c a = new c();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z) {
                super(0);
                this.a = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "close report headset info switch result: " + this.a;
            }
        }

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            HMLog.info(HMHeadsetSettingActivity.r, new a(z));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ HMLFEvent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HMLFEvent hMLFEvent) {
            super(0);
            this.a = hMLFEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onEvent:" + this.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.xiaomi.hm.health.device.HMHeadsetSettingActivity$hrLifecycleObserver$1] */
    public HMHeadsetSettingActivity() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceUtilsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.device.HMHeadsetSettingActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.DeviceUtilsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceUtilsApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.HMHeadsetSettingActivity$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), objArr2, objArr3);
            }
        });
        this.unbindListener = new HMHeadsetSettingActivity$unbindListener$1(this);
    }

    private final void A0() {
        LiveData<Resource<EqEntity>> equalizerEntityLiveData;
        String str = this.address;
        Objects.requireNonNull(str);
        this.viewModel = (HeadSettingViewModel) new HeadsetViewModelProvider(str, this).get(HeadSettingViewModel.class);
        HMDeviceSource hMDeviceSource = this.deviceSource;
        if (hMDeviceSource == HMDeviceSource.OTHER_HAYDN) {
            EqualizerViewModel equalizerViewModel = (EqualizerViewModel) new ViewModelProvider(this, new EqualizerViewModelFactory(hMDeviceSource)).get(EqualizerViewModel.class);
            this.eqViewModel = equalizerViewModel;
            if (equalizerViewModel != null && (equalizerEntityLiveData = equalizerViewModel.getEqualizerEntityLiveData()) != null) {
                equalizerEntityLiveData.observe(this, new Observer() { // from class: qx2
                    @Override // androidx.p008lifecycle.Observer
                    public final void onChanged(Object obj) {
                        HMHeadsetSettingActivity.Q0(this.a, (Resource) obj);
                    }
                });
            }
            EqualizerViewModel equalizerViewModel2 = this.eqViewModel;
            if (equalizerViewModel2 != null) {
                equalizerViewModel2.loadEntity();
            }
        }
        HeadSettingViewModel headSettingViewModel = this.viewModel;
        Objects.requireNonNull(headSettingViewModel);
        HeadsetSettings headsetSettings = headSettingViewModel.getHeadsetSettings();
        if (headsetSettings.isSupportSportSettings()) {
            ((ViewStub) findViewById(R.id.viewstud_headset_sport)).inflate();
        }
        if (headsetSettings.getNoiseReduction()) {
            ((ViewStub) findViewById(R.id.viewstud_headset_noise)).inflate();
            d0(NoiseControlType.CLOSE);
        }
        G1(headsetSettings);
        HeadSettingViewModel headSettingViewModel2 = this.viewModel;
        Objects.requireNonNull(headSettingViewModel2);
        String str2 = this.address;
        Objects.requireNonNull(str2);
        headSettingViewModel2.initHeadsetNeedCondition(str2);
        getLifecycle().addObserver(new LifecycleComponent());
        HeadSettingViewModel headSettingViewModel3 = this.viewModel;
        Objects.requireNonNull(headSettingViewModel3);
        headSettingViewModel3.getCheckingLiveData().observe(this, new Observer() { // from class: ey2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMHeadsetSettingActivity.R0(this.a, (Boolean) obj);
            }
        });
        HeadSettingViewModel headSettingViewModel4 = this.viewModel;
        Objects.requireNonNull(headSettingViewModel4);
        headSettingViewModel4.getMozartH5UrlLiveData().observe(this, new Observer() { // from class: sx2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMHeadsetSettingActivity.S0(this.a, (MozartH5) obj);
            }
        });
        HeadSettingViewModel headSettingViewModel5 = this.viewModel;
        Objects.requireNonNull(headSettingViewModel5);
        headSettingViewModel5.getHeadsetBatteryInfos().observe(this, new Observer() { // from class: hy2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMHeadsetSettingActivity.B0(this.a, (List) obj);
            }
        });
        HeadSettingViewModel headSettingViewModel6 = this.viewModel;
        Objects.requireNonNull(headSettingViewModel6);
        headSettingViewModel6.getDeviceEnable().observe(this, new Observer() { // from class: dy2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMHeadsetSettingActivity.C0(this.a, (Boolean) obj);
            }
        });
        HeadSettingViewModel headSettingViewModel7 = this.viewModel;
        Objects.requireNonNull(headSettingViewModel7);
        headSettingViewModel7.getWritingResult().observe(this, new Observer() { // from class: fy2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMHeadsetSettingActivity.D0(this.a, (Boolean) obj);
            }
        });
        HeadSettingViewModel headSettingViewModel8 = this.viewModel;
        Objects.requireNonNull(headSettingViewModel8);
        headSettingViewModel8.getHeadsetBaseInfo().observe(this, new Observer() { // from class: iy2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMHeadsetSettingActivity.E0(this.a, (Pair) obj);
            }
        });
        HeadSettingViewModel headSettingViewModel9 = this.viewModel;
        Objects.requireNonNull(headSettingViewModel9);
        headSettingViewModel9.getNoiseControl().observe(this, new Observer() { // from class: xx2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMHeadsetSettingActivity.F0(this.a, (NoiseReductionModeVo) obj);
            }
        });
        HeadSettingViewModel headSettingViewModel10 = this.viewModel;
        Objects.requireNonNull(headSettingViewModel10);
        headSettingViewModel10.getRunningRecognition().observe(this, new Observer() { // from class: zx2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMHeadsetSettingActivity.G0(this.a, (RunningRecognitionVo) obj);
            }
        });
        HeadSettingViewModel headSettingViewModel11 = this.viewModel;
        Objects.requireNonNull(headSettingViewModel11);
        headSettingViewModel11.getWearInduction().observe(this, new Observer() { // from class: by2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMHeadsetSettingActivity.H0(this.a, (WearInductionVo) obj);
            }
        });
        HeadSettingViewModel headSettingViewModel12 = this.viewModel;
        Objects.requireNonNull(headSettingViewModel12);
        headSettingViewModel12.getCervicalProtection().observe(this, new Observer() { // from class: tx2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMHeadsetSettingActivity.I0(this.a, (CervicalProtectionVo) obj);
            }
        });
        HeadSettingViewModel headSettingViewModel13 = this.viewModel;
        Objects.requireNonNull(headSettingViewModel13);
        headSettingViewModel13.getPercussionBroadcast().observe(this, new Observer() { // from class: yx2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMHeadsetSettingActivity.J0(this.a, (PercussionBroadcastVo) obj);
            }
        });
        HeadSettingViewModel headSettingViewModel14 = this.viewModel;
        Objects.requireNonNull(headSettingViewModel14);
        headSettingViewModel14.getHrReminderInfo().observe(this, new Observer() { // from class: wx2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMHeadsetSettingActivity.K0(this.a, (HrReminderInfoVo) obj);
            }
        });
        HeadSettingViewModel headSettingViewModel15 = this.viewModel;
        Objects.requireNonNull(headSettingViewModel15);
        headSettingViewModel15.getHeadsetSportSetting().observe(this, new Observer() { // from class: ux2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMHeadsetSettingActivity.M0(this.a, (HeadsetSportSettingVo) obj);
            }
        });
        HeadSettingViewModel headSettingViewModel16 = this.viewModel;
        Objects.requireNonNull(headSettingViewModel16);
        headSettingViewModel16.getStatusHearingHealth().observe(this, new Observer() { // from class: vx2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMHeadsetSettingActivity.N0(this.a, (HearingHealthStatusVo) obj);
            }
        });
        HeadSettingViewModel headSettingViewModel17 = this.viewModel;
        Objects.requireNonNull(headSettingViewModel17);
        headSettingViewModel17.isLimitViewOperate().observe(this, new Observer() { // from class: gy2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMHeadsetSettingActivity.O0(this.a, (Boolean) obj);
            }
        });
        HeadSettingViewModel headSettingViewModel18 = this.viewModel;
        Objects.requireNonNull(headSettingViewModel18);
        headSettingViewModel18.getSmartPlay().observe(this, new Observer() { // from class: ay2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMHeadsetSettingActivity.P0(this.a, (SmartPlayVo) obj);
            }
        });
        HeadSettingViewModel headSettingViewModel19 = this.viewModel;
        Objects.requireNonNull(headSettingViewModel19);
        headSettingViewModel19.loadHeadsetBaseInfo();
    }

    private final void A1() {
        HMDeviceSource hMDeviceSource = this.deviceSource;
        String str = this.address;
        Objects.requireNonNull(str);
        startActivity(HMFwUpgradeInfoActivity.newIntent(this, hMDeviceSource, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B0(HMHeadsetSettingActivity hMHeadsetSettingActivity, List list) {
        Part part;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            HeadsetPart part2 = ((HeadsetBatteryInfo) list.get(i)).getPart();
            int i2 = part2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[part2.ordinal()];
            if (i2 == 1) {
                part = Part.Left.INSTANCE;
            } else if (i2 != 2) {
                part = i2 != 3 ? null : Part.Box.INSTANCE;
            } else {
                part = Part.Right.INSTANCE;
            }
            if (part != null) {
                hMHeadsetSettingActivity.F1(part, ((HeadsetBatteryInfo) list.get(i)).getBatteryInfo(), ((HeadsetBatteryInfo) list.get(i)).isCharging());
            }
        }
    }

    private final void B1() {
        if (!NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            IconToast.showError(this, getString(R.string.no_network_connection));
            return;
        }
        if (g0().isFastDoubleClick((ListTile) findViewById(R.id.item_check_firmware))) {
            return;
        }
        if (i0()) {
            A1();
            return;
        }
        this.isCheckByUser = true;
        s1(this);
        if (DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade()) {
            HMFwOnlineManager.getInstance().checkFw(this.deviceType, true);
        } else {
            NetFwUpgradeManager.checkFwFromServerAsync(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C0(HMHeadsetSettingActivity hMHeadsetSettingActivity, Boolean bool) {
        hMHeadsetSettingActivity.I1(bool.booleanValue());
    }

    private final void C1(HMDeviceSource deviceSource) {
        int i;
        int[] iArr = WhenMappings.$EnumSwitchMapping$2;
        int i2 = iArr[deviceSource.ordinal()] == 1 ? R.string.unbind_title : R.string.headset_unbind_title;
        int i3 = iArr[deviceSource.ordinal()];
        if (i3 != 1) {
            i = i3 != 2 ? R.string.headset_unbind_message : R.string.headset_unbind_lullaby_message;
        } else {
            i = R.string.headset_unbind_tips;
        }
        new AlertDialogFragment.Builder(this).setTitle(i2).setMessage(i).setCancelable(true).setNegativeButton(iArr[deviceSource.ordinal()] == 1 ? R.string.cancel : R.string.headset_unbind_btn_cancel_msg, new DialogInterface.OnClickListener() { // from class: ny2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                HMHeadsetSettingActivity.D1(dialogInterface, i4);
            }
        }).setPositiveButton(iArr[deviceSource.ordinal()] == 1 ? R.string.confirm : R.string.headset_unbind_btn_sure_msg, new DialogInterface.OnClickListener() { // from class: vw2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                HMHeadsetSettingActivity.E1(this.a, dialogInterface, i4);
            }
        }).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D0(HMHeadsetSettingActivity hMHeadsetSettingActivity, Boolean bool) {
        if (hMHeadsetSettingActivity.setLoadingDlg == null) {
            LoadingDialog loadingDialog = new LoadingDialog(hMHeadsetSettingActivity);
            loadingDialog.setCancelable(false);
            Unit unit = Unit.INSTANCE;
            hMHeadsetSettingActivity.setLoadingDlg = loadingDialog;
        }
        if (bool == null) {
            return;
        }
        if (!(!bool.booleanValue())) {
            bool = null;
        }
        if (bool == null) {
            return;
        }
        bool.booleanValue();
        LoadingDialog loadingDialog2 = hMHeadsetSettingActivity.setLoadingDlg;
        if (loadingDialog2 == null) {
            return;
        }
        LoadingDialog loadingDialog3 = loadingDialog2.isShowing() ^ true ? loadingDialog2 : null;
        if (loadingDialog3 == null) {
            return;
        }
        loadingDialog3.show();
        loadingDialog3.setFailed(hMHeadsetSettingActivity.getString(R.string.save_failed));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D1(DialogInterface dialogInterface, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E0(HMHeadsetSettingActivity hMHeadsetSettingActivity, Pair pair) {
        CharSequence charSequence = (CharSequence) pair.getFirst();
        if (((charSequence == null || charSequence.length() == 0) ^ true ? pair : null) != null) {
            ((RainbowTitleBar) hMHeadsetSettingActivity.findViewById(R.id.rainbow_title_bar)).setSubtitle((CharSequence) pair.getFirst());
        }
        ListTile listTile = (ListTile) hMHeadsetSettingActivity.findViewById(R.id.item_fw_version);
        String str = (String) pair.getSecond();
        if (str == null) {
            str = "";
        }
        listTile.setTips(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E1(HMHeadsetSettingActivity hMHeadsetSettingActivity, DialogInterface dialogInterface, int i) {
        HMUnbindBaseLogic.unbind(hMHeadsetSettingActivity.device, hMHeadsetSettingActivity.unbindListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F0(HMHeadsetSettingActivity hMHeadsetSettingActivity, NoiseReductionModeVo noiseReductionModeVo) {
        if (noiseReductionModeVo == null) {
            return;
        }
        hMHeadsetSettingActivity.H1(noiseReductionModeVo.getNoiseControl());
        if (((ConstraintLayout) hMHeadsetSettingActivity.findViewById(R.id.constraint_noise_control)) == null) {
            return;
        }
        hMHeadsetSettingActivity.f1(noiseReductionModeVo.isEnable());
    }

    private final void F1(Part part, BatteryInfo batteryInfo, boolean isCharging) {
        TextView textView = (TextView) findViewById(part.getBatteryView());
        TextView textView2 = (TextView) findViewById(part.getPercentView());
        ImageView imageView = (ImageView) findViewById(part.getChargeView());
        if (batteryInfo != null) {
            int level = batteryInfo.getLevel();
            if (!(level < 0 || level > 100)) {
                int i = batteryInfo.getLevel() < 20 ? R.color.p3 : R.color.s1;
                textView.setTextColor(ContextCompat.getColor(this, i));
                textView.setText(String.valueOf(batteryInfo.getLevel()));
                textView2.setTextColor(ContextCompat.getColor(this, i));
                textView2.setVisibility(0);
                imageView.setVisibility(isCharging ? 0 : 8);
                return;
            }
        }
        textView.setTextColor(ContextCompat.getColor(this, R.color.s1));
        textView.setText(R.string.empty_value);
        textView2.setVisibility(8);
        imageView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G0(HMHeadsetSettingActivity hMHeadsetSettingActivity, RunningRecognitionVo runningRecognitionVo) {
        if (runningRecognitionVo == null) {
            return;
        }
        int i = R.id.item_headset_settings_running_recognition;
        ListTile listTile = (ListTile) hMHeadsetSettingActivity.findViewById(i);
        if (listTile != null) {
            Boolean runningRecognition = runningRecognitionVo.getRunningRecognition();
            listTile.setChecked(runningRecognition == null ? false : runningRecognition.booleanValue());
        }
        ListTile listTile2 = (ListTile) hMHeadsetSettingActivity.findViewById(i);
        if (listTile2 == null) {
            return;
        }
        listTile2.setEnabled(runningRecognitionVo.isEnable());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HeadsetSettings G1(HeadsetSettings settings) {
        Group group;
        q1((ListTile) findViewById(R.id.item_sky_sleep_relax), settings.getSkySleepRelax());
        q1((ListTile) findViewById(R.id.item_headset_alarm), settings.getHeadsetAlarm());
        q1((ListTile) findViewById(R.id.item_headset_smart_play_music), settings.getSmartPlayMusic());
        q1((ListTile) findViewById(R.id.item_headset_settings_action), settings.getGestureSettings());
        q1((ListTile) findViewById(R.id.item_headset_settings_equalizer), settings.getMusicEqualizer());
        q1((ListTile) findViewById(R.id.item_headset_settings_side_listen), settings.getAmbientSoundMonitoring());
        q1((ListTile) findViewById(R.id.item_headset_settings_sport), settings.getSportsSettings());
        ListTile listTile = (ListTile) findViewById(R.id.item_headset_settings_hearing_health);
        if (listTile != null) {
            q1(listTile, settings.getHearingHealth());
        }
        ListTile listTile2 = (ListTile) findViewById(R.id.item_headset_settings_cervical_protection);
        if (listTile2 != null) {
            q1(listTile2, settings.getCervicalProtection());
        }
        ListTile listTile3 = (ListTile) findViewById(R.id.item_headset_settings_voice_control);
        if (listTile3 != null) {
            q1(listTile3, settings.getVoiceControl());
        }
        ListTile listTile4 = (ListTile) findViewById(R.id.item_headset_settings_wear_induction);
        if (listTile4 != null) {
            q1(listTile4, settings.getWearInduction());
        }
        if (settings.isSupportSportSettings()) {
            ListTile listTile5 = (ListTile) findViewById(R.id.item_headset_settings_running_recognition);
            if (listTile5 != null) {
                q1(listTile5, settings.getRunningRecognition());
            }
            ListTile listTile6 = (ListTile) findViewById(R.id.item_headset_settings_high_hr_reminder);
            if (listTile6 != null) {
                q1(listTile6, settings.getSportHighHrReminder());
            }
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.hr_seek_bar_container);
            if (linearLayout != null) {
                q1(linearLayout, settings.getSportHighHrReminder());
            }
            ListTile listTile7 = (ListTile) findViewById(R.id.item_headset_settings_beat_enhancement);
            if (listTile7 != null) {
                q1(listTile7, settings.getBeatEnhancement());
            }
            ListTile listTile8 = (ListTile) findViewById(R.id.item_headset_settings_hr_broadcast);
            if (listTile8 != null) {
                q1(listTile8, settings.getHrBroadcast());
            }
            ListTile listTile9 = (ListTile) findViewById(R.id.item_headset_settings_percussion);
            if (listTile9 != null) {
                q1(listTile9, settings.getPercussionBroadcast());
            }
        }
        if (settings.getNoiseReduction() && (group = (Group) findViewById(R.id.noise_reduction_group)) != null) {
            q1(group, false);
        }
        return settings;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H0(HMHeadsetSettingActivity hMHeadsetSettingActivity, WearInductionVo wearInductionVo) {
        if (wearInductionVo == null) {
            return;
        }
        int i = R.id.item_headset_settings_wear_induction;
        ListTile listTile = (ListTile) hMHeadsetSettingActivity.findViewById(i);
        if (listTile != null) {
            Boolean wearInduction = wearInductionVo.getWearInduction();
            listTile.setChecked(wearInduction == null ? false : wearInduction.booleanValue());
        }
        ListTile listTile2 = (ListTile) hMHeadsetSettingActivity.findViewById(i);
        if (listTile2 == null) {
            return;
        }
        listTile2.setEnabled(wearInductionVo.isEnable());
    }

    private final void H1(NoiseControl noiseControl) {
        String string;
        if (noiseControl == null) {
            Group group = (Group) findViewById(R.id.noise_reduction_group);
            if (group != null) {
                group.setVisibility(8);
            }
            RadioGroup radioGroup = (RadioGroup) findViewById(R.id.noise_control_type);
            if (radioGroup != null) {
                radioGroup.setVisibility(0);
            }
            d0(NoiseControlType.CLOSE);
            return;
        }
        NoiseControlType noiseControlType = noiseControl.getNoiseControlType();
        int i = noiseControlType == null ? -1 : WhenMappings.$EnumSwitchMapping$3[noiseControlType.ordinal()];
        if (i == 1 || i == 2) {
            Group group2 = (Group) findViewById(R.id.noise_reduction_group);
            if (group2 != null) {
                group2.setVisibility(8);
            }
        } else {
            Group group3 = (Group) findViewById(R.id.noise_reduction_group);
            if (group3 != null) {
                group3.setVisibility(0);
            }
            NoiseReductionMode noiseReductionMode = noiseControl.getNoiseReductionMode();
            int i2 = noiseReductionMode != null ? WhenMappings.$EnumSwitchMapping$1[noiseReductionMode.ordinal()] : -1;
            if (i2 == 1) {
                string = getString(R.string.noise_reduction_mode_adaptive);
            } else if (i2 == 2) {
                string = getString(R.string.noise_reduction_mode_sport);
            } else if (i2 != 3) {
                string = i2 != 4 ? "" : getString(R.string.noise_reduction_mode_indoor);
            } else {
                string = getString(R.string.noise_reduction_mode_traffic);
            }
            ((ListTile) findViewById(R.id.item_headset_settings_noise_reduction)).setTips(string);
        }
        NoiseControlType noiseControlType2 = noiseControl.getNoiseControlType();
        if (noiseControlType2 != null) {
            d0(noiseControlType2);
        }
        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.noise_control_type);
        if (radioGroup2 == null) {
            return;
        }
        radioGroup2.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I0(HMHeadsetSettingActivity hMHeadsetSettingActivity, CervicalProtectionVo cervicalProtectionVo) {
        ListTile listTile;
        if (cervicalProtectionVo == null || (listTile = (ListTile) hMHeadsetSettingActivity.findViewById(R.id.item_headset_settings_cervical_protection)) == null) {
            return;
        }
        listTile.setEnabled(cervicalProtectionVo.isEnable());
    }

    private final void I1(boolean connected) {
        if (connected) {
            ((ConstraintLayout) findViewById(R.id.cl_headset_container)).setVisibility(0);
            ((AppCompatImageView) findViewById(R.id.iv_disconnect)).setVisibility(8);
            ((ListTile) findViewById(R.id.item_fw_version)).setTips(f0().getBoundDeviceFirmwareVersion(this.deviceType));
            ((ListTile) findViewById(R.id.item_check_firmware)).setDotted(i0());
        } else {
            ((ConstraintLayout) findViewById(R.id.cl_headset_container)).setVisibility(4);
            ((AppCompatImageView) findViewById(R.id.iv_disconnect)).setVisibility(0);
        }
        ((ListTile) findViewById(R.id.item_headset_settings_action)).setEnabled(connected);
        ((ListTile) findViewById(R.id.item_headset_settings_equalizer)).setEnabled(connected);
        ((ListTile) findViewById(R.id.item_headset_settings_side_listen)).setEnabled(connected);
        ((ListTile) findViewById(R.id.item_headset_settings_sport)).setEnabled(connected);
        ((ListTile) findViewById(R.id.item_check_firmware)).setEnabled(connected);
        ((ListTile) findViewById(R.id.item_reset)).setEnabled(connected);
        ((ListTile) findViewById(R.id.item_fw_version)).setEnabled(connected);
        ((ListTile) findViewById(R.id.item_mac_address)).setEnabled(connected);
        if (((ConstraintLayout) findViewById(R.id.constraint_noise_control)) != null) {
            f1(connected);
        }
        k1(connected);
        ListTile listTile = (ListTile) findViewById(R.id.item_headset_settings_beat_enhancement);
        if (listTile != null) {
            listTile.setEnabled(connected);
        }
        ListTile listTile2 = (ListTile) findViewById(R.id.item_headset_settings_hr_broadcast);
        if (listTile2 != null) {
            listTile2.setEnabled(connected);
        }
        ListTile listTile3 = (ListTile) findViewById(R.id.item_headset_settings_percussion);
        if (listTile3 != null) {
            listTile3.setEnabled(connected);
        }
        ListTile listTile4 = (ListTile) findViewById(R.id.item_headset_settings_hearing_health);
        if (listTile4 != null) {
            listTile4.setEnabled(connected);
        }
        ListTile listTile5 = (ListTile) findViewById(R.id.item_headset_settings_cervical_protection);
        if (listTile5 != null) {
            listTile5.setEnabled(connected);
        }
        ListTile listTile6 = (ListTile) findViewById(R.id.item_headset_settings_running_recognition);
        if (listTile6 != null) {
            listTile6.setEnabled(connected);
        }
        ListTile listTile7 = (ListTile) findViewById(R.id.item_headset_settings_wear_induction);
        if (listTile7 != null) {
            listTile7.setEnabled(connected);
        }
        ListTile listTile8 = (ListTile) findViewById(R.id.item_headset_settings_voice_control);
        if (listTile8 != null) {
            listTile8.setEnabled(connected);
        }
        ListTile listTile9 = (ListTile) findViewById(R.id.item_sky_sleep_relax);
        if (listTile9 != null) {
            listTile9.setEnabled(connected);
        }
        ListTile listTile10 = (ListTile) findViewById(R.id.item_headset_alarm);
        if (listTile10 != null) {
            listTile10.setEnabled(connected);
        }
        ListTile listTile11 = (ListTile) findViewById(R.id.item_headset_smart_play_music);
        if (listTile11 == null) {
            return;
        }
        listTile11.setEnabled(connected);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J0(HMHeadsetSettingActivity hMHeadsetSettingActivity, PercussionBroadcastVo percussionBroadcastVo) {
        if (percussionBroadcastVo == null) {
            return;
        }
        int i = R.id.item_headset_settings_percussion;
        ListTile listTile = (ListTile) hMHeadsetSettingActivity.findViewById(i);
        if (listTile != null) {
            Boolean percussionBroadcast = percussionBroadcastVo.getPercussionBroadcast();
            listTile.setChecked(percussionBroadcast == null ? false : percussionBroadcast.booleanValue());
        }
        ((ListTile) hMHeadsetSettingActivity.findViewById(i)).setEnabled(percussionBroadcastVo.isEnable());
    }

    private final void J1(HrBroadcastType type) {
        int i;
        int i2 = WhenMappings.$EnumSwitchMapping$4[type.ordinal()];
        if (i2 == 1) {
            i = R.string.headset_hr_broadcast_type_close;
        } else if (i2 == 2) {
            i = R.string.headset_hr_broadcast_type_auto;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.headset_hr_broadcast_type_open;
        }
        ListTile listTile = (ListTile) findViewById(R.id.item_headset_settings_hr_broadcast);
        if (listTile == null) {
            return;
        }
        listTile.setTips(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K0(final HMHeadsetSettingActivity hMHeadsetSettingActivity, HrReminderInfoVo hrReminderInfoVo) {
        if (hrReminderInfoVo == null) {
            return;
        }
        if (hrReminderInfoVo.getHrReminderInfo() != null) {
            HrReminderInfo hrReminderInfo = hrReminderInfoVo.getHrReminderInfo();
            if (hrReminderInfo != null) {
                ListTile listTile = (ListTile) hMHeadsetSettingActivity.findViewById(R.id.item_headset_settings_high_hr_reminder);
                if (listTile != null) {
                    listTile.setChecked(hrReminderInfo.getEnable());
                }
                final HeartRateSeekBar heartRateSeekBar = (HeartRateSeekBar) hMHeadsetSettingActivity.findViewById(R.id.seek_bar_max_hr);
                if (heartRateSeekBar != null) {
                    heartRateSeekBar.setMax(220.0f);
                    heartRateSeekBar.setProgress(heartRateSeekBar.getMax() * HrReminderHelper.INSTANCE.hrToPercent(hrReminderInfo.getHrValue()));
                    heartRateSeekBar.post(new Runnable() { // from class: oy2
                        @Override // java.lang.Runnable
                        public final void run() {
                            HMHeadsetSettingActivity.L0(this.a, heartRateSeekBar);
                        }
                    });
                }
                hMHeadsetSettingActivity.i1(hrReminderInfo.getEnable());
            }
        } else {
            ListTile listTile2 = (ListTile) hMHeadsetSettingActivity.findViewById(R.id.item_headset_settings_high_hr_reminder);
            if (listTile2 != null) {
                listTile2.setChecked(false);
            }
            hMHeadsetSettingActivity.i1(false);
        }
        hMHeadsetSettingActivity.k1(hrReminderInfoVo.isEnable());
    }

    private final boolean K1() {
        return DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade() && HMFwOnlineUpgradeManager.getInstance().useOnline(this.deviceType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L0(HMHeadsetSettingActivity hMHeadsetSettingActivity, HeartRateSeekBar heartRateSeekBar) {
        HrReminderHelper.INSTANCE.updateHrValueViewPos(hMHeadsetSettingActivity.new a(heartRateSeekBar), (LinearLayout) hMHeadsetSettingActivity.findViewById(R.id.hr_value_container), hMHeadsetSettingActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M0(HMHeadsetSettingActivity hMHeadsetSettingActivity, HeadsetSportSettingVo headsetSportSettingVo) {
        if (headsetSportSettingVo == null) {
            return;
        }
        HeadsetSportSetting headsetSportSetting = headsetSportSettingVo.getHeadsetSportSetting();
        if (headsetSportSetting != null) {
            ListTile listTile = (ListTile) hMHeadsetSettingActivity.findViewById(R.id.item_headset_settings_beat_enhancement);
            if (listTile != null) {
                listTile.setChecked(headsetSportSetting.getMeterEnhancement());
            }
            hMHeadsetSettingActivity.J1(headsetSportSetting.getHrBroadcast());
        }
        ListTile listTile2 = (ListTile) hMHeadsetSettingActivity.findViewById(R.id.item_headset_settings_hr_broadcast);
        if (listTile2 != null) {
            listTile2.setEnabled(headsetSportSettingVo.isEnable());
        }
        ListTile listTile3 = (ListTile) hMHeadsetSettingActivity.findViewById(R.id.item_headset_settings_beat_enhancement);
        if (listTile3 == null) {
            return;
        }
        listTile3.setEnabled(headsetSportSettingVo.isEnable());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N0(HMHeadsetSettingActivity hMHeadsetSettingActivity, HearingHealthStatusVo hearingHealthStatusVo) {
        ListTile listTile;
        if (hearingHealthStatusVo == null || (listTile = (ListTile) hMHeadsetSettingActivity.findViewById(R.id.item_headset_settings_hearing_health)) == null) {
            return;
        }
        listTile.setEnabled(hearingHealthStatusVo.isEnable());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O0(HMHeadsetSettingActivity hMHeadsetSettingActivity, Boolean bool) {
        hMHeadsetSettingActivity.l1(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P0(HMHeadsetSettingActivity hMHeadsetSettingActivity, SmartPlayVo smartPlayVo) {
        if (smartPlayVo == null) {
            return;
        }
        int i = R.id.item_headset_smart_play_music;
        ListTile listTile = (ListTile) hMHeadsetSettingActivity.findViewById(i);
        if (listTile != null) {
            listTile.setEnabled(smartPlayVo.isEnable());
        }
        ListTile listTile2 = (ListTile) hMHeadsetSettingActivity.findViewById(i);
        if (listTile2 == null) {
            return;
        }
        Boolean smartPlay = smartPlayVo.getSmartPlay();
        listTile2.setChecked(smartPlay == null ? false : smartPlay.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q0(HMHeadsetSettingActivity hMHeadsetSettingActivity, Resource resource) {
        if (resource == null) {
            return;
        }
        if (!(resource.getData() != null)) {
            resource = null;
        }
        if (resource != null && resource.getStatus() == com.huami.arch.helper.Status.SUCCESS) {
            ListTile listTile = (ListTile) hMHeadsetSettingActivity.findViewById(R.id.item_headset_settings_equalizer);
            BoltEqActivity.Companion companion = BoltEqActivity.INSTANCE;
            Object data = resource.getData();
            Objects.requireNonNull(data, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.classic.EqEntity");
            listTile.setTips(hMHeadsetSettingActivity.getString(companion.getEqNameRes(((EqEntity) data).getType())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R0(HMHeadsetSettingActivity hMHeadsetSettingActivity, Boolean bool) {
        hMHeadsetSettingActivity.j0(hMHeadsetSettingActivity);
        IconToast.showSuccess(hMHeadsetSettingActivity, R.string.fw_uptodate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S0(HMHeadsetSettingActivity hMHeadsetSettingActivity, MozartH5 mozartH5) {
        ((ListTile) hMHeadsetSettingActivity.findViewById(R.id.item_headset_settings_play)).setTag(mozartH5.getPlayUrl());
        ((ListTile) hMHeadsetSettingActivity.findViewById(R.id.item_faq)).setTag(mozartH5.getFaqUrl());
    }

    private final void T0() {
        final BTStatusFragment bTStatusFragmentNewInstance = BTStatusFragment.newInstance(R.id.container, getSupportFragmentManager());
        bTStatusFragmentNewInstance.setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.device.HMHeadsetSettingActivity$initStatusBar$1
            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            @NotNull
            public HMDeviceType getHMDeviceType() {
                return this.a.deviceType;
            }

            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public boolean isActivatedDevice() {
                return this.a.e1();
            }

            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public void notifyStatusWhenSetting(boolean enable) {
                EqualizerViewModel equalizerViewModel;
                HeadSettingViewModel headSettingViewModel = this.a.viewModel;
                Objects.requireNonNull(headSettingViewModel);
                headSettingViewModel.setDeviceEnable(enable);
                if (!enable || (equalizerViewModel = this.a.eqViewModel) == null) {
                    return;
                }
                equalizerViewModel.loadEntity();
            }

            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public void onEnableChange(boolean enable) {
                View viewFindViewById = this.a.findViewById(R.id.divider);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(8);
                }
                bTStatusFragmentNewInstance.setBottomAreaVisible(false);
                HeadSettingViewModel headSettingViewModel = this.a.viewModel;
                Objects.requireNonNull(headSettingViewModel);
                headSettingViewModel.setDeviceEnable(enable);
                if (enable) {
                    HMHeadsetSettingActivity hMHeadsetSettingActivity = this.a;
                    HeadSettingViewModel headSettingViewModel2 = hMHeadsetSettingActivity.viewModel;
                    Objects.requireNonNull(headSettingViewModel2);
                    hMHeadsetSettingActivity.G1(headSettingViewModel2.getHeadsetSettings());
                    EqualizerViewModel equalizerViewModel = this.a.eqViewModel;
                    if (equalizerViewModel == null) {
                        return;
                    }
                    equalizerViewModel.loadEntity();
                }
            }
        });
    }

    private final void U0() {
        setTheme(R.style.Theme_App_Zepp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V0(HMHeadsetSettingActivity hMHeadsetSettingActivity, View view) {
        hMHeadsetSettingActivity.C1(hMHeadsetSettingActivity.deviceSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W0(HMHeadsetSettingActivity hMHeadsetSettingActivity, View view) {
        if (hMHeadsetSettingActivity.deviceSource == HMDeviceSource.OTHER_MOZART) {
            HeadSetActionActivity.Companion companion = HeadSetActionActivity.INSTANCE;
            String str = hMHeadsetSettingActivity.address;
            Objects.requireNonNull(str);
            companion.start(hMHeadsetSettingActivity, str);
            return;
        }
        HeadsetActionNewActivity.Companion companion2 = HeadsetActionNewActivity.INSTANCE;
        String str2 = hMHeadsetSettingActivity.address;
        Objects.requireNonNull(str2);
        companion2.start(hMHeadsetSettingActivity, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X0(HMHeadsetSettingActivity hMHeadsetSettingActivity, View view) {
        HeadsetSideListenActivity.Companion companion = HeadsetSideListenActivity.INSTANCE;
        String str = hMHeadsetSettingActivity.address;
        Objects.requireNonNull(str);
        companion.start(hMHeadsetSettingActivity, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y0(HMHeadsetSettingActivity hMHeadsetSettingActivity, View view) {
        HeadsetSportSettingActivity.Companion companion = HeadsetSportSettingActivity.INSTANCE;
        String str = hMHeadsetSettingActivity.address;
        Objects.requireNonNull(str);
        companion.start(hMHeadsetSettingActivity, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z0(HMHeadsetSettingActivity hMHeadsetSettingActivity, View view) {
        hMHeadsetSettingActivity.B1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a1(HMHeadsetSettingActivity hMHeadsetSettingActivity, View view) {
        if (hMHeadsetSettingActivity.deviceSource == HMDeviceSource.OTHER_MOZART) {
            HeadsetResetActivity.Companion companion = HeadsetResetActivity.INSTANCE;
            String str = hMHeadsetSettingActivity.address;
            Objects.requireNonNull(str);
            hMHeadsetSettingActivity.startActivityForResult(companion.newIntent(hMHeadsetSettingActivity, str), 1);
            return;
        }
        HeadsetResetNewActivity.Companion companion2 = HeadsetResetNewActivity.INSTANCE;
        String str2 = hMHeadsetSettingActivity.address;
        Objects.requireNonNull(str2);
        hMHeadsetSettingActivity.startActivityForResult(companion2.newIntent(hMHeadsetSettingActivity, str2), 1);
    }

    private final void b0(HMDeviceSource deviceSource) {
        if (deviceSource == HMDeviceSource.OTHER_HAYDN) {
            ((AppCompatImageView) findViewById(R.id.iv_headset)).setImageResource(R.drawable.private_haydn_img_headset_settings_haydn);
        }
        if (deviceSource == HMDeviceSource.OTHER_LULLABY) {
            Object[] objArr = {(AppCompatImageView) findViewById(R.id.iv_left), (TypefaceTextView) findViewById(R.id.tv_left_battery), (TypefaceTextView) findViewById(R.id.tv_left_battery_percent), (AppCompatImageView) findViewById(R.id.iv_left_charge)};
            for (int i = 0; i < 4; i++) {
                q1((View) objArr[i], false);
            }
            Object[] objArr2 = {(AppCompatImageView) findViewById(R.id.iv_box), (TypefaceTextView) findViewById(R.id.tv_box_battery), (TypefaceTextView) findViewById(R.id.tv_box_battery_percent), (AppCompatImageView) findViewById(R.id.iv_box_charge)};
            for (int i2 = 0; i2 < 4; i2++) {
                q1((View) objArr2[i2], false);
            }
            q1((AppCompatImageView) findViewById(R.id.iv_right), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b1(HMHeadsetSettingActivity hMHeadsetSettingActivity, View view) {
        HMDeviceSource hMDeviceSource = hMHeadsetSettingActivity.deviceSource;
        if (hMDeviceSource == HMDeviceSource.OTHER_HAYDN) {
            BoltEqActivity.Companion companion = BoltEqActivity.INSTANCE;
            String str = hMHeadsetSettingActivity.address;
            Objects.requireNonNull(str);
            companion.startForResultEq(hMHeadsetSettingActivity, hMDeviceSource, str);
            return;
        }
        BoltEqActivity.Companion companion2 = BoltEqActivity.INSTANCE;
        String str2 = hMHeadsetSettingActivity.address;
        Objects.requireNonNull(str2);
        companion2.startMe(hMHeadsetSettingActivity, hMDeviceSource, str2);
    }

    private final void c0() {
        if (HMFwOnlineManager.shouldCheckFwAuto(this.deviceSource)) {
            if (K1()) {
                HMFwOnlineUpgradeManager.getInstance().checkFwUpgrade(this, this.deviceType, false);
            } else {
                HMFwUpgradeManager.getInstance().checkFwUpgrade(this, this.deviceType, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c1(View view) {
        String str = (String) view.getTag();
        if (str != null) {
            WebHelper.launch(str);
        }
    }

    private final void d0(NoiseControlType noiseControlType) {
        int i;
        int i2 = WhenMappings.$EnumSwitchMapping$3[noiseControlType.ordinal()];
        if (i2 == 1) {
            i = R.id.noise_control_close;
        } else if (i2 == 2) {
            i = R.id.noise_control_penetrate;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.id.noise_control_reduction;
        }
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.noise_control_type);
        if (radioGroup == null) {
            return;
        }
        radioGroup.check(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d1(View view) {
        String str = (String) view.getTag();
        if (str != null) {
            WebHelper.launch(str);
        }
    }

    private final NoiseReductionMode e0(String mode) {
        if (Intrinsics.areEqual(mode, getString(R.string.noise_reduction_mode_adaptive))) {
            return NoiseReductionMode.ADAPTIVE;
        }
        if (Intrinsics.areEqual(mode, getString(R.string.noise_reduction_mode_traffic))) {
            return NoiseReductionMode.TRAFFIC;
        }
        if (Intrinsics.areEqual(mode, getString(R.string.noise_reduction_mode_indoor))) {
            return NoiseReductionMode.INDOOR;
        }
        return Intrinsics.areEqual(mode, getString(R.string.noise_reduction_mode_sport)) ? NoiseReductionMode.MOVEMENT : NoiseReductionMode.ADAPTIVE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e1() {
        return f0().isActive(this.device);
    }

    private final DeviceManagerApi f0() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final void f1(boolean enable) {
        int childCount;
        RadioGroup radioGroup;
        int childCount2;
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.constraint_noise_control);
        if (constraintLayout == null || (childCount = constraintLayout.getChildCount()) <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            View childAt = constraintLayout.getChildAt(i);
            if ((childAt instanceof RadioGroup) && (childCount2 = (radioGroup = (RadioGroup) childAt).getChildCount()) > 0) {
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    p1(radioGroup.getChildAt(i3), enable);
                    if (i4 >= childCount2) {
                        break;
                    } else {
                        i3 = i4;
                    }
                }
            }
            p1(childAt, enable);
            if (i2 >= childCount) {
                return;
            } else {
                i = i2;
            }
        }
    }

    private final DeviceUtilsApi g0() {
        return (DeviceUtilsApi) this.deviceUtilsApi.getValue();
    }

    private final void g1() {
        AlertDialogFragment alertDialogFragmentNewInstance;
        Device device = this.device;
        if (device == null || (alertDialogFragmentNewInstance = EditDeviceDisplayNameDialog.newInstance(device, getBaseContext(), new EditDeviceDisplayNameDialog.IDisplayNameListener() { // from class: ky2
            @Override // com.xiaomi.hm.health.device.view.EditDeviceDisplayNameDialog.IDisplayNameListener
            public final void onDisplayNameChanged(String str) {
                HMHeadsetSettingActivity.h1(this.a, str);
            }
        })) == null) {
            return;
        }
        alertDialogFragmentNewInstance.show(getSupportFragmentManager());
    }

    private final HrBroadcastType h0(String type) {
        if (Intrinsics.areEqual(type, getString(R.string.headset_hr_broadcast_type_close))) {
            return HrBroadcastType.CLOSE;
        }
        if (Intrinsics.areEqual(type, getString(R.string.headset_hr_broadcast_type_auto))) {
            return HrBroadcastType.AUTO;
        }
        return Intrinsics.areEqual(type, getString(R.string.headset_hr_broadcast_type_open)) ? HrBroadcastType.OPEN : HrBroadcastType.CLOSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h1(HMHeadsetSettingActivity hMHeadsetSettingActivity, String str) {
        if (!(true ^ (str == null || str.length() == 0))) {
            str = null;
        }
        if (str == null) {
            return;
        }
        ((RainbowTitleBar) hMHeadsetSettingActivity.findViewById(R.id.rainbow_title_bar)).setSubtitle(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean i0() {
        return K1() ? HMFwOnlineUpgradeManager.getInstance().hasFwUpgrade(this, this.deviceType) : HMFwUpgradeManager.getInstance().hasFwUpgrade(this, this.deviceType);
    }

    private final void i1(boolean isChecked) {
        final HeartRateSeekBar heartRateSeekBar;
        int i = R.id.seek_bar_max_hr;
        HeartRateSeekBar heartRateSeekBar2 = (HeartRateSeekBar) findViewById(i);
        if (heartRateSeekBar2 != null) {
            heartRateSeekBar2.setEnabled(isChecked);
            heartRateSeekBar2.setAlpha(isChecked ? 1.0f : 0.3f);
            ((TypefaceTextView) findViewById(R.id.hr_value)).setText(String.valueOf(HrReminderHelper.INSTANCE.getHr(new a(heartRateSeekBar2), heartRateSeekBar2.getProgress())));
        }
        TypefaceTextView typefaceTextView = (TypefaceTextView) findViewById(R.id.hr_value);
        if (typefaceTextView != null) {
            typefaceTextView.setAlpha(isChecked ? 1.0f : 0.3f);
        }
        if (!isChecked || (heartRateSeekBar = (HeartRateSeekBar) findViewById(i)) == null) {
            return;
        }
        heartRateSeekBar.post(new Runnable() { // from class: my2
            @Override // java.lang.Runnable
            public final void run() {
                HMHeadsetSettingActivity.j1(this.a, heartRateSeekBar);
            }
        });
    }

    private final void initViews() {
        b0(this.deviceSource);
        r1();
        T0();
        ListTile listTile = (ListTile) findViewById(R.id.item_mac_address);
        String str = this.address;
        Objects.requireNonNull(str);
        listTile.setTips(str);
        listTile.setTrailing((Drawable) null);
        ((ListTile) findViewById(R.id.item_fw_version)).setTrailing((Drawable) null);
        ((Button) findViewById(R.id.setting_unbind)).setOnClickListener(new View.OnClickListener() { // from class: dx2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMHeadsetSettingActivity.V0(this.a, view);
            }
        });
        ((ListTile) findViewById(R.id.item_headset_settings_action)).setOnClickListener(new View.OnClickListener() { // from class: ty2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMHeadsetSettingActivity.W0(this.a, view);
            }
        });
        ((ListTile) findViewById(R.id.item_headset_settings_side_listen)).setOnClickListener(new View.OnClickListener() { // from class: xw2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMHeadsetSettingActivity.X0(this.a, view);
            }
        });
        ((ListTile) findViewById(R.id.item_headset_settings_sport)).setOnClickListener(new View.OnClickListener() { // from class: yw2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMHeadsetSettingActivity.Y0(this.a, view);
            }
        });
        ((ListTile) findViewById(R.id.item_check_firmware)).setOnClickListener(new View.OnClickListener() { // from class: ax2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMHeadsetSettingActivity.Z0(this.a, view);
            }
        });
        ((ListTile) findViewById(R.id.item_reset)).setOnClickListener(new View.OnClickListener() { // from class: ww2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMHeadsetSettingActivity.a1(this.a, view);
            }
        });
        ((ListTile) findViewById(R.id.item_headset_settings_equalizer)).setOnClickListener(new View.OnClickListener() { // from class: zw2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMHeadsetSettingActivity.b1(this.a, view);
            }
        });
        int i = R.id.item_headset_settings_play;
        ((ListTile) findViewById(i)).setTitle(getString(R.string.play_with_device, new Object[]{getString(ConfigHelperKt.getDeviceConfig(this.deviceSource).getDeviceDesc())}));
        ((ListTile) findViewById(i)).setOnClickListener(new View.OnClickListener() { // from class: hx2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMHeadsetSettingActivity.c1(view);
            }
        });
        ((ListTile) findViewById(R.id.item_faq)).setOnClickListener(new View.OnClickListener() { // from class: fx2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMHeadsetSettingActivity.d1(view);
            }
        });
    }

    private final void j0(HMHeadsetSettingActivity activity) {
        LoadingDialog loadingDialog;
        if (activity == null || activity.isDestroyed() || activity.isFinishing() || (loadingDialog = this.mCheckingDialog) == null) {
            return;
        }
        boolean z = false;
        if (loadingDialog != null && loadingDialog.isShowing()) {
            z = true;
        }
        if (z) {
            LoadingDialog loadingDialog2 = this.mCheckingDialog;
            if (loadingDialog2 != null) {
                loadingDialog2.dismiss();
            }
            this.mCheckingDialog = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j1(HMHeadsetSettingActivity hMHeadsetSettingActivity, HeartRateSeekBar heartRateSeekBar) {
        HrReminderHelper.INSTANCE.updateHrValueViewPos(hMHeadsetSettingActivity.new a(heartRateSeekBar), (LinearLayout) hMHeadsetSettingActivity.findViewById(R.id.hr_value_container), hMHeadsetSettingActivity);
    }

    private final boolean k0(Bundle savedInstanceState) {
        Device device = null;
        if (savedInstanceState == null) {
            Intent intent = getIntent();
            savedInstanceState = intent == null ? null : intent.getExtras();
        }
        String string = savedInstanceState == null ? null : savedInstanceState.getString(s);
        if (string == null) {
            return true;
        }
        this.address = string;
        Device bindDevice = f0().getBindDevice(HMDeviceType.HEADSET, string);
        if (bindDevice != null) {
            this.deviceSource = HMDeviceSource.fromValue(bindDevice.getDevice_source().intValue());
            this.deviceType = HMDeviceType.fromValue(bindDevice.getDevice_type().intValue());
            Unit unit = Unit.INSTANCE;
            device = bindDevice;
        }
        this.device = device;
        return false;
    }

    private final void k1(boolean isEnable) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.hr_seek_bar_container);
        if (linearLayout != null) {
            int i = 0;
            int childCount = linearLayout.getChildCount();
            if (childCount > 0) {
                while (true) {
                    int i2 = i + 1;
                    p1(linearLayout.getChildAt(i), isEnable);
                    if (i2 >= childCount) {
                        break;
                    } else {
                        i = i2;
                    }
                }
            }
        }
        ListTile listTile = (ListTile) findViewById(R.id.item_headset_settings_high_hr_reminder);
        if (listTile == null) {
            return;
        }
        listTile.setEnabled(isEnable);
    }

    private final void l0() {
        ListTile listTile = (ListTile) findViewById(R.id.item_headset_settings_running_recognition);
        if (listTile != null) {
            listTile.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: nx2
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    HMHeadsetSettingActivity.m0(this.a, compoundButton, z);
                }
            });
        }
        ListTile listTile2 = (ListTile) findViewById(R.id.item_headset_settings_high_hr_reminder);
        if (listTile2 != null) {
            listTile2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: lx2
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    HMHeadsetSettingActivity.n0(this.a, compoundButton, z);
                }
            });
        }
        ListTile listTile3 = (ListTile) findViewById(R.id.item_headset_settings_percussion);
        if (listTile3 != null) {
            listTile3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: jx2
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    HMHeadsetSettingActivity.o0(this.a, compoundButton, z);
                }
            });
        }
        ListTile listTile4 = (ListTile) findViewById(R.id.item_headset_settings_wear_induction);
        if (listTile4 != null) {
            listTile4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: kx2
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    HMHeadsetSettingActivity.p0(this.a, compoundButton, z);
                }
            });
        }
        ListTile listTile5 = (ListTile) findViewById(R.id.item_headset_settings_cervical_protection);
        if (listTile5 != null) {
            listTile5.setOnClickListener(new View.OnClickListener() { // from class: ry2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HMHeadsetSettingActivity.q0(this.a, view);
                }
            });
        }
        ListTile listTile6 = (ListTile) findViewById(R.id.item_headset_settings_beat_enhancement);
        if (listTile6 != null) {
            listTile6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ox2
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    HMHeadsetSettingActivity.r0(this.a, compoundButton, z);
                }
            });
        }
        ListTile listTile7 = (ListTile) findViewById(R.id.item_headset_settings_hr_broadcast);
        if (listTile7 != null) {
            listTile7.setOnClickListener(new View.OnClickListener() { // from class: qy2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HMHeadsetSettingActivity.s0(this.a, view);
                }
            });
        }
        HeartRateSeekBar heartRateSeekBar = (HeartRateSeekBar) findViewById(R.id.seek_bar_max_hr);
        if (heartRateSeekBar != null) {
            heartRateSeekBar.setOnSeekBarChangeListener(new HeartRateSeekBar.OnSeekBarChangeListener() { // from class: com.xiaomi.hm.health.device.HMHeadsetSettingActivity$initEvents$8
                @Override // com.xiaomi.hm.health.ui.widget.HeartRateSeekBar.OnSeekBarChangeListener
                public void onProgressChanged(@Nullable HeartRateSeekBar seekBar, float progress) {
                    if (seekBar == null) {
                        return;
                    }
                    HMHeadsetSettingActivity hMHeadsetSettingActivity = this.a;
                    HrReminderHelper hrReminderHelper = HrReminderHelper.INSTANCE;
                    int hr = hrReminderHelper.getHr(hMHeadsetSettingActivity.new a(seekBar), progress);
                    hrReminderHelper.updateHrValueViewPos(hMHeadsetSettingActivity.new a(seekBar), (LinearLayout) hMHeadsetSettingActivity.findViewById(R.id.hr_value_container), hMHeadsetSettingActivity);
                    ((TypefaceTextView) hMHeadsetSettingActivity.findViewById(R.id.hr_value)).setText(String.valueOf(hr));
                }

                @Override // com.xiaomi.hm.health.ui.widget.HeartRateSeekBar.OnSeekBarChangeListener
                public void onStartTrackingTouch(@Nullable HeartRateSeekBar seekBar) {
                }

                @Override // com.xiaomi.hm.health.ui.widget.HeartRateSeekBar.OnSeekBarChangeListener
                public void onStopTrackingTouch(@Nullable HeartRateSeekBar seekBar) {
                    if (seekBar == null) {
                        return;
                    }
                    HMHeadsetSettingActivity hMHeadsetSettingActivity = this.a;
                    int hr = HrReminderHelper.INSTANCE.getHr(hMHeadsetSettingActivity.new a(seekBar), seekBar.getProgress());
                    HeadSettingViewModel headSettingViewModel = hMHeadsetSettingActivity.viewModel;
                    Objects.requireNonNull(headSettingViewModel);
                    headSettingViewModel.setHrReminder(new HrReminderInfo(((ListTile) hMHeadsetSettingActivity.findViewById(R.id.item_headset_settings_high_hr_reminder)).isChecked(), hr));
                }
            });
        }
        ListTile listTile8 = (ListTile) findViewById(R.id.item_headset_settings_hearing_health);
        if (listTile8 != null) {
            listTile8.setOnClickListener(new View.OnClickListener() { // from class: py2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HMHeadsetSettingActivity.t0(this.a, view);
                }
            });
        }
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.noise_control_type);
        if (radioGroup != null) {
            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: px2
                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                public final void onCheckedChanged(RadioGroup radioGroup2, int i) {
                    HMHeadsetSettingActivity.u0(this.a, radioGroup2, i);
                }
            });
        }
        ListTile listTile9 = (ListTile) findViewById(R.id.item_headset_settings_noise_reduction);
        if (listTile9 != null) {
            listTile9.setOnClickListener(new View.OnClickListener() { // from class: bx2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HMHeadsetSettingActivity.v0(this.a, view);
                }
            });
        }
        ListTile listTile10 = (ListTile) findViewById(R.id.item_sky_sleep_relax);
        if (listTile10 != null) {
            listTile10.setOnClickListener(new View.OnClickListener() { // from class: cx2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HMHeadsetSettingActivity.w0(this.a, view);
                }
            });
        }
        ((ListTile) findViewById(R.id.item_headset_alarm)).setOnClickListener(new View.OnClickListener() { // from class: ex2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMHeadsetSettingActivity.x0(view);
            }
        });
        ((ListTile) findViewById(R.id.item_headset_smart_play_music)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: mx2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                HMHeadsetSettingActivity.y0(this.a, compoundButton, z);
            }
        });
        if (DeviceXFunctionsKt.getBuildConfigApi().isDebug()) {
            ((ConstraintLayout) findViewById(R.id.cl_headset_container)).setOnLongClickListener(new View.OnLongClickListener() { // from class: ix2
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return HMHeadsetSettingActivity.z0(this.a, view);
                }
            });
        }
    }

    private final void l1(boolean isOperate) {
        this.isLimitOperate = isOperate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m0(HMHeadsetSettingActivity hMHeadsetSettingActivity, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            HeadSettingViewModel headSettingViewModel = hMHeadsetSettingActivity.viewModel;
            Objects.requireNonNull(headSettingViewModel);
            headSettingViewModel.setRunningRecognition(z);
        }
    }

    private final void m1() {
        int i = R.id.rainbow_title_bar;
        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) findViewById(i);
        String deviceDescription = g0().getDeviceDescription(this.deviceSource);
        if (deviceDescription == null) {
            deviceDescription = "";
        }
        rainbowTitleBar.setTitle(deviceDescription);
        ((RainbowTitleBar) findViewById(i)).setNavigationOnClickListener(new View.OnClickListener() { // from class: sy2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMHeadsetSettingActivity.n1(this.a, view);
            }
        });
        ((RainbowTitleBar) findViewById(i)).setMenuIcon(R.drawable.ic_edit_20);
        ((RainbowTitleBar) findViewById(i)).setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: jy2
            @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
            public final void onClick(View view, int i2) {
                HMHeadsetSettingActivity.o1(this.a, view, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n0(HMHeadsetSettingActivity hMHeadsetSettingActivity, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            HrReminderHelper hrReminderHelper = HrReminderHelper.INSTANCE;
            int i = R.id.seek_bar_max_hr;
            int hr = hrReminderHelper.getHr(hMHeadsetSettingActivity.new a((HeartRateSeekBar) hMHeadsetSettingActivity.findViewById(i)), ((HeartRateSeekBar) hMHeadsetSettingActivity.findViewById(i)).getProgress());
            HeadSettingViewModel headSettingViewModel = hMHeadsetSettingActivity.viewModel;
            Objects.requireNonNull(headSettingViewModel);
            headSettingViewModel.setHrReminder(new HrReminderInfo(z, hr));
            hMHeadsetSettingActivity.i1(z);
            if (z) {
                hMHeadsetSettingActivity.t1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n1(HMHeadsetSettingActivity hMHeadsetSettingActivity, View view) {
        hMHeadsetSettingActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o0(HMHeadsetSettingActivity hMHeadsetSettingActivity, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            HeadSettingViewModel headSettingViewModel = hMHeadsetSettingActivity.viewModel;
            Objects.requireNonNull(headSettingViewModel);
            headSettingViewModel.setPercussionBroadcast(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o1(HMHeadsetSettingActivity hMHeadsetSettingActivity, View view, int i) {
        if (i == 0) {
            hMHeadsetSettingActivity.g1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p0(HMHeadsetSettingActivity hMHeadsetSettingActivity, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            HeadSettingViewModel headSettingViewModel = hMHeadsetSettingActivity.viewModel;
            Objects.requireNonNull(headSettingViewModel);
            headSettingViewModel.setWearInduction(z);
        }
    }

    private final void p1(View view, boolean enable) {
        view.setEnabled(enable);
        view.setAlpha(!enable ? 0.6f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q0(HMHeadsetSettingActivity hMHeadsetSettingActivity, View view) {
        Boolean cervicalProtection;
        CervicalProtectionActivity.Companion companion = CervicalProtectionActivity.INSTANCE;
        HeadSettingViewModel headSettingViewModel = hMHeadsetSettingActivity.viewModel;
        Objects.requireNonNull(headSettingViewModel);
        CervicalProtectionVo value = headSettingViewModel.getCervicalProtection().getValue();
        boolean zBooleanValue = false;
        if (value != null && (cervicalProtection = value.getCervicalProtection()) != null) {
            zBooleanValue = cervicalProtection.booleanValue();
        }
        String str = hMHeadsetSettingActivity.address;
        Objects.requireNonNull(str);
        companion.startActivityForResult(hMHeadsetSettingActivity, zBooleanValue, str, 16);
    }

    private final void q1(View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(HMHeadsetSettingActivity hMHeadsetSettingActivity, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            HeadSettingViewModel headSettingViewModel = hMHeadsetSettingActivity.viewModel;
            Objects.requireNonNull(headSettingViewModel);
            headSettingViewModel.setBeatEnhancement(z);
        }
    }

    private final void r1() {
        ((HMScrollView) findViewById(R.id.scroll_container)).setOnHMScrollViewStateChanged(new HMScrollView.OnHMScrollViewStateChanged() { // from class: com.xiaomi.hm.health.device.HMHeadsetSettingActivity$setupScrollHandler$1
            @Override // com.huami.lib.view.scroll.HMScrollView.OnHMScrollViewStateChanged
            public void onBottomExpand(float distance) {
            }

            @Override // com.huami.lib.view.scroll.HMScrollView.OnHMScrollViewStateChanged
            public void onExpandViewExpand(float distance) {
            }

            @Override // com.huami.lib.view.scroll.HMScrollView.OnHMScrollViewStateChanged
            public void onExpandViewExpandStart() {
            }

            @Override // com.huami.lib.view.scroll.HMScrollView.OnHMScrollViewStateChanged
            public void onExpandViewRelease(float ratio) {
            }

            @Override // com.huami.lib.view.scroll.HMScrollView.OnHMScrollViewStateChanged
            public void onScrollerScroll(float distance) {
                int i;
                if (distance >= 255.0f) {
                    i = 255;
                } else if (distance <= 0.0f) {
                    i = 0;
                } else {
                    float f = 255;
                    i = (int) ((distance / f) * f);
                }
                int color = ContextCompat.getColor(this.a, R.color.s38) & 16777215;
                Color.argb(i, 255 & (color >> 16), (color >> 8) & 255, color & 255);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(HMHeadsetSettingActivity hMHeadsetSettingActivity, View view) {
        HeadsetSportSetting headsetSportSetting;
        HeadSettingViewModel headSettingViewModel = hMHeadsetSettingActivity.viewModel;
        Objects.requireNonNull(headSettingViewModel);
        HeadsetSportSettingVo value = headSettingViewModel.getHeadsetSportSetting().getValue();
        HrBroadcastType hrBroadcast = null;
        if (value != null && (headsetSportSetting = value.getHeadsetSportSetting()) != null) {
            hrBroadcast = headsetSportSetting.getHrBroadcast();
        }
        if (hrBroadcast == null) {
            hrBroadcast = HrBroadcastType.CLOSE;
        }
        hMHeadsetSettingActivity.u1(hrBroadcast);
    }

    private final void s1(Activity activity) {
        if (activity.isDestroyed()) {
            return;
        }
        int i = R.string.checking_new_apk;
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(activity, getString(i));
        this.mCheckingDialog = loadingDialogShowDialog;
        if (loadingDialogShowDialog != null) {
            loadingDialogShowDialog.setMessage(getString(i));
        }
        LoadingDialog loadingDialog = this.mCheckingDialog;
        if (loadingDialog != null) {
            loadingDialog.setCancelable(false);
        }
        LoadingDialog loadingDialog2 = this.mCheckingDialog;
        if (loadingDialog2 != null) {
            loadingDialog2.show();
        }
        HeadSettingViewModel headSettingViewModel = this.viewModel;
        Objects.requireNonNull(headSettingViewModel);
        headSettingViewModel.dismissCheckingDelay();
    }

    @JvmStatic
    public static final void start(@NotNull Context context, @NotNull String str) {
        INSTANCE.start(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(HMHeadsetSettingActivity hMHeadsetSettingActivity, View view) {
        Boolean statusHearingHealth;
        HeadsetHearingHealthActivity.Companion companion = HeadsetHearingHealthActivity.INSTANCE;
        String str = hMHeadsetSettingActivity.address;
        Objects.requireNonNull(str);
        HeadSettingViewModel headSettingViewModel = hMHeadsetSettingActivity.viewModel;
        Objects.requireNonNull(headSettingViewModel);
        HearingHealthStatusVo value = headSettingViewModel.getStatusHearingHealth().getValue();
        boolean zBooleanValue = false;
        if (value != null && (statusHearingHealth = value.getStatusHearingHealth()) != null) {
            zBooleanValue = statusHearingHealth.booleanValue();
        }
        companion.startActivityForResult(hMHeadsetSettingActivity, str, 15, zBooleanValue);
    }

    private final void t1() {
        HrReminderSheetDialogFragment hrReminderSheetDialogFragment;
        if (this.hrReminderDialog == null) {
            HrReminderSheetDialogFragment.Companion companion = HrReminderSheetDialogFragment.INSTANCE;
            String str = this.address;
            Objects.requireNonNull(str);
            HrReminderSheetDialogFragment hrReminderSheetDialogFragmentNewInstance = companion.newInstance(str);
            this.hrReminderDialog = hrReminderSheetDialogFragmentNewInstance;
            if (hrReminderSheetDialogFragmentNewInstance != null) {
                hrReminderSheetDialogFragmentNewInstance.setCancelable(false);
            }
        }
        if (this.hrReminderDialog.isAdded() || this.hrReminderDialog.isVisible() || getSupportFragmentManager().findFragmentByTag(HrReminderSheetDialogFragment.TAG_HR_REMINDER) != null || (hrReminderSheetDialogFragment = this.hrReminderDialog) == null) {
            return;
        }
        hrReminderSheetDialogFragment.show(getSupportFragmentManager(), HrReminderSheetDialogFragment.TAG_HR_REMINDER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(HMHeadsetSettingActivity hMHeadsetSettingActivity, RadioGroup radioGroup, int i) {
        NoiseControlType noiseControlType;
        NoiseControl noiseControl;
        NoiseControl noiseControl2;
        String string;
        RadioButton radioButton = (RadioButton) radioGroup.findViewById(i);
        if (radioButton != null && radioButton.isPressed()) {
            NoiseReductionMode noiseReductionMode = null;
            if (i == R.id.noise_control_penetrate) {
                noiseControlType = NoiseControlType.PENETRATE;
            } else if (i == R.id.noise_control_close) {
                noiseControlType = NoiseControlType.CLOSE;
            } else {
                noiseControlType = i == R.id.noise_control_reduction ? NoiseControlType.NOISE_REDUCTION : null;
            }
            ListTile listTile = (ListTile) hMHeadsetSettingActivity.findViewById(R.id.item_headset_settings_noise_reduction);
            if (listTile != null) {
                ((Group) hMHeadsetSettingActivity.findViewById(R.id.noise_reduction_group)).setVisibility(noiseControlType != NoiseControlType.NOISE_REDUCTION ? 8 : 0);
                HeadSettingViewModel headSettingViewModel = hMHeadsetSettingActivity.viewModel;
                Objects.requireNonNull(headSettingViewModel);
                NoiseReductionModeVo value = headSettingViewModel.getNoiseControl().getValue();
                NoiseReductionMode noiseReductionMode2 = (value == null || (noiseControl2 = value.getNoiseControl()) == null) ? null : noiseControl2.getNoiseReductionMode();
                int i2 = noiseReductionMode2 == null ? -1 : WhenMappings.$EnumSwitchMapping$1[noiseReductionMode2.ordinal()];
                if (i2 == 1) {
                    string = hMHeadsetSettingActivity.getString(R.string.noise_reduction_mode_adaptive);
                } else if (i2 == 2) {
                    string = hMHeadsetSettingActivity.getString(R.string.noise_reduction_mode_sport);
                } else if (i2 != 3) {
                    string = i2 != 4 ? "" : hMHeadsetSettingActivity.getString(R.string.noise_reduction_mode_indoor);
                } else {
                    string = hMHeadsetSettingActivity.getString(R.string.noise_reduction_mode_traffic);
                }
                listTile.setTips(string);
            }
            if (noiseControlType == null) {
                return;
            }
            HeadSettingViewModel headSettingViewModel2 = hMHeadsetSettingActivity.viewModel;
            Objects.requireNonNull(headSettingViewModel2);
            Objects.requireNonNull(headSettingViewModel2);
            NoiseReductionModeVo value2 = headSettingViewModel2.getNoiseControl().getValue();
            if (value2 != null && (noiseControl = value2.getNoiseControl()) != null) {
                noiseReductionMode = noiseControl.getNoiseReductionMode();
            }
            headSettingViewModel2.setHeadsetNoiseReduction(new NoiseControl(noiseControlType, noiseReductionMode));
        }
    }

    private final void u1(HrBroadcastType type) {
        int i;
        int i2 = WhenMappings.$EnumSwitchMapping$4[type.ordinal()];
        if (i2 == 1) {
            i = R.string.headset_hr_broadcast_type_close;
        } else if (i2 == 2) {
            i = R.string.headset_hr_broadcast_type_auto;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.headset_hr_broadcast_type_open;
        }
        final String[] stringArray = getResources().getStringArray(R.array.headset_hr_broadcast_type);
        int length = stringArray.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i3 = -1;
                break;
            } else if (Intrinsics.areEqual(stringArray[i3], getString(i))) {
                break;
            } else {
                i3++;
            }
        }
        int i4 = i3 != -1 ? i3 : 0;
        CustomAlertDialogFragment.Companion companion = CustomAlertDialogFragment.INSTANCE;
        int i5 = R.string.headset_hr_broadcast;
        companion.newInstance(companion.createDialogParams(getString(i5), true, new AlertDialogFragment.ChoiceItems().setItemChoice(i4).setItemsSummary(R.array.headset_hr_broadcast_summary).setArrowIcon(R.drawable.red_arrow).setItems(R.array.headset_hr_broadcast_type), new DialogInterface.OnClickListener() { // from class: rx2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i6) {
                HMHeadsetSettingActivity.v1(stringArray, this, dialogInterface, i6);
            }
        }), getString(i5), getString(R.string.headset_hr_broadcast_open_warn)).show(getSupportFragmentManager(), r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(HMHeadsetSettingActivity hMHeadsetSettingActivity, View view) {
        NoiseControl noiseControl;
        HeadSettingViewModel headSettingViewModel = hMHeadsetSettingActivity.viewModel;
        Objects.requireNonNull(headSettingViewModel);
        NoiseReductionModeVo value = headSettingViewModel.getNoiseControl().getValue();
        NoiseReductionMode noiseReductionMode = null;
        if (value != null && (noiseControl = value.getNoiseControl()) != null) {
            noiseReductionMode = noiseControl.getNoiseReductionMode();
        }
        if (noiseReductionMode == null) {
            noiseReductionMode = NoiseReductionMode.ADAPTIVE;
        }
        hMHeadsetSettingActivity.y1(noiseReductionMode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v1(String[] strArr, final HMHeadsetSettingActivity hMHeadsetSettingActivity, DialogInterface dialogInterface, int i) {
        String str = strArr[i];
        int i2 = R.id.item_headset_settings_hr_broadcast;
        ListTile listTile = (ListTile) hMHeadsetSettingActivity.findViewById(i2);
        if (listTile != null) {
            listTile.setTips(str);
        }
        HrBroadcastType hrBroadcastTypeH0 = hMHeadsetSettingActivity.h0(str);
        HeadSettingViewModel headSettingViewModel = hMHeadsetSettingActivity.viewModel;
        Objects.requireNonNull(headSettingViewModel);
        headSettingViewModel.setHrBroadcast(hrBroadcastTypeH0);
        if (hrBroadcastTypeH0 != HrBroadcastType.CLOSE) {
            ((ListTile) hMHeadsetSettingActivity.findViewById(i2)).postDelayed(new Runnable() { // from class: ly2
                @Override // java.lang.Runnable
                public final void run() {
                    HMHeadsetSettingActivity.w1(this.a);
                }
            }, 200L);
        }
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(HMHeadsetSettingActivity hMHeadsetSettingActivity, View view) {
        hMHeadsetSettingActivity.g0().navigation2Sky(hMHeadsetSettingActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w1(HMHeadsetSettingActivity hMHeadsetSettingActivity) {
        Lifecycle lifecycle;
        if (hMHeadsetSettingActivity.hrAlertDialogFragment == null) {
            hMHeadsetSettingActivity.hrAlertDialogFragment = new AlertDialogFragment.Builder(hMHeadsetSettingActivity).setCancelable(false).setMessage(hMHeadsetSettingActivity.getString(R.string.headset_hr_open_hint)).setNeutralButton(R.string.gotit, new DialogInterface.OnClickListener() { // from class: cy2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    HMHeadsetSettingActivity.x1(dialogInterface, i);
                }
            }).create();
        }
        AlertDialogFragment alertDialogFragment = hMHeadsetSettingActivity.hrAlertDialogFragment;
        if (alertDialogFragment != null && (lifecycle = alertDialogFragment.getLifecycle()) != null) {
            lifecycle.addObserver(hMHeadsetSettingActivity.hrLifecycleObserver);
        }
        AlertDialogFragment alertDialogFragment2 = hMHeadsetSettingActivity.hrAlertDialogFragment;
        if (alertDialogFragment2 == null) {
            return;
        }
        alertDialogFragment2.show(hMHeadsetSettingActivity.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x1(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y0(HMHeadsetSettingActivity hMHeadsetSettingActivity, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            HeadSettingViewModel headSettingViewModel = hMHeadsetSettingActivity.viewModel;
            Objects.requireNonNull(headSettingViewModel);
            headSettingViewModel.setSmartPlay(z);
        }
    }

    private final void y1(NoiseReductionMode noiseReductionMode) {
        String string;
        int i = WhenMappings.$EnumSwitchMapping$1[noiseReductionMode.ordinal()];
        if (i == 1) {
            string = getString(R.string.noise_reduction_mode_adaptive);
        } else if (i == 2) {
            string = getString(R.string.noise_reduction_mode_sport);
        } else if (i != 3) {
            string = i != 4 ? "" : getString(R.string.noise_reduction_mode_indoor);
        } else {
            string = getString(R.string.noise_reduction_mode_traffic);
        }
        final String[] stringArray = getResources().getStringArray(R.array.noise_reduction_mode_list);
        int length = stringArray.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            } else if (Intrinsics.areEqual(stringArray[i2], string)) {
                break;
            } else {
                i2++;
            }
        }
        new AlertDialogFragment.Builder(this).setTitle(R.string.noise_reduction_mode).setCancelable(true).setSingleChoiceItems(new AlertDialogFragment.ChoiceItems().setItemChoice(i2 != -1 ? i2 : 0).setItemsSummary(R.array.noise_reduction_mode_summary_list).setArrowIcon(R.drawable.red_arrow).setItems(R.array.noise_reduction_mode_list), new DialogInterface.OnClickListener() { // from class: gx2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                HMHeadsetSettingActivity.z1(stringArray, this, dialogInterface, i3);
            }
        }).show(getSupportFragmentManager(), r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z0(HMHeadsetSettingActivity hMHeadsetSettingActivity, View view) {
        HeadSettingViewModel headSettingViewModel = hMHeadsetSettingActivity.viewModel;
        Objects.requireNonNull(headSettingViewModel);
        headSettingViewModel.getRebootCount(hMHeadsetSettingActivity.new b());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z1(String[] strArr, HMHeadsetSettingActivity hMHeadsetSettingActivity, DialogInterface dialogInterface, int i) {
        String str = strArr[i];
        ((ListTile) hMHeadsetSettingActivity.findViewById(R.id.item_headset_settings_noise_reduction)).setTips(str);
        HeadSettingViewModel headSettingViewModel = hMHeadsetSettingActivity.viewModel;
        Objects.requireNonNull(headSettingViewModel);
        headSettingViewModel.setHeadsetNoiseReduction(new NoiseControl(NoiseControlType.NOISE_REDUCTION, hMHeadsetSettingActivity.e0(str)));
        dialogInterface.dismiss();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(@Nullable MotionEvent ev) {
        if (this.isLimitOperate) {
            return true;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponentAdapter.DefaultImpls.getKoin(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == 1 && resultCode == -1) {
            finish();
            return;
        }
        if (requestCode == 15 && resultCode == -1) {
            boolean booleanExtra = data == null ? false : data.getBooleanExtra(HeadsetHearingHealthActivity.EXTRA_HEARING_SWITCH_STATUS, false);
            HeadSettingViewModel headSettingViewModel = this.viewModel;
            Objects.requireNonNull(headSettingViewModel);
            HeadSettingViewModel.updateLiveDataCache$default(headSettingViewModel, Boolean.valueOf(booleanExtra), null, 2, null);
            HeadSettingViewModel headSettingViewModel2 = this.viewModel;
            Objects.requireNonNull(headSettingViewModel2);
            headSettingViewModel2.enableReportHeadsetInfo(false, c.a);
        } else if (requestCode == 10 && resultCode == -1) {
            if (data != null) {
                Intent intent = this.deviceSource == HMDeviceSource.OTHER_HAYDN ? data : null;
                if (intent != null) {
                    ((ListTile) findViewById(R.id.item_headset_settings_equalizer)).setTips(BoltEqActivity.INSTANCE.getEqNameRes(Integer.valueOf(intent.getIntExtra(BoltEqActivity.RESULT_EQ_VALUE, 0)).intValue()));
                }
            }
        } else if (requestCode == 16 && resultCode == -1) {
            boolean booleanExtra2 = data != null ? data.getBooleanExtra(CervicalProtectionActivity.RESULT_CERVICAL_SWITCH, false) : false;
            HeadSettingViewModel headSettingViewModel3 = this.viewModel;
            Objects.requireNonNull(headSettingViewModel3);
            HeadSettingViewModel.updateLiveDataCache$default(headSettingViewModel3, null, Boolean.valueOf(booleanExtra2), 1, null);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        U0();
        super.onCreate(savedInstanceState);
        if (k0(savedInstanceState)) {
            finish();
            return;
        }
        setContentView(R.layout.activity_headset_setting);
        m1();
        A0();
        initViews();
        l0();
        EventBus.getDefault().register(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    public final void onEvent(@NotNull HMLFEvent event) {
        if (event.getLfType() == LfType.NOISE_REDUCTION_CHANGES) {
            HeadSettingViewModel headSettingViewModel = this.viewModel;
            Objects.requireNonNull(headSettingViewModel);
            headSettingViewModel.getHeadsetNoiseReduction();
            HMLog.debug(r, new d(event));
        }
    }

    public final void onEventMainThread(@NotNull EventFwCheckResult result) {
        if (!this.isCheckByUser) {
            if (result.isSuccess) {
                c0();
                return;
            }
            return;
        }
        this.isCheckByUser = false;
        HeadSettingViewModel headSettingViewModel = this.viewModel;
        Objects.requireNonNull(headSettingViewModel);
        headSettingViewModel.cancelChecking();
        j0(this);
        if (result.isSuccess && i0()) {
            A1();
        } else {
            IconToast.showSuccess(this, R.string.fw_uptodate);
        }
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        super.onSaveInstanceState(outState);
        String str = this.address;
        Objects.requireNonNull(str);
        outState.putString(s, str);
    }

    public final void onEventMainThread(@NotNull HMDeviceBatteryEvent event) {
        if (event.getDeviceType() == HMDeviceType.HEADSET && e1()) {
            HeadSettingViewModel headSettingViewModel = this.viewModel;
            Objects.requireNonNull(headSettingViewModel);
            headSettingViewModel.loadBatteryInfo(e1());
        }
    }

    public final void onEventMainThread(@NotNull HeadsetDevice.HeadsetDeviceState state) {
        if (e1()) {
            ((ListTile) findViewById(R.id.item_fw_version)).setTips(f0().getBoundDeviceFirmwareVersion(this.deviceType));
            HeadSettingViewModel headSettingViewModel = this.viewModel;
            Objects.requireNonNull(headSettingViewModel);
            headSettingViewModel.loadBatteryInfo(e1());
        }
    }
}
