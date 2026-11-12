package defpackage;

import com.huawei.health.hwhealthlinkage.linkage.parsedata.LinkageDataHandler;

/* JADX INFO: loaded from: classes28.dex */
public class fjf implements LinkageDataHandler {
    @Override // com.huawei.health.hwhealthlinkage.linkage.parsedata.LinkageDataHandler
    public void reset() {
    }

    @Override // com.huawei.health.hwhealthlinkage.linkage.parsedata.LinkageDataHandler
    public void handle(double d, oax oaxVar) {
        oaxVar.b(fkn.b(300001465, d));
    }
}
