package com.huawei.pluginachievement.manager.service;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.impl.AchieveObserver;
import com.huawei.pluginachievement.manager.model.LevelUpdateReturnBody;
import com.huawei.pluginachievement.manager.model.UserAchieveWrapper;
import defpackage.osa;
import defpackage.osf;
import defpackage.otl;
import defpackage.ott;

/* JADX INFO: loaded from: classes41.dex */
public class AchieveLevelEventObserver implements AchieveObserver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f22025b;

    public AchieveLevelEventObserver(Context context) {
        this.f22025b = context;
    }

    @Override // com.huawei.pluginachievement.impl.AchieveObserver
    public void onDataChanged(int i, UserAchieveWrapper userAchieveWrapper) {
        if (i == -1 || userAchieveWrapper == null) {
            LogUtil.a("PLGACHIEVE_AchieveLevelEventObserver", "HttpErrCode or wrapper is error");
            return;
        }
        int contentType = userAchieveWrapper.getContentType();
        LogUtil.a("PLGACHIEVE_AchieveLevelEventObserver", "AchieveMedalResDownloadObserver|onDataChanged contentType = ", Integer.valueOf(contentType));
        if (contentType == 14) {
            for (osf osfVar : userAchieveWrapper.toList()) {
                if (osfVar instanceof LevelUpdateReturnBody) {
                    LevelUpdateReturnBody levelUpdateReturnBody = (LevelUpdateReturnBody) osfVar;
                    String strE = osa.e(this.f22025b, "levelEventKey");
                    ott ottVarE = ott.e(this.f22025b);
                    if (!TextUtils.isEmpty(strE) && ottVarE != null) {
                        ottVarE.c(strE, levelUpdateReturnBody.acquireTotalExperience());
                    }
                }
            }
            a();
        }
    }

    private void a() {
        otl.b(BaseApplication.getContext()).d(this);
    }
}
