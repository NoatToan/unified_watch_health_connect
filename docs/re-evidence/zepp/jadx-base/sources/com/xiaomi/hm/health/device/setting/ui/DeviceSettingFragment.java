package com.xiaomi.hm.health.device.setting.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModel;
import androidx.p010navigation.NavController;
import androidx.p010navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.service.UserInfoPolicyService;
import com.huami.account.service.proxy.KoinProxyKt;
import com.huami.account.utils.SingleLiveEvent;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.assistant.ui.fragment.UpdateFragmentStartDelegate;
import com.huami.assistant.ui.fragment.UpdateStartListener;
import com.huami.device.feature.health.device.HealthFunc;
import com.huami.device.feature.health.util.HrModeExtKt;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.assistant.schedule.SchedulePermission;
import com.xiaomi.hm.health.device.assistant.smart.SmartCardAction;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.feature.sync.SyncCenterManager;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeInfoActivity;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeManager;
import com.xiaomi.hm.health.device.realtimedata.IRealtimeData;
import com.xiaomi.hm.health.device.realtimedata.RealtimeDataVo;
import com.xiaomi.hm.health.device.setting.dial.DialFetchApi;
import com.xiaomi.hm.health.device.setting.dial.UnusedDialImpl;
import com.xiaomi.hm.health.device.setting.find.FindDevicePage;
import com.xiaomi.hm.health.device.setting.find.FindDeviceViewModel;
import com.xiaomi.hm.health.device.setting.find.IDialogPageProvider;
import com.xiaomi.hm.health.device.setting.find.IFindDevicePage;
import com.xiaomi.hm.health.device.setting.life.feature.inject.JsAppApi;
import com.xiaomi.hm.health.device.setting.life.feature.vo.JSAppStoreVo;
import com.xiaomi.hm.health.device.setting.pattern.action.OtherActionFactory;
import com.xiaomi.hm.health.device.setting.ui.DeviceSettingFragment;
import com.xiaomi.hm.health.device.setting.ui.event.HealthDetectClickedImpl;
import com.xiaomi.hm.health.device.setting.ui.event.NotificationAndReminderClickedImpl;
import com.xiaomi.hm.health.device.setting.ui.event.OperationTypeProvider;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.device.setting.ui.subview.AbstractDeviceFragment;
import com.xiaomi.hm.health.device.setting.ui.widget.DefaultBatteryLevelDisplayImpl;
import com.xiaomi.hm.health.device.setting.ui.widget.StatusChangeObserve;
import com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel;
import com.xiaomi.hm.health.device.setting.viewmodel.DeviceUpdateCheckerViewModel;
import com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel;
import com.xiaomi.hm.health.device.setting.vo.AppsItemVo;
import com.xiaomi.hm.health.device.setting.vo.BroadcastVo;
import com.xiaomi.hm.health.device.setting.vo.ConnectStatus;
import com.xiaomi.hm.health.device.setting.vo.DeviceConnectedVo;
import com.xiaomi.hm.health.device.setting.vo.DeviceUnlockScreenVo;
import com.xiaomi.hm.health.device.setting.vo.DisplayNameVo;
import com.xiaomi.hm.health.device.setting.vo.EsimVo;
import com.xiaomi.hm.health.device.setting.vo.FaqVo;
import com.xiaomi.hm.health.device.setting.vo.FindMiliVo;
import com.xiaomi.hm.health.device.setting.vo.HrDetectVo;
import com.xiaomi.hm.health.device.setting.vo.InstructionVo;
import com.xiaomi.hm.health.device.setting.vo.OfflineVoiceCmdVo;
import com.xiaomi.hm.health.device.setting.vo.ShowFindingVo;
import com.xiaomi.hm.health.device.setting.vo.ShowFrequentlyFindVo;
import com.xiaomi.hm.health.device.setting.vo.SpiteBindingVo;
import com.xiaomi.hm.health.device.setting.vo.SportHrBroadCastVo;
import com.xiaomi.hm.health.device.setting.vo.VersionItemVo;
import com.xiaomi.hm.health.device.setting.vo.VibrateSettingVo;
import com.xiaomi.hm.health.device.setting.vo.WatchAppItemVo;
import com.xiaomi.hm.health.device.setting.vo.WatchSettingVo;
import com.xiaomi.hm.health.device.view.EditDeviceDisplayNameDialog;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinManager;
import com.xiaomi.hm.health.devicex.manage.api.core.feature.DeviceSnService;
import com.xiaomi.hm.health.discovery.WebHelper;
import com.xiaomi.hm.health.utils.CincoAnalytics;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u0086\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0086\u0001B\t¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0003J\b\u0010\u0010\u001a\u00020\u0004H\u0002J\b\u0010\u0011\u001a\u00020\u0004H\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\f\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0002J\b\u0010\u0018\u001a\u00020\u0004H\u0002J\b\u0010\u0019\u001a\u00020\u0004H\u0002J\b\u0010\u001a\u001a\u00020\u0004H\u0002J\b\u0010\u001b\u001a\u00020\u0004H\u0002J\b\u0010\u001c\u001a\u00020\u0004H\u0002J\b\u0010\u001d\u001a\u00020\u0004H\u0002J\b\u0010\u001e\u001a\u00020\u0004H\u0002J\b\u0010\u001f\u001a\u00020\u0004H\u0002J\b\u0010 \u001a\u00020\u0004H\u0002J\b\u0010!\u001a\u00020\u0004H\u0002J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H\u0002J\b\u0010%\u001a\u00020\u0004H\u0002J\b\u0010&\u001a\u00020\u0004H\u0002J\b\u0010'\u001a\u00020\u0004H\u0002J\b\u0010(\u001a\u00020\u0004H\u0002J\b\u0010)\u001a\u00020\u0004H\u0002J\b\u0010*\u001a\u00020\u0004H\u0002J\b\u0010+\u001a\u00020\u0004H\u0002J\b\u0010,\u001a\u00020\u0004H\u0002J\b\u0010-\u001a\u00020\u0004H\u0002J\b\u0010.\u001a\u00020\u0004H\u0002J\b\u0010/\u001a\u00020\u0014H\u0002J$\u00107\u001a\u0002062\u0006\u00101\u001a\u0002002\b\u00103\u001a\u0004\u0018\u0001022\b\u00105\u001a\u0004\u0018\u000104H\u0016J\u001a\u00109\u001a\u00020\u00042\u0006\u00108\u001a\u0002062\b\u00105\u001a\u0004\u0018\u000104H\u0016J\b\u0010:\u001a\u00020\u0015H\u0016J\b\u0010;\u001a\u00020\u0004H\u0016R\u0016\u0010>\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001d\u0010H\u001a\u00020C8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001d\u0010M\u001a\u00020I8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010E\u001a\u0004\bK\u0010LR\u001d\u0010R\u001a\u00020N8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010E\u001a\u0004\bP\u0010QR\u001d\u0010W\u001a\u00020S8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010E\u001a\u0004\bU\u0010VR\u001d\u0010\\\u001a\u00020X8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010E\u001a\u0004\bZ\u0010[R\u001d\u0010a\u001a\u00020]8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010E\u001a\u0004\b_\u0010`R\u001d\u0010e\u001a\u00020b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010E\u001a\u0004\bc\u0010dR\u001d\u0010i\u001a\u00020f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010E\u001a\u0004\bg\u0010hR\u0016\u0010l\u001a\u00020j8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bZ\u0010kR\u0016\u0010m\u001a\u00020j8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bP\u0010kR\u0016\u0010n\u001a\u00020j8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010kR\u0016\u0010o\u001a\u00020j8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bc\u0010kR\u0016\u0010p\u001a\u00020j8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010kR\u0016\u0010s\u001a\u00020q8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b_\u0010rR\u001d\u0010w\u001a\u00020t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010E\u001a\u0004\bu\u0010vR\u0018\u0010z\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010yR\u0016\u0010}\u001a\u00020{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010|R'\u0010\u0082\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u007f\u0012\u0005\u0012\u00030\u0080\u0001\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b&\u0010\u0081\u0001R\u0017\u0010\u0083\u0001\u001a\u00020{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010|¨\u0006\u0087\u0001"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/DeviceSettingFragment;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/AbstractDeviceFragment;", "Lcom/xiaomi/hm/health/device/setting/ui/event/OperationTypeProvider;", "Lorg/koin/core/component/KoinComponent;", "", "o", "w0", "k0", "q0", "o0", "Lcom/xiaomi/hm/health/device/assistant/smart/SmartCardAction$Version;", "w", "c0", "i0", "J", "G", "j0", "b0", ExifInterface.LATITUDE_SOUTH, "Z", "", "", "y0", "e0", "W", "O", "H", "C", "L", "E", ExifInterface.GPS_DIRECTION_TRUE, "d0", "g0", "F", "Lcom/xiaomi/hm/health/device/setting/vo/VersionItemVo;", "version", "p0", "x0", "z", "B", "K", "Q", "R", "Y", "h0", "m0", "u0", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "loadOperatorType", "onResume", "g", "Ljava/lang/String;", "mAnalyticOperateType", "Lcom/xiaomi/hm/health/device/setting/ui/ViewHelper;", "h", "Lcom/xiaomi/hm/health/device/setting/ui/ViewHelper;", "viewHelper", "Lcom/xiaomi/hm/health/device/setting/dial/DialFetchApi;", "i", "Lkotlin/Lazy;", SOAP.XMLNS, "()Lcom/xiaomi/hm/health/device/setting/dial/DialFetchApi;", "fetchApi", "Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", com.loc.z.j, "u", "()Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "keeperProvider", "Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", hl.k, "r", "()Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "deviceXNavigator", "Lcom/huami/devicex/manager/DeviceManagerApi;", "l", com.google.android.exoplayer2.text.ttml.b.r, "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "m", DTransferConstants.SEARCH_KEY, "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilApi", "Lcom/xiaomi/hm/health/device/realtimedata/IRealtimeData;", GoogleApiAvailabilityLight.b, "v", "()Lcom/xiaomi/hm/health/device/realtimedata/IRealtimeData;", "realtimeData", "Lcom/xiaomi/hm/health/device/setting/life/feature/inject/JsAppApi;", "t", "()Lcom/xiaomi/hm/health/device/setting/life/feature/inject/JsAppApi;", "jsAppApi", "Lcom/xiaomi/hm/health/devicex/manage/api/core/feature/DeviceSnService;", "x", "()Lcom/xiaomi/hm/health/devicex/manage/api/core/feature/DeviceSnService;", "snService", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "ivSkin", "ivDial", "ivDeviceTransparent", "ivDefaultDevice", "ivDeviceShadow", "Lcom/xiaomi/hm/health/device/setting/ui/DeviceSettingItemView;", "Lcom/xiaomi/hm/health/device/setting/ui/DeviceSettingItemView;", "itemFindDevice", "Lcom/xiaomi/hm/health/device/setting/viewmodel/DeviceUpdateCheckerViewModel;", "y", "()Lcom/xiaomi/hm/health/device/setting/viewmodel/DeviceUpdateCheckerViewModel;", "updateCheckerViewModel", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "updateCheckingDialog", "", LogUtil.I, "newColor", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/xiaomi/hm/health/device/setting/vo/WatchAppItemVo;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "adapter", "clickTitleTimes", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceSettingFragment extends AbstractDeviceFragment implements OperationTypeProvider, KoinComponent {

    @NotNull
    private static final String B = "DeviceSettingFragment";

    @NotNull
    public static final String DEVICE_TYPE = "device_type";
    public static final int UNBIND_REQUEST_CODE = 0;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private int clickTitleTimes;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private String mAnalyticOperateType = StatEvent.DEVICE_BAND_OPERATE;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private ViewHelper viewHelper;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy fetchApi;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy keeperProvider;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceXNavigator;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilApi;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final Lazy realtimeData;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final Lazy jsAppApi;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final Lazy snService;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private AppCompatImageView ivSkin;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private AppCompatImageView ivDial;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private AppCompatImageView ivDeviceTransparent;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private AppCompatImageView ivDefaultDevice;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private AppCompatImageView ivDeviceShadow;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private DeviceSettingItemView itemFindDevice;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    private final Lazy updateCheckerViewModel;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog updateCheckingDialog;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private int newColor;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    private BaseQuickAdapter<WatchAppItemVo, BaseViewHolder> adapter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.DeviceSettingFragment$displayDial$1$1", f = "DeviceSettingFragment.kt", i = {}, l = {197}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMDeviceSource c;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.ui.DeviceSettingFragment$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0852a extends Lambda implements Function1<Boolean, Unit> {
            public final /* synthetic */ DeviceSettingFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0852a(DeviceSettingFragment deviceSettingFragment) {
                super(1);
                this.a = deviceSettingFragment;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                this.a.w0();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HMDeviceSource hMDeviceSource, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = hMDeviceSource;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceSettingFragment.this.new a(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AppCompatImageView appCompatImageView;
            AppCompatImageView appCompatImageView2;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    DialFetchApi dialFetchApiS = DeviceSettingFragment.this.s();
                    HMDeviceSource hMDeviceSource = this.c;
                    AppCompatImageView appCompatImageView3 = DeviceSettingFragment.this.ivSkin;
                    if (appCompatImageView3 == null || (appCompatImageView = DeviceSettingFragment.this.ivDial) == null || (appCompatImageView2 = DeviceSettingFragment.this.ivDeviceTransparent) == null) {
                        throw null;
                    }
                    C0852a c0852a = new C0852a(DeviceSettingFragment.this);
                    this.a = 1;
                    if (dialFetchApiS.displayDial(hMDeviceSource, appCompatImageView3, appCompatImageView, appCompatImageView2, c0852a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Throwable th) {
                HMLog.e(DeviceSettingFragment.B, "error of load dial", th);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a0 extends Lambda implements Function0<Unit> {
        public a0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            View view = DeviceSettingFragment.this.getView();
            View viewFindViewById = view == null ? null : view.findViewById(R.id.item_lab);
            DeviceFeatureViewModel deviceFeatureViewModel = DeviceSettingFragment.this.getDeviceFeatureViewModel();
            ExtKt.setVisible$default(viewFindViewById, deviceFeatureViewModel == null ? false : deviceFeatureViewModel.isSupportLab(), false, 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/parameter/ParametersHolder;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<ParametersHolder> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final ParametersHolder getA() {
            return ParametersHolderKt.parametersOf(Boolean.FALSE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b0 extends Lambda implements Function1<View, Unit> {
        public b0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            if (((UserInfoPolicyService) KoinProxyKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(UserInfoPolicyService.class), null, null)).interceptWithShowTip()) {
                return;
            }
            CincoAnalytics.cincoOperateAnalytics("Unbind");
            DeviceSettingFragment.this.r().startHMUnbindDeviceActivity(DeviceSettingFragment.this.requireActivity(), 0, 0);
            Analytics.recordEvent(new CountEventBuilder(DeviceSettingFragment.this.mAnalyticOperateType).setValue("Unbind"));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<View, Unit> {
            public final /* synthetic */ DeviceSettingFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DeviceSettingFragment deviceSettingFragment) {
                super(1);
                this.a = deviceSettingFragment;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull View view) {
                FragmentKt.findNavController(this.a).navigate(R.id.action_to_aboutDeviceFragment);
            }
        }

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            View view = DeviceSettingFragment.this.getView();
            ExtKt.smartClick$default(view == null ? null : view.findViewById(R.id.item_about), 0L, new a(DeviceSettingFragment.this), 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.DeviceSettingFragment$showDial$1$1", f = "DeviceSettingFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMBaseDevice c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(HMBaseDevice hMBaseDevice, Continuation<? super c0> continuation) {
            super(2, continuation);
            this.c = hMBaseDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceSettingFragment.this.new c0(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DialFetchApi dialFetchApiS = DeviceSettingFragment.this.s();
            HMDeviceSource mDeviceSource = this.c.getMDeviceSource();
            AppCompatImageView appCompatImageView = DeviceSettingFragment.this.ivSkin;
            Objects.requireNonNull(appCompatImageView);
            AppCompatImageView appCompatImageView2 = DeviceSettingFragment.this.ivDial;
            Objects.requireNonNull(appCompatImageView2);
            AppCompatImageView appCompatImageView3 = DeviceSettingFragment.this.ivDeviceTransparent;
            Objects.requireNonNull(appCompatImageView3);
            if (dialFetchApiS.showCache(mDeviceSource, appCompatImageView, appCompatImageView2, appCompatImageView3)) {
                AppCompatImageView appCompatImageView4 = DeviceSettingFragment.this.ivDefaultDevice;
                Objects.requireNonNull(appCompatImageView4);
                appCompatImageView4.setVisibility(8);
                AppCompatImageView appCompatImageView5 = DeviceSettingFragment.this.ivDeviceShadow;
                Objects.requireNonNull(appCompatImageView5);
                appCompatImageView5.setVisibility(0);
                AppCompatImageView appCompatImageView6 = DeviceSettingFragment.this.ivSkin;
                Objects.requireNonNull(appCompatImageView6);
                appCompatImageView6.setVisibility(0);
                AppCompatImageView appCompatImageView7 = DeviceSettingFragment.this.ivDial;
                Objects.requireNonNull(appCompatImageView7);
                appCompatImageView7.setVisibility(0);
            } else {
                AppCompatImageView appCompatImageView8 = DeviceSettingFragment.this.ivDefaultDevice;
                Objects.requireNonNull(appCompatImageView8);
                appCompatImageView8.setVisibility(0);
                AppCompatImageView appCompatImageView9 = DeviceSettingFragment.this.ivDeviceShadow;
                Objects.requireNonNull(appCompatImageView9);
                appCompatImageView9.setVisibility(8);
                AppCompatImageView appCompatImageView10 = DeviceSettingFragment.this.ivSkin;
                Objects.requireNonNull(appCompatImageView10);
                appCompatImageView10.setVisibility(8);
                AppCompatImageView appCompatImageView11 = DeviceSettingFragment.this.ivDial;
                Objects.requireNonNull(appCompatImageView11);
                appCompatImageView11.setVisibility(8);
                AppCompatImageView appCompatImageView12 = DeviceSettingFragment.this.ivDeviceTransparent;
                Objects.requireNonNull(appCompatImageView12);
                appCompatImageView12.setVisibility(8);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {
        public final /* synthetic */ DeviceSettingItemView b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Object a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj) {
                super(0);
                this.a = obj;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "error of action [" + ((WatchAppItemVo) this.a).getAction() + "]";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(DeviceSettingItemView deviceSettingItemView) {
            super(0);
            this.b = deviceSettingItemView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(DeviceSettingFragment deviceSettingFragment, BaseQuickAdapter baseQuickAdapter, View view, int i) {
            HMBaseDevice hMBaseDeviceFindDevice;
            Unit unit;
            Object item = baseQuickAdapter.getItem(i);
            if (item instanceof WatchAppItemVo) {
                FeatureViewModel featureViewModel = deviceSettingFragment.getFeatureViewModel();
                if ((featureViewModel == null || (hMBaseDeviceFindDevice = featureViewModel.findDevice()) == null || !hMBaseDeviceFindDevice.isConnected()) ? false : true) {
                    try {
                        Function1<NavController, Unit> action = ((WatchAppItemVo) item).getAction();
                        if (action == null) {
                            unit = null;
                        } else {
                            action.invoke(FragmentKt.findNavController(deviceSettingFragment));
                            unit = Unit.INSTANCE;
                        }
                        if (unit == null) {
                            new OtherActionFactory(deviceSettingFragment.requireContext(), deviceSettingFragment.getChildFragmentManager(), deviceSettingFragment).createAction(((WatchAppItemVo) item).getType()).action(FragmentKt.findNavController(deviceSettingFragment));
                        }
                    } catch (Throwable th) {
                        HMLog.error(DeviceSettingFragment.B, "001", th, new a(item));
                    }
                }
            }
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            DeviceSettingFragment deviceSettingFragment = DeviceSettingFragment.this;
            ViewHelper viewHelper = deviceSettingFragment.viewHelper;
            BaseQuickAdapter<WatchAppItemVo, BaseViewHolder> baseQuickAdapterUpdateAppSettingRecyclerView = null;
            if (viewHelper != null) {
                Context context = this.b.getContext();
                View view = DeviceSettingFragment.this.getView();
                baseQuickAdapterUpdateAppSettingRecyclerView = viewHelper.updateAppSettingRecyclerView(context, (RecyclerView) (view != null ? view.findViewById(R.id.rv_app_setting_items) : null));
            }
            deviceSettingFragment.adapter = baseQuickAdapterUpdateAppSettingRecyclerView;
            BaseQuickAdapter baseQuickAdapter = DeviceSettingFragment.this.adapter;
            if (baseQuickAdapter == null) {
                return;
            }
            final DeviceSettingFragment deviceSettingFragment2 = DeviceSettingFragment.this;
            baseQuickAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.xiaomi.hm.health.device.setting.ui.a
                @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
                public final void onItemClick(BaseQuickAdapter baseQuickAdapter2, View view2, int i) {
                    DeviceSettingFragment.d.b(deviceSettingFragment2, baseQuickAdapter2, view2, i);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/viewmodel/DeviceUpdateCheckerViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d0 extends Lambda implements Function0<DeviceUpdateCheckerViewModel> {
        public d0() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(DeviceSettingFragment deviceSettingFragment, DeviceUpdateCheckerViewModel.Result result) {
            deviceSettingFragment.z();
            if (Intrinsics.areEqual(result, DeviceUpdateCheckerViewModel.Result.Timeout.INSTANCE)) {
                IconToast.showSuccess(deviceSettingFragment.requireContext(), R.string.fw_uptodate);
                return;
            }
            if (Intrinsics.areEqual(result, DeviceUpdateCheckerViewModel.Result.Failed.INSTANCE)) {
                IconToast.showSuccess(deviceSettingFragment.requireContext(), R.string.fw_uptodate);
                return;
            }
            if (Intrinsics.areEqual(result, DeviceUpdateCheckerViewModel.Result.Success.INSTANCE)) {
                if (DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade()) {
                    HMFwOnlineUpgradeManager hMFwOnlineUpgradeManager = HMFwOnlineUpgradeManager.getInstance();
                    HMDeviceType hMDeviceType = HMDeviceType.MILI;
                    if (hMFwOnlineUpgradeManager.useOnline(hMDeviceType)) {
                        HMFwOnlineUpgradeManager.getInstance().enableFwUpgrade(true);
                        HMFwOnlineUpgradeManager.getInstance().checkFwUpgrade(deviceSettingFragment.requireContext(), hMDeviceType, false);
                        return;
                    }
                }
                HMFwUpgradeManager.getInstance().checkFwUpgrade(deviceSettingFragment.requireContext(), HMDeviceType.MILI, false);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DeviceUpdateCheckerViewModel getA() {
            ViewModel viewModel = DeviceSettingFragment.this.getViewModelProvider().get(DeviceUpdateCheckerViewModel.class);
            final DeviceSettingFragment deviceSettingFragment = DeviceSettingFragment.this;
            DeviceUpdateCheckerViewModel deviceUpdateCheckerViewModel = (DeviceUpdateCheckerViewModel) viewModel;
            deviceUpdateCheckerViewModel.getResultLiveData().observe(deviceSettingFragment, new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.j0
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    DeviceSettingFragment.d0.c(deviceSettingFragment, (DeviceUpdateCheckerViewModel.Result) obj);
                }
            });
            return deviceUpdateCheckerViewModel;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Unit> {
        public e() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(DeviceSettingFragment deviceSettingFragment, View view) {
            CincoAnalytics.cincoOperateAnalytics("Identity");
            deviceSettingFragment.r().startIdBroadcastActivity(deviceSettingFragment.requireContext());
            Analytics.recordEvent(new CountEventBuilder(deviceSettingFragment.mAnalyticOperateType).setValue("Identity"));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(DeviceSettingFragment deviceSettingFragment, BroadcastVo broadcastVo) {
            View view = deviceSettingFragment.getView();
            DeviceSettingItemView deviceSettingItemView = (DeviceSettingItemView) (view == null ? null : view.findViewById(R.id.item_bluetooth_broadcast));
            ExtKt.setVisible$default(deviceSettingItemView, broadcastVo.isSupport(), false, 2, null);
            deviceSettingItemView.setValue(deviceSettingFragment.getString(broadcastVo.isEnable() ? R.string.alert_enable : R.string.alert_disable));
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            View view = DeviceSettingFragment.this.getView();
            View viewFindViewById = view == null ? null : view.findViewById(R.id.item_bluetooth_broadcast);
            final DeviceSettingFragment deviceSettingFragment = DeviceSettingFragment.this;
            ((DeviceSettingItemView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.device.setting.ui.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DeviceSettingFragment.e.c(deviceSettingFragment, view2);
                }
            });
            DeviceFeatureViewModel deviceFeatureViewModel = DeviceSettingFragment.this.getDeviceFeatureViewModel();
            if (deviceFeatureViewModel == null) {
                return;
            }
            final DeviceSettingFragment deviceSettingFragment2 = DeviceSettingFragment.this;
            deviceFeatureViewModel.getBluetoothBroadcastSettingLiveData().observe(deviceSettingFragment2.getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.c
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    DeviceSettingFragment.e.e(deviceSettingFragment2, (BroadcastVo) obj);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ DeviceSettingFragment a;
            public final /* synthetic */ VersionItemVo b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DeviceSettingFragment deviceSettingFragment, VersionItemVo versionItemVo) {
                super(0);
                this.a = deviceSettingFragment;
                this.b = versionItemVo;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.p0(this.b);
            }
        }

        public f() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(final DeviceSettingFragment deviceSettingFragment, final VersionItemVo versionItemVo) {
            if (versionItemVo == null) {
                return;
            }
            if (!versionItemVo.getShowFwUpgrade()) {
                View view = deviceSettingFragment.getView();
                ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.item_check_update), false, false, 2, null);
                return;
            }
            View view2 = deviceSettingFragment.getView();
            ExtKt.setVisible$default(view2 == null ? null : view2.findViewById(R.id.item_check_update), true, false, 2, null);
            View view3 = deviceSettingFragment.getView();
            ((DeviceSettingItemView) (view3 == null ? null : view3.findViewById(R.id.item_check_update))).setRedDotVisible(Boolean.valueOf(versionItemVo.getShowRedDot()));
            View view4 = deviceSettingFragment.getView();
            ((DeviceSettingItemView) (view4 != null ? view4.findViewById(R.id.item_check_update) : null)).setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.device.setting.ui.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                    DeviceSettingFragment.f.e(deviceSettingFragment, versionItemVo, view5);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(DeviceSettingFragment deviceSettingFragment, VersionItemVo versionItemVo, View view) {
            HMBaseDevice hMBaseDeviceFindDevice;
            deviceSettingFragment.u().setClickedVersion(deviceSettingFragment.getContext(), HMDeviceType.MILI);
            View view2 = deviceSettingFragment.getView();
            ((DeviceSettingItemView) (view2 == null ? null : view2.findViewById(R.id.item_check_update))).setRedDotVisible(Boolean.FALSE);
            FeatureViewModel featureViewModel = deviceSettingFragment.getFeatureViewModel();
            if (featureViewModel == null || (hMBaseDeviceFindDevice = featureViewModel.findDevice()) == null) {
                return;
            }
            SyncCenterManager.INSTANCE.invokeWhenNotSync(hMBaseDeviceFindDevice, new a(deviceSettingFragment, versionItemVo));
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MutableLiveData<VersionItemVo> upgradeVoLiveData;
            FeatureViewModel featureViewModel = DeviceSettingFragment.this.getFeatureViewModel();
            if (featureViewModel == null || (upgradeVoLiveData = featureViewModel.getUpgradeVoLiveData()) == null) {
                return;
            }
            LifecycleOwner viewLifecycleOwner = DeviceSettingFragment.this.getViewLifecycleOwner();
            final DeviceSettingFragment deviceSettingFragment = DeviceSettingFragment.this;
            upgradeVoLiveData.observe(viewLifecycleOwner, new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.e
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    DeviceSettingFragment.f.c(deviceSettingFragment, (VersionItemVo) obj);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<Unit> {
        public g() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(DeviceSettingFragment deviceSettingFragment, ConnectStatus connectStatus) {
            if (connectStatus == ConnectStatus.CONNECTED) {
                deviceSettingFragment.o();
                FeatureViewModel featureViewModel = deviceSettingFragment.getFeatureViewModel();
                if (featureViewModel != null) {
                    featureViewModel.loadWatchSetting();
                }
                DeviceFeatureViewModel deviceFeatureViewModel = deviceSettingFragment.getDeviceFeatureViewModel();
                if (deviceFeatureViewModel != null) {
                    deviceFeatureViewModel.loadDeviceUnLockScreen();
                }
                DeviceFeatureViewModel deviceFeatureViewModel2 = deviceSettingFragment.getDeviceFeatureViewModel();
                if (deviceFeatureViewModel2 != null) {
                    deviceFeatureViewModel2.loadJsAppStoreSetting();
                }
                DeviceFeatureViewModel deviceFeatureViewModel3 = deviceSettingFragment.getDeviceFeatureViewModel();
                if (deviceFeatureViewModel3 == null) {
                    return;
                }
                deviceFeatureViewModel3.findSportHrBroadcastSetting();
            }
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            LiveData<ConnectStatus> displayDialLiveData;
            MutableLiveData<DeviceConnectedVo> syncStatusLiveData;
            g gVar = this;
            FeatureViewModel featureViewModel = DeviceSettingFragment.this.getFeatureViewModel();
            if (featureViewModel != null && (syncStatusLiveData = featureViewModel.getSyncStatusLiveData()) != null) {
                LifecycleOwner viewLifecycleOwner = DeviceSettingFragment.this.getViewLifecycleOwner();
                Context contextRequireContext = DeviceSettingFragment.this.requireContext();
                FragmentManager childFragmentManager = DeviceSettingFragment.this.getChildFragmentManager();
                FeatureViewModel featureViewModel2 = DeviceSettingFragment.this.getFeatureViewModel();
                DefaultBatteryLevelDisplayImpl defaultBatteryLevelDisplayImpl = new DefaultBatteryLevelDisplayImpl();
                ViewHelper viewHelper = DeviceSettingFragment.this.viewHelper;
                View view = DeviceSettingFragment.this.getView();
                TextView textView = (TextView) (view == null ? null : view.findViewById(R.id.tv_device_status));
                View view2 = DeviceSettingFragment.this.getView();
                TextView textView2 = (TextView) (view2 == null ? null : view2.findViewById(R.id.tv_battery_level));
                View view3 = DeviceSettingFragment.this.getView();
                TextView textView3 = (TextView) (view3 == null ? null : view3.findViewById(R.id.tv_percent));
                View view4 = DeviceSettingFragment.this.getView();
                TextView textView4 = (TextView) (view4 == null ? null : view4.findViewById(R.id.tv_charging));
                View view5 = DeviceSettingFragment.this.getView();
                TextView textView5 = (TextView) (view5 == null ? null : view5.findViewById(R.id.tv_last_charge));
                View view6 = DeviceSettingFragment.this.getView();
                TextView textView6 = (TextView) (view6 == null ? null : view6.findViewById(R.id.retry_connect_tv));
                View view7 = DeviceSettingFragment.this.getView();
                syncStatusLiveData.observe(viewLifecycleOwner, new StatusChangeObserve(contextRequireContext, childFragmentManager, featureViewModel2, defaultBatteryLevelDisplayImpl, viewHelper, textView, textView2, textView3, textView4, textView5, textView6, (AppCompatImageView) (view7 == null ? null : view7.findViewById(R.id.icon_state)), DeviceSettingFragment.this.getResources()));
                gVar = this;
            }
            FeatureViewModel featureViewModel3 = DeviceSettingFragment.this.getFeatureViewModel();
            if (featureViewModel3 == null || (displayDialLiveData = featureViewModel3.getDisplayDialLiveData()) == null) {
                return;
            }
            LifecycleOwner viewLifecycleOwner2 = DeviceSettingFragment.this.getViewLifecycleOwner();
            final DeviceSettingFragment deviceSettingFragment = DeviceSettingFragment.this;
            displayDialLiveData.observe(viewLifecycleOwner2, new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.f
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    DeviceSettingFragment.g.b(deviceSettingFragment, (ConnectStatus) obj);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<Unit> {
        public final /* synthetic */ DeviceSettingItemView a;
        public final /* synthetic */ DeviceSettingFragment b;
        public final /* synthetic */ AppsItemVo c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(DeviceSettingItemView deviceSettingItemView, DeviceSettingFragment deviceSettingFragment, AppsItemVo appsItemVo) {
            super(0);
            this.a = deviceSettingItemView;
            this.b = deviceSettingFragment;
            this.c = appsItemVo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(DeviceSettingFragment deviceSettingFragment, AppsItemVo appsItemVo, View view) {
            CincoAnalytics.cincoOperateAnalytics("Display");
            Analytics.recordEvent(new CountEventBuilder(deviceSettingFragment.mAnalyticOperateType).setValue("Display"));
            if (ConfigHelperKt.hasFeature(Feature.SUPPORT_APP_SORT_NEW)) {
                FragmentKt.findNavController(deviceSettingFragment).navigate(R.id.action_to_appSortFragment);
            } else {
                deviceSettingFragment.r().startHMAppSortActivity(deviceSettingFragment.requireActivity(), appsItemVo.getDeviceSource());
            }
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            DeviceSettingItemView deviceSettingItemView = this.a;
            final DeviceSettingFragment deviceSettingFragment = this.b;
            final AppsItemVo appsItemVo = this.c;
            deviceSettingItemView.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.device.setting.ui.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DeviceSettingFragment.h.b(deviceSettingFragment, appsItemVo, view);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<Unit> {
        public i() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(final DeviceSettingFragment deviceSettingFragment, View view, int i) {
            Device deviceUpdateDisplayName;
            AlertDialogFragment alertDialogFragmentNewInstance;
            FeatureViewModel featureViewModel = deviceSettingFragment.getFeatureViewModel();
            if (featureViewModel == null || (deviceUpdateDisplayName = featureViewModel.updateDisplayName()) == null || (alertDialogFragmentNewInstance = EditDeviceDisplayNameDialog.newInstance(deviceUpdateDisplayName, deviceSettingFragment.requireContext(), new EditDeviceDisplayNameDialog.IDisplayNameListener() { // from class: com.xiaomi.hm.health.device.setting.ui.j
                @Override // com.xiaomi.hm.health.device.view.EditDeviceDisplayNameDialog.IDisplayNameListener
                public final void onDisplayNameChanged(String str) {
                    DeviceSettingFragment.i.f(deviceSettingFragment, str);
                }
            })) == null) {
                return;
            }
            alertDialogFragmentNewInstance.show(deviceSettingFragment.getChildFragmentManager());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(DeviceSettingFragment deviceSettingFragment, String str) {
            if (str == null || !(!kotlin.text.m.isBlank(StringsKt__StringsKt.trim(str).toString()))) {
                View view = deviceSettingFragment.getView();
                ((RainbowTitleBar) (view == null ? null : view.findViewById(R.id.toolbar))).setSubtitle((CharSequence) null);
            } else {
                View view2 = deviceSettingFragment.getView();
                ((RainbowTitleBar) (view2 != null ? view2.findViewById(R.id.toolbar) : null)).setSubtitle(str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(DeviceSettingFragment deviceSettingFragment, DisplayNameVo displayNameVo) {
            View view = deviceSettingFragment.getView();
            ((RainbowTitleBar) (view == null ? null : view.findViewById(R.id.toolbar))).setTitle(displayNameVo.getProductName());
            View view2 = deviceSettingFragment.getView();
            ((RainbowTitleBar) (view2 != null ? view2.findViewById(R.id.toolbar) : null)).setSubtitle(displayNameVo.getCustomName());
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            LiveData<DisplayNameVo> liveDataLoadProductName;
            View view = DeviceSettingFragment.this.getView();
            View viewFindViewById = view == null ? null : view.findViewById(R.id.toolbar);
            final DeviceSettingFragment deviceSettingFragment = DeviceSettingFragment.this;
            ((RainbowTitleBar) viewFindViewById).setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: com.xiaomi.hm.health.device.setting.ui.i
                @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
                public final void onClick(View view2, int i) {
                    DeviceSettingFragment.i.e(deviceSettingFragment, view2, i);
                }
            });
            FeatureViewModel featureViewModel = DeviceSettingFragment.this.getFeatureViewModel();
            if (featureViewModel == null || (liveDataLoadProductName = featureViewModel.loadProductName()) == null) {
                return;
            }
            LifecycleOwner viewLifecycleOwner = DeviceSettingFragment.this.getViewLifecycleOwner();
            final DeviceSettingFragment deviceSettingFragment2 = DeviceSettingFragment.this;
            liveDataLoadProductName.observe(viewLifecycleOwner, new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.h
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    DeviceSettingFragment.i.g(deviceSettingFragment2, (DisplayNameVo) obj);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<View, Unit> {
            public final /* synthetic */ FaqVo a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(FaqVo faqVo) {
                super(1);
                this.a = faqVo;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull View view) {
                WebHelper.launch(this.a.getUrl());
            }
        }

        public j() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(DeviceSettingFragment deviceSettingFragment, FaqVo faqVo) {
            View view = deviceSettingFragment.getView();
            ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.item_faq), faqVo.isSupport(), false, 2, null);
            if (faqVo.getUrl() != null) {
                View view2 = deviceSettingFragment.getView();
                ExtKt.smartClick$default(view2 != null ? view2.findViewById(R.id.item_faq) : null, 0L, new a(faqVo), 1, null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MutableLiveData<FaqVo> faqLiveData;
            FeatureViewModel featureViewModel = DeviceSettingFragment.this.getFeatureViewModel();
            if (featureViewModel == null || (faqLiveData = featureViewModel.getFaqLiveData()) == null) {
                return;
            }
            LifecycleOwner viewLifecycleOwner = DeviceSettingFragment.this.getViewLifecycleOwner();
            final DeviceSettingFragment deviceSettingFragment = DeviceSettingFragment.this;
            faqLiveData.observe(viewLifecycleOwner, new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.k
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    DeviceSettingFragment.j.b(deviceSettingFragment, (FaqVo) obj);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<Unit> {
        public k() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(DeviceSettingFragment deviceSettingFragment, View view) {
            FindDeviceViewModel findDeviceViewModel = deviceSettingFragment.getFindDeviceViewModel();
            if (findDeviceViewModel == null) {
                return;
            }
            findDeviceViewModel.sendFindMiliNotification();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(DeviceSettingFragment deviceSettingFragment, ShowFindingVo showFindingVo) {
            DeviceSettingFragment.M(deviceSettingFragment, showFindingVo.getShow(), showFindingVo.isWatch());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(DeviceSettingFragment deviceSettingFragment, ShowFrequentlyFindVo showFrequentlyFindVo) {
            DeviceSettingFragment.N(deviceSettingFragment, showFrequentlyFindVo.isWatch());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(DeviceSettingFragment deviceSettingFragment, FindMiliVo findMiliVo) {
            DeviceSettingItemView deviceSettingItemView = deviceSettingFragment.itemFindDevice;
            Objects.requireNonNull(deviceSettingItemView);
            ExtKt.setVisible$default(deviceSettingItemView, findMiliVo.isSupport(), false, 2, null);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MutableLiveData<FindMiliVo> findMiliSettingLiveData;
            SingleLiveEvent<ShowFrequentlyFindVo> showFrequentlyFindAlertLiveData;
            SingleLiveEvent<ShowFindingVo> showFindingTipLiveData;
            DeviceSettingItemView deviceSettingItemView = DeviceSettingFragment.this.itemFindDevice;
            Objects.requireNonNull(deviceSettingItemView);
            final DeviceSettingFragment deviceSettingFragment = DeviceSettingFragment.this;
            deviceSettingItemView.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.device.setting.ui.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DeviceSettingFragment.k.f(deviceSettingFragment, view);
                }
            });
            FindDeviceViewModel findDeviceViewModel = DeviceSettingFragment.this.getFindDeviceViewModel();
            if (findDeviceViewModel != null && (showFindingTipLiveData = findDeviceViewModel.getShowFindingTipLiveData()) != null) {
                LifecycleOwner viewLifecycleOwner = DeviceSettingFragment.this.getViewLifecycleOwner();
                final DeviceSettingFragment deviceSettingFragment2 = DeviceSettingFragment.this;
                showFindingTipLiveData.observe(viewLifecycleOwner, new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.n
                    @Override // androidx.p008lifecycle.Observer
                    public final void onChanged(Object obj) {
                        DeviceSettingFragment.k.g(deviceSettingFragment2, (ShowFindingVo) obj);
                    }
                });
            }
            FindDeviceViewModel findDeviceViewModel2 = DeviceSettingFragment.this.getFindDeviceViewModel();
            if (findDeviceViewModel2 != null && (showFrequentlyFindAlertLiveData = findDeviceViewModel2.getShowFrequentlyFindAlertLiveData()) != null) {
                LifecycleOwner viewLifecycleOwner2 = DeviceSettingFragment.this.getViewLifecycleOwner();
                final DeviceSettingFragment deviceSettingFragment3 = DeviceSettingFragment.this;
                showFrequentlyFindAlertLiveData.observe(viewLifecycleOwner2, new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.o
                    @Override // androidx.p008lifecycle.Observer
                    public final void onChanged(Object obj) {
                        DeviceSettingFragment.k.h(deviceSettingFragment3, (ShowFrequentlyFindVo) obj);
                    }
                });
            }
            FindDeviceViewModel findDeviceViewModel3 = DeviceSettingFragment.this.getFindDeviceViewModel();
            if (findDeviceViewModel3 == null || (findMiliSettingLiveData = findDeviceViewModel3.getFindMiliSettingLiveData()) == null) {
                return;
            }
            LifecycleOwner viewLifecycleOwner3 = DeviceSettingFragment.this.getViewLifecycleOwner();
            final DeviceSettingFragment deviceSettingFragment4 = DeviceSettingFragment.this;
            findMiliSettingLiveData.observe(viewLifecycleOwner3, new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.m
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    DeviceSettingFragment.k.i(deviceSettingFragment4, (FindMiliVo) obj);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<Unit> {
        public l() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(DeviceSettingFragment deviceSettingFragment, View view) {
            DeviceFeatureViewModel deviceFeatureViewModel;
            if (((UserInfoPolicyService) KoinProxyKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(UserInfoPolicyService.class), null, null)).interceptWithShowTip() || (deviceFeatureViewModel = deviceSettingFragment.getDeviceFeatureViewModel()) == null) {
                return;
            }
            new HealthDetectClickedImpl(deviceSettingFragment, deviceFeatureViewModel).onClicked(deviceSettingFragment.requireContext());
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            View view = DeviceSettingFragment.this.getView();
            View viewFindViewById = view == null ? null : view.findViewById(R.id.item_health_detect);
            final DeviceSettingFragment deviceSettingFragment = DeviceSettingFragment.this;
            ((DeviceSettingItemView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.device.setting.ui.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DeviceSettingFragment.l.b(deviceSettingFragment, view2);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<View, Unit> {
            public final /* synthetic */ InstructionVo a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InstructionVo instructionVo) {
                super(1);
                this.a = instructionVo;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull View view) {
                String url = this.a.getUrl();
                if (url == null) {
                    return;
                }
                WebHelper.launch(url);
            }
        }

        public m() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(DeviceSettingFragment deviceSettingFragment, InstructionVo instructionVo) {
            View view = deviceSettingFragment.getView();
            View viewFindViewById = view == null ? null : view.findViewById(R.id.item_instruction);
            String url = instructionVo.getUrl();
            ExtKt.setVisible$default(viewFindViewById, !(url == null || kotlin.text.m.isBlank(url)), false, 2, null);
            View view2 = deviceSettingFragment.getView();
            ExtKt.smartClick$default(view2 != null ? view2.findViewById(R.id.item_instruction) : null, 0L, new a(instructionVo), 1, null);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MutableLiveData<InstructionVo> instructionLiveData;
            FeatureViewModel featureViewModel = DeviceSettingFragment.this.getFeatureViewModel();
            if (featureViewModel == null || (instructionLiveData = featureViewModel.getInstructionLiveData()) == null) {
                return;
            }
            LifecycleOwner viewLifecycleOwner = DeviceSettingFragment.this.getViewLifecycleOwner();
            final DeviceSettingFragment deviceSettingFragment = DeviceSettingFragment.this;
            instructionLiveData.observe(viewLifecycleOwner, new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.q
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    DeviceSettingFragment.m.b(deviceSettingFragment, (InstructionVo) obj);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<View, Unit> {
            public final /* synthetic */ DeviceSettingFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DeviceSettingFragment deviceSettingFragment) {
                super(1);
                this.a = deviceSettingFragment;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull View view) {
                this.a.t().onJsAppDeveloperModePageClick(this.a.requireActivity());
            }
        }

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (DeviceSettingFragment.this.t().isDeveloperModeOpen()) {
                View view = DeviceSettingFragment.this.getView();
                ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.item_js_app_developer_mode), true, false, 2, null);
                View view2 = DeviceSettingFragment.this.getView();
                ExtKt.smartClick$default(view2 != null ? view2.findViewById(R.id.item_js_app_developer_mode) : null, 0L, new a(DeviceSettingFragment.this), 1, null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.DeviceSettingFragment$observeForJsAppStore$1$1$1", f = "DeviceSettingFragment.kt", i = {}, l = {438}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ DeviceSettingFragment b;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.ui.DeviceSettingFragment$o$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0853a extends Lambda implements Function0<String> {
                public final /* synthetic */ boolean a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0853a(boolean z) {
                    super(0);
                    this.a = z;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "Has js app need upgrade or not: " + this.a;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ Exception a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(Exception exc) {
                    super(0);
                    this.a = exc;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "Get has js app exception: " + this.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DeviceSettingFragment deviceSettingFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = deviceSettingFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
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
                boolean z = true;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        JsAppApi jsAppApiT = this.b.t();
                        this.a = 1;
                        obj = jsAppApiT.hasJsAppNeedUpgrade(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    Boolean boolBoxBoolean = Boxing.boxBoolean(((Boolean) obj).booleanValue());
                    DeviceSettingFragment deviceSettingFragment = this.b;
                    boolean zBooleanValue = boolBoxBoolean.booleanValue();
                    HMLog.info(DeviceSettingFragment.B, new C0853a(zBooleanValue));
                    View view = deviceSettingFragment.getView();
                    DeviceSettingItemView deviceSettingItemView = (DeviceSettingItemView) (view == null ? null : view.findViewById(R.id.item_js_app_store));
                    if (!zBooleanValue) {
                        z = false;
                    }
                    deviceSettingItemView.setRedDotVisible(Boxing.boxBoolean(z));
                } catch (Exception e) {
                    HMLog.error$default(DeviceSettingFragment.B, null, null, new b(e), 6, null);
                }
                return Unit.INSTANCE;
            }
        }

        public o() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(final DeviceSettingFragment deviceSettingFragment, JSAppStoreVo jSAppStoreVo) {
            View view = deviceSettingFragment.getView();
            ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.item_js_app_store), jSAppStoreVo != null && jSAppStoreVo.isSupport(), false, 2, null);
            if (jSAppStoreVo != null && jSAppStoreVo.isSupport()) {
                kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(deviceSettingFragment), Dispatchers.getMain(), null, new a(deviceSettingFragment, null), 2, null);
                View view2 = deviceSettingFragment.getView();
                ((DeviceSettingItemView) (view2 != null ? view2.findViewById(R.id.item_js_app_store) : null)).setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.device.setting.ui.r
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        DeviceSettingFragment.o.e(deviceSettingFragment, view3);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(DeviceSettingFragment deviceSettingFragment, View view) {
            View view2 = deviceSettingFragment.getView();
            ((DeviceSettingItemView) (view2 == null ? null : view2.findViewById(R.id.item_js_app_store))).setRedDotVisible(Boolean.FALSE);
            deviceSettingFragment.t().onDevicePageClick(deviceSettingFragment.requireActivity());
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            LiveData<JSAppStoreVo> liveDataLoadJsAppStoreSetting;
            DeviceFeatureViewModel deviceFeatureViewModel = DeviceSettingFragment.this.getDeviceFeatureViewModel();
            if (deviceFeatureViewModel == null || (liveDataLoadJsAppStoreSetting = deviceFeatureViewModel.loadJsAppStoreSetting()) == null) {
                return;
            }
            LifecycleOwner viewLifecycleOwner = DeviceSettingFragment.this.getViewLifecycleOwner();
            final DeviceSettingFragment deviceSettingFragment = DeviceSettingFragment.this;
            liveDataLoadJsAppStoreSetting.observe(viewLifecycleOwner, new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.s
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    DeviceSettingFragment.o.c(deviceSettingFragment, (JSAppStoreVo) obj);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<Unit> {
        public p() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(DeviceSettingFragment deviceSettingFragment, View view) {
            new NotificationAndReminderClickedImpl(FragmentKt.findNavController(deviceSettingFragment), deviceSettingFragment).onClicked(deviceSettingFragment.requireContext());
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            View view = DeviceSettingFragment.this.getView();
            View viewFindViewById = view == null ? null : view.findViewById(R.id.item_notification_and_reminder);
            final DeviceSettingFragment deviceSettingFragment = DeviceSettingFragment.this;
            ((DeviceSettingItemView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.device.setting.ui.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DeviceSettingFragment.p.b(deviceSettingFragment, view2);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<View, Unit> {
            public final /* synthetic */ OfflineVoiceCmdVo a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(OfflineVoiceCmdVo offlineVoiceCmdVo) {
                super(1);
                this.a = offlineVoiceCmdVo;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull View view) {
                WebHelper.launch(this.a.getUrl());
            }
        }

        public q() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(DeviceSettingFragment deviceSettingFragment, OfflineVoiceCmdVo offlineVoiceCmdVo) {
            View view = deviceSettingFragment.getView();
            ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.item_offline_voice_cmd), offlineVoiceCmdVo.isSupport(), false, 2, null);
            if (offlineVoiceCmdVo.getUrl() != null) {
                View view2 = deviceSettingFragment.getView();
                ExtKt.smartClick$default(view2 != null ? view2.findViewById(R.id.item_offline_voice_cmd) : null, 0L, new a(offlineVoiceCmdVo), 1, null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MutableLiveData<OfflineVoiceCmdVo> offlineVoiceCmd;
            FeatureViewModel featureViewModel = DeviceSettingFragment.this.getFeatureViewModel();
            if (featureViewModel == null || (offlineVoiceCmd = featureViewModel.getOfflineVoiceCmd()) == null) {
                return;
            }
            LifecycleOwner viewLifecycleOwner = DeviceSettingFragment.this.getViewLifecycleOwner();
            final DeviceSettingFragment deviceSettingFragment = DeviceSettingFragment.this;
            offlineVoiceCmd.observe(viewLifecycleOwner, new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.u
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    DeviceSettingFragment.q.b(deviceSettingFragment, (OfflineVoiceCmdVo) obj);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<Unit> {
        public r() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(DeviceSettingFragment deviceSettingFragment, View view) {
            deviceSettingFragment.v().start(deviceSettingFragment.requireActivity());
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            View view = DeviceSettingFragment.this.getView();
            View viewFindViewById = view == null ? null : view.findViewById(R.id.item_realtime_data);
            final DeviceSettingFragment deviceSettingFragment = DeviceSettingFragment.this;
            ((DeviceSettingItemView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.device.setting.ui.v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DeviceSettingFragment.r.b(deviceSettingFragment, view2);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<Unit> {
        public s() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(final DeviceSettingFragment deviceSettingFragment, EsimVo esimVo) {
            View view = deviceSettingFragment.getView();
            ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.item_esim), esimVo != null && esimVo.isSupport(), false, 2, null);
            if (esimVo != null && esimVo.isSupport()) {
                View view2 = deviceSettingFragment.getView();
                ((DeviceSettingItemView) (view2 != null ? view2.findViewById(R.id.item_esim) : null)).setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.device.setting.ui.w
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        DeviceSettingFragment.s.e(deviceSettingFragment, view3);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(DeviceSettingFragment deviceSettingFragment, View view) {
            FragmentKt.findNavController(deviceSettingFragment).navigate(R.id.action_to_esimActivity);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            LiveData<EsimVo> liveDataLoadEsimSetting;
            DeviceFeatureViewModel deviceFeatureViewModel = DeviceSettingFragment.this.getDeviceFeatureViewModel();
            if (deviceFeatureViewModel == null || (liveDataLoadEsimSetting = deviceFeatureViewModel.loadEsimSetting()) == null) {
                return;
            }
            LifecycleOwner viewLifecycleOwner = DeviceSettingFragment.this.getViewLifecycleOwner();
            final DeviceSettingFragment deviceSettingFragment = DeviceSettingFragment.this;
            liveDataLoadEsimSetting.observe(viewLifecycleOwner, new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.x
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    DeviceSettingFragment.s.c(deviceSettingFragment, (EsimVo) obj);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t extends Lambda implements Function0<Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class a extends FunctionReferenceImpl implements Function0<SmartCardAction.Version> {
            public a(DeviceSettingFragment deviceSettingFragment) {
                super(0, deviceSettingFragment, DeviceSettingFragment.class, "getSmartCardVersion", "getSmartCardVersion()Lcom/xiaomi/hm/health/device/assistant/smart/SmartCardAction$Version;", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SmartCardAction.Version getA() {
                return ((DeviceSettingFragment) this.receiver).w();
            }
        }

        public t() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(DeviceSettingFragment deviceSettingFragment, View view) {
            if (deviceSettingFragment.A()) {
                CustomToast.makeText(deviceSettingFragment.requireContext(), R.string.wf_sync_other_data, 0).show();
            } else {
                new SmartCardAction(new a(deviceSettingFragment)).action(FragmentKt.findNavController(deviceSettingFragment));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(DeviceSettingFragment deviceSettingFragment, Boolean bool) {
            View view = deviceSettingFragment.getView();
            ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.item_smart_assistant_setting), bool.booleanValue(), false, 2, null);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MutableLiveData<Boolean> mutableLiveDataIsSupportLiveData;
            View view = DeviceSettingFragment.this.getView();
            View viewFindViewById = view == null ? null : view.findViewById(R.id.item_smart_assistant_setting);
            final DeviceSettingFragment deviceSettingFragment = DeviceSettingFragment.this;
            ((DeviceSettingItemView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.device.setting.ui.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DeviceSettingFragment.t.c(deviceSettingFragment, view2);
                }
            });
            FeatureViewModel featureViewModel = DeviceSettingFragment.this.getFeatureViewModel();
            if (featureViewModel == null || (mutableLiveDataIsSupportLiveData = featureViewModel.isSupportLiveData()) == null) {
                return;
            }
            LifecycleOwner viewLifecycleOwner = DeviceSettingFragment.this.getViewLifecycleOwner();
            final DeviceSettingFragment deviceSettingFragment2 = DeviceSettingFragment.this;
            mutableLiveDataIsSupportLiveData.observe(viewLifecycleOwner, new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.z
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    DeviceSettingFragment.t.e(deviceSettingFragment2, (Boolean) obj);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u extends Lambda implements Function0<Unit> {
        public u() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(DeviceSettingFragment deviceSettingFragment, SpiteBindingVo spiteBindingVo) {
            View view = deviceSettingFragment.getView();
            ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.item_spite_binding_item), spiteBindingVo.isSupport(), false, 2, null);
            View view2 = deviceSettingFragment.getView();
            ((DeviceSettingItemView) (view2 != null ? view2.findViewById(R.id.item_spite_binding_item) : null)).setValue(deviceSettingFragment.getString(spiteBindingVo.isEnable() ? R.string.alert_enable : R.string.alert_disable));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(DeviceSettingFragment deviceSettingFragment, View view) {
            CincoAnalytics.cincoOperateAnalytics("Bind_Limit");
            deviceSettingFragment.r().startAvoidSpiteBindingActivity(deviceSettingFragment.requireContext());
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MutableLiveData<SpiteBindingVo> spiteBindingLiveData;
            DeviceFeatureViewModel deviceFeatureViewModel = DeviceSettingFragment.this.getDeviceFeatureViewModel();
            if (deviceFeatureViewModel != null && (spiteBindingLiveData = deviceFeatureViewModel.getSpiteBindingLiveData()) != null) {
                LifecycleOwner viewLifecycleOwner = DeviceSettingFragment.this.getViewLifecycleOwner();
                final DeviceSettingFragment deviceSettingFragment = DeviceSettingFragment.this;
                spiteBindingLiveData.observe(viewLifecycleOwner, new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.b0
                    @Override // androidx.p008lifecycle.Observer
                    public final void onChanged(Object obj) {
                        DeviceSettingFragment.u.c(deviceSettingFragment, (SpiteBindingVo) obj);
                    }
                });
            }
            View view = DeviceSettingFragment.this.getView();
            View viewFindViewById = view == null ? null : view.findViewById(R.id.item_spite_binding_item);
            final DeviceSettingFragment deviceSettingFragment2 = DeviceSettingFragment.this;
            ((DeviceSettingItemView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.device.setting.ui.a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DeviceSettingFragment.u.e(deviceSettingFragment2, view2);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v extends Lambda implements Function0<Unit> {
        public v() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(DeviceSettingFragment deviceSettingFragment, View view) {
            CincoAnalytics.cincoOperateAnalytics("Identity_HeartRate");
            deviceSettingFragment.r().startSportHRBroadcastActivity(deviceSettingFragment.requireActivity());
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            View view = DeviceSettingFragment.this.getView();
            View viewFindViewById = view == null ? null : view.findViewById(R.id.item_bluetooth_sport_broadcast);
            final DeviceSettingFragment deviceSettingFragment = DeviceSettingFragment.this;
            ((DeviceSettingItemView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.device.setting.ui.c0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DeviceSettingFragment.v.b(deviceSettingFragment, view2);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w extends Lambda implements Function0<Unit> {
        public w() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(DeviceSettingFragment deviceSettingFragment, View view) {
            CincoAnalytics.cincoOperateAnalytics("ScreenUnlock");
            deviceSettingFragment.r().startScreenUnlockActivity(deviceSettingFragment.requireContext());
            Analytics.recordEvent(new CountEventBuilder(deviceSettingFragment.mAnalyticOperateType).setValue("ScreenUnlock"));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(DeviceSettingFragment deviceSettingFragment, DeviceUnlockScreenVo deviceUnlockScreenVo) {
            int i = deviceUnlockScreenVo.isEnable() ? R.string.alert_enable : R.string.alert_disable;
            View view = deviceSettingFragment.getView();
            ((DeviceSettingItemView) (view == null ? null : view.findViewById(R.id.item_unlock_screen))).setValue(deviceSettingFragment.getString(i));
            View view2 = deviceSettingFragment.getView();
            if (((DeviceSettingItemView) (view2 == null ? null : view2.findViewById(R.id.item_unlock_screen))).isEnabled()) {
                View view3 = deviceSettingFragment.getView();
                ExtKt.setVisible$default(view3 == null ? null : view3.findViewById(R.id.item_unlock_screen), deviceUnlockScreenVo.isSupport(), false, 2, null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MutableLiveData<DeviceUnlockScreenVo> deviceUnlockScreenLiveData;
            View view = DeviceSettingFragment.this.getView();
            View viewFindViewById = view == null ? null : view.findViewById(R.id.item_unlock_screen);
            final DeviceSettingFragment deviceSettingFragment = DeviceSettingFragment.this;
            ((DeviceSettingItemView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.device.setting.ui.d0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DeviceSettingFragment.w.c(deviceSettingFragment, view2);
                }
            });
            DeviceFeatureViewModel deviceFeatureViewModel = DeviceSettingFragment.this.getDeviceFeatureViewModel();
            if (deviceFeatureViewModel == null || (deviceUnlockScreenLiveData = deviceFeatureViewModel.getDeviceUnlockScreenLiveData()) == null) {
                return;
            }
            LifecycleOwner viewLifecycleOwner = DeviceSettingFragment.this.getViewLifecycleOwner();
            final DeviceSettingFragment deviceSettingFragment2 = DeviceSettingFragment.this;
            deviceUnlockScreenLiveData.observe(viewLifecycleOwner, new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.e0
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    DeviceSettingFragment.w.e(deviceSettingFragment2, (DeviceUnlockScreenVo) obj);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x extends Lambda implements Function0<Unit> {
        public x() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(DeviceSettingFragment deviceSettingFragment, View view) {
            FragmentKt.findNavController(deviceSettingFragment).navigate(R.id.action_to_vibrateTypeActivity);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(DeviceSettingFragment deviceSettingFragment, VibrateSettingVo vibrateSettingVo) {
            View view = deviceSettingFragment.getView();
            ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.item_vibrate_mode), vibrateSettingVo.isSupport(), false, 2, null);
            View view2 = deviceSettingFragment.getView();
            ((DeviceSettingItemView) (view2 != null ? view2.findViewById(R.id.item_vibrate_mode) : null)).setEnabled(vibrateSettingVo.isEnable());
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MutableLiveData<VibrateSettingVo> vibrateSettingVoLiveData;
            View view = DeviceSettingFragment.this.getView();
            View viewFindViewById = view == null ? null : view.findViewById(R.id.item_vibrate_mode);
            final DeviceSettingFragment deviceSettingFragment = DeviceSettingFragment.this;
            ((DeviceSettingItemView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.device.setting.ui.f0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DeviceSettingFragment.x.c(deviceSettingFragment, view2);
                }
            });
            FeatureViewModel featureViewModel = DeviceSettingFragment.this.getFeatureViewModel();
            if (featureViewModel == null || (vibrateSettingVoLiveData = featureViewModel.getVibrateSettingVoLiveData()) == null) {
                return;
            }
            LifecycleOwner viewLifecycleOwner = DeviceSettingFragment.this.getViewLifecycleOwner();
            final DeviceSettingFragment deviceSettingFragment2 = DeviceSettingFragment.this;
            vibrateSettingVoLiveData.observe(viewLifecycleOwner, new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.g0
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    DeviceSettingFragment.x.e(deviceSettingFragment2, (VibrateSettingVo) obj);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class y extends Lambda implements Function0<Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<View, Unit> {
            public final /* synthetic */ DeviceSettingFragment a;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.ui.DeviceSettingFragment$y$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0854a extends Lambda implements Function0<String> {
                public static final C0854a a = new C0854a();

                public C0854a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "error of system navigation";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DeviceSettingFragment deviceSettingFragment) {
                super(1);
                this.a = deviceSettingFragment;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull View view) {
                try {
                    FragmentKt.findNavController(this.a).navigate(R.id.action_to_watchSettingFragment);
                } catch (Exception e) {
                    HMLog.error(DeviceSettingFragment.B, "100", e, C0854a.a);
                }
            }
        }

        public y() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(DeviceSettingFragment deviceSettingFragment, WatchSettingVo watchSettingVo) {
            View view = deviceSettingFragment.getView();
            ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.item_watch_setting), watchSettingVo.isSupport(), false, 2, null);
            View view2 = deviceSettingFragment.getView();
            ((DeviceSettingItemView) (view2 != null ? view2.findViewById(R.id.item_watch_setting) : null)).setEnabled(watchSettingVo.isEnable());
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MutableLiveData<WatchSettingVo> watchSettingLiveData;
            View view = DeviceSettingFragment.this.getView();
            ExtKt.smartClick$default(view == null ? null : view.findViewById(R.id.item_watch_setting), 0L, new a(DeviceSettingFragment.this), 1, null);
            FeatureViewModel featureViewModel = DeviceSettingFragment.this.getFeatureViewModel();
            if (featureViewModel == null || (watchSettingLiveData = featureViewModel.getWatchSettingLiveData()) == null) {
                return;
            }
            LifecycleOwner viewLifecycleOwner = DeviceSettingFragment.this.getViewLifecycleOwner();
            final DeviceSettingFragment deviceSettingFragment = DeviceSettingFragment.this;
            watchSettingLiveData.observe(viewLifecycleOwner, new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.h0
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    DeviceSettingFragment.y.b(deviceSettingFragment, (WatchSettingVo) obj);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class z extends Lambda implements Function0<Unit> {
        public z() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(DeviceSettingFragment deviceSettingFragment, View view) {
            HMDeviceSource hMDeviceSourceFindDeviceSource;
            FeatureViewModel featureViewModel = deviceSettingFragment.getFeatureViewModel();
            if (featureViewModel == null || (hMDeviceSourceFindDeviceSource = featureViewModel.findDeviceSource()) == null) {
                return;
            }
            CincoAnalytics.cincoOperateAnalytics("WatchFace");
            WatchSkinManager.jumpToWatchSkinPage(deviceSettingFragment.getContext(), hMDeviceSourceFindDeviceSource);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            View view = DeviceSettingFragment.this.getView();
            View viewFindViewById = view == null ? null : view.findViewById(R.id.item_watch_skin);
            final DeviceSettingFragment deviceSettingFragment = DeviceSettingFragment.this;
            ((DeviceSettingItemView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.device.setting.ui.i0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DeviceSettingFragment.z.b(deviceSettingFragment, view2);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceSettingFragment() {
        final b bVar = b.a;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        this.fetchApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<DialFetchApi>() { // from class: com.xiaomi.hm.health.device.setting.ui.DeviceSettingFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.dial.DialFetchApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DialFetchApi getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(DialFetchApi.class), qualifier, bVar);
            }
        });
        final Object[] objArr = 0 == true ? 1 : 0;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        this.keeperProvider = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<KeeperProxyApi>() { // from class: com.xiaomi.hm.health.device.setting.ui.DeviceSettingFragment$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.keeper.KeeperProxyApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final KeeperProxyApi getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(KeeperProxyApi.class), objArr, objArr2);
            }
        });
        final Object[] objArr3 = 0 == true ? 1 : 0;
        final Object[] objArr4 = 0 == true ? 1 : 0;
        this.deviceXNavigator = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<DeviceXNavigator>() { // from class: com.xiaomi.hm.health.device.setting.ui.DeviceSettingFragment$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceXNavigator getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(DeviceXNavigator.class), objArr3, objArr4);
            }
        });
        final Object[] objArr5 = 0 == true ? 1 : 0;
        final Object[] objArr6 = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.setting.ui.DeviceSettingFragment$special$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceManagerApi getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), objArr5, objArr6);
            }
        });
        final Object[] objArr7 = 0 == true ? 1 : 0;
        final Object[] objArr8 = 0 == true ? 1 : 0;
        this.deviceUtilApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.device.setting.ui.DeviceSettingFragment$special$$inlined$inject$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.DeviceUtilsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceUtilsApi getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), objArr7, objArr8);
            }
        });
        final Object[] objArr9 = 0 == true ? 1 : 0;
        final Object[] objArr10 = 0 == true ? 1 : 0;
        this.realtimeData = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<IRealtimeData>() { // from class: com.xiaomi.hm.health.device.setting.ui.DeviceSettingFragment$special$$inlined$inject$default$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.realtimedata.IRealtimeData, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final IRealtimeData getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(IRealtimeData.class), objArr9, objArr10);
            }
        });
        final Object[] objArr11 = 0 == true ? 1 : 0;
        final Object[] objArr12 = 0 == true ? 1 : 0;
        this.jsAppApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<JsAppApi>() { // from class: com.xiaomi.hm.health.device.setting.ui.DeviceSettingFragment$special$$inlined$inject$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.life.feature.inject.JsAppApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final JsAppApi getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(JsAppApi.class), objArr11, objArr12);
            }
        });
        final Object[] objArr13 = 0 == true ? 1 : 0;
        final Object[] objArr14 = 0 == true ? 1 : 0;
        this.snService = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<DeviceSnService>() { // from class: com.xiaomi.hm.health.device.setting.ui.DeviceSettingFragment$special$$inlined$inject$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.devicex.manage.api.core.feature.DeviceSnService, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceSnService getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(DeviceSnService.class), objArr13, objArr14);
            }
        });
        this.updateCheckerViewModel = LazyKt__LazyJVMKt.lazy(new d0());
        this.newColor = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean A() {
        LiveData<ConnectStatus> displayDialLiveData;
        FeatureViewModel featureViewModel = getFeatureViewModel();
        ConnectStatus value = null;
        if (featureViewModel != null && (displayDialLiveData = featureViewModel.getDisplayDialLiveData()) != null) {
            value = displayDialLiveData.getValue();
        }
        return value == ConnectStatus.SYNC;
    }

    private final void B() {
        View view = getView();
        setOnce(view == null ? null : view.findViewById(R.id.item_about), new c());
    }

    private final void C() {
        MutableLiveData<List<WatchAppItemVo>> appItemFeatureLiveData;
        View view = getView();
        DeviceSettingItemView deviceSettingItemView = (DeviceSettingItemView) (view == null ? null : view.findViewById(R.id.item_device_app_item_setting));
        setOnce(deviceSettingItemView, new d(deviceSettingItemView));
        FeatureViewModel featureViewModel = getFeatureViewModel();
        if (featureViewModel != null && (appItemFeatureLiveData = featureViewModel.getAppItemFeatureLiveData()) != null) {
            appItemFeatureLiveData.observe(getViewLifecycleOwner(), new Observer() { // from class: w81
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    DeviceSettingFragment.D(this.a, (List) obj);
                }
            });
        }
        FeatureViewModel featureViewModel2 = getFeatureViewModel();
        if (featureViewModel2 == null) {
            return;
        }
        featureViewModel2.loadAppItemFeature();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(DeviceSettingFragment deviceSettingFragment, List list) {
        BaseQuickAdapter<WatchAppItemVo, BaseViewHolder> baseQuickAdapter = deviceSettingFragment.adapter;
        if (baseQuickAdapter == null) {
            return;
        }
        baseQuickAdapter.setNewData(list);
    }

    private final void E() {
        View view = getView();
        setOnce(view == null ? null : view.findViewById(R.id.item_bluetooth_broadcast), new e());
        DeviceFeatureViewModel deviceFeatureViewModel = getDeviceFeatureViewModel();
        if (deviceFeatureViewModel == null) {
            return;
        }
        deviceFeatureViewModel.loadBroadcastSetting();
    }

    private final void F() {
        View view = getView();
        setOnce(view == null ? null : view.findViewById(R.id.item_check_update), new f());
        FeatureViewModel featureViewModel = getFeatureViewModel();
        if (featureViewModel == null) {
            return;
        }
        featureViewModel.loadUpdateFwUpgradeVo();
    }

    @SuppressLint({"StringFormatInvalid"})
    private final void G() {
        if (this.viewHelper == null) {
            HMLog.w(B, "viewHelper is null", new Object[0]);
            return;
        }
        AppCompatImageView appCompatImageView = this.ivSkin;
        Objects.requireNonNull(appCompatImageView);
        setOnce(appCompatImageView, new g());
    }

    private final void H() {
        View view = getView();
        final DeviceSettingItemView deviceSettingItemView = (DeviceSettingItemView) (view == null ? null : view.findViewById(R.id.item_device_app_manager));
        DeviceFeatureViewModel deviceFeatureViewModel = getDeviceFeatureViewModel();
        if (deviceFeatureViewModel == null) {
            return;
        }
        deviceFeatureViewModel.loadAppsItemSetting().observe(getViewLifecycleOwner(), new Observer() { // from class: x81
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                DeviceSettingFragment.I(deviceSettingItemView, this, (AppsItemVo) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(DeviceSettingItemView deviceSettingItemView, DeviceSettingFragment deviceSettingFragment, AppsItemVo appsItemVo) {
        ExtKt.setVisible$default(deviceSettingItemView, appsItemVo.isSupport(), false, 2, null);
        deviceSettingFragment.setOnce(deviceSettingItemView, new h(deviceSettingItemView, deviceSettingFragment, appsItemVo));
    }

    private final void J() {
        View view = getView();
        setOnce(view == null ? null : view.findViewById(R.id.toolbar), new i());
    }

    private final void K() {
        View view = getView();
        setOnce(view == null ? null : view.findViewById(R.id.item_faq), new j());
        FeatureViewModel featureViewModel = getFeatureViewModel();
        if (featureViewModel == null) {
            return;
        }
        featureViewModel.loadDeviceFaqSetting();
    }

    private final void L() {
        HMDeviceSource hMDeviceSourceFindDeviceSource;
        FeatureViewModel featureViewModel = getFeatureViewModel();
        int i2 = (featureViewModel == null || (hMDeviceSourceFindDeviceSource = featureViewModel.findDeviceSource()) == null || !ConfigHelperKt.hasFeature(hMDeviceSourceFindDeviceSource, Feature.WATCH_SOURCE_S)) ? false : true ? R.string.mili_setting_find_chaohu : R.string.mili_setting_find_bracelet;
        DeviceSettingItemView deviceSettingItemView = this.itemFindDevice;
        Objects.requireNonNull(deviceSettingItemView);
        deviceSettingItemView.setName(getString(i2));
        DeviceSettingItemView deviceSettingItemView2 = this.itemFindDevice;
        Objects.requireNonNull(deviceSettingItemView2);
        setOnce(deviceSettingItemView2, new k());
        FindDeviceViewModel findDeviceViewModel = getFindDeviceViewModel();
        if (findDeviceViewModel != null) {
            findDeviceViewModel.loadFindMiliSetting();
        }
        FindDeviceViewModel findDeviceViewModel2 = getFindDeviceViewModel();
        if (findDeviceViewModel2 == null) {
            return;
        }
        findDeviceViewModel2.setDialogPageProvider(new IDialogPageProvider() { // from class: com.xiaomi.hm.health.device.setting.ui.DeviceSettingFragment$observeForFindDevice$3
            @Override // com.xiaomi.hm.health.device.setting.find.IDialogPageProvider
            @NotNull
            public IFindDevicePage providePage() {
                return new FindDevicePage(this.a.getChildFragmentManager());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(DeviceSettingFragment deviceSettingFragment, boolean z2, boolean z3) {
        if (!z2) {
            DeviceSettingItemView deviceSettingItemView = deviceSettingFragment.itemFindDevice;
            Objects.requireNonNull(deviceSettingItemView);
            deviceSettingItemView.setValue("");
        } else {
            int i2 = z3 ? R.string.finding_watch : R.string.finding_wrist;
            DeviceSettingItemView deviceSettingItemView2 = deviceSettingFragment.itemFindDevice;
            Objects.requireNonNull(deviceSettingItemView2);
            deviceSettingItemView2.setValue(deviceSettingFragment.getString(i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(DeviceSettingFragment deviceSettingFragment, boolean z2) {
        Toast.makeText(deviceSettingFragment.getContext(), z2 ? R.string.chaohu_setting_finding_tips : R.string.mili_setting_finding_tips, 0).show();
    }

    private final void O() {
        View view = getView();
        setOnce(view == null ? null : view.findViewById(R.id.item_health_detect), new l());
        DeviceFeatureViewModel deviceFeatureViewModel = getDeviceFeatureViewModel();
        if (deviceFeatureViewModel == null) {
            return;
        }
        deviceFeatureViewModel.loadHrDetectSetting(false).observe(getViewLifecycleOwner(), new Observer() { // from class: f91
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                DeviceSettingFragment.P(this.a, (HrDetectVo) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(DeviceSettingFragment deviceSettingFragment, HrDetectVo hrDetectVo) {
        View view = deviceSettingFragment.getView();
        ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.item_health_detect), hrDetectVo.isSupport(), false, 2, null);
        if (hrDetectVo.isShowDetectDialog()) {
            HrModeExtKt.showHrModeSelectDialog(deviceSettingFragment);
            return;
        }
        deviceSettingFragment.p().getBoundDeviceSource(HMDeviceType.MILI);
        if (hrDetectVo.isSupport() && HealthFunc.HR_MODE.INSTANCE.isSupport()) {
            View view2 = deviceSettingFragment.getView();
            ((DeviceSettingItemView) (view2 != null ? view2.findViewById(R.id.item_health_detect) : null)).setValue(HrModeExtKt.normalDetectModelResMap(hrDetectVo.getType()));
        } else {
            View view3 = deviceSettingFragment.getView();
            ((DeviceSettingItemView) (view3 != null ? view3.findViewById(R.id.item_health_detect) : null)).setValue("");
        }
    }

    private final void Q() {
        View view = getView();
        setOnce(view == null ? null : view.findViewById(R.id.item_instruction), new m());
        FeatureViewModel featureViewModel = getFeatureViewModel();
        if (featureViewModel == null) {
            return;
        }
        featureViewModel.loadInstruction();
    }

    private final void R() {
        View view = getView();
        setOnce(view == null ? null : view.findViewById(R.id.item_js_app_developer_mode), new n());
    }

    private final void S() {
        View view = getView();
        setOnce(view == null ? null : view.findViewById(R.id.item_js_app_store), new o());
    }

    private final void T() {
        LiveData<Boolean> keepAliveVo;
        DeviceFeatureViewModel deviceFeatureViewModel = getDeviceFeatureViewModel();
        if (deviceFeatureViewModel != null && (keepAliveVo = deviceFeatureViewModel.getKeepAliveVo()) != null) {
            keepAliveVo.observe(getViewLifecycleOwner(), new Observer() { // from class: u81
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    DeviceSettingFragment.U(this.a, (Boolean) obj);
                }
            });
        }
        View view = getView();
        ((DeviceSettingItemView) (view == null ? null : view.findViewById(R.id.item_keep_alive))).setOnClickListener(new View.OnClickListener() { // from class: c91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DeviceSettingFragment.V(this.a, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(DeviceSettingFragment deviceSettingFragment, Boolean bool) {
        View view = deviceSettingFragment.getView();
        ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.item_keep_alive), bool.booleanValue(), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(DeviceSettingFragment deviceSettingFragment, View view) {
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EVENT_MINE_OUT).setValue("Mine_Keepalive"));
        deviceSettingFragment.r().startKeepAliveActivity(deviceSettingFragment.requireContext());
    }

    private final void W() {
        View view = getView();
        setOnce(view == null ? null : view.findViewById(R.id.item_notification_and_reminder), new p());
        DeviceFeatureViewModel deviceFeatureViewModel = getDeviceFeatureViewModel();
        if (deviceFeatureViewModel == null) {
            return;
        }
        deviceFeatureViewModel.loadNotification().observe(getViewLifecycleOwner(), new Observer() { // from class: v81
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                DeviceSettingFragment.X(this.a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(DeviceSettingFragment deviceSettingFragment, Boolean bool) {
        View view = deviceSettingFragment.getView();
        ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.item_notification_and_reminder), bool.booleanValue(), false, 2, null);
    }

    private final void Y() {
        View view = getView();
        setOnce(view == null ? null : view.findViewById(R.id.item_offline_voice_cmd), new q());
        FeatureViewModel featureViewModel = getFeatureViewModel();
        if (featureViewModel == null) {
            return;
        }
        featureViewModel.loadOfflineVoiceCmd();
    }

    private final void Z() {
        LiveData<RealtimeDataVo> liveDataFindRealtimeDataSetting;
        DeviceFeatureViewModel deviceFeatureViewModel = getDeviceFeatureViewModel();
        if (deviceFeatureViewModel != null && (liveDataFindRealtimeDataSetting = deviceFeatureViewModel.findRealtimeDataSetting()) != null) {
            liveDataFindRealtimeDataSetting.observe(getViewLifecycleOwner(), new Observer() { // from class: e91
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    DeviceSettingFragment.a0(this.a, (RealtimeDataVo) obj);
                }
            });
        }
        View view = getView();
        setOnce(view == null ? null : view.findViewById(R.id.item_realtime_data), new r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(DeviceSettingFragment deviceSettingFragment, RealtimeDataVo realtimeDataVo) {
        if (realtimeDataVo == null) {
            return;
        }
        View view = deviceSettingFragment.getView();
        ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.item_realtime_data), realtimeDataVo.getSupport(), false, 2, null);
        View view2 = deviceSettingFragment.getView();
        ((DeviceSettingItemView) (view2 != null ? view2.findViewById(R.id.item_realtime_data) : null)).setValue(deviceSettingFragment.y0(realtimeDataVo.getEnable()));
    }

    private final void b0() {
        View view = getView();
        setOnce(view == null ? null : view.findViewById(R.id.item_esim), new s());
    }

    private final void c0() {
        View view = getView();
        setOnce(view == null ? null : view.findViewById(R.id.item_smart_assistant_setting), new t());
        FeatureViewModel featureViewModel = getFeatureViewModel();
        if (featureViewModel == null) {
            return;
        }
        featureViewModel.loadAssistantSettings();
    }

    private final void d0() {
        View view = getView();
        setOnce(view == null ? null : view.findViewById(R.id.item_spite_binding_item), new u());
        DeviceFeatureViewModel deviceFeatureViewModel = getDeviceFeatureViewModel();
        if (deviceFeatureViewModel == null) {
            return;
        }
        deviceFeatureViewModel.loadSpiteBinding();
    }

    private final void e0() {
        LiveData<SportHrBroadCastVo> liveDataFindSportHrBroadcastSetting;
        DeviceFeatureViewModel deviceFeatureViewModel = getDeviceFeatureViewModel();
        if (deviceFeatureViewModel != null && (liveDataFindSportHrBroadcastSetting = deviceFeatureViewModel.findSportHrBroadcastSetting()) != null) {
            liveDataFindSportHrBroadcastSetting.observe(getViewLifecycleOwner(), new Observer() { // from class: g91
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    DeviceSettingFragment.f0(this.a, (SportHrBroadCastVo) obj);
                }
            });
        }
        View view = getView();
        setOnce(view == null ? null : view.findViewById(R.id.item_bluetooth_sport_broadcast), new v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0(DeviceSettingFragment deviceSettingFragment, SportHrBroadCastVo sportHrBroadCastVo) {
        if (sportHrBroadCastVo == null) {
            return;
        }
        View view = deviceSettingFragment.getView();
        ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.item_bluetooth_sport_broadcast), sportHrBroadCastVo.isSupport(), false, 2, null);
        int i2 = sportHrBroadCastVo.isEnable() ? R.string.alert_enable : R.string.alert_disable;
        View view2 = deviceSettingFragment.getView();
        ((DeviceSettingItemView) (view2 != null ? view2.findViewById(R.id.item_bluetooth_sport_broadcast) : null)).setValue(deviceSettingFragment.getString(i2));
    }

    private final void g0() {
        View view = getView();
        setOnce(view == null ? null : view.findViewById(R.id.item_unlock_screen), new w());
        DeviceFeatureViewModel deviceFeatureViewModel = getDeviceFeatureViewModel();
        if (deviceFeatureViewModel == null) {
            return;
        }
        deviceFeatureViewModel.loadDeviceUnLockScreen();
    }

    private final void h0() {
        View view = getView();
        setOnce(view == null ? null : view.findViewById(R.id.item_vibrate_mode), new x());
        FeatureViewModel featureViewModel = getFeatureViewModel();
        if (featureViewModel == null) {
            return;
        }
        featureViewModel.loadVibrateModeSetting();
    }

    private final void i0() {
        HMDeviceSource hMDeviceSourceFindDeviceSource;
        FeatureViewModel featureViewModel = getFeatureViewModel();
        int i2 = (featureViewModel == null || (hMDeviceSourceFindDeviceSource = featureViewModel.findDeviceSource()) == null || !ConfigHelperKt.hasFeature(hMDeviceSourceFindDeviceSource, Feature.WATCH_SOURCE_S)) ? false : true ? R.string.ds_watch_setting : R.string.device_ds_band_setting;
        View view = getView();
        ((DeviceSettingItemView) (view == null ? null : view.findViewById(R.id.item_watch_setting))).setName(getString(i2));
        View view2 = getView();
        setOnce(view2 != null ? view2.findViewById(R.id.item_watch_setting) : null, new y());
        FeatureViewModel featureViewModel2 = getFeatureViewModel();
        if (featureViewModel2 == null) {
            return;
        }
        featureViewModel2.loadWatchSetting();
    }

    private final void j0() {
        View view = getView();
        setOnce(view == null ? null : view.findViewById(R.id.item_watch_skin), new z());
    }

    private final void k0() {
        final Ref.IntRef intRef = new Ref.IntRef();
        View view = getView();
        ((NestedScrollView) (view == null ? null : view.findViewById(R.id.scroll_content))).setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() { // from class: d91
            @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
            public final void onScrollChange(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
                DeviceSettingFragment.l0(intRef, this, nestedScrollView, i2, i3, i4, i5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l0(Ref.IntRef intRef, DeviceSettingFragment deviceSettingFragment, NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
        if (intRef.element == 0) {
            View view = deviceSettingFragment.getView();
            intRef.element = (view == null ? null : view.findViewById(R.id.device_status_wrapper)).getMeasuredHeight() / 2;
        }
        int i6 = intRef.element;
        if (i3 >= i6) {
            View view2 = deviceSettingFragment.getView();
            ((RainbowTitleBar) (view2 != null ? view2.findViewById(R.id.toolbar) : null)).setBackgroundResource(R.color.s10);
        } else if (i3 == 0) {
            View view3 = deviceSettingFragment.getView();
            ((RainbowTitleBar) (view3 != null ? view3.findViewById(R.id.toolbar) : null)).setBackgroundColor(0);
        } else {
            int i7 = ((((int) ((i3 / i6) * 255)) << 24) | 16777215) & deviceSettingFragment.newColor;
            View view4 = deviceSettingFragment.getView();
            ((RainbowTitleBar) (view4 != null ? view4.findViewById(R.id.toolbar) : null)).setBackgroundColor(i7);
        }
    }

    private final void m0() {
        View view = getView();
        setOnce(view == null ? null : view.findViewById(R.id.item_lab), new a0());
        View view2 = getView();
        ((DeviceSettingItemView) (view2 != null ? view2.findViewById(R.id.item_lab) : null)).setOnClickListener(new View.OnClickListener() { // from class: b91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                DeviceSettingFragment.n0(this.a, view3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n0(DeviceSettingFragment deviceSettingFragment, View view) {
        FragmentKt.findNavController(deviceSettingFragment).navigate(R.id.action_to_labActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        HMDeviceSource hMDeviceSourceFindDeviceSource;
        HMDeviceSource boundDeviceSource = p().getBoundDeviceSource(HMDeviceType.MILI);
        DialFetchApi dialFetchApiS = s();
        AppCompatImageView appCompatImageView = this.ivSkin;
        Objects.requireNonNull(appCompatImageView);
        AppCompatImageView appCompatImageView2 = this.ivDial;
        Objects.requireNonNull(appCompatImageView2);
        AppCompatImageView appCompatImageView3 = this.ivDeviceTransparent;
        Objects.requireNonNull(appCompatImageView3);
        dialFetchApiS.showCache(boundDeviceSource, appCompatImageView, appCompatImageView2, appCompatImageView3);
        w0();
        FeatureViewModel featureViewModel = getFeatureViewModel();
        if (featureViewModel == null || (hMDeviceSourceFindDeviceSource = featureViewModel.findDeviceSource()) == null) {
            return;
        }
        kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this), null, null, new a(hMDeviceSourceFindDeviceSource, null), 3, null);
    }

    private final void o0() {
        G();
        j0();
        b0();
        c0();
        W();
        O();
        H();
        C();
        E();
        d0();
        g0();
        F();
        K();
        Q();
        i0();
        J();
        FeatureViewModel featureViewModel = getFeatureViewModel();
        if (featureViewModel != null) {
            featureViewModel.prepareDeviceStatus();
        }
        e0();
        Z();
        h0();
        m0();
        S();
        R();
    }

    private final DeviceManagerApi p() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0(VersionItemVo version) {
        if (version.getSupportBatchUpgrade()) {
            if (A()) {
                CustomToast.makeText(requireContext(), R.string.wf_sync_other_data, 0).show();
                return;
            } else {
                FragmentKt.findNavController(this).navigate(R.id.action_to_gt2SystemUpgrade);
                return;
            }
        }
        if (version.getHasFwUpgrade() && version.getSupportContinueUpgrade()) {
            HMFwOnlineUpgradeManager.getInstance().enableFwUpgrade(true);
            HMFwOnlineUpgradeManager.getInstance().checkFwUpgrade(requireContext(), HMDeviceType.MILI, false);
        } else if (version.getHasFwUpgrade()) {
            startActivity(HMFwUpgradeInfoActivity.newIntent(requireContext(), version.getDeviceSource()));
        } else {
            x0();
            y().startCheck();
        }
    }

    private final DeviceUtilsApi q() {
        return (DeviceUtilsApi) this.deviceUtilApi.getValue();
    }

    private final void q0() {
        View view = getView();
        ((RainbowTitleBar) (view == null ? null : view.findViewById(R.id.toolbar))).setNavigationOnClickListener(new View.OnClickListener() { // from class: y81
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DeviceSettingFragment.r0(this.a, view2);
            }
        });
        View view2 = getView();
        ((AppCompatButton) (view2 == null ? null : view2.findViewById(R.id.btn_open_normal_setting))).setOnClickListener(new View.OnClickListener() { // from class: z81
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                DeviceSettingFragment.s0(this.a, view3);
            }
        });
        View view3 = getView();
        ((AppCompatButton) (view3 == null ? null : view3.findViewById(R.id.btn_open_schedule))).setOnClickListener(new View.OnClickListener() { // from class: a91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                DeviceSettingFragment.t0(this.a, view4);
            }
        });
        L();
        B();
        View view4 = getView();
        ExtKt.smartClick$default(view4 != null ? view4.findViewById(R.id.btn_unbind) : null, 0L, new b0(), 1, null);
        Y();
        u0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceXNavigator r() {
        return (DeviceXNavigator) this.deviceXNavigator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(DeviceSettingFragment deviceSettingFragment, View view) {
        FragmentActivity activity = deviceSettingFragment.getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialFetchApi s() {
        return (DialFetchApi) this.fetchApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(DeviceSettingFragment deviceSettingFragment, View view) {
        deviceSettingFragment.r().startHMMiLiSettingActivity(deviceSettingFragment.requireContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsAppApi t() {
        return (JsAppApi) this.jsAppApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(DeviceSettingFragment deviceSettingFragment, View view) {
        FragmentKt.findNavController(deviceSettingFragment).navigate(R.id.action_to_smartActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KeeperProxyApi u() {
        return (KeeperProxyApi) this.keeperProvider.getValue();
    }

    private final void u0() {
        if (DeviceXFunctionsKt.getBuildConfigApi().isDebug()) {
            View view = getView();
            ((RainbowTitleBar) (view == null ? null : view.findViewById(R.id.toolbar))).setOnClickListener(new View.OnClickListener() { // from class: t81
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DeviceSettingFragment.v0(this.a, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IRealtimeData v() {
        return (IRealtimeData) this.realtimeData.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(DeviceSettingFragment deviceSettingFragment, View view) {
        int i2 = deviceSettingFragment.clickTitleTimes + 1;
        deviceSettingFragment.clickTitleTimes = i2;
        if (i2 == 8) {
            deviceSettingFragment.clickTitleTimes = 0;
            FragmentKt.findNavController(deviceSettingFragment).navigate(R.id.action_to_test_repository);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SmartCardAction.Version w() {
        FeatureViewModel featureViewModel = getFeatureViewModel();
        HMBaseDevice hMBaseDeviceFindDevice = featureViewModel == null ? null : featureViewModel.findDevice();
        if (hMBaseDeviceFindDevice == null) {
            return SmartCardAction.Version.V1;
        }
        return ConfigHelperKt.hasFeature(hMBaseDeviceFindDevice.getMDeviceSource(), Feature.GT3_SOURCE) ? SmartCardAction.Version.V2 : SmartCardAction.Version.V1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w0() {
        FeatureViewModel featureViewModel = getFeatureViewModel();
        HMBaseDevice hMBaseDeviceFindDevice = featureViewModel == null ? null : featureViewModel.findDevice();
        if (hMBaseDeviceFindDevice == null) {
            return;
        }
        DialFetchApi dialFetchApiS = s();
        UnusedDialImpl unusedDialImpl = dialFetchApiS instanceof UnusedDialImpl ? (UnusedDialImpl) dialFetchApiS : null;
        if (unusedDialImpl != null) {
            unusedDialImpl.setSn(x().getSn(hMBaseDeviceFindDevice));
        }
        kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain(), null, new c0(hMBaseDeviceFindDevice, null), 2, null);
    }

    private final DeviceSnService x() {
        return (DeviceSnService) this.snService.getValue();
    }

    private final void x0() {
        Context contextRequireContext = requireContext();
        int i2 = R.string.checking_new_apk;
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(contextRequireContext, getString(i2));
        loadingDialogShowDialog.setMessage(getString(i2));
        loadingDialogShowDialog.setCancelable(false);
        loadingDialogShowDialog.show();
        Unit unit = Unit.INSTANCE;
        this.updateCheckingDialog = loadingDialogShowDialog;
    }

    private final DeviceUpdateCheckerViewModel y() {
        return (DeviceUpdateCheckerViewModel) this.updateCheckerViewModel.getValue();
    }

    private final String y0(boolean z2) {
        return getString(z2 ? R.string.alert_enable : R.string.alert_disable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        LoadingDialog loadingDialog = this.updateCheckingDialog;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.dismiss();
        this.updateCheckingDialog = null;
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.AbstractDeviceFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.event.OperationTypeProvider
    @NotNull
    /* JADX INFO: renamed from: loadOperatorType, reason: from getter */
    public String getMAnalyticOperateType() {
        return this.mAnalyticOperateType;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View viewInflate = inflater.inflate(R.layout.fragment_device_setting, container, false);
        this.ivSkin = (AppCompatImageView) viewInflate.findViewById(R.id.iv_skin);
        this.ivDial = (AppCompatImageView) viewInflate.findViewById(R.id.iv_dial);
        this.ivDeviceTransparent = (AppCompatImageView) viewInflate.findViewById(R.id.iv_device_transparent);
        this.ivDefaultDevice = (AppCompatImageView) viewInflate.findViewById(R.id.iv_default_device);
        this.ivDeviceShadow = (AppCompatImageView) viewInflate.findViewById(R.id.iv_device_shadow);
        this.itemFindDevice = (DeviceSettingItemView) viewInflate.findViewById(R.id.item_find_device);
        this.viewHelper = new ViewHelper(viewInflate);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        o0();
        T();
        o();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Context context;
        super.onViewCreated(view, savedInstanceState);
        FeatureViewModel featureViewModel = getFeatureViewModel();
        if (featureViewModel != null) {
            featureViewModel.findDeviceSource();
        }
        q0();
        View view2 = getView();
        ExtKt.setVisible$default(view2 == null ? null : view2.findViewById(R.id.connect_state_layout), false, false, 2, null);
        k0();
        UpdateFragmentStartDelegate.INSTANCE.getOnUpdateStartEventListener().add(new UpdateStartListener() { // from class: com.xiaomi.hm.health.device.setting.ui.DeviceSettingFragment.onViewCreated.1

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.ui.DeviceSettingFragment$onViewCreated$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<Unit> {
                public static final a a = new a();

                public a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit getA() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.ui.DeviceSettingFragment$onViewCreated$1$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<Unit> {
                public static final b a = new b();

                public b() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit getA() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            }

            @Override // com.huami.assistant.ui.fragment.UpdateStartListener
            public void onStart(@NotNull Activity context2) {
                SchedulePermission.INSTANCE.askForGrandPermission(context2, a.a, b.a);
            }
        });
        View view3 = getView();
        ((RainbowTitleBar) (view3 != null ? view3.findViewById(R.id.toolbar) : null)).setBackgroundColor(0);
        int color = -1;
        if (Build.VERSION.SDK_INT >= 23 && (context = getContext()) != null) {
            color = context.getColor(R.color.s10);
        }
        this.newColor = color;
    }
}
