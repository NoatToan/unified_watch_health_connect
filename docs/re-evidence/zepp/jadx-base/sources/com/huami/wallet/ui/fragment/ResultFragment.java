package com.huami.wallet.ui.fragment;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.annotation.VisibleForTesting;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.nfc.applet.ConstantKt;
import com.huami.tools.log.HMLog;
import com.huami.wallet.lib.entity.BusCardSimple2;
import com.huami.wallet.lib.entity.CitySimpleInfo;
import com.huami.wallet.lib.entity.Order;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.lib.entity.WalletConfig;
import com.huami.wallet.lib.util.CitySimpleInfoCache;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.adapter.BusCardStateListAdapter;
import com.huami.wallet.ui.decoration.DividerDecoration;
import com.huami.wallet.ui.di.module.KoinModuleKt;
import com.huami.wallet.ui.entity.BusCardStateItem;
import com.huami.wallet.ui.entity.FullResultInfo;
import com.huami.wallet.ui.fragment.ResultFragment;
import com.huami.wallet.ui.helper.BenchmarkResourceObserver;
import com.huami.wallet.ui.helper.LoadingDialogHelper;
import com.huami.wallet.ui.navigation.NavigationController;
import com.huami.wallet.ui.resource.IWalletRes;
import com.huami.wallet.ui.utils.DateTimeUtils;
import com.huami.wallet.ui.utils.ErrorMsgUtils;
import com.huami.wallet.ui.utils.KtUtilsKt;
import com.huami.wallet.ui.utils.ListUtils;
import com.huami.wallet.ui.utils.MoneyUtils;
import com.huami.wallet.ui.utils.TintUtils;
import com.huami.wallet.ui.utils.ViewUtils;
import com.huami.wallet.ui.viewmodel.BusCardDetailViewModel;
import com.huami.wallet.ui.viewmodel.BusCardResultViewModel;
import com.huami.widget.toast.IconToast;
import com.loc.z;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.m;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 u2\u00020\u0001:\u0003uvwB\u0007¢\u0006\u0004\bs\u0010tJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u001c\u0010\u0017\u001a\u00020\u00022\n\u0010\u0016\u001a\u00060\u0015R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u001c\u0010\u0019\u001a\u00020\u00022\n\u0010\u0016\u001a\u00060\u0015R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0012H\u0002J\b\u0010\u001a\u001a\u00020\u0002H\u0002J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0012H\u0002J\u0014\u0010\u001c\u001a\u00060\u0015R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0012H\u0002J\u001c\u0010\u001f\u001a\u00020\u00022\n\u0010\u0016\u001a\u00060\u0015R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u001c\u0010 \u001a\u00020\u00022\n\u0010\u0016\u001a\u00060\u0015R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u001a\u0010%\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0002J\u0018\u0010)\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020!H\u0002J\u0018\u0010+\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\u0006\u0010*\u001a\u00020!H\u0002J\u0010\u0010-\u001a\u00020\u00022\u0006\u0010,\u001a\u00020#H\u0002J\u0018\u00101\u001a\u0002002\u0006\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u00020!H\u0002J&\u00108\u001a\u0004\u0018\u00010&2\u0006\u00103\u001a\u0002022\b\u00105\u001a\u0004\u0018\u0001042\b\u00107\u001a\u0004\u0018\u000106H\u0016J\u001a\u00109\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\b\u00107\u001a\u0004\u0018\u000106H\u0016J\u0006\u0010:\u001a\u00020\u0002J\u0010\u0010<\u001a\u00020#2\u0006\u0010;\u001a\u00020!H\u0007R\u001d\u0010A\u001a\u00020#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001d\u0010F\u001a\u00020B8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010>\u001a\u0004\bD\u0010ER\u0016\u0010J\u001a\u00020G8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010R\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u001d\u0010W\u001a\u00020S8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010>\u001a\u0004\bU\u0010VR\u0018\u0010[\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u001d\u0010`\u001a\u00020\\8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b]\u0010>\u001a\u0004\b^\u0010_R\u0016\u0010b\u001a\u00020!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\ba\u0010\u001cR\u0016\u0010d\u001a\u00020!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bc\u0010\u001cR\u0016\u0010g\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010k\u001a\u00020h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010n\u001a\u0002008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0016\u0010p\u001a\u0002008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010mR\u0016\u0010r\u001a\u00020#8C@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bq\u0010@¨\u0006x"}, d2 = {"Lcom/huami/wallet/ui/fragment/ResultFragment;", "Lcom/huami/wallet/ui/fragment/BaseFragment;", "", "initViewModel", "b0", "E", "h0", "W", "G", "x", "X", "", "show", "g0", "initViews", "Lcom/huami/wallet/ui/entity/FullResultInfo;", "resultInfo", "q0", "Lcom/huami/wallet/lib/entity/Order;", "_order", "y", "Lcom/huami/wallet/ui/fragment/ResultFragment$StateAssist;", "stateAssist", "p0", StatEvent.MINE_KINGKONG_C_ORDER_VALUE, "k0", "Y", "m0", LogUtil.I, ExifInterface.LATITUDE_SOUTH, "j0", "F", "l0", "", "title", "", "value", "w", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "paddingTop", "a0", "paddingBottom", "Z", "msg", "e0", "orderState", "orderAmount", "Landroid/view/View$OnClickListener;", "C", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "onViewCreated", "onBackPressed", "state", "getFeedbackInfo", "b", "Lkotlin/Lazy;", "getAppName", "()Ljava/lang/String;", "appName", "Lcom/huami/wallet/ui/navigation/NavigationController;", "c", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "()Lcom/huami/wallet/ui/navigation/NavigationController;", "mNavigationController", "Lcom/huami/wallet/ui/resource/IWalletRes;", GoogleApiAvailabilityLight.a, "Lcom/huami/wallet/ui/resource/IWalletRes;", "iWalletRes", "Lcom/huami/wallet/ui/fragment/ResultFragment$a;", "e", "Lcom/huami/wallet/ui/fragment/ResultFragment$a;", "mViewHolder", "Lcom/huami/wallet/ui/adapter/BusCardStateListAdapter;", "f", "Lcom/huami/wallet/ui/adapter/BusCardStateListAdapter;", "mAdapter", "Lcom/huami/wallet/ui/viewmodel/BusCardResultViewModel;", "g", "B", "()Lcom/huami/wallet/ui/viewmodel/BusCardResultViewModel;", "mViewModel", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "h", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "mLoadingDialogHelper", "Lcom/huami/wallet/ui/viewmodel/BusCardDetailViewModel;", "i", "getViewModel", "()Lcom/huami/wallet/ui/viewmodel/BusCardDetailViewModel;", "viewModel", z.j, "stateTextResId", hl.k, "stateIconResId", "l", "Lcom/huami/wallet/lib/entity/Order;", "mOrder", "Ljava/lang/Runnable;", "m", "Ljava/lang/Runnable;", "mFinishLogic", GoogleApiAvailabilityLight.b, "Landroid/view/View$OnClickListener;", "mFinishButtonClickListener", "o", "mRetryClickListener", "z", "cityName", "<init>", "()V", "Companion", "StateAssist", "a", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class ResultFragment extends BaseFragment {

    @NotNull
    public static final String ARG_CARD_ID = "ARG_CARD_ID";

    @NotNull
    public static final String ARG_CARD_NAME = "ARG_CARD_NAME";

    @NotNull
    public static final String ARG_EXTRA_MSG = "ARG_EXTRA_MSG";

    @NotNull
    public static final String ARG_IS_CHECK_RECORD = "ARG_IS_CHECK_RECORD";

    @NotNull
    public static final String ARG_IS_NO_TOKEN = "ARG_IS_NO_TOKEN";

    @NotNull
    public static final String ARG_ORDER_ID = "ARG_ORDER_ID";

    @NotNull
    private static final String p = "Wallet-ResultFragment";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy appName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy mNavigationController;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final IWalletRes iWalletRes;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private a mViewHolder;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private BusCardStateListAdapter mAdapter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private LoadingDialogHelper mLoadingDialogHelper;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @StringRes
    private int stateTextResId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @DrawableRes
    private int stateIconResId;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private Order mOrder;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private Runnable mFinishLogic;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final View.OnClickListener mFinishButtonClickListener;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final View.OnClickListener mRetryClickListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b,\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b,\u0010-R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\"\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\"\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0004\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR\"\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR\"\u0010'\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0004\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\"\u0010+\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0004\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\b¨\u0006."}, d2 = {"Lcom/huami/wallet/ui/fragment/ResultFragment$StateAssist;", "", "", "a", "Z", "isOpenCardOperation", "()Z", "setOpenCardOperation", "(Z)V", "b", "isRechargeOperation", "setRechargeOperation", "c", "isRefundState", "setRefundState", GoogleApiAvailabilityLight.a, "isOnlyShowState", "setOnlyShowState", "e", "isRefundForRecharge", "setRefundForRecharge", "f", "isCheckSuccessOrder", "setCheckSuccessOrder", "g", "getAllowToShowBottomButton", "setAllowToShowBottomButton", "allowToShowBottomButton", "h", "getNeedToShowRefundHint", "setNeedToShowRefundHint", "needToShowRefundHint", "i", "getNeedShowDualButton", "setNeedShowDualButton", "needShowDualButton", z.j, "getNeedShowSingleButton", "setNeedShowSingleButton", "needShowSingleButton", hl.k, "getShowExtraMsg", "setShowExtraMsg", "showExtraMsg", "<init>", "(Lcom/huami/wallet/ui/fragment/ResultFragment;)V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public final class StateAssist {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private boolean isOpenCardOperation;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private boolean isRechargeOperation;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private boolean isRefundState;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private boolean isOnlyShowState;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private boolean isRefundForRecharge;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private boolean isCheckSuccessOrder;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private boolean allowToShowBottomButton;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private boolean needToShowRefundHint;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private boolean needShowDualButton;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private boolean needShowSingleButton;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private boolean showExtraMsg;

        public StateAssist() {
        }

        public final boolean getAllowToShowBottomButton() {
            return this.allowToShowBottomButton;
        }

        public final boolean getNeedShowDualButton() {
            return this.needShowDualButton;
        }

        public final boolean getNeedShowSingleButton() {
            return this.needShowSingleButton;
        }

        public final boolean getNeedToShowRefundHint() {
            return this.needToShowRefundHint;
        }

        public final boolean getShowExtraMsg() {
            return this.showExtraMsg;
        }

        /* JADX INFO: renamed from: isCheckSuccessOrder, reason: from getter */
        public final boolean getIsCheckSuccessOrder() {
            return this.isCheckSuccessOrder;
        }

        /* JADX INFO: renamed from: isOnlyShowState, reason: from getter */
        public final boolean getIsOnlyShowState() {
            return this.isOnlyShowState;
        }

        /* JADX INFO: renamed from: isOpenCardOperation, reason: from getter */
        public final boolean getIsOpenCardOperation() {
            return this.isOpenCardOperation;
        }

        /* JADX INFO: renamed from: isRechargeOperation, reason: from getter */
        public final boolean getIsRechargeOperation() {
            return this.isRechargeOperation;
        }

        /* JADX INFO: renamed from: isRefundForRecharge, reason: from getter */
        public final boolean getIsRefundForRecharge() {
            return this.isRefundForRecharge;
        }

        /* JADX INFO: renamed from: isRefundState, reason: from getter */
        public final boolean getIsRefundState() {
            return this.isRefundState;
        }

        public final void setAllowToShowBottomButton(boolean z) {
            this.allowToShowBottomButton = z;
        }

        public final void setCheckSuccessOrder(boolean z) {
            this.isCheckSuccessOrder = z;
        }

        public final void setNeedShowDualButton(boolean z) {
            this.needShowDualButton = z;
        }

        public final void setNeedShowSingleButton(boolean z) {
            this.needShowSingleButton = z;
        }

        public final void setNeedToShowRefundHint(boolean z) {
            this.needToShowRefundHint = z;
        }

        public final void setOnlyShowState(boolean z) {
            this.isOnlyShowState = z;
        }

        public final void setOpenCardOperation(boolean z) {
            this.isOpenCardOperation = z;
        }

        public final void setRechargeOperation(boolean z) {
            this.isRechargeOperation = z;
        }

        public final void setRefundForRecharge(boolean z) {
            this.isRefundForRecharge = z;
        }

        public final void setRefundState(boolean z) {
            this.isRefundState = z;
        }

        public final void setShowExtraMsg(boolean z) {
            this.showExtraMsg = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b2\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u00020\u00078\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0014\u001a\u00020\r8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\u00020\r8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001c\u0010\u001a\u001a\u00020\r8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011R\u001c\u0010 \u001a\u00020\u001b8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010$\u001a\u00020\u00028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0015\u0010#R\"\u0010'\u001a\u00020\u00028\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b%\u0010\"\u001a\u0004\b!\u0010#\"\u0004\b&\u0010\u0006R\"\u0010*\u001a\u00020\u00028\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b(\u0010\"\u001a\u0004\b%\u0010#\"\u0004\b)\u0010\u0006R\"\u0010,\u001a\u00020\u00028\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0010\u0010\"\u001a\u0004\b(\u0010#\"\u0004\b+\u0010\u0006R\u001c\u0010.\u001a\u00020\u00028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b-\u0010#R\u001c\u0010/\u001a\u00020\r8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\b\u0010\u0011R\u001c\u00100\u001a\u00020\r8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011R\u001c\u00101\u001a\u00020\r8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001c\u0010\u0011¨\u00063"}, d2 = {"com/huami/wallet/ui/fragment/ResultFragment$a", "", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", GoogleApiAvailabilityLight.b, "(Landroid/view/View;)V", "Landroidx/recyclerview/widget/RecyclerView;", "a", "Landroidx/recyclerview/widget/RecyclerView;", z.j, "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "i", "()Landroid/widget/TextView;", SOAP.XMLNS, "(Landroid/widget/TextView;)V", "orderState", "c", GoogleApiAvailabilityLight.a, "o", "extraMsg", hl.k, "refundHint", "Landroid/widget/Button;", "e", "Landroid/widget/Button;", "m", "()Landroid/widget/Button;", "singleButton", "f", "Landroid/view/View;", "()Landroid/view/View;", "dualButtonBar", "g", com.google.android.exoplayer2.text.ttml.b.r, "headerBg", "h", DTransferConstants.SEARCH_KEY, "headerDivider1", "r", "headerDivider2", "l", "retryView", "bottomLeftButton", "bottomRightButton", "failTips", "<init>", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final RecyclerView recyclerView;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public TextView orderState;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public TextView extraMsg;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private final TextView refundHint;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        private final Button singleButton;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        private final View dualButtonBar;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public View headerBg;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public View headerDivider1;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public View headerDivider2;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @NotNull
        private final View retryView;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        private final TextView bottomLeftButton;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @NotNull
        private final TextView bottomRightButton;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @NotNull
        private final TextView failTips;

        public a(@NotNull View view) {
            this.recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
            this.refundHint = (TextView) view.findViewById(R.id.refund_hint);
            this.singleButton = (Button) view.findViewById(R.id.single_button);
            this.dualButtonBar = view.findViewById(R.id.dual_button_bar);
            this.retryView = view.findViewById(R.id.retry_view);
            this.bottomLeftButton = (TextView) view.findViewById(R.id.left_button);
            this.bottomRightButton = (TextView) view.findViewById(R.id.right_button);
            this.failTips = (TextView) view.findViewById(R.id.wl_result_fail_tips);
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextView getBottomLeftButton() {
            return this.bottomLeftButton;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextView getBottomRightButton() {
            return this.bottomRightButton;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final View getDualButtonBar() {
            return this.dualButtonBar;
        }

        @NotNull
        public final TextView d() {
            TextView textView = this.extraMsg;
            Objects.requireNonNull(textView);
            return textView;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextView getFailTips() {
            return this.failTips;
        }

        @NotNull
        public final View f() {
            View view = this.headerBg;
            Objects.requireNonNull(view);
            return view;
        }

        @NotNull
        public final View g() {
            View view = this.headerDivider1;
            Objects.requireNonNull(view);
            return view;
        }

        @NotNull
        public final View h() {
            View view = this.headerDivider2;
            Objects.requireNonNull(view);
            return view;
        }

        @NotNull
        public final TextView i() {
            TextView textView = this.orderState;
            Objects.requireNonNull(textView);
            return textView;
        }

        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public final RecyclerView getRecyclerView() {
            return this.recyclerView;
        }

        @NotNull
        /* JADX INFO: renamed from: k, reason: from getter */
        public final TextView getRefundHint() {
            return this.refundHint;
        }

        @NotNull
        /* JADX INFO: renamed from: l, reason: from getter */
        public final View getRetryView() {
            return this.retryView;
        }

        @NotNull
        /* JADX INFO: renamed from: m, reason: from getter */
        public final Button getSingleButton() {
            return this.singleButton;
        }

        public final void n(@NotNull View view) {
            s((TextView) view.findViewById(R.id.order_state));
            o((TextView) view.findViewById(R.id.extra_msg));
            p(view.findViewById(R.id.header_bg));
            q(view.findViewById(R.id.header_divider1));
            r(view.findViewById(R.id.header_divider2));
        }

        public final void o(@NotNull TextView textView) {
            this.extraMsg = textView;
        }

        public final void p(@NotNull View view) {
            this.headerBg = view;
        }

        public final void q(@NotNull View view) {
            this.headerDivider1 = view;
        }

        public final void r(@NotNull View view) {
            this.headerDivider2 = view;
        }

        public final void s(@NotNull TextView textView) {
            this.orderState = textView;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ResultFragment() {
        final StringQualifier stringQualifierNamed = QualifierKt.named(KoinModuleKt.WALLET_CONFIG_APPNAME);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Function0 function0 = null;
        this.appName = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<String>() { // from class: com.huami.wallet.ui.fragment.ResultFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.String] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(String.class), stringQualifierNamed, function0);
            }
        });
        final Object[] objArr = 0 == true ? 1 : 0;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        this.mNavigationController = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<NavigationController>() { // from class: com.huami.wallet.ui.fragment.ResultFragment$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.wallet.ui.navigation.NavigationController, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final NavigationController invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(NavigationController.class), objArr, objArr2);
            }
        });
        this.iWalletRes = KoinModuleKt.deviceRes();
        final Function0<ViewModelOwner> function1 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.ui.fragment.ResultFragment$special$$inlined$viewModel$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.NONE;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        final Object[] objArr4 = 0 == true ? 1 : 0;
        this.mViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<BusCardResultViewModel>() { // from class: com.huami.wallet.ui.fragment.ResultFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.ui.viewmodel.BusCardResultViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final BusCardResultViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, objArr3, Reflection.getOrCreateKotlinClass(BusCardResultViewModel.class), function1, objArr4);
            }
        });
        final Function0<ViewModelOwner> function2 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.ui.fragment.ResultFragment$special$$inlined$viewModel$default$3
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
        final Object[] objArr5 = 0 == true ? 1 : 0;
        final Object[] objArr6 = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<BusCardDetailViewModel>() { // from class: com.huami.wallet.ui.fragment.ResultFragment$special$$inlined$viewModel$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.ui.viewmodel.BusCardDetailViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final BusCardDetailViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, objArr5, Reflection.getOrCreateKotlinClass(BusCardDetailViewModel.class), function2, objArr6);
            }
        });
        this.mFinishLogic = new Runnable() { // from class: we6
            @Override // java.lang.Runnable
            public final void run() {
                ResultFragment.U(this.a);
            }
        };
        this.mFinishButtonClickListener = new View.OnClickListener() { // from class: df6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResultFragment.T(this.a, view);
            }
        };
        this.mRetryClickListener = new View.OnClickListener() { // from class: cf6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResultFragment.V(this.a, view);
            }
        };
    }

    private final NavigationController A() {
        return (NavigationController) this.mNavigationController.getValue();
    }

    private final BusCardResultViewModel B() {
        return (BusCardResultViewModel) this.mViewModel.getValue();
    }

    private final View.OnClickListener C(final int orderState, final int orderAmount) {
        return new View.OnClickListener() { // from class: bf6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResultFragment.D(orderState, this, orderAmount, view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(int i, ResultFragment resultFragment, int i2, View view) {
        Context context = view.getContext();
        if (i == 2) {
            resultFragment.e0(context.getString(R.string.wl_refund_tips_for_open_card_fail));
            return;
        }
        if (i == 3) {
            resultFragment.e0(context.getString(R.string.wl_refund_tips_for_open_card_success_but_recharge_fail));
        } else if (i != 5) {
            resultFragment.B().refund();
        } else {
            resultFragment.e0(context.getString(R.string.wl_format_refund_tips_for_recharge_fail, MoneyUtils.formatCentRMB(i2)));
        }
    }

    private final void E() {
        Function4<Context, String, Boolean, Boolean, Boolean> onErrorToFeedback = WalletConfig.getOnErrorToFeedback();
        Context contextRequireContext = requireContext();
        Order order = this.mOrder;
        Objects.requireNonNull(order);
        String feedbackInfo = getFeedbackInfo(order.state);
        Boolean bool = Boolean.TRUE;
        onErrorToFeedback.invoke(contextRequireContext, feedbackInfo, bool, bool);
    }

    private final void F(StateAssist stateAssist, FullResultInfo resultInfo) {
        Order order = resultInfo.order;
        if (!stateAssist.getIsOnlyShowState()) {
            w(R.string.wl_order_id, order.orderId);
        }
        int i = order.state;
        if (i == 2 || i == 11 || i == 3) {
            w(R.string.wl_pay_success, getString(R.string.wl_format_x_yuan, MoneyUtils.formatCentRMB(order.amount)));
        }
        if (order.state == 5 || stateAssist.getIsRefundForRecharge()) {
            w(R.string.wl_recharge_fail, getString(R.string.wl_format_x_yuan, MoneyUtils.formatCentRMB(order.amount)));
        }
        if (stateAssist.getIsRefundForRecharge()) {
            w(R.string.wl_apply_to_refund, getString(R.string.wl_format_x_yuan, MoneyUtils.formatCentRMB(order.amount)));
        }
        int i2 = order.state;
        if (i2 == 1 || i2 == 10) {
            w(R.string.wl_pay_money, getString(R.string.wl_format_x_yuan, MoneyUtils.formatCentRMB(order.amount)));
        }
        if (order.state == 4) {
            w(R.string.wl_recharge_amount, getString(R.string.wl_format_x_yuan, MoneyUtils.formatCentRMB(order.amount)));
        }
        int i3 = resultInfo.balance;
        if (i3 > 0) {
            w(R.string.wl_card_balance, getString(R.string.wl_format_x_yuan, MoneyUtils.formatCentRMB(i3)));
        }
        if (resultInfo.expireDate > 0 && !B().isLingNanTong(resultInfo.busCardId)) {
            w(R.string.wl_card_expire_date, DateTimeUtils.formatDateY(b(), new Date(resultInfo.expireDate)));
        }
        if (!Intrinsics.areEqual(B().getBusCardId(), ConstantKt.APP_CODE_SHEN_ZHEN_MOT)) {
            String str = order.invoiceAuthCode;
            if (!(str == null || m.isBlank(str))) {
                w(R.string.wl_invoice_auth_code, order.invoiceAuthCode);
            }
        }
        if (Intrinsics.areEqual(B().getBusCardId(), ConstantKt.APP_CODE_SHEN_ZHEN_MOT)) {
            return;
        }
        String str2 = order.codeValidDate;
        if (str2 == null || m.isBlank(str2)) {
            return;
        }
        w(R.string.wl_invoice_auth_code_date, DateUtils.formatDateTime(b(), Long.parseLong(order.codeValidDate) * 1000, 20));
    }

    private final void G() {
        RecyclerView recyclerView = this.mViewHolder.getRecyclerView();
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        BusCardStateListAdapter busCardStateListAdapter = new BusCardStateListAdapter();
        busCardStateListAdapter.bindToRecyclerView(recyclerView);
        this.mAdapter = busCardStateListAdapter;
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.wl_header_bus_card_state, (ViewGroup) recyclerView, false);
        busCardStateListAdapter.setHeaderView(viewInflate);
        this.mViewHolder.n(viewInflate);
        this.mAdapter.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() { // from class: ue6
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemChildClickListener
            public final void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                ResultFragment.H(this.a, baseQuickAdapter, view, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(ResultFragment resultFragment, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        if (Intrinsics.areEqual(resultFragment.mAdapter.getData().get(i).title, resultFragment.getString(R.string.wl_order_id))) {
            Object systemService = resultFragment.requireContext().getSystemService("clipboard");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("tag", resultFragment.mAdapter.getData().get(i).value));
            IconToast.showSuccessLong(resultFragment.requireContext(), R.string.wl_order_id_is_copied);
        }
    }

    private final StateAssist I(FullResultInfo resultInfo) {
        int i;
        int i2;
        StateAssist stateAssist = new StateAssist();
        Order order = resultInfo.order;
        int i3 = order.type;
        boolean z = false;
        stateAssist.setOpenCardOperation(i3 == 1 || i3 == 3);
        stateAssist.setRechargeOperation(order.type == 2);
        int i4 = order.state;
        stateAssist.setRefundState(i4 == 7 || i4 == 8 || i4 == 9);
        stateAssist.setOnlyShowState(stateAssist.getIsOpenCardOperation() && stateAssist.getIsRefundState());
        stateAssist.setRefundForRecharge(stateAssist.getIsRechargeOperation() && stateAssist.getIsRefundState());
        stateAssist.setCheckSuccessOrder(B().isCheckOrder() && ((i2 = order.state) == 4 || i2 == 1));
        stateAssist.setAllowToShowBottomButton((stateAssist.getIsCheckSuccessOrder() || (i = order.state) == 7 || i == 9 || i == 13 || i == 12 || i == 15 || i == 15) ? false : true);
        int i5 = order.state;
        stateAssist.setNeedToShowRefundHint(i5 == 7 || i5 == 9);
        stateAssist.setNeedShowDualButton(stateAssist.getAllowToShowBottomButton() && order.canRetry && order.canRefund);
        if (stateAssist.getAllowToShowBottomButton() && !stateAssist.getNeedShowDualButton()) {
            z = true;
        }
        stateAssist.setNeedShowSingleButton(z);
        stateAssist.setShowExtraMsg(S(resultInfo));
        return stateAssist;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void J(ResultFragment resultFragment, Resource resource) {
        if (resource == null) {
            return;
        }
        resultFragment.mLoadingDialogHelper.showOrError(resource);
        Status status = resource.status;
        if (status == Status.SUCCESS) {
            resultFragment.g0(false);
            resultFragment.q0((FullResultInfo) resource.data);
        } else if (status == Status.ERROR) {
            resultFragment.g0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void K(ResultFragment resultFragment, Resource resource) {
        if (resource == null) {
            return;
        }
        resultFragment.mLoadingDialogHelper.showOrError(resource);
        Status status = resource.status;
        if (status != Status.SUCCESS) {
            if (status == Status.ERROR) {
                IconToast.showError(resultFragment.b(), R.string.wl_retry_fail_feedback_alert_title);
            }
        } else {
            T t = resource.data;
            if (t == 0 || !((Boolean) t).booleanValue()) {
                IconToast.showError(resultFragment.b(), R.string.wl_retry_fail_feedback_alert_title);
            } else {
                resultFragment.B().retry();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void L(ResultFragment resultFragment, Resource resource) {
        if (resource != null) {
            T t = resource.data;
            if (!(t != 0 && ((Boolean) t).booleanValue())) {
                resultFragment.mLoadingDialogHelper.showOrHide(resource.status, resultFragment.getString(R.string.wl_recharging_with_dot));
            } else if (resource.status == Status.LOADING) {
                resultFragment.A().navigateToOpenBusCardInProgress(resultFragment.getActivity(), resultFragment.B().getBusCardName());
            } else {
                resultFragment.A().hideOpenBusCardInProgress(resultFragment.getActivity());
                resultFragment.A().resetStyleToTitleBarWithBg(resultFragment.getActivity());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(ResultFragment resultFragment, Resource resource) {
        resultFragment.mLoadingDialogHelper.showOrHide(resource == null ? null : resource.status, resultFragment.getString(R.string.wl_apply_to_refunding_with_dot));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(ResultFragment resultFragment, Resource resource) {
        resultFragment.mLoadingDialogHelper.showOrError(resource);
        if (resource.status == Status.SUCCESS) {
            int size = !KtUtilsKt.isNullOrEmpty((List) resource.data) ? ((List) resource.data).size() : 0;
            if (size == 1) {
                BusCardSimple2 busCardSimple2 = (BusCardSimple2) ((List) resource.data).get(0);
                resultFragment.A().closePreviousPages();
                resultFragment.A().navigateToBusCardDetail(resultFragment.getActivity(), busCardSimple2.id, busCardSimple2.name, busCardSimple2.xiaomiCardName, busCardSimple2.imageUrl, busCardSimple2.shiftEnable.booleanValue(), busCardSimple2.packageName, busCardSimple2.appName, busCardSimple2.redirectTo, busCardSimple2.serviceContact);
                resultFragment.A().finishCurrentPage(resultFragment.getContext());
                return;
            }
            if (size <= 1) {
                resultFragment.A().finishCurrentPage(resultFragment.getContext());
                return;
            }
            resultFragment.A().closePreviousPages();
            resultFragment.A().navigateToOpenedBusCardList(resultFragment.getContext());
            resultFragment.A().finishCurrentPage(resultFragment.getContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(ResultFragment resultFragment, Integer num) {
        resultFragment.b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(ResultFragment resultFragment, Integer num) {
        resultFragment.h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(ResultFragment resultFragment, View view) {
        resultFragment.B().refreshOrder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(ResultFragment resultFragment, View view) {
        resultFragment.h0();
    }

    private final boolean S(FullResultInfo resultInfo) {
        int i;
        Order order = resultInfo.order;
        return ((TextUtils.isEmpty(resultInfo.errorMsg) && !order.needContactService) || (i = order.state) == 1 || i == 4 || i == 9) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(ResultFragment resultFragment, View view) {
        resultFragment.mFinishLogic.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(ResultFragment resultFragment) {
        resultFragment.A().finishCurrentPage(resultFragment.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(ResultFragment resultFragment, View view) {
        resultFragment.Y();
        if (resultFragment.B().isNoToken()) {
            resultFragment.B().retryGetToken();
        } else {
            resultFragment.B().retry();
        }
    }

    private final void W() {
        if (getArguments() == null) {
            return;
        }
        String string = requireArguments().getString("ARG_CARD_ID");
        String string2 = requireArguments().getString("ARG_CARD_NAME");
        String string3 = requireArguments().getString("ARG_ORDER_ID");
        String string4 = requireArguments().getString("ARG_EXTRA_MSG");
        boolean z = requireArguments().getBoolean("ARG_IS_CHECK_RECORD", false);
        boolean z2 = requireArguments().getBoolean("ARG_IS_NO_TOKEN", false);
        B().setBusCardId(string);
        B().setBusCardName(string2);
        B().setOrderId(string3, string4);
        B().setCheckOrder(z);
        B().setIsNoToken(z2);
    }

    private final void X() {
        RecyclerView recyclerView = this.mViewHolder.getRecyclerView();
        for (int itemDecorationCount = recyclerView.getItemDecorationCount(); itemDecorationCount > 0; itemDecorationCount--) {
            recyclerView.removeItemDecorationAt(0);
        }
    }

    private final void Y() {
        q0(null);
        this.mViewHolder.getFailTips().setVisibility(8);
        this.mViewHolder.getDualButtonBar().setVisibility(8);
        this.mViewHolder.getSingleButton().setVisibility(8);
        this.mViewHolder.i().setText("");
        this.mViewHolder.i().setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
        this.mViewHolder.g().setVisibility(8);
        this.mViewHolder.h().setVisibility(8);
        this.mViewHolder.f().setVisibility(8);
        this.mViewHolder.d().setVisibility(8);
        while (this.mViewHolder.getRecyclerView().getItemDecorationCount() > 0) {
            this.mViewHolder.getRecyclerView().removeItemDecorationAt(0);
        }
    }

    private final void Z(View view, int paddingBottom) {
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), paddingBottom);
    }

    private final void a0(View view, int paddingTop) {
        view.setPaddingRelative(view.getPaddingStart(), paddingTop, view.getPaddingEnd(), view.getPaddingBottom());
    }

    private final void b0() {
        new AlertDialogFragment.Builder(b()).setCancelable(true).setTitle(R.string.wl_retry_fail_feedback_alert_title).setMessage(R.string.wl_retry_fail_feedback_alert_msg).setPositiveButton(R.string.wl_retry_fail_feedback_alert_sure_button, new DialogInterface.OnClickListener() { // from class: ye6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ResultFragment.c0(this.a, dialogInterface, i);
            }
        }).setNegativeButton(R.string.wl_cancel, new DialogInterface.OnClickListener() { // from class: af6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ResultFragment.d0(dialogInterface, i);
            }
        }).show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(ResultFragment resultFragment, DialogInterface dialogInterface, int i) {
        resultFragment.E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d0(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    private final void e0(String msg) {
        new AlertDialogFragment.Builder(getContext()).setTitle(R.string.wl_tips).setMessage(msg).setPositiveButton(R.string.wl_ok, new DialogInterface.OnClickListener() { // from class: ne6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ResultFragment.f0(this.a, dialogInterface, i);
            }
        }).setNegativeButton(R.string.wl_cancel, (DialogInterface.OnClickListener) null).create().show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0(ResultFragment resultFragment, DialogInterface dialogInterface, int i) {
        resultFragment.B().refund();
    }

    private final void g0(boolean show) {
        this.mViewHolder.getRetryView().setVisibility(show ? 0 : 8);
        this.mViewHolder.getRecyclerView().setVisibility(show ? 8 : 0);
        this.mViewHolder.getRefundHint().setVisibility(8);
        this.mViewHolder.getSingleButton().setVisibility(8);
        this.mViewHolder.getDualButtonBar().setVisibility(8);
    }

    private final String getAppName() {
        return (String) this.appName.getValue();
    }

    private final void h0() {
        new AlertDialogFragment.Builder(b()).setCancelable(true).setTitle(R.string.wl_fail_alert_title).setMessage(getString(this.iWalletRes.getOpenRechargeFailTipsRes(), getAppName())).setNeutralButton(R.string.wl_i_know_it, new DialogInterface.OnClickListener() { // from class: ze6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ResultFragment.i0(dialogInterface, i);
            }
        }).show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i0(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    private final void initViewModel() {
        if (getActivity() == null) {
            return;
        }
        B().orderInfoLiveData.observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("加载订单详情"));
        B().orderInfoLiveData.observe(getViewLifecycleOwner(), new Observer() { // from class: oe6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                ResultFragment.J(this.a, (Resource) obj);
            }
        });
        B().retryGetTokenLiveData.observe(getViewLifecycleOwner(), new Observer() { // from class: gf6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                ResultFragment.K(this.a, (Resource) obj);
            }
        });
        MutableLiveData<Resource<Boolean>> mutableLiveData = B().showRetryLoadingLiveData;
        if (mutableLiveData != null) {
            mutableLiveData.observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("重试"));
        }
        MutableLiveData<Resource<Boolean>> mutableLiveData2 = B().showRetryLoadingLiveData;
        if (mutableLiveData2 != null) {
            mutableLiveData2.observe(getViewLifecycleOwner(), new Observer() { // from class: pe6
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    ResultFragment.L(this.a, (Resource) obj);
                }
            });
        }
        B().showRefundLoadingLiveData.observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("申请退款"));
        B().showRefundLoadingLiveData.observe(getViewLifecycleOwner(), new Observer() { // from class: re6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                ResultFragment.M(this.a, (Resource) obj);
            }
        });
        B().installedBusCards.observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("加载已卡列表的唯一标识"));
        B().installedBusCards.observe(getViewLifecycleOwner(), new Observer() { // from class: qe6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                ResultFragment.N(this.a, (Resource) obj);
            }
        });
        B().checkRetryCountLiveData.observe(getViewLifecycleOwner(), new Observer() { // from class: se6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                ResultFragment.O(this.a, (Integer) obj);
            }
        });
        B().checkTipsCountLiveData.observe(getViewLifecycleOwner(), new Observer() { // from class: te6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                ResultFragment.P(this.a, (Integer) obj);
            }
        });
    }

    private final void initViews() {
        this.mLoadingDialogHelper = LoadingDialogHelper.newInstance(getActivity());
        this.mViewHolder.getRetryView().setOnClickListener(new View.OnClickListener() { // from class: ff6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResultFragment.Q(this.a, view);
            }
        });
        this.mViewHolder.getFailTips().setOnClickListener(new View.OnClickListener() { // from class: ef6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResultFragment.R(this.a, view);
            }
        });
    }

    private final boolean j0(Order order) {
        int i = order.state;
        switch (i) {
            case 0:
                HMLog.w(p, Intrinsics.stringPlus("接受到了未作处理的公交卡操作结果类型：", Integer.valueOf(i)), new Object[0]);
                return false;
            case 1:
                this.stateTextResId = R.string.wl_open_card_success;
                this.stateIconResId = R.drawable.wl_ic_done;
                return true;
            case 2:
                this.stateTextResId = R.string.wl_open_card_failed;
                this.stateIconResId = R.drawable.wl_ic_error;
                return true;
            case 3:
                this.stateTextResId = R.string.wl_open_card_success_but_recharge_failed;
                this.stateIconResId = R.drawable.wl_ic_error;
                return true;
            case 4:
                this.stateTextResId = R.string.wl_recharge_success;
                this.stateIconResId = R.drawable.wl_ic_done;
                return true;
            case 5:
                this.stateTextResId = R.string.wl_recharge_fail;
                this.stateIconResId = R.drawable.wl_ic_error;
                return true;
            case 6:
            default:
                HMLog.w(p, Intrinsics.stringPlus("接受到了未作处理的公交卡操作结果类型：", Integer.valueOf(i)), new Object[0]);
                return false;
            case 7:
                this.stateTextResId = R.string.wl_apply_to_refunding;
                this.stateIconResId = R.drawable.wl_ic_wait;
                return true;
            case 8:
                this.stateTextResId = R.string.wl_refund_fail;
                this.stateIconResId = R.drawable.wl_ic_error;
                return true;
            case 9:
                this.stateTextResId = R.string.wl_refund_success;
                this.stateIconResId = R.drawable.wl_ic_done;
                return true;
            case 10:
                this.stateTextResId = R.string.wl_open_card_success;
                this.stateIconResId = R.drawable.wl_ic_done;
                return true;
            case 11:
                this.stateTextResId = R.string.wl_open_card_failed;
                this.stateIconResId = R.drawable.wl_ic_error;
                return true;
            case 12:
                this.stateTextResId = R.string.wl_r_shift_result_tip_in_success_0;
                this.stateIconResId = R.drawable.wl_ic_done;
                return true;
            case 13:
                this.stateTextResId = R.string.wl_r_shift_result_tip_in_fail_0;
                this.stateIconResId = R.drawable.wl_ic_error;
                return true;
            case 14:
                this.stateTextResId = R.string.wl_r_shift_result_tip_out_success_0;
                this.stateIconResId = R.drawable.wl_ic_done;
                return true;
            case 15:
                this.stateTextResId = R.string.wl_r_shift_result_tip_out_fail_0;
                this.stateIconResId = R.drawable.wl_ic_error;
                return true;
        }
    }

    private final void k0(StateAssist stateAssist, Order order) {
        int i;
        View.OnClickListener onClickListenerC;
        this.mViewHolder.getDualButtonBar().setVisibility(stateAssist.getNeedShowDualButton() ? 0 : 8);
        this.mViewHolder.getSingleButton().setVisibility(stateAssist.getNeedShowSingleButton() ? 0 : 8);
        if (stateAssist.getNeedShowDualButton()) {
            this.mViewHolder.getBottomLeftButton().setText(R.string.wl_apply_to_refund);
            TextView bottomRightButton = this.mViewHolder.getBottomRightButton();
            int i2 = R.string.wl_retry;
            bottomRightButton.setText(i2);
            this.mViewHolder.getBottomLeftButton().setOnClickListener(C(order.state, order.amount));
            this.mViewHolder.getBottomRightButton().setOnClickListener(this.mRetryClickListener);
            if (!order.canRefundTwice) {
                this.mViewHolder.getDualButtonBar().setVisibility(8);
                this.mViewHolder.getSingleButton().setVisibility(0);
                this.mViewHolder.getSingleButton().setText(i2);
                this.mViewHolder.getSingleButton().setOnClickListener(this.mRetryClickListener);
            }
        } else if (stateAssist.getNeedShowSingleButton()) {
            if (order.canRefund) {
                i = R.string.wl_apply_to_refund;
                onClickListenerC = C(order.state, order.amount);
                if (!order.canRefundTwice) {
                    this.mViewHolder.getSingleButton().setVisibility(8);
                }
            } else if (order.canRetry) {
                i = R.string.wl_retry;
                onClickListenerC = this.mRetryClickListener;
            } else {
                i = R.string.wl_finish;
                onClickListenerC = this.mFinishButtonClickListener;
            }
            this.mViewHolder.getSingleButton().setText(i);
            this.mViewHolder.getSingleButton().setOnClickListener(onClickListenerC);
        }
        this.mViewHolder.getRefundHint().setVisibility(stateAssist.getNeedToShowRefundHint() ? 0 : 8);
    }

    private final void l0(StateAssist stateAssist, FullResultInfo resultInfo) {
        int i;
        View.OnClickListener onClickListenerC;
        Order order = resultInfo.order;
        F(stateAssist, resultInfo);
        this.mViewHolder.getDualButtonBar().setVisibility(stateAssist.getNeedShowDualButton() ? 0 : 8);
        this.mViewHolder.getSingleButton().setVisibility(stateAssist.getNeedShowSingleButton() ? 0 : 8);
        if (stateAssist.getNeedShowDualButton()) {
            this.mViewHolder.getBottomLeftButton().setText(R.string.wl_apply_to_refund);
            TextView bottomRightButton = this.mViewHolder.getBottomRightButton();
            int i2 = R.string.wl_retry;
            bottomRightButton.setText(i2);
            this.mViewHolder.getBottomLeftButton().setOnClickListener(C(order.state, order.amount));
            this.mViewHolder.getBottomRightButton().setOnClickListener(this.mRetryClickListener);
            if (!order.canRefundTwice) {
                this.mViewHolder.getDualButtonBar().setVisibility(8);
                this.mViewHolder.getSingleButton().setVisibility(0);
                this.mViewHolder.getSingleButton().setText(i2);
                this.mViewHolder.getSingleButton().setOnClickListener(this.mRetryClickListener);
            }
        } else if (stateAssist.getNeedShowSingleButton()) {
            if (order.canRefund) {
                i = R.string.wl_apply_to_refund;
                onClickListenerC = C(order.state, order.amount);
            } else if (order.canRetry) {
                i = R.string.wl_retry;
                onClickListenerC = this.mRetryClickListener;
            } else {
                i = R.string.wl_finish;
                onClickListenerC = this.mFinishButtonClickListener;
            }
            this.mViewHolder.getSingleButton().setText(i);
            this.mViewHolder.getSingleButton().setOnClickListener(onClickListenerC);
            if (!order.canRefundTwice) {
                this.mViewHolder.getSingleButton().setVisibility(8);
            }
        }
        this.mViewHolder.getRefundHint().setVisibility(stateAssist.getNeedToShowRefundHint() ? 0 : 8);
    }

    private final void m0(Order order) {
        int i = order.state;
        boolean z = true;
        if (i != 1 && i != 3 && i != 10) {
            z = false;
        }
        this.mFinishLogic = (B().isCheckOrder() || !z) ? new Runnable() { // from class: xe6
            @Override // java.lang.Runnable
            public final void run() {
                ResultFragment.o0(this.a);
            }
        } : new Runnable() { // from class: ve6
            @Override // java.lang.Runnable
            public final void run() {
                ResultFragment.n0(this.a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n0(ResultFragment resultFragment) {
        resultFragment.B().getInstalledBusCards();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o0(ResultFragment resultFragment) {
        resultFragment.A().finishCurrentPage(resultFragment.getContext());
    }

    private final void p0(StateAssist stateAssist, FullResultInfo resultInfo) {
        Order order = resultInfo.order;
        this.mViewHolder.i().setText(this.stateTextResId);
        this.mViewHolder.i().setCompoundDrawablesRelativeWithIntrinsicBounds(0, this.stateIconResId, 0, 0);
        int i = this.stateIconResId;
        int i2 = R.drawable.wl_ic_done;
        if (i == i2) {
            this.mViewHolder.i().setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, TintUtils.tintDrawable(getActivity(), i2, R.color.s20), (Drawable) null, (Drawable) null);
        }
        this.mViewHolder.g().setVisibility(!stateAssist.getIsOnlyShowState() ? 0 : 8);
        this.mViewHolder.h().setVisibility(!stateAssist.getIsOnlyShowState() ? 0 : 8);
        this.mViewHolder.f().setVisibility(!stateAssist.getIsOnlyShowState() ? 0 : 4);
        this.mViewHolder.d().setVisibility(stateAssist.getShowExtraMsg() ? 0 : 8);
        a0(this.mViewHolder.i(), (int) ViewUtils.dpToPx(requireContext(), !stateAssist.getIsOnlyShowState() ? 31.0f : 71.0f));
        Z(this.mViewHolder.i(), (int) ViewUtils.dpToPx(requireContext(), stateAssist.getShowExtraMsg() ? 0.0f : 30.0f));
        if (stateAssist.getIsOnlyShowState()) {
            X();
        } else {
            x();
        }
        HMLog.i(p, Intrinsics.stringPlus("order state = ", Integer.valueOf(order.state)), new Object[0]);
        if (!TextUtils.isEmpty(resultInfo.errorMsg) && order.state != 10) {
            this.mViewHolder.d().setText(resultInfo.errorMsg);
            return;
        }
        if (order.needContactService) {
            String string = getString(R.string.wl_contact_huami);
            String string2 = getString(R.string.wl_contact_service_to_refund);
            TextView textViewD = this.mViewHolder.d();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            textViewD.setText(String.format(string2, Arrays.copyOf(new Object[]{string}, 1)));
        }
    }

    private final void q0(FullResultInfo resultInfo) {
        FragmentActivity activity;
        Intent intent;
        String stringExtra;
        CitySimpleInfo cityInfo;
        this.mAdapter.setNewData(null);
        if ((resultInfo == null ? null : resultInfo.order) == null || getContext() == null) {
            return;
        }
        Order order = resultInfo.order;
        if (j0(order)) {
            if (order.state == 1 && (activity = getActivity()) != null && (intent = activity.getIntent()) != null && (stringExtra = intent.getStringExtra("ARG_CARD_ID")) != null) {
                String str = stringExtra.length() > 0 ? stringExtra : null;
                if (str != null && (cityInfo = CitySimpleInfoCache.INSTANCE.getCityInfo(str)) != null) {
                    getViewModel().updateCardInfo(cityInfo.getName(), cityInfo.getAid());
                }
            }
            resultInfo.errorMsg = ErrorMsgUtils.filterErrorMsg(resultInfo.errorMsg, WalletConfig.isShowMessage().invoke().booleanValue());
            StateAssist stateAssistI = I(resultInfo);
            p0(stateAssistI, resultInfo);
            l0(stateAssistI, resultInfo);
            k0(stateAssistI, order);
            m0(order);
            y(order);
        }
    }

    private final void w(@StringRes int title, String value) {
        BusCardStateItem busCardStateItem = new BusCardStateItem();
        busCardStateItem.title = getString(title);
        busCardStateItem.value = value;
        this.mAdapter.addData(busCardStateItem);
    }

    private final void x() {
        RecyclerView recyclerView = this.mViewHolder.getRecyclerView();
        if (recyclerView.getItemDecorationCount() > 0) {
            return;
        }
        recyclerView.addItemDecoration(new DividerDecoration(ListUtils.getMiddleDividerStyle(getContext()).setIgnorePosition(0)));
        recyclerView.addItemDecoration(new DividerDecoration(ListUtils.getBorderDividerStyle(getContext()).setShowTopDivider(false).setShowBottomDivider(true)));
    }

    private final void y(Order _order) {
        int i = _order.state;
        if (i != 2 && i != 5 && i != 11 && i != 3) {
            this.mViewHolder.getFailTips().setVisibility(8);
            return;
        }
        this.mViewHolder.getFailTips().setVisibility(0);
        B().checkTipsAndRetryCount();
        this.mOrder = _order;
    }

    @VisibleForTesting
    private final String z() {
        if (getActivity() == null || requireActivity().getIntent() == null) {
            return "";
        }
        String stringExtra = requireActivity().getIntent().getStringExtra("ARG_CARD_NAME");
        return TextUtils.isEmpty(stringExtra) ? "" : stringExtra;
    }

    public void _$_clearFindViewByIdCache() {
    }

    @VisibleForTesting
    @NotNull
    public final String getFeedbackInfo(int state) {
        if (state != 2) {
            if (state == 5) {
                return Intrinsics.stringPlus(z(), getString(R.string.wl_recharge_fail));
            }
            if (state != 11) {
                return Intrinsics.stringPlus(z(), getString(R.string.wl_open_card_success_but_recharge_failed));
            }
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("%s%s", Arrays.copyOf(new Object[]{z(), getString(R.string.wl_open_card_failed)}, 2));
    }

    @NotNull
    public final BusCardDetailViewModel getViewModel() {
        return (BusCardDetailViewModel) this.viewModel.getValue();
    }

    public final void onBackPressed() {
        this.mFinishLogic.run();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.wl_fragment_result, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.mViewHolder = new a(view);
        G();
        initViews();
        initViewModel();
        W();
    }
}
