package com.huawei.pluginachievement.manager.service;

import android.content.Context;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.impl.AchieveObserver;
import com.huawei.pluginachievement.manager.model.KakaCheckinRecord;
import com.huawei.pluginachievement.manager.model.UserAchieveWrapper;
import defpackage.njy;
import defpackage.osa;
import defpackage.otl;
import defpackage.pap;
import defpackage.qrk;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class AchieveKakaCheckRecordObserver implements AchieveObserver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IBaseResponseCallback f22022b;
    private Context e;

    public AchieveKakaCheckRecordObserver(Context context) {
        this.e = context;
    }

    public void e(IBaseResponseCallback iBaseResponseCallback) {
        this.f22022b = iBaseResponseCallback;
    }

    @Override // com.huawei.pluginachievement.impl.AchieveObserver
    public void onDataChanged(int i, UserAchieveWrapper userAchieveWrapper) {
        if (userAchieveWrapper == null) {
            LogUtil.j("PLGACHIEVE_AchieveKakaCheckRecordObserver", "AchieveKakaCheckRecordObserver wrapper is null");
            return;
        }
        int contentType = userAchieveWrapper.getContentType();
        if (i == -1 && contentType == 20) {
            LogUtil.j("PLGACHIEVE_AchieveKakaCheckRecordObserver", "HttpErrCode or wrapper is error");
            e();
        } else if (contentType == 20) {
            LogUtil.a("PLGACHIEVE_AchieveKakaCheckRecordObserver", "AchieveKakaCheckRecordObserver|onDataChanged contentType = ", Integer.valueOf(contentType));
            boolean zE = e(this.e, userAchieveWrapper.getKakaCheckinRecords());
            IBaseResponseCallback iBaseResponseCallback = this.f22022b;
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(0, Boolean.valueOf(zE));
            }
            e();
        }
    }

    private void e() {
        LogUtil.a("PLGACHIEVE_AchieveKakaCheckRecordObserver", "enter releaseManager");
        otl.b(BaseApplication.getContext()).d(this);
    }

    private boolean e(Context context, List<KakaCheckinRecord> list) {
        int conDays;
        if (njy.e(list)) {
            LogUtil.j("PLGACHIEVE_AchieveKakaCheckRecordObserver", "check record is empty");
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        for (int i = 0; i < list.size(); i++) {
            KakaCheckinRecord kakaCheckinRecord = list.get(i);
            if (qrk.c(jCurrentTimeMillis, 0) == pap.d(kakaCheckinRecord.getRecordDay()) && (conDays = kakaCheckinRecord.getConDays()) > 0) {
                LogUtil.a("PLGACHIEVE_AchieveKakaCheckRecordObserver", "CheckedIn:date = ", kakaCheckinRecord.getRecordDay());
                osa.b(this.e, "kakaLastCheckInTime", kakaCheckinRecord.getRecordDay());
                osa.b(context, "kakaCheckedDays", String.valueOf(conDays));
                z = true;
            }
        }
        return z;
    }
}
