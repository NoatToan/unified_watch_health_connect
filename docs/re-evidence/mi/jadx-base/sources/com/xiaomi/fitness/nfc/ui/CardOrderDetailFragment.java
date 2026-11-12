package com.xiaomi.fitness.nfc.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.miui.tsmclient.entity.RefundInfo;
import com.miui.tsmclient.sesdk.OrderData;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.CardOrderDetailFragment;
import defpackage.hch;
import defpackage.nng;
import defpackage.o0j;
import defpackage.o63;
import defpackage.pli;
import defpackage.sui;
import defpackage.wni;
import defpackage.yhj;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 72\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00017B\u0007¢\u0006\u0004\b6\u0010\fJ!\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0019\u0010\fJ\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\fJ\r\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\fJ\r\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\fJ\r\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\fJ\u0015\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\b¢\u0006\u0004\b\"\u0010\fJ\u0017\u0010$\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010+R\u0016\u0010-\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00104\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00068"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/CardOrderDetailFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/CardOrderDetailViewModel;", "Lnng;", "", "titleId", "", MiuiCursorConstants.CONTENT, "", "doCopy", "(ILjava/lang/String;)V", "showOrderIdInfo", "()V", "Landroid/os/Bundle;", "args", "setArguments", "(Landroid/os/Bundle;)V", "", "isNeedCardInfo", "()Z", "Landroid/view/View;", "view", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", com.xiaomi.onetrack.api.b.M, "handleOrder", "issue", "loadOrderDetail", "Lcom/miui/tsmclient/sesdk/OrderData$OrderRecordDetail;", "orderDetailInfo", "showData", "(Lcom/miui/tsmclient/sesdk/OrderData$OrderRecordDetail;)V", "refund", "desc", "showRefundDialog", "(Ljava/lang/String;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", Constants.EXTRA_ERROR_MESSAGE, "Ljava/lang/String;", "orderId", "isFromIssue", "Z", "amount", "I", "Lhch;", "flowAdapter", "Lhch;", "orderDetail", "Lcom/miui/tsmclient/sesdk/OrderData$OrderRecordDetail;", "<init>", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CardOrderDetailFragment extends BaseCardFragment<CardOrderDetailViewModel, nng> {

    @NotNull
    public static final String ERROR_MSG_KEY = "error_msg_key";

    @NotNull
    public static final String sAmount = "sAmount";

    @NotNull
    public static final String sIsFromIssue = "sIsFromIssue";

    @NotNull
    public static final String sOrderId = "sOrderId";
    private int amount;

    @Nullable
    private String errorMsg;

    @Nullable
    private hch flowAdapter;
    private boolean isFromIssue;

    @Nullable
    private OrderData.OrderRecordDetail orderDetail;

    @Nullable
    private String orderId;

    public CardOrderDetailFragment() {
        super(sui.y, 0, true);
    }

    private final void doCopy(int titleId, String content) {
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        Object systemService = mActivity.getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(null, content));
        FragmentActivity mActivity2 = getMActivity();
        Intrinsics.checkNotNull(mActivity2);
        int i = o0j.V0;
        FragmentActivity mActivity3 = getMActivity();
        Intrinsics.checkNotNull(mActivity3);
        String string = mActivity2.getString(i, mActivity3.getString(titleId));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        ToastUtil.showShortToast(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleOrder$lambda$4(CardOrderDetailFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialogForce();
        Intent intent = new Intent(Constants.ACTION_UPDATE_CARD_INFO);
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            mActivity.sendBroadcast(intent);
        }
        o63.b(new yhj());
        Bundle bundle = new Bundle();
        bundle.putString(Constants.KEY_INTENT_FROM, TSMResultFragment.INSTANCE.getFROM_RECHARGE());
        bundle.putInt("recharge_amount", this$0.amount);
        this$0.gotoPage(TSMResultFragment.class, bundle);
        FragmentActivity mActivity2 = this$0.getMActivity();
        if (mActivity2 != null) {
            mActivity2.setResult(-1);
        }
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleOrder$lambda$5(CardOrderDetailFragment this$0, String msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this$0.dismissDialogForce();
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            mActivity.setResult(-1);
        }
        ToastUtil.showLongToast(msg);
        this$0.loadOrderDetail();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadOrderDetail$lambda$6(CardOrderDetailFragment this$0, OrderData.OrderRecordDetail orderRecordDetail) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.orderDetail = orderRecordDetail;
        if (orderRecordDetail != null) {
            this$0.showData(orderRecordDetail);
        } else {
            ToastUtil.showShortToast(o0j.s2);
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                mActivity.setResult(0);
            }
            this$0.finish();
        }
        this$0.hideLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadOrderDetail$lambda$7(CardOrderDetailFragment this$0, String msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this$0.hideLoading();
        ToastUtil.showShortToast(o0j.s2);
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            mActivity.setResult(0);
        }
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$0(CardOrderDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.refund();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$1(CardOrderDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.retry();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$2(CardOrderDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OrderData.OrderRecordDetail orderRecordDetail = this$0.orderDetail;
        if (orderRecordDetail != null) {
            int i = o0j.W0;
            Intrinsics.checkNotNull(orderRecordDetail);
            String orderId = orderRecordDetail.getOrderId();
            Intrinsics.checkNotNullExpressionValue(orderId, "getOrderId(...)");
            this$0.doCopy(i, orderId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$3(CardOrderDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OrderData.OrderRecordDetail orderRecordDetail = this$0.orderDetail;
        if (orderRecordDetail != null) {
            int i = o0j.U0;
            Intrinsics.checkNotNull(orderRecordDetail);
            String spOrderId = orderRecordDetail.getSpOrderId();
            Intrinsics.checkNotNullExpressionValue(spOrderId, "getSpOrderId(...)");
            this$0.doCopy(i, spOrderId);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showOrderIdInfo() {
        OrderData.OrderRecordDetail orderRecordDetail = this.orderDetail;
        Intrinsics.checkNotNull(orderRecordDetail);
        ((nng) getMBinding()).F.setDes(orderRecordDetail.getOrderId());
        OrderData.OrderRecordDetail orderRecordDetail2 = this.orderDetail;
        Intrinsics.checkNotNull(orderRecordDetail2);
        ((nng) getMBinding()).A.setDes(orderRecordDetail2.getSpOrderId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0064  */
    public static final Unit showRefundDialog$lambda$8(CardOrderDetailFragment this$0, RefundInfo refundInfo) {
        String responseDesc;
        FragmentActivity mActivity;
        int i;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(refundInfo);
        if (!refundInfo.isSuccess()) {
            if (TextUtils.isEmpty(refundInfo.getResponseDesc())) {
                mActivity = this$0.getMActivity();
                Intrinsics.checkNotNull(mActivity);
                i = o0j.q5;
            } else {
                responseDesc = refundInfo.getResponseDesc();
            }
            ToastUtil.showToast(responseDesc);
            if (refundInfo.isSuccess()) {
                Intent intent = new Intent(Constants.ACTION_UPDATE_CARD_INFO);
                FragmentActivity mActivity2 = this$0.getMActivity();
                Intrinsics.checkNotNull(mActivity2);
                mActivity2.sendBroadcast(intent);
                FragmentActivity mActivity3 = this$0.getMActivity();
                Intrinsics.checkNotNull(mActivity3);
                mActivity3.setResult(-1);
                FragmentActivity mActivity4 = this$0.getMActivity();
                Intrinsics.checkNotNull(mActivity4);
                mActivity4.finish();
            } else {
                this$0.loadOrderDetail();
            }
            return Unit.INSTANCE;
        }
        mActivity = this$0.getMActivity();
        Intrinsics.checkNotNull(mActivity);
        i = o0j.r5;
        responseDesc = mActivity.getString(i);
        ToastUtil.showToast(responseDesc);
        if (refundInfo.isSuccess()) {
            Intent intent2 = new Intent(Constants.ACTION_UPDATE_CARD_INFO);
            FragmentActivity mActivity5 = this$0.getMActivity();
            Intrinsics.checkNotNull(mActivity5);
            mActivity5.sendBroadcast(intent2);
            FragmentActivity mActivity6 = this$0.getMActivity();
            Intrinsics.checkNotNull(mActivity6);
            mActivity6.setResult(-1);
            FragmentActivity mActivity7 = this$0.getMActivity();
            Intrinsics.checkNotNull(mActivity7);
            mActivity7.finish();
        } else {
            this$0.loadOrderDetail();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRefundDialog$lambda$9(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        ToastUtil.showShortToast(msg);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void handleOrder() {
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 3, null);
        CardOrderDetailViewModel cardOrderDetailViewModel = (CardOrderDetailViewModel) getMViewModel();
        CardWrapper cardWrapper = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        String str = this.orderId;
        Intrinsics.checkNotNull(str);
        cardOrderDetailViewModel.recharge(cardWrapper, str, new Function0() { // from class: wo3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardOrderDetailFragment.handleOrder$lambda$4(this.f38188a);
            }
        }, new Function1() { // from class: xo3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardOrderDetailFragment.handleOrder$lambda$5(this.f39303a, (String) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public boolean isNeedCardInfo() {
        return false;
    }

    public final void issue() {
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        mActivity.setResult(-1);
        FragmentActivity mActivity2 = getMActivity();
        Intrinsics.checkNotNull(mActivity2);
        mActivity2.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void loadOrderDetail() {
        showLoading();
        CardOrderDetailViewModel cardOrderDetailViewModel = (CardOrderDetailViewModel) getMViewModel();
        CardWrapper cardWrapper = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        String str = this.orderId;
        Intrinsics.checkNotNull(str);
        cardOrderDetailViewModel.loadOrderDetail(cardWrapper, str, new Function1() { // from class: uo3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardOrderDetailFragment.loadOrderDetail$lambda$6(this.f35958a, (OrderData.OrderRecordDetail) obj);
            }
        }, new Function1() { // from class: vo3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardOrderDetailFragment.loadOrderDetail$lambda$7(this.f37079a, (String) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int dimensionPixelSize = AppUtil.getApp().getResources().getDimensionPixelSize(pli.e);
        ((nng) getMBinding()).D.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        String string;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (getCardWrapper() == null) {
            string = getString(o0j.V1);
        } else {
            CardWrapper cardWrapper = getCardWrapper();
            Intrinsics.checkNotNull(cardWrapper);
            string = cardWrapper.mCardName;
        }
        setTitle(string);
        this.flowAdapter = new hch(getMActivity());
        ((nng) getMBinding()).E.setAdapter((ListAdapter) this.flowAdapter);
        loadOrderDetail();
    }

    public final void refund() {
        OrderData.OrderRecordDetail orderRecordDetail = this.orderDetail;
        if (orderRecordDetail == null) {
            return;
        }
        Intrinsics.checkNotNull(orderRecordDetail);
        String refundDesc = orderRecordDetail.getRefundDesc();
        Intrinsics.checkNotNullExpressionValue(refundDesc, "getRefundDesc(...)");
        if (TextUtils.isEmpty(refundDesc)) {
            FragmentActivity mActivity = getMActivity();
            Intrinsics.checkNotNull(mActivity);
            refundDesc = mActivity.getString(o0j.W1);
        }
        showRefundDialog(refundDesc);
    }

    public final void retry() {
        OrderData.OrderRecordDetail orderRecordDetail = this.orderDetail;
        if (orderRecordDetail == null) {
            return;
        }
        Intrinsics.checkNotNull(orderRecordDetail);
        if (orderRecordDetail.isCanRetry()) {
            CardWrapper cardWrapper = getCardWrapper();
            Intrinsics.checkNotNull(cardWrapper);
            String issueStatusDesc = cardWrapper.getIssueStatusDesc();
            CardWrapper cardWrapper2 = getCardWrapper();
            Intrinsics.checkNotNull(cardWrapper2);
            int issueStatus = cardWrapper2.getIssueStatus();
            ToastUtil.showShortToast(issueStatusDesc);
            if (issueStatus == 4) {
                CardWrapper cardWrapper3 = getCardWrapper();
                Intrinsics.checkNotNull(cardWrapper3);
                if (!cardWrapper3.isIssued()) {
                    return;
                }
            }
            CardWrapper cardWrapper4 = getCardWrapper();
            Intrinsics.checkNotNull(cardWrapper4);
            ToastUtil.showShortToast(cardWrapper4.getRechargeStatusDesc());
            CardWrapper cardWrapper5 = getCardWrapper();
            Intrinsics.checkNotNull(cardWrapper5);
            if (cardWrapper5.getRechargeStatus() == 4) {
                return;
            }
            if (this.isFromIssue) {
                issue();
            } else {
                handleOrder();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(@Nullable Bundle args) {
        super.setArguments(args);
        if (args != null) {
            this.errorMsg = args.getString(ERROR_MSG_KEY);
            this.orderId = args.getString(sOrderId);
            this.isFromIssue = args.getBoolean(sIsFromIssue);
            this.amount = args.getInt(sAmount);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        getMBinding();
        ((nng) getMBinding()).G.setOnClickListener(new View.OnClickListener() { // from class: qo3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CardOrderDetailFragment.setListener$lambda$0(this.f31689a, view);
            }
        });
        ((nng) getMBinding()).H.setOnClickListener(new View.OnClickListener() { // from class: ro3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CardOrderDetailFragment.setListener$lambda$1(this.f32739a, view);
            }
        });
        ((nng) getMBinding()).F.setOnRightValueClickListener(new View.OnClickListener() { // from class: so3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CardOrderDetailFragment.setListener$lambda$2(this.f33831a, view);
            }
        });
        ((nng) getMBinding()).A.setOnRightValueClickListener(new View.OnClickListener() { // from class: to3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CardOrderDetailFragment.setListener$lambda$3(this.f34887a, view);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0088  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void showData(@NotNull OrderData.OrderRecordDetail orderDetailInfo) {
        String hint;
        Intrinsics.checkNotNullParameter(orderDetailInfo, "orderDetailInfo");
        ((nng) getMBinding()).J.setImageResource(orderDetailInfo.isSuccess() ? wni.t : wni.s);
        ((nng) getMBinding()).I.setText(orderDetailInfo.getStatusDesc());
        OrderData.OrderRecordDetail.OrderFlowList orderFlows = orderDetailInfo.getOrderFlows();
        hch hchVar = this.flowAdapter;
        if (hchVar != null) {
            hchVar.c(orderFlows.getList());
        }
        if (orderDetailInfo.isSuccess()) {
            ((nng) getMBinding()).K.setVisibility(0);
            if (TextUtils.isEmpty(orderDetailInfo.getHint())) {
                hint = orderDetailInfo.getHint();
            } else {
                String hint2 = orderDetailInfo.getHint();
                Intrinsics.checkNotNullExpressionValue(hint2, "getHint(...)");
                FragmentActivity mActivity = getMActivity();
                Intrinsics.checkNotNull(mActivity);
                String string = mActivity.getString(o0j.p5);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                if (StringsKt__StringsKt.contains$default((CharSequence) hint2, (CharSequence) string, false, 2, (Object) null)) {
                    FragmentActivity mActivity2 = getMActivity();
                    Intrinsics.checkNotNull(mActivity2);
                    hint = mActivity2.getString(o0j.W5);
                } else {
                    hint = orderDetailInfo.getHint();
                }
            }
            ((nng) getMBinding()).K.setText(hint);
            ((nng) getMBinding()).H.setVisibility(8);
            ((nng) getMBinding()).G.setVisibility(8);
        } else {
            if (!TextUtils.isEmpty(((nng) getMBinding()).I.getText().toString())) {
                ((nng) getMBinding()).I.append("\n");
            }
            if (!TextUtils.isEmpty(this.errorMsg)) {
                ((nng) getMBinding()).I.append(this.errorMsg + "\n");
            }
            TextView textView = ((nng) getMBinding()).I;
            FragmentActivity mActivity3 = getMActivity();
            Intrinsics.checkNotNull(mActivity3);
            textView.append(mActivity3.getString(o0j.n5));
            ((nng) getMBinding()).K.setVisibility(8);
            ((nng) getMBinding()).G.setVisibility(orderDetailInfo.isCanRefund() ? 0 : 8);
            ((nng) getMBinding()).H.setVisibility(orderDetailInfo.isCanRetry() ? 0 : 8);
        }
        showOrderIdInfo();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showRefundDialog(@Nullable String desc) {
        CardOrderDetailViewModel cardOrderDetailViewModel = (CardOrderDetailViewModel) getMViewModel();
        OrderData.OrderRecordDetail orderRecordDetail = this.orderDetail;
        Intrinsics.checkNotNull(orderRecordDetail);
        cardOrderDetailViewModel.refound(orderRecordDetail, new Function1() { // from class: yo3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardOrderDetailFragment.showRefundDialog$lambda$8(this.f40365a, (RefundInfo) obj);
            }
        }, new Function1() { // from class: zo3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardOrderDetailFragment.showRefundDialog$lambda$9((String) obj);
            }
        });
    }
}
