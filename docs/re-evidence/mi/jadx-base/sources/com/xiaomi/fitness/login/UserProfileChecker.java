package com.xiaomi.fitness.login;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.miui.circulate.api.protocol.audio.support.MediaMetaData;
import com.xiaomi.fitness.account.api.AccountRequest;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.goal.GoalPreference;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.user.DallyGoalItem;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.account.user.UserInfoProfile;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.login.UserProfileChecker;
import com.xiaomi.fitness.login.util.LoginUtil;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.user.info.export.SetPageManageExtKt;
import com.xiaomi.fitness.user.info.export.SetPageManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ,\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0\u0016H\u0003J\u000e\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0014J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/login/UserProfileChecker;", "", "<init>", "()V", "TAG", "", "mSetPageManager", "Lcom/xiaomi/fitness/user/info/export/SetPageManager;", "getMSetPageManager", "()Lcom/xiaomi/fitness/user/info/export/SetPageManager;", "mSetPageManager$delegate", "Lkotlin/Lazy;", "checkUserProfile", "", "isShowGuide", "", "checkAndSendDefault", "sendDefaultGoalAndHrm", MediaMetaData.IS_LOCAL, "data", "Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "success", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/account/user/UserInfoProfile;", "setLocalGoalConfig", "newProfile", "checkUserInfoFromWeb", "userProfile", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserProfileChecker {

    @NotNull
    private final String TAG = "UserProfileChecker";

    /* JADX INFO: renamed from: mSetPageManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSetPageManager = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: jiq
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UserProfileChecker.mSetPageManager_delegate$lambda$0();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkAndSendDefault$lambda$4(boolean z, UserProfile database, UserProfileChecker this$0, UserInfoProfile it) {
        Intrinsics.checkNotNullParameter(database, "$database");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (!z || (!TextUtils.isEmpty(database.getBirth()) && !TextUtils.isEmpty(database.getSex()) && database.getWeight() > 0.0f && database.getHeight() > 0.0f)) {
            SetPageManageExtKt.getInstance(SetPageManager.INSTANCE).setShowGuidePageFinish(true);
        } else {
            this$0.getMSetPageManager().goFirstGuidPage(null, 0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkAndSendDefault$lambda$6(final UserProfileChecker this$0, final boolean z, UserInfoProfile userprofil) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(userprofil, "userprofil");
        this$0.checkUserInfoFromWeb(userprofil);
        if (userprofil.getRegularGoalList() != null) {
            AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).saveUserProfile(AccountManagerExtKt.toUserProfile$default(userprofil, null, 1, null));
            Logger.d(this$0.TAG, "checkAndSendDefault UserProfile " + AccountManagerExtKt.toUserProfile$default(userprofil, null, 1, null));
            if (!z || (!TextUtils.isEmpty(userprofil.getBirth()) && !TextUtils.isEmpty(userprofil.getSex()) && userprofil.getWeight() > 0.0f && userprofil.getHeight() > 0.0f)) {
                SetPageManageExtKt.getInstance(SetPageManager.INSTANCE).setShowGuidePageFinish(true);
            } else {
                this$0.getMSetPageManager().goFirstGuidPage(null, 0);
            }
        } else {
            Logger.i(this$0.TAG, "UserProfileChecker will sendDefaultGoalAndHrm come");
            this$0.sendDefaultGoalAndHrm(true, AccountManagerExtKt.toUserProfile$default(userprofil, null, 1, null), new Function1() { // from class: miq
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return UserProfileChecker.checkAndSendDefault$lambda$6$lambda$5(this.f26228a, z, (UserInfoProfile) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkAndSendDefault$lambda$6$lambda$5(UserProfileChecker this$0, boolean z, UserInfoProfile it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).saveUserProfile(AccountManagerExtKt.toUserProfile$default(it, null, 1, null));
        Logger.i(this$0.TAG, "userprofil for web getUserProfile " + AccountManagerExtKt.toUserProfile$default(it, null, 1, null));
        if (!z || (!TextUtils.isEmpty(it.getBirth()) && !TextUtils.isEmpty(it.getSex()) && it.getWeight() > 0.0f && it.getHeight() > 0.0f)) {
            SetPageManageExtKt.getInstance(SetPageManager.INSTANCE).setShowGuidePageFinish(true);
        } else {
            this$0.getMSetPageManager().goFirstGuidPage(null, 0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkAndSendDefault$lambda$8(final UserProfileChecker this$0, boolean z, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.TAG, "UserProfileChecker sendDefaultGoalAndHrm error is " + it);
        if (it.getErrorCode() == 606 && z) {
            this$0.sendDefaultGoalAndHrm(true, new UserProfile(null, null, null, null, 0.0f, 0.0f, null, 0, 0, 0, null, 0, 0, 0, 0, null, 0, 0, null, 0, null, 0.0f, null, null, 16777215, null), new Function1() { // from class: giq
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return UserProfileChecker.checkAndSendDefault$lambda$8$lambda$7(this.f19040a, (UserInfoProfile) obj);
                }
            });
        } else {
            SetPageManageExtKt.getInstance(SetPageManager.INSTANCE).setShowGuidePageFinish(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkAndSendDefault$lambda$8$lambda$7(UserProfileChecker this$0, UserInfoProfile it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.getMSetPageManager().goFirstGuidPage(null, 0);
        return Unit.INSTANCE;
    }

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
        Logger.i(this.TAG, "UserInfoChecker userProfile.sex is " + userProfile.getSex());
        if (TextUtils.isEmpty(userProfile.getSex())) {
            userProfile.setSex(userProfile2.getSex());
        }
        if (userProfile.getDailySleepGoal() == 0) {
            userProfile.setDailySleepGoal(userProfile2.getDailySleepGoal());
        }
        Logger.d(this.TAG, "UserInfoChecker checkAndSendDefault getUserProfile userprofile after " + userProfile + ", database is " + userProfile2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkUserProfile$lambda$3$lambda$1(UserProfileChecker this$0, UserProfile it1, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it1, "$it1");
        Logger.i(this$0.TAG, "login init checkUserProfile setUserProfile IS SUCCESS " + it1);
        AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).saveUserProfile(it1);
        this$0.checkAndSendDefault(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkUserProfile$lambda$3$lambda$2(UserProfileChecker this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.TAG, "login init checkUserProfile setUserProfile IS ERROR " + it.getErrorCode());
        return Unit.INSTANCE;
    }

    private final SetPageManager getMSetPageManager() {
        return (SetPageManager) this.mSetPageManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SetPageManager mSetPageManager_delegate$lambda$0() {
        return SetPageManageExtKt.getInstance(SetPageManager.INSTANCE);
    }

    @SuppressLint({"CheckResult"})
    private final boolean sendDefaultGoalAndHrm(boolean isLocal, final UserProfile data, final Function1<? super UserInfoProfile, Unit> success) {
        boolean z;
        Logger.i(this.TAG, "sendDefaultGoalAndHrm");
        data.setName(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId());
        UserProfile userProfile = new UserProfile(null, null, null, null, 0.0f, 0.0f, null, 0, 0, 0, null, 0, 0, 0, 0, null, 0, 0, null, 0, null, 0.0f, null, null, 16777215, null);
        if (data.getDailyStepGoal() == 0) {
            userProfile.initDailyStepGoal();
            data.initDailyStepGoal();
            z = false;
        } else {
            z = true;
        }
        if (data.getDailyCalGoal() == 0) {
            userProfile.initDailyCalGoal();
            data.initDailyCalGoal();
            z = false;
        }
        if (data.getDailyStandTimesGoal() == 0) {
            userProfile.initDailyStandTimesGoal();
            data.initDailyStandTimesGoal();
            z = false;
        }
        if (data.getDailyMhsGoal() == 0) {
            userProfile.initDailyHmsGoal();
            data.initDailyHmsGoal();
            z = false;
        }
        if (data.getRegularGoalList() != null) {
            Logger.i(this.TAG, "sendDefaultGoalAndHrm regularGoalList");
            List<DallyGoalItem> regularGoalList = data.getRegularGoalList();
            if (regularGoalList != null) {
                HashMap map = new HashMap();
                for (DallyGoalItem dallyGoalItem : regularGoalList) {
                    map.put(String.valueOf(dallyGoalItem.getField()), String.valueOf(dallyGoalItem.getTarget()));
                }
                userProfile.setRegularGoalList(data.getRegularGoalList());
                z = true;
            }
        } else {
            SetPageManageExtKt.getInstance(SetPageManager.INSTANCE).setDefaultSupport(data, LoginUtil.INSTANCE.isSupportMhsGoal());
            data.setRegularGoalList(userProfile.getDefaultGoal(userProfile));
            userProfile.setRegularGoalList(data.getRegularGoalList());
            z = false;
        }
        if (data.getRecordMaxHrm() == null) {
            data.setRecordMaxHrm(new UserProfile.RecordMaxHrm(0, null, 0, 7, null));
            userProfile.setRecordMaxHrm(data.getRecordMaxHrm());
            UserProfile.RecordMaxHrm recordMaxHrm = data.getRecordMaxHrm();
            if (recordMaxHrm != null && (data.getRecordMaxHrm() == null || recordMaxHrm.getHrm() == 0)) {
                int iComputeAutoMaxHr = data.computeAutoMaxHr();
                recordMaxHrm.setAutoHrm(iComputeAutoMaxHr);
                UserProfile.RecordMaxHrm recordMaxHrm2 = userProfile.getRecordMaxHrm();
                if (recordMaxHrm2 != null) {
                    recordMaxHrm2.setAutoHrm(recordMaxHrm.getAutoHrm());
                }
                if (recordMaxHrm.getHrm() == 0) {
                    recordMaxHrm.setHrm(iComputeAutoMaxHr);
                    UserProfile.RecordMaxHrm recordMaxHrm3 = userProfile.getRecordMaxHrm();
                    if (recordMaxHrm3 != null) {
                        recordMaxHrm3.setHrm(recordMaxHrm.getHrm());
                    }
                    recordMaxHrm.setSource("auto");
                    UserProfile.RecordMaxHrm recordMaxHrm4 = userProfile.getRecordMaxHrm();
                    if (recordMaxHrm4 != null) {
                        recordMaxHrm4.setSource(recordMaxHrm.getSource());
                    }
                }
                z = false;
            }
        }
        if (!NetUtil.INSTANCE.getNetWorkAvailable(ApplicationExtKt.getApplication()) || z) {
            return false;
        }
        AccountRequest.setUserProfile$default(new AccountRequest(), null, data, new Function1() { // from class: kiq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return UserProfileChecker.sendDefaultGoalAndHrm$lambda$13$lambda$11(this.f23899a, data, success, ((Boolean) obj).booleanValue());
            }
        }, new Function1() { // from class: liq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return UserProfileChecker.sendDefaultGoalAndHrm$lambda$13$lambda$12(this.f25112a, (ApiException) obj);
            }
        }, 1, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendDefaultGoalAndHrm$lambda$13$lambda$11(UserProfileChecker this$0, UserProfile it1, Function1 success, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it1, "$it1");
        Intrinsics.checkNotNullParameter(success, "$success");
        Logger.i(this$0.TAG, "sendDefaultGoalAndHrm SETUSERPROFILE IS SUCCESS " + z);
        AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).saveUserProfile(it1);
        success.invoke2(AccountManagerExtKt.toUserInfoProfile$default(it1, null, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendDefaultGoalAndHrm$lambda$13$lambda$12(UserProfileChecker this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.TAG, "sendDefaultGoalAndHrm SETUSERPROFILE IS ERROR " + it.getErrorCode());
        return Unit.INSTANCE;
    }

    public final void checkAndSendDefault(final boolean isShowGuide) {
        final UserProfile userProfile$default = UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null);
        Logger.d(this.TAG, "UserProfileChecker database " + userProfile$default);
        if (TextUtils.isEmpty(userProfile$default.getBirth()) && TextUtils.isEmpty(userProfile$default.getSex()) && userProfile$default.getWeight() <= 0.0f && userProfile$default.getHeight() <= 0.0f) {
            AccountRequest.getUserProfile$default(new AccountRequest(), null, new Function1() { // from class: eiq
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return UserProfileChecker.checkAndSendDefault$lambda$6(this.f16694a, isShowGuide, (UserInfoProfile) obj);
                }
            }, new Function1() { // from class: fiq
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return UserProfileChecker.checkAndSendDefault$lambda$8(this.f17823a, isShowGuide, (ApiException) obj);
                }
            }, 1, null);
        } else {
            sendDefaultGoalAndHrm(true, userProfile$default, new Function1() { // from class: diq
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return UserProfileChecker.checkAndSendDefault$lambda$4(isShowGuide, userProfile$default, this, (UserInfoProfile) obj);
                }
            });
            SetPageManageExtKt.getInstance(SetPageManager.INSTANCE).setShowGuidePageFinish(true);
        }
    }

    public final void checkUserProfile(final boolean isShowGuide) {
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            Logger.i(this.TAG, "UserProfileChecker return");
            return;
        }
        if (!GoalPreference.INSTANCE.getNotLoginSetGoalFlag()) {
            checkAndSendDefault(isShowGuide);
            return;
        }
        final UserProfile userProfile = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserProfile(false);
        setLocalGoalConfig(userProfile);
        if (userProfile != null) {
            AccountRequest.setUserProfile$default(new AccountRequest(), null, userProfile, new Function1() { // from class: hiq
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return UserProfileChecker.checkUserProfile$lambda$3$lambda$1(this.f20112a, userProfile, isShowGuide, ((Boolean) obj).booleanValue());
                }
            }, new Function1() { // from class: iiq
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return UserProfileChecker.checkUserProfile$lambda$3$lambda$2(this.f21183a, (ApiException) obj);
                }
            }, 1, null);
        }
    }

    public final void setLocalGoalConfig(@NotNull UserProfile newProfile) {
        Intrinsics.checkNotNullParameter(newProfile, "newProfile");
        try {
            ArrayList arrayList = new ArrayList();
            Logger.i(this.TAG + " setDefaultGoalConfig Goal manager jsonGoalist is " + arrayList, new Object[0]);
            GoalPreference goalPreference = GoalPreference.INSTANCE;
            arrayList.add(new DallyGoalItem(2, goalPreference.getNotLoginCalorieGoal()));
            newProfile.setDailyStepGoal(6000);
            arrayList.add(new DallyGoalItem(1, goalPreference.getNotLoginStepGoal()));
            if (goalPreference.getNotLoginStandTimeGoal() > 0) {
                newProfile.setDailyStandTimesGoal(12);
                arrayList.add(new DallyGoalItem(3, goalPreference.getNotLoginStandTimeGoal()));
            } else if (goalPreference.getNotLoginMhsGoal() > 0) {
                newProfile.setDailyMhsGoal(30);
                arrayList.add(new DallyGoalItem(4, goalPreference.getNotLoginMhsGoal()));
            }
            newProfile.setRegularGoalList(arrayList);
            Logger.i(this.TAG + " setDefaultGoalConfig Goal manager setThirdTarget, newProfile = " + newProfile + ", regularGoalList == " + arrayList, new Object[0]);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
