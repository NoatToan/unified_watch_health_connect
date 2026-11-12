package com.xiaomi.hm.health.nfc;

import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.LifecycleOwnerKt;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.account.HMLoginManager;
import com.huami.account.HMLogoutManager;
import com.huami.account.XiaomiTokenMananger;
import com.huami.account.bean.LogoutResult;
import com.huami.account.event.EventAccountStatus;
import com.huami.account.ui.areas.SelectAreaHelper;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.arch.core.State;
import com.huami.arch.core.StateBuilder;
import com.huami.arch.core.Success;
import com.huami.devicex.R;
import com.huami.devicex.injection.basic.AccountWebExtApi;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.injection.basic.NFCApi;
import com.huami.mastercard.ui.mifit.MasterCardActivity;
import com.huami.mastercard.ui.mifit.MasterFuncConfigKt;
import com.huami.mastercard.ui.mifit.service.NotificationPollingService;
import com.huami.mastercard.ui.mifit.utils.LoadingWidget;
import com.huami.mastercard.ui.mifit.viewmodel.MasterCardEntranceViewModel;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.nfc.base.ExtensionsKt;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.door.DoorCardInfo;
import com.huami.nfc.web.NfcDevice;
import com.huami.nfc.web.NfcDeviceKt;
import com.huami.passport.ErrorCode;
import com.huami.passport.utils.Utils;
import com.huami.tools.log.HMLog;
import com.huami.utils.easypermission.EasyPermissions;
import com.huami.utils.easypermission.PermissionDialogFragmentCompat;
import com.huami.wallet.accessdoor.activity.AccessCardDetailActivity;
import com.huami.wallet.accessdoor.activity.AccessCardListActivity;
import com.huami.wallet.accessdoor.activity.SelectDoorTypeActivity;
import com.huami.wallet.accessdoor.api.CloudAccessDoorSource;
import com.huami.wallet.accessdoor.api.service.AccessDoorDataSource;
import com.huami.wallet.accessdoor.entity.DoorInfoAndDefaultCard;
import com.huami.wallet.accessdoor.utils.EventId;
import com.huami.wallet.accessdoor.viewmodel.DoorEntranceViewModel;
import com.huami.wallet.common.entity.SupportMasterCountry;
import com.huami.wallet.lib.entity.BusCardSimple2;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.ui.helper.LiveDataExtensionKt;
import com.huami.wallet.ui.helper.LoadingDialogHelper;
import com.huami.wallet.ui.navigation.NavigationController;
import com.huami.wallet.ui.viewmodel.EntranceViewModel;
import com.huami.wallet.unionpay.unionpayuimifit.activity.UnionpayHostActivity;
import com.huami.wallet.unionpay.unionpayuimifit.repo.entity.BankCardInfo;
import com.huami.wallet.unionpay.unionpayuimifit.repo.entity.VCStatus;
import com.huami.wallet.unionpay.unionpayuimifit.repo.viewapi.LoadingWidgetApi;
import com.huami.wallet.unionpay.unionpayuimifit.repo.viewmodel.BaseViewModelKt;
import com.huami.wallet.unionpay.unionpayuimifit.repo.viewmodel.UPEntranceViewModel;
import com.huami.wallet.unionpay.unionpayuimifit.view.LoadingWidgetImpl;
import com.huami.watch.notification.TransportUri;
import com.huami.watch.util.I18nUtil;
import com.huami.watchfacesstore.ext.KoinExtKt;
import com.huami.widget.toast.CustomToastKtxKt;
import com.huami.widget.toast.IconToastKtxKt;
import com.loc.z;
import com.service.mi.wallet.entity.resp.CardListResp;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.baseutil.SmartExecutor;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.NfcDeviceConfigKt;
import com.xiaomi.hm.health.device.OffWistSettingActivity;
import com.xiaomi.hm.health.device.cincoentrance.CincoEntranceHelperKt;
import com.xiaomi.hm.health.device.feature.sync.SyncCenterManager;
import com.xiaomi.hm.health.discovery.WebHelper;
import com.xiaomi.hm.health.eventbus.EventHttpError;
import com.xiaomi.hm.health.manager.UnitManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.nfc.WalletMiFitFragment;
import com.xiaomi.hm.health.nfc.ext.ResourceExtKt;
import com.xiaomi.hm.health.nfc.master.MasterCardConfigKt;
import com.xiaomi.hm.health.permission.PermissionManager;
import de.greenrobot.event.EventBus;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u009d\u00012\u00020\u00012\u00020\u0002:\u0002\u009d\u0001B\t¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0002J\b\u0010\t\u001a\u00020\u0003H\u0002J\b\u0010\n\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\u0005H\u0002J\b\u0010\f\u001a\u00020\u0003H\u0002J\b\u0010\r\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0002J\b\u0010\u000f\u001a\u00020\u0003H\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0002J\u0016\u0010\u0014\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0003H\u0002J\b\u0010\u0016\u001a\u00020\u0003H\u0002J\b\u0010\u0017\u001a\u00020\u0005H\u0002J\b\u0010\u0018\u001a\u00020\u0003H\u0002J\b\u0010\u0019\u001a\u00020\u0003H\u0002J\u0018\u0010\u001d\u001a\u00020\u00032\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0002J\b\u0010\u001e\u001a\u00020\u0003H\u0002J\b\u0010 \u001a\u00020\u001fH\u0002J\b\u0010!\u001a\u00020\u0003H\u0002J\u0012\u0010#\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u001fH\u0002J\b\u0010$\u001a\u00020\u0003H\u0002J\b\u0010%\u001a\u00020\u0003H\u0002J\u0016\u0010'\u001a\u00020\u00032\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0002J0\u0010-\u001a\u00020\u00032\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u001f2\b\b\u0002\u0010+\u001a\u00020\u00052\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0002J\u001e\u0010/\u001a\u00020\u00032\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010.\u001a\u00020\u001fH\u0002J\u0016\u00100\u001a\u00020\u00032\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0002J\b\u00101\u001a\u00020\u0003H\u0002J&\u00104\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u001f2\u0006\u00102\u001a\u00020(2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0002J\u0016\u00105\u001a\u00020\u00032\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0002J0\u00107\u001a\u00020\u00032\b\u00106\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020\u001f2\u0006\u00102\u001a\u00020(2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0002J&\u0010?\u001a\u0004\u0018\u00010>2\u0006\u00109\u001a\u0002082\b\u0010;\u001a\u0004\u0018\u00010:2\b\u0010=\u001a\u0004\u0018\u00010<H\u0016J\u001a\u0010A\u001a\u00020\u00032\u0006\u0010@\u001a\u00020>2\b\u0010=\u001a\u0004\u0018\u00010<H\u0016J\b\u0010B\u001a\u00020\u0003H\u0016J\b\u0010C\u001a\u00020\u0003H\u0016J\u000e\u0010F\u001a\u00020\u00032\u0006\u0010E\u001a\u00020DJ\u000e\u0010I\u001a\u00020\u00032\u0006\u0010H\u001a\u00020GJ/\u0010O\u001a\u00020\u00032\u0006\u0010J\u001a\u00020(2\u000e\u0010L\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f0K2\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bO\u0010PJ\u001e\u0010S\u001a\u00020\u00032\u0006\u0010J\u001a\u00020(2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u001f0QH\u0016J\u001e\u0010T\u001a\u00020\u00032\u0006\u0010J\u001a\u00020(2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u001f0QH\u0016J\u0012\u0010V\u001a\u00020\u0003*\u00020>2\u0006\u0010U\u001a\u00020\u0005R\u0016\u0010Z\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010^\u001a\u00020[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010b\u001a\u00020_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010f\u001a\u00020c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010j\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010n\u001a\u00020k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u001d\u0010t\u001a\u00020o8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR#\u0010z\u001a\b\u0012\u0004\u0012\u00020v0u8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bw\u0010q\u001a\u0004\bx\u0010yR)\u0010~\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020{0\u001a0u8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b|\u0010q\u001a\u0004\b}\u0010yR!\u0010\u0083\u0001\u001a\u00020\u007f8B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0080\u0001\u0010q\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\"\u0010\u0088\u0001\u001a\u00030\u0084\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0085\u0001\u0010q\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\"\u0010\u008d\u0001\u001a\u00030\u0089\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008a\u0001\u0010q\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001a\u0010\u0091\u0001\u001a\u00030\u008e\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\"\u0010\u0096\u0001\u001a\u00030\u0092\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0093\u0001\u0010q\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001c\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0097\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001¨\u0006\u009e\u0001"}, d2 = {"Lcom/xiaomi/hm/health/nfc/WalletMiFitFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/huami/utils/easypermission/EasyPermissions$PermissionCallbacks;", "", "L", "", "V", "U", "P", "e0", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "B", "p0", "E", "H", LogUtil.I, "K", "Lkotlin/Function0;", TransportUri.ACTION_BLOCK, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "C", "R", "W", "N", "k0", "", "Lcom/huami/nfc/door/DoorCardInfo;", "list", "r0", "c0", "", "u", "m0", "message", "f0", "s0", "d0", "onPass", "r", "", "type", "typeResource", "isMiTokenError", "runnable", com.google.android.exoplayer2.text.ttml.b.r, "xiaomiId", "b0", "t0", "X", "positiveRes", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "g0", "i0", "title", "h0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onDestroyView", "onDestroy", "Lcom/huami/account/event/EventAccountStatus;", "status", "onEventMainThread", "Lcom/xiaomi/hm/health/eventbus/EventHttpError;", "eventHttpError", "onEventBackgroundThread", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "", "perms", "onPermissionsDenied", "onPermissionsGranted", "visible", "setVisible", "Lcom/huami/wallet/ui/navigation/NavigationController;", "a", "Lcom/huami/wallet/ui/navigation/NavigationController;", "walletNavigationController", "Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;", "b", "Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;", "cloudAccessDoorSource", "Lcom/huami/wallet/ui/viewmodel/EntranceViewModel;", "c", "Lcom/huami/wallet/ui/viewmodel/EntranceViewModel;", "walletEntranceViewModel", "Lcom/huami/wallet/accessdoor/viewmodel/DoorEntranceViewModel;", GoogleApiAvailabilityLight.a, "Lcom/huami/wallet/accessdoor/viewmodel/DoorEntranceViewModel;", "mDoorEntranceViewModel", "Lcom/huami/wallet/unionpay/unionpayuimifit/repo/viewmodel/UPEntranceViewModel;", "e", "Lcom/huami/wallet/unionpay/unionpayuimifit/repo/viewmodel/UPEntranceViewModel;", "upEntranceViewModel", "Lcom/huami/mastercard/ui/mifit/viewmodel/MasterCardEntranceViewModel;", "f", "Lcom/huami/mastercard/ui/mifit/viewmodel/MasterCardEntranceViewModel;", "masterCardEntranceViewModel", "Lcom/huami/wallet/unionpay/unionpayuimifit/repo/viewapi/LoadingWidgetApi;", "g", "Lkotlin/Lazy;", "z", "()Lcom/huami/wallet/unionpay/unionpayuimifit/repo/viewapi/LoadingWidgetApi;", "upLoadingView", "Lcom/huami/mastercard/ui/mifit/utils/LoadingWidget;", "Lcom/service/mi/wallet/entity/resp/CardListResp;", "h", "w", "()Lcom/huami/mastercard/ui/mifit/utils/LoadingWidget;", "loadingView", "Lcom/huami/wallet/common/entity/SupportMasterCountry;", "i", "t", "checkLoadingView", "Lcom/huami/devicex/injection/basic/NFCApi;", z.j, "x", "()Lcom/huami/devicex/injection/basic/NFCApi;", "nfcApi", "Lcom/huami/nfc/web/NfcDevice;", hl.k, "y", "()Lcom/huami/nfc/web/NfcDevice;", "nfcDevice", "Lcom/huami/devicex/injection/basic/AccountWebExtApi;", "l", SOAP.XMLNS, "()Lcom/huami/devicex/injection/basic/AccountWebExtApi;", "accountWebExtApi", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "m", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "loadingDialogHelper", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", GoogleApiAvailabilityLight.b, "v", "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApi", "Lio/reactivex/disposables/Disposable;", "o", "Lio/reactivex/disposables/Disposable;", "permissionsSubscribe", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WalletMiFitFragment extends Fragment implements EasyPermissions.PermissionCallbacks {
    public static final int HTTP_CODE_401 = 401;
    public static final int NFC_TYPE_BUS = 1;
    public static final int NFC_TYPE_DOOR = 2;
    public static final int NFC_TYPE_MASTER = 3;
    public static final int NFC_TYPE_UNIONPAY = 4;
    public static final int PERMISSION_COUNT = 3;
    public static final int SDK_NUMBER = 23;

    @NotNull
    private static final String p = "WalletFragment";

    @NotNull
    private static final String q = "bus";

    @NotNull
    private static final String r = "door";

    @NotNull
    private static final String s = "bank";

    @NotNull
    private static final String t = "master_bank";

    @NotNull
    private static final String u = "https://help.jr.mi.com/?app=com.mipay.wallet#/p/96e3916f-42d0-41c9-a18d-50ee3ad064ef?P=1";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private NavigationController walletNavigationController = (NavigationController) ComponentCallbackExtKt.getKoin(this).getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(NavigationController.class), null, null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private AccessDoorDataSource cloudAccessDoorSource = (AccessDoorDataSource) ComponentCallbackExtKt.getKoin(this).getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AccessDoorDataSource.class), null, null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private EntranceViewModel walletEntranceViewModel = (EntranceViewModel) ComponentCallbackExtKt.getKoin(this).getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(EntranceViewModel.class), null, null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private DoorEntranceViewModel mDoorEntranceViewModel = (DoorEntranceViewModel) ComponentCallbackExtKt.getKoin(this).getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(DoorEntranceViewModel.class), null, null);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private UPEntranceViewModel upEntranceViewModel = (UPEntranceViewModel) ComponentCallbackExtKt.getKoin(this).getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(UPEntranceViewModel.class), null, null);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private MasterCardEntranceViewModel masterCardEntranceViewModel = (MasterCardEntranceViewModel) ComponentCallbackExtKt.getKoin(this).getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(MasterCardEntranceViewModel.class), null, null);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy upLoadingView = LazyKt__LazyJVMKt.lazy(new v());

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy loadingView = LazyKt__LazyJVMKt.lazy(new o());

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy checkLoadingView = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy nfcApi;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy nfcDevice;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy accountWebExtApi;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private LoadingDialogHelper loadingDialogHelper;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilsApi;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    private Disposable permissionsSubscribe;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/mastercard/ui/mifit/utils/LoadingWidget;", "", "Lcom/huami/wallet/common/entity/SupportMasterCountry;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<LoadingWidget<List<? extends SupportMasterCountry>>> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingWidget<List<SupportMasterCountry>> getA() {
            return new LoadingWidget<>(WalletMiFitFragment.this.requireActivity(), 0, 2, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.nfc.WalletMiFitFragment$handleItemClick$1", f = "WalletMiFitFragment.kt", i = {}, l = {491}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Function0<Unit> c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.nfc.WalletMiFitFragment$handleItemClick$1$result$1", f = "WalletMiFitFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            public int a;
            public final /* synthetic */ WalletMiFitFragment b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WalletMiFitFragment walletMiFitFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = walletMiFitFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(NfcDeviceConfigKt.needJudgeWrist() ? this.b.W() : true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function0<Unit> function0, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WalletMiFitFragment.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LoadingDialogHelper loadingDialogHelper = WalletMiFitFragment.this.loadingDialogHelper;
                Objects.requireNonNull(loadingDialogHelper);
                loadingDialogHelper.showLoading();
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(WalletMiFitFragment.this, null);
                this.a = 1;
                obj = BuildersKt.withContext(io2, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            LoadingDialogHelper loadingDialogHelper2 = WalletMiFitFragment.this.loadingDialogHelper;
            Objects.requireNonNull(loadingDialogHelper2);
            loadingDialogHelper2.hideLoading();
            if (zBooleanValue) {
                this.c.getA();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
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
            WalletMiFitFragment.this.d0();
            WalletMiFitFragment.this.masterCardEntranceViewModel.userLogin();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ WalletMiFitFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WalletMiFitFragment walletMiFitFragment) {
                super(0);
                this.a = walletMiFitFragment;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.d0();
                this.a.upEntranceViewModel.checkCardCount();
            }
        }

        public d() {
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
            if (!HMLoginManager.isMainlandUser()) {
                WalletMiFitFragment.this.m0();
            } else {
                WalletMiFitFragment walletMiFitFragment = WalletMiFitFragment.this;
                walletMiFitFragment.p(4, walletMiFitFragment.getString(R.string.up_mi_pay), false, new a(WalletMiFitFragment.this));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ WalletMiFitFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WalletMiFitFragment walletMiFitFragment) {
                super(0);
                this.a = walletMiFitFragment;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.d0();
                this.a.walletEntranceViewModel.checkThenEnterWallet();
            }
        }

        public e() {
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
            if (!HMLoginManager.isMainlandUser()) {
                WalletMiFitFragment.this.m0();
            } else if (!NfcDeviceKt.isXiaomiDevice(WalletMiFitFragment.this.y().getDeviceModel())) {
                WalletMiFitFragment.this.walletEntranceViewModel.checkThenEnterWallet();
            } else {
                WalletMiFitFragment walletMiFitFragment = WalletMiFitFragment.this;
                walletMiFitFragment.p(1, walletMiFitFragment.getString(R.string.bus_card_pay_v2), false, new a(WalletMiFitFragment.this));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Resource;", "", "kotlin.jvm.PlatformType", "resource", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<Resource<String>, Unit> {
        public f() {
            super(1);
        }

        public final void a(Resource<String> resource) {
            LoadingDialogHelper loadingDialogHelper = WalletMiFitFragment.this.loadingDialogHelper;
            Objects.requireNonNull(loadingDialogHelper);
            loadingDialogHelper.showOrError(resource);
            if (resource.status == Status.SUCCESS) {
                WalletMiFitFragment.this.f0(resource.data);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<String> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Resource;", "", "Lcom/huami/wallet/lib/entity/BusCardSimple2;", "resource", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<Resource<List<? extends BusCardSimple2>>, Unit> {
        public g() {
            super(1);
        }

        public final void a(@NotNull Resource<List<BusCardSimple2>> resource) {
            LoadingDialogHelper loadingDialogHelper = WalletMiFitFragment.this.loadingDialogHelper;
            Objects.requireNonNull(loadingDialogHelper);
            loadingDialogHelper.showOrError(resource);
            if (resource.status == Status.SUCCESS) {
                List<BusCardSimple2> list = resource.data;
                int size = (list == null || !(list.isEmpty() ^ true)) ? 0 : resource.data.size();
                if (size == 1) {
                    BusCardSimple2 busCardSimple2 = resource.data.get(0);
                    WalletMiFitFragment.this.walletNavigationController.navigateToBusCardDetail(WalletMiFitFragment.this.requireActivity(), busCardSimple2.id, busCardSimple2.name, busCardSimple2.xiaomiCardName, busCardSimple2.imageUrl, busCardSimple2.shiftEnable.booleanValue(), busCardSimple2.packageName, busCardSimple2.appName, busCardSimple2.redirectTo, busCardSimple2.serviceContact);
                } else if (size > 1) {
                    WalletMiFitFragment.this.walletNavigationController.navigateToOpenedBusCardList(WalletMiFitFragment.this.requireActivity());
                } else {
                    WalletMiFitFragment.this.walletNavigationController.navigateToRemindOpenBusCard(WalletMiFitFragment.this.requireActivity());
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<List<? extends BusCardSimple2>> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ WalletMiFitFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WalletMiFitFragment walletMiFitFragment) {
                super(0);
                this.a = walletMiFitFragment;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.d0();
                DoorEntranceViewModel.getCardList$default(this.a.mDoorEntranceViewModel, false, 1, null);
            }
        }

        public h() {
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
            if (!HMLoginManager.isMainlandUser()) {
                WalletMiFitFragment.this.m0();
            } else if (!NfcDeviceKt.isXiaomiDevice(WalletMiFitFragment.this.y().getDeviceModel())) {
                DoorEntranceViewModel.getCardList$default(WalletMiFitFragment.this.mDoorEntranceViewModel, false, 1, null);
            } else {
                WalletMiFitFragment walletMiFitFragment = WalletMiFitFragment.this;
                walletMiFitFragment.p(2, walletMiFitFragment.getString(R.string.access_door_card_simulation), false, new a(WalletMiFitFragment.this));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001 \u0003*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "", "Lcom/huami/nfc/door/DoorCardInfo;", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function1<com.huami.wallet.accessdoor.helper.Resource<List<? extends DoorCardInfo>>, Unit> {
        public i() {
            super(1);
        }

        public final void a(com.huami.wallet.accessdoor.helper.Resource<List<DoorCardInfo>> resource) throws Exception {
            LoadingDialogHelper loadingDialogHelper = WalletMiFitFragment.this.loadingDialogHelper;
            Objects.requireNonNull(loadingDialogHelper);
            loadingDialogHelper.showOrError(ResourceExtKt.asBus(resource));
            if (resource.status == com.huami.wallet.accessdoor.helper.Status.SUCCESS) {
                WalletMiFitFragment.this.r0(resource.data);
                WalletMiFitFragment.this.c0();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(com.huami.wallet.accessdoor.helper.Resource<List<? extends DoorCardInfo>> resource) throws Exception {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<Boolean> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Boolean getA() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return WalletMiFitFragment.this.S();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<Boolean> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Boolean getA() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return WalletMiFitFragment.this.U();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "Lcom/service/mi/wallet/entity/resp/CardListResp;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function1<StateBuilder<CardListResp>, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Success;", "Lcom/service/mi/wallet/entity/resp/CardListResp;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Success<? extends CardListResp>, Unit> {
            public final /* synthetic */ WalletMiFitFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WalletMiFitFragment walletMiFitFragment) {
                super(1);
                this.a = walletMiFitFragment;
            }

            public final void a(@NotNull Success<? extends CardListResp> success) {
                CardListResp value = success.getValue();
                Objects.requireNonNull(value, "null cannot be cast to non-null type com.service.mi.wallet.entity.resp.CardListResp");
                List cardList = value.getCardList();
                if (cardList == null) {
                    return;
                }
                WalletMiFitFragment walletMiFitFragment = this.a;
                if (!(!cardList.isEmpty())) {
                    MasterCardActivity.Companion.open$default(MasterCardActivity.Companion, walletMiFitFragment.requireActivity(), 1, (CardListResp) null, 4, (Object) null);
                } else if (cardList.size() == 1) {
                    MasterCardActivity.Companion companion = MasterCardActivity.Companion;
                    FragmentActivity fragmentActivityRequireActivity = walletMiFitFragment.requireActivity();
                    CardListResp value2 = success.getValue();
                    Objects.requireNonNull(value2, "null cannot be cast to non-null type com.service.mi.wallet.entity.resp.CardListResp");
                    companion.open(fragmentActivityRequireActivity, 3, value2);
                } else {
                    MasterCardActivity.Companion companion2 = MasterCardActivity.Companion;
                    FragmentActivity fragmentActivityRequireActivity2 = walletMiFitFragment.requireActivity();
                    CardListResp value3 = success.getValue();
                    Objects.requireNonNull(value3, "null cannot be cast to non-null type com.service.mi.wallet.entity.resp.CardListResp");
                    companion2.open(fragmentActivityRequireActivity2, 2, value3);
                }
                if (walletMiFitFragment.T()) {
                    return;
                }
                walletMiFitFragment.requireActivity().startService(new Intent(walletMiFitFragment.requireActivity(), (Class<?>) NotificationPollingService.class));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends CardListResp> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        public l() {
            super(1);
        }

        public final void a(@NotNull StateBuilder<CardListResp> stateBuilder) {
            stateBuilder.onSuccess(new a(WalletMiFitFragment.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<CardListResp> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "", "Lcom/huami/wallet/common/entity/SupportMasterCountry;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function1<StateBuilder<List<? extends SupportMasterCountry>>, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Success;", "", "Lcom/huami/wallet/common/entity/SupportMasterCountry;", "list", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Success<? extends List<? extends SupportMasterCountry>>, Unit> {
            public final /* synthetic */ WalletMiFitFragment a;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.nfc.WalletMiFitFragment$m$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0982a extends Lambda implements Function0<String> {
                public final /* synthetic */ Success<List<SupportMasterCountry>> a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0982a(Success<? extends List<SupportMasterCountry>> success) {
                    super(0);
                    this.a = success;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "----checkIsSupportMasterLiveData, list = " + this.a;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ Ref.ObjectRef<String> a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(Ref.ObjectRef<String> objectRef) {
                    super(0);
                    this.a = objectRef;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "----用户注册时，选择的注册地：" + ((Object) this.a.element);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function0<String> {
                public final /* synthetic */ Ref.ObjectRef<String> a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(Ref.ObjectRef<String> objectRef) {
                    super(0);
                    this.a = objectRef;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "----获取到的手机系统当前地区：" + ((Object) this.a.element);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class d extends Lambda implements Function0<String> {
                public final /* synthetic */ Ref.ObjectRef<String> a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(Ref.ObjectRef<String> objectRef) {
                    super(0);
                    this.a = objectRef;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "----Country:" + ((Object) this.a.element);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class e extends Lambda implements Function0<String> {
                public final /* synthetic */ SupportMasterCountry a;
                public final /* synthetic */ Ref.ObjectRef<String> b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(SupportMasterCountry supportMasterCountry, Ref.ObjectRef<String> objectRef) {
                    super(0);
                    this.a = supportMasterCountry;
                    this.b = objectRef;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "----isSupport, country=" + this.a + " area=" + ((Object) this.b.element);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class f extends Lambda implements Function0<String> {
                public final /* synthetic */ Ref.BooleanRef a;
                public final /* synthetic */ Ref.ObjectRef<String> b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public f(Ref.BooleanRef booleanRef, Ref.ObjectRef<String> objectRef) {
                    super(0);
                    this.a = booleanRef;
                    this.b = objectRef;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "----isSupport, isSupport=" + this.a.element + " area=" + ((Object) this.b.element);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WalletMiFitFragment walletMiFitFragment) {
                super(1);
                this.a = walletMiFitFragment;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.String] */
            /* JADX WARN: Type inference failed for: r3v9, types: [T, java.lang.String] */
            public final void a(@NotNull Success<? extends List<SupportMasterCountry>> success) {
                HMLog.info(WalletMiFitFragment.p, new C0982a(success));
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = SelectAreaHelper.getAreaBySave().getValue();
                HMLog.info(WalletMiFitFragment.p, new b(objectRef));
                CharSequence charSequence = (CharSequence) objectRef.element;
                if ((charSequence == null || charSequence.length() == 0) || kotlin.text.m.equals("unknown", (String) objectRef.element, true)) {
                    objectRef.element = I18nUtil.getLocaleCountry(this.a.requireContext());
                    HMLog.info(WalletMiFitFragment.p, new c(objectRef));
                }
                HMLog.info(WalletMiFitFragment.p, new d(objectRef));
                List<SupportMasterCountry> value = success.getValue();
                if (value != null) {
                    for (SupportMasterCountry supportMasterCountry : value) {
                        if (Intrinsics.areEqual(supportMasterCountry.getCountry(), objectRef.element)) {
                            booleanRef.element = true;
                            HMLog.info(WalletMiFitFragment.p, new e(supportMasterCountry, objectRef));
                        }
                    }
                }
                HMLog.info(WalletMiFitFragment.p, new f(booleanRef, objectRef));
                if (!booleanRef.element) {
                    this.a.P();
                } else if (!CincoEntranceHelperKt.shouldPanGuShowBankcard()) {
                    this.a.P();
                } else {
                    if (this.a.V()) {
                        return;
                    }
                    this.a.e0();
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends List<? extends SupportMasterCountry>> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        public m() {
            super(1);
        }

        public final void a(@NotNull StateBuilder<List<SupportMasterCountry>> stateBuilder) {
            stateBuilder.onSuccess(new a(WalletMiFitFragment.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<List<? extends SupportMasterCountry>> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/State;", "", "Lcom/huami/wallet/unionpay/unionpayuimifit/repo/entity/BankCardInfo;", "cardsRaw", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function1<State<? extends List<? extends BankCardInfo>>, Unit> {
        public n() {
            super(1);
        }

        public final void a(@NotNull State<? extends List<BankCardInfo>> state) {
            ArrayList arrayList;
            BankCardInfo bankCardInfo;
            List list = (List) ((Success) state).getValue();
            String cardReferenceId = null;
            if (list == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((BankCardInfo) obj).getStatus() != VCStatus.DELETELESS.getStatus()) {
                        arrayList.add(obj);
                    }
                }
            }
            WalletMiFitFragment walletMiFitFragment = WalletMiFitFragment.this;
            int size = arrayList == null || arrayList.isEmpty() ? 0 : arrayList.size();
            Intent intent = new Intent(walletMiFitFragment.getActivity(), (Class<?>) UnionpayHostActivity.class);
            intent.putExtra("KEY_COUNT", size);
            if (size == 1) {
                if (arrayList != null && (bankCardInfo = (BankCardInfo) arrayList.get(0)) != null) {
                    cardReferenceId = bankCardInfo.getCardReferenceId();
                }
                intent.putExtra("KEY_CARD_NUMBER", cardReferenceId);
            }
            Unit unit = Unit.INSTANCE;
            walletMiFitFragment.startActivity(intent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(State<? extends List<? extends BankCardInfo>> state) {
            a(state);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/mastercard/ui/mifit/utils/LoadingWidget;", "Lcom/service/mi/wallet/entity/resp/CardListResp;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<LoadingWidget<CardListResp>> {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingWidget<CardListResp> getA() {
            return new LoadingWidget<>(WalletMiFitFragment.this.requireActivity(), 0, 2, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<String> {
        public final /* synthetic */ EventHttpError a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(EventHttpError eventHttpError) {
            super(0);
            this.a = eventHttpError;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "EventHttpError errorCode:" + this.a.errorCode;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<Unit> {
        public q() {
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
            WalletMiFitFragment.this.walletEntranceViewModel.checkThenEnterWallet();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<Unit> {
        public r() {
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
            DoorEntranceViewModel.getCardList$default(WalletMiFitFragment.this.mDoorEntranceViewModel, false, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<Unit> {
        public static final s a = new s();

        public s() {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t extends Lambda implements Function0<String> {
        public final /* synthetic */ EventAccountStatus a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(EventAccountStatus eventAccountStatus) {
            super(0);
            this.a = eventAccountStatus;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "status:" + this.a.getStatus();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u extends Lambda implements Function0<Unit> {
        public u() {
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
            WalletMiFitFragment.this.E();
            WalletMiFitFragment.this.I();
            WalletMiFitFragment.this.C();
            WalletMiFitFragment.this.L();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/wallet/unionpay/unionpayuimifit/view/LoadingWidgetImpl;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v extends Lambda implements Function0<LoadingWidgetImpl> {
        public v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingWidgetImpl getA() {
            return new LoadingWidgetImpl(WalletMiFitFragment.this.requireContext(), false, 2, (DefaultConstructorMarker) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WalletMiFitFragment() {
        final Qualifier qualifier = null;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.nfcApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<NFCApi>() { // from class: com.xiaomi.hm.health.nfc.WalletMiFitFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.NFCApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final NFCApi getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(NFCApi.class), qualifier, objArr);
            }
        });
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.nfcDevice = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<NfcDevice>() { // from class: com.xiaomi.hm.health.nfc.WalletMiFitFragment$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.nfc.web.NfcDevice, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final NfcDevice getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(NfcDevice.class), objArr2, objArr3);
            }
        });
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.accountWebExtApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<AccountWebExtApi>() { // from class: com.xiaomi.hm.health.nfc.WalletMiFitFragment$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.AccountWebExtApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final AccountWebExtApi getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(AccountWebExtApi.class), objArr4, objArr5);
            }
        });
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.deviceUtilsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.nfc.WalletMiFitFragment$special$$inlined$inject$default$4
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
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), objArr6, objArr7);
            }
        });
    }

    private final void A(Function0<Unit> block) {
        if (!ExtensionsKt.isNetworkConnected(requireContext())) {
            CustomToastKtxKt.showToast$default((Fragment) this, (CharSequence) getString(R.string.no_network_connection), false, 2, (Object) null);
            return;
        }
        HMDeviceType majorDeviceType = HMDeviceManager.getInstance().getMajorDeviceType();
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(majorDeviceType);
        if (!HMDeviceManager.getInstance().isConnected(majorDeviceType) || device == null) {
            CustomToastKtxKt.showToast$default((Fragment) this, (CharSequence) getString(R.string.device_disconnect_tip), false, 2, (Object) null);
        } else if (SyncCenterManager.INSTANCE.isSyncing(device)) {
            CustomToastKtxKt.showToast$default((Fragment) this, (CharSequence) getString(R.string.device_sync_tips), false, 2, (Object) null);
        } else {
            kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new b(block, null), 3, null);
        }
    }

    private final void B() {
        if (Build.VERSION.SDK_INT < 23) {
            p0();
        } else if (NetUtil.isNetworkConnected(requireContext())) {
            p(3, getString(R.string.nfc_master_card), false, new c());
        } else {
            CustomToastKtxKt.showToast$default((Fragment) this, (CharSequence) getString(R.string.no_network_connection), false, 2, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        if (!NfcDeviceConfigKt.hasFeatureNfcBankDevice()) {
            View view = getView();
            setVisible(view != null ? view.findViewById(R.id.bankItem) : null, false);
            return;
        }
        View view2 = getView();
        setVisible(view2 == null ? null : view2.findViewById(R.id.bankItem), true);
        R();
        View view3 = getView();
        ((NfcItemView) (view3 != null ? view3.findViewById(R.id.bankItem) : null)).setOnClickListener(new View.OnClickListener() { // from class: ge8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                WalletMiFitFragment.D(this.a, view4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(WalletMiFitFragment walletMiFitFragment, View view) {
        walletMiFitFragment.A(walletMiFitFragment.new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        if (!NfcDeviceConfigKt.hasFeatureNfcBusDevice()) {
            View view = getView();
            setVisible(view != null ? view.findViewById(R.id.busItem) : null, false);
            return;
        }
        View view2 = getView();
        setVisible(view2 == null ? null : view2.findViewById(R.id.busItem), true);
        H();
        View view3 = getView();
        ((NfcItemView) (view3 == null ? null : view3.findViewById(R.id.busItem))).setOnClickListener(new View.OnClickListener() { // from class: td8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                WalletMiFitFragment.F(this.a, view4);
            }
        });
        if (GlobalConfig.get().isBuildInner()) {
            View view4 = getView();
            ((NfcItemView) (view4 != null ? view4.findViewById(R.id.busItem) : null)).setOnLongClickListener(new View.OnLongClickListener() { // from class: vd8
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view5) {
                    return WalletMiFitFragment.G(this.a, view5);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(WalletMiFitFragment walletMiFitFragment, View view) {
        walletMiFitFragment.A(walletMiFitFragment.new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean G(WalletMiFitFragment walletMiFitFragment, View view) {
        walletMiFitFragment.walletEntranceViewModel.loadCplc();
        return true;
    }

    private final void H() {
        LiveDataExtensionKt.observeWithNotNull(this.walletEntranceViewModel.cplcLiveData, this, new f());
        LiveDataExtensionKt.observeWithNotNull(this.walletEntranceViewModel.installedBusCards, this, new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I() {
        if (!NfcDeviceConfigKt.hasFeatureNfcDoorDevice()) {
            View view = getView();
            setVisible(view != null ? view.findViewById(R.id.doorItem) : null, false);
            return;
        }
        View view2 = getView();
        setVisible(view2 == null ? null : view2.findViewById(R.id.doorItem), true);
        K();
        View view3 = getView();
        ((NfcItemView) (view3 != null ? view3.findViewById(R.id.doorItem) : null)).setOnClickListener(new View.OnClickListener() { // from class: fe8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                WalletMiFitFragment.J(this.a, view4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(WalletMiFitFragment walletMiFitFragment, View view) {
        walletMiFitFragment.A(walletMiFitFragment.new h());
    }

    private final void K() {
        LiveDataExtensionKt.observeWithNotNull(this.mDoorEntranceViewModel.getGetCardListLiveData(), this, new i());
        LiveDataExtensionKt.observeWithNotNull(this.mDoorEntranceViewModel.isDefaultCardLiveData(), this, new Function1<com.huami.wallet.accessdoor.helper.Resource<Boolean>, Unit>() { // from class: com.xiaomi.hm.health.nfc.WalletMiFitFragment$initDoorEntranceViewModel$2

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[com.huami.wallet.accessdoor.helper.Status.values().length];
                    iArr[com.huami.wallet.accessdoor.helper.Status.LOADING.ordinal()] = 1;
                    iArr[com.huami.wallet.accessdoor.helper.Status.SUCCESS.ordinal()] = 2;
                    iArr[com.huami.wallet.accessdoor.helper.Status.ERROR.ordinal()] = 3;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            {
                super(1);
            }

            public final void a(com.huami.wallet.accessdoor.helper.Resource<Boolean> resource) {
                Boolean bool;
                Boolean bool2;
                int i2 = WhenMappings.$EnumSwitchMapping$0[resource.status.ordinal()];
                boolean z = true;
                if (i2 == 1) {
                    LoadingDialogHelper loadingDialogHelper = this.a.loadingDialogHelper;
                    Objects.requireNonNull(loadingDialogHelper);
                    loadingDialogHelper.showLoading();
                    return;
                }
                if (i2 == 2 || i2 == 3) {
                    LoadingDialogHelper loadingDialogHelper2 = this.a.loadingDialogHelper;
                    Objects.requireNonNull(loadingDialogHelper2);
                    loadingDialogHelper2.hideLoading();
                    com.huami.wallet.accessdoor.helper.Resource<List<DoorCardInfo>> value = this.a.mDoorEntranceViewModel.getGetCardListLiveData().getValue();
                    if (value == null) {
                        return;
                    }
                    List<DoorCardInfo> list = value.data;
                    if (list != null && !list.isEmpty()) {
                        z = false;
                    }
                    if (z || (bool = resource.data) == null) {
                        return;
                    }
                    AccessCardDetailActivity.INSTANCE.open(this.a.requireActivity(), new DoorInfoAndDefaultCard(list.get(0), (resource.status != com.huami.wallet.accessdoor.helper.Status.SUCCESS || (bool2 = bool) == null) ? false : bool2.booleanValue()), false);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(com.huami.wallet.accessdoor.helper.Resource<Boolean> resource) {
                a(resource);
                return Unit.INSTANCE;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L() {
        if (!NfcDeviceConfigKt.hasFeatureNfcMasterDevice()) {
            View view = getView();
            setVisible(view != null ? view.findViewById(R.id.item_master_card) : null, false);
            return;
        }
        View view2 = getView();
        setVisible(view2 == null ? null : view2.findViewById(R.id.item_master_card), true);
        MasterFuncConfigKt.setNeedJudgeOffWistConfig(new j());
        MasterFuncConfigKt.setPanGuDevice(new k());
        this.masterCardEntranceViewModel.initialize(requireActivity(), Utils.getTpaConfigs(KoinExtKt.getAppContext()).get("xiaomi").getAppId(), "23232323", SelectAreaHelper.getAreaBySave().getValue());
        View view3 = getView();
        ((NfcItemView) (view3 != null ? view3.findViewById(R.id.item_master_card) : null)).setOnClickListener(new View.OnClickListener() { // from class: ud8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                WalletMiFitFragment.M(this.a, view4);
            }
        });
        com.huami.arch.core.LiveDataExtensionKt.observeState(this.masterCardEntranceViewModel.getLoginLiveData(), this, w(), new l());
        com.huami.arch.core.LiveDataExtensionKt.observeState(this.masterCardEntranceViewModel.getCheckIsSupportMasterLiveData(), this, t(), new m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(WalletMiFitFragment walletMiFitFragment, View view) {
        if (!HMDeviceManager.getInstance().isConnected(HMDeviceManager.getInstance().getMajorDeviceType())) {
            CustomToastKtxKt.showToast$default((Fragment) walletMiFitFragment, (CharSequence) walletMiFitFragment.getString(R.string.device_disconnect_tip), false, 2, (Object) null);
        } else if (walletMiFitFragment.U()) {
            walletMiFitFragment.masterCardEntranceViewModel.checkIsSupportMaster();
        }
    }

    private final void N() {
        new AlertDialogFragment.Builder(requireContext()).setCancelable(true).setMessage(R.string.nfc_not_form_wrist_tip).setNeutralButton(R.string.got_it, new DialogInterface.OnClickListener() { // from class: ae8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                WalletMiFitFragment.O(dialogInterface, i2);
            }
        }).show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(DialogInterface dialogInterface, int i2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P() {
        new AlertDialogFragment.Builder(requireContext()).setCancelable(true).setMessage(R.string.nfc_no_support_master_tip).setNeutralButton(R.string.got_it, new DialogInterface.OnClickListener() { // from class: ce8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                WalletMiFitFragment.Q(dialogInterface, i2);
            }
        }).show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(DialogInterface dialogInterface, int i2) {
    }

    private final void R() {
        BaseViewModelKt.observeOnSuccess(this.upEntranceViewModel.getCheckCardCountLiveData(), this, z(), new n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean S() {
        HMDeviceSource boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI);
        return boundDeviceSource == HMDeviceSource.MILI_KONGMING || boundDeviceSource == HMDeviceSource.MILI_KONGMING_PRO || boundDeviceSource == HMDeviceSource.MILI_PANGU_L || boundDeviceSource == HMDeviceSource.MILI_PANGU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean T() {
        Object systemService = requireActivity().getSystemService("activity");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        Iterator<ActivityManager.RunningServiceInfo> it2 = ((ActivityManager) systemService).getRunningServices(Integer.MAX_VALUE).iterator();
        while (it2.hasNext()) {
            if (Intrinsics.areEqual(NotificationPollingService.class.getName(), it2.next().service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean U() {
        return HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI) == HMDeviceSource.MILI_PANGU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean V() {
        LoadingDialogHelper loadingDialogHelper = this.loadingDialogHelper;
        Objects.requireNonNull(loadingDialogHelper);
        loadingDialogHelper.showLoading();
        if (!NfcDeviceConfigKt.needJudgeWrist() || NfcDeviceConfigKt.wristAndPinHasState()) {
            LoadingDialogHelper loadingDialogHelper2 = this.loadingDialogHelper;
            Objects.requireNonNull(loadingDialogHelper2);
            loadingDialogHelper2.hideLoading();
            return false;
        }
        LoadingDialogHelper loadingDialogHelper3 = this.loadingDialogHelper;
        Objects.requireNonNull(loadingDialogHelper3);
        loadingDialogHelper3.hideLoading();
        N();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean W() {
        if (NfcDeviceConfigKt.wristAndPinHasState()) {
            return true;
        }
        N();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X() {
        AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(requireContext());
        builder.setTitle(R.string.logout_title_2);
        builder.setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: yd8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                WalletMiFitFragment.Y(this.a, dialogInterface, i2);
            }
        });
        builder.setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null);
        boolean zIsInComingCallEnabled = HMPersonInfo.getInstance().getMiliConfig().isInComingCallEnabled();
        boolean zHasBound = HMDeviceManager.getInstance().hasBound(HMDeviceType.MILI);
        if (zIsInComingCallEnabled && zHasBound) {
            builder.setMessage(R.string.logout_content);
        }
        builder.show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(final WalletMiFitFragment walletMiFitFragment, DialogInterface dialogInterface, int i2) {
        HMLogoutManager.processDataWhenLogout(walletMiFitFragment.requireActivity(), new HMLogoutManager.OnLogoutListener() { // from class: com.xiaomi.hm.health.nfc.WalletMiFitFragment$logoutAndLoginXiaomi$1$1
            @Override // com.huami.account.HMLogoutManager.OnLogoutListener
            public void onLogoutSuccess() {
                LoadingDialogHelper loadingDialogHelper = this.a.loadingDialogHelper;
                Objects.requireNonNull(loadingDialogHelper);
                loadingDialogHelper.hideLoading();
                LoadingDialog loadingDialog = new LoadingDialog(this.a.requireContext());
                loadingDialog.show();
                String string = this.a.getString(R.string.logout_success);
                final WalletMiFitFragment walletMiFitFragment2 = this.a;
                loadingDialog.setSuccess(string, 500, new LoadingDialog.OnAnimEndListener() { // from class: com.xiaomi.hm.health.nfc.WalletMiFitFragment$logoutAndLoginXiaomi$1$1$onLogoutSuccess$1
                    @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                    public void onAnimEnd(@NotNull LoadingDialog dialog) {
                    }

                    @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                    public void onDismiss(@NotNull LoadingDialog dialog) {
                        UnitManager.getInstance().clear();
                        HMLogoutManager.logout(6);
                        walletMiFitFragment2.requireActivity().finish();
                    }
                });
            }

            @Override // com.huami.account.HMLogoutManager.OnLogoutListener
            public void onStartLogout(@NotNull LogoutResult result) {
                if (result.isSuccess()) {
                    LoadingDialogHelper loadingDialogHelper = this.a.loadingDialogHelper;
                    Objects.requireNonNull(loadingDialogHelper);
                    loadingDialogHelper.showLoading(R.string.logout_ongoing);
                } else {
                    LoadingDialogHelper loadingDialogHelper2 = this.a.loadingDialogHelper;
                    Objects.requireNonNull(loadingDialogHelper2);
                    loadingDialogHelper2.hideLoading();
                    WalletMiFitFragment walletMiFitFragment2 = this.a;
                    IconToastKtxKt.showIconErrorToast$default((Fragment) walletMiFitFragment2, (CharSequence) walletMiFitFragment2.getString(R.string.logout_failed), false, 2, (Object) null);
                }
            }

            @Override // com.huami.account.HMLogoutManager.OnLogoutListener
            public void onSyncDataWhenLogout() {
                LoadingDialogHelper loadingDialogHelper = this.a.loadingDialogHelper;
                Objects.requireNonNull(loadingDialogHelper);
                loadingDialogHelper.showLoading();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(WalletMiFitFragment walletMiFitFragment, EventHttpError eventHttpError) {
        walletMiFitFragment.s0();
        int i2 = eventHttpError.type;
        if (i2 == 1) {
            walletMiFitFragment.p(1, walletMiFitFragment.getString(R.string.bus_card_pay_v2), false, walletMiFitFragment.new q());
        } else if (i2 != 2) {
            walletMiFitFragment.p(3, walletMiFitFragment.getString(R.string.nfc_master_card), false, s.a);
        } else {
            walletMiFitFragment.p(2, walletMiFitFragment.getString(R.string.access_door_card_simulation), false, walletMiFitFragment.new r());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(WalletMiFitFragment walletMiFitFragment) {
        if (HMDeviceManager.getInstance().getBindInfo(HMDeviceManager.getInstance().getMajorDeviceType()) == null) {
            return;
        }
        ((CloudAccessDoorSource) walletMiFitFragment.cloudAccessDoorSource).login(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0(final Function0<Unit> runnable, final String xiaomiId) {
        LoadingDialogHelper loadingDialogHelper = this.loadingDialogHelper;
        Objects.requireNonNull(loadingDialogHelper);
        loadingDialogHelper.showLoading();
        XiaomiTokenMananger.reAuthorization(requireActivity(), xiaomiId, new XiaomiTokenMananger.OnAuthCallback() { // from class: com.xiaomi.hm.health.nfc.WalletMiFitFragment$reAuthorization$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<Unit> {
                public final /* synthetic */ WalletMiFitFragment a;
                public final /* synthetic */ Function0<Unit> b;
                public final /* synthetic */ String c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(WalletMiFitFragment walletMiFitFragment, Function0<Unit> function0, String str) {
                    super(0);
                    this.a = walletMiFitFragment;
                    this.b = function0;
                    this.c = str;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit getA() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.a.b0(this.b, this.c);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<Unit> {
                public final /* synthetic */ WalletMiFitFragment a;
                public final /* synthetic */ Function0<Unit> b;
                public final /* synthetic */ String c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(WalletMiFitFragment walletMiFitFragment, Function0<Unit> function0, String str) {
                    super(0);
                    this.a = walletMiFitFragment;
                    this.b = function0;
                    this.c = str;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit getA() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.a.b0(this.b, this.c);
                }
            }

            @Override // com.huami.account.XiaomiTokenMananger.OnAuthCallback
            public void onDifferentAccount() {
                String string = this.a.getString(R.string.verify_error_title);
                String string2 = this.a.getString(R.string.mi_oauth_xiaomi_nfc_account_error_tip, xiaomiId);
                WalletMiFitFragment walletMiFitFragment = this.a;
                walletMiFitFragment.h0(string, string2, R.string.retry, new a(walletMiFitFragment, runnable, xiaomiId));
            }

            @Override // com.huami.account.XiaomiTokenMananger.OnAuthCallback
            public void onError(@NotNull ErrorCode errorCode) {
                WalletMiFitFragment walletMiFitFragment = this.a;
                walletMiFitFragment.i0(new b(walletMiFitFragment, runnable, xiaomiId));
            }

            @Override // com.huami.account.XiaomiTokenMananger.OnAuthCallback
            public void onSuccess() {
                LoadingDialogHelper loadingDialogHelper2 = this.a.loadingDialogHelper;
                Objects.requireNonNull(loadingDialogHelper2);
                loadingDialogHelper2.hideLoading();
                runnable.getA();
            }

            @Override // com.huami.account.XiaomiTokenMananger.OnAuthCallback
            public void onUserCancel() {
                LoadingDialogHelper loadingDialogHelper2 = this.a.loadingDialogHelper;
                Objects.requireNonNull(loadingDialogHelper2);
                loadingDialogHelper2.hideLoading();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0() {
        HashMap map = new HashMap(2);
        map.put("DeviceSource", u());
        Analytics.recordEvent(new CountEventBuilder(EventId.DOOR_VIEW_NUM).putExtras(map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0() {
        x().onUserDestroy();
        this.cloudAccessDoorSource = (AccessDoorDataSource) ComponentCallbackExtKt.getKoin(this).getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AccessDoorDataSource.class), null, null);
        this.walletNavigationController = (NavigationController) ComponentCallbackExtKt.getKoin(this).getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(NavigationController.class), null, null);
        this.mDoorEntranceViewModel = (DoorEntranceViewModel) ComponentCallbackExtKt.getKoin(this).getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(DoorEntranceViewModel.class), null, null);
        this.walletEntranceViewModel = (EntranceViewModel) ComponentCallbackExtKt.getKoin(this).getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(EntranceViewModel.class), null, null);
        this.cloudAccessDoorSource = (AccessDoorDataSource) ComponentCallbackExtKt.getKoin(this).getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AccessDoorDataSource.class), null, null);
        this.walletNavigationController = (NavigationController) ComponentCallbackExtKt.getKoin(this).getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(NavigationController.class), null, null);
        this.upEntranceViewModel = (UPEntranceViewModel) ComponentCallbackExtKt.getKoin(this).getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(UPEntranceViewModel.class), null, null);
        this.masterCardEntranceViewModel = (MasterCardEntranceViewModel) ComponentCallbackExtKt.getKoin(this).getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(MasterCardEntranceViewModel.class), null, null);
        r(new u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e0() {
        EasyPermissions.requestPermissions(this, getString(R.string.permission_rationale_denied_storage_bank), 111, PermissionManager.KEY_NFC, "android.permission.CAMERA", "android.permission.CALL_PHONE", "android.permission.READ_PHONE_STATE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0(String message) {
        ClipboardManager clipboardManager = (ClipboardManager) requireActivity().getSystemService("clipboard");
        if (clipboardManager == null) {
            return;
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText("message", message));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0(String message, int positiveRes, Function0<Unit> listener) {
        h0(null, message, positiveRes, listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0(String title, String message, int positiveRes, final Function0<Unit> listener) {
        LoadingDialogHelper loadingDialogHelper = this.loadingDialogHelper;
        Objects.requireNonNull(loadingDialogHelper);
        loadingDialogHelper.hideLoading();
        AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(requireContext());
        if (!TextUtils.isEmpty(title)) {
            builder.setTitle(title);
        }
        builder.setCancelable(false);
        builder.setMessage(message);
        builder.setPositiveButton(positiveRes, new DialogInterface.OnClickListener() { // from class: zd8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                WalletMiFitFragment.j0(listener, dialogInterface, i2);
            }
        });
        builder.setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null);
        builder.show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0(Function0<Unit> listener) {
        g0(getString(R.string.nfc_relation_error), R.string.retry, listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j0(Function0 function0, DialogInterface dialogInterface, int i2) {
        function0.getA();
    }

    private final void k0() {
        new AlertDialogFragment.Builder(requireContext()).setCancelable(true).setMessage(R.string.nfc_set_off_wrist_lock_tip).setNeutralButton(R.string.avoid_spite_binding_go_to_open, new DialogInterface.OnClickListener() { // from class: sd8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                WalletMiFitFragment.l0(this.a, dialogInterface, i2);
            }
        }).show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l0(WalletMiFitFragment walletMiFitFragment, DialogInterface dialogInterface, int i2) {
        OffWistSettingActivity.INSTANCE.launch(walletMiFitFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0() {
        new AlertDialogFragment.Builder(requireContext()).setCancelable(true).setMessage(R.string.nfc_oversea_help).setPositiveButton(R.string.nfc_help, new DialogInterface.OnClickListener() { // from class: ee8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                WalletMiFitFragment.o0(dialogInterface, i2);
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: de8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                WalletMiFitFragment.n0(dialogInterface, i2);
            }
        }).show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n0(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o0(DialogInterface dialogInterface, int i2) {
        WebHelper.launch(u);
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(final int type, final String typeResource, final boolean isMiTokenError, final Function0<Unit> runnable) {
        if (type == 3) {
            if (XiaomiTokenMananger.hasMasterCardToken()) {
                runnable.getA();
                return;
            }
        } else if (XiaomiTokenMananger.hasXiaomiToken()) {
            runnable.getA();
            return;
        }
        if (!ExtensionsKt.isNetworkConnected(requireContext())) {
            IconToastKtxKt.showIconErrorToast$default((Fragment) this, (CharSequence) getString(R.string.no_network_connection), false, 2, (Object) null);
            return;
        }
        LoadingDialogHelper loadingDialogHelper = this.loadingDialogHelper;
        Objects.requireNonNull(loadingDialogHelper);
        loadingDialogHelper.showLoading();
        XiaomiTokenMananger.getBindInfo(new XiaomiTokenMananger.OnBindInfoCallback() { // from class: com.xiaomi.hm.health.nfc.WalletMiFitFragment$beforeEnterWallet$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<Unit> {
                public final /* synthetic */ WalletMiFitFragment a;
                public final /* synthetic */ Function0<Unit> b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(WalletMiFitFragment walletMiFitFragment, Function0<Unit> function0) {
                    super(0);
                    this.a = walletMiFitFragment;
                    this.b = function0;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit getA() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.a.t0(this.b);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<Unit> {
                public final /* synthetic */ WalletMiFitFragment a;
                public final /* synthetic */ Function0<Unit> b;
                public final /* synthetic */ String c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(WalletMiFitFragment walletMiFitFragment, Function0<Unit> function0, String str) {
                    super(0);
                    this.a = walletMiFitFragment;
                    this.b = function0;
                    this.c = str;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit getA() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.a.b0(this.b, this.c);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function0<Unit> {
                public final /* synthetic */ WalletMiFitFragment a;
                public final /* synthetic */ Function0<Unit> b;
                public final /* synthetic */ String c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(WalletMiFitFragment walletMiFitFragment, Function0<Unit> function0, String str) {
                    super(0);
                    this.a = walletMiFitFragment;
                    this.b = function0;
                    this.c = str;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit getA() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.a.b0(this.b, this.c);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class d extends Lambda implements Function0<Unit> {
                public final /* synthetic */ WalletMiFitFragment a;
                public final /* synthetic */ int b;
                public final /* synthetic */ String c;
                public final /* synthetic */ Function0<Unit> d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(WalletMiFitFragment walletMiFitFragment, int i, String str, Function0<Unit> function0) {
                    super(0);
                    this.a = walletMiFitFragment;
                    this.b = i;
                    this.c = str;
                    this.d = function0;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit getA() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    WalletMiFitFragment.q(this.a, this.b, this.c, false, this.d, 4, null);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class e extends Lambda implements Function0<Unit> {
                public final /* synthetic */ WalletMiFitFragment a;
                public final /* synthetic */ int b;
                public final /* synthetic */ String c;
                public final /* synthetic */ Function0<Unit> d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(WalletMiFitFragment walletMiFitFragment, int i, String str, Function0<Unit> function0) {
                    super(0);
                    this.a = walletMiFitFragment;
                    this.b = i;
                    this.c = str;
                    this.d = function0;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit getA() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    WalletMiFitFragment.q(this.a, this.b, this.c, false, this.d, 4, null);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class f extends Lambda implements Function0<Unit> {
                public final /* synthetic */ WalletMiFitFragment a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public f(WalletMiFitFragment walletMiFitFragment) {
                    super(0);
                    this.a = walletMiFitFragment;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit getA() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.a.X();
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class g extends Lambda implements Function0<Unit> {
                public final /* synthetic */ WalletMiFitFragment a;
                public final /* synthetic */ Function0<Unit> b;
                public final /* synthetic */ String c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public g(WalletMiFitFragment walletMiFitFragment, Function0<Unit> function0, String str) {
                    super(0);
                    this.a = walletMiFitFragment;
                    this.b = function0;
                    this.c = str;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit getA() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.a.b0(this.b, this.c);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class h extends Lambda implements Function0<Unit> {
                public final /* synthetic */ WalletMiFitFragment a;
                public final /* synthetic */ Function0<Unit> b;
                public final /* synthetic */ String c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public h(WalletMiFitFragment walletMiFitFragment, Function0<Unit> function0, String str) {
                    super(0);
                    this.a = walletMiFitFragment;
                    this.b = function0;
                    this.c = str;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit getA() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.a.b0(this.b, this.c);
                }
            }

            public final void bindXiaomiAccount() {
                String string = this.a.getString(R.string.wechat_login_bind_xiaomi_nfc_title);
                String string2 = this.a.getString(R.string.wechat_login_bind_xiaomi_nfc);
                WalletMiFitFragment walletMiFitFragment = this.a;
                walletMiFitFragment.h0(string, string2, R.string.bind_xiaomi_nfc, new a(walletMiFitFragment, runnable));
            }

            @Override // com.huami.account.XiaomiTokenMananger.OnBindInfoCallback
            public void onBoundXiaomiLogin(@NotNull String xiaomiId) {
                if (isMiTokenError) {
                    WalletMiFitFragment walletMiFitFragment = this.a;
                    walletMiFitFragment.g0(walletMiFitFragment.getString(R.string.nfc_retry_login_message), R.string.speech_account_authorize_base_dialog_button_custome_operation_authorize_desc, new b(this.a, runnable, xiaomiId));
                } else {
                    String string = this.a.getString(R.string.verify_mi_oauth_title);
                    String string2 = this.a.getString(R.string.wechat_oauth_xiaomi_nfc_tip, xiaomiId);
                    WalletMiFitFragment walletMiFitFragment2 = this.a;
                    walletMiFitFragment2.h0(string, string2, R.string.speech_account_authorize_base_dialog_button_custome_operation_authorize_desc, new c(walletMiFitFragment2, runnable, xiaomiId));
                }
            }

            @Override // com.huami.account.XiaomiTokenMananger.OnBindInfoCallback
            public void onError() {
                WalletMiFitFragment walletMiFitFragment = this.a;
                walletMiFitFragment.g0(walletMiFitFragment.getString(R.string.nfc_relation_error), R.string.retry, new d(this.a, type, typeResource, runnable));
            }

            @Override // com.huami.account.XiaomiTokenMananger.OnBindInfoCallback
            public void onGetBindStatusError() {
                WalletMiFitFragment walletMiFitFragment = this.a;
                walletMiFitFragment.g0(walletMiFitFragment.getString(R.string.nfc_relation_error), R.string.retry, new e(this.a, type, typeResource, runnable));
            }

            @Override // com.huami.account.XiaomiTokenMananger.OnBindInfoCallback
            public void onNotSupportXiaomiBind() {
                HMDeviceSource boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI);
                WalletMiFitFragment walletMiFitFragment = this.a;
                String string = walletMiFitFragment.getString(R.string.other_account_login_bind_xiaomi_nfc, walletMiFitFragment.v().getDeviceDescription(boundDeviceSource) + typeResource);
                WalletMiFitFragment walletMiFitFragment2 = this.a;
                walletMiFitFragment2.g0(string, R.string.login_xiaomi_nfc, new f(walletMiFitFragment2));
            }

            @Override // com.huami.account.XiaomiTokenMananger.OnBindInfoCallback
            public void onUnboundXiaomiLogin() {
                bindXiaomiAccount();
            }

            @Override // com.huami.account.XiaomiTokenMananger.OnBindInfoCallback
            public void onXiaomiLogin(@NotNull String xiaomiId) {
                if (isMiTokenError) {
                    WalletMiFitFragment walletMiFitFragment = this.a;
                    walletMiFitFragment.g0(walletMiFitFragment.getString(R.string.nfc_retry_login_message), R.string.speech_account_authorize_base_dialog_button_custome_operation_authorize_desc, new g(this.a, runnable, xiaomiId));
                } else {
                    String string = this.a.getString(R.string.verify_mi_oauth_title);
                    String string2 = this.a.getString(R.string.mi_oauth_xiaomi_nfc_tip, xiaomiId);
                    WalletMiFitFragment walletMiFitFragment2 = this.a;
                    walletMiFitFragment2.h0(string, string2, R.string.speech_account_authorize_base_dialog_button_custome_operation_authorize_desc, new h(walletMiFitFragment2, runnable, xiaomiId));
                }
            }
        }, type == 3);
    }

    private final void p0() {
        new AlertDialogFragment.Builder(requireContext()).setCancelable(true).setMessage(R.string.nfc_bank_support_tip).setNeutralButton(R.string.got_it, new DialogInterface.OnClickListener() { // from class: be8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                WalletMiFitFragment.q0(dialogInterface, i2);
            }
        }).show(getChildFragmentManager());
    }

    public static /* synthetic */ void q(WalletMiFitFragment walletMiFitFragment, int i2, String str, boolean z, Function0 function0, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = false;
        }
        walletMiFitFragment.p(i2, str, z, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q0(DialogInterface dialogInterface, int i2) {
    }

    private final void r(Function0<Unit> onPass) {
        FragmentActivity activity = getActivity();
        if (activity == null || activity.isDestroyed() || !isAdded()) {
            return;
        }
        onPass.getA();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r0(List<DoorCardInfo> list) throws Exception {
        if (list == null || list.isEmpty()) {
            SelectDoorTypeActivity.INSTANCE.open(requireActivity());
        } else if (list.size() == 1) {
            this.mDoorEntranceViewModel.isDefaultCard(list.get(0).getAid());
        } else {
            AccessCardListActivity.INSTANCE.open(requireActivity());
        }
    }

    private final AccountWebExtApi s() {
        return (AccountWebExtApi) this.accountWebExtApi.getValue();
    }

    private final void s0() {
        XiaomiTokenMananger.clearXiaomiToken();
        d0();
    }

    private final LoadingWidget<List<SupportMasterCountry>> t() {
        return (LoadingWidget) this.checkLoadingView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0(final Function0<Unit> runnable) {
        LoadingDialogHelper loadingDialogHelper = this.loadingDialogHelper;
        Objects.requireNonNull(loadingDialogHelper);
        loadingDialogHelper.showLoading();
        XiaomiTokenMananger.bind(requireActivity(), new XiaomiTokenMananger.OnBindXiaomiCallback() { // from class: com.xiaomi.hm.health.nfc.WalletMiFitFragment$wechatLoginBindXiaomiAccount$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<Unit> {
                public final /* synthetic */ WalletMiFitFragment a;
                public final /* synthetic */ Function0<Unit> b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(WalletMiFitFragment walletMiFitFragment, Function0<Unit> function0) {
                    super(0);
                    this.a = walletMiFitFragment;
                    this.b = function0;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit getA() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.a.t0(this.b);
                }
            }

            @Override // com.huami.account.XiaomiTokenMananger.OnBindXiaomiCallback
            public void onAlreadyBind(@NotNull String xiaomiId) {
                LoadingDialogHelper loadingDialogHelper2 = this.a.loadingDialogHelper;
                Objects.requireNonNull(loadingDialogHelper2);
                loadingDialogHelper2.hideLoading();
            }

            @Override // com.huami.account.XiaomiTokenMananger.OnBindXiaomiCallback
            public void onError() {
                WalletMiFitFragment walletMiFitFragment = this.a;
                walletMiFitFragment.i0(new a(walletMiFitFragment, runnable));
            }

            @Override // com.huami.account.XiaomiTokenMananger.OnBindXiaomiCallback
            public void onSuccess(@NotNull String xiaomiId) {
                LoadingDialogHelper loadingDialogHelper2 = this.a.loadingDialogHelper;
                Objects.requireNonNull(loadingDialogHelper2);
                loadingDialogHelper2.hideLoading();
                runnable.getA();
            }

            @Override // com.huami.account.XiaomiTokenMananger.OnBindXiaomiCallback
            public void onUserCancel() {
                LoadingDialogHelper loadingDialogHelper2 = this.a.loadingDialogHelper;
                Objects.requireNonNull(loadingDialogHelper2);
                loadingDialogHelper2.hideLoading();
            }
        });
    }

    private final String u() {
        return y().getDeviceModel().getModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceUtilsApi v() {
        return (DeviceUtilsApi) this.deviceUtilsApi.getValue();
    }

    private final LoadingWidget<CardListResp> w() {
        return (LoadingWidget) this.loadingView.getValue();
    }

    private final NFCApi x() {
        return (NFCApi) this.nfcApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NfcDevice y() {
        return (NfcDevice) this.nfcDevice.getValue();
    }

    private final LoadingWidgetApi z() {
        return (LoadingWidgetApi) this.upLoadingView.getValue();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        EventBus.getDefault().register(this);
        return inflater.inflate(R.layout.fragment_wallet, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Disposable disposable = this.permissionsSubscribe;
        if (disposable != null) {
            disposable.dispose();
        }
        w().dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        EventBus.getDefault().unregister(this);
        super.onDestroyView();
    }

    public final void onEventBackgroundThread(@NotNull final EventHttpError eventHttpError) {
        FragmentActivity activity;
        HMLog.info("onEventBackgroundThread:EventHttpError", new p(eventHttpError));
        String str = eventHttpError.errorCode;
        if (str == null || Intrinsics.areEqual(str, "http401") || !Intrinsics.areEqual(eventHttpError.errorCode, PayResponse.CODE_HTTP_ERROR_MI_TOKEN) || (activity = getActivity()) == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: xd8
            @Override // java.lang.Runnable
            public final void run() {
                WalletMiFitFragment.Z(this.a, eventHttpError);
            }
        });
    }

    public final void onEventMainThread(@NotNull EventAccountStatus status) {
        HMLog.info("onEventMainThread:EventAccountStatus", new t(status));
        int status2 = status.getStatus();
        if (status2 == 1 || status2 == 2) {
            SmartExecutor.getExecutor().execute(new Runnable() { // from class: wd8
                @Override // java.lang.Runnable
                public final void run() {
                    WalletMiFitFragment.a0(this.a);
                }
            });
        }
    }

    @Override // com.huami.utils.easypermission.EasyPermissions.PermissionCallbacks
    public void onPermissionsDenied(int requestCode, @NotNull List<String> perms) {
        if (EasyPermissions.somePermissionPermanentlyDenied(this, perms)) {
            new PermissionDialogFragmentCompat.Builder().setMessage(getString(R.string.permission_rationale_denied_storage_bank)).create().show(requireFragmentManager(), "");
        }
    }

    @Override // com.huami.utils.easypermission.EasyPermissions.PermissionCallbacks
    public void onPermissionsGranted(int requestCode, @NotNull List<String> perms) {
        if (requestCode == 111 && perms.size() == 3) {
            B();
        }
    }

    @Override // androidx.fragment.app.Fragment, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        this.loadingDialogHelper = new LoadingDialogHelper(requireActivity());
        MasterCardConfigKt.initMasterConfig();
        E();
        I();
        C();
        L();
    }

    public final void setVisible(@NotNull View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }
}
