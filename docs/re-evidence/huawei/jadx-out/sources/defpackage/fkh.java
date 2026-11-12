package defpackage;

import com.huawei.health.hwhealthlinkage.linkage.parsedata.LinkageDataHandler;

/* JADX INFO: loaded from: classes28.dex */
public class fkh implements LinkageDataHandler {
    @Override // com.huawei.health.hwhealthlinkage.linkage.parsedata.LinkageDataHandler
    public void reset() {
    }

    @Override // com.huawei.health.hwhealthlinkage.linkage.parsedata.LinkageDataHandler
    public void handle(double d, oax oaxVar) {
        oaxVar.h(fkn.b(300001367, d));
    }
}
