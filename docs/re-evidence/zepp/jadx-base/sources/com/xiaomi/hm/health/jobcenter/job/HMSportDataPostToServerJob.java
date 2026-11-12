package com.xiaomi.hm.health.jobcenter.job;

import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.webapi.earbud.HmEarbudWebApi;
import com.xiaomi.hm.health.device.webapi.sport.HMSportWebAPI;
import com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject;

/* JADX INFO: loaded from: classes21.dex */
public class HMSportDataPostToServerJob extends ThreadJobObject {
    private static final String c = "HMSportDataPostToServerJob";

    public HMSportDataPostToServerJob() {
        super(4);
    }

    @Override // com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject, com.xiaomi.hm.health.devicex.proxy.ThreadJob
    public void cancel() {
        super.cancel();
    }

    @Override // com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject, java.lang.Runnable
    public void run() {
        super.run();
        try {
            HMLog.i(c, "开始上传数据", new Object[0]);
            HMLog.i(c, "upload result = " + HMSportWebAPI.uploadDateDatas(false), new Object[0]);
            HMLog.i(c, "earbud upload result = " + HmEarbudWebApi.INSTANCE.updateDateDatas(false), new Object[0]);
        } catch (Exception e) {
            HMLog.i(c, "上传出现异常 : " + e.getMessage(), new Object[0]);
            e.printStackTrace();
        }
    }

    @Override // com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject, com.xiaomi.hm.health.devicex.proxy.ThreadJob
    public void start() {
        super.start();
    }
}
