package com.xiaomi.fitness.baseui.common;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.k;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.gsi;
import defpackage.lv3;
import defpackage.mvi;
import defpackage.n1j;
import defpackage.rv1;
import defpackage.ugi;
import defpackage.uh0;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b5\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0006J-\u0010 \u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J)\u0010$\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0004H\u0014¢\u0006\u0004\b&\u0010\u0006R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001c\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00101¨\u00066"}, d2 = {"Lcom/xiaomi/fitness/baseui/common/CommonBaseActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/baseui/common/CommonBaseViewModel;", "Luh0;", "", "showFragment", "()V", "Lcom/xiaomi/fitness/baseui/common/FragmentParams;", "params", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "getFragmentByFragmentFactory", "(Lcom/xiaomi/fitness/baseui/common/FragmentParams;)Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "fragmentParam", "addFragment", "(Lcom/xiaomi/fitness/baseui/common/FragmentParams;)V", "rePlaceFragment", "onBackPressed", "", AccountInteractActivity.KEY_REQUEST_CODE, "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)V", LifecycleConstantKt.ON_DESTROY, "Llv3;", "childFragmentManager", "Llv3;", "Lcom/xiaomi/fitness/baseui/common/FragmentParams;", "currentFragment", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "Ljava/util/Stack;", "fragmentStack", "Ljava/util/Stack;", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "ui_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCommonBaseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonBaseActivity.kt\ncom/xiaomi/fitness/baseui/common/CommonBaseActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n1#2:208\n*E\n"})
public class CommonBaseActivity extends Hilt_CommonBaseActivity<CommonBaseViewModel, uh0> {

    @Nullable
    private lv3 childFragmentManager;

    @Nullable
    private BaseFragment currentFragment;

    @Nullable
    private FragmentParams fragmentParam;

    @NotNull
    private final Stack<BaseFragment> fragmentStack = new Stack<>();

