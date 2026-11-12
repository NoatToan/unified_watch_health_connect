package com.xiaomi.fitness.nfc.ui;

import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.alipay.sdk.app.PayTask;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.ShareConfigs;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.bean.PayResult;
import com.xiaomi.fitness.nfc.ui.NewPayFragment;
import com.xiaomi.fitness.nfc.utils.UtilsKt;
import defpackage.fpg;
import defpackage.k3r;
import defpackage.o0j;
import defpackage.pli;
import defpackage.sui;
import defpackage.vqg;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002\u001e\u001fB\u0007¢\u0006\u0004\b\u001d\u0010\u0010J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0007J\u0019\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0018\u0010\u0010J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/NewPayFragment;", "Lcom/xiaomi/fitness/nfc/ui/BaseRechargeFragment;", "Lcom/xiaomi/fitness/nfc/ui/NewPayViewModel;", "Lfpg;", "Landroid/view/View$OnClickListener;", "", "isWeiXinAppInstall", "()Z", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "()V", "onClick", "(Landroid/view/View;)V", "isUseAlipayChanel", "Landroid/os/Message;", "msg", "xhandleMessage", "(Landroid/os/Message;)V", "doPay", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "<init>", "Companion", "AlipayRunable", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class NewPayFragment extends BaseRechargeFragment<NewPayViewModel, fpg> implements View.OnClickListener {
    public static final int RQUEST_CODE_NEWPAY_FRAGMENT = 222222;
    public static final int sHandlerAlipay = 100;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/NewPayFragment$AlipayRunable;", "Ljava/lang/Runnable;", TSMAuthContants.PARAM_ORDER_INFO, "", "what", "", "<init>", "(Lcom/xiaomi/fitness/nfc/ui/NewPayFragment;Ljava/lang/String;I)V", "run", "", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class AlipayRunable implements Runnable {

        @NotNull
        private final String orderInfo;
        final /* synthetic */ NewPayFragment this$0;
        private final int what;

        public AlipayRunable(@NotNull NewPayFragment newPayFragment, String orderInfo, int i) {
            Intrinsics.checkNotNullParameter(orderInfo, "orderInfo");
            this.this$0 = newPayFragment;
            this.orderInfo = orderInfo;
            this.what = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            Map<String, String> mapPayV2 = new PayTask(this.this$0.getMActivity()).payV2(this.orderInfo, true);
            Intrinsics.checkNotNullExpressionValue(mapPayV2, "payV2(...)");
            Message messageObtain = Message.obtain();
            messageObtain.what = this.what;
            messageObtain.obj = mapPayV2;
            Handler mHandler = this.this$0.getMHandler();
            if (mHandler != null) {
                mHandler.sendMessage(messageObtain);
            }
        }
    }

    public NewPayFragment() {
        super(sui.U, 0, true);
    }

    private final boolean isWeiXinAppInstall() {
        return k3r.b(ShareConfigs.appID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onClick$lambda$0(NewPayFragment this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMPaySelector().f37087a = 2;
        if (((fpg) this$0.getMBinding()).A.isSelected()) {
            this$0.doCreateOrder("alipay");
        } else if (((fpg) this$0.getMBinding()).L.isSelected()) {
            this$0.doCreateOrder("wechat_pay");
        } else {
            this$0.doCreateOrder("ucashier");
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.nfc.ui.BaseRechargeFragment
    public void doPay() {
        getMPaySelector().f37087a = 2;
        CardWrapper cardWrapper = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        String payString = cardWrapper.mOrderInfo.getPayString();
        vqg.d("getPayString = " + payString);
        if (((fpg) getMBinding()).A.isSelected()) {
            try {
                Intrinsics.checkNotNull(payString);
                new Thread(new AlipayRunable(this, payString, 100)).start();
                return;
            } catch (Exception e) {
                vqg.c("NewPayFragment alipay", e);
                ToastUtil.INSTANCE.showToast(o0j.o4);
                return;
            }
        }
        if (!((fpg) getMBinding()).L.isSelected()) {
            super.doPay();
            return;
        }
        if (!isWeiXinAppInstall()) {
            ToastUtil.INSTANCE.showToast(o0j.O6);
            return;
        }
        try {
            k3r.a(new JSONObject(payString));
        } catch (Exception e2) {
            vqg.c("NewPayFragment wechat", e2);
            ToastUtil.INSTANCE.showToast(o0j.o4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.nfc.ui.BaseRechargeFragment
    public boolean isUseAlipayChanel() {
        return ((fpg) getMBinding()).A.isSelected();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View view) {
        if (Intrinsics.areEqual(view, ((fpg) getMBinding()).B)) {
            ((fpg) getMBinding()).A.setSelected(true);
            ((fpg) getMBinding()).L.setSelected(false);
            ((fpg) getMBinding()).J.setSelected(false);
            return;
        }
        if (Intrinsics.areEqual(view, ((fpg) getMBinding()).I)) {
            ((fpg) getMBinding()).A.setSelected(false);
            ((fpg) getMBinding()).L.setSelected(true);
            ((fpg) getMBinding()).J.setSelected(false);
        } else if (Intrinsics.areEqual(view, ((fpg) getMBinding()).K)) {
            ((fpg) getMBinding()).A.setSelected(false);
            ((fpg) getMBinding()).L.setSelected(false);
            ((fpg) getMBinding()).J.setSelected(true);
        } else if (Intrinsics.areEqual(view, ((fpg) getMBinding()).H)) {
            String string = getString(o0j.s5);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            int i = o0j.common_known;
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            UtilsKt.showMsgDialog((80 & 1) != 0 ? null : null, string, i, parentFragmentManager, (80 & 16) != 0 ? -1 : 0, (Function1<? super DialogInterface, Unit>) ((80 & 32) != 0 ? null : new Function1() { // from class: glg
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return NewPayFragment.onClick$lambda$0(this.f19105a, (DialogInterface) obj);
                }
            }), (Function1<? super DialogInterface, Unit>) ((80 & 64) != 0 ? null : null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int dimensionPixelSize = AppUtil.getApp().getResources().getDimensionPixelSize(pli.e);
        ((fpg) getMBinding()).D.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(o0j.K4);
        CardWrapper cardWrapper = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        if (cardWrapper.selectedFee == null) {
            ToastUtil.INSTANCE.showToast(o0j.o5);
            finish();
            return;
        }
        CardWrapper cardWrapper2 = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper2);
        float totalPay = cardWrapper2.selectedFee.getTotalPay() / 100.0f;
        ((fpg) getMBinding()).C.setText(getString(o0j.O1, Float.valueOf(totalPay)));
        CardWrapper cardWrapper3 = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper3);
        float rechargeFee = cardWrapper3.selectedFee.getRechargeFee() / 100.0f;
        TextView textView = ((fpg) getMBinding()).F;
        int i = o0j.L4;
        CardWrapper cardWrapper4 = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper4);
        textView.setText(getString(i, cardWrapper4.mSeCard.getName(), Float.valueOf(totalPay), Float.valueOf(rechargeFee)));
        LinearLayout linearLayout = ((fpg) getMBinding()).B;
        CardWrapper cardWrapper5 = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper5);
        linearLayout.setVisibility(cardWrapper5.isSupportAlipay() ? 0 : 8);
        LinearLayout linearLayout2 = ((fpg) getMBinding()).I;
        CardWrapper cardWrapper6 = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper6);
        linearLayout2.setVisibility(cardWrapper6.isSupportWechat() ? 0 : 8);
        LinearLayout linearLayout3 = ((fpg) getMBinding()).K;
        CardWrapper cardWrapper7 = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper7);
        linearLayout3.setVisibility(cardWrapper7.isSupportUcashier() ? 0 : 8);
        CardWrapper cardWrapper8 = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper8);
        if (cardWrapper8.isSupportAlipay()) {
            ((fpg) getMBinding()).A.setSelected(true);
            return;
        }
        CardWrapper cardWrapper9 = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper9);
        if (cardWrapper9.isSupportWechat()) {
            ((fpg) getMBinding()).L.setSelected(true);
        } else {
            ((fpg) getMBinding()).K.setSelected(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((fpg) getMBinding()).B.setOnClickListener(this);
        ((fpg) getMBinding()).I.setOnClickListener(this);
        ((fpg) getMBinding()).K.setOnClickListener(this);
        ((fpg) getMBinding()).H.setOnClickListener(this);
    }

    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public void xhandleMessage(@Nullable Message msg) {
        super.xhandleMessage(msg);
        Intrinsics.checkNotNull(msg);
        if (msg.what != 100) {
            super.xhandleMessage(msg);
            return;
        }
        getMPaySelector().f37087a = 3;
        Object obj = msg.obj;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String?, kotlin.String?>");
        String resultStatus = new PayResult((Map) obj).getResultStatus();
        Intrinsics.checkNotNullExpressionValue(resultStatus, "getResultStatus(...)");
        vqg.d("alipay pay resultStatus:" + resultStatus);
        queryOrderStatus();
    }
}
