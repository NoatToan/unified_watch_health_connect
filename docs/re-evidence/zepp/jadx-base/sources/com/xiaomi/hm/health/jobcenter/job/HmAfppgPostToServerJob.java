package com.xiaomi.hm.health.jobcenter.job;

import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.atrialfibrillation.AtrialFibUseCaseUtils;
import com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject;

/* JADX INFO: loaded from: classes21.dex */
public class HmAfppgPostToServerJob extends ThreadJobObject {
    private static final String c = "HMAfppgPostToServerJob";

    public HmAfppgPostToServerJob() {
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
            HMLog.i(c, "开始上传AFPPG数据", new Object[0]);
            HMLog.i(c, "upload result = " + AtrialFibUseCaseUtils.INSTANCE.uploadDataToServerBySync(), new Object[0]);
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
