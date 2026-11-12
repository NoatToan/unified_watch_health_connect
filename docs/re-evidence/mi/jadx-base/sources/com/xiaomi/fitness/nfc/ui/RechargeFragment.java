package com.xiaomi.fitness.nfc.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.miui.tsmclient.sesdk.OrderData;
import com.miui.tsmclient.util.PrefUtils;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.common.CommonBaseActivity;
import com.xiaomi.fitness.nfc.ui.RechargeFragment;
import com.xiaomi.fitness.nfc.utils.UtilsKt;
import defpackage.g5n;
import defpackage.gak;
import defpackage.o0j;
import defpackage.q2j;
import defpackage.rji;
import defpackage.rng;
import defpackage.sui;
import defpackage.vqg;
import defpackage.zl3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001(B\u0007¢\u0006\u0004\b'\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00100$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/RechargeFragment;", "Lcom/xiaomi/fitness/nfc/ui/BaseRechargeFragment;", "Lcom/xiaomi/fitness/nfc/ui/RechargeViewModel;", "Lrng;", "", "onRechargeClicked", "()V", "updateCard", "", "Lcom/miui/tsmclient/sesdk/OrderData$Coupon;", "list", "refreshCouponView", "(Ljava/util/List;)V", "selectCoupon", "resetSelectCoupon", "(Lcom/miui/tsmclient/sesdk/OrderData$Coupon;)V", "Lcom/miui/tsmclient/sesdk/OrderData$Fee;", "feeList", "findDefaultFee", "(Ljava/util/List;)Lcom/miui/tsmclient/sesdk/OrderData$Fee;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Lcom/xiaomi/fitness/nfc/ui/RechargeAdapter;", "mChooseAdapter", "Lcom/xiaomi/fitness/nfc/ui/RechargeAdapter;", "", "dataList", "Ljava/util/List;", "<init>", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class RechargeFragment extends BaseRechargeFragment<RechargeViewModel, rng> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static int sRequestCoupon = 10;

    @NotNull
    private final List<OrderData.Fee> dataList;
    private RechargeAdapter mChooseAdapter;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/RechargeFragment$Companion;", "", "<init>", "()V", "sRequestCoupon", "", "getSRequestCoupon", "()I", "setSRequestCoupon", "(I)V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getSRequestCoupon() {
            return RechargeFragment.sRequestCoupon;
        }

        public final void setSRequestCoupon(int i) {
            RechargeFragment.sRequestCoupon = i;
        }
    }

    public RechargeFragment() {
        super(sui.A, 0, true);
        this.dataList = new ArrayList();
    }

    private final OrderData.Fee findDefaultFee(List<? extends OrderData.Fee> feeList) {
        OrderData.Fee fee = feeList.get(0);
        for (OrderData.Fee fee2 : feeList) {
            if (fee2.isSuggested()) {
                return fee2;
            }
        }
        return fee;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    /* JADX WARN: Code duplicated, block: B:8:0x002b  */
    private final void onRechargeClicked() {
        CardWrapper cardWrapper = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        if (cardWrapper.mCardBalance < 15000) {
            CardWrapper cardWrapper2 = getCardWrapper();
            Intrinsics.checkNotNull(cardWrapper2);
            if (cardWrapper2.selectedFee.getRechargeFee() >= 10000) {
                if (!PrefUtils.getBoolean(getMActivity(), PrefUtils.PREF_KEY_POPUP_RECHARGE_TIPS_ALREADY, false)) {
                    String string = getString(o0j.S1);
                    String string2 = getString(o0j.R1);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    int i = o0j.common_known;
                    FragmentManager childFragmentManager = getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                    UtilsKt.showMsgDialog((80 & 1) != 0 ? null : string, string2, i, childFragmentManager, (80 & 16) != 0 ? -1 : 0, (Function1<? super DialogInterface, Unit>) ((80 & 32) != 0 ? null : new Function1() { // from class: hij
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return RechargeFragment.onRechargeClicked$lambda$6((DialogInterface) obj);
                        }
                    }), (Function1<? super DialogInterface, Unit>) ((80 & 64) != 0 ? null : null));
                    PrefUtils.putBoolean(getActivity(), PrefUtils.PREF_KEY_POPUP_RECHARGE_TIPS_ALREADY, true);
                    return;
                }
            }
        } else if (!PrefUtils.getBoolean(getMActivity(), PrefUtils.PREF_KEY_POPUP_RECHARGE_TIPS_ALREADY, false)) {
            String string3 = getString(o0j.S1);
            String string4 = getString(o0j.R1);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            int i2 = o0j.common_known;
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
            UtilsKt.showMsgDialog((80 & 1) != 0 ? null : string3, string4, i2, childFragmentManager2, (80 & 16) != 0 ? -1 : 0, (Function1<? super DialogInterface, Unit>) ((80 & 32) != 0 ? null : new Function1() { // from class: hij
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return RechargeFragment.onRechargeClicked$lambda$6((DialogInterface) obj);
                }
            }), (Function1<? super DialogInterface, Unit>) ((80 & 64) != 0 ? null : null));
            PrefUtils.putBoolean(getActivity(), PrefUtils.PREF_KEY_POPUP_RECHARGE_TIPS_ALREADY, true);
            return;
        }
        clickRechargeBtn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onRechargeClicked$lambda$6(DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$1(final RechargeFragment this$0, OrderData.Fee selectedFee) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(selectedFee, "selectedFee");
        CardWrapper cardWrapper = this$0.getCardWrapper();
        if (cardWrapper != null) {
            cardWrapper.selectedFee = selectedFee;
        }
        RechargeAdapter rechargeAdapter = this$0.mChooseAdapter;
        RechargeAdapter rechargeAdapter2 = null;
        if (rechargeAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChooseAdapter");
            rechargeAdapter = null;
        }
        rechargeAdapter.setDefaultFee(selectedFee);
        RechargeAdapter rechargeAdapter3 = this$0.mChooseAdapter;
        if (rechargeAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChooseAdapter");
        } else {
            rechargeAdapter2 = rechargeAdapter3;
        }
        rechargeAdapter2.notifyDataSetChanged();
        if (selectedFee.getRechargeFee() >= 0) {
            CardWrapper cardWrapper2 = this$0.getCardWrapper();
            Intrinsics.checkNotNull(cardWrapper2);
            this$0.setMAmountValue(cardWrapper2.selectedFee.getRechargeFee() / 100);
        }
        RechargeViewModel rechargeViewModel = (RechargeViewModel) this$0.getMViewModel();
        CardWrapper cardWrapper3 = this$0.getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper3);
        rechargeViewModel.queryCoupons(cardWrapper3, new Function1() { // from class: jij
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RechargeFragment.onViewCreated$lambda$1$lambda$0(this.f22841a, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1$lambda$0(RechargeFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.refreshCouponView(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$2(RechargeFragment this$0, String tips) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(tips, "tips");
        if (!TextUtils.isEmpty(tips)) {
            ((rng) this$0.getMBinding()).G.setVisibility(0);
            ((rng) this$0.getMBinding()).G.setMarqueeText(Html.fromHtml(tips).toString());
            ((rng) this$0.getMBinding()).G.h();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3(RechargeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentParams fragmentParamsB = new FragmentParams.b().e(CouponFragment.class).a(true).b();
        Intrinsics.checkNotNullExpressionValue(fragmentParamsB, "build(...)");
        Intent intent = new Intent();
        FragmentActivity mActivity = this$0.getMActivity();
        Intrinsics.checkNotNull(mActivity);
        intent.setClass(mActivity, CommonBaseActivity.class);
        intent.putExtra("fragment_param", (Parcelable) fragmentParamsB);
        this$0.startActivityForResult(intent, sRequestCoupon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$5(final RechargeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CardWrapper cardWrapper = this$0.getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        if (cardWrapper.isOwner) {
            this$0.onRechargeClicked();
            return;
        }
        int i = o0j.N6;
        int i2 = o0j.T5;
        int i3 = o0j.V5;
        FragmentManager parentFragmentManager = this$0.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        UtilsKt.showMsgDialog$default(i, i2, i3, parentFragmentManager, o0j.common_cancel, new Function1() { // from class: gij
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RechargeFragment.onViewCreated$lambda$5$lambda$4(this.f19035a, (DialogInterface) obj);
            }
        }, (Function1) null, 64, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5$lambda$4(RechargeFragment this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onRechargeClicked();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshCouponView(List<? extends OrderData.Coupon> list) {
        if (list == null || !(!list.isEmpty())) {
            ((rng) getMBinding()).D.setVisibility(8);
            return;
        }
        OrderData.Coupon couponFindMaxCoupon = UtilsKt.findMaxCoupon(list);
        if (couponFindMaxCoupon != null) {
            resetSelectCoupon(couponFindMaxCoupon);
        } else {
            vqg.b("don't find max coupon");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void resetSelectCoupon(OrderData.Coupon selectCoupon) {
        zl3.g().f41418a = selectCoupon;
        CardWrapper cardWrapper = getCardWrapper();
        if (cardWrapper != null) {
            cardWrapper.setCoupon(selectCoupon);
        }
        if (selectCoupon != null) {
            ((rng) getMBinding()).D.setValue(selectCoupon.getDiscountAmount());
            ((rng) getMBinding()).D.setValueColor(rji.m);
            ((rng) getMBinding()).D.setVisibility(0);
        } else {
            List<OrderData.Coupon> mCouponInfoList = zl3.g().f41419b;
            Intrinsics.checkNotNullExpressionValue(mCouponInfoList, "mCouponInfoList");
            OrderData.Coupon couponFindMaxCoupon = UtilsKt.findMaxCoupon(mCouponInfoList);
            if (couponFindMaxCoupon != null) {
                ((rng) getMBinding()).D.setValue(getString(o0j.O4, Float.valueOf(couponFindMaxCoupon.getTotalDiscount() / 100.0f)));
                ((rng) getMBinding()).D.setValueColor(rji.m);
            }
        }
        int i = o0j.M4;
        CardWrapper cardWrapper2 = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper2);
        String string = getString(i, Float.valueOf(cardWrapper2.selectedFee.getTotalPay() / 100.0f));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        ((rng) getMBinding()).B.setText(g5n.a(getMActivity(), string, q2j.f31018a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateCard() {
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 3, null);
        RechargeViewModel rechargeViewModel = (RechargeViewModel) getMViewModel();
        CardWrapper cardWrapper = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        rechargeViewModel.updateCard(cardWrapper, new Function1() { // from class: aij
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RechargeFragment.updateCard$lambda$8(this.f1064a, (CardWrapper) obj);
            }
        }, new Function1() { // from class: bij
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RechargeFragment.updateCard$lambda$9(this.f4255a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit updateCard$lambda$8(final RechargeFragment this$0, CardWrapper cardWrapper) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        List<OrderData.Fee> activeFeeInfoList = cardWrapper.getActiveFeeInfoList();
        Intrinsics.checkNotNull(activeFeeInfoList);
        List<OrderData.Fee> list = activeFeeInfoList;
        if (!list.isEmpty()) {
            this$0.hideLoading();
            OrderData.Fee feeFindDefaultFee = this$0.findDefaultFee(activeFeeInfoList);
            cardWrapper.selectedFee = feeFindDefaultFee;
            if (feeFindDefaultFee.getRechargeFee() >= 0) {
                this$0.setMAmountValue(feeFindDefaultFee.getRechargeFee() / 100);
            }
            ((RechargeViewModel) this$0.getMViewModel()).queryCoupons(cardWrapper, new Function1() { // from class: iij
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return RechargeFragment.updateCard$lambda$8$lambda$7(this.f21176a, (List) obj);
                }
            });
            RechargeAdapter rechargeAdapter = this$0.mChooseAdapter;
            RechargeAdapter rechargeAdapter2 = null;
            if (rechargeAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChooseAdapter");
                rechargeAdapter = null;
            }
            rechargeAdapter.setDefaultFee(feeFindDefaultFee);
            this$0.dataList.addAll(list);
            RechargeAdapter rechargeAdapter3 = this$0.mChooseAdapter;
            if (rechargeAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChooseAdapter");
            } else {
                rechargeAdapter2 = rechargeAdapter3;
            }
            rechargeAdapter2.notifyDataSetChanged();
        } else {
            vqg.b("not found fee list:" + activeFeeInfoList);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateCard$lambda$8$lambda$7(RechargeFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.refreshCouponView(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateCard$lambda$9(RechargeFragment this$0, String msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this$0.hideLoading();
        ToastUtil.showShortToast(msg);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.nfc.ui.BaseRechargeFragment, androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == sRequestCoupon) {
            resetSelectCoupon(zl3.g().f41418a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        CardWrapper cardWrapper = getCardWrapper();
        RechargeAdapter rechargeAdapter = null;
        setTitle(cardWrapper != null ? cardWrapper.mCardName : null);
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        this.mChooseAdapter = new RechargeAdapter(mActivity, this.dataList, new Function1() { // from class: cij
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RechargeFragment.onViewCreated$lambda$1(this.f5378a, (OrderData.Fee) obj);
            }
        });
        RecyclerView recyclerView = ((rng) getMBinding()).A;
        FragmentActivity mActivity2 = getMActivity();
        Intrinsics.checkNotNull(mActivity2);
        recyclerView.setLayoutManager(new GridLayoutManager(mActivity2, 2));
        ((rng) getMBinding()).A.addItemDecoration(new gak(DisplayUtil.dip2px(13.0f), DisplayUtil.dip2px(13.0f), false));
        RecyclerView recyclerView2 = ((rng) getMBinding()).A;
        RechargeAdapter rechargeAdapter2 = this.mChooseAdapter;
        if (rechargeAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChooseAdapter");
        } else {
            rechargeAdapter = rechargeAdapter2;
        }
        recyclerView2.setAdapter(rechargeAdapter);
        updateCard();
        ((RechargeViewModel) getMViewModel()).loadBullet(getCardWrapper(), "recharge", new Function1() { // from class: dij
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RechargeFragment.onViewCreated$lambda$2(this.f15567a, (String) obj);
            }
        });
        ((rng) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: eij
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RechargeFragment.onViewCreated$lambda$3(this.f16688a, view2);
            }
        });
        ((rng) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: fij
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RechargeFragment.onViewCreated$lambda$5(this.f17819a, view2);
            }
        });
    }
}
