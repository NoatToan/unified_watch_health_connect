package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.huami.ecg.core.db.entity.EcgData;
import com.xiaomi.push.cz;
import com.xiaomi.push.dc;
import com.xiaomi.push.df;
import com.xiaomi.push.di;
import com.xiaomi.push.dn;
import com.xiaomi.push.dt;
import com.xiaomi.push.ee;
import com.xiaomi.push.service.at;
import com.xiaomi.push.service.au;

/* JADX INFO: loaded from: classes22.dex */
public class w extends com.xiaomi.push.o.a {
    private Context a;

    public w(Context context) {
        this.a = context;
    }

    @Override // com.xiaomi.push.o.a
    public String a() {
        return "2";
    }

    @Override // java.lang.Runnable
    public void run() {
        at atVarA = at.a(this.a);
        dn dnVar = new dn();
        dnVar.a(au.a(atVarA, dc.MISC_CONFIG));
        dnVar.b(au.a(atVarA, dc.PLUGIN_CONFIG));
        dt dtVar = new dt(EcgData.DEFAULT_DIGIT_VALUE, false);
        dtVar.c(df.DailyCheckClientConfig.f77a);
        dtVar.a(ee.a(dnVar));
        ag.a(this.a).a(dtVar, cz.Notification, (di) null);
    }
}
