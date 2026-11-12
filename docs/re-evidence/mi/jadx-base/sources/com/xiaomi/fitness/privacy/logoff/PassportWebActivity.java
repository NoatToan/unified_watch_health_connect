package com.xiaomi.fitness.privacy.logoff;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.xiaomi.accountsdk.account.XMPassportSettings;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import defpackage.pri;
import defpackage.s0j;
import defpackage.wui;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u000bH\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/privacy/logoff/PassportWebActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "layoutId", "", "<init>", "(I)V", "getLayoutId", "()I", "webView", "Lcom/xiaomi/fitness/privacy/logoff/PassportWebViewKotlin;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initContentView", LifecycleConstantKt.ON_DESTROY, "Companion", "privacy_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PassportWebActivity extends BaseActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "PassportWebActivity";
    private final int layoutId;
    private PassportWebViewKotlin webView;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/privacy/logoff/PassportWebActivity$Companion;", "", "<init>", "()V", "TAG", "", "show", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "showLogoffWebActivity", "privacy_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void show(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            boolean z = RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE)) && !AppUtil.INSTANCE.isPlayChannel();
            Logger.d(PassportWebActivity.TAG, "show isNeedShow:" + z);
            if (z) {
                activity.startActivity(new Intent(activity, (Class<?>) PassportWebActivity.class));
            }
        }

        @JvmStatic
        public final void showLogoffWebActivity(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            boolean zIsInland = RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE));
            Logger.d(PassportWebActivity.TAG, "show isNeedShow:" + zIsInland);
            if (zIsInland) {
                activity.startActivity(new Intent(activity, (Class<?>) PassportWebActivity.class));
            }
        }
    }

    public PassportWebActivity() {
        this(0, 1, null);
    }

    private final void initContentView() {
        ViewGroup viewGroup = (ViewGroup) findViewById(pri.f30682b);
        this.webView = new PassportWebViewKotlin(this);
        setTitle(s0j.d);
        PassportWebViewKotlin passportWebViewKotlin = this.webView;
        PassportWebViewKotlin passportWebViewKotlin2 = null;
        if (passportWebViewKotlin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            passportWebViewKotlin = null;
        }
        passportWebViewKotlin.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        if (viewGroup != null) {
            PassportWebViewKotlin passportWebViewKotlin3 = this.webView;
            if (passportWebViewKotlin3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webView");
                passportWebViewKotlin3 = null;
            }
            viewGroup.addView(passportWebViewKotlin3);
        }
        String str = XMPassportSettings.isLocalStaging(this) ? "http://account.preview.n.xiaomi.net/pass/auth/rights/unregisterService/index" : "https://account.xiaomi.com/pass/auth/rights/unregisterService/index";
        PassportWebViewKotlin passportWebViewKotlin4 = this.webView;
        if (passportWebViewKotlin4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            passportWebViewKotlin4 = null;
        }
        passportWebViewKotlin4.loadUrl(str + "?userId=" + AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId() + "&productId=MiWear&locale=" + LocaleUtil.INSTANCE.getCurrentLocale(false, false));
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            PassportWebViewKotlin passportWebViewKotlin5 = this.webView;
            if (passportWebViewKotlin5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webView");
            } else {
                passportWebViewKotlin2 = passportWebViewKotlin5;
            }
            passportWebViewKotlin2.getSettings().setAlgorithmicDarkeningAllowed(true);
            return;
        }
        if (i >= 29) {
            if ((getResources().getConfiguration().uiMode & 48) == 32) {
                PassportWebViewKotlin passportWebViewKotlin6 = this.webView;
                if (passportWebViewKotlin6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webView");
                } else {
                    passportWebViewKotlin2 = passportWebViewKotlin6;
                }
                passportWebViewKotlin2.getSettings().setForceDark(2);
                return;
            }
            PassportWebViewKotlin passportWebViewKotlin7 = this.webView;
            if (passportWebViewKotlin7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webView");
            } else {
                passportWebViewKotlin2 = passportWebViewKotlin7;
            }
            passportWebViewKotlin2.getSettings().setForceDark(0);
        }
    }

    @JvmStatic
    public static final void show(@NotNull Activity activity) {
        INSTANCE.show(activity);
    }

    @JvmStatic
    public static final void showLogoffWebActivity(@NotNull Activity activity) {
        INSTANCE.showLogoffWebActivity(activity);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return this.layoutId;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initContentView();
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        PassportWebViewKotlin passportWebViewKotlin = this.webView;
        PassportWebViewKotlin passportWebViewKotlin2 = null;
        if (passportWebViewKotlin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            passportWebViewKotlin = null;
        }
        if (passportWebViewKotlin.getUnregisterResult()) {
            return;
        }
        PassportWebViewKotlin passportWebViewKotlin3 = this.webView;
        if (passportWebViewKotlin3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
        } else {
            passportWebViewKotlin2 = passportWebViewKotlin3;
        }
        passportWebViewKotlin2.plantMiHomeLoginCookie();
    }

    public /* synthetic */ PassportWebActivity(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? wui.f38377b : i);
    }

    public PassportWebActivity(int i) {
        this.layoutId = i;
    }
}