    private final BaseFragment getFragmentByFragmentFactory(FragmentParams params) {
        BaseFragment baseFragment;
        if (params == null) {
            return null;
        }
        String className = params.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
        Logger.i("target fragment " + className, new Object[0]);
        if (!(!TextUtils.isEmpty(className))) {
            throw new IllegalArgumentException("class name is empty".toString());
        }
        try {
            Fragment fragmentA = getSupportFragmentManager().x0().a(getClassLoader(), className);
            Intrinsics.checkNotNull(fragmentA, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.view.BaseFragment");
            baseFragment = (BaseFragment) fragmentA;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            baseFragment = null;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            baseFragment = null;
        } catch (InstantiationException e3) {
            e3.printStackTrace();
            baseFragment = null;
        }
        if (baseFragment == null) {
            return null;
        }
        Bundle bundle = params.getBundle();
        Intrinsics.checkNotNullExpressionValue(bundle, "getBundle(...)");
        bundle.setClassLoader(getClass().getClassLoader());
        baseFragment.setArguments(bundle);
        return baseFragment;
    }

    private final void showFragment() {
        boolean z;
        if (getIntent() == null) {
            ToastExtKt.toast$default(this, n1j.common_page_not_find, 0, 0, 0L, 14, null);
            finish();
            return;
        }
        lv3 lv3Var = this.childFragmentManager;
        FragmentParams fragmentParamsD = lv3Var != null ? lv3Var.d(getIntent()) : null;
        Logger.d("CommonBaseActivity", "fragmentParam:" + (fragmentParamsD != null ? fragmentParamsD.getClassName() : null));
        Fragment fragmentL0 = getSupportFragmentManager().l0(fragmentParamsD != null ? fragmentParamsD.getClassName() : null);
        if (fragmentL0 == null) {
            lv3 lv3Var2 = this.childFragmentManager;
            fragmentL0 = lv3Var2 != null ? lv3Var2.b(getIntent()) : null;
            z = false;
        } else {
            z = true;
        }
        if (fragmentL0 != null) {
            k kVarO = getSupportFragmentManager().o();
            Intrinsics.checkNotNullExpressionValue(kVarO, "beginTransaction(...)");
            String name = fragmentL0.getClass().getName();
            Logger.d("CommonBaseActivity", "simple name tag:" + name);
            kVarO.x(gsi.common_layout, fragmentL0, name);
            if (!z) {
                Intrinsics.checkNotNull(fragmentParamsD);
                if (fragmentParamsD.isBackAble()) {
                    kVarO.j(fragmentL0.getClass().getSimpleName());
                }
            }
            kVarO.m();
            kVarO.F(fragmentL0);
            this.currentFragment = (BaseFragment) fragmentL0;
        }
    }

    public final void addFragment(@NotNull FragmentParams fragmentParam) {
        Intrinsics.checkNotNullParameter(fragmentParam, "fragmentParam");
        if (!this.fragmentStack.contains(this.currentFragment)) {
            this.fragmentStack.push(this.currentFragment);
        }
        lv3 lv3Var = this.childFragmentManager;
        Intrinsics.checkNotNull(lv3Var);
        BaseFragment baseFragmentC = lv3Var.c(fragmentParam);
        if (baseFragmentC == null) {
            ToastExtKt.toast$default(this, n1j.common_page_not_find, 0, 0, 0L, 14, null);
            return;
        }
        k kVarO = getSupportFragmentManager().o();
        Intrinsics.checkNotNullExpressionValue(kVarO, "beginTransaction(...)");
        kVarO.A(ugi.c, ugi.f35741b, ugi.f35740a, ugi.d);
        kVarO.c(gsi.common_layout, baseFragmentC, baseFragmentC.getClass().getSimpleName());
        if (fragmentParam.isBackAble()) {
            kVarO.j(baseFragmentC.getClass().getSimpleName());
        }
        kVarO.m();
        this.currentFragment = baseFragmentC;
        this.fragmentStack.push(baseFragmentC);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return mvi.f27256a;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return rv1.f32936a;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        BaseFragment baseFragment = this.currentFragment;
        if (baseFragment != null) {
            Intrinsics.checkNotNull(baseFragment);
            baseFragment.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        BaseFragment baseFragment = this.currentFragment;
        if (baseFragment != null) {
            Intrinsics.checkNotNull(baseFragment);
            if (baseFragment.onBackPressed()) {
                return;
            }
        }
        if (getSupportFragmentManager().s0() <= 1) {
            finish();
            return;
        }
        getSupportFragmentManager().k1();
        if (this.fragmentStack.size() > 0) {
            this.fragmentStack.pop();
        }
        if (this.fragmentStack.size() > 0) {
            this.currentFragment = this.fragmentStack.peek();
        }
    }

    @Override // com.xiaomi.fitness.baseui.common.Hilt_CommonBaseActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lv3 lv3VarA = lv3.a();
        this.childFragmentManager = lv3VarA;
        FragmentParams fragmentParamsD = lv3VarA != null ? lv3VarA.d(getIntent()) : null;
        this.fragmentParam = fragmentParamsD;
        if (fragmentParamsD != null) {
            Intrinsics.checkNotNull(fragmentParamsD);
            if (fragmentParamsD.isResizeMode()) {
                getWindow().setSoftInputMode(16);
            }
        }
        showFragment();
        setActionBarDisplayable(false);
    }

    @Override // com.xiaomi.fitness.baseui.common.Hilt_CommonBaseActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.currentFragment = null;
        this.fragmentParam = null;
        this.fragmentStack.clear();
        super.onDestroy();
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        if (this.currentFragment != null) {
            lv3 lv3Var = this.childFragmentManager;
            Intrinsics.checkNotNull(lv3Var);
            FragmentParams fragmentParamsD = lv3Var.d(intent);
            this.fragmentParam = fragmentParamsD;
            Bundle bundle = fragmentParamsD != null ? fragmentParamsD.getBundle() : null;
            BaseFragment baseFragment = this.currentFragment;
            Intrinsics.checkNotNull(baseFragment);
            baseFragment.onNewIntent(bundle);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        BaseFragment baseFragment = this.currentFragment;
        if (baseFragment != null) {
            Intrinsics.checkNotNull(baseFragment);
            baseFragment.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

    public final void rePlaceFragment(@NotNull FragmentParams fragmentParam) {
        Intrinsics.checkNotNullParameter(fragmentParam, "fragmentParam");
        if (!this.fragmentStack.contains(this.currentFragment)) {
            this.fragmentStack.push(this.currentFragment);
        }
        lv3 lv3Var = this.childFragmentManager;
        Intrinsics.checkNotNull(lv3Var);
        BaseFragment baseFragmentC = lv3Var.c(fragmentParam);
        if (baseFragmentC == null) {
            ToastExtKt.toast$default(this, n1j.common_page_not_find, 0, 0, 0L, 14, null);
            return;
        }
        k kVarO = getSupportFragmentManager().o();
        Intrinsics.checkNotNullExpressionValue(kVarO, "beginTransaction(...)");
        kVarO.A(ugi.c, ugi.f35741b, ugi.f35740a, ugi.d);
        kVarO.x(gsi.common_layout, baseFragmentC, baseFragmentC.getClass().getSimpleName());
        if (fragmentParam.isBackAble()) {
            kVarO.j(baseFragmentC.getClass().getSimpleName());
        }
        kVarO.m();
        this.currentFragment = baseFragmentC;
        this.fragmentStack.push(baseFragmentC);
    }
}
