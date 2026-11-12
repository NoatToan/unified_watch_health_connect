package com.xiaomi.fitness.login.welcome;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.fitness.banner.export.compare.ICompare;
import com.fitness.banner.export.compare.ICompareKt;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.baseui.utils.ViewUiUtils;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.login.export.PrivacyEasyModePreference;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.login.mode.GuidePersonalizeActivity;
import com.xiaomi.fitness.login.preference.ModePreference;
import com.xiaomi.fitness.login.privacy.PrivacyActivity;
import com.xiaomi.fitness.login.privacy.PrivacyViewModel;
import com.xiaomi.fitness.login.region.RegionSelectActivity;
import com.xiaomi.fitness.login.welcome.WelcomeActivity;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import defpackage.dv1;
import defpackage.gri;
import defpackage.lqe;
import defpackage.mui;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0011\u0010\nJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/login/welcome/WelcomeActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/login/privacy/PrivacyViewModel;", "Llqe;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_DESTROY, "()V", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "SafeRunnable", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WelcomeActivity extends Hilt_WelcomeActivity<PrivacyViewModel, lqe> {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/login/welcome/WelcomeActivity$SafeRunnable;", "Ljava/lang/Runnable;", "activityWeakRef", "Ljava/lang/ref/WeakReference;", "Lcom/xiaomi/fitness/login/welcome/WelcomeActivity;", "<init>", "(Ljava/lang/ref/WeakReference;)V", "getActivityWeakRef", "()Ljava/lang/ref/WeakReference;", "run", "", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SafeRunnable implements Runnable {

        @NotNull
        private final WeakReference<WelcomeActivity> activityWeakRef;

        public SafeRunnable(@NotNull WeakReference<WelcomeActivity> activityWeakRef) {
            Intrinsics.checkNotNullParameter(activityWeakRef, "activityWeakRef");
            this.activityWeakRef = activityWeakRef;
        }

        @NotNull
        public final WeakReference<WelcomeActivity> getActivityWeakRef() {
            return this.activityWeakRef;
        }

        @Override // java.lang.Runnable
        public void run() {
            WelcomeActivity welcomeActivity = this.activityWeakRef.get();
            if (welcomeActivity == null || welcomeActivity.isDestroyed()) {
                return;
            }
            TextView textView = (TextView) welcomeActivity.findViewById(gri.r0);
            Button button = (Button) welcomeActivity.findViewById(gri.p0);
            int iMeasureText = ((int) textView.getPaint().measureText(textView.getText().toString())) + textView.getPaddingStart() + textView.getPaddingEnd();
            ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = iMeasureText;
            button.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x008b  */
    public static final void onCreate$lambda$0(WelcomeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ModePreference.INSTANCE.setWelcomeFinish(true);
        boolean privacy_agree = RegionPreference.INSTANCE.getPRIVACY_AGREE();
        boolean zIsEasyMode = PrivacyEasyModePreference.INSTANCE.isEasyMode();
        boolean z = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().length() == 0;
        if (!privacy_agree && !zIsEasyMode) {
            this$0.startActivity(new Intent(this$0, (Class<?>) PrivacyActivity.class));
        } else if (zIsEasyMode) {
            Bundle bundle = new Bundle();
            bundle.putInt("key_tab", MainTab.INSTANCE.getINDEX_SPORT());
            MainExtKt.showMainActivity(this$0, null, bundle);
        } else if (z) {
            this$0.startActivity(new Intent(this$0, (Class<?>) RegionSelectActivity.class));
        } else if (AppUtil.INSTANCE.isPlayChannel()) {
            MainExtKt.showMainActivity$default(this$0, null, null, 6, null);
        } else {
            CheckerUserSettingManager.Companion companion = CheckerUserSettingManager.INSTANCE;
            if (CheckerUserSettingManagerExtKt.getInstance(companion).getSelectMode() != companion.getUNKOWN_MODE() || ICompareKt.getINSTANCE(ICompare.INSTANCE).showAppV4Enable()) {
                MainExtKt.showMainActivity$default(this$0, null, null, 6, null);
            } else {
                this$0.startActivity(new Intent(this$0, (Class<?>) GuidePersonalizeActivity.class));
            }
        }
        this$0.finish();
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return mui.e;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return dv1.f15951a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.login.welcome.Hilt_WelcomeActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActionBarDisplayable(false);
        ViewUiUtils.fitFullScreen$default(ViewUiUtils.INSTANCE, this, (View) null, (View) null, (Function2) null, 7, (Object) null);
        ((TextView) findViewById(gri.r0)).post(new SafeRunnable(new WeakReference(this)));
        ((lqe) getMBinding()).N.setOnClickListener(new View.OnClickListener() { // from class: rhr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WelcomeActivity.onCreate$lambda$0(this.f32557a, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.login.welcome.Hilt_WelcomeActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        ((lqe) getMBinding()).getRoot().removeCallbacks(null);
        super.onDestroy();
    }
}
