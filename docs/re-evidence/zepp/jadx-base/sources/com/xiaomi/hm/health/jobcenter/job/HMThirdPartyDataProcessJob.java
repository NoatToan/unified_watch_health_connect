package com.xiaomi.hm.health.jobcenter.job;

import android.content.Context;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.dataprocess.DaySportData;
import com.xiaomi.hm.health.eventbus.EventPostDataToGoogleFit;
import com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
public class HMThirdPartyDataProcessJob extends ThreadJobObject {
    private static final String e = "HMThirdPartyDataProcessJob";
    private ArrayList<DaySportData> c;
    private int d;

    public HMThirdPartyDataProcessJob(Context context, ArrayList<DaySportData> list, int type) {
        super(4);
        this.c = list;
        this.d = type;
    }

    @Override // com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject, com.xiaomi.hm.health.devicex.proxy.ThreadJob
    public void cancel() {
        super.cancel();
    }

    @Override // com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject, java.lang.Runnable
    public void run() {
        super.run();
        try {
            if (1 == this.d) {
                return;
            }
            HMLog.i(e, "GG run~~~~~~~~~~~~~~~~~\u3000size == " + this.c.size(), new Object[0]);
            EventBus.getDefault().post(new EventPostDataToGoogleFit(this.c));
        } catch (Exception e2) {
            e2.printStackTrace();
            HMLog.e(e, e2.getMessage(), new Object[0]);
        }
    }

    @Override // com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject, com.xiaomi.hm.health.devicex.proxy.ThreadJob
    public void start() {
        super.start();
    }
}
