package com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.service;

import defpackage.mdd;
import defpackage.mdi;
import defpackage.mdj;
import defpackage.mdk;
import defpackage.mdm;
import defpackage.mdn;
import defpackage.mdo;
import defpackage.mdq;
import defpackage.mdr;
import defpackage.mdu;

/* JADX INFO: loaded from: classes10.dex */
public interface TagCardInterface {
    mdo applyApdu(mdd mddVar);

    mdn deleteApplet(mdm mdmVar);

    mdq downloadAndInstallApplet(mdj mdjVar);

    mdr personalizeApplet(mdk mdkVar);

    mdu queryInfoInitTsmParam(mdi mdiVar);
}
