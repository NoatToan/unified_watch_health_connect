package com.xiaomi.fitness.login;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.p004activity.result.ActivityResult;
import androidx.p004activity.result.ActivityResultCallback;
import androidx.p004activity.result.ActivityResultLauncher;
import androidx.p004activity.result.contract.ActivityResultContracts;
import com.xiaomi.accounts.Manifest;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.manager.BroadcastsKt;
import com.xiaomi.fitness.account.token.TokenManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.PermissionBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.internal.extetions.LogExtKt;
import com.xiaomi.fitness.login.LoginSupportActivity;
import com.xiaomi.fitness.login.preference.PrivacyPreference;
import com.xiaomi.fitness.login.privacy.PrivacyActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0006H\u0002J\b\u0010\u0014\u001a\u00020\u000bH\u0002J\b\u0010\u0015\u001a\u00020\u000bH\u0014R\u001c\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/login/LoginSupportActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "activityForResult", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "loginCallback", "Lkotlin/Function1;", "Landroid/os/Bundle;", "", "onCreate", "savedInstanceState", "requestAccountPermission", "doAccountPermissionLessO", "isClick", "", "login", "intent", "update", LifecycleConstantKt.ON_DESTROY, "Companion", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LoginSupportActivity extends FragmentActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String KEY_INTENT = "key_intent";

    @NotNull
    private static final String KEY_TO_LOGIN = "key_to_login";
    private static int mDeniedCount;

    @NotNull
    private final ActivityResultLauncher<Intent> activityForResult;

    @Nullable
    private Function1<? super Bundle, Unit> loginCallback;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/login/LoginSupportActivity$Companion;", "", "<init>", "()V", "KEY_TO_LOGIN", "", "KEY_INTENT", "mDeniedCount", "", "launch", "", "intent", "Landroid/content/Intent;", "toLogin", "", "moveToFront", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void launch$default(Companion companion, Intent intent, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            companion.launch(intent, z);
        }

        private final void moveToFront() {
            ActivityManager activityManager = (ActivityManager) ApplicationExtKt.getApplication().getSystemService(ActivityManager.class);
            for (ActivityManager.RunningTaskInfo runningTaskInfo : activityManager.getRunningTasks(10)) {
                ComponentName componentName = runningTaskInfo.baseActivity;
                if (Intrinsics.areEqual(componentName != null ? componentName.getPackageName() : null, ApplicationExtKt.getApplication().getPackageName())) {
                    activityManager.moveTaskToFront(runningTaskInfo.id, 1);
                    return;
                }
            }
        }

        public final void launch(@Nullable Intent intent, boolean toLogin) {
            if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).getLoggingIn()) {
                LogExtKt.logi("is logging in");
                moveToFront();
                return;
            }
            Intent intent2 = new Intent(ApplicationExtKt.getApplication(), (Class<?>) LoginSupportActivity.class);
            if (intent != null) {
                intent2.putExtra("key_intent", intent);
            }
            intent2.putExtra(LoginSupportActivity.KEY_TO_LOGIN, toLogin);
            intent2.addFlags(268566528);
            ApplicationExtKt.getApplication().startActivity(intent2);
        }
    }

    public LoginSupportActivity() {
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: ere
            @Override // androidx.p004activity.result.ActivityResultCallback
            public final void a(Object obj) {
                LoginSupportActivity.activityForResult$lambda$0(this.f16988a, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.activityForResult = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void activityForResult$lambda$0(LoginSupportActivity this$0, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AccountManagerExtKt.getInstance(AccountManager.INSTANCE).setLoggingIn(false);
        if (activityResult.c() == 0) {
            BroadcastsKt.broadcastCancelLogin(this$0);
        }
        this$0.finish();
    }

    private final void doAccountPermissionLessO(boolean isClick) {
        if (PermissionExtKt.isPermissionGranted(this, Manifest.permission.GET_ACCOUNTS) || mDeniedCount >= 2) {
            update();
        } else {
            Logger.i("doAccountPermissionLessO", new Object[0]);
            runOnUiThread(new Runnable() { // from class: fre
                @Override // java.lang.Runnable
                public final void run() {
                    LoginSupportActivity.doAccountPermissionLessO$lambda$5(this.f18125a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doAccountPermissionLessO$lambda$5(final LoginSupportActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PermissionExtKt.permission$default(this$0, Manifest.permission.GET_ACCOUNTS, (String) null, new Function1() { // from class: dre
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LoginSupportActivity.doAccountPermissionLessO$lambda$5$lambda$4(this.f15834a, (PermissionBuilder) obj);
            }
        }, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doAccountPermissionLessO$lambda$5$lambda$4(final LoginSupportActivity this$0, PermissionBuilder permission) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permission, "$this$permission");
        permission.granted(new Function1() { // from class: are
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LoginSupportActivity.doAccountPermissionLessO$lambda$5$lambda$4$lambda$2(this.f3380a, (String) obj);
            }
        });
        permission.denied(new Function1() { // from class: bre
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LoginSupportActivity.doAccountPermissionLessO$lambda$5$lambda$4$lambda$3(this.f4510a, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doAccountPermissionLessO$lambda$5$lambda$4$lambda$2(LoginSupportActivity this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i("LoginSupportActivity", "Permission is granted");
        mDeniedCount = 0;
        this$0.update();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doAccountPermissionLessO$lambda$5$lambda$4$lambda$3(LoginSupportActivity this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i("LoginSupportActivity", "Permission is denied");
        mDeniedCount++;
        this$0.update();
        return Unit.INSTANCE;
    }

    private final void login(Intent intent) {
        this.activityForResult.launch(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(LoginSupportActivity this$0, Bundle it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getBoolean("booleanResult")) {
            AccountManagerExtKt.getInstance(AccountManager.INSTANCE).setLoggingIn(false);
            this$0.finish();
        } else {
            Intent intent = (Intent) it.getParcelable("intent");
            if (intent != null) {
                this$0.login(intent);
            } else {
                Logger.e("login fail because of " + it, new Object[0]);
                int i = it.getInt("errorCode");
                if (i == 0 || i == 1) {
                    this$0.requestAccountPermission();
                } else {
                    AccountManagerExtKt.getInstance(AccountManager.INSTANCE).setLoggingIn(false);
                    this$0.update();
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final void requestAccountPermission() {
        Logger.i("requestAccountPermission:bigger than O\n", new Object[0]);
        Intent intentNewChooseAccountIntent = android.accounts.AccountManager.newChooseAccountIntent(null, null, new String[]{"com.xiaomi"}, null, null, null, null);
        intentNewChooseAccountIntent.putExtra("descriptionTextOverride", "是否允许该应用访问您的系统小米帐号");
        Intrinsics.checkNotNull(intentNewChooseAccountIntent);
        login(intentNewChooseAccountIntent);
    }

    private final void update() {
        AccountManagerExtKt.getInstance(TokenManager.INSTANCE).update();
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!getIntent().getBooleanExtra(KEY_TO_LOGIN, false)) {
            update();
            return;
        }
        Intent intent = getIntent();
        Intent intent2 = intent != null ? (Intent) intent.getParcelableExtra("key_intent") : null;
        Logger.i("LoginSupportActivity", "onCreate: loginIntent=" + intent2);
        PrivacyPreference privacyPreference = PrivacyPreference.INSTANCE;
        privacyPreference.getPrivacyAgreeTime();
        if (privacyPreference.getPrivacyAgreeTime() == 0) {
            startActivity(new Intent(getApplication(), (Class<?>) PrivacyActivity.class));
            return;
        }
        if (intent2 != null) {
            login(intent2);
            return;
        }
        if (this.loginCallback == null) {
            this.loginCallback = new Function1() { // from class: cre
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return LoginSupportActivity.onCreate$lambda$1(this.f14639a, (Bundle) obj);
                }
            };
            AccountManager accountManagerExtKt = AccountManagerExtKt.getInstance(AccountManager.INSTANCE);
            Function1<? super Bundle, Unit> function1 = this.loginCallback;
            Intrinsics.checkNotNull(function1);
            accountManagerExtKt.login(function1);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.loginCallback != null) {
            AccountManager accountManagerExtKt = AccountManagerExtKt.getInstance(AccountManager.INSTANCE);
            Function1<? super Bundle, Unit> function1 = this.loginCallback;
            Intrinsics.checkNotNull(function1);
            accountManagerExtKt.removeLoginCallback(function1);
            this.loginCallback = null;
        }
    }
}
