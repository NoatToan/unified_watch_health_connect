package com.xiaomi.fitness.electronic.scale;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.miui.circulate.device.api.Column;
import com.xiaomi.eco.api.EcoApiCallManager;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.configwifi.WifiPBApi;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt;
import com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import com.xiaomi.fitness.electronic.scale.MainActivity;
import com.xiaomi.fitness.electronic.scale.config.EcoDeviceConfigFactory;
import com.xiaomi.fitness.electronic.scale.config.main.BaseDeviceConfig;
import com.xiaomi.fitness.electronic.scale.config.main.DeviceConfig;
import com.xiaomi.fitness.electronic.scale.event.ScaleEventBusIds;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleActivityFinishHelper;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleActivityFinishHelperExtKt;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelper;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelperExtKt;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import com.xiaomi.fitness.electronic.scale.export.sp.ElectronicScalePreference;
import com.xiaomi.fitness.electronic.scale.request.OTARequest;
import com.xiaomi.fitness.electronic.scale.util.EcoDataHandlerHelper;
import com.xiaomi.fitness.electronic.scale.util.ScalePageUtil;
import com.xiaomi.fitness.electronic.scale.util.ScaleUtil;
import com.xiaomi.fitness.electronic.scale.widget.WeightUnitChoiceDialog;
import com.xiaomi.fitness.feedback.export.UploadFileManager;
import com.xiaomi.fitness.feedback.export.UploadFileManagerExtKt;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.health.sleep.rhythm.ui.SleepRhythmMonitorGuideActivity;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import defpackage.a68;
import defpackage.av1;
import defpackage.av6;
import defpackage.cz7;
import defpackage.f4b;
import defpackage.fz7;
import defpackage.gui;
import defpackage.gz7;
import defpackage.hbk;
import defpackage.jz7;
import defpackage.kb;
import defpackage.ld8;
import defpackage.lni;
import defpackage.qw7;
import defpackage.t48;
import defpackage.u7r;
import defpackage.uno;
import defpackage.vj0;
import defpackage.vw7;
import defpackage.wc0;
import defpackage.ww7;
import defpackage.yaa;
import defpackage.zzi;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Route(path = ElectronicScaleManagerExtKt.ELECTRONIC_SCALE_MAIN)
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u008e\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002\u008e\u0001B\b¢\u0006\u0005\b\u008d\u0001\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u000f\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0007J\u000f\u0010\u0012\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0012\u0010\u0007J\u000f\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0007J\u000f\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0007J\u000f\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0007J\u000f\u0010\u0016\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0007J\u000f\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0007J\u000f\u0010\u0018\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0007J\u000f\u0010\u0019\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\u0007J\u0017\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001f\u0010\u0007J\u000f\u0010 \u001a\u00020\u0005H\u0002¢\u0006\u0004\b \u0010\u0007J\u000f\u0010!\u001a\u00020\u0005H\u0002¢\u0006\u0004\b!\u0010\u0007J\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0005H\u0002¢\u0006\u0004\b%\u0010\u0007J\u000f\u0010&\u001a\u00020\u0005H\u0002¢\u0006\u0004\b&\u0010\u0007J\u0010\u0010'\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0005H\u0002¢\u0006\u0004\b)\u0010\u0007J\u000f\u0010*\u001a\u00020\u0005H\u0002¢\u0006\u0004\b*\u0010\u0007J\u000f\u0010+\u001a\u00020\u0005H\u0002¢\u0006\u0004\b+\u0010\u0007J\u000f\u0010,\u001a\u00020\u0005H\u0002¢\u0006\u0004\b,\u0010\u0007J\u000f\u0010-\u001a\u00020\u0005H\u0002¢\u0006\u0004\b-\u0010\u0007J\u000f\u0010.\u001a\u00020\u0005H\u0002¢\u0006\u0004\b.\u0010\u0007J\u0017\u00101\u001a\u00020\u00052\u0006\u00100\u001a\u00020/H\u0007¢\u0006\u0004\b1\u00102J\u0019\u00105\u001a\u00020\u00052\b\u00104\u001a\u0004\u0018\u000103H\u0014¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\u00052\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J'\u0010>\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\b2\u0006\u0010<\u001a\u00020\b2\u0006\u0010=\u001a\u000203H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0005H\u0014¢\u0006\u0004\b@\u0010\u0007J\u000f\u0010A\u001a\u00020\u0005H\u0014¢\u0006\u0004\bA\u0010\u0007J\u000f\u0010B\u001a\u00020\u0005H\u0014¢\u0006\u0004\bB\u0010\u0007J\u0015\u0010E\u001a\u00020\"2\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010HR\u0016\u0010K\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010P\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010R\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010T\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010HR\u0016\u0010U\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010SR\u0018\u0010W\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Z\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R$\u0010\\\u001a\u0004\u0018\u00010M8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010O\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010a\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010S\u001a\u0004\bb\u0010$\"\u0004\bc\u0010dR$\u0010e\u001a\u0004\u0018\u00010M8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010O\u001a\u0004\bf\u0010^\"\u0004\bg\u0010`R\"\u0010h\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010\u001dR\u0014\u0010n\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010p\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010iR\u0016\u0010q\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010SR\u0016\u0010r\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010SR\"\u0010s\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010S\u001a\u0004\bs\u0010$\"\u0004\bt\u0010dR\u0018\u0010v\u001a\u0004\u0018\u00010u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0018\u0010y\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0018\u0010|\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0015\u0010\u007f\u001a\u00020~8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R3\u0010\u0083\u0001\u001a\f\u0012\u0005\u0012\u00030\u0082\u0001\u0018\u00010\u0081\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0016\u0010\u008a\u0001\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010\nR\u0016\u0010\u008c\u0001\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010\n¨\u0006\u008f\u0001"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/MainActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/electronic/scale/MainViewModel;", "Lvj0;", "Lyaa;", "", "updateSomeEntranceVisibility", "()V", "", "getVisibilityVisitorWeight", "()I", "getVisibilityDeviceShared", "getVisibilityDeviceUpdate", "getVisibilityWifiSetting", "getVisibilityToBeClaimed", "getVisibilityByOwnerState", "getVisibilityDataReport", "initView", "setData", "updateLogoAndTitle", "loadDevice", "loadDeviceModel", "initDeviceModel", "requestRecordResult", "syncScaleData", "getDeviceVersion", "", "millis", "getBatteryTimber", "(J)V", "startTimer", "stopTimer", "getBattery", "checkOTA", "", "isDeviceOwner", "()Z", "onUnbind", "checkHasWeightRecord", "checkMainUserWeight", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerReceivers", "unRegisterReceivers", "isUpdateSuccess", "showOTAFinishDialog", "checkConnected", "showConnectFailedDialog", "Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnEcoPaketEvent;", "event", "onEcoPacket", "(Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnEcoPaketEvent;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "data", "onFragmentResult", "(IILandroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_PAUSE, LifecycleConstantKt.ON_DESTROY, "Landroid/content/Context;", "context", "isApkInDebug", "(Landroid/content/Context;)Z", "mBatteryRetryTime", "I", "mLoadDeviceModelRetryTime", "Lcom/xiaomi/fitness/electronic/scale/config/main/BaseDeviceConfig;", "deviceConfig", "Lcom/xiaomi/fitness/electronic/scale/config/main/BaseDeviceConfig;", "", "sdkVer", "Ljava/lang/String;", "softwareVer", "Ljava/lang/Integer;", "everShowOTADialog", "Z", Column.BATTERY, "isUpdatedSucc", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "mDeviceModel", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "Lcom/xiaomi/fitness/electronic/scale/widget/WeightUnitChoiceDialog;", "mWeightUnitDialog", "Lcom/xiaomi/fitness/electronic/scale/widget/WeightUnitChoiceDialog;", "mDeviceDid", "getMDeviceDid", "()Ljava/lang/String;", "setMDeviceDid", "(Ljava/lang/String;)V", "mFromBind", "getMFromBind", "setMFromBind", "(Z)V", "mMac", "getMMac", "setMMac", "mLastWeightTime", "J", "getMLastWeightTime", "()J", "setMLastWeightTime", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "startTime", "isShowConnectedFailedDialog", "hasShowConnectedFailedDialog", "isInBackground", "setInBackground", "Ljava/util/Timer;", "timer", "Ljava/util/Timer;", "Ljava/util/TimerTask;", "timerTask", "Ljava/util/TimerTask;", "Lcom/xiaomi/fitness/eco/device/manager/export/OnEcoDeviceStatusListener;", "mDeviceStatusListener", "Lcom/xiaomi/fitness/eco/device/manager/export/OnEcoDeviceStatusListener;", "Landroid/content/BroadcastReceiver;", "bluetoothMonitorReceiver", "Landroid/content/BroadcastReceiver;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "dialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "getDialog", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "setDialog", "(Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;)V", "getLayoutId", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/xiaomi/fitness/electronic/scale/MainActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1012:1\n1#2:1013\n*E\n"})
public final class MainActivity extends Hilt_MainActivity<MainViewModel, vj0> implements yaa {
    public static final int BATTERY_RETRY_TIME = 3;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int LOAD_DEVICE_MODEL_RETRY_TIME = 5;
    public static final int REQ_WEIGHT_UNIT = 10;

    @NotNull
    public static final String TAG = "MainActivity";
    private static boolean isConnectedSuccess;
    private static boolean isConnecting;
    private static boolean isSync;
    private BaseDeviceConfig deviceConfig;

    @Nullable
    private CommonDialog<DialogParams> dialog;
    private boolean everShowOTADialog;
    private volatile boolean hasShowConnectedFailedDialog;
    private volatile boolean isShowConnectedFailedDialog;
    private volatile boolean isUpdatedSucc;
    private int mBatteryRetryTime;

    @Nullable
    private String mDeviceDid;

    @Nullable
    private EcoDeviceModel mDeviceModel;
    private boolean mFromBind;
    private long mLastWeightTime;
    private int mLoadDeviceModelRetryTime;

    @Nullable
    private String mMac;

    @Nullable
    private WeightUnitChoiceDialog mWeightUnitDialog;

    @Nullable
    private String sdkVer;

    @Nullable
    private Integer softwareVer;

    @Nullable
    private Timer timer;

    @Nullable
    private TimerTask timerTask;
    private int battery = -1;

    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper());
    private long startTime = -1;
    private boolean isInBackground = true;

    @Nullable
    private OnEcoDeviceStatusListener mDeviceStatusListener = new OnEcoDeviceStatusListener() { // from class: com.xiaomi.fitness.electronic.scale.MainActivity$mDeviceStatusListener$1
        @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
        public void onConnectFailure(String did, String mac, int errorCode, int retryTimes) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            Logger.e(MainActivity.TAG, "onConnectFailure did  " + did + ", errorCode  " + errorCode + " , retryTimes : " + retryTimes);
            if (Intrinsics.areEqual(this.this$0.getMDeviceDid(), did) || Intrinsics.areEqual(this.this$0.getMMac(), mac)) {
                if (errorCode == 2006 || errorCode == 2007) {
                    this.this$0.loadDevice();
                    return;
                }
                MainActivity.Companion companion = MainActivity.INSTANCE;
                companion.setConnectedSuccess(false);
                companion.setConnecting(false);
                MainActivity.access$getMBinding(this.this$0).C.setText(this.this$0.getString(zzi.K0));
            }
        }

        @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
        public void onConnectStart(String did, String mac) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            Logger.e(MainActivity.TAG, "onConnectStart did  " + did);
            if (Intrinsics.areEqual(this.this$0.getMDeviceDid(), did) || Intrinsics.areEqual(this.this$0.getMMac(), mac)) {
                this.this$0.mBatteryRetryTime = 0;
                MainActivity.INSTANCE.setConnecting(true);
                if (this.this$0.isShowConnectedFailedDialog) {
                    return;
                }
                MainActivity.access$getMBinding(this.this$0).C.setText(this.this$0.getString(zzi.N0));
            }
        }

        @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
        public void onConnectSuccess(String did, String mac) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            Logger.e(MainActivity.TAG, "onConnectSuccess did  " + did);
            if (Intrinsics.areEqual(this.this$0.getMDeviceDid(), did) || Intrinsics.areEqual(this.this$0.getMMac(), mac)) {
                this.this$0.mBatteryRetryTime = 0;
                MainActivity.access$getMBinding(this.this$0).C.setText(this.this$0.getString(zzi.L0));
                MainActivity.Companion companion = MainActivity.INSTANCE;
                if (!companion.isConnectedSuccess()) {
                    companion.setSync(false);
                    companion.setConnecting(false);
                    companion.setConnectedSuccess(true);
                }
                this.this$0.syncScaleData();
                CommonDialog<DialogParams> dialog = this.this$0.getDialog();
                if (dialog == null || !dialog.isShowing()) {
                    return;
                }
                CommonDialog<DialogParams> dialog2 = this.this$0.getDialog();
                Intrinsics.checkNotNull(dialog2);
                dialog2.dismiss();
            }
        }

        @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
        public void onDisconnect(String did, String mac) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            Logger.e(MainActivity.TAG, "onDisconnect did  " + did);
            if (Intrinsics.areEqual(this.this$0.getMDeviceDid(), did) || Intrinsics.areEqual(this.this$0.getMMac(), mac)) {
                MainActivity.Companion companion = MainActivity.INSTANCE;
                companion.setConnectedSuccess(false);
                companion.setConnecting(false);
                if (this.this$0.isShowConnectedFailedDialog) {
                    return;
                }
                MainActivity.access$getMBinding(this.this$0).C.setText(this.this$0.getString(zzi.T0));
            }
        }
    };

    @NotNull
    private final BroadcastReceiver bluetoothMonitorReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.electronic.scale.MainActivity$bluetoothMonitorReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            String action = intent.getAction();
            if (action != null && action.hashCode() == -1530327060 && action.equals("android.bluetooth.adapter.action.STATE_CHANGED") && intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0) == 12) {
                MainActivity.access$getMBinding(this.this$0).C.setText(this.this$0.getString(zzi.N0));
                EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE);
                String mDeviceDid = this.this$0.getMDeviceDid();
                Intrinsics.checkNotNull(mDeviceDid);
                ecoDeviceManagerExtKt.connectDevice(mDeviceDid);
            }
        }
    };

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u000e\u0010\u0011\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/MainActivity$Companion;", "", "<init>", "()V", "TAG", "", "REQ_WEIGHT_UNIT", "", "isSync", "", "()Z", "setSync", "(Z)V", "isConnectedSuccess", "setConnectedSuccess", "isConnecting", "setConnecting", "BATTERY_RETRY_TIME", "LOAD_DEVICE_MODEL_RETRY_TIME", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isConnectedSuccess() {
            return MainActivity.isConnectedSuccess;
        }

        public final boolean isConnecting() {
            return MainActivity.isConnecting;
        }

        public final boolean isSync() {
            return MainActivity.isSync;
        }

        public final void setConnectedSuccess(boolean z) {
            MainActivity.isConnectedSuccess = z;
        }

        public final void setConnecting(boolean z) {
            MainActivity.isConnecting = z;
        }

        public final void setSync(boolean z) {
            MainActivity.isSync = z;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.MainActivity$checkHasWeightRecord$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.MainActivity$checkHasWeightRecord$1", f = "MainActivity.kt", i = {}, l = {836}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MainActivity.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MainActivity mainActivity = MainActivity.this;
                this.label = 1;
                if (mainActivity.checkMainUserWeight(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.MainActivity$checkMainUserWeight$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.MainActivity$checkMainUserWeight$2", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WeightItem $recentWeightItem;
        int label;
        final /* synthetic */ MainActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(WeightItem weightItem, MainActivity mainActivity, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$recentWeightItem = weightItem;
            this.this$0 = mainActivity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(MainActivity mainActivity, List list) {
            List list2 = list;
            if (list2 == null || list2.isEmpty()) {
                MainActivity.access$getMBinding(mainActivity).V.setVisibility(0);
            } else {
                MainActivity.access$getMBinding(mainActivity).V.setVisibility(8);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$recentWeightItem, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WeightItem weightItem = this.$recentWeightItem;
            if (weightItem == null) {
                if (ElectronicScalePreference.getBoolean(ElectronicScalePreference.SCALE_RECORD_CLOSE_KEY + this.this$0.getMDeviceDid(), false)) {
                    MainActivity.access$getMBinding(this.this$0).V.setVisibility(8);
                } else {
                    MainViewModel mainViewModelAccess$getMViewModel = MainActivity.access$getMViewModel(this.this$0);
                    String mDeviceDid = this.this$0.getMDeviceDid();
                    Intrinsics.checkNotNull(mDeviceDid);
                    final MainActivity mainActivity = this.this$0;
                    mainViewModelAccess$getMViewModel.getLocalWeightRecord(mDeviceDid, new Function1() { // from class: com.xiaomi.fitness.electronic.scale.b
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj2) {
                            return MainActivity.AnonymousClass2.invokeSuspend$lambda$0(mainActivity, (List) obj2);
                        }
                    });
                }
            } else {
                try {
                    this.this$0.setMLastWeightTime(weightItem.getTime());
                    Logger.i(MainActivity.TAG, "checkMainUserWeight mLastWeightTime : " + this.this$0.getMLastWeightTime());
                } catch (Exception e) {
                    Logger.e(MainActivity.TAG, "json exception :" + e);
                }
                MainActivity.access$getMBinding(this.this$0).V.setVisibility(8);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.MainActivity$checkOTA$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0017J\"\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"com/xiaomi/fitness/electronic/scale/MainActivity$checkOTA$1", "Lcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;", "onSuccess", "", "did", "", "type", "", "result", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoSyncResult;", "onError", "code", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C23231 implements OnEcoSyncCallback {
        public C23231() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onError$lambda$1(MainActivity this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.checkOTA();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$0(MainActivity this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.checkOTA();
        }

        @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
        public void onError(String did, int type, int code) {
            OTALogExtKt.loge(MainActivity.TAG, "checkOTA getWifiByPb onError, did: " + did + " , type: " + type + ", code: " + code + " " + WifiPBApi.INSTANCE.toStrErrorCode(code));
            Handler handler = MainActivity.this.handler;
            final MainActivity mainActivity = MainActivity.this;
            handler.postDelayed(new Runnable() { // from class: w0f
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.C23231.onError$lambda$1(mainActivity);
                }
            }, VibrateModeProgressBar.sLongToLong);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
        @SuppressLint({"SetTextI18n"})
        public void onSuccess(String did, int type, EcoSyncResult result) {
            u7r packet;
            cz7 cz7VarP;
            OTALogExtKt.logi(MainActivity.TAG, "checkOTA getWifiByPb, onSuccess, result" + f4b.c(result));
            jz7 jz7VarT = (result == null || (packet = result.getPacket()) == null || (cz7VarP = packet.p()) == null) ? null : cz7VarP.t();
            boolean z = false;
            boolean z2 = jz7VarT != null && WifiStatusExtKt.isConfigured(jz7VarT);
            if (jz7VarT != null && WifiStatusExtKt.isConfiguredSuccess(jz7VarT)) {
                z = true;
            }
            if (z2 && !z) {
                Handler handler = MainActivity.this.handler;
                final MainActivity mainActivity = MainActivity.this;
                handler.postDelayed(new Runnable() { // from class: x0f
                    @Override // java.lang.Runnable
                    public final void run() {
                        MainActivity.C23231.onSuccess$lambda$0(mainActivity);
                    }
                }, VibrateModeProgressBar.sLongToLong);
            } else {
                if (MainActivity.this.everShowOTADialog) {
                    return;
                }
                MainActivity.this.everShowOTADialog = true;
                OTARequest.Companion companion = OTARequest.INSTANCE;
                MainActivity mainActivity2 = MainActivity.this;
                EcoDeviceModel ecoDeviceModel = mainActivity2.mDeviceModel;
                String did2 = ecoDeviceModel != null ? ecoDeviceModel.getDid() : null;
                Intrinsics.checkNotNull(did2);
                int i = MainActivity.this.battery;
                String deviceVersion = t48.c().f34293a;
                Intrinsics.checkNotNullExpressionValue(deviceVersion, "deviceVersion");
                companion.checkOTAInfo(mainActivity2, did2, i, deviceVersion);
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.MainActivity$getBattery$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0017J\"\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"com/xiaomi/fitness/electronic/scale/MainActivity$getBattery$1", "Lcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;", "onSuccess", "", "did", "", "type", "", "result", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoSyncResult;", "onError", "code", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C23241 implements OnEcoSyncCallback {
        public C23241() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onError$lambda$1(MainActivity this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.getBattery();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onError$lambda$2(MainActivity this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            MainActivity.access$getMBinding(this$0).C.setText(this$0.getString(zzi.T0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$0(MainActivity this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            MainActivity.access$getMBinding(this$0).C.setText(this$0.getString(zzi.L0));
        }

        @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
        public void onError(String did, int type, int code) {
            int i = MainActivity.this.mBatteryRetryTime;
            Companion companion = MainActivity.INSTANCE;
            Logger.e(MainActivity.TAG, "getDeviceBattery onOnError did : " + did + " , type : " + type + " , code : " + code + ", retryTime : " + i + ", isConnecting : " + companion.isConnecting());
            if (companion.isConnecting()) {
                return;
            }
            MainActivity.this.stopTimer();
            if (MainActivity.this.mBatteryRetryTime >= 3) {
                Handler handler = MainActivity.this.handler;
                final MainActivity mainActivity = MainActivity.this;
                handler.post(new Runnable() { // from class: z0f
                    @Override // java.lang.Runnable
                    public final void run() {
                        MainActivity.C23241.onError$lambda$2(mainActivity);
                    }
                });
            } else {
                MainActivity.this.mBatteryRetryTime++;
                Handler handler2 = MainActivity.this.handler;
                final MainActivity mainActivity2 = MainActivity.this;
                handler2.postDelayed(new Runnable() { // from class: y0f
                    @Override // java.lang.Runnable
                    public final void run() {
                        MainActivity.C23241.onError$lambda$1(mainActivity2);
                    }
                }, VibrateModeProgressBar.sLongToLong);
            }
        }

        @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
        @SuppressLint({"SetTextI18n"})
        public void onSuccess(String did, int type, EcoSyncResult result) {
            u7r packet;
            cz7 cz7VarP;
            fz7 fz7VarQ;
            MainActivity.this.mBatteryRetryTime = 0;
            Integer numValueOf = null;
            Logger.i(MainActivity.TAG, "getDeviceBattery success  did : " + did + " , type : " + type + " , packet : " + (result != null ? result.getPacket() : null));
            MainActivity mainActivity = MainActivity.this;
            if (result != null && (packet = result.getPacket()) != null && (cz7VarP = packet.p()) != null && (fz7VarQ = cz7VarP.q()) != null) {
                numValueOf = Integer.valueOf(fz7VarQ.c);
            }
            Intrinsics.checkNotNull(numValueOf);
            mainActivity.battery = numValueOf.intValue();
            Handler handler = MainActivity.this.handler;
            final MainActivity mainActivity2 = MainActivity.this;
            handler.post(new Runnable() { // from class: a1f
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.C23241.onSuccess$lambda$0(mainActivity2);
                }
            });
            ld8.c().l(new ScaleEventBusIds.OnBatteryChangeEvent(MainActivity.this.battery));
            MainActivity.this.stopTimer();
            MainActivity.this.getBatteryTimber(SleepRhythmMonitorGuideActivity.INDICATOR_DELAY_DURATION);
            Logger.i("checkOta battery getDeviceBattery", new Object[0]);
            MainActivity.this.checkOTA();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.MainActivity$getDeviceVersion$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\"\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"com/xiaomi/fitness/electronic/scale/MainActivity$getDeviceVersion$1", "Lcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;", "onSuccess", "", "did", "", "type", "", "result", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoSyncResult;", "onError", "code", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C23251 implements OnEcoSyncCallback {
        public C23251() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onError$lambda$2(MainActivity this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.getDeviceVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$0(MainActivity this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.getDeviceVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$1(String str, MainActivity this$0, Integer num) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            t48.c().d(str);
            Logger.i("checkOta getDeviceVersion version : " + t48.c().f34293a, new Object[0]);
            this$0.checkOTA();
            if (this$0.isApkInDebug(this$0)) {
                MainActivity.access$getMBinding(this$0).I.setVisibility(0);
                TextView textView = MainActivity.access$getMBinding(this$0).I;
                Intrinsics.checkNotNull(num);
                textView.setText("固件版本号:" + str + "." + Integer.toHexString(num.intValue()));
            }
        }

        @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
        public void onError(String did, int type, int code) {
            Logger.e(MainActivity.TAG, "getDeviceVersion onOnError  did : " + did + " , type : " + type + " , code : " + code);
            Handler handler = MainActivity.this.handler;
            final MainActivity mainActivity = MainActivity.this;
            handler.postDelayed(new Runnable() { // from class: b1f
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.C23251.onError$lambda$2(mainActivity);
                }
            }, VibrateModeProgressBar.sLongToLong);
        }

        @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
        public void onSuccess(String did, int type, EcoSyncResult result) {
            u7r packet;
            cz7 cz7VarP;
            gz7 gz7VarR;
            u7r packet2;
            cz7 cz7VarP2;
            gz7 gz7VarR2;
            u7r packet3;
            cz7 cz7VarP3;
            gz7 gz7VarR3;
            final Integer numValueOf = null;
            Logger.i(MainActivity.TAG, "getDeviceVersion success  did : " + did + " , type : " + type + " , packet : " + (result != null ? result.getPacket() : null));
            MainActivity.this.sdkVer = (result == null || (packet3 = result.getPacket()) == null || (cz7VarP3 = packet3.p()) == null || (gz7VarR3 = cz7VarP3.r()) == null) ? null : gz7VarR3.e;
            String str = MainActivity.this.sdkVer;
            if (str == null || str.length() == 0) {
                Logger.i("getDeviceVersion sdkVer isEmpty", new Object[0]);
                Handler handler = MainActivity.this.handler;
                final MainActivity mainActivity = MainActivity.this;
                handler.postDelayed(new Runnable() { // from class: c1f
                    @Override // java.lang.Runnable
                    public final void run() {
                        MainActivity.C23251.onSuccess$lambda$0(mainActivity);
                    }
                }, VibrateModeProgressBar.sLongToLong);
                return;
            }
            MainActivity.this.softwareVer = (result == null || (packet2 = result.getPacket()) == null || (cz7VarP2 = packet2.p()) == null || (gz7VarR2 = cz7VarP2.r()) == null) ? null : Integer.valueOf(gz7VarR2.c);
            if (result != null && (packet = result.getPacket()) != null && (cz7VarP = packet.p()) != null && (gz7VarR = cz7VarP.r()) != null) {
                numValueOf = Integer.valueOf(gz7VarR.d);
            }
            String str2 = MainActivity.this.sdkVer;
            Integer num = MainActivity.this.softwareVer;
            Intrinsics.checkNotNull(num);
            final String strA = a68.a(str2, num.intValue());
            Handler handler2 = MainActivity.this.handler;
            final MainActivity mainActivity2 = MainActivity.this;
            handler2.post(new Runnable() { // from class: d1f
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.C23251.onSuccess$lambda$1(strA, mainActivity2, numValueOf);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.MainActivity$loadDeviceModel$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/electronic/scale/MainActivity$loadDeviceModel$1", "Lhbk$a;", "", "onSuccess", "()V", "", "code", "", "msg", "onFail", "(ILjava/lang/String;)V", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class BinderC23261 extends hbk.a {
        public BinderC23261() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onFail$lambda$0(MainActivity this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.loadDeviceModel();
        }

        @Override // defpackage.hbk
        public void onFail(int code, String msg) {
            Logger.e("getEcoListError code : " + code + " , msg : " + msg, new Object[0]);
            Handler handler = MainActivity.this.handler;
            final MainActivity mainActivity = MainActivity.this;
            handler.postDelayed(new Runnable() { // from class: e1f
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.BinderC23261.onFail$lambda$0(mainActivity);
                }
            }, VibrateModeProgressBar.sLongToLong);
        }

        @Override // defpackage.hbk
        public void onSuccess() {
            AnyExtKt.main$default(null, new MainActivity$loadDeviceModel$1$onSuccess$1(MainActivity.this, null), 1, null);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.MainActivity$syncScaleData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0017J\"\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"com/xiaomi/fitness/electronic/scale/MainActivity$syncScaleData$1", "Lcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;", "onSuccess", "", "did", "", "type", "", "result", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoSyncResult;", "onError", "code", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C23321 implements OnEcoSyncCallback {
        public C23321() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$0(MainActivity this$0, EcoSyncResult ecoSyncResult) {
            u7r packet;
            ww7 ww7VarT;
            qw7 qw7VarO;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            MainViewModel mainViewModelAccess$getMViewModel = MainActivity.access$getMViewModel(this$0);
            Integer numValueOf = (ecoSyncResult == null || (packet = ecoSyncResult.getPacket()) == null || (ww7VarT = packet.t()) == null || (qw7VarO = ww7VarT.o()) == null) ? null : Integer.valueOf(qw7VarO.c);
            Intrinsics.checkNotNull(numValueOf);
            mainViewModelAccess$getMViewModel.setMUnit(numValueOf.intValue());
            MainActivity.access$getMViewModel(this$0).setWeightUnit(MainActivity.access$getMViewModel(this$0).getUnitString(MainActivity.access$getMViewModel(this$0).getMUnit()));
            MainActivity.access$getMBinding(this$0).N.setRemindText(MainActivity.access$getMViewModel(this$0).getWeightUnit());
            Logger.i(MainActivity.TAG, "getWeightUnit success  setRemindText : " + MainActivity.access$getMViewModel(this$0).getWeightUnit());
        }

        @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
        public void onError(String did, int type, int code) {
            Logger.e(MainActivity.TAG, "getWeightUnit onOnError  did : " + did + " , type : " + type + " , code : " + code);
        }

        @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
        @SuppressLint({"SetTextI18n"})
        public void onSuccess(String did, int type, final EcoSyncResult result) {
            Logger.i(MainActivity.TAG, "getWeightUnit success  did : " + did + " , type : " + type + " , packet : " + (result != null ? result.getPacket() : null));
            Handler handler = MainActivity.this.handler;
            final MainActivity mainActivity = MainActivity.this;
            handler.post(new Runnable() { // from class: g1f
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.C23321.onSuccess$lambda$0(mainActivity, result);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ vj0 access$getMBinding(MainActivity mainActivity) {
        return (vj0) mainActivity.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ MainViewModel access$getMViewModel(MainActivity mainActivity) {
        return (MainViewModel) mainActivity.getMViewModel();
    }

    private final void checkConnected() {
        EcoDeviceModel ecoDeviceModel;
        EcoDeviceModel ecoDeviceModel2 = this.mDeviceModel;
        Logger.i(TAG, "checkConnected isDeviceConnected : " + (ecoDeviceModel2 != null ? Boolean.valueOf(ecoDeviceModel2.getIsDeviceConnected()) : null));
        Logger.i(TAG, "checkConnected isShowConnectedFailedDialog : " + this.isShowConnectedFailedDialog);
        Logger.i(TAG, "checkConnected hasShowConnectedFailedDialog : " + this.hasShowConnectedFailedDialog);
        if (this.hasShowConnectedFailedDialog || (ecoDeviceModel = this.mDeviceModel) == null || ecoDeviceModel.getIsDeviceConnected() || this.isShowConnectedFailedDialog) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.startTime;
        Logger.i(TAG, "checkConnected disTime : " + jCurrentTimeMillis);
        if (jCurrentTimeMillis >= SleepRhythmMonitorGuideActivity.INDICATOR_DELAY_DURATION) {
            showConnectFailedDialog();
        } else {
            this.handler.postDelayed(new Runnable() { // from class: uze
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.checkConnected$lambda$21(this.f36317a);
                }
            }, 2100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkConnected$lambda$21(MainActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkConnected();
    }

    private final void checkHasWeightRecord() {
        Logger.i(TAG, "checkHasWeightRecord");
        ScopeExtKt.scopeNet(Dispatchers.getIO(), new AnonymousClass1(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object checkMainUserWeight(Continuation<? super Unit> continuation) {
        WeightItem weightItem = (WeightItem) FitnessDataGetter.DefaultImpls.getRecentOneData$default(FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE), "weight", 0L, null, 6, null);
        Logger.i(TAG, "checkMainUserWeight: " + weightItem);
        ScopeExtKt.scopeNet(Dispatchers.getMain(), new AnonymousClass2(weightItem, this, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkOTA() {
        String str;
        Logger.i("checkOta battery : " + this.battery + " , sdkVersion : " + this.sdkVer, new Object[0]);
        if (this.battery < 0 || !isDeviceOwner() || (str = this.sdkVer) == null || str.length() == 0 || this.isUpdatedSucc) {
            return;
        }
        WifiPBApi wifiPBApi = WifiPBApi.INSTANCE;
        String str2 = this.mDeviceDid;
        Intrinsics.checkNotNull(str2);
        wifiPBApi.getWifi(str2, new C23231());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getBattery() {
        Logger.i(TAG, "getBattery");
        ElectronicScaleCMDHelper electronicScaleCMDHelperExtKt = ElectronicScaleCMDHelperExtKt.getInstance(ElectronicScaleCMDHelper.INSTANCE);
        String str = this.mDeviceDid;
        Intrinsics.checkNotNull(str);
        electronicScaleCMDHelperExtKt.getDeviceBattery(str, new C23241());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getBatteryTimber(long millis) {
        startTimer(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void getDeviceVersion() {
        MainViewModel mainViewModel = (MainViewModel) getMViewModel();
        EcoDeviceModel ecoDeviceModel = this.mDeviceModel;
        Intrinsics.checkNotNull(ecoDeviceModel);
        mainViewModel.getDeviceVersion(ecoDeviceModel, new C23251());
    }

    private final int getVisibilityByOwnerState() {
        return isDeviceOwner() ? 0 : 8;
    }

    private final int getVisibilityDataReport() {
        BaseDeviceConfig baseDeviceConfig = this.deviceConfig;
        if (baseDeviceConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceConfig");
            baseDeviceConfig = null;
        }
        return baseDeviceConfig.getIsShowDataReport() ? 0 : 8;
    }

    private final int getVisibilityDeviceShared() {
        BaseDeviceConfig baseDeviceConfig = this.deviceConfig;
        if (baseDeviceConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceConfig");
            baseDeviceConfig = null;
        }
        if (baseDeviceConfig.getIsShowDeviceShared()) {
            return getVisibilityByOwnerState();
        }
        return 8;
    }

    private final int getVisibilityDeviceUpdate() {
        BaseDeviceConfig baseDeviceConfig = this.deviceConfig;
        if (baseDeviceConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceConfig");
            baseDeviceConfig = null;
        }
        if (baseDeviceConfig.getIsShowDeviceUpdate()) {
            return getVisibilityByOwnerState();
        }
        return 8;
    }

    private final int getVisibilityToBeClaimed() {
        BaseDeviceConfig baseDeviceConfig = this.deviceConfig;
        if (baseDeviceConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceConfig");
            baseDeviceConfig = null;
        }
        return baseDeviceConfig.getIsShowToBeClaim() ? 0 : 8;
    }

    private final int getVisibilityVisitorWeight() {
        BaseDeviceConfig baseDeviceConfig = this.deviceConfig;
        if (baseDeviceConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceConfig");
            baseDeviceConfig = null;
        }
        return !baseDeviceConfig.getIsShowVisitor() ? 8 : 0;
    }

    private final int getVisibilityWifiSetting() {
        BaseDeviceConfig baseDeviceConfig = this.deviceConfig;
        if (baseDeviceConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceConfig");
            baseDeviceConfig = null;
        }
        if (baseDeviceConfig.getIsShowWifiSetting()) {
            return getVisibilityByOwnerState();
        }
        return 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void initDeviceModel() {
        EcoDeviceInfo deviceInfo;
        EcoDeviceConfigFactory.Companion companion = EcoDeviceConfigFactory.INSTANCE;
        EcoDeviceModel ecoDeviceModel = this.mDeviceModel;
        String model = (ecoDeviceModel == null || (deviceInfo = ecoDeviceModel.getDeviceInfo()) == null) ? null : deviceInfo.getModel();
        Intrinsics.checkNotNull(model);
        this.deviceConfig = companion.newDeviceConfig(model);
        EcoDeviceModel ecoDeviceModel2 = this.mDeviceModel;
        if (ecoDeviceModel2 == null || !ecoDeviceModel2.getIsDeviceConnected()) {
            Logger.i(TAG, "setData connecting");
            ((vj0) getMBinding()).C.setText(getString(zzi.N0));
            EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE);
            String str = this.mDeviceDid;
            Intrinsics.checkNotNull(str);
            ecoDeviceManagerExtKt.connectDevice(str);
            this.startTime = System.currentTimeMillis();
            checkConnected();
        } else {
            Logger.i(TAG, "setData isDeviceConnected");
            isSync = false;
            ((vj0) getMBinding()).C.setText(getString(zzi.L0));
            syncScaleData();
        }
        requestRecordResult();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        setActionBarDisplayable(true);
        setActionBarExpandState(0);
        setActionBarResizeable(false);
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setBackgroundDrawable(ResourceExtKt.getResourceDrawable(this, lni.G));
        }
        ((vj0) getMBinding()).U.setOnClickListener(new View.OnClickListener() { // from class: hze
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.initView$lambda$0(this.f20621a, view);
            }
        });
        ((vj0) getMBinding()).Q.setOnClickListener(new View.OnClickListener() { // from class: p0f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.initView$lambda$1(this.f29870a, view);
            }
        });
        ((vj0) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: r0f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.initView$lambda$2(this.f32048a, view);
            }
        });
        ((vj0) getMBinding()).E.setOnClickListener(new View.OnClickListener() { // from class: t0f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.initView$lambda$3(this.f34168a, view);
            }
        });
        ((vj0) getMBinding()).L.setOnClickListener(new View.OnClickListener() { // from class: v0f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.initView$lambda$4(this.f36347a, view);
            }
        });
        ((vj0) getMBinding()).H.setOnClickListener(new View.OnClickListener() { // from class: jze
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.initView$lambda$5(this.f23262a, view);
            }
        });
        ((vj0) getMBinding()).N.setOnClickListener(new View.OnClickListener() { // from class: mze
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.initView$lambda$6(this.f27377a, view);
            }
        });
        ((vj0) getMBinding()).N.setRemindText(((MainViewModel) getMViewModel()).getWeightUnit());
        ((vj0) getMBinding()).P.setOnClickListener(new View.OnClickListener() { // from class: oze
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.initView$lambda$7(this.f29841a, view);
            }
        });
        ((vj0) getMBinding()).R.setOnClickListener(new View.OnClickListener() { // from class: qze
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.initView$lambda$8(this.f32025a, view);
            }
        });
        ((vj0) getMBinding()).G.setOnClickListener(new View.OnClickListener() { // from class: sze
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.initView$lambda$9(this.f34129a, view);
            }
        });
        ((vj0) getMBinding()).O.setOnClickListener(new View.OnClickListener() { // from class: zze
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.initView$lambda$10(this.f41827a, view);
            }
        });
        ((vj0) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: h0f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.initView$lambda$11(this.f19538a, view);
            }
        });
        ((vj0) getMBinding()).M.setOnClickListener(new View.OnClickListener() { // from class: j0f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.initView$lambda$12(this.f22293a, view);
            }
        });
        ((vj0) getMBinding()).T.setOnClickListener(new View.OnClickListener() { // from class: l0f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.initView$lambda$13(this.f24481a, view);
            }
        });
        ((vj0) getMBinding()).F.setOnClickListener(new View.OnClickListener() { // from class: n0f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.initView$lambda$14(this.f27402a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(MainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE);
        String str = this$0.mDeviceDid;
        Intrinsics.checkNotNull(str);
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) ecoDeviceManagerExtKt.getDeviceModel(str);
        if (ecoDeviceModel == null || !ecoDeviceModel.getIsDeviceConnected()) {
            ToastUtil.showShortToast(this$0.getResources().getString(zzi.F4));
            return;
        }
        Intent intent = new Intent(this$0, (Class<?>) WeightGuideActivity.class);
        intent.putExtra("did", this$0.mDeviceDid);
        this$0.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(MainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE);
        String str = this$0.mDeviceDid;
        Intrinsics.checkNotNull(str);
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) ecoDeviceManagerExtKt.getDeviceModel(str);
        if (ecoDeviceModel == null || !ecoDeviceModel.getIsDeviceConnected()) {
            ToastUtil.showShortToast(this$0.getResources().getString(zzi.F4));
            return;
        }
        Intent intent = new Intent(this$0, (Class<?>) WeightGuideActivity.class);
        intent.putExtra("did", this$0.mDeviceDid);
        this$0.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$10(MainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE);
        String str = this$0.mDeviceDid;
        Intrinsics.checkNotNull(str);
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) ecoDeviceManagerExtKt.getDeviceModel(str);
        if (ecoDeviceModel == null || !ecoDeviceModel.getIsDeviceConnected()) {
            ToastUtil.showShortToast(this$0.getResources().getString(zzi.F4));
            return;
        }
        if (!NetworkExtKt.isNetworkAvailable()) {
            ToastUtil.showShortToast(this$0.getResources().getString(zzi.g4));
            return;
        }
        kb kbVarC = kb.c();
        BaseDeviceConfig baseDeviceConfig = this$0.deviceConfig;
        if (baseDeviceConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceConfig");
            baseDeviceConfig = null;
        }
        kbVarC.a(baseDeviceConfig.getDeviceUpdatePath()).withString("did", this$0.mDeviceDid).withInt(ElectronicScaleManagerExtKt.PARAM_BATTERY, this$0.battery).navigation(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$11(MainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onUnbind();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$12(MainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        UploadFileManagerExtKt.getInstance(UploadFileManager.INSTANCE).launchFeedback(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initView$lambda$13(MainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((vj0) this$0.getMBinding()).V.setVisibility(8);
        ElectronicScalePreference.putBoolean(ElectronicScalePreference.SCALE_RECORD_CLOSE_KEY + this$0.mDeviceDid, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$14(MainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle bundle = new Bundle();
        long j = this$0.mLastWeightTime;
        if (j != 0) {
            bundle.putSerializable("local_date", TimeDateUtil.timestampToLocalDate(j));
        }
        this$0.startActivity(HealthPageExtKt.getInstance(IHealthPage.INSTANCE).getWeightPageIntent(bundle, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initView$lambda$2(MainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE);
        String str = this$0.mDeviceDid;
        Intrinsics.checkNotNull(str);
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) ecoDeviceManagerExtKt.getDeviceModel(str);
        if (ecoDeviceModel == null || !ecoDeviceModel.getIsDeviceConnected()) {
            ToastUtil.showShortToast(this$0.getResources().getString(zzi.F4));
            return;
        }
        kb kbVarC = kb.c();
        BaseDeviceConfig baseDeviceConfig = this$0.deviceConfig;
        if (baseDeviceConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceConfig");
            baseDeviceConfig = null;
        }
        kbVarC.a(baseDeviceConfig.getBabyWeightPath()).withString("did", this$0.mDeviceDid).withInt("unit", ((MainViewModel) this$0.getMViewModel()).getMUnit()).navigation(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3(MainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE);
        String str = this$0.mDeviceDid;
        Intrinsics.checkNotNull(str);
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) ecoDeviceManagerExtKt.getDeviceModel(str);
        if (ecoDeviceModel == null || !ecoDeviceModel.getIsDeviceConnected()) {
            ToastUtil.showShortToast(this$0.getResources().getString(zzi.F4));
            return;
        }
        Intent intent = new Intent(this$0, (Class<?>) BalanceWeightActivity.class);
        intent.putExtra("did", this$0.mDeviceDid);
        this$0.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$4(MainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) ClaimRecordsActivity.class);
        intent.putExtra("DEVICE_DID", this$0.mDeviceDid);
        this$0.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$5(MainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) DeviceShareActivity.class);
        intent.putExtra("DEVICE_DID", this$0.mDeviceDid);
        this$0.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initView$lambda$6(MainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE);
        String str = this$0.mDeviceDid;
        Intrinsics.checkNotNull(str);
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) ecoDeviceManagerExtKt.getDeviceModel(str);
        if (ecoDeviceModel != null) {
            int i = 1;
            if (ecoDeviceModel.getIsDeviceConnected()) {
                if (this$0.mWeightUnitDialog == null) {
                    WeightUnitChoiceDialog weightUnitChoiceDialogCreate = new WeightUnitChoiceDialog.a("weight_unit").setCustomLayoutId(gui.x0).setNegativeText(zzi.f41831b).setDialogTitle(zzi.n5).setCancelable(true).setCanceledOnTouchOutside(true).create();
                    this$0.mWeightUnitDialog = weightUnitChoiceDialogCreate;
                    if (weightUnitChoiceDialogCreate != null) {
                        weightUnitChoiceDialogCreate.G(((MainViewModel) this$0.getMViewModel()).getWeightUnitResString());
                    }
                    WeightUnitChoiceDialog weightUnitChoiceDialog = this$0.mWeightUnitDialog;
                    if (weightUnitChoiceDialog != null) {
                        weightUnitChoiceDialog.setRequestCode(10);
                    }
                }
                WeightUnitChoiceDialog weightUnitChoiceDialog2 = this$0.mWeightUnitDialog;
                if (weightUnitChoiceDialog2 != null) {
                    weightUnitChoiceDialog2.showIfNeed(this$0.getSupportFragmentManager());
                }
                String weightUnit = ((MainViewModel) this$0.getMViewModel()).getWeightUnit();
                if (!Intrinsics.areEqual(weightUnit, this$0.getString(zzi.X5))) {
                    i = Intrinsics.areEqual(weightUnit, this$0.getString(zzi.V5)) ? 2 : 0;
                }
                WeightUnitChoiceDialog weightUnitChoiceDialog3 = this$0.mWeightUnitDialog;
                if (weightUnitChoiceDialog3 != null) {
                    weightUnitChoiceDialog3.F(i);
                    return;
                }
                return;
            }
        }
        ToastUtil.showShortToast(this$0.getResources().getString(zzi.F4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$7(MainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE);
        String str = this$0.mDeviceDid;
        Intrinsics.checkNotNull(str);
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) ecoDeviceManagerExtKt.getDeviceModel(str);
        if (ecoDeviceModel == null || !ecoDeviceModel.getIsDeviceConnected()) {
            ToastUtil.showShortToast(this$0.getResources().getString(zzi.F4));
            return;
        }
        Intent intent = new Intent(this$0, (Class<?>) VisitorWeightActivity.class);
        intent.putExtra("did", this$0.mDeviceDid);
        this$0.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$8(MainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE);
        String str = this$0.mDeviceDid;
        Intrinsics.checkNotNull(str);
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) ecoDeviceManagerExtKt.getDeviceModel(str);
        if (ecoDeviceModel == null || !ecoDeviceModel.getIsDeviceConnected()) {
            ToastUtil.showShortToast(this$0.getResources().getString(zzi.F4));
            return;
        }
        BaseDeviceConfig baseDeviceConfig = this$0.deviceConfig;
        if (baseDeviceConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceConfig");
            baseDeviceConfig = null;
        }
        String str2 = this$0.mDeviceDid;
        Intrinsics.checkNotNull(str2);
        baseDeviceConfig.toWifiInfo(this$0, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$9(MainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE);
        String str = this$0.mDeviceDid;
        Intrinsics.checkNotNull(str);
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) ecoDeviceManagerExtKt.getDeviceModel(str);
        if (ecoDeviceModel == null || !ecoDeviceModel.getIsDeviceConnected()) {
            ToastUtil.showShortToast(this$0.getResources().getString(zzi.F4));
            return;
        }
        Intent intent = new Intent(this$0, (Class<?>) AboutDeviceActivity.class);
        intent.putExtra("did", this$0.mDeviceDid);
        this$0.startActivity(intent);
        ElectronicScaleActivityFinishHelperExtKt.getInstance(ElectronicScaleActivityFinishHelper.INSTANCE).add(this$0);
    }

    private final boolean isDeviceOwner() {
        EcoDeviceInfo deviceInfo;
        EcoDeviceModel ecoDeviceModel = this.mDeviceModel;
        Boolean boolValueOf = (ecoDeviceModel == null || (deviceInfo = ecoDeviceModel.getDeviceInfo()) == null) ? null : Boolean.valueOf(deviceInfo.isOwner());
        Intrinsics.checkNotNull(boolValueOf);
        return boolValueOf.booleanValue();
    }

    private final void isUpdateSuccess() {
        ScaleUtil scaleUtil = ScaleUtil.INSTANCE;
        String str = this.mDeviceDid;
        Intrinsics.checkNotNull(str);
        boolean zIsUpdateSuccess = scaleUtil.isUpdateSuccess(str, this.softwareVer);
        Package r2 = OTAActivity.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        String str2 = name + "." + OTAActivity.class.getSimpleName();
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        String name2 = currentActivity != null ? currentActivity.getClass().getName() : null;
        if (!zIsUpdateSuccess || Intrinsics.areEqual(name2, str2)) {
            return;
        }
        this.isUpdatedSucc = true;
        showOTAFinishDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadDevice() {
        EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE);
        String str = this.mDeviceDid;
        Intrinsics.checkNotNull(str);
        ecoDeviceManagerExtKt.disconnectDevice(str);
        EcoApiCallManager ecoApiCallManager = EcoApiCallManager.INSTANCE.get();
        String str2 = this.mDeviceDid;
        Intrinsics.checkNotNull(str2);
        ecoApiCallManager.destroyEcoCall(str2);
        loadDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void loadDeviceModel() {
        int i = this.mLoadDeviceModelRetryTime;
        if (i > 5) {
            ((vj0) getMBinding()).C.setText(getString(zzi.K0));
            return;
        }
        this.mLoadDeviceModelRetryTime = i + 1;
        ((vj0) getMBinding()).C.setText(getString(zzi.N0));
        EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).refreshEcoList(new BinderC23261());
    }

    private final void onUnbind() {
        FragmentManager supportFragmentManager;
        Object baseContext = getBaseContext();
        EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE);
        String str = this.mDeviceDid;
        Intrinsics.checkNotNull(str);
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) ecoDeviceManagerExtKt.getDeviceModel(str);
        if (ecoDeviceModel == null) {
            Logger.e(TAG, "onUnbindBtnClicked error:device is null");
            return;
        }
        CommonDialog commonDialogCreate = new CommonDialog.c("unbind").setDialogTitle(new DialogParams.DialogDescriptionString(zzi.m5, EcoDeviceModelExtKt.getName(ecoDeviceModel))).setDialogDescriptionString(new DialogParams.DialogDescriptionString(zzi.l5, EcoDeviceModelExtKt.getName(ecoDeviceModel))).setPositiveText(zzi.c).setNegativeText(zzi.f41831b).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.electronic.scale.MainActivity.onUnbind.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    BaseDeviceConfig baseDeviceConfig = MainActivity.this.deviceConfig;
                    if (baseDeviceConfig == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("deviceConfig");
                        baseDeviceConfig = null;
                    }
                    MainActivity mainActivity = MainActivity.this;
                    String mDeviceDid = mainActivity.getMDeviceDid();
                    Intrinsics.checkNotNull(mDeviceDid);
                    DeviceConfig.DefaultImpls.unbindDevice$default(baseDeviceConfig, mainActivity, mDeviceDid, null, 4, null);
                }
            }
        });
        if (baseContext instanceof FragmentActivity) {
            supportFragmentManager = ((FragmentActivity) baseContext).getSupportFragmentManager();
        } else if (baseContext instanceof Fragment) {
            supportFragmentManager = ((Fragment) baseContext).getParentFragmentManager();
        } else {
            Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
            supportFragmentManager = (currentActivity == null || !(currentActivity instanceof FragmentActivity)) ? null : ((FragmentActivity) currentActivity).getSupportFragmentManager();
        }
        if (supportFragmentManager != null) {
            commonDialogCreate.showIfNeed(supportFragmentManager);
        } else {
            Logger.e(TAG, "onUnbindBtnClicked error:FragmentManager is null");
        }
    }

    private final void registerReceivers() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        registerReceiver(this.bluetoothMonitorReceiver, intentFilter);
        ld8.c().p(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestRecordResult() {
        Logger.i(TAG, "requestRecordResult");
        String str = this.mDeviceDid;
        if (str != null) {
            MainViewModel.requestRecordResult$default((MainViewModel) getMViewModel(), Integer.parseInt(str), System.currentTimeMillis(), false, null, 12, null);
        }
    }

    @SuppressLint({"SetTextI18n"})
    private final void setData() {
        String model;
        this.mDeviceDid = getIntent().getStringExtra("did");
        this.mFromBind = getIntent().getBooleanExtra(ElectronicScaleManagerExtKt.PARAM_FROM_BIND, false);
        String stringExtra = getIntent().getStringExtra("mac");
        this.mMac = stringExtra;
        Logger.i(TAG, "device did : " + this.mDeviceDid + " , from bind " + this.mFromBind + " , mac : " + stringExtra);
        String str = this.mDeviceDid;
        if (str == null || TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = this.mDeviceDid;
        EcoDeviceModel ecoDeviceModel = str2 != null ? (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceModel(str2) : null;
        this.mDeviceModel = ecoDeviceModel;
        Logger.i(TAG, "device mDeviceModel : " + ecoDeviceModel);
        EcoDeviceModel ecoDeviceModel2 = this.mDeviceModel;
        if (ecoDeviceModel2 == null || (this.mFromBind && ecoDeviceModel2 != null && (model = EcoDeviceModelExtKt.getModel(ecoDeviceModel2)) != null && EcoDeviceModelExtKt.isEightScale(model))) {
            loadDevice();
        } else {
            initDeviceModel();
            updateLogoAndTitle();
            updateSomeEntranceVisibility();
        }
        OnEcoDeviceStatusListener onEcoDeviceStatusListener = this.mDeviceStatusListener;
        if (onEcoDeviceStatusListener != null) {
            EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).addDeviceStatusListener(onEcoDeviceStatusListener);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showConnectFailedDialog() {
        ((vj0) getMBinding()).C.setText(getString(zzi.K0));
        this.isShowConnectedFailedDialog = true;
        this.hasShowConnectedFailedDialog = true;
        EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE);
        String str = this.mDeviceDid;
        Intrinsics.checkNotNull(str);
        ecoDeviceManagerExtKt.disconnectDevice(str);
        EcoApiCallManager ecoApiCallManager = EcoApiCallManager.INSTANCE.get();
        String str2 = this.mDeviceDid;
        Intrinsics.checkNotNull(str2);
        ecoApiCallManager.destroyEcoCall(str2);
        if (this.dialog == null) {
            this.dialog = new CommonDialog.c("connected_failed").setDialogTitle(zzi.K0).setDialogDescription(zzi.M0).setNeutralText(zzi.E0).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.electronic.scale.MainActivity.showConnectFailedDialog.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -3) {
                        MainActivity.this.mLoadDeviceModelRetryTime = 0;
                        MainActivity.this.isShowConnectedFailedDialog = false;
                        MainActivity.this.loadDevice();
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                    }
                }
            });
        }
        CommonDialog<DialogParams> commonDialog = this.dialog;
        Intrinsics.checkNotNull(commonDialog);
        if (commonDialog.isShowing()) {
            return;
        }
        CommonDialog<DialogParams> commonDialog2 = this.dialog;
        Intrinsics.checkNotNull(commonDialog2);
        commonDialog2.show(getSupportFragmentManager(), "");
    }

    private final void showOTAFinishDialog() {
        new CommonDialog.c("otaFinishDialog").setDialogTitle(zzi.s4).setDialogDescription(zzi.t4).setNeutralText(zzi.n4).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.electronic.scale.MainActivity.showOTAFinishDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which != -3 || dialog == null) {
                    return;
                }
                dialog.dismiss();
            }
        }).show(getSupportFragmentManager(), "");
    }

    private final void startTimer(long millis) {
        if (this.timerTask == null) {
            this.timerTask = new TimerTask() { // from class: com.xiaomi.fitness.electronic.scale.MainActivity.startTimer.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    Logger.i(MainActivity.TAG, "YunMai轮循取电");
                    MainActivity.this.getBattery();
                }
            };
        }
        if (this.timer == null) {
            Timer timer = new Timer();
            this.timer = timer;
            timer.schedule(this.timerTask, millis);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopTimer() {
        TimerTask timerTask = this.timerTask;
        if (timerTask != null) {
            timerTask.cancel();
        }
        this.timerTask = null;
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = this.timer;
        if (timer2 != null) {
            timer2.purge();
        }
        this.timer = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void syncScaleData() {
        if (isSync) {
            return;
        }
        Logger.i(TAG, "syncScaleData start");
        isSync = true;
        MainViewModel mainViewModel = (MainViewModel) getMViewModel();
        String str = this.mDeviceDid;
        Intrinsics.checkNotNull(str);
        mainViewModel.getWeightUnit(str, new C23321());
        getDeviceVersion();
        stopTimer();
        getBattery();
        if (RegionPreference.INSTANCE.getDefaultSyncWeb()) {
            MainViewModel mainViewModel2 = (MainViewModel) getMViewModel();
            String str2 = this.mDeviceDid;
            Intrinsics.checkNotNull(str2);
            mainViewModel2.syncWeightRecord(str2);
        }
    }

    private final void unRegisterReceivers() {
        unregisterReceiver(this.bluetoothMonitorReceiver);
        ld8.c().r(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void updateLogoAndTitle() {
        EcoDeviceInfo deviceInfo;
        EcoDeviceInfo deviceInfo2;
        wc0 miuiActionBar = getMiuiActionBar();
        String model = null;
        if (miuiActionBar != null) {
            BaseDeviceConfig baseDeviceConfig = this.deviceConfig;
            if (baseDeviceConfig == null) {
                Intrinsics.throwUninitializedPropertyAccessException("deviceConfig");
                baseDeviceConfig = null;
            }
            EcoDeviceModel ecoDeviceModel = this.mDeviceModel;
            String model2 = (ecoDeviceModel == null || (deviceInfo2 = ecoDeviceModel.getDeviceInfo()) == null) ? null : deviceInfo2.getModel();
            Intrinsics.checkNotNull(model2);
            miuiActionBar.setTitle(getString(baseDeviceConfig.getMainTitle(model2)));
        }
        ImageView imageView = ((vj0) getMBinding()).S;
        BaseDeviceConfig baseDeviceConfig2 = this.deviceConfig;
        if (baseDeviceConfig2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceConfig");
            baseDeviceConfig2 = null;
        }
        EcoDeviceModel ecoDeviceModel2 = this.mDeviceModel;
        if (ecoDeviceModel2 != null && (deviceInfo = ecoDeviceModel2.getDeviceInfo()) != null) {
            model = deviceInfo.getModel();
        }
        Intrinsics.checkNotNull(model);
        imageView.setImageResource(baseDeviceConfig2.getMainIcon(model));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void updateSomeEntranceVisibility() {
        ((vj0) getMBinding()).X.setVisibility(getVisibilityByOwnerState());
        ((vj0) getMBinding()).N.setVisibility(getVisibilityByOwnerState());
        ((vj0) getMBinding()).H.setVisibility(getVisibilityDeviceShared());
        ((vj0) getMBinding()).O.setVisibility(getVisibilityDeviceUpdate());
        ((vj0) getMBinding()).R.setVisibility(getVisibilityWifiSetting());
        ((vj0) getMBinding()).P.setVisibility(getVisibilityVisitorWeight());
        ((vj0) getMBinding()).L.setVisibility(getVisibilityToBeClaimed());
        ((vj0) getMBinding()).F.setVisibility(getVisibilityDataReport());
    }

    @Nullable
    public final CommonDialog<DialogParams> getDialog() {
        return this.dialog;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return gui.j;
    }

    @Nullable
    public final String getMDeviceDid() {
        return this.mDeviceDid;
    }

    public final boolean getMFromBind() {
        return this.mFromBind;
    }

    public final long getMLastWeightTime() {
        return this.mLastWeightTime;
    }

    @Nullable
    public final String getMMac() {
        return this.mMac;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return av1.f3479a;
    }

    public final boolean isApkInDebug(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
            return (applicationInfo.flags & 2) != 0;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: isInBackground, reason: from getter */
    public final boolean getIsInBackground() {
        return this.isInBackground;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        setRequestedOrientation(UIUtils.INSTANCE.isTabletOrLandscape(this) ? -1 : 1);
        super.onConfigurationChanged(newConfig);
    }

    @Override // com.xiaomi.fitness.electronic.scale.Hilt_MainActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logger.i(TAG, "onCreate");
        initView();
        setData();
        registerReceivers();
    }

    @Override // com.xiaomi.fitness.electronic.scale.Hilt_MainActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        OnEcoDeviceStatusListener onEcoDeviceStatusListener = this.mDeviceStatusListener;
        if (onEcoDeviceStatusListener != null) {
            EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).removeDeviceStatusListener(onEcoDeviceStatusListener);
        }
        unRegisterReceivers();
        this.handler.removeCallbacksAndMessages(null);
        this.mDeviceStatusListener = null;
        isSync = false;
        stopTimer();
        t48.c().d("");
    }

    @uno(threadMode = ThreadMode.MAIN)
    public final void onEcoPacket(@NotNull ScaleEventBusIds.OnEcoPaketEvent event) {
        u7r packet;
        vw7 vw7VarW;
        vw7 vw7VarW2;
        vw7 vw7VarW3;
        vw7 vw7VarW4;
        vw7 vw7VarW5;
        Intrinsics.checkNotNullParameter(event, "event");
        Logger.i(TAG, "onEcoPacket");
        if (!Intrinsics.areEqual(this.mDeviceDid, event.getDid()) && !Intrinsics.areEqual(event.getDid(), "")) {
            Logger.i(TAG, "use scale error mDeviceDid : " + this.mDeviceDid + " , did : " + event.getDid());
            return;
        }
        if (this.isInBackground || (packet = event.getPacket()) == null || packet.f != 13) {
            return;
        }
        u7r packet2 = event.getPacket();
        Intrinsics.checkNotNull(packet2);
        ww7 ww7VarT = packet2.t();
        Integer numValueOf = null;
        Integer numValueOf2 = (ww7VarT == null || (vw7VarW5 = ww7VarT.w()) == null) ? null : Integer.valueOf(vw7VarW5.c);
        if (numValueOf2 == null || numValueOf2.intValue() <= 0 || this.isInBackground) {
            return;
        }
        ScalePageUtil scalePageUtil = ScalePageUtil.INSTANCE;
        if (scalePageUtil.getWEIGHT_ACTIVITY_IS_START()) {
            return;
        }
        scalePageUtil.setWEIGHT_ACTIVITY_IS_START(true);
        this.isInBackground = true;
        Bundle bundle = new Bundle();
        u7r packet3 = event.getPacket();
        Intrinsics.checkNotNull(packet3);
        ww7 ww7VarT2 = packet3.t();
        Integer numValueOf3 = (ww7VarT2 == null || (vw7VarW4 = ww7VarT2.w()) == null) ? null : Integer.valueOf(vw7VarW4.d);
        Intrinsics.checkNotNull(numValueOf3);
        bundle.putInt(ElectronicScaleManagerExtKt.PARAM_WEIGHT_BUNDLE_UNIT_KEY, numValueOf3.intValue());
        u7r packet4 = event.getPacket();
        Intrinsics.checkNotNull(packet4);
        ww7 ww7VarT3 = packet4.t();
        Integer numValueOf4 = (ww7VarT3 == null || (vw7VarW3 = ww7VarT3.w()) == null) ? null : Integer.valueOf(vw7VarW3.c);
        Intrinsics.checkNotNull(numValueOf4);
        bundle.putInt(ElectronicScaleManagerExtKt.PARAM_WEIGHT_BUNDLE_WEIGHT_KEY, numValueOf4.intValue());
        u7r packet5 = event.getPacket();
        Intrinsics.checkNotNull(packet5);
        ww7 ww7VarT4 = packet5.t();
        Integer numValueOf5 = (ww7VarT4 == null || (vw7VarW2 = ww7VarT4.w()) == null) ? null : Integer.valueOf(vw7VarW2.e);
        Intrinsics.checkNotNull(numValueOf5);
        bundle.putInt(ElectronicScaleManagerExtKt.PARAM_WEIGHT_BUNDLE_LOCK_KEY, numValueOf5.intValue());
        u7r packet6 = event.getPacket();
        Intrinsics.checkNotNull(packet6);
        ww7 ww7VarT5 = packet6.t();
        if (ww7VarT5 != null && (vw7VarW = ww7VarT5.w()) != null) {
            numValueOf = Integer.valueOf(vw7VarW.f);
        }
        Intrinsics.checkNotNull(numValueOf);
        bundle.putInt(ElectronicScaleManagerExtKt.PARAM_WEIGHT_BUNDLE_MATCH_NUM_KEY, numValueOf.intValue());
        bundle.putString(ElectronicScaleManagerExtKt.PARAM_WEIGHT_BUNDLE_DID_KEY, event.getDid());
        Logger.i("MainActivity startWeightActivity", new Object[0]);
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        ElectronicScaleManagerExtKt.launchToElectronicWeightActivity(applicationContext, bundle, event.getDid());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yaa
    public void onFragmentResult(int requestCode, int resultCode, @NotNull Bundle data) {
        int i;
        Intrinsics.checkNotNullParameter(data, "data");
        if (requestCode != 10 || (i = data.getInt("selected_option", -1)) == -1) {
            return;
        }
        ((MainViewModel) getMViewModel()).setUnitByIndex(i);
        ((MainViewModel) getMViewModel()).setWeightUnit(((MainViewModel) getMViewModel()).getUnitString(((MainViewModel) getMViewModel()).getMUnit()));
        Logger.i(TAG, "MainActivity setUnit option" + i + ",unit:" + ((MainViewModel) getMViewModel()).getWeightUnit());
        MainViewModel mainViewModel = (MainViewModel) getMViewModel();
        EcoDeviceModel ecoDeviceModel = this.mDeviceModel;
        Intrinsics.checkNotNull(ecoDeviceModel);
        mainViewModel.setWeightUnit(i, ecoDeviceModel, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.MainActivity.onFragmentResult.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
                Logger.e("setWeightUnit err" + code, new Object[0]);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did, int type, EcoSyncResult result) {
                Logger.i(MainActivity.TAG, "setWeightUnit success  package " + (result != null ? result.getPacket() : null));
            }
        });
        ((vj0) getMBinding()).N.setRemindText(((MainViewModel) getMViewModel()).getWeightUnit());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.isInBackground = true;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.isInBackground = false;
        this.isUpdatedSucc = false;
        checkHasWeightRecord();
        EcoDataHandlerHelper.INSTANCE.updateDataHandler();
    }

    public final void setDialog(@Nullable CommonDialog<DialogParams> commonDialog) {
        this.dialog = commonDialog;
    }

    public final void setInBackground(boolean z) {
        this.isInBackground = z;
    }

    public final void setMDeviceDid(@Nullable String str) {
        this.mDeviceDid = str;
    }

    public final void setMFromBind(boolean z) {
        this.mFromBind = z;
    }

    public final void setMLastWeightTime(long j) {
        this.mLastWeightTime = j;
    }

    public final void setMMac(@Nullable String str) {
        this.mMac = str;
    }
}
