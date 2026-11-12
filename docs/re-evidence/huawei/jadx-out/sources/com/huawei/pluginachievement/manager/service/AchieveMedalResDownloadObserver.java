package com.huawei.pluginachievement.manager.service;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginachievement.impl.AchieveObserver;
import com.huawei.pluginachievement.manager.model.ActivityInfo;
import com.huawei.pluginachievement.manager.model.MedalConfigInfo;
import com.huawei.pluginachievement.manager.model.UserAchieveWrapper;
import defpackage.osa;
import defpackage.osf;
import defpackage.otl;
import defpackage.pax;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class AchieveMedalResDownloadObserver implements AchieveObserver {
    private Context e;

    public AchieveMedalResDownloadObserver(Context context) {
        this.e = context;
    }

    @Override // com.huawei.pluginachievement.impl.AchieveObserver
    public void onDataChanged(int i, UserAchieveWrapper userAchieveWrapper) {
        d(i, userAchieveWrapper, otl.b(BaseApplication.getContext()));
    }

    private void d(int i, UserAchieveWrapper userAchieveWrapper, otl otlVar) {
        if (otlVar == null) {
            return;
        }
        if (i == -1 || userAchieveWrapper == null) {
            LogUtil.a("PLGACHIEVE_AchieveMedalResDownloadObserver", "HttpErrCode or wrapper is error");
            return;
        }
        int contentType = userAchieveWrapper.getContentType();
        LogUtil.a("PLGACHIEVE_AchieveMedalResDownloadObserver", "AchieveMedalResDownloadObserver|onDataChanged contentType = ", Integer.valueOf(contentType));
        if (contentType == 8) {
            otlVar.y();
            HashMap map = new HashMap(8);
            map.put("countryCode", LoginInit.getInstance(this.e).getAccountInfo(1010));
            otlVar.a(0, map);
            d(userAchieveWrapper, otlVar);
        }
        if (contentType == 10) {
            b(userAchieveWrapper, otlVar);
        }
    }

    private void d(UserAchieveWrapper userAchieveWrapper, otl otlVar) {
        LogUtil.a("PLGACHIEVE_AchieveMedalResDownloadObserver", "enter processActivityMedal");
        if (otlVar == null) {
            return;
        }
        if (TextUtils.isEmpty(osa.e(this.e, "FlorenceMedal"))) {
            LogUtil.a("PLGACHIEVE_AchieveMedalResDownloadObserver", "first cover install");
            osa.b(this.e, "FlorenceMedal", "done");
            otlVar.c();
            c();
            return;
        }
        for (osf osfVar : userAchieveWrapper.toList()) {
            if (osfVar instanceof MedalConfigInfo) {
                MedalConfigInfo medalConfigInfo = (MedalConfigInfo) osfVar;
                if (pax.k(medalConfigInfo.acquireMedalType()) && TextUtils.isEmpty(medalConfigInfo.acquireEndTime())) {
                    LogUtil.a("PLGACHIEVE_AchieveMedalResDownloadObserver", "processActivityMedal acquireActivityId=", Integer.valueOf(medalConfigInfo.acquireActivityId()));
                    otlVar.c();
                    break;
                }
            }
        }
        c();
    }

    private void b(UserAchieveWrapper userAchieveWrapper, final otl otlVar) {
        LogUtil.a("PLGACHIEVE_AchieveMedalResDownloadObserver", "updateActivityMedalInfo ");
        final ActivityInfo activityInfoAcquireActivityInfo = userAchieveWrapper.acquireActivityInfo();
        if (activityInfoAcquireActivityInfo == null || TextUtils.isEmpty(activityInfoAcquireActivityInfo.acquireActivityId())) {
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.pluginachievement.manager.service.AchieveMedalResDownloadObserver.4
            @Override // java.lang.Runnable
            public void run() {
                AchieveMedalResDownloadObserver.this.c(activityInfoAcquireActivityInfo, otlVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(ActivityInfo activityInfo, otl otlVar) {
        if (otlVar == null) {
            LogUtil.a("PLGACHIEVE_AchieveMedalResDownloadObserver", "achieveDataManager is null");
            return;
        }
        if (activityInfo == null) {
            LogUtil.a("PLGACHIEVE_AchieveMedalResDownloadObserver", "activityInfo is null");
            return;
        }
        List<osf> listD = otlVar.d(9, new HashMap<>(2));
        if (listD != null) {
            for (osf osfVar : listD) {
                if (osfVar instanceof MedalConfigInfo) {
                    MedalConfigInfo medalConfigInfo = (MedalConfigInfo) osfVar;
                    if (activityInfo.acquireActivityId().equals(String.valueOf(medalConfigInfo.acquireActivityId()))) {
                        LogUtil.a("PLGACHIEVE_AchieveMedalResDownloadObserver", "updateActivityMedal medalId=", medalConfigInfo.acquireMedalID(), activityInfo.acquireEndTime());
                        medalConfigInfo.saveEndTime(c(activityInfo.acquireEndTime()));
                        medalConfigInfo.saveStartTime(c(activityInfo.acquireBeginTime()));
                        otlVar.a((osf) medalConfigInfo);
                    }
                }
            }
        }
    }

    private void c() {
        LogUtil.a("PLGACHIEVE_AchieveMedalResDownloadObserver", "enter releaseManager");
        otl.b(BaseApplication.getContext()).d(this);
    }

    private static String c(String str) {
        String strValueOf = String.valueOf(pax.d(str, "yyyy-MM-dd HH:mm:ss"));
        LogUtil.a("PLGACHIEVE_AchieveMedalResDownloadObserver", "getActivityMedalTimestamp time", strValueOf, "date=", str);
        return strValueOf;
    }
}
