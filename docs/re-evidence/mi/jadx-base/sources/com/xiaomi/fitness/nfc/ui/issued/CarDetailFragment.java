package com.xiaomi.fitness.nfc.ui.issued;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.miui.tsmclient.sesdk.CardCategory;
import com.miui.tsmclient.sesdk.SeCardStatus;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.issued.CarDetailFragment;
import defpackage.fng;
import defpackage.ltg;
import defpackage.o0j;
import defpackage.o63;
import defpackage.pli;
import defpackage.sui;
import defpackage.yl3;
import defpackage.zl3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001d\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0011\u0010\u0006J)\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/CarDetailFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/issued/CarCardViewModel;", "Lfng;", "", "deleteSuccess", "()V", "", "show", "showValidateInfo", "(Z)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "<init>", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CarDetailFragment extends BaseCardFragment<CarCardViewModel, fng> {
    public static final int CARD_SWITCHER_MAX_COUNT = 5;

    @NotNull
    public static final String KEY_DELETE = "KEY_DELETE";

    @NotNull
    private static final String URL_USER_TIPS = "views/doorCard/commonQuestion/index.html";
    public static final int sRequestCodeRename = 10;

    public CarDetailFragment() {
        super(sui.u, 0, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ CarCardViewModel access$getMViewModel(CarDetailFragment carDetailFragment) {
        return (CarCardViewModel) carDetailFragment.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteSuccess() {
        ToastUtil.showShortToast(o0j.i3);
        Intent intent = new Intent();
        CardWrapper cardWrapper = getCardWrapper();
        if (cardWrapper != null) {
            cardWrapper.mHasIssue = false;
        }
        zl3.g().f.remove(getCardWrapper());
        zl3.g().l(getCardWrapper());
        zl3.g().p();
        ltg.c().r(getCardWrapper());
        o63.b(new yl3(getCardWrapper(), false));
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        mActivity.setResult(-1, intent);
        FragmentActivity mActivity2 = getMActivity();
        Intrinsics.checkNotNull(mActivity2);
        mActivity2.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$0(CarDetailFragment this$0, CardWrapper it) {
        String description;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.dismissDialog();
        ((fng) this$0.getMBinding()).J.setText(it.digitalKeyCardDetail.getValidFrom());
        ((fng) this$0.getMBinding()).C.setText(it.digitalKeyCardDetail.getValidTo());
        int i = 0;
        if (it.getCategory() == CardCategory.ICCOA_DIGITAL_KEY) {
            this$0.showValidateInfo(false);
            description = it.digitalKeyCardDetail.getPrivilege().getDescription();
        } else {
            this$0.showValidateInfo(true);
            description = it.digitalKeyCardDetail.getEntitlement().getDescription();
        }
        ((fng) this$0.getMBinding()).E.setText(description);
        TextView textView = ((fng) this$0.getMBinding()).K;
        SeCardStatus carStatus = it.getCarStatus();
        SeCardStatus seCardStatus = SeCardStatus.END_DATE_INVALID;
        if (carStatus != seCardStatus && it.getCarStatus() != SeCardStatus.START_DATE_INVALID) {
            i = 8;
        } else if (it.getCarStatus() == seCardStatus) {
            ((fng) this$0.getMBinding()).K.setText(o0j.E0);
        } else {
            ((fng) this$0.getMBinding()).K.setText(o0j.F0);
        }
        textView.setVisibility(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(CarDetailFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.finish();
        ToastUtil.showShortToast(o0j.o4);
        this$0.dismissDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$2(CarDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CommonDialog commonDialogCreate = new CommonDialog.c("CardRenameFragment.delete").setDialogTitle(o0j.p2).setDialogDescription(o0j.W2).setNegativeText(o0j.j2).setPositiveText(o0j.l2).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        commonDialogCreate.addDialogCallback(new CarDetailFragment$setListener$1$1(this$0));
        commonDialogCreate.showIfNeed(this$0.getChildFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showValidateInfo(boolean show) {
        RelativeLayout rlCarValidateTitle = ((fng) getMBinding()).I;
        Intrinsics.checkNotNullExpressionValue(rlCarValidateTitle, "rlCarValidateTitle");
        ExtUtilsKt.setVisible(rlCarValidateTitle, show);
        RelativeLayout rlCarValidateStart = ((fng) getMBinding()).H;
        Intrinsics.checkNotNullExpressionValue(rlCarValidateStart, "rlCarValidateStart");
        ExtUtilsKt.setVisible(rlCarValidateStart, show);
        RelativeLayout rlCarValidateEnd = ((fng) getMBinding()).G;
        Intrinsics.checkNotNullExpressionValue(rlCarValidateEnd, "rlCarValidateEnd");
        ExtUtilsKt.setVisible(rlCarValidateEnd, show);
        View viewDivider = ((fng) getMBinding()).L;
        Intrinsics.checkNotNullExpressionValue(viewDivider, "viewDivider");
        ExtUtilsKt.setVisible(viewDivider, show);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 10) {
            CardWrapper cardWrapper = getCardWrapper();
            setTitle(cardWrapper != null ? cardWrapper.mCardName : null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int dimensionPixelSize = AppUtil.getApp().getResources().getDimensionPixelSize(pli.n);
        ((fng) getMBinding()).D.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        CardWrapper cardWrapper = getCardWrapper();
        String string = null;
        if (TextUtils.isEmpty(cardWrapper != null ? cardWrapper.mCardName : null)) {
            string = getString(o0j.D0);
        } else {
            CardWrapper cardWrapper2 = getCardWrapper();
            if (cardWrapper2 != null) {
                string = cardWrapper2.mCardName;
            }
        }
        setTitle(string);
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        ((fng) getMBinding()).B.show((WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel());
        ((fng) getMBinding()).A.show((WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel(), getCardWrapper());
        showLoading();
        CarCardViewModel carCardViewModel = (CarCardViewModel) getMViewModel();
        CardWrapper cardWrapper3 = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper3);
        carCardViewModel.updateCard(cardWrapper3, new Function1() { // from class: ml3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CarDetailFragment.onViewCreated$lambda$0(this.f26974a, (CardWrapper) obj);
            }
        }, new Function1() { // from class: nl3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CarDetailFragment.onViewCreated$lambda$1(this.f28031a, (String) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((fng) getMBinding()).F.setOnClickListener(new View.OnClickListener() { // from class: ll3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CarDetailFragment.setListener$lambda$2(this.f25191a, view);
            }
        });
    }
}
