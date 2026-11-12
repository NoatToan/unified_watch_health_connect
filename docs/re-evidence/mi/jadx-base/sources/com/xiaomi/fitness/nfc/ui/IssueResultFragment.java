package com.xiaomi.fitness.nfc.ui;

import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fitness.baseui.extension.BaseFragmentExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.result.ResultInfo;
import com.xiaomi.fitness.nfc.bean.result.ResultStateContext;
import com.xiaomi.fitness.nfc.bean.result.ResultStateFactory;
import com.xiaomi.fitness.nfc.ui.IssueResultFragment;
import com.xiaomi.fitness.nfc.utils.UtilsKt;
import defpackage.mri;
import defpackage.o0j;
import defpackage.pli;
import defpackage.sui;
import defpackage.vog;
import defpackage.vqg;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/IssueResultFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/CardListViewModel;", "Lvog;", "", "beforeFinish", "()V", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "setArguments", "(Landroid/os/Bundle;)V", "", "isNeedCardInfo", "()Z", "bindView", "(Lvog;)V", "onBackPressed", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lcom/xiaomi/fitness/nfc/bean/result/ResultInfo;", "mResultInfo", "Lcom/xiaomi/fitness/nfc/bean/result/ResultInfo;", "isMaster", "Z", "isOtherApp", "Landroid/widget/TextView;", "footerOpBtnView", "Landroid/widget/TextView;", "footerCancleView", "<init>", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nIssueResultFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IssueResultFragment.kt\ncom/xiaomi/fitness/nfc/ui/IssueResultFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,132:1\n256#2,2:133\n*S KotlinDebug\n*F\n+ 1 IssueResultFragment.kt\ncom/xiaomi/fitness/nfc/ui/IssueResultFragment\n*L\n76#1:133,2\n*E\n"})
public final class IssueResultFragment extends BaseCardFragment<CardListViewModel, vog> {

    @NotNull
    public static final String RESULT_INFO = "key_result_info";

    @Nullable
    private TextView footerCancleView;

    @Nullable
    private TextView footerOpBtnView;
    private boolean isMaster;
    private boolean isOtherApp;

    @Nullable
    private ResultInfo mResultInfo;

    public IssueResultFragment() {
        super(sui.P, 0, true);
    }

    private final void beforeFinish() {
        if (this.isMaster) {
            String string = getString(o0j.n4);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            int i = o0j.l2;
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            UtilsKt.showMsgDialog((80 & 1) != 0 ? null : null, string, i, childFragmentManager, (80 & 16) != 0 ? -1 : o0j.common_cancel, (Function1<? super DialogInterface, Unit>) ((80 & 32) != 0 ? null : new Function1() { // from class: jkd
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return IssueResultFragment.beforeFinish$lambda$4(this.f22891a, (DialogInterface) obj);
                }
            }), (Function1<? super DialogInterface, Unit>) ((80 & 64) != 0 ? null : null));
            return;
        }
        if (!this.isOtherApp) {
            finish();
            return;
        }
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null) {
            MainExtKt.showMainActivity$default(mActivity, null, null, 6, null);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit beforeFinish$lambda$4(IssueResultFragment this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$3$lambda$0(IssueResultFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        vqg.d("mBinding.footerOpView onclick");
        ResultStateContext.getInstance().opTextForward(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$3$lambda$1(IssueResultFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        vqg.d("footerOpBtnView onclick:" + ResultStateContext.getInstance());
        ResultStateContext.getInstance().opBtnFroward(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$3$lambda$2(IssueResultFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        vqg.d("footerCancleView onclick");
        this$0.beforeFinish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull vog vogVar) {
        Intrinsics.checkNotNullParameter(vogVar, "<this>");
        ResultInfo resultInfo = this.mResultInfo;
        if (resultInfo != null) {
            setTitle(resultInfo.getTitle());
            View viewInflate = LayoutInflater.from(getMActivity()).inflate(resultInfo.getBtnResLayoutId(), ((vog) getMBinding()).E);
            this.footerOpBtnView = (TextView) viewInflate.findViewById(mri.L1);
            this.footerCancleView = (TextView) viewInflate.findViewById(mri.I1);
            ((vog) getMBinding()).D.show((WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel());
            ((vog) getMBinding()).I.setImageResource(resultInfo.getResultIconRes());
            ((vog) getMBinding()).C.setText(resultInfo.getContentStrRes());
            ((vog) getMBinding()).C.setTextColor(BaseFragmentExtKt.getColor(this, resultInfo.getContentColorRes()));
            ((vog) getMBinding()).B.setText(resultInfo.getContentDetail());
            if (resultInfo.isOpTextExist()) {
                ((vog) getMBinding()).F.setText(resultInfo.getOpTextStrRes());
                ((vog) getMBinding()).F.setOnClickListener(new View.OnClickListener() { // from class: gkd
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        IssueResultFragment.bindView$lambda$3$lambda$0(this.f19082a, view);
                    }
                });
            }
            TextView textView = this.footerOpBtnView;
            if (textView != null) {
                textView.setVisibility(this.isMaster ^ true ? 0 : 8);
            }
            TextView textView2 = this.footerOpBtnView;
            if (textView2 != null) {
                textView2.setText(resultInfo.getOpBtnTextStrRes());
            }
            TextView textView3 = this.footerOpBtnView;
            if (textView3 != null) {
                textView3.setOnClickListener(new View.OnClickListener() { // from class: hkd
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        IssueResultFragment.bindView$lambda$3$lambda$1(this.f20163a, view);
                    }
                });
            }
            TextView textView4 = this.footerCancleView;
            if (textView4 != null) {
                textView4.setOnClickListener(new View.OnClickListener() { // from class: ikd
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        IssueResultFragment.bindView$lambda$3$lambda$2(this.f21251a, view);
                    }
                });
            }
        }
    }

    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public boolean isNeedCardInfo() {
        return false;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        beforeFinish();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int dimensionPixelSize = AppUtil.getApp().getResources().getDimensionPixelSize(pli.n);
        ((vog) getMBinding()).H.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        UtilsKt.resetL18BtnView(this.footerOpBtnView);
        UtilsKt.resetL18BtnView(this.footerCancleView);
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(@Nullable Bundle bundle) {
        super.setArguments(bundle);
        vqg.d("bundle:" + bundle);
        if (bundle != null) {
            this.isMaster = bundle.getBoolean("sIsMaster");
            this.isOtherApp = bundle.getBoolean("sIsOtherApp");
            ResultInfo resultInfo = (ResultInfo) bundle.getParcelable(RESULT_INFO);
            this.mResultInfo = resultInfo;
            vqg.d("mResultInfo:" + resultInfo);
            ResultStateContext resultStateContext = ResultStateContext.getInstance();
            ResultInfo resultInfo2 = this.mResultInfo;
            Intrinsics.checkNotNull(resultInfo2);
            resultStateContext.setResultState(ResultStateFactory.getResultState(resultInfo2.getOpStateClazz()));
        }
    }
}
