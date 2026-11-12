package com.huawei.openalliance.ad.beans.server;

import android.content.Context;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.beans.base.ReqBean;
import com.huawei.openalliance.ad.beans.metadata.AppCollection;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.utils.aj;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class AppDataCollectionReq extends ReqBean {
    private List<AppCollection> appList;

    @Override // com.huawei.openalliance.ad.beans.base.ReqBean
    public String c() {
        return "100003";
    }

    @Override // com.huawei.openalliance.ad.beans.base.ReqBean
    public String b() {
        return Constants.SDK_APP_DATA_REPORT_SERVER_URI;
    }

    public void a(List<AppCollection> list) {
        this.appList = list;
    }

    @Override // com.huawei.openalliance.ad.beans.base.ReqBean
    public String a(Context context) {
        return context.getString(aj.a() ? R.string.hiad_pps_sdk_report_data_backup_sig : R.string.hiad_pps_sdk_report_data_server_sig);
    }

    @Override // com.huawei.openalliance.ad.beans.base.ReqBean
    public String a() {
        return Constants.SDK_APP_DATA_REPORT_SERVER_REALM;
    }
}
