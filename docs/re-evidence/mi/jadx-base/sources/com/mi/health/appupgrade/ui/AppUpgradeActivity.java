package com.mi.health.appupgrade.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.mi.health.appupgrade.ui.AppUpgradeActivity;
import com.mi.health.appupgrade.viewmodel.AppUpgradeViewModel;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.utils.AppVersionUtil;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.ah0;
import defpackage.bzi;
import defpackage.rti;
import defpackage.wmi;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001c\u0010\nJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u0019\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/mi/health/appupgrade/ui/AppUpgradeActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/mi/health/appupgrade/viewmodel/AppUpgradeViewModel;", "Lah0;", "", "isForceUpgrade", "", "initView", "(Z)V", "showTitle", "()V", "showErrorView", "hideErrorView", "showDetailsView", "hideDetailsView", "goToVersionHistoryList", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "Z", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "appupgrade_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AppUpgradeActivity extends Hilt_AppUpgradeActivity<AppUpgradeViewModel, ah0> {

    @NotNull
    public static final String KEY_APP_FORCE_UPGRADE = "key_app_force_upgrade";
    private boolean isForceUpgrade;

    private final void goToVersionHistoryList() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("https://watch.iot.mi.com/html/appfw-versions/index.html?model=app&locale=%s", Arrays.copyOf(new Object[]{LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        WebViewUtilKt.startWebView$default(str, getString(bzi.m), false, false, null, false, null, false, 252, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void hideDetailsView() {
        ((ah0) getMBinding()).F.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void hideErrorView() {
        ((ah0) getMBinding()).E.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView(boolean isForceUpgrade) {
        showTitle();
        if (isForceUpgrade) {
            hideBack();
        }
        ((AppUpgradeViewModel) getMViewModel()).getShowDetail().observe(this, new AppUpgradeActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: yh1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AppUpgradeActivity.initView$lambda$0(this.f40169a, (Boolean) obj);
            }
        }));
        ((AppUpgradeViewModel) getMViewModel()).getShowError().observe(this, new AppUpgradeActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: zh1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AppUpgradeActivity.initView$lambda$1(this.f41265a, (Boolean) obj);
            }
        }));
        ((ah0) getMBinding()).G.setOnClickListener(new View.OnClickListener() { // from class: ai1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppUpgradeActivity.initView$lambda$2(this.f1042a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$0(AppUpgradeActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            this$0.showDetailsView();
        } else {
            this$0.hideDetailsView();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$1(AppUpgradeActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            this$0.showErrorView();
        } else {
            this$0.hideErrorView();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initView$lambda$2(AppUpgradeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((AppUpgradeViewModel) this$0.getMViewModel()).actionButtonClicked();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showDetailsView() {
        if (((AppUpgradeViewModel) getMViewModel()).haveUpdateVersion()) {
            ((ah0) getMBinding()).L.setText(bzi.p);
            ((ah0) getMBinding()).K.setText(getString(bzi.f4752k, ((AppUpgradeViewModel) getMViewModel()).getNewVersionName()));
            ((ah0) getMBinding()).I.setText(getString(bzi.i, ((AppUpgradeViewModel) getMViewModel()).getNewVersionName()));
            ((ah0) getMBinding()).G.setText(getString(bzi.j));
        } else {
            ((ah0) getMBinding()).L.setText(getString(bzi.h));
            TextView textView = ((ah0) getMBinding()).K;
            int i = bzi.l;
            AppVersionUtil appVersionUtil = AppVersionUtil.INSTANCE;
            textView.setText(getString(i, appVersionUtil.getAppVersionName()));
            ((ah0) getMBinding()).I.setText(getString(bzi.i, appVersionUtil.getAppVersionName()));
            ((ah0) getMBinding()).G.setText(getString(bzi.f4751b));
        }
        ((ah0) getMBinding()).H.setText(((AppUpgradeViewModel) getMViewModel()).getChangeLog());
        ((ah0) getMBinding()).F.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showErrorView() {
        ((ah0) getMBinding()).E.setVisibility(0);
    }

    private final void showTitle() {
        setTitle(bzi.n);
        IActionBar.DefaultImpls.setEndView$default(this, 0, wmi.f38131a, getString(bzi.f), new View.OnClickListener() { // from class: bi1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppUpgradeActivity.showTitle$lambda$3(this.f4237a, view);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showTitle$lambda$3(AppUpgradeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.goToVersionHistoryList();
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return rti.f32891a;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.isForceUpgrade) {
            return;
        }
        super.onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.appupgrade.ui.Hilt_AppUpgradeActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        boolean booleanExtra = getIntent().getBooleanExtra(KEY_APP_FORCE_UPGRADE, false);
        this.isForceUpgrade = booleanExtra;
        initView(booleanExtra);
        ((AppUpgradeViewModel) getMViewModel()).enterView();
    }
}
