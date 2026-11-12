package com.xiaomi.hm.health.nfc;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.HMLoginManager;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.arch.core.State;
import com.huami.arch.core.Success;
import com.huami.devicex.R;
import com.huami.eid.ui.activity.EidHostActivity;
import com.huami.jac.repo.ActionToJacActivity;
import com.huami.jac.repo.viewapi.JacLoadingWidgetApi;
import com.huami.jac.repo.viewmodel.BaseViewModelKt;
import com.huami.jac.repo.viewmodel.JacCarViewModel;
import com.huami.jac.ui.amazfit.activity.JacCarHostActivity;
import com.huami.jac.ui.amazfit.view.JacLoadingWidgetImpl;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.nfc.base.ExtensionsKt;
import com.huami.nfc.car.entity.SupportCar;
import com.huami.nfc.car.entity.VCardInfo;
import com.huami.nfc.door.DoorCardInfo;
import com.huami.nfc.web.DeviceModel;
import com.huami.nfc.web.NfcDevice;
import com.huami.sleepassistant.lib.ui.base.ext.DataExKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.wallet.accessdoor.activity.AccessCardDetailActivity;
import com.huami.wallet.accessdoor.activity.AccessCardListActivity;
import com.huami.wallet.accessdoor.activity.SelectDoorTypeActivity;
import com.huami.wallet.accessdoor.entity.DoorInfoAndDefaultCard;
import com.huami.wallet.accessdoor.utils.EventId;
import com.huami.wallet.accessdoor.viewmodel.DoorEntranceViewModel;
import com.huami.wallet.lib.entity.BusCardSimple2;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.ui.helper.LiveDataExtensionKt;
import com.huami.wallet.ui.helper.LoadingDialogHelper;
import com.huami.wallet.ui.navigation.NavigationController;
import com.huami.wallet.ui.viewmodel.EntranceViewModel;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.eid.EidDeviceUtil;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.util.Rx;
import com.huami.widget.toast.CustomToastKtxKt;
import com.huami.xiaopeng.repo.ActionToXiaoPengActivity;
import com.huami.xiaopeng.repo.viewapi.XpLoadingWidgetApi;
import com.huami.xiaopeng.repo.viewmodel.XiaopengCarViewModel;
import com.huami.xiaopeng.ui.amazfit.activity.CarHostActivity;
import com.huami.xiaopeng.ui.amazfit.view.XpLoadingWidgetImpl;
import com.loc.z;
import com.unionpay.repo.WatchUnionpayRepo;
import com.unionpay.tsm.TsmServiceDownloader;
import com.unionpay.ui.activity.UnionPayCardDetailActivity;
import com.unionpay.ui.fragment.ProgressDialogFragment;
import com.unionpay.util.BankEventUtil;
import com.unionpay.util.UnionPayUtil;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.NfcDeviceConfigKt;
import com.xiaomi.hm.health.device.feature.sync.SyncCenterManager;
import com.xiaomi.hm.health.discovery.WebHelper;
import com.xiaomi.hm.health.nfc.WalletFragment;
import com.xiaomi.hm.health.nfc.ext.ResourceExtKt;
import com.xiaomi.hm.health.nfc.xiaopeng.XiaoPengUtils;
import com.xiaomi.hm.health.utils.ex.CheckExtKt;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.context.GlobalContext;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ^2\u00020\u0001:\u0001^B\u0007¢\u0006\u0004\b\\\u0010]J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0002J\b\u0010\u0017\u001a\u00020\u0002H\u0002J&\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016R\u001d\u0010'\u001a\u00020\"8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010,\u001a\u00020(8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010+R\u001d\u00101\u001a\u00020-8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b/\u00100R\u001d\u00106\u001a\u0002028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010$\u001a\u0004\b4\u00105R\u001d\u0010;\u001a\u0002078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010$\u001a\u0004\b9\u0010:R\u001d\u0010@\u001a\u00020<8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010$\u001a\u0004\b>\u0010?R\u001d\u0010E\u001a\u00020A8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010$\u001a\u0004\bC\u0010DR\u0016\u0010H\u001a\u00020F8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010GR\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010P\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\"\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020R0Q8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010X\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010WR\u0018\u0010[\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010Z¨\u0006_"}, d2 = {"Lcom/xiaomi/hm/health/nfc/WalletFragment;", "Landroidx/fragment/app/Fragment;", "", "w", "u", "Lcom/xiaomi/hm/health/nfc/NfcStatus;", "nfcStatus", "t", "x", "y", "C", "v", "z", "E", LogUtil.D, "B", "K", "J", "L", "M", "", "l", "H", "h", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/wallet/ui/navigation/NavigationController;", "a", "Lkotlin/Lazy;", "r", "()Lcom/huami/wallet/ui/navigation/NavigationController;", "walletNavigationController", "Lcom/huami/wallet/ui/viewmodel/EntranceViewModel;", "b", DTransferConstants.SEARCH_KEY, "()Lcom/huami/wallet/ui/viewmodel/EntranceViewModel;", "walletEntranceViewModel", "Lcom/huami/wallet/accessdoor/viewmodel/DoorEntranceViewModel;", "c", GoogleApiAvailabilityLight.b, "()Lcom/huami/wallet/accessdoor/viewmodel/DoorEntranceViewModel;", "mDoorEntranceViewModel", "Lcom/huami/xiaopeng/repo/viewmodel/XiaopengCarViewModel;", GoogleApiAvailabilityLight.a, SOAP.XMLNS, "()Lcom/huami/xiaopeng/repo/viewmodel/XiaopengCarViewModel;", "xpViewModel", "Lcom/huami/jac/repo/viewmodel/JacCarViewModel;", "e", "m", "()Lcom/huami/jac/repo/viewmodel/JacCarViewModel;", "jacViewModel", "Lcom/huami/nfc/web/NfcDevice;", "f", "o", "()Lcom/huami/nfc/web/NfcDevice;", "nfcDevice", "Lcom/unionpay/repo/WatchUnionpayRepo;", "g", com.google.android.exoplayer2.text.ttml.b.r, "()Lcom/unionpay/repo/WatchUnionpayRepo;", "unionpayRepo", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "loadingDialogHelper", "Lcom/unionpay/tsm/TsmServiceDownloader;", "i", "Lcom/unionpay/tsm/TsmServiceDownloader;", "tsmDownloader", "Lcom/unionpay/ui/fragment/ProgressDialogFragment;", z.j, "Lcom/unionpay/ui/fragment/ProgressDialogFragment;", "tsmDownloadDialog", "", "", hl.k, "Ljava/util/Map;", "configMap", "Lcom/huami/xiaopeng/repo/viewapi/XpLoadingWidgetApi;", "Lcom/huami/xiaopeng/repo/viewapi/XpLoadingWidgetApi;", "xpLoadingWidgetApi", "Lcom/huami/jac/repo/viewapi/JacLoadingWidgetApi;", "Lcom/huami/jac/repo/viewapi/JacLoadingWidgetApi;", "jacLoadingWidgetApi", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WalletFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String n = "WalletFragment";

    @NotNull
    private static final String o = "bus";

    @NotNull
    private static final String p = "door";

    @NotNull
    private static final String q = "bank";

    @NotNull
    private static final String r = "eid";

    @NotNull
    private static final String s = "car";

    @NotNull
    private static final String t = "jac_car";
    private static final int u = 100;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy walletNavigationController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy walletEntranceViewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDoorEntranceViewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy xpViewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy jacViewModel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy nfcDevice;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy unionpayRepo;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private LoadingDialogHelper loadingDialogHelper;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private TsmServiceDownloader tsmDownloader;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private ProgressDialogFragment tsmDownloadDialog;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Map<String, Boolean> configMap;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private XpLoadingWidgetApi xpLoadingWidgetApi;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private JacLoadingWidgetApi jacLoadingWidgetApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b2\u00103J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002JA\u0010\u0013\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0002J(\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0002JY\u0010$\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00020\u000bJQ\u0010&\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u00172!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00020\u000bR\u0016\u0010'\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010(R\u0016\u0010*\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010(R\u0016\u0010+\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010(R\u0016\u0010,\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010(R\u0016\u0010-\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010(R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010(¨\u00064"}, d2 = {"Lcom/xiaomi/hm/health/nfc/WalletFragment$Companion;", "", "", "f", "Landroid/app/Activity;", "activity", "", "message", "g", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lkotlin/Function1;", "Lcom/xiaomi/hm/health/nfc/NfcStatus;", "Lkotlin/ParameterName;", "name", "nfcStatus", "onStatusChange", "Lkotlin/Function0;", "onPass", "e", "", "Lcom/huami/nfc/door/DoorCardInfo;", "list", "Lcom/huami/wallet/accessdoor/viewmodel/DoorEntranceViewModel;", "mDoorEntranceViewModel", "h", "Landroid/view/View;", "busView", "Landroidx/lifecycle/LifecycleOwner;", DataCacher.o, "Lcom/huami/wallet/ui/navigation/NavigationController;", "walletNavigationController", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "loadingDialogHelper", "Lcom/huami/wallet/ui/viewmodel/EntranceViewModel;", "walletEntranceViewModel", "bindBusView", "doorView", "bindDoorView", "KEY_BANK", "Ljava/lang/String;", "KEY_BUS", "KEY_CAR", "KEY_DOOR", "KEY_EID", "KEY_JAC_CAR", "", "MAX_PROGRESS", LogUtil.I, "TAG", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ Function1<NfcStatus, Unit> a;
            public final /* synthetic */ EntranceViewModel b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super NfcStatus, Unit> function1, EntranceViewModel entranceViewModel) {
                super(0);
                this.a = function1;
                this.b = entranceViewModel;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (HMLoginManager.isMainlandUser()) {
                    this.b.checkThenEnterWallet();
                } else {
                    this.a.invoke(NfcStatus.SHOW_OVERSEA_DIALOG);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Resource;", "", "kotlin.jvm.PlatformType", "resource", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<Resource<String>, Unit> {
            public final /* synthetic */ LoadingDialogHelper a;
            public final /* synthetic */ Activity b;
            public final /* synthetic */ View c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(LoadingDialogHelper loadingDialogHelper, Activity activity, View view) {
                super(1);
                this.a = loadingDialogHelper;
                this.b = activity;
                this.c = view;
            }

            public final void a(Resource<String> resource) {
                this.a.showOrError(resource);
                if (resource.status == Status.SUCCESS) {
                    WalletFragment.INSTANCE.g(this.b, resource.data);
                    Device currentDevice = DeviceManager.getManager(this.c.getContext()).getCurrentDevice();
                    if (currentDevice != null) {
                        String cplc = currentDevice.getCplc();
                        if (cplc == null || cplc.length() == 0) {
                            currentDevice.setCplc(resource.data);
                            DeviceManager.getManager(this.c.getContext()).save(currentDevice);
                        }
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Resource<String> resource) {
                a(resource);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Resource;", "", "Lcom/huami/wallet/lib/entity/BusCardSimple2;", "resource", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function1<Resource<List<? extends BusCardSimple2>>, Unit> {
            public final /* synthetic */ LoadingDialogHelper a;
            public final /* synthetic */ NavigationController b;
            public final /* synthetic */ Activity c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(LoadingDialogHelper loadingDialogHelper, NavigationController navigationController, Activity activity) {
                super(1);
                this.a = loadingDialogHelper;
                this.b = navigationController;
                this.c = activity;
            }

            public final void a(@NotNull Resource<List<BusCardSimple2>> resource) {
                this.a.showOrError(resource);
                if (resource.status == Status.SUCCESS) {
                    List<BusCardSimple2> list = resource.data;
                    int size = (list == null || !(list.isEmpty() ^ true)) ? 0 : resource.data.size();
                    if (size == 1) {
                        BusCardSimple2 busCardSimple2 = resource.data.get(0);
                        this.b.navigateToBusCardDetail(this.c, busCardSimple2.id, busCardSimple2.name, busCardSimple2.xiaomiCardName, busCardSimple2.imageUrl, busCardSimple2.shiftEnable.booleanValue(), busCardSimple2.packageName, busCardSimple2.appName, busCardSimple2.redirectTo, busCardSimple2.serviceContact);
                    } else if (size > 1) {
                        this.b.navigateToOpenedBusCardList(this.c);
                    } else {
                        this.b.navigateToRemindOpenBusCard(this.c);
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
        public static final class d extends Lambda implements Function0<Unit> {
            public final /* synthetic */ Function1<NfcStatus, Unit> a;
            public final /* synthetic */ DoorEntranceViewModel b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public d(Function1<? super NfcStatus, Unit> function1, DoorEntranceViewModel doorEntranceViewModel) {
                super(0);
                this.a = function1;
                this.b = doorEntranceViewModel;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (HMLoginManager.isMainlandUser()) {
                    DoorEntranceViewModel.getCardList$default(this.b, false, 1, null);
                } else {
                    this.a.invoke(NfcStatus.SHOW_OVERSEA_DIALOG);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001 \u0003*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "", "Lcom/huami/nfc/door/DoorCardInfo;", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function1<com.huami.wallet.accessdoor.helper.Resource<List<? extends DoorCardInfo>>, Unit> {
            public final /* synthetic */ LoadingDialogHelper a;
            public final /* synthetic */ Activity b;
            public final /* synthetic */ DoorEntranceViewModel c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(LoadingDialogHelper loadingDialogHelper, Activity activity, DoorEntranceViewModel doorEntranceViewModel) {
                super(1);
                this.a = loadingDialogHelper;
                this.b = activity;
                this.c = doorEntranceViewModel;
            }

            public final void a(com.huami.wallet.accessdoor.helper.Resource<List<DoorCardInfo>> resource) throws Exception {
                this.a.showOrError(ResourceExtKt.asBus(resource));
                if (resource.status == com.huami.wallet.accessdoor.helper.Status.SUCCESS) {
                    Companion companion = WalletFragment.INSTANCE;
                    companion.h(this.b, resource.data, this.c);
                    companion.f();
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(com.huami.wallet.accessdoor.helper.Resource<List<? extends DoorCardInfo>> resource) throws Exception {
                a(resource);
                return Unit.INSTANCE;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(View view, Function1 function1, EntranceViewModel entranceViewModel, View view2) {
            WalletFragment.INSTANCE.e(view.getContext(), function1, new a(function1, entranceViewModel));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(View view, Function1 function1, DoorEntranceViewModel doorEntranceViewModel, View view2) {
            WalletFragment.INSTANCE.e(view.getContext(), function1, new d(function1, doorEntranceViewModel));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(Context context, Function1<? super NfcStatus, Unit> onStatusChange, Function0<Unit> onPass) {
            if (!ExtensionsKt.isNetworkConnected(context)) {
                onStatusChange.invoke(NfcStatus.NETWORK_NOT_CONNECTED);
                return;
            }
            HMDeviceType majorDeviceType = HMDeviceManager.getInstance().getMajorDeviceType();
            if (!HMDeviceManager.getInstance().isConnected(majorDeviceType)) {
                HMBaseDevice device = HMDeviceManager.getInstance().getDevice(majorDeviceType);
                if (!HMDeviceManager.getInstance().isConnected(majorDeviceType) || device == null) {
                    onStatusChange.invoke(NfcStatus.DEVICE_NOT_CONNECTED);
                    return;
                } else if (SyncCenterManager.INSTANCE.isSyncing(device)) {
                    onStatusChange.invoke(NfcStatus.DATA_SYNCING);
                    return;
                }
            }
            onPass.getA();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void f() {
            DeviceModel deviceModel;
            String model;
            NfcDevice nfcDevice = (NfcDevice) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(NfcDevice.class), null, null);
            if (nfcDevice == null || (deviceModel = nfcDevice.getDeviceModel()) == null || (model = deviceModel.getModel()) == null) {
                return;
            }
            HashMap map = new HashMap(2);
            map.put("DeviceSource", model);
            Analytics.recordEvent(new CountEventBuilder(EventId.DOOR_VIEW_NUM).putExtras(map));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(Activity activity, String message) {
            ClipboardManager clipboardManager = (ClipboardManager) activity.getSystemService("clipboard");
            if (clipboardManager == null) {
                return;
            }
            clipboardManager.setPrimaryClip(ClipData.newPlainText("message", message));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h(Activity activity, List<DoorCardInfo> list, DoorEntranceViewModel mDoorEntranceViewModel) throws Exception {
            if (list == null || list.isEmpty()) {
                SelectDoorTypeActivity.INSTANCE.open(activity);
            } else if (list.size() == 1) {
                mDoorEntranceViewModel.isDefaultCard(list.get(0).getAid());
            } else {
                AccessCardListActivity.INSTANCE.open(activity);
            }
        }

        public final void bindBusView(@NotNull final View busView, @NotNull Activity activity, @NotNull LifecycleOwner owner, @NotNull NavigationController walletNavigationController, @NotNull LoadingDialogHelper loadingDialogHelper, @NotNull final EntranceViewModel walletEntranceViewModel, @NotNull final Function1<? super NfcStatus, Unit> onStatusChange) {
            busView.setOnClickListener(new View.OnClickListener() { // from class: rd8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WalletFragment.Companion.c(busView, onStatusChange, walletEntranceViewModel, view);
                }
            });
            LiveDataExtensionKt.observeWithNotNull(walletEntranceViewModel.cplcLiveData, owner, new b(loadingDialogHelper, activity, busView));
            LiveDataExtensionKt.observeWithNotNull(walletEntranceViewModel.installedBusCards, owner, new c(loadingDialogHelper, walletNavigationController, activity));
            Device currentDevice = DeviceManager.getManager(busView.getContext()).getCurrentDevice();
            if (currentDevice != null) {
                String cplc = currentDevice.getCplc();
                if (cplc == null || cplc.length() == 0) {
                    walletEntranceViewModel.loadCplc();
                }
            }
        }

        public final void bindDoorView(@NotNull final View doorView, @NotNull final Activity activity, @NotNull LifecycleOwner owner, @NotNull final LoadingDialogHelper loadingDialogHelper, @NotNull final DoorEntranceViewModel mDoorEntranceViewModel, @NotNull final Function1<? super NfcStatus, Unit> onStatusChange) {
            doorView.setOnClickListener(new View.OnClickListener() { // from class: qd8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WalletFragment.Companion.d(doorView, onStatusChange, mDoorEntranceViewModel, view);
                }
            });
            LiveDataExtensionKt.observeWithNotNull(mDoorEntranceViewModel.getGetCardListLiveData(), owner, new e(loadingDialogHelper, activity, mDoorEntranceViewModel));
            LiveDataExtensionKt.observeWithNotNull(mDoorEntranceViewModel.isDefaultCardLiveData(), owner, new Function1<com.huami.wallet.accessdoor.helper.Resource<Boolean>, Unit>() { // from class: com.xiaomi.hm.health.nfc.WalletFragment$Companion$bindDoorView$3

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

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(com.huami.wallet.accessdoor.helper.Resource<Boolean> resource) {
                    Boolean bool;
                    Boolean bool2;
                    int i = WhenMappings.$EnumSwitchMapping$0[resource.status.ordinal()];
                    boolean z = true;
                    if (i == 1) {
                        loadingDialogHelper.showLoading();
                        return;
                    }
                    if (i == 2 || i == 3) {
                        loadingDialogHelper.hideLoading();
                        com.huami.wallet.accessdoor.helper.Resource<List<DoorCardInfo>> value = mDoorEntranceViewModel.getGetCardListLiveData().getValue();
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
                        AccessCardDetailActivity.INSTANCE.open(activity, new DoorInfoAndDefaultCard(list.get(0), (resource.status != com.huami.wallet.accessdoor.helper.Status.SUCCESS || (bool2 = bool) == null) ? false : bool2.booleanValue()), false);
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(com.huami.wallet.accessdoor.helper.Resource<Boolean> resource) {
                    a(resource);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NfcStatus.values().length];
            iArr[NfcStatus.DEVICE_NOT_CONNECTED.ordinal()] = 1;
            iArr[NfcStatus.NETWORK_NOT_CONNECTED.ordinal()] = 2;
            iArr[NfcStatus.DATA_SYNCING.ordinal()] = 3;
            iArr[NfcStatus.SHOW_OVERSEA_DIALOG.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: com.xiaomi.hm.health.nfc.WalletFragment$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/nfc/NfcStatus;", "nfcStatus", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0980a extends Lambda implements Function1<NfcStatus, Unit> {
            public final /* synthetic */ WalletFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0980a(WalletFragment walletFragment) {
                super(1);
                this.a = walletFragment;
            }

            public final void a(@NotNull NfcStatus nfcStatus) {
                this.a.t(nfcStatus);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(NfcStatus nfcStatus) {
                a(nfcStatus);
                return Unit.INSTANCE;
            }
        }

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
            Companion companion = WalletFragment.INSTANCE;
            View view = WalletFragment.this.getView();
            View viewFindViewById = view == null ? null : view.findViewById(R.id.busItem);
            FragmentActivity fragmentActivityRequireActivity = WalletFragment.this.requireActivity();
            WalletFragment walletFragment = WalletFragment.this;
            NavigationController navigationControllerR = walletFragment.r();
            LoadingDialogHelper loadingDialogHelper = WalletFragment.this.loadingDialogHelper;
            Objects.requireNonNull(loadingDialogHelper);
            companion.bindBusView(viewFindViewById, fragmentActivityRequireActivity, walletFragment, navigationControllerR, loadingDialogHelper, WalletFragment.this.q(), new C0980a(WalletFragment.this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/nfc/NfcStatus;", "nfcStatus", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<NfcStatus, Unit> {
            public final /* synthetic */ WalletFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WalletFragment walletFragment) {
                super(1);
                this.a = walletFragment;
            }

            public final void a(@NotNull NfcStatus nfcStatus) {
                this.a.t(nfcStatus);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(NfcStatus nfcStatus) {
                a(nfcStatus);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.hm.health.nfc.WalletFragment$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0981b extends Lambda implements Function0<Unit> {
            public final /* synthetic */ WalletFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0981b(WalletFragment walletFragment) {
                super(0);
                this.a = walletFragment;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.J();
            }
        }

        public b() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(WalletFragment walletFragment, View view) {
            WalletFragment.INSTANCE.e(walletFragment.requireContext(), new a(walletFragment), new C0981b(walletFragment));
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            WalletFragment.this.xpLoadingWidgetApi = new XpLoadingWidgetImpl(WalletFragment.this.requireContext(), false);
            WalletFragment.this.D();
            View view = WalletFragment.this.getView();
            View viewFindViewById = view == null ? null : view.findViewById(R.id.carItem);
            final WalletFragment walletFragment = WalletFragment.this;
            ((com.huami.watch.companion.ui.view.NfcItemView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.nfc.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    WalletFragment.b.b(walletFragment, view2);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/nfc/NfcStatus;", "nfcStatus", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<NfcStatus, Unit> {
            public final /* synthetic */ WalletFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WalletFragment walletFragment) {
                super(1);
                this.a = walletFragment;
            }

            public final void a(@NotNull NfcStatus nfcStatus) {
                this.a.t(nfcStatus);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(NfcStatus nfcStatus) {
                a(nfcStatus);
                return Unit.INSTANCE;
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
            Companion companion = WalletFragment.INSTANCE;
            View view = WalletFragment.this.getView();
            View viewFindViewById = view == null ? null : view.findViewById(R.id.doorItem);
            FragmentActivity fragmentActivityRequireActivity = WalletFragment.this.requireActivity();
            WalletFragment walletFragment = WalletFragment.this;
            LoadingDialogHelper loadingDialogHelper = walletFragment.loadingDialogHelper;
            Objects.requireNonNull(loadingDialogHelper);
            companion.bindDoorView(viewFindViewById, fragmentActivityRequireActivity, walletFragment, loadingDialogHelper, WalletFragment.this.n(), new a(WalletFragment.this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/nfc/NfcStatus;", "nfcStatus", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<NfcStatus, Unit> {
            public final /* synthetic */ WalletFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WalletFragment walletFragment) {
                super(1);
                this.a = walletFragment;
            }

            public final void a(@NotNull NfcStatus nfcStatus) {
                this.a.t(nfcStatus);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(NfcStatus nfcStatus) {
                a(nfcStatus);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<Unit> {
            public final /* synthetic */ WalletFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(WalletFragment walletFragment) {
                super(0);
                this.a = walletFragment;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.K();
            }
        }

        public d() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(WalletFragment walletFragment, View view) {
            WalletFragment.INSTANCE.e(walletFragment.requireContext(), new a(walletFragment), new b(walletFragment));
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            View view = WalletFragment.this.getView();
            View viewFindViewById = view == null ? null : view.findViewById(R.id.eidItem);
            final WalletFragment walletFragment = WalletFragment.this;
            ((com.huami.watch.companion.ui.view.NfcItemView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.nfc.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    WalletFragment.d.b(walletFragment, view2);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/nfc/NfcStatus;", "nfcStatus", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<NfcStatus, Unit> {
        public e() {
            super(1);
        }

        public final void a(@NotNull NfcStatus nfcStatus) {
            WalletFragment.this.t(nfcStatus);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NfcStatus nfcStatus) {
            a(nfcStatus);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Unit> {
        public f() {
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
            WalletFragment.this.L();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/State;", "Lcom/huami/nfc/car/entity/VCardInfo;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<State<? extends VCardInfo>, Unit> {
        public g() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001d  */
        public final void a(@NotNull State<VCardInfo> state) {
            int i;
            VCardInfo vCardInfo = (VCardInfo) ((Success) state).getValue();
            if (vCardInfo == null) {
                i = 0;
            } else {
                if (vCardInfo.getVCardId().length() > 0) {
                    i = 1;
                } else {
                    i = 0;
                }
            }
            JacCarHostActivity.INSTANCE.toCar(WalletFragment.this.requireContext(), ActionToJacActivity.Inner, i, "0", "0");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(State<? extends VCardInfo> state) {
            a(state);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/State;", "", "Lcom/huami/nfc/car/entity/SupportCar;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<State<? extends List<SupportCar>>, Unit> {
        public h() {
            super(1);
        }

        public final void a(@NotNull State<? extends List<SupportCar>> state) {
            List<SupportCar> list = (List) ((Success) state).getValue();
            if (list == null) {
                return;
            }
            WalletFragment walletFragment = WalletFragment.this;
            for (SupportCar supportCar : list) {
                if (Intrinsics.areEqual(supportCar.getFactoryCode(), CarType.Jac.getType()) && supportCar.getStatus() > 0) {
                    walletFragment.configMap.put(WalletFragment.t, Boolean.TRUE);
                }
                View view = walletFragment.getView();
                (view == null ? null : view.findViewById(R.id.jacCarItem)).setVisibility(DataExKt.toNoNull((Boolean) walletFragment.configMap.get(WalletFragment.t)) ? 0 : 8);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(State<? extends List<SupportCar>> state) {
            a(state);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/nfc/NfcStatus;", "nfcStatus", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<NfcStatus, Unit> {
            public final /* synthetic */ WalletFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WalletFragment walletFragment) {
                super(1);
                this.a = walletFragment;
            }

            public final void a(@NotNull NfcStatus nfcStatus) {
                this.a.t(nfcStatus);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(NfcStatus nfcStatus) {
                a(nfcStatus);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<Unit> {
            public final /* synthetic */ WalletFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(WalletFragment walletFragment) {
                super(0);
                this.a = walletFragment;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.M();
            }
        }

        public i() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(WalletFragment walletFragment, View view) {
            WalletFragment.INSTANCE.e(walletFragment.requireContext(), new a(walletFragment), new b(walletFragment));
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            View view = WalletFragment.this.getView();
            ((NfcItemView) (view == null ? null : view.findViewById(R.id.bankItem))).setNfcTitle(R.string.nfc_union_pay_card);
            View view2 = WalletFragment.this.getView();
            View viewFindViewById = view2 != null ? view2.findViewById(R.id.bankItem) : null;
            final WalletFragment walletFragment = WalletFragment.this;
            ((NfcItemView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.nfc.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    WalletFragment.i.b(walletFragment, view3);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/State;", "Lcom/huami/nfc/car/entity/VCardInfo;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function1<State<? extends VCardInfo>, Unit> {
        public j() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001d  */
        public final void a(@NotNull State<VCardInfo> state) {
            int i;
            VCardInfo vCardInfo = (VCardInfo) ((Success) state).getValue();
            if (vCardInfo == null) {
                i = 0;
            } else {
                if (vCardInfo.getVCardId().length() > 0) {
                    i = 1;
                } else {
                    i = 0;
                }
            }
            CarHostActivity.INSTANCE.toCar(WalletFragment.this.requireContext(), ActionToXiaoPengActivity.Inner, i, "", "");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(State<? extends VCardInfo> state) {
            a(state);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WalletFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.walletNavigationController = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<NavigationController>() { // from class: com.xiaomi.hm.health.nfc.WalletFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.wallet.ui.navigation.NavigationController, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final NavigationController getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(NavigationController.class), qualifier, objArr);
            }
        });
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.nfc.WalletFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.NONE;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.walletEntranceViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<EntranceViewModel>() { // from class: com.xiaomi.hm.health.nfc.WalletFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.ui.viewmodel.EntranceViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final EntranceViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, objArr2, Reflection.getOrCreateKotlinClass(EntranceViewModel.class), function0, objArr3);
            }
        });
        final Function0<ViewModelOwner> function1 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.nfc.WalletFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.mDoorEntranceViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<DoorEntranceViewModel>() { // from class: com.xiaomi.hm.health.nfc.WalletFragment$special$$inlined$viewModel$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.accessdoor.viewmodel.DoorEntranceViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DoorEntranceViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, objArr4, Reflection.getOrCreateKotlinClass(DoorEntranceViewModel.class), function1, objArr5);
            }
        });
        final Function0<ViewModelOwner> function2 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.nfc.WalletFragment$special$$inlined$viewModel$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.xpViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<XiaopengCarViewModel>() { // from class: com.xiaomi.hm.health.nfc.WalletFragment$special$$inlined$viewModel$default$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.xiaopeng.repo.viewmodel.XiaopengCarViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final XiaopengCarViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, objArr6, Reflection.getOrCreateKotlinClass(XiaopengCarViewModel.class), function2, objArr7);
            }
        });
        final Function0<ViewModelOwner> function3 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.nfc.WalletFragment$special$$inlined$viewModel$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        final Object[] objArr8 = 0 == true ? 1 : 0;
        final Object[] objArr9 = 0 == true ? 1 : 0;
        this.jacViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<JacCarViewModel>() { // from class: com.xiaomi.hm.health.nfc.WalletFragment$special$$inlined$viewModel$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.jac.repo.viewmodel.JacCarViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final JacCarViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, objArr8, Reflection.getOrCreateKotlinClass(JacCarViewModel.class), function3, objArr9);
            }
        });
        final Object[] objArr10 = 0 == true ? 1 : 0;
        final Object[] objArr11 = 0 == true ? 1 : 0;
        this.nfcDevice = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<NfcDevice>() { // from class: com.xiaomi.hm.health.nfc.WalletFragment$special$$inlined$inject$default$2
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
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(NfcDevice.class), objArr10, objArr11);
            }
        });
        final Object[] objArr12 = 0 == true ? 1 : 0;
        final Object[] objArr13 = 0 == true ? 1 : 0;
        this.unionpayRepo = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<WatchUnionpayRepo>() { // from class: com.xiaomi.hm.health.nfc.WalletFragment$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.unionpay.repo.WatchUnionpayRepo, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final WatchUnionpayRepo getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(WatchUnionpayRepo.class), objArr12, objArr13);
            }
        });
        this.configMap = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(WalletFragment walletFragment, View view) {
        INSTANCE.e(walletFragment.requireContext(), walletFragment.new e(), walletFragment.new f());
    }

    private final void B() {
        BaseViewModelKt.observeOnSuccessJac$default(m().getCardListLiveData(), this, this.jacLoadingWidgetApi, null, new g(), 4, null);
        BaseViewModelKt.observeOnSuccessJac$default(m().getSupportCarListLiveData(), this, null, null, new h(), 6, null);
        m().getSupportCarList();
    }

    private final void C() {
        View view = getView();
        (view == null ? null : view.findViewById(R.id.bankItem)).setVisibility(DataExKt.toNoNull(this.configMap.get(q)) ? 0 : 8);
        CheckExtKt.ifTrue(this.configMap.get(q), new i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D() {
        com.huami.xiaopeng.repo.viewmodel.BaseViewModelKt.observeOnSuccessXp$default(s().getCardListLiveData(), this, this.xpLoadingWidgetApi, null, new j(), 4, null);
    }

    private final void E() {
        new AlertDialogFragment.Builder(requireContext()).setCancelable(true).setMessage(R.string.nfc_oversea_help).setPositiveButton(R.string.nfc_help, new DialogInterface.OnClickListener() { // from class: kd8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                WalletFragment.F(dialogInterface, i2);
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: ld8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                WalletFragment.G(dialogInterface, i2);
            }
        }).show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(DialogInterface dialogInterface, int i2) {
        WebHelper.launch("https://help.jr.mi.com/?app=com.mipay.wallet#/p/96e3916f-42d0-41c9-a18d-50ee3ad064ef?P=1");
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    private final void H() {
        AlertDialog.setTitle(getString(R.string.wl_tsm_download_title)).setMessage(getString(R.string.wl_tsm_download_msg)).setPositiveBtn(getString(R.string.wl_tsm_download), new DialogInterface.OnClickListener() { // from class: jd8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                WalletFragment.I(this.a, dialogInterface, i2);
            }
        }).setNegativeBtn(getString(R.string.access_card_cancel)).show(requireActivity(), "unionpay_tsm_download");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(WalletFragment walletFragment, DialogInterface dialogInterface, int i2) {
        walletFragment.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J() {
        s().getVCardInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K() {
        startActivity(new Intent(requireContext(), (Class<?>) EidHostActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L() {
        m().getVCardInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M() {
        if (!UnionPayUtil.isTsmServiceInstalled(requireContext())) {
            H();
        } else {
            BankEventUtil.recordBankEvent(BankEventUtil.UNIONPAY_ENTER, l());
            startActivity(new Intent(requireContext(), (Class<?>) UnionPayCardDetailActivity.class));
        }
    }

    private final void h() {
        TsmServiceDownloader tsmServiceDownloader = this.tsmDownloader;
        if (tsmServiceDownloader != null) {
            tsmServiceDownloader.cancel();
        }
        final FragmentActivity fragmentActivityRequireActivity = requireActivity();
        final String string = getString(R.string.wl_tsm_downloading);
        final String string2 = getString(R.string.wl_tsm_dont_close_app);
        Rx.io(new ObservableOnSubscribe() { // from class: od8
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                WalletFragment.i(this.a, observableEmitter);
            }
        }).safeSubscribe(new Consumer() { // from class: pd8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WalletFragment.j(this.a, fragmentActivityRequireActivity, string, string2, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(WalletFragment walletFragment, ObservableEmitter observableEmitter) {
        observableEmitter.onNext(walletFragment.p().getTsmDownloadUrl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(final WalletFragment walletFragment, FragmentActivity fragmentActivity, String str, String str2, String str3) {
        if (str3 == null || str3.length() == 0) {
            CustomToastKtxKt.showToast$default((Fragment) walletFragment, (CharSequence) walletFragment.getString(R.string.wl_get_union_tsm_url_error), false, 2, (Object) null);
            return;
        }
        ProgressDialogFragment progressDialogFragment = new ProgressDialogFragment();
        progressDialogFragment.setCancelable(false);
        progressDialogFragment.setTitle(str);
        progressDialogFragment.setMessage(str2);
        progressDialogFragment.show(fragmentActivity.getSupportFragmentManager(), "unionpay_tsm_download_progress");
        Unit unit = Unit.INSTANCE;
        walletFragment.tsmDownloadDialog = progressDialogFragment;
        TsmServiceDownloader tsmServiceDownloader = new TsmServiceDownloader(fragmentActivity.getApplicationContext());
        walletFragment.tsmDownloader = tsmServiceDownloader;
        tsmServiceDownloader.download(str3, new TsmServiceDownloader.DownloadProgressListener() { // from class: nd8
            @Override // com.unionpay.tsm.TsmServiceDownloader.DownloadProgressListener
            public final void onProgress(int i2) {
                WalletFragment.k(this.a, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(WalletFragment walletFragment, int i2) {
        ProgressDialogFragment progressDialogFragment;
        ProgressDialogFragment progressDialogFragment2 = walletFragment.tsmDownloadDialog;
        if (progressDialogFragment2 != null) {
            progressDialogFragment2.setProgress(i2);
        }
        if (i2 != 100 || (progressDialogFragment = walletFragment.tsmDownloadDialog) == null) {
            return;
        }
        progressDialogFragment.dismissAllowingStateLoss();
    }

    private final String l() {
        return o().getDeviceModel().getModel();
    }

    private final JacCarViewModel m() {
        return (JacCarViewModel) this.jacViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DoorEntranceViewModel n() {
        return (DoorEntranceViewModel) this.mDoorEntranceViewModel.getValue();
    }

    private final NfcDevice o() {
        return (NfcDevice) this.nfcDevice.getValue();
    }

    private final WatchUnionpayRepo p() {
        return (WatchUnionpayRepo) this.unionpayRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EntranceViewModel q() {
        return (EntranceViewModel) this.walletEntranceViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NavigationController r() {
        return (NavigationController) this.walletNavigationController.getValue();
    }

    private final XiaopengCarViewModel s() {
        return (XiaopengCarViewModel) this.xpViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(NfcStatus nfcStatus) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[nfcStatus.ordinal()];
        if (i2 == 1) {
            CustomToastKtxKt.showToast$default((Fragment) this, (CharSequence) getString(R.string.device_disconnect_tip), false, 2, (Object) null);
            return;
        }
        if (i2 == 2) {
            CustomToastKtxKt.showToast$default((Fragment) this, (CharSequence) getString(R.string.no_network_connection), false, 2, (Object) null);
        } else if (i2 == 3) {
            CustomToastKtxKt.showToast$default((Fragment) this, (CharSequence) getString(R.string.device_sync_tips), false, 2, (Object) null);
        } else {
            if (i2 != 4) {
                return;
            }
            E();
        }
    }

    private final void u() {
        View view = getView();
        (view == null ? null : view.findViewById(R.id.busItem)).setVisibility(DataExKt.toNoNull(this.configMap.get(o)) ? 0 : 8);
        CheckExtKt.ifTrue(this.configMap.get(o), new a());
    }

    private final void v() {
        View view = getView();
        (view == null ? null : view.findViewById(R.id.carItem)).setVisibility(DataExKt.toNoNull(this.configMap.get(s)) ? 0 : 8);
        CheckExtKt.ifTrue(this.configMap.get(s), new b());
    }

    private final void w() {
        this.configMap.clear();
        if (GlobalConfig.get().isBuildAmazfit()) {
            Map<String, Boolean> map = this.configMap;
            Boolean bool = Boolean.FALSE;
            map.put(o, bool);
            this.configMap.put(p, bool);
            this.configMap.put("eid", bool);
            this.configMap.put(q, bool);
            this.configMap.put(s, bool);
            return;
        }
        Device currentDevice = DeviceManager.getManager(getContext()).getCurrentDevice();
        if (currentDevice != null) {
            this.configMap.put("eid", Boolean.valueOf(EidDeviceUtil.isSupportEid(currentDevice)));
            this.configMap.put(o, Boolean.valueOf(DeviceUtil.isSupportNFC(currentDevice)));
            this.configMap.put(p, Boolean.valueOf(DeviceUtil.isSupportNFCDoor(currentDevice)));
            this.configMap.put(q, Boolean.valueOf(DeviceUtil.isSupportNFCUnionPay(currentDevice)));
        } else {
            this.configMap.put(o, Boolean.valueOf(NfcDeviceConfigKt.hasFeatureNfcBusDevice()));
            this.configMap.put(p, Boolean.valueOf(NfcDeviceConfigKt.hasFeatureNfcDoorDevice()));
            Map<String, Boolean> map2 = this.configMap;
            Boolean bool2 = Boolean.FALSE;
            map2.put("eid", bool2);
            this.configMap.put(q, bool2);
        }
        this.configMap.put(s, Boolean.valueOf(XiaoPengUtils.INSTANCE.isSupportXiaoPeng(requireContext())));
        this.configMap.put(t, Boolean.FALSE);
    }

    private final void x() {
        View view = getView();
        (view == null ? null : view.findViewById(R.id.doorItem)).setVisibility(DataExKt.toNoNull(this.configMap.get(p)) ? 0 : 8);
        CheckExtKt.ifTrue(this.configMap.get(p), new c());
    }

    private final void y() {
        View view = getView();
        (view == null ? null : view.findViewById(R.id.eidItem)).setVisibility(DataExKt.toNoNull(this.configMap.get("eid")) ? 0 : 8);
        CheckExtKt.ifTrue(this.configMap.get("eid"), new d());
    }

    private final void z() {
        View view = getView();
        (view == null ? null : view.findViewById(R.id.jacCarItem)).setVisibility(DataExKt.toNoNull(this.configMap.get(t)) ? 0 : 8);
        this.jacLoadingWidgetApi = new JacLoadingWidgetImpl(requireContext(), false);
        B();
        View view2 = getView();
        ((com.huami.watch.companion.ui.view.NfcItemView) (view2 != null ? view2.findViewById(R.id.jacCarItem) : null)).setOnClickListener(new View.OnClickListener() { // from class: md8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                WalletFragment.A(this.a, view3);
            }
        });
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_wallet, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        this.loadingDialogHelper = new LoadingDialogHelper(requireActivity());
        w();
        u();
        x();
        y();
        v();
        C();
        z();
    }
}
