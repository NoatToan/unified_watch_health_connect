package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.AchieveLevelEventInfo;
import com.huawei.pluginachievement.manager.model.AchieveMessage;
import com.huawei.pluginachievement.manager.model.AchieveUserLevelInfo;
import com.huawei.pluginachievement.manager.model.MessageReminder;
import com.huawei.pluginachievement.manager.model.PersonalData;
import com.huawei.pluginachievement.manager.model.UserAchieveWrapper;
import com.huawei.pluginachievement.manager.service.AchieveLevelInfoObserver;
import health.compact.a.Utils;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class ott {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile otl f44723a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile ott f44724c;
    private static long e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f44725b;
    private osf d;

    private ott(Context context) {
        this.f44725b = context.getApplicationContext();
    }

    public static ott e(Context context) {
        if (context == null) {
            return null;
        }
        f44723a = otl.b(context.getApplicationContext());
        if (f44724c == null) {
            synchronized (ott.class) {
                if (f44724c == null) {
                    f44724c = new ott(context);
                }
            }
        }
        return f44724c;
    }

    public boolean d(AchieveUserLevelInfo achieveUserLevelInfo) {
        if (achieveUserLevelInfo == null) {
            LogUtil.a("PLGACHIEVE_AchieveLevelManager", "userLevelInfo is null");
            return false;
        }
        return f44723a.d(achieveUserLevelInfo);
    }

    public void e(AchieveLevelEventInfo achieveLevelEventInfo) {
        if (achieveLevelEventInfo == null) {
            LogUtil.a("PLGACHIEVE_AchieveLevelManager", "achieveLevelEventInfo is null");
        } else {
            f44723a.a(achieveLevelEventInfo);
        }
    }

    public void b(int i) {
        if (Utils.o()) {
            return;
        }
        if (b()) {
            LogUtil.e("PLGACHIEVE_AchieveLevelManager", "showLevelDialog is fast!");
            return;
        }
        if (!BaseApplication.isRunningForeground()) {
            LogUtil.j("PLGACHIEVE_AchieveLevelManager", "app is isRunningBackground!");
            return;
        }
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putInt("level", i);
        intent.setClassName(this.f44725b, PersonalData.CLASS_NAME_PERSONAL_LEVEL_DIALOG);
        intent.putExtra(RemoteMessageConst.Notification.TAG, bundle);
        intent.addFlags(268435456);
        this.f44725b.startActivity(intent);
    }

    public void d(UserAchieveWrapper userAchieveWrapper) {
        LogUtil.a("PLGACHIEVE_AchieveLevelManager", "enter processLevelMessageRemind messages");
        MessageReminder msgReminder = userAchieveWrapper.getMsgReminder();
        if (msgReminder == null) {
            return;
        }
        List<AchieveMessage> messages = msgReminder.getMessages();
        LogUtil.a("PLGACHIEVE_AchieveLevelManager", "processLevelMessageRemind messages:", messages);
        if (messages == null) {
            return;
        }
        for (AchieveMessage achieveMessage : messages) {
            if (achieveMessage.getMsgType() == 5) {
                String content = achieveMessage.getContent();
                LogUtil.a("PLGACHIEVE_AchieveLevelManager", "processLevelMessageRemind，content = ", content);
                try {
                    int iOptInt = new JSONObject(content).optInt("level");
                    LogUtil.a("PLGACHIEVE_AchieveLevelManager", "processLevelMessageRemind，level = ", Integer.valueOf(iOptInt));
                    if (iOptInt > 0) {
                        b(iOptInt);
                    }
                } catch (JSONException e2) {
                    LogUtil.e("PLGACHIEVE_AchieveLevelManager", "processLevelMessageRemind Exception:", e2.getMessage());
                }
            }
        }
    }

    public static boolean b() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - e < 60000) {
            return true;
        }
        e = jElapsedRealtime;
        return false;
    }

    public void c(final String str, final int i) {
        if (!pap.o(str)) {
            LogUtil.a("PLGACHIEVE_AchieveLevelManager", "key is Invalid");
        } else {
            osa.b(this.f44725b, "levelEventKey", "");
            ThreadPoolManager.c().execute(new Runnable() { // from class: otw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f44758b.a(str, i);
                }
            });
        }
    }

    /* synthetic */ void a(String str, int i) {
        HashMap map = new HashMap(2);
        map.put("taskId", str);
        osf osfVarB = f44723a.b(16, map);
        osf osfVarB2 = f44723a.b(14, map);
        int iB = paq.b(str);
        if (osfVarB instanceof AchieveLevelEventInfo) {
            AchieveLevelEventInfo achieveLevelEventInfo = (AchieveLevelEventInfo) osfVarB;
            if (pap.e(achieveLevelEventInfo.acquireLastModifyTime(), System.currentTimeMillis())) {
                achieveLevelEventInfo.saveLastModifyTime(System.currentTimeMillis());
                achieveLevelEventInfo.saveTaskSumCount(achieveLevelEventInfo.acquireTaskSumCount() + 1);
                achieveLevelEventInfo.saveSyncTime(0L);
                e(achieveLevelEventInfo);
            } else {
                LogUtil.a("PLGACHIEVE_AchieveLevelManager", "level event is completed");
            }
        } else {
            AchieveLevelEventInfo achieveLevelEventInfo2 = new AchieveLevelEventInfo();
            achieveLevelEventInfo2.saveTaskSumCount(1);
            achieveLevelEventInfo2.saveTaskCount(1);
            achieveLevelEventInfo2.saveLastModifyTime(System.currentTimeMillis());
            achieveLevelEventInfo2.saveRewardExperience(iB);
            achieveLevelEventInfo2.saveTaskId(str);
            achieveLevelEventInfo2.saveSyncTime(0L);
            e(achieveLevelEventInfo2);
        }
        if (osfVarB2 instanceof AchieveUserLevelInfo) {
            AchieveUserLevelInfo achieveUserLevelInfo = (AchieveUserLevelInfo) osfVarB2;
            achieveUserLevelInfo.saveUserExperience(i);
            e(achieveUserLevelInfo, achieveUserLevelInfo);
            LogUtil.a("PLGACHIEVE_AchieveLevelManager", "dealLevelEvent userLevel totalGrowth ", Integer.valueOf(i));
            return;
        }
        AchieveUserLevelInfo achieveUserLevelInfo2 = new AchieveUserLevelInfo();
        achieveUserLevelInfo2.saveUserLevel(1);
        achieveUserLevelInfo2.saveUserExperience(0);
        achieveUserLevelInfo2.saveUserReachDays(0.0d);
        achieveUserLevelInfo2.saveSyncTimestamp(System.currentTimeMillis());
        achieveUserLevelInfo2.saveUserExperience(iB);
        e(achieveUserLevelInfo2, achieveUserLevelInfo2);
        LogUtil.a("PLGACHIEVE_AchieveLevelManager", "dealLevelEvent init userLevel one.");
    }

    public void e(final AchieveUserLevelInfo achieveUserLevelInfo) {
        ThreadPoolManager.c().b("PLGACHIEVE_AchieveLevelManager", new Runnable() { // from class: ott.3
            @Override // java.lang.Runnable
            public void run() {
                osf osfVarB;
                HashMap map = new HashMap(2);
                if (ott.this.d == null) {
                    osfVarB = ott.f44723a.b(14, map);
                    LogUtil.a("PLGACHIEVE_AchieveLevelManager", "dealLevelStepsEvent userLevel getData.");
                } else {
                    LogUtil.a("PLGACHIEVE_AchieveLevelManager", "startUserLevel enter.");
                    osfVarB = ott.this.d;
                    ott.this.d = null;
                }
                if (osfVarB instanceof AchieveUserLevelInfo) {
                    ott.this.e(achieveUserLevelInfo, (AchieveUserLevelInfo) osfVarB);
                    LogUtil.a("PLGACHIEVE_AchieveLevelManager", "dealLevelStepsEvent ex", Integer.valueOf(achieveUserLevelInfo.acquireUserExperience()));
                    return;
                }
                AchieveUserLevelInfo achieveUserLevelInfo2 = new AchieveUserLevelInfo();
                achieveUserLevelInfo2.saveUserLevel(1);
                achieveUserLevelInfo2.saveUserExperience(0);
                achieveUserLevelInfo2.saveUserReachDays(0.0d);
                achieveUserLevelInfo2.saveSyncTimestamp(System.currentTimeMillis());
                ott.this.e(achieveUserLevelInfo, achieveUserLevelInfo2);
                LogUtil.a("PLGACHIEVE_AchieveLevelManager", "dealLevelStepsEvent init userLevel one.");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(AchieveUserLevelInfo achieveUserLevelInfo, AchieveUserLevelInfo achieveUserLevelInfo2) {
        if (achieveUserLevelInfo2 == null || achieveUserLevelInfo2.acquireSyncTimestamp() == 0) {
            LogUtil.j("PLGACHIEVE_AchieveLevelManager", "dealLevelMessage userLevelInfo.acquireSyncTimestamp() == 0!");
            return;
        }
        if (achieveUserLevelInfo == null) {
            LogUtil.j("PLGACHIEVE_AchieveLevelManager", "dealLevelMessage newUserLevelInfo == null");
            return;
        }
        int iA = paq.a(achieveUserLevelInfo.acquireUserExperience());
        int iAcquireUserLevel = achieveUserLevelInfo2.acquireUserLevel();
        LogUtil.a("PLGACHIEVE_AchieveLevelManager", "dealLevelMessage newLevel ", Integer.valueOf(iA), " oldLevel ", Integer.valueOf(iAcquireUserLevel));
        achieveUserLevelInfo2.saveUserExperience(achieveUserLevelInfo.acquireUserExperience());
        achieveUserLevelInfo2.saveUserLevel(iA);
        achieveUserLevelInfo2.saveUserReachDays(achieveUserLevelInfo.acquireUserReachDays());
        achieveUserLevelInfo2.saveSyncTimestamp(achieveUserLevelInfo.acquireSyncTimestamp());
        if (!d(achieveUserLevelInfo2) || iA <= iAcquireUserLevel) {
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveLevelManager", "dealLevelMessage showLevelDialog!.");
    }

    public void d() {
        this.d = f44723a.b(14, new HashMap(2));
        LogUtil.a("PLGACHIEVE_AchieveLevelManager", "startUserLevel getData()");
        String strE = osa.e(this.f44725b, "levelEventKey");
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveLevelManager", "dealNotDealEvent key=", strE);
        b(strE);
    }

    public void b(String str) {
        LogUtil.a("PLGACHIEVE_AchieveLevelManager", "updateUserExperience is unUsed! ", str);
    }

    public void c() {
        HashMap map = new HashMap(8);
        ThreadPoolManager.c().execute(new Runnable() { // from class: ott.5
            @Override // java.lang.Runnable
            public void run() {
                ott.this.d();
            }
        });
        f44723a.c(new AchieveLevelInfoObserver(this.f44725b));
        f44723a.a(13, map);
    }
}
