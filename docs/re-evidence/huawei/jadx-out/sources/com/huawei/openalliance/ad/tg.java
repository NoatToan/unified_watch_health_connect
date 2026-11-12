package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.constant.ClickDestination;
import com.huawei.openalliance.ad.db.bean.ContentRecord;

/* JADX INFO: loaded from: classes12.dex */
public class tg extends com.huawei.openalliance.ad.uriaction.interfaces.a {
    @Override // com.huawei.openalliance.ad.uriaction.interfaces.a
    public boolean a() {
        hw.b("AgentAction", "handle agent action");
        if (!d()) {
            return b();
        }
        c(ClickDestination.INTERACTIVE_MARKETING);
        return true;
    }

    private boolean d() {
        if (this.f20324b == null || this.f20324b.j() == null) {
            return false;
        }
        long jQ = this.f20324b.j().Q();
        String strH = this.f20324b.j().h();
        hw.a("AgentAction", "agent id is %s, click url is %s", Long.valueOf(jQ), strH);
        return com.huawei.openalliance.ad.utils.i.a(this.f20323a, strH, jQ);
    }

    public tg(Context context, ContentRecord contentRecord) {
        super(context, contentRecord);
    }
}
