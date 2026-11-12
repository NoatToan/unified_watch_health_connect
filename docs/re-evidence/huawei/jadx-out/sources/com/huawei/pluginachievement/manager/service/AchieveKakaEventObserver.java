package com.huawei.pluginachievement.manager.service;

import android.content.Context;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.impl.AchieveObserver;
import com.huawei.pluginachievement.manager.model.UserAchieveWrapper;
import defpackage.osd;
import defpackage.osf;
import defpackage.osg;
import defpackage.otl;
import defpackage.otu;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public class AchieveKakaEventObserver implements AchieveObserver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f22023c;

    public AchieveKakaEventObserver(Context context) {
        this.f22023c = context;
    }

    @Override // com.huawei.pluginachievement.impl.AchieveObserver
    public void onDataChanged(int i, UserAchieveWrapper userAchieveWrapper) {
        if (i == -1 || userAchieveWrapper == null) {
            LogUtil.a("PLGACHIEVE_AchieveKakaEventObserver", "HttpErrCode or userAchieveWrapper is error");
            return;
        }
        int contentType = userAchieveWrapper.getContentType();
        LogUtil.a("PLGACHIEVE_AchieveKakaEventObserver", "AchieveKakaEventObserver|onDataChanged contentType = ", Integer.valueOf(contentType));
        if (contentType == 12) {
            final osd osdVarAcquireKakaUpdateReturnBody = userAchieveWrapper.acquireKakaUpdateReturnBody();
            LogUtil.a("PLGACHIEVE_AchieveKakaEventObserver", "onDataChange UPDATE_TASK_STATUS resultCode =", userAchieveWrapper.getResultCode());
            if (osdVarAcquireKakaUpdateReturnBody == null || !userAchieveWrapper.getResultCode().equals("10017")) {
                return;
            }
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.pluginachievement.manager.service.AchieveKakaEventObserver.4
                @Override // java.lang.Runnable
                public void run() {
                    AchieveKakaEventObserver.this.c(osdVarAcquireKakaUpdateReturnBody.c());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        HashMap map = new HashMap(2);
        map.put("taskId", str);
        osf osfVarB = otl.b(this.f22023c.getApplicationContext()).b(12, map);
        if (osfVarB instanceof osg) {
            osg osgVar = (osg) osfVarB;
            if (osgVar.ai() == 30008) {
                osgVar.i(0);
                otu.b(this.f22023c).a(osgVar, 0);
            }
        }
    }
}
