package com.huawei.hwsmartinteractmgr.smarter;

import android.content.Context;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.nsv;

/* JADX INFO: loaded from: classes11.dex */
public class ParticipatedActivitySmarter extends BaseSmarter {
    public ParticipatedActivitySmarter(Context context) {
        super(context);
    }

    public void e() {
        LogUtil.a("SMART_ParticipatedActivitySmarter", "deleteResult = ", Integer.valueOf(nsv.e(this.f17713c).d(100000)));
    }
}
