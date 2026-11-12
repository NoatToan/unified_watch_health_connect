package com.xiaomi.fitness.electronic.scale;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import com.xiaomi.fitness.electronic.scale.AboutDeviceActivity;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleActivityFinishHelper;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleActivityFinishHelperExtKt;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManager;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;
import defpackage.av1;
import defpackage.av6;
import defpackage.bri;
import defpackage.dj0;
import defpackage.gui;
import defpackage.t48;
import defpackage.wc0;
import defpackage.zzi;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/AboutDeviceActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/electronic/scale/AboutDeviceViewModel;", "Ldj0;", "", "initView", "()V", "showRecallReminderDialog", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View$OnClickListener;", "onClickListener", "Landroid/view/View$OnClickListener;", "", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AboutDeviceActivity extends Hilt_AboutDeviceActivity<AboutDeviceViewModel, dj0> {

    @NotNull
    private final View.OnClickListener onClickListener = new View.OnClickListener() { // from class: ry
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            AboutDeviceActivity.onClickListener$lambda$2(this.f33048a, view);
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AboutDeviceViewModel access$getMViewModel(AboutDeviceActivity aboutDeviceActivity) {
        return (AboutDeviceViewModel) aboutDeviceActivity.getMViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        EcoDeviceInfo deviceInfo;
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setTitle(getString(zzi.P0));
        }
        EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE);
        String stringExtra = getIntent().getStringExtra("did");
        Intrinsics.checkNotNull(stringExtra);
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) ecoDeviceManagerExtKt.getDeviceModel(stringExtra);
        AboutDeviceViewModel aboutDeviceViewModel = (AboutDeviceViewModel) getMViewModel();
        String model = (ecoDeviceModel == null || (deviceInfo = ecoDeviceModel.getDeviceInfo()) == null) ? null : deviceInfo.getModel();
        Intrinsics.checkNotNull(model);
        aboutDeviceViewModel.init(model);
        EcoDeviceInfo deviceInfo2 = ecoDeviceModel != null ? ecoDeviceModel.getDeviceInfo() : null;
        if (deviceInfo2 != null) {
            dj0 dj0Var = (dj0) getMBinding();
            dj0Var.setOnClick(this.onClickListener);
            dj0Var.D.setRemindText(deviceInfo2.getModel());
            dj0Var.G.setRemindText(deviceInfo2.getMac());
            dj0Var.F.setRemindText(t48.c().f34293a);
            dj0Var.I.setRemindText(deviceInfo2.getSn());
            RightArrowBindingSingleLineTextView rightArrowBindingSingleLineTextView = dj0Var.D;
            Intrinsics.checkNotNull(rightArrowBindingSingleLineTextView, "null cannot be cast to non-null type com.xiaomi.fitness.widget.RightArrowSingleLineTextView");
            rightArrowBindingSingleLineTextView.getMTvFeatureItemRemind().setMaxWidth(DisplayUtil.dp2px(this, 300.0f));
            RightArrowBindingSingleLineTextView rightArrowBindingSingleLineTextView2 = dj0Var.G;
            Intrinsics.checkNotNull(rightArrowBindingSingleLineTextView2, "null cannot be cast to non-null type com.xiaomi.fitness.widget.RightArrowSingleLineTextView");
            rightArrowBindingSingleLineTextView2.getMTvFeatureItemRemind().setMaxWidth(DisplayUtil.dp2px(this, 300.0f));
            RightArrowBindingSingleLineTextView rightArrowBindingSingleLineTextView3 = dj0Var.F;
            Intrinsics.checkNotNull(rightArrowBindingSingleLineTextView3, "null cannot be cast to non-null type com.xiaomi.fitness.widget.RightArrowSingleLineTextView");
            rightArrowBindingSingleLineTextView3.getMTvFeatureItemRemind().setMaxWidth(DisplayUtil.dp2px(this, 300.0f));
            RightArrowBindingSingleLineTextView rightArrowBindingSingleLineTextView4 = dj0Var.I;
            Intrinsics.checkNotNull(rightArrowBindingSingleLineTextView4, "null cannot be cast to non-null type com.xiaomi.fitness.widget.RightArrowSingleLineTextView");
            rightArrowBindingSingleLineTextView4.getMTvFeatureItemRemind().setMaxWidth(DisplayUtil.dp2px(this, 300.0f));
        }
        ((AboutDeviceViewModel) getMViewModel()).setDid(getIntent().getStringExtra("did"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClickListener$lambda$2(AboutDeviceActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int id = view.getId();
        if (id == bri.W5) {
            this$0.showRecallReminderDialog();
        } else if (id == bri.i5) {
            String currentLocale = LocaleUtil.getCurrentLocale();
            String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            WebViewUtilKt.startWebView$default(ElectronicScaleManagerExtKt.getInstance(ElectronicScaleManager.INSTANCE).getScalePrivacyUrl(true, lowerCase, currentLocale), null, false, false, null, false, null, false, 254, null);
        }
    }

    private final void showRecallReminderDialog() {
        CommonDialog commonDialogCreate = new CommonDialog.c("recall_reminder").setDialogTitle(zzi.H4).setDialogDescription(zzi.I4).setPositiveText(zzi.J0).setNegativeText(zzi.g5).setCanceledOnBackPressed(false).setCancelable(false).setCanceledOnTouchOutside(false).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.electronic.scale.AboutDeviceActivity.showRecallReminderDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) throws JSONException {
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } else {
                    if (which != -1) {
                        return;
                    }
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    NetUtil netUtil = NetUtil.INSTANCE;
                    Context applicationContext = AboutDeviceActivity.this.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    if (netUtil.getNetWorkAvailable(applicationContext)) {
                        AboutDeviceActivity.access$getMViewModel(AboutDeviceActivity.this).recallReminder(AboutDeviceActivity.this);
                    } else {
                        ToastUtil.INSTANCE.showToast(zzi.common_hint_network_unavailable);
                    }
                }
            }
        });
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return gui.f19341a;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return av1.d;
    }

    @Override // com.xiaomi.fitness.electronic.scale.Hilt_AboutDeviceActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        ElectronicScaleActivityFinishHelperExtKt.getInstance(ElectronicScaleActivityFinishHelper.INSTANCE).add(this);
    }
}
