package com.xiaomi.fitness.nfc.ui.issued;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.issued.CarOutDetailFragment;
import defpackage.jpg;
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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0019\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\r\u0010\u0006J)\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/CarOutDetailFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/issued/CarCardViewModel;", "Ljpg;", "", "deleteSuccess", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "<init>", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CarOutDetailFragment extends BaseCardFragment<CarCardViewModel, jpg> {
    public static final int sRequestCodeRename = 10;

    public CarOutDetailFragment() {
        super(sui.W, 0, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ CarCardViewModel access$getMViewModel(CarOutDetailFragment carOutDetailFragment) {
        return (CarCardViewModel) carOutDetailFragment.getMViewModel();
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
    public static final Unit onViewCreated$lambda$0(CarOutDetailFragment this$0, CardWrapper it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.dismissDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(CarOutDetailFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.finish();
        ToastUtil.showShortToast(o0j.o4);
        this$0.dismissDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$2(CarOutDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CommonDialog commonDialogCreate = new CommonDialog.c("CardRenameFragment.delete").setDialogTitle(o0j.p2).setDialogDescription(o0j.W2).setNegativeText(o0j.j2).setPositiveText(o0j.l2).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        commonDialogCreate.addDialogCallback(new CarOutDetailFragment$setListener$1$1(this$0));
        commonDialogCreate.showIfNeed(this$0.getChildFragmentManager());
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
        ((jpg) getMBinding()).C.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
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
        ((jpg) getMBinding()).B.show((WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel());
        ((jpg) getMBinding()).A.show((WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel(), getCardWrapper());
        showLoading();
        CarCardViewModel carCardViewModel = (CarCardViewModel) getMViewModel();
        CardWrapper cardWrapper3 = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper3);
        carCardViewModel.updateCard(cardWrapper3, new Function1() { // from class: ul3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CarOutDetailFragment.onViewCreated$lambda$0(this.f35898a, (CardWrapper) obj);
            }
        }, new Function1() { // from class: vl3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CarOutDetailFragment.onViewCreated$lambda$1(this.f36994a, (String) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((jpg) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: tl3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CarOutDetailFragment.setListener$lambda$2(this.f34807a, view);
            }
        });
    }
}
