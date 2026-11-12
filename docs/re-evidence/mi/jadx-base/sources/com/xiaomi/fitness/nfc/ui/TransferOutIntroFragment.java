package com.xiaomi.fitness.nfc.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.baseui.extension.BaseFragmentExtKt;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.bean.result.ResultInfo;
import com.xiaomi.fitness.nfc.bean.result.ShiftOutFailResultState;
import com.xiaomi.fitness.nfc.bean.result.ShiftOutSuccessResultState;
import com.xiaomi.fitness.nfc.ui.TransferOutIntroFragment;
import com.xiaomi.fitness.nfc.utils.UtilsKt;
import com.xiaomi.fitness.nfc.widget.DeviceImageView;
import defpackage.dqg;
import defpackage.ltg;
import defpackage.o0j;
import defpackage.o63;
import defpackage.pli;
import defpackage.rji;
import defpackage.sui;
import defpackage.vqg;
import defpackage.wni;
import defpackage.yl3;
import defpackage.zl3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001)B\u0007¢\u0006\u0004\b(\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0006J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0006J\r\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u0006J\r\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u0006J)\u0010 \u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/TransferOutIntroFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/TransferOutViewModel;", "Ldqg;", "", "transferOut", "()V", "", "isSuccess", "", "msg", "Lcom/xiaomi/fitness/nfc/bean/result/ResultInfo;", "buildResultInfo", "(ZLjava/lang/String;)Lcom/xiaomi/fitness/nfc/bean/result/ResultInfo;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "onBackPressed", "()Z", "updateIntro", "showProgressView", "hidewProgressView", "updateProgressInfo", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "isTransfering", "Z", "<init>", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TransferOutIntroFragment extends BaseCardFragment<TransferOutViewModel, dqg> {
    public static final float HUAMI_PROGRESS_SCALE = 0.5f;

    @NotNull
    public static final String KEY_AUTO_RETRY = "key_auto_retry";
    private boolean isTransfering;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int sRequestCodeResult = 10;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/TransferOutIntroFragment$Companion;", "", "<init>", "()V", "HUAMI_PROGRESS_SCALE", "", "sRequestCodeResult", "", "getSRequestCodeResult", "()I", "KEY_AUTO_RETRY", "", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getSRequestCodeResult() {
            return TransferOutIntroFragment.sRequestCodeResult;
        }
    }

    public TransferOutIntroFragment() {
        super(sui.h0, 0, true);
    }

    private final ResultInfo buildResultInfo(boolean isSuccess, String msg) {
        ResultInfo resultInfoBuild;
        if (isSuccess) {
            resultInfoBuild = new ResultInfo.Builder(ShiftOutSuccessResultState.class.getName()).setResultIconRes(wni.l).setContentStrRes(o0j.D5).setContentColorRes(rji.f32615k).setContentDetail(getString(o0j.E5)).setOpBtnTextStrRes(o0j.k2).setTitle(getString(o0j.W4)).setBtnResLayoutId(sui.K0).build();
        } else {
            ResultInfo.Builder contentColorRes = new ResultInfo.Builder(ShiftOutFailResultState.class.getName()).setResultIconRes(wni.f38163k).setContentStrRes(o0j.C5).setContentColorRes(rji.n);
            if (TextUtils.isEmpty(msg)) {
                msg = getString(o0j.t5);
            }
            resultInfoBuild = contentColorRes.setContentDetail(msg).setOpBtnTextStrRes(o0j.z2).setTitle(getString(o0j.W4)).setBtnResLayoutId(sui.H0).build();
        }
        Intrinsics.checkNotNull(resultInfoBuild);
        return resultInfoBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$3(final TransferOutIntroFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CardWrapper cardWrapper = this$0.getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        if (cardWrapper.isOwner) {
            String string = this$0.getString(o0j.W6);
            String string2 = this$0.getString(o0j.V6, AccountManagerExtKt.getInstance(AccountManager.INSTANCE).getUserId());
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            int i = o0j.l2;
            FragmentManager parentFragmentManager = this$0.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            UtilsKt.showMsgDialog((80 & 1) != 0 ? null : string, string2, i, parentFragmentManager, (80 & 16) != 0 ? -1 : o0j.common_cancel, (Function1<? super DialogInterface, Unit>) ((80 & 32) != 0 ? null : new Function1() { // from class: kxp
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TransferOutIntroFragment.setListener$lambda$3$lambda$2(this.f24403a, (DialogInterface) obj);
                }
            }), (Function1<? super DialogInterface, Unit>) ((80 & 64) != 0 ? null : null));
            return;
        }
        String string3 = this$0.getString(o0j.N6);
        String string4 = this$0.getString(o0j.M6);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        String string5 = this$0.getString(o0j.n2, 5);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        FragmentManager parentFragmentManager2 = this$0.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager2, "getParentFragmentManager(...)");
        UtilsKt.showCountDownDialog((64 & 1) != 0 ? null : string3, string4, string5, parentFragmentManager2, (64 & 16) != 0 ? null : this$0.getString(o0j.common_cancel), (64 & 32) != 0 ? null : new Function1() { // from class: jxp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TransferOutIntroFragment.setListener$lambda$3$lambda$1(this.f23228a, (DialogInterface) obj);
            }
        }, (64 & 64) != 0 ? null : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$3$lambda$1(TransferOutIntroFragment this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.transferOut();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$3$lambda$2(TransferOutIntroFragment this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.transferOut();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void transferOut() {
        updateProgressInfo();
        showProgressView();
        hideBack();
        this.isTransfering = true;
        TransferOutViewModel transferOutViewModel = (TransferOutViewModel) getMViewModel();
        CardWrapper cardWrapper = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        transferOutViewModel.transferOut(cardWrapper, new Function0() { // from class: hxp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferOutIntroFragment.transferOut$lambda$4(this.f20582a);
            }
        }, new Function1() { // from class: ixp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TransferOutIntroFragment.transferOut$lambda$6(this.f22205a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit transferOut$lambda$4(TransferOutIntroFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isTransfering = false;
        this$0.showBack();
        this$0.hidewProgressView();
        ToastUtil.showShortToast(o0j.D5);
        zl3.g().e.remove(this$0.getCardWrapper());
        CardWrapper cardWrapper = this$0.getCardWrapper();
        if (cardWrapper != null) {
            cardWrapper.mHasIssue = false;
        }
        zl3.g().r();
        ltg.c().r(this$0.getCardWrapper());
        o63.b(new yl3(this$0.getCardWrapper(), false));
        Bundle bundle = new Bundle();
        bundle.putParcelable(IssueResultFragment.RESULT_INFO, this$0.buildResultInfo(true, null));
        this$0.gotoPageForResult(IssueResultFragment.class, bundle, sRequestCodeResult);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit transferOut$lambda$6(final TransferOutIntroFragment this$0, String msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this$0.isTransfering = false;
        IActionBar.DefaultImpls.setStartView$default(this$0, 0, wni.f38162b, null, new View.OnClickListener() { // from class: gxp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferOutIntroFragment.transferOut$lambda$6$lambda$5(this.f19446a, view);
            }
        }, 5, null);
        this$0.hidewProgressView();
        this$0.updateIntro();
        ToastUtil.showLongToast(msg);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void transferOut$lambda$6$lambda$5(TransferOutIntroFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void hidewProgressView() {
        ((dqg) getMBinding()).C.setVisibility(0);
        if (((dqg) getMBinding()).B.getVisibility() != 0) {
            ((dqg) getMBinding()).B.setVisibility(0);
        }
        if (((dqg) getMBinding()).K.getVisibility() == 0) {
            ((dqg) getMBinding()).K.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == sRequestCodeResult) {
            if (-1 == resultCode) {
                FragmentActivity mActivity = getMActivity();
                if (mActivity != null) {
                    mActivity.setResult(-1);
                }
                finish();
                return;
            }
            if (1 != resultCode) {
                finish();
            } else if (data == null || !data.getBooleanExtra(KEY_AUTO_RETRY, false)) {
                updateIntro();
            } else {
                updateProgressInfo();
                ((dqg) getMBinding()).A.performClick();
            }
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        vqg.b("onBackPressed:" + this.isTransfering);
        if (this.isTransfering) {
            return true;
        }
        return super.onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int dimensionPixelSize = AppUtil.getApp().getResources().getDimensionPixelSize(pli.n);
        ((dqg) getMBinding()).G.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        if (SettingsPropertiesUtil.INSTANCE.isFolded(AppUtil.getApp())) {
            ViewGroup.LayoutParams layoutParams = ((dqg) getMBinding()).A.getLayoutParams();
            layoutParams.width = -1;
            ((dqg) getMBinding()).A.setLayoutParams(layoutParams);
        } else {
            ViewGroup.LayoutParams layoutParams2 = ((dqg) getMBinding()).A.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
            layoutParams3.width = BaseFragmentExtKt.getDimensionPixelOffset(this, pli.common_btn_single_line_width);
            layoutParams3.addRule(14);
            ((dqg) getMBinding()).A.setLayoutParams(layoutParams3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(o0j.W4);
        DeviceImageView deviceImageView = ((dqg) getMBinding()).E;
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        deviceImageView.show((WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel());
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
                ((dqg) getMBinding()).K.setScaleX(0.5f);
                ((dqg) getMBinding()).K.setScaleY(0.5f);
            }
            ((dqg) getMBinding()).C.show(wearableDeviceModel, getCardWrapper());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((dqg) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: lxp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferOutIntroFragment.setListener$lambda$3(this.f25533a, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showProgressView() {
        ((dqg) getMBinding()).C.setVisibility(8);
        if (((dqg) getMBinding()).B.getVisibility() == 0) {
            ((dqg) getMBinding()).B.setVisibility(8);
        }
        if (((dqg) getMBinding()).K.getVisibility() != 0) {
            ((dqg) getMBinding()).K.setVisibility(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void updateIntro() {
        ((dqg) getMBinding()).F.setVisibility(8);
        ((dqg) getMBinding()).M.setText(o0j.Y4);
        ((dqg) getMBinding()).D.setText(o0j.V4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void updateProgressInfo() {
        ((dqg) getMBinding()).M.setText(o0j.X4);
        ((dqg) getMBinding()).D.setText(o0j.r2);
        String string = getString(o0j.g3);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String str = string + string;
        ((dqg) getMBinding()).F.setText(string);
        ((dqg) getMBinding()).F.setVisibility(0);
        TransferOutViewModel transferOutViewModel = (TransferOutViewModel) getMViewModel();
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        TextView dotView = ((dqg) getMBinding()).F;
        Intrinsics.checkNotNullExpressionValue(dotView, "dotView");
        transferOutViewModel.issuerLoading(mActivity, string, str, string + str, dotView);
    }
}
