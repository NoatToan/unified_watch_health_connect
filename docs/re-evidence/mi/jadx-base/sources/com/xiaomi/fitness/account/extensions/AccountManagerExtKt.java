package com.xiaomi.fitness.account.extensions;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.xiaomi.accountsdk.account.data.XiaomiUserCoreInfo;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.token.TokenManager;
import com.xiaomi.fitness.account.user.DallyGoalItem;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.account.user.UserInfoProfile;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import dagger.hilt.android.EntryPointAccessors;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0011H\u0000\u001a\f\u0010\u0012\u001a\u00020\u0013*\u00020\u0014H\u0000\u001a\u001e\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013H\u0002\u001a\u001c\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0002\u001a\u001c\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001bH\u0002\u001a\u001c\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001cH\u0002\u001a\u0016\u0010\u001d\u001a\u00020\u0014*\u00020\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0014\u001a\u0016\u0010 \u001a\u00020\u001e*\u00020\u00142\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001f\u0010\u0005\u001a\u00020\u0006*\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0000\u0010\b\"\u001f\u0010\u0005\u001a\u00020\u000b*\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u0000\u0010\r¨\u0006!"}, d2 = {"getInstance", "Lcom/xiaomi/fitness/account/manager/AccountManager;", "Lcom/xiaomi/fitness/account/manager/AccountManager$Companion;", "mTokenManagerLock", "Ljava/lang/Object;", "instance", "Lcom/xiaomi/fitness/account/token/TokenManager;", "Lcom/xiaomi/fitness/account/token/TokenManager$Companion;", "(Lcom/xiaomi/fitness/account/token/TokenManager$Companion;)Lcom/xiaomi/fitness/account/token/TokenManager;", "instance$delegate", "Lkotlin/Lazy;", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "Lcom/xiaomi/fitness/account/user/UserInfoManager$Companion;", "(Lcom/xiaomi/fitness/account/user/UserInfoManager$Companion;)Lcom/xiaomi/fitness/account/user/UserInfoManager;", "instance$delegate$1", "toAccountCoreInfo", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "Lcom/xiaomi/accountsdk/account/data/XiaomiUserCoreInfo;", "toRequestObject", "", "Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "addNotNull", "", "Lcom/google/gson/JsonObject;", "property", "value", "", "", "", "toUserProfile", "Lcom/xiaomi/fitness/account/user/UserInfoProfile;", "userProfile", "toUserInfoProfile", "account_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AccountManagerExtKt {

    @NotNull
    private static final Lazy instance$delegate;

    @NotNull
    private static final Lazy instance$delegate$1;

    @NotNull
    private static final Object mTokenManagerLock;

    static {
        Object obj = new Object();
        mTokenManagerLock = obj;
        instance$delegate = LazyKt__LazyJVMKt.lazy(obj, new Function0() { // from class: x80
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManagerExtKt.instance_delegate$lambda$0();
            }
        });
        instance$delegate$1 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: y80
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManagerExtKt.instance_delegate$lambda$1();
            }
        });
    }

    private static final void addNotNull(JsonObject jsonObject, String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return;
        }
        jsonObject.addProperty(str, str2);
    }

    @NotNull
    public static final AccountManager getInstance(@NotNull AccountManager.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return ((AccountPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), AccountPoint.class)).getAccountManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TokenManager instance_delegate$lambda$0() {
        return ((AccountPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), AccountPoint.class)).getTokenManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInfoManager instance_delegate$lambda$1() {
        return ((AccountPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), AccountPoint.class)).getUserInfoManager();
    }

    @NotNull
    public static final AccountCoreInfo toAccountCoreInfo(@NotNull XiaomiUserCoreInfo xiaomiUserCoreInfo) {
        Intrinsics.checkNotNullParameter(xiaomiUserCoreInfo, "<this>");
        AccountCoreInfo accountCoreInfo = new AccountCoreInfo();
        accountCoreInfo.setUserId(xiaomiUserCoreInfo.userId);
        accountCoreInfo.setUserName(xiaomiUserCoreInfo.userName);
        accountCoreInfo.setNickName(xiaomiUserCoreInfo.nickName);
        accountCoreInfo.setAvatarAddress(xiaomiUserCoreInfo.avatarAddress);
        accountCoreInfo.setLocale(xiaomiUserCoreInfo.locale);
        accountCoreInfo.setRegion(xiaomiUserCoreInfo.region);
        accountCoreInfo.setEmailAddress(xiaomiUserCoreInfo.emailAddress);
        accountCoreInfo.setSafePhone(xiaomiUserCoreInfo.safePhone);
        return accountCoreInfo;
    }

    @NotNull
    public static final String toRequestObject(@NotNull UserProfile userProfile) {
        List<DallyGoalItem> regularGoalList;
        Intrinsics.checkNotNullParameter(userProfile, "<this>");
        JsonObject jsonObject = new JsonObject();
        addNotNull(jsonObject, "name", userProfile.getName());
        addNotNull(jsonObject, "icon", userProfile.getIcon());
        Logger.d("sex is " + userProfile.getSex(), new Object[0]);
        addNotNull(jsonObject, "sex", userProfile.getSex());
        addNotNull(jsonObject, MedicalIdSPContract.PREF_BIRTHDAY, userProfile.getBirth());
        addNotNull(jsonObject, "region", userProfile.getRegion());
        addNotNull(jsonObject, "height", userProfile.getHeight());
        addNotNull(jsonObject, "weight", userProfile.getWeight());
        addNotNull(jsonObject, FitnessPersistKey.Vo2Max, userProfile.getVo2Max());
        addNotNull(jsonObject, "max_hrm", userProfile.getMaxHrm());
        addNotNull(jsonObject, "min_hrm", userProfile.getMinHrm());
        addNotNull(jsonObject, "daily_cal_goal", userProfile.getDailyCalGoal());
        addNotNull(jsonObject, "daily_step_goal", userProfile.getDailyStepGoal());
        addNotNull(jsonObject, "daily_sleep_goal", userProfile.getDailySleepGoal());
        if (userProfile.getRegularGoalList() != null && (regularGoalList = userProfile.getRegularGoalList()) != null && (!regularGoalList.isEmpty())) {
            JsonArray goalJsonArray = new UserProfile(null, null, null, null, 0.0f, 0.0f, null, 0, 0, 0, null, 0, 0, 0, 0, null, 0, 0, null, 0, null, 0.0f, null, null, 16777215, null).getGoalJsonArray(userProfile.getRegularGoalList());
            if (goalJsonArray != null && !goalJsonArray.isJsonNull()) {
                jsonObject.add("regular_goal_list", goalJsonArray);
            }
            Logger.i("TAGJsonArray UserModel three_target == " + userProfile.getRegularGoalList(), new Object[0]);
        }
        if (userProfile.getZone_offset() != 0) {
            jsonObject.addProperty("zone_offset", Integer.valueOf(userProfile.getZone_offset()));
        }
        if (userProfile.getZone_name() != null) {
            jsonObject.addProperty("zone_name", userProfile.getZone_name());
        }
        addNotNull(jsonObject, "special_mark", userProfile.getSpecialMark());
        if (userProfile.getRecordMaxHrm() != null) {
            JsonObject jsonObject2 = new JsonObject();
            UserProfile.RecordMaxHrm recordMaxHrm = userProfile.getRecordMaxHrm();
            Intrinsics.checkNotNull(recordMaxHrm);
            addNotNull(jsonObject2, "hrm", recordMaxHrm.getHrm());
            UserProfile.RecordMaxHrm recordMaxHrm2 = userProfile.getRecordMaxHrm();
            Intrinsics.checkNotNull(recordMaxHrm2);
            addNotNull(jsonObject2, "source", recordMaxHrm2.getSource());
            UserProfile.RecordMaxHrm recordMaxHrm3 = userProfile.getRecordMaxHrm();
            Intrinsics.checkNotNull(recordMaxHrm3);
            if (recordMaxHrm3.getHrm() != 0) {
                jsonObject.add("record_max_hrm", jsonObject2);
            }
        }
        if (userProfile.getWear_medal() != null) {
            JsonObject jsonObject3 = new JsonObject();
            UserProfile.UserWearMedal wear_medal = userProfile.getWear_medal();
            Intrinsics.checkNotNull(wear_medal);
            addNotNull(jsonObject3, "wear_status", wear_medal.getWear_status());
            UserProfile.UserWearMedal wear_medal2 = userProfile.getWear_medal();
            Intrinsics.checkNotNull(wear_medal2);
            addNotNull(jsonObject3, "wear_medal_id", wear_medal2.getWear_medal_id());
            UserProfile.UserWearMedal wear_medal3 = userProfile.getWear_medal();
            Intrinsics.checkNotNull(wear_medal3);
            addNotNull(jsonObject3, "wear_medal_type", wear_medal3.getWear_medal_type());
            jsonObject.add("wear_medal", jsonObject3);
        }
        addNotNull(jsonObject, "maximal_met", userProfile.getMaximalMet());
        jsonObject.addProperty("region", userProfile.getRegion());
        jsonObject.addProperty("migrate_hlthcenter", Boolean.TRUE);
        Logger.d("JsonObj == " + jsonObject, new Object[0]);
        String string = jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public static final UserInfoProfile toUserInfoProfile(@NotNull UserProfile userProfile, @Nullable UserInfoProfile userInfoProfile) {
        UserInfoProfile userInfoProfile2;
        Intrinsics.checkNotNullParameter(userProfile, "<this>");
        if (userInfoProfile == null) {
            userInfoProfile2 = new UserInfoProfile(null, null, null, null, 0.0f, 0.0f, null, 0, 0, 0, null, null, 0, 0, 0, null, 0, 0.0f, 0L, 0.0f, null, null, 4194303, null);
        } else {
            userInfoProfile2 = userInfoProfile;
        }
        userInfoProfile2.setSex(userProfile.getSex());
        userInfoProfile2.setWeight(userProfile.getWeight());
        userInfoProfile2.setHeight(userProfile.getHeight());
        userInfoProfile2.setBirth(userProfile.getBirth());
        userInfoProfile2.setName(userProfile.getName());
        userInfoProfile2.setMaxHrm(userProfile.getMaxHrm());
        userInfoProfile2.setDailyCalGoal(userProfile.getDailyCalGoal());
        userInfoProfile2.setDailyStepGoal(userProfile.getDailyStepGoal());
        userInfoProfile2.setDailySleepGoal(userProfile.getDailySleepGoal());
        userInfoProfile2.setMinHrm(userProfile.getMinHrm());
        userInfoProfile2.setRecordMaxHrm(userProfile.getRecordMaxHrm());
        if (userProfile.getInitialWeight() != null) {
            UserProfile.InitialWeight initialWeight = userProfile.getInitialWeight();
            Intrinsics.checkNotNull(initialWeight);
            userInfoProfile2.setInitialWeight(initialWeight.getWeight());
            UserProfile.InitialWeight initialWeight2 = userProfile.getInitialWeight();
            Intrinsics.checkNotNull(initialWeight2);
            userInfoProfile2.setInitialTimestamp(initialWeight2.getTimestamp());
        }
        userInfoProfile2.setRegularGoalList(userProfile.getRegularGoalList());
        userInfoProfile2.setMaximalMet(userProfile.getMaximalMet());
        userInfoProfile2.setVo2Max(userProfile.getVo2Max());
        userInfoProfile2.setRegion(userProfile.getRegion());
        userInfoProfile2.setDids(userProfile.getDids());
        userInfoProfile2.setWear_medal(userProfile.getWear_medal());
        return userInfoProfile2;
    }

    public static /* synthetic */ UserInfoProfile toUserInfoProfile$default(UserProfile userProfile, UserInfoProfile userInfoProfile, int i, Object obj) {
        if ((i & 1) != 0) {
            userInfoProfile = null;
        }
        return toUserInfoProfile(userProfile, userInfoProfile);
    }

    @NotNull
    public static final UserProfile toUserProfile(@NotNull UserInfoProfile userInfoProfile, @Nullable UserProfile userProfile) {
        UserProfile userProfile2;
        Intrinsics.checkNotNullParameter(userInfoProfile, "<this>");
        if (userProfile == null) {
            userProfile2 = new UserProfile(null, null, null, null, 0.0f, 0.0f, null, 0, 0, 0, null, 0, 0, 0, 0, null, 0, 0, null, 0, null, 0.0f, null, null, 16777215, null);
        } else {
            userProfile2 = userProfile;
        }
        userProfile2.setSex(userInfoProfile.getSex());
        userProfile2.setWeight(userInfoProfile.getWeight());
        userProfile2.setHeight(userInfoProfile.getHeight());
        userProfile2.setBirth(userInfoProfile.getBirth());
        userProfile2.setName(userInfoProfile.getName());
        userProfile2.setMaxHrm(userInfoProfile.getMaxHrm());
        userProfile2.setDailyCalGoal(userInfoProfile.getDailyCalGoal());
        userProfile2.setDailyStepGoal(userInfoProfile.getDailyStepGoal());
        userProfile2.setDailySleepGoal(userInfoProfile.getDailySleepGoal());
        userProfile2.setRegularGoalList(userInfoProfile.getRegularGoalList());
        userProfile2.setMinHrm(userInfoProfile.getMinHrm());
        userProfile2.setRecordMaxHrm(userInfoProfile.getRecordMaxHrm());
        if (userProfile2.getInitialWeight() == null) {
            userProfile2.setInitialWeight(new UserProfile.InitialWeight(0.0f, 0L, 3, null));
        }
        UserProfile.InitialWeight initialWeight = userProfile2.getInitialWeight();
        Intrinsics.checkNotNull(initialWeight);
        initialWeight.setWeight(userInfoProfile.getInitialWeight());
        UserProfile.InitialWeight initialWeight2 = userProfile2.getInitialWeight();
        Intrinsics.checkNotNull(initialWeight2);
        initialWeight2.setTimestamp(userInfoProfile.getInitialTimestamp());
        userProfile2.setMaximalMet(userInfoProfile.getMaximalMet());
        userProfile2.setVo2Max(userInfoProfile.getVo2Max());
        userProfile2.setRegion(userInfoProfile.getRegion());
        userProfile2.setDids(userInfoProfile.getDids());
        userProfile2.setWear_medal(userInfoProfile.getWear_medal());
        return userProfile2;
    }

    public static /* synthetic */ UserProfile toUserProfile$default(UserInfoProfile userInfoProfile, UserProfile userProfile, int i, Object obj) {
        if ((i & 1) != 0) {
            userProfile = null;
        }
        return toUserProfile(userInfoProfile, userProfile);
    }

    private static final void addNotNull(JsonObject jsonObject, String str, int i) {
        if (i != 0) {
            jsonObject.addProperty(str, Integer.valueOf(i));
        }
    }

    @NotNull
    public static final TokenManager getInstance(@NotNull TokenManager.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (TokenManager) instance$delegate.getValue();
    }

    private static final void addNotNull(JsonObject jsonObject, String str, float f) {
        if (f == 0.0f) {
            return;
        }
        jsonObject.addProperty(str, Float.valueOf(f));
    }

    @NotNull
    public static final UserInfoManager getInstance(@NotNull UserInfoManager.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (UserInfoManager) instance$delegate$1.getValue();
    }

    private static final void addNotNull(JsonObject jsonObject, String str, long j) {
        if (j != 0) {
            jsonObject.addProperty(str, Long.valueOf(j));
        }
    }
}
