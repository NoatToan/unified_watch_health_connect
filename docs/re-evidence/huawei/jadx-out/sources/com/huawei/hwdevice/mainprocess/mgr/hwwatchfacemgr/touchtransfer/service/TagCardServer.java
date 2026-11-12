package com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.service;

import android.content.Context;
import defpackage.mdd;
import defpackage.mdi;
import defpackage.mdj;
import defpackage.mdk;
import defpackage.mdm;
import defpackage.mdn;
import defpackage.mdo;
import defpackage.mdq;
import defpackage.mdr;
import defpackage.mds;
import defpackage.mdu;
import defpackage.mdv;
import defpackage.mdx;
import defpackage.mdy;
import defpackage.mdz;
import defpackage.meb;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes10.dex */
public class TagCardServer implements TagCardInterface {
    private Context d;

    public TagCardServer(Context context) {
        this.d = context;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.service.TagCardInterface
    public mdu queryInfoInitTsmParam(mdi mdiVar) {
        return new mdz(this.d, c()).processTask(mdiVar);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.service.TagCardInterface
    public mdq downloadAndInstallApplet(mdj mdjVar) {
        return new mdx(this.d, b()).processTask(mdjVar);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.service.TagCardInterface
    public mdr personalizeApplet(mdk mdkVar) {
        return new meb(this.d, b()).processTask(mdkVar);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.service.TagCardInterface
    public mdn deleteApplet(mdm mdmVar) {
        return new mdv(this.d, b()).processTask(mdmVar);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.service.TagCardInterface
    public mdo applyApdu(mdd mddVar) {
        return new mds(this.d, b()).processTask(mddVar);
    }

    private String c() {
        return GRSManager.c(this.d).getUrl("domainVcardmgtWalletHicloud") + "/WiseCloudVirtualCardMgmtService/app/gateway?clientVersion=" + mdy.h();
    }

    private String b() {
        return GRSManager.c(this.d).getUrl("domainPassWalletHicloud") + "/WiseCloudWalletPassService/app/gateway?clientVersion=" + mdy.h();
    }
}
