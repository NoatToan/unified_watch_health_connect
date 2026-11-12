package com.xiaomi.hm.health.bodyfat.manager;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.activity.WeightGoalsSetActivity;
import com.xiaomi.hm.health.bodyfat.event.EventWeightGoalsChanged;
import com.xiaomi.hm.health.bodyfat.manager.WeightGoalPersistent;
import com.xiaomi.hm.health.bodyfat.utils.BFKeeper;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.WeightGoals;
import com.xiaomi.hm.health.databases.model.WeightGoalsDao;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import de.greenrobot.event.EventBus;
import kotlin.jvm.functions.Function0;
import org.greenrobot.greendao.query.WhereCondition;

/* JADX INFO: loaded from: classes19.dex */
public class WeightGoalPersistent {
    private static final String d = "WeightGoalPersistent";
    private Activity a;
    private final long b;
    private final HMUserInfo c;

    public WeightGoalPersistent(@Nullable Activity activity, long j, HMUserInfo hMUserInfo) {
        this.a = activity;
        this.b = j;
        this.c = hMUserInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f(float f) {
        return "goalWeightKg " + f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g(Exception exc) {
        return "" + exc.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h() {
        return "update goal ";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String i(long j) {
        return "insert  goal " + j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String j(long j) {
        return "after save  the user is not the first time to set goal " + WeightGoalManager.getInstance().isUserFirstTimeToSetWeightGoal(j);
    }

    public void postWeightGoalsChangedEvent(int i) {
        EventBus.getDefault().post(new EventWeightGoalsChanged(i));
    }

    public void saveToDbAndServer(final float f) {
        WeightGoals weightGoals;
        boolean z;
        HMLog.debug(d, new Function0() { // from class: gs8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WeightGoalPersistent.f(f);
            }
        });
        this.c.setTargetWeight(f);
        long timestamp = SportDay.getToday().getTimestamp() / 1000;
        try {
            weightGoals = HMDaoManager.getInstance().getWeightGoalsDao().queryBuilder().where(WeightGoalsDao.Properties.DateTime.eq(Long.valueOf(timestamp)), new WhereCondition[0]).unique();
        } catch (Exception e) {
            e.printStackTrace();
            HMLog.error(d, new Function0() { // from class: js8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WeightGoalPersistent.g(e);
                }
            });
            weightGoals = null;
        }
        if (weightGoals == null) {
            weightGoals = new WeightGoals();
            z = false;
        } else {
            z = true;
        }
        long j = Long.parseLong(HMPersonInfo.getInstance().getUserInfo().getUserid());
        if (Long.parseLong(this.c.getUserid()) == j) {
            postWeightGoalsChangedEvent(1);
        }
        final long j2 = Long.parseLong(this.c.getUserid()) == j ? -1L : Long.parseLong(this.c.getUserid());
        weightGoals.setUID(String.valueOf(j));
        weightGoals.setFUID(Long.valueOf(j2));
        weightGoals.setGoal(Float.valueOf(f));
        weightGoals.setHeight(Integer.valueOf(this.c.getHeight()));
        weightGoals.setDateTime(Long.valueOf(timestamp));
        weightGoals.setCurrentVal(Float.valueOf(this.c.getWeight()));
        weightGoals.setSynced(0);
        if (z) {
            HMLog.debug(d, new Function0() { // from class: ks8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WeightGoalPersistent.h();
                }
            });
            HMDaoManager.getInstance().getWeightGoalsDao().update(weightGoals);
        } else {
            final long jInsert = HMDaoManager.getInstance().getWeightGoalsDao().insert(weightGoals);
            HMLog.debug(d, new Function0() { // from class: hs8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WeightGoalPersistent.i(jInsert);
                }
            });
        }
        HMLog.debug(d, new Function0() { // from class: is8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WeightGoalPersistent.j(j2);
            }
        });
        UserInfos userInfos = new UserInfos();
        this.c.getUserInfos(userInfos);
        UserInfoManager.getManager().updateInfo(userInfos, true);
        setResultIntent();
        toServer(2);
        BFKeeper.setWeightGoalRemind(this.c.getUserid(), 0L);
    }

    public void setResultIntent() {
        if (this.a == null) {
            return;
        }
        this.a.setResult(-1, new Intent());
        this.a.finish();
    }

    public void toServer(int i) {
        new WeightGoalsSetActivity.SaveWeightInfoTask(this.b, i, this.c).execute(new Void[0]);
    }

    public WeightGoalPersistent() {
        this.b = Long.parseLong(HMPersonInfo.getInstance().getUserInfo().getUserid());
        this.c = HMPersonInfo.getInstance().getUserInfo();
    }
}
