package com.xiaomi.fitness.nfc.ui.issued;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.baseui.extension.BaseFragmentExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.IssuerFragment;
import com.xiaomi.fitness.nfc.ui.TransferInViewModel;
import com.xiaomi.fitness.nfc.ui.issued.TransferInFragment;
import com.xiaomi.fitness.nfc.widget.DeviceImageView;
import defpackage.bqg;
import defpackage.o0j;
import defpackage.pli;
import defpackage.sui;
import defpackage.zl3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0018\u0010\rJ!\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/TransferInFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/TransferInViewModel;", "Lbqg;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "()V", "Landroid/widget/CompoundButton;", "p0", "", "isChecked", "onCheckedChanged", "(Landroid/widget/CompoundButton;Z)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "<init>", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TransferInFragment extends BaseCardFragment<TransferInViewModel, bqg> implements CompoundButton.OnCheckedChangeListener {
    public TransferInFragment() {
        super(sui.g0, 0, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$0(TransferInFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        zl3.g().l(this$0.getCardWrapper());
        Intent intent = new Intent();
        intent.putExtra(IssuerFragment.EXTRA_ISSUE_CARD_STATUS, this$0.getString(o0j.b2));
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            mActivity.setResult(-1, intent);
        }
        this$0.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(@Nullable CompoundButton p0, boolean isChecked) {
        ((bqg) getMBinding()).G.setEnabled(isChecked);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int dimensionPixelSize = AppUtil.getApp().getResources().getDimensionPixelSize(pli.n);
        ((bqg) getMBinding()).D.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        if (SettingsPropertiesUtil.INSTANCE.isFolded(AppUtil.getApp())) {
            ViewGroup.LayoutParams layoutParams = ((bqg) getMBinding()).G.getLayoutParams();
            layoutParams.width = -1;
            ((bqg) getMBinding()).G.setLayoutParams(layoutParams);
        } else {
            ViewGroup.LayoutParams layoutParams2 = ((bqg) getMBinding()).G.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
            layoutParams3.width = BaseFragmentExtKt.getDimensionPixelOffset(this, pli.common_btn_single_line_width);
            layoutParams3.gravity = 1;
            ((bqg) getMBinding()).G.setLayoutParams(layoutParams3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        CardWrapper cardWrapper = getCardWrapper();
        setTitle(cardWrapper != null ? cardWrapper.mCardName : null);
        ((bqg) getMBinding()).G.setEnabled(((bqg) getMBinding()).B.isChecked());
        DeviceImageView deviceImageView = ((bqg) getMBinding()).C;
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        deviceImageView.show((WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel());
        ((bqg) getMBinding()).A.show((WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel(), getCardWrapper());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((bqg) getMBinding()).B.setOnCheckedChangeListener(this);
        ((bqg) getMBinding()).G.setOnClickListener(new View.OnClickListener() { // from class: wwp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferInFragment.setListener$lambda$0(this.f38444a, view);
            }
        });
    }
}
