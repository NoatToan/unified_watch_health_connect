package com.xiaomi.hm.health.device;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.amap.api.mapcore.util.hl;
import com.android.billingclient.api.BillingFlowParams;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.HMLoginManager;
import com.huami.account.HMLogoutManager;
import com.huami.account.XiaoAiTokenConvertManager;
import com.huami.account.XiaoaiTokenKeeper;
import com.huami.account.XiaomiTokenMananger;
import com.huami.account.bean.LogoutResult;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.util.net.NetUtil;
import com.huami.wallet.ui.helper.LoadingDialogHelper;
import com.huami.widget.toast.IconToast;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseBleDevice;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.device.XiaoAiEntranceHelper;
import com.xiaomi.hm.health.di.koin.imp.AccountDeviceTokenImplKt;
import com.xiaomi.hm.health.discovery.WebHelper;
import com.xiaomi.hm.health.manager.UnitManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.speech.activity.SpeechEngineUpdateMiotAuthorizeActivity;
import com.xiaomi.hm.health.speech.constant.AboutSpeechSpecs;
import com.xiaomi.hm.health.speech.utils.EngineAccessCheckFucKt;
import com.xiaomi.hm.health.utils.CincoAnalytics;
import com.xiaomi.hm.health.utils.KongmingAnalytics;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 Y2\u00020\u0001:\u0004YZ[\\B\u0019\u0012\u0006\u0010/\u001a\u00020*\u0012\b\b\u0002\u00105\u001a\u000200¢\u0006\u0004\bR\u0010SB\u001b\b\u0017\u0012\u0006\u0010U\u001a\u00020T\u0012\b\b\u0002\u00105\u001a\u000200¢\u0006\u0004\bR\u0010VB\u001b\b\u0017\u0012\u0006\u0010W\u001a\u00020N\u0012\b\b\u0002\u00105\u001a\u000200¢\u0006\u0004\bR\u0010XJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\fH\u0002J0\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u000eH\u0002J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u000eH\u0002J\b\u0010\u001c\u001a\u00020\u0004H\u0002J\b\u0010\u001d\u001a\u00020\u0004H\u0002J\b\u0010\u001e\u001a\u00020\u0004H\u0002J\b\u0010\u001f\u001a\u00020\u0004H\u0002J8\u0010!\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0016\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u0016J\u0010\u0010(\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010&J\u0006\u0010)\u001a\u00020\u0004R\u0019\u0010/\u001a\u00020*8\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u00105\u001a\u0002008\u0006@\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0016\u00108\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001e\u0010=\u001a\n :*\u0004\u0018\u000109098\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001d\u0010B\u001a\u00020>8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010?\u001a\u0004\b@\u0010AR\u001d\u0010G\u001a\u00020C8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010?\u001a\u0004\bE\u0010FR\u0016\u0010J\u001a\u00020H8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010IR\u0018\u0010'\u001a\u0004\u0018\u00010K8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0013\u0010Q\u001a\u00020N8F@\u0006¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006]"}, d2 = {"Lcom/xiaomi/hm/health/device/XiaoAiEntranceHelper;", "Lorg/koin/core/component/KoinComponent;", "Landroid/content/Context;", "g", "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "w", "z", "m", "C", "v", GoogleApiAvailabilityLight.b, "Landroidx/fragment/app/FragmentManager;", "l", "", "title", "content", "cancelButtonDesc", "customOperationDesc", "Landroid/content/DialogInterface$OnClickListener;", "customOperationListener", "x", "", "id", hl.k, BillingFlowParams.EXTRA_PARAM_KEY_ACCOUNT_ID, SOAP.XMLNS, "B", com.google.android.exoplayer2.text.ttml.b.r, DTransferConstants.SEARCH_KEY, "r", "e", "cancelListener", "y", "requestCode", "resultCode", "", "onActivityResult", "Lcom/xiaomi/hm/health/bt/device/HMBaseBleDevice;", "device", "initMiotPermissionPromptShow", "navigateAuthPageOrFaq", "Lcom/xiaomi/hm/health/device/XiaoAiEntranceHelper$Host;", "a", "Lcom/xiaomi/hm/health/device/XiaoAiEntranceHelper$Host;", "getHost", "()Lcom/xiaomi/hm/health/device/XiaoAiEntranceHelper$Host;", "host", "Lcom/xiaomi/hm/health/device/XiaoAiEntranceHelper$LoadingDialogDelegate;", "b", "Lcom/xiaomi/hm/health/device/XiaoAiEntranceHelper$LoadingDialogDelegate;", "getDialogDelegate", "()Lcom/xiaomi/hm/health/device/XiaoAiEntranceHelper$LoadingDialogDelegate;", "dialogDelegate", "c", "Z", "isUpdateMiJiaAuthorizationFromPlayMiBandFlag", "Lcom/xiaomi/hm/health/device/HMDeviceManager;", "kotlin.jvm.PlatformType", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/device/HMDeviceManager;", "deviceManager", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "Lkotlin/Lazy;", "i", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "f", z.j, "()Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "keeperProxyApi", "Lcom/huami/account/XiaomiTokenMananger$OnAuthCallback;", "Lcom/huami/account/XiaomiTokenMananger$OnAuthCallback;", "convertTokenCallback", "Lcom/xiaomi/hm/health/bt/device/HMMiLiDevice;", "h", "()Lcom/xiaomi/hm/health/bt/device/HMMiLiDevice;", "Landroidx/fragment/app/FragmentActivity;", "getContext", "()Landroidx/fragment/app/FragmentActivity;", DbUtils.Const.Table.CONTEXT, "<init>", "(Lcom/xiaomi/hm/health/device/XiaoAiEntranceHelper$Host;Lcom/xiaomi/hm/health/device/XiaoAiEntranceHelper$LoadingDialogDelegate;)V", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;Lcom/xiaomi/hm/health/device/XiaoAiEntranceHelper$LoadingDialogDelegate;)V", "activity", "(Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/hm/health/device/XiaoAiEntranceHelper$LoadingDialogDelegate;)V", "Companion", "DefaultDialogDelegate", "Host", "LoadingDialogDelegate", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class XiaoAiEntranceHelper implements KoinComponent {
    private static final int h = 10;
    private static final int i = 20;

    @NotNull
    private static final String j = "XiaoAiEntranceHelper";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Host host;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LoadingDialogDelegate dialogDelegate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isUpdateMiJiaAuthorizationFromPlayMiBandFlag;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final HMDeviceManager deviceManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceSource;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy keeperProxyApi;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final XiaomiTokenMananger.OnAuthCallback convertTokenCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0005\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/device/XiaoAiEntranceHelper$Host;", "", "Landroidx/fragment/app/FragmentActivity;", "getContext", "()Landroidx/fragment/app/FragmentActivity;", DbUtils.Const.Table.CONTEXT, "<init>", "()V", "ActivityHost", "FragmentHost", "Lcom/xiaomi/hm/health/device/XiaoAiEntranceHelper$Host$ActivityHost;", "Lcom/xiaomi/hm/health/device/XiaoAiEntranceHelper$Host$FragmentHost;", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static abstract class Host {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/device/XiaoAiEntranceHelper$Host$ActivityHost;", "Lcom/xiaomi/hm/health/device/XiaoAiEntranceHelper$Host;", "Landroidx/fragment/app/FragmentActivity;", "a", "Landroidx/fragment/app/FragmentActivity;", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "activity", "<init>", "(Landroidx/fragment/app/FragmentActivity;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
        public static final class ActivityHost extends Host {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final FragmentActivity activity;

            public ActivityHost(@NotNull FragmentActivity fragmentActivity) {
                super(null);
                this.activity = fragmentActivity;
            }

            @NotNull
            public final FragmentActivity getActivity() {
                return this.activity;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/device/XiaoAiEntranceHelper$Host$FragmentHost;", "Lcom/xiaomi/hm/health/device/XiaoAiEntranceHelper$Host;", "Landroidx/fragment/app/Fragment;", "a", "Landroidx/fragment/app/Fragment;", "getFragment", "()Landroidx/fragment/app/Fragment;", "fragment", "<init>", "(Landroidx/fragment/app/Fragment;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
        public static final class FragmentHost extends Host {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final Fragment fragment;

            public FragmentHost(@NotNull Fragment fragment) {
                super(null);
                this.fragment = fragment;
            }

            @NotNull
            public final Fragment getFragment() {
                return this.fragment;
            }
        }

        private Host() {
        }

        public /* synthetic */ Host(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FragmentActivity getContext() {
            if (this instanceof ActivityHost) {
                return ((ActivityHost) this).getActivity();
            }
            if (this instanceof FragmentHost) {
                return ((FragmentHost) this).getFragment().requireActivity();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/XiaoAiEntranceHelper$LoadingDialogDelegate;", "", "", "showLoading", "", "message", "showLoadingWithMessage", "hideLoading", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public interface LoadingDialogDelegate {
        void hideLoading();

        void showLoading();

        void showLoadingWithMessage(@NotNull String message);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "获取绑定设备失败（checkoutXiaoMiXiaoaiAndMiotPermission）";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<HMDeviceSource> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMDeviceSource invoke() {
            return XiaoAiEntranceHelper.this.deviceManager.getBoundDeviceSource(HMDeviceType.MILI);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "获取绑定设备失败(initMiotPermissionPromptShow)";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "获取绑定设备失败(startRequestDeviceToken)";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "获取绑定设备失败(userAuthorizeXiaoAiAndMiotPermission)";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public XiaoAiEntranceHelper(@NotNull Fragment fragment) {
        this(fragment, (LoadingDialogDelegate) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public XiaoAiEntranceHelper(@NotNull FragmentActivity fragmentActivity) {
        this(fragmentActivity, (LoadingDialogDelegate) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public XiaoAiEntranceHelper(@NotNull Host host, @NotNull LoadingDialogDelegate loadingDialogDelegate) {
        this.host = host;
        this.dialogDelegate = loadingDialogDelegate;
        this.deviceManager = HMDeviceManager.getInstance();
        this.deviceSource = LazyKt__LazyJVMKt.lazy(new b());
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.keeperProxyApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<KeeperProxyApi>() { // from class: com.xiaomi.hm.health.device.XiaoAiEntranceHelper$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.keeper.KeeperProxyApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final KeeperProxyApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(KeeperProxyApi.class), qualifier, objArr);
            }
        });
        this.convertTokenCallback = new XiaomiTokenMananger.OnAuthCallback() { // from class: com.xiaomi.hm.health.device.XiaoAiEntranceHelper$convertTokenCallback$1
            @Override // com.huami.account.XiaomiTokenMananger.OnAuthCallback
            public void onDifferentAccount() {
            }

            @Override // com.huami.account.XiaomiTokenMananger.OnAuthCallback
            public void onError(@NotNull ErrorCode errorCode) {
                this.a.q();
            }

            @Override // com.huami.account.XiaomiTokenMananger.OnAuthCallback
            public void onSuccess() {
                this.a.r();
            }

            @Override // com.huami.account.XiaomiTokenMananger.OnAuthCallback
            public void onUserCancel() {
            }
        };
    }

    private final void A() {
        HMMiLiDevice hMMiLiDeviceH = h();
        if (hMMiLiDeviceH == null) {
            HMLog.info(j, d.a);
        } else {
            XiaomiTokenMananger.reAuthorizationForXiaoai(getContext(), hMMiLiDeviceH.getDeviceInfo().getSerialNumber(), IAccount.PROVIDER_DEVICE_KONGMING, hMMiLiDeviceH.getDeviceSource().getValue(), new XiaomiTokenMananger.OnDeviceAuthCallback() { // from class: com.xiaomi.hm.health.device.XiaoAiEntranceHelper$startRequestDeviceToken$1
                @Override // com.huami.account.XiaomiTokenMananger.OnAuthCallback
                public void onError(@NotNull ErrorCode errorCode) {
                    this.a.q();
                }

                @Override // com.huami.account.XiaomiTokenMananger.OnAuthCallback
                public void onSuccess() {
                    this.a.r();
                }

                @Override // com.huami.account.XiaomiTokenMananger.OnAuthCallback
                public void onUserCancel() {
                    this.a.p();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(final String accountId) {
        final HMMiLiDevice hMMiLiDeviceH = h();
        if (hMMiLiDeviceH == null) {
            HMLog.info(j, e.a);
            return;
        }
        this.dialogDelegate.showLoading();
        XiaomiTokenMananger.reAuthorization(getContext(), accountId, new XiaomiTokenMananger.OnAuthCallback() { // from class: com.xiaomi.hm.health.device.XiaoAiEntranceHelper$userAuthorizeXiaoAiAndMiotPermission$1
            @Override // com.huami.account.XiaomiTokenMananger.OnAuthCallback
            public void onDifferentAccount() {
                this.a.s(accountId);
            }

            @Override // com.huami.account.XiaomiTokenMananger.OnAuthCallback
            public void onError(@NotNull ErrorCode errorCode) {
                this.a.q();
            }

            @Override // com.huami.account.XiaomiTokenMananger.OnAuthCallback
            public void onSuccess() {
                if (!XiaoAiTokenConvertManager.isDeviceSourceSupportConvert(hMMiLiDeviceH.getDeviceSource().getValue())) {
                    this.a.r();
                } else {
                    XiaoAiTokenConvertManager.authByConvertToken(hMMiLiDeviceH.getDeviceInfo().getSerialNumber(), XiaoAiTokenConvertManager.convertTpac(hMMiLiDeviceH.getDeviceSource().getValue()), this.a.convertTokenCallback);
                }
            }

            @Override // com.huami.account.XiaomiTokenMananger.OnAuthCallback
            public void onUserCancel() {
                this.a.p();
            }
        });
        KongmingAnalytics.kongmingAuthorizationNumAnalytics();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        this.dialogDelegate.showLoading();
        XiaomiTokenMananger.bind(getContext(), new XiaoAiEntranceHelper$userBindXiaoMiAccountWithXiaoAiAndMiotPermission$1(this));
    }

    private final void e() {
        HMMiLiDevice hMMiLiDeviceH = h();
        if (hMMiLiDeviceH == null) {
            HMLog.info(j, a.a);
            return;
        }
        if (!EngineAccessCheckFucKt.miAiRegionAccess()) {
            new AlertDialogFragment.Builder(getContext()).setCancelable(true).setMessage(R.string.speech_account_authorize_illegal_region_content).setNeutralButton(R.string.speech_account_authorize_base_dialog_button_custome_operation_got_it, new DialogInterface.OnClickListener() { // from class: dz8
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    XiaoAiEntranceHelper.f(dialogInterface, i2);
                }
            }).create().show(l());
            return;
        }
        DeviceInfo deviceInfo = hMMiLiDeviceH.getDeviceInfo();
        String serialNumber = deviceInfo == null ? null : deviceInfo.getSerialNumber();
        boolean zIsConvertTokenFailed = XiaoaiTokenKeeper.INSTANCE.isConvertTokenFailed(serialNumber);
        if (XiaomiTokenMananger.hasXiaomiAiToken(i().getValue(), serialNumber) && !zIsConvertTokenFailed) {
            v();
        } else if (NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            m();
        } else {
            IconToast.showError(g(), k(R.string.no_network_connection));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context g() {
        return getContext().getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HMMiLiDevice h() {
        HMBaseDevice device = this.deviceManager.getDevice(HMDeviceType.MILI);
        if (device instanceof HMMiLiDevice) {
            return (HMMiLiDevice) device;
        }
        return null;
    }

    private final HMDeviceSource i() {
        return (HMDeviceSource) this.deviceSource.getValue();
    }

    private final KeeperProxyApi j() {
        return (KeeperProxyApi) this.keeperProxyApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String k(int id) {
        return getContext().getString(id);
    }

    private final FragmentManager l() {
        return getContext().getSupportFragmentManager();
    }

    private final void m() {
        Intent intent = new Intent(getContext(), (Class<?>) SpeechEngineUpdateMiotAuthorizeActivity.class);
        Host host = this.host;
        if (host instanceof Host.ActivityHost) {
            getContext().startActivityForResult(intent, 10);
        } else if (host instanceof Host.FragmentHost) {
            ((Host.FragmentHost) host).getFragment().startActivityForResult(intent, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(getContext());
        builder.setTitle(R.string.logout_title_2);
        builder.setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: az8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                XiaoAiEntranceHelper.o(this.a, dialogInterface, i2);
            }
        });
        builder.setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null);
        boolean zIsInComingCallEnabled = HMPersonInfo.getInstance().getMiliConfig().isInComingCallEnabled();
        boolean zHasBound = HMDeviceManager.getInstance().hasBound(HMDeviceType.MILI);
        if (zIsInComingCallEnabled && zHasBound) {
            builder.setMessage(R.string.logout_content);
        }
        builder.show(l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(final XiaoAiEntranceHelper xiaoAiEntranceHelper, DialogInterface dialogInterface, int i2) {
        HMLogoutManager.processDataWhenLogout(xiaoAiEntranceHelper.getContext(), new HMLogoutManager.OnLogoutListener() { // from class: com.xiaomi.hm.health.device.XiaoAiEntranceHelper$logoutAndLoginXiaomi$1$1
            @Override // com.huami.account.HMLogoutManager.OnLogoutListener
            public void onLogoutSuccess() {
                this.a.getDialogDelegate().hideLoading();
                LoadingDialog loadingDialog = new LoadingDialog(this.a.getContext());
                loadingDialog.show();
                String string = this.a.getContext().getString(R.string.logout_success);
                final XiaoAiEntranceHelper xiaoAiEntranceHelper2 = this.a;
                loadingDialog.setSuccess(string, 500, new LoadingDialog.OnAnimEndListener() { // from class: com.xiaomi.hm.health.device.XiaoAiEntranceHelper$logoutAndLoginXiaomi$1$1$onLogoutSuccess$1
                    @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                    public void onAnimEnd(@NotNull LoadingDialog dialog) {
                    }

                    @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                    public void onDismiss(@NotNull LoadingDialog dialog) {
                        UnitManager.getInstance().clear();
                        HMLogoutManager.logout(6);
                        xiaoAiEntranceHelper2.getContext().finish();
                    }
                });
            }

            @Override // com.huami.account.HMLogoutManager.OnLogoutListener
            public void onStartLogout(@NotNull LogoutResult result) {
                if (result.isSuccess()) {
                    this.a.getDialogDelegate().showLoadingWithMessage(this.a.k(R.string.logout_ongoing));
                } else {
                    this.a.getDialogDelegate().hideLoading();
                    IconToast.showError(this.a.getContext(), this.a.k(R.string.logout_failed));
                }
            }

            @Override // com.huami.account.HMLogoutManager.OnLogoutListener
            public void onSyncDataWhenLogout() {
                this.a.getDialogDelegate().showLoading();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        this.dialogDelegate.hideLoading();
        w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        this.dialogDelegate.hideLoading();
        IconToast.showError(g(), R.string.speech_account_authorize_result_fail);
        w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        this.dialogDelegate.hideLoading();
        IconToast.showSuccess(g(), R.string.speech_account_authorize_result_success);
        if (!this.isUpdateMiJiaAuthorizationFromPlayMiBandFlag) {
            v();
        }
        w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(final String accountId) {
        y(k(R.string.speech_account_authorize_no_unique_xiaomi_account_title), getContext().getString(R.string.speech_account_authorize_no_unique_xiaomi_account_content, new Object[]{accountId}), k(R.string.speech_account_authorize_base_dialog_button_cancel_desc), k(R.string.speech_account_authorize_no_unique_xiaomi_account_dialog_custom_operation_reauthorize), new DialogInterface.OnClickListener() { // from class: bz8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                XiaoAiEntranceHelper.t(this.a, dialogInterface, i2);
            }
        }, new DialogInterface.OnClickListener() { // from class: cz8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                XiaoAiEntranceHelper.u(this.a, accountId, dialogInterface, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(XiaoAiEntranceHelper xiaoAiEntranceHelper, DialogInterface dialogInterface, int i2) {
        xiaoAiEntranceHelper.m();
        xiaoAiEntranceHelper.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(XiaoAiEntranceHelper xiaoAiEntranceHelper, String str, DialogInterface dialogInterface, int i2) {
        xiaoAiEntranceHelper.B(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        if (!NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            IconToast.showError(g(), k(R.string.no_network_connection));
        } else {
            this.dialogDelegate.showLoading();
            AboutSpeechSpecs.getXiaoaiFaqUrl(i(), new AboutSpeechSpecs.SpeechFaqUrlCallback() { // from class: com.xiaomi.hm.health.device.XiaoAiEntranceHelper$requestXiaoaiFaqUrlAndVisit$1
                @Override // com.xiaomi.hm.health.speech.constant.AboutSpeechSpecs.SpeechFaqUrlCallback
                public void onFail() {
                    this.a.getDialogDelegate().hideLoading();
                    IconToast.showError(this.a.g(), this.a.k(R.string.load_fail));
                }

                @Override // com.xiaomi.hm.health.speech.constant.AboutSpeechSpecs.SpeechFaqUrlCallback
                public void onSuccess(@NotNull String faqUrl) {
                    this.a.getDialogDelegate().hideLoading();
                    WebHelper.launch(faqUrl);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        if (this.isUpdateMiJiaAuthorizationFromPlayMiBandFlag) {
            this.isUpdateMiJiaAuthorizationFromPlayMiBandFlag = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(String title, String content, String cancelButtonDesc, String customOperationDesc, DialogInterface.OnClickListener customOperationListener) {
        this.dialogDelegate.hideLoading();
        AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(g());
        builder.setCancelable(false);
        builder.setTitle(title);
        builder.setMessage(content);
        builder.setNegativeButton(cancelButtonDesc, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(customOperationDesc, customOperationListener);
        builder.show(l());
    }

    private final void y(String title, String content, String cancelButtonDesc, String customOperationDesc, DialogInterface.OnClickListener cancelListener, DialogInterface.OnClickListener customOperationListener) {
        this.dialogDelegate.hideLoading();
        AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(g());
        builder.setCancelable(false);
        builder.setTitle(title);
        builder.setMessage(content);
        builder.setNegativeButton(cancelButtonDesc, cancelListener);
        builder.setPositiveButton(customOperationDesc, customOperationListener);
        builder.show(l());
    }

    private final void z() {
        this.dialogDelegate.showLoading();
        HMMiLiDevice hMMiLiDeviceH = h();
        if (XiaoAiTokenConvertManager.interceptAuth(hMMiLiDeviceH == null ? null : AccountDeviceTokenImplKt.toAuthDevice(hMMiLiDeviceH), this.convertTokenCallback)) {
            return;
        }
        XiaomiTokenMananger.getBindInfo(new XiaoAiEntranceHelper$startRequestAccountInfo$1(this));
    }

    @NotNull
    public final FragmentActivity getContext() {
        return this.host.getContext();
    }

    @NotNull
    public final LoadingDialogDelegate getDialogDelegate() {
        return this.dialogDelegate;
    }

    @NotNull
    public final Host getHost() {
        return this.host;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final void initMiotPermissionPromptShow(@Nullable HMBaseBleDevice device) {
        if (device == null) {
            HMLog.info(j, c.a);
            return;
        }
        long validUid = HMLoginManager.getValidUid();
        boolean zHasXiaomiAiToken = XiaomiTokenMananger.hasXiaomiAiToken();
        boolean zIsUserHaveBoundDeviceFirstlyShowMiotPermissionInDeviceIntroduceActivity = j().isUserHaveBoundDeviceFirstlyShowMiotPermissionInDeviceIntroduceActivity(validUid);
        boolean zIsSupportSilentConvertToken = XiaoAiTokenConvertManager.isSupportSilentConvertToken(device.getDeviceSource().getValue());
        if (zHasXiaomiAiToken || !zIsUserHaveBoundDeviceFirstlyShowMiotPermissionInDeviceIntroduceActivity || !HMDeviceConfig.hasFeatureSpeech(i()) || zIsSupportSilentConvertToken) {
            return;
        }
        this.isUpdateMiJiaAuthorizationFromPlayMiBandFlag = true;
        navigateAuthPageOrFaq();
        j().setUserHaveBoundDeviceFirstlyShowMiotPermissionInDeviceIntroduceActivity(validUid, false);
    }

    public final void navigateAuthPageOrFaq() {
        CincoAnalytics.cincoOperateAnalytics("voice");
        KongmingAnalytics.kongmingOperateAnalytics("voice");
        e();
    }

    public final boolean onActivityResult(int requestCode, int resultCode) {
        if (requestCode != 10 || resultCode != 20) {
            return false;
        }
        if (DeviceXFunctionsKt.getDeviceTokenApi().isSupportDeviceToken(i())) {
            A();
            return true;
        }
        z();
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/device/XiaoAiEntranceHelper$DefaultDialogDelegate;", "Lcom/xiaomi/hm/health/device/XiaoAiEntranceHelper$LoadingDialogDelegate;", "", "showLoading", "", "message", "showLoadingWithMessage", "hideLoading", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "a", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "getHelper", "()Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "helper", "Landroidx/fragment/app/FragmentActivity;", "activity", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lcom/huami/wallet/ui/helper/LoadingDialogHelper;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class DefaultDialogDelegate implements LoadingDialogDelegate {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final LoadingDialogHelper helper;

        public DefaultDialogDelegate(@NotNull FragmentActivity fragmentActivity, @NotNull LoadingDialogHelper loadingDialogHelper) {
            this.helper = loadingDialogHelper;
        }

        @NotNull
        public final LoadingDialogHelper getHelper() {
            return this.helper;
        }

        @Override // com.xiaomi.hm.health.device.XiaoAiEntranceHelper.LoadingDialogDelegate
        public void hideLoading() {
            this.helper.hideLoading();
        }

        @Override // com.xiaomi.hm.health.device.XiaoAiEntranceHelper.LoadingDialogDelegate
        public void showLoading() {
            this.helper.showLoading();
        }

        @Override // com.xiaomi.hm.health.device.XiaoAiEntranceHelper.LoadingDialogDelegate
        public void showLoadingWithMessage(@NotNull String message) {
            this.helper.showLoading(message);
        }

        public /* synthetic */ DefaultDialogDelegate(FragmentActivity fragmentActivity, LoadingDialogHelper loadingDialogHelper, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(fragmentActivity, (i & 2) != 0 ? new LoadingDialogHelper(fragmentActivity) : loadingDialogHelper);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ XiaoAiEntranceHelper(Host host, LoadingDialogDelegate loadingDialogDelegate, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(host, (i2 & 2) != 0 ? new DefaultDialogDelegate(host.getContext(), null, 2, 0 == true ? 1 : 0) : loadingDialogDelegate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ XiaoAiEntranceHelper(Fragment fragment, LoadingDialogDelegate loadingDialogDelegate, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragment, (i2 & 2) != 0 ? new DefaultDialogDelegate(fragment.requireActivity(), null, 2, 0 == true ? 1 : 0) : loadingDialogDelegate);
    }

    @JvmOverloads
    public XiaoAiEntranceHelper(@NotNull Fragment fragment, @NotNull LoadingDialogDelegate loadingDialogDelegate) {
        this(new Host.FragmentHost(fragment), loadingDialogDelegate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ XiaoAiEntranceHelper(FragmentActivity fragmentActivity, LoadingDialogDelegate loadingDialogDelegate, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentActivity, (i2 & 2) != 0 ? new DefaultDialogDelegate(fragmentActivity, null, 2, 0 == true ? 1 : 0) : loadingDialogDelegate);
    }

    @JvmOverloads
    public XiaoAiEntranceHelper(@NotNull FragmentActivity fragmentActivity, @NotNull LoadingDialogDelegate loadingDialogDelegate) {
        this(new Host.ActivityHost(fragmentActivity), loadingDialogDelegate);
    }
}
