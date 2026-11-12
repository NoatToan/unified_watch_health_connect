package com.xiaomi.fitness.nfc.ui;

import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.miui.tsmclient.model.BaseResponse;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.extension.BaseFragmentExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.nfc.ui.SyncEseFragment;
import defpackage.av6;
import defpackage.fmg;
import defpackage.o0j;
import defpackage.pli;
import defpackage.sui;
import defpackage.vpg;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0006J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/SyncEseFragment;", "Lcom/xiaomi/fitness/nfc/ui/BaseRechargeFragment;", "Lcom/xiaomi/fitness/nfc/ui/SyncEseViewModel;", "Lvpg;", "", "onSync", "()V", "", "isNeedCardInfo", "()Z", "Landroid/os/Bundle;", "args", "setArguments", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "isMaster", "Z", "<init>", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SyncEseFragment extends BaseRechargeFragment<SyncEseViewModel, vpg> {
    private boolean isMaster;

    public SyncEseFragment() {
        super(sui.d0, 0, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onSync() {
        showLoading(o0j.J6, false);
        ((SyncEseViewModel) getMViewModel()).syncEse(this.isMaster, new Function1() { // from class: xso
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SyncEseFragment.onSync$lambda$1(this.f39427a, (BaseResponse) obj);
            }
        }, new Function1() { // from class: yso
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SyncEseFragment.onSync$lambda$2(this.f40499a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSync$lambda$1(SyncEseFragment this$0, BaseResponse response) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.isSuccess()) {
            ToastUtil.showShortToast(o0j.K6);
        } else {
            ToastUtil.showLongToast(TextUtils.isEmpty(response.mMsg) ? this$0.getResources().getString(o0j.t2) : fmg.a(response.mMsg));
        }
        this$0.hideLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSync$lambda$2(SyncEseFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.hideLoading();
        ToastUtil.showLongToast(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$0(final SyncEseFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CommonDialog commonDialogCreate = new CommonDialog.c("SyncEseFragment.sync").setDialogDescription(o0j.I6).setPositiveText(o0j.l2).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.nfc.ui.SyncEseFragment$setListener$1$1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -1) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    this.this$0.onSync();
                }
            }
        });
        commonDialogCreate.showIfNeed(this$0.getChildFragmentManager());
    }

    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public boolean isNeedCardInfo() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int dimensionPixelSize = AppUtil.getApp().getResources().getDimensionPixelSize(pli.n);
        ((vpg) getMBinding()).B.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        if (SettingsPropertiesUtil.INSTANCE.isFolded(AppUtil.getApp())) {
            ViewGroup.LayoutParams layoutParams = ((vpg) getMBinding()).C.getLayoutParams();
            layoutParams.width = -1;
            ((vpg) getMBinding()).C.setLayoutParams(layoutParams);
        } else {
            ViewGroup.LayoutParams layoutParams2 = ((vpg) getMBinding()).C.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
            layoutParams3.width = BaseFragmentExtKt.getDimensionPixelOffset(this, pli.common_btn_single_line_width);
            layoutParams3.gravity = 1;
            ((vpg) getMBinding()).C.setLayoutParams(layoutParams3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(o0j.L6);
        if (this.isMaster) {
            ((vpg) getMBinding()).A.setText(com.xiaomi.fitness.nfc.hyperlink.a.b(getString(o0j.H6, "https://www.mi.com/global/support/contact/")));
            ((vpg) getMBinding()).A.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(@Nullable Bundle args) {
        super.setArguments(args);
        if (args != null) {
            this.isMaster = args.getBoolean("sIsMaster");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((vpg) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: wso
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SyncEseFragment.setListener$lambda$0(this.f38323a, view);
            }
        });
    }
}
