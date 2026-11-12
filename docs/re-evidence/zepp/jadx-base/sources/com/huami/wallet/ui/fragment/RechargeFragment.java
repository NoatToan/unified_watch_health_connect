package com.huami.wallet.ui.fragment;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.tools.analytics.DbUtils;
import com.huami.wallet.lib.api.WalletDataSource;
import com.huami.wallet.lib.entity.Fee;
import com.huami.wallet.lib.entity.MiOrder;
import com.huami.wallet.lib.entity.Notice;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.lib.entity.WalletConfig;
import com.huami.wallet.lib.util.ErrorCode;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.adapter.PayAmountGridAdapter;
import com.huami.wallet.ui.decoration.SpacingDecoration;
import com.huami.wallet.ui.di.module.KoinModuleKt;
import com.huami.wallet.ui.dialog.PayRechargeDialogFragment;
import com.huami.wallet.ui.entity.ResultInfo;
import com.huami.wallet.ui.entity.RichPayMode;
import com.huami.wallet.ui.fragment.RechargeFragment;
import com.huami.wallet.ui.function.Supplier;
import com.huami.wallet.ui.helper.BenchmarkResourceObserver;
import com.huami.wallet.ui.helper.LoadingDialogHelper;
import com.huami.wallet.ui.navigation.NavigationController;
import com.huami.wallet.ui.repository.NoticeRepo;
import com.huami.wallet.ui.resource.IWalletRes;
import com.huami.wallet.ui.utils.AESUtils;
import com.huami.wallet.ui.utils.ErrorMsgUtils;
import com.huami.wallet.ui.utils.KTExtFunKt;
import com.huami.wallet.ui.utils.MoneyUtils;
import com.huami.wallet.ui.utils.NoticeActionType;
import com.huami.wallet.ui.utils.NoticeViewUtils;
import com.huami.wallet.ui.utils.ViewUtils;
import com.huami.wallet.ui.utils.WalletConst;
import com.huami.wallet.ui.view.MyTextView;
import com.huami.wallet.ui.view.NoticeBarView;
import com.huami.wallet.ui.viewmodel.RechargeViewModel;
import com.loc.z;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 U2\u00020\u0001:\u0002UVB\u0007¢\u0006\u0004\bS\u0010TJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0016\u0010\n\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bH\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0012\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0002J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000eH\u0002J\u0010\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J&\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010&\u001a\u00020\u00022\u0006\u0010%\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016J\b\u0010'\u001a\u00020\u0002H\u0016R\u001d\u0010-\u001a\u00020(8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001d\u00102\u001a\u00020.8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u00101R\u001d\u00105\u001a\u00020(8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010*\u001a\u0004\b4\u0010,R\u001d\u0010:\u001a\u0002068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010*\u001a\u0004\b8\u00109R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001d\u0010G\u001a\u00020C8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010*\u001a\u0004\bE\u0010FR\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010N\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010R\u001a\u00020O8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010Q¨\u0006W"}, d2 = {"Lcom/huami/wallet/ui/fragment/RechargeFragment;", "Lcom/huami/wallet/ui/fragment/BaseFragment;", "", "initViewModel", LogUtil.D, LogUtil.I, "G", "N", "Lcom/huami/wallet/lib/entity/Resource;", "r", "Z", ExifInterface.GPS_DIRECTION_TRUE, "initViews", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "", "cardName", "", "payMoney", "X", "Lcom/huami/wallet/lib/entity/Fee;", "rawAmount", "b0", "cardNo", "message", "U", "z", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "onAttach", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onDestroy", "Lcom/huami/wallet/ui/navigation/NavigationController;", "b", "Lkotlin/Lazy;", "x", "()Lcom/huami/wallet/ui/navigation/NavigationController;", "navigationController", "Lcom/huami/wallet/lib/api/WalletDataSource;", "c", "y", "()Lcom/huami/wallet/lib/api/WalletDataSource;", "walletDataSource", GoogleApiAvailabilityLight.a, "u", "mNavigationController", "Lcom/huami/wallet/ui/repository/NoticeRepo;", "e", "v", "()Lcom/huami/wallet/ui/repository/NoticeRepo;", "mNoticeRepo", "Lcom/huami/wallet/ui/fragment/RechargeFragment$a;", "f", "Lcom/huami/wallet/ui/fragment/RechargeFragment$a;", "mViewHolder", "Lcom/huami/wallet/ui/adapter/PayAmountGridAdapter;", "g", "Lcom/huami/wallet/ui/adapter/PayAmountGridAdapter;", "mAmountAdapter", "Lcom/huami/wallet/ui/viewmodel/RechargeViewModel;", "h", "w", "()Lcom/huami/wallet/ui/viewmodel/RechargeViewModel;", "mViewModel", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "i", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "mLoadingDialogHelper", z.j, "Ljava/lang/String;", "appCode", "Lcom/huami/wallet/ui/resource/IWalletRes;", hl.k, "Lcom/huami/wallet/ui/resource/IWalletRes;", "iWalletRes", "<init>", "()V", "Companion", "a", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class RechargeFragment extends BaseFragment {

    @NotNull
    public static final String ARG_BUS_CARD_ID = "ARG_BUS_CARD_ID";

    @NotNull
    public static final String ARG_BUS_CARD_NAME = "ARG_BUS_CARD_NAME";

    @NotNull
    public static final String ARG_BUS_CARD_NUMBER = "ARG_BUS_CARD_NUMBER";

    @NotNull
    public static final String ARG_XIAO_MI_CARDNAME = "ARG_XIAO_MI_CARDNAME";
    public static final int ITEM_COUNT = 3;
    public static final float ITEM_SPACING = 12.0f;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy walletDataSource;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy mNavigationController;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy mNoticeRepo;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private a mViewHolder;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private PayAmountGridAdapter mAmountAdapter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private LoadingDialogHelper mLoadingDialogHelper;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private String appCode;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final IWalletRes iWalletRes;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0019\u0010\f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0011\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0019\u0010\u0016\u001a\u00020\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\b\u0010\u0015R\u0019\u0010\u001b\u001a\u00020\u00178\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u001c\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\t\u001a\u0004\b\u0013\u0010\u000b¨\u0006!"}, d2 = {"com/huami/wallet/ui/fragment/RechargeFragment$a", "", "Landroidx/recyclerview/widget/RecyclerView;", "a", "Landroidx/recyclerview/widget/RecyclerView;", "()Landroidx/recyclerview/widget/RecyclerView;", "amountList", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "e", "()Landroid/widget/TextView;", "shouldPayAmount", "Landroid/widget/Button;", "c", "Landroid/widget/Button;", "()Landroid/widget/Button;", "rechargeButton", "Lcom/huami/wallet/ui/view/NoticeBarView;", GoogleApiAvailabilityLight.a, "Lcom/huami/wallet/ui/view/NoticeBarView;", "()Lcom/huami/wallet/ui/view/NoticeBarView;", "noticeBarView", "Lcom/huami/wallet/ui/view/MyTextView;", "Lcom/huami/wallet/ui/view/MyTextView;", "f", "()Lcom/huami/wallet/ui/view/MyTextView;", "xiaomiNoticeView", "rechargeTipsTV", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "<init>", "(Landroid/view/View;)V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final RecyclerView amountList;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final TextView shouldPayAmount;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final Button rechargeButton;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private final NoticeBarView noticeBarView;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        private final MyTextView xiaomiNoticeView;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        private final TextView rechargeTipsTV;

        public a(@NotNull View view) {
            this.amountList = (RecyclerView) view.findViewById(R.id.amount_list);
            this.shouldPayAmount = (TextView) view.findViewById(R.id.should_pay_amount_value);
            this.rechargeButton = (Button) view.findViewById(R.id.recharge_button);
            this.noticeBarView = (NoticeBarView) view.findViewById(R.id.wl_noticebarview);
            this.xiaomiNoticeView = (MyTextView) view.findViewById(R.id.wl_tv_xiaomi_notice);
            this.rechargeTipsTV = (TextView) view.findViewById(R.id.wl_recharge_tips_bottom_tv);
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final RecyclerView getAmountList() {
            return this.amountList;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final NoticeBarView getNoticeBarView() {
            return this.noticeBarView;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Button getRechargeButton() {
            return this.rechargeButton;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextView getRechargeTipsTV() {
            return this.rechargeTipsTV;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextView getShouldPayAmount() {
            return this.shouldPayAmount;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final MyTextView getXiaomiNoticeView() {
            return this.xiaomiNoticeView;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n"}, d2 = {"", "canRecharge", "Lcom/huami/wallet/lib/entity/Notice;", "<anonymous parameter 1>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function2<Boolean, Notice, Object> {
        public b() {
            super(2);
        }

        @Nullable
        public final Object a(boolean z, @Nullable Notice notice) {
            if (!z) {
                return null;
            }
            RechargeFragment.this.w().startRecharge();
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Notice notice) {
            return a(bool.booleanValue(), notice);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "url", "msg", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function2<String, String, Object> {
        public c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable String str, @Nullable String str2) {
            if (TextUtils.isEmpty(str)) {
                NoticeViewUtils.showDialog(RechargeFragment.this.requireContext(), RechargeFragment.this.getChildFragmentManager(), str2);
                return null;
            }
            RechargeFragment.this.u().navigateToWeb(str, null);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RechargeFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.navigationController = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<NavigationController>() { // from class: com.huami.wallet.ui.fragment.RechargeFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.wallet.ui.navigation.NavigationController, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final NavigationController invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(NavigationController.class), qualifier, objArr);
            }
        });
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.walletDataSource = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<WalletDataSource>() { // from class: com.huami.wallet.ui.fragment.RechargeFragment$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.wallet.lib.api.WalletDataSource, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final WalletDataSource invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(WalletDataSource.class), objArr2, objArr3);
            }
        });
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.mNavigationController = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<NavigationController>() { // from class: com.huami.wallet.ui.fragment.RechargeFragment$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.wallet.ui.navigation.NavigationController, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final NavigationController invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(NavigationController.class), objArr4, objArr5);
            }
        });
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.mNoticeRepo = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<NoticeRepo>() { // from class: com.huami.wallet.ui.fragment.RechargeFragment$special$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.wallet.ui.repository.NoticeRepo, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final NoticeRepo invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(NoticeRepo.class), objArr6, objArr7);
            }
        });
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.ui.fragment.RechargeFragment$special$$inlined$viewModel$default$1
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
        final Object[] objArr8 = 0 == true ? 1 : 0;
        final Object[] objArr9 = 0 == true ? 1 : 0;
        this.mViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<RechargeViewModel>() { // from class: com.huami.wallet.ui.fragment.RechargeFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.ui.viewmodel.RechargeViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final RechargeViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, objArr8, Reflection.getOrCreateKotlinClass(RechargeViewModel.class), function0, objArr9);
            }
        });
        this.iWalletRes = KoinModuleKt.deviceRes();
    }

    private final void A() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 3);
        a aVar = this.mViewHolder;
        if (aVar != null) {
            aVar.getAmountList().setLayoutManager(gridLayoutManager);
        }
        int iDpToPx = (int) ViewUtils.dpToPx(context, 12.0f);
        SpacingDecoration spacingDecoration = new SpacingDecoration(iDpToPx, iDpToPx, false);
        a aVar2 = this.mViewHolder;
        if (aVar2 != null) {
            aVar2.getAmountList().addItemDecoration(spacingDecoration);
        }
        PayAmountGridAdapter payAmountGridAdapter = new PayAmountGridAdapter();
        this.mAmountAdapter = payAmountGridAdapter;
        a aVar3 = this.mViewHolder;
        payAmountGridAdapter.bindToRecyclerView(aVar3 == null ? null : aVar3.getAmountList());
        PayAmountGridAdapter payAmountGridAdapter2 = this.mAmountAdapter;
        if (payAmountGridAdapter2 == null) {
            return;
        }
        payAmountGridAdapter2.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: l76
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                RechargeFragment.B(this.a, baseQuickAdapter, view, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(RechargeFragment rechargeFragment, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        MediatorLiveData<Fee> mediatorLiveData = rechargeFragment.w().selectedFeeLiveData;
        PayAmountGridAdapter payAmountGridAdapter = rechargeFragment.mAmountAdapter;
        mediatorLiveData.setValue(payAmountGridAdapter == null ? null : payAmountGridAdapter.getItem(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(RechargeFragment rechargeFragment, View view) {
        NoticeViewUtils.checkNeedShowDialog(rechargeFragment.requireContext(), rechargeFragment.v().getNotices(), rechargeFragment.getChildFragmentManager(), rechargeFragment.w().cardIdLiveData.getValue(), CollectionsKt__CollectionsKt.mutableListOf(NoticeActionType.TOPUP), rechargeFragment.new b());
    }

    private final void D() {
        w().feesLiveData.observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("加载充值金额"));
        w().feesLiveData.observe(getViewLifecycleOwner(), new Observer() { // from class: u76
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                RechargeFragment.E(this.a, (Resource) obj);
            }
        });
        w().selectedFeeLiveData.observe(getViewLifecycleOwner(), new Observer() { // from class: r76
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                RechargeFragment.F(this.a, (Fee) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x003f  */
    public static final void E(RechargeFragment rechargeFragment, Resource resource) {
        int i;
        if (resource != null) {
            LoadingDialogHelper loadingDialogHelper = rechargeFragment.mLoadingDialogHelper;
            if (loadingDialogHelper != null) {
                loadingDialogHelper.showOrError(resource);
            }
            Status status = resource.status;
            if (status == Status.SUCCESS || status == Status.ERROR) {
                PayAmountGridAdapter payAmountGridAdapter = rechargeFragment.mAmountAdapter;
                if (payAmountGridAdapter != null) {
                    payAmountGridAdapter.setNewData((List) resource.data);
                }
                a aVar = rechargeFragment.mViewHolder;
                if (aVar == null) {
                    return;
                }
                TextView shouldPayAmount = aVar.getShouldPayAmount();
                T t = resource.data;
                if (t != 0) {
                    List list = (List) t;
                    i = list != null && (list.isEmpty() ^ true) ? 0 : 8;
                }
                shouldPayAmount.setVisibility(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(RechargeFragment rechargeFragment, Fee fee) {
        PayAmountGridAdapter payAmountGridAdapter = rechargeFragment.mAmountAdapter;
        if (payAmountGridAdapter != null) {
            payAmountGridAdapter.selectedItem(fee);
        }
        a aVar = rechargeFragment.mViewHolder;
        if (aVar != null) {
            aVar.getRechargeButton().setEnabled(fee != null);
        }
        rechargeFragment.b0(fee);
    }

    private final void G() {
        w().xiaomiNoticesLiveData.observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("checkXiaoNotice"));
        w().xiaomiNoticesLiveData.observe(getViewLifecycleOwner(), new Observer() { // from class: v76
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                RechargeFragment.H(this.a, (Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(RechargeFragment rechargeFragment, Resource resource) {
        a aVar;
        if (resource == null) {
            return;
        }
        LoadingDialogHelper loadingDialogHelper = rechargeFragment.mLoadingDialogHelper;
        if (loadingDialogHelper != null) {
            loadingDialogHelper.showOrError(resource);
        }
        if (resource.status != Status.SUCCESS || (aVar = rechargeFragment.mViewHolder) == null) {
            return;
        }
        KTExtFunKt.shouldShowXiaomiNoticeCrossBar(aVar.getXiaomiNoticeView(), (List) resource.data, rechargeFragment.w().xiaomiCardName, "RECHARGE");
    }

    private final void I() {
        w().snowballOrderLiveData.observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("生成充值的订单"));
        w().snowballOrderLiveData.observe(getViewLifecycleOwner(), new Observer() { // from class: g76
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                RechargeFragment.J(this.a, (Resource) obj);
            }
        });
        w().miOrderLiveData.observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("生成充值的订单"));
        w().miOrderLiveData.observe(getViewLifecycleOwner(), new Observer() { // from class: i76
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                RechargeFragment.K(this.a, (Resource) obj);
            }
        });
        w().checkOrderLiveData.observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("检查充值订单是否已支付"));
        w().checkOrderLiveData.observe(getViewLifecycleOwner(), new Observer() { // from class: t76
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                RechargeFragment.L(this.a, (Resource) obj);
            }
        });
        w().checkOrderH5LiveData.observe(getViewLifecycleOwner(), new Observer() { // from class: w76
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                RechargeFragment.M(this.a, (Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(RechargeFragment rechargeFragment, Resource resource) {
        rechargeFragment.Z(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(RechargeFragment rechargeFragment, Resource resource) {
        rechargeFragment.Z(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(RechargeFragment rechargeFragment, Resource resource) {
        LoadingDialogHelper loadingDialogHelper;
        if (resource == null || (loadingDialogHelper = rechargeFragment.mLoadingDialogHelper) == null) {
            return;
        }
        loadingDialogHelper.showOrError(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(RechargeFragment rechargeFragment, Resource resource) {
        LoadingDialogHelper loadingDialogHelper;
        if (resource == null || (loadingDialogHelper = rechargeFragment.mLoadingDialogHelper) == null) {
            return;
        }
        loadingDialogHelper.showOrError(resource);
    }

    private final void N() {
        w().showPayModeDialogCommandLiveData.observe(this, new Observer() { // from class: q76
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                RechargeFragment.Q(this.a, (Pair) obj);
            }
        });
        w().validationResultLiveData.observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("校验卡片信息"));
        w().validationResultLiveData.observe(getViewLifecycleOwner(), new Observer() { // from class: h76
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                RechargeFragment.R(this.a, (Resource) obj);
            }
        });
        w().goToMiPayCommandLiveData.observe(this, new Observer() { // from class: s76
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                RechargeFragment.S(this.a, (MiOrder) obj);
            }
        });
        w().xiaomiNotTokenRechargeLiveData.observe(getViewLifecycleOwner(), new Observer() { // from class: k76
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                RechargeFragment.O(this.a, (ResultInfo) obj);
            }
        });
        w().rechargeToDeviceResultLiveData.observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("充值信息写入设备中的卡片"));
        w().rechargeToDeviceResultLiveData.observe(getViewLifecycleOwner(), new Observer() { // from class: j76
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                RechargeFragment.P(this.a, (Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(RechargeFragment rechargeFragment, ResultInfo resultInfo) {
        if (resultInfo == null) {
            return;
        }
        rechargeFragment.u().navigateToBusCardOperationNoTokenResult(rechargeFragment.getContext(), resultInfo.busCardId, resultInfo.orderId, resultInfo.busCardName, false, resultInfo.errorMsg, true);
        rechargeFragment.u().finishCurrentPage(rechargeFragment.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void P(RechargeFragment rechargeFragment, Resource resource) {
        if (resource != null) {
            LoadingDialogHelper loadingDialogHelper = rechargeFragment.mLoadingDialogHelper;
            if (loadingDialogHelper != null) {
                loadingDialogHelper.showOrError(resource);
            }
            if (!resource.isCompleted() || resource.data == 0) {
                return;
            }
            NavigationController navigationControllerU = rechargeFragment.u();
            Context context = rechargeFragment.getContext();
            T t = resource.data;
            ResultInfo resultInfo = (ResultInfo) t;
            ResultInfo resultInfo2 = (ResultInfo) t;
            ResultInfo resultInfo3 = (ResultInfo) t;
            ResultInfo resultInfo4 = (ResultInfo) t;
            navigationControllerU.navigateToBusCardOperationResult(context, resultInfo == null ? null : resultInfo.busCardId, resultInfo2 == null ? null : resultInfo2.orderId, resultInfo3 == null ? null : resultInfo3.busCardName, false, resultInfo4 == null ? null : resultInfo4.errorMsg);
            rechargeFragment.u().finishCurrentPage(rechargeFragment.getContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(RechargeFragment rechargeFragment, Pair pair) {
        if (pair != null) {
            String str = (String) pair.first;
            Object obj = pair.second;
            rechargeFragment.X(str, (obj != null ? (Integer) obj : 0).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(RechargeFragment rechargeFragment, Resource resource) {
        LoadingDialogHelper loadingDialogHelper = rechargeFragment.mLoadingDialogHelper;
        if (loadingDialogHelper == null) {
            return;
        }
        loadingDialogHelper.showOrError(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(RechargeFragment rechargeFragment, MiOrder miOrder) {
        if (miOrder != null) {
            rechargeFragment.u().navigateToWebOfPay(rechargeFragment.getActivity(), miOrder.payUrl, miOrder.returnUrl);
        }
    }

    private final void T() {
        if (getArguments() == null) {
            return;
        }
        Bundle arguments = getArguments();
        this.appCode = arguments == null ? null : arguments.getString("ARG_BUS_CARD_ID");
        Bundle arguments2 = getArguments();
        String string = arguments2 == null ? null : arguments2.getString("ARG_BUS_CARD_NAME");
        Bundle arguments3 = getArguments();
        w().setCardInfo(this.appCode, string, arguments3 != null ? arguments3.getString("ARG_XIAO_MI_CARDNAME") : null);
        w().checkXiaoNotice();
    }

    private final void U(final String cardNo, String message) {
        new AlertDialogFragment.Builder(requireContext()).setMessage(message).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: o76
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                RechargeFragment.V(dialogInterface, i);
            }
        }).setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() { // from class: f76
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) throws JSONException {
                RechargeFragment.W(this.a, cardNo, dialogInterface, i);
            }
        }).show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(DialogInterface dialogInterface, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(RechargeFragment rechargeFragment, String str, DialogInterface dialogInterface, int i) throws JSONException {
        rechargeFragment.z(str);
    }

    private final void X(String cardName, int payMoney) {
        new PayRechargeDialogFragment.Builder().setPayModes(w().getRichPayModes()).setTitle(getString(R.string.wl_format_card_recharge, cardName)).setPayMoney(payMoney).setOnPayButtonClickListener(new PayRechargeDialogFragment.OnPayButtonClickListener() { // from class: m76
            @Override // com.huami.wallet.ui.dialog.PayRechargeDialogFragment.OnPayButtonClickListener
            public final void onPay(RichPayMode richPayMode) {
                RechargeFragment.Y(this.a, richPayMode);
            }
        }).create().show(getChildFragmentManager(), "PayRechargeDialogFragment");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(RechargeFragment rechargeFragment, RichPayMode richPayMode) {
        if (rechargeFragment.w().isForMi()) {
            rechargeFragment.w().validateCardThenRechargeForMi(rechargeFragment.getActivity(), richPayMode);
        } else {
            rechargeFragment.w().validateCardThenRechargeForSnowball(rechargeFragment.getActivity(), richPayMode);
        }
    }

    private final void Z(Resource<?> r) {
        final String string;
        String string2;
        if (r != null) {
            if (r.status != Status.ERROR || !Intrinsics.areEqual(r.code, ErrorCode.BEIJING_NEED_UPDATE)) {
                if (Intrinsics.areEqual(ErrorCode.NETWORK_ERROR, r.code)) {
                    string = getString(R.string.wl_network_not_connected);
                } else {
                    string = Intrinsics.areEqual(ErrorCode.FAILED_TO_MAKE_ORDER, r.code) ? getString(R.string.wl_failed_to_make_order) : ErrorMsgUtils.parseErrorMsg(y().isForMi(), getContext(), r, WalletConfig.isShowMessage().invoke().booleanValue());
                }
                LoadingDialogHelper loadingDialogHelper = this.mLoadingDialogHelper;
                if (loadingDialogHelper == null) {
                    return;
                }
                loadingDialogHelper.showOrError(r, getString(R.string.wl_making_order), new Supplier() { // from class: n76
                    @Override // com.huami.wallet.ui.function.Supplier
                    public final Object get() {
                        return RechargeFragment.a0(string);
                    }
                });
                return;
            }
            LoadingDialogHelper loadingDialogHelper2 = this.mLoadingDialogHelper;
            if (loadingDialogHelper2 != null) {
                loadingDialogHelper2.hideLoading();
            }
            Bundle arguments = getArguments();
            if (arguments == null || (string2 = arguments.getString("ARG_BUS_CARD_NUMBER")) == null) {
                string2 = "";
            }
            String str = r.message;
            U(string2, str != null ? str : "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String a0(String str) {
        return str;
    }

    private final void b0(Fee rawAmount) {
        int i = rawAmount != null ? rawAmount.rechargeAmountRaw - rawAmount.rechargeAmountDiscount : 0;
        if (i < 0) {
            i = 0;
        }
        String centRMB = MoneyUtils.formatCentRMB(i);
        String string = getString(R.string.wl_format_pay_amount_x, getString(R.string.wl_format_x_yuan, centRMB));
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) string, centRMB, 0, false, 6, (Object) null);
        int length = centRMB.length() + iIndexOf$default;
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new TextAppearanceSpan(getContext(), R.style.TextAppearance_MiFit_Display1_Blue), iIndexOf$default, length, 18);
        spannableString.setSpan(new TextAppearanceSpan(getContext(), R.style.TextAppearance_MiFit_Title2_Blue), length, string.length(), 18);
        a aVar = this.mViewHolder;
        if (aVar == null) {
            return;
        }
        aVar.getShouldPayAmount().setText(spannableString);
    }

    private final void initViewModel() {
        if (getActivity() == null) {
            return;
        }
        D();
        I();
        N();
        G();
    }

    private final void initViews() {
        NoticeBarView typeList;
        NoticeBarView noticeRepo;
        a aVar = this.mViewHolder;
        if (aVar != null) {
            aVar.getRechargeTipsTV().setText(getResources().getText(this.iWalletRes.getRechargeTips()));
        }
        a aVar2 = this.mViewHolder;
        if (aVar2 != null) {
            aVar2.getRechargeButton().setOnClickListener(new View.OnClickListener() { // from class: p76
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RechargeFragment.C(this.a, view);
                }
            });
        }
        List<? extends NoticeActionType> listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(NoticeActionType.TOPUP);
        a aVar3 = this.mViewHolder;
        if (aVar3 != null && (typeList = aVar3.getNoticeBarView().setTypeList(listMutableListOf)) != null && (noticeRepo = typeList.setNoticeRepo(v())) != null) {
            noticeRepo.setOnReadMore(new c());
        }
        a aVar4 = this.mViewHolder;
        if (aVar4 == null) {
            return;
        }
        aVar4.getNoticeBarView().setAppCode(w().cardIdLiveData.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NavigationController u() {
        return (NavigationController) this.mNavigationController.getValue();
    }

    private final NoticeRepo v() {
        return (NoticeRepo) this.mNoticeRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RechargeViewModel w() {
        return (RechargeViewModel) this.mViewModel.getValue();
    }

    private final NavigationController x() {
        return (NavigationController) this.navigationController.getValue();
    }

    private final WalletDataSource y() {
        return (WalletDataSource) this.walletDataSource.getValue();
    }

    private final void z(String cardNo) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cardNo", cardNo);
        jSONObject.put("channelId", 37);
        String string = jSONObject.toString();
        NavigationController navigationControllerX = x();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        navigationControllerX.navigateToWeb(String.format(WalletConst.BEIJING_UPDATE, Arrays.copyOf(new Object[]{AESUtils.encryptAes(string, "4f57fdc10f28d71e3bf7ae65f3c57f36")}, 1)), null);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.wallet.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.mLoadingDialogHelper = LoadingDialogHelper.newInstance(getActivity());
        v().preLoad();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.wl_fragment_recharge, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        v().dispose();
        a aVar = this.mViewHolder;
        if (aVar == null) {
            return;
        }
        aVar.getNoticeBarView().destroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.mViewHolder = new a(view);
        initViews();
        A();
        initViewModel();
        T();
    }
}
