package com.xiaomi.hm.health.device.introduce;

import android.annotation.TargetApi;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.HMLoginManager;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicex.R;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.discovery.bridge.WebFragment;
import com.huami.discovery.bridge.WebLoadCallback;
import com.huami.discovery.bridge.model.WebItem;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.loc.z;
import com.xiaomi.hm.health.baseui.BaseTitleBarExtKt;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.bind.BindServiceApi;
import com.xiaomi.hm.health.device.bind.HMBindBaseLogic;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.event.HMDeviceSyncDataEvent;
import com.xiaomi.hm.health.device.event.HMDeviceSyncGpsDataEvent;
import com.xiaomi.hm.health.device.introduce.BindIntroduceMainFragment;
import com.xiaomi.hm.health.device.introduce.recocver.DeviceConfigRestore;
import com.xiaomi.hm.health.device.introduce.recocver.RestoreTask;
import com.xiaomi.hm.health.device.introduce.webintro.SwiperLastEvent;
import com.xiaomi.hm.health.device.introduce.webintro.WebIntroLoadingView;
import com.xiaomi.hm.health.device.introduce.webintro.WebIntroViewModel;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import de.greenrobot.event.EventBus;
import defpackage.yp8;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¾\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 ª\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0004ª\u0001EKB\t¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\bH\u0002J\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\bH\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\bH\u0002J\b\u0010\u0014\u001a\u00020\bH\u0002J\b\u0010\u0015\u001a\u00020\bH\u0002J\b\u0010\u0016\u001a\u00020\bH\u0002J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u001c\u001a\u00020\bH\u0002J\u000e\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u001fJ\u000e\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020 J\u000e\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020!J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010#\u001a\u00020\"H\u0016J\b\u0010$\u001a\u00020\"H\u0016J\b\u0010%\u001a\u00020\"H\u0016J\b\u0010'\u001a\u00020&H\u0016J\n\u0010)\u001a\u0004\u0018\u00010(H\u0016J\b\u0010+\u001a\u00020*H\u0016J\b\u0010-\u001a\u00020,H\u0016J\n\u0010.\u001a\u0004\u0018\u00010(H\u0016J\b\u0010/\u001a\u00020\u0011H\u0016J\u0010\u00101\u001a\u00020\b2\u0006\u00100\u001a\u00020\fH\u0016J&\u00109\u001a\u0004\u0018\u0001082\u0006\u00103\u001a\u0002022\b\u00105\u001a\u0004\u0018\u0001042\b\u00107\u001a\u0004\u0018\u000106H\u0016J\u0010\u0010;\u001a\u00020\b2\u0006\u0010:\u001a\u00020*H\u0016J\b\u0010<\u001a\u00020\bH\u0016J\b\u0010>\u001a\u00020=H\u0016J\u0018\u0010B\u001a\u00020\b2\u000e\u0010A\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010?H\u0016J\b\u0010C\u001a\u00020\bH\u0016R\u001d\u0010I\u001a\u00020D8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001d\u0010N\u001a\u00020J8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010F\u001a\u0004\bL\u0010MR\u001d\u0010S\u001a\u00020O8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010F\u001a\u0004\bQ\u0010RR\"\u0010U\u001a\u00020\u00118F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u0016\u0010[\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010\\\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010ZR\u0016\u0010^\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010ZR\u0016\u0010a\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010e\u001a\u00020b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR&\u0010j\u001a\u0012\u0012\u0004\u0012\u00020g0fj\b\u0012\u0004\u0012\u00020g`h8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010iR\u0016\u0010m\u001a\u00020k8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010lR\u0018\u0010o\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010nR\u0016\u0010r\u001a\u00020p8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010qR\u0016\u0010u\u001a\u00020s8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010tR\u0016\u0010x\u001a\u00020v8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010wR\u0016\u0010{\u001a\u00020y8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010zR\u0016\u0010|\u001a\u00020p8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010qR\u0016\u0010\u007f\u001a\u00020}8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010~R\u0019\u0010\u0082\u0001\u001a\u00030\u0080\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0012\u0010\u0081\u0001R\u0019\u0010\u0085\u0001\u001a\u00030\u0083\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u000b\u0010\u0084\u0001R\u0017\u0010\u0086\u0001\u001a\u00020}8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010~R\u001a\u0010\u008a\u0001\u001a\u00030\u0087\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008c\u0001\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010nR\u0017\u0010\u008d\u0001\u001a\u00020p8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010qR \u0010\u0090\u0001\u001a\u00030\u008e\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b\u001b\u0010F\u001a\u0005\b_\u0010\u008f\u0001R\u001f\u0010\u0092\u0001\u001a\u00020J8B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0005\b\u0091\u0001\u0010F\u001a\u0004\bc\u0010MR!\u0010\u0096\u0001\u001a\u00030\u0093\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010F\u001a\u0005\b]\u0010\u0095\u0001R\u001a\u0010\u009a\u0001\u001a\u00030\u0097\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0018\u0010\u009c\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009b\u0001\u0010TR\u001b\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001a\u0010£\u0001\u001a\u00030 \u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0018\u0010¥\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¤\u0001\u0010TR\u0018\u0010§\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¦\u0001\u0010T¨\u0006«\u0001"}, d2 = {"Lcom/xiaomi/hm/health/device/introduce/BindIntroduceMainFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/xiaomi/hm/health/device/introduce/IntroduceProvider;", "Lcom/xiaomi/hm/health/device/introduce/SwitchConditionProvider;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/device/introduce/RestoreChooseCallback;", "Lcom/xiaomi/hm/health/device/introduce/BindIntroEvent;", "event", "", GoogleApiAvailabilityLight.a, "u", "t", "", GoogleApiAvailabilityLight.b, "()Ljava/lang/Integer;", "m", com.google.android.exoplayer2.text.ttml.b.r, "", SOAP.XMLNS, "initView", "r", DTransferConstants.SEARCH_KEY, "o", "Lcom/xiaomi/hm/health/device/introduce/BindIntroStatus;", "status", "x", "", "y", "f", "Lcom/xiaomi/hm/health/device/event/HMDeviceConnectionEvent;", "onEventMainThread", "Lcom/xiaomi/hm/health/device/event/HMDeviceSyncDataEvent;", "Lcom/xiaomi/hm/health/device/event/HMDeviceSyncGpsDataEvent;", "Lcom/xiaomi/hm/health/device/introduce/webintro/SwiperLastEvent;", "Landroid/os/ConditionVariable;", "getConnectCondition", "getSyncCondition", "getSyncGpsCondition", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "getStopType", "Lcom/xiaomi/hm/health/databases/model/Device;", "getStopDevice", "Landroid/content/Context;", "getMyContext", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "getStartBleDevice", "getStartDevice", "needSyncData", "type", "showFailedDlg", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", DbUtils.Const.Table.CONTEXT, "onAttach", "onDetach", "Lcom/xiaomi/hm/health/device/introduce/IntroduceDisplayConfig;", "getDisplayConfig", "", "Lcom/xiaomi/hm/health/device/introduce/RestoreItem;", "list", "onEvent", "onDestroyView", "Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "a", "Lkotlin/Lazy;", "l", "()Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "navigator", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "b", z.j, "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApiLazy", "Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "c", hl.k, "()Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "keeperProxyApiLazy", "Z", "isWorking", "()Z", "setWorking", "(Z)V", "e", "Landroid/os/ConditionVariable;", "connectCondition", "syncCondition", "g", "syncGpsCondition", "h", "Lcom/xiaomi/hm/health/device/introduce/IntroduceDisplayConfig;", "config", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "i", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/device/introduce/BindIntroduceFragment;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "fragments", "Lcom/xiaomi/hm/health/device/introduce/BindIntroduceMainFragment$b;", "Lcom/xiaomi/hm/health/device/introduce/BindIntroduceMainFragment$b;", "handler", "Landroid/view/View;", "rootView", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "statusTv", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "statusIcon", "Landroidx/viewpager/widget/ViewPager;", "Landroidx/viewpager/widget/ViewPager;", "viewPager", "Lcom/xiaomi/hm/health/device/introduce/IntroduceIndicator;", "Lcom/xiaomi/hm/health/device/introduce/IntroduceIndicator;", "introduceIndicator", "introTitleTv", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "viewPagerContainer", "Landroid/widget/LinearLayout;", "Landroid/widget/LinearLayout;", "statusContainer", "Landroid/widget/Button;", "Landroid/widget/Button;", "startUseBtn", "bottomContainer", "Lcom/xiaomi/hm/health/device/introduce/webintro/WebIntroLoadingView;", "v", "Lcom/xiaomi/hm/health/device/introduce/webintro/WebIntroLoadingView;", "webIntroLoadingView", "w", "h5Container", "webIntroTitle", "Lcom/huami/devicex/manager/DeviceManagerApi;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "z", "deviceUtilsApi", "Lcom/xiaomi/hm/health/device/bind/BindServiceApi;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "()Lcom/xiaomi/hm/health/device/bind/BindServiceApi;", "bindServiceApi", "Lcom/xiaomi/hm/health/device/introduce/webintro/WebIntroViewModel;", "B", "Lcom/xiaomi/hm/health/device/introduce/webintro/WebIntroViewModel;", "viewModel", "C", "lastPageShowed", LogUtil.D, "Lcom/xiaomi/hm/health/device/introduce/BindIntroEvent;", "lastBindIntroEvent", "Lcom/xiaomi/hm/health/device/introduce/ChooseRestoreFragment;", "E", "Lcom/xiaomi/hm/health/device/introduce/ChooseRestoreFragment;", "chooseRestoreFragment", "F", "selected", "G", "h5Loaded", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BindIntroduceMainFragment extends Fragment implements IntroduceProvider, SwitchConditionProvider, KoinComponent, RestoreChooseCallback {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String H = "BindIntroduceMainFragment";

    @NotNull
    private static final String I = "source";
    private static final long J = 3000;
    private static final int K = 1;
    private static final int L = 700;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final Lazy bindServiceApi;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private WebIntroViewModel viewModel;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private boolean lastPageShowed;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    private BindIntroEvent lastBindIntroEvent;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private ChooseRestoreFragment chooseRestoreFragment;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private boolean selected;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private boolean h5Loaded;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilsApiLazy;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy keeperProxyApiLazy;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isWorking;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final ConditionVariable connectCondition;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final ConditionVariable syncCondition;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final ConditionVariable syncGpsCondition;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private IntroduceDisplayConfig config;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private HMDeviceSource source;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<BindIntroduceFragment> fragments;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final b handler;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private View rootView;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private TextView statusTv;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private ImageView statusIcon;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private ViewPager viewPager;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private IntroduceIndicator introduceIndicator;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private TextView introTitleTv;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private FrameLayout viewPagerContainer;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private LinearLayout statusContainer;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private Button startUseBtn;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private FrameLayout bottomContainer;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private WebIntroLoadingView webIntroLoadingView;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private View h5Container;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private TextView webIntroTitle;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilsApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/device/introduce/BindIntroduceMainFragment$Companion;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "Lcom/xiaomi/hm/health/device/introduce/BindIntroduceMainFragment;", "newInstance", "", "BANNER_DELAY", "J", "", "KEY_SOURCE", "Ljava/lang/String;", "", "MSG_NEXT", LogUtil.I, "SCROLL_SPEED", "TAG", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final BindIntroduceMainFragment newInstance(@NotNull HMDeviceSource source) {
            BindIntroduceMainFragment bindIntroduceMainFragment = new BindIntroduceMainFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("source", source);
            Unit unit = Unit.INSTANCE;
            bindIntroduceMainFragment.setArguments(bundle);
            return bindIntroduceMainFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BindIntroStatus.values().length];
            iArr[BindIntroStatus.CHOOSE_RECOVER.ordinal()] = 1;
            iArr[BindIntroStatus.RECOVER_OVER.ordinal()] = 2;
            iArr[BindIntroStatus.USE_FAIL.ordinal()] = 3;
            iArr[BindIntroStatus.STOP_START.ordinal()] = 4;
            iArr[BindIntroStatus.BIND_START.ordinal()] = 5;
            iArr[BindIntroStatus.USE_START.ordinal()] = 6;
            iArr[BindIntroStatus.RECOVER_START.ordinal()] = 7;
            iArr[BindIntroStatus.BIND_SUCCESS.ordinal()] = 8;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\tH\u0016¨\u0006\u0012"}, d2 = {"com/xiaomi/hm/health/device/introduce/BindIntroduceMainFragment$a", "Landroidx/fragment/app/FragmentPagerAdapter;", "", "position", "Landroidx/fragment/app/Fragment;", "getItem", "getCount", "Landroid/view/ViewGroup;", "container", "", "instantiateItem", "any", "", "destroyItem", "Landroidx/fragment/app/FragmentManager;", "fm", "<init>", "(Lcom/xiaomi/hm/health/device/introduce/BindIntroduceMainFragment;Landroidx/fragment/app/FragmentManager;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public final class a extends FragmentPagerAdapter {
        public a(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
        public void destroyItem(@NotNull ViewGroup container, int position, @NotNull Object any) {
            super.destroyItem(container, position % BindIntroduceMainFragment.this.fragments.size(), any);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        /* JADX INFO: renamed from: getCount */
        public int getA() {
            return Integer.MAX_VALUE;
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        @NotNull
        public Fragment getItem(int position) {
            return (Fragment) BindIntroduceMainFragment.this.fragments.get(position);
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
        @NotNull
        public Object instantiateItem(@NotNull ViewGroup container, int position) {
            return super.instantiateItem(container, position % BindIntroduceMainFragment.this.fragments.size());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"com/xiaomi/hm/health/device/introduce/BindIntroduceMainFragment$b", "Landroid/os/Handler;", "Landroid/os/Message;", "msg", "", "handleMessage", "Ljava/lang/ref/WeakReference;", "Lcom/xiaomi/hm/health/device/introduce/BindIntroduceMainFragment;", "a", "Ljava/lang/ref/WeakReference;", "weakReference", "fragment", "<init>", "(Lcom/xiaomi/hm/health/device/introduce/BindIntroduceMainFragment;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class b extends Handler {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final WeakReference<BindIntroduceMainFragment> weakReference;

        public b(@NotNull BindIntroduceMainFragment bindIntroduceMainFragment) {
            this.weakReference = new WeakReference<>(bindIntroduceMainFragment);
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            super.handleMessage(msg);
            BindIntroduceMainFragment bindIntroduceMainFragment = this.weakReference.get();
            if (bindIntroduceMainFragment != null && msg.what == 1) {
                ViewPager viewPager = bindIntroduceMainFragment.viewPager;
                Objects.requireNonNull(viewPager);
                viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
                sendEmptyMessageDelayed(1, 3000L);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/parameter/ParametersHolder;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<ParametersHolder> {
        public final /* synthetic */ List<RestoreItem> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends RestoreItem> list) {
            super(0);
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final ParametersHolder getA() {
            return ParametersHolderKt.parametersOf(BindIntroduceMainFragment.this.source, this.b, BindIntroduceMainFragment.this.getActivity());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ BindIntroEvent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(BindIntroEvent bindIntroEvent) {
            super(0);
            this.a = bindIntroEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "event:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/parameter/ParametersHolder;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<ParametersHolder> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final ParametersHolder getA() {
            return ParametersHolderKt.parametersOf(BindIntroduceMainFragment.this.source, CollectionsKt__CollectionsKt.arrayListOf(new DeviceConfigRestore(BindIntroduceMainFragment.this.source, BindIntroduceMainFragment.this.getActivity())), BindIntroduceMainFragment.this.getActivity());
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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "detached";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BindIntroduceMainFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.navigator = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<DeviceXNavigator>() { // from class: com.xiaomi.hm.health.device.introduce.BindIntroduceMainFragment$special$$inlined$inject$default$1
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
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(DeviceXNavigator.class), qualifier, objArr);
            }
        });
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceUtilsApiLazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.device.introduce.BindIntroduceMainFragment$special$$inlined$inject$default$2
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
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), objArr2, objArr3);
            }
        });
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.keeperProxyApiLazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<KeeperProxyApi>() { // from class: com.xiaomi.hm.health.device.introduce.BindIntroduceMainFragment$special$$inlined$inject$default$3
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
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(KeeperProxyApi.class), objArr4, objArr5);
            }
        });
        this.connectCondition = new ConditionVariable();
        this.syncCondition = new ConditionVariable();
        this.syncGpsCondition = new ConditionVariable();
        this.source = HMDeviceSource.VDEVICE;
        this.fragments = new ArrayList<>();
        this.handler = new b(this);
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.introduce.BindIntroduceMainFragment$special$$inlined$inject$default$4
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
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), objArr6, objArr7);
            }
        });
        final Object[] objArr8 = 0 == true ? 1 : 0;
        final Object[] objArr9 = 0 == true ? 1 : 0;
        this.deviceUtilsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.device.introduce.BindIntroduceMainFragment$special$$inlined$inject$default$5
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
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), objArr8, objArr9);
            }
        });
        final Object[] objArr10 = 0 == true ? 1 : 0;
        final Object[] objArr11 = 0 == true ? 1 : 0;
        this.bindServiceApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<BindServiceApi>() { // from class: com.xiaomi.hm.health.device.introduce.BindIntroduceMainFragment$special$$inlined$inject$default$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.bind.BindServiceApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final BindServiceApi getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(BindServiceApi.class), objArr10, objArr11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(final BindIntroEvent event) {
        LinearLayout linearLayout = this.statusContainer;
        Objects.requireNonNull(linearLayout);
        linearLayout.setVisibility(8);
        Button button = this.startUseBtn;
        Objects.requireNonNull(button);
        button.setVisibility(0);
        if (!ConfigHelperKt.hasFeature(this.source, Feature.SUPPORT_WEB_INTRO)) {
            int color = ContextCompat.getColor(requireContext(), R.color.s38);
            FrameLayout frameLayout = this.bottomContainer;
            Objects.requireNonNull(frameLayout);
            frameLayout.setBackgroundColor(color);
        }
        WebIntroLoadingView webIntroLoadingView = this.webIntroLoadingView;
        Objects.requireNonNull(webIntroLoadingView);
        webIntroLoadingView.stopLoading();
        Button button2 = this.startUseBtn;
        Objects.requireNonNull(button2);
        button2.setOnClickListener(new View.OnClickListener() { // from class: mw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BindIntroduceMainFragment.e(event, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(BindIntroEvent bindIntroEvent, BindIntroduceMainFragment bindIntroduceMainFragment, View view) {
        boolean z = false;
        if (bindIntroEvent != null && bindIntroEvent.getSuccess()) {
            z = true;
        }
        if (!z) {
            bindIntroduceMainFragment.t();
            return;
        }
        bindIntroduceMainFragment.l().navigateToDeviceSetting(bindIntroduceMainFragment.requireActivity(), bindIntroduceMainFragment.source);
        FragmentActivity activity = bindIntroduceMainFragment.getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        WebIntroLoadingView webIntroLoadingView = this.webIntroLoadingView;
        Objects.requireNonNull(webIntroLoadingView);
        webIntroLoadingView.stopLoading();
        WebIntroLoadingView webIntroLoadingView2 = this.webIntroLoadingView;
        Objects.requireNonNull(webIntroLoadingView2);
        ExtKt.setVisible$default(webIntroLoadingView2, false, false, 2, null);
        View view = this.h5Container;
        Objects.requireNonNull(view);
        ExtKt.setVisible$default(view, true, false, 2, null);
        TextView textView = this.webIntroTitle;
        Objects.requireNonNull(textView);
        ExtKt.setVisible$default(textView, true, false, 2, null);
    }

    private final BindServiceApi g() {
        return (BindServiceApi) this.bindServiceApi.getValue();
    }

    private final DeviceManagerApi h() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final DeviceUtilsApi i() {
        return (DeviceUtilsApi) this.deviceUtilsApi.getValue();
    }

    private final void initView() {
        this.statusTv = (TextView) this.rootView.findViewById(R.id.status_tv);
        this.statusIcon = (ImageView) this.rootView.findViewById(R.id.status_icon);
        this.viewPager = (ViewPager) this.rootView.findViewById(R.id.bind_introduce_view_pager);
        this.introduceIndicator = (IntroduceIndicator) this.rootView.findViewById(R.id.introduce_indicator);
        this.introTitleTv = (TextView) this.rootView.findViewById(R.id.intro_title_tv);
        this.viewPagerContainer = (FrameLayout) this.rootView.findViewById(R.id.view_pager_container);
        this.webIntroLoadingView = (WebIntroLoadingView) this.rootView.findViewById(R.id.loading_view);
        this.h5Container = this.rootView.findViewById(R.id.h5_container);
        this.webIntroTitle = (TextView) this.rootView.findViewById(R.id.web_intro_title);
        this.statusContainer = (LinearLayout) this.rootView.findViewById(R.id.status_container);
        this.startUseBtn = (Button) this.rootView.findViewById(R.id.start_use_btn);
        this.bottomContainer = (FrameLayout) this.rootView.findViewById(R.id.bottom_container);
        TextView textView = this.statusTv;
        Objects.requireNonNull(textView);
        BindIntroStatus bindIntroStatus = BindIntroStatus.BIND_START;
        textView.setText(y(bindIntroStatus));
        x(bindIntroStatus);
        if (!ConfigHelperKt.hasFeature(this.source, Feature.SUPPORT_WEB_INTRO)) {
            q();
        } else {
            o();
            r();
        }
    }

    private final DeviceUtilsApi j() {
        return (DeviceUtilsApi) this.deviceUtilsApiLazy.getValue();
    }

    private final KeeperProxyApi k() {
        return (KeeperProxyApi) this.keeperProxyApiLazy.getValue();
    }

    private final DeviceXNavigator l() {
        return (DeviceXNavigator) this.navigator.getValue();
    }

    private final int m() {
        return i().getImageForDevice(this.source);
    }

    private final Integer n() {
        if (getStopDevice() == null) {
            return null;
        }
        return Integer.valueOf(i().getImageForDevice(HMDeviceSource.fromValue(getStopDevice().getDevice_source().intValue())));
    }

    @JvmStatic
    @NotNull
    public static final BindIntroduceMainFragment newInstance(@NotNull HMDeviceSource hMDeviceSource) {
        return INSTANCE.newInstance(hMDeviceSource);
    }

    private final void o() {
        ViewPager viewPager = this.viewPager;
        Objects.requireNonNull(viewPager);
        ExtKt.setVisible$default(viewPager, false, false, 2, null);
        IntroduceIndicator introduceIndicator = this.introduceIndicator;
        Objects.requireNonNull(introduceIndicator);
        ExtKt.setVisible$default(introduceIndicator, false, false, 2, null);
        TextView textView = this.introTitleTv;
        Objects.requireNonNull(textView);
        ExtKt.setVisible$default(textView, false, false, 2, null);
        FrameLayout frameLayout = this.viewPagerContainer;
        Objects.requireNonNull(frameLayout);
        ExtKt.setVisible$default(frameLayout, false, false, 2, null);
        FragmentActivity activity = getActivity();
        BaseTitleActivity baseTitleActivity = activity instanceof BaseTitleActivity ? (BaseTitleActivity) activity : null;
        if (baseTitleActivity == null) {
            return;
        }
        BaseTitleBarExtKt.setTitleBar(baseTitleActivity, "", null, R.color.trans, BaseTitleActivity.STYLE.NONE);
    }

    private final void p() {
        IntroduceDisplayConfig introduceDisplayConfigCreateDisplayConfig = IntroduceShuffleFactoryKt.createDisplayConfig(this.source);
        this.config = introduceDisplayConfigCreateDisplayConfig;
        Objects.requireNonNull(introduceDisplayConfigCreateDisplayConfig);
        int i = 0;
        for (Object obj : introduceDisplayConfigCreateDisplayConfig.getItems()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            this.fragments.add(BindIntroduceFragment.INSTANCE.newInstance(this.source, i));
            i = i2;
        }
    }

    private final void q() {
        ViewPager viewPager = this.viewPager;
        Objects.requireNonNull(viewPager);
        viewPager.setAdapter(new a(getChildFragmentManager()));
        ViewPager viewPager2 = this.viewPager;
        Objects.requireNonNull(viewPager2);
        viewPager2.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.xiaomi.hm.health.device.introduce.BindIntroduceMainFragment$initNativeUI$1
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int state) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int position) {
                IntroduceIndicator introduceIndicator = this.a.introduceIndicator;
                Objects.requireNonNull(introduceIndicator);
                introduceIndicator.setSelectIndex(position % this.a.fragments.size());
                if (this.a.s()) {
                    this.a.lastPageShowed = true;
                }
                if (this.a.s()) {
                    BindIntroEvent bindIntroEvent = this.a.lastBindIntroEvent;
                    if ((bindIntroEvent == null ? null : bindIntroEvent.getStatus()) == BindIntroStatus.RECOVER_OVER) {
                        Button button = this.a.startUseBtn;
                        Objects.requireNonNull(button);
                        if (button.getVisibility() != 0) {
                            BindIntroduceMainFragment bindIntroduceMainFragment = this.a;
                            bindIntroduceMainFragment.d(bindIntroduceMainFragment.lastBindIntroEvent);
                        }
                    }
                }
            }
        });
        ViewPager viewPager3 = this.viewPager;
        Objects.requireNonNull(viewPager3);
        viewPager3.setCurrentItem(this.fragments.size() * 100000);
        IntroduceIndicator introduceIndicator = this.introduceIndicator;
        Objects.requireNonNull(introduceIndicator);
        introduceIndicator.setCount(this.fragments.size());
        IntroduceIndicator introduceIndicator2 = this.introduceIndicator;
        Objects.requireNonNull(introduceIndicator2);
        introduceIndicator2.setSelectIndex(0);
        ViewPagerScroller viewPagerScroller = new ViewPagerScroller(getActivity());
        viewPagerScroller.setScrollDuration(700);
        ViewPager viewPager4 = this.viewPager;
        Objects.requireNonNull(viewPager4);
        viewPagerScroller.initViewPagerScroll(viewPager4);
    }

    private final void r() {
        int i;
        WebIntroLoadingView webIntroLoadingView = this.webIntroLoadingView;
        Objects.requireNonNull(webIntroLoadingView);
        ExtKt.setVisible$default(webIntroLoadingView, true, false, 2, null);
        WebIntroLoadingView webIntroLoadingView2 = this.webIntroLoadingView;
        Objects.requireNonNull(webIntroLoadingView2);
        if (ConfigHelperKt.hasFeature(this.source, Feature.SQUARE_WATCH_S)) {
            i = R.drawable.web_intro_binding_square;
        } else {
            i = ConfigHelperKt.hasFeature(this.source, Feature.ROUND_WATCH_S) ? R.drawable.web_intro_binding_round : R.drawable.web_intro_binding_band;
        }
        webIntroLoadingView2.setIcon(i);
        WebIntroLoadingView webIntroLoadingView3 = this.webIntroLoadingView;
        Objects.requireNonNull(webIntroLoadingView3);
        webIntroLoadingView3.startLoading();
        View view = this.h5Container;
        Objects.requireNonNull(view);
        ExtKt.setVisible(view, false, false);
        if (getStopDevice() != null) {
            this.selected = true;
        }
        WebIntroViewModel webIntroViewModel = (WebIntroViewModel) new ViewModelProvider(this).get(WebIntroViewModel.class);
        this.viewModel = webIntroViewModel;
        Objects.requireNonNull(webIntroViewModel);
        webIntroViewModel.getUrlLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.introduce.BindIntroduceMainFragment$initWebUI$$inlined$observe$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                String str = (String) t;
                if (str == null) {
                    this.a.u();
                    return;
                }
                WebItem webItem = new WebItem();
                webItem.url = str;
                webItem.isShowLoadingTip = true;
                webItem.isUseCache = true;
                WebFragment webFragmentNewInstance = WebFragment.newInstance(webItem);
                final BindIntroduceMainFragment bindIntroduceMainFragment = this.a;
                webFragmentNewInstance.setLoadingCallback(new WebLoadCallback() { // from class: com.xiaomi.hm.health.device.introduce.BindIntroduceMainFragment$initWebUI$1$1
                    @Override // com.huami.discovery.bridge.WebLoadCallback
                    public void onError(int errorCode) {
                    }

                    @Override // com.huami.discovery.bridge.WebLoadCallback
                    public void onPageFinish() {
                        if (bindIntroduceMainFragment.selected) {
                            bindIntroduceMainFragment.f();
                        } else {
                            bindIntroduceMainFragment.h5Loaded = true;
                        }
                    }

                    @Override // com.huami.discovery.bridge.WebLoadCallback
                    public void onPageStart() {
                    }

                    @Override // com.huami.discovery.bridge.WebLoadCallback
                    public void onProgressChanged(int progress) {
                    }

                    @Override // com.huami.discovery.bridge.WebLoadCallback
                    public void onReceivedTitle(@Nullable String title) {
                    }

                    @Override // com.huami.discovery.bridge.WebLoadCallback
                    public /* synthetic */ void onSslError(SslError sslError) {
                        yp8.a(this, sslError);
                    }
                });
                this.a.getChildFragmentManager().beginTransaction().replace(R.id.h5_container, webFragmentNewInstance).commitAllowingStateLoss();
            }
        });
        WebIntroViewModel webIntroViewModel2 = this.viewModel;
        Objects.requireNonNull(webIntroViewModel2);
        webIntroViewModel2.loadUrl(this.source);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean s() {
        if (ConfigHelperKt.hasFeature(this.source, Feature.SUPPORT_WEB_INTRO)) {
            return false;
        }
        IntroduceIndicator introduceIndicator = this.introduceIndicator;
        Objects.requireNonNull(introduceIndicator);
        return introduceIndicator.getSelectIndex() == this.fragments.size() - 1;
    }

    private final void t() {
        if (getActivity() == null || getStartDevice() == null) {
            return;
        }
        l().navigateToUnused(getContext(), getStartDevice());
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        this.lastPageShowed = true;
        BindIntroEvent bindIntroEvent = this.lastBindIntroEvent;
        if ((bindIntroEvent == null ? null : bindIntroEvent.getStatus()) == BindIntroStatus.RECOVER_OVER) {
            Button button = this.startUseBtn;
            Objects.requireNonNull(button);
            if (button.getVisibility() != 0) {
                d(this.lastBindIntroEvent);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(BindIntroduceMainFragment bindIntroduceMainFragment, DialogInterface dialogInterface, int i) {
        bindIntroduceMainFragment.g().createSwitchDeviceStartTask(bindIntroduceMainFragment).execute(new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(BindIntroduceMainFragment bindIntroduceMainFragment, DialogInterface dialogInterface, int i) {
        bindIntroduceMainFragment.g().switchDeviceDestroyDevice(bindIntroduceMainFragment.getStopDevice(), bindIntroduceMainFragment.getStartBleDevice());
        EventBus.getDefault().post(new BindIntroEvent(BindIntroStatus.RECOVER_OVER, false));
    }

    private final void x(BindIntroStatus status) {
        int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i != 1) {
            switch (i) {
                case 4:
                    Integer numN = n();
                    if (numN != null) {
                        int iIntValue = numN.intValue();
                        ImageView imageView = this.statusIcon;
                        Objects.requireNonNull(imageView);
                        imageView.setImageResource(iIntValue);
                        break;
                    }
                    break;
            }
        }
        ImageView imageView2 = this.statusIcon;
        Objects.requireNonNull(imageView2);
        imageView2.setImageResource(m());
    }

    private final String y(BindIntroStatus status) {
        int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i != 1) {
            switch (i) {
                case 4:
                    return getString(R.string.intro_stoping_device);
                case 5:
                    return getString(R.string.device_binding);
                case 6:
                    return getString(R.string.start_device_now);
                case 7:
                    return getString(R.string.intro_recovering_settings_device);
                case 8:
                    break;
                default:
                    return "";
            }
        }
        return getString(R.string.device_bind_success);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.xiaomi.hm.health.device.introduce.SwitchConditionProvider
    @NotNull
    public ConditionVariable getConnectCondition() {
        return this.connectCondition;
    }

    @Override // com.xiaomi.hm.health.device.introduce.IntroduceProvider
    @NotNull
    public IntroduceDisplayConfig getDisplayConfig() {
        IntroduceDisplayConfig introduceDisplayConfig = this.config;
        Objects.requireNonNull(introduceDisplayConfig);
        return introduceDisplayConfig;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.device.introduce.SwitchConditionProvider
    @NotNull
    public Context getMyContext() {
        return requireContext();
    }

    @Override // com.xiaomi.hm.health.device.introduce.SwitchConditionProvider
    @NotNull
    public HMBaseDevice getStartBleDevice() {
        return HMBindBaseLogic.getBleDevice();
    }

    @Override // com.xiaomi.hm.health.device.introduce.SwitchConditionProvider
    @Nullable
    public Device getStartDevice() {
        if (getActivity() == null) {
            return null;
        }
        return g().getStartBindDevice(getActivity());
    }

    @Override // com.xiaomi.hm.health.device.introduce.SwitchConditionProvider
    @Nullable
    public Device getStopDevice() {
        return h().getConflictDevice(this.source);
    }

    @Override // com.xiaomi.hm.health.device.introduce.SwitchConditionProvider
    @NotNull
    public HMDeviceType getStopType() {
        return this.source.getType();
    }

    @Override // com.xiaomi.hm.health.device.introduce.SwitchConditionProvider
    @NotNull
    public ConditionVariable getSyncCondition() {
        return this.syncCondition;
    }

    @Override // com.xiaomi.hm.health.device.introduce.SwitchConditionProvider
    @NotNull
    public ConditionVariable getSyncGpsCondition() {
        return this.syncGpsCondition;
    }

    public final boolean isWorking() {
        return isAdded() && this.isWorking;
    }

    @Override // com.xiaomi.hm.health.device.introduce.SwitchConditionProvider
    public boolean needSyncData() {
        return BindIntroExtendsKt.needSyncData(getStopDevice(), getStopType());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        BaseTitleActivity baseTitleActivity = activity instanceof BaseTitleActivity ? (BaseTitleActivity) activity : null;
        if (baseTitleActivity == null) {
            return;
        }
        baseTitleActivity.setContentViewBehindTitleBar(false, false);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        this.rootView = inflater.inflate(R.layout.activity_bind_introduce, container, false);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("source");
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMDeviceSource");
            this.source = (HMDeviceSource) serializable;
        }
        if (!ConfigHelperKt.hasFeature(this.source, Feature.SUPPORT_WEB_INTRO)) {
            p();
        }
        initView();
        EventBus.getDefault().register(this);
        return this.rootView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        WebIntroLoadingView webIntroLoadingView = this.webIntroLoadingView;
        Objects.requireNonNull(webIntroLoadingView);
        webIntroLoadingView.stopLoading();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.handler.removeCallbacksAndMessages(null);
        EventBus.getDefault().unregister(this);
    }

    @Override // com.xiaomi.hm.health.device.introduce.RestoreChooseCallback
    public void onEvent(@Nullable List<? extends RestoreItem> list) {
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        ChooseRestoreFragment chooseRestoreFragment = this.chooseRestoreFragment;
        Objects.requireNonNull(chooseRestoreFragment);
        fragmentTransactionBeginTransaction.remove(chooseRestoreFragment).commitAllowingStateLoss();
        this.selected = true;
        if (this.h5Loaded) {
            f();
        }
        Koin koin = getKoin();
        ((RestoreTask) koin.getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(RestoreTask.class), null, new c(list))).work();
    }

    public final void onEventMainThread(@NotNull HMDeviceConnectionEvent event) {
        if (event.getDeviceType() == getStopType() && event.isConnected()) {
            this.connectCondition.open();
        }
    }

    public final void setWorking(boolean z) {
        this.isWorking = z;
    }

    @Override // com.xiaomi.hm.health.device.introduce.SwitchConditionProvider
    public void showFailedDlg(int type) {
        if (getActivity() == null || isDetached()) {
            HMLog.info(H, f.a);
        } else {
            new AlertDialogFragment.Builder(getActivity()).setMessage(type == g().getFlag("HMSwitchDeviceActivity#STOP_NOT_CONNECTED") ? R.string.connect_failed_tips : R.string.sync_failed_tips).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: lw
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    BindIntroduceMainFragment.v(this.a, dialogInterface, i);
                }
            }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: kw
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    BindIntroduceMainFragment.w(this.a, dialogInterface, i);
                }
            }).setCancelable(false).create().show(requireActivity().getSupportFragmentManager());
        }
    }

    public final void onEventMainThread(@NotNull HMDeviceSyncDataEvent event) {
        if (event.getDeviceType() == getStopType() && event.isStop()) {
            this.syncCondition.open();
        }
    }

    public final void onEventMainThread(@NotNull HMDeviceSyncGpsDataEvent event) {
        if (event.getDeviceType() == getStopType() && event.isStop()) {
            this.syncGpsCondition.open();
        }
    }

    public final void onEventMainThread(@NotNull SwiperLastEvent event) {
        if (j().xiaoAiReginAccess() && event.getShowMiotPermission()) {
            k().setUserHaveBoundDeviceFirstlyShowMiotPermissionInDeviceIntroduceActivity(HMLoginManager.getValidUid(), true);
        }
        u();
    }

    @TargetApi(3)
    public final void onEventMainThread(@NotNull BindIntroEvent event) {
        HMLog.info(H, new d(event));
        this.lastBindIntroEvent = event;
        if (event.getStatus() != BindIntroStatus.CHOOSE_RECOVER) {
            TextView textView = this.statusTv;
            Objects.requireNonNull(textView);
            textView.setText(y(event.getStatus()));
        }
        x(event.getStatus());
        int i = WhenMappings.$EnumSwitchMapping$0[event.getStatus().ordinal()];
        if (i == 1) {
            if (ConfigHelperKt.hasFeature(this.source, Feature.SELECT_RESTORE_SOURCE)) {
                this.chooseRestoreFragment = ChooseRestoreFragment.INSTANCE.newInstance(this.source, true);
                FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
                int i2 = R.id.choose_restore_container;
                ChooseRestoreFragment chooseRestoreFragment = this.chooseRestoreFragment;
                Objects.requireNonNull(chooseRestoreFragment);
                fragmentTransactionBeginTransaction.replace(i2, chooseRestoreFragment).commitAllowingStateLoss();
                return;
            }
            EventBus.getDefault().post(new BindIntroEvent(BindIntroStatus.RECOVER_START, true));
            Koin koin = getKoin();
            ((RestoreTask) koin.getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(RestoreTask.class), null, new e())).work();
            return;
        }
        if (i != 2) {
            if (i == 3) {
                t();
                return;
            } else {
                if (i != 4) {
                    return;
                }
                if (needSyncData()) {
                    g().createSwitchDeviceStopTask(this).execute(new Void[0]);
                    return;
                } else {
                    g().createSwitchDeviceStartTask(this).execute(new Void[0]);
                    return;
                }
            }
        }
        if (!s() && !this.lastPageShowed) {
            ImageView imageView = this.statusIcon;
            Objects.requireNonNull(imageView);
            imageView.setImageResource(m());
            TextView textView2 = this.statusTv;
            Objects.requireNonNull(textView2);
            textView2.setText(getString(R.string.intro_recover_settings_success_device));
            return;
        }
        d(this.lastBindIntroEvent);
    }
}
