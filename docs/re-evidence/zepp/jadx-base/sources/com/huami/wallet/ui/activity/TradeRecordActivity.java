package com.huami.wallet.ui.activity;

import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.nfc.applet.ConstantKt;
import com.huami.wallet.lib.api.WalletDataSource;
import com.huami.wallet.lib.entity.InVoiceInfo;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.lib.entity.XiaomiInVoiceInfo;
import com.huami.wallet.lib.util.ErrorCode;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.activity.TradeRecordActivity;
import com.huami.wallet.ui.dialog.SelectInVoiceDialogFragment;
import com.huami.wallet.ui.entity.BusCardDetailData;
import com.huami.wallet.ui.fragment.TradeRecordFragment;
import com.huami.wallet.ui.helper.InvoiceIntroduceHelperKt;
import com.huami.wallet.ui.helper.LiveDataExtensionKt;
import com.huami.wallet.ui.navigation.NavigationController;
import com.huami.wallet.ui.utils.KTExtFunKt;
import com.huami.wallet.ui.viewmodel.ServiceChargeViewModel;
import com.huami.widget.toast.CustomToast;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 C2\u00020\u0001:\u0001CB\u0007¢\u0006\u0004\bA\u0010BJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\b\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\u001a\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\u0012\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014R\u001d\u0010\u001b\u001a\u00020\u00168F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010 \u001a\u00020\u001c8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010%\u001a\u00020!8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R$\u00100\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00104\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010+\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/R\u0018\u00105\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010+R\u0018\u00106\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010+R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010+R\u001d\u0010@\u001a\u00020<8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010\u0018\u001a\u0004\b>\u0010?¨\u0006D"}, d2 = {"Lcom/huami/wallet/ui/activity/TradeRecordActivity;", "Lcom/huami/wallet/ui/activity/BaseWalletActivity;", "", SOAP.XMLNS, ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/wallet/lib/entity/Resource;", "", "isInVoiceAddress", "i", DTransferConstants.SEARCH_KEY, com.google.android.exoplayer2.text.ttml.b.r, "initView", "isShowRechargeInvoice", "", "miInVoiceUrl", "r", "l", GoogleApiAvailabilityLight.b, z.j, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/huami/wallet/ui/viewmodel/ServiceChargeViewModel;", "c", "Lkotlin/Lazy;", "getViewModel", "()Lcom/huami/wallet/ui/viewmodel/ServiceChargeViewModel;", "viewModel", "Lcom/huami/wallet/ui/navigation/NavigationController;", GoogleApiAvailabilityLight.a, "getMNavigationController", "()Lcom/huami/wallet/ui/navigation/NavigationController;", "mNavigationController", "Lcom/huami/wallet/lib/api/WalletDataSource;", "e", "getWalletDataSource", "()Lcom/huami/wallet/lib/api/WalletDataSource;", "walletDataSource", "Lcom/huami/wallet/ui/dialog/SelectInVoiceDialogFragment;", "f", "Lcom/huami/wallet/ui/dialog/SelectInVoiceDialogFragment;", "selectInVoiceDialogFragment", "g", "Ljava/lang/String;", "getBusCardId", "()Ljava/lang/String;", "setBusCardId", "(Ljava/lang/String;)V", "busCardId", "h", "getBusCardName", "setBusCardName", "busCardName", "busXiaoMiCardName", "busCardNumber", "Lcom/huami/wallet/ui/entity/BusCardDetailData;", hl.k, "Lcom/huami/wallet/ui/entity/BusCardDetailData;", "busCardDetailData", "invoiceVersion", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "m", "getLoadingDialog", "()Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loadingDialog", "<init>", "()V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class TradeRecordActivity extends BaseWalletActivity {

    @NotNull
    public static final String EXTRA_BUS_CARD_ID = "ARG_BUS_CARD_ID";

    @NotNull
    public static final String EXTRA_BUS_CARD_NAME = "ARG_BUS_CARD_NAME";

    @NotNull
    public static final String EXTRA_BUS_CARD_NUMBER = "ARG_BUS_CARD_NUMBER";

    @NotNull
    public static final String EXTRA_XIAO_MI_CARD_NAME = "ARG_XIAO_MI_CARDNAME";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy mNavigationController;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy walletDataSource;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private SelectInVoiceDialogFragment selectInVoiceDialogFragment;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private String busCardId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private String busCardName;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private String busXiaoMiCardName;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private String busCardNumber;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private BusCardDetailData busCardDetailData;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private String invoiceVersion;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final Lazy loadingDialog;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<RainbowTitleBar, Unit> {
        public a() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(TradeRecordActivity tradeRecordActivity, View view) {
            tradeRecordActivity.onBackPressed();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(TradeRecordActivity tradeRecordActivity, View view, int i) throws Exception {
            tradeRecordActivity.p();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(TradeRecordActivity tradeRecordActivity, View view, int i) throws Exception {
            tradeRecordActivity.p();
        }

        public final void e(@NotNull RainbowTitleBar rainbowTitleBar) {
            final TradeRecordActivity tradeRecordActivity = TradeRecordActivity.this;
            rainbowTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.huami.wallet.ui.activity.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TradeRecordActivity.a.f(tradeRecordActivity, view);
                }
            });
            if (!TradeRecordActivity.this.getWalletDataSource().isForMi()) {
                rainbowTitleBar.setMenuIcon(R.drawable.wl_ic_invoice_more);
                final TradeRecordActivity tradeRecordActivity2 = TradeRecordActivity.this;
                rainbowTitleBar.setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: com.huami.wallet.ui.activity.n
                    @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
                    public final void onClick(View view, int i) throws Exception {
                        TradeRecordActivity.a.h(tradeRecordActivity2, view, i);
                    }
                });
            } else if (TradeRecordActivity.this.getWalletDataSource().isSupportMiInVoice()) {
                rainbowTitleBar.setMenuIcon(R.drawable.wl_ic_invoice_more);
                final TradeRecordActivity tradeRecordActivity3 = TradeRecordActivity.this;
                rainbowTitleBar.setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: com.huami.wallet.ui.activity.m
                    @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
                    public final void onClick(View view, int i) throws Exception {
                        TradeRecordActivity.a.g(tradeRecordActivity3, view, i);
                    }
                });
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RainbowTitleBar rainbowTitleBar) {
            e(rainbowTitleBar);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/android/design/dialog/loading/LoadingDialog;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<LoadingDialog> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialog invoke() {
            TradeRecordActivity tradeRecordActivity = TradeRecordActivity.this;
            LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(tradeRecordActivity, tradeRecordActivity.getResources().getString(R.string.wl_loading));
            loadingDialogShowDialog.setCancelable(false);
            return loadingDialogShowDialog;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Resource;", "Lcom/huami/wallet/lib/entity/InVoiceInfo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Resource<InVoiceInfo>, Unit> {
        public c() {
            super(1);
        }

        public final void a(@NotNull Resource<InVoiceInfo> resource) {
            if (resource.status == Status.LOADING) {
                TradeRecordActivity.this.getLoadingDialog().show();
                return;
            }
            if (!resource.isSuccessful()) {
                TradeRecordActivity.this.q();
                TradeRecordActivity.this.i(resource, false);
                return;
            }
            InVoiceInfo inVoiceInfo = resource.data;
            if (inVoiceInfo == null) {
                TradeRecordActivity.this.l();
            } else {
                CheckInVoiceActivity.INSTANCE.open(TradeRecordActivity.this, inVoiceInfo, TradeRecordActivity.this.busCardDetailData);
            }
            TradeRecordActivity.this.q();
            TradeRecordActivity.this.getLoadingDialog().dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<InVoiceInfo> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Resource;", "Lcom/huami/wallet/lib/entity/XiaomiInVoiceInfo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Resource<XiaomiInVoiceInfo>, Unit> {
        public d() {
            super(1);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:40:0x009d  */
        public final void a(@NotNull Resource<XiaomiInVoiceInfo> resource) {
            if (resource.status == Status.LOADING) {
                TradeRecordActivity.this.getLoadingDialog().show();
                return;
            }
            if (!resource.isSuccessful()) {
                TradeRecordActivity.this.q();
                TradeRecordActivity.this.i(resource, true);
                return;
            }
            TradeRecordActivity tradeRecordActivity = TradeRecordActivity.this;
            XiaomiInVoiceInfo xiaomiInVoiceInfo = resource.data;
            tradeRecordActivity.invoiceVersion = xiaomiInVoiceInfo == null ? null : xiaomiInVoiceInfo.getVersion();
            XiaomiInVoiceInfo xiaomiInVoiceInfo2 = resource.data;
            String status = xiaomiInVoiceInfo2 == null ? null : xiaomiInVoiceInfo2.getStatus();
            if (status != null) {
                switch (status) {
                    case "70001":
                        MiCheckInVoiceActivity.Companion companion = MiCheckInVoiceActivity.INSTANCE;
                        TradeRecordActivity tradeRecordActivity2 = TradeRecordActivity.this;
                        XiaomiInVoiceInfo xiaomiInVoiceInfo3 = resource.data;
                        companion.open(tradeRecordActivity2, xiaomiInVoiceInfo3 != null ? xiaomiInVoiceInfo3.getDownUrl() : null, TradeRecordActivity.this.busCardDetailData, TradeRecordActivity.this.invoiceVersion);
                        break;
                    case "70002":
                        MiCheckInVoiceActivity.Companion companion2 = MiCheckInVoiceActivity.INSTANCE;
                        TradeRecordActivity tradeRecordActivity3 = TradeRecordActivity.this;
                        XiaomiInVoiceInfo xiaomiInVoiceInfo4 = resource.data;
                        companion2.open(tradeRecordActivity3, xiaomiInVoiceInfo4 != null ? xiaomiInVoiceInfo4.getDownUrl() : null, TradeRecordActivity.this.busCardDetailData, TradeRecordActivity.this.invoiceVersion);
                        break;
                    case "70003":
                        TradeRecordActivity.this.n();
                        break;
                    default:
                        TradeRecordActivity.this.n();
                        break;
                }
            } else {
                TradeRecordActivity.this.n();
            }
            TradeRecordActivity.this.q();
            TradeRecordActivity.this.getLoadingDialog().dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<XiaomiInVoiceInfo> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Resource;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<Resource<Integer>, Unit> {
        public e() {
            super(1);
        }

        public final void a(@NotNull Resource<Integer> resource) {
            if (resource.status == Status.LOADING) {
                TradeRecordActivity.this.getLoadingDialog().show();
                return;
            }
            if (!resource.isSuccessful()) {
                TradeRecordActivity.this.i(resource, false);
                return;
            }
            Integer num = resource.data;
            if (num != null && num.intValue() == 0) {
                TradeRecordActivity.this.j();
            } else {
                MiServiceChargeActivity.INSTANCE.open(TradeRecordActivity.this, String.valueOf(resource.data), TradeRecordActivity.this.getBusCardId(), TradeRecordActivity.this.busCardDetailData, TradeRecordActivity.this.invoiceVersion);
            }
            TradeRecordActivity.this.getLoadingDialog().dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<Integer> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Resource;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<Resource<String>, Unit> {
        public f() {
            super(1);
        }

        public final void a(@NotNull Resource<String> resource) {
            if (resource.status == Status.LOADING) {
                TradeRecordActivity.this.getLoadingDialog().show();
                return;
            }
            if (!resource.isSuccessful()) {
                TradeRecordActivity.this.i(resource, false);
                return;
            }
            String str = resource.data;
            if (str == null) {
                TradeRecordActivity.this.r(false, null);
            } else {
                TradeRecordActivity.this.r(true, str);
            }
            TradeRecordActivity.this.getLoadingDialog().dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<String> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TradeRecordActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.ui.activity.TradeRecordActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ServiceChargeViewModel>() { // from class: com.huami.wallet.ui.activity.TradeRecordActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.ui.viewmodel.ServiceChargeViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ServiceChargeViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(ServiceChargeViewModel.class), function0, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.SYNCHRONIZED;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.mNavigationController = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<NavigationController>() { // from class: com.huami.wallet.ui.activity.TradeRecordActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.wallet.ui.navigation.NavigationController, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final NavigationController invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(NavigationController.class), objArr2, objArr3);
            }
        });
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.walletDataSource = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<WalletDataSource>() { // from class: com.huami.wallet.ui.activity.TradeRecordActivity$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.wallet.lib.api.WalletDataSource, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final WalletDataSource invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(WalletDataSource.class), objArr4, objArr5);
            }
        });
        this.loadingDialog = LazyKt__LazyJVMKt.lazy(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoadingDialog getLoadingDialog() {
        return (LoadingDialog) this.loadingDialog.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> void i(Resource<T> resource, boolean z) {
        if (Intrinsics.areEqual(resource.code, ErrorCode.NETWORK_ERROR)) {
            CustomToast.showShort(this, getString(R.string.wl_network_not_connected));
            getLoadingDialog().dismiss();
        } else {
            if (z) {
                CustomToast.showShort(this, getString(R.string.wl_invoice_search_fail));
            } else {
                CustomToast.showShort(this, getString(R.string.wl_loading_fail));
            }
            getLoadingDialog().dismiss();
        }
    }

    private final void initView() {
        KTExtFunKt.showTitleAndNav(this, Integer.valueOf(R.string.wl_trade_title), new a());
        TradeRecordFragment tradeRecordFragment = new TradeRecordFragment();
        tradeRecordFragment.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().replace(getContentViewId(), tradeRecordFragment).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        new AlertDialogFragment.Builder(this).setCancelable(true).setMessage(R.string.wl_invoice_amount_tip).setNeutralButton(R.string.wl_i_know_it, new DialogInterface.OnClickListener() { // from class: gs7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                TradeRecordActivity.k(dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(DialogInterface dialogInterface, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        new AlertDialogFragment.Builder(this).setCancelable(true).setTitle(R.string.wl_invoice_tip).setMessage(R.string.wl_invoice_message).setNeutralButton(R.string.wl_i_know_it, new DialogInterface.OnClickListener() { // from class: es7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                TradeRecordActivity.m(this.a, dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(TradeRecordActivity tradeRecordActivity, DialogInterface dialogInterface, int i) {
        ServiceInVoiceActivity.INSTANCE.open(tradeRecordActivity, tradeRecordActivity.getBusCardId(), tradeRecordActivity.busCardDetailData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        new AlertDialogFragment.Builder(this).setCancelable(true).setTitle(R.string.wl_invoice_tip).setMessage(R.string.wl_invoice_tip_info).setNeutralButton(R.string.wl_i_know_it, new DialogInterface.OnClickListener() { // from class: fs7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) throws Exception {
                TradeRecordActivity.o(this.a, dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(TradeRecordActivity tradeRecordActivity, DialogInterface dialogInterface, int i) throws Exception {
        tradeRecordActivity.getViewModel().loadBusCardRechargeRecords(tradeRecordActivity.getBusCardId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() throws Exception {
        if (getWalletDataSource().isForMi()) {
            getViewModel().getChargeInvoiceDescription(this.busCardId);
        } else {
            r(true, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        SelectInVoiceDialogFragment selectInVoiceDialogFragment = this.selectInVoiceDialogFragment;
        if (selectInVoiceDialogFragment == null || !selectInVoiceDialogFragment.isShowing()) {
            return;
        }
        this.selectInVoiceDialogFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(boolean isShowRechargeInvoice, final String miInVoiceUrl) {
        SelectInVoiceDialogFragment.Companion companion = SelectInVoiceDialogFragment.INSTANCE;
        String str = this.busCardId;
        SelectInVoiceDialogFragment selectInVoiceDialogFragmentNewInstance = companion.newInstance(isShowRechargeInvoice, str == null ? false : str.equals(ConstantKt.APP_CODE_SHEN_ZHEN_MOT));
        this.selectInVoiceDialogFragment = selectInVoiceDialogFragmentNewInstance;
        if (selectInVoiceDialogFragmentNewInstance != null) {
            selectInVoiceDialogFragmentNewInstance.setOnInVoiceItemListener(new SelectInVoiceDialogFragment.OnInVoiceItemListener() { // from class: com.huami.wallet.ui.activity.TradeRecordActivity$showSelectInVoiceDialog$1
                @Override // com.huami.wallet.ui.dialog.SelectInVoiceDialogFragment.OnInVoiceItemListener
                public void clickCancel() {
                }

                @Override // com.huami.wallet.ui.dialog.SelectInVoiceDialogFragment.OnInVoiceItemListener
                public void clickRechargePosition() {
                    if (this.a.getWalletDataSource().isForMi()) {
                        String str2 = miInVoiceUrl;
                        if (!(str2 == null || str2.length() == 0)) {
                            this.a.getMNavigationController().navigateToWeb(miInVoiceUrl, null);
                            return;
                        }
                    }
                    this.a.getMNavigationController().navigateToWeb(InvoiceIntroduceHelperKt.getGoWebUrl(this.a.getWalletDataSource().getHost(), this.a.getWalletDataSource().getUserId(), this.a.getWalletDataSource().getAid(this.a.getBusCardId())), null);
                }

                @Override // com.huami.wallet.ui.dialog.SelectInVoiceDialogFragment.OnInVoiceItemListener
                public void clickServiceNegation() throws Exception {
                    if (this.a.getWalletDataSource().isForMi()) {
                        this.a.getViewModel().getInVoiceAddress(this.a.getBusCardId());
                    } else {
                        this.a.getViewModel().getInVoiceInfo(this.a.getBusCardId());
                    }
                }
            });
        }
        SelectInVoiceDialogFragment selectInVoiceDialogFragment = this.selectInVoiceDialogFragment;
        if (selectInVoiceDialogFragment == null) {
            return;
        }
        selectInVoiceDialogFragment.show(getSupportFragmentManager(), "TradeRecordActivity-SelectInVoiceDialogFragment");
    }

    private final void s() {
        LiveDataExtensionKt.observeResourceWithNotNull(getViewModel().getInVoiceInfoLiveData(), this, new c());
        LiveDataExtensionKt.observeResourceWithNotNull(getViewModel().getInVoiceAddressLiveData(), this, new d());
        LiveDataExtensionKt.observeResourceWithNotNull(getViewModel().getInVoiceAmountLiveData(), this, new e());
        LiveDataExtensionKt.observeResourceWithNotNull(getViewModel().getChargeInvoiceDescription(), this, new f());
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public final String getBusCardId() {
        return this.busCardId;
    }

    @Nullable
    public final String getBusCardName() {
        return this.busCardName;
    }

    @NotNull
    public final NavigationController getMNavigationController() {
        return (NavigationController) this.mNavigationController.getValue();
    }

    @NotNull
    public final ServiceChargeViewModel getViewModel() {
        return (ServiceChargeViewModel) this.viewModel.getValue();
    }

    @NotNull
    public final WalletDataSource getWalletDataSource() {
        return (WalletDataSource) this.walletDataSource.getValue();
    }

    @Override // com.huami.wallet.ui.activity.BaseWalletActivity, com.huami.wallet.ui.activity.BaseDeviceStatusActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.busCardId = getIntent().getStringExtra("ARG_BUS_CARD_ID");
        this.busCardName = getIntent().getStringExtra("ARG_BUS_CARD_NAME");
        this.busXiaoMiCardName = getIntent().getStringExtra("ARG_XIAO_MI_CARDNAME");
        this.busCardNumber = getIntent().getStringExtra("ARG_BUS_CARD_NUMBER");
        this.busCardDetailData = new BusCardDetailData(this.busCardId, this.busCardName, this.busXiaoMiCardName, this.busCardNumber);
        s();
        initView();
    }

    public final void setBusCardId(@Nullable String str) {
        this.busCardId = str;
    }

    public final void setBusCardName(@Nullable String str) {
        this.busCardName = str;
    }
}
