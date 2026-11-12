package com.xiaomi.fitness.nfc.ui.issued;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.result.ResultInfo;
import com.xiaomi.fitness.nfc.bean.yoyo.CommandRequest;
import com.xiaomi.fitness.nfc.ui.IssueResultFragment;
import com.xiaomi.fitness.nfc.ui.issued.YoYoIssueFragment;
import com.xiaomi.fitness.nfc.utils.NfcUtils;
import com.xiaomi.fitness.nfc.utils.PageUtilsKt;
import defpackage.o0j;
import defpackage.p0s;
import defpackage.q0s;
import defpackage.rji;
import defpackage.rqg;
import defpackage.sui;
import defpackage.uxi;
import defpackage.wni;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001$B\u0007¢\u0006\u0004\b#\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0013J)\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/YoYoIssueFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/issued/YoYoCardViewModel;", "Lrqg;", "", "openCard", "()V", "", "detail", "Lcom/xiaomi/fitness/nfc/bean/result/ResultInfo;", "buildFailResultInfo", "(Ljava/lang/String;)Lcom/xiaomi/fitness/nfc/bean/result/ResultInfo;", "buildSuccessResultInfo", "Landroid/os/Bundle;", "args", "setArguments", "(Landroid/os/Bundle;)V", "", "isNeedCardInfo", "()Z", "bindView", "(Lrqg;)V", "onBackPressed", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Lcom/xiaomi/fitness/nfc/bean/yoyo/CommandRequest;", "commandRequest", "Lcom/xiaomi/fitness/nfc/bean/yoyo/CommandRequest;", "cardFace", "Ljava/lang/String;", "<init>", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nYoYoIssueFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YoYoIssueFragment.kt\ncom/xiaomi/fitness/nfc/ui/issued/YoYoIssueFragment\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,157:1\n54#2,3:158\n24#2:161\n59#2,6:162\n*S KotlinDebug\n*F\n+ 1 YoYoIssueFragment.kt\ncom/xiaomi/fitness/nfc/ui/issued/YoYoIssueFragment\n*L\n77#1:158,3\n77#1:161\n77#1:162,6\n*E\n"})
public final class YoYoIssueFragment extends BaseCardFragment<YoYoCardViewModel, rqg> {

    @NotNull
    public static final String sCommandRequest = "sCommandRequest";
    public static final int sRequestCodeResult = 10;

    @NotNull
    private String cardFace;
    private CommandRequest commandRequest;

    public YoYoIssueFragment() {
        super(sui.o0, 0, true);
        this.cardFace = "";
    }

    private final ResultInfo buildFailResultInfo(String detail) {
        ResultInfo.Builder contentColorRes = new ResultInfo.Builder(p0s.class.getName()).setTitle(getString(o0j.E7)).setResultIconRes(wni.f38163k).setContentStrRes(o0j.n1).setContentColorRes(rji.n);
        if (TextUtils.isEmpty(detail)) {
            detail = getString(o0j.t5);
        }
        return contentColorRes.setContentDetail(detail).setBtnResLayoutId(sui.L0).setOpBtnTextStrRes(o0j.common_retry).build();
    }

    public static /* synthetic */ ResultInfo buildFailResultInfo$default(YoYoIssueFragment yoYoIssueFragment, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return yoYoIssueFragment.buildFailResultInfo(str);
    }

    private final ResultInfo buildSuccessResultInfo(String detail) {
        return new ResultInfo.Builder(q0s.class.getName()).setTitle(getString(o0j.E7)).setResultIconRes(wni.l).setContentStrRes(o0j.w5).setContentColorRes(rji.f32615k).setContentDetail(getString(o0j.v5)).setOpTextStrRes(o0j.x5).setOpBtnTextStrRes(o0j.k2).setBtnResLayoutId(sui.H0).build();
    }

    public static /* synthetic */ ResultInfo buildSuccessResultInfo$default(YoYoIssueFragment yoYoIssueFragment, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return yoYoIssueFragment.buildSuccessResultInfo(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void openCard() {
        YoYoCardViewModel yoYoCardViewModel = (YoYoCardViewModel) getMViewModel();
        CommandRequest commandRequest = this.commandRequest;
        if (commandRequest == null) {
            Intrinsics.throwUninitializedPropertyAccessException("commandRequest");
            commandRequest = null;
        }
        yoYoCardViewModel.issue(commandRequest, new Function0() { // from class: c0s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return YoYoIssueFragment.openCard$lambda$3(this.f4811a);
            }
        }, new Function0() { // from class: d0s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return YoYoIssueFragment.openCard$lambda$4(this.f14940a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openCard$lambda$3(YoYoIssueFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ResultInfo resultInfoBuildSuccessResultInfo$default = buildSuccessResultInfo$default(this$0, null, 1, null);
        Bundle bundle = new Bundle();
        bundle.putParcelable(IssueResultFragment.RESULT_INFO, resultInfoBuildSuccessResultInfo$default);
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        PageUtilsKt.gotoPageForResult(fragmentActivityRequireActivity, IssueResultFragment.class, bundle, 10);
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            mActivity.setResult(-1);
        }
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openCard$lambda$4(YoYoIssueFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ResultInfo resultInfoBuildFailResultInfo$default = buildFailResultInfo$default(this$0, null, 1, null);
        Bundle bundle = new Bundle();
        bundle.putParcelable(IssueResultFragment.RESULT_INFO, resultInfoBuildFailResultInfo$default);
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        PageUtilsKt.gotoPageForResult(fragmentActivityRequireActivity, IssueResultFragment.class, bundle, 10);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull rqg rqgVar) {
        Intrinsics.checkNotNullParameter(rqgVar, "<this>");
        setTitle(o0j.E7);
        hideBack();
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        ((rqg) getMBinding()).C.show(wearableDeviceModel);
        if (wearableDeviceModel != null && DeviceModelExtKt.isBandType(wearableDeviceModel)) {
            ((rqg) getMBinding()).F.setScaleX(0.5f);
            ((rqg) getMBinding()).F.setScaleY(0.5f);
        }
        ImageView cardFaceView = rqgVar.A;
        Intrinsics.checkNotNullExpressionValue(cardFaceView, "cardFaceView");
        String yoYoCardFace = NfcUtils.getYoYoCardFace(this.cardFace);
        ImageLoader imageLoader = Coil.imageLoader(cardFaceView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(cardFaceView.getContext()).data(yoYoCardFace).target(cardFaceView);
        builderTarget.placeholder(wni.n);
        imageLoader.enqueue(builderTarget.build());
        rqgVar.H.setText(getResources().getQuantityString(uxi.c, 5, 5));
        openCard();
    }

    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public boolean isNeedCardInfo() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 10) {
            if (resultCode == -1) {
                openCard();
            } else {
                finish();
            }
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(@Nullable Bundle args) {
        super.setArguments(args);
        if (args != null) {
            Parcelable parcelable = args.getParcelable(sCommandRequest);
            Intrinsics.checkNotNull(parcelable);
            this.commandRequest = (CommandRequest) parcelable;
            String string = args.getString(YoYoPreIssueFragment.sCardFace);
            Intrinsics.checkNotNull(string);
            this.cardFace = string;
        }
    }
}
