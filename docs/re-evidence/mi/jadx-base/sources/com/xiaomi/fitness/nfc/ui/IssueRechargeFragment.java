package com.xiaomi.fitness.nfc.ui;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ListAdapter;
import androidx.fragment.app.FragmentActivity;
import coil.Coil;
import coil.request.ImageRequest;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.miui.tsmclient.sesdk.OrderData;
import com.miui.tsmclient.sesdk.ServiceProtocolData;
import com.miui.tsmclient.sesdk.TransitCardDetail;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.bean.FeeBean;
import com.xiaomi.fitness.nfc.common.CommonBaseActivity;
import com.xiaomi.fitness.nfc.ui.IssueRechargeFragment;
import com.xiaomi.fitness.nfc.utils.UtilsKt;
import com.xiaomi.fitness.nfc.widget.PhoneNumVerifyView;
import com.xiaomi.fitness.nfc.widget.RechargeItemView;
import defpackage.g5n;
import defpackage.kid;
import defpackage.o0j;
import defpackage.pli;
import defpackage.q2j;
import defpackage.rji;
import defpackage.sui;
import defpackage.tog;
import defpackage.vqg;
import defpackage.zl3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001'B\u0007¢\u0006\u0004\b&\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0006J)\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/IssueRechargeFragment;", "Lcom/xiaomi/fitness/nfc/ui/BaseRechargeFragment;", "Lcom/xiaomi/fitness/nfc/ui/IssueRechargeViewModel;", "Ltog;", "", "updateRechargeListView", "()V", "", "Lcom/miui/tsmclient/sesdk/OrderData$Coupon;", "list", "refreshCouponView", "(Ljava/util/List;)V", "selectCoupon", "resetSelectCoupon", "(Lcom/miui/tsmclient/sesdk/OrderData$Coupon;)V", "bindView", "(Ltog;)V", "", "position", "rechargeAmountChange", "(I)V", "load", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lcom/miui/tsmclient/sesdk/ServiceProtocolData;", "protocolData", "Lcom/miui/tsmclient/sesdk/ServiceProtocolData;", "Lkid;", "mFeeAdapter", "Lkid;", "<init>", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nIssueRechargeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IssueRechargeFragment.kt\ncom/xiaomi/fitness/nfc/ui/IssueRechargeFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Extensions.kt\ncoil/-SingletonExtensions\n+ 4 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,250:1\n1557#2:251\n1628#2,3:252\n54#3,3:255\n24#3:258\n57#3,6:259\n63#3,2:266\n57#4:265\n*S KotlinDebug\n*F\n+ 1 IssueRechargeFragment.kt\ncom/xiaomi/fitness/nfc/ui/IssueRechargeFragment\n*L\n126#1:251\n126#1:252,3\n136#1:255,3\n136#1:258\n136#1:259,6\n136#1:266,2\n136#1:265\n*E\n"})
public final class IssueRechargeFragment extends BaseRechargeFragment<IssueRechargeViewModel, tog> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static int sRequestCoupon = 10;

    @Nullable
    private kid mFeeAdapter;

    @Nullable
    private ServiceProtocolData protocolData;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/IssueRechargeFragment$Companion;", "", "<init>", "()V", "sRequestCoupon", "", "getSRequestCoupon", "()I", "setSRequestCoupon", "(I)V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getSRequestCoupon() {
            return IssueRechargeFragment.sRequestCoupon;
        }

        public final void setSRequestCoupon(int i) {
            IssueRechargeFragment.sRequestCoupon = i;
        }
    }

    public IssueRechargeFragment() {
        super(sui.O, 0, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0(IssueRechargeFragment this$0, AdapterView adapterView, View view, int i, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.rechargeAmountChange(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$1(IssueRechargeFragment this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((tog) this$0.getMBinding()).O.setEnabled(z && ((tog) this$0.getMBinding()).P.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$2(IssueRechargeFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((tog) this$0.getMBinding()).O.setEnabled(((tog) this$0.getMBinding()).A.isChecked() && ((tog) this$0.getMBinding()).P.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$5(final IssueRechargeFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.protocolData == null) {
            ToastUtil.showShortToast(o0j.t2);
            return;
        }
        Intrinsics.checkNotNull(str);
        if (!StringsKt__StringsJVMKt.startsWith$default(str, "1", false, 2, null) || str.length() != 11) {
            ToastUtil.showShortToast(o0j.H5);
            return;
        }
        this$0.showLoading();
        ((tog) this$0.getMBinding()).P.setSendCodeCountDownTxt("60s");
        ((tog) this$0.getMBinding()).P.setSendCodeCountDownTxtColor(rji.p);
        IssueRechargeViewModel issueRechargeViewModel = (IssueRechargeViewModel) this$0.getMViewModel();
        ServiceProtocolData serviceProtocolData = this$0.protocolData;
        Intrinsics.checkNotNull(serviceProtocolData);
        issueRechargeViewModel.requestValidateCode(serviceProtocolData, str, new Function0() { // from class: oid
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IssueRechargeFragment.bindView$lambda$5$lambda$3(this.f29199a);
            }
        }, new Function1() { // from class: pid
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssueRechargeFragment.bindView$lambda$5$lambda$4(this.f30415a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$5$lambda$3(IssueRechargeFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        IssueRechargeViewModel issueRechargeViewModel = (IssueRechargeViewModel) this$0.getMViewModel();
        PhoneNumVerifyView phoneVerifyNumView = ((tog) this$0.getMBinding()).P;
        Intrinsics.checkNotNullExpressionValue(phoneVerifyNumView, "phoneVerifyNumView");
        issueRechargeViewModel.startCountDown(phoneVerifyNumView);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$5$lambda$4(IssueRechargeFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.hideLoading();
        ToastUtil.showShortToast(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$6(IssueRechargeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CardWrapper cardWrapper = this$0.getCardWrapper();
        String issueStatusDesc = cardWrapper != null ? cardWrapper.getIssueStatusDesc() : null;
        CardWrapper cardWrapper2 = this$0.getCardWrapper();
        Integer numValueOf = cardWrapper2 != null ? Integer.valueOf(cardWrapper2.getIssueStatus()) : null;
        ToastUtil.showShortToast(issueStatusDesc);
        if (numValueOf != null && numValueOf.intValue() == 4) {
            return;
        }
        this$0.clickRechargeBtn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$7(IssueRechargeFragment this$0, View view) {
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
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit load$lambda$11(final IssueRechargeFragment this$0, CardWrapper cardWrapper) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        this$0.hideLoading();
        if (cardWrapper.isTransit()) {
            List<OrderData.Fee> activeFeeInfoList = cardWrapper.getActiveFeeInfoList();
            if (activeFeeInfoList != null && !activeFeeInfoList.isEmpty()) {
                cardWrapper.selectedFee = cardWrapper.getActiveFeeInfoList().get(0);
            }
            IssueRechargeViewModel issueRechargeViewModel = (IssueRechargeViewModel) this$0.getMViewModel();
            CardWrapper cardWrapper2 = this$0.getCardWrapper();
            Intrinsics.checkNotNull(cardWrapper2);
            issueRechargeViewModel.queryCoupons(cardWrapper2, new Function1() { // from class: nid
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return IssueRechargeFragment.load$lambda$11$lambda$9(this.f27962a, (List) obj);
                }
            });
        }
        CardWrapper cardWrapper3 = this$0.getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper3);
        List<OrderData.Fee> activeFeeInfoList2 = cardWrapper3.getActiveFeeInfoList();
        Intrinsics.checkNotNullExpressionValue(activeFeeInfoList2, "getActiveFeeInfoList(...)");
        List<OrderData.Fee> list = activeFeeInfoList2;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            OrderData.Fee fee = (OrderData.Fee) it.next();
            Intrinsics.checkNotNull(fee);
            arrayList.add(new FeeBean(fee, false, 2, null));
        }
        List<FeeBean> list2 = CollectionsKt___CollectionsKt.toList(arrayList);
        if (!list2.isEmpty()) {
            list2.get(0).setSelected(true);
            cardWrapper.selectedFee = list2.get(0).getFee();
        }
        kid kidVar = this$0.mFeeAdapter;
        if (kidVar != null) {
            kidVar.c(list2);
        }
        CardWrapper cardWrapper4 = this$0.getCardWrapper();
        String cardFace = cardWrapper4 != null ? cardWrapper4.getCardFace() : null;
        if (!TextUtils.isEmpty(cardFace)) {
            ImageView cardFaceView = ((tog) this$0.getMBinding()).B;
            Intrinsics.checkNotNullExpressionValue(cardFaceView, "cardFaceView");
            Coil.imageLoader(cardFaceView.getContext()).enqueue(new ImageRequest.Builder(cardFaceView.getContext()).data(cardFace).target(cardFaceView).build());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit load$lambda$11$lambda$9(IssueRechargeFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updateRechargeListView();
        this$0.refreshCouponView(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit load$lambda$12(IssueRechargeFragment this$0, ServiceProtocolData protocolData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(protocolData, "protocolData");
        this$0.protocolData = protocolData;
        String url = protocolData.getUrl();
        vqg.b("serviceProtocolData url:" + url + " isNeedPhone:" + protocolData.isNeedPhone());
        Resources resources = this$0.getResources();
        int i = o0j.e1;
        CardWrapper cardWrapper = this$0.getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        String string = resources.getString(i, url, cardWrapper.mCardName);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        ((tog) this$0.getMBinding()).Q.setText(com.xiaomi.fitness.nfc.hyperlink.a.b(string));
        ((tog) this$0.getMBinding()).Q.setMovementMethod(LinkMovementMethod.getInstance());
        if (protocolData.isNeedPhone()) {
            ((tog) this$0.getMBinding()).P.setVisibility(0);
            ((tog) this$0.getMBinding()).P.setPhoneValidate(false);
        } else {
            ((tog) this$0.getMBinding()).P.setVisibility(8);
            ((tog) this$0.getMBinding()).P.setPhoneValidate(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit load$lambda$13(IssueRechargeFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((tog) this$0.getMBinding()).P.setVisibility(8);
        ((tog) this$0.getMBinding()).P.setPhoneValidate(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit load$lambda$14(IssueRechargeFragment this$0, String tips) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(tips, "tips");
        if (!TextUtils.isEmpty(tips)) {
            ((tog) this$0.getMBinding()).S.setVisibility(0);
            ((tog) this$0.getMBinding()).S.setMarqueeText(Html.fromHtml(tips).toString());
            ((tog) this$0.getMBinding()).S.h();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rechargeAmountChange$lambda$8(IssueRechargeFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updateRechargeListView();
        this$0.refreshCouponView(list);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshCouponView(List<? extends OrderData.Coupon> list) {
        if (list != null) {
            List<? extends OrderData.Coupon> list2 = list;
            if (!list2.isEmpty()) {
                zl3.g().f41419b.addAll(list2);
                OrderData.Coupon couponFindMaxCoupon = UtilsKt.findMaxCoupon(list);
                if (couponFindMaxCoupon == null) {
                    vqg.b("don't find max coupon");
                    return;
                } else {
                    vqg.d("refreshCouponView selectCoupon");
                    resetSelectCoupon(couponFindMaxCoupon);
                    return;
                }
            }
        }
        vqg.d("refreshCouponView is empty");
        ((tog) getMBinding()).G.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void resetSelectCoupon(OrderData.Coupon selectCoupon) {
        zl3.g().f41418a = selectCoupon;
        CardWrapper cardWrapper = getCardWrapper();
        if (cardWrapper != null) {
            cardWrapper.setCoupon(selectCoupon);
        }
        vqg.d("resetSelectCoupon selectCoupon");
        if (selectCoupon != null) {
            vqg.d("resetSelectCoupon discountAmount:" + selectCoupon.getDiscountAmount());
            ((tog) getMBinding()).G.setValue(selectCoupon.getDiscountAmount());
            ((tog) getMBinding()).G.setValueColor(rji.m);
            ((tog) getMBinding()).G.setVisibility(0);
            return;
        }
        List<OrderData.Coupon> mCouponInfoList = zl3.g().f41419b;
        Intrinsics.checkNotNullExpressionValue(mCouponInfoList, "mCouponInfoList");
        OrderData.Coupon couponFindMaxCoupon = UtilsKt.findMaxCoupon(mCouponInfoList);
        vqg.d("resetSelectCoupon maxCoupon:" + couponFindMaxCoupon);
        if (couponFindMaxCoupon != null) {
            ((tog) getMBinding()).G.setValue(getString(o0j.O4, Float.valueOf(couponFindMaxCoupon.getTotalDiscount() / 100.0f)));
            ((tog) getMBinding()).G.setValueColor(rji.m);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateRechargeListView() {
        CardWrapper cardWrapper = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        String serviceFeeDesc = TransitCardDetail.fromJson(cardWrapper.mSeCard.getDetail()).getServiceFeeDesc();
        RechargeItemView rechargeItemView = ((tog) getMBinding()).R;
        if (TextUtils.isEmpty(serviceFeeDesc)) {
            serviceFeeDesc = getString(o0j.E2);
        }
        rechargeItemView.setTitle(serviceFeeDesc);
        CardWrapper cardWrapper2 = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper2);
        int originServiceFee = cardWrapper2.getOriginServiceFee();
        CardWrapper cardWrapper3 = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper3);
        vqg.d("transitCardDetail:" + cardWrapper3.mSeCard.getDetail() + "  serviceFee:" + originServiceFee);
        CardWrapper cardWrapper4 = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper4);
        if (originServiceFee != cardWrapper4.selectedFee.getServiceFee()) {
            int i = o0j.O1;
            CardWrapper cardWrapper5 = getCardWrapper();
            Intrinsics.checkNotNull(cardWrapper5);
            String string = getString(i, Float.valueOf(cardWrapper5.selectedFee.getServiceFee() / 100.0f));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = getString(o0j.O1, Float.valueOf(originServiceFee / 100.0f));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String str = string + " " + string2;
            ((tog) getMBinding()).R.setValue(g5n.b(str, string.length() + 1, str.length()));
            ((tog) getMBinding()).R.setValueColor(rji.m);
        } else {
            ((tog) getMBinding()).R.setValue(getString(o0j.O1, Float.valueOf(originServiceFee / 100.0f)));
            ((tog) getMBinding()).R.setValueColor(rji.d);
        }
        int i2 = o0j.M4;
        CardWrapper cardWrapper6 = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper6);
        String string3 = getString(i2, Float.valueOf(cardWrapper6.selectedFee.getTotalPay() / 100.0f));
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        ((tog) getMBinding()).O.setText(g5n.a(getMActivity(), string3, q2j.f31018a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull tog togVar) {
        Intrinsics.checkNotNullParameter(togVar, "<this>");
        CardWrapper cardWrapper = getCardWrapper();
        setTitle(cardWrapper != null ? cardWrapper.mCardName : null);
        this.mFeeAdapter = new kid(getMActivity());
        ((tog) getMBinding()).H.setAdapter((ListAdapter) this.mFeeAdapter);
        load();
        ((tog) getMBinding()).P.setCardWrapper(getCardWrapper());
        ((tog) getMBinding()).H.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: lid
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                IssueRechargeFragment.bindView$lambda$0(this.f25099a, adapterView, view, i, j);
            }
        });
        CheckBox checkBox = ((tog) getMBinding()).A;
        if (checkBox != null) {
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: qid
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    IssueRechargeFragment.bindView$lambda$1(this.f31543a, compoundButton, z);
                }
            });
        }
        ((tog) getMBinding()).P.setOnPhoneAndCodeTextChangeListener(new PhoneNumVerifyView.b() { // from class: rid
            @Override // com.xiaomi.fitness.nfc.widget.PhoneNumVerifyView.b
            public final void a() {
                IssueRechargeFragment.bindView$lambda$2(this.f32569a);
            }
        });
        ((tog) getMBinding()).P.setOnRequestCaptchaListener(new PhoneNumVerifyView.c() { // from class: sid
            @Override // com.xiaomi.fitness.nfc.widget.PhoneNumVerifyView.c
            public final void a(String str) {
                IssueRechargeFragment.bindView$lambda$5(this.f33665a, str);
            }
        });
        ((tog) getMBinding()).O.setOnClickListener(new View.OnClickListener() { // from class: tid
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IssueRechargeFragment.bindView$lambda$6(this.f34738a, view);
            }
        });
        ((tog) getMBinding()).G.setOnClickListener(new View.OnClickListener() { // from class: uid
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IssueRechargeFragment.bindView$lambda$7(this.f35790a, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void load() {
        if (getCardWrapper() == null) {
            vqg.b(IssueRechargeFragment.class.getSimpleName() + "  mCardInfo is null");
            return;
        }
        showLoading();
        IssueRechargeViewModel issueRechargeViewModel = (IssueRechargeViewModel) getMViewModel();
        CardWrapper cardWrapper = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        issueRechargeViewModel.updateCard(cardWrapper, new Function1() { // from class: wid
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssueRechargeFragment.load$lambda$11(this.f38004a, (CardWrapper) obj);
            }
        });
        IssueRechargeViewModel issueRechargeViewModel2 = (IssueRechargeViewModel) getMViewModel();
        CardWrapper cardWrapper2 = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper2);
        issueRechargeViewModel2.loadServiceProtocolData(cardWrapper2, new Function1() { // from class: xid
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssueRechargeFragment.load$lambda$12(this.f39156a, (ServiceProtocolData) obj);
            }
        }, new Function0() { // from class: yid
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IssueRechargeFragment.load$lambda$13(this.f40210a);
            }
        });
        IssueRechargeViewModel issueRechargeViewModel3 = (IssueRechargeViewModel) getMViewModel();
        CardWrapper cardWrapper3 = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper3);
        issueRechargeViewModel3.loadBullet(cardWrapper3, "issuecard", new Function1() { // from class: mid
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssueRechargeFragment.load$lambda$14(this.f26211a, (String) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.nfc.ui.BaseRechargeFragment, androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == sRequestCoupon) {
            resetSelectCoupon(zl3.g().f41418a);
            updateRechargeListView();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int dimensionPixelSize = AppUtil.getApp().getResources().getDimensionPixelSize(pli.e);
        ((tog) getMBinding()).F.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void rechargeAmountChange(int position) {
        kid kidVar = this.mFeeAdapter;
        if (kidVar != null) {
            kidVar.b(position);
        }
        CardWrapper cardWrapper = getCardWrapper();
        if (cardWrapper != null) {
            CardWrapper cardWrapper2 = getCardWrapper();
            Intrinsics.checkNotNull(cardWrapper2);
            cardWrapper.selectedFee = cardWrapper2.getActiveFeeInfoList().get(position);
        }
        CardWrapper cardWrapper3 = getCardWrapper();
        if ((cardWrapper3 != null ? cardWrapper3.selectedFee : null) == null) {
            vqg.b("rechargeAmountChange called! feeInfo is null.");
            return;
        }
        IssueRechargeViewModel issueRechargeViewModel = (IssueRechargeViewModel) getMViewModel();
        CardWrapper cardWrapper4 = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper4);
        issueRechargeViewModel.queryCoupons(cardWrapper4, new Function1() { // from class: vid
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssueRechargeFragment.rechargeAmountChange$lambda$8(this.f36924a, (List) obj);
            }
        });
    }
}
