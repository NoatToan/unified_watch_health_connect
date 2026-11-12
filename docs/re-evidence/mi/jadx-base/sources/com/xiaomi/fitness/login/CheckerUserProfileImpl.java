package com.xiaomi.fitness.login;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.account.api.AccountRequest;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.account.user.UserInfoProfile;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.login.CheckerUserProfileImpl;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.preference.IntentStartActivityPreference;
import com.xiaomi.fitness.login.preference.ModePreference;
import com.xiaomi.fitness.login.preference.PrivacyPreference;
import com.xiaomi.fitness.login.privacy.CheckerPrivacyVersion;
import com.xiaomi.fitness.login.util.LoginUtil;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.SelectMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u001c\u0010\u000f\u001a\u00020\u00072\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00072\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\fH\u0016J\b\u0010\u0015\u001a\u00020\fH\u0016J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0014\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001a2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\tH\u0016J\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\tH\u0016J\b\u0010\u001f\u001a\u00020\tH\u0016J\u001c\u0010 \u001a\u00020\u00072\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0011H\u0016J\u001c\u0010!\u001a\u00020\u00072\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0011H\u0016J\b\u0010\"\u001a\u00020\u0007H\u0016J\b\u0010#\u001a\u00020\tH\u0016J\u0010\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\tH\u0016J\u001f\u0010&\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0002\u0010)J\b\u0010*\u001a\u00020\u0007H\u0016J\u0010\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020-H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/login/CheckerUserProfileImpl;", "Lcom/xiaomi/fitness/login/export/CheckerUserSettingManager;", "<init>", "()V", "TAG", "", "checkUserProfile", "", "isShowGuide", "", "accountLogin", "getSelectMode", "", "setSelectMode", DeviceSettingConfigKey.KEY_SELECT_MODE, "addSelectModeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "removeSelectModeListener", "setSelectModeToWeb", "select", "checkDeviceSettingForSelectMode", Constants.KEY_REQUEST_DATA, LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "showLoginDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "setPrivacyAgreeTag", CommonConstants.KEY_AGREE, "setPrivacyDialogFinished", "finished", "getPrivacyDialogFinished", "addPrivacyDialogFinishedListener", "removePrivacyDialogFinishedListener", "getUserInfoFromWeb", "getIntentStartApp", "setIntentStartApp", "value", "startSplashActivity", "Landroid/app/Activity;", "flag", "(Landroid/app/Activity;Ljava/lang/Boolean;)V", "reportRemovePrivacyAgreeTime", "checkUserInfoFromWeb", "userProfile", "Lcom/xiaomi/fitness/account/user/UserInfoProfile;", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckerUserProfileImpl implements CheckerUserSettingManager {

    @NotNull
    private final String TAG = "CheckerUserProfileImpl";

    private final void checkUserInfoFromWeb(UserInfoProfile userProfile) {
        UserProfile userProfile2 = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserProfile(false);
        if (TextUtils.isEmpty(userProfile.getBirth())) {
            userProfile.setBirth(userProfile2.getBirth());
        }
        if (userProfile.getHeight() == 0.0f) {
            userProfile.setHeight(userProfile2.getHeight());
        }
        if (userProfile.getWeight() == 0.0f) {
            userProfile.setWeight(userProfile2.getWeight());
        }
        Logger.i(this.TAG, "CheckerUserProfileImpl userProfile.sex is " + userProfile.getSex());
        if (TextUtils.isEmpty(userProfile.getSex())) {
            userProfile.setSex(userProfile2.getSex());
        }
        if (userProfile.getDailySleepGoal() == 0) {
            userProfile.setDailySleepGoal(userProfile2.getDailySleepGoal());
        }
        Logger.d(this.TAG, "CheckerUserProfileImpl checkAndSendDefault getUserProfile userprofile after " + userProfile + ", database is " + userProfile2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUserInfoFromWeb$lambda$0(CheckerUserProfileImpl this$0, UserInfoProfile it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.TAG, "sporttarget and health page getUserInfoFromWeb get userprofile is " + AccountManagerExtKt.toUserProfile$default(it, null, 1, null));
        this$0.checkUserInfoFromWeb(it);
        AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).saveUserProfile(AccountManagerExtKt.toUserProfile$default(it, null, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUserInfoFromWeb$lambda$1(CheckerUserProfileImpl this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.TAG, "getUserInfoFromWeb error " + it);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.login.export.CheckerUserSettingManager
    public void accountLogin() {
        LoginSupportActivity.INSTANCE.launch(null, true);
    }

    @Override // com.xiaomi.fitness.login.export.CheckerUserSettingManager
    public void addPrivacyDialogFinishedListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        PrivacyPreference.INSTANCE.addPrivacyDialogFinishedListener(listener);
    }

    @Override // com.xiaomi.fitness.login.export.CheckerUserSettingManager
    public void addSelectModeListener(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ModePreference.INSTANCE.addSelectModeListener(listener);
    }

    @Override // com.xiaomi.fitness.login.export.CheckerUserSettingManager
    public int checkDeviceSettingForSelectMode() {
        return LoginUtil.INSTANCE.checkDeviceSettingForSelectMode();
    }

    @Override // com.xiaomi.fitness.login.export.CheckerUserSettingManager
    public void checkUserProfile(boolean isShowGuide) {
        new UserProfileChecker().checkUserProfile(isShowGuide);
    }

    @Override // com.xiaomi.fitness.login.export.CheckerUserSettingManager
    public boolean getIntentStartApp() {
        return IntentStartActivityPreference.INSTANCE.getIntentStartApp();
    }

    @Override // com.xiaomi.fitness.login.export.CheckerUserSettingManager
    public boolean getPrivacyDialogFinished() {
        return PrivacyPreference.INSTANCE.getPrivacyDialogFinished();
    }

    @Override // com.xiaomi.fitness.login.export.CheckerUserSettingManager
    public int getSelectMode() {
        return ModePreference.INSTANCE.getSelectMode();
    }

    @Override // com.xiaomi.fitness.login.export.CheckerUserSettingManager
    public void getUserInfoFromWeb() {
        AccountRequest.getUserProfile$default(new AccountRequest(), null, new Function1() { // from class: ev3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CheckerUserProfileImpl.getUserInfoFromWeb$lambda$0(this.f17091a, (UserInfoProfile) obj);
            }
        }, new Function1() { // from class: fv3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CheckerUserProfileImpl.getUserInfoFromWeb$lambda$1(this.f18278a, (ApiException) obj);
            }
        }, 1, null);
    }

    @Override // com.xiaomi.fitness.login.export.CheckerUserSettingManager
    public void removePrivacyDialogFinishedListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        PrivacyPreference.INSTANCE.removePrivacyDialogFinishedListener(listener);
    }

    @Override // com.xiaomi.fitness.login.export.CheckerUserSettingManager
    public void removeSelectModeListener(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ModePreference.INSTANCE.removeSelectModeListener(listener);
    }

    @Override // com.xiaomi.fitness.login.export.CheckerUserSettingManager
    public void reportRemovePrivacyAgreeTime() {
        CheckerPrivacyVersion.INSTANCE.reportRemovePrivacyAgreeTime();
    }

    @Override // com.xiaomi.fitness.login.export.CheckerUserSettingManager
    public void requestData(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        CheckerPrivacyVersion.INSTANCE.requestData(activity);
    }

    @Override // com.xiaomi.fitness.login.export.CheckerUserSettingManager
    public void setIntentStartApp(boolean value) {
        IntentStartActivityPreference.INSTANCE.setIntentStartApp(value);
    }

    @Override // com.xiaomi.fitness.login.export.CheckerUserSettingManager
    public void setPrivacyAgreeTag(boolean agree) {
        PrivacyPreference.INSTANCE.setPrivacyAgreeTag(true);
    }

    @Override // com.xiaomi.fitness.login.export.CheckerUserSettingManager
    public void setPrivacyDialogFinished(boolean finished) {
        PrivacyPreference.INSTANCE.setPrivacyDialogFinished(finished);
    }

    @Override // com.xiaomi.fitness.login.export.CheckerUserSettingManager
    public void setSelectMode(int selectMode) {
        ModePreference.INSTANCE.setSelectMode(selectMode);
    }

    @Override // com.xiaomi.fitness.login.export.CheckerUserSettingManager
    public void setSelectModeToWeb(int select) {
        SelectMode selectMode = new SelectMode();
        selectMode.setSelectMode(select);
        ModePreference.INSTANCE.setSelectMode(select);
        DeviceSettingManager.INSTANCE.getInstance().sendUserSettingItem(DeviceSettingConfigKey.KEY_SELECT_MODE, selectMode, false);
    }

    @Override // com.xiaomi.fitness.login.export.CheckerUserSettingManager
    @NotNull
    public CommonDialog<?> showLoginDialog(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return LoginUtil.INSTANCE.showLoginDialog(activity);
    }

    @Override // com.xiaomi.fitness.login.export.CheckerUserSettingManager
    public void startSplashActivity(@NotNull Activity activity, @Nullable Boolean flag) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = new Intent();
        intent.setClass(activity, SplashActivity.class);
        intent.setFlags(268468224);
        activity.startActivity(intent);
        if (Intrinsics.areEqual(flag, Boolean.TRUE)) {
            AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).clear();
            FileUtils.clearSpFile$default(FileUtils.INSTANCE, ApplicationExtKt.getApplication(), null, new String[0], 2, null);
            AppManager.INSTANCE.getInstance().appExit();
        }
    }
}
