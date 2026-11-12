package com.xiaomi.fitness.userinfo.goal;

import android.app.Activity;
import androidx.lifecycle.ViewModelKt;
import com.google.android.gms.common.Scopes;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fitness.account.api.AccountRequest;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.user.info.export.GoalPageManager;
import com.xiaomi.fitness.user.info.export.GoalPageManagerExtKt;
import com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack;
import com.xiaomi.fitness.userinfo.ui.UserGuideModel;
import com.xiaomi.fitness.userinfo.utils.UserInfoConfigUtil;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\nJ\u000e\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\nJ\u000e\u0010%\u001a\u00020 2\u0006\u0010$\u001a\u00020\nJ\u0006\u0010&\u001a\u00020 J\u001e\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020)2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010*\u001a\u00020+R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/userinfo/goal/GoalGuideViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/userinfo/ui/UserGuideModel;", "<init>", "()V", "DEFAULT_BIRTHDAY", "", "getDEFAULT_BIRTHDAY", "()Ljava/lang/String;", "DEFAULT_HEIGHT", "", "getDEFAULT_HEIGHT", "()I", "DEFAULT_WEIGHT", "", "getDEFAULT_WEIGHT", "()F", "mUserInfoManager", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "getMUserInfoManager", "()Lcom/xiaomi/fitness/account/user/UserInfoManager;", "setMUserInfoManager", "(Lcom/xiaomi/fitness/account/user/UserInfoManager;)V", "mAccountRequest", "Lcom/xiaomi/fitness/account/api/AccountRequest;", "getMAccountRequest", "()Lcom/xiaomi/fitness/account/api/AccountRequest;", "setMAccountRequest", "(Lcom/xiaomi/fitness/account/api/AccountRequest;)V", Scopes.PROFILE, "Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "setGoal", "", FitnessPersistKey.Rainbow, "index", "setDefaultGoal", "support", "setDefaultSwitchGoal", "initUserProfile", "onNext", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "isGuid", "", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GoalGuideViewModel extends BaseViewModel<UserGuideModel> {

    @NotNull
    private final String DEFAULT_BIRTHDAY = "1990-01-01";
    private final int DEFAULT_HEIGHT = 170;
    private final float DEFAULT_WEIGHT = 60.0f;
    public AccountRequest mAccountRequest;
    public UserInfoManager mUserInfoManager;

    @Nullable
    private UserProfile profile;

    @NotNull
    public final String getDEFAULT_BIRTHDAY() {
        return this.DEFAULT_BIRTHDAY;
    }

    public final int getDEFAULT_HEIGHT() {
        return this.DEFAULT_HEIGHT;
    }

    public final float getDEFAULT_WEIGHT() {
        return this.DEFAULT_WEIGHT;
    }

    @NotNull
    public final AccountRequest getMAccountRequest() {
        AccountRequest accountRequest = this.mAccountRequest;
        if (accountRequest != null) {
            return accountRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAccountRequest");
        return null;
    }

    @NotNull
    public final UserInfoManager getMUserInfoManager() {
        UserInfoManager userInfoManager = this.mUserInfoManager;
        if (userInfoManager != null) {
            return userInfoManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mUserInfoManager");
        return null;
    }

    public final void initUserProfile() {
        this.profile = UserInfoManager.getUserProfile$default(getMUserInfoManager(), false, 1, null);
    }

    public final void onNext(@NotNull Activity activity, final int index, final boolean isGuid) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        UserProfile userProfile = this.profile;
        if (userProfile != null) {
            final WeakReference weakReference = new WeakReference(activity);
            UserInfoConfigUtil.INSTANCE.sendAllProfile(ViewModelKt.getViewModelScope(this), userProfile, getMAccountRequest(), new SendProfileCallBack() { // from class: com.xiaomi.fitness.userinfo.goal.GoalGuideViewModel$onNext$1$1
                @Override // com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack
                public void onProfileToDBSuccess(boolean result) {
                }

                @Override // com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack
                public void onSendError() {
                }

                @Override // com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack
                public void onSendSuccess(UserProfile profile) {
                    if (!isGuid) {
                        GoalPageManager.Companion companion = GoalPageManager.INSTANCE;
                        GoalPageManagerExtKt.getInstance(companion).onFinishClick();
                        GoalPageManagerExtKt.getInstance(companion).destoryActivity();
                        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                        if (wearableDeviceModel == null || !wearableDeviceModel.isDeviceConnected() || profile == null) {
                            return;
                        }
                        if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
                            UserInfoConfigUtil.syncHuamiUserInfoToSportDevice$default(UserInfoConfigUtil.INSTANCE, profile, wearableDeviceModel, null, 4, null);
                            return;
                        } else {
                            UserInfoConfigUtil.syncUserInfoToSportDevice$default(UserInfoConfigUtil.INSTANCE, profile, wearableDeviceModel, null, null, 12, null);
                            return;
                        }
                    }
                    GoalPageManager.Companion companion2 = GoalPageManager.INSTANCE;
                    if (!GoalPageManagerExtKt.getInstance(companion2).isLastPage(index)) {
                        Activity activity2 = weakReference.get();
                        if (activity2 == null || activity2.isFinishing()) {
                            return;
                        }
                        GoalPageManagerExtKt.getInstance(companion2).goNextGuidPage(activity2, index + 1);
                        return;
                    }
                    GoalPageManagerExtKt.getInstance(companion2).onFinishClick();
                    GoalPageManagerExtKt.getInstance(companion2).destoryActivity();
                    WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                    if (wearableDeviceModel2 == null || !wearableDeviceModel2.isDeviceConnected() || profile == null) {
                        return;
                    }
                    if (DeviceModelExtKt.isHuaMi(wearableDeviceModel2)) {
                        UserInfoConfigUtil.syncHuamiUserInfoToSportDevice$default(UserInfoConfigUtil.INSTANCE, profile, wearableDeviceModel2, null, 4, null);
                    } else {
                        UserInfoConfigUtil.syncUserInfoToSportDevice$default(UserInfoConfigUtil.INSTANCE, profile, wearableDeviceModel2, null, null, 12, null);
                    }
                }

                @Override // com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack
                public void onSendError(int i) {
                    SendProfileCallBack.DefaultImpls.onSendError(this, i);
                }
            });
        }
    }

    public final void setDefaultGoal(int support) {
        UserProfile userProfile = this.profile;
        Intrinsics.checkNotNull(userProfile);
        UserProfile userProfile2 = this.profile;
        Intrinsics.checkNotNull(userProfile2);
        userProfile.setDefaultGoalConfig(userProfile2, support);
    }

    public final void setDefaultSwitchGoal(int support) {
        UserProfile userProfile = this.profile;
        Intrinsics.checkNotNull(userProfile);
        UserProfile userProfile2 = this.profile;
        Intrinsics.checkNotNull(userProfile2);
        userProfile.setDefaultGoalMhsConfig(userProfile2, support);
    }

    public final void setGoal(int goal, int index) {
        UserProfile userProfile = this.profile;
        Intrinsics.checkNotNull(userProfile);
        userProfile.setGoalConfig(UserInfoManager.getUserProfile$default(getMUserInfoManager(), false, 1, null), goal, index);
    }

    public final void setMAccountRequest(@NotNull AccountRequest accountRequest) {
        Intrinsics.checkNotNullParameter(accountRequest, "<set-?>");
        this.mAccountRequest = accountRequest;
    }

    public final void setMUserInfoManager(@NotNull UserInfoManager userInfoManager) {
        Intrinsics.checkNotNullParameter(userInfoManager, "<set-?>");
        this.mUserInfoManager = userInfoManager;
    }
}
