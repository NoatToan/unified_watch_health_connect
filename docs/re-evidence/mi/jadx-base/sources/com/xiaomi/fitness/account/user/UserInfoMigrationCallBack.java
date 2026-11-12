package com.xiaomi.fitness.account.user;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.common.utils.TimeUtils;
import defpackage.el1;
import defpackage.hql;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/account/user/UserInfoMigrationCallBack;", "Lel1;", "Landroid/content/Context;", "context", "", "migrateSleepGoal", "(Landroid/content/Context;)I", "migrateStepGoal", "gender", "", "switchGender", "(I)Ljava/lang/String;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "", "onAsyncCreate", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "ctx", "<init>", "(Landroid/content/Context;)V", "Companion", "account_release"}, k = 1, mv = {2, 0, 0})
public final class UserInfoMigrationCallBack extends el1 {

    @NotNull
    private static final String EXERCISE_GOAL_PREF_NAME = "exercise_goal.cloud_pref";

    @NotNull
    private static final String KEY_EXERCISE_GOAL = "goal";

    @NotNull
    private static final String PREF_BIRTHDAY = "birthday";

    @NotNull
    private static final String PREF_GENDER = "gender";

    @NotNull
    private static final String PREF_HEIGHT = "height";

    @NotNull
    private static final String SLEEP_GOAL_PREF_FILE = "pref:sleep.cloud_pref";

    @NotNull
    private static final String SUB_FIX = ".xml";

    @NotNull
    private static final String TAG = "UserInfoMigration";

    @NotNull
    private static final String USER_PREF_FILE_V1 = "com.mi.health.basic_info_preference";

    @NotNull
    private static final String USER_PREF_FILE_V2 = "pref:user.cloud_pref";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserInfoMigrationCallBack(@NotNull Context ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
    }

    private final int migrateSleepGoal(Context context) {
        String string = context.getSharedPreferences(SLEEP_GOAL_PREF_FILE, 0).getString("sleep_duration_goal", "480");
        Intrinsics.checkNotNull(string);
        Logger.i(TAG, "migrateSleepGoal: valStr = " + string);
        return Integer.parseInt(string);
    }

    private final int migrateStepGoal(Context context) {
        String string = context.getSharedPreferences(EXERCISE_GOAL_PREF_NAME, 0).getString("goal", null);
        int i = string != null ? Integer.parseInt((String) StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null).get(3)) : 6000;
        Logger.i(TAG, "migrateStepGoal: goal = " + i);
        return i;
    }

    private final String switchGender(int gender) {
        return gender != 2 ? "male" : "female";
    }

    @Override // defpackage.el1
    public void onAsyncCreate(@NotNull SupportSQLiteDatabase db) {
        long j;
        float f;
        int i;
        Intrinsics.checkNotNullParameter(db, "db");
        FileUtils fileUtils = FileUtils.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        File sharedPrefDir = fileUtils.getSharedPrefDir(context);
        String str = sharedPrefDir + "/com.mi.health.basic_info_preference.xml";
        String str2 = sharedPrefDir + "/pref:user.cloud_pref.xml";
        String str3 = sharedPrefDir + "/exercise_goal.cloud_pref.xml";
        String str4 = sharedPrefDir + "/pref:sleep.cloud_pref.xml";
        boolean zIsFileExists = FileUtils.isFileExists(str);
        boolean zIsFileExists2 = FileUtils.isFileExists(str2);
        boolean zIsFileExists3 = FileUtils.isFileExists(str3);
        boolean zIsFileExists4 = FileUtils.isFileExists(str4);
        if (zIsFileExists || zIsFileExists2) {
            SharedPreferences sharedPreferences = zIsFileExists2 ? getContext().getSharedPreferences(USER_PREF_FILE_V2, 0) : zIsFileExists ? new hql(getContext(), USER_PREF_FILE_V1, true) : null;
            if (sharedPreferences == null || !sharedPreferences.getAll().isEmpty()) {
                if (sharedPreferences != null) {
                    String string = sharedPreferences.getString("birthday", "631123200000");
                    Intrinsics.checkNotNull(string);
                    j = Long.parseLong(string);
                    String string2 = sharedPreferences.getString("gender", "1");
                    Intrinsics.checkNotNull(string2);
                    i = Integer.parseInt(string2);
                    String string3 = sharedPreferences.getString(PREF_HEIGHT, "170.0");
                    Intrinsics.checkNotNull(string3);
                    f = Float.parseFloat(string3);
                    sharedPreferences.edit().clear().apply();
                } else {
                    j = 631123200000L;
                    f = 170.0f;
                    i = 1;
                }
                UserInfoManager accountManagerExtKt = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE);
                AccountCoreInfo accountCoreInfoLoadAccountCoreInfo = accountManagerExtKt.loadAccountCoreInfo();
                UserProfile userProfile = new UserProfile(null, null, null, null, 0.0f, 0.0f, null, 0, 0, 0, null, 0, 0, 0, 0, null, 0, 0, null, 0, null, 0.0f, null, null, 16777215, null);
                if (accountCoreInfoLoadAccountCoreInfo != null) {
                    String userName = accountCoreInfoLoadAccountCoreInfo.getUserName();
                    String userId = accountCoreInfoLoadAccountCoreInfo.getUserId();
                    String nickName = accountCoreInfoLoadAccountCoreInfo.getNickName();
                    if (!TextUtils.isEmpty(userName)) {
                        userProfile.setName(String.valueOf(userName));
                    } else if (!TextUtils.isEmpty(userId)) {
                        userProfile.setName(String.valueOf(userId));
                    } else if (!TextUtils.isEmpty(nickName)) {
                        userProfile.setName(String.valueOf(nickName));
                    }
                }
                userProfile.setBirth(TimeUtils.formatDate("yyyy-MM-dd", Long.valueOf(j)));
                userProfile.setHeight(f);
                userProfile.setWeight(60.0f);
                userProfile.setSex(switchGender(i));
                if (zIsFileExists3) {
                    userProfile.setDailyCalGoal(userProfile.getDEFAULT_DAILY_CAL_GOAL());
                    Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    userProfile.setDailyStepGoal(migrateStepGoal(context2));
                    fileUtils.deleteFile(str3);
                    List<DallyGoalItem> defaultAPPGoal = userProfile.getDefaultAPPGoal();
                    for (DallyGoalItem dallyGoalItem : defaultAPPGoal) {
                        if (dallyGoalItem.getField() == 1) {
                            dallyGoalItem.setTarget(userProfile.getDailyStepGoal());
                        }
                    }
                    userProfile.setRegularGoalList(defaultAPPGoal);
                }
                if (zIsFileExists4) {
                    Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    userProfile.setDailySleepGoal(migrateSleepGoal(context3));
                    FileUtils.INSTANCE.deleteFile(str4);
                }
                Logger.d(TAG, "onAsyncCreate: " + userProfile);
                accountManagerExtKt.saveUserProfile(userProfile);
                FileUtils fileUtils2 = FileUtils.INSTANCE;
                fileUtils2.deleteFile(str);
                fileUtils2.deleteFile(str2);
                Logger.i(TAG, "UserInfo migration finished");
            }
        }
    }
}
