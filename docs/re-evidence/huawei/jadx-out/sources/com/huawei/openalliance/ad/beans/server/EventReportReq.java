package com.huawei.openalliance.ad.beans.server;

import android.content.Context;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.beans.base.ReqBean;
import com.huawei.openalliance.ad.beans.metadata.AdEvent;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.utils.aj;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class EventReportReq extends ReqBean {
    private List<AdEvent> event;
    private String version = Constants.INTER_VERSION;
    private String sdkversion = "3.4.84.300";

    @Override // com.huawei.openalliance.ad.beans.base.ReqBean
    public String b() {
        return Constants.CONTENT_SERVER_REQ_URI;
    }

    @Override // com.huawei.openalliance.ad.beans.base.ReqBean
    public String a(Context context) {
        return context.getString(aj.a() ? R.string.hiad_content_backup_sig : R.string.hiad_content_server_sig);
    }

    @Override // com.huawei.openalliance.ad.beans.base.ReqBean
    public String a() {
        return "action";
    }

    public EventReportReq(List<AdEvent> list) {
        this.event = list;
    }

    public EventReportReq() {
    }
}
