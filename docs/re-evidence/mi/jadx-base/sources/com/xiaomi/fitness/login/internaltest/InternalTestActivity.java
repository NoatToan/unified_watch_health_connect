package com.xiaomi.fitness.login.internaltest;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Toast;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.login.internaltest.InternalTestActivity;
import com.xiaomi.fitness.login.preference.ModePreference;
import com.xiaomi.fitness.login.privacy.PrivacyActivity;
import com.xiaomi.fitness.login.region.RegionSelectActivity;
import com.xiaomi.fitness.login.util.hyperlink.a;
import com.xiaomi.fitness.login.welcome.WelcomeActivity;
import com.xiaomi.fitness.main.export.MainExtKt;
import defpackage.av6;
import defpackage.dv1;
import defpackage.fqe;
import defpackage.g0j;
import defpackage.mui;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b \u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0006R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001c¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/login/internaltest/InternalTestActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/login/internaltest/InternalTestViewModel;", "Lfqe;", "", "initData", "()V", "initEvent", "checkAccount", "onNextStep", "showDialog", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_DESTROY, LifecycleConstantKt.ON_RESUME, "Lcom/xiaomi/fitness/account/manager/AccountManager;", "accountMgr$delegate", "Lkotlin/Lazy;", "getAccountMgr", "()Lcom/xiaomi/fitness/account/manager/AccountManager;", "accountMgr", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class InternalTestActivity extends BaseBindingActivity<InternalTestViewModel, fqe> {

    /* JADX INFO: renamed from: accountMgr$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy accountMgr = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: efd
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return InternalTestActivity.accountMgr_delegate$lambda$0();
        }
    });

    @Nullable
    private Handler mainHandler;

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountManager accountMgr_delegate$lambda$0() {
        return AccountManagerExtKt.getInstance(AccountManager.INSTANCE);
    }

    private final void checkAccount() {
        if (!NetUtil.INSTANCE.getNetWorkAvailable(this)) {
            Toast.makeText(this, g0j.o, 1).show();
            return;
        }
        String string = getString(g0j.n);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        PageState.DefaultImpls.showLoading$default(this, string, 0, false, 6, null);
    }

    private final AccountManager getAccountMgr() {
        return (AccountManager) this.accountMgr.getValue();
    }

    private final void initData() {
        String string = getResources().getString(g0j.j, InternalTestUtilKt.getInternalTestUrl());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        getMBinding().E.setText(a.b(string));
        getMBinding().E.setMovementMethod(LinkMovementMethod.getInstance());
        getMBinding().D.setChecked(InternalTestAgreePreference.INSTANCE.getIS_AGREE_SELECT());
        Logger.i(BaseBindingActivity.TAG, "isLogin=" + getAccountMgr().isLogin());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initEvent() {
        getMBinding().D.setOnClickListener(new View.OnClickListener() { // from class: ffd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InternalTestActivity.initEvent$lambda$1(view);
            }
        });
        getMBinding().C.setOnClickListener(new View.OnClickListener() { // from class: gfd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InternalTestActivity.initEvent$lambda$2(this.f18919a, view);
            }
        });
        getMBinding().F.setOnClickListener(new View.OnClickListener() { // from class: hfd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InternalTestActivity.initEvent$lambda$3(this.f20008a, view);
            }
        });
        ((InternalTestViewModel) getMViewModel()).getResultLiveData().observe(this, new InternalTestActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ifd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return InternalTestActivity.initEvent$lambda$5(this.f21084a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initEvent$lambda$1(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initEvent$lambda$2(InternalTestActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initEvent$lambda$3(InternalTestActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.getMBinding().D.isChecked()) {
            Toast.makeText(this$0, g0j.m, 1).show();
        } else if (!NetUtil.INSTANCE.getNetWorkAvailable(this$0)) {
            Toast.makeText(this$0, g0j.o, 1).show();
        } else {
            InternalTestAgreePreference.INSTANCE.setIS_AGREE_SELECT(true);
            this$0.onNextStep();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initEvent$lambda$5(final InternalTestActivity this$0, final Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(BaseBindingActivity.TAG, "isWhiteList=" + bool);
        Handler handler = this$0.mainHandler;
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: jfd
                @Override // java.lang.Runnable
                public final void run() {
                    InternalTestActivity.initEvent$lambda$5$lambda$4(this.f22734a, bool);
                }
            }, 500L);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initEvent$lambda$5$lambda$4(InternalTestActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (bool.booleanValue()) {
            this$0.onNextStep();
        } else {
            this$0.showDialog();
        }
    }

    private final void onNextStep() {
        boolean privacy_agree = RegionPreference.INSTANCE.getPRIVACY_AGREE();
        boolean z = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().length() == 0;
        boolean welcomeFinish = ModePreference.INSTANCE.getWelcomeFinish();
        StringBuilder sb = new StringBuilder();
        sb.append("SplashActivity privacyAgree ");
        sb.append(privacy_agree);
        sb.append(" noRegion ");
        sb.append(z);
        sb.append(" welcomeFinish ");
        sb.append(welcomeFinish);
        if (!welcomeFinish) {
            startActivity(new Intent(this, (Class<?>) WelcomeActivity.class));
            finish();
        } else if (!privacy_agree) {
            startActivity(new Intent(this, (Class<?>) PrivacyActivity.class));
            finish();
        } else if (z) {
            startActivity(new Intent(this, (Class<?>) RegionSelectActivity.class));
            finish();
        } else {
            MainExtKt.showMainActivity$default(this, null, null, 6, null);
            finish();
        }
    }

    private final void showDialog() {
        CommonDialog commonDialogCreate = new CommonDialog.c("whitelist").setDialogDescriptionString(new DialogParams.DialogDescriptionString(g0j.l, new Object[0])).setNegativeText(g0j.f18431k).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.login.internaltest.InternalTestActivity.showDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (dialog != null) {
                    dialog.dismiss();
                }
                InternalTestActivity.this.finish();
            }
        });
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return mui.f27223b;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return dv1.f15951a;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActionBarDisplayable(false);
        this.mainHandler = new Handler(Looper.getMainLooper());
        initData();
        initEvent();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Handler handler = this.mainHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (InternalTestAgreePreference.INSTANCE.getIS_AGREE_SELECT()) {
            onNextStep();
        }
    }
}
