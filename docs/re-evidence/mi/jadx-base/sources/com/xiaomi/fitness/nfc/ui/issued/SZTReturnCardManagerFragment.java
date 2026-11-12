package com.xiaomi.fitness.nfc.ui.issued;

import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.miui.tsmclient.sesdk.ServiceFeeRefundInfo;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.issued.SZTReturnCardManagerFragment;
import com.xiaomi.fitness.nfc.utils.NfcExtention;
import com.xiaomi.fitness.nfc.utils.UtilsKt;
import defpackage.jtk;
import defpackage.ltg;
import defpackage.o0j;
import defpackage.o63;
import defpackage.pli;
import defpackage.sui;
import defpackage.xpg;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\bJ\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/SZTReturnCardManagerFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/issued/SZTReturnCardViewModel;", "Lxpg;", "", "bindView", "(Lxpg;)V", "setListener", "()V", "", "msg", "showReturnError", "(Ljava/lang/String;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "<init>", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SZTReturnCardManagerFragment extends BaseCardFragment<SZTReturnCardViewModel, xpg> {
    public SZTReturnCardManagerFragment() {
        super(sui.e0, 0, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$3(final SZTReturnCardManagerFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showLoading(o0j.f6, false);
        SZTReturnCardViewModel sZTReturnCardViewModel = (SZTReturnCardViewModel) this$0.getMViewModel();
        CardWrapper cardWrapper = this$0.getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        sZTReturnCardViewModel.returnServiceFeeSZT(cardWrapper, new Function1() { // from class: i8l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SZTReturnCardManagerFragment.setListener$lambda$3$lambda$1(this.f20886a, (String) obj);
            }
        }, new Function1() { // from class: j8l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SZTReturnCardManagerFragment.setListener$lambda$3$lambda$2(this.f22530a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$3$lambda$1(SZTReturnCardManagerFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.dismissDialog();
        Bundle bundle = new Bundle();
        bundle.putString(ReturnSZTCodeFragment.sReturnCode, it);
        this$0.gotoPage(ReturnSZTCodeFragment.class, bundle);
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$3$lambda$2(SZTReturnCardManagerFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.dismissDialog();
        ToastUtil.showShortToast(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$8(final SZTReturnCardManagerFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = o0j.e6;
        int i2 = o0j.d6;
        int i3 = o0j.B2;
        FragmentManager childFragmentManager = this$0.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        UtilsKt.showMsgDialog(i, i2, i3, childFragmentManager, o0j.j2, (Function1<? super DialogInterface, Unit>) new Function1() { // from class: d8l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SZTReturnCardManagerFragment.setListener$lambda$8$lambda$6(this.f15219a, (DialogInterface) obj);
            }
        }, (Function1<? super DialogInterface, Unit>) new Function1() { // from class: e8l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SZTReturnCardManagerFragment.setListener$lambda$8$lambda$7((DialogInterface) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$8$lambda$6(final SZTReturnCardManagerFragment this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        PageState.DefaultImpls.showLoading$default(this$0, o0j.h6, false, 2, null);
        SZTReturnCardViewModel sZTReturnCardViewModel = (SZTReturnCardViewModel) this$0.getMViewModel();
        CardWrapper cardWrapper = this$0.getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        sZTReturnCardViewModel.returnCard(cardWrapper, new Function1() { // from class: k8l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SZTReturnCardManagerFragment.setListener$lambda$8$lambda$6$lambda$4(this.f23598a, (ServiceFeeRefundInfo) obj);
            }
        }, new Function1() { // from class: l8l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SZTReturnCardManagerFragment.setListener$lambda$8$lambda$6$lambda$5(this.f24783a, (Throwable) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$8$lambda$6$lambda$4(SZTReturnCardManagerFragment this$0, ServiceFeeRefundInfo retInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(retInfo, "retInfo");
        this$0.dismissDialog();
        ltg.c().r(this$0.getCardWrapper());
        if (retInfo.getStatus() == 0 || retInfo.getStatus() == 1) {
            ToastUtil.showShortToast("退卡成功");
            o63.b(new jtk());
            Bundle bundle = new Bundle();
            bundle.putString(ReturnSZTCodeFragment.sReturnCode, retInfo.getReturnCardTicket());
            this$0.gotoPage(ReturnSZTCodeFragment.class, bundle);
            this$0.finish();
        } else {
            String returnCardTicket = retInfo.getReturnCardTicket();
            Intrinsics.checkNotNullExpressionValue(returnCardTicket, "getReturnCardTicket(...)");
            this$0.showReturnError(returnCardTicket);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$8$lambda$6$lambda$5(SZTReturnCardManagerFragment this$0, Throwable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.dismissDialog();
        this$0.showReturnError(NfcExtention.getErrorMsg(it));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$8$lambda$7(DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showReturnError$lambda$9(DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull xpg xpgVar) {
        Intrinsics.checkNotNullParameter(xpgVar, "<this>");
        setTitle(o0j.k6);
        CardWrapper cardWrapper = getCardWrapper();
        if (cardWrapper != null) {
            if (cardWrapper.isSupportServiceFeeRefund()) {
                ((xpg) getMBinding()).G.setVisibility(0);
                ((xpg) getMBinding()).F.setVisibility(0);
                ((xpg) getMBinding()).D.setVisibility(0);
            } else {
                ((xpg) getMBinding()).G.setVisibility(8);
                ((xpg) getMBinding()).F.setVisibility(8);
                ((xpg) getMBinding()).D.setVisibility(8);
            }
            if (cardWrapper.mSeCard.isSupportReturnCard()) {
                xpgVar.C.setVisibility(0);
                xpgVar.B.setVisibility(0);
                xpgVar.E.setVisibility(0);
            } else {
                xpgVar.C.setVisibility(8);
                xpgVar.B.setVisibility(8);
                xpgVar.E.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int dimensionPixelSize = AppUtil.getApp().getResources().getDimensionPixelSize(pli.e);
        ((xpg) getMBinding()).A.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((xpg) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: f8l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SZTReturnCardManagerFragment.setListener$lambda$3(this.f17534a, view);
            }
        });
        ((xpg) getMBinding()).E.setOnClickListener(new View.OnClickListener() { // from class: g8l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SZTReturnCardManagerFragment.setListener$lambda$8(this.f18727a, view);
            }
        });
    }

    public final void showReturnError(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        String string = getString(o0j.p2);
        int i = o0j.u2;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        UtilsKt.showMsgDialog((80 & 1) != 0 ? null : string, msg, i, childFragmentManager, (80 & 16) != 0 ? -1 : 0, (Function1<? super DialogInterface, Unit>) ((80 & 32) != 0 ? null : new Function1() { // from class: h8l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SZTReturnCardManagerFragment.showReturnError$lambda$9((DialogInterface) obj);
            }
        }), (Function1<? super DialogInterface, Unit>) ((80 & 64) != 0 ? null : null));
    }
}
