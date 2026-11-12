package com.huawei.pluginachievement.manager.service;

import android.content.Context;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.impl.AchieveObserver;
import com.huawei.pluginachievement.manager.model.AchieveUserLevelInfo;
import com.huawei.pluginachievement.manager.model.UserAchieveWrapper;
import defpackage.osf;
import defpackage.otl;
import defpackage.ott;

/* JADX INFO: loaded from: classes13.dex */
public class AchieveLevelInfoObserver implements AchieveObserver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f22026c;

    public AchieveLevelInfoObserver(Context context) {
        this.f22026c = context;
    }

    @Override // com.huawei.pluginachievement.impl.AchieveObserver
    public void onDataChanged(int i, UserAchieveWrapper userAchieveWrapper) {
        if (i == -1 || userAchieveWrapper == null) {
            LogUtil.a("PLGACHIEVE_AchieveLevelInfoObserver", "HttpErrCode or wrapper is error");
            return;
        }
        int contentType = userAchieveWrapper.getContentType();
        LogUtil.a("PLGACHIEVE_AchieveLevelInfoObserver", "AchieveLevelInfoObserver|onDataChanged contentType = ", Integer.valueOf(contentType));
        if (contentType == 13) {
            for (osf osfVar : userAchieveWrapper.toList()) {
                if (osfVar != null && (osfVar instanceof AchieveUserLevelInfo)) {
                    AchieveUserLevelInfo achieveUserLevelInfo = (AchieveUserLevelInfo) osfVar;
                    ott ottVarE = ott.e(this.f22026c);
                    if (ottVarE != null) {
                        ottVarE.e(achieveUserLevelInfo);
                    }
                }
            }
            a();
        }
    }

    private void a() {
        LogUtil.a("PLGACHIEVE_AchieveLevelInfoObserver", "enter releaseManager");
        otl.b(BaseApplication.getContext()).d(this);
    }
}
