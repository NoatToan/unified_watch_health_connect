package com.huami.wallet.ui.fragment;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.wallet.lib.entity.WalletConfig;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.activity.BusCardDetailActivity;
import com.huami.wallet.ui.activity.ShiftCardActivity;
import com.huami.wallet.ui.fragment.ShiftResultMiFragment;
import com.huami.wallet.ui.navigation.NavigationController;
import com.huami.wallet.ui.viewmodel.ShiftCardMiViewModel;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0017\u0018\u0000 =2\u00020\u0001:\u0001=B\u0007¢\u0006\u0004\b;\u0010<J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J&\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016R\u001d\u0010\u001a\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001f\u001a\u00020\u001b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010&\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0018\u0010)\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010(R\u0018\u0010.\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010(R\u0016\u0010/\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010(R\u0018\u00100\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0018\u00102\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010(R\u0018\u00104\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010(R\u0018\u00106\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010(R\u0018\u00108\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010(R\u0018\u0010:\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010(¨\u0006>"}, d2 = {"Lcom/huami/wallet/ui/fragment/ShiftResultMiFragment;", "Lcom/huami/wallet/ui/fragment/BaseFragment;", "", "initView", "Landroid/view/View$OnClickListener;", "g", "f", "m", "l", "Lcom/huami/wallet/ui/fragment/ShiftUIData;", hl.k, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/wallet/ui/viewmodel/ShiftCardMiViewModel;", "b", "Lkotlin/Lazy;", z.j, "()Lcom/huami/wallet/ui/viewmodel/ShiftCardMiViewModel;", "shiftCardMiViewModel", "Lcom/huami/wallet/ui/navigation/NavigationController;", "c", "i", "()Lcom/huami/wallet/ui/navigation/NavigationController;", "navigationController", "", GoogleApiAvailabilityLight.a, "Z", "isSuccess", "e", "isShiftIn", "isShiftInException", "", "Ljava/lang/String;", "orderId", "h", "appCode", "cardName", "xiaomiCardName", "imgUrl", "xmActionToken", "errorCode", GoogleApiAvailabilityLight.b, "errorMsg", "o", "packageName", com.google.android.exoplayer2.text.ttml.b.r, "appName", DTransferConstants.SEARCH_KEY, "redirectTo", "r", "serviceContact", "<init>", "()V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class ShiftResultMiFragment extends BaseFragment {

    @NotNull
    public static final String ARG_IS_SUCCESS = "ARG_IS_SUCCESS";

    @NotNull
    public static final String TAG = "ShiftResultMiFragment";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy shiftCardMiViewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationController;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isSuccess;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isShiftIn;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean isShiftInException;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private String orderId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private String appCode;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private String cardName;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private String xiaomiCardName;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private String imgUrl;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private String xmActionToken;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private String errorCode;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    private String errorMsg;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    private String packageName;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    private String appName;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    private String redirectTo;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    private String serviceContact;

    /* JADX WARN: Multi-variable type inference failed */
    public ShiftResultMiFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.ui.fragment.ShiftResultMiFragment$special$$inlined$sharedViewModel$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.shiftCardMiViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ShiftCardMiViewModel>() { // from class: com.huami.wallet.ui.fragment.ShiftResultMiFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.ui.viewmodel.ShiftCardMiViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ShiftCardMiViewModel invoke() {
                return FragmentExtKt.getSharedViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(ShiftCardMiViewModel.class), function0, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.SYNCHRONIZED;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.navigationController = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<NavigationController>() { // from class: com.huami.wallet.ui.fragment.ShiftResultMiFragment$special$$inlined$inject$default$1
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
    }

    private final void f() {
        if (j().getShiftInRetryTime() != 1 || this.isSuccess) {
            return;
        }
        m();
    }

    private final View.OnClickListener g() {
        return new View.OnClickListener() { // from class: cu6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShiftResultMiFragment.h(this.a, view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(ShiftResultMiFragment shiftResultMiFragment, View view) {
        if (shiftResultMiFragment.isSuccess) {
            shiftResultMiFragment.j().setShiftInRetryTime(0);
            shiftResultMiFragment.i().closePreviousPages();
            shiftResultMiFragment.i().finishCurrentPage(shiftResultMiFragment.getActivity());
            if (shiftResultMiFragment.isShiftIn) {
                shiftResultMiFragment.i().navigateToBusCardDetail(shiftResultMiFragment.getActivity(), shiftResultMiFragment.appCode, shiftResultMiFragment.cardName, shiftResultMiFragment.xiaomiCardName, shiftResultMiFragment.imgUrl, true, shiftResultMiFragment.packageName, shiftResultMiFragment.appName, shiftResultMiFragment.redirectTo, shiftResultMiFragment.serviceContact);
                return;
            } else {
                shiftResultMiFragment.i().navigateToBusCardList(shiftResultMiFragment.getActivity(), null);
                return;
            }
        }
        ShiftCardMiViewModel shiftCardMiViewModelJ = shiftResultMiFragment.j();
        shiftCardMiViewModelJ.setShiftInRetryTime(shiftCardMiViewModelJ.getShiftInRetryTime() + 1);
        if (shiftResultMiFragment.isShiftIn) {
            shiftResultMiFragment.j().shiftInCard(shiftResultMiFragment.appCode, shiftResultMiFragment.orderId, null);
            return;
        }
        ShiftCardMiViewModel shiftCardMiViewModelJ2 = shiftResultMiFragment.j();
        String str = shiftResultMiFragment.appCode;
        String str2 = shiftResultMiFragment.orderId;
        String str3 = shiftResultMiFragment.xmActionToken;
        Objects.requireNonNull(str3);
        shiftCardMiViewModelJ2.shiftOutCard(str, str2, str3);
    }

    private final NavigationController i() {
        return (NavigationController) this.navigationController.getValue();
    }

    private final void initView() {
        ShiftUIData shiftUIDataK = k();
        View view = getView();
        ((ImageView) (view == null ? null : view.findViewById(R.id.wl_iv_shift_in))).setImageResource(shiftUIDataK.getIcon());
        View view2 = getView();
        ((TextView) (view2 == null ? null : view2.findViewById(R.id.wl_tv_shift_in_info))).setText(getResources().getString(shiftUIDataK.getTip0()));
        View view3 = getView();
        TextView textView = (TextView) (view3 == null ? null : view3.findViewById(R.id.wl_tv_shift_in_info_tiny));
        String str = this.errorMsg;
        boolean z = true;
        textView.setText(str == null || str.length() == 0 ? getResources().getString(shiftUIDataK.getTip1()) : this.errorMsg);
        String str2 = this.errorCode;
        if (str2 != null && str2.length() != 0) {
            z = false;
        }
        if (z) {
            View view4 = getView();
            ((TextView) (view4 == null ? null : view4.findViewById(R.id.wl_tv_shift_error_code))).setVisibility(8);
        } else {
            View view5 = getView();
            ((TextView) (view5 == null ? null : view5.findViewById(R.id.wl_tv_shift_error_code))).setVisibility(0);
            View view6 = getView();
            ((TextView) (view6 == null ? null : view6.findViewById(R.id.wl_tv_shift_error_code))).setText(this.errorCode);
        }
        View view7 = getView();
        Button button = (Button) (view7 != null ? view7.findViewById(R.id.wl_bt_shift_in_bottom) : null);
        button.setText(this.isSuccess ? button.getResources().getString(R.string.wl_finish) : button.getResources().getString(R.string.wl_retry));
        button.setOnClickListener(g());
        button.setVisibility(0);
        f();
    }

    private final ShiftCardMiViewModel j() {
        return (ShiftCardMiViewModel) this.shiftCardMiViewModel.getValue();
    }

    private final ShiftUIData k() {
        if (this.isSuccess) {
            return this.isShiftIn ? new ShiftUIData(R.drawable.wl_ic_done_green, R.string.wl_r_shift_result_tip_in_success_0, R.string.wl_r_shift_result_tip_in_success_1) : new ShiftUIData(R.drawable.wl_ic_done_green, R.string.wl_r_shift_result_tip_out_success_0, R.string.wl_r_shift_result_tip_out_success_1);
        }
        return this.isShiftIn ? new ShiftUIData(R.drawable.wl_ic_error, R.string.wl_r_shift_result_tip_in_fail_0, R.string.wl_r_shift_result_tip_in_fail_1) : new ShiftUIData(R.drawable.wl_ic_error, R.string.wl_r_shift_result_tip_out_fail_0, R.string.wl_r_shift_result_tip_out_fail_1);
    }

    private final void l() {
        String str = ((Object) this.cardName) + JsonLexerKt.BEGIN_LIST + ((Object) this.appCode) + "] " + (this.isShiftIn ? getResources().getString(R.string.wl_r_shift_result_tip_in_fail_0) : getResources().getString(R.string.wl_r_shift_result_tip_out_fail_0));
        Function4<Context, String, Boolean, Boolean, Boolean> onErrorToFeedback = WalletConfig.getOnErrorToFeedback();
        Context contextRequireContext = requireContext();
        Boolean bool = Boolean.TRUE;
        onErrorToFeedback.invoke(contextRequireContext, str, bool, bool);
    }

    private final void m() {
        new AlertDialogFragment.Builder(b()).setCancelable(true).setTitle(R.string.wl_retry_fail_feedback_alert_title).setMessage(R.string.wl_retry_fail_feedback_alert_msg).setPositiveButton(R.string.wl_retry_fail_feedback_alert_sure_button, new DialogInterface.OnClickListener() { // from class: au6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ShiftResultMiFragment.n(this.a, dialogInterface, i);
            }
        }).setNegativeButton(R.string.wl_cancel, new DialogInterface.OnClickListener() { // from class: bu6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ShiftResultMiFragment.o(dialogInterface, i);
            }
        }).show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(ShiftResultMiFragment shiftResultMiFragment, DialogInterface dialogInterface, int i) {
        shiftResultMiFragment.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    public void _$_clearFindViewByIdCache() {
    }

    /* JADX WARN: Code duplicated, block: B:73:0x012d  */
    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Bundle arguments = getArguments();
        String string = null;
        this.isSuccess = (arguments == null ? null : Boolean.valueOf(arguments.getBoolean("ARG_IS_SUCCESS", true))).booleanValue();
        Bundle arguments2 = getArguments();
        this.isShiftIn = (arguments2 == null ? null : Boolean.valueOf(arguments2.getBoolean(ShiftCardActivity.EXTRA_IS_SHIFT_IN, true))).booleanValue();
        Bundle arguments3 = getArguments();
        this.isShiftInException = (arguments3 == null ? null : Boolean.valueOf(arguments3.getBoolean(ShiftCardActivity.EXTRA_IS_SHIFTIN_EXCEPTION, false))).booleanValue();
        Bundle arguments4 = getArguments();
        this.orderId = arguments4 == null ? null : arguments4.getString(ShiftCardActivity.EXTRA_SHIFT_ORDER_ID);
        Bundle arguments5 = getArguments();
        this.appCode = arguments5 == null ? null : arguments5.getString(ShiftCardActivity.EXTRA_BUS_CARD_ID);
        Bundle arguments6 = getArguments();
        this.cardName = arguments6 == null ? null : arguments6.getString(BusCardDetailActivity.EXTRA_EXPAND_CARD_NAME);
        Bundle arguments7 = getArguments();
        this.xiaomiCardName = arguments7 == null ? null : arguments7.getString(BusCardDetailActivity.EXTRA_EXPAND_XIAOMI_CARD_NAME);
        Bundle arguments8 = getArguments();
        this.imgUrl = arguments8 == null ? null : arguments8.getString("EXTRA_EXPAND_CARD_IMG_URL");
        Bundle arguments9 = getArguments();
        this.errorCode = arguments9 == null ? null : arguments9.getString(ShiftCardActivity.EXTRA_ERROR_CODE);
        Bundle arguments10 = getArguments();
        this.errorMsg = arguments10 == null ? null : arguments10.getString(ShiftCardActivity.EXTRA_ERROR_MSG);
        Bundle arguments11 = getArguments();
        this.packageName = arguments11 == null ? null : arguments11.getString("EXTRA_PACKAGENAME");
        Bundle arguments12 = getArguments();
        this.appName = arguments12 == null ? null : arguments12.getString("EXTRA_APPNAME");
        Bundle arguments13 = getArguments();
        this.redirectTo = arguments13 == null ? null : arguments13.getString("EXTRA_REDIRECTTO");
        Bundle arguments14 = getArguments();
        this.serviceContact = arguments14 == null ? null : arguments14.getString("EXTRA_SERVICECONTACT");
        Bundle arguments15 = getArguments();
        if ((arguments15 == null ? null : Boolean.valueOf(arguments15.containsKey(ShiftCardActivity.EXTRA_XM_ACTION_TOKEN))).booleanValue()) {
            Bundle arguments16 = getArguments();
            if ((arguments16 == null ? null : arguments16.getString(ShiftCardActivity.EXTRA_XM_ACTION_TOKEN)) != null) {
                Bundle arguments17 = getArguments();
                if (arguments17 != null) {
                    string = arguments17.getString(ShiftCardActivity.EXTRA_XM_ACTION_TOKEN);
                }
            } else {
                string = "";
            }
        } else {
            string = "";
        }
        this.xmActionToken = string;
        return inflater.inflate(R.layout.wl_shift_result_fragment, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
    }
}
