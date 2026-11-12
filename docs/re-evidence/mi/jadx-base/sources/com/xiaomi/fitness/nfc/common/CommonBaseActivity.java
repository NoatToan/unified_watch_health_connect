package com.xiaomi.fitness.nfc.common;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.k;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import defpackage.kv3;
import defpackage.mri;
import defpackage.o0j;
import defpackage.sgi;
import defpackage.sui;
import defpackage.tlg;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b2\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0006J-\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010 \u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\"\u0010\u0006R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010.¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/nfc/common/CommonBaseActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/nfc/common/CommonBaseViewModel;", "Ltlg;", "", "showFragment", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "Lcom/xiaomi/fitness/baseui/common/FragmentParams;", "fragmentParam", "addFragment", "(Lcom/xiaomi/fitness/baseui/common/FragmentParams;)V", "rePlaceFragment", "onBackPressed", "", AccountInteractActivity.KEY_REQUEST_CODE, "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)V", LifecycleConstantKt.ON_DESTROY, "Lkv3;", "childFragmentManager", "Lkv3;", "Lcom/xiaomi/fitness/baseui/common/FragmentParams;", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "currentFragment", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "Ljava/util/Stack;", "fragmentStack", "Ljava/util/Stack;", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CommonBaseActivity extends Hilt_CommonBaseActivity<CommonBaseViewModel, tlg> {

    @Nullable
    private kv3 childFragmentManager;

    @Nullable
    private BaseFragment currentFragment;

    @Nullable
    private FragmentParams fragmentParam;

    @NotNull
    private final Stack<BaseFragment> fragmentStack = new Stack<>();

    private final void showFragment() {
        if (getIntent() == null) {
            ToastUtil.INSTANCE.showToast(o0j.y2);
            finish();
            return;
        }
        kv3 kv3Var = this.childFragmentManager;
        Intrinsics.checkNotNull(kv3Var);
        BaseFragment baseFragmentB = kv3Var.b(getIntent());
        if (baseFragmentB != null) {
            k kVarO = getSupportFragmentManager().o();
            Intrinsics.checkNotNullExpressionValue(kVarO, "beginTransaction(...)");
            kVarO.x(mri.common_layout, baseFragmentB, baseFragmentB.getClass().getSimpleName());
            FragmentParams fragmentParams = this.fragmentParam;
            Intrinsics.checkNotNull(fragmentParams);
            if (fragmentParams.isBackAble()) {
                kVarO.j(baseFragmentB.getClass().getSimpleName());
            }
            kVarO.m();
            kVarO.F(baseFragmentB);
            this.currentFragment = baseFragmentB;
        }
    }

    public final void addFragment(@NotNull FragmentParams fragmentParam) {
        Intrinsics.checkNotNullParameter(fragmentParam, "fragmentParam");
        if (!this.fragmentStack.contains(this.currentFragment)) {
            this.fragmentStack.push(this.currentFragment);
        }
        kv3 kv3Var = this.childFragmentManager;
        Intrinsics.checkNotNull(kv3Var);
        BaseFragment baseFragmentC = kv3Var.c(fragmentParam);
        if (baseFragmentC == null) {
            ToastUtil.INSTANCE.showToast(o0j.y2);
            return;
        }
        k kVarO = getSupportFragmentManager().o();
        Intrinsics.checkNotNullExpressionValue(kVarO, "beginTransaction(...)");
        kVarO.A(sgi.c, sgi.f33617b, sgi.f33616a, sgi.d);
        kVarO.c(mri.common_layout, baseFragmentC, baseFragmentC.getClass().getSimpleName());
        if (fragmentParam.isBackAble()) {
            kVarO.j(baseFragmentC.getClass().getSimpleName());
        }
        kVarO.m();
        this.currentFragment = baseFragmentC;
        this.fragmentStack.push(baseFragmentC);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return sui.f34000b;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 4;
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

    @Override // com.xiaomi.fitness.nfc.common.Hilt_CommonBaseActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        kv3 kv3VarA = kv3.a();
        this.childFragmentManager = kv3VarA;
        FragmentParams fragmentParamsD = kv3VarA != null ? kv3VarA.d(getIntent()) : null;
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

    @Override // com.xiaomi.fitness.nfc.common.Hilt_CommonBaseActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.currentFragment = null;
        this.fragmentParam = null;
        this.fragmentStack.clear();
        super.onDestroy();
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        Bundle bundle;
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        if (this.currentFragment != null) {
            kv3 kv3Var = this.childFragmentManager;
            Intrinsics.checkNotNull(kv3Var);
            FragmentParams fragmentParamsD = kv3Var.d(intent);
            this.fragmentParam = fragmentParamsD;
            if (fragmentParamsD == null || (bundle = fragmentParamsD.getBundle()) == null) {
                bundle = new Bundle();
            }
            bundle.putAll(intent.getExtras());
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
        kv3 kv3Var = this.childFragmentManager;
        Intrinsics.checkNotNull(kv3Var);
        BaseFragment baseFragmentC = kv3Var.c(fragmentParam);
        if (baseFragmentC == null) {
            ToastUtil.INSTANCE.showToast(o0j.y2);
            return;
        }
        k kVarO = getSupportFragmentManager().o();
        Intrinsics.checkNotNullExpressionValue(kVarO, "beginTransaction(...)");
        kVarO.A(sgi.c, sgi.f33617b, sgi.f33616a, sgi.d);
        kVarO.x(mri.common_layout, baseFragmentC, baseFragmentC.getClass().getSimpleName());
        if (fragmentParam.isBackAble()) {
            kVarO.j(baseFragmentC.getClass().getSimpleName());
        }
        kVarO.m();
        this.currentFragment = baseFragmentC;
        this.fragmentStack.push(baseFragmentC);
    }
}
